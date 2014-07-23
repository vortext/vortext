/* -*- mode: js2; tab-width: 2; indent-tabs-mode: nil; c-basic-offset: 2; js2-basic-offset: 2 -*- */
define(['underscore', 'Q', 'backbone', 'PDFJS'], function(_, Q, Backbone, PDFJS) {
  'use strict';
  PDFJS.workerSrc = 'static/scripts/vendor/pdfjs/pdf.worker.js';
  PDFJS.cMapUrl = 'static/scripts/vendor/pdfjs/generic/web/cmaps/';
  PDFJS.cMapPacked = true;
  PDFJS.disableWebGL = !Modernizr.webgl;

  var RenderingStates = window.RenderingStates = {
    INITIAL: 0,
    RUNNING: 1,
    HAS_PAGE: 2,
    HAS_CONTENT: 3,
    FINISHED: 4
  };

  var Page = Backbone.Model.extend({
    defaults: {
      raw: null,
      annotations: {},
      content: null,
      state: RenderingStates.INITIAL
    }
  });

  var Pages = Backbone.Collection.extend({
    model: Page,
    _requestPage: function(model, pagePromise) {
      return pagePromise
        .then(function(raw) {
          model.set({
            raw: raw,
            state: RenderingStates.RUNNING
          });
          return raw.getTextContent();
        })
        .then(function(content) {
          model.set({
            content: content,
            state: RenderingStates.FINISHED
          });
        });
    },
    populate: function(pdf) {
      var self  = this;
      var pageQueue = _.range(0, pdf.numPages);
      var pages = _.map(pageQueue, function(pageNr) {
        return new Page();
      });
      this.reset(pages); // set a bunch of empty pages

      var process = function(arr) {
        if(arr.length === 0) return;
        var pageIndex = _.first(arr);
        var page = pages[pageIndex];
        page.set({ state: RenderingStates.RUNNING });
        var p = self._requestPage(page, pdf.getPage(pageIndex + 1));
        p.then(function() {
          process(_.rest(arr));
        });
      };
      process(pageQueue);
    }
  });

  var PDF = Backbone.Model.extend({
    defaults: {
      binary: null,
      raw: null
    },
    initialize: function() {
      var self = this;
      var pages = new Pages();
      pages
        .on("change:state", function(e, obj) {
          self.trigger("change:pages", e, obj);
        })
        .on("change:annotations", function(e, obj) {
          self.trigger("change:annotations", e, obj);
        });
      this.set("pages", pages);
    },
    setActiveAnnotations: function(marginalia) {
      // FIXME: ugly hack to set the active nodes based on the response JSON and selection
      var annotations = {};
      var self = this;
      marginalia.get("marginalia").each(function(marginalis) {
        var props = {
          type: marginalis.get("id"),
          color: marginalis.get("color"),
          active: marginalis.get("active")
        };
        if(!props.active) return; // only consider the active ones
        marginalis.get("annotations").forEach(function(annotation) {
          annotation.mapping.forEach(function(node) {
            node = _.extend(node, props);
            annotations[node.pageIndex] = annotations[node.pageIndex] || {};
            annotations[node.pageIndex][node.nodeIndex] = _.union(annotations[node.pageIndex][node.nodeIndex] || [], node);
          });
        });
      });

      this.get("pages").map(function(page, pageIndex) {
        page.set({ annotations: annotations[pageIndex] || {} });
      });
    },
    loadFromData: function(data) {
      var self = this;
      this.set({ binary: data });
      PDFJS.getDocument(data).then(function(pdf) {
        self.set({ raw: pdf });
        self.get("pages").populate(pdf);
      });
    }
  });

  return PDF;
});