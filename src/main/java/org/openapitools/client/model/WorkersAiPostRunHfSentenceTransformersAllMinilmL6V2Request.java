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
 * WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request {
  public static final String SERIALIZED_NAME_SENTENCES = "sentences";
  @SerializedName(SERIALIZED_NAME_SENTENCES)
  private List<String> sentences = new ArrayList<>();

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request() {
  }

  public WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request sentences(List<String> sentences) {
    this.sentences = sentences;
    return this;
  }

  public WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request addSentencesItem(String sentencesItem) {
    if (this.sentences == null) {
      this.sentences = new ArrayList<>();
    }
    this.sentences.add(sentencesItem);
    return this;
  }

   /**
   * Get sentences
   * @return sentences
  **/
  @javax.annotation.Nonnull
  public List<String> getSentences() {
    return sentences;
  }

  public void setSentences(List<String> sentences) {
    this.sentences = sentences;
  }


  public WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nonnull
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request workersAiPostRunHfSentenceTransformersAllMinilmL6V2Request = (WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request) o;
    return Objects.equals(this.sentences, workersAiPostRunHfSentenceTransformersAllMinilmL6V2Request.sentences) &&
        Objects.equals(this.source, workersAiPostRunHfSentenceTransformersAllMinilmL6V2Request.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentences, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request {\n");
    sb.append("    sentences: ").append(toIndentedString(sentences)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("sentences");
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sentences");
    openapiRequiredFields.add("source");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request is not found in the empty JSON string", WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("sentences") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("sentences").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sentences` to be an array in the JSON string but got `%s`", jsonObj.get("sentences").toString()));
      }
      if (!jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request>() {
           @Override
           public void write(JsonWriter out, WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request
  * @throws IOException if the JSON string is invalid with respect to WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request
  */
  public static WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request.class);
  }

 /**
  * Convert an instance of WorkersAiPostRunHfSentenceTransformersAllMinilmL6V2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
