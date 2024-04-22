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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * AppLauncherApplication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AppLauncherApplication {
  public static final String SERIALIZED_NAME_AUD = "aud";
  @SerializedName(SERIALIZED_NAME_AUD)
  private String aud;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_ALLOWED_IDPS = "allowed_idps";
  @SerializedName(SERIALIZED_NAME_ALLOWED_IDPS)
  private List<String> allowedIdps = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTO_REDIRECT_TO_IDENTITY = "auto_redirect_to_identity";
  @SerializedName(SERIALIZED_NAME_AUTO_REDIRECT_TO_IDENTITY)
  private Boolean autoRedirectToIdentity = false;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private Object domain;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Object name = App Launcher;

  public static final String SERIALIZED_NAME_SESSION_DURATION = "session_duration";
  @SerializedName(SERIALIZED_NAME_SESSION_DURATION)
  private String sessionDuration = "24h";

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AppLauncherApplication() {
  }

  public AppLauncherApplication(
     String aud, 
     OffsetDateTime createdAt, 
     String id, 
     OffsetDateTime updatedAt, 
     Object domain, 
     Object name
  ) {
    this();
    this.aud = aud;
    this.createdAt = createdAt;
    this.id = id;
    this.updatedAt = updatedAt;
    this.domain = domain;
    this.name = name;
  }

   /**
   * Audience tag.
   * @return aud
  **/
  @javax.annotation.Nullable
  public String getAud() {
    return aud;
  }



   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



   /**
   * UUID
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }



  public AppLauncherApplication allowedIdps(List<String> allowedIdps) {
    this.allowedIdps = allowedIdps;
    return this;
  }

  public AppLauncherApplication addAllowedIdpsItem(String allowedIdpsItem) {
    if (this.allowedIdps == null) {
      this.allowedIdps = new ArrayList<>();
    }
    this.allowedIdps.add(allowedIdpsItem);
    return this;
  }

   /**
   * The identity providers your users can select when connecting to this application. Defaults to all IdPs configured in your account.
   * @return allowedIdps
  **/
  @javax.annotation.Nullable
  public List<String> getAllowedIdps() {
    return allowedIdps;
  }

  public void setAllowedIdps(List<String> allowedIdps) {
    this.allowedIdps = allowedIdps;
  }


  public AppLauncherApplication autoRedirectToIdentity(Boolean autoRedirectToIdentity) {
    this.autoRedirectToIdentity = autoRedirectToIdentity;
    return this;
  }

   /**
   * When set to &#x60;true&#x60;, users skip the identity provider selection step during login. You must specify only one identity provider in allowed_idps.
   * @return autoRedirectToIdentity
  **/
  @javax.annotation.Nullable
  public Boolean getAutoRedirectToIdentity() {
    return autoRedirectToIdentity;
  }

  public void setAutoRedirectToIdentity(Boolean autoRedirectToIdentity) {
    this.autoRedirectToIdentity = autoRedirectToIdentity;
  }


   /**
   * Get domain
   * @return domain
  **/
  @javax.annotation.Nullable
  public Object getDomain() {
    return domain;
  }



   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public Object getName() {
    return name;
  }



  public AppLauncherApplication sessionDuration(String sessionDuration) {
    this.sessionDuration = sessionDuration;
    return this;
  }

   /**
   * The amount of time that tokens issued for this application will be valid. Must be in the format &#x60;300ms&#x60; or &#x60;2h45m&#x60;. Valid time units are: ns, us (or µs), ms, s, m, h.
   * @return sessionDuration
  **/
  @javax.annotation.Nullable
  public String getSessionDuration() {
    return sessionDuration;
  }

  public void setSessionDuration(String sessionDuration) {
    this.sessionDuration = sessionDuration;
  }


  public AppLauncherApplication type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The application type.
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppLauncherApplication appLauncherApplication = (AppLauncherApplication) o;
    return Objects.equals(this.aud, appLauncherApplication.aud) &&
        Objects.equals(this.createdAt, appLauncherApplication.createdAt) &&
        Objects.equals(this.id, appLauncherApplication.id) &&
        Objects.equals(this.updatedAt, appLauncherApplication.updatedAt) &&
        Objects.equals(this.allowedIdps, appLauncherApplication.allowedIdps) &&
        Objects.equals(this.autoRedirectToIdentity, appLauncherApplication.autoRedirectToIdentity) &&
        Objects.equals(this.domain, appLauncherApplication.domain) &&
        Objects.equals(this.name, appLauncherApplication.name) &&
        Objects.equals(this.sessionDuration, appLauncherApplication.sessionDuration) &&
        Objects.equals(this.type, appLauncherApplication.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aud, createdAt, id, updatedAt, allowedIdps, autoRedirectToIdentity, domain, name, sessionDuration, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppLauncherApplication {\n");
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    allowedIdps: ").append(toIndentedString(allowedIdps)).append("\n");
    sb.append("    autoRedirectToIdentity: ").append(toIndentedString(autoRedirectToIdentity)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sessionDuration: ").append(toIndentedString(sessionDuration)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("aud");
    openapiFields.add("created_at");
    openapiFields.add("id");
    openapiFields.add("updated_at");
    openapiFields.add("allowed_idps");
    openapiFields.add("auto_redirect_to_identity");
    openapiFields.add("domain");
    openapiFields.add("name");
    openapiFields.add("session_duration");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppLauncherApplication
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppLauncherApplication.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppLauncherApplication is not found in the empty JSON string", AppLauncherApplication.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppLauncherApplication.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppLauncherApplication` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AppLauncherApplication.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("aud") != null && !jsonObj.get("aud").isJsonNull()) && !jsonObj.get("aud").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aud` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aud").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_idps") != null && !jsonObj.get("allowed_idps").isJsonNull() && !jsonObj.get("allowed_idps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_idps` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_idps").toString()));
      }
      if ((jsonObj.get("session_duration") != null && !jsonObj.get("session_duration").isJsonNull()) && !jsonObj.get("session_duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_duration").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppLauncherApplication.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppLauncherApplication' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppLauncherApplication> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppLauncherApplication.class));

       return (TypeAdapter<T>) new TypeAdapter<AppLauncherApplication>() {
           @Override
           public void write(JsonWriter out, AppLauncherApplication value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppLauncherApplication read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppLauncherApplication given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppLauncherApplication
  * @throws IOException if the JSON string is invalid with respect to AppLauncherApplication
  */
  public static AppLauncherApplication fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppLauncherApplication.class);
  }

 /**
  * Convert an instance of AppLauncherApplication to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
