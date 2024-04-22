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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.CloudforceOneRequestStatus;
import org.openapitools.client.model.CloudforceOneTlp;

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
 * CloudforceOneRequestItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class CloudforceOneRequestItem {
  public static final String SERIALIZED_NAME_COMPLETED = "completed";
  @SerializedName(SERIALIZED_NAME_COMPLETED)
  private OffsetDateTime completed;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MESSAGE_TOKENS = "message_tokens";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TOKENS)
  private Integer messageTokens;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private OffsetDateTime priority;

  public static final String SERIALIZED_NAME_READABLE_ID = "readable_id";
  @SerializedName(SERIALIZED_NAME_READABLE_ID)
  private String readableId;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private String request;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CloudforceOneRequestStatus status;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_TLP = "tlp";
  @SerializedName(SERIALIZED_NAME_TLP)
  private CloudforceOneTlp tlp;

  public static final String SERIALIZED_NAME_TOKENS = "tokens";
  @SerializedName(SERIALIZED_NAME_TOKENS)
  private Integer tokens;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public CloudforceOneRequestItem() {
  }

  public CloudforceOneRequestItem(
     String id
  ) {
    this();
    this.id = id;
  }

  public CloudforceOneRequestItem completed(OffsetDateTime completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCompleted() {
    return completed;
  }

  public void setCompleted(OffsetDateTime completed) {
    this.completed = completed;
  }


  public CloudforceOneRequestItem content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Request content
   * @return content
  **/
  @javax.annotation.Nonnull
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public CloudforceOneRequestItem created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


   /**
   * UUID
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }



  public CloudforceOneRequestItem messageTokens(Integer messageTokens) {
    this.messageTokens = messageTokens;
    return this;
  }

   /**
   * Tokens for the request messages
   * @return messageTokens
  **/
  @javax.annotation.Nullable
  public Integer getMessageTokens() {
    return messageTokens;
  }

  public void setMessageTokens(Integer messageTokens) {
    this.messageTokens = messageTokens;
  }


  public CloudforceOneRequestItem priority(OffsetDateTime priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getPriority() {
    return priority;
  }

  public void setPriority(OffsetDateTime priority) {
    this.priority = priority;
  }


  public CloudforceOneRequestItem readableId(String readableId) {
    this.readableId = readableId;
    return this;
  }

   /**
   * Readable Request ID
   * @return readableId
  **/
  @javax.annotation.Nullable
  public String getReadableId() {
    return readableId;
  }

  public void setReadableId(String readableId) {
    this.readableId = readableId;
  }


  public CloudforceOneRequestItem request(String request) {
    this.request = request;
    return this;
  }

   /**
   * Requested information from request
   * @return request
  **/
  @javax.annotation.Nonnull
  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }


  public CloudforceOneRequestItem status(CloudforceOneRequestStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public CloudforceOneRequestStatus getStatus() {
    return status;
  }

  public void setStatus(CloudforceOneRequestStatus status) {
    this.status = status;
  }


  public CloudforceOneRequestItem summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Brief description of the request
   * @return summary
  **/
  @javax.annotation.Nonnull
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }


  public CloudforceOneRequestItem tlp(CloudforceOneTlp tlp) {
    this.tlp = tlp;
    return this;
  }

   /**
   * Get tlp
   * @return tlp
  **/
  @javax.annotation.Nonnull
  public CloudforceOneTlp getTlp() {
    return tlp;
  }

  public void setTlp(CloudforceOneTlp tlp) {
    this.tlp = tlp;
  }


  public CloudforceOneRequestItem tokens(Integer tokens) {
    this.tokens = tokens;
    return this;
  }

   /**
   * Tokens for the request
   * @return tokens
  **/
  @javax.annotation.Nullable
  public Integer getTokens() {
    return tokens;
  }

  public void setTokens(Integer tokens) {
    this.tokens = tokens;
  }


  public CloudforceOneRequestItem updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudforceOneRequestItem cloudforceOneRequestItem = (CloudforceOneRequestItem) o;
    return Objects.equals(this.completed, cloudforceOneRequestItem.completed) &&
        Objects.equals(this.content, cloudforceOneRequestItem.content) &&
        Objects.equals(this.created, cloudforceOneRequestItem.created) &&
        Objects.equals(this.id, cloudforceOneRequestItem.id) &&
        Objects.equals(this.messageTokens, cloudforceOneRequestItem.messageTokens) &&
        Objects.equals(this.priority, cloudforceOneRequestItem.priority) &&
        Objects.equals(this.readableId, cloudforceOneRequestItem.readableId) &&
        Objects.equals(this.request, cloudforceOneRequestItem.request) &&
        Objects.equals(this.status, cloudforceOneRequestItem.status) &&
        Objects.equals(this.summary, cloudforceOneRequestItem.summary) &&
        Objects.equals(this.tlp, cloudforceOneRequestItem.tlp) &&
        Objects.equals(this.tokens, cloudforceOneRequestItem.tokens) &&
        Objects.equals(this.updated, cloudforceOneRequestItem.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completed, content, created, id, messageTokens, priority, readableId, request, status, summary, tlp, tokens, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudforceOneRequestItem {\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messageTokens: ").append(toIndentedString(messageTokens)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    readableId: ").append(toIndentedString(readableId)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    tlp: ").append(toIndentedString(tlp)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    openapiFields.add("completed");
    openapiFields.add("content");
    openapiFields.add("created");
    openapiFields.add("id");
    openapiFields.add("message_tokens");
    openapiFields.add("priority");
    openapiFields.add("readable_id");
    openapiFields.add("request");
    openapiFields.add("status");
    openapiFields.add("summary");
    openapiFields.add("tlp");
    openapiFields.add("tokens");
    openapiFields.add("updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("priority");
    openapiRequiredFields.add("request");
    openapiRequiredFields.add("summary");
    openapiRequiredFields.add("tlp");
    openapiRequiredFields.add("updated");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CloudforceOneRequestItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudforceOneRequestItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudforceOneRequestItem is not found in the empty JSON string", CloudforceOneRequestItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudforceOneRequestItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudforceOneRequestItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CloudforceOneRequestItem.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("readable_id") != null && !jsonObj.get("readable_id").isJsonNull()) && !jsonObj.get("readable_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `readable_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("readable_id").toString()));
      }
      if (!jsonObj.get("request").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        CloudforceOneRequestStatus.validateJsonElement(jsonObj.get("status"));
      }
      if (!jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      // validate the required field `tlp`
      CloudforceOneTlp.validateJsonElement(jsonObj.get("tlp"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudforceOneRequestItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudforceOneRequestItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudforceOneRequestItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudforceOneRequestItem.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudforceOneRequestItem>() {
           @Override
           public void write(JsonWriter out, CloudforceOneRequestItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudforceOneRequestItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CloudforceOneRequestItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudforceOneRequestItem
  * @throws IOException if the JSON string is invalid with respect to CloudforceOneRequestItem
  */
  public static CloudforceOneRequestItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudforceOneRequestItem.class);
  }

 /**
  * Convert an instance of CloudforceOneRequestItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
