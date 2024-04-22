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
import cloudflare.sdk.models.TlsCertificatesAndHostnamesKeylessTunnel;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesSchemasStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * TlsCertificatesAndHostnamesBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TlsCertificatesAndHostnamesBase {
  public static final String SERIALIZED_NAME_CREATED_ON = "created_on";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modified_on";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<Object> permissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private BigDecimal port = new BigDecimal("24008");

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TlsCertificatesAndHostnamesSchemasStatus status;

  public static final String SERIALIZED_NAME_TUNNEL = "tunnel";
  @SerializedName(SERIALIZED_NAME_TUNNEL)
  private TlsCertificatesAndHostnamesKeylessTunnel tunnel;

  public TlsCertificatesAndHostnamesBase() {
  }

  public TlsCertificatesAndHostnamesBase(
     OffsetDateTime createdOn, 
     Boolean enabled, 
     String id, 
     OffsetDateTime modifiedOn, 
     String name, 
     List<Object> permissions
  ) {
    this();
    this.createdOn = createdOn;
    this.enabled = enabled;
    this.id = id;
    this.modifiedOn = modifiedOn;
    this.name = name;
    this.permissions = permissions;
  }

   /**
   * When the Keyless SSL was created.
   * @return createdOn
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



   /**
   * Whether or not the Keyless SSL is on or off.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  public Boolean getEnabled() {
    return enabled;
  }



  public TlsCertificatesAndHostnamesBase host(String host) {
    this.host = host;
    return this;
  }

   /**
   * The keyless SSL name.
   * @return host
  **/
  @javax.annotation.Nonnull
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


   /**
   * Keyless certificate identifier tag.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }



   /**
   * When the Keyless SSL was last modified.
   * @return modifiedOn
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }



   /**
   * The keyless SSL name.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }



   /**
   * Available permissions for the Keyless SSL for the current user requesting the item.
   * @return permissions
  **/
  @javax.annotation.Nonnull
  public List<Object> getPermissions() {
    return permissions;
  }



  public TlsCertificatesAndHostnamesBase port(BigDecimal port) {
    this.port = port;
    return this;
  }

   /**
   * The keyless SSL port used to communicate between Cloudflare and the client&#39;s Keyless SSL server.
   * @return port
  **/
  @javax.annotation.Nonnull
  public BigDecimal getPort() {
    return port;
  }

  public void setPort(BigDecimal port) {
    this.port = port;
  }


  public TlsCertificatesAndHostnamesBase status(TlsCertificatesAndHostnamesSchemasStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public TlsCertificatesAndHostnamesSchemasStatus getStatus() {
    return status;
  }

  public void setStatus(TlsCertificatesAndHostnamesSchemasStatus status) {
    this.status = status;
  }


  public TlsCertificatesAndHostnamesBase tunnel(TlsCertificatesAndHostnamesKeylessTunnel tunnel) {
    this.tunnel = tunnel;
    return this;
  }

   /**
   * Get tunnel
   * @return tunnel
  **/
  @javax.annotation.Nullable
  public TlsCertificatesAndHostnamesKeylessTunnel getTunnel() {
    return tunnel;
  }

  public void setTunnel(TlsCertificatesAndHostnamesKeylessTunnel tunnel) {
    this.tunnel = tunnel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TlsCertificatesAndHostnamesBase tlsCertificatesAndHostnamesBase = (TlsCertificatesAndHostnamesBase) o;
    return Objects.equals(this.createdOn, tlsCertificatesAndHostnamesBase.createdOn) &&
        Objects.equals(this.enabled, tlsCertificatesAndHostnamesBase.enabled) &&
        Objects.equals(this.host, tlsCertificatesAndHostnamesBase.host) &&
        Objects.equals(this.id, tlsCertificatesAndHostnamesBase.id) &&
        Objects.equals(this.modifiedOn, tlsCertificatesAndHostnamesBase.modifiedOn) &&
        Objects.equals(this.name, tlsCertificatesAndHostnamesBase.name) &&
        Objects.equals(this.permissions, tlsCertificatesAndHostnamesBase.permissions) &&
        Objects.equals(this.port, tlsCertificatesAndHostnamesBase.port) &&
        Objects.equals(this.status, tlsCertificatesAndHostnamesBase.status) &&
        Objects.equals(this.tunnel, tlsCertificatesAndHostnamesBase.tunnel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, enabled, host, id, modifiedOn, name, permissions, port, status, tunnel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TlsCertificatesAndHostnamesBase {\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tunnel: ").append(toIndentedString(tunnel)).append("\n");
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
    openapiFields.add("created_on");
    openapiFields.add("enabled");
    openapiFields.add("host");
    openapiFields.add("id");
    openapiFields.add("modified_on");
    openapiFields.add("name");
    openapiFields.add("permissions");
    openapiFields.add("port");
    openapiFields.add("status");
    openapiFields.add("tunnel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created_on");
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("host");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("modified_on");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("permissions");
    openapiRequiredFields.add("port");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TlsCertificatesAndHostnamesBase
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TlsCertificatesAndHostnamesBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TlsCertificatesAndHostnamesBase is not found in the empty JSON string", TlsCertificatesAndHostnamesBase.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TlsCertificatesAndHostnamesBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TlsCertificatesAndHostnamesBase` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TlsCertificatesAndHostnamesBase.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("permissions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
      }
      // validate the required field `status`
      TlsCertificatesAndHostnamesSchemasStatus.validateJsonElement(jsonObj.get("status"));
      // validate the optional field `tunnel`
      if (jsonObj.get("tunnel") != null && !jsonObj.get("tunnel").isJsonNull()) {
        TlsCertificatesAndHostnamesKeylessTunnel.validateJsonElement(jsonObj.get("tunnel"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TlsCertificatesAndHostnamesBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TlsCertificatesAndHostnamesBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TlsCertificatesAndHostnamesBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TlsCertificatesAndHostnamesBase.class));

       return (TypeAdapter<T>) new TypeAdapter<TlsCertificatesAndHostnamesBase>() {
           @Override
           public void write(JsonWriter out, TlsCertificatesAndHostnamesBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TlsCertificatesAndHostnamesBase read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TlsCertificatesAndHostnamesBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TlsCertificatesAndHostnamesBase
  * @throws IOException if the JSON string is invalid with respect to TlsCertificatesAndHostnamesBase
  */
  public static TlsCertificatesAndHostnamesBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TlsCertificatesAndHostnamesBase.class);
  }

 /**
  * Convert an instance of TlsCertificatesAndHostnamesBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

