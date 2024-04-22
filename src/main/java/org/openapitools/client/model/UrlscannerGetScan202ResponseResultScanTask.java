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

import org.openapitools.client.JSON;

/**
 * UrlscannerGetScan202ResponseResultScanTask
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class UrlscannerGetScan202ResponseResultScanTask {
  public static final String SERIALIZED_NAME_EFFECTIVE_URL = "effectiveUrl";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_URL)
  private String effectiveUrl;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<UrlscannerSearchScans400ResponseMessagesInner> errors = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private String time;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private String visibility;

  public UrlscannerGetScan202ResponseResultScanTask() {
  }

  public UrlscannerGetScan202ResponseResultScanTask effectiveUrl(String effectiveUrl) {
    this.effectiveUrl = effectiveUrl;
    return this;
  }

   /**
   * Get effectiveUrl
   * @return effectiveUrl
  **/
  @javax.annotation.Nonnull
  public String getEffectiveUrl() {
    return effectiveUrl;
  }

  public void setEffectiveUrl(String effectiveUrl) {
    this.effectiveUrl = effectiveUrl;
  }


  public UrlscannerGetScan202ResponseResultScanTask errors(List<UrlscannerSearchScans400ResponseMessagesInner> errors) {
    this.errors = errors;
    return this;
  }

  public UrlscannerGetScan202ResponseResultScanTask addErrorsItem(UrlscannerSearchScans400ResponseMessagesInner errorsItem) {
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


  public UrlscannerGetScan202ResponseResultScanTask location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nonnull
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public UrlscannerGetScan202ResponseResultScanTask region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nonnull
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public UrlscannerGetScan202ResponseResultScanTask status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public UrlscannerGetScan202ResponseResultScanTask success(Boolean success) {
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


  public UrlscannerGetScan202ResponseResultScanTask time(String time) {
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


  public UrlscannerGetScan202ResponseResultScanTask url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public UrlscannerGetScan202ResponseResultScanTask uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nonnull
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public UrlscannerGetScan202ResponseResultScanTask visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nonnull
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
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
    UrlscannerGetScan202ResponseResultScanTask urlscannerGetScan202ResponseResultScanTask = (UrlscannerGetScan202ResponseResultScanTask) o;
    return Objects.equals(this.effectiveUrl, urlscannerGetScan202ResponseResultScanTask.effectiveUrl) &&
        Objects.equals(this.errors, urlscannerGetScan202ResponseResultScanTask.errors) &&
        Objects.equals(this.location, urlscannerGetScan202ResponseResultScanTask.location) &&
        Objects.equals(this.region, urlscannerGetScan202ResponseResultScanTask.region) &&
        Objects.equals(this.status, urlscannerGetScan202ResponseResultScanTask.status) &&
        Objects.equals(this.success, urlscannerGetScan202ResponseResultScanTask.success) &&
        Objects.equals(this.time, urlscannerGetScan202ResponseResultScanTask.time) &&
        Objects.equals(this.url, urlscannerGetScan202ResponseResultScanTask.url) &&
        Objects.equals(this.uuid, urlscannerGetScan202ResponseResultScanTask.uuid) &&
        Objects.equals(this.visibility, urlscannerGetScan202ResponseResultScanTask.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveUrl, errors, location, region, status, success, time, url, uuid, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlscannerGetScan202ResponseResultScanTask {\n");
    sb.append("    effectiveUrl: ").append(toIndentedString(effectiveUrl)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
    openapiFields.add("effectiveUrl");
    openapiFields.add("errors");
    openapiFields.add("location");
    openapiFields.add("region");
    openapiFields.add("status");
    openapiFields.add("success");
    openapiFields.add("time");
    openapiFields.add("url");
    openapiFields.add("uuid");
    openapiFields.add("visibility");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("effectiveUrl");
    openapiRequiredFields.add("errors");
    openapiRequiredFields.add("location");
    openapiRequiredFields.add("region");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("success");
    openapiRequiredFields.add("time");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("visibility");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UrlscannerGetScan202ResponseResultScanTask
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlscannerGetScan202ResponseResultScanTask.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlscannerGetScan202ResponseResultScanTask is not found in the empty JSON string", UrlscannerGetScan202ResponseResultScanTask.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UrlscannerGetScan202ResponseResultScanTask.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UrlscannerGetScan202ResponseResultScanTask` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UrlscannerGetScan202ResponseResultScanTask.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      if (!jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if (!jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlscannerGetScan202ResponseResultScanTask.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlscannerGetScan202ResponseResultScanTask' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlscannerGetScan202ResponseResultScanTask> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlscannerGetScan202ResponseResultScanTask.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlscannerGetScan202ResponseResultScanTask>() {
           @Override
           public void write(JsonWriter out, UrlscannerGetScan202ResponseResultScanTask value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlscannerGetScan202ResponseResultScanTask read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlscannerGetScan202ResponseResultScanTask given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlscannerGetScan202ResponseResultScanTask
  * @throws IOException if the JSON string is invalid with respect to UrlscannerGetScan202ResponseResultScanTask
  */
  public static UrlscannerGetScan202ResponseResultScanTask fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlscannerGetScan202ResponseResultScanTask.class);
  }

 /**
  * Convert an instance of UrlscannerGetScan202ResponseResultScanTask to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
