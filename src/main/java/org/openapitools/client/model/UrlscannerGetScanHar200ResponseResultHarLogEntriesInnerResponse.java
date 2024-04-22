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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponseContent;
import org.openapitools.client.model.UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponseHeadersInner;

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
 * UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse {
  public static final String SERIALIZED_NAME_TRANSFER_SIZE = "_transferSize";
  @SerializedName(SERIALIZED_NAME_TRANSFER_SIZE)
  private BigDecimal transferSize;

  public static final String SERIALIZED_NAME_BODY_SIZE = "bodySize";
  @SerializedName(SERIALIZED_NAME_BODY_SIZE)
  private BigDecimal bodySize;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponseContent content;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponseHeadersInner> headers = new ArrayList<>();

  public static final String SERIALIZED_NAME_HEADERS_SIZE = "headersSize";
  @SerializedName(SERIALIZED_NAME_HEADERS_SIZE)
  private BigDecimal headersSize;

  public static final String SERIALIZED_NAME_HTTP_VERSION = "httpVersion";
  @SerializedName(SERIALIZED_NAME_HTTP_VERSION)
  private String httpVersion;

  public static final String SERIALIZED_NAME_REDIRECT_U_R_L = "redirectURL";
  @SerializedName(SERIALIZED_NAME_REDIRECT_U_R_L)
  private String redirectURL;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BigDecimal status;

  public static final String SERIALIZED_NAME_STATUS_TEXT = "statusText";
  @SerializedName(SERIALIZED_NAME_STATUS_TEXT)
  private String statusText;

  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse() {
  }

  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse transferSize(BigDecimal transferSize) {
    this.transferSize = transferSize;
    return this;
  }

   /**
   * Get transferSize
   * @return transferSize
  **/
  @javax.annotation.Nonnull
  public BigDecimal getTransferSize() {
    return transferSize;
  }

  public void setTransferSize(BigDecimal transferSize) {
    this.transferSize = transferSize;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse bodySize(BigDecimal bodySize) {
    this.bodySize = bodySize;
    return this;
  }

   /**
   * Get bodySize
   * @return bodySize
  **/
  @javax.annotation.Nonnull
  public BigDecimal getBodySize() {
    return bodySize;
  }

  public void setBodySize(BigDecimal bodySize) {
    this.bodySize = bodySize;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse content(UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponseContent content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nonnull
  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponseContent getContent() {
    return content;
  }

  public void setContent(UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponseContent content) {
    this.content = content;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse headers(List<UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponseHeadersInner> headers) {
    this.headers = headers;
    return this;
  }

  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse addHeadersItem(UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponseHeadersInner headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nonnull
  public List<UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponseHeadersInner> getHeaders() {
    return headers;
  }

  public void setHeaders(List<UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponseHeadersInner> headers) {
    this.headers = headers;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse headersSize(BigDecimal headersSize) {
    this.headersSize = headersSize;
    return this;
  }

   /**
   * Get headersSize
   * @return headersSize
  **/
  @javax.annotation.Nonnull
  public BigDecimal getHeadersSize() {
    return headersSize;
  }

  public void setHeadersSize(BigDecimal headersSize) {
    this.headersSize = headersSize;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse httpVersion(String httpVersion) {
    this.httpVersion = httpVersion;
    return this;
  }

   /**
   * Get httpVersion
   * @return httpVersion
  **/
  @javax.annotation.Nonnull
  public String getHttpVersion() {
    return httpVersion;
  }

  public void setHttpVersion(String httpVersion) {
    this.httpVersion = httpVersion;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse redirectURL(String redirectURL) {
    this.redirectURL = redirectURL;
    return this;
  }

   /**
   * Get redirectURL
   * @return redirectURL
  **/
  @javax.annotation.Nonnull
  public String getRedirectURL() {
    return redirectURL;
  }

  public void setRedirectURL(String redirectURL) {
    this.redirectURL = redirectURL;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse status(BigDecimal status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }


  public UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse statusText(String statusText) {
    this.statusText = statusText;
    return this;
  }

   /**
   * Get statusText
   * @return statusText
  **/
  @javax.annotation.Nonnull
  public String getStatusText() {
    return statusText;
  }

  public void setStatusText(String statusText) {
    this.statusText = statusText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse urlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse = (UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse) o;
    return Objects.equals(this.transferSize, urlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.transferSize) &&
        Objects.equals(this.bodySize, urlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.bodySize) &&
        Objects.equals(this.content, urlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.content) &&
        Objects.equals(this.headers, urlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.headers) &&
        Objects.equals(this.headersSize, urlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.headersSize) &&
        Objects.equals(this.httpVersion, urlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.httpVersion) &&
        Objects.equals(this.redirectURL, urlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.redirectURL) &&
        Objects.equals(this.status, urlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.status) &&
        Objects.equals(this.statusText, urlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.statusText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferSize, bodySize, content, headers, headersSize, httpVersion, redirectURL, status, statusText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse {\n");
    sb.append("    transferSize: ").append(toIndentedString(transferSize)).append("\n");
    sb.append("    bodySize: ").append(toIndentedString(bodySize)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    headersSize: ").append(toIndentedString(headersSize)).append("\n");
    sb.append("    httpVersion: ").append(toIndentedString(httpVersion)).append("\n");
    sb.append("    redirectURL: ").append(toIndentedString(redirectURL)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
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
    openapiFields.add("_transferSize");
    openapiFields.add("bodySize");
    openapiFields.add("content");
    openapiFields.add("headers");
    openapiFields.add("headersSize");
    openapiFields.add("httpVersion");
    openapiFields.add("redirectURL");
    openapiFields.add("status");
    openapiFields.add("statusText");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("_transferSize");
    openapiRequiredFields.add("bodySize");
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("headers");
    openapiRequiredFields.add("headersSize");
    openapiRequiredFields.add("httpVersion");
    openapiRequiredFields.add("redirectURL");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("statusText");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse is not found in the empty JSON string", UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `content`
      UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponseContent.validateJsonElement(jsonObj.get("content"));
      // ensure the json data is an array
      if (!jsonObj.get("headers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `headers` to be an array in the JSON string but got `%s`", jsonObj.get("headers").toString()));
      }

      JsonArray jsonArrayheaders = jsonObj.getAsJsonArray("headers");
      // validate the required field `headers` (array)
      for (int i = 0; i < jsonArrayheaders.size(); i++) {
        UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponseHeadersInner.validateJsonElement(jsonArrayheaders.get(i));
      };
      if (!jsonObj.get("httpVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("httpVersion").toString()));
      }
      if (!jsonObj.get("redirectURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirectURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirectURL").toString()));
      }
      if (!jsonObj.get("statusText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusText").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse>() {
           @Override
           public void write(JsonWriter out, UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse
  * @throws IOException if the JSON string is invalid with respect to UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse
  */
  public static UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse.class);
  }

 /**
  * Convert an instance of UrlscannerGetScanHar200ResponseResultHarLogEntriesInnerResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
