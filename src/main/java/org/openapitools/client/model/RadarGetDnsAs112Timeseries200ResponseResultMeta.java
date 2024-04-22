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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo;
import org.openapitools.client.model.RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaDateRangeInner;

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
 * RadarGetDnsAs112Timeseries200ResponseResultMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetDnsAs112Timeseries200ResponseResultMeta {
  public static final String SERIALIZED_NAME_AGG_INTERVAL = "aggInterval";
  @SerializedName(SERIALIZED_NAME_AGG_INTERVAL)
  private String aggInterval;

  public static final String SERIALIZED_NAME_CONFIDENCE_INFO = "confidenceInfo";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE_INFO)
  private RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo confidenceInfo;

  public static final String SERIALIZED_NAME_DATE_RANGE = "dateRange";
  @SerializedName(SERIALIZED_NAME_DATE_RANGE)
  private List<RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaDateRangeInner> dateRange = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public RadarGetDnsAs112Timeseries200ResponseResultMeta() {
  }

  public RadarGetDnsAs112Timeseries200ResponseResultMeta aggInterval(String aggInterval) {
    this.aggInterval = aggInterval;
    return this;
  }

   /**
   * Get aggInterval
   * @return aggInterval
  **/
  @javax.annotation.Nonnull
  public String getAggInterval() {
    return aggInterval;
  }

  public void setAggInterval(String aggInterval) {
    this.aggInterval = aggInterval;
  }


  public RadarGetDnsAs112Timeseries200ResponseResultMeta confidenceInfo(RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo confidenceInfo) {
    this.confidenceInfo = confidenceInfo;
    return this;
  }

   /**
   * Get confidenceInfo
   * @return confidenceInfo
  **/
  @javax.annotation.Nullable
  public RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo getConfidenceInfo() {
    return confidenceInfo;
  }

  public void setConfidenceInfo(RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo confidenceInfo) {
    this.confidenceInfo = confidenceInfo;
  }


  public RadarGetDnsAs112Timeseries200ResponseResultMeta dateRange(List<RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaDateRangeInner> dateRange) {
    this.dateRange = dateRange;
    return this;
  }

  public RadarGetDnsAs112Timeseries200ResponseResultMeta addDateRangeItem(RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaDateRangeInner dateRangeItem) {
    if (this.dateRange == null) {
      this.dateRange = new ArrayList<>();
    }
    this.dateRange.add(dateRangeItem);
    return this;
  }

   /**
   * Get dateRange
   * @return dateRange
  **/
  @javax.annotation.Nonnull
  public List<RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaDateRangeInner> getDateRange() {
    return dateRange;
  }

  public void setDateRange(List<RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaDateRangeInner> dateRange) {
    this.dateRange = dateRange;
  }


  public RadarGetDnsAs112Timeseries200ResponseResultMeta lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetDnsAs112Timeseries200ResponseResultMeta radarGetDnsAs112Timeseries200ResponseResultMeta = (RadarGetDnsAs112Timeseries200ResponseResultMeta) o;
    return Objects.equals(this.aggInterval, radarGetDnsAs112Timeseries200ResponseResultMeta.aggInterval) &&
        Objects.equals(this.confidenceInfo, radarGetDnsAs112Timeseries200ResponseResultMeta.confidenceInfo) &&
        Objects.equals(this.dateRange, radarGetDnsAs112Timeseries200ResponseResultMeta.dateRange) &&
        Objects.equals(this.lastUpdated, radarGetDnsAs112Timeseries200ResponseResultMeta.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggInterval, confidenceInfo, dateRange, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetDnsAs112Timeseries200ResponseResultMeta {\n");
    sb.append("    aggInterval: ").append(toIndentedString(aggInterval)).append("\n");
    sb.append("    confidenceInfo: ").append(toIndentedString(confidenceInfo)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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
    openapiFields.add("aggInterval");
    openapiFields.add("confidenceInfo");
    openapiFields.add("dateRange");
    openapiFields.add("lastUpdated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("aggInterval");
    openapiRequiredFields.add("dateRange");
    openapiRequiredFields.add("lastUpdated");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetDnsAs112Timeseries200ResponseResultMeta
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetDnsAs112Timeseries200ResponseResultMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetDnsAs112Timeseries200ResponseResultMeta is not found in the empty JSON string", RadarGetDnsAs112Timeseries200ResponseResultMeta.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetDnsAs112Timeseries200ResponseResultMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetDnsAs112Timeseries200ResponseResultMeta` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetDnsAs112Timeseries200ResponseResultMeta.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("aggInterval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aggInterval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aggInterval").toString()));
      }
      // validate the optional field `confidenceInfo`
      if (jsonObj.get("confidenceInfo") != null && !jsonObj.get("confidenceInfo").isJsonNull()) {
        RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo.validateJsonElement(jsonObj.get("confidenceInfo"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("dateRange").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateRange` to be an array in the JSON string but got `%s`", jsonObj.get("dateRange").toString()));
      }

      JsonArray jsonArraydateRange = jsonObj.getAsJsonArray("dateRange");
      // validate the required field `dateRange` (array)
      for (int i = 0; i < jsonArraydateRange.size(); i++) {
        RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaDateRangeInner.validateJsonElement(jsonArraydateRange.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetDnsAs112Timeseries200ResponseResultMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetDnsAs112Timeseries200ResponseResultMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetDnsAs112Timeseries200ResponseResultMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetDnsAs112Timeseries200ResponseResultMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetDnsAs112Timeseries200ResponseResultMeta>() {
           @Override
           public void write(JsonWriter out, RadarGetDnsAs112Timeseries200ResponseResultMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetDnsAs112Timeseries200ResponseResultMeta read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetDnsAs112Timeseries200ResponseResultMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetDnsAs112Timeseries200ResponseResultMeta
  * @throws IOException if the JSON string is invalid with respect to RadarGetDnsAs112Timeseries200ResponseResultMeta
  */
  public static RadarGetDnsAs112Timeseries200ResponseResultMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetDnsAs112Timeseries200ResponseResultMeta.class);
  }

 /**
  * Convert an instance of RadarGetDnsAs112Timeseries200ResponseResultMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

