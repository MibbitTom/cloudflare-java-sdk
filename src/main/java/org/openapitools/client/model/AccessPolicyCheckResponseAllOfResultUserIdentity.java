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
import org.openapitools.client.model.AccessPolicyCheckResponseAllOfResultUserIdentityGeo;

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
 * AccessPolicyCheckResponseAllOfResultUserIdentity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessPolicyCheckResponseAllOfResultUserIdentity {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_DEVICE_SESSIONS = "device_sessions";
  @SerializedName(SERIALIZED_NAME_DEVICE_SESSIONS)
  private Object deviceSessions;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_GEO = "geo";
  @SerializedName(SERIALIZED_NAME_GEO)
  private AccessPolicyCheckResponseAllOfResultUserIdentityGeo geo;

  public static final String SERIALIZED_NAME_IAT = "iat";
  @SerializedName(SERIALIZED_NAME_IAT)
  private Integer iat;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_GATEWAY = "is_gateway";
  @SerializedName(SERIALIZED_NAME_IS_GATEWAY)
  private Boolean isGateway;

  public static final String SERIALIZED_NAME_IS_WARP = "is_warp";
  @SerializedName(SERIALIZED_NAME_IS_WARP)
  private Boolean isWarp;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USER_UUID = "user_uuid";
  @SerializedName(SERIALIZED_NAME_USER_UUID)
  private String userUuid;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public AccessPolicyCheckResponseAllOfResultUserIdentity() {
  }

  public AccessPolicyCheckResponseAllOfResultUserIdentity(
     String userUuid
  ) {
    this();
    this.userUuid = userUuid;
  }

  public AccessPolicyCheckResponseAllOfResultUserIdentity accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AccessPolicyCheckResponseAllOfResultUserIdentity deviceSessions(Object deviceSessions) {
    this.deviceSessions = deviceSessions;
    return this;
  }

   /**
   * Get deviceSessions
   * @return deviceSessions
  **/
  @javax.annotation.Nullable
  public Object getDeviceSessions() {
    return deviceSessions;
  }

  public void setDeviceSessions(Object deviceSessions) {
    this.deviceSessions = deviceSessions;
  }


  public AccessPolicyCheckResponseAllOfResultUserIdentity email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public AccessPolicyCheckResponseAllOfResultUserIdentity geo(AccessPolicyCheckResponseAllOfResultUserIdentityGeo geo) {
    this.geo = geo;
    return this;
  }

   /**
   * Get geo
   * @return geo
  **/
  @javax.annotation.Nullable
  public AccessPolicyCheckResponseAllOfResultUserIdentityGeo getGeo() {
    return geo;
  }

  public void setGeo(AccessPolicyCheckResponseAllOfResultUserIdentityGeo geo) {
    this.geo = geo;
  }


  public AccessPolicyCheckResponseAllOfResultUserIdentity iat(Integer iat) {
    this.iat = iat;
    return this;
  }

   /**
   * Get iat
   * @return iat
  **/
  @javax.annotation.Nullable
  public Integer getIat() {
    return iat;
  }

  public void setIat(Integer iat) {
    this.iat = iat;
  }


  public AccessPolicyCheckResponseAllOfResultUserIdentity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public AccessPolicyCheckResponseAllOfResultUserIdentity isGateway(Boolean isGateway) {
    this.isGateway = isGateway;
    return this;
  }

   /**
   * Get isGateway
   * @return isGateway
  **/
  @javax.annotation.Nullable
  public Boolean getIsGateway() {
    return isGateway;
  }

  public void setIsGateway(Boolean isGateway) {
    this.isGateway = isGateway;
  }


  public AccessPolicyCheckResponseAllOfResultUserIdentity isWarp(Boolean isWarp) {
    this.isWarp = isWarp;
    return this;
  }

   /**
   * Get isWarp
   * @return isWarp
  **/
  @javax.annotation.Nullable
  public Boolean getIsWarp() {
    return isWarp;
  }

  public void setIsWarp(Boolean isWarp) {
    this.isWarp = isWarp;
  }


  public AccessPolicyCheckResponseAllOfResultUserIdentity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
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
   * UUID
   * @return userUuid
  **/
  @javax.annotation.Nullable
  public String getUserUuid() {
    return userUuid;
  }



  public AccessPolicyCheckResponseAllOfResultUserIdentity version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessPolicyCheckResponseAllOfResultUserIdentity accessPolicyCheckResponseAllOfResultUserIdentity = (AccessPolicyCheckResponseAllOfResultUserIdentity) o;
    return Objects.equals(this.accountId, accessPolicyCheckResponseAllOfResultUserIdentity.accountId) &&
        Objects.equals(this.deviceSessions, accessPolicyCheckResponseAllOfResultUserIdentity.deviceSessions) &&
        Objects.equals(this.email, accessPolicyCheckResponseAllOfResultUserIdentity.email) &&
        Objects.equals(this.geo, accessPolicyCheckResponseAllOfResultUserIdentity.geo) &&
        Objects.equals(this.iat, accessPolicyCheckResponseAllOfResultUserIdentity.iat) &&
        Objects.equals(this.id, accessPolicyCheckResponseAllOfResultUserIdentity.id) &&
        Objects.equals(this.isGateway, accessPolicyCheckResponseAllOfResultUserIdentity.isGateway) &&
        Objects.equals(this.isWarp, accessPolicyCheckResponseAllOfResultUserIdentity.isWarp) &&
        Objects.equals(this.name, accessPolicyCheckResponseAllOfResultUserIdentity.name) &&
        Objects.equals(this.userUuid, accessPolicyCheckResponseAllOfResultUserIdentity.userUuid) &&
        Objects.equals(this.version, accessPolicyCheckResponseAllOfResultUserIdentity.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, deviceSessions, email, geo, iat, id, isGateway, isWarp, name, userUuid, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessPolicyCheckResponseAllOfResultUserIdentity {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    deviceSessions: ").append(toIndentedString(deviceSessions)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isGateway: ").append(toIndentedString(isGateway)).append("\n");
    sb.append("    isWarp: ").append(toIndentedString(isWarp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("device_sessions");
    openapiFields.add("email");
    openapiFields.add("geo");
    openapiFields.add("iat");
    openapiFields.add("id");
    openapiFields.add("is_gateway");
    openapiFields.add("is_warp");
    openapiFields.add("name");
    openapiFields.add("user_uuid");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessPolicyCheckResponseAllOfResultUserIdentity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessPolicyCheckResponseAllOfResultUserIdentity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessPolicyCheckResponseAllOfResultUserIdentity is not found in the empty JSON string", AccessPolicyCheckResponseAllOfResultUserIdentity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessPolicyCheckResponseAllOfResultUserIdentity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessPolicyCheckResponseAllOfResultUserIdentity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonNull()) && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the optional field `geo`
      if (jsonObj.get("geo") != null && !jsonObj.get("geo").isJsonNull()) {
        AccessPolicyCheckResponseAllOfResultUserIdentityGeo.validateJsonElement(jsonObj.get("geo"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("user_uuid") != null && !jsonObj.get("user_uuid").isJsonNull()) && !jsonObj.get("user_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessPolicyCheckResponseAllOfResultUserIdentity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessPolicyCheckResponseAllOfResultUserIdentity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessPolicyCheckResponseAllOfResultUserIdentity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessPolicyCheckResponseAllOfResultUserIdentity.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessPolicyCheckResponseAllOfResultUserIdentity>() {
           @Override
           public void write(JsonWriter out, AccessPolicyCheckResponseAllOfResultUserIdentity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessPolicyCheckResponseAllOfResultUserIdentity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessPolicyCheckResponseAllOfResultUserIdentity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessPolicyCheckResponseAllOfResultUserIdentity
  * @throws IOException if the JSON string is invalid with respect to AccessPolicyCheckResponseAllOfResultUserIdentity
  */
  public static AccessPolicyCheckResponseAllOfResultUserIdentity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessPolicyCheckResponseAllOfResultUserIdentity.class);
  }

 /**
  * Convert an instance of AccessPolicyCheckResponseAllOfResultUserIdentity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

