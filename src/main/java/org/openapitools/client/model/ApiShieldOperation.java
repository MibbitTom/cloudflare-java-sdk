/*
 * Cloudflare API
 * To get started using Cloudflare's products and services via the API, refer to [how to interact with Cloudflare](https://developers.cloudflare.com/fundamentals/basic-tasks/interact-with-cloudflare/), which covers using tools like [Terraform](https://developers.cloudflare.com/terraform/#cloudflare-terraform) and the [official SDKs](https://developers.cloudflare.com/fundamentals/api/reference/sdks/) to maintain your Cloudflare resources.  Using the Cloudflare API requires authentication so that Cloudflare knows who is making requests and what permissions you have. Create an API token to grant access to the API to perform actions.  To create an API token, from the Cloudflare dashboard, go to My Profile > API Tokens and select Create Token. For more information on how to create and troubleshoot API tokens, refer to our [API fundamentals](https://developers.cloudflare.com/fundamentals/api/).  Totally new to Cloudflare? [Start here](https://developers.cloudflare.com/fundamentals/get-started/).
 *
 * The version of the OpenAPI document: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.client.model.ApiShieldMethod;
import org.openapitools.client.model.ApiShieldOperationFeatures;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ApiShieldOperation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ApiShieldOperation {
  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private ApiShieldMethod method;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private ApiShieldOperationFeatures features;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public static final String SERIALIZED_NAME_OPERATION_ID = "operation_id";
  @SerializedName(SERIALIZED_NAME_OPERATION_ID)
  private UUID operationId;

  public ApiShieldOperation() {
  }

  public ApiShieldOperation(
     OffsetDateTime lastUpdated, 
     UUID operationId
  ) {
    this();
    this.lastUpdated = lastUpdated;
    this.operationId = operationId;
  }

  public ApiShieldOperation endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * The endpoint which can contain path parameter templates in curly braces, each will be replaced from left to right with {varN}, starting with {var1}, during insertion. This will further be Cloudflare-normalized upon insertion. See: https://developers.cloudflare.com/rules/normalization/how-it-works/.
   * @return endpoint
  **/
  @javax.annotation.Nonnull
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public ApiShieldOperation host(String host) {
    this.host = host;
    return this;
  }

   /**
   * RFC3986-compliant host.
   * @return host
  **/
  @javax.annotation.Nonnull
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  public ApiShieldOperation method(ApiShieldMethod method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nonnull
  public ApiShieldMethod getMethod() {
    return method;
  }

  public void setMethod(ApiShieldMethod method) {
    this.method = method;
  }


  public ApiShieldOperation features(ApiShieldOperationFeatures features) {
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @javax.annotation.Nullable
  public ApiShieldOperationFeatures getFeatures() {
    return features;
  }

  public void setFeatures(ApiShieldOperationFeatures features) {
    this.features = features;
  }


   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }



   /**
   * UUID identifier
   * @return operationId
  **/
  @javax.annotation.Nonnull
  public UUID getOperationId() {
    return operationId;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiShieldOperation apiShieldOperation = (ApiShieldOperation) o;
    return Objects.equals(this.endpoint, apiShieldOperation.endpoint) &&
        Objects.equals(this.host, apiShieldOperation.host) &&
        Objects.equals(this.method, apiShieldOperation.method) &&
        Objects.equals(this.features, apiShieldOperation.features) &&
        Objects.equals(this.lastUpdated, apiShieldOperation.lastUpdated) &&
        Objects.equals(this.operationId, apiShieldOperation.operationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint, host, method, features, lastUpdated, operationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiShieldOperation {\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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
    openapiFields.add("endpoint");
    openapiFields.add("host");
    openapiFields.add("method");
    openapiFields.add("features");
    openapiFields.add("last_updated");
    openapiFields.add("operation_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("endpoint");
    openapiRequiredFields.add("host");
    openapiRequiredFields.add("method");
    openapiRequiredFields.add("last_updated");
    openapiRequiredFields.add("operation_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiShieldOperation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiShieldOperation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiShieldOperation is not found in the empty JSON string", ApiShieldOperation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiShieldOperation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiShieldOperation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApiShieldOperation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpoint").toString()));
      }
      if (!jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      // validate the required field `method`
      ApiShieldMethod.validateJsonElement(jsonObj.get("method"));
      // validate the optional field `features`
      if (jsonObj.get("features") != null && !jsonObj.get("features").isJsonNull()) {
        ApiShieldOperationFeatures.validateJsonElement(jsonObj.get("features"));
      }
      if (!jsonObj.get("operation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiShieldOperation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiShieldOperation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiShieldOperation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiShieldOperation.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiShieldOperation>() {
           @Override
           public void write(JsonWriter out, ApiShieldOperation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiShieldOperation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiShieldOperation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiShieldOperation
  * @throws IOException if the JSON string is invalid with respect to ApiShieldOperation
  */
  public static ApiShieldOperation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiShieldOperation.class);
  }

 /**
  * Convert an instance of ApiShieldOperation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

