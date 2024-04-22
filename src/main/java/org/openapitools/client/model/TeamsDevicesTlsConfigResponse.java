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
 * The Managed Network TLS Config Response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TeamsDevicesTlsConfigResponse {
  public static final String SERIALIZED_NAME_SHA256 = "sha256";
  @SerializedName(SERIALIZED_NAME_SHA256)
  private String sha256;

  public static final String SERIALIZED_NAME_TLS_SOCKADDR = "tls_sockaddr";
  @SerializedName(SERIALIZED_NAME_TLS_SOCKADDR)
  private String tlsSockaddr;

  public TeamsDevicesTlsConfigResponse() {
  }

  public TeamsDevicesTlsConfigResponse sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }

   /**
   * The SHA-256 hash of the TLS certificate presented by the host found at tls_sockaddr. If absent, regular certificate verification (trusted roots, valid timestamp, etc) will be used to validate the certificate.
   * @return sha256
  **/
  @javax.annotation.Nullable
  public String getSha256() {
    return sha256;
  }

  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }


  public TeamsDevicesTlsConfigResponse tlsSockaddr(String tlsSockaddr) {
    this.tlsSockaddr = tlsSockaddr;
    return this;
  }

   /**
   * A network address of the form \&quot;host:port\&quot; that the WARP client will use to detect the presence of a TLS host.
   * @return tlsSockaddr
  **/
  @javax.annotation.Nonnull
  public String getTlsSockaddr() {
    return tlsSockaddr;
  }

  public void setTlsSockaddr(String tlsSockaddr) {
    this.tlsSockaddr = tlsSockaddr;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamsDevicesTlsConfigResponse teamsDevicesTlsConfigResponse = (TeamsDevicesTlsConfigResponse) o;
    return Objects.equals(this.sha256, teamsDevicesTlsConfigResponse.sha256) &&
        Objects.equals(this.tlsSockaddr, teamsDevicesTlsConfigResponse.tlsSockaddr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sha256, tlsSockaddr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsDevicesTlsConfigResponse {\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    tlsSockaddr: ").append(toIndentedString(tlsSockaddr)).append("\n");
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
    openapiFields.add("sha256");
    openapiFields.add("tls_sockaddr");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tls_sockaddr");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TeamsDevicesTlsConfigResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TeamsDevicesTlsConfigResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TeamsDevicesTlsConfigResponse is not found in the empty JSON string", TeamsDevicesTlsConfigResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TeamsDevicesTlsConfigResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TeamsDevicesTlsConfigResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TeamsDevicesTlsConfigResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sha256") != null && !jsonObj.get("sha256").isJsonNull()) && !jsonObj.get("sha256").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha256` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha256").toString()));
      }
      if (!jsonObj.get("tls_sockaddr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tls_sockaddr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tls_sockaddr").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TeamsDevicesTlsConfigResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TeamsDevicesTlsConfigResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TeamsDevicesTlsConfigResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TeamsDevicesTlsConfigResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TeamsDevicesTlsConfigResponse>() {
           @Override
           public void write(JsonWriter out, TeamsDevicesTlsConfigResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TeamsDevicesTlsConfigResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TeamsDevicesTlsConfigResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TeamsDevicesTlsConfigResponse
  * @throws IOException if the JSON string is invalid with respect to TeamsDevicesTlsConfigResponse
  */
  public static TeamsDevicesTlsConfigResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TeamsDevicesTlsConfigResponse.class);
  }

 /**
  * Convert an instance of TeamsDevicesTlsConfigResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

