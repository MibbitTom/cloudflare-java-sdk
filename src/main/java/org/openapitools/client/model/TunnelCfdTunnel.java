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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.TunnelSchemasConnection;
import org.openapitools.client.model.TunnelTunnelType;
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

import invalidPackageName.JSON;

/**
 * A Cloudflare Tunnel that connects your origin to Cloudflare&#39;s edge.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TunnelCfdTunnel {
  public static final String SERIALIZED_NAME_ACCOUNT_TAG = "account_tag";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TAG)
  private String accountTag;

  public static final String SERIALIZED_NAME_CONNECTIONS = "connections";
  @SerializedName(SERIALIZED_NAME_CONNECTIONS)
  private List<TunnelSchemasConnection> connections = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONNS_ACTIVE_AT = "conns_active_at";
  @SerializedName(SERIALIZED_NAME_CONNS_ACTIVE_AT)
  private OffsetDateTime connsActiveAt;

  public static final String SERIALIZED_NAME_CONNS_INACTIVE_AT = "conns_inactive_at";
  @SerializedName(SERIALIZED_NAME_CONNS_INACTIVE_AT)
  private OffsetDateTime connsInactiveAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deleted_at";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private OffsetDateTime deletedAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REMOTE_CONFIG = "remote_config";
  @SerializedName(SERIALIZED_NAME_REMOTE_CONFIG)
  private Boolean remoteConfig;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TUN_TYPE = "tun_type";
  @SerializedName(SERIALIZED_NAME_TUN_TYPE)
  private TunnelTunnelType tunType;

  public TunnelCfdTunnel() {
  }

  public TunnelCfdTunnel(
     String id
  ) {
    this();
    this.id = id;
  }

  public TunnelCfdTunnel accountTag(String accountTag) {
    this.accountTag = accountTag;
    return this;
  }

   /**
   * Cloudflare account ID
   * @return accountTag
  **/
  @javax.annotation.Nullable
  public String getAccountTag() {
    return accountTag;
  }

  public void setAccountTag(String accountTag) {
    this.accountTag = accountTag;
  }


  public TunnelCfdTunnel connections(List<TunnelSchemasConnection> connections) {
    this.connections = connections;
    return this;
  }

  public TunnelCfdTunnel addConnectionsItem(TunnelSchemasConnection connectionsItem) {
    if (this.connections == null) {
      this.connections = new ArrayList<>();
    }
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * The Cloudflare Tunnel connections between your origin and Cloudflare&#39;s edge.
   * @return connections
  **/
  @javax.annotation.Nullable
  public List<TunnelSchemasConnection> getConnections() {
    return connections;
  }

  public void setConnections(List<TunnelSchemasConnection> connections) {
    this.connections = connections;
  }


  public TunnelCfdTunnel connsActiveAt(OffsetDateTime connsActiveAt) {
    this.connsActiveAt = connsActiveAt;
    return this;
  }

   /**
   * Timestamp of when the tunnel established at least one connection to Cloudflare&#39;s edge. If &#x60;null&#x60;, the tunnel is inactive.
   * @return connsActiveAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getConnsActiveAt() {
    return connsActiveAt;
  }

  public void setConnsActiveAt(OffsetDateTime connsActiveAt) {
    this.connsActiveAt = connsActiveAt;
  }


  public TunnelCfdTunnel connsInactiveAt(OffsetDateTime connsInactiveAt) {
    this.connsInactiveAt = connsInactiveAt;
    return this;
  }

   /**
   * Timestamp of when the tunnel became inactive (no connections to Cloudflare&#39;s edge). If &#x60;null&#x60;, the tunnel is active.
   * @return connsInactiveAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getConnsInactiveAt() {
    return connsInactiveAt;
  }

  public void setConnsInactiveAt(OffsetDateTime connsInactiveAt) {
    this.connsInactiveAt = connsInactiveAt;
  }


  public TunnelCfdTunnel createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when the tunnel was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public TunnelCfdTunnel deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Timestamp of when the tunnel was deleted. If &#x60;null&#x60;, the tunnel has not been deleted.
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }


   /**
   * UUID of the tunnel.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public TunnelCfdTunnel metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Metadata associated with the tunnel.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public TunnelCfdTunnel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A user-friendly name for the tunnel.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TunnelCfdTunnel remoteConfig(Boolean remoteConfig) {
    this.remoteConfig = remoteConfig;
    return this;
  }

   /**
   * If &#x60;true&#x60;, the tunnel can be configured remotely from the Zero Trust dashboard. If &#x60;false&#x60;, the tunnel must be configured locally on the origin machine.
   * @return remoteConfig
  **/
  @javax.annotation.Nullable
  public Boolean getRemoteConfig() {
    return remoteConfig;
  }

  public void setRemoteConfig(Boolean remoteConfig) {
    this.remoteConfig = remoteConfig;
  }


  public TunnelCfdTunnel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the tunnel. Valid values are &#x60;inactive&#x60; (tunnel has never been run), &#x60;degraded&#x60; (tunnel is active and able to serve traffic but in an unhealthy state), &#x60;healthy&#x60; (tunnel is active and able to serve traffic), or &#x60;down&#x60; (tunnel can not serve traffic as it has no connections to the Cloudflare Edge).
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public TunnelCfdTunnel tunType(TunnelTunnelType tunType) {
    this.tunType = tunType;
    return this;
  }

   /**
   * Get tunType
   * @return tunType
  **/
  @javax.annotation.Nullable
  public TunnelTunnelType getTunType() {
    return tunType;
  }

  public void setTunType(TunnelTunnelType tunType) {
    this.tunType = tunType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TunnelCfdTunnel tunnelCfdTunnel = (TunnelCfdTunnel) o;
    return Objects.equals(this.accountTag, tunnelCfdTunnel.accountTag) &&
        Objects.equals(this.connections, tunnelCfdTunnel.connections) &&
        Objects.equals(this.connsActiveAt, tunnelCfdTunnel.connsActiveAt) &&
        Objects.equals(this.connsInactiveAt, tunnelCfdTunnel.connsInactiveAt) &&
        Objects.equals(this.createdAt, tunnelCfdTunnel.createdAt) &&
        Objects.equals(this.deletedAt, tunnelCfdTunnel.deletedAt) &&
        Objects.equals(this.id, tunnelCfdTunnel.id) &&
        Objects.equals(this.metadata, tunnelCfdTunnel.metadata) &&
        Objects.equals(this.name, tunnelCfdTunnel.name) &&
        Objects.equals(this.remoteConfig, tunnelCfdTunnel.remoteConfig) &&
        Objects.equals(this.status, tunnelCfdTunnel.status) &&
        Objects.equals(this.tunType, tunnelCfdTunnel.tunType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountTag, connections, connsActiveAt, connsInactiveAt, createdAt, deletedAt, id, metadata, name, remoteConfig, status, tunType);
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
    sb.append("class TunnelCfdTunnel {\n");
    sb.append("    accountTag: ").append(toIndentedString(accountTag)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    connsActiveAt: ").append(toIndentedString(connsActiveAt)).append("\n");
    sb.append("    connsInactiveAt: ").append(toIndentedString(connsInactiveAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remoteConfig: ").append(toIndentedString(remoteConfig)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tunType: ").append(toIndentedString(tunType)).append("\n");
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
    openapiFields.add("account_tag");
    openapiFields.add("connections");
    openapiFields.add("conns_active_at");
    openapiFields.add("conns_inactive_at");
    openapiFields.add("created_at");
    openapiFields.add("deleted_at");
    openapiFields.add("id");
    openapiFields.add("metadata");
    openapiFields.add("name");
    openapiFields.add("remote_config");
    openapiFields.add("status");
    openapiFields.add("tun_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TunnelCfdTunnel
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TunnelCfdTunnel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TunnelCfdTunnel is not found in the empty JSON string", TunnelCfdTunnel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TunnelCfdTunnel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TunnelCfdTunnel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_tag") != null && !jsonObj.get("account_tag").isJsonNull()) && !jsonObj.get("account_tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_tag").toString()));
      }
      if (jsonObj.get("connections") != null && !jsonObj.get("connections").isJsonNull()) {
        JsonArray jsonArrayconnections = jsonObj.getAsJsonArray("connections");
        if (jsonArrayconnections != null) {
          // ensure the json data is an array
          if (!jsonObj.get("connections").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `connections` to be an array in the JSON string but got `%s`", jsonObj.get("connections").toString()));
          }

          // validate the optional field `connections` (array)
          for (int i = 0; i < jsonArrayconnections.size(); i++) {
            TunnelSchemasConnection.validateJsonElement(jsonArrayconnections.get(i));
          };
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `tun_type`
      if (jsonObj.get("tun_type") != null && !jsonObj.get("tun_type").isJsonNull()) {
        TunnelTunnelType.validateJsonElement(jsonObj.get("tun_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TunnelCfdTunnel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TunnelCfdTunnel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TunnelCfdTunnel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TunnelCfdTunnel.class));

       return (TypeAdapter<T>) new TypeAdapter<TunnelCfdTunnel>() {
           @Override
           public void write(JsonWriter out, TunnelCfdTunnel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TunnelCfdTunnel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TunnelCfdTunnel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TunnelCfdTunnel
  * @throws IOException if the JSON string is invalid with respect to TunnelCfdTunnel
  */
  public static TunnelCfdTunnel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TunnelCfdTunnel.class);
  }

 /**
  * Convert an instance of TunnelCfdTunnel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

