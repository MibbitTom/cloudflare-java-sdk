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
 * RadarGetBgpRoutesStats200ResponseResultStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetBgpRoutesStats200ResponseResultStats {
  public static final String SERIALIZED_NAME_DISTINCT_ORIGINS = "distinct_origins";
  @SerializedName(SERIALIZED_NAME_DISTINCT_ORIGINS)
  private Integer distinctOrigins;

  public static final String SERIALIZED_NAME_DISTINCT_ORIGINS_IPV4 = "distinct_origins_ipv4";
  @SerializedName(SERIALIZED_NAME_DISTINCT_ORIGINS_IPV4)
  private Integer distinctOriginsIpv4;

  public static final String SERIALIZED_NAME_DISTINCT_ORIGINS_IPV6 = "distinct_origins_ipv6";
  @SerializedName(SERIALIZED_NAME_DISTINCT_ORIGINS_IPV6)
  private Integer distinctOriginsIpv6;

  public static final String SERIALIZED_NAME_DISTINCT_PREFIXES = "distinct_prefixes";
  @SerializedName(SERIALIZED_NAME_DISTINCT_PREFIXES)
  private Integer distinctPrefixes;

  public static final String SERIALIZED_NAME_DISTINCT_PREFIXES_IPV4 = "distinct_prefixes_ipv4";
  @SerializedName(SERIALIZED_NAME_DISTINCT_PREFIXES_IPV4)
  private Integer distinctPrefixesIpv4;

  public static final String SERIALIZED_NAME_DISTINCT_PREFIXES_IPV6 = "distinct_prefixes_ipv6";
  @SerializedName(SERIALIZED_NAME_DISTINCT_PREFIXES_IPV6)
  private Integer distinctPrefixesIpv6;

  public static final String SERIALIZED_NAME_ROUTES_INVALID = "routes_invalid";
  @SerializedName(SERIALIZED_NAME_ROUTES_INVALID)
  private Integer routesInvalid;

  public static final String SERIALIZED_NAME_ROUTES_INVALID_IPV4 = "routes_invalid_ipv4";
  @SerializedName(SERIALIZED_NAME_ROUTES_INVALID_IPV4)
  private Integer routesInvalidIpv4;

  public static final String SERIALIZED_NAME_ROUTES_INVALID_IPV6 = "routes_invalid_ipv6";
  @SerializedName(SERIALIZED_NAME_ROUTES_INVALID_IPV6)
  private Integer routesInvalidIpv6;

  public static final String SERIALIZED_NAME_ROUTES_TOTAL = "routes_total";
  @SerializedName(SERIALIZED_NAME_ROUTES_TOTAL)
  private Integer routesTotal;

  public static final String SERIALIZED_NAME_ROUTES_TOTAL_IPV4 = "routes_total_ipv4";
  @SerializedName(SERIALIZED_NAME_ROUTES_TOTAL_IPV4)
  private Integer routesTotalIpv4;

  public static final String SERIALIZED_NAME_ROUTES_TOTAL_IPV6 = "routes_total_ipv6";
  @SerializedName(SERIALIZED_NAME_ROUTES_TOTAL_IPV6)
  private Integer routesTotalIpv6;

  public static final String SERIALIZED_NAME_ROUTES_UNKNOWN = "routes_unknown";
  @SerializedName(SERIALIZED_NAME_ROUTES_UNKNOWN)
  private Integer routesUnknown;

  public static final String SERIALIZED_NAME_ROUTES_UNKNOWN_IPV4 = "routes_unknown_ipv4";
  @SerializedName(SERIALIZED_NAME_ROUTES_UNKNOWN_IPV4)
  private Integer routesUnknownIpv4;

  public static final String SERIALIZED_NAME_ROUTES_UNKNOWN_IPV6 = "routes_unknown_ipv6";
  @SerializedName(SERIALIZED_NAME_ROUTES_UNKNOWN_IPV6)
  private Integer routesUnknownIpv6;

  public static final String SERIALIZED_NAME_ROUTES_VALID = "routes_valid";
  @SerializedName(SERIALIZED_NAME_ROUTES_VALID)
  private Integer routesValid;

  public static final String SERIALIZED_NAME_ROUTES_VALID_IPV4 = "routes_valid_ipv4";
  @SerializedName(SERIALIZED_NAME_ROUTES_VALID_IPV4)
  private Integer routesValidIpv4;

  public static final String SERIALIZED_NAME_ROUTES_VALID_IPV6 = "routes_valid_ipv6";
  @SerializedName(SERIALIZED_NAME_ROUTES_VALID_IPV6)
  private Integer routesValidIpv6;

  public RadarGetBgpRoutesStats200ResponseResultStats() {
  }

  public RadarGetBgpRoutesStats200ResponseResultStats distinctOrigins(Integer distinctOrigins) {
    this.distinctOrigins = distinctOrigins;
    return this;
  }

   /**
   * Get distinctOrigins
   * @return distinctOrigins
  **/
  @javax.annotation.Nonnull
  public Integer getDistinctOrigins() {
    return distinctOrigins;
  }

  public void setDistinctOrigins(Integer distinctOrigins) {
    this.distinctOrigins = distinctOrigins;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats distinctOriginsIpv4(Integer distinctOriginsIpv4) {
    this.distinctOriginsIpv4 = distinctOriginsIpv4;
    return this;
  }

   /**
   * Get distinctOriginsIpv4
   * @return distinctOriginsIpv4
  **/
  @javax.annotation.Nonnull
  public Integer getDistinctOriginsIpv4() {
    return distinctOriginsIpv4;
  }

  public void setDistinctOriginsIpv4(Integer distinctOriginsIpv4) {
    this.distinctOriginsIpv4 = distinctOriginsIpv4;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats distinctOriginsIpv6(Integer distinctOriginsIpv6) {
    this.distinctOriginsIpv6 = distinctOriginsIpv6;
    return this;
  }

   /**
   * Get distinctOriginsIpv6
   * @return distinctOriginsIpv6
  **/
  @javax.annotation.Nonnull
  public Integer getDistinctOriginsIpv6() {
    return distinctOriginsIpv6;
  }

  public void setDistinctOriginsIpv6(Integer distinctOriginsIpv6) {
    this.distinctOriginsIpv6 = distinctOriginsIpv6;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats distinctPrefixes(Integer distinctPrefixes) {
    this.distinctPrefixes = distinctPrefixes;
    return this;
  }

   /**
   * Get distinctPrefixes
   * @return distinctPrefixes
  **/
  @javax.annotation.Nonnull
  public Integer getDistinctPrefixes() {
    return distinctPrefixes;
  }

  public void setDistinctPrefixes(Integer distinctPrefixes) {
    this.distinctPrefixes = distinctPrefixes;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats distinctPrefixesIpv4(Integer distinctPrefixesIpv4) {
    this.distinctPrefixesIpv4 = distinctPrefixesIpv4;
    return this;
  }

   /**
   * Get distinctPrefixesIpv4
   * @return distinctPrefixesIpv4
  **/
  @javax.annotation.Nonnull
  public Integer getDistinctPrefixesIpv4() {
    return distinctPrefixesIpv4;
  }

  public void setDistinctPrefixesIpv4(Integer distinctPrefixesIpv4) {
    this.distinctPrefixesIpv4 = distinctPrefixesIpv4;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats distinctPrefixesIpv6(Integer distinctPrefixesIpv6) {
    this.distinctPrefixesIpv6 = distinctPrefixesIpv6;
    return this;
  }

   /**
   * Get distinctPrefixesIpv6
   * @return distinctPrefixesIpv6
  **/
  @javax.annotation.Nonnull
  public Integer getDistinctPrefixesIpv6() {
    return distinctPrefixesIpv6;
  }

  public void setDistinctPrefixesIpv6(Integer distinctPrefixesIpv6) {
    this.distinctPrefixesIpv6 = distinctPrefixesIpv6;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats routesInvalid(Integer routesInvalid) {
    this.routesInvalid = routesInvalid;
    return this;
  }

   /**
   * Get routesInvalid
   * @return routesInvalid
  **/
  @javax.annotation.Nonnull
  public Integer getRoutesInvalid() {
    return routesInvalid;
  }

  public void setRoutesInvalid(Integer routesInvalid) {
    this.routesInvalid = routesInvalid;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats routesInvalidIpv4(Integer routesInvalidIpv4) {
    this.routesInvalidIpv4 = routesInvalidIpv4;
    return this;
  }

   /**
   * Get routesInvalidIpv4
   * @return routesInvalidIpv4
  **/
  @javax.annotation.Nonnull
  public Integer getRoutesInvalidIpv4() {
    return routesInvalidIpv4;
  }

  public void setRoutesInvalidIpv4(Integer routesInvalidIpv4) {
    this.routesInvalidIpv4 = routesInvalidIpv4;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats routesInvalidIpv6(Integer routesInvalidIpv6) {
    this.routesInvalidIpv6 = routesInvalidIpv6;
    return this;
  }

   /**
   * Get routesInvalidIpv6
   * @return routesInvalidIpv6
  **/
  @javax.annotation.Nonnull
  public Integer getRoutesInvalidIpv6() {
    return routesInvalidIpv6;
  }

  public void setRoutesInvalidIpv6(Integer routesInvalidIpv6) {
    this.routesInvalidIpv6 = routesInvalidIpv6;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats routesTotal(Integer routesTotal) {
    this.routesTotal = routesTotal;
    return this;
  }

   /**
   * Get routesTotal
   * @return routesTotal
  **/
  @javax.annotation.Nonnull
  public Integer getRoutesTotal() {
    return routesTotal;
  }

  public void setRoutesTotal(Integer routesTotal) {
    this.routesTotal = routesTotal;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats routesTotalIpv4(Integer routesTotalIpv4) {
    this.routesTotalIpv4 = routesTotalIpv4;
    return this;
  }

   /**
   * Get routesTotalIpv4
   * @return routesTotalIpv4
  **/
  @javax.annotation.Nonnull
  public Integer getRoutesTotalIpv4() {
    return routesTotalIpv4;
  }

  public void setRoutesTotalIpv4(Integer routesTotalIpv4) {
    this.routesTotalIpv4 = routesTotalIpv4;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats routesTotalIpv6(Integer routesTotalIpv6) {
    this.routesTotalIpv6 = routesTotalIpv6;
    return this;
  }

   /**
   * Get routesTotalIpv6
   * @return routesTotalIpv6
  **/
  @javax.annotation.Nonnull
  public Integer getRoutesTotalIpv6() {
    return routesTotalIpv6;
  }

  public void setRoutesTotalIpv6(Integer routesTotalIpv6) {
    this.routesTotalIpv6 = routesTotalIpv6;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats routesUnknown(Integer routesUnknown) {
    this.routesUnknown = routesUnknown;
    return this;
  }

   /**
   * Get routesUnknown
   * @return routesUnknown
  **/
  @javax.annotation.Nonnull
  public Integer getRoutesUnknown() {
    return routesUnknown;
  }

  public void setRoutesUnknown(Integer routesUnknown) {
    this.routesUnknown = routesUnknown;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats routesUnknownIpv4(Integer routesUnknownIpv4) {
    this.routesUnknownIpv4 = routesUnknownIpv4;
    return this;
  }

   /**
   * Get routesUnknownIpv4
   * @return routesUnknownIpv4
  **/
  @javax.annotation.Nonnull
  public Integer getRoutesUnknownIpv4() {
    return routesUnknownIpv4;
  }

  public void setRoutesUnknownIpv4(Integer routesUnknownIpv4) {
    this.routesUnknownIpv4 = routesUnknownIpv4;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats routesUnknownIpv6(Integer routesUnknownIpv6) {
    this.routesUnknownIpv6 = routesUnknownIpv6;
    return this;
  }

   /**
   * Get routesUnknownIpv6
   * @return routesUnknownIpv6
  **/
  @javax.annotation.Nonnull
  public Integer getRoutesUnknownIpv6() {
    return routesUnknownIpv6;
  }

  public void setRoutesUnknownIpv6(Integer routesUnknownIpv6) {
    this.routesUnknownIpv6 = routesUnknownIpv6;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats routesValid(Integer routesValid) {
    this.routesValid = routesValid;
    return this;
  }

   /**
   * Get routesValid
   * @return routesValid
  **/
  @javax.annotation.Nonnull
  public Integer getRoutesValid() {
    return routesValid;
  }

  public void setRoutesValid(Integer routesValid) {
    this.routesValid = routesValid;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats routesValidIpv4(Integer routesValidIpv4) {
    this.routesValidIpv4 = routesValidIpv4;
    return this;
  }

   /**
   * Get routesValidIpv4
   * @return routesValidIpv4
  **/
  @javax.annotation.Nonnull
  public Integer getRoutesValidIpv4() {
    return routesValidIpv4;
  }

  public void setRoutesValidIpv4(Integer routesValidIpv4) {
    this.routesValidIpv4 = routesValidIpv4;
  }


  public RadarGetBgpRoutesStats200ResponseResultStats routesValidIpv6(Integer routesValidIpv6) {
    this.routesValidIpv6 = routesValidIpv6;
    return this;
  }

   /**
   * Get routesValidIpv6
   * @return routesValidIpv6
  **/
  @javax.annotation.Nonnull
  public Integer getRoutesValidIpv6() {
    return routesValidIpv6;
  }

  public void setRoutesValidIpv6(Integer routesValidIpv6) {
    this.routesValidIpv6 = routesValidIpv6;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetBgpRoutesStats200ResponseResultStats radarGetBgpRoutesStats200ResponseResultStats = (RadarGetBgpRoutesStats200ResponseResultStats) o;
    return Objects.equals(this.distinctOrigins, radarGetBgpRoutesStats200ResponseResultStats.distinctOrigins) &&
        Objects.equals(this.distinctOriginsIpv4, radarGetBgpRoutesStats200ResponseResultStats.distinctOriginsIpv4) &&
        Objects.equals(this.distinctOriginsIpv6, radarGetBgpRoutesStats200ResponseResultStats.distinctOriginsIpv6) &&
        Objects.equals(this.distinctPrefixes, radarGetBgpRoutesStats200ResponseResultStats.distinctPrefixes) &&
        Objects.equals(this.distinctPrefixesIpv4, radarGetBgpRoutesStats200ResponseResultStats.distinctPrefixesIpv4) &&
        Objects.equals(this.distinctPrefixesIpv6, radarGetBgpRoutesStats200ResponseResultStats.distinctPrefixesIpv6) &&
        Objects.equals(this.routesInvalid, radarGetBgpRoutesStats200ResponseResultStats.routesInvalid) &&
        Objects.equals(this.routesInvalidIpv4, radarGetBgpRoutesStats200ResponseResultStats.routesInvalidIpv4) &&
        Objects.equals(this.routesInvalidIpv6, radarGetBgpRoutesStats200ResponseResultStats.routesInvalidIpv6) &&
        Objects.equals(this.routesTotal, radarGetBgpRoutesStats200ResponseResultStats.routesTotal) &&
        Objects.equals(this.routesTotalIpv4, radarGetBgpRoutesStats200ResponseResultStats.routesTotalIpv4) &&
        Objects.equals(this.routesTotalIpv6, radarGetBgpRoutesStats200ResponseResultStats.routesTotalIpv6) &&
        Objects.equals(this.routesUnknown, radarGetBgpRoutesStats200ResponseResultStats.routesUnknown) &&
        Objects.equals(this.routesUnknownIpv4, radarGetBgpRoutesStats200ResponseResultStats.routesUnknownIpv4) &&
        Objects.equals(this.routesUnknownIpv6, radarGetBgpRoutesStats200ResponseResultStats.routesUnknownIpv6) &&
        Objects.equals(this.routesValid, radarGetBgpRoutesStats200ResponseResultStats.routesValid) &&
        Objects.equals(this.routesValidIpv4, radarGetBgpRoutesStats200ResponseResultStats.routesValidIpv4) &&
        Objects.equals(this.routesValidIpv6, radarGetBgpRoutesStats200ResponseResultStats.routesValidIpv6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distinctOrigins, distinctOriginsIpv4, distinctOriginsIpv6, distinctPrefixes, distinctPrefixesIpv4, distinctPrefixesIpv6, routesInvalid, routesInvalidIpv4, routesInvalidIpv6, routesTotal, routesTotalIpv4, routesTotalIpv6, routesUnknown, routesUnknownIpv4, routesUnknownIpv6, routesValid, routesValidIpv4, routesValidIpv6);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetBgpRoutesStats200ResponseResultStats {\n");
    sb.append("    distinctOrigins: ").append(toIndentedString(distinctOrigins)).append("\n");
    sb.append("    distinctOriginsIpv4: ").append(toIndentedString(distinctOriginsIpv4)).append("\n");
    sb.append("    distinctOriginsIpv6: ").append(toIndentedString(distinctOriginsIpv6)).append("\n");
    sb.append("    distinctPrefixes: ").append(toIndentedString(distinctPrefixes)).append("\n");
    sb.append("    distinctPrefixesIpv4: ").append(toIndentedString(distinctPrefixesIpv4)).append("\n");
    sb.append("    distinctPrefixesIpv6: ").append(toIndentedString(distinctPrefixesIpv6)).append("\n");
    sb.append("    routesInvalid: ").append(toIndentedString(routesInvalid)).append("\n");
    sb.append("    routesInvalidIpv4: ").append(toIndentedString(routesInvalidIpv4)).append("\n");
    sb.append("    routesInvalidIpv6: ").append(toIndentedString(routesInvalidIpv6)).append("\n");
    sb.append("    routesTotal: ").append(toIndentedString(routesTotal)).append("\n");
    sb.append("    routesTotalIpv4: ").append(toIndentedString(routesTotalIpv4)).append("\n");
    sb.append("    routesTotalIpv6: ").append(toIndentedString(routesTotalIpv6)).append("\n");
    sb.append("    routesUnknown: ").append(toIndentedString(routesUnknown)).append("\n");
    sb.append("    routesUnknownIpv4: ").append(toIndentedString(routesUnknownIpv4)).append("\n");
    sb.append("    routesUnknownIpv6: ").append(toIndentedString(routesUnknownIpv6)).append("\n");
    sb.append("    routesValid: ").append(toIndentedString(routesValid)).append("\n");
    sb.append("    routesValidIpv4: ").append(toIndentedString(routesValidIpv4)).append("\n");
    sb.append("    routesValidIpv6: ").append(toIndentedString(routesValidIpv6)).append("\n");
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
    openapiFields.add("distinct_origins");
    openapiFields.add("distinct_origins_ipv4");
    openapiFields.add("distinct_origins_ipv6");
    openapiFields.add("distinct_prefixes");
    openapiFields.add("distinct_prefixes_ipv4");
    openapiFields.add("distinct_prefixes_ipv6");
    openapiFields.add("routes_invalid");
    openapiFields.add("routes_invalid_ipv4");
    openapiFields.add("routes_invalid_ipv6");
    openapiFields.add("routes_total");
    openapiFields.add("routes_total_ipv4");
    openapiFields.add("routes_total_ipv6");
    openapiFields.add("routes_unknown");
    openapiFields.add("routes_unknown_ipv4");
    openapiFields.add("routes_unknown_ipv6");
    openapiFields.add("routes_valid");
    openapiFields.add("routes_valid_ipv4");
    openapiFields.add("routes_valid_ipv6");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("distinct_origins");
    openapiRequiredFields.add("distinct_origins_ipv4");
    openapiRequiredFields.add("distinct_origins_ipv6");
    openapiRequiredFields.add("distinct_prefixes");
    openapiRequiredFields.add("distinct_prefixes_ipv4");
    openapiRequiredFields.add("distinct_prefixes_ipv6");
    openapiRequiredFields.add("routes_invalid");
    openapiRequiredFields.add("routes_invalid_ipv4");
    openapiRequiredFields.add("routes_invalid_ipv6");
    openapiRequiredFields.add("routes_total");
    openapiRequiredFields.add("routes_total_ipv4");
    openapiRequiredFields.add("routes_total_ipv6");
    openapiRequiredFields.add("routes_unknown");
    openapiRequiredFields.add("routes_unknown_ipv4");
    openapiRequiredFields.add("routes_unknown_ipv6");
    openapiRequiredFields.add("routes_valid");
    openapiRequiredFields.add("routes_valid_ipv4");
    openapiRequiredFields.add("routes_valid_ipv6");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetBgpRoutesStats200ResponseResultStats
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetBgpRoutesStats200ResponseResultStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetBgpRoutesStats200ResponseResultStats is not found in the empty JSON string", RadarGetBgpRoutesStats200ResponseResultStats.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetBgpRoutesStats200ResponseResultStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetBgpRoutesStats200ResponseResultStats` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetBgpRoutesStats200ResponseResultStats.openapiRequiredFields) {
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
       if (!RadarGetBgpRoutesStats200ResponseResultStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetBgpRoutesStats200ResponseResultStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetBgpRoutesStats200ResponseResultStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetBgpRoutesStats200ResponseResultStats.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetBgpRoutesStats200ResponseResultStats>() {
           @Override
           public void write(JsonWriter out, RadarGetBgpRoutesStats200ResponseResultStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetBgpRoutesStats200ResponseResultStats read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetBgpRoutesStats200ResponseResultStats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetBgpRoutesStats200ResponseResultStats
  * @throws IOException if the JSON string is invalid with respect to RadarGetBgpRoutesStats200ResponseResultStats
  */
  public static RadarGetBgpRoutesStats200ResponseResultStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetBgpRoutesStats200ResponseResultStats.class);
  }

 /**
  * Convert an instance of RadarGetBgpRoutesStats200ResponseResultStats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
