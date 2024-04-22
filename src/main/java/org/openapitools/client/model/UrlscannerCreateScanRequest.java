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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * UrlscannerCreateScanRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class UrlscannerCreateScanRequest {
  public static final String SERIALIZED_NAME_CUSTOM_HEADERS = "customHeaders";
  @SerializedName(SERIALIZED_NAME_CUSTOM_HEADERS)
  private Map<String, String> customHeaders = new HashMap<>();

  /**
   * Device resolutions.
   */
  @JsonAdapter(ScreenshotsResolutionsEnum.Adapter.class)
  public enum ScreenshotsResolutionsEnum {
    DESKTOP("desktop"),
    
    MOBILE("mobile"),
    
    TABLET("tablet");

    private String value;

    ScreenshotsResolutionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScreenshotsResolutionsEnum fromValue(String value) {
      for (ScreenshotsResolutionsEnum b : ScreenshotsResolutionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScreenshotsResolutionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScreenshotsResolutionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScreenshotsResolutionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScreenshotsResolutionsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ScreenshotsResolutionsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SCREENSHOTS_RESOLUTIONS = "screenshotsResolutions";
  @SerializedName(SERIALIZED_NAME_SCREENSHOTS_RESOLUTIONS)
  private List<ScreenshotsResolutionsEnum> screenshotsResolutions = new ArrayList<>(Arrays.asList(ScreenshotsResolutionsEnum.DESKTOP));

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  /**
   * The option &#x60;Public&#x60; means it will be included in listings like recent scans and search results. &#x60;Unlisted&#x60; means it will not be included in the aforementioned listings, users will need to have the scan&#39;s ID to access it. A a scan will be automatically marked as unlisted if it fails, if it contains potential PII or other sensitive material.
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    PUBLIC("Public"),
    
    UNLISTED("Unlisted");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VisibilityEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      VisibilityEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private VisibilityEnum visibility = VisibilityEnum.PUBLIC;

  public UrlscannerCreateScanRequest() {
  }

  public UrlscannerCreateScanRequest customHeaders(Map<String, String> customHeaders) {
    this.customHeaders = customHeaders;
    return this;
  }

  public UrlscannerCreateScanRequest putCustomHeadersItem(String key, String customHeadersItem) {
    if (this.customHeaders == null) {
      this.customHeaders = new HashMap<>();
    }
    this.customHeaders.put(key, customHeadersItem);
    return this;
  }

   /**
   * Set custom headers
   * @return customHeaders
  **/
  @javax.annotation.Nullable
  public Map<String, String> getCustomHeaders() {
    return customHeaders;
  }

  public void setCustomHeaders(Map<String, String> customHeaders) {
    this.customHeaders = customHeaders;
  }


  public UrlscannerCreateScanRequest screenshotsResolutions(List<ScreenshotsResolutionsEnum> screenshotsResolutions) {
    this.screenshotsResolutions = screenshotsResolutions;
    return this;
  }

  public UrlscannerCreateScanRequest addScreenshotsResolutionsItem(ScreenshotsResolutionsEnum screenshotsResolutionsItem) {
    if (this.screenshotsResolutions == null) {
      this.screenshotsResolutions = new ArrayList<>(Arrays.asList(ScreenshotsResolutionsEnum.DESKTOP));
    }
    this.screenshotsResolutions.add(screenshotsResolutionsItem);
    return this;
  }

   /**
   * Take multiple screenshots targeting different device types
   * @return screenshotsResolutions
  **/
  @javax.annotation.Nullable
  public List<ScreenshotsResolutionsEnum> getScreenshotsResolutions() {
    return screenshotsResolutions;
  }

  public void setScreenshotsResolutions(List<ScreenshotsResolutionsEnum> screenshotsResolutions) {
    this.screenshotsResolutions = screenshotsResolutions;
  }


  public UrlscannerCreateScanRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public UrlscannerCreateScanRequest visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * The option &#x60;Public&#x60; means it will be included in listings like recent scans and search results. &#x60;Unlisted&#x60; means it will not be included in the aforementioned listings, users will need to have the scan&#39;s ID to access it. A a scan will be automatically marked as unlisted if it fails, if it contains potential PII or other sensitive material.
   * @return visibility
  **/
  @javax.annotation.Nullable
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlscannerCreateScanRequest urlscannerCreateScanRequest = (UrlscannerCreateScanRequest) o;
    return Objects.equals(this.customHeaders, urlscannerCreateScanRequest.customHeaders) &&
        Objects.equals(this.screenshotsResolutions, urlscannerCreateScanRequest.screenshotsResolutions) &&
        Objects.equals(this.url, urlscannerCreateScanRequest.url) &&
        Objects.equals(this.visibility, urlscannerCreateScanRequest.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customHeaders, screenshotsResolutions, url, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlscannerCreateScanRequest {\n");
    sb.append("    customHeaders: ").append(toIndentedString(customHeaders)).append("\n");
    sb.append("    screenshotsResolutions: ").append(toIndentedString(screenshotsResolutions)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
    openapiFields.add("customHeaders");
    openapiFields.add("screenshotsResolutions");
    openapiFields.add("url");
    openapiFields.add("visibility");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UrlscannerCreateScanRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlscannerCreateScanRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlscannerCreateScanRequest is not found in the empty JSON string", UrlscannerCreateScanRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UrlscannerCreateScanRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UrlscannerCreateScanRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UrlscannerCreateScanRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("screenshotsResolutions") != null && !jsonObj.get("screenshotsResolutions").isJsonNull() && !jsonObj.get("screenshotsResolutions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `screenshotsResolutions` to be an array in the JSON string but got `%s`", jsonObj.get("screenshotsResolutions").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      // validate the optional field `visibility`
      if (jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) {
        VisibilityEnum.validateJsonElement(jsonObj.get("visibility"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlscannerCreateScanRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlscannerCreateScanRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlscannerCreateScanRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlscannerCreateScanRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlscannerCreateScanRequest>() {
           @Override
           public void write(JsonWriter out, UrlscannerCreateScanRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlscannerCreateScanRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlscannerCreateScanRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlscannerCreateScanRequest
  * @throws IOException if the JSON string is invalid with respect to UrlscannerCreateScanRequest
  */
  public static UrlscannerCreateScanRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlscannerCreateScanRequest.class);
  }

 /**
  * Convert an instance of UrlscannerCreateScanRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

