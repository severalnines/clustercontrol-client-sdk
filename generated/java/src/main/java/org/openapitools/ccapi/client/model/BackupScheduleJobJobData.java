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
import org.openapitools.ccapi.client.model.BackupScheduleJobJobDataVerifyBackup;

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
 * BackupScheduleJobJobData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-21T15:50:08.265886-05:00[America/New_York]")
public class BackupScheduleJobJobData {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BACKUP_FAILOVER = "backup_failover";
  @SerializedName(SERIALIZED_NAME_BACKUP_FAILOVER)
  private Boolean backupFailover;

  /**
   * Gets or Sets backupFailoverHost
   */
  @JsonAdapter(BackupFailoverHostEnum.Adapter.class)
  public enum BackupFailoverHostEnum {
    AUTO("auto");

    private String value;

    BackupFailoverHostEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BackupFailoverHostEnum fromValue(String value) {
      for (BackupFailoverHostEnum b : BackupFailoverHostEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BackupFailoverHostEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BackupFailoverHostEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BackupFailoverHostEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BackupFailoverHostEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BACKUP_FAILOVER_HOST = "backup_failover_host";
  @SerializedName(SERIALIZED_NAME_BACKUP_FAILOVER_HOST)
  private BackupFailoverHostEnum backupFailoverHost;

  /**
   * Gets or Sets backupMethod
   */
  @JsonAdapter(BackupMethodEnum.Adapter.class)
  public enum BackupMethodEnum {
    PG_BASEBACKUP("pg_basebackup");

    private String value;

    BackupMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BackupMethodEnum fromValue(String value) {
      for (BackupMethodEnum b : BackupMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BackupMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BackupMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BackupMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BackupMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BACKUP_METHOD = "backup_method";
  @SerializedName(SERIALIZED_NAME_BACKUP_METHOD)
  private BackupMethodEnum backupMethod;

  public static final String SERIALIZED_NAME_BACKUP_RETENTION = "backup_retention";
  @SerializedName(SERIALIZED_NAME_BACKUP_RETENTION)
  private Integer backupRetention;

  public static final String SERIALIZED_NAME_BACKUPDIR = "backupdir";
  @SerializedName(SERIALIZED_NAME_BACKUPDIR)
  private String backupdir;

  public static final String SERIALIZED_NAME_BACKUPSUBDIR = "backupsubdir";
  @SerializedName(SERIALIZED_NAME_BACKUPSUBDIR)
  private String backupsubdir;

  public static final String SERIALIZED_NAME_CC_STORAGE = "cc_storage";
  @SerializedName(SERIALIZED_NAME_CC_STORAGE)
  private String ccStorage;

  public static final String SERIALIZED_NAME_COMPRESSION = "compression";
  @SerializedName(SERIALIZED_NAME_COMPRESSION)
  private Boolean compression;

  public static final String SERIALIZED_NAME_COMPRESION_LEVEL = "compresion_level";
  @SerializedName(SERIALIZED_NAME_COMPRESION_LEVEL)
  private Integer compresionLevel;

  public static final String SERIALIZED_NAME_ENCRYPT_BACKUP = "encrypt_backup";
  @SerializedName(SERIALIZED_NAME_ENCRYPT_BACKUP)
  private Boolean encryptBackup;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_VERIFY_BACKUP_DELAY = "verify_backup_delay";
  @SerializedName(SERIALIZED_NAME_VERIFY_BACKUP_DELAY)
  private Integer verifyBackupDelay;

  public static final String SERIALIZED_NAME_VERIFY_BACKUP = "verify_backup";
  @SerializedName(SERIALIZED_NAME_VERIFY_BACKUP)
  private BackupScheduleJobJobDataVerifyBackup verifyBackup;

  public BackupScheduleJobJobData() {
  }

  public BackupScheduleJobJobData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public BackupScheduleJobJobData backupFailover(Boolean backupFailover) {
    
    this.backupFailover = backupFailover;
    return this;
  }

   /**
   * Get backupFailover
   * @return backupFailover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBackupFailover() {
    return backupFailover;
  }


  public void setBackupFailover(Boolean backupFailover) {
    this.backupFailover = backupFailover;
  }


  public BackupScheduleJobJobData backupFailoverHost(BackupFailoverHostEnum backupFailoverHost) {
    
    this.backupFailoverHost = backupFailoverHost;
    return this;
  }

   /**
   * Get backupFailoverHost
   * @return backupFailoverHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupFailoverHostEnum getBackupFailoverHost() {
    return backupFailoverHost;
  }


  public void setBackupFailoverHost(BackupFailoverHostEnum backupFailoverHost) {
    this.backupFailoverHost = backupFailoverHost;
  }


  public BackupScheduleJobJobData backupMethod(BackupMethodEnum backupMethod) {
    
    this.backupMethod = backupMethod;
    return this;
  }

   /**
   * Get backupMethod
   * @return backupMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupMethodEnum getBackupMethod() {
    return backupMethod;
  }


  public void setBackupMethod(BackupMethodEnum backupMethod) {
    this.backupMethod = backupMethod;
  }


  public BackupScheduleJobJobData backupRetention(Integer backupRetention) {
    
    this.backupRetention = backupRetention;
    return this;
  }

   /**
   * Get backupRetention
   * @return backupRetention
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBackupRetention() {
    return backupRetention;
  }


  public void setBackupRetention(Integer backupRetention) {
    this.backupRetention = backupRetention;
  }


  public BackupScheduleJobJobData backupdir(String backupdir) {
    
    this.backupdir = backupdir;
    return this;
  }

   /**
   * Get backupdir
   * @return backupdir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBackupdir() {
    return backupdir;
  }


  public void setBackupdir(String backupdir) {
    this.backupdir = backupdir;
  }


  public BackupScheduleJobJobData backupsubdir(String backupsubdir) {
    
    this.backupsubdir = backupsubdir;
    return this;
  }

   /**
   * Get backupsubdir
   * @return backupsubdir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBackupsubdir() {
    return backupsubdir;
  }


  public void setBackupsubdir(String backupsubdir) {
    this.backupsubdir = backupsubdir;
  }


  public BackupScheduleJobJobData ccStorage(String ccStorage) {
    
    this.ccStorage = ccStorage;
    return this;
  }

   /**
   * Get ccStorage
   * @return ccStorage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCcStorage() {
    return ccStorage;
  }


  public void setCcStorage(String ccStorage) {
    this.ccStorage = ccStorage;
  }


  public BackupScheduleJobJobData compression(Boolean compression) {
    
    this.compression = compression;
    return this;
  }

   /**
   * Get compression
   * @return compression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCompression() {
    return compression;
  }


  public void setCompression(Boolean compression) {
    this.compression = compression;
  }


  public BackupScheduleJobJobData compresionLevel(Integer compresionLevel) {
    
    this.compresionLevel = compresionLevel;
    return this;
  }

   /**
   * Get compresionLevel
   * @return compresionLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCompresionLevel() {
    return compresionLevel;
  }


  public void setCompresionLevel(Integer compresionLevel) {
    this.compresionLevel = compresionLevel;
  }


  public BackupScheduleJobJobData encryptBackup(Boolean encryptBackup) {
    
    this.encryptBackup = encryptBackup;
    return this;
  }

   /**
   * Get encryptBackup
   * @return encryptBackup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEncryptBackup() {
    return encryptBackup;
  }


  public void setEncryptBackup(Boolean encryptBackup) {
    this.encryptBackup = encryptBackup;
  }


  public BackupScheduleJobJobData hostname(String hostname) {
    
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


  public BackupScheduleJobJobData port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public BackupScheduleJobJobData verifyBackupDelay(Integer verifyBackupDelay) {
    
    this.verifyBackupDelay = verifyBackupDelay;
    return this;
  }

   /**
   * Get verifyBackupDelay
   * @return verifyBackupDelay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVerifyBackupDelay() {
    return verifyBackupDelay;
  }


  public void setVerifyBackupDelay(Integer verifyBackupDelay) {
    this.verifyBackupDelay = verifyBackupDelay;
  }


  public BackupScheduleJobJobData verifyBackup(BackupScheduleJobJobDataVerifyBackup verifyBackup) {
    
    this.verifyBackup = verifyBackup;
    return this;
  }

   /**
   * Get verifyBackup
   * @return verifyBackup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupScheduleJobJobDataVerifyBackup getVerifyBackup() {
    return verifyBackup;
  }


  public void setVerifyBackup(BackupScheduleJobJobDataVerifyBackup verifyBackup) {
    this.verifyBackup = verifyBackup;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupScheduleJobJobData backupScheduleJobJobData = (BackupScheduleJobJobData) o;
    return Objects.equals(this.description, backupScheduleJobJobData.description) &&
        Objects.equals(this.backupFailover, backupScheduleJobJobData.backupFailover) &&
        Objects.equals(this.backupFailoverHost, backupScheduleJobJobData.backupFailoverHost) &&
        Objects.equals(this.backupMethod, backupScheduleJobJobData.backupMethod) &&
        Objects.equals(this.backupRetention, backupScheduleJobJobData.backupRetention) &&
        Objects.equals(this.backupdir, backupScheduleJobJobData.backupdir) &&
        Objects.equals(this.backupsubdir, backupScheduleJobJobData.backupsubdir) &&
        Objects.equals(this.ccStorage, backupScheduleJobJobData.ccStorage) &&
        Objects.equals(this.compression, backupScheduleJobJobData.compression) &&
        Objects.equals(this.compresionLevel, backupScheduleJobJobData.compresionLevel) &&
        Objects.equals(this.encryptBackup, backupScheduleJobJobData.encryptBackup) &&
        Objects.equals(this.hostname, backupScheduleJobJobData.hostname) &&
        Objects.equals(this.port, backupScheduleJobJobData.port) &&
        Objects.equals(this.verifyBackupDelay, backupScheduleJobJobData.verifyBackupDelay) &&
        Objects.equals(this.verifyBackup, backupScheduleJobJobData.verifyBackup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, backupFailover, backupFailoverHost, backupMethod, backupRetention, backupdir, backupsubdir, ccStorage, compression, compresionLevel, encryptBackup, hostname, port, verifyBackupDelay, verifyBackup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupScheduleJobJobData {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    backupFailover: ").append(toIndentedString(backupFailover)).append("\n");
    sb.append("    backupFailoverHost: ").append(toIndentedString(backupFailoverHost)).append("\n");
    sb.append("    backupMethod: ").append(toIndentedString(backupMethod)).append("\n");
    sb.append("    backupRetention: ").append(toIndentedString(backupRetention)).append("\n");
    sb.append("    backupdir: ").append(toIndentedString(backupdir)).append("\n");
    sb.append("    backupsubdir: ").append(toIndentedString(backupsubdir)).append("\n");
    sb.append("    ccStorage: ").append(toIndentedString(ccStorage)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    compresionLevel: ").append(toIndentedString(compresionLevel)).append("\n");
    sb.append("    encryptBackup: ").append(toIndentedString(encryptBackup)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    verifyBackupDelay: ").append(toIndentedString(verifyBackupDelay)).append("\n");
    sb.append("    verifyBackup: ").append(toIndentedString(verifyBackup)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("backup_failover");
    openapiFields.add("backup_failover_host");
    openapiFields.add("backup_method");
    openapiFields.add("backup_retention");
    openapiFields.add("backupdir");
    openapiFields.add("backupsubdir");
    openapiFields.add("cc_storage");
    openapiFields.add("compression");
    openapiFields.add("compresion_level");
    openapiFields.add("encrypt_backup");
    openapiFields.add("hostname");
    openapiFields.add("port");
    openapiFields.add("verify_backup_delay");
    openapiFields.add("verify_backup");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BackupScheduleJobJobData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BackupScheduleJobJobData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BackupScheduleJobJobData is not found in the empty JSON string", BackupScheduleJobJobData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BackupScheduleJobJobData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BackupScheduleJobJobData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("backup_failover_host") != null && !jsonObj.get("backup_failover_host").isJsonNull()) && !jsonObj.get("backup_failover_host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backup_failover_host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backup_failover_host").toString()));
      }
      if ((jsonObj.get("backup_method") != null && !jsonObj.get("backup_method").isJsonNull()) && !jsonObj.get("backup_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backup_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backup_method").toString()));
      }
      if ((jsonObj.get("backupdir") != null && !jsonObj.get("backupdir").isJsonNull()) && !jsonObj.get("backupdir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backupdir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backupdir").toString()));
      }
      if ((jsonObj.get("backupsubdir") != null && !jsonObj.get("backupsubdir").isJsonNull()) && !jsonObj.get("backupsubdir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backupsubdir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backupsubdir").toString()));
      }
      if ((jsonObj.get("cc_storage") != null && !jsonObj.get("cc_storage").isJsonNull()) && !jsonObj.get("cc_storage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cc_storage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cc_storage").toString()));
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      // validate the optional field `verify_backup`
      if (jsonObj.get("verify_backup") != null && !jsonObj.get("verify_backup").isJsonNull()) {
        BackupScheduleJobJobDataVerifyBackup.validateJsonObject(jsonObj.getAsJsonObject("verify_backup"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BackupScheduleJobJobData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BackupScheduleJobJobData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BackupScheduleJobJobData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BackupScheduleJobJobData.class));

       return (TypeAdapter<T>) new TypeAdapter<BackupScheduleJobJobData>() {
           @Override
           public void write(JsonWriter out, BackupScheduleJobJobData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BackupScheduleJobJobData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BackupScheduleJobJobData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BackupScheduleJobJobData
  * @throws IOException if the JSON string is invalid with respect to BackupScheduleJobJobData
  */
  public static BackupScheduleJobJobData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BackupScheduleJobJobData.class);
  }

 /**
  * Convert an instance of BackupScheduleJobJobData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

