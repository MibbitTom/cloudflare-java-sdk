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
import org.openapitools.client.model.AaaMessagesInner;

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
 * PageShieldGetAPageShieldConnection4XXResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class PageShieldGetAPageShieldConnection4XXResponse {
  public static final String SERIALIZED_NAME_ADDED_AT = "added_at";
  @SerializedName(SERIALIZED_NAME_ADDED_AT)
  private Object addedAt;

  public static final String SERIALIZED_NAME_DOMAIN_REPORTED_MALICIOUS = "domain_reported_malicious";
  @SerializedName(SERIALIZED_NAME_DOMAIN_REPORTED_MALICIOUS)
  private Object domainReportedMalicious;

  public static final String SERIALIZED_NAME_FIRST_PAGE_URL = "first_page_url";
  @SerializedName(SERIALIZED_NAME_FIRST_PAGE_URL)
  private Object firstPageUrl;

  public static final String SERIALIZED_NAME_FIRST_SEEN_AT = "first_seen_at";
  @SerializedName(SERIALIZED_NAME_FIRST_SEEN_AT)
  private Object firstSeenAt;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private Object host;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Object id;

  public static final String SERIALIZED_NAME_LAST_SEEN_AT = "last_seen_at";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN_AT)
  private Object lastSeenAt;

  public static final String SERIALIZED_NAME_PAGE_URLS = "page_urls";
  @SerializedName(SERIALIZED_NAME_PAGE_URLS)
  private Object pageUrls;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private Object url;

  public static final String SERIALIZED_NAME_URL_CONTAINS_CDN_CGI_PATH = "url_contains_cdn_cgi_path";
  @SerializedName(SERIALIZED_NAME_URL_CONTAINS_CDN_CGI_PATH)
  private Object urlContainsCdnCgiPath;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<AaaMessagesInner> errors;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<AaaMessagesInner> messages;

  /**
   * Gets or Sets result
   */
  @JsonAdapter(ResultEnum.Adapter.class)
  public enum ResultEnum {
    NULL("null");

    private Object value;

    ResultEnum(Object value) {
      this.value = value;
    }

    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultEnum fromValue(Object value) {
      for (ResultEnum b : ResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultEnum read(final JsonReader jsonReader) throws IOException {
        Object value =  jsonReader.nextObject();
        return ResultEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Object value = jsonElement.getAsObject();
      ResultEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private ResultEnum result;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public PageShieldGetAPageShieldConnection4XXResponse() {
  }

  public PageShieldGetAPageShieldConnection4XXResponse addedAt(Object addedAt) {
    this.addedAt = addedAt;
    return this;
  }

   /**
   * Get addedAt
   * @return addedAt
  **/
  @javax.annotation.Nullable
  public Object getAddedAt() {
    return addedAt;
  }

  public void setAddedAt(Object addedAt) {
    this.addedAt = addedAt;
  }


  public PageShieldGetAPageShieldConnection4XXResponse domainReportedMalicious(Object domainReportedMalicious) {
    this.domainReportedMalicious = domainReportedMalicious;
    return this;
  }

   /**
   * Get domainReportedMalicious
   * @return domainReportedMalicious
  **/
  @javax.annotation.Nullable
  public Object getDomainReportedMalicious() {
    return domainReportedMalicious;
  }

  public void setDomainReportedMalicious(Object domainReportedMalicious) {
    this.domainReportedMalicious = domainReportedMalicious;
  }


  public PageShieldGetAPageShieldConnection4XXResponse firstPageUrl(Object firstPageUrl) {
    this.firstPageUrl = firstPageUrl;
    return this;
  }

   /**
   * Get firstPageUrl
   * @return firstPageUrl
  **/
  @javax.annotation.Nullable
  public Object getFirstPageUrl() {
    return firstPageUrl;
  }

  public void setFirstPageUrl(Object firstPageUrl) {
    this.firstPageUrl = firstPageUrl;
  }


  public PageShieldGetAPageShieldConnection4XXResponse firstSeenAt(Object firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
    return this;
  }

   /**
   * Get firstSeenAt
   * @return firstSeenAt
  **/
  @javax.annotation.Nullable
  public Object getFirstSeenAt() {
    return firstSeenAt;
  }

  public void setFirstSeenAt(Object firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
  }


  public PageShieldGetAPageShieldConnection4XXResponse host(Object host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable
  public Object getHost() {
    return host;
  }

  public void setHost(Object host) {
    this.host = host;
  }


  public PageShieldGetAPageShieldConnection4XXResponse id(Object id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }


  public PageShieldGetAPageShieldConnection4XXResponse lastSeenAt(Object lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
    return this;
  }

   /**
   * Get lastSeenAt
   * @return lastSeenAt
  **/
  @javax.annotation.Nullable
  public Object getLastSeenAt() {
    return lastSeenAt;
  }

  public void setLastSeenAt(Object lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
  }


  public PageShieldGetAPageShieldConnection4XXResponse pageUrls(Object pageUrls) {
    this.pageUrls = pageUrls;
    return this;
  }

   /**
   * Get pageUrls
   * @return pageUrls
  **/
  @javax.annotation.Nullable
  public Object getPageUrls() {
    return pageUrls;
  }

  public void setPageUrls(Object pageUrls) {
    this.pageUrls = pageUrls;
  }


  public PageShieldGetAPageShieldConnection4XXResponse url(Object url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  public Object getUrl() {
    return url;
  }

  public void setUrl(Object url) {
    this.url = url;
  }


  public PageShieldGetAPageShieldConnection4XXResponse urlContainsCdnCgiPath(Object urlContainsCdnCgiPath) {
    this.urlContainsCdnCgiPath = urlContainsCdnCgiPath;
    return this;
  }

   /**
   * Get urlContainsCdnCgiPath
   * @return urlContainsCdnCgiPath
  **/
  @javax.annotation.Nullable
  public Object getUrlContainsCdnCgiPath() {
    return urlContainsCdnCgiPath;
  }

  public void setUrlContainsCdnCgiPath(Object urlContainsCdnCgiPath) {
    this.urlContainsCdnCgiPath = urlContainsCdnCgiPath;
  }


  public PageShieldGetAPageShieldConnection4XXResponse errors(List<AaaMessagesInner> errors) {
    this.errors = errors;
    return this;
  }

  public PageShieldGetAPageShieldConnection4XXResponse addErrorsItem(AaaMessagesInner errorsItem) {
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
  public List<AaaMessagesInner> getErrors() {
    return errors;
  }

  public void setErrors(List<AaaMessagesInner> errors) {
    this.errors = errors;
  }


  public PageShieldGetAPageShieldConnection4XXResponse messages(List<AaaMessagesInner> messages) {
    this.messages = messages;
    return this;
  }

  public PageShieldGetAPageShieldConnection4XXResponse addMessagesItem(AaaMessagesInner messagesItem) {
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
  public List<AaaMessagesInner> getMessages() {
    return messages;
  }

  public void setMessages(List<AaaMessagesInner> messages) {
    this.messages = messages;
  }


  public PageShieldGetAPageShieldConnection4XXResponse result(ResultEnum result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public ResultEnum getResult() {
    return result;
  }

  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public PageShieldGetAPageShieldConnection4XXResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return success
  **/
  @javax.annotation.Nonnull
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageShieldGetAPageShieldConnection4XXResponse pageShieldGetAPageShieldConnection4XXResponse = (PageShieldGetAPageShieldConnection4XXResponse) o;
    return Objects.equals(this.addedAt, pageShieldGetAPageShieldConnection4XXResponse.addedAt) &&
        Objects.equals(this.domainReportedMalicious, pageShieldGetAPageShieldConnection4XXResponse.domainReportedMalicious) &&
        Objects.equals(this.firstPageUrl, pageShieldGetAPageShieldConnection4XXResponse.firstPageUrl) &&
        Objects.equals(this.firstSeenAt, pageShieldGetAPageShieldConnection4XXResponse.firstSeenAt) &&
        Objects.equals(this.host, pageShieldGetAPageShieldConnection4XXResponse.host) &&
        Objects.equals(this.id, pageShieldGetAPageShieldConnection4XXResponse.id) &&
        Objects.equals(this.lastSeenAt, pageShieldGetAPageShieldConnection4XXResponse.lastSeenAt) &&
        Objects.equals(this.pageUrls, pageShieldGetAPageShieldConnection4XXResponse.pageUrls) &&
        Objects.equals(this.url, pageShieldGetAPageShieldConnection4XXResponse.url) &&
        Objects.equals(this.urlContainsCdnCgiPath, pageShieldGetAPageShieldConnection4XXResponse.urlContainsCdnCgiPath) &&
        Objects.equals(this.errors, pageShieldGetAPageShieldConnection4XXResponse.errors) &&
        Objects.equals(this.messages, pageShieldGetAPageShieldConnection4XXResponse.messages) &&
        Objects.equals(this.result, pageShieldGetAPageShieldConnection4XXResponse.result) &&
        Objects.equals(this.success, pageShieldGetAPageShieldConnection4XXResponse.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedAt, domainReportedMalicious, firstPageUrl, firstSeenAt, host, id, lastSeenAt, pageUrls, url, urlContainsCdnCgiPath, errors, messages, result, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageShieldGetAPageShieldConnection4XXResponse {\n");
    sb.append("    addedAt: ").append(toIndentedString(addedAt)).append("\n");
    sb.append("    domainReportedMalicious: ").append(toIndentedString(domainReportedMalicious)).append("\n");
    sb.append("    firstPageUrl: ").append(toIndentedString(firstPageUrl)).append("\n");
    sb.append("    firstSeenAt: ").append(toIndentedString(firstSeenAt)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastSeenAt: ").append(toIndentedString(lastSeenAt)).append("\n");
    sb.append("    pageUrls: ").append(toIndentedString(pageUrls)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlContainsCdnCgiPath: ").append(toIndentedString(urlContainsCdnCgiPath)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
    openapiFields.add("added_at");
    openapiFields.add("domain_reported_malicious");
    openapiFields.add("first_page_url");
    openapiFields.add("first_seen_at");
    openapiFields.add("host");
    openapiFields.add("id");
    openapiFields.add("last_seen_at");
    openapiFields.add("page_urls");
    openapiFields.add("url");
    openapiFields.add("url_contains_cdn_cgi_path");
    openapiFields.add("errors");
    openapiFields.add("messages");
    openapiFields.add("result");
    openapiFields.add("success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("errors");
    openapiRequiredFields.add("messages");
    openapiRequiredFields.add("result");
    openapiRequiredFields.add("success");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PageShieldGetAPageShieldConnection4XXResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PageShieldGetAPageShieldConnection4XXResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageShieldGetAPageShieldConnection4XXResponse is not found in the empty JSON string", PageShieldGetAPageShieldConnection4XXResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PageShieldGetAPageShieldConnection4XXResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageShieldGetAPageShieldConnection4XXResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PageShieldGetAPageShieldConnection4XXResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }

      JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
      // validate the required field `errors` (array)
      for (int i = 0; i < jsonArrayerrors.size(); i++) {
        AaaMessagesInner.validateJsonElement(jsonArrayerrors.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
      }

      JsonArray jsonArraymessages = jsonObj.getAsJsonArray("messages");
      // validate the required field `messages` (array)
      for (int i = 0; i < jsonArraymessages.size(); i++) {
        AaaMessagesInner.validateJsonElement(jsonArraymessages.get(i));
      };
      // validate the required field `result`
      ResultEnum.validateJsonElement(jsonObj.get("result"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageShieldGetAPageShieldConnection4XXResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageShieldGetAPageShieldConnection4XXResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageShieldGetAPageShieldConnection4XXResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageShieldGetAPageShieldConnection4XXResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PageShieldGetAPageShieldConnection4XXResponse>() {
           @Override
           public void write(JsonWriter out, PageShieldGetAPageShieldConnection4XXResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageShieldGetAPageShieldConnection4XXResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PageShieldGetAPageShieldConnection4XXResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageShieldGetAPageShieldConnection4XXResponse
  * @throws IOException if the JSON string is invalid with respect to PageShieldGetAPageShieldConnection4XXResponse
  */
  public static PageShieldGetAPageShieldConnection4XXResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageShieldGetAPageShieldConnection4XXResponse.class);
  }

 /**
  * Convert an instance of PageShieldGetAPageShieldConnection4XXResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
