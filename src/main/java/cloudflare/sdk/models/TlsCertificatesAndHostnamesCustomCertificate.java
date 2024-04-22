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
import cloudflare.sdk.models.TlsCertificatesAndHostnamesBundleMethod;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesGeoRestrictions;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesKeylessCertificate;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
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
 * TlsCertificatesAndHostnamesCustomCertificate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TlsCertificatesAndHostnamesCustomCertificate {
  public static final String SERIALIZED_NAME_BUNDLE_METHOD = "bundle_method";
  @SerializedName(SERIALIZED_NAME_BUNDLE_METHOD)
  private TlsCertificatesAndHostnamesBundleMethod bundleMethod = TlsCertificatesAndHostnamesBundleMethod.UBIQUITOUS;

  public static final String SERIALIZED_NAME_EXPIRES_ON = "expires_on";
  @SerializedName(SERIALIZED_NAME_EXPIRES_ON)
  private OffsetDateTime expiresOn;

  public static final String SERIALIZED_NAME_GEO_RESTRICTIONS = "geo_restrictions";
  @SerializedName(SERIALIZED_NAME_GEO_RESTRICTIONS)
  private TlsCertificatesAndHostnamesGeoRestrictions geoRestrictions;

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private List<String> hosts = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_KEYLESS_SERVER = "keyless_server";
  @SerializedName(SERIALIZED_NAME_KEYLESS_SERVER)
  private TlsCertificatesAndHostnamesKeylessCertificate keylessServer;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modified_on";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private String policy;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private BigDecimal priority = new BigDecimal("20");

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TlsCertificatesAndHostnamesStatus status;

  public static final String SERIALIZED_NAME_UPLOADED_ON = "uploaded_on";
  @SerializedName(SERIALIZED_NAME_UPLOADED_ON)
  private OffsetDateTime uploadedOn;

  public static final String SERIALIZED_NAME_ZONE_ID = "zone_id";
  @SerializedName(SERIALIZED_NAME_ZONE_ID)
  private String zoneId;

  public TlsCertificatesAndHostnamesCustomCertificate() {
  }

  public TlsCertificatesAndHostnamesCustomCertificate(
     OffsetDateTime expiresOn, 
     String id, 
     String issuer, 
     OffsetDateTime modifiedOn, 
     String signature, 
     OffsetDateTime uploadedOn, 
     String zoneId
  ) {
    this();
    this.expiresOn = expiresOn;
    this.id = id;
    this.issuer = issuer;
    this.modifiedOn = modifiedOn;
    this.signature = signature;
    this.uploadedOn = uploadedOn;
    this.zoneId = zoneId;
  }

  public TlsCertificatesAndHostnamesCustomCertificate bundleMethod(TlsCertificatesAndHostnamesBundleMethod bundleMethod) {
    this.bundleMethod = bundleMethod;
    return this;
  }

   /**
   * Get bundleMethod
   * @return bundleMethod
  **/
  @javax.annotation.Nonnull
  public TlsCertificatesAndHostnamesBundleMethod getBundleMethod() {
    return bundleMethod;
  }

  public void setBundleMethod(TlsCertificatesAndHostnamesBundleMethod bundleMethod) {
    this.bundleMethod = bundleMethod;
  }


   /**
   * When the certificate from the authority expires.
   * @return expiresOn
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getExpiresOn() {
    return expiresOn;
  }



  public TlsCertificatesAndHostnamesCustomCertificate geoRestrictions(TlsCertificatesAndHostnamesGeoRestrictions geoRestrictions) {
    this.geoRestrictions = geoRestrictions;
    return this;
  }

   /**
   * Get geoRestrictions
   * @return geoRestrictions
  **/
  @javax.annotation.Nullable
  public TlsCertificatesAndHostnamesGeoRestrictions getGeoRestrictions() {
    return geoRestrictions;
  }

  public void setGeoRestrictions(TlsCertificatesAndHostnamesGeoRestrictions geoRestrictions) {
    this.geoRestrictions = geoRestrictions;
  }


  public TlsCertificatesAndHostnamesCustomCertificate hosts(List<String> hosts) {
    this.hosts = hosts;
    return this;
  }

  public TlsCertificatesAndHostnamesCustomCertificate addHostsItem(String hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * Get hosts
   * @return hosts
  **/
  @javax.annotation.Nonnull
  public List<String> getHosts() {
    return hosts;
  }

  public void setHosts(List<String> hosts) {
    this.hosts = hosts;
  }


   /**
   * Identifier
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }



   /**
   * The certificate authority that issued the certificate.
   * @return issuer
  **/
  @javax.annotation.Nonnull
  public String getIssuer() {
    return issuer;
  }



  public TlsCertificatesAndHostnamesCustomCertificate keylessServer(TlsCertificatesAndHostnamesKeylessCertificate keylessServer) {
    this.keylessServer = keylessServer;
    return this;
  }

   /**
   * Get keylessServer
   * @return keylessServer
  **/
  @javax.annotation.Nullable
  public TlsCertificatesAndHostnamesKeylessCertificate getKeylessServer() {
    return keylessServer;
  }

  public void setKeylessServer(TlsCertificatesAndHostnamesKeylessCertificate keylessServer) {
    this.keylessServer = keylessServer;
  }


   /**
   * When the certificate was last modified.
   * @return modifiedOn
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }



  public TlsCertificatesAndHostnamesCustomCertificate policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Specify the policy that determines the region where your private key will be held locally. HTTPS connections to any excluded data center will still be fully encrypted, but will incur some latency while Keyless SSL is used to complete the handshake with the nearest allowed data center. Any combination of countries, specified by their two letter country code (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements) can be chosen, such as &#39;country: IN&#39;, as well as &#39;region: EU&#39; which refers to the EU region. If there are too few data centers satisfying the policy, it will be rejected.
   * @return policy
  **/
  @javax.annotation.Nullable
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }


  public TlsCertificatesAndHostnamesCustomCertificate priority(BigDecimal priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The order/priority in which the certificate will be used in a request. The higher priority will break ties across overlapping &#39;legacy_custom&#39; certificates, but &#39;legacy_custom&#39; certificates will always supercede &#39;sni_custom&#39; certificates.
   * @return priority
  **/
  @javax.annotation.Nonnull
  public BigDecimal getPriority() {
    return priority;
  }

  public void setPriority(BigDecimal priority) {
    this.priority = priority;
  }


   /**
   * The type of hash used for the certificate.
   * @return signature
  **/
  @javax.annotation.Nonnull
  public String getSignature() {
    return signature;
  }



  public TlsCertificatesAndHostnamesCustomCertificate status(TlsCertificatesAndHostnamesStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public TlsCertificatesAndHostnamesStatus getStatus() {
    return status;
  }

  public void setStatus(TlsCertificatesAndHostnamesStatus status) {
    this.status = status;
  }


   /**
   * When the certificate was uploaded to Cloudflare.
   * @return uploadedOn
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getUploadedOn() {
    return uploadedOn;
  }



   /**
   * Identifier
   * @return zoneId
  **/
  @javax.annotation.Nonnull
  public String getZoneId() {
    return zoneId;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TlsCertificatesAndHostnamesCustomCertificate tlsCertificatesAndHostnamesCustomCertificate = (TlsCertificatesAndHostnamesCustomCertificate) o;
    return Objects.equals(this.bundleMethod, tlsCertificatesAndHostnamesCustomCertificate.bundleMethod) &&
        Objects.equals(this.expiresOn, tlsCertificatesAndHostnamesCustomCertificate.expiresOn) &&
        Objects.equals(this.geoRestrictions, tlsCertificatesAndHostnamesCustomCertificate.geoRestrictions) &&
        Objects.equals(this.hosts, tlsCertificatesAndHostnamesCustomCertificate.hosts) &&
        Objects.equals(this.id, tlsCertificatesAndHostnamesCustomCertificate.id) &&
        Objects.equals(this.issuer, tlsCertificatesAndHostnamesCustomCertificate.issuer) &&
        Objects.equals(this.keylessServer, tlsCertificatesAndHostnamesCustomCertificate.keylessServer) &&
        Objects.equals(this.modifiedOn, tlsCertificatesAndHostnamesCustomCertificate.modifiedOn) &&
        Objects.equals(this.policy, tlsCertificatesAndHostnamesCustomCertificate.policy) &&
        Objects.equals(this.priority, tlsCertificatesAndHostnamesCustomCertificate.priority) &&
        Objects.equals(this.signature, tlsCertificatesAndHostnamesCustomCertificate.signature) &&
        Objects.equals(this.status, tlsCertificatesAndHostnamesCustomCertificate.status) &&
        Objects.equals(this.uploadedOn, tlsCertificatesAndHostnamesCustomCertificate.uploadedOn) &&
        Objects.equals(this.zoneId, tlsCertificatesAndHostnamesCustomCertificate.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleMethod, expiresOn, geoRestrictions, hosts, id, issuer, keylessServer, modifiedOn, policy, priority, signature, status, uploadedOn, zoneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TlsCertificatesAndHostnamesCustomCertificate {\n");
    sb.append("    bundleMethod: ").append(toIndentedString(bundleMethod)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    geoRestrictions: ").append(toIndentedString(geoRestrictions)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    keylessServer: ").append(toIndentedString(keylessServer)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uploadedOn: ").append(toIndentedString(uploadedOn)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
    openapiFields.add("bundle_method");
    openapiFields.add("expires_on");
    openapiFields.add("geo_restrictions");
    openapiFields.add("hosts");
    openapiFields.add("id");
    openapiFields.add("issuer");
    openapiFields.add("keyless_server");
    openapiFields.add("modified_on");
    openapiFields.add("policy");
    openapiFields.add("priority");
    openapiFields.add("signature");
    openapiFields.add("status");
    openapiFields.add("uploaded_on");
    openapiFields.add("zone_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bundle_method");
    openapiRequiredFields.add("expires_on");
    openapiRequiredFields.add("hosts");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("issuer");
    openapiRequiredFields.add("modified_on");
    openapiRequiredFields.add("priority");
    openapiRequiredFields.add("signature");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("uploaded_on");
    openapiRequiredFields.add("zone_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TlsCertificatesAndHostnamesCustomCertificate
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TlsCertificatesAndHostnamesCustomCertificate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TlsCertificatesAndHostnamesCustomCertificate is not found in the empty JSON string", TlsCertificatesAndHostnamesCustomCertificate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TlsCertificatesAndHostnamesCustomCertificate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TlsCertificatesAndHostnamesCustomCertificate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TlsCertificatesAndHostnamesCustomCertificate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `bundle_method`
      TlsCertificatesAndHostnamesBundleMethod.validateJsonElement(jsonObj.get("bundle_method"));
      // validate the optional field `geo_restrictions`
      if (jsonObj.get("geo_restrictions") != null && !jsonObj.get("geo_restrictions").isJsonNull()) {
        TlsCertificatesAndHostnamesGeoRestrictions.validateJsonElement(jsonObj.get("geo_restrictions"));
      }
      // ensure the required json array is present
      if (jsonObj.get("hosts") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("hosts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hosts` to be an array in the JSON string but got `%s`", jsonObj.get("hosts").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
      // validate the optional field `keyless_server`
      if (jsonObj.get("keyless_server") != null && !jsonObj.get("keyless_server").isJsonNull()) {
        TlsCertificatesAndHostnamesKeylessCertificate.validateJsonElement(jsonObj.get("keyless_server"));
      }
      if ((jsonObj.get("policy") != null && !jsonObj.get("policy").isJsonNull()) && !jsonObj.get("policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy").toString()));
      }
      if (!jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
      // validate the required field `status`
      TlsCertificatesAndHostnamesStatus.validateJsonElement(jsonObj.get("status"));
      if (!jsonObj.get("zone_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zone_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zone_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TlsCertificatesAndHostnamesCustomCertificate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TlsCertificatesAndHostnamesCustomCertificate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TlsCertificatesAndHostnamesCustomCertificate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TlsCertificatesAndHostnamesCustomCertificate.class));

       return (TypeAdapter<T>) new TypeAdapter<TlsCertificatesAndHostnamesCustomCertificate>() {
           @Override
           public void write(JsonWriter out, TlsCertificatesAndHostnamesCustomCertificate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TlsCertificatesAndHostnamesCustomCertificate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TlsCertificatesAndHostnamesCustomCertificate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TlsCertificatesAndHostnamesCustomCertificate
  * @throws IOException if the JSON string is invalid with respect to TlsCertificatesAndHostnamesCustomCertificate
  */
  public static TlsCertificatesAndHostnamesCustomCertificate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TlsCertificatesAndHostnamesCustomCertificate.class);
  }

 /**
  * Convert an instance of TlsCertificatesAndHostnamesCustomCertificate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
