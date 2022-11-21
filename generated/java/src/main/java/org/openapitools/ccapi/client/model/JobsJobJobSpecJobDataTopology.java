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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
 * JobsJobJobSpecJobDataTopology
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-21T11:54:25.905584-05:00[America/New_York]")
public class JobsJobJobSpecJobDataTopology {
  public static final String SERIALIZED_NAME_MASTER_SLAVE_LINKS = "master_slave_links";
  @SerializedName(SERIALIZED_NAME_MASTER_SLAVE_LINKS)
  private List<Map<String, String>> masterSlaveLinks = null;

  public JobsJobJobSpecJobDataTopology() {
  }

  public JobsJobJobSpecJobDataTopology masterSlaveLinks(List<Map<String, String>> masterSlaveLinks) {
    
    this.masterSlaveLinks = masterSlaveLinks;
    return this;
  }

  public JobsJobJobSpecJobDataTopology addMasterSlaveLinksItem(Map<String, String> masterSlaveLinksItem) {
    if (this.masterSlaveLinks == null) {
      this.masterSlaveLinks = new ArrayList<>();
    }
    this.masterSlaveLinks.add(masterSlaveLinksItem);
    return this;
  }

   /**
   * Get masterSlaveLinks
   * @return masterSlaveLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Map<String, String>> getMasterSlaveLinks() {
    return masterSlaveLinks;
  }


  public void setMasterSlaveLinks(List<Map<String, String>> masterSlaveLinks) {
    this.masterSlaveLinks = masterSlaveLinks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobsJobJobSpecJobDataTopology jobsJobJobSpecJobDataTopology = (JobsJobJobSpecJobDataTopology) o;
    return Objects.equals(this.masterSlaveLinks, jobsJobJobSpecJobDataTopology.masterSlaveLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(masterSlaveLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobsJobJobSpecJobDataTopology {\n");
    sb.append("    masterSlaveLinks: ").append(toIndentedString(masterSlaveLinks)).append("\n");
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
    openapiFields.add("master_slave_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobsJobJobSpecJobDataTopology
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobsJobJobSpecJobDataTopology.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobsJobJobSpecJobDataTopology is not found in the empty JSON string", JobsJobJobSpecJobDataTopology.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JobsJobJobSpecJobDataTopology.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobsJobJobSpecJobDataTopology` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("master_slave_links") != null && !jsonObj.get("master_slave_links").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `master_slave_links` to be an array in the JSON string but got `%s`", jsonObj.get("master_slave_links").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobsJobJobSpecJobDataTopology.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobsJobJobSpecJobDataTopology' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobsJobJobSpecJobDataTopology> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobsJobJobSpecJobDataTopology.class));

       return (TypeAdapter<T>) new TypeAdapter<JobsJobJobSpecJobDataTopology>() {
           @Override
           public void write(JsonWriter out, JobsJobJobSpecJobDataTopology value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobsJobJobSpecJobDataTopology read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobsJobJobSpecJobDataTopology given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobsJobJobSpecJobDataTopology
  * @throws IOException if the JSON string is invalid with respect to JobsJobJobSpecJobDataTopology
  */
  public static JobsJobJobSpecJobDataTopology fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobsJobJobSpecJobDataTopology.class);
  }

 /**
  * Convert an instance of JobsJobJobSpecJobDataTopology to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

