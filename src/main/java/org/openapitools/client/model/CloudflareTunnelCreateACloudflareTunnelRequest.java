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
import org.openapitools.client.model.TunnelConfigSrc;

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
 * CloudflareTunnelCreateACloudflareTunnelRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class CloudflareTunnelCreateACloudflareTunnelRequest {
  public static final String SERIALIZED_NAME_CONFIG_SRC = "config_src";
  @SerializedName(SERIALIZED_NAME_CONFIG_SRC)
  private TunnelConfigSrc configSrc = TunnelConfigSrc.LOCAL;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TUNNEL_SECRET = "tunnel_secret";
  @SerializedName(SERIALIZED_NAME_TUNNEL_SECRET)
  private String tunnelSecret;

  public CloudflareTunnelCreateACloudflareTunnelRequest() {
  }

  public CloudflareTunnelCreateACloudflareTunnelRequest configSrc(TunnelConfigSrc configSrc) {
    this.configSrc = configSrc;
    return this;
  }

   /**
   * Get configSrc
   * @return configSrc
  **/
  @javax.annotation.Nullable
  public TunnelConfigSrc getConfigSrc() {
    return configSrc;
  }

  public void setConfigSrc(TunnelConfigSrc configSrc) {
    this.configSrc = configSrc;
  }


  public CloudflareTunnelCreateACloudflareTunnelRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A user-friendly name for the tunnel.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CloudflareTunnelCreateACloudflareTunnelRequest tunnelSecret(String tunnelSecret) {
    this.tunnelSecret = tunnelSecret;
    return this;
  }

   /**
   * Sets the password required to run a locally-managed tunnel. Must be at least 32 bytes and encoded as a base64 string.
   * @return tunnelSecret
  **/
  @javax.annotation.Nullable
  public String getTunnelSecret() {
    return tunnelSecret;
  }

  public void setTunnelSecret(String tunnelSecret) {
    this.tunnelSecret = tunnelSecret;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareTunnelCreateACloudflareTunnelRequest cloudflareTunnelCreateACloudflareTunnelRequest = (CloudflareTunnelCreateACloudflareTunnelRequest) o;
    return Objects.equals(this.configSrc, cloudflareTunnelCreateACloudflareTunnelRequest.configSrc) &&
        Objects.equals(this.name, cloudflareTunnelCreateACloudflareTunnelRequest.name) &&
        Objects.equals(this.tunnelSecret, cloudflareTunnelCreateACloudflareTunnelRequest.tunnelSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configSrc, name, tunnelSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareTunnelCreateACloudflareTunnelRequest {\n");
    sb.append("    configSrc: ").append(toIndentedString(configSrc)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tunnelSecret: ").append(toIndentedString(tunnelSecret)).append("\n");
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
    openapiFields.add("config_src");
    openapiFields.add("name");
    openapiFields.add("tunnel_secret");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CloudflareTunnelCreateACloudflareTunnelRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudflareTunnelCreateACloudflareTunnelRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudflareTunnelCreateACloudflareTunnelRequest is not found in the empty JSON string", CloudflareTunnelCreateACloudflareTunnelRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudflareTunnelCreateACloudflareTunnelRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudflareTunnelCreateACloudflareTunnelRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CloudflareTunnelCreateACloudflareTunnelRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `config_src`
      if (jsonObj.get("config_src") != null && !jsonObj.get("config_src").isJsonNull()) {
        TunnelConfigSrc.validateJsonElement(jsonObj.get("config_src"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("tunnel_secret") != null && !jsonObj.get("tunnel_secret").isJsonNull()) && !jsonObj.get("tunnel_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tunnel_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tunnel_secret").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudflareTunnelCreateACloudflareTunnelRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudflareTunnelCreateACloudflareTunnelRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudflareTunnelCreateACloudflareTunnelRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudflareTunnelCreateACloudflareTunnelRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudflareTunnelCreateACloudflareTunnelRequest>() {
           @Override
           public void write(JsonWriter out, CloudflareTunnelCreateACloudflareTunnelRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudflareTunnelCreateACloudflareTunnelRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CloudflareTunnelCreateACloudflareTunnelRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudflareTunnelCreateACloudflareTunnelRequest
  * @throws IOException if the JSON string is invalid with respect to CloudflareTunnelCreateACloudflareTunnelRequest
  */
  public static CloudflareTunnelCreateACloudflareTunnelRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudflareTunnelCreateACloudflareTunnelRequest.class);
  }

 /**
  * Convert an instance of CloudflareTunnelCreateACloudflareTunnelRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

