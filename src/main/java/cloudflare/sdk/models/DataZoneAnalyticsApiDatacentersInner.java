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
import cloudflare.sdk.models.DataZoneAnalyticsApiTimeseriesByColoInner;
import cloudflare.sdk.models.DataZoneAnalyticsApiTotalsByColo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * DataZoneAnalyticsApiDatacentersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DataZoneAnalyticsApiDatacentersInner {
  public static final String SERIALIZED_NAME_COLO_ID = "colo_id";
  @SerializedName(SERIALIZED_NAME_COLO_ID)
  private String coloId;

  public static final String SERIALIZED_NAME_TIMESERIES = "timeseries";
  @SerializedName(SERIALIZED_NAME_TIMESERIES)
  private List<DataZoneAnalyticsApiTimeseriesByColoInner> timeseries = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTALS = "totals";
  @SerializedName(SERIALIZED_NAME_TOTALS)
  private DataZoneAnalyticsApiTotalsByColo totals;

  public DataZoneAnalyticsApiDatacentersInner() {
  }

  public DataZoneAnalyticsApiDatacentersInner coloId(String coloId) {
    this.coloId = coloId;
    return this;
  }

   /**
   * The airport code identifer for the co-location.
   * @return coloId
  **/
  @javax.annotation.Nullable
  public String getColoId() {
    return coloId;
  }

  public void setColoId(String coloId) {
    this.coloId = coloId;
  }


  public DataZoneAnalyticsApiDatacentersInner timeseries(List<DataZoneAnalyticsApiTimeseriesByColoInner> timeseries) {
    this.timeseries = timeseries;
    return this;
  }

  public DataZoneAnalyticsApiDatacentersInner addTimeseriesItem(DataZoneAnalyticsApiTimeseriesByColoInner timeseriesItem) {
    if (this.timeseries == null) {
      this.timeseries = new ArrayList<>();
    }
    this.timeseries.add(timeseriesItem);
    return this;
  }

   /**
   * Time deltas containing metadata about each bucket of time. The number of buckets (resolution) is determined by the amount of time between the since and until parameters.
   * @return timeseries
  **/
  @javax.annotation.Nullable
  public List<DataZoneAnalyticsApiTimeseriesByColoInner> getTimeseries() {
    return timeseries;
  }

  public void setTimeseries(List<DataZoneAnalyticsApiTimeseriesByColoInner> timeseries) {
    this.timeseries = timeseries;
  }


  public DataZoneAnalyticsApiDatacentersInner totals(DataZoneAnalyticsApiTotalsByColo totals) {
    this.totals = totals;
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @javax.annotation.Nullable
  public DataZoneAnalyticsApiTotalsByColo getTotals() {
    return totals;
  }

  public void setTotals(DataZoneAnalyticsApiTotalsByColo totals) {
    this.totals = totals;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataZoneAnalyticsApiDatacentersInner dataZoneAnalyticsApiDatacentersInner = (DataZoneAnalyticsApiDatacentersInner) o;
    return Objects.equals(this.coloId, dataZoneAnalyticsApiDatacentersInner.coloId) &&
        Objects.equals(this.timeseries, dataZoneAnalyticsApiDatacentersInner.timeseries) &&
        Objects.equals(this.totals, dataZoneAnalyticsApiDatacentersInner.totals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coloId, timeseries, totals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataZoneAnalyticsApiDatacentersInner {\n");
    sb.append("    coloId: ").append(toIndentedString(coloId)).append("\n");
    sb.append("    timeseries: ").append(toIndentedString(timeseries)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
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
    openapiFields.add("colo_id");
    openapiFields.add("timeseries");
    openapiFields.add("totals");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataZoneAnalyticsApiDatacentersInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataZoneAnalyticsApiDatacentersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataZoneAnalyticsApiDatacentersInner is not found in the empty JSON string", DataZoneAnalyticsApiDatacentersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataZoneAnalyticsApiDatacentersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataZoneAnalyticsApiDatacentersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("colo_id") != null && !jsonObj.get("colo_id").isJsonNull()) && !jsonObj.get("colo_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `colo_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("colo_id").toString()));
      }
      if (jsonObj.get("timeseries") != null && !jsonObj.get("timeseries").isJsonNull()) {
        JsonArray jsonArraytimeseries = jsonObj.getAsJsonArray("timeseries");
        if (jsonArraytimeseries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("timeseries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `timeseries` to be an array in the JSON string but got `%s`", jsonObj.get("timeseries").toString()));
          }

          // validate the optional field `timeseries` (array)
          for (int i = 0; i < jsonArraytimeseries.size(); i++) {
            DataZoneAnalyticsApiTimeseriesByColoInner.validateJsonElement(jsonArraytimeseries.get(i));
          };
        }
      }
      // validate the optional field `totals`
      if (jsonObj.get("totals") != null && !jsonObj.get("totals").isJsonNull()) {
        DataZoneAnalyticsApiTotalsByColo.validateJsonElement(jsonObj.get("totals"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataZoneAnalyticsApiDatacentersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataZoneAnalyticsApiDatacentersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataZoneAnalyticsApiDatacentersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataZoneAnalyticsApiDatacentersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DataZoneAnalyticsApiDatacentersInner>() {
           @Override
           public void write(JsonWriter out, DataZoneAnalyticsApiDatacentersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataZoneAnalyticsApiDatacentersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataZoneAnalyticsApiDatacentersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataZoneAnalyticsApiDatacentersInner
  * @throws IOException if the JSON string is invalid with respect to DataZoneAnalyticsApiDatacentersInner
  */
  public static DataZoneAnalyticsApiDatacentersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataZoneAnalyticsApiDatacentersInner.class);
  }

 /**
  * Convert an instance of DataZoneAnalyticsApiDatacentersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

