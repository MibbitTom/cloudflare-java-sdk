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
import org.openapitools.client.model.ZeroTrustGatewayNetwork;

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
 * ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest {
  public static final String SERIALIZED_NAME_CLIENT_DEFAULT = "client_default";
  @SerializedName(SERIALIZED_NAME_CLIENT_DEFAULT)
  private Boolean clientDefault;

  public static final String SERIALIZED_NAME_ECS_SUPPORT = "ecs_support";
  @SerializedName(SERIALIZED_NAME_ECS_SUPPORT)
  private Boolean ecsSupport;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NETWORKS = "networks";
  @SerializedName(SERIALIZED_NAME_NETWORKS)
  private List<ZeroTrustGatewayNetwork> networks = new ArrayList<>();

  public ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest() {
  }

  public ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest clientDefault(Boolean clientDefault) {
    this.clientDefault = clientDefault;
    return this;
  }

   /**
   * True if the location is the default location.
   * @return clientDefault
  **/
  @javax.annotation.Nullable
  public Boolean getClientDefault() {
    return clientDefault;
  }

  public void setClientDefault(Boolean clientDefault) {
    this.clientDefault = clientDefault;
  }


  public ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest ecsSupport(Boolean ecsSupport) {
    this.ecsSupport = ecsSupport;
    return this;
  }

   /**
   * True if the location needs to resolve EDNS queries.
   * @return ecsSupport
  **/
  @javax.annotation.Nullable
  public Boolean getEcsSupport() {
    return ecsSupport;
  }

  public void setEcsSupport(Boolean ecsSupport) {
    this.ecsSupport = ecsSupport;
  }


  public ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the location.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest networks(List<ZeroTrustGatewayNetwork> networks) {
    this.networks = networks;
    return this;
  }

  public ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest addNetworksItem(ZeroTrustGatewayNetwork networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<>();
    }
    this.networks.add(networksItem);
    return this;
  }

   /**
   * A list of network ranges that requests from this location would originate from.
   * @return networks
  **/
  @javax.annotation.Nullable
  public List<ZeroTrustGatewayNetwork> getNetworks() {
    return networks;
  }

  public void setNetworks(List<ZeroTrustGatewayNetwork> networks) {
    this.networks = networks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest = (ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest) o;
    return Objects.equals(this.clientDefault, zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest.clientDefault) &&
        Objects.equals(this.ecsSupport, zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest.ecsSupport) &&
        Objects.equals(this.name, zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest.name) &&
        Objects.equals(this.networks, zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest.networks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientDefault, ecsSupport, name, networks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest {\n");
    sb.append("    clientDefault: ").append(toIndentedString(clientDefault)).append("\n");
    sb.append("    ecsSupport: ").append(toIndentedString(ecsSupport)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
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
    openapiFields.add("client_default");
    openapiFields.add("ecs_support");
    openapiFields.add("name");
    openapiFields.add("networks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest is not found in the empty JSON string", ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("networks") != null && !jsonObj.get("networks").isJsonNull()) {
        JsonArray jsonArraynetworks = jsonObj.getAsJsonArray("networks");
        if (jsonArraynetworks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("networks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `networks` to be an array in the JSON string but got `%s`", jsonObj.get("networks").toString()));
          }

          // validate the optional field `networks` (array)
          for (int i = 0; i < jsonArraynetworks.size(); i++) {
            ZeroTrustGatewayNetwork.validateJsonElement(jsonArraynetworks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest>() {
           @Override
           public void write(JsonWriter out, ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest
  * @throws IOException if the JSON string is invalid with respect to ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest
  */
  public static ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest.class);
  }

 /**
  * Convert an instance of ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
