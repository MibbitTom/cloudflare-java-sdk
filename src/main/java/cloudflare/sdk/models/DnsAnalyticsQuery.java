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
 * DnsAnalyticsQuery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DnsAnalyticsQuery {
  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private List<String> dimensions = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private String filters;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit = 100000;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<String> metrics = new ArrayList<>();

  public static final String SERIALIZED_NAME_SINCE = "since";
  @SerializedName(SERIALIZED_NAME_SINCE)
  private OffsetDateTime since;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private List<String> sort = new ArrayList<>();

  public static final String SERIALIZED_NAME_UNTIL = "until";
  @SerializedName(SERIALIZED_NAME_UNTIL)
  private OffsetDateTime until;

  public DnsAnalyticsQuery() {
  }

  public DnsAnalyticsQuery dimensions(List<String> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public DnsAnalyticsQuery addDimensionsItem(String dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * Array of dimension names.
   * @return dimensions
  **/
  @javax.annotation.Nonnull
  public List<String> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<String> dimensions) {
    this.dimensions = dimensions;
  }


  public DnsAnalyticsQuery filters(String filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Segmentation filter in &#39;attribute operator value&#39; format.
   * @return filters
  **/
  @javax.annotation.Nullable
  public String getFilters() {
    return filters;
  }

  public void setFilters(String filters) {
    this.filters = filters;
  }


  public DnsAnalyticsQuery limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Limit number of returned metrics.
   * @return limit
  **/
  @javax.annotation.Nonnull
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public DnsAnalyticsQuery metrics(List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public DnsAnalyticsQuery addMetricsItem(String metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Array of metric names.
   * @return metrics
  **/
  @javax.annotation.Nonnull
  public List<String> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<String> metrics) {
    this.metrics = metrics;
  }


  public DnsAnalyticsQuery since(OffsetDateTime since) {
    this.since = since;
    return this;
  }

   /**
   * Start date and time of requesting data period in ISO 8601 format.
   * @return since
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getSince() {
    return since;
  }

  public void setSince(OffsetDateTime since) {
    this.since = since;
  }


  public DnsAnalyticsQuery sort(List<String> sort) {
    this.sort = sort;
    return this;
  }

  public DnsAnalyticsQuery addSortItem(String sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Array of dimensions to sort by, where each dimension may be prefixed by - (descending) or + (ascending).
   * @return sort
  **/
  @javax.annotation.Nullable
  public List<String> getSort() {
    return sort;
  }

  public void setSort(List<String> sort) {
    this.sort = sort;
  }


  public DnsAnalyticsQuery until(OffsetDateTime until) {
    this.until = until;
    return this;
  }

   /**
   * End date and time of requesting data period in ISO 8601 format.
   * @return until
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getUntil() {
    return until;
  }

  public void setUntil(OffsetDateTime until) {
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
    DnsAnalyticsQuery dnsAnalyticsQuery = (DnsAnalyticsQuery) o;
    return Objects.equals(this.dimensions, dnsAnalyticsQuery.dimensions) &&
        Objects.equals(this.filters, dnsAnalyticsQuery.filters) &&
        Objects.equals(this.limit, dnsAnalyticsQuery.limit) &&
        Objects.equals(this.metrics, dnsAnalyticsQuery.metrics) &&
        Objects.equals(this.since, dnsAnalyticsQuery.since) &&
        Objects.equals(this.sort, dnsAnalyticsQuery.sort) &&
        Objects.equals(this.until, dnsAnalyticsQuery.until);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, filters, limit, metrics, since, sort, until);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsAnalyticsQuery {\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
    openapiFields.add("dimensions");
    openapiFields.add("filters");
    openapiFields.add("limit");
    openapiFields.add("metrics");
    openapiFields.add("since");
    openapiFields.add("sort");
    openapiFields.add("until");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dimensions");
    openapiRequiredFields.add("limit");
    openapiRequiredFields.add("metrics");
    openapiRequiredFields.add("since");
    openapiRequiredFields.add("until");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DnsAnalyticsQuery
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DnsAnalyticsQuery.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DnsAnalyticsQuery is not found in the empty JSON string", DnsAnalyticsQuery.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DnsAnalyticsQuery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DnsAnalyticsQuery` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DnsAnalyticsQuery.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("dimensions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("dimensions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dimensions` to be an array in the JSON string but got `%s`", jsonObj.get("dimensions").toString()));
      }
      if ((jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) && !jsonObj.get("filters").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filters` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filters").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("metrics") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("metrics").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metrics` to be an array in the JSON string but got `%s`", jsonObj.get("metrics").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonNull() && !jsonObj.get("sort").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort` to be an array in the JSON string but got `%s`", jsonObj.get("sort").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DnsAnalyticsQuery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DnsAnalyticsQuery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DnsAnalyticsQuery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DnsAnalyticsQuery.class));

       return (TypeAdapter<T>) new TypeAdapter<DnsAnalyticsQuery>() {
           @Override
           public void write(JsonWriter out, DnsAnalyticsQuery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DnsAnalyticsQuery read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DnsAnalyticsQuery given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DnsAnalyticsQuery
  * @throws IOException if the JSON string is invalid with respect to DnsAnalyticsQuery
  */
  public static DnsAnalyticsQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DnsAnalyticsQuery.class);
  }

 /**
  * Convert an instance of DnsAnalyticsQuery to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

