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
import org.openapitools.client.model.HyperdriveHyperdriveScheme;

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
 * HyperdriveHyperdriveOrigin
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class HyperdriveHyperdriveOrigin {
  public static final String SERIALIZED_NAME_DATABASE = "database";
  @SerializedName(SERIALIZED_NAME_DATABASE)
  private String database;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private HyperdriveHyperdriveScheme scheme = HyperdriveHyperdriveScheme.POSTGRES;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public HyperdriveHyperdriveOrigin() {
  }

  public HyperdriveHyperdriveOrigin database(String database) {
    this.database = database;
    return this;
  }

   /**
   * The name of your origin database.
   * @return database
  **/
  @javax.annotation.Nonnull
  public String getDatabase() {
    return database;
  }

  public void setDatabase(String database) {
    this.database = database;
  }


  public HyperdriveHyperdriveOrigin host(String host) {
    this.host = host;
    return this;
  }

   /**
   * The host (hostname or IP) of your origin database.
   * @return host
  **/
  @javax.annotation.Nonnull
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  public HyperdriveHyperdriveOrigin port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * The port (default: 5432 for Postgres) of your origin database.
   * @return port
  **/
  @javax.annotation.Nonnull
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  public HyperdriveHyperdriveOrigin scheme(HyperdriveHyperdriveScheme scheme) {
    this.scheme = scheme;
    return this;
  }

   /**
   * Get scheme
   * @return scheme
  **/
  @javax.annotation.Nonnull
  public HyperdriveHyperdriveScheme getScheme() {
    return scheme;
  }

  public void setScheme(HyperdriveHyperdriveScheme scheme) {
    this.scheme = scheme;
  }


  public HyperdriveHyperdriveOrigin user(String user) {
    this.user = user;
    return this;
  }

   /**
   * The user of your origin database.
   * @return user
  **/
  @javax.annotation.Nonnull
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HyperdriveHyperdriveOrigin hyperdriveHyperdriveOrigin = (HyperdriveHyperdriveOrigin) o;
    return Objects.equals(this.database, hyperdriveHyperdriveOrigin.database) &&
        Objects.equals(this.host, hyperdriveHyperdriveOrigin.host) &&
        Objects.equals(this.port, hyperdriveHyperdriveOrigin.port) &&
        Objects.equals(this.scheme, hyperdriveHyperdriveOrigin.scheme) &&
        Objects.equals(this.user, hyperdriveHyperdriveOrigin.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(database, host, port, scheme, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HyperdriveHyperdriveOrigin {\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("database");
    openapiFields.add("host");
    openapiFields.add("port");
    openapiFields.add("scheme");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("database");
    openapiRequiredFields.add("host");
    openapiRequiredFields.add("port");
    openapiRequiredFields.add("scheme");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to HyperdriveHyperdriveOrigin
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HyperdriveHyperdriveOrigin.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HyperdriveHyperdriveOrigin is not found in the empty JSON string", HyperdriveHyperdriveOrigin.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HyperdriveHyperdriveOrigin.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HyperdriveHyperdriveOrigin` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HyperdriveHyperdriveOrigin.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("database").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database").toString()));
      }
      if (!jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      // validate the required field `scheme`
      HyperdriveHyperdriveScheme.validateJsonElement(jsonObj.get("scheme"));
      if (!jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HyperdriveHyperdriveOrigin.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HyperdriveHyperdriveOrigin' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HyperdriveHyperdriveOrigin> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HyperdriveHyperdriveOrigin.class));

       return (TypeAdapter<T>) new TypeAdapter<HyperdriveHyperdriveOrigin>() {
           @Override
           public void write(JsonWriter out, HyperdriveHyperdriveOrigin value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HyperdriveHyperdriveOrigin read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HyperdriveHyperdriveOrigin given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HyperdriveHyperdriveOrigin
  * @throws IOException if the JSON string is invalid with respect to HyperdriveHyperdriveOrigin
  */
  public static HyperdriveHyperdriveOrigin fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HyperdriveHyperdriveOrigin.class);
  }

 /**
  * Convert an instance of HyperdriveHyperdriveOrigin to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

