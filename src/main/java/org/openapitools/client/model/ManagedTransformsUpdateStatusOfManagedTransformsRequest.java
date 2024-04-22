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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.RulesetsRequestModel;

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

import invalidPackageName.JSON;

/**
 * ManagedTransformsUpdateStatusOfManagedTransformsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ManagedTransformsUpdateStatusOfManagedTransformsRequest {
  public static final String SERIALIZED_NAME_MANAGED_REQUEST_HEADERS = "managed_request_headers";
  @SerializedName(SERIALIZED_NAME_MANAGED_REQUEST_HEADERS)
  private List<RulesetsRequestModel> managedRequestHeaders = new ArrayList<>();

  public static final String SERIALIZED_NAME_MANAGED_RESPONSE_HEADERS = "managed_response_headers";
  @SerializedName(SERIALIZED_NAME_MANAGED_RESPONSE_HEADERS)
  private List<RulesetsRequestModel> managedResponseHeaders = new ArrayList<>();

  public ManagedTransformsUpdateStatusOfManagedTransformsRequest() {
  }

  public ManagedTransformsUpdateStatusOfManagedTransformsRequest managedRequestHeaders(List<RulesetsRequestModel> managedRequestHeaders) {
    this.managedRequestHeaders = managedRequestHeaders;
    return this;
  }

  public ManagedTransformsUpdateStatusOfManagedTransformsRequest addManagedRequestHeadersItem(RulesetsRequestModel managedRequestHeadersItem) {
    if (this.managedRequestHeaders == null) {
      this.managedRequestHeaders = new ArrayList<>();
    }
    this.managedRequestHeaders.add(managedRequestHeadersItem);
    return this;
  }

   /**
   * Get managedRequestHeaders
   * @return managedRequestHeaders
  **/
  @javax.annotation.Nonnull
  public List<RulesetsRequestModel> getManagedRequestHeaders() {
    return managedRequestHeaders;
  }

  public void setManagedRequestHeaders(List<RulesetsRequestModel> managedRequestHeaders) {
    this.managedRequestHeaders = managedRequestHeaders;
  }


  public ManagedTransformsUpdateStatusOfManagedTransformsRequest managedResponseHeaders(List<RulesetsRequestModel> managedResponseHeaders) {
    this.managedResponseHeaders = managedResponseHeaders;
    return this;
  }

  public ManagedTransformsUpdateStatusOfManagedTransformsRequest addManagedResponseHeadersItem(RulesetsRequestModel managedResponseHeadersItem) {
    if (this.managedResponseHeaders == null) {
      this.managedResponseHeaders = new ArrayList<>();
    }
    this.managedResponseHeaders.add(managedResponseHeadersItem);
    return this;
  }

   /**
   * Get managedResponseHeaders
   * @return managedResponseHeaders
  **/
  @javax.annotation.Nonnull
  public List<RulesetsRequestModel> getManagedResponseHeaders() {
    return managedResponseHeaders;
  }

  public void setManagedResponseHeaders(List<RulesetsRequestModel> managedResponseHeaders) {
    this.managedResponseHeaders = managedResponseHeaders;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagedTransformsUpdateStatusOfManagedTransformsRequest managedTransformsUpdateStatusOfManagedTransformsRequest = (ManagedTransformsUpdateStatusOfManagedTransformsRequest) o;
    return Objects.equals(this.managedRequestHeaders, managedTransformsUpdateStatusOfManagedTransformsRequest.managedRequestHeaders) &&
        Objects.equals(this.managedResponseHeaders, managedTransformsUpdateStatusOfManagedTransformsRequest.managedResponseHeaders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedRequestHeaders, managedResponseHeaders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedTransformsUpdateStatusOfManagedTransformsRequest {\n");
    sb.append("    managedRequestHeaders: ").append(toIndentedString(managedRequestHeaders)).append("\n");
    sb.append("    managedResponseHeaders: ").append(toIndentedString(managedResponseHeaders)).append("\n");
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
    openapiFields.add("managed_request_headers");
    openapiFields.add("managed_response_headers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("managed_request_headers");
    openapiRequiredFields.add("managed_response_headers");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ManagedTransformsUpdateStatusOfManagedTransformsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ManagedTransformsUpdateStatusOfManagedTransformsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ManagedTransformsUpdateStatusOfManagedTransformsRequest is not found in the empty JSON string", ManagedTransformsUpdateStatusOfManagedTransformsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ManagedTransformsUpdateStatusOfManagedTransformsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ManagedTransformsUpdateStatusOfManagedTransformsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ManagedTransformsUpdateStatusOfManagedTransformsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("managed_request_headers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `managed_request_headers` to be an array in the JSON string but got `%s`", jsonObj.get("managed_request_headers").toString()));
      }

      JsonArray jsonArraymanagedRequestHeaders = jsonObj.getAsJsonArray("managed_request_headers");
      // validate the required field `managed_request_headers` (array)
      for (int i = 0; i < jsonArraymanagedRequestHeaders.size(); i++) {
        RulesetsRequestModel.validateJsonElement(jsonArraymanagedRequestHeaders.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("managed_response_headers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `managed_response_headers` to be an array in the JSON string but got `%s`", jsonObj.get("managed_response_headers").toString()));
      }

      JsonArray jsonArraymanagedResponseHeaders = jsonObj.getAsJsonArray("managed_response_headers");
      // validate the required field `managed_response_headers` (array)
      for (int i = 0; i < jsonArraymanagedResponseHeaders.size(); i++) {
        RulesetsRequestModel.validateJsonElement(jsonArraymanagedResponseHeaders.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManagedTransformsUpdateStatusOfManagedTransformsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManagedTransformsUpdateStatusOfManagedTransformsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManagedTransformsUpdateStatusOfManagedTransformsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManagedTransformsUpdateStatusOfManagedTransformsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ManagedTransformsUpdateStatusOfManagedTransformsRequest>() {
           @Override
           public void write(JsonWriter out, ManagedTransformsUpdateStatusOfManagedTransformsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManagedTransformsUpdateStatusOfManagedTransformsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManagedTransformsUpdateStatusOfManagedTransformsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManagedTransformsUpdateStatusOfManagedTransformsRequest
  * @throws IOException if the JSON string is invalid with respect to ManagedTransformsUpdateStatusOfManagedTransformsRequest
  */
  public static ManagedTransformsUpdateStatusOfManagedTransformsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManagedTransformsUpdateStatusOfManagedTransformsRequest.class);
  }

 /**
  * Convert an instance of ManagedTransformsUpdateStatusOfManagedTransformsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

