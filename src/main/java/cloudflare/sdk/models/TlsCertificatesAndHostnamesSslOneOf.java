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
import cloudflare.sdk.models.TlsCertificatesAndHostnamesCertificateAuthority;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesSslOneOfValidationErrorsInner;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesSslsettings;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesValidationRecord;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TlsCertificatesAndHostnamesSslOneOf
 */
@JsonPropertyOrder({
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_BUNDLE_METHOD,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_CERTIFICATE_AUTHORITY,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_CUSTOM_CERTIFICATE,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_CUSTOM_CSR_ID,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_CUSTOM_KEY,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_EXPIRES_ON,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_HOSTS,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_ID,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_ISSUER,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_METHOD,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_SERIAL_NUMBER,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_SETTINGS,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_SIGNATURE,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_STATUS,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_TYPE,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_UPLOADED_ON,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_VALIDATION_ERRORS,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_VALIDATION_RECORDS,
  TlsCertificatesAndHostnamesSslOneOf.JSON_PROPERTY_WILDCARD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-21T11:53:03.004303930+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TlsCertificatesAndHostnamesSslOneOf {
  /**
   * A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
   */
  public enum BundleMethodEnum {
    UBIQUITOUS("ubiquitous"),
    
    OPTIMAL("optimal"),
    
    FORCE("force");

    private String value;

    BundleMethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BundleMethodEnum fromValue(String value) {
      for (BundleMethodEnum b : BundleMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BUNDLE_METHOD = "bundle_method";
  private BundleMethodEnum bundleMethod = BundleMethodEnum.UBIQUITOUS;

  public static final String JSON_PROPERTY_CERTIFICATE_AUTHORITY = "certificate_authority";
  private TlsCertificatesAndHostnamesCertificateAuthority certificateAuthority;

  public static final String JSON_PROPERTY_CUSTOM_CERTIFICATE = "custom_certificate";
  private String customCertificate;

  public static final String JSON_PROPERTY_CUSTOM_CSR_ID = "custom_csr_id";
  private String customCsrId;

  public static final String JSON_PROPERTY_CUSTOM_KEY = "custom_key";
  private String customKey;

  public static final String JSON_PROPERTY_EXPIRES_ON = "expires_on";
  private OffsetDateTime expiresOn;

  public static final String JSON_PROPERTY_HOSTS = "hosts";
  private List<Object> hosts = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private String issuer;

  /**
   * Domain control validation (DCV) method used for this hostname.
   */
  public enum MethodEnum {
    HTTP("http"),
    
    TXT("txt"),
    
    EMAIL("email");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_METHOD = "method";
  private MethodEnum method;

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "serial_number";
  private String serialNumber;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private TlsCertificatesAndHostnamesSslsettings settings;

  public static final String JSON_PROPERTY_SIGNATURE = "signature";
  private String signature;

  /**
   * Status of the hostname&#39;s SSL certificates.
   */
  public enum StatusEnum {
    INITIALIZING("initializing"),
    
    PENDING_VALIDATION("pending_validation"),
    
    DELETED("deleted"),
    
    PENDING_ISSUANCE("pending_issuance"),
    
    PENDING_DEPLOYMENT("pending_deployment"),
    
    PENDING_DELETION("pending_deletion"),
    
    PENDING_EXPIRATION("pending_expiration"),
    
    EXPIRED("expired"),
    
    ACTIVE("active"),
    
    INITIALIZING_TIMED_OUT("initializing_timed_out"),
    
    VALIDATION_TIMED_OUT("validation_timed_out"),
    
    ISSUANCE_TIMED_OUT("issuance_timed_out"),
    
    DEPLOYMENT_TIMED_OUT("deployment_timed_out"),
    
    DELETION_TIMED_OUT("deletion_timed_out"),
    
    PENDING_CLEANUP("pending_cleanup"),
    
    STAGING_DEPLOYMENT("staging_deployment"),
    
    STAGING_ACTIVE("staging_active"),
    
    DEACTIVATING("deactivating"),
    
    INACTIVE("inactive"),
    
    BACKUP_ISSUED("backup_issued"),
    
    HOLDING_DEPLOYMENT("holding_deployment");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  /**
   * Level of validation to be used for this hostname. Domain validation (dv) must be used.
   */
  public enum TypeEnum {
    DV("dv");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_UPLOADED_ON = "uploaded_on";
  private OffsetDateTime uploadedOn;

  public static final String JSON_PROPERTY_VALIDATION_ERRORS = "validation_errors";
  private List<TlsCertificatesAndHostnamesSslOneOfValidationErrorsInner> validationErrors = new ArrayList<>();

  public static final String JSON_PROPERTY_VALIDATION_RECORDS = "validation_records";
  private List<TlsCertificatesAndHostnamesValidationRecord> validationRecords = new ArrayList<>();

  public static final String JSON_PROPERTY_WILDCARD = "wildcard";
  private Boolean wildcard;

  public TlsCertificatesAndHostnamesSslOneOf() { 
  }

  @JsonCreator
  public TlsCertificatesAndHostnamesSslOneOf(
    @JsonProperty(JSON_PROPERTY_STATUS) StatusEnum status, 
    @JsonProperty(JSON_PROPERTY_TYPE) TypeEnum type
  ) {
  this();
    this.status = status;
    this.type = type;
  }

  public TlsCertificatesAndHostnamesSslOneOf bundleMethod(BundleMethodEnum bundleMethod) {
    this.bundleMethod = bundleMethod;
    return this;
  }

   /**
   * A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
   * @return bundleMethod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUNDLE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BundleMethodEnum getBundleMethod() {
    return bundleMethod;
  }


  @JsonProperty(JSON_PROPERTY_BUNDLE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBundleMethod(BundleMethodEnum bundleMethod) {
    this.bundleMethod = bundleMethod;
  }


  public TlsCertificatesAndHostnamesSslOneOf certificateAuthority(TlsCertificatesAndHostnamesCertificateAuthority certificateAuthority) {
    this.certificateAuthority = certificateAuthority;
    return this;
  }

   /**
   * Get certificateAuthority
   * @return certificateAuthority
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CERTIFICATE_AUTHORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TlsCertificatesAndHostnamesCertificateAuthority getCertificateAuthority() {
    return certificateAuthority;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATE_AUTHORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCertificateAuthority(TlsCertificatesAndHostnamesCertificateAuthority certificateAuthority) {
    this.certificateAuthority = certificateAuthority;
  }


  public TlsCertificatesAndHostnamesSslOneOf customCertificate(String customCertificate) {
    this.customCertificate = customCertificate;
    return this;
  }

   /**
   * If a custom uploaded certificate is used.
   * @return customCertificate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomCertificate() {
    return customCertificate;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomCertificate(String customCertificate) {
    this.customCertificate = customCertificate;
  }


  public TlsCertificatesAndHostnamesSslOneOf customCsrId(String customCsrId) {
    this.customCsrId = customCsrId;
    return this;
  }

   /**
   * The identifier for the Custom CSR that was used.
   * @return customCsrId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_CSR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomCsrId() {
    return customCsrId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_CSR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomCsrId(String customCsrId) {
    this.customCsrId = customCsrId;
  }


  public TlsCertificatesAndHostnamesSslOneOf customKey(String customKey) {
    this.customKey = customKey;
    return this;
  }

   /**
   * The key for a custom uploaded certificate.
   * @return customKey
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomKey() {
    return customKey;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomKey(String customKey) {
    this.customKey = customKey;
  }


  public TlsCertificatesAndHostnamesSslOneOf expiresOn(OffsetDateTime expiresOn) {
    this.expiresOn = expiresOn;
    return this;
  }

   /**
   * The time the custom certificate expires on.
   * @return expiresOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRES_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExpiresOn() {
    return expiresOn;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresOn(OffsetDateTime expiresOn) {
    this.expiresOn = expiresOn;
  }


  public TlsCertificatesAndHostnamesSslOneOf hosts(List<Object> hosts) {
    this.hosts = hosts;
    return this;
  }

  public TlsCertificatesAndHostnamesSslOneOf addHostsItem(Object hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * A list of Hostnames on a custom uploaded certificate.
   * @return hosts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getHosts() {
    return hosts;
  }


  @JsonProperty(JSON_PROPERTY_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHosts(List<Object> hosts) {
    this.hosts = hosts;
  }


  public TlsCertificatesAndHostnamesSslOneOf id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Custom hostname SSL identifier tag.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public TlsCertificatesAndHostnamesSslOneOf issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * The issuer on a custom uploaded certificate.
   * @return issuer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuer() {
    return issuer;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public TlsCertificatesAndHostnamesSslOneOf method(MethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * Domain control validation (DCV) method used for this hostname.
   * @return method
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MethodEnum getMethod() {
    return method;
  }


  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public TlsCertificatesAndHostnamesSslOneOf serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * The serial number on a custom uploaded certificate.
   * @return serialNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSerialNumber() {
    return serialNumber;
  }


  @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public TlsCertificatesAndHostnamesSslOneOf settings(TlsCertificatesAndHostnamesSslsettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TlsCertificatesAndHostnamesSslsettings getSettings() {
    return settings;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettings(TlsCertificatesAndHostnamesSslsettings settings) {
    this.settings = settings;
  }


  public TlsCertificatesAndHostnamesSslOneOf signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * The signature on a custom uploaded certificate.
   * @return signature
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignature() {
    return signature;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignature(String signature) {
    this.signature = signature;
  }


   /**
   * Status of the hostname&#39;s SSL certificates.
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }




   /**
   * Level of validation to be used for this hostname. Domain validation (dv) must be used.
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }




  public TlsCertificatesAndHostnamesSslOneOf uploadedOn(OffsetDateTime uploadedOn) {
    this.uploadedOn = uploadedOn;
    return this;
  }

   /**
   * The time the custom certificate was uploaded.
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


  public TlsCertificatesAndHostnamesSslOneOf validationErrors(List<TlsCertificatesAndHostnamesSslOneOfValidationErrorsInner> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public TlsCertificatesAndHostnamesSslOneOf addValidationErrorsItem(TlsCertificatesAndHostnamesSslOneOfValidationErrorsInner validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * Domain validation errors that have been received by the certificate authority (CA).
   * @return validationErrors
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALIDATION_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TlsCertificatesAndHostnamesSslOneOfValidationErrorsInner> getValidationErrors() {
    return validationErrors;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidationErrors(List<TlsCertificatesAndHostnamesSslOneOfValidationErrorsInner> validationErrors) {
    this.validationErrors = validationErrors;
  }


  public TlsCertificatesAndHostnamesSslOneOf validationRecords(List<TlsCertificatesAndHostnamesValidationRecord> validationRecords) {
    this.validationRecords = validationRecords;
    return this;
  }

  public TlsCertificatesAndHostnamesSslOneOf addValidationRecordsItem(TlsCertificatesAndHostnamesValidationRecord validationRecordsItem) {
    if (this.validationRecords == null) {
      this.validationRecords = new ArrayList<>();
    }
    this.validationRecords.add(validationRecordsItem);
    return this;
  }

   /**
   * Get validationRecords
   * @return validationRecords
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALIDATION_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TlsCertificatesAndHostnamesValidationRecord> getValidationRecords() {
    return validationRecords;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidationRecords(List<TlsCertificatesAndHostnamesValidationRecord> validationRecords) {
    this.validationRecords = validationRecords;
  }


  public TlsCertificatesAndHostnamesSslOneOf wildcard(Boolean wildcard) {
    this.wildcard = wildcard;
    return this;
  }

   /**
   * Indicates whether the certificate covers a wildcard.
   * @return wildcard
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WILDCARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWildcard() {
    return wildcard;
  }


  @JsonProperty(JSON_PROPERTY_WILDCARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWildcard(Boolean wildcard) {
    this.wildcard = wildcard;
  }


  /**
   * Return true if this tls_certificates_and_hostnames_ssl_oneOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TlsCertificatesAndHostnamesSslOneOf tlsCertificatesAndHostnamesSslOneOf = (TlsCertificatesAndHostnamesSslOneOf) o;
    return Objects.equals(this.bundleMethod, tlsCertificatesAndHostnamesSslOneOf.bundleMethod) &&
        Objects.equals(this.certificateAuthority, tlsCertificatesAndHostnamesSslOneOf.certificateAuthority) &&
        Objects.equals(this.customCertificate, tlsCertificatesAndHostnamesSslOneOf.customCertificate) &&
        Objects.equals(this.customCsrId, tlsCertificatesAndHostnamesSslOneOf.customCsrId) &&
        Objects.equals(this.customKey, tlsCertificatesAndHostnamesSslOneOf.customKey) &&
        Objects.equals(this.expiresOn, tlsCertificatesAndHostnamesSslOneOf.expiresOn) &&
        Objects.equals(this.hosts, tlsCertificatesAndHostnamesSslOneOf.hosts) &&
        Objects.equals(this.id, tlsCertificatesAndHostnamesSslOneOf.id) &&
        Objects.equals(this.issuer, tlsCertificatesAndHostnamesSslOneOf.issuer) &&
        Objects.equals(this.method, tlsCertificatesAndHostnamesSslOneOf.method) &&
        Objects.equals(this.serialNumber, tlsCertificatesAndHostnamesSslOneOf.serialNumber) &&
        Objects.equals(this.settings, tlsCertificatesAndHostnamesSslOneOf.settings) &&
        Objects.equals(this.signature, tlsCertificatesAndHostnamesSslOneOf.signature) &&
        Objects.equals(this.status, tlsCertificatesAndHostnamesSslOneOf.status) &&
        Objects.equals(this.type, tlsCertificatesAndHostnamesSslOneOf.type) &&
        Objects.equals(this.uploadedOn, tlsCertificatesAndHostnamesSslOneOf.uploadedOn) &&
        Objects.equals(this.validationErrors, tlsCertificatesAndHostnamesSslOneOf.validationErrors) &&
        Objects.equals(this.validationRecords, tlsCertificatesAndHostnamesSslOneOf.validationRecords) &&
        Objects.equals(this.wildcard, tlsCertificatesAndHostnamesSslOneOf.wildcard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleMethod, certificateAuthority, customCertificate, customCsrId, customKey, expiresOn, hosts, id, issuer, method, serialNumber, settings, signature, status, type, uploadedOn, validationErrors, validationRecords, wildcard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TlsCertificatesAndHostnamesSslOneOf {\n");
    sb.append("    bundleMethod: ").append(toIndentedString(bundleMethod)).append("\n");
    sb.append("    certificateAuthority: ").append(toIndentedString(certificateAuthority)).append("\n");
    sb.append("    customCertificate: ").append(toIndentedString(customCertificate)).append("\n");
    sb.append("    customCsrId: ").append(toIndentedString(customCsrId)).append("\n");
    sb.append("    customKey: ").append(toIndentedString(customKey)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uploadedOn: ").append(toIndentedString(uploadedOn)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    validationRecords: ").append(toIndentedString(validationRecords)).append("\n");
    sb.append("    wildcard: ").append(toIndentedString(wildcard)).append("\n");
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

    // add `bundle_method` to the URL query string
    if (getBundleMethod() != null) {
      joiner.add(String.format("%sbundle_method%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBundleMethod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `certificate_authority` to the URL query string
    if (getCertificateAuthority() != null) {
      joiner.add(String.format("%scertificate_authority%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCertificateAuthority()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `custom_certificate` to the URL query string
    if (getCustomCertificate() != null) {
      joiner.add(String.format("%scustom_certificate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomCertificate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `custom_csr_id` to the URL query string
    if (getCustomCsrId() != null) {
      joiner.add(String.format("%scustom_csr_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomCsrId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `custom_key` to the URL query string
    if (getCustomKey() != null) {
      joiner.add(String.format("%scustom_key%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expires_on` to the URL query string
    if (getExpiresOn() != null) {
      joiner.add(String.format("%sexpires_on%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpiresOn()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `hosts` to the URL query string
    if (getHosts() != null) {
      for (int i = 0; i < getHosts().size(); i++) {
        joiner.add(String.format("%shosts%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getHosts().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `issuer` to the URL query string
    if (getIssuer() != null) {
      joiner.add(String.format("%sissuer%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIssuer()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `method` to the URL query string
    if (getMethod() != null) {
      joiner.add(String.format("%smethod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMethod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `serial_number` to the URL query string
    if (getSerialNumber() != null) {
      joiner.add(String.format("%sserial_number%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSerialNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `settings` to the URL query string
    if (getSettings() != null) {
      joiner.add(getSettings().toUrlQueryString(prefix + "settings" + suffix));
    }

    // add `signature` to the URL query string
    if (getSignature() != null) {
      joiner.add(String.format("%ssignature%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSignature()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `uploaded_on` to the URL query string
    if (getUploadedOn() != null) {
      joiner.add(String.format("%suploaded_on%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUploadedOn()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `validation_errors` to the URL query string
    if (getValidationErrors() != null) {
      for (int i = 0; i < getValidationErrors().size(); i++) {
        if (getValidationErrors().get(i) != null) {
          joiner.add(getValidationErrors().get(i).toUrlQueryString(String.format("%svalidation_errors%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `validation_records` to the URL query string
    if (getValidationRecords() != null) {
      for (int i = 0; i < getValidationRecords().size(); i++) {
        if (getValidationRecords().get(i) != null) {
          joiner.add(getValidationRecords().get(i).toUrlQueryString(String.format("%svalidation_records%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `wildcard` to the URL query string
    if (getWildcard() != null) {
      joiner.add(String.format("%swildcard%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWildcard()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

