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
 * JobsJobJobSpecJobDataNodeAdressesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-28T20:03:34.941519-05:00[America/New_York]")
public class JobsJobJobSpecJobDataNodeAdressesInner {
  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_MAX_CONNECTION = "max_connection";
  @SerializedName(SERIALIZED_NAME_MAX_CONNECTION)
  private Integer maxConnection;

  public static final String SERIALIZED_NAME_MAX_REPLICATION_LAG = "max_replication_lag";
  @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_LAG)
  private Integer maxReplicationLag;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;

  public JobsJobJobSpecJobDataNodeAdressesInner() {
  }

  public JobsJobJobSpecJobDataNodeAdressesInner hostname(String hostname) {
    
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


  public JobsJobJobSpecJobDataNodeAdressesInner maxConnection(Integer maxConnection) {
    
    this.maxConnection = maxConnection;
    return this;
  }

   /**
   * Get maxConnection
   * @return maxConnection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxConnection() {
    return maxConnection;
  }


  public void setMaxConnection(Integer maxConnection) {
    this.maxConnection = maxConnection;
  }


  public JobsJobJobSpecJobDataNodeAdressesInner maxReplicationLag(Integer maxReplicationLag) {
    
    this.maxReplicationLag = maxReplicationLag;
    return this;
  }

   /**
   * Get maxReplicationLag
   * @return maxReplicationLag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxReplicationLag() {
    return maxReplicationLag;
  }


  public void setMaxReplicationLag(Integer maxReplicationLag) {
    this.maxReplicationLag = maxReplicationLag;
  }


  public JobsJobJobSpecJobDataNodeAdressesInner port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public JobsJobJobSpecJobDataNodeAdressesInner weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobsJobJobSpecJobDataNodeAdressesInner jobsJobJobSpecJobDataNodeAdressesInner = (JobsJobJobSpecJobDataNodeAdressesInner) o;
    return Objects.equals(this.hostname, jobsJobJobSpecJobDataNodeAdressesInner.hostname) &&
        Objects.equals(this.maxConnection, jobsJobJobSpecJobDataNodeAdressesInner.maxConnection) &&
        Objects.equals(this.maxReplicationLag, jobsJobJobSpecJobDataNodeAdressesInner.maxReplicationLag) &&
        Objects.equals(this.port, jobsJobJobSpecJobDataNodeAdressesInner.port) &&
        Objects.equals(this.weight, jobsJobJobSpecJobDataNodeAdressesInner.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, maxConnection, maxReplicationLag, port, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobsJobJobSpecJobDataNodeAdressesInner {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    maxConnection: ").append(toIndentedString(maxConnection)).append("\n");
    sb.append("    maxReplicationLag: ").append(toIndentedString(maxReplicationLag)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
    openapiFields.add("hostname");
    openapiFields.add("max_connection");
    openapiFields.add("max_replication_lag");
    openapiFields.add("port");
    openapiFields.add("weight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobsJobJobSpecJobDataNodeAdressesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobsJobJobSpecJobDataNodeAdressesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobsJobJobSpecJobDataNodeAdressesInner is not found in the empty JSON string", JobsJobJobSpecJobDataNodeAdressesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JobsJobJobSpecJobDataNodeAdressesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobsJobJobSpecJobDataNodeAdressesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobsJobJobSpecJobDataNodeAdressesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobsJobJobSpecJobDataNodeAdressesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobsJobJobSpecJobDataNodeAdressesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobsJobJobSpecJobDataNodeAdressesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<JobsJobJobSpecJobDataNodeAdressesInner>() {
           @Override
           public void write(JsonWriter out, JobsJobJobSpecJobDataNodeAdressesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobsJobJobSpecJobDataNodeAdressesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobsJobJobSpecJobDataNodeAdressesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobsJobJobSpecJobDataNodeAdressesInner
  * @throws IOException if the JSON string is invalid with respect to JobsJobJobSpecJobDataNodeAdressesInner
  */
  public static JobsJobJobSpecJobDataNodeAdressesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobsJobJobSpecJobDataNodeAdressesInner.class);
  }

 /**
  * Convert an instance of JobsJobJobSpecJobDataNodeAdressesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

