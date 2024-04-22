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
 * AccessMtlsAuthenticationAddAnMtlsCertificateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessMtlsAuthenticationAddAnMtlsCertificateRequest {
  public static final String SERIALIZED_NAME_ASSOCIATED_HOSTNAMES = "associated_hostnames";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_HOSTNAMES)
  private List<String> associatedHostnames = new ArrayList<>();

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private String certificate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public AccessMtlsAuthenticationAddAnMtlsCertificateRequest() {
  }

  public AccessMtlsAuthenticationAddAnMtlsCertificateRequest associatedHostnames(List<String> associatedHostnames) {
    this.associatedHostnames = associatedHostnames;
    return this;
  }

  public AccessMtlsAuthenticationAddAnMtlsCertificateRequest addAssociatedHostnamesItem(String associatedHostnamesItem) {
    if (this.associatedHostnames == null) {
      this.associatedHostnames = new ArrayList<>();
    }
    this.associatedHostnames.add(associatedHostnamesItem);
    return this;
  }

   /**
   * The hostnames of the applications that will use this certificate.
   * @return associatedHostnames
  **/
  @javax.annotation.Nullable
  public List<String> getAssociatedHostnames() {
    return associatedHostnames;
  }

  public void setAssociatedHostnames(List<String> associatedHostnames) {
    this.associatedHostnames = associatedHostnames;
  }


  public AccessMtlsAuthenticationAddAnMtlsCertificateRequest certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * The certificate content.
   * @return certificate
  **/
  @javax.annotation.Nonnull
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  public AccessMtlsAuthenticationAddAnMtlsCertificateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the certificate.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessMtlsAuthenticationAddAnMtlsCertificateRequest accessMtlsAuthenticationAddAnMtlsCertificateRequest = (AccessMtlsAuthenticationAddAnMtlsCertificateRequest) o;
    return Objects.equals(this.associatedHostnames, accessMtlsAuthenticationAddAnMtlsCertificateRequest.associatedHostnames) &&
        Objects.equals(this.certificate, accessMtlsAuthenticationAddAnMtlsCertificateRequest.certificate) &&
        Objects.equals(this.name, accessMtlsAuthenticationAddAnMtlsCertificateRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedHostnames, certificate, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessMtlsAuthenticationAddAnMtlsCertificateRequest {\n");
    sb.append("    associatedHostnames: ").append(toIndentedString(associatedHostnames)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("associated_hostnames");
    openapiFields.add("certificate");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("certificate");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessMtlsAuthenticationAddAnMtlsCertificateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessMtlsAuthenticationAddAnMtlsCertificateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessMtlsAuthenticationAddAnMtlsCertificateRequest is not found in the empty JSON string", AccessMtlsAuthenticationAddAnMtlsCertificateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessMtlsAuthenticationAddAnMtlsCertificateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessMtlsAuthenticationAddAnMtlsCertificateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccessMtlsAuthenticationAddAnMtlsCertificateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("associated_hostnames") != null && !jsonObj.get("associated_hostnames").isJsonNull() && !jsonObj.get("associated_hostnames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `associated_hostnames` to be an array in the JSON string but got `%s`", jsonObj.get("associated_hostnames").toString()));
      }
      if (!jsonObj.get("certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessMtlsAuthenticationAddAnMtlsCertificateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessMtlsAuthenticationAddAnMtlsCertificateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessMtlsAuthenticationAddAnMtlsCertificateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessMtlsAuthenticationAddAnMtlsCertificateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessMtlsAuthenticationAddAnMtlsCertificateRequest>() {
           @Override
           public void write(JsonWriter out, AccessMtlsAuthenticationAddAnMtlsCertificateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessMtlsAuthenticationAddAnMtlsCertificateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessMtlsAuthenticationAddAnMtlsCertificateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessMtlsAuthenticationAddAnMtlsCertificateRequest
  * @throws IOException if the JSON string is invalid with respect to AccessMtlsAuthenticationAddAnMtlsCertificateRequest
  */
  public static AccessMtlsAuthenticationAddAnMtlsCertificateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessMtlsAuthenticationAddAnMtlsCertificateRequest.class);
  }

 /**
  * Convert an instance of AccessMtlsAuthenticationAddAnMtlsCertificateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

