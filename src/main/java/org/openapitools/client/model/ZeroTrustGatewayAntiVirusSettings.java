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
import org.openapitools.client.model.ZeroTrustGatewayNotificationSettings;

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
 * Anti-virus settings.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZeroTrustGatewayAntiVirusSettings {
  public static final String SERIALIZED_NAME_ENABLED_DOWNLOAD_PHASE = "enabled_download_phase";
  @SerializedName(SERIALIZED_NAME_ENABLED_DOWNLOAD_PHASE)
  private Boolean enabledDownloadPhase;

  public static final String SERIALIZED_NAME_ENABLED_UPLOAD_PHASE = "enabled_upload_phase";
  @SerializedName(SERIALIZED_NAME_ENABLED_UPLOAD_PHASE)
  private Boolean enabledUploadPhase;

  public static final String SERIALIZED_NAME_FAIL_CLOSED = "fail_closed";
  @SerializedName(SERIALIZED_NAME_FAIL_CLOSED)
  private Boolean failClosed;

  public static final String SERIALIZED_NAME_NOTIFICATION_SETTINGS = "notification_settings";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_SETTINGS)
  private ZeroTrustGatewayNotificationSettings notificationSettings;

  public ZeroTrustGatewayAntiVirusSettings() {
  }

  public ZeroTrustGatewayAntiVirusSettings enabledDownloadPhase(Boolean enabledDownloadPhase) {
    this.enabledDownloadPhase = enabledDownloadPhase;
    return this;
  }

   /**
   * Enable anti-virus scanning on downloads.
   * @return enabledDownloadPhase
  **/
  @javax.annotation.Nullable
  public Boolean getEnabledDownloadPhase() {
    return enabledDownloadPhase;
  }

  public void setEnabledDownloadPhase(Boolean enabledDownloadPhase) {
    this.enabledDownloadPhase = enabledDownloadPhase;
  }


  public ZeroTrustGatewayAntiVirusSettings enabledUploadPhase(Boolean enabledUploadPhase) {
    this.enabledUploadPhase = enabledUploadPhase;
    return this;
  }

   /**
   * Enable anti-virus scanning on uploads.
   * @return enabledUploadPhase
  **/
  @javax.annotation.Nullable
  public Boolean getEnabledUploadPhase() {
    return enabledUploadPhase;
  }

  public void setEnabledUploadPhase(Boolean enabledUploadPhase) {
    this.enabledUploadPhase = enabledUploadPhase;
  }


  public ZeroTrustGatewayAntiVirusSettings failClosed(Boolean failClosed) {
    this.failClosed = failClosed;
    return this;
  }

   /**
   * Block requests for files that cannot be scanned.
   * @return failClosed
  **/
  @javax.annotation.Nullable
  public Boolean getFailClosed() {
    return failClosed;
  }

  public void setFailClosed(Boolean failClosed) {
    this.failClosed = failClosed;
  }


  public ZeroTrustGatewayAntiVirusSettings notificationSettings(ZeroTrustGatewayNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

   /**
   * Get notificationSettings
   * @return notificationSettings
  **/
  @javax.annotation.Nullable
  public ZeroTrustGatewayNotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  public void setNotificationSettings(ZeroTrustGatewayNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZeroTrustGatewayAntiVirusSettings zeroTrustGatewayAntiVirusSettings = (ZeroTrustGatewayAntiVirusSettings) o;
    return Objects.equals(this.enabledDownloadPhase, zeroTrustGatewayAntiVirusSettings.enabledDownloadPhase) &&
        Objects.equals(this.enabledUploadPhase, zeroTrustGatewayAntiVirusSettings.enabledUploadPhase) &&
        Objects.equals(this.failClosed, zeroTrustGatewayAntiVirusSettings.failClosed) &&
        Objects.equals(this.notificationSettings, zeroTrustGatewayAntiVirusSettings.notificationSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledDownloadPhase, enabledUploadPhase, failClosed, notificationSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZeroTrustGatewayAntiVirusSettings {\n");
    sb.append("    enabledDownloadPhase: ").append(toIndentedString(enabledDownloadPhase)).append("\n");
    sb.append("    enabledUploadPhase: ").append(toIndentedString(enabledUploadPhase)).append("\n");
    sb.append("    failClosed: ").append(toIndentedString(failClosed)).append("\n");
    sb.append("    notificationSettings: ").append(toIndentedString(notificationSettings)).append("\n");
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
    openapiFields.add("enabled_download_phase");
    openapiFields.add("enabled_upload_phase");
    openapiFields.add("fail_closed");
    openapiFields.add("notification_settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZeroTrustGatewayAntiVirusSettings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZeroTrustGatewayAntiVirusSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZeroTrustGatewayAntiVirusSettings is not found in the empty JSON string", ZeroTrustGatewayAntiVirusSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZeroTrustGatewayAntiVirusSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZeroTrustGatewayAntiVirusSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `notification_settings`
      if (jsonObj.get("notification_settings") != null && !jsonObj.get("notification_settings").isJsonNull()) {
        ZeroTrustGatewayNotificationSettings.validateJsonElement(jsonObj.get("notification_settings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZeroTrustGatewayAntiVirusSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZeroTrustGatewayAntiVirusSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZeroTrustGatewayAntiVirusSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZeroTrustGatewayAntiVirusSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<ZeroTrustGatewayAntiVirusSettings>() {
           @Override
           public void write(JsonWriter out, ZeroTrustGatewayAntiVirusSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZeroTrustGatewayAntiVirusSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZeroTrustGatewayAntiVirusSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZeroTrustGatewayAntiVirusSettings
  * @throws IOException if the JSON string is invalid with respect to ZeroTrustGatewayAntiVirusSettings
  */
  public static ZeroTrustGatewayAntiVirusSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZeroTrustGatewayAntiVirusSettings.class);
  }

 /**
  * Convert an instance of ZeroTrustGatewayAntiVirusSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

