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
 * TunnelVirtualNetwork
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TunnelVirtualNetwork {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Object createdAt = null;

  public static final String SERIALIZED_NAME_DELETED_AT = "deleted_at";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private Object deletedAt = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_DEFAULT_NETWORK = "is_default_network";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT_NETWORK)
  private Boolean isDefaultNetwork;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public TunnelVirtualNetwork() {
  }

  public TunnelVirtualNetwork(
     String id
  ) {
    this();
    this.id = id;
  }

  public TunnelVirtualNetwork comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Optional remark describing the virtual network.
   * @return comment
  **/
  @javax.annotation.Nonnull
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public TunnelVirtualNetwork createdAt(Object createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when the virtual network was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public Object getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Object createdAt) {
    this.createdAt = createdAt;
  }


  public TunnelVirtualNetwork deletedAt(Object deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Timestamp of when the virtual network was deleted. If &#x60;null&#x60;, the virtual network has not been deleted.
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  public Object getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(Object deletedAt) {
    this.deletedAt = deletedAt;
  }


   /**
   * UUID of the virtual network.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }



  public TunnelVirtualNetwork isDefaultNetwork(Boolean isDefaultNetwork) {
    this.isDefaultNetwork = isDefaultNetwork;
    return this;
  }

   /**
   * If &#x60;true&#x60;, this virtual network is the default for the account.
   * @return isDefaultNetwork
  **/
  @javax.annotation.Nonnull
  public Boolean getIsDefaultNetwork() {
    return isDefaultNetwork;
  }

  public void setIsDefaultNetwork(Boolean isDefaultNetwork) {
    this.isDefaultNetwork = isDefaultNetwork;
  }


  public TunnelVirtualNetwork name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A user-friendly name for the virtual network.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TunnelVirtualNetwork tunnelVirtualNetwork = (TunnelVirtualNetwork) o;
    return Objects.equals(this.comment, tunnelVirtualNetwork.comment) &&
        Objects.equals(this.createdAt, tunnelVirtualNetwork.createdAt) &&
        Objects.equals(this.deletedAt, tunnelVirtualNetwork.deletedAt) &&
        Objects.equals(this.id, tunnelVirtualNetwork.id) &&
        Objects.equals(this.isDefaultNetwork, tunnelVirtualNetwork.isDefaultNetwork) &&
        Objects.equals(this.name, tunnelVirtualNetwork.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, createdAt, deletedAt, id, isDefaultNetwork, name);
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
    sb.append("class TunnelVirtualNetwork {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefaultNetwork: ").append(toIndentedString(isDefaultNetwork)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("created_at");
    openapiFields.add("deleted_at");
    openapiFields.add("id");
    openapiFields.add("is_default_network");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("comment");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("is_default_network");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TunnelVirtualNetwork
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TunnelVirtualNetwork.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TunnelVirtualNetwork is not found in the empty JSON string", TunnelVirtualNetwork.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TunnelVirtualNetwork.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TunnelVirtualNetwork` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TunnelVirtualNetwork.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TunnelVirtualNetwork.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TunnelVirtualNetwork' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TunnelVirtualNetwork> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TunnelVirtualNetwork.class));

       return (TypeAdapter<T>) new TypeAdapter<TunnelVirtualNetwork>() {
           @Override
           public void write(JsonWriter out, TunnelVirtualNetwork value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TunnelVirtualNetwork read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TunnelVirtualNetwork given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TunnelVirtualNetwork
  * @throws IOException if the JSON string is invalid with respect to TunnelVirtualNetwork
  */
  public static TunnelVirtualNetwork fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TunnelVirtualNetwork.class);
  }

 /**
  * Convert an instance of TunnelVirtualNetwork to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

