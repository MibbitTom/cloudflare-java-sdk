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
 * The configuration settings for enabling a System for Cross-Domain Identity Management (SCIM) with the identity provider.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessIdentityProviderScimConfig {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_GROUP_MEMBER_DEPROVISION = "group_member_deprovision";
  @SerializedName(SERIALIZED_NAME_GROUP_MEMBER_DEPROVISION)
  private Boolean groupMemberDeprovision;

  public static final String SERIALIZED_NAME_SEAT_DEPROVISION = "seat_deprovision";
  @SerializedName(SERIALIZED_NAME_SEAT_DEPROVISION)
  private Boolean seatDeprovision;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_USER_DEPROVISION = "user_deprovision";
  @SerializedName(SERIALIZED_NAME_USER_DEPROVISION)
  private Boolean userDeprovision;

  public AccessIdentityProviderScimConfig() {
  }

  public AccessIdentityProviderScimConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * A flag to enable or disable SCIM for the identity provider.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public AccessIdentityProviderScimConfig groupMemberDeprovision(Boolean groupMemberDeprovision) {
    this.groupMemberDeprovision = groupMemberDeprovision;
    return this;
  }

   /**
   * A flag to revoke a user&#39;s session in Access and force a reauthentication on the user&#39;s Gateway session when they have been added or removed from a group in the Identity Provider.
   * @return groupMemberDeprovision
  **/
  @javax.annotation.Nullable
  public Boolean getGroupMemberDeprovision() {
    return groupMemberDeprovision;
  }

  public void setGroupMemberDeprovision(Boolean groupMemberDeprovision) {
    this.groupMemberDeprovision = groupMemberDeprovision;
  }


  public AccessIdentityProviderScimConfig seatDeprovision(Boolean seatDeprovision) {
    this.seatDeprovision = seatDeprovision;
    return this;
  }

   /**
   * A flag to remove a user&#39;s seat in Zero Trust when they have been deprovisioned in the Identity Provider.  This cannot be enabled unless user_deprovision is also enabled.
   * @return seatDeprovision
  **/
  @javax.annotation.Nullable
  public Boolean getSeatDeprovision() {
    return seatDeprovision;
  }

  public void setSeatDeprovision(Boolean seatDeprovision) {
    this.seatDeprovision = seatDeprovision;
  }


  public AccessIdentityProviderScimConfig secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * A read-only token generated when the SCIM integration is enabled for the first time.  It is redacted on subsequent requests.  If you lose this you will need to refresh it token at /access/identity_providers/:idpID/refresh_scim_secret.
   * @return secret
  **/
  @javax.annotation.Nullable
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  public AccessIdentityProviderScimConfig userDeprovision(Boolean userDeprovision) {
    this.userDeprovision = userDeprovision;
    return this;
  }

   /**
   * A flag to enable revoking a user&#39;s session in Access and Gateway when they have been deprovisioned in the Identity Provider.
   * @return userDeprovision
  **/
  @javax.annotation.Nullable
  public Boolean getUserDeprovision() {
    return userDeprovision;
  }

  public void setUserDeprovision(Boolean userDeprovision) {
    this.userDeprovision = userDeprovision;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessIdentityProviderScimConfig accessIdentityProviderScimConfig = (AccessIdentityProviderScimConfig) o;
    return Objects.equals(this.enabled, accessIdentityProviderScimConfig.enabled) &&
        Objects.equals(this.groupMemberDeprovision, accessIdentityProviderScimConfig.groupMemberDeprovision) &&
        Objects.equals(this.seatDeprovision, accessIdentityProviderScimConfig.seatDeprovision) &&
        Objects.equals(this.secret, accessIdentityProviderScimConfig.secret) &&
        Objects.equals(this.userDeprovision, accessIdentityProviderScimConfig.userDeprovision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, groupMemberDeprovision, seatDeprovision, secret, userDeprovision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessIdentityProviderScimConfig {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    groupMemberDeprovision: ").append(toIndentedString(groupMemberDeprovision)).append("\n");
    sb.append("    seatDeprovision: ").append(toIndentedString(seatDeprovision)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    userDeprovision: ").append(toIndentedString(userDeprovision)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("group_member_deprovision");
    openapiFields.add("seat_deprovision");
    openapiFields.add("secret");
    openapiFields.add("user_deprovision");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessIdentityProviderScimConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessIdentityProviderScimConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessIdentityProviderScimConfig is not found in the empty JSON string", AccessIdentityProviderScimConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessIdentityProviderScimConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessIdentityProviderScimConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonNull()) && !jsonObj.get("secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessIdentityProviderScimConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessIdentityProviderScimConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessIdentityProviderScimConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessIdentityProviderScimConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessIdentityProviderScimConfig>() {
           @Override
           public void write(JsonWriter out, AccessIdentityProviderScimConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessIdentityProviderScimConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessIdentityProviderScimConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessIdentityProviderScimConfig
  * @throws IOException if the JSON string is invalid with respect to AccessIdentityProviderScimConfig
  */
  public static AccessIdentityProviderScimConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessIdentityProviderScimConfig.class);
  }

 /**
  * Convert an instance of AccessIdentityProviderScimConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

