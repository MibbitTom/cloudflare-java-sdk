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
import org.openapitools.client.model.AccessSettings;

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
 * AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest {
  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private List<AccessSettings> settings = new ArrayList<>();

  public AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest() {
  }

  public AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest settings(List<AccessSettings> settings) {
    this.settings = settings;
    return this;
  }

  public AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest addSettingsItem(AccessSettings settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<>();
    }
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nonnull
  public List<AccessSettings> getSettings() {
    return settings;
  }

  public void setSettings(List<AccessSettings> settings) {
    this.settings = settings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest accessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest = (AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest) o;
    return Objects.equals(this.settings, accessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest {\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
    openapiFields.add("settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("settings");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest is not found in the empty JSON string", AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("settings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `settings` to be an array in the JSON string but got `%s`", jsonObj.get("settings").toString()));
      }

      JsonArray jsonArraysettings = jsonObj.getAsJsonArray("settings");
      // validate the required field `settings` (array)
      for (int i = 0; i < jsonArraysettings.size(); i++) {
        AccessSettings.validateJsonElement(jsonArraysettings.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest>() {
           @Override
           public void write(JsonWriter out, AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest
  * @throws IOException if the JSON string is invalid with respect to AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest
  */
  public static AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest.class);
  }

 /**
  * Convert an instance of AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
