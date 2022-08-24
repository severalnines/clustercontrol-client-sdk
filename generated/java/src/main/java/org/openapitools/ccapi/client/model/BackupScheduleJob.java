/*
 * Severalnines ClusterControl
 * This is a ...
 *
 * The version of the OpenAPI document: 1.0.0
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
import org.openapitools.ccapi.client.model.BackupScheduleJobJobData;

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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.ccapi.client.JSON;

/**
 * BackupScheduleJob
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T17:47:57.934643-04:00[America/New_York]")
public class BackupScheduleJob {
  /**
   * Gets or Sets command
   */
  @JsonAdapter(CommandEnum.Adapter.class)
  public enum CommandEnum {
    BACKUP("backup");

    private String value;

    CommandEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CommandEnum fromValue(String value) {
      for (CommandEnum b : CommandEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CommandEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CommandEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CommandEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CommandEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private CommandEnum command;

  public static final String SERIALIZED_NAME_JOB_DATA = "job_data";
  @SerializedName(SERIALIZED_NAME_JOB_DATA)
  private BackupScheduleJobJobData jobData;

  public BackupScheduleJob() { 
  }

  public BackupScheduleJob command(CommandEnum command) {
    
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommandEnum getCommand() {
    return command;
  }


  public void setCommand(CommandEnum command) {
    this.command = command;
  }


  public BackupScheduleJob jobData(BackupScheduleJobJobData jobData) {
    
    this.jobData = jobData;
    return this;
  }

   /**
   * Get jobData
   * @return jobData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupScheduleJobJobData getJobData() {
    return jobData;
  }


  public void setJobData(BackupScheduleJobJobData jobData) {
    this.jobData = jobData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupScheduleJob backupScheduleJob = (BackupScheduleJob) o;
    return Objects.equals(this.command, backupScheduleJob.command) &&
        Objects.equals(this.jobData, backupScheduleJob.jobData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, jobData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupScheduleJob {\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    jobData: ").append(toIndentedString(jobData)).append("\n");
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
    openapiFields.add("command");
    openapiFields.add("job_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BackupScheduleJob
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BackupScheduleJob.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BackupScheduleJob is not found in the empty JSON string", BackupScheduleJob.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BackupScheduleJob.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BackupScheduleJob` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("command") != null && !jsonObj.get("command").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `command` to be a primitive type in the JSON string but got `%s`", jsonObj.get("command").toString()));
      }
      // validate the optional field `job_data`
      if (jsonObj.getAsJsonObject("job_data") != null) {
        BackupScheduleJobJobData.validateJsonObject(jsonObj.getAsJsonObject("job_data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BackupScheduleJob.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BackupScheduleJob' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BackupScheduleJob> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BackupScheduleJob.class));

       return (TypeAdapter<T>) new TypeAdapter<BackupScheduleJob>() {
           @Override
           public void write(JsonWriter out, BackupScheduleJob value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BackupScheduleJob read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BackupScheduleJob given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BackupScheduleJob
  * @throws IOException if the JSON string is invalid with respect to BackupScheduleJob
  */
  public static BackupScheduleJob fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BackupScheduleJob.class);
  }

 /**
  * Convert an instance of BackupScheduleJob to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
