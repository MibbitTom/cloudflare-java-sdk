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
import cloudflare.sdk.models.ApiShieldTrafficStatsTrafficStats;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * ApiShieldTrafficStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ApiShieldTrafficStats {
  public static final String SERIALIZED_NAME_TRAFFIC_STATS = "traffic_stats";
  @SerializedName(SERIALIZED_NAME_TRAFFIC_STATS)
  private ApiShieldTrafficStatsTrafficStats trafficStats;

  public ApiShieldTrafficStats() {
  }

  public ApiShieldTrafficStats trafficStats(ApiShieldTrafficStatsTrafficStats trafficStats) {
    this.trafficStats = trafficStats;
    return this;
  }

   /**
   * Get trafficStats
   * @return trafficStats
  **/
  @javax.annotation.Nullable
  public ApiShieldTrafficStatsTrafficStats getTrafficStats() {
    return trafficStats;
  }

  public void setTrafficStats(ApiShieldTrafficStatsTrafficStats trafficStats) {
    this.trafficStats = trafficStats;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiShieldTrafficStats apiShieldTrafficStats = (ApiShieldTrafficStats) o;
    return Objects.equals(this.trafficStats, apiShieldTrafficStats.trafficStats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trafficStats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiShieldTrafficStats {\n");
    sb.append("    trafficStats: ").append(toIndentedString(trafficStats)).append("\n");
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
    openapiFields.add("traffic_stats");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiShieldTrafficStats
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiShieldTrafficStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiShieldTrafficStats is not found in the empty JSON string", ApiShieldTrafficStats.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiShieldTrafficStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiShieldTrafficStats` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `traffic_stats`
      if (jsonObj.get("traffic_stats") != null && !jsonObj.get("traffic_stats").isJsonNull()) {
        ApiShieldTrafficStatsTrafficStats.validateJsonElement(jsonObj.get("traffic_stats"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiShieldTrafficStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiShieldTrafficStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiShieldTrafficStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiShieldTrafficStats.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiShieldTrafficStats>() {
           @Override
           public void write(JsonWriter out, ApiShieldTrafficStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiShieldTrafficStats read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiShieldTrafficStats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiShieldTrafficStats
  * @throws IOException if the JSON string is invalid with respect to ApiShieldTrafficStats
  */
  public static ApiShieldTrafficStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiShieldTrafficStats.class);
  }

 /**
  * Convert an instance of ApiShieldTrafficStats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
