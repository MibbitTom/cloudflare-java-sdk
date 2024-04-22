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
 * StreamWatermarks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class StreamWatermarks {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_DOWNLOADED_FROM = "downloadedFrom";
  @SerializedName(SERIALIZED_NAME_DOWNLOADED_FROM)
  private String downloadedFrom;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "";

  public static final String SERIALIZED_NAME_OPACITY = "opacity";
  @SerializedName(SERIALIZED_NAME_OPACITY)
  private BigDecimal opacity = new BigDecimal("1");

  public static final String SERIALIZED_NAME_PADDING = "padding";
  @SerializedName(SERIALIZED_NAME_PADDING)
  private BigDecimal padding = new BigDecimal("0.05");

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position = "upperRight";

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  private BigDecimal scale = new BigDecimal("0.15");

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private BigDecimal size;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public StreamWatermarks() {
  }

  public StreamWatermarks created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The date and a time a watermark profile was created.
   * @return created
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public StreamWatermarks downloadedFrom(String downloadedFrom) {
    this.downloadedFrom = downloadedFrom;
    return this;
  }

   /**
   * The source URL for a downloaded image. If the watermark profile was created via direct upload, this field is null.
   * @return downloadedFrom
  **/
  @javax.annotation.Nullable
  public String getDownloadedFrom() {
    return downloadedFrom;
  }

  public void setDownloadedFrom(String downloadedFrom) {
    this.downloadedFrom = downloadedFrom;
  }


  public StreamWatermarks height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height of the image in pixels.
   * @return height
  **/
  @javax.annotation.Nullable
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  public StreamWatermarks name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A short description of the watermark profile.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public StreamWatermarks opacity(BigDecimal opacity) {
    this.opacity = opacity;
    return this;
  }

   /**
   * The translucency of the image. A value of &#x60;0.0&#x60; makes the image completely transparent, and &#x60;1.0&#x60; makes the image completely opaque. Note that if the image is already semi-transparent, setting this to &#x60;1.0&#x60; will not make the image completely opaque.
   * minimum: 0
   * maximum: 1
   * @return opacity
  **/
  @javax.annotation.Nullable
  public BigDecimal getOpacity() {
    return opacity;
  }

  public void setOpacity(BigDecimal opacity) {
    this.opacity = opacity;
  }


  public StreamWatermarks padding(BigDecimal padding) {
    this.padding = padding;
    return this;
  }

   /**
   * The whitespace between the adjacent edges (determined by position) of the video and the image. &#x60;0.0&#x60; indicates no padding, and &#x60;1.0&#x60; indicates a fully padded video width or length, as determined by the algorithm.
   * minimum: 0
   * maximum: 1
   * @return padding
  **/
  @javax.annotation.Nullable
  public BigDecimal getPadding() {
    return padding;
  }

  public void setPadding(BigDecimal padding) {
    this.padding = padding;
  }


  public StreamWatermarks position(String position) {
    this.position = position;
    return this;
  }

   /**
   * The location of the image. Valid positions are: &#x60;upperRight&#x60;, &#x60;upperLeft&#x60;, &#x60;lowerLeft&#x60;, &#x60;lowerRight&#x60;, and &#x60;center&#x60;. Note that &#x60;center&#x60; ignores the &#x60;padding&#x60; parameter.
   * @return position
  **/
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public StreamWatermarks scale(BigDecimal scale) {
    this.scale = scale;
    return this;
  }

   /**
   * The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. &#x60;0.0&#x60; indicates no scaling (use the size of the image as-is), and &#x60;1.0 &#x60;fills the entire video.
   * minimum: 0
   * maximum: 1
   * @return scale
  **/
  @javax.annotation.Nullable
  public BigDecimal getScale() {
    return scale;
  }

  public void setScale(BigDecimal scale) {
    this.scale = scale;
  }


  public StreamWatermarks size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the image in bytes.
   * @return size
  **/
  @javax.annotation.Nullable
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }


  public StreamWatermarks uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * The unique identifier for a watermark profile.
   * @return uid
  **/
  @javax.annotation.Nullable
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  public StreamWatermarks width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width of the image in pixels.
   * @return width
  **/
  @javax.annotation.Nullable
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamWatermarks streamWatermarks = (StreamWatermarks) o;
    return Objects.equals(this.created, streamWatermarks.created) &&
        Objects.equals(this.downloadedFrom, streamWatermarks.downloadedFrom) &&
        Objects.equals(this.height, streamWatermarks.height) &&
        Objects.equals(this.name, streamWatermarks.name) &&
        Objects.equals(this.opacity, streamWatermarks.opacity) &&
        Objects.equals(this.padding, streamWatermarks.padding) &&
        Objects.equals(this.position, streamWatermarks.position) &&
        Objects.equals(this.scale, streamWatermarks.scale) &&
        Objects.equals(this.size, streamWatermarks.size) &&
        Objects.equals(this.uid, streamWatermarks.uid) &&
        Objects.equals(this.width, streamWatermarks.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, downloadedFrom, height, name, opacity, padding, position, scale, size, uid, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamWatermarks {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    downloadedFrom: ").append(toIndentedString(downloadedFrom)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    padding: ").append(toIndentedString(padding)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("downloadedFrom");
    openapiFields.add("height");
    openapiFields.add("name");
    openapiFields.add("opacity");
    openapiFields.add("padding");
    openapiFields.add("position");
    openapiFields.add("scale");
    openapiFields.add("size");
    openapiFields.add("uid");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StreamWatermarks
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StreamWatermarks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StreamWatermarks is not found in the empty JSON string", StreamWatermarks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StreamWatermarks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StreamWatermarks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("downloadedFrom") != null && !jsonObj.get("downloadedFrom").isJsonNull()) && !jsonObj.get("downloadedFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `downloadedFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("downloadedFrom").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("position") != null && !jsonObj.get("position").isJsonNull()) && !jsonObj.get("position").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position").toString()));
      }
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StreamWatermarks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StreamWatermarks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StreamWatermarks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StreamWatermarks.class));

       return (TypeAdapter<T>) new TypeAdapter<StreamWatermarks>() {
           @Override
           public void write(JsonWriter out, StreamWatermarks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StreamWatermarks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StreamWatermarks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StreamWatermarks
  * @throws IOException if the JSON string is invalid with respect to StreamWatermarks
  */
  public static StreamWatermarks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StreamWatermarks.class);
  }

 /**
  * Convert an instance of StreamWatermarks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

