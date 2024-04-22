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
import cloudflare.sdk.models.MqQueue;
import cloudflare.sdk.models.QueueV2ListQueues200ResponseAllOfResultInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * QueueV2ListQueues200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class QueueV2ListQueues200Response {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Object errors = null;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private Object messages = null;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private List<MqQueue> result = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_RESULT_INFO = "result_info";
  @SerializedName(SERIALIZED_NAME_RESULT_INFO)
  private QueueV2ListQueues200ResponseAllOfResultInfo resultInfo;

  public QueueV2ListQueues200Response() {
  }

  public QueueV2ListQueues200Response errors(Object errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  public Object getErrors() {
    return errors;
  }

  public void setErrors(Object errors) {
    this.errors = errors;
  }


  public QueueV2ListQueues200Response messages(Object messages) {
    this.messages = messages;
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nullable
  public Object getMessages() {
    return messages;
  }

  public void setMessages(Object messages) {
    this.messages = messages;
  }


  public QueueV2ListQueues200Response result(List<MqQueue> result) {
    this.result = result;
    return this;
  }

  public QueueV2ListQueues200Response addResultItem(MqQueue resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nonnull
  public List<MqQueue> getResult() {
    return result;
  }

  public void setResult(List<MqQueue> result) {
    this.result = result;
  }


  public QueueV2ListQueues200Response success(Boolean success) {
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


  public QueueV2ListQueues200Response resultInfo(QueueV2ListQueues200ResponseAllOfResultInfo resultInfo) {
    this.resultInfo = resultInfo;
    return this;
  }

   /**
   * Get resultInfo
   * @return resultInfo
  **/
  @javax.annotation.Nullable
  public QueueV2ListQueues200ResponseAllOfResultInfo getResultInfo() {
    return resultInfo;
  }

  public void setResultInfo(QueueV2ListQueues200ResponseAllOfResultInfo resultInfo) {
    this.resultInfo = resultInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueV2ListQueues200Response queueV2ListQueues200Response = (QueueV2ListQueues200Response) o;
    return Objects.equals(this.errors, queueV2ListQueues200Response.errors) &&
        Objects.equals(this.messages, queueV2ListQueues200Response.messages) &&
        Objects.equals(this.result, queueV2ListQueues200Response.result) &&
        Objects.equals(this.success, queueV2ListQueues200Response.success) &&
        Objects.equals(this.resultInfo, queueV2ListQueues200Response.resultInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, messages, result, success, resultInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueV2ListQueues200Response {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
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
    openapiFields.add("errors");
    openapiFields.add("messages");
    openapiFields.add("result");
    openapiFields.add("success");
    openapiFields.add("result_info");

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
  * @throws IOException if the JSON Element is invalid with respect to QueueV2ListQueues200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueueV2ListQueues200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueueV2ListQueues200Response is not found in the empty JSON string", QueueV2ListQueues200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QueueV2ListQueues200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueueV2ListQueues200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QueueV2ListQueues200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("result").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be an array in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }

      JsonArray jsonArrayresult = jsonObj.getAsJsonArray("result");
      // validate the required field `result` (array)
      for (int i = 0; i < jsonArrayresult.size(); i++) {
        MqQueue.validateJsonElement(jsonArrayresult.get(i));
      };
      // validate the optional field `result_info`
      if (jsonObj.get("result_info") != null && !jsonObj.get("result_info").isJsonNull()) {
        QueueV2ListQueues200ResponseAllOfResultInfo.validateJsonElement(jsonObj.get("result_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueueV2ListQueues200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueueV2ListQueues200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueueV2ListQueues200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueueV2ListQueues200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<QueueV2ListQueues200Response>() {
           @Override
           public void write(JsonWriter out, QueueV2ListQueues200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueueV2ListQueues200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueueV2ListQueues200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueueV2ListQueues200Response
  * @throws IOException if the JSON string is invalid with respect to QueueV2ListQueues200Response
  */
  public static QueueV2ListQueues200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueueV2ListQueues200Response.class);
  }

 /**
  * Convert an instance of QueueV2ListQueues200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

