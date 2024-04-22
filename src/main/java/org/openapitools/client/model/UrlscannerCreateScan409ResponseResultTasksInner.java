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
import org.openapitools.client.model.UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom;
import org.openapitools.client.model.UrlscannerSearchScans400ResponseMessagesInner;

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
 * UrlscannerCreateScan409ResponseResultTasksInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class UrlscannerCreateScan409ResponseResultTasksInner {
  public static final String SERIALIZED_NAME_CLIENT_LOCATION = "clientLocation";
  @SerializedName(SERIALIZED_NAME_CLIENT_LOCATION)
  private String clientLocation;

  /**
   * Gets or Sets clientType
   */
  @JsonAdapter(ClientTypeEnum.Adapter.class)
  public enum ClientTypeEnum {
    SITE("Site"),
    
    AUTOMATIC("Automatic"),
    
    API("Api");

    private String value;

    ClientTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClientTypeEnum fromValue(String value) {
      for (ClientTypeEnum b : ClientTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ClientTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClientTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClientTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ClientTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ClientTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CLIENT_TYPE = "clientType";
  @SerializedName(SERIALIZED_NAME_CLIENT_TYPE)
  private ClientTypeEnum clientType;

  public static final String SERIALIZED_NAME_EFFECTIVE_URL = "effectiveUrl";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_URL)
  private String effectiveUrl;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<UrlscannerSearchScans400ResponseMessagesInner> errors = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCANNED_FROM = "scannedFrom";
  @SerializedName(SERIALIZED_NAME_SCANNED_FROM)
  private UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom scannedFrom;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    QUEUED("Queued"),
    
    INPROGRESS("InProgress"),
    
    INPOSTPROCESSING("InPostProcessing"),
    
    FINISHED("Finished");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private String time;

  public static final String SERIALIZED_NAME_TIME_END = "timeEnd";
  @SerializedName(SERIALIZED_NAME_TIME_END)
  private String timeEnd;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  /**
   * Gets or Sets visibility
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    PUBLIC("Public"),
    
    UNLISTED("Unlisted");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VisibilityEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      VisibilityEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private VisibilityEnum visibility;

  public UrlscannerCreateScan409ResponseResultTasksInner() {
  }

  public UrlscannerCreateScan409ResponseResultTasksInner clientLocation(String clientLocation) {
    this.clientLocation = clientLocation;
    return this;
  }

   /**
   * Submitter location
   * @return clientLocation
  **/
  @javax.annotation.Nonnull
  public String getClientLocation() {
    return clientLocation;
  }

  public void setClientLocation(String clientLocation) {
    this.clientLocation = clientLocation;
  }


  public UrlscannerCreateScan409ResponseResultTasksInner clientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
    return this;
  }

   /**
   * Get clientType
   * @return clientType
  **/
  @javax.annotation.Nonnull
  public ClientTypeEnum getClientType() {
    return clientType;
  }

  public void setClientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
  }


  public UrlscannerCreateScan409ResponseResultTasksInner effectiveUrl(String effectiveUrl) {
    this.effectiveUrl = effectiveUrl;
    return this;
  }

   /**
   * URL of the primary request, after all HTTP redirects
   * @return effectiveUrl
  **/
  @javax.annotation.Nonnull
  public String getEffectiveUrl() {
    return effectiveUrl;
  }

  public void setEffectiveUrl(String effectiveUrl) {
    this.effectiveUrl = effectiveUrl;
  }


  public UrlscannerCreateScan409ResponseResultTasksInner errors(List<UrlscannerSearchScans400ResponseMessagesInner> errors) {
    this.errors = errors;
    return this;
  }

  public UrlscannerCreateScan409ResponseResultTasksInner addErrorsItem(UrlscannerSearchScans400ResponseMessagesInner errorsItem) {
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
  public List<UrlscannerSearchScans400ResponseMessagesInner> getErrors() {
    return errors;
  }

  public void setErrors(List<UrlscannerSearchScans400ResponseMessagesInner> errors) {
    this.errors = errors;
  }


  public UrlscannerCreateScan409ResponseResultTasksInner scannedFrom(UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom scannedFrom) {
    this.scannedFrom = scannedFrom;
    return this;
  }

   /**
   * Get scannedFrom
   * @return scannedFrom
  **/
  @javax.annotation.Nonnull
  public UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom getScannedFrom() {
    return scannedFrom;
  }

  public void setScannedFrom(UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom scannedFrom) {
    this.scannedFrom = scannedFrom;
  }


  public UrlscannerCreateScan409ResponseResultTasksInner status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public UrlscannerCreateScan409ResponseResultTasksInner success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nonnull
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public UrlscannerCreateScan409ResponseResultTasksInner time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nonnull
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  public UrlscannerCreateScan409ResponseResultTasksInner timeEnd(String timeEnd) {
    this.timeEnd = timeEnd;
    return this;
  }

   /**
   * Get timeEnd
   * @return timeEnd
  **/
  @javax.annotation.Nonnull
  public String getTimeEnd() {
    return timeEnd;
  }

  public void setTimeEnd(String timeEnd) {
    this.timeEnd = timeEnd;
  }


  public UrlscannerCreateScan409ResponseResultTasksInner url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Submitted URL
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public UrlscannerCreateScan409ResponseResultTasksInner uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Scan ID
   * @return uuid
  **/
  @javax.annotation.Nonnull
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public UrlscannerCreateScan409ResponseResultTasksInner visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nonnull
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlscannerCreateScan409ResponseResultTasksInner urlscannerCreateScan409ResponseResultTasksInner = (UrlscannerCreateScan409ResponseResultTasksInner) o;
    return Objects.equals(this.clientLocation, urlscannerCreateScan409ResponseResultTasksInner.clientLocation) &&
        Objects.equals(this.clientType, urlscannerCreateScan409ResponseResultTasksInner.clientType) &&
        Objects.equals(this.effectiveUrl, urlscannerCreateScan409ResponseResultTasksInner.effectiveUrl) &&
        Objects.equals(this.errors, urlscannerCreateScan409ResponseResultTasksInner.errors) &&
        Objects.equals(this.scannedFrom, urlscannerCreateScan409ResponseResultTasksInner.scannedFrom) &&
        Objects.equals(this.status, urlscannerCreateScan409ResponseResultTasksInner.status) &&
        Objects.equals(this.success, urlscannerCreateScan409ResponseResultTasksInner.success) &&
        Objects.equals(this.time, urlscannerCreateScan409ResponseResultTasksInner.time) &&
        Objects.equals(this.timeEnd, urlscannerCreateScan409ResponseResultTasksInner.timeEnd) &&
        Objects.equals(this.url, urlscannerCreateScan409ResponseResultTasksInner.url) &&
        Objects.equals(this.uuid, urlscannerCreateScan409ResponseResultTasksInner.uuid) &&
        Objects.equals(this.visibility, urlscannerCreateScan409ResponseResultTasksInner.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientLocation, clientType, effectiveUrl, errors, scannedFrom, status, success, time, timeEnd, url, uuid, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlscannerCreateScan409ResponseResultTasksInner {\n");
    sb.append("    clientLocation: ").append(toIndentedString(clientLocation)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    effectiveUrl: ").append(toIndentedString(effectiveUrl)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    scannedFrom: ").append(toIndentedString(scannedFrom)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    timeEnd: ").append(toIndentedString(timeEnd)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
    openapiFields.add("clientLocation");
    openapiFields.add("clientType");
    openapiFields.add("effectiveUrl");
    openapiFields.add("errors");
    openapiFields.add("scannedFrom");
    openapiFields.add("status");
    openapiFields.add("success");
    openapiFields.add("time");
    openapiFields.add("timeEnd");
    openapiFields.add("url");
    openapiFields.add("uuid");
    openapiFields.add("visibility");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clientLocation");
    openapiRequiredFields.add("clientType");
    openapiRequiredFields.add("effectiveUrl");
    openapiRequiredFields.add("errors");
    openapiRequiredFields.add("scannedFrom");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("success");
    openapiRequiredFields.add("time");
    openapiRequiredFields.add("timeEnd");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("visibility");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UrlscannerCreateScan409ResponseResultTasksInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlscannerCreateScan409ResponseResultTasksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlscannerCreateScan409ResponseResultTasksInner is not found in the empty JSON string", UrlscannerCreateScan409ResponseResultTasksInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UrlscannerCreateScan409ResponseResultTasksInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UrlscannerCreateScan409ResponseResultTasksInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UrlscannerCreateScan409ResponseResultTasksInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("clientLocation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientLocation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientLocation").toString()));
      }
      if (!jsonObj.get("clientType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientType").toString()));
      }
      // validate the required field `clientType`
      ClientTypeEnum.validateJsonElement(jsonObj.get("clientType"));
      if (!jsonObj.get("effectiveUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effectiveUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effectiveUrl").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }

      JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
      // validate the required field `errors` (array)
      for (int i = 0; i < jsonArrayerrors.size(); i++) {
        UrlscannerSearchScans400ResponseMessagesInner.validateJsonElement(jsonArrayerrors.get(i));
      };
      // validate the required field `scannedFrom`
      UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom.validateJsonElement(jsonObj.get("scannedFrom"));
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      if (!jsonObj.get("time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time").toString()));
      }
      if (!jsonObj.get("timeEnd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeEnd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeEnd").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (!jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      // validate the required field `visibility`
      VisibilityEnum.validateJsonElement(jsonObj.get("visibility"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlscannerCreateScan409ResponseResultTasksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlscannerCreateScan409ResponseResultTasksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlscannerCreateScan409ResponseResultTasksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlscannerCreateScan409ResponseResultTasksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlscannerCreateScan409ResponseResultTasksInner>() {
           @Override
           public void write(JsonWriter out, UrlscannerCreateScan409ResponseResultTasksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlscannerCreateScan409ResponseResultTasksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlscannerCreateScan409ResponseResultTasksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlscannerCreateScan409ResponseResultTasksInner
  * @throws IOException if the JSON string is invalid with respect to UrlscannerCreateScan409ResponseResultTasksInner
  */
  public static UrlscannerCreateScan409ResponseResultTasksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlscannerCreateScan409ResponseResultTasksInner.class);
  }

 /**
  * Convert an instance of UrlscannerCreateScan409ResponseResultTasksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

