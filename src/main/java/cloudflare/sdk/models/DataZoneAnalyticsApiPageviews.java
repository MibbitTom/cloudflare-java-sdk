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
 * Breakdown of totals for pageviews.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DataZoneAnalyticsApiPageviews {
  public static final String SERIALIZED_NAME_ALL = "all";
  @SerializedName(SERIALIZED_NAME_ALL)
  private Integer all;

  public static final String SERIALIZED_NAME_SEARCH_ENGINE = "search_engine";
  @SerializedName(SERIALIZED_NAME_SEARCH_ENGINE)
  private Object searchEngine;

  public DataZoneAnalyticsApiPageviews() {
  }

  public DataZoneAnalyticsApiPageviews all(Integer all) {
    this.all = all;
    return this;
  }

   /**
   * The total number of pageviews served within the time range.
   * @return all
  **/
  @javax.annotation.Nullable
  public Integer getAll() {
    return all;
  }

  public void setAll(Integer all) {
    this.all = all;
  }


  public DataZoneAnalyticsApiPageviews searchEngine(Object searchEngine) {
    this.searchEngine = searchEngine;
    return this;
  }

   /**
   * A variable list of key/value pairs representing the search engine and number of hits.
   * @return searchEngine
  **/
  @javax.annotation.Nullable
  public Object getSearchEngine() {
    return searchEngine;
  }

  public void setSearchEngine(Object searchEngine) {
    this.searchEngine = searchEngine;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataZoneAnalyticsApiPageviews dataZoneAnalyticsApiPageviews = (DataZoneAnalyticsApiPageviews) o;
    return Objects.equals(this.all, dataZoneAnalyticsApiPageviews.all) &&
        Objects.equals(this.searchEngine, dataZoneAnalyticsApiPageviews.searchEngine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, searchEngine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataZoneAnalyticsApiPageviews {\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    searchEngine: ").append(toIndentedString(searchEngine)).append("\n");
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
    openapiFields.add("search_engine");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataZoneAnalyticsApiPageviews
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataZoneAnalyticsApiPageviews.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataZoneAnalyticsApiPageviews is not found in the empty JSON string", DataZoneAnalyticsApiPageviews.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataZoneAnalyticsApiPageviews.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataZoneAnalyticsApiPageviews` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataZoneAnalyticsApiPageviews.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataZoneAnalyticsApiPageviews' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataZoneAnalyticsApiPageviews> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataZoneAnalyticsApiPageviews.class));

       return (TypeAdapter<T>) new TypeAdapter<DataZoneAnalyticsApiPageviews>() {
           @Override
           public void write(JsonWriter out, DataZoneAnalyticsApiPageviews value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataZoneAnalyticsApiPageviews read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataZoneAnalyticsApiPageviews given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataZoneAnalyticsApiPageviews
  * @throws IOException if the JSON string is invalid with respect to DataZoneAnalyticsApiPageviews
  */
  public static DataZoneAnalyticsApiPageviews fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataZoneAnalyticsApiPageviews.class);
  }

 /**
  * Convert an instance of DataZoneAnalyticsApiPageviews to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

