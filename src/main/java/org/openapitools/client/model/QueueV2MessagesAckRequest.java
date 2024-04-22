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
import org.openapitools.client.model.QueueV2MessagesAckRequestAcksInner;
import org.openapitools.client.model.QueueV2MessagesAckRequestRetriesInner;

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
 * QueueV2MessagesAckRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class QueueV2MessagesAckRequest {
  public static final String SERIALIZED_NAME_ACKS = "acks";
  @SerializedName(SERIALIZED_NAME_ACKS)
  private List<QueueV2MessagesAckRequestAcksInner> acks = new ArrayList<>();

  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  private List<QueueV2MessagesAckRequestRetriesInner> retries = new ArrayList<>();

  public QueueV2MessagesAckRequest() {
  }

  public QueueV2MessagesAckRequest acks(List<QueueV2MessagesAckRequestAcksInner> acks) {
    this.acks = acks;
    return this;
  }

  public QueueV2MessagesAckRequest addAcksItem(QueueV2MessagesAckRequestAcksInner acksItem) {
    if (this.acks == null) {
      this.acks = new ArrayList<>();
    }
    this.acks.add(acksItem);
    return this;
  }

   /**
   * Get acks
   * @return acks
  **/
  @javax.annotation.Nullable
  public List<QueueV2MessagesAckRequestAcksInner> getAcks() {
    return acks;
  }

  public void setAcks(List<QueueV2MessagesAckRequestAcksInner> acks) {
    this.acks = acks;
  }


  public QueueV2MessagesAckRequest retries(List<QueueV2MessagesAckRequestRetriesInner> retries) {
    this.retries = retries;
    return this;
  }

  public QueueV2MessagesAckRequest addRetriesItem(QueueV2MessagesAckRequestRetriesInner retriesItem) {
    if (this.retries == null) {
      this.retries = new ArrayList<>();
    }
    this.retries.add(retriesItem);
    return this;
  }

   /**
   * Get retries
   * @return retries
  **/
  @javax.annotation.Nullable
  public List<QueueV2MessagesAckRequestRetriesInner> getRetries() {
    return retries;
  }

  public void setRetries(List<QueueV2MessagesAckRequestRetriesInner> retries) {
    this.retries = retries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueV2MessagesAckRequest queueV2MessagesAckRequest = (QueueV2MessagesAckRequest) o;
    return Objects.equals(this.acks, queueV2MessagesAckRequest.acks) &&
        Objects.equals(this.retries, queueV2MessagesAckRequest.retries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acks, retries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueV2MessagesAckRequest {\n");
    sb.append("    acks: ").append(toIndentedString(acks)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
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
    openapiFields.add("acks");
    openapiFields.add("retries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QueueV2MessagesAckRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueueV2MessagesAckRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueueV2MessagesAckRequest is not found in the empty JSON string", QueueV2MessagesAckRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QueueV2MessagesAckRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueueV2MessagesAckRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("acks") != null && !jsonObj.get("acks").isJsonNull()) {
        JsonArray jsonArrayacks = jsonObj.getAsJsonArray("acks");
        if (jsonArrayacks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("acks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `acks` to be an array in the JSON string but got `%s`", jsonObj.get("acks").toString()));
          }

          // validate the optional field `acks` (array)
          for (int i = 0; i < jsonArrayacks.size(); i++) {
            QueueV2MessagesAckRequestAcksInner.validateJsonElement(jsonArrayacks.get(i));
          };
        }
      }
      if (jsonObj.get("retries") != null && !jsonObj.get("retries").isJsonNull()) {
        JsonArray jsonArrayretries = jsonObj.getAsJsonArray("retries");
        if (jsonArrayretries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("retries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `retries` to be an array in the JSON string but got `%s`", jsonObj.get("retries").toString()));
          }

          // validate the optional field `retries` (array)
          for (int i = 0; i < jsonArrayretries.size(); i++) {
            QueueV2MessagesAckRequestRetriesInner.validateJsonElement(jsonArrayretries.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueueV2MessagesAckRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueueV2MessagesAckRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueueV2MessagesAckRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueueV2MessagesAckRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<QueueV2MessagesAckRequest>() {
           @Override
           public void write(JsonWriter out, QueueV2MessagesAckRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueueV2MessagesAckRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueueV2MessagesAckRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueueV2MessagesAckRequest
  * @throws IOException if the JSON string is invalid with respect to QueueV2MessagesAckRequest
  */
  public static QueueV2MessagesAckRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueueV2MessagesAckRequest.class);
  }

 /**
  * Convert an instance of QueueV2MessagesAckRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

