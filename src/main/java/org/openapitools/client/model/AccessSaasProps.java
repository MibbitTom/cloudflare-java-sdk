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
import org.openapitools.client.model.AccessSaasPropsSaasApp;

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
 * AccessSaasProps
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessSaasProps {
  public static final String SERIALIZED_NAME_ALLOWED_IDPS = "allowed_idps";
  @SerializedName(SERIALIZED_NAME_ALLOWED_IDPS)
  private List<String> allowedIdps = new ArrayList<>();

  public static final String SERIALIZED_NAME_APP_LAUNCHER_VISIBLE = "app_launcher_visible";
  @SerializedName(SERIALIZED_NAME_APP_LAUNCHER_VISIBLE)
  private Boolean appLauncherVisible = true;

  public static final String SERIALIZED_NAME_AUTO_REDIRECT_TO_IDENTITY = "auto_redirect_to_identity";
  @SerializedName(SERIALIZED_NAME_AUTO_REDIRECT_TO_IDENTITY)
  private Boolean autoRedirectToIdentity = false;

  public static final String SERIALIZED_NAME_CUSTOM_PAGES = "custom_pages";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PAGES)
  private List<String> customPages = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SAAS_APP = "saas_app";
  @SerializedName(SERIALIZED_NAME_SAAS_APP)
  private AccessSaasPropsSaasApp saasApp;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AccessSaasProps() {
  }

  public AccessSaasProps allowedIdps(List<String> allowedIdps) {
    this.allowedIdps = allowedIdps;
    return this;
  }

  public AccessSaasProps addAllowedIdpsItem(String allowedIdpsItem) {
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


  public AccessSaasProps appLauncherVisible(Boolean appLauncherVisible) {
    this.appLauncherVisible = appLauncherVisible;
    return this;
  }

   /**
   * Displays the application in the App Launcher.
   * @return appLauncherVisible
  **/
  @javax.annotation.Nullable
  public Boolean getAppLauncherVisible() {
    return appLauncherVisible;
  }

  public void setAppLauncherVisible(Boolean appLauncherVisible) {
    this.appLauncherVisible = appLauncherVisible;
  }


  public AccessSaasProps autoRedirectToIdentity(Boolean autoRedirectToIdentity) {
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


  public AccessSaasProps customPages(List<String> customPages) {
    this.customPages = customPages;
    return this;
  }

  public AccessSaasProps addCustomPagesItem(String customPagesItem) {
    if (this.customPages == null) {
      this.customPages = new ArrayList<>();
    }
    this.customPages.add(customPagesItem);
    return this;
  }

   /**
   * The custom pages that will be displayed when applicable for this application
   * @return customPages
  **/
  @javax.annotation.Nullable
  public List<String> getCustomPages() {
    return customPages;
  }

  public void setCustomPages(List<String> customPages) {
    this.customPages = customPages;
  }


  public AccessSaasProps logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * The image URL for the logo shown in the App Launcher dashboard.
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public AccessSaasProps name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the application.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccessSaasProps saasApp(AccessSaasPropsSaasApp saasApp) {
    this.saasApp = saasApp;
    return this;
  }

   /**
   * Get saasApp
   * @return saasApp
  **/
  @javax.annotation.Nullable
  public AccessSaasPropsSaasApp getSaasApp() {
    return saasApp;
  }

  public void setSaasApp(AccessSaasPropsSaasApp saasApp) {
    this.saasApp = saasApp;
  }


  public AccessSaasProps tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public AccessSaasProps addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags you want assigned to an application. Tags are used to filter applications in the App Launcher dashboard.
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public AccessSaasProps type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The application type.
   * @return type
  **/
  @javax.annotation.Nullable
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
    AccessSaasProps accessSaasProps = (AccessSaasProps) o;
    return Objects.equals(this.allowedIdps, accessSaasProps.allowedIdps) &&
        Objects.equals(this.appLauncherVisible, accessSaasProps.appLauncherVisible) &&
        Objects.equals(this.autoRedirectToIdentity, accessSaasProps.autoRedirectToIdentity) &&
        Objects.equals(this.customPages, accessSaasProps.customPages) &&
        Objects.equals(this.logoUrl, accessSaasProps.logoUrl) &&
        Objects.equals(this.name, accessSaasProps.name) &&
        Objects.equals(this.saasApp, accessSaasProps.saasApp) &&
        Objects.equals(this.tags, accessSaasProps.tags) &&
        Objects.equals(this.type, accessSaasProps.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedIdps, appLauncherVisible, autoRedirectToIdentity, customPages, logoUrl, name, saasApp, tags, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessSaasProps {\n");
    sb.append("    allowedIdps: ").append(toIndentedString(allowedIdps)).append("\n");
    sb.append("    appLauncherVisible: ").append(toIndentedString(appLauncherVisible)).append("\n");
    sb.append("    autoRedirectToIdentity: ").append(toIndentedString(autoRedirectToIdentity)).append("\n");
    sb.append("    customPages: ").append(toIndentedString(customPages)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    saasApp: ").append(toIndentedString(saasApp)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("allowed_idps");
    openapiFields.add("app_launcher_visible");
    openapiFields.add("auto_redirect_to_identity");
    openapiFields.add("custom_pages");
    openapiFields.add("logo_url");
    openapiFields.add("name");
    openapiFields.add("saas_app");
    openapiFields.add("tags");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessSaasProps
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessSaasProps.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessSaasProps is not found in the empty JSON string", AccessSaasProps.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessSaasProps.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessSaasProps` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_idps") != null && !jsonObj.get("allowed_idps").isJsonNull() && !jsonObj.get("allowed_idps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_idps` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_idps").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("custom_pages") != null && !jsonObj.get("custom_pages").isJsonNull() && !jsonObj.get("custom_pages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_pages` to be an array in the JSON string but got `%s`", jsonObj.get("custom_pages").toString()));
      }
      if ((jsonObj.get("logo_url") != null && !jsonObj.get("logo_url").isJsonNull()) && !jsonObj.get("logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_url").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `saas_app`
      if (jsonObj.get("saas_app") != null && !jsonObj.get("saas_app").isJsonNull()) {
        AccessSaasPropsSaasApp.validateJsonElement(jsonObj.get("saas_app"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessSaasProps.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessSaasProps' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessSaasProps> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessSaasProps.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessSaasProps>() {
           @Override
           public void write(JsonWriter out, AccessSaasProps value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessSaasProps read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessSaasProps given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessSaasProps
  * @throws IOException if the JSON string is invalid with respect to AccessSaasProps
  */
  public static AccessSaasProps fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessSaasProps.class);
  }

 /**
  * Convert an instance of AccessSaasProps to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

