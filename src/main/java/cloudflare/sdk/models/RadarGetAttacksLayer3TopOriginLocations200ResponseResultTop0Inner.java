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
import java.math.BigDecimal;
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
 * RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner {
  public static final String SERIALIZED_NAME_ORIGIN_COUNTRY_ALPHA2 = "originCountryAlpha2";
  @SerializedName(SERIALIZED_NAME_ORIGIN_COUNTRY_ALPHA2)
  private String originCountryAlpha2;

  public static final String SERIALIZED_NAME_ORIGIN_COUNTRY_NAME = "originCountryName";
  @SerializedName(SERIALIZED_NAME_ORIGIN_COUNTRY_NAME)
  private String originCountryName;

  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private BigDecimal rank;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner() {
  }

  public RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner originCountryAlpha2(String originCountryAlpha2) {
    this.originCountryAlpha2 = originCountryAlpha2;
    return this;
  }

   /**
   * Get originCountryAlpha2
   * @return originCountryAlpha2
  **/
  @javax.annotation.Nonnull
  public String getOriginCountryAlpha2() {
    return originCountryAlpha2;
  }

  public void setOriginCountryAlpha2(String originCountryAlpha2) {
    this.originCountryAlpha2 = originCountryAlpha2;
  }


  public RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner originCountryName(String originCountryName) {
    this.originCountryName = originCountryName;
    return this;
  }

   /**
   * Get originCountryName
   * @return originCountryName
  **/
  @javax.annotation.Nonnull
  public String getOriginCountryName() {
    return originCountryName;
  }

  public void setOriginCountryName(String originCountryName) {
    this.originCountryName = originCountryName;
  }


  public RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner rank(BigDecimal rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  @javax.annotation.Nonnull
  public BigDecimal getRank() {
    return rank;
  }

  public void setRank(BigDecimal rank) {
    this.rank = rank;
  }


  public RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner radarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner = (RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner) o;
    return Objects.equals(this.originCountryAlpha2, radarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner.originCountryAlpha2) &&
        Objects.equals(this.originCountryName, radarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner.originCountryName) &&
        Objects.equals(this.rank, radarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner.rank) &&
        Objects.equals(this.value, radarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originCountryAlpha2, originCountryName, rank, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner {\n");
    sb.append("    originCountryAlpha2: ").append(toIndentedString(originCountryAlpha2)).append("\n");
    sb.append("    originCountryName: ").append(toIndentedString(originCountryName)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("originCountryAlpha2");
    openapiFields.add("originCountryName");
    openapiFields.add("rank");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("originCountryAlpha2");
    openapiRequiredFields.add("originCountryName");
    openapiRequiredFields.add("rank");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner is not found in the empty JSON string", RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("originCountryAlpha2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originCountryAlpha2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originCountryAlpha2").toString()));
      }
      if (!jsonObj.get("originCountryName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originCountryName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originCountryName").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner>() {
           @Override
           public void write(JsonWriter out, RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner
  * @throws IOException if the JSON string is invalid with respect to RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner
  */
  public static RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner.class);
  }

 /**
  * Convert an instance of RadarGetAttacksLayer3TopOriginLocations200ResponseResultTop0Inner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
