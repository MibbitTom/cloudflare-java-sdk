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
import org.openapitools.client.model.TunnelTunnelType;
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
 * TunnelRouteUpdateATunnelRouteRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TunnelRouteUpdateATunnelRouteRequest {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_TUN_TYPE = "tun_type";
  @SerializedName(SERIALIZED_NAME_TUN_TYPE)
  private TunnelTunnelType tunType;

  public static final String SERIALIZED_NAME_TUNNEL_ID = "tunnel_id";
  @SerializedName(SERIALIZED_NAME_TUNNEL_ID)
  private Object tunnelId = null;

  public static final String SERIALIZED_NAME_VIRTUAL_NETWORK_ID = "virtual_network_id";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_NETWORK_ID)
  private Object virtualNetworkId = null;

  public TunnelRouteUpdateATunnelRouteRequest() {
  }

  public TunnelRouteUpdateATunnelRouteRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Optional remark describing the route.
   * @return comment
  **/
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public TunnelRouteUpdateATunnelRouteRequest network(String network) {
    this.network = network;
    return this;
  }

   /**
   * The private IPv4 or IPv6 range connected by the route, in CIDR notation.
   * @return network
  **/
  @javax.annotation.Nullable
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }


  public TunnelRouteUpdateATunnelRouteRequest tunType(TunnelTunnelType tunType) {
    this.tunType = tunType;
    return this;
  }

   /**
   * Get tunType
   * @return tunType
  **/
  @javax.annotation.Nullable
  public TunnelTunnelType getTunType() {
    return tunType;
  }

  public void setTunType(TunnelTunnelType tunType) {
    this.tunType = tunType;
  }


  public TunnelRouteUpdateATunnelRouteRequest tunnelId(Object tunnelId) {
    this.tunnelId = tunnelId;
    return this;
  }

   /**
   * UUID of the Cloudflare Tunnel serving the route.
   * @return tunnelId
  **/
  @javax.annotation.Nullable
  public Object getTunnelId() {
    return tunnelId;
  }

  public void setTunnelId(Object tunnelId) {
    this.tunnelId = tunnelId;
  }


  public TunnelRouteUpdateATunnelRouteRequest virtualNetworkId(Object virtualNetworkId) {
    this.virtualNetworkId = virtualNetworkId;
    return this;
  }

   /**
   * UUID of the Tunnel Virtual Network this route belongs to. If no virtual networks are configured, the route is assigned to the default virtual network of the account.
   * @return virtualNetworkId
  **/
  @javax.annotation.Nullable
  public Object getVirtualNetworkId() {
    return virtualNetworkId;
  }

  public void setVirtualNetworkId(Object virtualNetworkId) {
    this.virtualNetworkId = virtualNetworkId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TunnelRouteUpdateATunnelRouteRequest tunnelRouteUpdateATunnelRouteRequest = (TunnelRouteUpdateATunnelRouteRequest) o;
    return Objects.equals(this.comment, tunnelRouteUpdateATunnelRouteRequest.comment) &&
        Objects.equals(this.network, tunnelRouteUpdateATunnelRouteRequest.network) &&
        Objects.equals(this.tunType, tunnelRouteUpdateATunnelRouteRequest.tunType) &&
        Objects.equals(this.tunnelId, tunnelRouteUpdateATunnelRouteRequest.tunnelId) &&
        Objects.equals(this.virtualNetworkId, tunnelRouteUpdateATunnelRouteRequest.virtualNetworkId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, network, tunType, tunnelId, virtualNetworkId);
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
    sb.append("class TunnelRouteUpdateATunnelRouteRequest {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    tunType: ").append(toIndentedString(tunType)).append("\n");
    sb.append("    tunnelId: ").append(toIndentedString(tunnelId)).append("\n");
    sb.append("    virtualNetworkId: ").append(toIndentedString(virtualNetworkId)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("network");
    openapiFields.add("tun_type");
    openapiFields.add("tunnel_id");
    openapiFields.add("virtual_network_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TunnelRouteUpdateATunnelRouteRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TunnelRouteUpdateATunnelRouteRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TunnelRouteUpdateATunnelRouteRequest is not found in the empty JSON string", TunnelRouteUpdateATunnelRouteRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TunnelRouteUpdateATunnelRouteRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TunnelRouteUpdateATunnelRouteRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      // validate the optional field `tun_type`
      if (jsonObj.get("tun_type") != null && !jsonObj.get("tun_type").isJsonNull()) {
        TunnelTunnelType.validateJsonElement(jsonObj.get("tun_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TunnelRouteUpdateATunnelRouteRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TunnelRouteUpdateATunnelRouteRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TunnelRouteUpdateATunnelRouteRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TunnelRouteUpdateATunnelRouteRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TunnelRouteUpdateATunnelRouteRequest>() {
           @Override
           public void write(JsonWriter out, TunnelRouteUpdateATunnelRouteRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TunnelRouteUpdateATunnelRouteRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TunnelRouteUpdateATunnelRouteRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TunnelRouteUpdateATunnelRouteRequest
  * @throws IOException if the JSON string is invalid with respect to TunnelRouteUpdateATunnelRouteRequest
  */
  public static TunnelRouteUpdateATunnelRouteRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TunnelRouteUpdateATunnelRouteRequest.class);
  }

 /**
  * Convert an instance of TunnelRouteUpdateATunnelRouteRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

