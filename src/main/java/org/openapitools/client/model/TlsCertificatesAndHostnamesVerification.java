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
import org.openapitools.client.model.TlsCertificatesAndHostnamesCertificateStatus;
import org.openapitools.client.model.TlsCertificatesAndHostnamesSchemasSignature;
import org.openapitools.client.model.TlsCertificatesAndHostnamesSchemasValidationMethod;
import org.openapitools.client.model.TlsCertificatesAndHostnamesVerificationInfo;
import org.openapitools.client.model.TlsCertificatesAndHostnamesVerificationType;

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
 * TlsCertificatesAndHostnamesVerification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TlsCertificatesAndHostnamesVerification {
  public static final String SERIALIZED_NAME_BRAND_CHECK = "brand_check";
  @SerializedName(SERIALIZED_NAME_BRAND_CHECK)
  private Boolean brandCheck;

  public static final String SERIALIZED_NAME_CERT_PACK_UUID = "cert_pack_uuid";
  @SerializedName(SERIALIZED_NAME_CERT_PACK_UUID)
  private String certPackUuid;

  public static final String SERIALIZED_NAME_CERTIFICATE_STATUS = "certificate_status";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_STATUS)
  private TlsCertificatesAndHostnamesCertificateStatus certificateStatus;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private TlsCertificatesAndHostnamesSchemasSignature signature;

  public static final String SERIALIZED_NAME_VALIDATION_METHOD = "validation_method";
  @SerializedName(SERIALIZED_NAME_VALIDATION_METHOD)
  private TlsCertificatesAndHostnamesSchemasValidationMethod validationMethod;

  public static final String SERIALIZED_NAME_VERIFICATION_INFO = "verification_info";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_INFO)
  private TlsCertificatesAndHostnamesVerificationInfo verificationInfo;

  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verification_status";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private Boolean verificationStatus;

  public static final String SERIALIZED_NAME_VERIFICATION_TYPE = "verification_type";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_TYPE)
  private TlsCertificatesAndHostnamesVerificationType verificationType;

  public TlsCertificatesAndHostnamesVerification() {
  }

  public TlsCertificatesAndHostnamesVerification brandCheck(Boolean brandCheck) {
    this.brandCheck = brandCheck;
    return this;
  }

   /**
   * Certificate Authority is manually reviewing the order.
   * @return brandCheck
  **/
  @javax.annotation.Nullable
  public Boolean getBrandCheck() {
    return brandCheck;
  }

  public void setBrandCheck(Boolean brandCheck) {
    this.brandCheck = brandCheck;
  }


  public TlsCertificatesAndHostnamesVerification certPackUuid(String certPackUuid) {
    this.certPackUuid = certPackUuid;
    return this;
  }

   /**
   * Certificate Pack UUID.
   * @return certPackUuid
  **/
  @javax.annotation.Nullable
  public String getCertPackUuid() {
    return certPackUuid;
  }

  public void setCertPackUuid(String certPackUuid) {
    this.certPackUuid = certPackUuid;
  }


  public TlsCertificatesAndHostnamesVerification certificateStatus(TlsCertificatesAndHostnamesCertificateStatus certificateStatus) {
    this.certificateStatus = certificateStatus;
    return this;
  }

   /**
   * Get certificateStatus
   * @return certificateStatus
  **/
  @javax.annotation.Nonnull
  public TlsCertificatesAndHostnamesCertificateStatus getCertificateStatus() {
    return certificateStatus;
  }

  public void setCertificateStatus(TlsCertificatesAndHostnamesCertificateStatus certificateStatus) {
    this.certificateStatus = certificateStatus;
  }


  public TlsCertificatesAndHostnamesVerification signature(TlsCertificatesAndHostnamesSchemasSignature signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @javax.annotation.Nullable
  public TlsCertificatesAndHostnamesSchemasSignature getSignature() {
    return signature;
  }

  public void setSignature(TlsCertificatesAndHostnamesSchemasSignature signature) {
    this.signature = signature;
  }


  public TlsCertificatesAndHostnamesVerification validationMethod(TlsCertificatesAndHostnamesSchemasValidationMethod validationMethod) {
    this.validationMethod = validationMethod;
    return this;
  }

   /**
   * Get validationMethod
   * @return validationMethod
  **/
  @javax.annotation.Nullable
  public TlsCertificatesAndHostnamesSchemasValidationMethod getValidationMethod() {
    return validationMethod;
  }

  public void setValidationMethod(TlsCertificatesAndHostnamesSchemasValidationMethod validationMethod) {
    this.validationMethod = validationMethod;
  }


  public TlsCertificatesAndHostnamesVerification verificationInfo(TlsCertificatesAndHostnamesVerificationInfo verificationInfo) {
    this.verificationInfo = verificationInfo;
    return this;
  }

   /**
   * Get verificationInfo
   * @return verificationInfo
  **/
  @javax.annotation.Nullable
  public TlsCertificatesAndHostnamesVerificationInfo getVerificationInfo() {
    return verificationInfo;
  }

  public void setVerificationInfo(TlsCertificatesAndHostnamesVerificationInfo verificationInfo) {
    this.verificationInfo = verificationInfo;
  }


  public TlsCertificatesAndHostnamesVerification verificationStatus(Boolean verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Status of the required verification information, omitted if verification status is unknown.
   * @return verificationStatus
  **/
  @javax.annotation.Nullable
  public Boolean getVerificationStatus() {
    return verificationStatus;
  }

  public void setVerificationStatus(Boolean verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  public TlsCertificatesAndHostnamesVerification verificationType(TlsCertificatesAndHostnamesVerificationType verificationType) {
    this.verificationType = verificationType;
    return this;
  }

   /**
   * Get verificationType
   * @return verificationType
  **/
  @javax.annotation.Nullable
  public TlsCertificatesAndHostnamesVerificationType getVerificationType() {
    return verificationType;
  }

  public void setVerificationType(TlsCertificatesAndHostnamesVerificationType verificationType) {
    this.verificationType = verificationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TlsCertificatesAndHostnamesVerification tlsCertificatesAndHostnamesVerification = (TlsCertificatesAndHostnamesVerification) o;
    return Objects.equals(this.brandCheck, tlsCertificatesAndHostnamesVerification.brandCheck) &&
        Objects.equals(this.certPackUuid, tlsCertificatesAndHostnamesVerification.certPackUuid) &&
        Objects.equals(this.certificateStatus, tlsCertificatesAndHostnamesVerification.certificateStatus) &&
        Objects.equals(this.signature, tlsCertificatesAndHostnamesVerification.signature) &&
        Objects.equals(this.validationMethod, tlsCertificatesAndHostnamesVerification.validationMethod) &&
        Objects.equals(this.verificationInfo, tlsCertificatesAndHostnamesVerification.verificationInfo) &&
        Objects.equals(this.verificationStatus, tlsCertificatesAndHostnamesVerification.verificationStatus) &&
        Objects.equals(this.verificationType, tlsCertificatesAndHostnamesVerification.verificationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandCheck, certPackUuid, certificateStatus, signature, validationMethod, verificationInfo, verificationStatus, verificationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TlsCertificatesAndHostnamesVerification {\n");
    sb.append("    brandCheck: ").append(toIndentedString(brandCheck)).append("\n");
    sb.append("    certPackUuid: ").append(toIndentedString(certPackUuid)).append("\n");
    sb.append("    certificateStatus: ").append(toIndentedString(certificateStatus)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    validationMethod: ").append(toIndentedString(validationMethod)).append("\n");
    sb.append("    verificationInfo: ").append(toIndentedString(verificationInfo)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    verificationType: ").append(toIndentedString(verificationType)).append("\n");
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
    openapiFields.add("brand_check");
    openapiFields.add("cert_pack_uuid");
    openapiFields.add("certificate_status");
    openapiFields.add("signature");
    openapiFields.add("validation_method");
    openapiFields.add("verification_info");
    openapiFields.add("verification_status");
    openapiFields.add("verification_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("certificate_status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TlsCertificatesAndHostnamesVerification
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TlsCertificatesAndHostnamesVerification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TlsCertificatesAndHostnamesVerification is not found in the empty JSON string", TlsCertificatesAndHostnamesVerification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TlsCertificatesAndHostnamesVerification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TlsCertificatesAndHostnamesVerification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TlsCertificatesAndHostnamesVerification.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cert_pack_uuid") != null && !jsonObj.get("cert_pack_uuid").isJsonNull()) && !jsonObj.get("cert_pack_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_pack_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_pack_uuid").toString()));
      }
      // validate the required field `certificate_status`
      TlsCertificatesAndHostnamesCertificateStatus.validateJsonElement(jsonObj.get("certificate_status"));
      // validate the optional field `signature`
      if (jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) {
        TlsCertificatesAndHostnamesSchemasSignature.validateJsonElement(jsonObj.get("signature"));
      }
      // validate the optional field `validation_method`
      if (jsonObj.get("validation_method") != null && !jsonObj.get("validation_method").isJsonNull()) {
        TlsCertificatesAndHostnamesSchemasValidationMethod.validateJsonElement(jsonObj.get("validation_method"));
      }
      // validate the optional field `verification_info`
      if (jsonObj.get("verification_info") != null && !jsonObj.get("verification_info").isJsonNull()) {
        TlsCertificatesAndHostnamesVerificationInfo.validateJsonElement(jsonObj.get("verification_info"));
      }
      // validate the optional field `verification_type`
      if (jsonObj.get("verification_type") != null && !jsonObj.get("verification_type").isJsonNull()) {
        TlsCertificatesAndHostnamesVerificationType.validateJsonElement(jsonObj.get("verification_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TlsCertificatesAndHostnamesVerification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TlsCertificatesAndHostnamesVerification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TlsCertificatesAndHostnamesVerification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TlsCertificatesAndHostnamesVerification.class));

       return (TypeAdapter<T>) new TypeAdapter<TlsCertificatesAndHostnamesVerification>() {
           @Override
           public void write(JsonWriter out, TlsCertificatesAndHostnamesVerification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TlsCertificatesAndHostnamesVerification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TlsCertificatesAndHostnamesVerification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TlsCertificatesAndHostnamesVerification
  * @throws IOException if the JSON string is invalid with respect to TlsCertificatesAndHostnamesVerification
  */
  public static TlsCertificatesAndHostnamesVerification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TlsCertificatesAndHostnamesVerification.class);
  }

 /**
  * Convert an instance of TlsCertificatesAndHostnamesVerification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

