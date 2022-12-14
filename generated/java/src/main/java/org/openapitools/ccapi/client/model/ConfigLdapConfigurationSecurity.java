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
 * ConfigLdapConfigurationSecurity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-28T20:03:34.941519-05:00[America/New_York]")
public class ConfigLdapConfigurationSecurity {
  public static final String SERIALIZED_NAME_CA_CERT_FILE = "caCertFile";
  @SerializedName(SERIALIZED_NAME_CA_CERT_FILE)
  private String caCertFile;

  public static final String SERIALIZED_NAME_CERT_FILE = "certFile";
  @SerializedName(SERIALIZED_NAME_CERT_FILE)
  private String certFile;

  public static final String SERIALIZED_NAME_KEY_FILE = "keyFile";
  @SerializedName(SERIALIZED_NAME_KEY_FILE)
  private String keyFile;

  public ConfigLdapConfigurationSecurity() {
  }

  public ConfigLdapConfigurationSecurity caCertFile(String caCertFile) {
    
    this.caCertFile = caCertFile;
    return this;
  }

   /**
   * Get caCertFile
   * @return caCertFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCaCertFile() {
    return caCertFile;
  }


  public void setCaCertFile(String caCertFile) {
    this.caCertFile = caCertFile;
  }


  public ConfigLdapConfigurationSecurity certFile(String certFile) {
    
    this.certFile = certFile;
    return this;
  }

   /**
   * Get certFile
   * @return certFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertFile() {
    return certFile;
  }


  public void setCertFile(String certFile) {
    this.certFile = certFile;
  }


  public ConfigLdapConfigurationSecurity keyFile(String keyFile) {
    
    this.keyFile = keyFile;
    return this;
  }

   /**
   * Get keyFile
   * @return keyFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyFile() {
    return keyFile;
  }


  public void setKeyFile(String keyFile) {
    this.keyFile = keyFile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigLdapConfigurationSecurity configLdapConfigurationSecurity = (ConfigLdapConfigurationSecurity) o;
    return Objects.equals(this.caCertFile, configLdapConfigurationSecurity.caCertFile) &&
        Objects.equals(this.certFile, configLdapConfigurationSecurity.certFile) &&
        Objects.equals(this.keyFile, configLdapConfigurationSecurity.keyFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caCertFile, certFile, keyFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigLdapConfigurationSecurity {\n");
    sb.append("    caCertFile: ").append(toIndentedString(caCertFile)).append("\n");
    sb.append("    certFile: ").append(toIndentedString(certFile)).append("\n");
    sb.append("    keyFile: ").append(toIndentedString(keyFile)).append("\n");
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
    openapiFields.add("caCertFile");
    openapiFields.add("certFile");
    openapiFields.add("keyFile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConfigLdapConfigurationSecurity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConfigLdapConfigurationSecurity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigLdapConfigurationSecurity is not found in the empty JSON string", ConfigLdapConfigurationSecurity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConfigLdapConfigurationSecurity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigLdapConfigurationSecurity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("caCertFile") != null && !jsonObj.get("caCertFile").isJsonNull()) && !jsonObj.get("caCertFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caCertFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caCertFile").toString()));
      }
      if ((jsonObj.get("certFile") != null && !jsonObj.get("certFile").isJsonNull()) && !jsonObj.get("certFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certFile").toString()));
      }
      if ((jsonObj.get("keyFile") != null && !jsonObj.get("keyFile").isJsonNull()) && !jsonObj.get("keyFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyFile").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigLdapConfigurationSecurity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigLdapConfigurationSecurity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigLdapConfigurationSecurity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigLdapConfigurationSecurity.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigLdapConfigurationSecurity>() {
           @Override
           public void write(JsonWriter out, ConfigLdapConfigurationSecurity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigLdapConfigurationSecurity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigLdapConfigurationSecurity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigLdapConfigurationSecurity
  * @throws IOException if the JSON string is invalid with respect to ConfigLdapConfigurationSecurity
  */
  public static ConfigLdapConfigurationSecurity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigLdapConfigurationSecurity.class);
  }

 /**
  * Convert an instance of ConfigLdapConfigurationSecurity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

