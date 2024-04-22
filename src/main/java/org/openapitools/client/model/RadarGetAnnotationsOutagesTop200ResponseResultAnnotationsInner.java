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
 * RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner {
  public static final String SERIALIZED_NAME_CLIENT_COUNTRY_ALPHA2 = "clientCountryAlpha2";
  @SerializedName(SERIALIZED_NAME_CLIENT_COUNTRY_ALPHA2)
  private String clientCountryAlpha2;

  public static final String SERIALIZED_NAME_CLIENT_COUNTRY_NAME = "clientCountryName";
  @SerializedName(SERIALIZED_NAME_CLIENT_COUNTRY_NAME)
  private String clientCountryName;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner() {
  }

  public RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner clientCountryAlpha2(String clientCountryAlpha2) {
    this.clientCountryAlpha2 = clientCountryAlpha2;
    return this;
  }

   /**
   * Get clientCountryAlpha2
   * @return clientCountryAlpha2
  **/
  @javax.annotation.Nonnull
  public String getClientCountryAlpha2() {
    return clientCountryAlpha2;
  }

  public void setClientCountryAlpha2(String clientCountryAlpha2) {
    this.clientCountryAlpha2 = clientCountryAlpha2;
  }


  public RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner clientCountryName(String clientCountryName) {
    this.clientCountryName = clientCountryName;
    return this;
  }

   /**
   * Get clientCountryName
   * @return clientCountryName
  **/
  @javax.annotation.Nonnull
  public String getClientCountryName() {
    return clientCountryName;
  }

  public void setClientCountryName(String clientCountryName) {
    this.clientCountryName = clientCountryName;
  }


  public RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner value(String value) {
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
    RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner radarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner = (RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner) o;
    return Objects.equals(this.clientCountryAlpha2, radarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner.clientCountryAlpha2) &&
        Objects.equals(this.clientCountryName, radarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner.clientCountryName) &&
        Objects.equals(this.value, radarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientCountryAlpha2, clientCountryName, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner {\n");
    sb.append("    clientCountryAlpha2: ").append(toIndentedString(clientCountryAlpha2)).append("\n");
    sb.append("    clientCountryName: ").append(toIndentedString(clientCountryName)).append("\n");
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
    openapiFields.add("clientCountryAlpha2");
    openapiFields.add("clientCountryName");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clientCountryAlpha2");
    openapiRequiredFields.add("clientCountryName");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner is not found in the empty JSON string", RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("clientCountryAlpha2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientCountryAlpha2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientCountryAlpha2").toString()));
      }
      if (!jsonObj.get("clientCountryName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientCountryName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientCountryName").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner>() {
           @Override
           public void write(JsonWriter out, RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner
  * @throws IOException if the JSON string is invalid with respect to RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner
  */
  public static RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner.class);
  }

 /**
  * Convert an instance of RadarGetAnnotationsOutagesTop200ResponseResultAnnotationsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

