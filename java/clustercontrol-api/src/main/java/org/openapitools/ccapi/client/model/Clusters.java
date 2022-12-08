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
import org.openapitools.ccapi.client.model.ClustersAccount;
import org.openapitools.ccapi.client.model.ClustersConfigurationInner;
import org.openapitools.ccapi.client.model.ClustersDatabase;

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
 * Clusters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-28T20:03:34.941519-05:00[America/New_York]")
public class Clusters {
  /**
   * Gets or Sets operation
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    GETALLCLUSTERINFO("getallclusterinfo"),
    
    GETCLUSTERINFO("getclusterinfo"),
    
    GETCONFIG("getConfig"),
    
    SETCONFIG("setConfig"),
    
    CREATEACCOUNT("createAccount"),
    
    GETACCOUNTS("getAccounts"),
    
    DELETEACCOUNT("deleteAccount"),
    
    GRANTPRIVILEGES("grantPrivileges"),
    
    REVOKEPRIVILEGES("revokePrivileges"),
    
    REVOKEALLPRIVILEGES("revokeAllPrivileges"),
    
    GETSQLPROCESSES("getSqlProcesses"),
    
    GETTOPQUERIES("getTopQueries"),
    
    CREATEDATABASE("createDatabase"),
    
    PING("ping"),
    
    AVAILABLEUPGRADES("availableUpgrades");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private OperationEnum operation;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private Integer clusterId;

  public static final String SERIALIZED_NAME_CLUSTER_NAME = "cluster_name";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NAME)
  private String clusterName;

  public static final String SERIALIZED_NAME_WITH_HOSTS = "with_hosts";
  @SerializedName(SERIALIZED_NAME_WITH_HOSTS)
  private Boolean withHosts;

  public static final String SERIALIZED_NAME_WITH_SHEET_INFO = "with_sheet_info";
  @SerializedName(SERIALIZED_NAME_WITH_SHEET_INFO)
  private Boolean withSheetInfo;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private List<ClustersConfigurationInner> _configuration = null;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private ClustersAccount account;

  public static final String SERIALIZED_NAME_FILTER_STRINGS = "filter_strings";
  @SerializedName(SERIALIZED_NAME_FILTER_STRINGS)
  private String filterStrings;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_DATABASE = "database";
  @SerializedName(SERIALIZED_NAME_DATABASE)
  private ClustersDatabase database;

  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private List<String> nodes = null;

  public Clusters() {
  }

  public Clusters operation(OperationEnum operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OperationEnum getOperation() {
    return operation;
  }


  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  public Clusters clusterId(Integer clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterId() {
    return clusterId;
  }


  public void setClusterId(Integer clusterId) {
    this.clusterId = clusterId;
  }


  public Clusters clusterName(String clusterName) {
    
    this.clusterName = clusterName;
    return this;
  }

   /**
   * Get clusterName
   * @return clusterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClusterName() {
    return clusterName;
  }


  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }


  public Clusters withHosts(Boolean withHosts) {
    
    this.withHosts = withHosts;
    return this;
  }

   /**
   * Get withHosts
   * @return withHosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWithHosts() {
    return withHosts;
  }


  public void setWithHosts(Boolean withHosts) {
    this.withHosts = withHosts;
  }


  public Clusters withSheetInfo(Boolean withSheetInfo) {
    
    this.withSheetInfo = withSheetInfo;
    return this;
  }

   /**
   * Get withSheetInfo
   * @return withSheetInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWithSheetInfo() {
    return withSheetInfo;
  }


  public void setWithSheetInfo(Boolean withSheetInfo) {
    this.withSheetInfo = withSheetInfo;
  }


  public Clusters _configuration(List<ClustersConfigurationInner> _configuration) {
    
    this._configuration = _configuration;
    return this;
  }

  public Clusters addConfigurationItem(ClustersConfigurationInner _configurationItem) {
    if (this._configuration == null) {
      this._configuration = new ArrayList<>();
    }
    this._configuration.add(_configurationItem);
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ClustersConfigurationInner> getConfiguration() {
    return _configuration;
  }


  public void setConfiguration(List<ClustersConfigurationInner> _configuration) {
    this._configuration = _configuration;
  }


  public Clusters account(ClustersAccount account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClustersAccount getAccount() {
    return account;
  }


  public void setAccount(ClustersAccount account) {
    this.account = account;
  }


  public Clusters filterStrings(String filterStrings) {
    
    this.filterStrings = filterStrings;
    return this;
  }

   /**
   * Get filterStrings
   * @return filterStrings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFilterStrings() {
    return filterStrings;
  }


  public void setFilterStrings(String filterStrings) {
    this.filterStrings = filterStrings;
  }


  public Clusters limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public Clusters offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public Clusters database(ClustersDatabase database) {
    
    this.database = database;
    return this;
  }

   /**
   * Get database
   * @return database
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClustersDatabase getDatabase() {
    return database;
  }


  public void setDatabase(ClustersDatabase database) {
    this.database = database;
  }


  public Clusters nodes(List<String> nodes) {
    
    this.nodes = nodes;
    return this;
  }

  public Clusters addNodesItem(String nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNodes() {
    return nodes;
  }


  public void setNodes(List<String> nodes) {
    this.nodes = nodes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Clusters clusters = (Clusters) o;
    return Objects.equals(this.operation, clusters.operation) &&
        Objects.equals(this.clusterId, clusters.clusterId) &&
        Objects.equals(this.clusterName, clusters.clusterName) &&
        Objects.equals(this.withHosts, clusters.withHosts) &&
        Objects.equals(this.withSheetInfo, clusters.withSheetInfo) &&
        Objects.equals(this._configuration, clusters._configuration) &&
        Objects.equals(this.account, clusters.account) &&
        Objects.equals(this.filterStrings, clusters.filterStrings) &&
        Objects.equals(this.limit, clusters.limit) &&
        Objects.equals(this.offset, clusters.offset) &&
        Objects.equals(this.database, clusters.database) &&
        Objects.equals(this.nodes, clusters.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, clusterId, clusterName, withHosts, withSheetInfo, _configuration, account, filterStrings, limit, offset, database, nodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clusters {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    withHosts: ").append(toIndentedString(withHosts)).append("\n");
    sb.append("    withSheetInfo: ").append(toIndentedString(withSheetInfo)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    filterStrings: ").append(toIndentedString(filterStrings)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
    openapiFields.add("operation");
    openapiFields.add("cluster_id");
    openapiFields.add("cluster_name");
    openapiFields.add("with_hosts");
    openapiFields.add("with_sheet_info");
    openapiFields.add("configuration");
    openapiFields.add("account");
    openapiFields.add("filter_strings");
    openapiFields.add("limit");
    openapiFields.add("offset");
    openapiFields.add("database");
    openapiFields.add("nodes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operation");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Clusters
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Clusters.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Clusters is not found in the empty JSON string", Clusters.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Clusters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Clusters` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Clusters.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      if ((jsonObj.get("cluster_name") != null && !jsonObj.get("cluster_name").isJsonNull()) && !jsonObj.get("cluster_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cluster_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cluster_name").toString()));
      }
      if (jsonObj.get("configuration") != null && !jsonObj.get("configuration").isJsonNull()) {
        JsonArray jsonArray_configuration = jsonObj.getAsJsonArray("configuration");
        if (jsonArray_configuration != null) {
          // ensure the json data is an array
          if (!jsonObj.get("configuration").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `configuration` to be an array in the JSON string but got `%s`", jsonObj.get("configuration").toString()));
          }

          // validate the optional field `configuration` (array)
          for (int i = 0; i < jsonArray_configuration.size(); i++) {
            ClustersConfigurationInner.validateJsonObject(jsonArray_configuration.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        ClustersAccount.validateJsonObject(jsonObj.getAsJsonObject("account"));
      }
      if ((jsonObj.get("filter_strings") != null && !jsonObj.get("filter_strings").isJsonNull()) && !jsonObj.get("filter_strings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter_strings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter_strings").toString()));
      }
      // validate the optional field `database`
      if (jsonObj.get("database") != null && !jsonObj.get("database").isJsonNull()) {
        ClustersDatabase.validateJsonObject(jsonObj.getAsJsonObject("database"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("nodes") != null && !jsonObj.get("nodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodes` to be an array in the JSON string but got `%s`", jsonObj.get("nodes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Clusters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Clusters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Clusters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Clusters.class));

       return (TypeAdapter<T>) new TypeAdapter<Clusters>() {
           @Override
           public void write(JsonWriter out, Clusters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Clusters read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Clusters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Clusters
  * @throws IOException if the JSON string is invalid with respect to Clusters
  */
  public static Clusters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Clusters.class);
  }

 /**
  * Convert an instance of Clusters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

