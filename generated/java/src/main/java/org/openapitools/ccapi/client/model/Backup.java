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
import org.openapitools.ccapi.client.model.BackupBackupRecord;
import org.openapitools.ccapi.client.model.BackupSchedule;

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
 * Backup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-28T20:03:34.941519-05:00[America/New_York]")
public class Backup {
  /**
   * Gets or Sets operation
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    GETBACKUPS("getBackups"),
    
    GETBACKUPSCHEDULES("getBackupSchedules"),
    
    SCHEDULEBACKUP("scheduleBackup"),
    
    DELETEBACKUPRECORD("deleteBackupRecord");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private OperationEnum operation;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private Integer clusterId;

  public static final String SERIALIZED_NAME_ASCENDING = "ascending";
  @SerializedName(SERIALIZED_NAME_ASCENDING)
  private Boolean ascending;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private BackupSchedule schedule;

  public static final String SERIALIZED_NAME_BACKUP_RECORD = "backup_record";
  @SerializedName(SERIALIZED_NAME_BACKUP_RECORD)
  private BackupBackupRecord backupRecord;

  public Backup() {
  }

  public Backup operation(OperationEnum operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OperationEnum getOperation() {
    return operation;
  }


  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  public Backup clusterId(Integer clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterId() {
    return clusterId;
  }


  public void setClusterId(Integer clusterId) {
    this.clusterId = clusterId;
  }


  public Backup ascending(Boolean ascending) {
    
    this.ascending = ascending;
    return this;
  }

   /**
   * Get ascending
   * @return ascending
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAscending() {
    return ascending;
  }


  public void setAscending(Boolean ascending) {
    this.ascending = ascending;
  }


  public Backup schedule(BackupSchedule schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupSchedule getSchedule() {
    return schedule;
  }


  public void setSchedule(BackupSchedule schedule) {
    this.schedule = schedule;
  }


  public Backup backupRecord(BackupBackupRecord backupRecord) {
    
    this.backupRecord = backupRecord;
    return this;
  }

   /**
   * Get backupRecord
   * @return backupRecord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupBackupRecord getBackupRecord() {
    return backupRecord;
  }


  public void setBackupRecord(BackupBackupRecord backupRecord) {
    this.backupRecord = backupRecord;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Backup backup = (Backup) o;
    return Objects.equals(this.operation, backup.operation) &&
        Objects.equals(this.clusterId, backup.clusterId) &&
        Objects.equals(this.ascending, backup.ascending) &&
        Objects.equals(this.schedule, backup.schedule) &&
        Objects.equals(this.backupRecord, backup.backupRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, clusterId, ascending, schedule, backupRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Backup {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    ascending: ").append(toIndentedString(ascending)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    backupRecord: ").append(toIndentedString(backupRecord)).append("\n");
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
    openapiFields.add("operation");
    openapiFields.add("cluster_id");
    openapiFields.add("ascending");
    openapiFields.add("schedule");
    openapiFields.add("backup_record");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operation");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Backup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Backup.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Backup is not found in the empty JSON string", Backup.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Backup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Backup` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Backup.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      // validate the optional field `schedule`
      if (jsonObj.get("schedule") != null && !jsonObj.get("schedule").isJsonNull()) {
        BackupSchedule.validateJsonObject(jsonObj.getAsJsonObject("schedule"));
      }
      // validate the optional field `backup_record`
      if (jsonObj.get("backup_record") != null && !jsonObj.get("backup_record").isJsonNull()) {
        BackupBackupRecord.validateJsonObject(jsonObj.getAsJsonObject("backup_record"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Backup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Backup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Backup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Backup.class));

       return (TypeAdapter<T>) new TypeAdapter<Backup>() {
           @Override
           public void write(JsonWriter out, Backup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Backup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Backup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Backup
  * @throws IOException if the JSON string is invalid with respect to Backup
  */
  public static Backup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Backup.class);
  }

 /**
  * Convert an instance of Backup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

