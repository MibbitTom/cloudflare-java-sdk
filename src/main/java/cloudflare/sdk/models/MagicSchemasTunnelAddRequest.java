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
import cloudflare.sdk.models.MagicHealthCheck;
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
 * MagicSchemasTunnelAddRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class MagicSchemasTunnelAddRequest {
  public static final String SERIALIZED_NAME_CLOUDFLARE_ENDPOINT = "cloudflare_endpoint";
  @SerializedName(SERIALIZED_NAME_CLOUDFLARE_ENDPOINT)
  private String cloudflareEndpoint;

  public static final String SERIALIZED_NAME_CUSTOMER_ENDPOINT = "customer_endpoint";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ENDPOINT)
  private String customerEndpoint;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HEALTH_CHECK = "health_check";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK)
  private MagicHealthCheck healthCheck;

  public static final String SERIALIZED_NAME_INTERFACE_ADDRESS = "interface_address";
  @SerializedName(SERIALIZED_NAME_INTERFACE_ADDRESS)
  private String interfaceAddress;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PSK = "psk";
  @SerializedName(SERIALIZED_NAME_PSK)
  private String psk;

  public static final String SERIALIZED_NAME_REPLAY_PROTECTION = "replay_protection";
  @SerializedName(SERIALIZED_NAME_REPLAY_PROTECTION)
  private Boolean replayProtection = false;

  public MagicSchemasTunnelAddRequest() {
  }

  public MagicSchemasTunnelAddRequest cloudflareEndpoint(String cloudflareEndpoint) {
    this.cloudflareEndpoint = cloudflareEndpoint;
    return this;
  }

   /**
   * The IP address assigned to the Cloudflare side of the IPsec tunnel.
   * @return cloudflareEndpoint
  **/
  @javax.annotation.Nonnull
  public String getCloudflareEndpoint() {
    return cloudflareEndpoint;
  }

  public void setCloudflareEndpoint(String cloudflareEndpoint) {
    this.cloudflareEndpoint = cloudflareEndpoint;
  }


  public MagicSchemasTunnelAddRequest customerEndpoint(String customerEndpoint) {
    this.customerEndpoint = customerEndpoint;
    return this;
  }

   /**
   * The IP address assigned to the customer side of the IPsec tunnel. Not required, but must be set for proactive traceroutes to work.
   * @return customerEndpoint
  **/
  @javax.annotation.Nullable
  public String getCustomerEndpoint() {
    return customerEndpoint;
  }

  public void setCustomerEndpoint(String customerEndpoint) {
    this.customerEndpoint = customerEndpoint;
  }


  public MagicSchemasTunnelAddRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An optional description forthe IPsec tunnel.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public MagicSchemasTunnelAddRequest healthCheck(MagicHealthCheck healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

   /**
   * Get healthCheck
   * @return healthCheck
  **/
  @javax.annotation.Nullable
  public MagicHealthCheck getHealthCheck() {
    return healthCheck;
  }

  public void setHealthCheck(MagicHealthCheck healthCheck) {
    this.healthCheck = healthCheck;
  }


  public MagicSchemasTunnelAddRequest interfaceAddress(String interfaceAddress) {
    this.interfaceAddress = interfaceAddress;
    return this;
  }

   /**
   * A 31-bit prefix (/31 in CIDR notation) supporting two hosts, one for each side of the tunnel. Select the subnet from the following private IP space: 10.0.0.0–10.255.255.255, 172.16.0.0–172.31.255.255, 192.168.0.0–192.168.255.255.
   * @return interfaceAddress
  **/
  @javax.annotation.Nonnull
  public String getInterfaceAddress() {
    return interfaceAddress;
  }

  public void setInterfaceAddress(String interfaceAddress) {
    this.interfaceAddress = interfaceAddress;
  }


  public MagicSchemasTunnelAddRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the IPsec tunnel. The name cannot share a name with other tunnels.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public MagicSchemasTunnelAddRequest psk(String psk) {
    this.psk = psk;
    return this;
  }

   /**
   * A randomly generated or provided string for use in the IPsec tunnel.
   * @return psk
  **/
  @javax.annotation.Nullable
  public String getPsk() {
    return psk;
  }

  public void setPsk(String psk) {
    this.psk = psk;
  }


  public MagicSchemasTunnelAddRequest replayProtection(Boolean replayProtection) {
    this.replayProtection = replayProtection;
    return this;
  }

   /**
   * If &#x60;true&#x60;, then IPsec replay protection will be supported in the Cloudflare-to-customer direction.
   * @return replayProtection
  **/
  @javax.annotation.Nullable
  public Boolean getReplayProtection() {
    return replayProtection;
  }

  public void setReplayProtection(Boolean replayProtection) {
    this.replayProtection = replayProtection;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagicSchemasTunnelAddRequest magicSchemasTunnelAddRequest = (MagicSchemasTunnelAddRequest) o;
    return Objects.equals(this.cloudflareEndpoint, magicSchemasTunnelAddRequest.cloudflareEndpoint) &&
        Objects.equals(this.customerEndpoint, magicSchemasTunnelAddRequest.customerEndpoint) &&
        Objects.equals(this.description, magicSchemasTunnelAddRequest.description) &&
        Objects.equals(this.healthCheck, magicSchemasTunnelAddRequest.healthCheck) &&
        Objects.equals(this.interfaceAddress, magicSchemasTunnelAddRequest.interfaceAddress) &&
        Objects.equals(this.name, magicSchemasTunnelAddRequest.name) &&
        Objects.equals(this.psk, magicSchemasTunnelAddRequest.psk) &&
        Objects.equals(this.replayProtection, magicSchemasTunnelAddRequest.replayProtection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudflareEndpoint, customerEndpoint, description, healthCheck, interfaceAddress, name, psk, replayProtection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicSchemasTunnelAddRequest {\n");
    sb.append("    cloudflareEndpoint: ").append(toIndentedString(cloudflareEndpoint)).append("\n");
    sb.append("    customerEndpoint: ").append(toIndentedString(customerEndpoint)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
    sb.append("    interfaceAddress: ").append(toIndentedString(interfaceAddress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    psk: ").append(toIndentedString(psk)).append("\n");
    sb.append("    replayProtection: ").append(toIndentedString(replayProtection)).append("\n");
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
    openapiFields.add("cloudflare_endpoint");
    openapiFields.add("customer_endpoint");
    openapiFields.add("description");
    openapiFields.add("health_check");
    openapiFields.add("interface_address");
    openapiFields.add("name");
    openapiFields.add("psk");
    openapiFields.add("replay_protection");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cloudflare_endpoint");
    openapiRequiredFields.add("interface_address");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MagicSchemasTunnelAddRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MagicSchemasTunnelAddRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MagicSchemasTunnelAddRequest is not found in the empty JSON string", MagicSchemasTunnelAddRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MagicSchemasTunnelAddRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MagicSchemasTunnelAddRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MagicSchemasTunnelAddRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("cloudflare_endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudflare_endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloudflare_endpoint").toString()));
      }
      if ((jsonObj.get("customer_endpoint") != null && !jsonObj.get("customer_endpoint").isJsonNull()) && !jsonObj.get("customer_endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_endpoint").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `health_check`
      if (jsonObj.get("health_check") != null && !jsonObj.get("health_check").isJsonNull()) {
        MagicHealthCheck.validateJsonElement(jsonObj.get("health_check"));
      }
      if (!jsonObj.get("interface_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interface_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interface_address").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("psk") != null && !jsonObj.get("psk").isJsonNull()) && !jsonObj.get("psk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `psk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("psk").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MagicSchemasTunnelAddRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MagicSchemasTunnelAddRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MagicSchemasTunnelAddRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MagicSchemasTunnelAddRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<MagicSchemasTunnelAddRequest>() {
           @Override
           public void write(JsonWriter out, MagicSchemasTunnelAddRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MagicSchemasTunnelAddRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MagicSchemasTunnelAddRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MagicSchemasTunnelAddRequest
  * @throws IOException if the JSON string is invalid with respect to MagicSchemasTunnelAddRequest
  */
  public static MagicSchemasTunnelAddRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MagicSchemasTunnelAddRequest.class);
  }

 /**
  * Convert an instance of MagicSchemasTunnelAddRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

