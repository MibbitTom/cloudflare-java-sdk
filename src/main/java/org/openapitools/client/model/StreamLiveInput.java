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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.StreamInputRtmps;
import org.openapitools.client.model.StreamInputSrt;
import org.openapitools.client.model.StreamInputWebrtc;
import org.openapitools.client.model.StreamLiveInputRecordingSettings;
import org.openapitools.client.model.StreamLiveInputStatus;
import org.openapitools.client.model.StreamPlaybackRtmps;
import org.openapitools.client.model.StreamPlaybackSrt;
import org.openapitools.client.model.StreamPlaybackWebrtc;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Details about a live input.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class StreamLiveInput {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_DELETE_RECORDING_AFTER_DAYS = "deleteRecordingAfterDays";
  @SerializedName(SERIALIZED_NAME_DELETE_RECORDING_AFTER_DAYS)
  private BigDecimal deleteRecordingAfterDays;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Object meta;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private OffsetDateTime modified;

  public static final String SERIALIZED_NAME_RECORDING = "recording";
  @SerializedName(SERIALIZED_NAME_RECORDING)
  private StreamLiveInputRecordingSettings recording;

  public static final String SERIALIZED_NAME_RTMPS = "rtmps";
  @SerializedName(SERIALIZED_NAME_RTMPS)
  private StreamInputRtmps rtmps;

  public static final String SERIALIZED_NAME_RTMPS_PLAYBACK = "rtmpsPlayback";
  @SerializedName(SERIALIZED_NAME_RTMPS_PLAYBACK)
  private StreamPlaybackRtmps rtmpsPlayback;

  public static final String SERIALIZED_NAME_SRT = "srt";
  @SerializedName(SERIALIZED_NAME_SRT)
  private StreamInputSrt srt;

  public static final String SERIALIZED_NAME_SRT_PLAYBACK = "srtPlayback";
  @SerializedName(SERIALIZED_NAME_SRT_PLAYBACK)
  private StreamPlaybackSrt srtPlayback;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StreamLiveInputStatus status;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_WEB_R_T_C = "webRTC";
  @SerializedName(SERIALIZED_NAME_WEB_R_T_C)
  private StreamInputWebrtc webRTC;

  public static final String SERIALIZED_NAME_WEB_R_T_C_PLAYBACK = "webRTCPlayback";
  @SerializedName(SERIALIZED_NAME_WEB_R_T_C_PLAYBACK)
  private StreamPlaybackWebrtc webRTCPlayback;

  public StreamLiveInput() {
  }

  public StreamLiveInput created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The date and time the live input was created.
   * @return created
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public StreamLiveInput deleteRecordingAfterDays(BigDecimal deleteRecordingAfterDays) {
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


  public StreamLiveInput meta(Object meta) {
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


  public StreamLiveInput modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * The date and time the live input was last modified.
   * @return modified
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }


  public StreamLiveInput recording(StreamLiveInputRecordingSettings recording) {
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


  public StreamLiveInput rtmps(StreamInputRtmps rtmps) {
    this.rtmps = rtmps;
    return this;
  }

   /**
   * Get rtmps
   * @return rtmps
  **/
  @javax.annotation.Nullable
  public StreamInputRtmps getRtmps() {
    return rtmps;
  }

  public void setRtmps(StreamInputRtmps rtmps) {
    this.rtmps = rtmps;
  }


  public StreamLiveInput rtmpsPlayback(StreamPlaybackRtmps rtmpsPlayback) {
    this.rtmpsPlayback = rtmpsPlayback;
    return this;
  }

   /**
   * Get rtmpsPlayback
   * @return rtmpsPlayback
  **/
  @javax.annotation.Nullable
  public StreamPlaybackRtmps getRtmpsPlayback() {
    return rtmpsPlayback;
  }

  public void setRtmpsPlayback(StreamPlaybackRtmps rtmpsPlayback) {
    this.rtmpsPlayback = rtmpsPlayback;
  }


  public StreamLiveInput srt(StreamInputSrt srt) {
    this.srt = srt;
    return this;
  }

   /**
   * Get srt
   * @return srt
  **/
  @javax.annotation.Nullable
  public StreamInputSrt getSrt() {
    return srt;
  }

  public void setSrt(StreamInputSrt srt) {
    this.srt = srt;
  }


  public StreamLiveInput srtPlayback(StreamPlaybackSrt srtPlayback) {
    this.srtPlayback = srtPlayback;
    return this;
  }

   /**
   * Get srtPlayback
   * @return srtPlayback
  **/
  @javax.annotation.Nullable
  public StreamPlaybackSrt getSrtPlayback() {
    return srtPlayback;
  }

  public void setSrtPlayback(StreamPlaybackSrt srtPlayback) {
    this.srtPlayback = srtPlayback;
  }


  public StreamLiveInput status(StreamLiveInputStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public StreamLiveInputStatus getStatus() {
    return status;
  }

  public void setStatus(StreamLiveInputStatus status) {
    this.status = status;
  }


  public StreamLiveInput uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * A unique identifier for a live input.
   * @return uid
  **/
  @javax.annotation.Nullable
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  public StreamLiveInput webRTC(StreamInputWebrtc webRTC) {
    this.webRTC = webRTC;
    return this;
  }

   /**
   * Get webRTC
   * @return webRTC
  **/
  @javax.annotation.Nullable
  public StreamInputWebrtc getWebRTC() {
    return webRTC;
  }

  public void setWebRTC(StreamInputWebrtc webRTC) {
    this.webRTC = webRTC;
  }


  public StreamLiveInput webRTCPlayback(StreamPlaybackWebrtc webRTCPlayback) {
    this.webRTCPlayback = webRTCPlayback;
    return this;
  }

   /**
   * Get webRTCPlayback
   * @return webRTCPlayback
  **/
  @javax.annotation.Nullable
  public StreamPlaybackWebrtc getWebRTCPlayback() {
    return webRTCPlayback;
  }

  public void setWebRTCPlayback(StreamPlaybackWebrtc webRTCPlayback) {
    this.webRTCPlayback = webRTCPlayback;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamLiveInput streamLiveInput = (StreamLiveInput) o;
    return Objects.equals(this.created, streamLiveInput.created) &&
        Objects.equals(this.deleteRecordingAfterDays, streamLiveInput.deleteRecordingAfterDays) &&
        Objects.equals(this.meta, streamLiveInput.meta) &&
        Objects.equals(this.modified, streamLiveInput.modified) &&
        Objects.equals(this.recording, streamLiveInput.recording) &&
        Objects.equals(this.rtmps, streamLiveInput.rtmps) &&
        Objects.equals(this.rtmpsPlayback, streamLiveInput.rtmpsPlayback) &&
        Objects.equals(this.srt, streamLiveInput.srt) &&
        Objects.equals(this.srtPlayback, streamLiveInput.srtPlayback) &&
        Objects.equals(this.status, streamLiveInput.status) &&
        Objects.equals(this.uid, streamLiveInput.uid) &&
        Objects.equals(this.webRTC, streamLiveInput.webRTC) &&
        Objects.equals(this.webRTCPlayback, streamLiveInput.webRTCPlayback);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, deleteRecordingAfterDays, meta, modified, recording, rtmps, rtmpsPlayback, srt, srtPlayback, status, uid, webRTC, webRTCPlayback);
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
    sb.append("class StreamLiveInput {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    deleteRecordingAfterDays: ").append(toIndentedString(deleteRecordingAfterDays)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    rtmps: ").append(toIndentedString(rtmps)).append("\n");
    sb.append("    rtmpsPlayback: ").append(toIndentedString(rtmpsPlayback)).append("\n");
    sb.append("    srt: ").append(toIndentedString(srt)).append("\n");
    sb.append("    srtPlayback: ").append(toIndentedString(srtPlayback)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    webRTC: ").append(toIndentedString(webRTC)).append("\n");
    sb.append("    webRTCPlayback: ").append(toIndentedString(webRTCPlayback)).append("\n");
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
    openapiFields.add("created");
    openapiFields.add("deleteRecordingAfterDays");
    openapiFields.add("meta");
    openapiFields.add("modified");
    openapiFields.add("recording");
    openapiFields.add("rtmps");
    openapiFields.add("rtmpsPlayback");
    openapiFields.add("srt");
    openapiFields.add("srtPlayback");
    openapiFields.add("status");
    openapiFields.add("uid");
    openapiFields.add("webRTC");
    openapiFields.add("webRTCPlayback");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StreamLiveInput
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StreamLiveInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StreamLiveInput is not found in the empty JSON string", StreamLiveInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StreamLiveInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StreamLiveInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `recording`
      if (jsonObj.get("recording") != null && !jsonObj.get("recording").isJsonNull()) {
        StreamLiveInputRecordingSettings.validateJsonElement(jsonObj.get("recording"));
      }
      // validate the optional field `rtmps`
      if (jsonObj.get("rtmps") != null && !jsonObj.get("rtmps").isJsonNull()) {
        StreamInputRtmps.validateJsonElement(jsonObj.get("rtmps"));
      }
      // validate the optional field `rtmpsPlayback`
      if (jsonObj.get("rtmpsPlayback") != null && !jsonObj.get("rtmpsPlayback").isJsonNull()) {
        StreamPlaybackRtmps.validateJsonElement(jsonObj.get("rtmpsPlayback"));
      }
      // validate the optional field `srt`
      if (jsonObj.get("srt") != null && !jsonObj.get("srt").isJsonNull()) {
        StreamInputSrt.validateJsonElement(jsonObj.get("srt"));
      }
      // validate the optional field `srtPlayback`
      if (jsonObj.get("srtPlayback") != null && !jsonObj.get("srtPlayback").isJsonNull()) {
        StreamPlaybackSrt.validateJsonElement(jsonObj.get("srtPlayback"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StreamLiveInputStatus.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
      // validate the optional field `webRTC`
      if (jsonObj.get("webRTC") != null && !jsonObj.get("webRTC").isJsonNull()) {
        StreamInputWebrtc.validateJsonElement(jsonObj.get("webRTC"));
      }
      // validate the optional field `webRTCPlayback`
      if (jsonObj.get("webRTCPlayback") != null && !jsonObj.get("webRTCPlayback").isJsonNull()) {
        StreamPlaybackWebrtc.validateJsonElement(jsonObj.get("webRTCPlayback"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StreamLiveInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StreamLiveInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StreamLiveInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StreamLiveInput.class));

       return (TypeAdapter<T>) new TypeAdapter<StreamLiveInput>() {
           @Override
           public void write(JsonWriter out, StreamLiveInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StreamLiveInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StreamLiveInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StreamLiveInput
  * @throws IOException if the JSON string is invalid with respect to StreamLiveInput
  */
  public static StreamLiveInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StreamLiveInput.class);
  }

 /**
  * Convert an instance of StreamLiveInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

