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
import org.openapitools.client.model.CustomKey;

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
 * Define which components of the request are included or excluded from the cache key Cloudflare uses to store the response in cache.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class CacheKey {
  public static final String SERIALIZED_NAME_CACHE_BY_DEVICE_TYPE = "cache_by_device_type";
  @SerializedName(SERIALIZED_NAME_CACHE_BY_DEVICE_TYPE)
  private Boolean cacheByDeviceType;

  public static final String SERIALIZED_NAME_CACHE_DECEPTION_ARMOR = "cache_deception_armor";
  @SerializedName(SERIALIZED_NAME_CACHE_DECEPTION_ARMOR)
  private Boolean cacheDeceptionArmor;

  public static final String SERIALIZED_NAME_CUSTOM_KEY = "custom_key";
  @SerializedName(SERIALIZED_NAME_CUSTOM_KEY)
  private CustomKey customKey;

  public static final String SERIALIZED_NAME_IGNORE_QUERY_STRINGS_ORDER = "ignore_query_strings_order";
  @SerializedName(SERIALIZED_NAME_IGNORE_QUERY_STRINGS_ORDER)
  private Boolean ignoreQueryStringsOrder;

  public CacheKey() {
  }

  public CacheKey cacheByDeviceType(Boolean cacheByDeviceType) {
    this.cacheByDeviceType = cacheByDeviceType;
    return this;
  }

   /**
   * Separate cached content based on the visitor’s device type
   * @return cacheByDeviceType
  **/
  @javax.annotation.Nullable
  public Boolean getCacheByDeviceType() {
    return cacheByDeviceType;
  }

  public void setCacheByDeviceType(Boolean cacheByDeviceType) {
    this.cacheByDeviceType = cacheByDeviceType;
  }


  public CacheKey cacheDeceptionArmor(Boolean cacheDeceptionArmor) {
    this.cacheDeceptionArmor = cacheDeceptionArmor;
    return this;
  }

   /**
   * Protect from web cache deception attacks while allowing static assets to be cached
   * @return cacheDeceptionArmor
  **/
  @javax.annotation.Nullable
  public Boolean getCacheDeceptionArmor() {
    return cacheDeceptionArmor;
  }

  public void setCacheDeceptionArmor(Boolean cacheDeceptionArmor) {
    this.cacheDeceptionArmor = cacheDeceptionArmor;
  }


  public CacheKey customKey(CustomKey customKey) {
    this.customKey = customKey;
    return this;
  }

   /**
   * Get customKey
   * @return customKey
  **/
  @javax.annotation.Nullable
  public CustomKey getCustomKey() {
    return customKey;
  }

  public void setCustomKey(CustomKey customKey) {
    this.customKey = customKey;
  }


  public CacheKey ignoreQueryStringsOrder(Boolean ignoreQueryStringsOrder) {
    this.ignoreQueryStringsOrder = ignoreQueryStringsOrder;
    return this;
  }

   /**
   * Treat requests with the same query parameters the same, regardless of the order those query parameters are in. A value of true ignores the query strings&#39; order.
   * @return ignoreQueryStringsOrder
  **/
  @javax.annotation.Nullable
  public Boolean getIgnoreQueryStringsOrder() {
    return ignoreQueryStringsOrder;
  }

  public void setIgnoreQueryStringsOrder(Boolean ignoreQueryStringsOrder) {
    this.ignoreQueryStringsOrder = ignoreQueryStringsOrder;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheKey cacheKey = (CacheKey) o;
    return Objects.equals(this.cacheByDeviceType, cacheKey.cacheByDeviceType) &&
        Objects.equals(this.cacheDeceptionArmor, cacheKey.cacheDeceptionArmor) &&
        Objects.equals(this.customKey, cacheKey.customKey) &&
        Objects.equals(this.ignoreQueryStringsOrder, cacheKey.ignoreQueryStringsOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheByDeviceType, cacheDeceptionArmor, customKey, ignoreQueryStringsOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheKey {\n");
    sb.append("    cacheByDeviceType: ").append(toIndentedString(cacheByDeviceType)).append("\n");
    sb.append("    cacheDeceptionArmor: ").append(toIndentedString(cacheDeceptionArmor)).append("\n");
    sb.append("    customKey: ").append(toIndentedString(customKey)).append("\n");
    sb.append("    ignoreQueryStringsOrder: ").append(toIndentedString(ignoreQueryStringsOrder)).append("\n");
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
    openapiFields.add("cache_by_device_type");
    openapiFields.add("cache_deception_armor");
    openapiFields.add("custom_key");
    openapiFields.add("ignore_query_strings_order");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CacheKey
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CacheKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CacheKey is not found in the empty JSON string", CacheKey.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CacheKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CacheKey` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `custom_key`
      if (jsonObj.get("custom_key") != null && !jsonObj.get("custom_key").isJsonNull()) {
        CustomKey.validateJsonElement(jsonObj.get("custom_key"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CacheKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CacheKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CacheKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CacheKey.class));

       return (TypeAdapter<T>) new TypeAdapter<CacheKey>() {
           @Override
           public void write(JsonWriter out, CacheKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CacheKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CacheKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CacheKey
  * @throws IOException if the JSON string is invalid with respect to CacheKey
  */
  public static CacheKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CacheKey.class);
  }

 /**
  * Convert an instance of CacheKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

