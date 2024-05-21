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
import cloudflare.sdk.models.TlsCertificatesAndHostnamesCertificatePackQuotaResponseAllOfResult;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesMessagesInner;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TlsCertificatesAndHostnamesCertificatePackQuotaResponse
 */
@JsonPropertyOrder({
  TlsCertificatesAndHostnamesCertificatePackQuotaResponse.JSON_PROPERTY_ERRORS,
  TlsCertificatesAndHostnamesCertificatePackQuotaResponse.JSON_PROPERTY_MESSAGES,
  TlsCertificatesAndHostnamesCertificatePackQuotaResponse.JSON_PROPERTY_SUCCESS,
  TlsCertificatesAndHostnamesCertificatePackQuotaResponse.JSON_PROPERTY_RESULT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-21T11:53:03.004303930+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TlsCertificatesAndHostnamesCertificatePackQuotaResponse {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<TlsCertificatesAndHostnamesMessagesInner> errors = new ArrayList<>();

  public static final String JSON_PROPERTY_MESSAGES = "messages";
  private List<TlsCertificatesAndHostnamesMessagesInner> messages = new ArrayList<>();

  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_RESULT = "result";
  private TlsCertificatesAndHostnamesCertificatePackQuotaResponseAllOfResult result;

  public TlsCertificatesAndHostnamesCertificatePackQuotaResponse() { 
  }

  public TlsCertificatesAndHostnamesCertificatePackQuotaResponse errors(List<TlsCertificatesAndHostnamesMessagesInner> errors) {
    this.errors = errors;
    return this;
  }

  public TlsCertificatesAndHostnamesCertificatePackQuotaResponse addErrorsItem(TlsCertificatesAndHostnamesMessagesInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TlsCertificatesAndHostnamesMessagesInner> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrors(List<TlsCertificatesAndHostnamesMessagesInner> errors) {
    this.errors = errors;
  }


  public TlsCertificatesAndHostnamesCertificatePackQuotaResponse messages(List<TlsCertificatesAndHostnamesMessagesInner> messages) {
    this.messages = messages;
    return this;
  }

  public TlsCertificatesAndHostnamesCertificatePackQuotaResponse addMessagesItem(TlsCertificatesAndHostnamesMessagesInner messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TlsCertificatesAndHostnamesMessagesInner> getMessages() {
    return messages;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessages(List<TlsCertificatesAndHostnamesMessagesInner> messages) {
    this.messages = messages;
  }


  public TlsCertificatesAndHostnamesCertificatePackQuotaResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return success
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public TlsCertificatesAndHostnamesCertificatePackQuotaResponse result(TlsCertificatesAndHostnamesCertificatePackQuotaResponseAllOfResult result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TlsCertificatesAndHostnamesCertificatePackQuotaResponseAllOfResult getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(TlsCertificatesAndHostnamesCertificatePackQuotaResponseAllOfResult result) {
    this.result = result;
  }


  /**
   * Return true if this tls-certificates-and-hostnames_certificate_pack_quota_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TlsCertificatesAndHostnamesCertificatePackQuotaResponse tlsCertificatesAndHostnamesCertificatePackQuotaResponse = (TlsCertificatesAndHostnamesCertificatePackQuotaResponse) o;
    return Objects.equals(this.errors, tlsCertificatesAndHostnamesCertificatePackQuotaResponse.errors) &&
        Objects.equals(this.messages, tlsCertificatesAndHostnamesCertificatePackQuotaResponse.messages) &&
        Objects.equals(this.success, tlsCertificatesAndHostnamesCertificatePackQuotaResponse.success) &&
        Objects.equals(this.result, tlsCertificatesAndHostnamesCertificatePackQuotaResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, messages, success, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TlsCertificatesAndHostnamesCertificatePackQuotaResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

    // add `errors` to the URL query string
    if (getErrors() != null) {
      for (int i = 0; i < getErrors().size(); i++) {
        if (getErrors().get(i) != null) {
          joiner.add(getErrors().get(i).toUrlQueryString(String.format("%serrors%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `messages` to the URL query string
    if (getMessages() != null) {
      for (int i = 0; i < getMessages().size(); i++) {
        if (getMessages().get(i) != null) {
          joiner.add(getMessages().get(i).toUrlQueryString(String.format("%smessages%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `success` to the URL query string
    if (getSuccess() != null) {
      joiner.add(String.format("%ssuccess%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSuccess()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `result` to the URL query string
    if (getResult() != null) {
      joiner.add(getResult().toUrlQueryString(prefix + "result" + suffix));
    }

    return joiner.toString();
  }
}

