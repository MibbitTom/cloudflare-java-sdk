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
import java.time.OffsetDateTime;
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
 * Custom certificate settings for BYO-PKI.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZeroTrustGatewayCustomCertificateSettings {
  public static final String SERIALIZED_NAME_BINDING_STATUS = "binding_status";
  @SerializedName(SERIALIZED_NAME_BINDING_STATUS)
  private String bindingStatus;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public ZeroTrustGatewayCustomCertificateSettings() {
  }

  public ZeroTrustGatewayCustomCertificateSettings(
     String bindingStatus, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.bindingStatus = bindingStatus;
    this.updatedAt = updatedAt;
  }

   /**
   * Certificate status (internal).
   * @return bindingStatus
  **/
  @javax.annotation.Nullable
  public String getBindingStatus() {
    return bindingStatus;
  }



  public ZeroTrustGatewayCustomCertificateSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enable use of custom certificate authority for signing Gateway traffic.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public ZeroTrustGatewayCustomCertificateSettings id(String id) {
    this.id = id;
    return this;
  }

   /**
   * UUID of certificate (ID from MTLS certificate store).
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZeroTrustGatewayCustomCertificateSettings zeroTrustGatewayCustomCertificateSettings = (ZeroTrustGatewayCustomCertificateSettings) o;
    return Objects.equals(this.bindingStatus, zeroTrustGatewayCustomCertificateSettings.bindingStatus) &&
        Objects.equals(this.enabled, zeroTrustGatewayCustomCertificateSettings.enabled) &&
        Objects.equals(this.id, zeroTrustGatewayCustomCertificateSettings.id) &&
        Objects.equals(this.updatedAt, zeroTrustGatewayCustomCertificateSettings.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindingStatus, enabled, id, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZeroTrustGatewayCustomCertificateSettings {\n");
    sb.append("    bindingStatus: ").append(toIndentedString(bindingStatus)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("binding_status");
    openapiFields.add("enabled");
    openapiFields.add("id");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZeroTrustGatewayCustomCertificateSettings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZeroTrustGatewayCustomCertificateSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZeroTrustGatewayCustomCertificateSettings is not found in the empty JSON string", ZeroTrustGatewayCustomCertificateSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZeroTrustGatewayCustomCertificateSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZeroTrustGatewayCustomCertificateSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ZeroTrustGatewayCustomCertificateSettings.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("binding_status") != null && !jsonObj.get("binding_status").isJsonNull()) && !jsonObj.get("binding_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `binding_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("binding_status").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZeroTrustGatewayCustomCertificateSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZeroTrustGatewayCustomCertificateSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZeroTrustGatewayCustomCertificateSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZeroTrustGatewayCustomCertificateSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<ZeroTrustGatewayCustomCertificateSettings>() {
           @Override
           public void write(JsonWriter out, ZeroTrustGatewayCustomCertificateSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZeroTrustGatewayCustomCertificateSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZeroTrustGatewayCustomCertificateSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZeroTrustGatewayCustomCertificateSettings
  * @throws IOException if the JSON string is invalid with respect to ZeroTrustGatewayCustomCertificateSettings
  */
  public static ZeroTrustGatewayCustomCertificateSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZeroTrustGatewayCustomCertificateSettings.class);
  }

 /**
  * Convert an instance of ZeroTrustGatewayCustomCertificateSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

