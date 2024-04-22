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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * AccessSchemasPolicyCheckResponseAllOfResultAppState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessSchemasPolicyCheckResponseAllOfResultAppState {
  public static final String SERIALIZED_NAME_APP_UID = "app_uid";
  @SerializedName(SERIALIZED_NAME_APP_UID)
  private String appUid;

  public static final String SERIALIZED_NAME_AUD = "aud";
  @SerializedName(SERIALIZED_NAME_AUD)
  private String aud;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POLICIES = "policies";
  @SerializedName(SERIALIZED_NAME_POLICIES)
  private List<Object> policies = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AccessSchemasPolicyCheckResponseAllOfResultAppState() {
  }

  public AccessSchemasPolicyCheckResponseAllOfResultAppState(
     String appUid
  ) {
    this();
    this.appUid = appUid;
  }

   /**
   * UUID
   * @return appUid
  **/
  @javax.annotation.Nullable
  public String getAppUid() {
    return appUid;
  }



  public AccessSchemasPolicyCheckResponseAllOfResultAppState aud(String aud) {
    this.aud = aud;
    return this;
  }

   /**
   * Get aud
   * @return aud
  **/
  @javax.annotation.Nullable
  public String getAud() {
    return aud;
  }

  public void setAud(String aud) {
    this.aud = aud;
  }


  public AccessSchemasPolicyCheckResponseAllOfResultAppState hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nullable
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public AccessSchemasPolicyCheckResponseAllOfResultAppState name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccessSchemasPolicyCheckResponseAllOfResultAppState policies(List<Object> policies) {
    this.policies = policies;
    return this;
  }

  public AccessSchemasPolicyCheckResponseAllOfResultAppState addPoliciesItem(Object policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * Get policies
   * @return policies
  **/
  @javax.annotation.Nullable
  public List<Object> getPolicies() {
    return policies;
  }

  public void setPolicies(List<Object> policies) {
    this.policies = policies;
  }


  public AccessSchemasPolicyCheckResponseAllOfResultAppState status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessSchemasPolicyCheckResponseAllOfResultAppState accessSchemasPolicyCheckResponseAllOfResultAppState = (AccessSchemasPolicyCheckResponseAllOfResultAppState) o;
    return Objects.equals(this.appUid, accessSchemasPolicyCheckResponseAllOfResultAppState.appUid) &&
        Objects.equals(this.aud, accessSchemasPolicyCheckResponseAllOfResultAppState.aud) &&
        Objects.equals(this.hostname, accessSchemasPolicyCheckResponseAllOfResultAppState.hostname) &&
        Objects.equals(this.name, accessSchemasPolicyCheckResponseAllOfResultAppState.name) &&
        Objects.equals(this.policies, accessSchemasPolicyCheckResponseAllOfResultAppState.policies) &&
        Objects.equals(this.status, accessSchemasPolicyCheckResponseAllOfResultAppState.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appUid, aud, hostname, name, policies, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessSchemasPolicyCheckResponseAllOfResultAppState {\n");
    sb.append("    appUid: ").append(toIndentedString(appUid)).append("\n");
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("app_uid");
    openapiFields.add("aud");
    openapiFields.add("hostname");
    openapiFields.add("name");
    openapiFields.add("policies");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessSchemasPolicyCheckResponseAllOfResultAppState
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessSchemasPolicyCheckResponseAllOfResultAppState.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessSchemasPolicyCheckResponseAllOfResultAppState is not found in the empty JSON string", AccessSchemasPolicyCheckResponseAllOfResultAppState.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessSchemasPolicyCheckResponseAllOfResultAppState.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessSchemasPolicyCheckResponseAllOfResultAppState` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("app_uid") != null && !jsonObj.get("app_uid").isJsonNull()) && !jsonObj.get("app_uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_uid").toString()));
      }
      if ((jsonObj.get("aud") != null && !jsonObj.get("aud").isJsonNull()) && !jsonObj.get("aud").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aud` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aud").toString()));
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("policies") != null && !jsonObj.get("policies").isJsonNull() && !jsonObj.get("policies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `policies` to be an array in the JSON string but got `%s`", jsonObj.get("policies").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessSchemasPolicyCheckResponseAllOfResultAppState.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessSchemasPolicyCheckResponseAllOfResultAppState' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessSchemasPolicyCheckResponseAllOfResultAppState> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessSchemasPolicyCheckResponseAllOfResultAppState.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessSchemasPolicyCheckResponseAllOfResultAppState>() {
           @Override
           public void write(JsonWriter out, AccessSchemasPolicyCheckResponseAllOfResultAppState value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessSchemasPolicyCheckResponseAllOfResultAppState read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessSchemasPolicyCheckResponseAllOfResultAppState given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessSchemasPolicyCheckResponseAllOfResultAppState
  * @throws IOException if the JSON string is invalid with respect to AccessSchemasPolicyCheckResponseAllOfResultAppState
  */
  public static AccessSchemasPolicyCheckResponseAllOfResultAppState fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessSchemasPolicyCheckResponseAllOfResultAppState.class);
  }

 /**
  * Convert an instance of AccessSchemasPolicyCheckResponseAllOfResultAppState to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

