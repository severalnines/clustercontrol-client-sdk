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
 * DiscoveryJobJobSpecJobDataNodesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-28T20:03:34.941519-05:00[America/New_York]")
public class DiscoveryJobJobSpecJobDataNodesInner {
  /**
   * Gets or Sets className
   */
  @JsonAdapter(ClassNameEnum.Adapter.class)
  public enum ClassNameEnum {
    CMONHOST("CmonHost");

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

  public static final String SERIALIZED_NAME_HOST_NAME = "host_name";
  @SerializedName(SERIALIZED_NAME_HOST_NAME)
  private String hostName;

  public DiscoveryJobJobSpecJobDataNodesInner() {
  }

  public DiscoveryJobJobSpecJobDataNodesInner className(ClassNameEnum className) {
    
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


  public DiscoveryJobJobSpecJobDataNodesInner hostName(String hostName) {
    
    this.hostName = hostName;
    return this;
  }

   /**
   * IP address or Hostname
   * @return hostName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IP address or Hostname")

  public String getHostName() {
    return hostName;
  }


  public void setHostName(String hostName) {
    this.hostName = hostName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoveryJobJobSpecJobDataNodesInner discoveryJobJobSpecJobDataNodesInner = (DiscoveryJobJobSpecJobDataNodesInner) o;
    return Objects.equals(this.className, discoveryJobJobSpecJobDataNodesInner.className) &&
        Objects.equals(this.hostName, discoveryJobJobSpecJobDataNodesInner.hostName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, hostName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoveryJobJobSpecJobDataNodesInner {\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
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
    openapiFields.add("host_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DiscoveryJobJobSpecJobDataNodesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DiscoveryJobJobSpecJobDataNodesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DiscoveryJobJobSpecJobDataNodesInner is not found in the empty JSON string", DiscoveryJobJobSpecJobDataNodesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DiscoveryJobJobSpecJobDataNodesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DiscoveryJobJobSpecJobDataNodesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("class_name") != null && !jsonObj.get("class_name").isJsonNull()) && !jsonObj.get("class_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class_name").toString()));
      }
      if ((jsonObj.get("host_name") != null && !jsonObj.get("host_name").isJsonNull()) && !jsonObj.get("host_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiscoveryJobJobSpecJobDataNodesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiscoveryJobJobSpecJobDataNodesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiscoveryJobJobSpecJobDataNodesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiscoveryJobJobSpecJobDataNodesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DiscoveryJobJobSpecJobDataNodesInner>() {
           @Override
           public void write(JsonWriter out, DiscoveryJobJobSpecJobDataNodesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiscoveryJobJobSpecJobDataNodesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DiscoveryJobJobSpecJobDataNodesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiscoveryJobJobSpecJobDataNodesInner
  * @throws IOException if the JSON string is invalid with respect to DiscoveryJobJobSpecJobDataNodesInner
  */
  public static DiscoveryJobJobSpecJobDataNodesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiscoveryJobJobSpecJobDataNodesInner.class);
  }

 /**
  * Convert an instance of DiscoveryJobJobSpecJobDataNodesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

