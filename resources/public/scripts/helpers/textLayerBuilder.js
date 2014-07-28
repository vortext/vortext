/* -*- tab-width: 2; indent-tabs-mode: nil; c-basic-offset: 2; js-indent-level: 2; -*- */
define(['underscore', 'PDFJS'], function(_, PDFJS) {
  'use strict';

  var TextLayerBuilder = function textLayerBuilder(options) {
    var viewport = options.viewport;
    var canvas = document.createElement('canvas');
    var ctx = canvas.getContext('2d');

    var calculateWidth = _.memoize(function(ctx, geom) {
      return ctx.measureText(geom.str).width;
    }, function(ctx, geom) { // hashCode
      return ctx.font + geom.str;
    });

    this.isWhitespace = function(geom, style) {
      ctx.font = style.fontSize + ' ' + style.fontFamily;
      var width = calculateWidth(ctx, geom);
      return (!/\S/.test(geom.str)) || width <= 0;
    };

    this.calculateStyles = function(geom, style) {
      var tx = PDFJS.Util.transform(viewport.transform, geom.transform);
      var angle = Math.atan2(tx[1], tx[0]);
      if (style.vertical) {
        angle += Math.PI / 2;
      }
      var fontHeight = Math.sqrt((tx[2] * tx[2]) + (tx[3] * tx[3]));
      var fontAscent = (style.ascent ? style.ascent * fontHeight :
                        (style.descent ? (1 + style.descent) * fontHeight : fontHeight));

      return {
        _angle: angle,
        fontSize: fontHeight + "px",
        fontFamily: style.fontFamily,
        left: (tx[4] + (fontAscent * Math.sin(angle))) + 'px',
        top: (tx[5] - (fontAscent * Math.cos(angle))) + 'px'
      };
    };

    this.createElement = function(geom, styles) {
      var style = this.calculateStyles(geom, styles[geom.fontName]);
      ctx.font = style.fontSize + ' ' + style.fontFamily;

      if(this.isWhitespace(geom, style)) {
        return { isWhitespace : true };
      }

      var textElement = {
        fontNam:  geom.fontName,
        angle:  style._angle * (180 / Math.PI),
        style: style,
        textContent: geom.str
      };

      if (style.vertical) {
        textElement.canvasWidth = geom.height * viewport.scale;
      } else {
        textElement.canvasWidth = geom.width * viewport.scale;
      }

      var textScale = textElement.canvasWidth / calculateWidth(ctx, geom);
      var rotation = textElement.angle;
      var transform = 'scale(' + textScale + ', 1)';
      transform = 'rotate(' + rotation + 'deg) ' + transform;

      CustomStyle.setProp('transform', textElement, transform);
      CustomStyle.setProp('transformOrigin', textElement, "0% 0%");

      return textElement;
    };

    this.projectAnnotations = function(textElement, annotations) {
      if(!annotations || textElement.isWhitespace) {
        textElement.spans = textElement.annotations = null;
      } else {
        textElement.color = annotations[0].color;

        var sorted = _.sortBy(annotations, function(ann) {// sorted by range offset
          return ann.range.lower;
        });

        var spans = sorted.map(function(ann, i) {
          var previous = sorted[i - 1];

          if(previous && previous.range.lower >= ann.range.lower && previous.range.upper >= ann.range.lower) {
            return null;
          }
          var next = sorted[i + 1];

          var text = textElement.textContent;
          if(!text) return null;

          var start = previous ? text.length + (previous.range.upper - previous.interval.upper) : 0,
              left = ann.range.lower - ann.interval.lower,
              right = text.length + (ann.range.upper - ann.interval.upper),
              end = next ?  right : text.length,
              style = { "backgroundColor": "rgba(" + ann.color.join(",") + ",0.2)" };

          return {
            pre: text.slice(start, left),
            content:text.slice(left, right),
            post: text.slice(right, end),
            style: style,
            uuid: _.pluck(annotations, "uuid")
          };
        });
        textElement.spans = spans;
      }
    };

    this.createAnnotatedElement = function(geom, styles, ann) {
      var textElement = this.createElement(geom, styles);
      this.projectAnnotations(textElement, ann);
      return textElement;
    };
  };

  return TextLayerBuilder;
});
