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
import cloudflare.sdk.models.WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200ResponseResultInner;
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
 * WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private List<WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200ResponseResultInner> result = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success = true;

  public WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response() {
  }

  public WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response result(List<WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200ResponseResultInner> result) {
    this.result = result;
    return this;
  }

  public WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response addResultItem(WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200ResponseResultInner resultItem) {
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
  public List<WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200ResponseResultInner> getResult() {
    return result;
  }

  public void setResult(List<WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200ResponseResultInner> result) {
    this.result = result;
  }


  public WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
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
    WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response workersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response = (WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response) o;
    return Objects.equals(this.result, workersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response.result) &&
        Objects.equals(this.success, workersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response {\n");
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
    openapiFields.add("result");
    openapiFields.add("success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response is not found in the empty JSON string", WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
        JsonArray jsonArrayresult = jsonObj.getAsJsonArray("result");
        if (jsonArrayresult != null) {
          // ensure the json data is an array
          if (!jsonObj.get("result").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `result` to be an array in the JSON string but got `%s`", jsonObj.get("result").toString()));
          }

          // validate the optional field `result` (array)
          for (int i = 0; i < jsonArrayresult.size(); i++) {
            WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200ResponseResultInner.validateJsonElement(jsonArrayresult.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response>() {
           @Override
           public void write(JsonWriter out, WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response
  * @throws IOException if the JSON string is invalid with respect to WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response
  */
  public static WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response.class);
  }

 /**
  * Convert an instance of WorkersAiPostRunCfHuggingfaceDistilbertSst2Int8200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

