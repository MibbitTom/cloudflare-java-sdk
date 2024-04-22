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
 * AddressingIps
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AddressingIps {
  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public static final String SERIALIZED_NAME_IPV4_CIDRS = "ipv4_cidrs";
  @SerializedName(SERIALIZED_NAME_IPV4_CIDRS)
  private List<String> ipv4Cidrs = new ArrayList<>();

  public static final String SERIALIZED_NAME_IPV6_CIDRS = "ipv6_cidrs";
  @SerializedName(SERIALIZED_NAME_IPV6_CIDRS)
  private List<String> ipv6Cidrs = new ArrayList<>();

  public AddressingIps() {
  }

  public AddressingIps etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * A digest of the IP data. Useful for determining if the data has changed.
   * @return etag
  **/
  @javax.annotation.Nullable
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }


  public AddressingIps ipv4Cidrs(List<String> ipv4Cidrs) {
    this.ipv4Cidrs = ipv4Cidrs;
    return this;
  }

  public AddressingIps addIpv4CidrsItem(String ipv4CidrsItem) {
    if (this.ipv4Cidrs == null) {
      this.ipv4Cidrs = new ArrayList<>();
    }
    this.ipv4Cidrs.add(ipv4CidrsItem);
    return this;
  }

   /**
   * List of Cloudflare IPv4 CIDR addresses.
   * @return ipv4Cidrs
  **/
  @javax.annotation.Nullable
  public List<String> getIpv4Cidrs() {
    return ipv4Cidrs;
  }

  public void setIpv4Cidrs(List<String> ipv4Cidrs) {
    this.ipv4Cidrs = ipv4Cidrs;
  }


  public AddressingIps ipv6Cidrs(List<String> ipv6Cidrs) {
    this.ipv6Cidrs = ipv6Cidrs;
    return this;
  }

  public AddressingIps addIpv6CidrsItem(String ipv6CidrsItem) {
    if (this.ipv6Cidrs == null) {
      this.ipv6Cidrs = new ArrayList<>();
    }
    this.ipv6Cidrs.add(ipv6CidrsItem);
    return this;
  }

   /**
   * List of Cloudflare IPv6 CIDR addresses.
   * @return ipv6Cidrs
  **/
  @javax.annotation.Nullable
  public List<String> getIpv6Cidrs() {
    return ipv6Cidrs;
  }

  public void setIpv6Cidrs(List<String> ipv6Cidrs) {
    this.ipv6Cidrs = ipv6Cidrs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressingIps addressingIps = (AddressingIps) o;
    return Objects.equals(this.etag, addressingIps.etag) &&
        Objects.equals(this.ipv4Cidrs, addressingIps.ipv4Cidrs) &&
        Objects.equals(this.ipv6Cidrs, addressingIps.ipv6Cidrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, ipv4Cidrs, ipv6Cidrs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressingIps {\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    ipv4Cidrs: ").append(toIndentedString(ipv4Cidrs)).append("\n");
    sb.append("    ipv6Cidrs: ").append(toIndentedString(ipv6Cidrs)).append("\n");
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
    openapiFields.add("etag");
    openapiFields.add("ipv4_cidrs");
    openapiFields.add("ipv6_cidrs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddressingIps
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddressingIps.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressingIps is not found in the empty JSON string", AddressingIps.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddressingIps.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddressingIps` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("etag") != null && !jsonObj.get("etag").isJsonNull()) && !jsonObj.get("etag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `etag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("etag").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ipv4_cidrs") != null && !jsonObj.get("ipv4_cidrs").isJsonNull() && !jsonObj.get("ipv4_cidrs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipv4_cidrs` to be an array in the JSON string but got `%s`", jsonObj.get("ipv4_cidrs").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ipv6_cidrs") != null && !jsonObj.get("ipv6_cidrs").isJsonNull() && !jsonObj.get("ipv6_cidrs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipv6_cidrs` to be an array in the JSON string but got `%s`", jsonObj.get("ipv6_cidrs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressingIps.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressingIps' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressingIps> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressingIps.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressingIps>() {
           @Override
           public void write(JsonWriter out, AddressingIps value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressingIps read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddressingIps given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressingIps
  * @throws IOException if the JSON string is invalid with respect to AddressingIps
  */
  public static AddressingIps fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressingIps.class);
  }

 /**
  * Convert an instance of AddressingIps to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

