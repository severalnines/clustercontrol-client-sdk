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
 * DiscoverySshCredentials
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-28T20:03:34.941519-05:00[America/New_York]")
public class DiscoverySshCredentials {
  public static final String SERIALIZED_NAME_CLASS_NAME = "class_name";
  @SerializedName(SERIALIZED_NAME_CLASS_NAME)
  private String className;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_SSH_KEYFILE = "ssh_keyfile";
  @SerializedName(SERIALIZED_NAME_SSH_KEYFILE)
  private String sshKeyfile;

  public DiscoverySshCredentials() {
  }

  public DiscoverySshCredentials className(String className) {
    
    this.className = className;
    return this;
  }

   /**
   * Get className
   * @return className
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClassName() {
    return className;
  }


  public void setClassName(String className) {
    this.className = className;
  }


  public DiscoverySshCredentials userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }


  public DiscoverySshCredentials password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public DiscoverySshCredentials sshKeyfile(String sshKeyfile) {
    
    this.sshKeyfile = sshKeyfile;
    return this;
  }

   /**
   * Get sshKeyfile
   * @return sshKeyfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSshKeyfile() {
    return sshKeyfile;
  }


  public void setSshKeyfile(String sshKeyfile) {
    this.sshKeyfile = sshKeyfile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoverySshCredentials discoverySshCredentials = (DiscoverySshCredentials) o;
    return Objects.equals(this.className, discoverySshCredentials.className) &&
        Objects.equals(this.userName, discoverySshCredentials.userName) &&
        Objects.equals(this.password, discoverySshCredentials.password) &&
        Objects.equals(this.sshKeyfile, discoverySshCredentials.sshKeyfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, userName, password, sshKeyfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoverySshCredentials {\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sshKeyfile: ").append(toIndentedString(sshKeyfile)).append("\n");
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
    openapiFields.add("user_name");
    openapiFields.add("password");
    openapiFields.add("ssh_keyfile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DiscoverySshCredentials
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DiscoverySshCredentials.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DiscoverySshCredentials is not found in the empty JSON string", DiscoverySshCredentials.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DiscoverySshCredentials.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DiscoverySshCredentials` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("class_name") != null && !jsonObj.get("class_name").isJsonNull()) && !jsonObj.get("class_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class_name").toString()));
      }
      if ((jsonObj.get("user_name") != null && !jsonObj.get("user_name").isJsonNull()) && !jsonObj.get("user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_name").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("ssh_keyfile") != null && !jsonObj.get("ssh_keyfile").isJsonNull()) && !jsonObj.get("ssh_keyfile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssh_keyfile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssh_keyfile").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiscoverySshCredentials.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiscoverySshCredentials' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiscoverySshCredentials> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiscoverySshCredentials.class));

       return (TypeAdapter<T>) new TypeAdapter<DiscoverySshCredentials>() {
           @Override
           public void write(JsonWriter out, DiscoverySshCredentials value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiscoverySshCredentials read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DiscoverySshCredentials given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiscoverySshCredentials
  * @throws IOException if the JSON string is invalid with respect to DiscoverySshCredentials
  */
  public static DiscoverySshCredentials fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiscoverySshCredentials.class);
  }

 /**
  * Convert an instance of DiscoverySshCredentials to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

