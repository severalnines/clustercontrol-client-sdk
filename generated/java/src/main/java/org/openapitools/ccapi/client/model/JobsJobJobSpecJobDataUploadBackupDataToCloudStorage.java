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
 * JobsJobJobSpecJobDataUploadBackupDataToCloudStorage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-28T20:03:34.941519-05:00[America/New_York]")
public class JobsJobJobSpecJobDataUploadBackupDataToCloudStorage {
  public static final String SERIALIZED_NAME_BACKUP_RETENTION = "backup_retention";
  @SerializedName(SERIALIZED_NAME_BACKUP_RETENTION)
  private Integer backupRetention;

  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private String bucket;

  public static final String SERIALIZED_NAME_CLOUD_STORAGE_CREDENTIALS_ID = "cloud_storage_credentials_id";
  @SerializedName(SERIALIZED_NAME_CLOUD_STORAGE_CREDENTIALS_ID)
  private Integer cloudStorageCredentialsId;

  public static final String SERIALIZED_NAME_CLOUD_STORAGE_PROVIDER = "cloud_storage_provider";
  @SerializedName(SERIALIZED_NAME_CLOUD_STORAGE_PROVIDER)
  private String cloudStorageProvider;

  public static final String SERIALIZED_NAME_CLOUD_STORAGE_SERVICE = "cloud_storage_service";
  @SerializedName(SERIALIZED_NAME_CLOUD_STORAGE_SERVICE)
  private String cloudStorageService;

  public static final String SERIALIZED_NAME_DELETE_AFTER_UPLOAD = "delete_after_upload";
  @SerializedName(SERIALIZED_NAME_DELETE_AFTER_UPLOAD)
  private Boolean deleteAfterUpload;

  public JobsJobJobSpecJobDataUploadBackupDataToCloudStorage() {
  }

  public JobsJobJobSpecJobDataUploadBackupDataToCloudStorage backupRetention(Integer backupRetention) {
    
    this.backupRetention = backupRetention;
    return this;
  }

