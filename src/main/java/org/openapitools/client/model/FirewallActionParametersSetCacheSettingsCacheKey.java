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
import org.openapitools.client.model.FirewallActionParametersSetCacheSettingsCacheKeyCustomKey;

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
 * Set the Cache TTL.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class FirewallActionParametersSetCacheSettingsCacheKey {
  public static final String SERIALIZED_NAME_CACHE_DECEPTION_ARMOR = "cache_deception_armor";
  @SerializedName(SERIALIZED_NAME_CACHE_DECEPTION_ARMOR)
  private Boolean cacheDeceptionArmor;

  public static final String SERIALIZED_NAME_CUSTOM_KEY = "custom_key";
  @SerializedName(SERIALIZED_NAME_CUSTOM_KEY)
  private FirewallActionParametersSetCacheSettingsCacheKeyCustomKey customKey;

  public static final String SERIALIZED_NAME_IGNORE_QUERY_STRINGS_ORDER = "ignore_query_strings_order";
  @SerializedName(SERIALIZED_NAME_IGNORE_QUERY_STRINGS_ORDER)
  private Boolean ignoreQueryStringsOrder;

  public FirewallActionParametersSetCacheSettingsCacheKey() {
  }

  public FirewallActionParametersSetCacheSettingsCacheKey cacheDeceptionArmor(Boolean cacheDeceptionArmor) {
    this.cacheDeceptionArmor = cacheDeceptionArmor;
    return this;
  }

   /**
   * Get cacheDeceptionArmor
   * @return cacheDeceptionArmor
  **/
  @javax.annotation.Nullable
  public Boolean getCacheDeceptionArmor() {
    return cacheDeceptionArmor;
  }

  public void setCacheDeceptionArmor(Boolean cacheDeceptionArmor) {
    this.cacheDeceptionArmor = cacheDeceptionArmor;
  }


  public FirewallActionParametersSetCacheSettingsCacheKey customKey(FirewallActionParametersSetCacheSettingsCacheKeyCustomKey customKey) {
    this.customKey = customKey;
    return this;
  }

   /**
   * Get customKey
   * @return customKey
  **/
  @javax.annotation.Nullable
  public FirewallActionParametersSetCacheSettingsCacheKeyCustomKey getCustomKey() {
    return customKey;
  }

  public void setCustomKey(FirewallActionParametersSetCacheSettingsCacheKeyCustomKey customKey) {
    this.customKey = customKey;
  }


  public FirewallActionParametersSetCacheSettingsCacheKey ignoreQueryStringsOrder(Boolean ignoreQueryStringsOrder) {
    this.ignoreQueryStringsOrder = ignoreQueryStringsOrder;
    return this;
  }

   /**
   * Get ignoreQueryStringsOrder
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
    FirewallActionParametersSetCacheSettingsCacheKey firewallActionParametersSetCacheSettingsCacheKey = (FirewallActionParametersSetCacheSettingsCacheKey) o;
    return Objects.equals(this.cacheDeceptionArmor, firewallActionParametersSetCacheSettingsCacheKey.cacheDeceptionArmor) &&
        Objects.equals(this.customKey, firewallActionParametersSetCacheSettingsCacheKey.customKey) &&
        Objects.equals(this.ignoreQueryStringsOrder, firewallActionParametersSetCacheSettingsCacheKey.ignoreQueryStringsOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheDeceptionArmor, customKey, ignoreQueryStringsOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirewallActionParametersSetCacheSettingsCacheKey {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to FirewallActionParametersSetCacheSettingsCacheKey
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FirewallActionParametersSetCacheSettingsCacheKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FirewallActionParametersSetCacheSettingsCacheKey is not found in the empty JSON string", FirewallActionParametersSetCacheSettingsCacheKey.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FirewallActionParametersSetCacheSettingsCacheKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FirewallActionParametersSetCacheSettingsCacheKey` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `custom_key`
      if (jsonObj.get("custom_key") != null && !jsonObj.get("custom_key").isJsonNull()) {
        FirewallActionParametersSetCacheSettingsCacheKeyCustomKey.validateJsonElement(jsonObj.get("custom_key"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FirewallActionParametersSetCacheSettingsCacheKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FirewallActionParametersSetCacheSettingsCacheKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FirewallActionParametersSetCacheSettingsCacheKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FirewallActionParametersSetCacheSettingsCacheKey.class));

       return (TypeAdapter<T>) new TypeAdapter<FirewallActionParametersSetCacheSettingsCacheKey>() {
           @Override
           public void write(JsonWriter out, FirewallActionParametersSetCacheSettingsCacheKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FirewallActionParametersSetCacheSettingsCacheKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FirewallActionParametersSetCacheSettingsCacheKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FirewallActionParametersSetCacheSettingsCacheKey
  * @throws IOException if the JSON string is invalid with respect to FirewallActionParametersSetCacheSettingsCacheKey
  */
  public static FirewallActionParametersSetCacheSettingsCacheKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FirewallActionParametersSetCacheSettingsCacheKey.class);
  }

 /**
  * Convert an instance of FirewallActionParametersSetCacheSettingsCacheKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

