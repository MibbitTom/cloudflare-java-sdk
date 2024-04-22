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


package cloudflare.sdk.models;

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

import cloudflare.JSON;

/**
 * (optional) if omitted, use DHCP. Submit secondary_address when site is in high availability mode.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class MagicWanStaticAddressing {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_GATEWAY_ADDRESS = "gateway_address";
  @SerializedName(SERIALIZED_NAME_GATEWAY_ADDRESS)
  private String gatewayAddress;

  public static final String SERIALIZED_NAME_SECONDARY_ADDRESS = "secondary_address";
  @SerializedName(SERIALIZED_NAME_SECONDARY_ADDRESS)
  private String secondaryAddress;

  public MagicWanStaticAddressing() {
  }

  public MagicWanStaticAddressing address(String address) {
    this.address = address;
    return this;
  }

   /**
   * A valid CIDR notation representing an IP range.
   * @return address
  **/
  @javax.annotation.Nonnull
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public MagicWanStaticAddressing gatewayAddress(String gatewayAddress) {
    this.gatewayAddress = gatewayAddress;
    return this;
  }

   /**
   * A valid IPv4 address.
   * @return gatewayAddress
  **/
  @javax.annotation.Nonnull
  public String getGatewayAddress() {
    return gatewayAddress;
  }

  public void setGatewayAddress(String gatewayAddress) {
    this.gatewayAddress = gatewayAddress;
  }


  public MagicWanStaticAddressing secondaryAddress(String secondaryAddress) {
    this.secondaryAddress = secondaryAddress;
    return this;
  }

   /**
   * A valid CIDR notation representing an IP range.
   * @return secondaryAddress
  **/
  @javax.annotation.Nullable
  public String getSecondaryAddress() {
    return secondaryAddress;
  }

  public void setSecondaryAddress(String secondaryAddress) {
    this.secondaryAddress = secondaryAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagicWanStaticAddressing magicWanStaticAddressing = (MagicWanStaticAddressing) o;
    return Objects.equals(this.address, magicWanStaticAddressing.address) &&
        Objects.equals(this.gatewayAddress, magicWanStaticAddressing.gatewayAddress) &&
        Objects.equals(this.secondaryAddress, magicWanStaticAddressing.secondaryAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, gatewayAddress, secondaryAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicWanStaticAddressing {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    gatewayAddress: ").append(toIndentedString(gatewayAddress)).append("\n");
    sb.append("    secondaryAddress: ").append(toIndentedString(secondaryAddress)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("gateway_address");
    openapiFields.add("secondary_address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("gateway_address");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MagicWanStaticAddressing
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MagicWanStaticAddressing.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MagicWanStaticAddressing is not found in the empty JSON string", MagicWanStaticAddressing.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MagicWanStaticAddressing.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MagicWanStaticAddressing` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MagicWanStaticAddressing.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (!jsonObj.get("gateway_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_address").toString()));
      }
      if ((jsonObj.get("secondary_address") != null && !jsonObj.get("secondary_address").isJsonNull()) && !jsonObj.get("secondary_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondary_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondary_address").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MagicWanStaticAddressing.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MagicWanStaticAddressing' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MagicWanStaticAddressing> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MagicWanStaticAddressing.class));

       return (TypeAdapter<T>) new TypeAdapter<MagicWanStaticAddressing>() {
           @Override
           public void write(JsonWriter out, MagicWanStaticAddressing value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MagicWanStaticAddressing read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MagicWanStaticAddressing given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MagicWanStaticAddressing
  * @throws IOException if the JSON string is invalid with respect to MagicWanStaticAddressing
  */
  public static MagicWanStaticAddressing fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MagicWanStaticAddressing.class);
  }

 /**
  * Convert an instance of MagicWanStaticAddressing to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