   /**
   * Get backupRetention
   * @return backupRetention
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBackupRetention() {
    return backupRetention;
  }


  public void setBackupRetention(Integer backupRetention) {
    this.backupRetention = backupRetention;
  }


  public JobsJobJobSpecJobDataUploadBackupDataToCloudStorage bucket(String bucket) {
    
    this.bucket = bucket;
    return this;
  }

   /**
   * Get bucket
   * @return bucket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBucket() {
    return bucket;
  }


  public void setBucket(String bucket) {
    this.bucket = bucket;
  }


  public JobsJobJobSpecJobDataUploadBackupDataToCloudStorage cloudStorageCredentialsId(Integer cloudStorageCredentialsId) {
    
    this.cloudStorageCredentialsId = cloudStorageCredentialsId;
    return this;
  }

   /**
   * Get cloudStorageCredentialsId
   * @return cloudStorageCredentialsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCloudStorageCredentialsId() {
    return cloudStorageCredentialsId;
  }


  public void setCloudStorageCredentialsId(Integer cloudStorageCredentialsId) {
    this.cloudStorageCredentialsId = cloudStorageCredentialsId;
  }


  public JobsJobJobSpecJobDataUploadBackupDataToCloudStorage cloudStorageProvider(String cloudStorageProvider) {
    
    this.cloudStorageProvider = cloudStorageProvider;
    return this;
  }

   /**
   * Get cloudStorageProvider
   * @return cloudStorageProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCloudStorageProvider() {
    return cloudStorageProvider;
  }


  public void setCloudStorageProvider(String cloudStorageProvider) {
    this.cloudStorageProvider = cloudStorageProvider;
  }


  public JobsJobJobSpecJobDataUploadBackupDataToCloudStorage cloudStorageService(String cloudStorageService) {
    
    this.cloudStorageService = cloudStorageService;
    return this;
  }

   /**
   * Get cloudStorageService
   * @return cloudStorageService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCloudStorageService() {
    return cloudStorageService;
  }


  public void setCloudStorageService(String cloudStorageService) {
    this.cloudStorageService = cloudStorageService;
  }


  public JobsJobJobSpecJobDataUploadBackupDataToCloudStorage deleteAfterUpload(Boolean deleteAfterUpload) {
    
    this.deleteAfterUpload = deleteAfterUpload;
    return this;
  }

   /**
   * Get deleteAfterUpload
   * @return deleteAfterUpload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeleteAfterUpload() {
    return deleteAfterUpload;
  }


  public void setDeleteAfterUpload(Boolean deleteAfterUpload) {
    this.deleteAfterUpload = deleteAfterUpload;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobsJobJobSpecJobDataUploadBackupDataToCloudStorage jobsJobJobSpecJobDataUploadBackupDataToCloudStorage = (JobsJobJobSpecJobDataUploadBackupDataToCloudStorage) o;
    return Objects.equals(this.backupRetention, jobsJobJobSpecJobDataUploadBackupDataToCloudStorage.backupRetention) &&
        Objects.equals(this.bucket, jobsJobJobSpecJobDataUploadBackupDataToCloudStorage.bucket) &&
        Objects.equals(this.cloudStorageCredentialsId, jobsJobJobSpecJobDataUploadBackupDataToCloudStorage.cloudStorageCredentialsId) &&
        Objects.equals(this.cloudStorageProvider, jobsJobJobSpecJobDataUploadBackupDataToCloudStorage.cloudStorageProvider) &&
        Objects.equals(this.cloudStorageService, jobsJobJobSpecJobDataUploadBackupDataToCloudStorage.cloudStorageService) &&
        Objects.equals(this.deleteAfterUpload, jobsJobJobSpecJobDataUploadBackupDataToCloudStorage.deleteAfterUpload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupRetention, bucket, cloudStorageCredentialsId, cloudStorageProvider, cloudStorageService, deleteAfterUpload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobsJobJobSpecJobDataUploadBackupDataToCloudStorage {\n");
    sb.append("    backupRetention: ").append(toIndentedString(backupRetention)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    cloudStorageCredentialsId: ").append(toIndentedString(cloudStorageCredentialsId)).append("\n");
    sb.append("    cloudStorageProvider: ").append(toIndentedString(cloudStorageProvider)).append("\n");
    sb.append("    cloudStorageService: ").append(toIndentedString(cloudStorageService)).append("\n");
    sb.append("    deleteAfterUpload: ").append(toIndentedString(deleteAfterUpload)).append("\n");
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
    openapiFields.add("backup_retention");
    openapiFields.add("bucket");
    openapiFields.add("cloud_storage_credentials_id");
    openapiFields.add("cloud_storage_provider");
    openapiFields.add("cloud_storage_service");
    openapiFields.add("delete_after_upload");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobsJobJobSpecJobDataUploadBackupDataToCloudStorage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobsJobJobSpecJobDataUploadBackupDataToCloudStorage is not found in the empty JSON string", JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobsJobJobSpecJobDataUploadBackupDataToCloudStorage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("bucket") != null && !jsonObj.get("bucket").isJsonNull()) && !jsonObj.get("bucket").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bucket` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bucket").toString()));
      }
      if ((jsonObj.get("cloud_storage_provider") != null && !jsonObj.get("cloud_storage_provider").isJsonNull()) && !jsonObj.get("cloud_storage_provider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloud_storage_provider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloud_storage_provider").toString()));
      }
      if ((jsonObj.get("cloud_storage_service") != null && !jsonObj.get("cloud_storage_service").isJsonNull()) && !jsonObj.get("cloud_storage_service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloud_storage_service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloud_storage_service").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobsJobJobSpecJobDataUploadBackupDataToCloudStorage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobsJobJobSpecJobDataUploadBackupDataToCloudStorage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.class));

       return (TypeAdapter<T>) new TypeAdapter<JobsJobJobSpecJobDataUploadBackupDataToCloudStorage>() {
           @Override
           public void write(JsonWriter out, JobsJobJobSpecJobDataUploadBackupDataToCloudStorage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobsJobJobSpecJobDataUploadBackupDataToCloudStorage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobsJobJobSpecJobDataUploadBackupDataToCloudStorage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobsJobJobSpecJobDataUploadBackupDataToCloudStorage
  * @throws IOException if the JSON string is invalid with respect to JobsJobJobSpecJobDataUploadBackupDataToCloudStorage
  */
  public static JobsJobJobSpecJobDataUploadBackupDataToCloudStorage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobsJobJobSpecJobDataUploadBackupDataToCloudStorage.class);
  }

 /**
  * Convert an instance of JobsJobJobSpecJobDataUploadBackupDataToCloudStorage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

