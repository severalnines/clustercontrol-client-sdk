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
 * Controller
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-28T20:03:34.941519-05:00[America/New_York]")
public class Controller {
  /**
   * Gets or Sets operation
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    PING("ping"),
    
    HEARTBEAT("heartBeat");

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

  public static final String SERIALIZED_NAME_CLIENT_IP_ADDRESS = "client_ip_address";
  @SerializedName(SERIALIZED_NAME_CLIENT_IP_ADDRESS)
  private String clientIpAddress;

  public static final String SERIALIZED_NAME_CONTROLLER_KEY = "controller_key";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_KEY)
  private String controllerKey;

  public Controller() {
  }

  public Controller operation(OperationEnum operation) {
    
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


  public Controller clientIpAddress(String clientIpAddress) {
    
    this.clientIpAddress = clientIpAddress;
    return this;
  }

   /**
   * Get clientIpAddress
   * @return clientIpAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientIpAddress() {
    return clientIpAddress;
  }


  public void setClientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
  }


  public Controller controllerKey(String controllerKey) {
    
    this.controllerKey = controllerKey;
    return this;
  }

   /**
   * Get controllerKey
   * @return controllerKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getControllerKey() {
    return controllerKey;
  }


  public void setControllerKey(String controllerKey) {
    this.controllerKey = controllerKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Controller controller = (Controller) o;
    return Objects.equals(this.operation, controller.operation) &&
        Objects.equals(this.clientIpAddress, controller.clientIpAddress) &&
        Objects.equals(this.controllerKey, controller.controllerKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, clientIpAddress, controllerKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Controller {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    clientIpAddress: ").append(toIndentedString(clientIpAddress)).append("\n");
    sb.append("    controllerKey: ").append(toIndentedString(controllerKey)).append("\n");
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
    openapiFields.add("client_ip_address");
    openapiFields.add("controller_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operation");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Controller
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Controller.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Controller is not found in the empty JSON string", Controller.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Controller.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Controller` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Controller.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      if ((jsonObj.get("client_ip_address") != null && !jsonObj.get("client_ip_address").isJsonNull()) && !jsonObj.get("client_ip_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_ip_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_ip_address").toString()));
      }
      if ((jsonObj.get("controller_key") != null && !jsonObj.get("controller_key").isJsonNull()) && !jsonObj.get("controller_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `controller_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("controller_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Controller.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Controller' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Controller> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Controller.class));

       return (TypeAdapter<T>) new TypeAdapter<Controller>() {
           @Override
           public void write(JsonWriter out, Controller value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Controller read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Controller given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Controller
  * @throws IOException if the JSON string is invalid with respect to Controller
  */
  public static Controller fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Controller.class);
  }

 /**
  * Convert an instance of Controller to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

