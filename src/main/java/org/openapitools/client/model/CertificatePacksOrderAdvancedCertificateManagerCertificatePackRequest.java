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
import org.openapitools.client.model.TlsCertificatesAndHostnamesAdvancedType;
import org.openapitools.client.model.TlsCertificatesAndHostnamesSchemasCertificateAuthority;
import org.openapitools.client.model.TlsCertificatesAndHostnamesValidationMethod;
import org.openapitools.client.model.TlsCertificatesAndHostnamesValidityDays;

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
 * CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest {
  public static final String SERIALIZED_NAME_CERTIFICATE_AUTHORITY = "certificate_authority";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_AUTHORITY)
  private TlsCertificatesAndHostnamesSchemasCertificateAuthority certificateAuthority;

  public static final String SERIALIZED_NAME_CLOUDFLARE_BRANDING = "cloudflare_branding";
  @SerializedName(SERIALIZED_NAME_CLOUDFLARE_BRANDING)
  private Boolean cloudflareBranding;

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private List<String> hosts = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TlsCertificatesAndHostnamesAdvancedType type;

  public static final String SERIALIZED_NAME_VALIDATION_METHOD = "validation_method";
  @SerializedName(SERIALIZED_NAME_VALIDATION_METHOD)
  private TlsCertificatesAndHostnamesValidationMethod validationMethod;

  public static final String SERIALIZED_NAME_VALIDITY_DAYS = "validity_days";
  @SerializedName(SERIALIZED_NAME_VALIDITY_DAYS)
  private TlsCertificatesAndHostnamesValidityDays validityDays;

  public CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest() {
  }

  public CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest certificateAuthority(TlsCertificatesAndHostnamesSchemasCertificateAuthority certificateAuthority) {
    this.certificateAuthority = certificateAuthority;
    return this;
  }

   /**
   * Get certificateAuthority
   * @return certificateAuthority
  **/
  @javax.annotation.Nonnull
  public TlsCertificatesAndHostnamesSchemasCertificateAuthority getCertificateAuthority() {
    return certificateAuthority;
  }

  public void setCertificateAuthority(TlsCertificatesAndHostnamesSchemasCertificateAuthority certificateAuthority) {
    this.certificateAuthority = certificateAuthority;
  }


  public CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest cloudflareBranding(Boolean cloudflareBranding) {
    this.cloudflareBranding = cloudflareBranding;
    return this;
  }

   /**
   * Whether or not to add Cloudflare Branding for the order.  This will add sni.cloudflaressl.com as the Common Name if set true.
   * @return cloudflareBranding
  **/
  @javax.annotation.Nullable
  public Boolean getCloudflareBranding() {
    return cloudflareBranding;
  }

  public void setCloudflareBranding(Boolean cloudflareBranding) {
    this.cloudflareBranding = cloudflareBranding;
  }


  public CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest hosts(List<String> hosts) {
    this.hosts = hosts;
    return this;
  }

  public CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest addHostsItem(String hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * Comma separated list of valid host names for the certificate packs. Must contain the zone apex, may not contain more than 50 hosts, and may not be empty.
   * @return hosts
  **/
  @javax.annotation.Nonnull
  public List<String> getHosts() {
    return hosts;
  }

  public void setHosts(List<String> hosts) {
    this.hosts = hosts;
  }


  public CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest type(TlsCertificatesAndHostnamesAdvancedType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public TlsCertificatesAndHostnamesAdvancedType getType() {
    return type;
  }

  public void setType(TlsCertificatesAndHostnamesAdvancedType type) {
    this.type = type;
  }


  public CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest validationMethod(TlsCertificatesAndHostnamesValidationMethod validationMethod) {
    this.validationMethod = validationMethod;
    return this;
  }

   /**
   * Get validationMethod
   * @return validationMethod
  **/
  @javax.annotation.Nonnull
  public TlsCertificatesAndHostnamesValidationMethod getValidationMethod() {
    return validationMethod;
  }

  public void setValidationMethod(TlsCertificatesAndHostnamesValidationMethod validationMethod) {
    this.validationMethod = validationMethod;
  }


  public CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest validityDays(TlsCertificatesAndHostnamesValidityDays validityDays) {
    this.validityDays = validityDays;
    return this;
  }

   /**
   * Get validityDays
   * @return validityDays
  **/
  @javax.annotation.Nonnull
  public TlsCertificatesAndHostnamesValidityDays getValidityDays() {
    return validityDays;
  }

  public void setValidityDays(TlsCertificatesAndHostnamesValidityDays validityDays) {
    this.validityDays = validityDays;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest certificatePacksOrderAdvancedCertificateManagerCertificatePackRequest = (CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest) o;
    return Objects.equals(this.certificateAuthority, certificatePacksOrderAdvancedCertificateManagerCertificatePackRequest.certificateAuthority) &&
        Objects.equals(this.cloudflareBranding, certificatePacksOrderAdvancedCertificateManagerCertificatePackRequest.cloudflareBranding) &&
        Objects.equals(this.hosts, certificatePacksOrderAdvancedCertificateManagerCertificatePackRequest.hosts) &&
        Objects.equals(this.type, certificatePacksOrderAdvancedCertificateManagerCertificatePackRequest.type) &&
        Objects.equals(this.validationMethod, certificatePacksOrderAdvancedCertificateManagerCertificatePackRequest.validationMethod) &&
        Objects.equals(this.validityDays, certificatePacksOrderAdvancedCertificateManagerCertificatePackRequest.validityDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateAuthority, cloudflareBranding, hosts, type, validationMethod, validityDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest {\n");
    sb.append("    certificateAuthority: ").append(toIndentedString(certificateAuthority)).append("\n");
    sb.append("    cloudflareBranding: ").append(toIndentedString(cloudflareBranding)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validationMethod: ").append(toIndentedString(validationMethod)).append("\n");
    sb.append("    validityDays: ").append(toIndentedString(validityDays)).append("\n");
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
    openapiFields.add("certificate_authority");
    openapiFields.add("cloudflare_branding");
    openapiFields.add("hosts");
    openapiFields.add("type");
    openapiFields.add("validation_method");
    openapiFields.add("validity_days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("certificate_authority");
    openapiRequiredFields.add("hosts");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("validation_method");
    openapiRequiredFields.add("validity_days");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest is not found in the empty JSON string", CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `certificate_authority`
      TlsCertificatesAndHostnamesSchemasCertificateAuthority.validateJsonElement(jsonObj.get("certificate_authority"));
      // ensure the required json array is present
      if (jsonObj.get("hosts") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("hosts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hosts` to be an array in the JSON string but got `%s`", jsonObj.get("hosts").toString()));
      }
      // validate the required field `type`
      TlsCertificatesAndHostnamesAdvancedType.validateJsonElement(jsonObj.get("type"));
      // validate the required field `validation_method`
      TlsCertificatesAndHostnamesValidationMethod.validateJsonElement(jsonObj.get("validation_method"));
      // validate the required field `validity_days`
      TlsCertificatesAndHostnamesValidityDays.validateJsonElement(jsonObj.get("validity_days"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest>() {
           @Override
           public void write(JsonWriter out, CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest
  * @throws IOException if the JSON string is invalid with respect to CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest
  */
  public static CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest.class);
  }

 /**
  * Convert an instance of CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
