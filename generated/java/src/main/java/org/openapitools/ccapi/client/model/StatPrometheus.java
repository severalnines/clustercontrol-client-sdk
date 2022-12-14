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
import org.openapitools.ccapi.client.model.StatPrometheusQueriesInner;

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
 * StatPrometheus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-28T20:03:34.941519-05:00[America/New_York]")
public class StatPrometheus {
  /**
   * Gets or Sets operation
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    _PROMETHEUS("/prometheus");

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

  public static final String SERIALIZED_NAME_QUERIES = "queries";
  @SerializedName(SERIALIZED_NAME_QUERIES)
  private List<StatPrometheusQueriesInner> queries = null;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Integer start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private Integer end;

  public static final String SERIALIZED_NAME_STEP = "step";
  @SerializedName(SERIALIZED_NAME_STEP)
  private Integer step;

  public static final String SERIALIZED_NAME_RETURNFROM = "returnfrom";
  @SerializedName(SERIALIZED_NAME_RETURNFROM)
  private Integer returnfrom;

  public StatPrometheus() {
  }

  public StatPrometheus operation(OperationEnum operation) {
    
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


  public StatPrometheus clusterId(Integer clusterId) {
    
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


  public StatPrometheus clusterName(String clusterName) {
    
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


  public StatPrometheus queries(List<StatPrometheusQueriesInner> queries) {
    
    this.queries = queries;
    return this;
  }

  public StatPrometheus addQueriesItem(StatPrometheusQueriesInner queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * Get queries
   * @return queries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<StatPrometheusQueriesInner> getQueries() {
    return queries;
  }


  public void setQueries(List<StatPrometheusQueriesInner> queries) {
    this.queries = queries;
  }


  public StatPrometheus start(Integer start) {
    
    this.start = start;
    return this;
  }

   /**
   * Seconds since 1970. e.g. 1622105617
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Seconds since 1970. e.g. 1622105617")

  public Integer getStart() {
    return start;
  }


  public void setStart(Integer start) {
    this.start = start;
  }


  public StatPrometheus end(Integer end) {
    
    this.end = end;
    return this;
  }

   /**
   * Seconds since 1970. e.g. 1622108317
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Seconds since 1970. e.g. 1622108317")

  public Integer getEnd() {
    return end;
  }


  public void setEnd(Integer end) {
    this.end = end;
  }


  public StatPrometheus step(Integer step) {
    
    this.step = step;
    return this;
  }

   /**
   * Get step
   * @return step
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStep() {
    return step;
  }


  public void setStep(Integer step) {
    this.step = step;
  }


  public StatPrometheus returnfrom(Integer returnfrom) {
    
    this.returnfrom = returnfrom;
    return this;
  }

   /**
   * Get returnfrom
   * @return returnfrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReturnfrom() {
    return returnfrom;
  }


  public void setReturnfrom(Integer returnfrom) {
    this.returnfrom = returnfrom;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatPrometheus statPrometheus = (StatPrometheus) o;
    return Objects.equals(this.operation, statPrometheus.operation) &&
        Objects.equals(this.clusterId, statPrometheus.clusterId) &&
        Objects.equals(this.clusterName, statPrometheus.clusterName) &&
        Objects.equals(this.queries, statPrometheus.queries) &&
        Objects.equals(this.start, statPrometheus.start) &&
        Objects.equals(this.end, statPrometheus.end) &&
        Objects.equals(this.step, statPrometheus.step) &&
        Objects.equals(this.returnfrom, statPrometheus.returnfrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, clusterId, clusterName, queries, start, end, step, returnfrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatPrometheus {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    returnfrom: ").append(toIndentedString(returnfrom)).append("\n");
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
    openapiFields.add("queries");
    openapiFields.add("start");
    openapiFields.add("end");
    openapiFields.add("step");
    openapiFields.add("returnfrom");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operation");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatPrometheus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StatPrometheus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatPrometheus is not found in the empty JSON string", StatPrometheus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StatPrometheus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatPrometheus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StatPrometheus.openapiRequiredFields) {
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
      if (jsonObj.get("queries") != null && !jsonObj.get("queries").isJsonNull()) {
        JsonArray jsonArrayqueries = jsonObj.getAsJsonArray("queries");
        if (jsonArrayqueries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("queries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `queries` to be an array in the JSON string but got `%s`", jsonObj.get("queries").toString()));
          }

          // validate the optional field `queries` (array)
          for (int i = 0; i < jsonArrayqueries.size(); i++) {
            StatPrometheusQueriesInner.validateJsonObject(jsonArrayqueries.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatPrometheus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatPrometheus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatPrometheus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatPrometheus.class));

       return (TypeAdapter<T>) new TypeAdapter<StatPrometheus>() {
           @Override
           public void write(JsonWriter out, StatPrometheus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatPrometheus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StatPrometheus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatPrometheus
  * @throws IOException if the JSON string is invalid with respect to StatPrometheus
  */
  public static StatPrometheus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatPrometheus.class);
  }

 /**
  * Convert an instance of StatPrometheus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

