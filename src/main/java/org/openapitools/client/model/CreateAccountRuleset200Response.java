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
import org.openapitools.client.model.CreateAccountRuleset200ResponseAllOfResult;
import org.openapitools.client.model.RulesetsMessage;

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
 * CreateAccountRuleset200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class CreateAccountRuleset200Response {
  /**
   * Gets or Sets errors
   */
  @JsonAdapter(ErrorsEnum.Adapter.class)
  public enum ErrorsEnum {
    u("[]");

    private String value;

    ErrorsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorsEnum fromValue(String value) {
      for (ErrorsEnum b : ErrorsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ErrorsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ErrorsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ErrorsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private ErrorsEnum errors;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<RulesetsMessage> messages = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private CreateAccountRuleset200ResponseAllOfResult result;

  /**
   * Gets or Sets success
   */
  @JsonAdapter(SuccessEnum.Adapter.class)
  public enum SuccessEnum {
    TRUE("true");

    private Boolean value;

    SuccessEnum(Boolean value) {
      this.value = value;
    }

    public Boolean getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SuccessEnum fromValue(Boolean value) {
      for (SuccessEnum b : SuccessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SuccessEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SuccessEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SuccessEnum read(final JsonReader jsonReader) throws IOException {
        Boolean value =  jsonReader.nextBoolean();
        return SuccessEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Boolean value = jsonElement.getAsBoolean();
      SuccessEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private SuccessEnum success;

  public CreateAccountRuleset200Response() {
  }

  public CreateAccountRuleset200Response errors(ErrorsEnum errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nonnull
  public ErrorsEnum getErrors() {
    return errors;
  }

  public void setErrors(ErrorsEnum errors) {
    this.errors = errors;
  }


  public CreateAccountRuleset200Response messages(List<RulesetsMessage> messages) {
    this.messages = messages;
    return this;
  }

  public CreateAccountRuleset200Response addMessagesItem(RulesetsMessage messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * A list of warning messages.
   * @return messages
  **/
  @javax.annotation.Nonnull
  public List<RulesetsMessage> getMessages() {
    return messages;
  }

  public void setMessages(List<RulesetsMessage> messages) {
    this.messages = messages;
  }


  public CreateAccountRuleset200Response result(CreateAccountRuleset200ResponseAllOfResult result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nonnull
  public CreateAccountRuleset200ResponseAllOfResult getResult() {
    return result;
  }

  public void setResult(CreateAccountRuleset200ResponseAllOfResult result) {
    this.result = result;
  }


  public CreateAccountRuleset200Response success(SuccessEnum success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nonnull
  public SuccessEnum getSuccess() {
    return success;
  }

  public void setSuccess(SuccessEnum success) {
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
    CreateAccountRuleset200Response createAccountRuleset200Response = (CreateAccountRuleset200Response) o;
    return Objects.equals(this.errors, createAccountRuleset200Response.errors) &&
        Objects.equals(this.messages, createAccountRuleset200Response.messages) &&
        Objects.equals(this.result, createAccountRuleset200Response.result) &&
        Objects.equals(this.success, createAccountRuleset200Response.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, messages, result, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountRuleset200Response {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to CreateAccountRuleset200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateAccountRuleset200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAccountRuleset200Response is not found in the empty JSON string", CreateAccountRuleset200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateAccountRuleset200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAccountRuleset200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAccountRuleset200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("errors").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }
      // validate the required field `errors`
      ErrorsEnum.validateJsonElement(jsonObj.get("errors"));
      // ensure the json data is an array
      if (!jsonObj.get("messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
      }

      JsonArray jsonArraymessages = jsonObj.getAsJsonArray("messages");
      // validate the required field `messages` (array)
      for (int i = 0; i < jsonArraymessages.size(); i++) {
        RulesetsMessage.validateJsonElement(jsonArraymessages.get(i));
      };
      // validate the required field `result`
      CreateAccountRuleset200ResponseAllOfResult.validateJsonElement(jsonObj.get("result"));
      // validate the required field `success`
      SuccessEnum.validateJsonElement(jsonObj.get("success"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAccountRuleset200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAccountRuleset200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAccountRuleset200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAccountRuleset200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAccountRuleset200Response>() {
           @Override
           public void write(JsonWriter out, CreateAccountRuleset200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAccountRuleset200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAccountRuleset200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAccountRuleset200Response
  * @throws IOException if the JSON string is invalid with respect to CreateAccountRuleset200Response
  */
  public static CreateAccountRuleset200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAccountRuleset200Response.class);
  }

 /**
  * Convert an instance of CreateAccountRuleset200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

