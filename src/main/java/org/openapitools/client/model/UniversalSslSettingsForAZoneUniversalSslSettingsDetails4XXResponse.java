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
import org.openapitools.client.model.AaaMessagesInner;

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
 * UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<AaaMessagesInner> errors;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<AaaMessagesInner> messages;

  /**
   * Gets or Sets result
   */
  @JsonAdapter(ResultEnum.Adapter.class)
  public enum ResultEnum {
    NULL("null");

    private Object value;

    ResultEnum(Object value) {
      this.value = value;
    }

    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultEnum fromValue(Object value) {
      for (ResultEnum b : ResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultEnum read(final JsonReader jsonReader) throws IOException {
        Object value =  jsonReader.nextObject();
        return ResultEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Object value = jsonElement.getAsObject();
      ResultEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private ResultEnum result;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse() {
  }

  public UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse errors(List<AaaMessagesInner> errors) {
    this.errors = errors;
    return this;
  }

  public UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse addErrorsItem(AaaMessagesInner errorsItem) {
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
  public List<AaaMessagesInner> getErrors() {
    return errors;
  }

  public void setErrors(List<AaaMessagesInner> errors) {
    this.errors = errors;
  }


  public UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse messages(List<AaaMessagesInner> messages) {
    this.messages = messages;
    return this;
  }

  public UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse addMessagesItem(AaaMessagesInner messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nonnull
  public List<AaaMessagesInner> getMessages() {
    return messages;
  }

  public void setMessages(List<AaaMessagesInner> messages) {
    this.messages = messages;
  }


  public UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse result(ResultEnum result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public ResultEnum getResult() {
    return result;
  }

  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse success(Boolean success) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse universalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse = (UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse) o;
    return Objects.equals(this.errors, universalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse.errors) &&
        Objects.equals(this.messages, universalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse.messages) &&
        Objects.equals(this.result, universalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse.result) &&
        Objects.equals(this.success, universalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, messages, result, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
  * @throws IOException if the JSON Element is invalid with respect to UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse is not found in the empty JSON string", UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }

      JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
      // validate the required field `errors` (array)
      for (int i = 0; i < jsonArrayerrors.size(); i++) {
        AaaMessagesInner.validateJsonElement(jsonArrayerrors.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
      }

      JsonArray jsonArraymessages = jsonObj.getAsJsonArray("messages");
      // validate the required field `messages` (array)
      for (int i = 0; i < jsonArraymessages.size(); i++) {
        AaaMessagesInner.validateJsonElement(jsonArraymessages.get(i));
      };
      // validate the required field `result`
      ResultEnum.validateJsonElement(jsonObj.get("result"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse>() {
           @Override
           public void write(JsonWriter out, UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse
  * @throws IOException if the JSON string is invalid with respect to UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse
  */
  public static UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse.class);
  }

 /**
  * Convert an instance of UniversalSslSettingsForAZoneUniversalSslSettingsDetails4XXResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

