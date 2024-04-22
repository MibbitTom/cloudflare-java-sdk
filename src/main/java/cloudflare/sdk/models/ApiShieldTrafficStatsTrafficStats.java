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


package cloudflare.sdk.models;

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

import cloudflare.JSON;

/**
 * ApiShieldTrafficStatsTrafficStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ApiShieldTrafficStatsTrafficStats {
  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public static final String SERIALIZED_NAME_PERIOD_SECONDS = "period_seconds";
  @SerializedName(SERIALIZED_NAME_PERIOD_SECONDS)
  private Integer periodSeconds;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private Float requests;

  public ApiShieldTrafficStatsTrafficStats() {
  }

  public ApiShieldTrafficStatsTrafficStats(
     OffsetDateTime lastUpdated, 
     Integer periodSeconds, 
     Float requests
  ) {
    this();
    this.lastUpdated = lastUpdated;
    this.periodSeconds = periodSeconds;
    this.requests = requests;
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
   * The period in seconds these statistics were computed over
   * @return periodSeconds
  **/
  @javax.annotation.Nonnull
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }



   /**
   * The average number of requests seen during this period
   * @return requests
  **/
  @javax.annotation.Nonnull
  public Float getRequests() {
    return requests;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiShieldTrafficStatsTrafficStats apiShieldTrafficStatsTrafficStats = (ApiShieldTrafficStatsTrafficStats) o;
    return Objects.equals(this.lastUpdated, apiShieldTrafficStatsTrafficStats.lastUpdated) &&
        Objects.equals(this.periodSeconds, apiShieldTrafficStatsTrafficStats.periodSeconds) &&
        Objects.equals(this.requests, apiShieldTrafficStatsTrafficStats.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdated, periodSeconds, requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiShieldTrafficStatsTrafficStats {\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
    openapiFields.add("last_updated");
    openapiFields.add("period_seconds");
    openapiFields.add("requests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("last_updated");
    openapiRequiredFields.add("period_seconds");
    openapiRequiredFields.add("requests");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiShieldTrafficStatsTrafficStats
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiShieldTrafficStatsTrafficStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiShieldTrafficStatsTrafficStats is not found in the empty JSON string", ApiShieldTrafficStatsTrafficStats.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiShieldTrafficStatsTrafficStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiShieldTrafficStatsTrafficStats` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApiShieldTrafficStatsTrafficStats.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiShieldTrafficStatsTrafficStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiShieldTrafficStatsTrafficStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiShieldTrafficStatsTrafficStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiShieldTrafficStatsTrafficStats.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiShieldTrafficStatsTrafficStats>() {
           @Override
           public void write(JsonWriter out, ApiShieldTrafficStatsTrafficStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiShieldTrafficStatsTrafficStats read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiShieldTrafficStatsTrafficStats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiShieldTrafficStatsTrafficStats
  * @throws IOException if the JSON string is invalid with respect to ApiShieldTrafficStatsTrafficStats
  */
  public static ApiShieldTrafficStatsTrafficStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiShieldTrafficStatsTrafficStats.class);
  }

 /**
  * Convert an instance of ApiShieldTrafficStatsTrafficStats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

