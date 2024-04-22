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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * AddressingAddressMaps
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AddressingAddressMaps {
  public static final String SERIALIZED_NAME_CAN_DELETE = "can_delete";
  @SerializedName(SERIALIZED_NAME_CAN_DELETE)
  private Boolean canDelete;

  public static final String SERIALIZED_NAME_CAN_MODIFY_IPS = "can_modify_ips";
  @SerializedName(SERIALIZED_NAME_CAN_MODIFY_IPS)
  private Boolean canModifyIps;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DEFAULT_SNI = "default_sni";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SNI)
  private String defaultSni;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = false;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MODIFIED_AT = "modified_at";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT)
  private OffsetDateTime modifiedAt;

  public AddressingAddressMaps() {
  }

  public AddressingAddressMaps(
     Boolean canDelete, 
     Boolean canModifyIps, 
     OffsetDateTime createdAt, 
     String id, 
     OffsetDateTime modifiedAt
  ) {
    this();
    this.canDelete = canDelete;
    this.canModifyIps = canModifyIps;
    this.createdAt = createdAt;
    this.id = id;
    this.modifiedAt = modifiedAt;
  }

   /**
   * If set to false, then the Address Map cannot be deleted via API. This is true for Cloudflare-managed maps.
   * @return canDelete
  **/
  @javax.annotation.Nullable
  public Boolean getCanDelete() {
    return canDelete;
  }



   /**
   * If set to false, then the IPs on the Address Map cannot be modified via the API. This is true for Cloudflare-managed maps.
   * @return canModifyIps
  **/
  @javax.annotation.Nullable
  public Boolean getCanModifyIps() {
    return canModifyIps;
  }



   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  public AddressingAddressMaps defaultSni(String defaultSni) {
    this.defaultSni = defaultSni;
    return this;
  }

   /**
   * If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map. If Cloudflare receives a TLS handshake from a client without an SNI, it will respond with the default SNI on those IPs. The default SNI can be any valid zone or subdomain owned by the account.
   * @return defaultSni
  **/
  @javax.annotation.Nullable
  public String getDefaultSni() {
    return defaultSni;
  }

  public void setDefaultSni(String defaultSni) {
    this.defaultSni = defaultSni;
  }


  public AddressingAddressMaps description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An optional description field which may be used to describe the types of IPs or zones on the map.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public AddressingAddressMaps enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the Address Map is enabled or not. Cloudflare&#39;s DNS will not respond with IP addresses on an Address Map until the map is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


   /**
   * Identifier
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



   /**
   * Get modifiedAt
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressingAddressMaps addressingAddressMaps = (AddressingAddressMaps) o;
    return Objects.equals(this.canDelete, addressingAddressMaps.canDelete) &&
        Objects.equals(this.canModifyIps, addressingAddressMaps.canModifyIps) &&
        Objects.equals(this.createdAt, addressingAddressMaps.createdAt) &&
        Objects.equals(this.defaultSni, addressingAddressMaps.defaultSni) &&
        Objects.equals(this.description, addressingAddressMaps.description) &&
        Objects.equals(this.enabled, addressingAddressMaps.enabled) &&
        Objects.equals(this.id, addressingAddressMaps.id) &&
        Objects.equals(this.modifiedAt, addressingAddressMaps.modifiedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDelete, canModifyIps, createdAt, defaultSni, description, enabled, id, modifiedAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressingAddressMaps {\n");
    sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
    sb.append("    canModifyIps: ").append(toIndentedString(canModifyIps)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    defaultSni: ").append(toIndentedString(defaultSni)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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
    openapiFields.add("can_delete");
    openapiFields.add("can_modify_ips");
    openapiFields.add("created_at");
    openapiFields.add("default_sni");
    openapiFields.add("description");
    openapiFields.add("enabled");
    openapiFields.add("id");
    openapiFields.add("modified_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddressingAddressMaps
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddressingAddressMaps.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressingAddressMaps is not found in the empty JSON string", AddressingAddressMaps.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddressingAddressMaps.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddressingAddressMaps` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("default_sni") != null && !jsonObj.get("default_sni").isJsonNull()) && !jsonObj.get("default_sni").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_sni` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_sni").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressingAddressMaps.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressingAddressMaps' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressingAddressMaps> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressingAddressMaps.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressingAddressMaps>() {
           @Override
           public void write(JsonWriter out, AddressingAddressMaps value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressingAddressMaps read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddressingAddressMaps given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressingAddressMaps
  * @throws IOException if the JSON string is invalid with respect to AddressingAddressMaps
  */
  public static AddressingAddressMaps fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressingAddressMaps.class);
  }

 /**
  * Convert an instance of AddressingAddressMaps to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

