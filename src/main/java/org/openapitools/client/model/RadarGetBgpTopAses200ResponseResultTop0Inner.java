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
 * RadarGetBgpTopAses200ResponseResultTop0Inner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetBgpTopAses200ResponseResultTop0Inner {
  public static final String SERIALIZED_NAME_AS_NAME = "ASName";
  @SerializedName(SERIALIZED_NAME_AS_NAME)
  private String asName;

  public static final String SERIALIZED_NAME_ASN = "asn";
  @SerializedName(SERIALIZED_NAME_ASN)
  private Integer asn;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public RadarGetBgpTopAses200ResponseResultTop0Inner() {
  }

  public RadarGetBgpTopAses200ResponseResultTop0Inner asName(String asName) {
    this.asName = asName;
    return this;
  }

   /**
   * Get asName
   * @return asName
  **/
  @javax.annotation.Nonnull
  public String getAsName() {
    return asName;
  }

  public void setAsName(String asName) {
    this.asName = asName;
  }


  public RadarGetBgpTopAses200ResponseResultTop0Inner asn(Integer asn) {
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


  public RadarGetBgpTopAses200ResponseResultTop0Inner value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Percentage of updates by this AS out of the total updates by all autonomous systems.
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
    RadarGetBgpTopAses200ResponseResultTop0Inner radarGetBgpTopAses200ResponseResultTop0Inner = (RadarGetBgpTopAses200ResponseResultTop0Inner) o;
    return Objects.equals(this.asName, radarGetBgpTopAses200ResponseResultTop0Inner.asName) &&
        Objects.equals(this.asn, radarGetBgpTopAses200ResponseResultTop0Inner.asn) &&
        Objects.equals(this.value, radarGetBgpTopAses200ResponseResultTop0Inner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asName, asn, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetBgpTopAses200ResponseResultTop0Inner {\n");
    sb.append("    asName: ").append(toIndentedString(asName)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
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
    openapiFields.add("ASName");
    openapiFields.add("asn");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ASName");
    openapiRequiredFields.add("asn");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetBgpTopAses200ResponseResultTop0Inner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetBgpTopAses200ResponseResultTop0Inner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetBgpTopAses200ResponseResultTop0Inner is not found in the empty JSON string", RadarGetBgpTopAses200ResponseResultTop0Inner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetBgpTopAses200ResponseResultTop0Inner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetBgpTopAses200ResponseResultTop0Inner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetBgpTopAses200ResponseResultTop0Inner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("ASName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ASName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ASName").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetBgpTopAses200ResponseResultTop0Inner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetBgpTopAses200ResponseResultTop0Inner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetBgpTopAses200ResponseResultTop0Inner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetBgpTopAses200ResponseResultTop0Inner.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetBgpTopAses200ResponseResultTop0Inner>() {
           @Override
           public void write(JsonWriter out, RadarGetBgpTopAses200ResponseResultTop0Inner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetBgpTopAses200ResponseResultTop0Inner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetBgpTopAses200ResponseResultTop0Inner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetBgpTopAses200ResponseResultTop0Inner
  * @throws IOException if the JSON string is invalid with respect to RadarGetBgpTopAses200ResponseResultTop0Inner
  */
  public static RadarGetBgpTopAses200ResponseResultTop0Inner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetBgpTopAses200ResponseResultTop0Inner.class);
  }

 /**
  * Convert an instance of RadarGetBgpTopAses200ResponseResultTop0Inner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

