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
 * HostServersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-28T20:03:34.941519-05:00[America/New_York]")
public class HostServersInner {
  /**
   * Gets or Sets className
   */
  @JsonAdapter(ClassNameEnum.Adapter.class)
  public enum ClassNameEnum {
    CMONCONTAINERSERVER("CmonContainerServer");

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

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_CDT_PATH = "cdt_path";
  @SerializedName(SERIALIZED_NAME_CDT_PATH)
  private String cdtPath;

  public HostServersInner() {
  }

  public HostServersInner className(ClassNameEnum className) {
    
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


  public HostServersInner hostname(String hostname) {
    
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


  public HostServersInner cdtPath(String cdtPath) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostServersInner hostServersInner = (HostServersInner) o;
    return Objects.equals(this.className, hostServersInner.className) &&
        Objects.equals(this.hostname, hostServersInner.hostname) &&
        Objects.equals(this.cdtPath, hostServersInner.cdtPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, hostname, cdtPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostServersInner {\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    cdtPath: ").append(toIndentedString(cdtPath)).append("\n");
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
    openapiFields.add("hostname");
    openapiFields.add("cdt_path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HostServersInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HostServersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HostServersInner is not found in the empty JSON string", HostServersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HostServersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HostServersInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("class_name") != null && !jsonObj.get("class_name").isJsonNull()) && !jsonObj.get("class_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class_name").toString()));
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      if ((jsonObj.get("cdt_path") != null && !jsonObj.get("cdt_path").isJsonNull()) && !jsonObj.get("cdt_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cdt_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cdt_path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HostServersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HostServersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HostServersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HostServersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<HostServersInner>() {
           @Override
           public void write(JsonWriter out, HostServersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HostServersInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HostServersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HostServersInner
  * @throws IOException if the JSON string is invalid with respect to HostServersInner
  */
  public static HostServersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HostServersInner.class);
  }

 /**
  * Convert an instance of HostServersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

