/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package spa.services.services;

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

public class ProcessException extends TException implements org.apache.thrift.TBase<ProcessException, ProcessException._Fields>, java.io.Serializable, Cloneable, Comparable<ProcessException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProcessException");

  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField WHAT_FIELD_DESC = new org.apache.thrift.protocol.TField("what", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField WHY_FIELD_DESC = new org.apache.thrift.protocol.TField("why", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ProcessExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ProcessExceptionTupleSchemeFactory());
  }

  public int timestamp; // required
  public String what; // required
  public String why; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TIMESTAMP((short)1, "timestamp"),
    WHAT((short)2, "what"),
    WHY((short)3, "why");

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
        case 1: // TIMESTAMP
          return TIMESTAMP;
        case 2: // WHAT
          return WHAT;
        case 3: // WHY
          return WHY;
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
  private static final int __TIMESTAMP_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.WHY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.WHAT, new org.apache.thrift.meta_data.FieldMetaData("what", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WHY, new org.apache.thrift.meta_data.FieldMetaData("why", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProcessException.class, metaDataMap);
  }

  public ProcessException() {
  }

  public ProcessException(
    int timestamp,
    String what)
  {
    this();
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    this.what = what;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProcessException(ProcessException other) {
    __isset_bitfield = other.__isset_bitfield;
    this.timestamp = other.timestamp;
    if (other.isSetWhat()) {
      this.what = other.what;
    }
    if (other.isSetWhy()) {
      this.why = other.why;
    }
  }

  public ProcessException deepCopy() {
    return new ProcessException(this);
  }

  @Override
  public void clear() {
    setTimestampIsSet(false);
    this.timestamp = 0;
    this.what = null;
    this.why = null;
  }

  public int getTimestamp() {
    return this.timestamp;
  }

  public ProcessException setTimestamp(int timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_ISSET_ID, value);
  }

  public String getWhat() {
    return this.what;
  }

  public ProcessException setWhat(String what) {
    this.what = what;
    return this;
  }

  public void unsetWhat() {
    this.what = null;
  }

  /** Returns true if field what is set (has been assigned a value) and false otherwise */
  public boolean isSetWhat() {
    return this.what != null;
  }

  public void setWhatIsSet(boolean value) {
    if (!value) {
      this.what = null;
    }
  }

  public String getWhy() {
    return this.why;
  }

  public ProcessException setWhy(String why) {
    this.why = why;
    return this;
  }

  public void unsetWhy() {
    this.why = null;
  }

  /** Returns true if field why is set (has been assigned a value) and false otherwise */
  public boolean isSetWhy() {
    return this.why != null;
  }

  public void setWhyIsSet(boolean value) {
    if (!value) {
      this.why = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Integer)value);
      }
      break;

    case WHAT:
      if (value == null) {
        unsetWhat();
      } else {
        setWhat((String)value);
      }
      break;

    case WHY:
      if (value == null) {
        unsetWhy();
      } else {
        setWhy((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TIMESTAMP:
      return Integer.valueOf(getTimestamp());

    case WHAT:
      return getWhat();

    case WHY:
      return getWhy();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TIMESTAMP:
      return isSetTimestamp();
    case WHAT:
      return isSetWhat();
    case WHY:
      return isSetWhy();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProcessException)
      return this.equals((ProcessException)that);
    return false;
  }

  public boolean equals(ProcessException that) {
    if (that == null)
      return false;

    boolean this_present_timestamp = true;
    boolean that_present_timestamp = true;
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    boolean this_present_what = true && this.isSetWhat();
    boolean that_present_what = true && that.isSetWhat();
    if (this_present_what || that_present_what) {
      if (!(this_present_what && that_present_what))
        return false;
      if (!this.what.equals(that.what))
        return false;
    }

    boolean this_present_why = true && this.isSetWhy();
    boolean that_present_why = true && that.isSetWhy();
    if (this_present_why || that_present_why) {
      if (!(this_present_why && that_present_why))
        return false;
      if (!this.why.equals(that.why))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_timestamp = true;
    builder.append(present_timestamp);
    if (present_timestamp)
      builder.append(timestamp);

    boolean present_what = true && (isSetWhat());
    builder.append(present_what);
    if (present_what)
      builder.append(what);

    boolean present_why = true && (isSetWhy());
    builder.append(present_why);
    if (present_why)
      builder.append(why);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(ProcessException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(other.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, other.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWhat()).compareTo(other.isSetWhat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWhat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.what, other.what);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWhy()).compareTo(other.isSetWhy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWhy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.why, other.why);
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
    StringBuilder sb = new StringBuilder("ProcessException(");
    boolean first = true;

    sb.append("timestamp:");
    sb.append(this.timestamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("what:");
    if (this.what == null) {
      sb.append("null");
    } else {
      sb.append(this.what);
    }
    first = false;
    if (isSetWhy()) {
      if (!first) sb.append(", ");
      sb.append("why:");
      if (this.why == null) {
        sb.append("null");
      } else {
        sb.append(this.why);
      }
      first = false;
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProcessExceptionStandardSchemeFactory implements SchemeFactory {
    public ProcessExceptionStandardScheme getScheme() {
      return new ProcessExceptionStandardScheme();
    }
  }

  private static class ProcessExceptionStandardScheme extends StandardScheme<ProcessException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProcessException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.timestamp = iprot.readI32();
              struct.setTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WHAT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.what = iprot.readString();
              struct.setWhatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // WHY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.why = iprot.readString();
              struct.setWhyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProcessException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
      oprot.writeI32(struct.timestamp);
      oprot.writeFieldEnd();
      if (struct.what != null) {
        oprot.writeFieldBegin(WHAT_FIELD_DESC);
        oprot.writeString(struct.what);
        oprot.writeFieldEnd();
      }
      if (struct.why != null) {
        if (struct.isSetWhy()) {
          oprot.writeFieldBegin(WHY_FIELD_DESC);
          oprot.writeString(struct.why);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProcessExceptionTupleSchemeFactory implements SchemeFactory {
    public ProcessExceptionTupleScheme getScheme() {
      return new ProcessExceptionTupleScheme();
    }
  }

  private static class ProcessExceptionTupleScheme extends TupleScheme<ProcessException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProcessException struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTimestamp()) {
        optionals.set(0);
      }
      if (struct.isSetWhat()) {
        optionals.set(1);
      }
      if (struct.isSetWhy()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTimestamp()) {
        oprot.writeI32(struct.timestamp);
      }
      if (struct.isSetWhat()) {
        oprot.writeString(struct.what);
      }
      if (struct.isSetWhy()) {
        oprot.writeString(struct.why);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProcessException struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.timestamp = iprot.readI32();
        struct.setTimestampIsSet(true);
      }
      if (incoming.get(1)) {
        struct.what = iprot.readString();
        struct.setWhatIsSet(true);
      }
      if (incoming.get(2)) {
        struct.why = iprot.readString();
        struct.setWhyIsSet(true);
      }
    }
  }

}

