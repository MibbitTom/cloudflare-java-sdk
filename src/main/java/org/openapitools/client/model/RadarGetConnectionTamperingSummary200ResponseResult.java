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
import org.openapitools.client.model.RadarGetAttacksLayer3Summary200ResponseResultMeta;
import org.openapitools.client.model.RadarGetConnectionTamperingSummary200ResponseResultSummary0;

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

import invalidPackageName.JSON;

/**
 * RadarGetConnectionTamperingSummary200ResponseResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetConnectionTamperingSummary200ResponseResult {
  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private RadarGetAttacksLayer3Summary200ResponseResultMeta meta;

  public static final String SERIALIZED_NAME_SUMMARY0 = "summary_0";
  @SerializedName(SERIALIZED_NAME_SUMMARY0)
  private RadarGetConnectionTamperingSummary200ResponseResultSummary0 summary0;

  public RadarGetConnectionTamperingSummary200ResponseResult() {
  }

  public RadarGetConnectionTamperingSummary200ResponseResult meta(RadarGetAttacksLayer3Summary200ResponseResultMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nonnull
  public RadarGetAttacksLayer3Summary200ResponseResultMeta getMeta() {
    return meta;
  }

  public void setMeta(RadarGetAttacksLayer3Summary200ResponseResultMeta meta) {
    this.meta = meta;
  }


  public RadarGetConnectionTamperingSummary200ResponseResult summary0(RadarGetConnectionTamperingSummary200ResponseResultSummary0 summary0) {
    this.summary0 = summary0;
    return this;
  }

   /**
   * Get summary0
   * @return summary0
  **/
  @javax.annotation.Nonnull
  public RadarGetConnectionTamperingSummary200ResponseResultSummary0 getSummary0() {
    return summary0;
  }

  public void setSummary0(RadarGetConnectionTamperingSummary200ResponseResultSummary0 summary0) {
    this.summary0 = summary0;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetConnectionTamperingSummary200ResponseResult radarGetConnectionTamperingSummary200ResponseResult = (RadarGetConnectionTamperingSummary200ResponseResult) o;
    return Objects.equals(this.meta, radarGetConnectionTamperingSummary200ResponseResult.meta) &&
        Objects.equals(this.summary0, radarGetConnectionTamperingSummary200ResponseResult.summary0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, summary0);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetConnectionTamperingSummary200ResponseResult {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    summary0: ").append(toIndentedString(summary0)).append("\n");
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
    openapiFields.add("summary_0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("meta");
    openapiRequiredFields.add("summary_0");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetConnectionTamperingSummary200ResponseResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetConnectionTamperingSummary200ResponseResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetConnectionTamperingSummary200ResponseResult is not found in the empty JSON string", RadarGetConnectionTamperingSummary200ResponseResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetConnectionTamperingSummary200ResponseResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetConnectionTamperingSummary200ResponseResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetConnectionTamperingSummary200ResponseResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `meta`
      RadarGetAttacksLayer3Summary200ResponseResultMeta.validateJsonElement(jsonObj.get("meta"));
      // validate the required field `summary_0`
      RadarGetConnectionTamperingSummary200ResponseResultSummary0.validateJsonElement(jsonObj.get("summary_0"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetConnectionTamperingSummary200ResponseResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetConnectionTamperingSummary200ResponseResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetConnectionTamperingSummary200ResponseResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetConnectionTamperingSummary200ResponseResult.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetConnectionTamperingSummary200ResponseResult>() {
           @Override
           public void write(JsonWriter out, RadarGetConnectionTamperingSummary200ResponseResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetConnectionTamperingSummary200ResponseResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetConnectionTamperingSummary200ResponseResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetConnectionTamperingSummary200ResponseResult
  * @throws IOException if the JSON string is invalid with respect to RadarGetConnectionTamperingSummary200ResponseResult
  */
  public static RadarGetConnectionTamperingSummary200ResponseResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetConnectionTamperingSummary200ResponseResult.class);
  }

 /**
  * Convert an instance of RadarGetConnectionTamperingSummary200ResponseResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

