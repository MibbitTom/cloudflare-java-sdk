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

import invalidPackageName.JSON;

/**
 * WorkersAiPostRunCfMetaM2m10012bRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class WorkersAiPostRunCfMetaM2m10012bRequest {
  public static final String SERIALIZED_NAME_SOURCE_LANG = "source_lang";
  @SerializedName(SERIALIZED_NAME_SOURCE_LANG)
  private String sourceLang = "en";

  public static final String SERIALIZED_NAME_TARGET_LANG = "target_lang";
  @SerializedName(SERIALIZED_NAME_TARGET_LANG)
  private String targetLang;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public WorkersAiPostRunCfMetaM2m10012bRequest() {
  }

  public WorkersAiPostRunCfMetaM2m10012bRequest sourceLang(String sourceLang) {
    this.sourceLang = sourceLang;
    return this;
  }

   /**
   * Get sourceLang
   * @return sourceLang
  **/
  @javax.annotation.Nullable
  public String getSourceLang() {
    return sourceLang;
  }

  public void setSourceLang(String sourceLang) {
    this.sourceLang = sourceLang;
  }


  public WorkersAiPostRunCfMetaM2m10012bRequest targetLang(String targetLang) {
    this.targetLang = targetLang;
    return this;
  }

   /**
   * Get targetLang
   * @return targetLang
  **/
  @javax.annotation.Nonnull
  public String getTargetLang() {
    return targetLang;
  }

  public void setTargetLang(String targetLang) {
    this.targetLang = targetLang;
  }


  public WorkersAiPostRunCfMetaM2m10012bRequest text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nonnull
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkersAiPostRunCfMetaM2m10012bRequest workersAiPostRunCfMetaM2m10012bRequest = (WorkersAiPostRunCfMetaM2m10012bRequest) o;
    return Objects.equals(this.sourceLang, workersAiPostRunCfMetaM2m10012bRequest.sourceLang) &&
        Objects.equals(this.targetLang, workersAiPostRunCfMetaM2m10012bRequest.targetLang) &&
        Objects.equals(this.text, workersAiPostRunCfMetaM2m10012bRequest.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceLang, targetLang, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkersAiPostRunCfMetaM2m10012bRequest {\n");
    sb.append("    sourceLang: ").append(toIndentedString(sourceLang)).append("\n");
    sb.append("    targetLang: ").append(toIndentedString(targetLang)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    openapiFields.add("source_lang");
    openapiFields.add("target_lang");
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("target_lang");
    openapiRequiredFields.add("text");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WorkersAiPostRunCfMetaM2m10012bRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkersAiPostRunCfMetaM2m10012bRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkersAiPostRunCfMetaM2m10012bRequest is not found in the empty JSON string", WorkersAiPostRunCfMetaM2m10012bRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkersAiPostRunCfMetaM2m10012bRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkersAiPostRunCfMetaM2m10012bRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkersAiPostRunCfMetaM2m10012bRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("source_lang") != null && !jsonObj.get("source_lang").isJsonNull()) && !jsonObj.get("source_lang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_lang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_lang").toString()));
      }
      if (!jsonObj.get("target_lang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_lang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_lang").toString()));
      }
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkersAiPostRunCfMetaM2m10012bRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkersAiPostRunCfMetaM2m10012bRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkersAiPostRunCfMetaM2m10012bRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkersAiPostRunCfMetaM2m10012bRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkersAiPostRunCfMetaM2m10012bRequest>() {
           @Override
           public void write(JsonWriter out, WorkersAiPostRunCfMetaM2m10012bRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkersAiPostRunCfMetaM2m10012bRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkersAiPostRunCfMetaM2m10012bRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkersAiPostRunCfMetaM2m10012bRequest
  * @throws IOException if the JSON string is invalid with respect to WorkersAiPostRunCfMetaM2m10012bRequest
  */
  public static WorkersAiPostRunCfMetaM2m10012bRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkersAiPostRunCfMetaM2m10012bRequest.class);
  }

 /**
  * Convert an instance of WorkersAiPostRunCfMetaM2m10012bRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

