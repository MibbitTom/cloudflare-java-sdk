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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * IpAddressManagementAddressMapsUpdateAddressMapRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class IpAddressManagementAddressMapsUpdateAddressMapRequest {
  public static final String SERIALIZED_NAME_DEFAULT_SNI = "default_sni";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SNI)
  private String defaultSni;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = false;

  public IpAddressManagementAddressMapsUpdateAddressMapRequest() {
  }

  public IpAddressManagementAddressMapsUpdateAddressMapRequest defaultSni(String defaultSni) {
    this.defaultSni = defaultSni;
    return this;
  }

   /**
   * If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map. If Cloudflare receives a TLS handshake from a client without an SNI, it will respond with the default SNI on those IPs. The default SNI can be any valid zone or subdomain owned by the account.
   * @return defaultSni
  **/
  @javax.annotation.Nullable
  public String getDefaultSni() {
    return defaultSni;
  }

  public void setDefaultSni(String defaultSni) {
    this.defaultSni = defaultSni;
  }


  public IpAddressManagementAddressMapsUpdateAddressMapRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An optional description field which may be used to describe the types of IPs or zones on the map.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public IpAddressManagementAddressMapsUpdateAddressMapRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the Address Map is enabled or not. Cloudflare&#39;s DNS will not respond with IP addresses on an Address Map until the map is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddressManagementAddressMapsUpdateAddressMapRequest ipAddressManagementAddressMapsUpdateAddressMapRequest = (IpAddressManagementAddressMapsUpdateAddressMapRequest) o;
    return Objects.equals(this.defaultSni, ipAddressManagementAddressMapsUpdateAddressMapRequest.defaultSni) &&
        Objects.equals(this.description, ipAddressManagementAddressMapsUpdateAddressMapRequest.description) &&
        Objects.equals(this.enabled, ipAddressManagementAddressMapsUpdateAddressMapRequest.enabled);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultSni, description, enabled);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddressManagementAddressMapsUpdateAddressMapRequest {\n");
    sb.append("    defaultSni: ").append(toIndentedString(defaultSni)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    openapiFields.add("default_sni");
    openapiFields.add("description");
    openapiFields.add("enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IpAddressManagementAddressMapsUpdateAddressMapRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IpAddressManagementAddressMapsUpdateAddressMapRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IpAddressManagementAddressMapsUpdateAddressMapRequest is not found in the empty JSON string", IpAddressManagementAddressMapsUpdateAddressMapRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IpAddressManagementAddressMapsUpdateAddressMapRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IpAddressManagementAddressMapsUpdateAddressMapRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("default_sni") != null && !jsonObj.get("default_sni").isJsonNull()) && !jsonObj.get("default_sni").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_sni` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_sni").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IpAddressManagementAddressMapsUpdateAddressMapRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IpAddressManagementAddressMapsUpdateAddressMapRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IpAddressManagementAddressMapsUpdateAddressMapRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IpAddressManagementAddressMapsUpdateAddressMapRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IpAddressManagementAddressMapsUpdateAddressMapRequest>() {
           @Override
           public void write(JsonWriter out, IpAddressManagementAddressMapsUpdateAddressMapRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IpAddressManagementAddressMapsUpdateAddressMapRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IpAddressManagementAddressMapsUpdateAddressMapRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IpAddressManagementAddressMapsUpdateAddressMapRequest
  * @throws IOException if the JSON string is invalid with respect to IpAddressManagementAddressMapsUpdateAddressMapRequest
  */
  public static IpAddressManagementAddressMapsUpdateAddressMapRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IpAddressManagementAddressMapsUpdateAddressMapRequest.class);
  }

 /**
  * Convert an instance of IpAddressManagementAddressMapsUpdateAddressMapRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

