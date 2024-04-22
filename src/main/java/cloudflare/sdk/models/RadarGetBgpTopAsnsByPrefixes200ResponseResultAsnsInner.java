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
 * RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner {
  public static final String SERIALIZED_NAME_ASN = "asn";
  @SerializedName(SERIALIZED_NAME_ASN)
  private Integer asn;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PFXS_COUNT = "pfxs_count";
  @SerializedName(SERIALIZED_NAME_PFXS_COUNT)
  private Integer pfxsCount;

  public RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner() {
  }

  public RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner asn(Integer asn) {
    this.asn = asn;
    return this;
  }

   /**
   * Get asn
   * @return asn
  **/
  @javax.annotation.Nonnull
  public Integer getAsn() {
    return asn;
  }

  public void setAsn(Integer asn) {
    this.asn = asn;
  }


  public RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nonnull
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner pfxsCount(Integer pfxsCount) {
    this.pfxsCount = pfxsCount;
    return this;
  }

   /**
   * Get pfxsCount
   * @return pfxsCount
  **/
  @javax.annotation.Nonnull
  public Integer getPfxsCount() {
    return pfxsCount;
  }

  public void setPfxsCount(Integer pfxsCount) {
    this.pfxsCount = pfxsCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner radarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner = (RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner) o;
    return Objects.equals(this.asn, radarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner.asn) &&
        Objects.equals(this.country, radarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner.country) &&
        Objects.equals(this.name, radarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner.name) &&
        Objects.equals(this.pfxsCount, radarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner.pfxsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asn, country, name, pfxsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner {\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pfxsCount: ").append(toIndentedString(pfxsCount)).append("\n");
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
    openapiFields.add("asn");
    openapiFields.add("country");
    openapiFields.add("name");
    openapiFields.add("pfxs_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("asn");
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("pfxs_count");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner is not found in the empty JSON string", RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner>() {
           @Override
           public void write(JsonWriter out, RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner
  * @throws IOException if the JSON string is invalid with respect to RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner
  */
  public static RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner.class);
  }

 /**
  * Convert an instance of RadarGetBgpTopAsnsByPrefixes200ResponseResultAsnsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

