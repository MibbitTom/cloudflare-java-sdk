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
 * ZeroTrustGatewayDnsResolverSettingsV4
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZeroTrustGatewayDnsResolverSettingsV4 {
  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_ROUTE_THROUGH_PRIVATE_NETWORK = "route_through_private_network";
  @SerializedName(SERIALIZED_NAME_ROUTE_THROUGH_PRIVATE_NETWORK)
  private Boolean routeThroughPrivateNetwork;

  public static final String SERIALIZED_NAME_VNET_ID = "vnet_id";
  @SerializedName(SERIALIZED_NAME_VNET_ID)
  private String vnetId;

  public ZeroTrustGatewayDnsResolverSettingsV4() {
  }

  public ZeroTrustGatewayDnsResolverSettingsV4 ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * IPv4 address of upstream resolver.
   * @return ip
  **/
  @javax.annotation.Nonnull
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public ZeroTrustGatewayDnsResolverSettingsV4 port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * A port number to use for upstream resolver. Defaults to 53 if unspecified.
   * @return port
  **/
  @javax.annotation.Nullable
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  public ZeroTrustGatewayDnsResolverSettingsV4 routeThroughPrivateNetwork(Boolean routeThroughPrivateNetwork) {
    this.routeThroughPrivateNetwork = routeThroughPrivateNetwork;
    return this;
  }

   /**
   * Whether to connect to this resolver over a private network. Must be set when vnet_id is set.
   * @return routeThroughPrivateNetwork
  **/
  @javax.annotation.Nullable
  public Boolean getRouteThroughPrivateNetwork() {
    return routeThroughPrivateNetwork;
  }

  public void setRouteThroughPrivateNetwork(Boolean routeThroughPrivateNetwork) {
    this.routeThroughPrivateNetwork = routeThroughPrivateNetwork;
  }


  public ZeroTrustGatewayDnsResolverSettingsV4 vnetId(String vnetId) {
    this.vnetId = vnetId;
    return this;
  }

   /**
   * Optionally specify a virtual network for this resolver. Uses default virtual network id if omitted.
   * @return vnetId
  **/
  @javax.annotation.Nullable
  public String getVnetId() {
    return vnetId;
  }

  public void setVnetId(String vnetId) {
    this.vnetId = vnetId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZeroTrustGatewayDnsResolverSettingsV4 zeroTrustGatewayDnsResolverSettingsV4 = (ZeroTrustGatewayDnsResolverSettingsV4) o;
    return Objects.equals(this.ip, zeroTrustGatewayDnsResolverSettingsV4.ip) &&
        Objects.equals(this.port, zeroTrustGatewayDnsResolverSettingsV4.port) &&
        Objects.equals(this.routeThroughPrivateNetwork, zeroTrustGatewayDnsResolverSettingsV4.routeThroughPrivateNetwork) &&
        Objects.equals(this.vnetId, zeroTrustGatewayDnsResolverSettingsV4.vnetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, port, routeThroughPrivateNetwork, vnetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZeroTrustGatewayDnsResolverSettingsV4 {\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    routeThroughPrivateNetwork: ").append(toIndentedString(routeThroughPrivateNetwork)).append("\n");
    sb.append("    vnetId: ").append(toIndentedString(vnetId)).append("\n");
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
    openapiFields.add("ip");
    openapiFields.add("port");
    openapiFields.add("route_through_private_network");
    openapiFields.add("vnet_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ip");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZeroTrustGatewayDnsResolverSettingsV4
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZeroTrustGatewayDnsResolverSettingsV4.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZeroTrustGatewayDnsResolverSettingsV4 is not found in the empty JSON string", ZeroTrustGatewayDnsResolverSettingsV4.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZeroTrustGatewayDnsResolverSettingsV4.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZeroTrustGatewayDnsResolverSettingsV4` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ZeroTrustGatewayDnsResolverSettingsV4.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
      if ((jsonObj.get("vnet_id") != null && !jsonObj.get("vnet_id").isJsonNull()) && !jsonObj.get("vnet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vnet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vnet_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZeroTrustGatewayDnsResolverSettingsV4.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZeroTrustGatewayDnsResolverSettingsV4' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZeroTrustGatewayDnsResolverSettingsV4> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZeroTrustGatewayDnsResolverSettingsV4.class));

       return (TypeAdapter<T>) new TypeAdapter<ZeroTrustGatewayDnsResolverSettingsV4>() {
           @Override
           public void write(JsonWriter out, ZeroTrustGatewayDnsResolverSettingsV4 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZeroTrustGatewayDnsResolverSettingsV4 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZeroTrustGatewayDnsResolverSettingsV4 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZeroTrustGatewayDnsResolverSettingsV4
  * @throws IOException if the JSON string is invalid with respect to ZeroTrustGatewayDnsResolverSettingsV4
  */
  public static ZeroTrustGatewayDnsResolverSettingsV4 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZeroTrustGatewayDnsResolverSettingsV4.class);
  }

 /**
  * Convert an instance of ZeroTrustGatewayDnsResolverSettingsV4 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

