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
 * StatCmonAgentRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-21T15:50:08.265886-05:00[America/New_York]")
public class StatCmonAgentRequestData {
  public static final String SERIALIZED_NAME_BEGIN = "begin";
  @SerializedName(SERIALIZED_NAME_BEGIN)
  private String begin;

  /**
   * Gets or Sets className
   */
  @JsonAdapter(ClassNameEnum.Adapter.class)
  public enum ClassNameEnum {
    CMNREADPARAM("CmnReadParam");

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

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private String end;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  public static final String SERIALIZED_NAME_OBJECT_NAME = "objectName";
  @SerializedName(SERIALIZED_NAME_OBJECT_NAME)
  private String objectName;

  /**
   * Gets or Sets origin
   */
  @JsonAdapter(OriginEnum.Adapter.class)
  public enum OriginEnum {
    TIMELINE("timeline");

    private String value;

    OriginEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OriginEnum fromValue(String value) {
      for (OriginEnum b : OriginEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OriginEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OriginEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OriginEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OriginEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private OriginEnum origin;

  public StatCmonAgentRequestData() {
  }

  public StatCmonAgentRequestData begin(String begin) {
    
    this.begin = begin;
    return this;
  }

   /**
   * e.g. \&quot;2021-06-07T09:41:43.636Z\&quot;
   * @return begin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "e.g. \"2021-06-07T09:41:43.636Z\"")

  public String getBegin() {
    return begin;
  }


  public void setBegin(String begin) {
    this.begin = begin;
  }


  public StatCmonAgentRequestData className(ClassNameEnum className) {
    
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


  public StatCmonAgentRequestData end(String end) {
    
    this.end = end;
    return this;
  }

   /**
   * e.g. \&quot;2021-06-07T09:41:43.636Z\&quot;
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "e.g. \"2021-06-07T09:41:43.636Z\"")

  public String getEnd() {
    return end;
  }


  public void setEnd(String end) {
    this.end = end;
  }


  public StatCmonAgentRequestData limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public StatCmonAgentRequestData mimeType(String mimeType) {
    
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMimeType() {
    return mimeType;
  }


  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public StatCmonAgentRequestData objectName(String objectName) {
    
    this.objectName = objectName;
    return this;
  }

   /**
   * Get objectName
   * @return objectName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectName() {
    return objectName;
  }


  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }


  public StatCmonAgentRequestData origin(OriginEnum origin) {
    
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OriginEnum getOrigin() {
    return origin;
  }


  public void setOrigin(OriginEnum origin) {
    this.origin = origin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatCmonAgentRequestData statCmonAgentRequestData = (StatCmonAgentRequestData) o;
    return Objects.equals(this.begin, statCmonAgentRequestData.begin) &&
        Objects.equals(this.className, statCmonAgentRequestData.className) &&
        Objects.equals(this.end, statCmonAgentRequestData.end) &&
        Objects.equals(this.limit, statCmonAgentRequestData.limit) &&
        Objects.equals(this.mimeType, statCmonAgentRequestData.mimeType) &&
        Objects.equals(this.objectName, statCmonAgentRequestData.objectName) &&
        Objects.equals(this.origin, statCmonAgentRequestData.origin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(begin, className, end, limit, mimeType, objectName, origin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatCmonAgentRequestData {\n");
    sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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
    openapiFields.add("begin");
    openapiFields.add("className");
    openapiFields.add("end");
    openapiFields.add("limit");
    openapiFields.add("mimeType");
    openapiFields.add("objectName");
    openapiFields.add("origin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatCmonAgentRequestData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StatCmonAgentRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatCmonAgentRequestData is not found in the empty JSON string", StatCmonAgentRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StatCmonAgentRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatCmonAgentRequestData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("begin") != null && !jsonObj.get("begin").isJsonNull()) && !jsonObj.get("begin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `begin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("begin").toString()));
      }
      if ((jsonObj.get("className") != null && !jsonObj.get("className").isJsonNull()) && !jsonObj.get("className").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `className` to be a primitive type in the JSON string but got `%s`", jsonObj.get("className").toString()));
      }
      if ((jsonObj.get("end") != null && !jsonObj.get("end").isJsonNull()) && !jsonObj.get("end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end").toString()));
      }
      if ((jsonObj.get("mimeType") != null && !jsonObj.get("mimeType").isJsonNull()) && !jsonObj.get("mimeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mimeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mimeType").toString()));
      }
      if ((jsonObj.get("objectName") != null && !jsonObj.get("objectName").isJsonNull()) && !jsonObj.get("objectName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectName").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatCmonAgentRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatCmonAgentRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatCmonAgentRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatCmonAgentRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<StatCmonAgentRequestData>() {
           @Override
           public void write(JsonWriter out, StatCmonAgentRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatCmonAgentRequestData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StatCmonAgentRequestData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatCmonAgentRequestData
  * @throws IOException if the JSON string is invalid with respect to StatCmonAgentRequestData
  */
  public static StatCmonAgentRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatCmonAgentRequestData.class);
  }

 /**
  * Convert an instance of StatCmonAgentRequestData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

