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
import org.openapitools.client.model.DataZoneAnalyticsApiBandwidth;
import org.openapitools.client.model.DataZoneAnalyticsApiPageviews;
import org.openapitools.client.model.DataZoneAnalyticsApiRequests;
import org.openapitools.client.model.DataZoneAnalyticsApiSince;
import org.openapitools.client.model.DataZoneAnalyticsApiThreats;
import org.openapitools.client.model.DataZoneAnalyticsApiUniques;
import org.openapitools.client.model.DataZoneAnalyticsApiUntil;

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
 * DataZoneAnalyticsApiTimeseriesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DataZoneAnalyticsApiTimeseriesInner {
  public static final String SERIALIZED_NAME_BANDWIDTH = "bandwidth";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH)
  private DataZoneAnalyticsApiBandwidth bandwidth;

  public static final String SERIALIZED_NAME_PAGEVIEWS = "pageviews";
  @SerializedName(SERIALIZED_NAME_PAGEVIEWS)
  private DataZoneAnalyticsApiPageviews pageviews;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private DataZoneAnalyticsApiRequests requests;

  public static final String SERIALIZED_NAME_SINCE = "since";
  @SerializedName(SERIALIZED_NAME_SINCE)
  private DataZoneAnalyticsApiSince since = -10080;

  public static final String SERIALIZED_NAME_THREATS = "threats";
  @SerializedName(SERIALIZED_NAME_THREATS)
  private DataZoneAnalyticsApiThreats threats;

  public static final String SERIALIZED_NAME_UNIQUES = "uniques";
  @SerializedName(SERIALIZED_NAME_UNIQUES)
  private DataZoneAnalyticsApiUniques uniques;

  public static final String SERIALIZED_NAME_UNTIL = "until";
  @SerializedName(SERIALIZED_NAME_UNTIL)
  private DataZoneAnalyticsApiUntil until = 0;

  public DataZoneAnalyticsApiTimeseriesInner() {
  }

  public DataZoneAnalyticsApiTimeseriesInner bandwidth(DataZoneAnalyticsApiBandwidth bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @javax.annotation.Nullable
  public DataZoneAnalyticsApiBandwidth getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(DataZoneAnalyticsApiBandwidth bandwidth) {
    this.bandwidth = bandwidth;
  }


  public DataZoneAnalyticsApiTimeseriesInner pageviews(DataZoneAnalyticsApiPageviews pageviews) {
    this.pageviews = pageviews;
    return this;
  }

   /**
   * Get pageviews
   * @return pageviews
  **/
  @javax.annotation.Nullable
  public DataZoneAnalyticsApiPageviews getPageviews() {
    return pageviews;
  }

  public void setPageviews(DataZoneAnalyticsApiPageviews pageviews) {
    this.pageviews = pageviews;
  }


  public DataZoneAnalyticsApiTimeseriesInner requests(DataZoneAnalyticsApiRequests requests) {
    this.requests = requests;
    return this;
  }

   /**
   * Get requests
   * @return requests
  **/
  @javax.annotation.Nullable
  public DataZoneAnalyticsApiRequests getRequests() {
    return requests;
  }

  public void setRequests(DataZoneAnalyticsApiRequests requests) {
    this.requests = requests;
  }


  public DataZoneAnalyticsApiTimeseriesInner since(DataZoneAnalyticsApiSince since) {
    this.since = since;
    return this;
  }

   /**
   * Get since
   * @return since
  **/
  @javax.annotation.Nullable
  public DataZoneAnalyticsApiSince getSince() {
    return since;
  }

  public void setSince(DataZoneAnalyticsApiSince since) {
    this.since = since;
  }


  public DataZoneAnalyticsApiTimeseriesInner threats(DataZoneAnalyticsApiThreats threats) {
    this.threats = threats;
    return this;
  }

   /**
   * Get threats
   * @return threats
  **/
  @javax.annotation.Nullable
  public DataZoneAnalyticsApiThreats getThreats() {
    return threats;
  }

  public void setThreats(DataZoneAnalyticsApiThreats threats) {
    this.threats = threats;
  }


  public DataZoneAnalyticsApiTimeseriesInner uniques(DataZoneAnalyticsApiUniques uniques) {
    this.uniques = uniques;
    return this;
  }

   /**
   * Get uniques
   * @return uniques
  **/
  @javax.annotation.Nullable
  public DataZoneAnalyticsApiUniques getUniques() {
    return uniques;
  }

  public void setUniques(DataZoneAnalyticsApiUniques uniques) {
    this.uniques = uniques;
  }


  public DataZoneAnalyticsApiTimeseriesInner until(DataZoneAnalyticsApiUntil until) {
    this.until = until;
    return this;
  }

   /**
   * Get until
   * @return until
  **/
  @javax.annotation.Nullable
  public DataZoneAnalyticsApiUntil getUntil() {
    return until;
  }

  public void setUntil(DataZoneAnalyticsApiUntil until) {
    this.until = until;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataZoneAnalyticsApiTimeseriesInner dataZoneAnalyticsApiTimeseriesInner = (DataZoneAnalyticsApiTimeseriesInner) o;
    return Objects.equals(this.bandwidth, dataZoneAnalyticsApiTimeseriesInner.bandwidth) &&
        Objects.equals(this.pageviews, dataZoneAnalyticsApiTimeseriesInner.pageviews) &&
        Objects.equals(this.requests, dataZoneAnalyticsApiTimeseriesInner.requests) &&
        Objects.equals(this.since, dataZoneAnalyticsApiTimeseriesInner.since) &&
        Objects.equals(this.threats, dataZoneAnalyticsApiTimeseriesInner.threats) &&
        Objects.equals(this.uniques, dataZoneAnalyticsApiTimeseriesInner.uniques) &&
        Objects.equals(this.until, dataZoneAnalyticsApiTimeseriesInner.until);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth, pageviews, requests, since, threats, uniques, until);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataZoneAnalyticsApiTimeseriesInner {\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    pageviews: ").append(toIndentedString(pageviews)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    threats: ").append(toIndentedString(threats)).append("\n");
    sb.append("    uniques: ").append(toIndentedString(uniques)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
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
    openapiFields.add("bandwidth");
    openapiFields.add("pageviews");
    openapiFields.add("requests");
    openapiFields.add("since");
    openapiFields.add("threats");
    openapiFields.add("uniques");
    openapiFields.add("until");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataZoneAnalyticsApiTimeseriesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataZoneAnalyticsApiTimeseriesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataZoneAnalyticsApiTimeseriesInner is not found in the empty JSON string", DataZoneAnalyticsApiTimeseriesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataZoneAnalyticsApiTimeseriesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataZoneAnalyticsApiTimeseriesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `bandwidth`
      if (jsonObj.get("bandwidth") != null && !jsonObj.get("bandwidth").isJsonNull()) {
        DataZoneAnalyticsApiBandwidth.validateJsonElement(jsonObj.get("bandwidth"));
      }
      // validate the optional field `pageviews`
      if (jsonObj.get("pageviews") != null && !jsonObj.get("pageviews").isJsonNull()) {
        DataZoneAnalyticsApiPageviews.validateJsonElement(jsonObj.get("pageviews"));
      }
      // validate the optional field `requests`
      if (jsonObj.get("requests") != null && !jsonObj.get("requests").isJsonNull()) {
        DataZoneAnalyticsApiRequests.validateJsonElement(jsonObj.get("requests"));
      }
      // validate the optional field `since`
      if (jsonObj.get("since") != null && !jsonObj.get("since").isJsonNull()) {
        DataZoneAnalyticsApiSince.validateJsonElement(jsonObj.get("since"));
      }
      // validate the optional field `threats`
      if (jsonObj.get("threats") != null && !jsonObj.get("threats").isJsonNull()) {
        DataZoneAnalyticsApiThreats.validateJsonElement(jsonObj.get("threats"));
      }
      // validate the optional field `uniques`
      if (jsonObj.get("uniques") != null && !jsonObj.get("uniques").isJsonNull()) {
        DataZoneAnalyticsApiUniques.validateJsonElement(jsonObj.get("uniques"));
      }
      // validate the optional field `until`
      if (jsonObj.get("until") != null && !jsonObj.get("until").isJsonNull()) {
        DataZoneAnalyticsApiUntil.validateJsonElement(jsonObj.get("until"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataZoneAnalyticsApiTimeseriesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataZoneAnalyticsApiTimeseriesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataZoneAnalyticsApiTimeseriesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataZoneAnalyticsApiTimeseriesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DataZoneAnalyticsApiTimeseriesInner>() {
           @Override
           public void write(JsonWriter out, DataZoneAnalyticsApiTimeseriesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataZoneAnalyticsApiTimeseriesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataZoneAnalyticsApiTimeseriesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataZoneAnalyticsApiTimeseriesInner
  * @throws IOException if the JSON string is invalid with respect to DataZoneAnalyticsApiTimeseriesInner
  */
  public static DataZoneAnalyticsApiTimeseriesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataZoneAnalyticsApiTimeseriesInner.class);
  }

 /**
  * Convert an instance of DataZoneAnalyticsApiTimeseriesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

