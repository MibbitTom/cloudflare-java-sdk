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
import cloudflare.sdk.models.AaaMessagesInner;
import cloudflare.sdk.models.SecondaryDnsResultInfo;
import cloudflare.sdk.models.SecondaryDnsTsig;
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
 * SecondaryDnsResponseCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class SecondaryDnsResponseCollection {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<AaaMessagesInner> errors = new ArrayList<>();

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<AaaMessagesInner> messages = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private List<SecondaryDnsTsig> result = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESULT_INFO = "result_info";
  @SerializedName(SERIALIZED_NAME_RESULT_INFO)
  private SecondaryDnsResultInfo resultInfo;

  public SecondaryDnsResponseCollection() {
  }

  public SecondaryDnsResponseCollection errors(List<AaaMessagesInner> errors) {
    this.errors = errors;
    return this;
  }

  public SecondaryDnsResponseCollection addErrorsItem(AaaMessagesInner errorsItem) {
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


  public SecondaryDnsResponseCollection messages(List<AaaMessagesInner> messages) {
    this.messages = messages;
    return this;
  }

  public SecondaryDnsResponseCollection addMessagesItem(AaaMessagesInner messagesItem) {
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


  public SecondaryDnsResponseCollection success(Boolean success) {
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


  public SecondaryDnsResponseCollection result(List<SecondaryDnsTsig> result) {
    this.result = result;
    return this;
  }

  public SecondaryDnsResponseCollection addResultItem(SecondaryDnsTsig resultItem) {
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
  @javax.annotation.Nullable
  public List<SecondaryDnsTsig> getResult() {
    return result;
  }

  public void setResult(List<SecondaryDnsTsig> result) {
    this.result = result;
  }


  public SecondaryDnsResponseCollection resultInfo(SecondaryDnsResultInfo resultInfo) {
    this.resultInfo = resultInfo;
    return this;
  }

   /**
   * Get resultInfo
   * @return resultInfo
  **/
  @javax.annotation.Nullable
  public SecondaryDnsResultInfo getResultInfo() {
    return resultInfo;
  }

  public void setResultInfo(SecondaryDnsResultInfo resultInfo) {
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
    SecondaryDnsResponseCollection secondaryDnsResponseCollection = (SecondaryDnsResponseCollection) o;
    return Objects.equals(this.errors, secondaryDnsResponseCollection.errors) &&
        Objects.equals(this.messages, secondaryDnsResponseCollection.messages) &&
        Objects.equals(this.success, secondaryDnsResponseCollection.success) &&
        Objects.equals(this.result, secondaryDnsResponseCollection.result) &&
        Objects.equals(this.resultInfo, secondaryDnsResponseCollection.resultInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, messages, success, result, resultInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondaryDnsResponseCollection {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
    openapiFields.add("success");
    openapiFields.add("result");
    openapiFields.add("result_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("errors");
    openapiRequiredFields.add("messages");
    openapiRequiredFields.add("success");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SecondaryDnsResponseCollection
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SecondaryDnsResponseCollection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SecondaryDnsResponseCollection is not found in the empty JSON string", SecondaryDnsResponseCollection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SecondaryDnsResponseCollection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SecondaryDnsResponseCollection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SecondaryDnsResponseCollection.openapiRequiredFields) {
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
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
        JsonArray jsonArrayresult = jsonObj.getAsJsonArray("result");
        if (jsonArrayresult != null) {
          // ensure the json data is an array
          if (!jsonObj.get("result").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `result` to be an array in the JSON string but got `%s`", jsonObj.get("result").toString()));
          }

          // validate the optional field `result` (array)
          for (int i = 0; i < jsonArrayresult.size(); i++) {
            SecondaryDnsTsig.validateJsonElement(jsonArrayresult.get(i));
          };
        }
      }
      // validate the optional field `result_info`
      if (jsonObj.get("result_info") != null && !jsonObj.get("result_info").isJsonNull()) {
        SecondaryDnsResultInfo.validateJsonElement(jsonObj.get("result_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecondaryDnsResponseCollection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecondaryDnsResponseCollection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecondaryDnsResponseCollection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecondaryDnsResponseCollection.class));

       return (TypeAdapter<T>) new TypeAdapter<SecondaryDnsResponseCollection>() {
           @Override
           public void write(JsonWriter out, SecondaryDnsResponseCollection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecondaryDnsResponseCollection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecondaryDnsResponseCollection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecondaryDnsResponseCollection
  * @throws IOException if the JSON string is invalid with respect to SecondaryDnsResponseCollection
  */
  public static SecondaryDnsResponseCollection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecondaryDnsResponseCollection.class);
  }

 /**
  * Convert an instance of SecondaryDnsResponseCollection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

