/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package spa.services.structs;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Document implements org.apache.thrift.TBase<Document, Document._Fields>, java.io.Serializable, Cloneable, Comparable<Document> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Document");

  private static final org.apache.thrift.protocol.TField TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("text", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MARGINALIA_FIELD_DESC = new org.apache.thrift.protocol.TField("marginalia", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField __META_FIELD_DESC = new org.apache.thrift.protocol.TField("__meta", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField __TEXT_NODES_FIELD_DESC = new org.apache.thrift.protocol.TField("__textNodes", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DocumentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DocumentTupleSchemeFactory());
  }

  public String text; // required
  public List<Marginalis> marginalia; // optional
  public Map<String,Mapping> __meta; // optional
  public List<TextNode> __textNodes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TEXT((short)1, "text"),
    MARGINALIA((short)2, "marginalia"),
    __META((short)3, "__meta"),
    __TEXT_NODES((short)4, "__textNodes");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TEXT
          return TEXT;
        case 2: // MARGINALIA
          return MARGINALIA;
        case 3: // __META
          return __META;
        case 4: // __TEXT_NODES
          return __TEXT_NODES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.MARGINALIA,_Fields.__META,_Fields.__TEXT_NODES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TEXT, new org.apache.thrift.meta_data.FieldMetaData("text", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MARGINALIA, new org.apache.thrift.meta_data.FieldMetaData("marginalia", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Marginalis.class))));
    tmpMap.put(_Fields.__META, new org.apache.thrift.meta_data.FieldMetaData("__meta", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Mapping.class))));
    tmpMap.put(_Fields.__TEXT_NODES, new org.apache.thrift.meta_data.FieldMetaData("__textNodes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TextNode.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Document.class, metaDataMap);
  }

  public Document() {
  }

  public Document(
    String text)
  {
    this();
    this.text = text;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Document(Document other) {
    if (other.isSetText()) {
      this.text = other.text;
    }
    if (other.isSetMarginalia()) {
      List<Marginalis> __this__marginalia = new ArrayList<Marginalis>(other.marginalia.size());
      for (Marginalis other_element : other.marginalia) {
        __this__marginalia.add(new Marginalis(other_element));
      }
      this.marginalia = __this__marginalia;
    }
    if (other.isSet__meta()) {
      Map<String,Mapping> __this____meta = new HashMap<String,Mapping>(other.__meta.size());
      for (Map.Entry<String, Mapping> other_element : other.__meta.entrySet()) {

        String other_element_key = other_element.getKey();
        Mapping other_element_value = other_element.getValue();

        String __this____meta_copy_key = other_element_key;

        Mapping __this____meta_copy_value = new Mapping(other_element_value);

        __this____meta.put(__this____meta_copy_key, __this____meta_copy_value);
      }
      this.__meta = __this____meta;
    }
    if (other.isSet__textNodes()) {
      List<TextNode> __this____textNodes = new ArrayList<TextNode>(other.__textNodes.size());
      for (TextNode other_element : other.__textNodes) {
        __this____textNodes.add(new TextNode(other_element));
      }
      this.__textNodes = __this____textNodes;
    }
  }

  public Document deepCopy() {
    return new Document(this);
  }

  @Override
  public void clear() {
    this.text = null;
    this.marginalia = null;
    this.__meta = null;
    this.__textNodes = null;
  }

  public String getText() {
    return this.text;
  }

  public Document setText(String text) {
    this.text = text;
    return this;
  }

  public void unsetText() {
    this.text = null;
  }

  /** Returns true if field text is set (has been assigned a value) and false otherwise */
  public boolean isSetText() {
    return this.text != null;
  }

  public void setTextIsSet(boolean value) {
    if (!value) {
      this.text = null;
    }
  }

  public int getMarginaliaSize() {
    return (this.marginalia == null) ? 0 : this.marginalia.size();
  }

  public java.util.Iterator<Marginalis> getMarginaliaIterator() {
    return (this.marginalia == null) ? null : this.marginalia.iterator();
  }

  public void addToMarginalia(Marginalis elem) {
    if (this.marginalia == null) {
      this.marginalia = new ArrayList<Marginalis>();
    }
    this.marginalia.add(elem);
  }

  public List<Marginalis> getMarginalia() {
    return this.marginalia;
  }

  public Document setMarginalia(List<Marginalis> marginalia) {
    this.marginalia = marginalia;
    return this;
  }

  public void unsetMarginalia() {
    this.marginalia = null;
  }

  /** Returns true if field marginalia is set (has been assigned a value) and false otherwise */
  public boolean isSetMarginalia() {
    return this.marginalia != null;
  }

  public void setMarginaliaIsSet(boolean value) {
    if (!value) {
      this.marginalia = null;
    }
  }

  public int get__metaSize() {
    return (this.__meta == null) ? 0 : this.__meta.size();
  }

  public void putTo__meta(String key, Mapping val) {
    if (this.__meta == null) {
      this.__meta = new HashMap<String,Mapping>();
    }
    this.__meta.put(key, val);
  }

  public Map<String,Mapping> get__meta() {
    return this.__meta;
  }

  public Document set__meta(Map<String,Mapping> __meta) {
    this.__meta = __meta;
    return this;
  }

  public void unset__meta() {
    this.__meta = null;
  }

  /** Returns true if field __meta is set (has been assigned a value) and false otherwise */
  public boolean isSet__meta() {
    return this.__meta != null;
  }

  public void set__metaIsSet(boolean value) {
    if (!value) {
      this.__meta = null;
    }
  }

  public int get__textNodesSize() {
    return (this.__textNodes == null) ? 0 : this.__textNodes.size();
  }

  public java.util.Iterator<TextNode> get__textNodesIterator() {
    return (this.__textNodes == null) ? null : this.__textNodes.iterator();
  }

  public void addTo__textNodes(TextNode elem) {
    if (this.__textNodes == null) {
      this.__textNodes = new ArrayList<TextNode>();
    }
    this.__textNodes.add(elem);
  }

  public List<TextNode> get__textNodes() {
    return this.__textNodes;
  }

  public Document set__textNodes(List<TextNode> __textNodes) {
    this.__textNodes = __textNodes;
    return this;
  }

  public void unset__textNodes() {
    this.__textNodes = null;
  }

  /** Returns true if field __textNodes is set (has been assigned a value) and false otherwise */
  public boolean isSet__textNodes() {
    return this.__textNodes != null;
  }

  public void set__textNodesIsSet(boolean value) {
    if (!value) {
      this.__textNodes = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TEXT:
      if (value == null) {
        unsetText();
      } else {
        setText((String)value);
      }
      break;

    case MARGINALIA:
      if (value == null) {
        unsetMarginalia();
      } else {
        setMarginalia((List<Marginalis>)value);
      }
      break;

    case __META:
      if (value == null) {
        unset__meta();
      } else {
        set__meta((Map<String,Mapping>)value);
      }
      break;

    case __TEXT_NODES:
      if (value == null) {
        unset__textNodes();
      } else {
        set__textNodes((List<TextNode>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TEXT:
      return getText();

    case MARGINALIA:
      return getMarginalia();

    case __META:
      return get__meta();

    case __TEXT_NODES:
      return get__textNodes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TEXT:
      return isSetText();
    case MARGINALIA:
      return isSetMarginalia();
    case __META:
      return isSet__meta();
    case __TEXT_NODES:
      return isSet__textNodes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Document)
      return this.equals((Document)that);
    return false;
  }

  public boolean equals(Document that) {
    if (that == null)
      return false;

    boolean this_present_text = true && this.isSetText();
    boolean that_present_text = true && that.isSetText();
    if (this_present_text || that_present_text) {
      if (!(this_present_text && that_present_text))
        return false;
      if (!this.text.equals(that.text))
        return false;
    }

    boolean this_present_marginalia = true && this.isSetMarginalia();
    boolean that_present_marginalia = true && that.isSetMarginalia();
    if (this_present_marginalia || that_present_marginalia) {
      if (!(this_present_marginalia && that_present_marginalia))
        return false;
      if (!this.marginalia.equals(that.marginalia))
        return false;
    }

    boolean this_present___meta = true && this.isSet__meta();
    boolean that_present___meta = true && that.isSet__meta();
    if (this_present___meta || that_present___meta) {
      if (!(this_present___meta && that_present___meta))
        return false;
      if (!this.__meta.equals(that.__meta))
        return false;
    }

    boolean this_present___textNodes = true && this.isSet__textNodes();
    boolean that_present___textNodes = true && that.isSet__textNodes();
    if (this_present___textNodes || that_present___textNodes) {
      if (!(this_present___textNodes && that_present___textNodes))
        return false;
      if (!this.__textNodes.equals(that.__textNodes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_text = true && (isSetText());
    builder.append(present_text);
    if (present_text)
      builder.append(text);

    boolean present_marginalia = true && (isSetMarginalia());
    builder.append(present_marginalia);
    if (present_marginalia)
      builder.append(marginalia);

    boolean present___meta = true && (isSet__meta());
    builder.append(present___meta);
    if (present___meta)
      builder.append(__meta);

    boolean present___textNodes = true && (isSet__textNodes());
    builder.append(present___textNodes);
    if (present___textNodes)
      builder.append(__textNodes);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(Document other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetText()).compareTo(other.isSetText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.text, other.text);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMarginalia()).compareTo(other.isSetMarginalia());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMarginalia()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.marginalia, other.marginalia);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSet__meta()).compareTo(other.isSet__meta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet__meta()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.__meta, other.__meta);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSet__textNodes()).compareTo(other.isSet__textNodes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet__textNodes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.__textNodes, other.__textNodes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Document(");
    boolean first = true;

    sb.append("text:");
    if (this.text == null) {
      sb.append("null");
    } else {
      sb.append(this.text);
    }
    first = false;
    if (isSetMarginalia()) {
      if (!first) sb.append(", ");
      sb.append("marginalia:");
      if (this.marginalia == null) {
        sb.append("null");
      } else {
        sb.append(this.marginalia);
      }
      first = false;
    }
    if (isSet__meta()) {
      if (!first) sb.append(", ");
      sb.append("__meta:");
      if (this.__meta == null) {
        sb.append("null");
      } else {
        sb.append(this.__meta);
      }
      first = false;
    }
    if (isSet__textNodes()) {
      if (!first) sb.append(", ");
      sb.append("__textNodes:");
      if (this.__textNodes == null) {
        sb.append("null");
      } else {
        sb.append(this.__textNodes);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (text == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'text' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DocumentStandardSchemeFactory implements SchemeFactory {
    public DocumentStandardScheme getScheme() {
      return new DocumentStandardScheme();
    }
  }

  private static class DocumentStandardScheme extends StandardScheme<Document> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Document struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.text = iprot.readString();
              struct.setTextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MARGINALIA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.marginalia = new ArrayList<Marginalis>(_list24.size);
                for (int _i25 = 0; _i25 < _list24.size; ++_i25)
                {
                  Marginalis _elem26;
                  _elem26 = new Marginalis();
                  _elem26.read(iprot);
                  struct.marginalia.add(_elem26);
                }
                iprot.readListEnd();
              }
              struct.setMarginaliaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // __META
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map27 = iprot.readMapBegin();
                struct.__meta = new HashMap<String,Mapping>(2*_map27.size);
                for (int _i28 = 0; _i28 < _map27.size; ++_i28)
                {
                  String _key29;
                  Mapping _val30;
                  _key29 = iprot.readString();
                  _val30 = new Mapping();
                  _val30.read(iprot);
                  struct.__meta.put(_key29, _val30);
                }
                iprot.readMapEnd();
              }
              struct.set__metaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // __TEXT_NODES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list31 = iprot.readListBegin();
                struct.__textNodes = new ArrayList<TextNode>(_list31.size);
                for (int _i32 = 0; _i32 < _list31.size; ++_i32)
                {
                  TextNode _elem33;
                  _elem33 = new TextNode();
                  _elem33.read(iprot);
                  struct.__textNodes.add(_elem33);
                }
                iprot.readListEnd();
              }
              struct.set__textNodesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Document struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.text != null) {
        oprot.writeFieldBegin(TEXT_FIELD_DESC);
        oprot.writeString(struct.text);
        oprot.writeFieldEnd();
      }
      if (struct.marginalia != null) {
        if (struct.isSetMarginalia()) {
          oprot.writeFieldBegin(MARGINALIA_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.marginalia.size()));
            for (Marginalis _iter34 : struct.marginalia)
            {
              _iter34.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.__meta != null) {
        if (struct.isSet__meta()) {
          oprot.writeFieldBegin(__META_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.__meta.size()));
            for (Map.Entry<String, Mapping> _iter35 : struct.__meta.entrySet())
            {
              oprot.writeString(_iter35.getKey());
              _iter35.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.__textNodes != null) {
        if (struct.isSet__textNodes()) {
          oprot.writeFieldBegin(__TEXT_NODES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.__textNodes.size()));
            for (TextNode _iter36 : struct.__textNodes)
            {
              _iter36.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DocumentTupleSchemeFactory implements SchemeFactory {
    public DocumentTupleScheme getScheme() {
      return new DocumentTupleScheme();
    }
  }

  private static class DocumentTupleScheme extends TupleScheme<Document> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Document struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.text);
      BitSet optionals = new BitSet();
      if (struct.isSetMarginalia()) {
        optionals.set(0);
      }
      if (struct.isSet__meta()) {
        optionals.set(1);
      }
      if (struct.isSet__textNodes()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMarginalia()) {
        {
          oprot.writeI32(struct.marginalia.size());
          for (Marginalis _iter37 : struct.marginalia)
          {
            _iter37.write(oprot);
          }
        }
      }
      if (struct.isSet__meta()) {
        {
          oprot.writeI32(struct.__meta.size());
          for (Map.Entry<String, Mapping> _iter38 : struct.__meta.entrySet())
          {
            oprot.writeString(_iter38.getKey());
            _iter38.getValue().write(oprot);
          }
        }
      }
      if (struct.isSet__textNodes()) {
        {
          oprot.writeI32(struct.__textNodes.size());
          for (TextNode _iter39 : struct.__textNodes)
          {
            _iter39.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Document struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.text = iprot.readString();
      struct.setTextIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list40 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.marginalia = new ArrayList<Marginalis>(_list40.size);
          for (int _i41 = 0; _i41 < _list40.size; ++_i41)
          {
            Marginalis _elem42;
            _elem42 = new Marginalis();
            _elem42.read(iprot);
            struct.marginalia.add(_elem42);
          }
        }
        struct.setMarginaliaIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map43 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.__meta = new HashMap<String,Mapping>(2*_map43.size);
          for (int _i44 = 0; _i44 < _map43.size; ++_i44)
          {
            String _key45;
            Mapping _val46;
            _key45 = iprot.readString();
            _val46 = new Mapping();
            _val46.read(iprot);
            struct.__meta.put(_key45, _val46);
          }
        }
        struct.set__metaIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list47 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.__textNodes = new ArrayList<TextNode>(_list47.size);
          for (int _i48 = 0; _i48 < _list47.size; ++_i48)
          {
            TextNode _elem49;
            _elem49 = new TextNode();
            _elem49.read(iprot);
            struct.__textNodes.add(_elem49);
          }
        }
        struct.set__textNodesIsSet(true);
      }
    }
  }

}

