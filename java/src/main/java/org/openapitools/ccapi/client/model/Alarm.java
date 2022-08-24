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
 * Alarm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T17:47:57.934643-04:00[America/New_York]")
public class Alarm {
  /**
   * Gets or Sets operation
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    GETSTATISTICS("getStatistics"),
    
    GETALARM("getAlarm"),
    
    GETALARMS("getAlarms"),
    
    IGNOREALARM("ignoreAlarm");

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

  public static final String SERIALIZED_NAME_ALARM_ID = "alarm_id";
  @SerializedName(SERIALIZED_NAME_ALARM_ID)
  private Integer alarmId;

  /**
   * Gets or Sets className
   */
  @JsonAdapter(ClassNameEnum.Adapter.class)
  public enum ClassNameEnum {
    CMONRPCREQUEST("CmonRpcRequest");

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

  public static final String SERIALIZED_NAME_IGNORE = "ignore";
  @SerializedName(SERIALIZED_NAME_IGNORE)
  private Boolean ignore;

  public Alarm() { 
  }

  public Alarm operation(OperationEnum operation) {
    
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


  public Alarm clusterId(Integer clusterId) {
    
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


  public Alarm alarmId(Integer alarmId) {
    
    this.alarmId = alarmId;
    return this;
  }

   /**
   * Get alarmId
   * @return alarmId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAlarmId() {
    return alarmId;
  }


  public void setAlarmId(Integer alarmId) {
    this.alarmId = alarmId;
  }


  public Alarm className(ClassNameEnum className) {
    
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


  public Alarm ignore(Boolean ignore) {
    
    this.ignore = ignore;
    return this;
  }

   /**
   * Get ignore
   * @return ignore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIgnore() {
    return ignore;
  }


  public void setIgnore(Boolean ignore) {
    this.ignore = ignore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alarm alarm = (Alarm) o;
    return Objects.equals(this.operation, alarm.operation) &&
        Objects.equals(this.clusterId, alarm.clusterId) &&
        Objects.equals(this.alarmId, alarm.alarmId) &&
        Objects.equals(this.className, alarm.className) &&
        Objects.equals(this.ignore, alarm.ignore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, clusterId, alarmId, className, ignore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alarm {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    ignore: ").append(toIndentedString(ignore)).append("\n");
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
    openapiFields.add("alarm_id");
    openapiFields.add("class_name");
    openapiFields.add("ignore");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operation");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Alarm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Alarm.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Alarm is not found in the empty JSON string", Alarm.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Alarm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Alarm` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Alarm.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      if (jsonObj.get("class_name") != null && !jsonObj.get("class_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Alarm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Alarm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Alarm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Alarm.class));

       return (TypeAdapter<T>) new TypeAdapter<Alarm>() {
           @Override
           public void write(JsonWriter out, Alarm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Alarm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Alarm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Alarm
  * @throws IOException if the JSON string is invalid with respect to Alarm
  */
  public static Alarm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Alarm.class);
  }

 /**
  * Convert an instance of Alarm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
