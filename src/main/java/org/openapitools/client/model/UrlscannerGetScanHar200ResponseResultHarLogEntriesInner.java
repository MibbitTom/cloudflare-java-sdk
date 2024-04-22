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
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.client.model.UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerRequest;
import org.openapitools.client.model.UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse;

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
 * UrlscannerGetScanHar200ResponseResultHarLogEntriesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class UrlscannerGetScanHar200ResponseResultHarLogEntriesInner {
  public static final String SERIALIZED_NAME_INITIAL_PRIORITY = "_initialPriority";
  @SerializedName(SERIALIZED_NAME_INITIAL_PRIORITY)
  private String initialPriority;

  public static final String SERIALIZED_NAME_INITIATOR_TYPE = "_initiator_type";
  @SerializedName(SERIALIZED_NAME_INITIATOR_TYPE)
  private String initiatorType;

  public static final String SERIALIZED_NAME_PRIORITY = "_priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private String priority;

  public static final String SERIALIZED_NAME_REQUEST_ID = "_requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_REQUEST_TIME = "_requestTime";
  @SerializedName(SERIALIZED_NAME_REQUEST_TIME)
  private BigDecimal requestTime;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "_resourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public static final String SERIALIZED_NAME_CACHE = "cache";
  @SerializedName(SERIALIZED_NAME_CACHE)
  private Object cache;

  public static final String SERIALIZED_NAME_CONNECTION = "connection";
  @SerializedName(SERIALIZED_NAME_CONNECTION)
  private String connection;

  public static final String SERIALIZED_NAME_PAGEREF = "pageref";
  @SerializedName(SERIALIZED_NAME_PAGEREF)
  private String pageref;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerRequest request;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse response;

  public static final String SERIALIZED_NAME_SERVER_I_P_ADDRESS = "serverIPAddress";
  @SerializedName(SERIALIZED_NAME_SERVER_I_P_ADDRESS)
  private String serverIPAddress;

  public static final String SERIALIZED_NAME_STARTED_DATE_TIME = "startedDateTime";
  @SerializedName(SERIALIZED_NAME_STARTED_DATE_TIME)
  private String startedDateTime;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private BigDecimal time;

  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInner() {
  }

  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInner initialPriority(String initialPriority) {
    this.initialPriority = initialPriority;
    return this;
  }

   /**
   * Get initialPriority
   * @return initialPriority
  **/
  @javax.annotation.Nonnull
  public String getInitialPriority() {
    return initialPriority;
  }

  public void setInitialPriority(String initialPriority) {
    this.initialPriority = initialPriority;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInner initiatorType(String initiatorType) {
    this.initiatorType = initiatorType;
    return this;
  }

   /**
   * Get initiatorType
   * @return initiatorType
  **/
  @javax.annotation.Nonnull
  public String getInitiatorType() {
    return initiatorType;
  }

  public void setInitiatorType(String initiatorType) {
    this.initiatorType = initiatorType;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInner priority(String priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nonnull
  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInner requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @javax.annotation.Nonnull
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInner requestTime(BigDecimal requestTime) {
    this.requestTime = requestTime;
    return this;
  }

   /**
   * Get requestTime
   * @return requestTime
  **/
  @javax.annotation.Nonnull
  public BigDecimal getRequestTime() {
    return requestTime;
  }

  public void setRequestTime(BigDecimal requestTime) {
    this.requestTime = requestTime;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInner resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @javax.annotation.Nonnull
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInner cache(Object cache) {
    this.cache = cache;
    return this;
  }

   /**
   * Get cache
   * @return cache
  **/
  @javax.annotation.Nonnull
  public Object getCache() {
    return cache;
  }

  public void setCache(Object cache) {
    this.cache = cache;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInner connection(String connection) {
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  @javax.annotation.Nonnull
  public String getConnection() {
    return connection;
  }

  public void setConnection(String connection) {
    this.connection = connection;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInner pageref(String pageref) {
    this.pageref = pageref;
    return this;
  }

   /**
   * Get pageref
   * @return pageref
  **/
  @javax.annotation.Nonnull
  public String getPageref() {
    return pageref;
  }

  public void setPageref(String pageref) {
    this.pageref = pageref;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInner request(UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerRequest request) {
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @javax.annotation.Nonnull
  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerRequest getRequest() {
    return request;
  }

  public void setRequest(UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerRequest request) {
    this.request = request;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInner response(UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @javax.annotation.Nonnull
  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse getResponse() {
    return response;
  }

  public void setResponse(UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse response) {
    this.response = response;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInner serverIPAddress(String serverIPAddress) {
    this.serverIPAddress = serverIPAddress;
    return this;
  }

   /**
   * Get serverIPAddress
   * @return serverIPAddress
  **/
  @javax.annotation.Nonnull
  public String getServerIPAddress() {
    return serverIPAddress;
  }

  public void setServerIPAddress(String serverIPAddress) {
    this.serverIPAddress = serverIPAddress;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInner startedDateTime(String startedDateTime) {
    this.startedDateTime = startedDateTime;
    return this;
  }

   /**
   * Get startedDateTime
   * @return startedDateTime
  **/
  @javax.annotation.Nonnull
  public String getStartedDateTime() {
    return startedDateTime;
  }

  public void setStartedDateTime(String startedDateTime) {
    this.startedDateTime = startedDateTime;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInner time(BigDecimal time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nonnull
  public BigDecimal getTime() {
    return time;
  }

  public void setTime(BigDecimal time) {
    this.time = time;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlscannerGetScanHar200ResponseResultHarLogEntriesInner urlscannerGetScanHar200ResponseResultHarLogEntriesInner = (UrlscannerGetScanHar200ResponseResultHarLogEntriesInner) o;
    return Objects.equals(this.initialPriority, urlscannerGetScanHar200ResponseResultHarLogEntriesInner.initialPriority) &&
        Objects.equals(this.initiatorType, urlscannerGetScanHar200ResponseResultHarLogEntriesInner.initiatorType) &&
        Objects.equals(this.priority, urlscannerGetScanHar200ResponseResultHarLogEntriesInner.priority) &&
        Objects.equals(this.requestId, urlscannerGetScanHar200ResponseResultHarLogEntriesInner.requestId) &&
        Objects.equals(this.requestTime, urlscannerGetScanHar200ResponseResultHarLogEntriesInner.requestTime) &&
        Objects.equals(this.resourceType, urlscannerGetScanHar200ResponseResultHarLogEntriesInner.resourceType) &&
        Objects.equals(this.cache, urlscannerGetScanHar200ResponseResultHarLogEntriesInner.cache) &&
        Objects.equals(this.connection, urlscannerGetScanHar200ResponseResultHarLogEntriesInner.connection) &&
        Objects.equals(this.pageref, urlscannerGetScanHar200ResponseResultHarLogEntriesInner.pageref) &&
        Objects.equals(this.request, urlscannerGetScanHar200ResponseResultHarLogEntriesInner.request) &&
        Objects.equals(this.response, urlscannerGetScanHar200ResponseResultHarLogEntriesInner.response) &&
        Objects.equals(this.serverIPAddress, urlscannerGetScanHar200ResponseResultHarLogEntriesInner.serverIPAddress) &&
        Objects.equals(this.startedDateTime, urlscannerGetScanHar200ResponseResultHarLogEntriesInner.startedDateTime) &&
        Objects.equals(this.time, urlscannerGetScanHar200ResponseResultHarLogEntriesInner.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialPriority, initiatorType, priority, requestId, requestTime, resourceType, cache, connection, pageref, request, response, serverIPAddress, startedDateTime, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlscannerGetScanHar200ResponseResultHarLogEntriesInner {\n");
    sb.append("    initialPriority: ").append(toIndentedString(initialPriority)).append("\n");
    sb.append("    initiatorType: ").append(toIndentedString(initiatorType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    pageref: ").append(toIndentedString(pageref)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    serverIPAddress: ").append(toIndentedString(serverIPAddress)).append("\n");
    sb.append("    startedDateTime: ").append(toIndentedString(startedDateTime)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
    openapiFields.add("_initialPriority");
    openapiFields.add("_initiator_type");
    openapiFields.add("_priority");
    openapiFields.add("_requestId");
    openapiFields.add("_requestTime");
    openapiFields.add("_resourceType");
    openapiFields.add("cache");
    openapiFields.add("connection");
    openapiFields.add("pageref");
    openapiFields.add("request");
    openapiFields.add("response");
    openapiFields.add("serverIPAddress");
    openapiFields.add("startedDateTime");
    openapiFields.add("time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("_initialPriority");
    openapiRequiredFields.add("_initiator_type");
    openapiRequiredFields.add("_priority");
    openapiRequiredFields.add("_requestId");
    openapiRequiredFields.add("_requestTime");
    openapiRequiredFields.add("_resourceType");
    openapiRequiredFields.add("cache");
    openapiRequiredFields.add("connection");
    openapiRequiredFields.add("pageref");
    openapiRequiredFields.add("request");
    openapiRequiredFields.add("response");
    openapiRequiredFields.add("serverIPAddress");
    openapiRequiredFields.add("startedDateTime");
    openapiRequiredFields.add("time");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UrlscannerGetScanHar200ResponseResultHarLogEntriesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlscannerGetScanHar200ResponseResultHarLogEntriesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlscannerGetScanHar200ResponseResultHarLogEntriesInner is not found in the empty JSON string", UrlscannerGetScanHar200ResponseResultHarLogEntriesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UrlscannerGetScanHar200ResponseResultHarLogEntriesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UrlscannerGetScanHar200ResponseResultHarLogEntriesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UrlscannerGetScanHar200ResponseResultHarLogEntriesInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("_initialPriority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_initialPriority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_initialPriority").toString()));
      }
      if (!jsonObj.get("_initiator_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_initiator_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_initiator_type").toString()));
      }
      if (!jsonObj.get("_priority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_priority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_priority").toString()));
      }
      if (!jsonObj.get("_requestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_requestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_requestId").toString()));
      }
      if (!jsonObj.get("_resourceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_resourceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_resourceType").toString()));
      }
      if (!jsonObj.get("connection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection").toString()));
      }
      if (!jsonObj.get("pageref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageref").toString()));
      }
      // validate the required field `request`
      UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerRequest.validateJsonElement(jsonObj.get("request"));
      // validate the required field `response`
      UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.validateJsonElement(jsonObj.get("response"));
      if (!jsonObj.get("serverIPAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverIPAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverIPAddress").toString()));
      }
      if (!jsonObj.get("startedDateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startedDateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startedDateTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlscannerGetScanHar200ResponseResultHarLogEntriesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlscannerGetScanHar200ResponseResultHarLogEntriesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlscannerGetScanHar200ResponseResultHarLogEntriesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlscannerGetScanHar200ResponseResultHarLogEntriesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlscannerGetScanHar200ResponseResultHarLogEntriesInner>() {
           @Override
           public void write(JsonWriter out, UrlscannerGetScanHar200ResponseResultHarLogEntriesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlscannerGetScanHar200ResponseResultHarLogEntriesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlscannerGetScanHar200ResponseResultHarLogEntriesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlscannerGetScanHar200ResponseResultHarLogEntriesInner
  * @throws IOException if the JSON string is invalid with respect to UrlscannerGetScanHar200ResponseResultHarLogEntriesInner
  */
  public static UrlscannerGetScanHar200ResponseResultHarLogEntriesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlscannerGetScanHar200ResponseResultHarLogEntriesInner.class);
  }

 /**
  * Convert an instance of UrlscannerGetScanHar200ResponseResultHarLogEntriesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

