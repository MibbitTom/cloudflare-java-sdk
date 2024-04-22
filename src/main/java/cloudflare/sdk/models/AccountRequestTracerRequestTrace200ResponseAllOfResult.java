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
import cloudflare.sdk.models.RequestTracerTraceInner;
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
 * Trace result with an origin status code
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccountRequestTracerRequestTrace200ResponseAllOfResult {
  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public static final String SERIALIZED_NAME_TRACE = "trace";
  @SerializedName(SERIALIZED_NAME_TRACE)
  private List<RequestTracerTraceInner> trace = new ArrayList<>();

  public AccountRequestTracerRequestTrace200ResponseAllOfResult() {
  }

  public AccountRequestTracerRequestTrace200ResponseAllOfResult statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * HTTP Status code of zone response
   * @return statusCode
  **/
  @javax.annotation.Nullable
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public AccountRequestTracerRequestTrace200ResponseAllOfResult trace(List<RequestTracerTraceInner> trace) {
    this.trace = trace;
    return this;
  }

  public AccountRequestTracerRequestTrace200ResponseAllOfResult addTraceItem(RequestTracerTraceInner traceItem) {
    if (this.trace == null) {
      this.trace = new ArrayList<>();
    }
    this.trace.add(traceItem);
    return this;
  }

   /**
   * Get trace
   * @return trace
  **/
  @javax.annotation.Nullable
  public List<RequestTracerTraceInner> getTrace() {
    return trace;
  }

  public void setTrace(List<RequestTracerTraceInner> trace) {
    this.trace = trace;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRequestTracerRequestTrace200ResponseAllOfResult accountRequestTracerRequestTrace200ResponseAllOfResult = (AccountRequestTracerRequestTrace200ResponseAllOfResult) o;
    return Objects.equals(this.statusCode, accountRequestTracerRequestTrace200ResponseAllOfResult.statusCode) &&
        Objects.equals(this.trace, accountRequestTracerRequestTrace200ResponseAllOfResult.trace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, trace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRequestTracerRequestTrace200ResponseAllOfResult {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
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
    openapiFields.add("status_code");
    openapiFields.add("trace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccountRequestTracerRequestTrace200ResponseAllOfResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountRequestTracerRequestTrace200ResponseAllOfResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountRequestTracerRequestTrace200ResponseAllOfResult is not found in the empty JSON string", AccountRequestTracerRequestTrace200ResponseAllOfResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountRequestTracerRequestTrace200ResponseAllOfResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountRequestTracerRequestTrace200ResponseAllOfResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("trace") != null && !jsonObj.get("trace").isJsonNull()) {
        JsonArray jsonArraytrace = jsonObj.getAsJsonArray("trace");
        if (jsonArraytrace != null) {
          // ensure the json data is an array
          if (!jsonObj.get("trace").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `trace` to be an array in the JSON string but got `%s`", jsonObj.get("trace").toString()));
          }

          // validate the optional field `trace` (array)
          for (int i = 0; i < jsonArraytrace.size(); i++) {
            RequestTracerTraceInner.validateJsonElement(jsonArraytrace.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountRequestTracerRequestTrace200ResponseAllOfResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountRequestTracerRequestTrace200ResponseAllOfResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountRequestTracerRequestTrace200ResponseAllOfResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountRequestTracerRequestTrace200ResponseAllOfResult.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountRequestTracerRequestTrace200ResponseAllOfResult>() {
           @Override
           public void write(JsonWriter out, AccountRequestTracerRequestTrace200ResponseAllOfResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountRequestTracerRequestTrace200ResponseAllOfResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountRequestTracerRequestTrace200ResponseAllOfResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountRequestTracerRequestTrace200ResponseAllOfResult
  * @throws IOException if the JSON string is invalid with respect to AccountRequestTracerRequestTrace200ResponseAllOfResult
  */
  public static AccountRequestTracerRequestTrace200ResponseAllOfResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountRequestTracerRequestTrace200ResponseAllOfResult.class);
  }

 /**
  * Convert an instance of AccountRequestTracerRequestTrace200ResponseAllOfResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

