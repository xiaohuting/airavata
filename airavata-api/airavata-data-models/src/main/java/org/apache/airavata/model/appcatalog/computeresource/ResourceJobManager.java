/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.appcatalog.computeresource;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Resource Job Manager Information
 * 
 * resourceJobManagerType:
 *  A typical HPC cluster has a single Job Manager to manage the resources.
 * 
 * pushMonitoringEndpoint:
 *  If the job manager pushes out state changes to a database or bus, specify the service endpoint.
 *   Ex: Moab Web Service, Moab MongoDB URL, AMQP (GLUE2) Broker
 * 
 * jobManagerBinPath:
 *  Path to the Job Manager Installation Binary directory.
 * 
 * jobManagerCommands:
 *  An enumeration of commonly used manager commands.
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-11-3")
public class ResourceJobManager implements org.apache.thrift.TBase<ResourceJobManager, ResourceJobManager._Fields>, java.io.Serializable, Cloneable, Comparable<ResourceJobManager> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ResourceJobManager");

  private static final org.apache.thrift.protocol.TField RESOURCE_JOB_MANAGER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("resourceJobManagerId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RESOURCE_JOB_MANAGER_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("resourceJobManagerType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PUSH_MONITORING_ENDPOINT_FIELD_DESC = new org.apache.thrift.protocol.TField("pushMonitoringEndpoint", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField JOB_MANAGER_BIN_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("jobManagerBinPath", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField JOB_MANAGER_COMMANDS_FIELD_DESC = new org.apache.thrift.protocol.TField("jobManagerCommands", org.apache.thrift.protocol.TType.MAP, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ResourceJobManagerStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ResourceJobManagerTupleSchemeFactory());
  }

  private String resourceJobManagerId; // required
  private ResourceJobManagerType resourceJobManagerType; // required
  private String pushMonitoringEndpoint; // optional
  private String jobManagerBinPath; // optional
  private Map<JobManagerCommand,String> jobManagerCommands; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESOURCE_JOB_MANAGER_ID((short)1, "resourceJobManagerId"),
    /**
     * 
     * @see ResourceJobManagerType
     */
    RESOURCE_JOB_MANAGER_TYPE((short)2, "resourceJobManagerType"),
    PUSH_MONITORING_ENDPOINT((short)3, "pushMonitoringEndpoint"),
    JOB_MANAGER_BIN_PATH((short)4, "jobManagerBinPath"),
    JOB_MANAGER_COMMANDS((short)5, "jobManagerCommands");

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
        case 1: // RESOURCE_JOB_MANAGER_ID
          return RESOURCE_JOB_MANAGER_ID;
        case 2: // RESOURCE_JOB_MANAGER_TYPE
          return RESOURCE_JOB_MANAGER_TYPE;
        case 3: // PUSH_MONITORING_ENDPOINT
          return PUSH_MONITORING_ENDPOINT;
        case 4: // JOB_MANAGER_BIN_PATH
          return JOB_MANAGER_BIN_PATH;
        case 5: // JOB_MANAGER_COMMANDS
          return JOB_MANAGER_COMMANDS;
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
  private static final _Fields optionals[] = {_Fields.PUSH_MONITORING_ENDPOINT,_Fields.JOB_MANAGER_BIN_PATH,_Fields.JOB_MANAGER_COMMANDS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESOURCE_JOB_MANAGER_ID, new org.apache.thrift.meta_data.FieldMetaData("resourceJobManagerId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESOURCE_JOB_MANAGER_TYPE, new org.apache.thrift.meta_data.FieldMetaData("resourceJobManagerType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ResourceJobManagerType.class)));
    tmpMap.put(_Fields.PUSH_MONITORING_ENDPOINT, new org.apache.thrift.meta_data.FieldMetaData("pushMonitoringEndpoint", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.JOB_MANAGER_BIN_PATH, new org.apache.thrift.meta_data.FieldMetaData("jobManagerBinPath", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.JOB_MANAGER_COMMANDS, new org.apache.thrift.meta_data.FieldMetaData("jobManagerCommands", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, JobManagerCommand.class), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ResourceJobManager.class, metaDataMap);
  }

  public ResourceJobManager() {
    this.resourceJobManagerId = "DO_NOT_SET_AT_CLIENTS";

  }

  public ResourceJobManager(
    String resourceJobManagerId,
    ResourceJobManagerType resourceJobManagerType)
  {
    this();
    this.resourceJobManagerId = resourceJobManagerId;
    this.resourceJobManagerType = resourceJobManagerType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ResourceJobManager(ResourceJobManager other) {
    if (other.isSetResourceJobManagerId()) {
      this.resourceJobManagerId = other.resourceJobManagerId;
    }
    if (other.isSetResourceJobManagerType()) {
      this.resourceJobManagerType = other.resourceJobManagerType;
    }
    if (other.isSetPushMonitoringEndpoint()) {
      this.pushMonitoringEndpoint = other.pushMonitoringEndpoint;
    }
    if (other.isSetJobManagerBinPath()) {
      this.jobManagerBinPath = other.jobManagerBinPath;
    }
    if (other.isSetJobManagerCommands()) {
      Map<JobManagerCommand,String> __this__jobManagerCommands = new HashMap<JobManagerCommand,String>(other.jobManagerCommands.size());
      for (Map.Entry<JobManagerCommand, String> other_element : other.jobManagerCommands.entrySet()) {

        JobManagerCommand other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        JobManagerCommand __this__jobManagerCommands_copy_key = other_element_key;

        String __this__jobManagerCommands_copy_value = other_element_value;

        __this__jobManagerCommands.put(__this__jobManagerCommands_copy_key, __this__jobManagerCommands_copy_value);
      }
      this.jobManagerCommands = __this__jobManagerCommands;
    }
  }

  public ResourceJobManager deepCopy() {
    return new ResourceJobManager(this);
  }

  @Override
  public void clear() {
    this.resourceJobManagerId = "DO_NOT_SET_AT_CLIENTS";

    this.resourceJobManagerType = null;
    this.pushMonitoringEndpoint = null;
    this.jobManagerBinPath = null;
    this.jobManagerCommands = null;
  }

  public String getResourceJobManagerId() {
    return this.resourceJobManagerId;
  }

  public void setResourceJobManagerId(String resourceJobManagerId) {
    this.resourceJobManagerId = resourceJobManagerId;
  }

  public void unsetResourceJobManagerId() {
    this.resourceJobManagerId = null;
  }

  /** Returns true if field resourceJobManagerId is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceJobManagerId() {
    return this.resourceJobManagerId != null;
  }

  public void setResourceJobManagerIdIsSet(boolean value) {
    if (!value) {
      this.resourceJobManagerId = null;
    }
  }

  /**
   * 
   * @see ResourceJobManagerType
   */
  public ResourceJobManagerType getResourceJobManagerType() {
    return this.resourceJobManagerType;
  }

  /**
   * 
   * @see ResourceJobManagerType
   */
  public void setResourceJobManagerType(ResourceJobManagerType resourceJobManagerType) {
    this.resourceJobManagerType = resourceJobManagerType;
  }

  public void unsetResourceJobManagerType() {
    this.resourceJobManagerType = null;
  }

  /** Returns true if field resourceJobManagerType is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceJobManagerType() {
    return this.resourceJobManagerType != null;
  }

  public void setResourceJobManagerTypeIsSet(boolean value) {
    if (!value) {
      this.resourceJobManagerType = null;
    }
  }

  public String getPushMonitoringEndpoint() {
    return this.pushMonitoringEndpoint;
  }

  public void setPushMonitoringEndpoint(String pushMonitoringEndpoint) {
    this.pushMonitoringEndpoint = pushMonitoringEndpoint;
  }

  public void unsetPushMonitoringEndpoint() {
    this.pushMonitoringEndpoint = null;
  }

  /** Returns true if field pushMonitoringEndpoint is set (has been assigned a value) and false otherwise */
  public boolean isSetPushMonitoringEndpoint() {
    return this.pushMonitoringEndpoint != null;
  }

  public void setPushMonitoringEndpointIsSet(boolean value) {
    if (!value) {
      this.pushMonitoringEndpoint = null;
    }
  }

  public String getJobManagerBinPath() {
    return this.jobManagerBinPath;
  }

  public void setJobManagerBinPath(String jobManagerBinPath) {
    this.jobManagerBinPath = jobManagerBinPath;
  }

  public void unsetJobManagerBinPath() {
    this.jobManagerBinPath = null;
  }

  /** Returns true if field jobManagerBinPath is set (has been assigned a value) and false otherwise */
  public boolean isSetJobManagerBinPath() {
    return this.jobManagerBinPath != null;
  }

  public void setJobManagerBinPathIsSet(boolean value) {
    if (!value) {
      this.jobManagerBinPath = null;
    }
  }

  public int getJobManagerCommandsSize() {
    return (this.jobManagerCommands == null) ? 0 : this.jobManagerCommands.size();
  }

  public void putToJobManagerCommands(JobManagerCommand key, String val) {
    if (this.jobManagerCommands == null) {
      this.jobManagerCommands = new HashMap<JobManagerCommand,String>();
    }
    this.jobManagerCommands.put(key, val);
  }

  public Map<JobManagerCommand,String> getJobManagerCommands() {
    return this.jobManagerCommands;
  }

  public void setJobManagerCommands(Map<JobManagerCommand,String> jobManagerCommands) {
    this.jobManagerCommands = jobManagerCommands;
  }

  public void unsetJobManagerCommands() {
    this.jobManagerCommands = null;
  }

  /** Returns true if field jobManagerCommands is set (has been assigned a value) and false otherwise */
  public boolean isSetJobManagerCommands() {
    return this.jobManagerCommands != null;
  }

  public void setJobManagerCommandsIsSet(boolean value) {
    if (!value) {
      this.jobManagerCommands = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESOURCE_JOB_MANAGER_ID:
      if (value == null) {
        unsetResourceJobManagerId();
      } else {
        setResourceJobManagerId((String)value);
      }
      break;

    case RESOURCE_JOB_MANAGER_TYPE:
      if (value == null) {
        unsetResourceJobManagerType();
      } else {
        setResourceJobManagerType((ResourceJobManagerType)value);
      }
      break;

    case PUSH_MONITORING_ENDPOINT:
      if (value == null) {
        unsetPushMonitoringEndpoint();
      } else {
        setPushMonitoringEndpoint((String)value);
      }
      break;

    case JOB_MANAGER_BIN_PATH:
      if (value == null) {
        unsetJobManagerBinPath();
      } else {
        setJobManagerBinPath((String)value);
      }
      break;

    case JOB_MANAGER_COMMANDS:
      if (value == null) {
        unsetJobManagerCommands();
      } else {
        setJobManagerCommands((Map<JobManagerCommand,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESOURCE_JOB_MANAGER_ID:
      return getResourceJobManagerId();

    case RESOURCE_JOB_MANAGER_TYPE:
      return getResourceJobManagerType();

    case PUSH_MONITORING_ENDPOINT:
      return getPushMonitoringEndpoint();

    case JOB_MANAGER_BIN_PATH:
      return getJobManagerBinPath();

    case JOB_MANAGER_COMMANDS:
      return getJobManagerCommands();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESOURCE_JOB_MANAGER_ID:
      return isSetResourceJobManagerId();
    case RESOURCE_JOB_MANAGER_TYPE:
      return isSetResourceJobManagerType();
    case PUSH_MONITORING_ENDPOINT:
      return isSetPushMonitoringEndpoint();
    case JOB_MANAGER_BIN_PATH:
      return isSetJobManagerBinPath();
    case JOB_MANAGER_COMMANDS:
      return isSetJobManagerCommands();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ResourceJobManager)
      return this.equals((ResourceJobManager)that);
    return false;
  }

  public boolean equals(ResourceJobManager that) {
    if (that == null)
      return false;

    boolean this_present_resourceJobManagerId = true && this.isSetResourceJobManagerId();
    boolean that_present_resourceJobManagerId = true && that.isSetResourceJobManagerId();
    if (this_present_resourceJobManagerId || that_present_resourceJobManagerId) {
      if (!(this_present_resourceJobManagerId && that_present_resourceJobManagerId))
        return false;
      if (!this.resourceJobManagerId.equals(that.resourceJobManagerId))
        return false;
    }

    boolean this_present_resourceJobManagerType = true && this.isSetResourceJobManagerType();
    boolean that_present_resourceJobManagerType = true && that.isSetResourceJobManagerType();
    if (this_present_resourceJobManagerType || that_present_resourceJobManagerType) {
      if (!(this_present_resourceJobManagerType && that_present_resourceJobManagerType))
        return false;
      if (!this.resourceJobManagerType.equals(that.resourceJobManagerType))
        return false;
    }

    boolean this_present_pushMonitoringEndpoint = true && this.isSetPushMonitoringEndpoint();
    boolean that_present_pushMonitoringEndpoint = true && that.isSetPushMonitoringEndpoint();
    if (this_present_pushMonitoringEndpoint || that_present_pushMonitoringEndpoint) {
      if (!(this_present_pushMonitoringEndpoint && that_present_pushMonitoringEndpoint))
        return false;
      if (!this.pushMonitoringEndpoint.equals(that.pushMonitoringEndpoint))
        return false;
    }

    boolean this_present_jobManagerBinPath = true && this.isSetJobManagerBinPath();
    boolean that_present_jobManagerBinPath = true && that.isSetJobManagerBinPath();
    if (this_present_jobManagerBinPath || that_present_jobManagerBinPath) {
      if (!(this_present_jobManagerBinPath && that_present_jobManagerBinPath))
        return false;
      if (!this.jobManagerBinPath.equals(that.jobManagerBinPath))
        return false;
    }

    boolean this_present_jobManagerCommands = true && this.isSetJobManagerCommands();
    boolean that_present_jobManagerCommands = true && that.isSetJobManagerCommands();
    if (this_present_jobManagerCommands || that_present_jobManagerCommands) {
      if (!(this_present_jobManagerCommands && that_present_jobManagerCommands))
        return false;
      if (!this.jobManagerCommands.equals(that.jobManagerCommands))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_resourceJobManagerId = true && (isSetResourceJobManagerId());
    list.add(present_resourceJobManagerId);
    if (present_resourceJobManagerId)
      list.add(resourceJobManagerId);

    boolean present_resourceJobManagerType = true && (isSetResourceJobManagerType());
    list.add(present_resourceJobManagerType);
    if (present_resourceJobManagerType)
      list.add(resourceJobManagerType.getValue());

    boolean present_pushMonitoringEndpoint = true && (isSetPushMonitoringEndpoint());
    list.add(present_pushMonitoringEndpoint);
    if (present_pushMonitoringEndpoint)
      list.add(pushMonitoringEndpoint);

    boolean present_jobManagerBinPath = true && (isSetJobManagerBinPath());
    list.add(present_jobManagerBinPath);
    if (present_jobManagerBinPath)
      list.add(jobManagerBinPath);

    boolean present_jobManagerCommands = true && (isSetJobManagerCommands());
    list.add(present_jobManagerCommands);
    if (present_jobManagerCommands)
      list.add(jobManagerCommands);

    return list.hashCode();
  }

  @Override
  public int compareTo(ResourceJobManager other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResourceJobManagerId()).compareTo(other.isSetResourceJobManagerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceJobManagerId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourceJobManagerId, other.resourceJobManagerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResourceJobManagerType()).compareTo(other.isSetResourceJobManagerType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceJobManagerType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourceJobManagerType, other.resourceJobManagerType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPushMonitoringEndpoint()).compareTo(other.isSetPushMonitoringEndpoint());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPushMonitoringEndpoint()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pushMonitoringEndpoint, other.pushMonitoringEndpoint);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobManagerBinPath()).compareTo(other.isSetJobManagerBinPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobManagerBinPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobManagerBinPath, other.jobManagerBinPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobManagerCommands()).compareTo(other.isSetJobManagerCommands());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobManagerCommands()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobManagerCommands, other.jobManagerCommands);
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
    StringBuilder sb = new StringBuilder("ResourceJobManager(");
    boolean first = true;

    sb.append("resourceJobManagerId:");
    if (this.resourceJobManagerId == null) {
      sb.append("null");
    } else {
      sb.append(this.resourceJobManagerId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("resourceJobManagerType:");
    if (this.resourceJobManagerType == null) {
      sb.append("null");
    } else {
      sb.append(this.resourceJobManagerType);
    }
    first = false;
    if (isSetPushMonitoringEndpoint()) {
      if (!first) sb.append(", ");
      sb.append("pushMonitoringEndpoint:");
      if (this.pushMonitoringEndpoint == null) {
        sb.append("null");
      } else {
        sb.append(this.pushMonitoringEndpoint);
      }
      first = false;
    }
    if (isSetJobManagerBinPath()) {
      if (!first) sb.append(", ");
      sb.append("jobManagerBinPath:");
      if (this.jobManagerBinPath == null) {
        sb.append("null");
      } else {
        sb.append(this.jobManagerBinPath);
      }
      first = false;
    }
    if (isSetJobManagerCommands()) {
      if (!first) sb.append(", ");
      sb.append("jobManagerCommands:");
      if (this.jobManagerCommands == null) {
        sb.append("null");
      } else {
        sb.append(this.jobManagerCommands);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetResourceJobManagerId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'resourceJobManagerId' is unset! Struct:" + toString());
    }

    if (!isSetResourceJobManagerType()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'resourceJobManagerType' is unset! Struct:" + toString());
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

  private static class ResourceJobManagerStandardSchemeFactory implements SchemeFactory {
    public ResourceJobManagerStandardScheme getScheme() {
      return new ResourceJobManagerStandardScheme();
    }
  }

  private static class ResourceJobManagerStandardScheme extends StandardScheme<ResourceJobManager> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ResourceJobManager struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESOURCE_JOB_MANAGER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.resourceJobManagerId = iprot.readString();
              struct.setResourceJobManagerIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESOURCE_JOB_MANAGER_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.resourceJobManagerType = org.apache.airavata.model.appcatalog.computeresource.ResourceJobManagerType.findByValue(iprot.readI32());
              struct.setResourceJobManagerTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PUSH_MONITORING_ENDPOINT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pushMonitoringEndpoint = iprot.readString();
              struct.setPushMonitoringEndpointIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // JOB_MANAGER_BIN_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jobManagerBinPath = iprot.readString();
              struct.setJobManagerBinPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // JOB_MANAGER_COMMANDS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.jobManagerCommands = new HashMap<JobManagerCommand,String>(2*_map0.size);
                JobManagerCommand _key1;
                String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = org.apache.airavata.model.appcatalog.computeresource.JobManagerCommand.findByValue(iprot.readI32());
                  _val2 = iprot.readString();
                  struct.jobManagerCommands.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setJobManagerCommandsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ResourceJobManager struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resourceJobManagerId != null) {
        oprot.writeFieldBegin(RESOURCE_JOB_MANAGER_ID_FIELD_DESC);
        oprot.writeString(struct.resourceJobManagerId);
        oprot.writeFieldEnd();
      }
      if (struct.resourceJobManagerType != null) {
        oprot.writeFieldBegin(RESOURCE_JOB_MANAGER_TYPE_FIELD_DESC);
        oprot.writeI32(struct.resourceJobManagerType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.pushMonitoringEndpoint != null) {
        if (struct.isSetPushMonitoringEndpoint()) {
          oprot.writeFieldBegin(PUSH_MONITORING_ENDPOINT_FIELD_DESC);
          oprot.writeString(struct.pushMonitoringEndpoint);
          oprot.writeFieldEnd();
        }
      }
      if (struct.jobManagerBinPath != null) {
        if (struct.isSetJobManagerBinPath()) {
          oprot.writeFieldBegin(JOB_MANAGER_BIN_PATH_FIELD_DESC);
          oprot.writeString(struct.jobManagerBinPath);
          oprot.writeFieldEnd();
        }
      }
      if (struct.jobManagerCommands != null) {
        if (struct.isSetJobManagerCommands()) {
          oprot.writeFieldBegin(JOB_MANAGER_COMMANDS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, struct.jobManagerCommands.size()));
            for (Map.Entry<JobManagerCommand, String> _iter4 : struct.jobManagerCommands.entrySet())
            {
              oprot.writeI32(_iter4.getKey().getValue());
              oprot.writeString(_iter4.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ResourceJobManagerTupleSchemeFactory implements SchemeFactory {
    public ResourceJobManagerTupleScheme getScheme() {
      return new ResourceJobManagerTupleScheme();
    }
  }

  private static class ResourceJobManagerTupleScheme extends TupleScheme<ResourceJobManager> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ResourceJobManager struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.resourceJobManagerId);
      oprot.writeI32(struct.resourceJobManagerType.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetPushMonitoringEndpoint()) {
        optionals.set(0);
      }
      if (struct.isSetJobManagerBinPath()) {
        optionals.set(1);
      }
      if (struct.isSetJobManagerCommands()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPushMonitoringEndpoint()) {
        oprot.writeString(struct.pushMonitoringEndpoint);
      }
      if (struct.isSetJobManagerBinPath()) {
        oprot.writeString(struct.jobManagerBinPath);
      }
      if (struct.isSetJobManagerCommands()) {
        {
          oprot.writeI32(struct.jobManagerCommands.size());
          for (Map.Entry<JobManagerCommand, String> _iter5 : struct.jobManagerCommands.entrySet())
          {
            oprot.writeI32(_iter5.getKey().getValue());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ResourceJobManager struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.resourceJobManagerId = iprot.readString();
      struct.setResourceJobManagerIdIsSet(true);
      struct.resourceJobManagerType = org.apache.airavata.model.appcatalog.computeresource.ResourceJobManagerType.findByValue(iprot.readI32());
      struct.setResourceJobManagerTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.pushMonitoringEndpoint = iprot.readString();
        struct.setPushMonitoringEndpointIsSet(true);
      }
      if (incoming.get(1)) {
        struct.jobManagerBinPath = iprot.readString();
        struct.setJobManagerBinPathIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.jobManagerCommands = new HashMap<JobManagerCommand,String>(2*_map6.size);
          JobManagerCommand _key7;
          String _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = org.apache.airavata.model.appcatalog.computeresource.JobManagerCommand.findByValue(iprot.readI32());
            _val8 = iprot.readString();
            struct.jobManagerCommands.put(_key7, _val8);
          }
        }
        struct.setJobManagerCommandsIsSet(true);
      }
    }
  }

}

