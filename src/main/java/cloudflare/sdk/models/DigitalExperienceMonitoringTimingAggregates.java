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
import cloudflare.sdk.models.DigitalExperienceMonitoringAggregateStat;
import cloudflare.sdk.models.DigitalExperienceMonitoringTimingAggregatesOverTime;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * DigitalExperienceMonitoringTimingAggregates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DigitalExperienceMonitoringTimingAggregates {
  public static final String SERIALIZED_NAME_AVG_MS = "avgMs";
  @SerializedName(SERIALIZED_NAME_AVG_MS)
  private Integer avgMs;

  public static final String SERIALIZED_NAME_HISTORY = "history";
  @SerializedName(SERIALIZED_NAME_HISTORY)
  private List<DigitalExperienceMonitoringAggregateStat> history = new ArrayList<>();

  public static final String SERIALIZED_NAME_OVER_TIME = "overTime";
  @SerializedName(SERIALIZED_NAME_OVER_TIME)
  private DigitalExperienceMonitoringTimingAggregatesOverTime overTime;

  public DigitalExperienceMonitoringTimingAggregates() {
  }

  public DigitalExperienceMonitoringTimingAggregates avgMs(Integer avgMs) {
    this.avgMs = avgMs;
    return this;
  }

   /**
   * Get avgMs
   * @return avgMs
  **/
  @javax.annotation.Nullable
  public Integer getAvgMs() {
    return avgMs;
  }

  public void setAvgMs(Integer avgMs) {
    this.avgMs = avgMs;
  }


  public DigitalExperienceMonitoringTimingAggregates history(List<DigitalExperienceMonitoringAggregateStat> history) {
    this.history = history;
    return this;
  }

  public DigitalExperienceMonitoringTimingAggregates addHistoryItem(DigitalExperienceMonitoringAggregateStat historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @javax.annotation.Nonnull
  public List<DigitalExperienceMonitoringAggregateStat> getHistory() {
    return history;
  }

  public void setHistory(List<DigitalExperienceMonitoringAggregateStat> history) {
    this.history = history;
  }


  public DigitalExperienceMonitoringTimingAggregates overTime(DigitalExperienceMonitoringTimingAggregatesOverTime overTime) {
    this.overTime = overTime;
    return this;
  }

   /**
   * Get overTime
   * @return overTime
  **/
  @javax.annotation.Nullable
  public DigitalExperienceMonitoringTimingAggregatesOverTime getOverTime() {
    return overTime;
  }

  public void setOverTime(DigitalExperienceMonitoringTimingAggregatesOverTime overTime) {
    this.overTime = overTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalExperienceMonitoringTimingAggregates digitalExperienceMonitoringTimingAggregates = (DigitalExperienceMonitoringTimingAggregates) o;
    return Objects.equals(this.avgMs, digitalExperienceMonitoringTimingAggregates.avgMs) &&
        Objects.equals(this.history, digitalExperienceMonitoringTimingAggregates.history) &&
        Objects.equals(this.overTime, digitalExperienceMonitoringTimingAggregates.overTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgMs, history, overTime);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalExperienceMonitoringTimingAggregates {\n");
    sb.append("    avgMs: ").append(toIndentedString(avgMs)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    overTime: ").append(toIndentedString(overTime)).append("\n");
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
    openapiFields.add("avgMs");
    openapiFields.add("history");
    openapiFields.add("overTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("history");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DigitalExperienceMonitoringTimingAggregates
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DigitalExperienceMonitoringTimingAggregates.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DigitalExperienceMonitoringTimingAggregates is not found in the empty JSON string", DigitalExperienceMonitoringTimingAggregates.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DigitalExperienceMonitoringTimingAggregates.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DigitalExperienceMonitoringTimingAggregates` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DigitalExperienceMonitoringTimingAggregates.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("history").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `history` to be an array in the JSON string but got `%s`", jsonObj.get("history").toString()));
      }

      JsonArray jsonArrayhistory = jsonObj.getAsJsonArray("history");
      // validate the required field `history` (array)
      for (int i = 0; i < jsonArrayhistory.size(); i++) {
        DigitalExperienceMonitoringAggregateStat.validateJsonElement(jsonArrayhistory.get(i));
      };
      // validate the optional field `overTime`
      if (jsonObj.get("overTime") != null && !jsonObj.get("overTime").isJsonNull()) {
        DigitalExperienceMonitoringTimingAggregatesOverTime.validateJsonElement(jsonObj.get("overTime"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DigitalExperienceMonitoringTimingAggregates.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DigitalExperienceMonitoringTimingAggregates' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DigitalExperienceMonitoringTimingAggregates> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DigitalExperienceMonitoringTimingAggregates.class));

       return (TypeAdapter<T>) new TypeAdapter<DigitalExperienceMonitoringTimingAggregates>() {
           @Override
           public void write(JsonWriter out, DigitalExperienceMonitoringTimingAggregates value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DigitalExperienceMonitoringTimingAggregates read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DigitalExperienceMonitoringTimingAggregates given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DigitalExperienceMonitoringTimingAggregates
  * @throws IOException if the JSON string is invalid with respect to DigitalExperienceMonitoringTimingAggregates
  */
  public static DigitalExperienceMonitoringTimingAggregates fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DigitalExperienceMonitoringTimingAggregates.class);
  }

 /**
  * Convert an instance of DigitalExperienceMonitoringTimingAggregates to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
