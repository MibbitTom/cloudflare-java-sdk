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
 * AccessGoogleAllOfConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessGoogleAllOfConfig {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_CLAIMS = "claims";
  @SerializedName(SERIALIZED_NAME_CLAIMS)
  private List<String> claims = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMAIL_CLAIM_NAME = "email_claim_name";
  @SerializedName(SERIALIZED_NAME_EMAIL_CLAIM_NAME)
  private String emailClaimName;

  public AccessGoogleAllOfConfig() {
  }

  public AccessGoogleAllOfConfig clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Your OAuth Client ID
   * @return clientId
  **/
  @javax.annotation.Nullable
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public AccessGoogleAllOfConfig clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Your OAuth Client Secret
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public AccessGoogleAllOfConfig claims(List<String> claims) {
    this.claims = claims;
    return this;
  }

  public AccessGoogleAllOfConfig addClaimsItem(String claimsItem) {
    if (this.claims == null) {
      this.claims = new ArrayList<>();
    }
    this.claims.add(claimsItem);
    return this;
  }

   /**
   * Custom claims
   * @return claims
  **/
  @javax.annotation.Nullable
  public List<String> getClaims() {
    return claims;
  }

  public void setClaims(List<String> claims) {
    this.claims = claims;
  }


  public AccessGoogleAllOfConfig emailClaimName(String emailClaimName) {
    this.emailClaimName = emailClaimName;
    return this;
  }

   /**
   * The claim name for email in the id_token response.
   * @return emailClaimName
  **/
  @javax.annotation.Nullable
  public String getEmailClaimName() {
    return emailClaimName;
  }

  public void setEmailClaimName(String emailClaimName) {
    this.emailClaimName = emailClaimName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessGoogleAllOfConfig accessGoogleAllOfConfig = (AccessGoogleAllOfConfig) o;
    return Objects.equals(this.clientId, accessGoogleAllOfConfig.clientId) &&
        Objects.equals(this.clientSecret, accessGoogleAllOfConfig.clientSecret) &&
        Objects.equals(this.claims, accessGoogleAllOfConfig.claims) &&
        Objects.equals(this.emailClaimName, accessGoogleAllOfConfig.emailClaimName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, claims, emailClaimName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessGoogleAllOfConfig {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
    sb.append("    emailClaimName: ").append(toIndentedString(emailClaimName)).append("\n");
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
    openapiFields.add("client_id");
    openapiFields.add("client_secret");
    openapiFields.add("claims");
    openapiFields.add("email_claim_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessGoogleAllOfConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessGoogleAllOfConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessGoogleAllOfConfig is not found in the empty JSON string", AccessGoogleAllOfConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessGoogleAllOfConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessGoogleAllOfConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("client_id") != null && !jsonObj.get("client_id").isJsonNull()) && !jsonObj.get("client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_id").toString()));
      }
      if ((jsonObj.get("client_secret") != null && !jsonObj.get("client_secret").isJsonNull()) && !jsonObj.get("client_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_secret").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("claims") != null && !jsonObj.get("claims").isJsonNull() && !jsonObj.get("claims").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `claims` to be an array in the JSON string but got `%s`", jsonObj.get("claims").toString()));
      }
      if ((jsonObj.get("email_claim_name") != null && !jsonObj.get("email_claim_name").isJsonNull()) && !jsonObj.get("email_claim_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_claim_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_claim_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessGoogleAllOfConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessGoogleAllOfConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessGoogleAllOfConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessGoogleAllOfConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessGoogleAllOfConfig>() {
           @Override
           public void write(JsonWriter out, AccessGoogleAllOfConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessGoogleAllOfConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessGoogleAllOfConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessGoogleAllOfConfig
  * @throws IOException if the JSON string is invalid with respect to AccessGoogleAllOfConfig
  */
  public static AccessGoogleAllOfConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessGoogleAllOfConfig.class);
  }

 /**
  * Convert an instance of AccessGoogleAllOfConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

