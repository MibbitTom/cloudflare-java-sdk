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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.DataZoneAnalyticsApiBandwidthSslProtocols;
import org.openapitools.client.model.DataZoneAnalyticsApiRequestsSsl;

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
 * Breakdown of totals for requests.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DataZoneAnalyticsApiRequests {
  public static final String SERIALIZED_NAME_ALL = "all";
  @SerializedName(SERIALIZED_NAME_ALL)
  private Integer all;

  public static final String SERIALIZED_NAME_CACHED = "cached";
  @SerializedName(SERIALIZED_NAME_CACHED)
  private Integer cached;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private Object contentType;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private Object country;

  public static final String SERIALIZED_NAME_HTTP_STATUS = "http_status";
  @SerializedName(SERIALIZED_NAME_HTTP_STATUS)
  private Map<String, Object> httpStatus = new HashMap<>();

  public static final String SERIALIZED_NAME_SSL = "ssl";
  @SerializedName(SERIALIZED_NAME_SSL)
  private DataZoneAnalyticsApiRequestsSsl ssl;

  public static final String SERIALIZED_NAME_SSL_PROTOCOLS = "ssl_protocols";
  @SerializedName(SERIALIZED_NAME_SSL_PROTOCOLS)
  private DataZoneAnalyticsApiBandwidthSslProtocols sslProtocols;

  public static final String SERIALIZED_NAME_UNCACHED = "uncached";
  @SerializedName(SERIALIZED_NAME_UNCACHED)
  private Integer uncached;

  public DataZoneAnalyticsApiRequests() {
  }

  public DataZoneAnalyticsApiRequests all(Integer all) {
    this.all = all;
    return this;
  }

   /**
   * Total number of requests served.
   * @return all
  **/
  @javax.annotation.Nullable
  public Integer getAll() {
    return all;
  }

  public void setAll(Integer all) {
    this.all = all;
  }


  public DataZoneAnalyticsApiRequests cached(Integer cached) {
    this.cached = cached;
    return this;
  }

   /**
   * Total number of cached requests served.
   * @return cached
  **/
  @javax.annotation.Nullable
  public Integer getCached() {
    return cached;
  }

  public void setCached(Integer cached) {
    this.cached = cached;
  }


  public DataZoneAnalyticsApiRequests contentType(Object contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * A variable list of key/value pairs where the key represents the type of content served, and the value is the number of requests.
   * @return contentType
  **/
  @javax.annotation.Nullable
  public Object getContentType() {
    return contentType;
  }

  public void setContentType(Object contentType) {
    this.contentType = contentType;
  }


  public DataZoneAnalyticsApiRequests country(Object country) {
    this.country = country;
    return this;
  }

   /**
   * A variable list of key/value pairs where the key is a two-digit country code and the value is the number of requests served to that country.
   * @return country
  **/
  @javax.annotation.Nullable
  public Object getCountry() {
    return country;
  }

  public void setCountry(Object country) {
    this.country = country;
  }


  public DataZoneAnalyticsApiRequests httpStatus(Map<String, Object> httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }

  public DataZoneAnalyticsApiRequests putHttpStatusItem(String key, Object httpStatusItem) {
    if (this.httpStatus == null) {
      this.httpStatus = new HashMap<>();
    }
    this.httpStatus.put(key, httpStatusItem);
    return this;
  }

   /**
   * Key/value pairs where the key is a HTTP status code and the value is the number of requests served with that code.
   * @return httpStatus
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getHttpStatus() {
    return httpStatus;
  }

  public void setHttpStatus(Map<String, Object> httpStatus) {
    this.httpStatus = httpStatus;
  }


  public DataZoneAnalyticsApiRequests ssl(DataZoneAnalyticsApiRequestsSsl ssl) {
    this.ssl = ssl;
    return this;
  }

   /**
   * Get ssl
   * @return ssl
  **/
  @javax.annotation.Nullable
  public DataZoneAnalyticsApiRequestsSsl getSsl() {
    return ssl;
  }

  public void setSsl(DataZoneAnalyticsApiRequestsSsl ssl) {
    this.ssl = ssl;
  }


  public DataZoneAnalyticsApiRequests sslProtocols(DataZoneAnalyticsApiBandwidthSslProtocols sslProtocols) {
    this.sslProtocols = sslProtocols;
    return this;
  }

   /**
   * Get sslProtocols
   * @return sslProtocols
  **/
  @javax.annotation.Nullable
  public DataZoneAnalyticsApiBandwidthSslProtocols getSslProtocols() {
    return sslProtocols;
  }

  public void setSslProtocols(DataZoneAnalyticsApiBandwidthSslProtocols sslProtocols) {
    this.sslProtocols = sslProtocols;
  }


  public DataZoneAnalyticsApiRequests uncached(Integer uncached) {
    this.uncached = uncached;
    return this;
  }

   /**
   * Total number of requests served from the origin.
   * @return uncached
  **/
  @javax.annotation.Nullable
  public Integer getUncached() {
    return uncached;
  }

  public void setUncached(Integer uncached) {
    this.uncached = uncached;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataZoneAnalyticsApiRequests dataZoneAnalyticsApiRequests = (DataZoneAnalyticsApiRequests) o;
    return Objects.equals(this.all, dataZoneAnalyticsApiRequests.all) &&
        Objects.equals(this.cached, dataZoneAnalyticsApiRequests.cached) &&
        Objects.equals(this.contentType, dataZoneAnalyticsApiRequests.contentType) &&
        Objects.equals(this.country, dataZoneAnalyticsApiRequests.country) &&
        Objects.equals(this.httpStatus, dataZoneAnalyticsApiRequests.httpStatus) &&
        Objects.equals(this.ssl, dataZoneAnalyticsApiRequests.ssl) &&
        Objects.equals(this.sslProtocols, dataZoneAnalyticsApiRequests.sslProtocols) &&
        Objects.equals(this.uncached, dataZoneAnalyticsApiRequests.uncached);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, cached, contentType, country, httpStatus, ssl, sslProtocols, uncached);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataZoneAnalyticsApiRequests {\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    cached: ").append(toIndentedString(cached)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    sslProtocols: ").append(toIndentedString(sslProtocols)).append("\n");
    sb.append("    uncached: ").append(toIndentedString(uncached)).append("\n");
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
    openapiFields.add("all");
    openapiFields.add("cached");
    openapiFields.add("content_type");
    openapiFields.add("country");
    openapiFields.add("http_status");
    openapiFields.add("ssl");
    openapiFields.add("ssl_protocols");
    openapiFields.add("uncached");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataZoneAnalyticsApiRequests
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataZoneAnalyticsApiRequests.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataZoneAnalyticsApiRequests is not found in the empty JSON string", DataZoneAnalyticsApiRequests.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataZoneAnalyticsApiRequests.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataZoneAnalyticsApiRequests` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ssl`
      if (jsonObj.get("ssl") != null && !jsonObj.get("ssl").isJsonNull()) {
        DataZoneAnalyticsApiRequestsSsl.validateJsonElement(jsonObj.get("ssl"));
      }
      // validate the optional field `ssl_protocols`
      if (jsonObj.get("ssl_protocols") != null && !jsonObj.get("ssl_protocols").isJsonNull()) {
        DataZoneAnalyticsApiBandwidthSslProtocols.validateJsonElement(jsonObj.get("ssl_protocols"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataZoneAnalyticsApiRequests.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataZoneAnalyticsApiRequests' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataZoneAnalyticsApiRequests> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataZoneAnalyticsApiRequests.class));

       return (TypeAdapter<T>) new TypeAdapter<DataZoneAnalyticsApiRequests>() {
           @Override
           public void write(JsonWriter out, DataZoneAnalyticsApiRequests value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataZoneAnalyticsApiRequests read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataZoneAnalyticsApiRequests given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataZoneAnalyticsApiRequests
  * @throws IOException if the JSON string is invalid with respect to DataZoneAnalyticsApiRequests
  */
  public static DataZoneAnalyticsApiRequests fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataZoneAnalyticsApiRequests.class);
  }

 /**
  * Convert an instance of DataZoneAnalyticsApiRequests to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

