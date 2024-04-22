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
import java.util.List;
import org.openapitools.client.model.BrowserTTL;
import org.openapitools.client.model.CacheKey;
import org.openapitools.client.model.CacheReserve;
import org.openapitools.client.model.EdgeTTL;
import org.openapitools.client.model.ServeStale;

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
 * SetCacheSettingsRuleActionParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class SetCacheSettingsRuleActionParameters {
  public static final String SERIALIZED_NAME_ADDITIONAL_CACHEABLE_PORTS = "additional_cacheable_ports";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_CACHEABLE_PORTS)
  private List<Integer> additionalCacheablePorts = new ArrayList<>();

  public static final String SERIALIZED_NAME_BROWSER_TTL = "browser_ttl";
  @SerializedName(SERIALIZED_NAME_BROWSER_TTL)
  private BrowserTTL browserTtl;

  public static final String SERIALIZED_NAME_CACHE = "cache";
  @SerializedName(SERIALIZED_NAME_CACHE)
  private Boolean cache;

  public static final String SERIALIZED_NAME_CACHE_KEY = "cache_key";
  @SerializedName(SERIALIZED_NAME_CACHE_KEY)
  private CacheKey cacheKey;

  public static final String SERIALIZED_NAME_CACHE_RESERVE = "cache_reserve";
  @SerializedName(SERIALIZED_NAME_CACHE_RESERVE)
  private CacheReserve cacheReserve;

  public static final String SERIALIZED_NAME_EDGE_TTL = "edge_ttl";
  @SerializedName(SERIALIZED_NAME_EDGE_TTL)
  private EdgeTTL edgeTtl;

  public static final String SERIALIZED_NAME_ORIGIN_CACHE_CONTROL = "origin_cache_control";
  @SerializedName(SERIALIZED_NAME_ORIGIN_CACHE_CONTROL)
  private Boolean originCacheControl;

  public static final String SERIALIZED_NAME_ORIGIN_ERROR_PAGE_PASSTHRU = "origin_error_page_passthru";
  @SerializedName(SERIALIZED_NAME_ORIGIN_ERROR_PAGE_PASSTHRU)
  private Boolean originErrorPagePassthru;

  public static final String SERIALIZED_NAME_READ_TIMEOUT = "read_timeout";
  @SerializedName(SERIALIZED_NAME_READ_TIMEOUT)
  private Integer readTimeout;

  public static final String SERIALIZED_NAME_RESPECT_STRONG_ETAGS = "respect_strong_etags";
  @SerializedName(SERIALIZED_NAME_RESPECT_STRONG_ETAGS)
  private Boolean respectStrongEtags;

  public static final String SERIALIZED_NAME_SERVE_STALE = "serve_stale";
  @SerializedName(SERIALIZED_NAME_SERVE_STALE)
  private ServeStale serveStale;

  public SetCacheSettingsRuleActionParameters() {
  }

  public SetCacheSettingsRuleActionParameters additionalCacheablePorts(List<Integer> additionalCacheablePorts) {
    this.additionalCacheablePorts = additionalCacheablePorts;
    return this;
  }

  public SetCacheSettingsRuleActionParameters addAdditionalCacheablePortsItem(Integer additionalCacheablePortsItem) {
    if (this.additionalCacheablePorts == null) {
      this.additionalCacheablePorts = new ArrayList<>();
    }
    this.additionalCacheablePorts.add(additionalCacheablePortsItem);
    return this;
  }

   /**
   * List of additional ports that caching can be enabled on.
   * @return additionalCacheablePorts
  **/
  @javax.annotation.Nullable
  public List<Integer> getAdditionalCacheablePorts() {
    return additionalCacheablePorts;
  }

  public void setAdditionalCacheablePorts(List<Integer> additionalCacheablePorts) {
    this.additionalCacheablePorts = additionalCacheablePorts;
  }


  public SetCacheSettingsRuleActionParameters browserTtl(BrowserTTL browserTtl) {
    this.browserTtl = browserTtl;
    return this;
  }

   /**
   * Get browserTtl
   * @return browserTtl
  **/
  @javax.annotation.Nullable
  public BrowserTTL getBrowserTtl() {
    return browserTtl;
  }

  public void setBrowserTtl(BrowserTTL browserTtl) {
    this.browserTtl = browserTtl;
  }


  public SetCacheSettingsRuleActionParameters cache(Boolean cache) {
    this.cache = cache;
    return this;
  }

   /**
   * Mark whether the request’s response from origin is eligible for caching. Caching itself will still depend on the cache-control header and your other caching configurations.
   * @return cache
  **/
  @javax.annotation.Nullable
  public Boolean getCache() {
    return cache;
  }

  public void setCache(Boolean cache) {
    this.cache = cache;
  }


  public SetCacheSettingsRuleActionParameters cacheKey(CacheKey cacheKey) {
    this.cacheKey = cacheKey;
    return this;
  }

   /**
   * Get cacheKey
   * @return cacheKey
  **/
  @javax.annotation.Nullable
  public CacheKey getCacheKey() {
    return cacheKey;
  }

  public void setCacheKey(CacheKey cacheKey) {
    this.cacheKey = cacheKey;
  }


  public SetCacheSettingsRuleActionParameters cacheReserve(CacheReserve cacheReserve) {
    this.cacheReserve = cacheReserve;
    return this;
  }

   /**
   * Get cacheReserve
   * @return cacheReserve
  **/
  @javax.annotation.Nullable
  public CacheReserve getCacheReserve() {
    return cacheReserve;
  }

  public void setCacheReserve(CacheReserve cacheReserve) {
    this.cacheReserve = cacheReserve;
  }


  public SetCacheSettingsRuleActionParameters edgeTtl(EdgeTTL edgeTtl) {
    this.edgeTtl = edgeTtl;
    return this;
  }

   /**
   * Get edgeTtl
   * @return edgeTtl
  **/
  @javax.annotation.Nullable
  public EdgeTTL getEdgeTtl() {
    return edgeTtl;
  }

  public void setEdgeTtl(EdgeTTL edgeTtl) {
    this.edgeTtl = edgeTtl;
  }


  public SetCacheSettingsRuleActionParameters originCacheControl(Boolean originCacheControl) {
    this.originCacheControl = originCacheControl;
    return this;
  }

   /**
   * When enabled, Cloudflare will aim to strictly adhere to RFC 7234.
   * @return originCacheControl
  **/
  @javax.annotation.Nullable
  public Boolean getOriginCacheControl() {
    return originCacheControl;
  }

  public void setOriginCacheControl(Boolean originCacheControl) {
    this.originCacheControl = originCacheControl;
  }


  public SetCacheSettingsRuleActionParameters originErrorPagePassthru(Boolean originErrorPagePassthru) {
    this.originErrorPagePassthru = originErrorPagePassthru;
    return this;
  }

   /**
   * Generate Cloudflare error pages from issues sent from the origin server. When on, error pages will trigger for issues from the origin
   * @return originErrorPagePassthru
  **/
  @javax.annotation.Nullable
  public Boolean getOriginErrorPagePassthru() {
    return originErrorPagePassthru;
  }

  public void setOriginErrorPagePassthru(Boolean originErrorPagePassthru) {
    this.originErrorPagePassthru = originErrorPagePassthru;
  }


  public SetCacheSettingsRuleActionParameters readTimeout(Integer readTimeout) {
    this.readTimeout = readTimeout;
    return this;
  }

   /**
   * Define a timeout value between two successive read operations to your origin server. Historically, the timeout value between two read options from Cloudflare to an origin server is 100 seconds. If you are attempting to reduce HTTP 524 errors because of timeouts from an origin server, try increasing this timeout value.
   * @return readTimeout
  **/
  @javax.annotation.Nullable
  public Integer getReadTimeout() {
    return readTimeout;
  }

  public void setReadTimeout(Integer readTimeout) {
    this.readTimeout = readTimeout;
  }


  public SetCacheSettingsRuleActionParameters respectStrongEtags(Boolean respectStrongEtags) {
    this.respectStrongEtags = respectStrongEtags;
    return this;
  }

   /**
   * Specify whether or not Cloudflare should respect strong ETag (entity tag) headers. When off, Cloudflare converts strong ETag headers to weak ETag headers.
   * @return respectStrongEtags
  **/
  @javax.annotation.Nullable
  public Boolean getRespectStrongEtags() {
    return respectStrongEtags;
  }

  public void setRespectStrongEtags(Boolean respectStrongEtags) {
    this.respectStrongEtags = respectStrongEtags;
  }


  public SetCacheSettingsRuleActionParameters serveStale(ServeStale serveStale) {
    this.serveStale = serveStale;
    return this;
  }

   /**
   * Get serveStale
   * @return serveStale
  **/
  @javax.annotation.Nullable
  public ServeStale getServeStale() {
    return serveStale;
  }

  public void setServeStale(ServeStale serveStale) {
    this.serveStale = serveStale;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetCacheSettingsRuleActionParameters setCacheSettingsRuleActionParameters = (SetCacheSettingsRuleActionParameters) o;
    return Objects.equals(this.additionalCacheablePorts, setCacheSettingsRuleActionParameters.additionalCacheablePorts) &&
        Objects.equals(this.browserTtl, setCacheSettingsRuleActionParameters.browserTtl) &&
        Objects.equals(this.cache, setCacheSettingsRuleActionParameters.cache) &&
        Objects.equals(this.cacheKey, setCacheSettingsRuleActionParameters.cacheKey) &&
        Objects.equals(this.cacheReserve, setCacheSettingsRuleActionParameters.cacheReserve) &&
        Objects.equals(this.edgeTtl, setCacheSettingsRuleActionParameters.edgeTtl) &&
        Objects.equals(this.originCacheControl, setCacheSettingsRuleActionParameters.originCacheControl) &&
        Objects.equals(this.originErrorPagePassthru, setCacheSettingsRuleActionParameters.originErrorPagePassthru) &&
        Objects.equals(this.readTimeout, setCacheSettingsRuleActionParameters.readTimeout) &&
        Objects.equals(this.respectStrongEtags, setCacheSettingsRuleActionParameters.respectStrongEtags) &&
        Objects.equals(this.serveStale, setCacheSettingsRuleActionParameters.serveStale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalCacheablePorts, browserTtl, cache, cacheKey, cacheReserve, edgeTtl, originCacheControl, originErrorPagePassthru, readTimeout, respectStrongEtags, serveStale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetCacheSettingsRuleActionParameters {\n");
    sb.append("    additionalCacheablePorts: ").append(toIndentedString(additionalCacheablePorts)).append("\n");
    sb.append("    browserTtl: ").append(toIndentedString(browserTtl)).append("\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
    sb.append("    cacheKey: ").append(toIndentedString(cacheKey)).append("\n");
    sb.append("    cacheReserve: ").append(toIndentedString(cacheReserve)).append("\n");
    sb.append("    edgeTtl: ").append(toIndentedString(edgeTtl)).append("\n");
    sb.append("    originCacheControl: ").append(toIndentedString(originCacheControl)).append("\n");
    sb.append("    originErrorPagePassthru: ").append(toIndentedString(originErrorPagePassthru)).append("\n");
    sb.append("    readTimeout: ").append(toIndentedString(readTimeout)).append("\n");
    sb.append("    respectStrongEtags: ").append(toIndentedString(respectStrongEtags)).append("\n");
    sb.append("    serveStale: ").append(toIndentedString(serveStale)).append("\n");
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
    openapiFields.add("additional_cacheable_ports");
    openapiFields.add("browser_ttl");
    openapiFields.add("cache");
    openapiFields.add("cache_key");
    openapiFields.add("cache_reserve");
    openapiFields.add("edge_ttl");
    openapiFields.add("origin_cache_control");
    openapiFields.add("origin_error_page_passthru");
    openapiFields.add("read_timeout");
    openapiFields.add("respect_strong_etags");
    openapiFields.add("serve_stale");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SetCacheSettingsRuleActionParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SetCacheSettingsRuleActionParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetCacheSettingsRuleActionParameters is not found in the empty JSON string", SetCacheSettingsRuleActionParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SetCacheSettingsRuleActionParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetCacheSettingsRuleActionParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("additional_cacheable_ports") != null && !jsonObj.get("additional_cacheable_ports").isJsonNull() && !jsonObj.get("additional_cacheable_ports").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_cacheable_ports` to be an array in the JSON string but got `%s`", jsonObj.get("additional_cacheable_ports").toString()));
      }
      // validate the optional field `browser_ttl`
      if (jsonObj.get("browser_ttl") != null && !jsonObj.get("browser_ttl").isJsonNull()) {
        BrowserTTL.validateJsonElement(jsonObj.get("browser_ttl"));
      }
      // validate the optional field `cache_key`
      if (jsonObj.get("cache_key") != null && !jsonObj.get("cache_key").isJsonNull()) {
        CacheKey.validateJsonElement(jsonObj.get("cache_key"));
      }
      // validate the optional field `cache_reserve`
      if (jsonObj.get("cache_reserve") != null && !jsonObj.get("cache_reserve").isJsonNull()) {
        CacheReserve.validateJsonElement(jsonObj.get("cache_reserve"));
      }
      // validate the optional field `edge_ttl`
      if (jsonObj.get("edge_ttl") != null && !jsonObj.get("edge_ttl").isJsonNull()) {
        EdgeTTL.validateJsonElement(jsonObj.get("edge_ttl"));
      }
      // validate the optional field `serve_stale`
      if (jsonObj.get("serve_stale") != null && !jsonObj.get("serve_stale").isJsonNull()) {
        ServeStale.validateJsonElement(jsonObj.get("serve_stale"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetCacheSettingsRuleActionParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetCacheSettingsRuleActionParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetCacheSettingsRuleActionParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetCacheSettingsRuleActionParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<SetCacheSettingsRuleActionParameters>() {
           @Override
           public void write(JsonWriter out, SetCacheSettingsRuleActionParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetCacheSettingsRuleActionParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetCacheSettingsRuleActionParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetCacheSettingsRuleActionParameters
  * @throws IOException if the JSON string is invalid with respect to SetCacheSettingsRuleActionParameters
  */
  public static SetCacheSettingsRuleActionParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetCacheSettingsRuleActionParameters.class);
  }

 /**
  * Convert an instance of SetCacheSettingsRuleActionParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

