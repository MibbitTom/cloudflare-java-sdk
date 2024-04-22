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
import java.util.Arrays;

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
 * StreamStorageUseResponseAllOfResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class StreamStorageUseResponseAllOfResult {
  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private String creator;

  public static final String SERIALIZED_NAME_TOTAL_STORAGE_MINUTES = "totalStorageMinutes";
  @SerializedName(SERIALIZED_NAME_TOTAL_STORAGE_MINUTES)
  private Integer totalStorageMinutes;

  public static final String SERIALIZED_NAME_TOTAL_STORAGE_MINUTES_LIMIT = "totalStorageMinutesLimit";
  @SerializedName(SERIALIZED_NAME_TOTAL_STORAGE_MINUTES_LIMIT)
  private Integer totalStorageMinutesLimit;

  public static final String SERIALIZED_NAME_VIDEO_COUNT = "videoCount";
  @SerializedName(SERIALIZED_NAME_VIDEO_COUNT)
  private Integer videoCount;

  public StreamStorageUseResponseAllOfResult() {
  }

  public StreamStorageUseResponseAllOfResult creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * A user-defined identifier for the media creator.
   * @return creator
  **/
  @javax.annotation.Nullable
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }


  public StreamStorageUseResponseAllOfResult totalStorageMinutes(Integer totalStorageMinutes) {
    this.totalStorageMinutes = totalStorageMinutes;
    return this;
  }

   /**
   * The total minutes of video content stored in the account.
   * @return totalStorageMinutes
  **/
  @javax.annotation.Nullable
  public Integer getTotalStorageMinutes() {
    return totalStorageMinutes;
  }

  public void setTotalStorageMinutes(Integer totalStorageMinutes) {
    this.totalStorageMinutes = totalStorageMinutes;
  }


  public StreamStorageUseResponseAllOfResult totalStorageMinutesLimit(Integer totalStorageMinutesLimit) {
    this.totalStorageMinutesLimit = totalStorageMinutesLimit;
    return this;
  }

   /**
   * The storage capacity alloted for the account.
   * @return totalStorageMinutesLimit
  **/
  @javax.annotation.Nullable
  public Integer getTotalStorageMinutesLimit() {
    return totalStorageMinutesLimit;
  }

  public void setTotalStorageMinutesLimit(Integer totalStorageMinutesLimit) {
    this.totalStorageMinutesLimit = totalStorageMinutesLimit;
  }


  public StreamStorageUseResponseAllOfResult videoCount(Integer videoCount) {
    this.videoCount = videoCount;
    return this;
  }

   /**
   * The total count of videos associated with the account.
   * @return videoCount
  **/
  @javax.annotation.Nullable
  public Integer getVideoCount() {
    return videoCount;
  }

  public void setVideoCount(Integer videoCount) {
    this.videoCount = videoCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamStorageUseResponseAllOfResult streamStorageUseResponseAllOfResult = (StreamStorageUseResponseAllOfResult) o;
    return Objects.equals(this.creator, streamStorageUseResponseAllOfResult.creator) &&
        Objects.equals(this.totalStorageMinutes, streamStorageUseResponseAllOfResult.totalStorageMinutes) &&
        Objects.equals(this.totalStorageMinutesLimit, streamStorageUseResponseAllOfResult.totalStorageMinutesLimit) &&
        Objects.equals(this.videoCount, streamStorageUseResponseAllOfResult.videoCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator, totalStorageMinutes, totalStorageMinutesLimit, videoCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamStorageUseResponseAllOfResult {\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    totalStorageMinutes: ").append(toIndentedString(totalStorageMinutes)).append("\n");
    sb.append("    totalStorageMinutesLimit: ").append(toIndentedString(totalStorageMinutesLimit)).append("\n");
    sb.append("    videoCount: ").append(toIndentedString(videoCount)).append("\n");
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
    openapiFields.add("creator");
    openapiFields.add("totalStorageMinutes");
    openapiFields.add("totalStorageMinutesLimit");
    openapiFields.add("videoCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StreamStorageUseResponseAllOfResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StreamStorageUseResponseAllOfResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StreamStorageUseResponseAllOfResult is not found in the empty JSON string", StreamStorageUseResponseAllOfResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StreamStorageUseResponseAllOfResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StreamStorageUseResponseAllOfResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("creator") != null && !jsonObj.get("creator").isJsonNull()) && !jsonObj.get("creator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StreamStorageUseResponseAllOfResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StreamStorageUseResponseAllOfResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StreamStorageUseResponseAllOfResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StreamStorageUseResponseAllOfResult.class));

       return (TypeAdapter<T>) new TypeAdapter<StreamStorageUseResponseAllOfResult>() {
           @Override
           public void write(JsonWriter out, StreamStorageUseResponseAllOfResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StreamStorageUseResponseAllOfResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StreamStorageUseResponseAllOfResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StreamStorageUseResponseAllOfResult
  * @throws IOException if the JSON string is invalid with respect to StreamStorageUseResponseAllOfResult
  */
  public static StreamStorageUseResponseAllOfResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StreamStorageUseResponseAllOfResult.class);
  }

 /**
  * Convert an instance of StreamStorageUseResponseAllOfResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
