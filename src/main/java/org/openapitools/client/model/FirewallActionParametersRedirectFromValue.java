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
import org.openapitools.client.model.FirewallActionParametersRedirectFromValueTargetUrl;

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
 * The parameters that control the redirect.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class FirewallActionParametersRedirectFromValue {
  public static final String SERIALIZED_NAME_PRESERVE_QUERY_STRING = "preserve_query_string";
  @SerializedName(SERIALIZED_NAME_PRESERVE_QUERY_STRING)
  private Boolean preserveQueryString;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public static final String SERIALIZED_NAME_TARGET_URL = "target_url";
  @SerializedName(SERIALIZED_NAME_TARGET_URL)
  private FirewallActionParametersRedirectFromValueTargetUrl targetUrl;

  public FirewallActionParametersRedirectFromValue() {
  }

  public FirewallActionParametersRedirectFromValue preserveQueryString(Boolean preserveQueryString) {
    this.preserveQueryString = preserveQueryString;
    return this;
  }

   /**
   * Whether the query string for the request should be carried to the redirect&#39;s target url.
   * @return preserveQueryString
  **/
  @javax.annotation.Nullable
  public Boolean getPreserveQueryString() {
    return preserveQueryString;
  }

  public void setPreserveQueryString(Boolean preserveQueryString) {
    this.preserveQueryString = preserveQueryString;
  }


  public FirewallActionParametersRedirectFromValue statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * The status code to use for the redirect.
   * @return statusCode
  **/
  @javax.annotation.Nullable
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public FirewallActionParametersRedirectFromValue targetUrl(FirewallActionParametersRedirectFromValueTargetUrl targetUrl) {
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * Get targetUrl
   * @return targetUrl
  **/
  @javax.annotation.Nullable
  public FirewallActionParametersRedirectFromValueTargetUrl getTargetUrl() {
    return targetUrl;
  }

  public void setTargetUrl(FirewallActionParametersRedirectFromValueTargetUrl targetUrl) {
    this.targetUrl = targetUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirewallActionParametersRedirectFromValue firewallActionParametersRedirectFromValue = (FirewallActionParametersRedirectFromValue) o;
    return Objects.equals(this.preserveQueryString, firewallActionParametersRedirectFromValue.preserveQueryString) &&
        Objects.equals(this.statusCode, firewallActionParametersRedirectFromValue.statusCode) &&
        Objects.equals(this.targetUrl, firewallActionParametersRedirectFromValue.targetUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preserveQueryString, statusCode, targetUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirewallActionParametersRedirectFromValue {\n");
    sb.append("    preserveQueryString: ").append(toIndentedString(preserveQueryString)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
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
    openapiFields.add("preserve_query_string");
    openapiFields.add("status_code");
    openapiFields.add("target_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FirewallActionParametersRedirectFromValue
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FirewallActionParametersRedirectFromValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FirewallActionParametersRedirectFromValue is not found in the empty JSON string", FirewallActionParametersRedirectFromValue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FirewallActionParametersRedirectFromValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FirewallActionParametersRedirectFromValue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `target_url`
      if (jsonObj.get("target_url") != null && !jsonObj.get("target_url").isJsonNull()) {
        FirewallActionParametersRedirectFromValueTargetUrl.validateJsonElement(jsonObj.get("target_url"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FirewallActionParametersRedirectFromValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FirewallActionParametersRedirectFromValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FirewallActionParametersRedirectFromValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FirewallActionParametersRedirectFromValue.class));

       return (TypeAdapter<T>) new TypeAdapter<FirewallActionParametersRedirectFromValue>() {
           @Override
           public void write(JsonWriter out, FirewallActionParametersRedirectFromValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FirewallActionParametersRedirectFromValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FirewallActionParametersRedirectFromValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FirewallActionParametersRedirectFromValue
  * @throws IOException if the JSON string is invalid with respect to FirewallActionParametersRedirectFromValue
  */
  public static FirewallActionParametersRedirectFromValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FirewallActionParametersRedirectFromValue.class);
  }

 /**
  * Convert an instance of FirewallActionParametersRedirectFromValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
