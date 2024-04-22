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
import org.openapitools.client.model.RadarGetAttacksLayer3TimeseriesGroups200ResponseResultSerie0;
import org.openapitools.client.model.RadarGetDnsAs112Timeseries200ResponseResultMeta;

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
 * RadarGetAttacksLayer3TimeseriesGroups200ResponseResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetAttacksLayer3TimeseriesGroups200ResponseResult {
  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private RadarGetDnsAs112Timeseries200ResponseResultMeta meta;

  public static final String SERIALIZED_NAME_SERIE0 = "serie_0";
  @SerializedName(SERIALIZED_NAME_SERIE0)
  private RadarGetAttacksLayer3TimeseriesGroups200ResponseResultSerie0 serie0;

  public RadarGetAttacksLayer3TimeseriesGroups200ResponseResult() {
  }

  public RadarGetAttacksLayer3TimeseriesGroups200ResponseResult meta(RadarGetDnsAs112Timeseries200ResponseResultMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nonnull
  public RadarGetDnsAs112Timeseries200ResponseResultMeta getMeta() {
    return meta;
  }

  public void setMeta(RadarGetDnsAs112Timeseries200ResponseResultMeta meta) {
    this.meta = meta;
  }


  public RadarGetAttacksLayer3TimeseriesGroups200ResponseResult serie0(RadarGetAttacksLayer3TimeseriesGroups200ResponseResultSerie0 serie0) {
    this.serie0 = serie0;
    return this;
  }

   /**
   * Get serie0
   * @return serie0
  **/
  @javax.annotation.Nonnull
  public RadarGetAttacksLayer3TimeseriesGroups200ResponseResultSerie0 getSerie0() {
    return serie0;
  }

  public void setSerie0(RadarGetAttacksLayer3TimeseriesGroups200ResponseResultSerie0 serie0) {
    this.serie0 = serie0;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetAttacksLayer3TimeseriesGroups200ResponseResult radarGetAttacksLayer3TimeseriesGroups200ResponseResult = (RadarGetAttacksLayer3TimeseriesGroups200ResponseResult) o;
    return Objects.equals(this.meta, radarGetAttacksLayer3TimeseriesGroups200ResponseResult.meta) &&
        Objects.equals(this.serie0, radarGetAttacksLayer3TimeseriesGroups200ResponseResult.serie0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, serie0);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetAttacksLayer3TimeseriesGroups200ResponseResult {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    serie0: ").append(toIndentedString(serie0)).append("\n");
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
    openapiFields.add("meta");
    openapiFields.add("serie_0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("meta");
    openapiRequiredFields.add("serie_0");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetAttacksLayer3TimeseriesGroups200ResponseResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetAttacksLayer3TimeseriesGroups200ResponseResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetAttacksLayer3TimeseriesGroups200ResponseResult is not found in the empty JSON string", RadarGetAttacksLayer3TimeseriesGroups200ResponseResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetAttacksLayer3TimeseriesGroups200ResponseResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetAttacksLayer3TimeseriesGroups200ResponseResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetAttacksLayer3TimeseriesGroups200ResponseResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `meta`
      RadarGetDnsAs112Timeseries200ResponseResultMeta.validateJsonElement(jsonObj.get("meta"));
      // validate the required field `serie_0`
      RadarGetAttacksLayer3TimeseriesGroups200ResponseResultSerie0.validateJsonElement(jsonObj.get("serie_0"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetAttacksLayer3TimeseriesGroups200ResponseResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetAttacksLayer3TimeseriesGroups200ResponseResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetAttacksLayer3TimeseriesGroups200ResponseResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetAttacksLayer3TimeseriesGroups200ResponseResult.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetAttacksLayer3TimeseriesGroups200ResponseResult>() {
           @Override
           public void write(JsonWriter out, RadarGetAttacksLayer3TimeseriesGroups200ResponseResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetAttacksLayer3TimeseriesGroups200ResponseResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetAttacksLayer3TimeseriesGroups200ResponseResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetAttacksLayer3TimeseriesGroups200ResponseResult
  * @throws IOException if the JSON string is invalid with respect to RadarGetAttacksLayer3TimeseriesGroups200ResponseResult
  */
  public static RadarGetAttacksLayer3TimeseriesGroups200ResponseResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetAttacksLayer3TimeseriesGroups200ResponseResult.class);
  }

 /**
  * Convert an instance of RadarGetAttacksLayer3TimeseriesGroups200ResponseResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

