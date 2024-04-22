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
import cloudflare.sdk.models.StreamWatermarkAtUpload;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * StreamVideoCopyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class StreamVideoCopyRequest {
  public static final String SERIALIZED_NAME_ALLOWED_ORIGINS = "allowedOrigins";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ORIGINS)
  private List<String> allowedOrigins = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private String creator;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Object meta;

  public static final String SERIALIZED_NAME_REQUIRE_SIGNED_U_R_LS = "requireSignedURLs";
  @SerializedName(SERIALIZED_NAME_REQUIRE_SIGNED_U_R_LS)
  private Boolean requireSignedURLs = false;

  public static final String SERIALIZED_NAME_SCHEDULED_DELETION = "scheduledDeletion";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_DELETION)
  private OffsetDateTime scheduledDeletion;

  public static final String SERIALIZED_NAME_THUMBNAIL_TIMESTAMP_PCT = "thumbnailTimestampPct";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_TIMESTAMP_PCT)
  private BigDecimal thumbnailTimestampPct = new BigDecimal("0");

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_WATERMARK = "watermark";
  @SerializedName(SERIALIZED_NAME_WATERMARK)
  private StreamWatermarkAtUpload watermark;

  public StreamVideoCopyRequest() {
  }

  public StreamVideoCopyRequest allowedOrigins(List<String> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
    return this;
  }

  public StreamVideoCopyRequest addAllowedOriginsItem(String allowedOriginsItem) {
    if (this.allowedOrigins == null) {
      this.allowedOrigins = new ArrayList<>();
    }
    this.allowedOrigins.add(allowedOriginsItem);
    return this;
  }

   /**
   * Lists the origins allowed to display the video. Enter allowed origin domains in an array and use &#x60;*&#x60; for wildcard subdomains. Empty arrays allow the video to be viewed on any origin.
   * @return allowedOrigins
  **/
  @javax.annotation.Nullable
  public List<String> getAllowedOrigins() {
    return allowedOrigins;
  }

  public void setAllowedOrigins(List<String> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
  }


  public StreamVideoCopyRequest creator(String creator) {
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


  public StreamVideoCopyRequest meta(Object meta) {
    this.meta = meta;
    return this;
  }

   /**
   * A user modifiable key-value store used to reference other systems of record for managing videos.
   * @return meta
  **/
  @javax.annotation.Nullable
  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }


  public StreamVideoCopyRequest requireSignedURLs(Boolean requireSignedURLs) {
    this.requireSignedURLs = requireSignedURLs;
    return this;
  }

   /**
   * Indicates whether the video can be a accessed using the UID. When set to &#x60;true&#x60;, a signed token must be generated with a signing key to view the video.
   * @return requireSignedURLs
  **/
  @javax.annotation.Nullable
  public Boolean getRequireSignedURLs() {
    return requireSignedURLs;
  }

  public void setRequireSignedURLs(Boolean requireSignedURLs) {
    this.requireSignedURLs = requireSignedURLs;
  }


  public StreamVideoCopyRequest scheduledDeletion(OffsetDateTime scheduledDeletion) {
    this.scheduledDeletion = scheduledDeletion;
    return this;
  }

   /**
   * Indicates the date and time at which the video will be deleted. Omit the field to indicate no change, or include with a &#x60;null&#x60; value to remove an existing scheduled deletion. If specified, must be at least 30 days from upload time.
   * @return scheduledDeletion
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getScheduledDeletion() {
    return scheduledDeletion;
  }

  public void setScheduledDeletion(OffsetDateTime scheduledDeletion) {
    this.scheduledDeletion = scheduledDeletion;
  }


  public StreamVideoCopyRequest thumbnailTimestampPct(BigDecimal thumbnailTimestampPct) {
    this.thumbnailTimestampPct = thumbnailTimestampPct;
    return this;
  }

   /**
   * The timestamp for a thumbnail image calculated as a percentage value of the video&#39;s duration. To convert from a second-wise timestamp to a percentage, divide the desired timestamp by the total duration of the video.  If this value is not set, the default thumbnail image is taken from 0s of the video.
   * minimum: 0
   * maximum: 1
   * @return thumbnailTimestampPct
  **/
  @javax.annotation.Nullable
  public BigDecimal getThumbnailTimestampPct() {
    return thumbnailTimestampPct;
  }

  public void setThumbnailTimestampPct(BigDecimal thumbnailTimestampPct) {
    this.thumbnailTimestampPct = thumbnailTimestampPct;
  }


  public StreamVideoCopyRequest url(URI url) {
    this.url = url;
    return this;
  }

   /**
   * A video&#39;s URL. The server must be publicly routable and support &#x60;HTTP HEAD&#x60; requests and &#x60;HTTP GET&#x60; range requests. The server should respond to &#x60;HTTP HEAD&#x60; requests with a &#x60;content-range&#x60; header that includes the size of the file.
   * @return url
  **/
  @javax.annotation.Nonnull
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }


  public StreamVideoCopyRequest watermark(StreamWatermarkAtUpload watermark) {
    this.watermark = watermark;
    return this;
  }

   /**
   * Get watermark
   * @return watermark
  **/
  @javax.annotation.Nullable
  public StreamWatermarkAtUpload getWatermark() {
    return watermark;
  }

  public void setWatermark(StreamWatermarkAtUpload watermark) {
    this.watermark = watermark;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamVideoCopyRequest streamVideoCopyRequest = (StreamVideoCopyRequest) o;
    return Objects.equals(this.allowedOrigins, streamVideoCopyRequest.allowedOrigins) &&
        Objects.equals(this.creator, streamVideoCopyRequest.creator) &&
        Objects.equals(this.meta, streamVideoCopyRequest.meta) &&
        Objects.equals(this.requireSignedURLs, streamVideoCopyRequest.requireSignedURLs) &&
        Objects.equals(this.scheduledDeletion, streamVideoCopyRequest.scheduledDeletion) &&
        Objects.equals(this.thumbnailTimestampPct, streamVideoCopyRequest.thumbnailTimestampPct) &&
        Objects.equals(this.url, streamVideoCopyRequest.url) &&
        Objects.equals(this.watermark, streamVideoCopyRequest.watermark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedOrigins, creator, meta, requireSignedURLs, scheduledDeletion, thumbnailTimestampPct, url, watermark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamVideoCopyRequest {\n");
    sb.append("    allowedOrigins: ").append(toIndentedString(allowedOrigins)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    requireSignedURLs: ").append(toIndentedString(requireSignedURLs)).append("\n");
    sb.append("    scheduledDeletion: ").append(toIndentedString(scheduledDeletion)).append("\n");
    sb.append("    thumbnailTimestampPct: ").append(toIndentedString(thumbnailTimestampPct)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
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
    openapiFields.add("allowedOrigins");
    openapiFields.add("creator");
    openapiFields.add("meta");
    openapiFields.add("requireSignedURLs");
    openapiFields.add("scheduledDeletion");
    openapiFields.add("thumbnailTimestampPct");
    openapiFields.add("url");
    openapiFields.add("watermark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StreamVideoCopyRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StreamVideoCopyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StreamVideoCopyRequest is not found in the empty JSON string", StreamVideoCopyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StreamVideoCopyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StreamVideoCopyRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StreamVideoCopyRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowedOrigins") != null && !jsonObj.get("allowedOrigins").isJsonNull() && !jsonObj.get("allowedOrigins").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedOrigins` to be an array in the JSON string but got `%s`", jsonObj.get("allowedOrigins").toString()));
      }
      if ((jsonObj.get("creator") != null && !jsonObj.get("creator").isJsonNull()) && !jsonObj.get("creator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the optional field `watermark`
      if (jsonObj.get("watermark") != null && !jsonObj.get("watermark").isJsonNull()) {
        StreamWatermarkAtUpload.validateJsonElement(jsonObj.get("watermark"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StreamVideoCopyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StreamVideoCopyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StreamVideoCopyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StreamVideoCopyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<StreamVideoCopyRequest>() {
           @Override
           public void write(JsonWriter out, StreamVideoCopyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StreamVideoCopyRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StreamVideoCopyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StreamVideoCopyRequest
  * @throws IOException if the JSON string is invalid with respect to StreamVideoCopyRequest
  */
  public static StreamVideoCopyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StreamVideoCopyRequest.class);
  }

 /**
  * Convert an instance of StreamVideoCopyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
