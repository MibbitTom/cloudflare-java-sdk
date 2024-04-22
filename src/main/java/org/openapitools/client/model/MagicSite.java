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
import org.openapitools.client.model.MagicSiteLocation;

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
 * MagicSite
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class MagicSite {
  public static final String SERIALIZED_NAME_CONNECTOR_ID = "connector_id";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_ID)
  private String connectorId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HA_MODE = "ha_mode";
  @SerializedName(SERIALIZED_NAME_HA_MODE)
  private Boolean haMode;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private MagicSiteLocation location;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SECONDARY_CONNECTOR_ID = "secondary_connector_id";
  @SerializedName(SERIALIZED_NAME_SECONDARY_CONNECTOR_ID)
  private String secondaryConnectorId;

  public MagicSite() {
  }

  public MagicSite(
     String id
  ) {
    this();
    this.id = id;
  }

  public MagicSite connectorId(String connectorId) {
    this.connectorId = connectorId;
    return this;
  }

   /**
   * Magic WAN Connector identifier tag.
   * @return connectorId
  **/
  @javax.annotation.Nullable
  public String getConnectorId() {
    return connectorId;
  }

  public void setConnectorId(String connectorId) {
    this.connectorId = connectorId;
  }


  public MagicSite description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public MagicSite haMode(Boolean haMode) {
    this.haMode = haMode;
    return this;
  }

   /**
   * Site high availability mode. If set to true, the site can have two connectors and runs in high availability mode.
   * @return haMode
  **/
  @javax.annotation.Nullable
  public Boolean getHaMode() {
    return haMode;
  }

  public void setHaMode(Boolean haMode) {
    this.haMode = haMode;
  }


   /**
   * Identifier
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public MagicSite location(MagicSiteLocation location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  public MagicSiteLocation getLocation() {
    return location;
  }

  public void setLocation(MagicSiteLocation location) {
    this.location = location;
  }


  public MagicSite name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the site.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public MagicSite secondaryConnectorId(String secondaryConnectorId) {
    this.secondaryConnectorId = secondaryConnectorId;
    return this;
  }

   /**
   * Magic WAN Connector identifier tag. Used when high availability mode is on.
   * @return secondaryConnectorId
  **/
  @javax.annotation.Nullable
  public String getSecondaryConnectorId() {
    return secondaryConnectorId;
  }

  public void setSecondaryConnectorId(String secondaryConnectorId) {
    this.secondaryConnectorId = secondaryConnectorId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagicSite magicSite = (MagicSite) o;
    return Objects.equals(this.connectorId, magicSite.connectorId) &&
        Objects.equals(this.description, magicSite.description) &&
        Objects.equals(this.haMode, magicSite.haMode) &&
        Objects.equals(this.id, magicSite.id) &&
        Objects.equals(this.location, magicSite.location) &&
        Objects.equals(this.name, magicSite.name) &&
        Objects.equals(this.secondaryConnectorId, magicSite.secondaryConnectorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectorId, description, haMode, id, location, name, secondaryConnectorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicSite {\n");
    sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondaryConnectorId: ").append(toIndentedString(secondaryConnectorId)).append("\n");
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
    openapiFields.add("connector_id");
    openapiFields.add("description");
    openapiFields.add("ha_mode");
    openapiFields.add("id");
    openapiFields.add("location");
    openapiFields.add("name");
    openapiFields.add("secondary_connector_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MagicSite
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MagicSite.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MagicSite is not found in the empty JSON string", MagicSite.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MagicSite.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MagicSite` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("connector_id") != null && !jsonObj.get("connector_id").isJsonNull()) && !jsonObj.get("connector_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connector_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connector_id").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        MagicSiteLocation.validateJsonElement(jsonObj.get("location"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("secondary_connector_id") != null && !jsonObj.get("secondary_connector_id").isJsonNull()) && !jsonObj.get("secondary_connector_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondary_connector_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondary_connector_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MagicSite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MagicSite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MagicSite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MagicSite.class));

       return (TypeAdapter<T>) new TypeAdapter<MagicSite>() {
           @Override
           public void write(JsonWriter out, MagicSite value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MagicSite read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MagicSite given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MagicSite
  * @throws IOException if the JSON string is invalid with respect to MagicSite
  */
  public static MagicSite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MagicSite.class);
  }

 /**
  * Convert an instance of MagicSite to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
