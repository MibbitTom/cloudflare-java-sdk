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
 * TlsCertificatesAndHostnamesSettingObjectDelete
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TlsCertificatesAndHostnamesSettingObjectDelete {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Object status = null;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;

  public TlsCertificatesAndHostnamesSettingObjectDelete() {
  }

  public TlsCertificatesAndHostnamesSettingObjectDelete createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * This is the time the tls setting was originally created for this hostname.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public TlsCertificatesAndHostnamesSettingObjectDelete hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * The hostname for which the tls settings are set.
   * @return hostname
  **/
  @javax.annotation.Nullable
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public TlsCertificatesAndHostnamesSettingObjectDelete status(Object status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Object getStatus() {
    return status;
  }

  public void setStatus(Object status) {
    this.status = status;
  }


  public TlsCertificatesAndHostnamesSettingObjectDelete updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * This is the time the tls setting was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public TlsCertificatesAndHostnamesSettingObjectDelete value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TlsCertificatesAndHostnamesSettingObjectDelete tlsCertificatesAndHostnamesSettingObjectDelete = (TlsCertificatesAndHostnamesSettingObjectDelete) o;
    return Objects.equals(this.createdAt, tlsCertificatesAndHostnamesSettingObjectDelete.createdAt) &&
        Objects.equals(this.hostname, tlsCertificatesAndHostnamesSettingObjectDelete.hostname) &&
        Objects.equals(this.status, tlsCertificatesAndHostnamesSettingObjectDelete.status) &&
        Objects.equals(this.updatedAt, tlsCertificatesAndHostnamesSettingObjectDelete.updatedAt) &&
        Objects.equals(this.value, tlsCertificatesAndHostnamesSettingObjectDelete.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, hostname, status, updatedAt, value);
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
    sb.append("class TlsCertificatesAndHostnamesSettingObjectDelete {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("hostname");
    openapiFields.add("status");
    openapiFields.add("updated_at");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TlsCertificatesAndHostnamesSettingObjectDelete
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TlsCertificatesAndHostnamesSettingObjectDelete.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TlsCertificatesAndHostnamesSettingObjectDelete is not found in the empty JSON string", TlsCertificatesAndHostnamesSettingObjectDelete.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TlsCertificatesAndHostnamesSettingObjectDelete.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TlsCertificatesAndHostnamesSettingObjectDelete` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TlsCertificatesAndHostnamesSettingObjectDelete.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TlsCertificatesAndHostnamesSettingObjectDelete' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TlsCertificatesAndHostnamesSettingObjectDelete> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TlsCertificatesAndHostnamesSettingObjectDelete.class));

       return (TypeAdapter<T>) new TypeAdapter<TlsCertificatesAndHostnamesSettingObjectDelete>() {
           @Override
           public void write(JsonWriter out, TlsCertificatesAndHostnamesSettingObjectDelete value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TlsCertificatesAndHostnamesSettingObjectDelete read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TlsCertificatesAndHostnamesSettingObjectDelete given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TlsCertificatesAndHostnamesSettingObjectDelete
  * @throws IOException if the JSON string is invalid with respect to TlsCertificatesAndHostnamesSettingObjectDelete
  */
  public static TlsCertificatesAndHostnamesSettingObjectDelete fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TlsCertificatesAndHostnamesSettingObjectDelete.class);
  }

 /**
  * Convert an instance of TlsCertificatesAndHostnamesSettingObjectDelete to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

