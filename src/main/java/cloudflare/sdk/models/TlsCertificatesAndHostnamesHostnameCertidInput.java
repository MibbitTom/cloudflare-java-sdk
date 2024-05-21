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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TlsCertificatesAndHostnamesHostnameCertidInput
 */
@JsonPropertyOrder({
  TlsCertificatesAndHostnamesHostnameCertidInput.JSON_PROPERTY_CERT_ID,
  TlsCertificatesAndHostnamesHostnameCertidInput.JSON_PROPERTY_ENABLED,
  TlsCertificatesAndHostnamesHostnameCertidInput.JSON_PROPERTY_HOSTNAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-21T11:53:03.004303930+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TlsCertificatesAndHostnamesHostnameCertidInput {
  public static final String JSON_PROPERTY_CERT_ID = "cert_id";
  private String certId;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private JsonNullable<Boolean> enabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public TlsCertificatesAndHostnamesHostnameCertidInput() { 
  }

  public TlsCertificatesAndHostnamesHostnameCertidInput certId(String certId) {
    this.certId = certId;
    return this;
  }

   /**
   * Certificate identifier tag.
   * @return certId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CERT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCertId() {
    return certId;
  }


  @JsonProperty(JSON_PROPERTY_CERT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCertId(String certId) {
    this.certId = certId;
  }


  public TlsCertificatesAndHostnamesHostnameCertidInput enabled(Boolean enabled) {
    this.enabled = JsonNullable.<Boolean>of(enabled);
    return this;
  }

   /**
   * Indicates whether hostname-level authenticated origin pulls is enabled. A null value voids the association.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getEnabled() {
        return enabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getEnabled_JsonNullable() {
    return enabled;
  }
  
  @JsonProperty(JSON_PROPERTY_ENABLED)
  public void setEnabled_JsonNullable(JsonNullable<Boolean> enabled) {
    this.enabled = enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = JsonNullable.<Boolean>of(enabled);
  }


  public TlsCertificatesAndHostnamesHostnameCertidInput hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * The hostname on the origin for which the client certificate uploaded will be used.
   * @return hostname
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHostname() {
    return hostname;
  }


  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  /**
   * Return true if this tls-certificates-and-hostnames_hostname_certid_input object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TlsCertificatesAndHostnamesHostnameCertidInput tlsCertificatesAndHostnamesHostnameCertidInput = (TlsCertificatesAndHostnamesHostnameCertidInput) o;
    return Objects.equals(this.certId, tlsCertificatesAndHostnamesHostnameCertidInput.certId) &&
        equalsNullable(this.enabled, tlsCertificatesAndHostnamesHostnameCertidInput.enabled) &&
        Objects.equals(this.hostname, tlsCertificatesAndHostnamesHostnameCertidInput.hostname);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(certId, hashCodeNullable(enabled), hostname);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TlsCertificatesAndHostnamesHostnameCertidInput {\n");
    sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
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

    // add `cert_id` to the URL query string
    if (getCertId() != null) {
      joiner.add(String.format("%scert_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCertId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      joiner.add(String.format("%senabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `hostname` to the URL query string
    if (getHostname() != null) {
      joiner.add(String.format("%shostname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHostname()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

