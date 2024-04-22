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
 * TlsCertificatesAndHostnamesHostnameAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TlsCertificatesAndHostnamesHostnameAssociation {
  public static final String SERIALIZED_NAME_HOSTNAMES = "hostnames";
  @SerializedName(SERIALIZED_NAME_HOSTNAMES)
  private List<String> hostnames = new ArrayList<>();

  public static final String SERIALIZED_NAME_MTLS_CERTIFICATE_ID = "mtls_certificate_id";
  @SerializedName(SERIALIZED_NAME_MTLS_CERTIFICATE_ID)
  private String mtlsCertificateId;

  public TlsCertificatesAndHostnamesHostnameAssociation() {
  }

  public TlsCertificatesAndHostnamesHostnameAssociation hostnames(List<String> hostnames) {
    this.hostnames = hostnames;
    return this;
  }

  public TlsCertificatesAndHostnamesHostnameAssociation addHostnamesItem(String hostnamesItem) {
    if (this.hostnames == null) {
      this.hostnames = new ArrayList<>();
    }
    this.hostnames.add(hostnamesItem);
    return this;
  }

   /**
   * Get hostnames
   * @return hostnames
  **/
  @javax.annotation.Nullable
  public List<String> getHostnames() {
    return hostnames;
  }

  public void setHostnames(List<String> hostnames) {
    this.hostnames = hostnames;
  }


  public TlsCertificatesAndHostnamesHostnameAssociation mtlsCertificateId(String mtlsCertificateId) {
    this.mtlsCertificateId = mtlsCertificateId;
    return this;
  }

   /**
   * The UUID for a certificate that was uploaded to the mTLS Certificate Management endpoint. If no mtls_certificate_id is given, the hostnames will be associated to your active Cloudflare Managed CA.
   * @return mtlsCertificateId
  **/
  @javax.annotation.Nullable
  public String getMtlsCertificateId() {
    return mtlsCertificateId;
  }

  public void setMtlsCertificateId(String mtlsCertificateId) {
    this.mtlsCertificateId = mtlsCertificateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TlsCertificatesAndHostnamesHostnameAssociation tlsCertificatesAndHostnamesHostnameAssociation = (TlsCertificatesAndHostnamesHostnameAssociation) o;
    return Objects.equals(this.hostnames, tlsCertificatesAndHostnamesHostnameAssociation.hostnames) &&
        Objects.equals(this.mtlsCertificateId, tlsCertificatesAndHostnamesHostnameAssociation.mtlsCertificateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostnames, mtlsCertificateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TlsCertificatesAndHostnamesHostnameAssociation {\n");
    sb.append("    hostnames: ").append(toIndentedString(hostnames)).append("\n");
    sb.append("    mtlsCertificateId: ").append(toIndentedString(mtlsCertificateId)).append("\n");
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
    openapiFields.add("hostnames");
    openapiFields.add("mtls_certificate_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TlsCertificatesAndHostnamesHostnameAssociation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TlsCertificatesAndHostnamesHostnameAssociation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TlsCertificatesAndHostnamesHostnameAssociation is not found in the empty JSON string", TlsCertificatesAndHostnamesHostnameAssociation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TlsCertificatesAndHostnamesHostnameAssociation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TlsCertificatesAndHostnamesHostnameAssociation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("hostnames") != null && !jsonObj.get("hostnames").isJsonNull() && !jsonObj.get("hostnames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostnames` to be an array in the JSON string but got `%s`", jsonObj.get("hostnames").toString()));
      }
      if ((jsonObj.get("mtls_certificate_id") != null && !jsonObj.get("mtls_certificate_id").isJsonNull()) && !jsonObj.get("mtls_certificate_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mtls_certificate_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mtls_certificate_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TlsCertificatesAndHostnamesHostnameAssociation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TlsCertificatesAndHostnamesHostnameAssociation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TlsCertificatesAndHostnamesHostnameAssociation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TlsCertificatesAndHostnamesHostnameAssociation.class));

       return (TypeAdapter<T>) new TypeAdapter<TlsCertificatesAndHostnamesHostnameAssociation>() {
           @Override
           public void write(JsonWriter out, TlsCertificatesAndHostnamesHostnameAssociation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TlsCertificatesAndHostnamesHostnameAssociation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TlsCertificatesAndHostnamesHostnameAssociation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TlsCertificatesAndHostnamesHostnameAssociation
  * @throws IOException if the JSON string is invalid with respect to TlsCertificatesAndHostnamesHostnameAssociation
  */
  public static TlsCertificatesAndHostnamesHostnameAssociation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TlsCertificatesAndHostnamesHostnameAssociation.class);
  }

 /**
  * Convert an instance of TlsCertificatesAndHostnamesHostnameAssociation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

