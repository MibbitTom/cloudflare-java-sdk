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

import org.openapitools.client.JSON;

/**
 * ZeroTrustAccountsPatchConnectivitySettingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZeroTrustAccountsPatchConnectivitySettingsRequest {
  public static final String SERIALIZED_NAME_ICMP_PROXY_ENABLED = "icmp_proxy_enabled";
  @SerializedName(SERIALIZED_NAME_ICMP_PROXY_ENABLED)
  private Boolean icmpProxyEnabled;

  public static final String SERIALIZED_NAME_OFFRAMP_WARP_ENABLED = "offramp_warp_enabled";
  @SerializedName(SERIALIZED_NAME_OFFRAMP_WARP_ENABLED)
  private Boolean offrampWarpEnabled;

  public ZeroTrustAccountsPatchConnectivitySettingsRequest() {
  }

  public ZeroTrustAccountsPatchConnectivitySettingsRequest icmpProxyEnabled(Boolean icmpProxyEnabled) {
    this.icmpProxyEnabled = icmpProxyEnabled;
    return this;
  }

   /**
   * A flag to enable the ICMP proxy for the account network.
   * @return icmpProxyEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIcmpProxyEnabled() {
    return icmpProxyEnabled;
  }

  public void setIcmpProxyEnabled(Boolean icmpProxyEnabled) {
    this.icmpProxyEnabled = icmpProxyEnabled;
  }


  public ZeroTrustAccountsPatchConnectivitySettingsRequest offrampWarpEnabled(Boolean offrampWarpEnabled) {
    this.offrampWarpEnabled = offrampWarpEnabled;
    return this;
  }

   /**
   * A flag to enable WARP to WARP traffic.
   * @return offrampWarpEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getOfframpWarpEnabled() {
    return offrampWarpEnabled;
  }

  public void setOfframpWarpEnabled(Boolean offrampWarpEnabled) {
    this.offrampWarpEnabled = offrampWarpEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZeroTrustAccountsPatchConnectivitySettingsRequest zeroTrustAccountsPatchConnectivitySettingsRequest = (ZeroTrustAccountsPatchConnectivitySettingsRequest) o;
    return Objects.equals(this.icmpProxyEnabled, zeroTrustAccountsPatchConnectivitySettingsRequest.icmpProxyEnabled) &&
        Objects.equals(this.offrampWarpEnabled, zeroTrustAccountsPatchConnectivitySettingsRequest.offrampWarpEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icmpProxyEnabled, offrampWarpEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZeroTrustAccountsPatchConnectivitySettingsRequest {\n");
    sb.append("    icmpProxyEnabled: ").append(toIndentedString(icmpProxyEnabled)).append("\n");
    sb.append("    offrampWarpEnabled: ").append(toIndentedString(offrampWarpEnabled)).append("\n");
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
    openapiFields.add("icmp_proxy_enabled");
    openapiFields.add("offramp_warp_enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZeroTrustAccountsPatchConnectivitySettingsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZeroTrustAccountsPatchConnectivitySettingsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZeroTrustAccountsPatchConnectivitySettingsRequest is not found in the empty JSON string", ZeroTrustAccountsPatchConnectivitySettingsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZeroTrustAccountsPatchConnectivitySettingsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZeroTrustAccountsPatchConnectivitySettingsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZeroTrustAccountsPatchConnectivitySettingsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZeroTrustAccountsPatchConnectivitySettingsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZeroTrustAccountsPatchConnectivitySettingsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZeroTrustAccountsPatchConnectivitySettingsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ZeroTrustAccountsPatchConnectivitySettingsRequest>() {
           @Override
           public void write(JsonWriter out, ZeroTrustAccountsPatchConnectivitySettingsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZeroTrustAccountsPatchConnectivitySettingsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZeroTrustAccountsPatchConnectivitySettingsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZeroTrustAccountsPatchConnectivitySettingsRequest
  * @throws IOException if the JSON string is invalid with respect to ZeroTrustAccountsPatchConnectivitySettingsRequest
  */
  public static ZeroTrustAccountsPatchConnectivitySettingsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZeroTrustAccountsPatchConnectivitySettingsRequest.class);
  }

 /**
  * Convert an instance of ZeroTrustAccountsPatchConnectivitySettingsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

