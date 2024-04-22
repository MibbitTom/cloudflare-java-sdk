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
import cloudflare.sdk.models.StreamMediaState;
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

import cloudflare.JSON;

/**
 * Specifies a detailed status for a video. If the &#x60;state&#x60; is &#x60;inprogress&#x60; or &#x60;error&#x60;, the &#x60;step&#x60; field returns &#x60;encoding&#x60; or &#x60;manifest&#x60;. If the &#x60;state&#x60; is &#x60;inprogress&#x60;, &#x60;pctComplete&#x60; returns a number between 0 and 100 to indicate the approximate percent of completion. If the &#x60;state&#x60; is &#x60;error&#x60;, &#x60;errorReasonCode&#x60; and &#x60;errorReasonText&#x60; provide additional details.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class StreamMediaStatus {
  public static final String SERIALIZED_NAME_ERROR_REASON_CODE = "errorReasonCode";
  @SerializedName(SERIALIZED_NAME_ERROR_REASON_CODE)
  private String errorReasonCode;

  public static final String SERIALIZED_NAME_ERROR_REASON_TEXT = "errorReasonText";
  @SerializedName(SERIALIZED_NAME_ERROR_REASON_TEXT)
  private String errorReasonText;

  public static final String SERIALIZED_NAME_PCT_COMPLETE = "pctComplete";
  @SerializedName(SERIALIZED_NAME_PCT_COMPLETE)
  private String pctComplete;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StreamMediaState state;

  public StreamMediaStatus() {
  }

  public StreamMediaStatus errorReasonCode(String errorReasonCode) {
    this.errorReasonCode = errorReasonCode;
    return this;
  }

   /**
   * Specifies why the video failed to encode. This field is empty if the video is not in an &#x60;error&#x60; state. Preferred for programmatic use.
   * @return errorReasonCode
  **/
  @javax.annotation.Nullable
  public String getErrorReasonCode() {
    return errorReasonCode;
  }

  public void setErrorReasonCode(String errorReasonCode) {
    this.errorReasonCode = errorReasonCode;
  }


  public StreamMediaStatus errorReasonText(String errorReasonText) {
    this.errorReasonText = errorReasonText;
    return this;
  }

   /**
   * Specifies why the video failed to encode using a human readable error message in English. This field is empty if the video is not in an &#x60;error&#x60; state.
   * @return errorReasonText
  **/
  @javax.annotation.Nullable
  public String getErrorReasonText() {
    return errorReasonText;
  }

  public void setErrorReasonText(String errorReasonText) {
    this.errorReasonText = errorReasonText;
  }


  public StreamMediaStatus pctComplete(String pctComplete) {
    this.pctComplete = pctComplete;
    return this;
  }

   /**
   * Indicates the size of the entire upload in bytes. The value must be a non-negative integer.
   * @return pctComplete
  **/
  @javax.annotation.Nullable
  public String getPctComplete() {
    return pctComplete;
  }

  public void setPctComplete(String pctComplete) {
    this.pctComplete = pctComplete;
  }


  public StreamMediaStatus state(StreamMediaState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public StreamMediaState getState() {
    return state;
  }

  public void setState(StreamMediaState state) {
    this.state = state;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamMediaStatus streamMediaStatus = (StreamMediaStatus) o;
    return Objects.equals(this.errorReasonCode, streamMediaStatus.errorReasonCode) &&
        Objects.equals(this.errorReasonText, streamMediaStatus.errorReasonText) &&
        Objects.equals(this.pctComplete, streamMediaStatus.pctComplete) &&
        Objects.equals(this.state, streamMediaStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorReasonCode, errorReasonText, pctComplete, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamMediaStatus {\n");
    sb.append("    errorReasonCode: ").append(toIndentedString(errorReasonCode)).append("\n");
    sb.append("    errorReasonText: ").append(toIndentedString(errorReasonText)).append("\n");
    sb.append("    pctComplete: ").append(toIndentedString(pctComplete)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("errorReasonCode");
    openapiFields.add("errorReasonText");
    openapiFields.add("pctComplete");
    openapiFields.add("state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StreamMediaStatus
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StreamMediaStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StreamMediaStatus is not found in the empty JSON string", StreamMediaStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StreamMediaStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StreamMediaStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("errorReasonCode") != null && !jsonObj.get("errorReasonCode").isJsonNull()) && !jsonObj.get("errorReasonCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorReasonCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorReasonCode").toString()));
      }
      if ((jsonObj.get("errorReasonText") != null && !jsonObj.get("errorReasonText").isJsonNull()) && !jsonObj.get("errorReasonText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorReasonText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorReasonText").toString()));
      }
      if ((jsonObj.get("pctComplete") != null && !jsonObj.get("pctComplete").isJsonNull()) && !jsonObj.get("pctComplete").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pctComplete` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pctComplete").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        StreamMediaState.validateJsonElement(jsonObj.get("state"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StreamMediaStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StreamMediaStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StreamMediaStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StreamMediaStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<StreamMediaStatus>() {
           @Override
           public void write(JsonWriter out, StreamMediaStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StreamMediaStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StreamMediaStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StreamMediaStatus
  * @throws IOException if the JSON string is invalid with respect to StreamMediaStatus
  */
  public static StreamMediaStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StreamMediaStatus.class);
  }

 /**
  * Convert an instance of StreamMediaStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

