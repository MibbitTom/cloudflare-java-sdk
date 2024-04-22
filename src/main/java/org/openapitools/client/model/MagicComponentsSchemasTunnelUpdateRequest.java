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
import org.openapitools.client.model.MagicGre;
import org.openapitools.client.model.MagicSchemasHealthCheck;

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
 * MagicComponentsSchemasTunnelUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class MagicComponentsSchemasTunnelUpdateRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GRE = "gre";
  @SerializedName(SERIALIZED_NAME_GRE)
  private MagicGre gre;

  public static final String SERIALIZED_NAME_HEALTH_CHECK = "health_check";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK)
  private MagicSchemasHealthCheck healthCheck;

  public static final String SERIALIZED_NAME_INTERFACE_ADDRESS = "interface_address";
  @SerializedName(SERIALIZED_NAME_INTERFACE_ADDRESS)
  private String interfaceAddress;

  public static final String SERIALIZED_NAME_MTU = "mtu";
  @SerializedName(SERIALIZED_NAME_MTU)
  private Integer mtu = 1476;

  public MagicComponentsSchemasTunnelUpdateRequest() {
  }

  public MagicComponentsSchemasTunnelUpdateRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An optional description of the interconnect.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public MagicComponentsSchemasTunnelUpdateRequest gre(MagicGre gre) {
    this.gre = gre;
    return this;
  }

   /**
   * Get gre
   * @return gre
  **/
  @javax.annotation.Nullable
  public MagicGre getGre() {
    return gre;
  }

  public void setGre(MagicGre gre) {
    this.gre = gre;
  }


  public MagicComponentsSchemasTunnelUpdateRequest healthCheck(MagicSchemasHealthCheck healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

   /**
   * Get healthCheck
   * @return healthCheck
  **/
  @javax.annotation.Nullable
  public MagicSchemasHealthCheck getHealthCheck() {
    return healthCheck;
  }

  public void setHealthCheck(MagicSchemasHealthCheck healthCheck) {
    this.healthCheck = healthCheck;
  }


  public MagicComponentsSchemasTunnelUpdateRequest interfaceAddress(String interfaceAddress) {
    this.interfaceAddress = interfaceAddress;
    return this;
  }

   /**
   * A 31-bit prefix (/31 in CIDR notation) supporting two hosts, one for each side of the tunnel. Select the subnet from the following private IP space: 10.0.0.0–10.255.255.255, 172.16.0.0–172.31.255.255, 192.168.0.0–192.168.255.255.
   * @return interfaceAddress
  **/
  @javax.annotation.Nullable
  public String getInterfaceAddress() {
    return interfaceAddress;
  }

  public void setInterfaceAddress(String interfaceAddress) {
    this.interfaceAddress = interfaceAddress;
  }


  public MagicComponentsSchemasTunnelUpdateRequest mtu(Integer mtu) {
    this.mtu = mtu;
    return this;
  }

   /**
   * The Maximum Transmission Unit (MTU) in bytes for the interconnect. The minimum value is 576.
   * @return mtu
  **/
  @javax.annotation.Nullable
  public Integer getMtu() {
    return mtu;
  }

  public void setMtu(Integer mtu) {
    this.mtu = mtu;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagicComponentsSchemasTunnelUpdateRequest magicComponentsSchemasTunnelUpdateRequest = (MagicComponentsSchemasTunnelUpdateRequest) o;
    return Objects.equals(this.description, magicComponentsSchemasTunnelUpdateRequest.description) &&
        Objects.equals(this.gre, magicComponentsSchemasTunnelUpdateRequest.gre) &&
        Objects.equals(this.healthCheck, magicComponentsSchemasTunnelUpdateRequest.healthCheck) &&
        Objects.equals(this.interfaceAddress, magicComponentsSchemasTunnelUpdateRequest.interfaceAddress) &&
        Objects.equals(this.mtu, magicComponentsSchemasTunnelUpdateRequest.mtu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, gre, healthCheck, interfaceAddress, mtu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicComponentsSchemasTunnelUpdateRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gre: ").append(toIndentedString(gre)).append("\n");
    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
    sb.append("    interfaceAddress: ").append(toIndentedString(interfaceAddress)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("gre");
    openapiFields.add("health_check");
    openapiFields.add("interface_address");
    openapiFields.add("mtu");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MagicComponentsSchemasTunnelUpdateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MagicComponentsSchemasTunnelUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MagicComponentsSchemasTunnelUpdateRequest is not found in the empty JSON string", MagicComponentsSchemasTunnelUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MagicComponentsSchemasTunnelUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MagicComponentsSchemasTunnelUpdateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `gre`
      if (jsonObj.get("gre") != null && !jsonObj.get("gre").isJsonNull()) {
        MagicGre.validateJsonElement(jsonObj.get("gre"));
      }
      // validate the optional field `health_check`
      if (jsonObj.get("health_check") != null && !jsonObj.get("health_check").isJsonNull()) {
        MagicSchemasHealthCheck.validateJsonElement(jsonObj.get("health_check"));
      }
      if ((jsonObj.get("interface_address") != null && !jsonObj.get("interface_address").isJsonNull()) && !jsonObj.get("interface_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interface_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interface_address").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MagicComponentsSchemasTunnelUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MagicComponentsSchemasTunnelUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MagicComponentsSchemasTunnelUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MagicComponentsSchemasTunnelUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<MagicComponentsSchemasTunnelUpdateRequest>() {
           @Override
           public void write(JsonWriter out, MagicComponentsSchemasTunnelUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MagicComponentsSchemasTunnelUpdateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MagicComponentsSchemasTunnelUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MagicComponentsSchemasTunnelUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to MagicComponentsSchemasTunnelUpdateRequest
  */
  public static MagicComponentsSchemasTunnelUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MagicComponentsSchemasTunnelUpdateRequest.class);
  }

 /**
  * Convert an instance of MagicComponentsSchemasTunnelUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

