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
 * RadarGetHttpSummaryByDeviceType200ResponseResultSummary0
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetHttpSummaryByDeviceType200ResponseResultSummary0 {
  public static final String SERIALIZED_NAME_DESKTOP = "desktop";
  @SerializedName(SERIALIZED_NAME_DESKTOP)
  private String desktop;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private String other;

  public RadarGetHttpSummaryByDeviceType200ResponseResultSummary0() {
  }

  public RadarGetHttpSummaryByDeviceType200ResponseResultSummary0 desktop(String desktop) {
    this.desktop = desktop;
    return this;
  }

   /**
   * Get desktop
   * @return desktop
  **/
  @javax.annotation.Nonnull
  public String getDesktop() {
    return desktop;
  }

  public void setDesktop(String desktop) {
    this.desktop = desktop;
  }


  public RadarGetHttpSummaryByDeviceType200ResponseResultSummary0 mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @javax.annotation.Nonnull
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public RadarGetHttpSummaryByDeviceType200ResponseResultSummary0 other(String other) {
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @javax.annotation.Nonnull
  public String getOther() {
    return other;
  }

  public void setOther(String other) {
    this.other = other;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetHttpSummaryByDeviceType200ResponseResultSummary0 radarGetHttpSummaryByDeviceType200ResponseResultSummary0 = (RadarGetHttpSummaryByDeviceType200ResponseResultSummary0) o;
    return Objects.equals(this.desktop, radarGetHttpSummaryByDeviceType200ResponseResultSummary0.desktop) &&
        Objects.equals(this.mobile, radarGetHttpSummaryByDeviceType200ResponseResultSummary0.mobile) &&
        Objects.equals(this.other, radarGetHttpSummaryByDeviceType200ResponseResultSummary0.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desktop, mobile, other);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetHttpSummaryByDeviceType200ResponseResultSummary0 {\n");
    sb.append("    desktop: ").append(toIndentedString(desktop)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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
    openapiFields.add("desktop");
    openapiFields.add("mobile");
    openapiFields.add("other");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("desktop");
    openapiRequiredFields.add("mobile");
    openapiRequiredFields.add("other");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetHttpSummaryByDeviceType200ResponseResultSummary0
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetHttpSummaryByDeviceType200ResponseResultSummary0.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetHttpSummaryByDeviceType200ResponseResultSummary0 is not found in the empty JSON string", RadarGetHttpSummaryByDeviceType200ResponseResultSummary0.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetHttpSummaryByDeviceType200ResponseResultSummary0.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetHttpSummaryByDeviceType200ResponseResultSummary0` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetHttpSummaryByDeviceType200ResponseResultSummary0.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("desktop").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desktop` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desktop").toString()));
      }
      if (!jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      if (!jsonObj.get("other").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetHttpSummaryByDeviceType200ResponseResultSummary0.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetHttpSummaryByDeviceType200ResponseResultSummary0' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetHttpSummaryByDeviceType200ResponseResultSummary0> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetHttpSummaryByDeviceType200ResponseResultSummary0.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetHttpSummaryByDeviceType200ResponseResultSummary0>() {
           @Override
           public void write(JsonWriter out, RadarGetHttpSummaryByDeviceType200ResponseResultSummary0 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetHttpSummaryByDeviceType200ResponseResultSummary0 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetHttpSummaryByDeviceType200ResponseResultSummary0 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetHttpSummaryByDeviceType200ResponseResultSummary0
  * @throws IOException if the JSON string is invalid with respect to RadarGetHttpSummaryByDeviceType200ResponseResultSummary0
  */
  public static RadarGetHttpSummaryByDeviceType200ResponseResultSummary0 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetHttpSummaryByDeviceType200ResponseResultSummary0.class);
  }

 /**
  * Convert an instance of RadarGetHttpSummaryByDeviceType200ResponseResultSummary0 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
