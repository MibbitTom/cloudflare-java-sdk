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
import cloudflare.sdk.models.TlsCertificatesAndHostnamesZoneAuthenticatedOriginPullComponentsSchemasStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull
 */
@JsonPropertyOrder({
  TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.JSON_PROPERTY_CERTIFICATE,
  TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.JSON_PROPERTY_ENABLED,
  TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.JSON_PROPERTY_ID,
  TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.JSON_PROPERTY_PRIVATE_KEY,
  TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.JSON_PROPERTY_EXPIRES_ON,
  TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.JSON_PROPERTY_ISSUER,
  TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.JSON_PROPERTY_SIGNATURE,
  TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.JSON_PROPERTY_STATUS,
  TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.JSON_PROPERTY_UPLOADED_ON
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-21T10:12:24.693742223+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull {
  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  private String certificate;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PRIVATE_KEY = "private_key";
  private String privateKey;

  public static final String JSON_PROPERTY_EXPIRES_ON = "expires_on";
  private OffsetDateTime expiresOn;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private String issuer;

  public static final String JSON_PROPERTY_SIGNATURE = "signature";
  private String signature;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TlsCertificatesAndHostnamesZoneAuthenticatedOriginPullComponentsSchemasStatus status;

  public static final String JSON_PROPERTY_UPLOADED_ON = "uploaded_on";
  private OffsetDateTime uploadedOn;

  public TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull() { 
  }

  @JsonCreator
  public TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_EXPIRES_ON) OffsetDateTime expiresOn, 
    @JsonProperty(JSON_PROPERTY_ISSUER) String issuer, 
    @JsonProperty(JSON_PROPERTY_SIGNATURE) String signature
  ) {
  this();
    this.id = id;
    this.expiresOn = expiresOn;
    this.issuer = issuer;
    this.signature = signature;
  }

  public TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * The zone&#39;s leaf certificate.
   * @return certificate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCertificate() {
    return certificate;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  public TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether zone-level authenticated origin pulls is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


   /**
   * Identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * The zone&#39;s private key.
   * @return privateKey
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrivateKey() {
    return privateKey;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


   /**
   * When the certificate from the authority expires.
   * @return expiresOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRES_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExpiresOn() {
    return expiresOn;
  }




   /**
   * The certificate authority that issued the certificate.
   * @return issuer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuer() {
    return issuer;
  }




   /**
   * The type of hash used for the certificate.
   * @return signature
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignature() {
    return signature;
  }




  public TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull status(TlsCertificatesAndHostnamesZoneAuthenticatedOriginPullComponentsSchemasStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TlsCertificatesAndHostnamesZoneAuthenticatedOriginPullComponentsSchemasStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TlsCertificatesAndHostnamesZoneAuthenticatedOriginPullComponentsSchemasStatus status) {
    this.status = status;
  }


  public TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull uploadedOn(OffsetDateTime uploadedOn) {
    this.uploadedOn = uploadedOn;
    return this;
  }

   /**
   * This is the time the certificate was uploaded.
   * @return uploadedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPLOADED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUploadedOn() {
    return uploadedOn;
  }


  @JsonProperty(JSON_PROPERTY_UPLOADED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadedOn(OffsetDateTime uploadedOn) {
    this.uploadedOn = uploadedOn;
  }


  /**
   * Return true if this tls-certificates-and-hostnames_zone-authenticated-origin-pull object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull tlsCertificatesAndHostnamesZoneAuthenticatedOriginPull = (TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull) o;
    return Objects.equals(this.certificate, tlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.certificate) &&
        Objects.equals(this.enabled, tlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.enabled) &&
        Objects.equals(this.id, tlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.id) &&
        Objects.equals(this.privateKey, tlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.privateKey) &&
        Objects.equals(this.expiresOn, tlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.expiresOn) &&
        Objects.equals(this.issuer, tlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.issuer) &&
        Objects.equals(this.signature, tlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.signature) &&
        Objects.equals(this.status, tlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.status) &&
        Objects.equals(this.uploadedOn, tlsCertificatesAndHostnamesZoneAuthenticatedOriginPull.uploadedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, enabled, id, privateKey, expiresOn, issuer, signature, status, uploadedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TlsCertificatesAndHostnamesZoneAuthenticatedOriginPull {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
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

    // add `certificate` to the URL query string
    if (getCertificate() != null) {
      joiner.add(String.format("%scertificate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCertificate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expires_on` to the URL query string
    if (getExpiresOn() != null) {
      joiner.add(String.format("%sexpires_on%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpiresOn()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `issuer` to the URL query string
    if (getIssuer() != null) {
      joiner.add(String.format("%sissuer%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIssuer()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `signature` to the URL query string
    if (getSignature() != null) {
      joiner.add(String.format("%ssignature%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSignature()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `uploaded_on` to the URL query string
    if (getUploadedOn() != null) {
      joiner.add(String.format("%suploaded_on%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUploadedOn()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

