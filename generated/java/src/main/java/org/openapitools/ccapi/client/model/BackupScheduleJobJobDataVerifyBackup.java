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
 * BackupScheduleJobJobDataVerifyBackup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-21T11:54:25.905584-05:00[America/New_York]")
public class BackupScheduleJobJobDataVerifyBackup {
  public static final String SERIALIZED_NAME_DISABLE_FIREWALL = "disable_firewall";
  @SerializedName(SERIALIZED_NAME_DISABLE_FIREWALL)
  private Boolean disableFirewall;

  public static final String SERIALIZED_NAME_DISABLE_SELINUX = "disable_selinux";
  @SerializedName(SERIALIZED_NAME_DISABLE_SELINUX)
  private Boolean disableSelinux;

  public static final String SERIALIZED_NAME_INSTALL_SOFTWARE = "install_software";
  @SerializedName(SERIALIZED_NAME_INSTALL_SOFTWARE)
  private Boolean installSoftware;

  public static final String SERIALIZED_NAME_SERVER_ADDRESS = "server_address";
  @SerializedName(SERIALIZED_NAME_SERVER_ADDRESS)
  private String serverAddress;

  public static final String SERIALIZED_NAME_TERMINATE_DB_SERVER = "terminate_db_server";
  @SerializedName(SERIALIZED_NAME_TERMINATE_DB_SERVER)
  private Boolean terminateDbServer;

  public BackupScheduleJobJobDataVerifyBackup() {
  }

  public BackupScheduleJobJobDataVerifyBackup disableFirewall(Boolean disableFirewall) {
    
    this.disableFirewall = disableFirewall;
    return this;
  }

   /**
   * Get disableFirewall
   * @return disableFirewall
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisableFirewall() {
    return disableFirewall;
  }


  public void setDisableFirewall(Boolean disableFirewall) {
    this.disableFirewall = disableFirewall;
  }


  public BackupScheduleJobJobDataVerifyBackup disableSelinux(Boolean disableSelinux) {
    
    this.disableSelinux = disableSelinux;
    return this;
  }

   /**
   * Get disableSelinux
   * @return disableSelinux
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisableSelinux() {
    return disableSelinux;
  }


  public void setDisableSelinux(Boolean disableSelinux) {
    this.disableSelinux = disableSelinux;
  }


  public BackupScheduleJobJobDataVerifyBackup installSoftware(Boolean installSoftware) {
    
    this.installSoftware = installSoftware;
    return this;
  }

   /**
   * Get installSoftware
   * @return installSoftware
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInstallSoftware() {
    return installSoftware;
  }


  public void setInstallSoftware(Boolean installSoftware) {
    this.installSoftware = installSoftware;
  }


  public BackupScheduleJobJobDataVerifyBackup serverAddress(String serverAddress) {
    
    this.serverAddress = serverAddress;
    return this;
  }

   /**
   * Get serverAddress
   * @return serverAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServerAddress() {
    return serverAddress;
  }


  public void setServerAddress(String serverAddress) {
    this.serverAddress = serverAddress;
  }


  public BackupScheduleJobJobDataVerifyBackup terminateDbServer(Boolean terminateDbServer) {
    
    this.terminateDbServer = terminateDbServer;
    return this;
  }

   /**
   * Get terminateDbServer
   * @return terminateDbServer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTerminateDbServer() {
    return terminateDbServer;
  }


  public void setTerminateDbServer(Boolean terminateDbServer) {
    this.terminateDbServer = terminateDbServer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupScheduleJobJobDataVerifyBackup backupScheduleJobJobDataVerifyBackup = (BackupScheduleJobJobDataVerifyBackup) o;
    return Objects.equals(this.disableFirewall, backupScheduleJobJobDataVerifyBackup.disableFirewall) &&
        Objects.equals(this.disableSelinux, backupScheduleJobJobDataVerifyBackup.disableSelinux) &&
        Objects.equals(this.installSoftware, backupScheduleJobJobDataVerifyBackup.installSoftware) &&
        Objects.equals(this.serverAddress, backupScheduleJobJobDataVerifyBackup.serverAddress) &&
        Objects.equals(this.terminateDbServer, backupScheduleJobJobDataVerifyBackup.terminateDbServer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableFirewall, disableSelinux, installSoftware, serverAddress, terminateDbServer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupScheduleJobJobDataVerifyBackup {\n");
    sb.append("    disableFirewall: ").append(toIndentedString(disableFirewall)).append("\n");
    sb.append("    disableSelinux: ").append(toIndentedString(disableSelinux)).append("\n");
    sb.append("    installSoftware: ").append(toIndentedString(installSoftware)).append("\n");
    sb.append("    serverAddress: ").append(toIndentedString(serverAddress)).append("\n");
    sb.append("    terminateDbServer: ").append(toIndentedString(terminateDbServer)).append("\n");
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
    openapiFields.add("disable_firewall");
    openapiFields.add("disable_selinux");
    openapiFields.add("install_software");
    openapiFields.add("server_address");
    openapiFields.add("terminate_db_server");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BackupScheduleJobJobDataVerifyBackup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BackupScheduleJobJobDataVerifyBackup.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BackupScheduleJobJobDataVerifyBackup is not found in the empty JSON string", BackupScheduleJobJobDataVerifyBackup.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BackupScheduleJobJobDataVerifyBackup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BackupScheduleJobJobDataVerifyBackup` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("server_address") != null && !jsonObj.get("server_address").isJsonNull()) && !jsonObj.get("server_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server_address").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BackupScheduleJobJobDataVerifyBackup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BackupScheduleJobJobDataVerifyBackup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BackupScheduleJobJobDataVerifyBackup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BackupScheduleJobJobDataVerifyBackup.class));

       return (TypeAdapter<T>) new TypeAdapter<BackupScheduleJobJobDataVerifyBackup>() {
           @Override
           public void write(JsonWriter out, BackupScheduleJobJobDataVerifyBackup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BackupScheduleJobJobDataVerifyBackup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BackupScheduleJobJobDataVerifyBackup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BackupScheduleJobJobDataVerifyBackup
  * @throws IOException if the JSON string is invalid with respect to BackupScheduleJobJobDataVerifyBackup
  */
  public static BackupScheduleJobJobDataVerifyBackup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BackupScheduleJobJobDataVerifyBackup.class);
  }

 /**
  * Convert an instance of BackupScheduleJobJobDataVerifyBackup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

