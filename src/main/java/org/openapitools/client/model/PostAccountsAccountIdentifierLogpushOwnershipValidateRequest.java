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
import java.net.URI;
import java.util.Arrays;

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
 * PostAccountsAccountIdentifierLogpushOwnershipValidateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class PostAccountsAccountIdentifierLogpushOwnershipValidateRequest {
  public static final String SERIALIZED_NAME_DESTINATION_CONF = "destination_conf";
  @SerializedName(SERIALIZED_NAME_DESTINATION_CONF)
  private URI destinationConf;

  public static final String SERIALIZED_NAME_OWNERSHIP_CHALLENGE = "ownership_challenge";
  @SerializedName(SERIALIZED_NAME_OWNERSHIP_CHALLENGE)
  private String ownershipChallenge;

  public PostAccountsAccountIdentifierLogpushOwnershipValidateRequest() {
  }

  public PostAccountsAccountIdentifierLogpushOwnershipValidateRequest destinationConf(URI destinationConf) {
    this.destinationConf = destinationConf;
    return this;
  }

   /**
   * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
   * @return destinationConf
  **/
  @javax.annotation.Nonnull
  public URI getDestinationConf() {
    return destinationConf;
  }

  public void setDestinationConf(URI destinationConf) {
    this.destinationConf = destinationConf;
  }


  public PostAccountsAccountIdentifierLogpushOwnershipValidateRequest ownershipChallenge(String ownershipChallenge) {
    this.ownershipChallenge = ownershipChallenge;
    return this;
  }

   /**
   * Ownership challenge token to prove destination ownership.
   * @return ownershipChallenge
  **/
  @javax.annotation.Nonnull
  public String getOwnershipChallenge() {
    return ownershipChallenge;
  }

  public void setOwnershipChallenge(String ownershipChallenge) {
    this.ownershipChallenge = ownershipChallenge;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAccountsAccountIdentifierLogpushOwnershipValidateRequest postAccountsAccountIdentifierLogpushOwnershipValidateRequest = (PostAccountsAccountIdentifierLogpushOwnershipValidateRequest) o;
    return Objects.equals(this.destinationConf, postAccountsAccountIdentifierLogpushOwnershipValidateRequest.destinationConf) &&
        Objects.equals(this.ownershipChallenge, postAccountsAccountIdentifierLogpushOwnershipValidateRequest.ownershipChallenge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationConf, ownershipChallenge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAccountsAccountIdentifierLogpushOwnershipValidateRequest {\n");
    sb.append("    destinationConf: ").append(toIndentedString(destinationConf)).append("\n");
    sb.append("    ownershipChallenge: ").append(toIndentedString(ownershipChallenge)).append("\n");
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
    openapiFields.add("destination_conf");
    openapiFields.add("ownership_challenge");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("destination_conf");
    openapiRequiredFields.add("ownership_challenge");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PostAccountsAccountIdentifierLogpushOwnershipValidateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PostAccountsAccountIdentifierLogpushOwnershipValidateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostAccountsAccountIdentifierLogpushOwnershipValidateRequest is not found in the empty JSON string", PostAccountsAccountIdentifierLogpushOwnershipValidateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PostAccountsAccountIdentifierLogpushOwnershipValidateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostAccountsAccountIdentifierLogpushOwnershipValidateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PostAccountsAccountIdentifierLogpushOwnershipValidateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("destination_conf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination_conf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination_conf").toString()));
      }
      if (!jsonObj.get("ownership_challenge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownership_challenge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownership_challenge").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostAccountsAccountIdentifierLogpushOwnershipValidateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostAccountsAccountIdentifierLogpushOwnershipValidateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostAccountsAccountIdentifierLogpushOwnershipValidateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostAccountsAccountIdentifierLogpushOwnershipValidateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PostAccountsAccountIdentifierLogpushOwnershipValidateRequest>() {
           @Override
           public void write(JsonWriter out, PostAccountsAccountIdentifierLogpushOwnershipValidateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostAccountsAccountIdentifierLogpushOwnershipValidateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostAccountsAccountIdentifierLogpushOwnershipValidateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostAccountsAccountIdentifierLogpushOwnershipValidateRequest
  * @throws IOException if the JSON string is invalid with respect to PostAccountsAccountIdentifierLogpushOwnershipValidateRequest
  */
  public static PostAccountsAccountIdentifierLogpushOwnershipValidateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostAccountsAccountIdentifierLogpushOwnershipValidateRequest.class);
  }

 /**
  * Convert an instance of PostAccountsAccountIdentifierLogpushOwnershipValidateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
