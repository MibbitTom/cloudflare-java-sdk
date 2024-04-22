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
 * RadarGetEntitiesLocations200ResponseResultLocationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetEntitiesLocations200ResponseResultLocationsInner {
  public static final String SERIALIZED_NAME_ALPHA2 = "alpha2";
  @SerializedName(SERIALIZED_NAME_ALPHA2)
  private String alpha2;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private String latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private String longitude;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public RadarGetEntitiesLocations200ResponseResultLocationsInner() {
  }

  public RadarGetEntitiesLocations200ResponseResultLocationsInner alpha2(String alpha2) {
    this.alpha2 = alpha2;
    return this;
  }

   /**
   * Get alpha2
   * @return alpha2
  **/
  @javax.annotation.Nonnull
  public String getAlpha2() {
    return alpha2;
  }

  public void setAlpha2(String alpha2) {
    this.alpha2 = alpha2;
  }


  public RadarGetEntitiesLocations200ResponseResultLocationsInner latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @javax.annotation.Nonnull
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  public RadarGetEntitiesLocations200ResponseResultLocationsInner longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @javax.annotation.Nonnull
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  public RadarGetEntitiesLocations200ResponseResultLocationsInner name(String name) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetEntitiesLocations200ResponseResultLocationsInner radarGetEntitiesLocations200ResponseResultLocationsInner = (RadarGetEntitiesLocations200ResponseResultLocationsInner) o;
    return Objects.equals(this.alpha2, radarGetEntitiesLocations200ResponseResultLocationsInner.alpha2) &&
        Objects.equals(this.latitude, radarGetEntitiesLocations200ResponseResultLocationsInner.latitude) &&
        Objects.equals(this.longitude, radarGetEntitiesLocations200ResponseResultLocationsInner.longitude) &&
        Objects.equals(this.name, radarGetEntitiesLocations200ResponseResultLocationsInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alpha2, latitude, longitude, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetEntitiesLocations200ResponseResultLocationsInner {\n");
    sb.append("    alpha2: ").append(toIndentedString(alpha2)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("alpha2");
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("alpha2");
    openapiRequiredFields.add("latitude");
    openapiRequiredFields.add("longitude");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetEntitiesLocations200ResponseResultLocationsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetEntitiesLocations200ResponseResultLocationsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetEntitiesLocations200ResponseResultLocationsInner is not found in the empty JSON string", RadarGetEntitiesLocations200ResponseResultLocationsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetEntitiesLocations200ResponseResultLocationsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetEntitiesLocations200ResponseResultLocationsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetEntitiesLocations200ResponseResultLocationsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("alpha2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alpha2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alpha2").toString()));
      }
      if (!jsonObj.get("latitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latitude").toString()));
      }
      if (!jsonObj.get("longitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `longitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("longitude").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetEntitiesLocations200ResponseResultLocationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetEntitiesLocations200ResponseResultLocationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetEntitiesLocations200ResponseResultLocationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetEntitiesLocations200ResponseResultLocationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetEntitiesLocations200ResponseResultLocationsInner>() {
           @Override
           public void write(JsonWriter out, RadarGetEntitiesLocations200ResponseResultLocationsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetEntitiesLocations200ResponseResultLocationsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetEntitiesLocations200ResponseResultLocationsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetEntitiesLocations200ResponseResultLocationsInner
  * @throws IOException if the JSON string is invalid with respect to RadarGetEntitiesLocations200ResponseResultLocationsInner
  */
  public static RadarGetEntitiesLocations200ResponseResultLocationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetEntitiesLocations200ResponseResultLocationsInner.class);
  }

 /**
  * Convert an instance of RadarGetEntitiesLocations200ResponseResultLocationsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

