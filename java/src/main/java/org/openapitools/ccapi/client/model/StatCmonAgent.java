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
import org.openapitools.ccapi.client.model.StatCmonAgentRequestData;

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
 * StatCmonAgent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T17:47:57.934643-04:00[America/New_York]")
public class StatCmonAgent {
  /**
   * Gets or Sets operation
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    _CMONAGENT("/cmonagent");

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

  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  /**
   * Gets or Sets className
   */
  @JsonAdapter(ClassNameEnum.Adapter.class)
  public enum ClassNameEnum {
    CMNREQUEST("CmnRequest");

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

  public static final String SERIALIZED_NAME_CLASS_NAME = "className";
  @SerializedName(SERIALIZED_NAME_CLASS_NAME)
  private ClassNameEnum className;

  public static final String SERIALIZED_NAME_REQUEST_DATA = "requestData";
  @SerializedName(SERIALIZED_NAME_REQUEST_DATA)
  private StatCmonAgentRequestData requestData;

  public StatCmonAgent() { 
  }

  public StatCmonAgent operation(OperationEnum operation) {
    
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


  public StatCmonAgent apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public StatCmonAgent className(ClassNameEnum className) {
    
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


  public StatCmonAgent requestData(StatCmonAgentRequestData requestData) {
    
    this.requestData = requestData;
    return this;
  }

   /**
   * Get requestData
   * @return requestData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatCmonAgentRequestData getRequestData() {
    return requestData;
  }


  public void setRequestData(StatCmonAgentRequestData requestData) {
    this.requestData = requestData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatCmonAgent statCmonAgent = (StatCmonAgent) o;
    return Objects.equals(this.operation, statCmonAgent.operation) &&
        Objects.equals(this.apiKey, statCmonAgent.apiKey) &&
        Objects.equals(this.className, statCmonAgent.className) &&
        Objects.equals(this.requestData, statCmonAgent.requestData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, apiKey, className, requestData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatCmonAgent {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    requestData: ").append(toIndentedString(requestData)).append("\n");
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
    openapiFields.add("apiKey");
    openapiFields.add("className");
    openapiFields.add("requestData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operation");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatCmonAgent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StatCmonAgent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatCmonAgent is not found in the empty JSON string", StatCmonAgent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StatCmonAgent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatCmonAgent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StatCmonAgent.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      if (jsonObj.get("apiKey") != null && !jsonObj.get("apiKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiKey").toString()));
      }
      if (jsonObj.get("className") != null && !jsonObj.get("className").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `className` to be a primitive type in the JSON string but got `%s`", jsonObj.get("className").toString()));
      }
      // validate the optional field `requestData`
      if (jsonObj.getAsJsonObject("requestData") != null) {
        StatCmonAgentRequestData.validateJsonObject(jsonObj.getAsJsonObject("requestData"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatCmonAgent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatCmonAgent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatCmonAgent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatCmonAgent.class));

       return (TypeAdapter<T>) new TypeAdapter<StatCmonAgent>() {
           @Override
           public void write(JsonWriter out, StatCmonAgent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatCmonAgent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StatCmonAgent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatCmonAgent
  * @throws IOException if the JSON string is invalid with respect to StatCmonAgent
  */
  public static StatCmonAgent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatCmonAgent.class);
  }

 /**
  * Convert an instance of StatCmonAgent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
