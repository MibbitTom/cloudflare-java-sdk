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
import java.math.BigDecimal;
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
 * SecondaryDnsPeer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class SecondaryDnsPeer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Object id = null;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_IXFR_ENABLE = "ixfr_enable";
  @SerializedName(SERIALIZED_NAME_IXFR_ENABLE)
  private Boolean ixfrEnable;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private BigDecimal port;

  public static final String SERIALIZED_NAME_TSIG_ID = "tsig_id";
  @SerializedName(SERIALIZED_NAME_TSIG_ID)
  private String tsigId;

  public SecondaryDnsPeer() {
  }

  public SecondaryDnsPeer(
     Object id
  ) {
    this();
    this.id = id;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Object getId() {
    return id;
  }



  public SecondaryDnsPeer ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * IPv4/IPv6 address of primary or secondary nameserver, depending on what zone this peer is linked to. For primary zones this IP defines the IP of the secondary nameserver Cloudflare will NOTIFY upon zone changes. For secondary zones this IP defines the IP of the primary nameserver Cloudflare will send AXFR/IXFR requests to.
   * @return ip
  **/
  @javax.annotation.Nullable
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public SecondaryDnsPeer ixfrEnable(Boolean ixfrEnable) {
    this.ixfrEnable = ixfrEnable;
    return this;
  }

   /**
   * Enable IXFR transfer protocol, default is AXFR. Only applicable to secondary zones.
   * @return ixfrEnable
  **/
  @javax.annotation.Nullable
  public Boolean getIxfrEnable() {
    return ixfrEnable;
  }

  public void setIxfrEnable(Boolean ixfrEnable) {
    this.ixfrEnable = ixfrEnable;
  }


  public SecondaryDnsPeer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the peer.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public SecondaryDnsPeer port(BigDecimal port) {
    this.port = port;
    return this;
  }

   /**
   * DNS port of primary or secondary nameserver, depending on what zone this peer is linked to.
   * @return port
  **/
  @javax.annotation.Nullable
  public BigDecimal getPort() {
    return port;
  }

  public void setPort(BigDecimal port) {
    this.port = port;
  }


  public SecondaryDnsPeer tsigId(String tsigId) {
    this.tsigId = tsigId;
    return this;
  }

   /**
   * TSIG authentication will be used for zone transfer if configured.
   * @return tsigId
  **/
  @javax.annotation.Nullable
  public String getTsigId() {
    return tsigId;
  }

  public void setTsigId(String tsigId) {
    this.tsigId = tsigId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecondaryDnsPeer secondaryDnsPeer = (SecondaryDnsPeer) o;
    return Objects.equals(this.id, secondaryDnsPeer.id) &&
        Objects.equals(this.ip, secondaryDnsPeer.ip) &&
        Objects.equals(this.ixfrEnable, secondaryDnsPeer.ixfrEnable) &&
        Objects.equals(this.name, secondaryDnsPeer.name) &&
        Objects.equals(this.port, secondaryDnsPeer.port) &&
        Objects.equals(this.tsigId, secondaryDnsPeer.tsigId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ip, ixfrEnable, name, port, tsigId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondaryDnsPeer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    ixfrEnable: ").append(toIndentedString(ixfrEnable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    tsigId: ").append(toIndentedString(tsigId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("ip");
    openapiFields.add("ixfr_enable");
    openapiFields.add("name");
    openapiFields.add("port");
    openapiFields.add("tsig_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SecondaryDnsPeer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SecondaryDnsPeer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SecondaryDnsPeer is not found in the empty JSON string", SecondaryDnsPeer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SecondaryDnsPeer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SecondaryDnsPeer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SecondaryDnsPeer.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ip") != null && !jsonObj.get("ip").isJsonNull()) && !jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("tsig_id") != null && !jsonObj.get("tsig_id").isJsonNull()) && !jsonObj.get("tsig_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tsig_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tsig_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecondaryDnsPeer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecondaryDnsPeer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecondaryDnsPeer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecondaryDnsPeer.class));

       return (TypeAdapter<T>) new TypeAdapter<SecondaryDnsPeer>() {
           @Override
           public void write(JsonWriter out, SecondaryDnsPeer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecondaryDnsPeer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecondaryDnsPeer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecondaryDnsPeer
  * @throws IOException if the JSON string is invalid with respect to SecondaryDnsPeer
  */
  public static SecondaryDnsPeer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecondaryDnsPeer.class);
  }

 /**
  * Convert an instance of SecondaryDnsPeer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

