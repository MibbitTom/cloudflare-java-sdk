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
 * Details for playback from an live input using SRT.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class StreamPlaybackSrt {
  public static final String SERIALIZED_NAME_PASSPHRASE = "passphrase";
  @SerializedName(SERIALIZED_NAME_PASSPHRASE)
  private String passphrase;

  public static final String SERIALIZED_NAME_STREAM_ID = "streamId";
  @SerializedName(SERIALIZED_NAME_STREAM_ID)
  private String streamId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public StreamPlaybackSrt() {
  }

  public StreamPlaybackSrt passphrase(String passphrase) {
    this.passphrase = passphrase;
    return this;
  }

   /**
   * The secret key to use for playback via SRT.
   * @return passphrase
  **/
  @javax.annotation.Nullable
  public String getPassphrase() {
    return passphrase;
  }

  public void setPassphrase(String passphrase) {
    this.passphrase = passphrase;
  }


  public StreamPlaybackSrt streamId(String streamId) {
    this.streamId = streamId;
    return this;
  }

   /**
   * The identifier of the live input to use for playback via SRT.
   * @return streamId
  **/
  @javax.annotation.Nullable
  public String getStreamId() {
    return streamId;
  }

  public void setStreamId(String streamId) {
    this.streamId = streamId;
  }


  public StreamPlaybackSrt url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL used to play live video over SRT.
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamPlaybackSrt streamPlaybackSrt = (StreamPlaybackSrt) o;
    return Objects.equals(this.passphrase, streamPlaybackSrt.passphrase) &&
        Objects.equals(this.streamId, streamPlaybackSrt.streamId) &&
        Objects.equals(this.url, streamPlaybackSrt.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passphrase, streamId, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamPlaybackSrt {\n");
    sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("passphrase");
    openapiFields.add("streamId");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StreamPlaybackSrt
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StreamPlaybackSrt.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StreamPlaybackSrt is not found in the empty JSON string", StreamPlaybackSrt.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StreamPlaybackSrt.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StreamPlaybackSrt` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("passphrase") != null && !jsonObj.get("passphrase").isJsonNull()) && !jsonObj.get("passphrase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passphrase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passphrase").toString()));
      }
      if ((jsonObj.get("streamId") != null && !jsonObj.get("streamId").isJsonNull()) && !jsonObj.get("streamId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `streamId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("streamId").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StreamPlaybackSrt.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StreamPlaybackSrt' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StreamPlaybackSrt> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StreamPlaybackSrt.class));

       return (TypeAdapter<T>) new TypeAdapter<StreamPlaybackSrt>() {
           @Override
           public void write(JsonWriter out, StreamPlaybackSrt value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StreamPlaybackSrt read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StreamPlaybackSrt given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StreamPlaybackSrt
  * @throws IOException if the JSON string is invalid with respect to StreamPlaybackSrt
  */
  public static StreamPlaybackSrt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StreamPlaybackSrt.class);
  }

 /**
  * Convert an instance of StreamPlaybackSrt to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

