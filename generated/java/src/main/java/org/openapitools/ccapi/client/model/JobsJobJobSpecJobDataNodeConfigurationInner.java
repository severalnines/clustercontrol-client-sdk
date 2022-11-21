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
 * JobsJobJobSpecJobDataNodeConfigurationInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-21T15:50:08.265886-05:00[America/New_York]")
public class JobsJobJobSpecJobDataNodeConfigurationInner {
  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private String arguments;

  /**
   * Gets or Sets job
   */
  @JsonAdapter(JobEnum.Adapter.class)
  public enum JobEnum {
    NODE("node"),
    
    MYSQLD("mysqld"),
    
    MONGO("mongo");

    private String value;

    JobEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static JobEnum fromValue(String value) {
      for (JobEnum b : JobEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<JobEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final JobEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public JobEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return JobEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private JobEnum job;

  public static final String SERIALIZED_NAME_SCRAPE_INTERVAL = "scrape_interval";
  @SerializedName(SERIALIZED_NAME_SCRAPE_INTERVAL)
  private String scrapeInterval;

  public JobsJobJobSpecJobDataNodeConfigurationInner() {
  }

  public JobsJobJobSpecJobDataNodeConfigurationInner arguments(String arguments) {
    
    this.arguments = arguments;
    return this;
  }

   /**
   * Get arguments
   * @return arguments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getArguments() {
    return arguments;
  }


  public void setArguments(String arguments) {
    this.arguments = arguments;
  }


  public JobsJobJobSpecJobDataNodeConfigurationInner job(JobEnum job) {
    
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobEnum getJob() {
    return job;
  }


  public void setJob(JobEnum job) {
    this.job = job;
  }


  public JobsJobJobSpecJobDataNodeConfigurationInner scrapeInterval(String scrapeInterval) {
    
    this.scrapeInterval = scrapeInterval;
    return this;
  }

   /**
   * Get scrapeInterval
   * @return scrapeInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScrapeInterval() {
    return scrapeInterval;
  }


  public void setScrapeInterval(String scrapeInterval) {
    this.scrapeInterval = scrapeInterval;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobsJobJobSpecJobDataNodeConfigurationInner jobsJobJobSpecJobDataNodeConfigurationInner = (JobsJobJobSpecJobDataNodeConfigurationInner) o;
    return Objects.equals(this.arguments, jobsJobJobSpecJobDataNodeConfigurationInner.arguments) &&
        Objects.equals(this.job, jobsJobJobSpecJobDataNodeConfigurationInner.job) &&
        Objects.equals(this.scrapeInterval, jobsJobJobSpecJobDataNodeConfigurationInner.scrapeInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, job, scrapeInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobsJobJobSpecJobDataNodeConfigurationInner {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    scrapeInterval: ").append(toIndentedString(scrapeInterval)).append("\n");
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
    openapiFields.add("arguments");
    openapiFields.add("job");
    openapiFields.add("scrape_interval");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobsJobJobSpecJobDataNodeConfigurationInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobsJobJobSpecJobDataNodeConfigurationInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobsJobJobSpecJobDataNodeConfigurationInner is not found in the empty JSON string", JobsJobJobSpecJobDataNodeConfigurationInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JobsJobJobSpecJobDataNodeConfigurationInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobsJobJobSpecJobDataNodeConfigurationInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("arguments") != null && !jsonObj.get("arguments").isJsonNull()) && !jsonObj.get("arguments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arguments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arguments").toString()));
      }
      if ((jsonObj.get("job") != null && !jsonObj.get("job").isJsonNull()) && !jsonObj.get("job").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job").toString()));
      }
      if ((jsonObj.get("scrape_interval") != null && !jsonObj.get("scrape_interval").isJsonNull()) && !jsonObj.get("scrape_interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scrape_interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scrape_interval").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobsJobJobSpecJobDataNodeConfigurationInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobsJobJobSpecJobDataNodeConfigurationInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobsJobJobSpecJobDataNodeConfigurationInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobsJobJobSpecJobDataNodeConfigurationInner.class));

       return (TypeAdapter<T>) new TypeAdapter<JobsJobJobSpecJobDataNodeConfigurationInner>() {
           @Override
           public void write(JsonWriter out, JobsJobJobSpecJobDataNodeConfigurationInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobsJobJobSpecJobDataNodeConfigurationInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobsJobJobSpecJobDataNodeConfigurationInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobsJobJobSpecJobDataNodeConfigurationInner
  * @throws IOException if the JSON string is invalid with respect to JobsJobJobSpecJobDataNodeConfigurationInner
  */
  public static JobsJobJobSpecJobDataNodeConfigurationInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobsJobJobSpecJobDataNodeConfigurationInner.class);
  }

 /**
  * Convert an instance of JobsJobJobSpecJobDataNodeConfigurationInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

