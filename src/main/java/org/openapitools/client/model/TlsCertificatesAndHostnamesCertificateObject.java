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
import org.openapitools.client.model.TlsCertificatesAndHostnamesZoneAuthenticatedOriginPullComponentsSchemasStatus;

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
 * TlsCertificatesAndHostnamesCertificateObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TlsCertificatesAndHostnamesCertificateObject {
  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private String certificate;

  public static final String SERIALIZED_NAME_EXPIRES_ON = "expires_on";
  @SerializedName(SERIALIZED_NAME_EXPIRES_ON)
  private OffsetDateTime expiresOn;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TlsCertificatesAndHostnamesZoneAuthenticatedOriginPullComponentsSchemasStatus status;

  public static final String SERIALIZED_NAME_UPLOADED_ON = "uploaded_on";
  @SerializedName(SERIALIZED_NAME_UPLOADED_ON)
  private OffsetDateTime uploadedOn;

  public TlsCertificatesAndHostnamesCertificateObject() {
  }

  public TlsCertificatesAndHostnamesCertificateObject(
     OffsetDateTime expiresOn, 
     String id, 
     String issuer, 
     String signature
  ) {
    this();
    this.expiresOn = expiresOn;
    this.id = id;
    this.issuer = issuer;
    this.signature = signature;
  }

  public TlsCertificatesAndHostnamesCertificateObject certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * The zone&#39;s leaf certificate.
   * @return certificate
  **/
  @javax.annotation.Nullable
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


   /**
   * When the certificate from the authority expires.
   * @return expiresOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpiresOn() {
    return expiresOn;
  }



   /**
   * Identifier
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



   /**
   * The certificate authority that issued the certificate.
   * @return issuer
  **/
  @javax.annotation.Nullable
  public String getIssuer() {
    return issuer;
  }



   /**
   * The type of hash used for the certificate.
   * @return signature
  **/
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }



  public TlsCertificatesAndHostnamesCertificateObject status(TlsCertificatesAndHostnamesZoneAuthenticatedOriginPullComponentsSchemasStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public TlsCertificatesAndHostnamesZoneAuthenticatedOriginPullComponentsSchemasStatus getStatus() {
    return status;
  }

  public void setStatus(TlsCertificatesAndHostnamesZoneAuthenticatedOriginPullComponentsSchemasStatus status) {
    this.status = status;
  }


  public TlsCertificatesAndHostnamesCertificateObject uploadedOn(OffsetDateTime uploadedOn) {
    this.uploadedOn = uploadedOn;
    return this;
  }

   /**
   * This is the time the certificate was uploaded.
   * @return uploadedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUploadedOn() {
    return uploadedOn;
  }

  public void setUploadedOn(OffsetDateTime uploadedOn) {
    this.uploadedOn = uploadedOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TlsCertificatesAndHostnamesCertificateObject tlsCertificatesAndHostnamesCertificateObject = (TlsCertificatesAndHostnamesCertificateObject) o;
    return Objects.equals(this.certificate, tlsCertificatesAndHostnamesCertificateObject.certificate) &&
        Objects.equals(this.expiresOn, tlsCertificatesAndHostnamesCertificateObject.expiresOn) &&
        Objects.equals(this.id, tlsCertificatesAndHostnamesCertificateObject.id) &&
        Objects.equals(this.issuer, tlsCertificatesAndHostnamesCertificateObject.issuer) &&
        Objects.equals(this.signature, tlsCertificatesAndHostnamesCertificateObject.signature) &&
        Objects.equals(this.status, tlsCertificatesAndHostnamesCertificateObject.status) &&
        Objects.equals(this.uploadedOn, tlsCertificatesAndHostnamesCertificateObject.uploadedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, expiresOn, id, issuer, signature, status, uploadedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TlsCertificatesAndHostnamesCertificateObject {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uploadedOn: ").append(toIndentedString(uploadedOn)).append("\n");
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
    openapiFields.add("certificate");
    openapiFields.add("expires_on");
    openapiFields.add("id");
    openapiFields.add("issuer");
    openapiFields.add("signature");
    openapiFields.add("status");
    openapiFields.add("uploaded_on");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TlsCertificatesAndHostnamesCertificateObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TlsCertificatesAndHostnamesCertificateObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TlsCertificatesAndHostnamesCertificateObject is not found in the empty JSON string", TlsCertificatesAndHostnamesCertificateObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TlsCertificatesAndHostnamesCertificateObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TlsCertificatesAndHostnamesCertificateObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("certificate") != null && !jsonObj.get("certificate").isJsonNull()) && !jsonObj.get("certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("issuer") != null && !jsonObj.get("issuer").isJsonNull()) && !jsonObj.get("issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
      if ((jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        TlsCertificatesAndHostnamesZoneAuthenticatedOriginPullComponentsSchemasStatus.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TlsCertificatesAndHostnamesCertificateObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TlsCertificatesAndHostnamesCertificateObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TlsCertificatesAndHostnamesCertificateObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TlsCertificatesAndHostnamesCertificateObject.class));

       return (TypeAdapter<T>) new TypeAdapter<TlsCertificatesAndHostnamesCertificateObject>() {
           @Override
           public void write(JsonWriter out, TlsCertificatesAndHostnamesCertificateObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TlsCertificatesAndHostnamesCertificateObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TlsCertificatesAndHostnamesCertificateObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TlsCertificatesAndHostnamesCertificateObject
  * @throws IOException if the JSON string is invalid with respect to TlsCertificatesAndHostnamesCertificateObject
  */
  public static TlsCertificatesAndHostnamesCertificateObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TlsCertificatesAndHostnamesCertificateObject.class);
  }

 /**
  * Convert an instance of TlsCertificatesAndHostnamesCertificateObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

