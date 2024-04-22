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
import java.math.BigDecimal;
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

import invalidPackageName.JSON;

/**
 * AccessUsers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessUsers {
  public static final String SERIALIZED_NAME_ACCESS_SEAT = "access_seat";
  @SerializedName(SERIALIZED_NAME_ACCESS_SEAT)
  private Boolean accessSeat;

  public static final String SERIALIZED_NAME_ACTIVE_DEVICE_COUNT = "active_device_count";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DEVICE_COUNT)
  private BigDecimal activeDeviceCount;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_GATEWAY_SEAT = "gateway_seat";
  @SerializedName(SERIALIZED_NAME_GATEWAY_SEAT)
  private Boolean gatewaySeat;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_SUCCESSFUL_LOGIN = "last_successful_login";
  @SerializedName(SERIALIZED_NAME_LAST_SUCCESSFUL_LOGIN)
  private OffsetDateTime lastSuccessfulLogin;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SEAT_UID = "seat_uid";
  @SerializedName(SERIALIZED_NAME_SEAT_UID)
  private String seatUid;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public AccessUsers() {
  }

  public AccessUsers(
     OffsetDateTime createdAt, 
     String id, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.id = id;
    this.updatedAt = updatedAt;
  }

  public AccessUsers accessSeat(Boolean accessSeat) {
    this.accessSeat = accessSeat;
    return this;
  }

   /**
   * True if the user has authenticated with Cloudflare Access.
   * @return accessSeat
  **/
  @javax.annotation.Nullable
  public Boolean getAccessSeat() {
    return accessSeat;
  }

  public void setAccessSeat(Boolean accessSeat) {
    this.accessSeat = accessSeat;
  }


  public AccessUsers activeDeviceCount(BigDecimal activeDeviceCount) {
    this.activeDeviceCount = activeDeviceCount;
    return this;
  }

   /**
   * The number of active devices registered to the user.
   * @return activeDeviceCount
  **/
  @javax.annotation.Nullable
  public BigDecimal getActiveDeviceCount() {
    return activeDeviceCount;
  }

  public void setActiveDeviceCount(BigDecimal activeDeviceCount) {
    this.activeDeviceCount = activeDeviceCount;
  }


   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  public AccessUsers email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email of the user.
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public AccessUsers gatewaySeat(Boolean gatewaySeat) {
    this.gatewaySeat = gatewaySeat;
    return this;
  }

   /**
   * True if the user has logged into the WARP client.
   * @return gatewaySeat
  **/
  @javax.annotation.Nullable
  public Boolean getGatewaySeat() {
    return gatewaySeat;
  }

  public void setGatewaySeat(Boolean gatewaySeat) {
    this.gatewaySeat = gatewaySeat;
  }


   /**
   * UUID
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public AccessUsers lastSuccessfulLogin(OffsetDateTime lastSuccessfulLogin) {
    this.lastSuccessfulLogin = lastSuccessfulLogin;
    return this;
  }

   /**
   * The time at which the user last successfully logged in.
   * @return lastSuccessfulLogin
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastSuccessfulLogin() {
    return lastSuccessfulLogin;
  }

  public void setLastSuccessfulLogin(OffsetDateTime lastSuccessfulLogin) {
    this.lastSuccessfulLogin = lastSuccessfulLogin;
  }


  public AccessUsers name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the user.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccessUsers seatUid(String seatUid) {
    this.seatUid = seatUid;
    return this;
  }

   /**
   * The unique API identifier for the Zero Trust seat.
   * @return seatUid
  **/
  @javax.annotation.Nullable
  public String getSeatUid() {
    return seatUid;
  }

  public void setSeatUid(String seatUid) {
    this.seatUid = seatUid;
  }


  public AccessUsers uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * The unique API identifier for the user.
   * @return uid
  **/
  @javax.annotation.Nullable
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
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
    AccessUsers accessUsers = (AccessUsers) o;
    return Objects.equals(this.accessSeat, accessUsers.accessSeat) &&
        Objects.equals(this.activeDeviceCount, accessUsers.activeDeviceCount) &&
        Objects.equals(this.createdAt, accessUsers.createdAt) &&
        Objects.equals(this.email, accessUsers.email) &&
        Objects.equals(this.gatewaySeat, accessUsers.gatewaySeat) &&
        Objects.equals(this.id, accessUsers.id) &&
        Objects.equals(this.lastSuccessfulLogin, accessUsers.lastSuccessfulLogin) &&
        Objects.equals(this.name, accessUsers.name) &&
        Objects.equals(this.seatUid, accessUsers.seatUid) &&
        Objects.equals(this.uid, accessUsers.uid) &&
        Objects.equals(this.updatedAt, accessUsers.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessSeat, activeDeviceCount, createdAt, email, gatewaySeat, id, lastSuccessfulLogin, name, seatUid, uid, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessUsers {\n");
    sb.append("    accessSeat: ").append(toIndentedString(accessSeat)).append("\n");
    sb.append("    activeDeviceCount: ").append(toIndentedString(activeDeviceCount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    gatewaySeat: ").append(toIndentedString(gatewaySeat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastSuccessfulLogin: ").append(toIndentedString(lastSuccessfulLogin)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seatUid: ").append(toIndentedString(seatUid)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
    openapiFields.add("access_seat");
    openapiFields.add("active_device_count");
    openapiFields.add("created_at");
    openapiFields.add("email");
    openapiFields.add("gateway_seat");
    openapiFields.add("id");
    openapiFields.add("last_successful_login");
    openapiFields.add("name");
    openapiFields.add("seat_uid");
    openapiFields.add("uid");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessUsers
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessUsers.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessUsers is not found in the empty JSON string", AccessUsers.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessUsers.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessUsers` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("seat_uid") != null && !jsonObj.get("seat_uid").isJsonNull()) && !jsonObj.get("seat_uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seat_uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seat_uid").toString()));
      }
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessUsers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessUsers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessUsers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessUsers.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessUsers>() {
           @Override
           public void write(JsonWriter out, AccessUsers value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessUsers read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessUsers given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessUsers
  * @throws IOException if the JSON string is invalid with respect to AccessUsers
  */
  public static AccessUsers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessUsers.class);
  }

 /**
  * Convert an instance of AccessUsers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

