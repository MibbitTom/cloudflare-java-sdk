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

import invalidPackageName.JSON;

/**
 * PageShieldUpdatePageShieldSettingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class PageShieldUpdatePageShieldSettingsRequest {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_USE_CLOUDFLARE_REPORTING_ENDPOINT = "use_cloudflare_reporting_endpoint";
  @SerializedName(SERIALIZED_NAME_USE_CLOUDFLARE_REPORTING_ENDPOINT)
  private Boolean useCloudflareReportingEndpoint;

  public static final String SERIALIZED_NAME_USE_CONNECTION_URL_PATH = "use_connection_url_path";
  @SerializedName(SERIALIZED_NAME_USE_CONNECTION_URL_PATH)
  private Boolean useConnectionUrlPath;

  public PageShieldUpdatePageShieldSettingsRequest() {
  }

  public PageShieldUpdatePageShieldSettingsRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * When true, indicates that Page Shield is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public PageShieldUpdatePageShieldSettingsRequest useCloudflareReportingEndpoint(Boolean useCloudflareReportingEndpoint) {
    this.useCloudflareReportingEndpoint = useCloudflareReportingEndpoint;
    return this;
  }

   /**
   * When true, CSP reports will be sent to https://csp-reporting.cloudflare.com/cdn-cgi/script_monitor/report
   * @return useCloudflareReportingEndpoint
  **/
  @javax.annotation.Nullable
  public Boolean getUseCloudflareReportingEndpoint() {
    return useCloudflareReportingEndpoint;
  }

  public void setUseCloudflareReportingEndpoint(Boolean useCloudflareReportingEndpoint) {
    this.useCloudflareReportingEndpoint = useCloudflareReportingEndpoint;
  }


  public PageShieldUpdatePageShieldSettingsRequest useConnectionUrlPath(Boolean useConnectionUrlPath) {
    this.useConnectionUrlPath = useConnectionUrlPath;
    return this;
  }

   /**
   * When true, the paths associated with connections URLs will also be analyzed.
   * @return useConnectionUrlPath
  **/
  @javax.annotation.Nullable
  public Boolean getUseConnectionUrlPath() {
    return useConnectionUrlPath;
  }

  public void setUseConnectionUrlPath(Boolean useConnectionUrlPath) {
    this.useConnectionUrlPath = useConnectionUrlPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageShieldUpdatePageShieldSettingsRequest pageShieldUpdatePageShieldSettingsRequest = (PageShieldUpdatePageShieldSettingsRequest) o;
    return Objects.equals(this.enabled, pageShieldUpdatePageShieldSettingsRequest.enabled) &&
        Objects.equals(this.useCloudflareReportingEndpoint, pageShieldUpdatePageShieldSettingsRequest.useCloudflareReportingEndpoint) &&
        Objects.equals(this.useConnectionUrlPath, pageShieldUpdatePageShieldSettingsRequest.useConnectionUrlPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, useCloudflareReportingEndpoint, useConnectionUrlPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageShieldUpdatePageShieldSettingsRequest {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    useCloudflareReportingEndpoint: ").append(toIndentedString(useCloudflareReportingEndpoint)).append("\n");
    sb.append("    useConnectionUrlPath: ").append(toIndentedString(useConnectionUrlPath)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("use_cloudflare_reporting_endpoint");
    openapiFields.add("use_connection_url_path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PageShieldUpdatePageShieldSettingsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PageShieldUpdatePageShieldSettingsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageShieldUpdatePageShieldSettingsRequest is not found in the empty JSON string", PageShieldUpdatePageShieldSettingsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PageShieldUpdatePageShieldSettingsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageShieldUpdatePageShieldSettingsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageShieldUpdatePageShieldSettingsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageShieldUpdatePageShieldSettingsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageShieldUpdatePageShieldSettingsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageShieldUpdatePageShieldSettingsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PageShieldUpdatePageShieldSettingsRequest>() {
           @Override
           public void write(JsonWriter out, PageShieldUpdatePageShieldSettingsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageShieldUpdatePageShieldSettingsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PageShieldUpdatePageShieldSettingsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageShieldUpdatePageShieldSettingsRequest
  * @throws IOException if the JSON string is invalid with respect to PageShieldUpdatePageShieldSettingsRequest
  */
  public static PageShieldUpdatePageShieldSettingsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageShieldUpdatePageShieldSettingsRequest.class);
  }

 /**
  * Convert an instance of PageShieldUpdatePageShieldSettingsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

