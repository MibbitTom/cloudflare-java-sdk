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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.AccessLoginDesign;

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
 * AccessSchemasOrganizations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessSchemasOrganizations {
  public static final String SERIALIZED_NAME_AUTH_DOMAIN = "auth_domain";
  @SerializedName(SERIALIZED_NAME_AUTH_DOMAIN)
  private String authDomain;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_IS_UI_READ_ONLY = "is_ui_read_only";
  @SerializedName(SERIALIZED_NAME_IS_UI_READ_ONLY)
  private Boolean isUiReadOnly;

  public static final String SERIALIZED_NAME_LOGIN_DESIGN = "login_design";
  @SerializedName(SERIALIZED_NAME_LOGIN_DESIGN)
  private AccessLoginDesign loginDesign;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UI_READ_ONLY_TOGGLE_REASON = "ui_read_only_toggle_reason";
  @SerializedName(SERIALIZED_NAME_UI_READ_ONLY_TOGGLE_REASON)
  private String uiReadOnlyToggleReason;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_USER_SEAT_EXPIRATION_INACTIVE_TIME = "user_seat_expiration_inactive_time";
  @SerializedName(SERIALIZED_NAME_USER_SEAT_EXPIRATION_INACTIVE_TIME)
  private String userSeatExpirationInactiveTime;

  public AccessSchemasOrganizations() {
  }

  public AccessSchemasOrganizations(
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public AccessSchemasOrganizations authDomain(String authDomain) {
    this.authDomain = authDomain;
    return this;
  }

   /**
   * The unique subdomain assigned to your Zero Trust organization.
   * @return authDomain
  **/
  @javax.annotation.Nullable
  public String getAuthDomain() {
    return authDomain;
  }

  public void setAuthDomain(String authDomain) {
    this.authDomain = authDomain;
  }


   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  public AccessSchemasOrganizations isUiReadOnly(Boolean isUiReadOnly) {
    this.isUiReadOnly = isUiReadOnly;
    return this;
  }

   /**
   * Lock all settings as Read-Only in the Dashboard, regardless of user permission. Updates may only be made via the API or Terraform for this account when enabled.
   * @return isUiReadOnly
  **/
  @javax.annotation.Nullable
  public Boolean getIsUiReadOnly() {
    return isUiReadOnly;
  }

  public void setIsUiReadOnly(Boolean isUiReadOnly) {
    this.isUiReadOnly = isUiReadOnly;
  }


  public AccessSchemasOrganizations loginDesign(AccessLoginDesign loginDesign) {
    this.loginDesign = loginDesign;
    return this;
  }

   /**
   * Get loginDesign
   * @return loginDesign
  **/
  @javax.annotation.Nullable
  public AccessLoginDesign getLoginDesign() {
    return loginDesign;
  }

  public void setLoginDesign(AccessLoginDesign loginDesign) {
    this.loginDesign = loginDesign;
  }


  public AccessSchemasOrganizations name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of your Zero Trust organization.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccessSchemasOrganizations uiReadOnlyToggleReason(String uiReadOnlyToggleReason) {
    this.uiReadOnlyToggleReason = uiReadOnlyToggleReason;
    return this;
  }

   /**
   * A description of the reason why the UI read only field is being toggled.
   * @return uiReadOnlyToggleReason
  **/
  @javax.annotation.Nullable
  public String getUiReadOnlyToggleReason() {
    return uiReadOnlyToggleReason;
  }

  public void setUiReadOnlyToggleReason(String uiReadOnlyToggleReason) {
    this.uiReadOnlyToggleReason = uiReadOnlyToggleReason;
  }


   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }



  public AccessSchemasOrganizations userSeatExpirationInactiveTime(String userSeatExpirationInactiveTime) {
    this.userSeatExpirationInactiveTime = userSeatExpirationInactiveTime;
    return this;
  }

   /**
   * The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format &#x60;300ms&#x60; or &#x60;2h45m&#x60;. Valid time units are: &#x60;ns&#x60;, &#x60;us&#x60; (or &#x60;µs&#x60;), &#x60;ms&#x60;, &#x60;s&#x60;, &#x60;m&#x60;, &#x60;h&#x60;.
   * @return userSeatExpirationInactiveTime
  **/
  @javax.annotation.Nullable
  public String getUserSeatExpirationInactiveTime() {
    return userSeatExpirationInactiveTime;
  }

  public void setUserSeatExpirationInactiveTime(String userSeatExpirationInactiveTime) {
    this.userSeatExpirationInactiveTime = userSeatExpirationInactiveTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessSchemasOrganizations accessSchemasOrganizations = (AccessSchemasOrganizations) o;
    return Objects.equals(this.authDomain, accessSchemasOrganizations.authDomain) &&
        Objects.equals(this.createdAt, accessSchemasOrganizations.createdAt) &&
        Objects.equals(this.isUiReadOnly, accessSchemasOrganizations.isUiReadOnly) &&
        Objects.equals(this.loginDesign, accessSchemasOrganizations.loginDesign) &&
        Objects.equals(this.name, accessSchemasOrganizations.name) &&
        Objects.equals(this.uiReadOnlyToggleReason, accessSchemasOrganizations.uiReadOnlyToggleReason) &&
        Objects.equals(this.updatedAt, accessSchemasOrganizations.updatedAt) &&
        Objects.equals(this.userSeatExpirationInactiveTime, accessSchemasOrganizations.userSeatExpirationInactiveTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authDomain, createdAt, isUiReadOnly, loginDesign, name, uiReadOnlyToggleReason, updatedAt, userSeatExpirationInactiveTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessSchemasOrganizations {\n");
    sb.append("    authDomain: ").append(toIndentedString(authDomain)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    isUiReadOnly: ").append(toIndentedString(isUiReadOnly)).append("\n");
    sb.append("    loginDesign: ").append(toIndentedString(loginDesign)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uiReadOnlyToggleReason: ").append(toIndentedString(uiReadOnlyToggleReason)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    userSeatExpirationInactiveTime: ").append(toIndentedString(userSeatExpirationInactiveTime)).append("\n");
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
    openapiFields.add("auth_domain");
    openapiFields.add("created_at");
    openapiFields.add("is_ui_read_only");
    openapiFields.add("login_design");
    openapiFields.add("name");
    openapiFields.add("ui_read_only_toggle_reason");
    openapiFields.add("updated_at");
    openapiFields.add("user_seat_expiration_inactive_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessSchemasOrganizations
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessSchemasOrganizations.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessSchemasOrganizations is not found in the empty JSON string", AccessSchemasOrganizations.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessSchemasOrganizations.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessSchemasOrganizations` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("auth_domain") != null && !jsonObj.get("auth_domain").isJsonNull()) && !jsonObj.get("auth_domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_domain").toString()));
      }
      // validate the optional field `login_design`
      if (jsonObj.get("login_design") != null && !jsonObj.get("login_design").isJsonNull()) {
        AccessLoginDesign.validateJsonElement(jsonObj.get("login_design"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("ui_read_only_toggle_reason") != null && !jsonObj.get("ui_read_only_toggle_reason").isJsonNull()) && !jsonObj.get("ui_read_only_toggle_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ui_read_only_toggle_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ui_read_only_toggle_reason").toString()));
      }
      if ((jsonObj.get("user_seat_expiration_inactive_time") != null && !jsonObj.get("user_seat_expiration_inactive_time").isJsonNull()) && !jsonObj.get("user_seat_expiration_inactive_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_seat_expiration_inactive_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_seat_expiration_inactive_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessSchemasOrganizations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessSchemasOrganizations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessSchemasOrganizations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessSchemasOrganizations.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessSchemasOrganizations>() {
           @Override
           public void write(JsonWriter out, AccessSchemasOrganizations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessSchemasOrganizations read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessSchemasOrganizations given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessSchemasOrganizations
  * @throws IOException if the JSON string is invalid with respect to AccessSchemasOrganizations
  */
  public static AccessSchemasOrganizations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessSchemasOrganizations.class);
  }

 /**
  * Convert an instance of AccessSchemasOrganizations to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

