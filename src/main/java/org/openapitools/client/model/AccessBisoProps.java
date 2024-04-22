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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * AccessBisoProps
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessBisoProps {
  public static final String SERIALIZED_NAME_ALLOWED_IDPS = "allowed_idps";
  @SerializedName(SERIALIZED_NAME_ALLOWED_IDPS)
  private List<String> allowedIdps = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTO_REDIRECT_TO_IDENTITY = "auto_redirect_to_identity";
  @SerializedName(SERIALIZED_NAME_AUTO_REDIRECT_TO_IDENTITY)
  private Boolean autoRedirectToIdentity = false;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private Object domain = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Object name = Clientless Web Isolation;

  public static final String SERIALIZED_NAME_SESSION_DURATION = "session_duration";
  @SerializedName(SERIALIZED_NAME_SESSION_DURATION)
  private String sessionDuration = "24h";

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AccessBisoProps() {
  }

  public AccessBisoProps(
     Object domain, 
     Object name
  ) {
    this();
    this.domain = domain;
    this.name = name;
  }

  public AccessBisoProps allowedIdps(List<String> allowedIdps) {
    this.allowedIdps = allowedIdps;
    return this;
  }

  public AccessBisoProps addAllowedIdpsItem(String allowedIdpsItem) {
    if (this.allowedIdps == null) {
      this.allowedIdps = new ArrayList<>();
    }
    this.allowedIdps.add(allowedIdpsItem);
    return this;
  }

   /**
   * The identity providers your users can select when connecting to this application. Defaults to all IdPs configured in your account.
   * @return allowedIdps
  **/
  @javax.annotation.Nullable
  public List<String> getAllowedIdps() {
    return allowedIdps;
  }

  public void setAllowedIdps(List<String> allowedIdps) {
    this.allowedIdps = allowedIdps;
  }


  public AccessBisoProps autoRedirectToIdentity(Boolean autoRedirectToIdentity) {
    this.autoRedirectToIdentity = autoRedirectToIdentity;
    return this;
  }

   /**
   * When set to &#x60;true&#x60;, users skip the identity provider selection step during login. You must specify only one identity provider in allowed_idps.
   * @return autoRedirectToIdentity
  **/
  @javax.annotation.Nullable
  public Boolean getAutoRedirectToIdentity() {
    return autoRedirectToIdentity;
  }

  public void setAutoRedirectToIdentity(Boolean autoRedirectToIdentity) {
    this.autoRedirectToIdentity = autoRedirectToIdentity;
  }


   /**
   * Get domain
   * @return domain
  **/
  @javax.annotation.Nullable
  public Object getDomain() {
    return domain;
  }



   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public Object getName() {
    return name;
  }



  public AccessBisoProps sessionDuration(String sessionDuration) {
    this.sessionDuration = sessionDuration;
    return this;
  }

   /**
   * The amount of time that tokens issued for this application will be valid. Must be in the format &#x60;300ms&#x60; or &#x60;2h45m&#x60;. Valid time units are: ns, us (or µs), ms, s, m, h.
   * @return sessionDuration
  **/
  @javax.annotation.Nullable
  public String getSessionDuration() {
    return sessionDuration;
  }

  public void setSessionDuration(String sessionDuration) {
    this.sessionDuration = sessionDuration;
  }


  public AccessBisoProps type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The application type.
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessBisoProps accessBisoProps = (AccessBisoProps) o;
    return Objects.equals(this.allowedIdps, accessBisoProps.allowedIdps) &&
        Objects.equals(this.autoRedirectToIdentity, accessBisoProps.autoRedirectToIdentity) &&
        Objects.equals(this.domain, accessBisoProps.domain) &&
        Objects.equals(this.name, accessBisoProps.name) &&
        Objects.equals(this.sessionDuration, accessBisoProps.sessionDuration) &&
        Objects.equals(this.type, accessBisoProps.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedIdps, autoRedirectToIdentity, domain, name, sessionDuration, type);
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
    sb.append("class AccessBisoProps {\n");
    sb.append("    allowedIdps: ").append(toIndentedString(allowedIdps)).append("\n");
    sb.append("    autoRedirectToIdentity: ").append(toIndentedString(autoRedirectToIdentity)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sessionDuration: ").append(toIndentedString(sessionDuration)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("allowed_idps");
    openapiFields.add("auto_redirect_to_identity");
    openapiFields.add("domain");
    openapiFields.add("name");
    openapiFields.add("session_duration");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessBisoProps
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessBisoProps.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessBisoProps is not found in the empty JSON string", AccessBisoProps.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessBisoProps.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessBisoProps` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccessBisoProps.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_idps") != null && !jsonObj.get("allowed_idps").isJsonNull() && !jsonObj.get("allowed_idps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_idps` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_idps").toString()));
      }
      if ((jsonObj.get("session_duration") != null && !jsonObj.get("session_duration").isJsonNull()) && !jsonObj.get("session_duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_duration").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessBisoProps.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessBisoProps' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessBisoProps> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessBisoProps.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessBisoProps>() {
           @Override
           public void write(JsonWriter out, AccessBisoProps value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessBisoProps read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessBisoProps given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessBisoProps
  * @throws IOException if the JSON string is invalid with respect to AccessBisoProps
  */
  public static AccessBisoProps fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessBisoProps.class);
  }

 /**
  * Convert an instance of AccessBisoProps to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

