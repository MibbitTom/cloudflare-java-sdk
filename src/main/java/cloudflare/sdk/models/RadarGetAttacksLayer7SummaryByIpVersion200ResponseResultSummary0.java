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
 * RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0 {
  public static final String SERIALIZED_NAME_IPV4 = "IPv4";
  @SerializedName(SERIALIZED_NAME_IPV4)
  private String ipv4;

  public static final String SERIALIZED_NAME_IPV6 = "IPv6";
  @SerializedName(SERIALIZED_NAME_IPV6)
  private String ipv6;

  public RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0() {
  }

  public RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0 ipv4(String ipv4) {
    this.ipv4 = ipv4;
    return this;
  }

   /**
   * Get ipv4
   * @return ipv4
  **/
  @javax.annotation.Nonnull
  public String getIpv4() {
    return ipv4;
  }

  public void setIpv4(String ipv4) {
    this.ipv4 = ipv4;
  }


  public RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0 ipv6(String ipv6) {
    this.ipv6 = ipv6;
    return this;
  }

   /**
   * Get ipv6
   * @return ipv6
  **/
  @javax.annotation.Nonnull
  public String getIpv6() {
    return ipv6;
  }

  public void setIpv6(String ipv6) {
    this.ipv6 = ipv6;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0 radarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0 = (RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0) o;
    return Objects.equals(this.ipv4, radarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0.ipv4) &&
        Objects.equals(this.ipv6, radarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0.ipv6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4, ipv6);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0 {\n");
    sb.append("    ipv4: ").append(toIndentedString(ipv4)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
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
    openapiFields.add("IPv4");
    openapiFields.add("IPv6");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("IPv4");
    openapiRequiredFields.add("IPv6");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0 is not found in the empty JSON string", RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("IPv4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPv4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IPv4").toString()));
      }
      if (!jsonObj.get("IPv6").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPv6` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IPv6").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0>() {
           @Override
           public void write(JsonWriter out, RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0
  * @throws IOException if the JSON string is invalid with respect to RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0
  */
  public static RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0.class);
  }

 /**
  * Convert an instance of RadarGetAttacksLayer7SummaryByIpVersion200ResponseResultSummary0 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

