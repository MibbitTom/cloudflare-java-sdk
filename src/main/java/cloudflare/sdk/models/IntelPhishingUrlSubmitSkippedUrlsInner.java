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
 * IntelPhishingUrlSubmitSkippedUrlsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class IntelPhishingUrlSubmitSkippedUrlsInner {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_URL_ID = "url_id";
  @SerializedName(SERIALIZED_NAME_URL_ID)
  private Integer urlId;

  public IntelPhishingUrlSubmitSkippedUrlsInner() {
  }

  public IntelPhishingUrlSubmitSkippedUrlsInner url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL that was skipped.
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public IntelPhishingUrlSubmitSkippedUrlsInner urlId(Integer urlId) {
    this.urlId = urlId;
    return this;
  }

   /**
   * ID of the submission of that URL that is currently scanning.
   * @return urlId
  **/
  @javax.annotation.Nullable
  public Integer getUrlId() {
    return urlId;
  }

  public void setUrlId(Integer urlId) {
    this.urlId = urlId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntelPhishingUrlSubmitSkippedUrlsInner intelPhishingUrlSubmitSkippedUrlsInner = (IntelPhishingUrlSubmitSkippedUrlsInner) o;
    return Objects.equals(this.url, intelPhishingUrlSubmitSkippedUrlsInner.url) &&
        Objects.equals(this.urlId, intelPhishingUrlSubmitSkippedUrlsInner.urlId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, urlId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntelPhishingUrlSubmitSkippedUrlsInner {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("url_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IntelPhishingUrlSubmitSkippedUrlsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IntelPhishingUrlSubmitSkippedUrlsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntelPhishingUrlSubmitSkippedUrlsInner is not found in the empty JSON string", IntelPhishingUrlSubmitSkippedUrlsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IntelPhishingUrlSubmitSkippedUrlsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntelPhishingUrlSubmitSkippedUrlsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntelPhishingUrlSubmitSkippedUrlsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntelPhishingUrlSubmitSkippedUrlsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntelPhishingUrlSubmitSkippedUrlsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntelPhishingUrlSubmitSkippedUrlsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<IntelPhishingUrlSubmitSkippedUrlsInner>() {
           @Override
           public void write(JsonWriter out, IntelPhishingUrlSubmitSkippedUrlsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntelPhishingUrlSubmitSkippedUrlsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IntelPhishingUrlSubmitSkippedUrlsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntelPhishingUrlSubmitSkippedUrlsInner
  * @throws IOException if the JSON string is invalid with respect to IntelPhishingUrlSubmitSkippedUrlsInner
  */
  public static IntelPhishingUrlSubmitSkippedUrlsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntelPhishingUrlSubmitSkippedUrlsInner.class);
  }

 /**
  * Convert an instance of IntelPhishingUrlSubmitSkippedUrlsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
