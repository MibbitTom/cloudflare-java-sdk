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

import java.util.Objects;
import cloudflare.sdk.models.StreamLiveInputRecordingSettings;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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

import cloudflare.JSON;

/**
 * StreamUpdateInputRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class StreamUpdateInputRequest {
  public static final String SERIALIZED_NAME_DEFAULT_CREATOR = "defaultCreator";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CREATOR)
  private String defaultCreator;

  public static final String SERIALIZED_NAME_DELETE_RECORDING_AFTER_DAYS = "deleteRecordingAfterDays";
  @SerializedName(SERIALIZED_NAME_DELETE_RECORDING_AFTER_DAYS)
  private BigDecimal deleteRecordingAfterDays;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Object meta;

  public static final String SERIALIZED_NAME_RECORDING = "recording";
  @SerializedName(SERIALIZED_NAME_RECORDING)
  private StreamLiveInputRecordingSettings recording;

  public StreamUpdateInputRequest() {
  }

  public StreamUpdateInputRequest defaultCreator(String defaultCreator) {
    this.defaultCreator = defaultCreator;
    return this;
  }

   /**
   * Sets the creator ID asssociated with this live input.
   * @return defaultCreator
  **/
  @javax.annotation.Nullable
  public String getDefaultCreator() {
    return defaultCreator;
  }

  public void setDefaultCreator(String defaultCreator) {
    this.defaultCreator = defaultCreator;
  }


  public StreamUpdateInputRequest deleteRecordingAfterDays(BigDecimal deleteRecordingAfterDays) {
    this.deleteRecordingAfterDays = deleteRecordingAfterDays;
    return this;
  }

   /**
   * Indicates the number of days after which the live inputs recordings will be deleted. When a stream completes and the recording is ready, the value is used to calculate a scheduled deletion date for that recording. Omit the field to indicate no change, or include with a &#x60;null&#x60; value to remove an existing scheduled deletion.
   * minimum: 30
   * @return deleteRecordingAfterDays
  **/
  @javax.annotation.Nullable
  public BigDecimal getDeleteRecordingAfterDays() {
    return deleteRecordingAfterDays;
  }

  public void setDeleteRecordingAfterDays(BigDecimal deleteRecordingAfterDays) {
    this.deleteRecordingAfterDays = deleteRecordingAfterDays;
  }


  public StreamUpdateInputRequest meta(Object meta) {
    this.meta = meta;
    return this;
  }

   /**
   * A user modifiable key-value store used to reference other systems of record for managing live inputs.
   * @return meta
  **/
  @javax.annotation.Nullable
  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }


  public StreamUpdateInputRequest recording(StreamLiveInputRecordingSettings recording) {
    this.recording = recording;
    return this;
  }

   /**
   * Get recording
   * @return recording
  **/
  @javax.annotation.Nullable
  public StreamLiveInputRecordingSettings getRecording() {
    return recording;
  }

  public void setRecording(StreamLiveInputRecordingSettings recording) {
    this.recording = recording;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamUpdateInputRequest streamUpdateInputRequest = (StreamUpdateInputRequest) o;
    return Objects.equals(this.defaultCreator, streamUpdateInputRequest.defaultCreator) &&
        Objects.equals(this.deleteRecordingAfterDays, streamUpdateInputRequest.deleteRecordingAfterDays) &&
        Objects.equals(this.meta, streamUpdateInputRequest.meta) &&
        Objects.equals(this.recording, streamUpdateInputRequest.recording);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCreator, deleteRecordingAfterDays, meta, recording);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamUpdateInputRequest {\n");
    sb.append("    defaultCreator: ").append(toIndentedString(defaultCreator)).append("\n");
    sb.append("    deleteRecordingAfterDays: ").append(toIndentedString(deleteRecordingAfterDays)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
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
    openapiFields.add("defaultCreator");
    openapiFields.add("deleteRecordingAfterDays");
    openapiFields.add("meta");
    openapiFields.add("recording");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StreamUpdateInputRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StreamUpdateInputRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StreamUpdateInputRequest is not found in the empty JSON string", StreamUpdateInputRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StreamUpdateInputRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StreamUpdateInputRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("defaultCreator") != null && !jsonObj.get("defaultCreator").isJsonNull()) && !jsonObj.get("defaultCreator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultCreator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultCreator").toString()));
      }
      // validate the optional field `recording`
      if (jsonObj.get("recording") != null && !jsonObj.get("recording").isJsonNull()) {
        StreamLiveInputRecordingSettings.validateJsonElement(jsonObj.get("recording"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StreamUpdateInputRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StreamUpdateInputRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StreamUpdateInputRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StreamUpdateInputRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<StreamUpdateInputRequest>() {
           @Override
           public void write(JsonWriter out, StreamUpdateInputRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StreamUpdateInputRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StreamUpdateInputRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StreamUpdateInputRequest
  * @throws IOException if the JSON string is invalid with respect to StreamUpdateInputRequest
  */
  public static StreamUpdateInputRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StreamUpdateInputRequest.class);
  }

 /**
  * Convert an instance of StreamUpdateInputRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
