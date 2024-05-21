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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesCertificateStatus;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesSchemasSignature;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesSchemasValidationMethod;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesVerificationInfo;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesVerificationType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TlsCertificatesAndHostnamesVerification
 */
@JsonPropertyOrder({
  TlsCertificatesAndHostnamesVerification.JSON_PROPERTY_BRAND_CHECK,
  TlsCertificatesAndHostnamesVerification.JSON_PROPERTY_CERT_PACK_UUID,
  TlsCertificatesAndHostnamesVerification.JSON_PROPERTY_CERTIFICATE_STATUS,
  TlsCertificatesAndHostnamesVerification.JSON_PROPERTY_SIGNATURE,
  TlsCertificatesAndHostnamesVerification.JSON_PROPERTY_VALIDATION_METHOD,
  TlsCertificatesAndHostnamesVerification.JSON_PROPERTY_VERIFICATION_INFO,
  TlsCertificatesAndHostnamesVerification.JSON_PROPERTY_VERIFICATION_STATUS,
  TlsCertificatesAndHostnamesVerification.JSON_PROPERTY_VERIFICATION_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-21T10:12:24.693742223+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TlsCertificatesAndHostnamesVerification {
  public static final String JSON_PROPERTY_BRAND_CHECK = "brand_check";
  private Boolean brandCheck;

  public static final String JSON_PROPERTY_CERT_PACK_UUID = "cert_pack_uuid";
  private String certPackUuid;

  public static final String JSON_PROPERTY_CERTIFICATE_STATUS = "certificate_status";
  private TlsCertificatesAndHostnamesCertificateStatus certificateStatus;

  public static final String JSON_PROPERTY_SIGNATURE = "signature";
  private TlsCertificatesAndHostnamesSchemasSignature signature;

  public static final String JSON_PROPERTY_VALIDATION_METHOD = "validation_method";
  private TlsCertificatesAndHostnamesSchemasValidationMethod validationMethod;

  public static final String JSON_PROPERTY_VERIFICATION_INFO = "verification_info";
  private TlsCertificatesAndHostnamesVerificationInfo verificationInfo;

  public static final String JSON_PROPERTY_VERIFICATION_STATUS = "verification_status";
  private Boolean verificationStatus;

  public static final String JSON_PROPERTY_VERIFICATION_TYPE = "verification_type";
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
  @JsonProperty(JSON_PROPERTY_BRAND_CHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBrandCheck() {
    return brandCheck;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_CHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_CERT_PACK_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCertPackUuid() {
    return certPackUuid;
  }


  @JsonProperty(JSON_PROPERTY_CERT_PACK_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_CERTIFICATE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TlsCertificatesAndHostnamesCertificateStatus getCertificateStatus() {
    return certificateStatus;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @JsonProperty(JSON_PROPERTY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TlsCertificatesAndHostnamesSchemasSignature getSignature() {
    return signature;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_VALIDATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TlsCertificatesAndHostnamesSchemasValidationMethod getValidationMethod() {
    return validationMethod;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_VERIFICATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TlsCertificatesAndHostnamesVerificationInfo getVerificationInfo() {
    return verificationInfo;
  }


  @JsonProperty(JSON_PROPERTY_VERIFICATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_VERIFICATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVerificationStatus() {
    return verificationStatus;
  }


  @JsonProperty(JSON_PROPERTY_VERIFICATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_VERIFICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TlsCertificatesAndHostnamesVerificationType getVerificationType() {
    return verificationType;
  }


  @JsonProperty(JSON_PROPERTY_VERIFICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerificationType(TlsCertificatesAndHostnamesVerificationType verificationType) {
    this.verificationType = verificationType;
  }


  /**
   * Return true if this tls-certificates-and-hostnames_verification object is equal to o.
   */
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `brand_check` to the URL query string
    if (getBrandCheck() != null) {
      joiner.add(String.format("%sbrand_check%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBrandCheck()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cert_pack_uuid` to the URL query string
    if (getCertPackUuid() != null) {
      joiner.add(String.format("%scert_pack_uuid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCertPackUuid()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `certificate_status` to the URL query string
    if (getCertificateStatus() != null) {
      joiner.add(String.format("%scertificate_status%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCertificateStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `signature` to the URL query string
    if (getSignature() != null) {
      joiner.add(String.format("%ssignature%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSignature()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `validation_method` to the URL query string
    if (getValidationMethod() != null) {
      joiner.add(String.format("%svalidation_method%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValidationMethod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `verification_info` to the URL query string
    if (getVerificationInfo() != null) {
      joiner.add(getVerificationInfo().toUrlQueryString(prefix + "verification_info" + suffix));
    }

    // add `verification_status` to the URL query string
    if (getVerificationStatus() != null) {
      joiner.add(String.format("%sverification_status%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVerificationStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `verification_type` to the URL query string
    if (getVerificationType() != null) {
      joiner.add(String.format("%sverification_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVerificationType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

