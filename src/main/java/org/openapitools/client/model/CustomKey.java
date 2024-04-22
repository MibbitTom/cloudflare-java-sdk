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
import org.openapitools.client.model.Cookie;
import org.openapitools.client.model.Headers;
import org.openapitools.client.model.Host;
import org.openapitools.client.model.QueryString;
import org.openapitools.client.model.User;

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
 * Customize which components of the request are included or excluded from the cache key.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class CustomKey {
  public static final String SERIALIZED_NAME_COOKIE = "cookie";
  @SerializedName(SERIALIZED_NAME_COOKIE)
  private Cookie cookie;

  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private Headers header;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private Host host;

  public static final String SERIALIZED_NAME_QUERY_STRING = "query_string";
  @SerializedName(SERIALIZED_NAME_QUERY_STRING)
  private QueryString queryString;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;

  public CustomKey() {
  }

  public CustomKey cookie(Cookie cookie) {
    this.cookie = cookie;
    return this;
  }

   /**
   * Get cookie
   * @return cookie
  **/
  @javax.annotation.Nullable
  public Cookie getCookie() {
    return cookie;
  }

  public void setCookie(Cookie cookie) {
    this.cookie = cookie;
  }


  public CustomKey header(Headers header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nullable
  public Headers getHeader() {
    return header;
  }

  public void setHeader(Headers header) {
    this.header = header;
  }


  public CustomKey host(Host host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable
  public Host getHost() {
    return host;
  }

  public void setHost(Host host) {
    this.host = host;
  }


  public CustomKey queryString(QueryString queryString) {
    this.queryString = queryString;
    return this;
  }

   /**
   * Get queryString
   * @return queryString
  **/
  @javax.annotation.Nullable
  public QueryString getQueryString() {
    return queryString;
  }

  public void setQueryString(QueryString queryString) {
    this.queryString = queryString;
  }


  public CustomKey user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
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
    CustomKey customKey = (CustomKey) o;
    return Objects.equals(this.cookie, customKey.cookie) &&
        Objects.equals(this.header, customKey.header) &&
        Objects.equals(this.host, customKey.host) &&
        Objects.equals(this.queryString, customKey.queryString) &&
        Objects.equals(this.user, customKey.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cookie, header, host, queryString, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomKey {\n");
    sb.append("    cookie: ").append(toIndentedString(cookie)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
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
    openapiFields.add("cookie");
    openapiFields.add("header");
    openapiFields.add("host");
    openapiFields.add("query_string");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomKey
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomKey is not found in the empty JSON string", CustomKey.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomKey` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `cookie`
      if (jsonObj.get("cookie") != null && !jsonObj.get("cookie").isJsonNull()) {
        Cookie.validateJsonElement(jsonObj.get("cookie"));
      }
      // validate the optional field `header`
      if (jsonObj.get("header") != null && !jsonObj.get("header").isJsonNull()) {
        Headers.validateJsonElement(jsonObj.get("header"));
      }
      // validate the optional field `host`
      if (jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) {
        Host.validateJsonElement(jsonObj.get("host"));
      }
      // validate the optional field `query_string`
      if (jsonObj.get("query_string") != null && !jsonObj.get("query_string").isJsonNull()) {
        QueryString.validateJsonElement(jsonObj.get("query_string"));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        User.validateJsonElement(jsonObj.get("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomKey.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomKey>() {
           @Override
           public void write(JsonWriter out, CustomKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomKey
  * @throws IOException if the JSON string is invalid with respect to CustomKey
  */
  public static CustomKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomKey.class);
  }

 /**
  * Convert an instance of CustomKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

