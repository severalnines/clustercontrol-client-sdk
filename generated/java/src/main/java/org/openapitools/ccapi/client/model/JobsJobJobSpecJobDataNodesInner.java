/*
 * Severalnines ClusterControl REST API (V2)
 * REST API (V2) specification for ClusterControl - AI Powered Database automation tool for multi/hybrid cloud database deployment.
 *
 * The version of the OpenAPI document: OpenAPI specification v1.0.0
 * Contact: sales@severalnines.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.ccapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.ccapi.client.JSON;

/**
 * JobsJobJobSpecJobDataNodesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-28T20:03:34.941519-05:00[America/New_York]")
public class JobsJobJobSpecJobDataNodesInner {
  /**
   * Gets or Sets className
   */
  @JsonAdapter(ClassNameEnum.Adapter.class)
  public enum ClassNameEnum {
    CMONREDISHOST("CmonRedisHost"),
    
    CMONREDISSENTINELHOST("CmonRedisSentinelHost"),
    
    CMONHOST("CmonHost"),
    
    CMONPBMAGENTHOST("CmonPBMAgentHost"),
    
    CMONPGBOUNCERHOST("CmonPgBouncerHost"),
    
    CMONMSSQLHOST("CmonMsSqlHost"),
    
    CMONELASTICHOST("CmonElasticHost");

    private String value;

    ClassNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClassNameEnum fromValue(String value) {
      for (ClassNameEnum b : ClassNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ClassNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClassNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClassNameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ClassNameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CLASS_NAME = "class_name";
  @SerializedName(SERIALIZED_NAME_CLASS_NAME)
  private ClassNameEnum className;

  public static final String SERIALIZED_NAME_CDT_PATH = "cdt_path";
  @SerializedName(SERIALIZED_NAME_CDT_PATH)
  private String cdtPath;

  public static final String SERIALIZED_NAME_ACL = "acl";
  @SerializedName(SERIALIZED_NAME_ACL)
  private String acl;

  public static final String SERIALIZED_NAME_CLUSTERID = "clusterid";
  @SerializedName(SERIALIZED_NAME_CLUSTERID)
  private Integer clusterid;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  /**
   * Gets or Sets maintenanceMode
   */
  @JsonAdapter(MaintenanceModeEnum.Adapter.class)
  public enum MaintenanceModeEnum {
    NONE("none");

    private String value;

    MaintenanceModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MaintenanceModeEnum fromValue(String value) {
      for (MaintenanceModeEnum b : MaintenanceModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MaintenanceModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MaintenanceModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MaintenanceModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MaintenanceModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MAINTENANCE_MODE = "maintenance_mode";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_MODE)
  private MaintenanceModeEnum maintenanceMode;

  public static final String SERIALIZED_NAME_MAINTENANCE_MODE_ACTIVE = "maintenance_mode_active";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_MODE_ACTIVE)
  private Boolean maintenanceModeActive;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_UNIQUE_ID = "unique_id";
  @SerializedName(SERIALIZED_NAME_UNIQUE_ID)
  private Integer uniqueId;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_HOSTNAME_DATA = "hostname_data";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_DATA)
  private String hostnameData;

  public static final String SERIALIZED_NAME_HOSTNAME_INTERNAL = "hostname_internal";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_INTERNAL)
  private String hostnameInternal;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_NODETYPE = "nodetype";
  @SerializedName(SERIALIZED_NAME_NODETYPE)
  private String nodetype;

  public static final String SERIALIZED_NAME_CONFIGFILE = "configfile";
  @SerializedName(SERIALIZED_NAME_CONFIGFILE)
  private String configfile;

  public static final String SERIALIZED_NAME_DATADIR = "datadir";
  @SerializedName(SERIALIZED_NAME_DATADIR)
  private String datadir;

  public static final String SERIALIZED_NAME_BACKUP_DIR = "backup_dir";
  @SerializedName(SERIALIZED_NAME_BACKUP_DIR)
  private String backupDir;

  public static final String SERIALIZED_NAME_SYNCHRONOUS = "synchronous";
  @SerializedName(SERIALIZED_NAME_SYNCHRONOUS)
  private Boolean synchronous;

  /**
   * Gets or Sets protocol
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    ELASTIC("elastic");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProtocolEnum fromValue(String value) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProtocolEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private ProtocolEnum protocol;

  /**
   * Gets or Sets roles
   */
  @JsonAdapter(RolesEnum.Adapter.class)
  public enum RolesEnum {
    MASTER("master"),
    
    DATA("data"),
    
    MASTER_DATA("master-data");

    private String value;

    RolesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RolesEnum fromValue(String value) {
      for (RolesEnum b : RolesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RolesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RolesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RolesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RolesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private RolesEnum roles;

  public JobsJobJobSpecJobDataNodesInner() {
  }

  public JobsJobJobSpecJobDataNodesInner className(ClassNameEnum className) {
    
    this.className = className;
    return this;
  }

   /**
   * Get className
   * @return className
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassNameEnum getClassName() {
    return className;
  }


  public void setClassName(ClassNameEnum className) {
    this.className = className;
  }


  public JobsJobJobSpecJobDataNodesInner cdtPath(String cdtPath) {
    
    this.cdtPath = cdtPath;
    return this;
  }

   /**
   * Get cdtPath
   * @return cdtPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCdtPath() {
    return cdtPath;
  }


  public void setCdtPath(String cdtPath) {
    this.cdtPath = cdtPath;
  }


  public JobsJobJobSpecJobDataNodesInner acl(String acl) {
    
    this.acl = acl;
    return this;
  }

   /**
   * Get acl
   * @return acl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAcl() {
    return acl;
  }


  public void setAcl(String acl) {
    this.acl = acl;
  }


  public JobsJobJobSpecJobDataNodesInner clusterid(Integer clusterid) {
    
    this.clusterid = clusterid;
    return this;
  }

   /**
   * Get clusterid
   * @return clusterid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterid() {
    return clusterid;
  }


  public void setClusterid(Integer clusterid) {
    this.clusterid = clusterid;
  }


  public JobsJobJobSpecJobDataNodesInner ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  public JobsJobJobSpecJobDataNodesInner maintenanceMode(MaintenanceModeEnum maintenanceMode) {
    
    this.maintenanceMode = maintenanceMode;
    return this;
  }

   /**
   * Get maintenanceMode
   * @return maintenanceMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MaintenanceModeEnum getMaintenanceMode() {
    return maintenanceMode;
  }


  public void setMaintenanceMode(MaintenanceModeEnum maintenanceMode) {
    this.maintenanceMode = maintenanceMode;
  }


  public JobsJobJobSpecJobDataNodesInner maintenanceModeActive(Boolean maintenanceModeActive) {
    
    this.maintenanceModeActive = maintenanceModeActive;
    return this;
  }

   /**
   * Get maintenanceModeActive
   * @return maintenanceModeActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMaintenanceModeActive() {
    return maintenanceModeActive;
  }


  public void setMaintenanceModeActive(Boolean maintenanceModeActive) {
    this.maintenanceModeActive = maintenanceModeActive;
  }


  public JobsJobJobSpecJobDataNodesInner timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public JobsJobJobSpecJobDataNodesInner uniqueId(Integer uniqueId) {
    
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUniqueId() {
    return uniqueId;
  }


  public void setUniqueId(Integer uniqueId) {
    this.uniqueId = uniqueId;
  }


  public JobsJobJobSpecJobDataNodesInner hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public JobsJobJobSpecJobDataNodesInner hostnameData(String hostnameData) {
    
    this.hostnameData = hostnameData;
    return this;
  }

   /**
   * Get hostnameData
   * @return hostnameData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostnameData() {
    return hostnameData;
  }


  public void setHostnameData(String hostnameData) {
    this.hostnameData = hostnameData;
  }


  public JobsJobJobSpecJobDataNodesInner hostnameInternal(String hostnameInternal) {
    
    this.hostnameInternal = hostnameInternal;
    return this;
  }

   /**
   * Get hostnameInternal
   * @return hostnameInternal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostnameInternal() {
    return hostnameInternal;
  }


  public void setHostnameInternal(String hostnameInternal) {
    this.hostnameInternal = hostnameInternal;
  }


  public JobsJobJobSpecJobDataNodesInner port(String port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPort() {
    return port;
  }


  public void setPort(String port) {
    this.port = port;
  }


  public JobsJobJobSpecJobDataNodesInner nodetype(String nodetype) {
    
    this.nodetype = nodetype;
    return this;
  }

   /**
   * Get nodetype
   * @return nodetype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodetype() {
    return nodetype;
  }


  public void setNodetype(String nodetype) {
    this.nodetype = nodetype;
  }


  public JobsJobJobSpecJobDataNodesInner configfile(String configfile) {
    
    this.configfile = configfile;
    return this;
  }

   /**
   * Get configfile
   * @return configfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConfigfile() {
    return configfile;
  }


  public void setConfigfile(String configfile) {
    this.configfile = configfile;
  }


  public JobsJobJobSpecJobDataNodesInner datadir(String datadir) {
    
    this.datadir = datadir;
    return this;
  }

   /**
   * Get datadir
   * @return datadir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatadir() {
    return datadir;
  }


  public void setDatadir(String datadir) {
    this.datadir = datadir;
  }


  public JobsJobJobSpecJobDataNodesInner backupDir(String backupDir) {
    
    this.backupDir = backupDir;
    return this;
  }

   /**
   * Get backupDir
   * @return backupDir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBackupDir() {
    return backupDir;
  }


  public void setBackupDir(String backupDir) {
    this.backupDir = backupDir;
  }


  public JobsJobJobSpecJobDataNodesInner synchronous(Boolean synchronous) {
    
    this.synchronous = synchronous;
    return this;
  }

   /**
   * Get synchronous
   * @return synchronous
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSynchronous() {
    return synchronous;
  }


  public void setSynchronous(Boolean synchronous) {
    this.synchronous = synchronous;
  }


  public JobsJobJobSpecJobDataNodesInner protocol(ProtocolEnum protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProtocolEnum getProtocol() {
    return protocol;
  }


  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }


  public JobsJobJobSpecJobDataNodesInner roles(RolesEnum roles) {
    
    this.roles = roles;
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RolesEnum getRoles() {
    return roles;
  }


  public void setRoles(RolesEnum roles) {
    this.roles = roles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobsJobJobSpecJobDataNodesInner jobsJobJobSpecJobDataNodesInner = (JobsJobJobSpecJobDataNodesInner) o;
    return Objects.equals(this.className, jobsJobJobSpecJobDataNodesInner.className) &&
        Objects.equals(this.cdtPath, jobsJobJobSpecJobDataNodesInner.cdtPath) &&
        Objects.equals(this.acl, jobsJobJobSpecJobDataNodesInner.acl) &&
        Objects.equals(this.clusterid, jobsJobJobSpecJobDataNodesInner.clusterid) &&
        Objects.equals(this.ip, jobsJobJobSpecJobDataNodesInner.ip) &&
        Objects.equals(this.maintenanceMode, jobsJobJobSpecJobDataNodesInner.maintenanceMode) &&
        Objects.equals(this.maintenanceModeActive, jobsJobJobSpecJobDataNodesInner.maintenanceModeActive) &&
        Objects.equals(this.timestamp, jobsJobJobSpecJobDataNodesInner.timestamp) &&
        Objects.equals(this.uniqueId, jobsJobJobSpecJobDataNodesInner.uniqueId) &&
        Objects.equals(this.hostname, jobsJobJobSpecJobDataNodesInner.hostname) &&
        Objects.equals(this.hostnameData, jobsJobJobSpecJobDataNodesInner.hostnameData) &&
        Objects.equals(this.hostnameInternal, jobsJobJobSpecJobDataNodesInner.hostnameInternal) &&
        Objects.equals(this.port, jobsJobJobSpecJobDataNodesInner.port) &&
        Objects.equals(this.nodetype, jobsJobJobSpecJobDataNodesInner.nodetype) &&
        Objects.equals(this.configfile, jobsJobJobSpecJobDataNodesInner.configfile) &&
        Objects.equals(this.datadir, jobsJobJobSpecJobDataNodesInner.datadir) &&
        Objects.equals(this.backupDir, jobsJobJobSpecJobDataNodesInner.backupDir) &&
        Objects.equals(this.synchronous, jobsJobJobSpecJobDataNodesInner.synchronous) &&
        Objects.equals(this.protocol, jobsJobJobSpecJobDataNodesInner.protocol) &&
        Objects.equals(this.roles, jobsJobJobSpecJobDataNodesInner.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, cdtPath, acl, clusterid, ip, maintenanceMode, maintenanceModeActive, timestamp, uniqueId, hostname, hostnameData, hostnameInternal, port, nodetype, configfile, datadir, backupDir, synchronous, protocol, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobsJobJobSpecJobDataNodesInner {\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    cdtPath: ").append(toIndentedString(cdtPath)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
    sb.append("    clusterid: ").append(toIndentedString(clusterid)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    maintenanceMode: ").append(toIndentedString(maintenanceMode)).append("\n");
    sb.append("    maintenanceModeActive: ").append(toIndentedString(maintenanceModeActive)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    hostnameData: ").append(toIndentedString(hostnameData)).append("\n");
    sb.append("    hostnameInternal: ").append(toIndentedString(hostnameInternal)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    nodetype: ").append(toIndentedString(nodetype)).append("\n");
    sb.append("    configfile: ").append(toIndentedString(configfile)).append("\n");
    sb.append("    datadir: ").append(toIndentedString(datadir)).append("\n");
    sb.append("    backupDir: ").append(toIndentedString(backupDir)).append("\n");
    sb.append("    synchronous: ").append(toIndentedString(synchronous)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("class_name");
    openapiFields.add("cdt_path");
    openapiFields.add("acl");
    openapiFields.add("clusterid");
    openapiFields.add("ip");
    openapiFields.add("maintenance_mode");
    openapiFields.add("maintenance_mode_active");
    openapiFields.add("timestamp");
    openapiFields.add("unique_id");
    openapiFields.add("hostname");
    openapiFields.add("hostname_data");
    openapiFields.add("hostname_internal");
    openapiFields.add("port");
    openapiFields.add("nodetype");
    openapiFields.add("configfile");
    openapiFields.add("datadir");
    openapiFields.add("backup_dir");
    openapiFields.add("synchronous");
    openapiFields.add("protocol");
    openapiFields.add("roles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobsJobJobSpecJobDataNodesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobsJobJobSpecJobDataNodesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobsJobJobSpecJobDataNodesInner is not found in the empty JSON string", JobsJobJobSpecJobDataNodesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JobsJobJobSpecJobDataNodesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobsJobJobSpecJobDataNodesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("class_name") != null && !jsonObj.get("class_name").isJsonNull()) && !jsonObj.get("class_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class_name").toString()));
      }
      if ((jsonObj.get("cdt_path") != null && !jsonObj.get("cdt_path").isJsonNull()) && !jsonObj.get("cdt_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cdt_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cdt_path").toString()));
      }
      if ((jsonObj.get("acl") != null && !jsonObj.get("acl").isJsonNull()) && !jsonObj.get("acl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acl").toString()));
      }
      if ((jsonObj.get("ip") != null && !jsonObj.get("ip").isJsonNull()) && !jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
      if ((jsonObj.get("maintenance_mode") != null && !jsonObj.get("maintenance_mode").isJsonNull()) && !jsonObj.get("maintenance_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maintenance_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maintenance_mode").toString()));
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      if ((jsonObj.get("hostname_data") != null && !jsonObj.get("hostname_data").isJsonNull()) && !jsonObj.get("hostname_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname_data").toString()));
      }
      if ((jsonObj.get("hostname_internal") != null && !jsonObj.get("hostname_internal").isJsonNull()) && !jsonObj.get("hostname_internal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname_internal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname_internal").toString()));
      }
      if ((jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) && !jsonObj.get("port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("port").toString()));
      }
      if ((jsonObj.get("nodetype") != null && !jsonObj.get("nodetype").isJsonNull()) && !jsonObj.get("nodetype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodetype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodetype").toString()));
      }
      if ((jsonObj.get("configfile") != null && !jsonObj.get("configfile").isJsonNull()) && !jsonObj.get("configfile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configfile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configfile").toString()));
      }
      if ((jsonObj.get("datadir") != null && !jsonObj.get("datadir").isJsonNull()) && !jsonObj.get("datadir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datadir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datadir").toString()));
      }
      if ((jsonObj.get("backup_dir") != null && !jsonObj.get("backup_dir").isJsonNull()) && !jsonObj.get("backup_dir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backup_dir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backup_dir").toString()));
      }
      if ((jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) && !jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
      }
      if ((jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonNull()) && !jsonObj.get("roles").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobsJobJobSpecJobDataNodesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobsJobJobSpecJobDataNodesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobsJobJobSpecJobDataNodesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobsJobJobSpecJobDataNodesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<JobsJobJobSpecJobDataNodesInner>() {
           @Override
           public void write(JsonWriter out, JobsJobJobSpecJobDataNodesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobsJobJobSpecJobDataNodesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobsJobJobSpecJobDataNodesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobsJobJobSpecJobDataNodesInner
  * @throws IOException if the JSON string is invalid with respect to JobsJobJobSpecJobDataNodesInner
  */
  public static JobsJobJobSpecJobDataNodesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobsJobJobSpecJobDataNodesInner.class);
  }

 /**
  * Convert an instance of JobsJobJobSpecJobDataNodesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

