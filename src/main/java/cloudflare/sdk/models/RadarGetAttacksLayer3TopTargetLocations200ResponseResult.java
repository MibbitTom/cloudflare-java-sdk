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
import cloudflare.sdk.models.RadarGetAttacksLayer3TopTargetLocations200ResponseResultTop0Inner;
import cloudflare.sdk.models.RadarGetDnsAs112TopLocations200ResponseResultMeta;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * RadarGetAttacksLayer3TopTargetLocations200ResponseResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetAttacksLayer3TopTargetLocations200ResponseResult {
  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private RadarGetDnsAs112TopLocations200ResponseResultMeta meta;

  public static final String SERIALIZED_NAME_TOP0 = "top_0";
  @SerializedName(SERIALIZED_NAME_TOP0)
  private List<RadarGetAttacksLayer3TopTargetLocations200ResponseResultTop0Inner> top0 = new ArrayList<>();

  public RadarGetAttacksLayer3TopTargetLocations200ResponseResult() {
  }

  public RadarGetAttacksLayer3TopTargetLocations200ResponseResult meta(RadarGetDnsAs112TopLocations200ResponseResultMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nonnull
  public RadarGetDnsAs112TopLocations200ResponseResultMeta getMeta() {
    return meta;
  }

  public void setMeta(RadarGetDnsAs112TopLocations200ResponseResultMeta meta) {
    this.meta = meta;
  }


  public RadarGetAttacksLayer3TopTargetLocations200ResponseResult top0(List<RadarGetAttacksLayer3TopTargetLocations200ResponseResultTop0Inner> top0) {
    this.top0 = top0;
    return this;
  }

  public RadarGetAttacksLayer3TopTargetLocations200ResponseResult addTop0Item(RadarGetAttacksLayer3TopTargetLocations200ResponseResultTop0Inner top0Item) {
    if (this.top0 == null) {
      this.top0 = new ArrayList<>();
    }
    this.top0.add(top0Item);
    return this;
  }

   /**
   * Get top0
   * @return top0
  **/
  @javax.annotation.Nonnull
  public List<RadarGetAttacksLayer3TopTargetLocations200ResponseResultTop0Inner> getTop0() {
    return top0;
  }

  public void setTop0(List<RadarGetAttacksLayer3TopTargetLocations200ResponseResultTop0Inner> top0) {
    this.top0 = top0;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetAttacksLayer3TopTargetLocations200ResponseResult radarGetAttacksLayer3TopTargetLocations200ResponseResult = (RadarGetAttacksLayer3TopTargetLocations200ResponseResult) o;
    return Objects.equals(this.meta, radarGetAttacksLayer3TopTargetLocations200ResponseResult.meta) &&
        Objects.equals(this.top0, radarGetAttacksLayer3TopTargetLocations200ResponseResult.top0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, top0);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetAttacksLayer3TopTargetLocations200ResponseResult {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    top0: ").append(toIndentedString(top0)).append("\n");
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
    openapiFields.add("top_0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("meta");
    openapiRequiredFields.add("top_0");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetAttacksLayer3TopTargetLocations200ResponseResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetAttacksLayer3TopTargetLocations200ResponseResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetAttacksLayer3TopTargetLocations200ResponseResult is not found in the empty JSON string", RadarGetAttacksLayer3TopTargetLocations200ResponseResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetAttacksLayer3TopTargetLocations200ResponseResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetAttacksLayer3TopTargetLocations200ResponseResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetAttacksLayer3TopTargetLocations200ResponseResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `meta`
      RadarGetDnsAs112TopLocations200ResponseResultMeta.validateJsonElement(jsonObj.get("meta"));
      // ensure the json data is an array
      if (!jsonObj.get("top_0").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `top_0` to be an array in the JSON string but got `%s`", jsonObj.get("top_0").toString()));
      }

      JsonArray jsonArraytop0 = jsonObj.getAsJsonArray("top_0");
      // validate the required field `top_0` (array)
      for (int i = 0; i < jsonArraytop0.size(); i++) {
        RadarGetAttacksLayer3TopTargetLocations200ResponseResultTop0Inner.validateJsonElement(jsonArraytop0.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetAttacksLayer3TopTargetLocations200ResponseResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetAttacksLayer3TopTargetLocations200ResponseResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetAttacksLayer3TopTargetLocations200ResponseResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetAttacksLayer3TopTargetLocations200ResponseResult.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetAttacksLayer3TopTargetLocations200ResponseResult>() {
           @Override
           public void write(JsonWriter out, RadarGetAttacksLayer3TopTargetLocations200ResponseResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetAttacksLayer3TopTargetLocations200ResponseResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetAttacksLayer3TopTargetLocations200ResponseResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetAttacksLayer3TopTargetLocations200ResponseResult
  * @throws IOException if the JSON string is invalid with respect to RadarGetAttacksLayer3TopTargetLocations200ResponseResult
  */
  public static RadarGetAttacksLayer3TopTargetLocations200ResponseResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetAttacksLayer3TopTargetLocations200ResponseResult.class);
  }

 /**
  * Convert an instance of RadarGetAttacksLayer3TopTargetLocations200ResponseResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

