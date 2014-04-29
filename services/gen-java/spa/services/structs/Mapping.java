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

public class Mapping implements org.apache.thrift.TBase<Mapping, Mapping._Fields>, java.io.Serializable, Cloneable, Comparable<Mapping> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Mapping");

  private static final org.apache.thrift.protocol.TField TEXT_NODES_FIELD_DESC = new org.apache.thrift.protocol.TField("textNodes", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField RANGES_FIELD_DESC = new org.apache.thrift.protocol.TField("ranges", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MappingStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MappingTupleSchemeFactory());
  }

  public List<Integer> textNodes; // required
  public List<Interval> ranges; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TEXT_NODES((short)1, "textNodes"),
    RANGES((short)2, "ranges");

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
        case 1: // TEXT_NODES
          return TEXT_NODES;
        case 2: // RANGES
          return RANGES;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TEXT_NODES, new org.apache.thrift.meta_data.FieldMetaData("textNodes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.RANGES, new org.apache.thrift.meta_data.FieldMetaData("ranges", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Interval.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Mapping.class, metaDataMap);
  }

  public Mapping() {
  }

  public Mapping(
    List<Integer> textNodes,
    List<Interval> ranges)
  {
    this();
    this.textNodes = textNodes;
    this.ranges = ranges;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Mapping(Mapping other) {
    if (other.isSetTextNodes()) {
      List<Integer> __this__textNodes = new ArrayList<Integer>(other.textNodes);
      this.textNodes = __this__textNodes;
    }
    if (other.isSetRanges()) {
      List<Interval> __this__ranges = new ArrayList<Interval>(other.ranges.size());
      for (Interval other_element : other.ranges) {
        __this__ranges.add(new Interval(other_element));
      }
      this.ranges = __this__ranges;
    }
  }

  public Mapping deepCopy() {
    return new Mapping(this);
  }

  @Override
  public void clear() {
    this.textNodes = null;
    this.ranges = null;
  }

  public int getTextNodesSize() {
    return (this.textNodes == null) ? 0 : this.textNodes.size();
  }

  public java.util.Iterator<Integer> getTextNodesIterator() {
    return (this.textNodes == null) ? null : this.textNodes.iterator();
  }

  public void addToTextNodes(int elem) {
    if (this.textNodes == null) {
      this.textNodes = new ArrayList<Integer>();
    }
    this.textNodes.add(elem);
  }

  public List<Integer> getTextNodes() {
    return this.textNodes;
  }

  public Mapping setTextNodes(List<Integer> textNodes) {
    this.textNodes = textNodes;
    return this;
  }

  public void unsetTextNodes() {
    this.textNodes = null;
  }

  /** Returns true if field textNodes is set (has been assigned a value) and false otherwise */
  public boolean isSetTextNodes() {
    return this.textNodes != null;
  }

  public void setTextNodesIsSet(boolean value) {
    if (!value) {
      this.textNodes = null;
    }
  }

  public int getRangesSize() {
    return (this.ranges == null) ? 0 : this.ranges.size();
  }

  public java.util.Iterator<Interval> getRangesIterator() {
    return (this.ranges == null) ? null : this.ranges.iterator();
  }

  public void addToRanges(Interval elem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<Interval>();
    }
    this.ranges.add(elem);
  }

  public List<Interval> getRanges() {
    return this.ranges;
  }

  public Mapping setRanges(List<Interval> ranges) {
    this.ranges = ranges;
    return this;
  }

  public void unsetRanges() {
    this.ranges = null;
  }

  /** Returns true if field ranges is set (has been assigned a value) and false otherwise */
  public boolean isSetRanges() {
    return this.ranges != null;
  }

  public void setRangesIsSet(boolean value) {
    if (!value) {
      this.ranges = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TEXT_NODES:
      if (value == null) {
        unsetTextNodes();
      } else {
        setTextNodes((List<Integer>)value);
      }
      break;

    case RANGES:
      if (value == null) {
        unsetRanges();
      } else {
        setRanges((List<Interval>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TEXT_NODES:
      return getTextNodes();

    case RANGES:
      return getRanges();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TEXT_NODES:
      return isSetTextNodes();
    case RANGES:
      return isSetRanges();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Mapping)
      return this.equals((Mapping)that);
    return false;
  }

  public boolean equals(Mapping that) {
    if (that == null)
      return false;

    boolean this_present_textNodes = true && this.isSetTextNodes();
    boolean that_present_textNodes = true && that.isSetTextNodes();
    if (this_present_textNodes || that_present_textNodes) {
      if (!(this_present_textNodes && that_present_textNodes))
        return false;
      if (!this.textNodes.equals(that.textNodes))
        return false;
    }

    boolean this_present_ranges = true && this.isSetRanges();
    boolean that_present_ranges = true && that.isSetRanges();
    if (this_present_ranges || that_present_ranges) {
      if (!(this_present_ranges && that_present_ranges))
        return false;
      if (!this.ranges.equals(that.ranges))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_textNodes = true && (isSetTextNodes());
    builder.append(present_textNodes);
    if (present_textNodes)
      builder.append(textNodes);

    boolean present_ranges = true && (isSetRanges());
    builder.append(present_ranges);
    if (present_ranges)
      builder.append(ranges);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(Mapping other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTextNodes()).compareTo(other.isSetTextNodes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTextNodes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.textNodes, other.textNodes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRanges()).compareTo(other.isSetRanges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRanges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ranges, other.ranges);
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
    StringBuilder sb = new StringBuilder("Mapping(");
    boolean first = true;

    sb.append("textNodes:");
    if (this.textNodes == null) {
      sb.append("null");
    } else {
      sb.append(this.textNodes);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ranges:");
    if (this.ranges == null) {
      sb.append("null");
    } else {
      sb.append(this.ranges);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class MappingStandardSchemeFactory implements SchemeFactory {
    public MappingStandardScheme getScheme() {
      return new MappingStandardScheme();
    }
  }

  private static class MappingStandardScheme extends StandardScheme<Mapping> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Mapping struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TEXT_NODES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.textNodes = new ArrayList<Integer>(_list8.size);
                for (int _i9 = 0; _i9 < _list8.size; ++_i9)
                {
                  int _elem10;
                  _elem10 = iprot.readI32();
                  struct.textNodes.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setTextNodesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RANGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
                struct.ranges = new ArrayList<Interval>(_list11.size);
                for (int _i12 = 0; _i12 < _list11.size; ++_i12)
                {
                  Interval _elem13;
                  _elem13 = new Interval();
                  _elem13.read(iprot);
                  struct.ranges.add(_elem13);
                }
                iprot.readListEnd();
              }
              struct.setRangesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Mapping struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.textNodes != null) {
        oprot.writeFieldBegin(TEXT_NODES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.textNodes.size()));
          for (int _iter14 : struct.textNodes)
          {
            oprot.writeI32(_iter14);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.ranges != null) {
        oprot.writeFieldBegin(RANGES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.ranges.size()));
          for (Interval _iter15 : struct.ranges)
          {
            _iter15.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MappingTupleSchemeFactory implements SchemeFactory {
    public MappingTupleScheme getScheme() {
      return new MappingTupleScheme();
    }
  }

  private static class MappingTupleScheme extends TupleScheme<Mapping> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Mapping struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTextNodes()) {
        optionals.set(0);
      }
      if (struct.isSetRanges()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTextNodes()) {
        {
          oprot.writeI32(struct.textNodes.size());
          for (int _iter16 : struct.textNodes)
          {
            oprot.writeI32(_iter16);
          }
        }
      }
      if (struct.isSetRanges()) {
        {
          oprot.writeI32(struct.ranges.size());
          for (Interval _iter17 : struct.ranges)
          {
            _iter17.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Mapping struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.textNodes = new ArrayList<Integer>(_list18.size);
          for (int _i19 = 0; _i19 < _list18.size; ++_i19)
          {
            int _elem20;
            _elem20 = iprot.readI32();
            struct.textNodes.add(_elem20);
          }
        }
        struct.setTextNodesIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.ranges = new ArrayList<Interval>(_list21.size);
          for (int _i22 = 0; _i22 < _list21.size; ++_i22)
          {
            Interval _elem23;
            _elem23 = new Interval();
            _elem23.read(iprot);
            struct.ranges.add(_elem23);
          }
        }
        struct.setRangesIsSet(true);
      }
    }
  }

}

