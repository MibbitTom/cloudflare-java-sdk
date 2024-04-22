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
import org.openapitools.client.model.MagicPskMetadata;

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
 * MagicPskGenerationResponseAllOfResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class MagicPskGenerationResponseAllOfResult {
  public static final String SERIALIZED_NAME_IPSEC_TUNNEL_ID = "ipsec_tunnel_id";
  @SerializedName(SERIALIZED_NAME_IPSEC_TUNNEL_ID)
  private String ipsecTunnelId;

  public static final String SERIALIZED_NAME_PSK = "psk";
  @SerializedName(SERIALIZED_NAME_PSK)
  private String psk;

  public static final String SERIALIZED_NAME_PSK_METADATA = "psk_metadata";
  @SerializedName(SERIALIZED_NAME_PSK_METADATA)
  private MagicPskMetadata pskMetadata;

  public MagicPskGenerationResponseAllOfResult() {
  }

  public MagicPskGenerationResponseAllOfResult(
     String ipsecTunnelId
  ) {
    this();
    this.ipsecTunnelId = ipsecTunnelId;
  }

   /**
   * Identifier
   * @return ipsecTunnelId
  **/
  @javax.annotation.Nullable
  public String getIpsecTunnelId() {
    return ipsecTunnelId;
  }



  public MagicPskGenerationResponseAllOfResult psk(String psk) {
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


  public MagicPskGenerationResponseAllOfResult pskMetadata(MagicPskMetadata pskMetadata) {
    this.pskMetadata = pskMetadata;
    return this;
  }

   /**
   * Get pskMetadata
   * @return pskMetadata
  **/
  @javax.annotation.Nullable
  public MagicPskMetadata getPskMetadata() {
    return pskMetadata;
  }

  public void setPskMetadata(MagicPskMetadata pskMetadata) {
    this.pskMetadata = pskMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagicPskGenerationResponseAllOfResult magicPskGenerationResponseAllOfResult = (MagicPskGenerationResponseAllOfResult) o;
    return Objects.equals(this.ipsecTunnelId, magicPskGenerationResponseAllOfResult.ipsecTunnelId) &&
        Objects.equals(this.psk, magicPskGenerationResponseAllOfResult.psk) &&
        Objects.equals(this.pskMetadata, magicPskGenerationResponseAllOfResult.pskMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipsecTunnelId, psk, pskMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicPskGenerationResponseAllOfResult {\n");
    sb.append("    ipsecTunnelId: ").append(toIndentedString(ipsecTunnelId)).append("\n");
    sb.append("    psk: ").append(toIndentedString(psk)).append("\n");
    sb.append("    pskMetadata: ").append(toIndentedString(pskMetadata)).append("\n");
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
    openapiFields.add("ipsec_tunnel_id");
    openapiFields.add("psk");
    openapiFields.add("psk_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MagicPskGenerationResponseAllOfResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MagicPskGenerationResponseAllOfResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MagicPskGenerationResponseAllOfResult is not found in the empty JSON string", MagicPskGenerationResponseAllOfResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MagicPskGenerationResponseAllOfResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MagicPskGenerationResponseAllOfResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ipsec_tunnel_id") != null && !jsonObj.get("ipsec_tunnel_id").isJsonNull()) && !jsonObj.get("ipsec_tunnel_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipsec_tunnel_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipsec_tunnel_id").toString()));
      }
      if ((jsonObj.get("psk") != null && !jsonObj.get("psk").isJsonNull()) && !jsonObj.get("psk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `psk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("psk").toString()));
      }
      // validate the optional field `psk_metadata`
      if (jsonObj.get("psk_metadata") != null && !jsonObj.get("psk_metadata").isJsonNull()) {
        MagicPskMetadata.validateJsonElement(jsonObj.get("psk_metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MagicPskGenerationResponseAllOfResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MagicPskGenerationResponseAllOfResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MagicPskGenerationResponseAllOfResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MagicPskGenerationResponseAllOfResult.class));

       return (TypeAdapter<T>) new TypeAdapter<MagicPskGenerationResponseAllOfResult>() {
           @Override
           public void write(JsonWriter out, MagicPskGenerationResponseAllOfResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MagicPskGenerationResponseAllOfResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MagicPskGenerationResponseAllOfResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MagicPskGenerationResponseAllOfResult
  * @throws IOException if the JSON string is invalid with respect to MagicPskGenerationResponseAllOfResult
  */
  public static MagicPskGenerationResponseAllOfResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MagicPskGenerationResponseAllOfResult.class);
  }

 /**
  * Convert an instance of MagicPskGenerationResponseAllOfResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
