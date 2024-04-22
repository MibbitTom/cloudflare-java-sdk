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
import java.math.BigDecimal;
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
 * QueueV2MessagesAckRequestRetriesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class QueueV2MessagesAckRequestRetriesInner {
  public static final String SERIALIZED_NAME_DELAY_SECONDS = "delay_seconds";
  @SerializedName(SERIALIZED_NAME_DELAY_SECONDS)
  private BigDecimal delaySeconds;

  public static final String SERIALIZED_NAME_LEASE_ID = "lease_id";
  @SerializedName(SERIALIZED_NAME_LEASE_ID)
  private String leaseId;

  public QueueV2MessagesAckRequestRetriesInner() {
  }

  public QueueV2MessagesAckRequestRetriesInner delaySeconds(BigDecimal delaySeconds) {
    this.delaySeconds = delaySeconds;
    return this;
  }

   /**
   * The number of seconds to delay before making the message available for another attempt.
   * @return delaySeconds
  **/
  @javax.annotation.Nullable
  public BigDecimal getDelaySeconds() {
    return delaySeconds;
  }

  public void setDelaySeconds(BigDecimal delaySeconds) {
    this.delaySeconds = delaySeconds;
  }


  public QueueV2MessagesAckRequestRetriesInner leaseId(String leaseId) {
    this.leaseId = leaseId;
    return this;
  }

   /**
   * Lease ID for a message to retry.
   * @return leaseId
  **/
  @javax.annotation.Nullable
  public String getLeaseId() {
    return leaseId;
  }

  public void setLeaseId(String leaseId) {
    this.leaseId = leaseId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueV2MessagesAckRequestRetriesInner queueV2MessagesAckRequestRetriesInner = (QueueV2MessagesAckRequestRetriesInner) o;
    return Objects.equals(this.delaySeconds, queueV2MessagesAckRequestRetriesInner.delaySeconds) &&
        Objects.equals(this.leaseId, queueV2MessagesAckRequestRetriesInner.leaseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delaySeconds, leaseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueV2MessagesAckRequestRetriesInner {\n");
    sb.append("    delaySeconds: ").append(toIndentedString(delaySeconds)).append("\n");
    sb.append("    leaseId: ").append(toIndentedString(leaseId)).append("\n");
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
    openapiFields.add("delay_seconds");
    openapiFields.add("lease_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QueueV2MessagesAckRequestRetriesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueueV2MessagesAckRequestRetriesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueueV2MessagesAckRequestRetriesInner is not found in the empty JSON string", QueueV2MessagesAckRequestRetriesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QueueV2MessagesAckRequestRetriesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueueV2MessagesAckRequestRetriesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("lease_id") != null && !jsonObj.get("lease_id").isJsonNull()) && !jsonObj.get("lease_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lease_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lease_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueueV2MessagesAckRequestRetriesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueueV2MessagesAckRequestRetriesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueueV2MessagesAckRequestRetriesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueueV2MessagesAckRequestRetriesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QueueV2MessagesAckRequestRetriesInner>() {
           @Override
           public void write(JsonWriter out, QueueV2MessagesAckRequestRetriesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueueV2MessagesAckRequestRetriesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueueV2MessagesAckRequestRetriesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueueV2MessagesAckRequestRetriesInner
  * @throws IOException if the JSON string is invalid with respect to QueueV2MessagesAckRequestRetriesInner
  */
  public static QueueV2MessagesAckRequestRetriesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueueV2MessagesAckRequestRetriesInner.class);
  }

 /**
  * Convert an instance of QueueV2MessagesAckRequestRetriesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

