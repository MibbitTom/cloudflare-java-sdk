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
 * AccessBookmarks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessBookmarks {
  public static final String SERIALIZED_NAME_APP_LAUNCHER_VISIBLE = "app_launcher_visible";
  @SerializedName(SERIALIZED_NAME_APP_LAUNCHER_VISIBLE)
  private Boolean appLauncherVisible;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public AccessBookmarks() {
  }

  public AccessBookmarks(
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public AccessBookmarks appLauncherVisible(Boolean appLauncherVisible) {
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


   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  public AccessBookmarks domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * The domain of the Bookmark application.
   * @return domain
  **/
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public AccessBookmarks id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the Bookmark application.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public AccessBookmarks logoUrl(String logoUrl) {
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


  public AccessBookmarks name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the Bookmark application.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
    AccessBookmarks accessBookmarks = (AccessBookmarks) o;
    return Objects.equals(this.appLauncherVisible, accessBookmarks.appLauncherVisible) &&
        Objects.equals(this.createdAt, accessBookmarks.createdAt) &&
        Objects.equals(this.domain, accessBookmarks.domain) &&
        Objects.equals(this.id, accessBookmarks.id) &&
        Objects.equals(this.logoUrl, accessBookmarks.logoUrl) &&
        Objects.equals(this.name, accessBookmarks.name) &&
        Objects.equals(this.updatedAt, accessBookmarks.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appLauncherVisible, createdAt, domain, id, logoUrl, name, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessBookmarks {\n");
    sb.append("    appLauncherVisible: ").append(toIndentedString(appLauncherVisible)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("app_launcher_visible");
    openapiFields.add("created_at");
    openapiFields.add("domain");
    openapiFields.add("id");
    openapiFields.add("logo_url");
    openapiFields.add("name");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessBookmarks
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessBookmarks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessBookmarks is not found in the empty JSON string", AccessBookmarks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessBookmarks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessBookmarks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("domain") != null && !jsonObj.get("domain").isJsonNull()) && !jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("logo_url") != null && !jsonObj.get("logo_url").isJsonNull()) && !jsonObj.get("logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_url").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessBookmarks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessBookmarks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessBookmarks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessBookmarks.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessBookmarks>() {
           @Override
           public void write(JsonWriter out, AccessBookmarks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessBookmarks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessBookmarks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessBookmarks
  * @throws IOException if the JSON string is invalid with respect to AccessBookmarks
  */
  public static AccessBookmarks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessBookmarks.class);
  }

 /**
  * Convert an instance of AccessBookmarks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

