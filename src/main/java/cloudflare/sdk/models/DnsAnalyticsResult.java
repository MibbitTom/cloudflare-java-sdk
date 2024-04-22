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
import cloudflare.sdk.models.DnsAnalyticsDataInner;
import cloudflare.sdk.models.DnsAnalyticsQuery;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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
 * DnsAnalyticsResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DnsAnalyticsResult {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<DnsAnalyticsDataInner> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATA_LAG = "data_lag";
  @SerializedName(SERIALIZED_NAME_DATA_LAG)
  private BigDecimal dataLag;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Object max;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Object min;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private DnsAnalyticsQuery query;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private BigDecimal rows;

  public static final String SERIALIZED_NAME_TOTALS = "totals";
  @SerializedName(SERIALIZED_NAME_TOTALS)
  private Object totals;

  public DnsAnalyticsResult() {
  }

  public DnsAnalyticsResult data(List<DnsAnalyticsDataInner> data) {
    this.data = data;
    return this;
  }

  public DnsAnalyticsResult addDataItem(DnsAnalyticsDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Array with one row per combination of dimension values.
   * @return data
  **/
  @javax.annotation.Nonnull
  public List<DnsAnalyticsDataInner> getData() {
    return data;
  }

  public void setData(List<DnsAnalyticsDataInner> data) {
    this.data = data;
  }


  public DnsAnalyticsResult dataLag(BigDecimal dataLag) {
    this.dataLag = dataLag;
    return this;
  }

   /**
   * Number of seconds between current time and last processed event, in another words how many seconds of data could be missing.
   * minimum: 0
   * @return dataLag
  **/
  @javax.annotation.Nonnull
  public BigDecimal getDataLag() {
    return dataLag;
  }

  public void setDataLag(BigDecimal dataLag) {
    this.dataLag = dataLag;
  }


  public DnsAnalyticsResult max(Object max) {
    this.max = max;
    return this;
  }

   /**
   * Maximum results for each metric (object mapping metric names to values). Currently always an empty object.
   * @return max
  **/
  @javax.annotation.Nonnull
  public Object getMax() {
    return max;
  }

  public void setMax(Object max) {
    this.max = max;
  }


  public DnsAnalyticsResult min(Object min) {
    this.min = min;
    return this;
  }

   /**
   * Minimum results for each metric (object mapping metric names to values). Currently always an empty object.
   * @return min
  **/
  @javax.annotation.Nonnull
  public Object getMin() {
    return min;
  }

  public void setMin(Object min) {
    this.min = min;
  }


  public DnsAnalyticsResult query(DnsAnalyticsQuery query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nonnull
  public DnsAnalyticsQuery getQuery() {
    return query;
  }

  public void setQuery(DnsAnalyticsQuery query) {
    this.query = query;
  }


  public DnsAnalyticsResult rows(BigDecimal rows) {
    this.rows = rows;
    return this;
  }

   /**
   * Total number of rows in the result.
   * minimum: 0
   * @return rows
  **/
  @javax.annotation.Nonnull
  public BigDecimal getRows() {
    return rows;
  }

  public void setRows(BigDecimal rows) {
    this.rows = rows;
  }


  public DnsAnalyticsResult totals(Object totals) {
    this.totals = totals;
    return this;
  }

   /**
   * Total results for metrics across all data (object mapping metric names to values).
   * @return totals
  **/
  @javax.annotation.Nonnull
  public Object getTotals() {
    return totals;
  }

  public void setTotals(Object totals) {
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
    DnsAnalyticsResult dnsAnalyticsResult = (DnsAnalyticsResult) o;
    return Objects.equals(this.data, dnsAnalyticsResult.data) &&
        Objects.equals(this.dataLag, dnsAnalyticsResult.dataLag) &&
        Objects.equals(this.max, dnsAnalyticsResult.max) &&
        Objects.equals(this.min, dnsAnalyticsResult.min) &&
        Objects.equals(this.query, dnsAnalyticsResult.query) &&
        Objects.equals(this.rows, dnsAnalyticsResult.rows) &&
        Objects.equals(this.totals, dnsAnalyticsResult.totals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, dataLag, max, min, query, rows, totals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsAnalyticsResult {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dataLag: ").append(toIndentedString(dataLag)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("data_lag");
    openapiFields.add("max");
    openapiFields.add("min");
    openapiFields.add("query");
    openapiFields.add("rows");
    openapiFields.add("totals");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("data_lag");
    openapiRequiredFields.add("max");
    openapiRequiredFields.add("min");
    openapiRequiredFields.add("query");
    openapiRequiredFields.add("rows");
    openapiRequiredFields.add("totals");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DnsAnalyticsResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DnsAnalyticsResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DnsAnalyticsResult is not found in the empty JSON string", DnsAnalyticsResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DnsAnalyticsResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DnsAnalyticsResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DnsAnalyticsResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }

      JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
      // validate the required field `data` (array)
      for (int i = 0; i < jsonArraydata.size(); i++) {
        DnsAnalyticsDataInner.validateJsonElement(jsonArraydata.get(i));
      };
      // validate the required field `query`
      DnsAnalyticsQuery.validateJsonElement(jsonObj.get("query"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DnsAnalyticsResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DnsAnalyticsResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DnsAnalyticsResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DnsAnalyticsResult.class));

       return (TypeAdapter<T>) new TypeAdapter<DnsAnalyticsResult>() {
           @Override
           public void write(JsonWriter out, DnsAnalyticsResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DnsAnalyticsResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DnsAnalyticsResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DnsAnalyticsResult
  * @throws IOException if the JSON string is invalid with respect to DnsAnalyticsResult
  */
  public static DnsAnalyticsResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DnsAnalyticsResult.class);
  }

 /**
  * Convert an instance of DnsAnalyticsResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

