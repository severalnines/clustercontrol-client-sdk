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
 * JobsJobJobSpecJobDataReplicaSetsInnerMembersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-21T15:50:08.265886-05:00[America/New_York]")
public class JobsJobJobSpecJobDataReplicaSetsInnerMembersInner {
  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_HOSTNAME_DATA = "hostname_data";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_DATA)
  private String hostnameData;

  public static final String SERIALIZED_NAME_HOSTNAME_INTERNAL = "hostname_internal";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_INTERNAL)
  private String hostnameInternal;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_ARBITER_ONLY = "arbiter_only";
  @SerializedName(SERIALIZED_NAME_ARBITER_ONLY)
  private Boolean arbiterOnly;

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  private Boolean hidden;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private String priority;

  public static final String SERIALIZED_NAME_SLAVE_DELAY = "slave_delay";
  @SerializedName(SERIALIZED_NAME_SLAVE_DELAY)
  private String slaveDelay;

  public JobsJobJobSpecJobDataReplicaSetsInnerMembersInner() {
  }

  public JobsJobJobSpecJobDataReplicaSetsInnerMembersInner hostname(String hostname) {
    
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


  public JobsJobJobSpecJobDataReplicaSetsInnerMembersInner hostnameData(String hostnameData) {
    
    this.hostnameData = hostnameData;
    return this;
  }

   /**
   * Get hostnameData
   * @return hostnameData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostnameData() {
    return hostnameData;
  }


  public void setHostnameData(String hostnameData) {
    this.hostnameData = hostnameData;
  }


  public JobsJobJobSpecJobDataReplicaSetsInnerMembersInner hostnameInternal(String hostnameInternal) {
    
    this.hostnameInternal = hostnameInternal;
    return this;
  }

   /**
   * Get hostnameInternal
   * @return hostnameInternal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostnameInternal() {
    return hostnameInternal;
  }


  public void setHostnameInternal(String hostnameInternal) {
    this.hostnameInternal = hostnameInternal;
  }


  public JobsJobJobSpecJobDataReplicaSetsInnerMembersInner port(String port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPort() {
    return port;
  }


  public void setPort(String port) {
    this.port = port;
  }


  public JobsJobJobSpecJobDataReplicaSetsInnerMembersInner arbiterOnly(Boolean arbiterOnly) {
    
    this.arbiterOnly = arbiterOnly;
    return this;
  }

   /**
   * Get arbiterOnly
   * @return arbiterOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getArbiterOnly() {
    return arbiterOnly;
  }


  public void setArbiterOnly(Boolean arbiterOnly) {
    this.arbiterOnly = arbiterOnly;
  }


  public JobsJobJobSpecJobDataReplicaSetsInnerMembersInner hidden(Boolean hidden) {
    
    this.hidden = hidden;
    return this;
  }

   /**
   * Get hidden
   * @return hidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHidden() {
    return hidden;
  }


  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  public JobsJobJobSpecJobDataReplicaSetsInnerMembersInner priority(String priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPriority() {
    return priority;
  }


  public void setPriority(String priority) {
    this.priority = priority;
  }


  public JobsJobJobSpecJobDataReplicaSetsInnerMembersInner slaveDelay(String slaveDelay) {
    
    this.slaveDelay = slaveDelay;
    return this;
  }

   /**
   * Get slaveDelay
   * @return slaveDelay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSlaveDelay() {
    return slaveDelay;
  }


  public void setSlaveDelay(String slaveDelay) {
    this.slaveDelay = slaveDelay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobsJobJobSpecJobDataReplicaSetsInnerMembersInner jobsJobJobSpecJobDataReplicaSetsInnerMembersInner = (JobsJobJobSpecJobDataReplicaSetsInnerMembersInner) o;
    return Objects.equals(this.hostname, jobsJobJobSpecJobDataReplicaSetsInnerMembersInner.hostname) &&
        Objects.equals(this.hostnameData, jobsJobJobSpecJobDataReplicaSetsInnerMembersInner.hostnameData) &&
        Objects.equals(this.hostnameInternal, jobsJobJobSpecJobDataReplicaSetsInnerMembersInner.hostnameInternal) &&
        Objects.equals(this.port, jobsJobJobSpecJobDataReplicaSetsInnerMembersInner.port) &&
        Objects.equals(this.arbiterOnly, jobsJobJobSpecJobDataReplicaSetsInnerMembersInner.arbiterOnly) &&
        Objects.equals(this.hidden, jobsJobJobSpecJobDataReplicaSetsInnerMembersInner.hidden) &&
        Objects.equals(this.priority, jobsJobJobSpecJobDataReplicaSetsInnerMembersInner.priority) &&
        Objects.equals(this.slaveDelay, jobsJobJobSpecJobDataReplicaSetsInnerMembersInner.slaveDelay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, hostnameData, hostnameInternal, port, arbiterOnly, hidden, priority, slaveDelay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobsJobJobSpecJobDataReplicaSetsInnerMembersInner {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    hostnameData: ").append(toIndentedString(hostnameData)).append("\n");
    sb.append("    hostnameInternal: ").append(toIndentedString(hostnameInternal)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    arbiterOnly: ").append(toIndentedString(arbiterOnly)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    slaveDelay: ").append(toIndentedString(slaveDelay)).append("\n");
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
    openapiFields.add("hostname_data");
    openapiFields.add("hostname_internal");
    openapiFields.add("port");
    openapiFields.add("arbiter_only");
    openapiFields.add("hidden");
    openapiFields.add("priority");
    openapiFields.add("slave_delay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobsJobJobSpecJobDataReplicaSetsInnerMembersInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobsJobJobSpecJobDataReplicaSetsInnerMembersInner is not found in the empty JSON string", JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobsJobJobSpecJobDataReplicaSetsInnerMembersInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      if ((jsonObj.get("hostname_data") != null && !jsonObj.get("hostname_data").isJsonNull()) && !jsonObj.get("hostname_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname_data").toString()));
      }
      if ((jsonObj.get("hostname_internal") != null && !jsonObj.get("hostname_internal").isJsonNull()) && !jsonObj.get("hostname_internal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname_internal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname_internal").toString()));
      }
      if ((jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) && !jsonObj.get("port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("port").toString()));
      }
      if ((jsonObj.get("priority") != null && !jsonObj.get("priority").isJsonNull()) && !jsonObj.get("priority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priority").toString()));
      }
      if ((jsonObj.get("slave_delay") != null && !jsonObj.get("slave_delay").isJsonNull()) && !jsonObj.get("slave_delay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slave_delay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slave_delay").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobsJobJobSpecJobDataReplicaSetsInnerMembersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobsJobJobSpecJobDataReplicaSetsInnerMembersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<JobsJobJobSpecJobDataReplicaSetsInnerMembersInner>() {
           @Override
           public void write(JsonWriter out, JobsJobJobSpecJobDataReplicaSetsInnerMembersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobsJobJobSpecJobDataReplicaSetsInnerMembersInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobsJobJobSpecJobDataReplicaSetsInnerMembersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobsJobJobSpecJobDataReplicaSetsInnerMembersInner
  * @throws IOException if the JSON string is invalid with respect to JobsJobJobSpecJobDataReplicaSetsInnerMembersInner
  */
  public static JobsJobJobSpecJobDataReplicaSetsInnerMembersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobsJobJobSpecJobDataReplicaSetsInnerMembersInner.class);
  }

 /**
  * Convert an instance of JobsJobJobSpecJobDataReplicaSetsInnerMembersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

