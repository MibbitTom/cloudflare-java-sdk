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
 * ZeroTrustGatewayGatewayAccountAllOfResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZeroTrustGatewayGatewayAccountAllOfResult {
  public static final String SERIALIZED_NAME_GATEWAY_TAG = "gateway_tag";
  @SerializedName(SERIALIZED_NAME_GATEWAY_TAG)
  private String gatewayTag;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PROVIDER_NAME = "provider_name";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public ZeroTrustGatewayGatewayAccountAllOfResult() {
  }

  public ZeroTrustGatewayGatewayAccountAllOfResult gatewayTag(String gatewayTag) {
    this.gatewayTag = gatewayTag;
    return this;
  }

   /**
   * Gateway internal ID.
   * @return gatewayTag
  **/
  @javax.annotation.Nullable
  public String getGatewayTag() {
    return gatewayTag;
  }

  public void setGatewayTag(String gatewayTag) {
    this.gatewayTag = gatewayTag;
  }


  public ZeroTrustGatewayGatewayAccountAllOfResult id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Cloudflare account ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ZeroTrustGatewayGatewayAccountAllOfResult providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * The name of the provider. Usually Cloudflare.
   * @return providerName
  **/
  @javax.annotation.Nullable
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZeroTrustGatewayGatewayAccountAllOfResult zeroTrustGatewayGatewayAccountAllOfResult = (ZeroTrustGatewayGatewayAccountAllOfResult) o;
    return Objects.equals(this.gatewayTag, zeroTrustGatewayGatewayAccountAllOfResult.gatewayTag) &&
        Objects.equals(this.id, zeroTrustGatewayGatewayAccountAllOfResult.id) &&
        Objects.equals(this.providerName, zeroTrustGatewayGatewayAccountAllOfResult.providerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayTag, id, providerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZeroTrustGatewayGatewayAccountAllOfResult {\n");
    sb.append("    gatewayTag: ").append(toIndentedString(gatewayTag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
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
    openapiFields.add("gateway_tag");
    openapiFields.add("id");
    openapiFields.add("provider_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZeroTrustGatewayGatewayAccountAllOfResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZeroTrustGatewayGatewayAccountAllOfResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZeroTrustGatewayGatewayAccountAllOfResult is not found in the empty JSON string", ZeroTrustGatewayGatewayAccountAllOfResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZeroTrustGatewayGatewayAccountAllOfResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZeroTrustGatewayGatewayAccountAllOfResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("gateway_tag") != null && !jsonObj.get("gateway_tag").isJsonNull()) && !jsonObj.get("gateway_tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_tag").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("provider_name") != null && !jsonObj.get("provider_name").isJsonNull()) && !jsonObj.get("provider_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZeroTrustGatewayGatewayAccountAllOfResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZeroTrustGatewayGatewayAccountAllOfResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZeroTrustGatewayGatewayAccountAllOfResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZeroTrustGatewayGatewayAccountAllOfResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ZeroTrustGatewayGatewayAccountAllOfResult>() {
           @Override
           public void write(JsonWriter out, ZeroTrustGatewayGatewayAccountAllOfResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZeroTrustGatewayGatewayAccountAllOfResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZeroTrustGatewayGatewayAccountAllOfResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZeroTrustGatewayGatewayAccountAllOfResult
  * @throws IOException if the JSON string is invalid with respect to ZeroTrustGatewayGatewayAccountAllOfResult
  */
  public static ZeroTrustGatewayGatewayAccountAllOfResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZeroTrustGatewayGatewayAccountAllOfResult.class);
  }

 /**
  * Convert an instance of ZeroTrustGatewayGatewayAccountAllOfResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

