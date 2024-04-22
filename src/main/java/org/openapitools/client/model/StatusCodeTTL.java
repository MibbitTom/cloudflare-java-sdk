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
import org.openapitools.client.model.StatusCodeRange;

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
 * Specify how long Cloudflare should cache the response based on the status code from the origin. Can be a single status code or a range or status codes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class StatusCodeTTL {
  public static final String SERIALIZED_NAME_STATUS_CODE_RANGE = "status_code_range";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE_RANGE)
  private StatusCodeRange statusCodeRange;

  public static final String SERIALIZED_NAME_STATUS_CODE_VALUE = "status_code_value";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE_VALUE)
  private Integer statusCodeValue;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Integer value;

  public StatusCodeTTL() {
  }

  public StatusCodeTTL statusCodeRange(StatusCodeRange statusCodeRange) {
    this.statusCodeRange = statusCodeRange;
    return this;
  }

   /**
   * Get statusCodeRange
   * @return statusCodeRange
  **/
  @javax.annotation.Nullable
  public StatusCodeRange getStatusCodeRange() {
    return statusCodeRange;
  }

  public void setStatusCodeRange(StatusCodeRange statusCodeRange) {
    this.statusCodeRange = statusCodeRange;
  }


  public StatusCodeTTL statusCodeValue(Integer statusCodeValue) {
    this.statusCodeValue = statusCodeValue;
    return this;
  }

   /**
   * Set the ttl for responses with this specific status code
   * @return statusCodeValue
  **/
  @javax.annotation.Nullable
  public Integer getStatusCodeValue() {
    return statusCodeValue;
  }

  public void setStatusCodeValue(Integer statusCodeValue) {
    this.statusCodeValue = statusCodeValue;
  }


  public StatusCodeTTL value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Time to cache a response (in seconds). A value of 0 is equivalent to setting the Cache-Control header with the value \&quot;no-cache\&quot;. A value of -1 is equivalent to setting Cache-Control header with the value of \&quot;no-store\&quot;.
   * @return value
  **/
  @javax.annotation.Nonnull
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCodeTTL statusCodeTTL = (StatusCodeTTL) o;
    return Objects.equals(this.statusCodeRange, statusCodeTTL.statusCodeRange) &&
        Objects.equals(this.statusCodeValue, statusCodeTTL.statusCodeValue) &&
        Objects.equals(this.value, statusCodeTTL.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCodeRange, statusCodeValue, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCodeTTL {\n");
    sb.append("    statusCodeRange: ").append(toIndentedString(statusCodeRange)).append("\n");
    sb.append("    statusCodeValue: ").append(toIndentedString(statusCodeValue)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("status_code_range");
    openapiFields.add("status_code_value");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StatusCodeTTL
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StatusCodeTTL.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatusCodeTTL is not found in the empty JSON string", StatusCodeTTL.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StatusCodeTTL.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatusCodeTTL` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StatusCodeTTL.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `status_code_range`
      if (jsonObj.get("status_code_range") != null && !jsonObj.get("status_code_range").isJsonNull()) {
        StatusCodeRange.validateJsonElement(jsonObj.get("status_code_range"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatusCodeTTL.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatusCodeTTL' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatusCodeTTL> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatusCodeTTL.class));

       return (TypeAdapter<T>) new TypeAdapter<StatusCodeTTL>() {
           @Override
           public void write(JsonWriter out, StatusCodeTTL value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatusCodeTTL read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StatusCodeTTL given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatusCodeTTL
  * @throws IOException if the JSON string is invalid with respect to StatusCodeTTL
  */
  public static StatusCodeTTL fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatusCodeTTL.class);
  }

 /**
  * Convert an instance of StatusCodeTTL to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

