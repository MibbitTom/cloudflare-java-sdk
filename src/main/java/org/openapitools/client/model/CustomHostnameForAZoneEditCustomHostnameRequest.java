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
import org.openapitools.client.model.TlsCertificatesAndHostnamesCustomMetadata;
import org.openapitools.client.model.TlsCertificatesAndHostnamesSslpost;

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
 * CustomHostnameForAZoneEditCustomHostnameRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class CustomHostnameForAZoneEditCustomHostnameRequest {
  public static final String SERIALIZED_NAME_CUSTOM_METADATA = "custom_metadata";
  @SerializedName(SERIALIZED_NAME_CUSTOM_METADATA)
  private TlsCertificatesAndHostnamesCustomMetadata customMetadata;

  public static final String SERIALIZED_NAME_CUSTOM_ORIGIN_SERVER = "custom_origin_server";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ORIGIN_SERVER)
  private String customOriginServer;

  public static final String SERIALIZED_NAME_CUSTOM_ORIGIN_SNI = "custom_origin_sni";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ORIGIN_SNI)
  private String customOriginSni;

  public static final String SERIALIZED_NAME_SSL = "ssl";
  @SerializedName(SERIALIZED_NAME_SSL)
  private TlsCertificatesAndHostnamesSslpost ssl;

  public CustomHostnameForAZoneEditCustomHostnameRequest() {
  }

  public CustomHostnameForAZoneEditCustomHostnameRequest customMetadata(TlsCertificatesAndHostnamesCustomMetadata customMetadata) {
    this.customMetadata = customMetadata;
    return this;
  }

   /**
   * Get customMetadata
   * @return customMetadata
  **/
  @javax.annotation.Nullable
  public TlsCertificatesAndHostnamesCustomMetadata getCustomMetadata() {
    return customMetadata;
  }

  public void setCustomMetadata(TlsCertificatesAndHostnamesCustomMetadata customMetadata) {
    this.customMetadata = customMetadata;
  }


  public CustomHostnameForAZoneEditCustomHostnameRequest customOriginServer(String customOriginServer) {
    this.customOriginServer = customOriginServer;
    return this;
  }

   /**
   * a valid hostname that’s been added to your DNS zone as an A, AAAA, or CNAME record.
   * @return customOriginServer
  **/
  @javax.annotation.Nullable
  public String getCustomOriginServer() {
    return customOriginServer;
  }

  public void setCustomOriginServer(String customOriginServer) {
    this.customOriginServer = customOriginServer;
  }


  public CustomHostnameForAZoneEditCustomHostnameRequest customOriginSni(String customOriginSni) {
    this.customOriginSni = customOriginSni;
    return this;
  }

   /**
   * A hostname that will be sent to your custom origin server as SNI for TLS handshake. This can be a valid subdomain of the zone or custom origin server name or the string &#39;:request_host_header:&#39; which will cause the host header in the request to be used as SNI. Not configurable with default/fallback origin server.
   * @return customOriginSni
  **/
  @javax.annotation.Nullable
  public String getCustomOriginSni() {
    return customOriginSni;
  }

  public void setCustomOriginSni(String customOriginSni) {
    this.customOriginSni = customOriginSni;
  }


  public CustomHostnameForAZoneEditCustomHostnameRequest ssl(TlsCertificatesAndHostnamesSslpost ssl) {
    this.ssl = ssl;
    return this;
  }

   /**
   * Get ssl
   * @return ssl
  **/
  @javax.annotation.Nullable
  public TlsCertificatesAndHostnamesSslpost getSsl() {
    return ssl;
  }

  public void setSsl(TlsCertificatesAndHostnamesSslpost ssl) {
    this.ssl = ssl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomHostnameForAZoneEditCustomHostnameRequest customHostnameForAZoneEditCustomHostnameRequest = (CustomHostnameForAZoneEditCustomHostnameRequest) o;
    return Objects.equals(this.customMetadata, customHostnameForAZoneEditCustomHostnameRequest.customMetadata) &&
        Objects.equals(this.customOriginServer, customHostnameForAZoneEditCustomHostnameRequest.customOriginServer) &&
        Objects.equals(this.customOriginSni, customHostnameForAZoneEditCustomHostnameRequest.customOriginSni) &&
        Objects.equals(this.ssl, customHostnameForAZoneEditCustomHostnameRequest.ssl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customMetadata, customOriginServer, customOriginSni, ssl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomHostnameForAZoneEditCustomHostnameRequest {\n");
    sb.append("    customMetadata: ").append(toIndentedString(customMetadata)).append("\n");
    sb.append("    customOriginServer: ").append(toIndentedString(customOriginServer)).append("\n");
    sb.append("    customOriginSni: ").append(toIndentedString(customOriginSni)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
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
    openapiFields.add("custom_metadata");
    openapiFields.add("custom_origin_server");
    openapiFields.add("custom_origin_sni");
    openapiFields.add("ssl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomHostnameForAZoneEditCustomHostnameRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomHostnameForAZoneEditCustomHostnameRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomHostnameForAZoneEditCustomHostnameRequest is not found in the empty JSON string", CustomHostnameForAZoneEditCustomHostnameRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomHostnameForAZoneEditCustomHostnameRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomHostnameForAZoneEditCustomHostnameRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `custom_metadata`
      if (jsonObj.get("custom_metadata") != null && !jsonObj.get("custom_metadata").isJsonNull()) {
        TlsCertificatesAndHostnamesCustomMetadata.validateJsonElement(jsonObj.get("custom_metadata"));
      }
      if ((jsonObj.get("custom_origin_server") != null && !jsonObj.get("custom_origin_server").isJsonNull()) && !jsonObj.get("custom_origin_server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_origin_server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_origin_server").toString()));
      }
      if ((jsonObj.get("custom_origin_sni") != null && !jsonObj.get("custom_origin_sni").isJsonNull()) && !jsonObj.get("custom_origin_sni").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_origin_sni` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_origin_sni").toString()));
      }
      // validate the optional field `ssl`
      if (jsonObj.get("ssl") != null && !jsonObj.get("ssl").isJsonNull()) {
        TlsCertificatesAndHostnamesSslpost.validateJsonElement(jsonObj.get("ssl"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomHostnameForAZoneEditCustomHostnameRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomHostnameForAZoneEditCustomHostnameRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomHostnameForAZoneEditCustomHostnameRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomHostnameForAZoneEditCustomHostnameRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomHostnameForAZoneEditCustomHostnameRequest>() {
           @Override
           public void write(JsonWriter out, CustomHostnameForAZoneEditCustomHostnameRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomHostnameForAZoneEditCustomHostnameRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomHostnameForAZoneEditCustomHostnameRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomHostnameForAZoneEditCustomHostnameRequest
  * @throws IOException if the JSON string is invalid with respect to CustomHostnameForAZoneEditCustomHostnameRequest
  */
  public static CustomHostnameForAZoneEditCustomHostnameRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomHostnameForAZoneEditCustomHostnameRequest.class);
  }

 /**
  * Convert an instance of CustomHostnameForAZoneEditCustomHostnameRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
