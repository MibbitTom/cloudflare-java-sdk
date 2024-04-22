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
 * ApiShieldOperationFeatureThresholdsThresholds
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ApiShieldOperationFeatureThresholdsThresholds {
  public static final String SERIALIZED_NAME_AUTH_ID_TOKENS = "auth_id_tokens";
  @SerializedName(SERIALIZED_NAME_AUTH_ID_TOKENS)
  private Integer authIdTokens;

  public static final String SERIALIZED_NAME_DATA_POINTS = "data_points";
  @SerializedName(SERIALIZED_NAME_DATA_POINTS)
  private Integer dataPoints;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public static final String SERIALIZED_NAME_P50 = "p50";
  @SerializedName(SERIALIZED_NAME_P50)
  private Integer p50;

  public static final String SERIALIZED_NAME_P90 = "p90";
  @SerializedName(SERIALIZED_NAME_P90)
  private Integer p90;

  public static final String SERIALIZED_NAME_P99 = "p99";
  @SerializedName(SERIALIZED_NAME_P99)
  private Integer p99;

  public static final String SERIALIZED_NAME_PERIOD_SECONDS = "period_seconds";
  @SerializedName(SERIALIZED_NAME_PERIOD_SECONDS)
  private Integer periodSeconds;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private Integer requests;

  public static final String SERIALIZED_NAME_SUGGESTED_THRESHOLD = "suggested_threshold";
  @SerializedName(SERIALIZED_NAME_SUGGESTED_THRESHOLD)
  private Integer suggestedThreshold;

  public ApiShieldOperationFeatureThresholdsThresholds() {
  }

  public ApiShieldOperationFeatureThresholdsThresholds(
     Integer authIdTokens, 
     Integer dataPoints, 
     OffsetDateTime lastUpdated, 
     Integer p50, 
     Integer p90, 
     Integer p99, 
     Integer periodSeconds, 
     Integer requests, 
     Integer suggestedThreshold
  ) {
    this();
    this.authIdTokens = authIdTokens;
    this.dataPoints = dataPoints;
    this.lastUpdated = lastUpdated;
    this.p50 = p50;
    this.p90 = p90;
    this.p99 = p99;
    this.periodSeconds = periodSeconds;
    this.requests = requests;
    this.suggestedThreshold = suggestedThreshold;
  }

   /**
   * The total number of auth-ids seen across this calculation.
   * @return authIdTokens
  **/
  @javax.annotation.Nullable
  public Integer getAuthIdTokens() {
    return authIdTokens;
  }



   /**
   * The number of data points used for the threshold suggestion calculation.
   * @return dataPoints
  **/
  @javax.annotation.Nullable
  public Integer getDataPoints() {
    return dataPoints;
  }



   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }



   /**
   * The p50 quantile of requests (in period_seconds).
   * @return p50
  **/
  @javax.annotation.Nullable
  public Integer getP50() {
    return p50;
  }



   /**
   * The p90 quantile of requests (in period_seconds).
   * @return p90
  **/
  @javax.annotation.Nullable
  public Integer getP90() {
    return p90;
  }



   /**
   * The p99 quantile of requests (in period_seconds).
   * @return p99
  **/
  @javax.annotation.Nullable
  public Integer getP99() {
    return p99;
  }



   /**
   * The period over which this threshold is suggested.
   * @return periodSeconds
  **/
  @javax.annotation.Nullable
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }



   /**
   * The estimated number of requests covered by these calculations.
   * @return requests
  **/
  @javax.annotation.Nullable
  public Integer getRequests() {
    return requests;
  }



   /**
   * The suggested threshold in requests done by the same auth_id or period_seconds.
   * @return suggestedThreshold
  **/
  @javax.annotation.Nullable
  public Integer getSuggestedThreshold() {
    return suggestedThreshold;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiShieldOperationFeatureThresholdsThresholds apiShieldOperationFeatureThresholdsThresholds = (ApiShieldOperationFeatureThresholdsThresholds) o;
    return Objects.equals(this.authIdTokens, apiShieldOperationFeatureThresholdsThresholds.authIdTokens) &&
        Objects.equals(this.dataPoints, apiShieldOperationFeatureThresholdsThresholds.dataPoints) &&
        Objects.equals(this.lastUpdated, apiShieldOperationFeatureThresholdsThresholds.lastUpdated) &&
        Objects.equals(this.p50, apiShieldOperationFeatureThresholdsThresholds.p50) &&
        Objects.equals(this.p90, apiShieldOperationFeatureThresholdsThresholds.p90) &&
        Objects.equals(this.p99, apiShieldOperationFeatureThresholdsThresholds.p99) &&
        Objects.equals(this.periodSeconds, apiShieldOperationFeatureThresholdsThresholds.periodSeconds) &&
        Objects.equals(this.requests, apiShieldOperationFeatureThresholdsThresholds.requests) &&
        Objects.equals(this.suggestedThreshold, apiShieldOperationFeatureThresholdsThresholds.suggestedThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authIdTokens, dataPoints, lastUpdated, p50, p90, p99, periodSeconds, requests, suggestedThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiShieldOperationFeatureThresholdsThresholds {\n");
    sb.append("    authIdTokens: ").append(toIndentedString(authIdTokens)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    p50: ").append(toIndentedString(p50)).append("\n");
    sb.append("    p90: ").append(toIndentedString(p90)).append("\n");
    sb.append("    p99: ").append(toIndentedString(p99)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    suggestedThreshold: ").append(toIndentedString(suggestedThreshold)).append("\n");
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
    openapiFields.add("auth_id_tokens");
    openapiFields.add("data_points");
    openapiFields.add("last_updated");
    openapiFields.add("p50");
    openapiFields.add("p90");
    openapiFields.add("p99");
    openapiFields.add("period_seconds");
    openapiFields.add("requests");
    openapiFields.add("suggested_threshold");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiShieldOperationFeatureThresholdsThresholds
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiShieldOperationFeatureThresholdsThresholds.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiShieldOperationFeatureThresholdsThresholds is not found in the empty JSON string", ApiShieldOperationFeatureThresholdsThresholds.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiShieldOperationFeatureThresholdsThresholds.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiShieldOperationFeatureThresholdsThresholds` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiShieldOperationFeatureThresholdsThresholds.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiShieldOperationFeatureThresholdsThresholds' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiShieldOperationFeatureThresholdsThresholds> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiShieldOperationFeatureThresholdsThresholds.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiShieldOperationFeatureThresholdsThresholds>() {
           @Override
           public void write(JsonWriter out, ApiShieldOperationFeatureThresholdsThresholds value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiShieldOperationFeatureThresholdsThresholds read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiShieldOperationFeatureThresholdsThresholds given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiShieldOperationFeatureThresholdsThresholds
  * @throws IOException if the JSON string is invalid with respect to ApiShieldOperationFeatureThresholdsThresholds
  */
  public static ApiShieldOperationFeatureThresholdsThresholds fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiShieldOperationFeatureThresholdsThresholds.class);
  }

 /**
  * Convert an instance of ApiShieldOperationFeatureThresholdsThresholds to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

