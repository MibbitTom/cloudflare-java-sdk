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
import cloudflare.sdk.models.RadarGetBgpHijacksEvents200ResponseResultInfo;
import cloudflare.sdk.models.RadarGetBgpRouteLeakEvents200ResponseResult;
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
 * RadarGetBgpRouteLeakEvents200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetBgpRouteLeakEvents200Response {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private RadarGetBgpRouteLeakEvents200ResponseResult result;

  public static final String SERIALIZED_NAME_RESULT_INFO = "result_info";
  @SerializedName(SERIALIZED_NAME_RESULT_INFO)
  private RadarGetBgpHijacksEvents200ResponseResultInfo resultInfo;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public RadarGetBgpRouteLeakEvents200Response() {
  }

  public RadarGetBgpRouteLeakEvents200Response result(RadarGetBgpRouteLeakEvents200ResponseResult result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nonnull
  public RadarGetBgpRouteLeakEvents200ResponseResult getResult() {
    return result;
  }

  public void setResult(RadarGetBgpRouteLeakEvents200ResponseResult result) {
    this.result = result;
  }


  public RadarGetBgpRouteLeakEvents200Response resultInfo(RadarGetBgpHijacksEvents200ResponseResultInfo resultInfo) {
    this.resultInfo = resultInfo;
    return this;
  }

   /**
   * Get resultInfo
   * @return resultInfo
  **/
  @javax.annotation.Nonnull
  public RadarGetBgpHijacksEvents200ResponseResultInfo getResultInfo() {
    return resultInfo;
  }

  public void setResultInfo(RadarGetBgpHijacksEvents200ResponseResultInfo resultInfo) {
    this.resultInfo = resultInfo;
  }


  public RadarGetBgpRouteLeakEvents200Response success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nonnull
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetBgpRouteLeakEvents200Response radarGetBgpRouteLeakEvents200Response = (RadarGetBgpRouteLeakEvents200Response) o;
    return Objects.equals(this.result, radarGetBgpRouteLeakEvents200Response.result) &&
        Objects.equals(this.resultInfo, radarGetBgpRouteLeakEvents200Response.resultInfo) &&
        Objects.equals(this.success, radarGetBgpRouteLeakEvents200Response.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, resultInfo, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetBgpRouteLeakEvents200Response {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
    openapiFields.add("result");
    openapiFields.add("result_info");
    openapiFields.add("success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("result");
    openapiRequiredFields.add("result_info");
    openapiRequiredFields.add("success");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetBgpRouteLeakEvents200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetBgpRouteLeakEvents200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetBgpRouteLeakEvents200Response is not found in the empty JSON string", RadarGetBgpRouteLeakEvents200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetBgpRouteLeakEvents200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetBgpRouteLeakEvents200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetBgpRouteLeakEvents200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `result`
      RadarGetBgpRouteLeakEvents200ResponseResult.validateJsonElement(jsonObj.get("result"));
      // validate the required field `result_info`
      RadarGetBgpHijacksEvents200ResponseResultInfo.validateJsonElement(jsonObj.get("result_info"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetBgpRouteLeakEvents200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetBgpRouteLeakEvents200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetBgpRouteLeakEvents200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetBgpRouteLeakEvents200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetBgpRouteLeakEvents200Response>() {
           @Override
           public void write(JsonWriter out, RadarGetBgpRouteLeakEvents200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetBgpRouteLeakEvents200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetBgpRouteLeakEvents200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetBgpRouteLeakEvents200Response
  * @throws IOException if the JSON string is invalid with respect to RadarGetBgpRouteLeakEvents200Response
  */
  public static RadarGetBgpRouteLeakEvents200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetBgpRouteLeakEvents200Response.class);
  }

 /**
  * Convert an instance of RadarGetBgpRouteLeakEvents200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

