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

import org.openapitools.client.JSON;

/**
 * MqConsumerUpdatedSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class MqConsumerUpdatedSettings {
  public static final String SERIALIZED_NAME_BATCH_SIZE = "batch_size";
  @SerializedName(SERIALIZED_NAME_BATCH_SIZE)
  private BigDecimal batchSize;

  public static final String SERIALIZED_NAME_MAX_RETRIES = "max_retries";
  @SerializedName(SERIALIZED_NAME_MAX_RETRIES)
  private BigDecimal maxRetries;

  public static final String SERIALIZED_NAME_MAX_WAIT_TIME_MS = "max_wait_time_ms";
  @SerializedName(SERIALIZED_NAME_MAX_WAIT_TIME_MS)
  private BigDecimal maxWaitTimeMs;

  public MqConsumerUpdatedSettings() {
  }

  public MqConsumerUpdatedSettings batchSize(BigDecimal batchSize) {
    this.batchSize = batchSize;
    return this;
  }

   /**
   * Get batchSize
   * @return batchSize
  **/
  @javax.annotation.Nullable
  public BigDecimal getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(BigDecimal batchSize) {
    this.batchSize = batchSize;
  }


  public MqConsumerUpdatedSettings maxRetries(BigDecimal maxRetries) {
    this.maxRetries = maxRetries;
    return this;
  }

   /**
   * Get maxRetries
   * @return maxRetries
  **/
  @javax.annotation.Nullable
  public BigDecimal getMaxRetries() {
    return maxRetries;
  }

  public void setMaxRetries(BigDecimal maxRetries) {
    this.maxRetries = maxRetries;
  }


  public MqConsumerUpdatedSettings maxWaitTimeMs(BigDecimal maxWaitTimeMs) {
    this.maxWaitTimeMs = maxWaitTimeMs;
    return this;
  }

   /**
   * Get maxWaitTimeMs
   * @return maxWaitTimeMs
  **/
  @javax.annotation.Nullable
  public BigDecimal getMaxWaitTimeMs() {
    return maxWaitTimeMs;
  }

  public void setMaxWaitTimeMs(BigDecimal maxWaitTimeMs) {
    this.maxWaitTimeMs = maxWaitTimeMs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MqConsumerUpdatedSettings mqConsumerUpdatedSettings = (MqConsumerUpdatedSettings) o;
    return Objects.equals(this.batchSize, mqConsumerUpdatedSettings.batchSize) &&
        Objects.equals(this.maxRetries, mqConsumerUpdatedSettings.maxRetries) &&
        Objects.equals(this.maxWaitTimeMs, mqConsumerUpdatedSettings.maxWaitTimeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchSize, maxRetries, maxWaitTimeMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MqConsumerUpdatedSettings {\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
    sb.append("    maxWaitTimeMs: ").append(toIndentedString(maxWaitTimeMs)).append("\n");
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
    openapiFields.add("batch_size");
    openapiFields.add("max_retries");
    openapiFields.add("max_wait_time_ms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MqConsumerUpdatedSettings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MqConsumerUpdatedSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MqConsumerUpdatedSettings is not found in the empty JSON string", MqConsumerUpdatedSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MqConsumerUpdatedSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MqConsumerUpdatedSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MqConsumerUpdatedSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MqConsumerUpdatedSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MqConsumerUpdatedSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MqConsumerUpdatedSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<MqConsumerUpdatedSettings>() {
           @Override
           public void write(JsonWriter out, MqConsumerUpdatedSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MqConsumerUpdatedSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MqConsumerUpdatedSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MqConsumerUpdatedSettings
  * @throws IOException if the JSON string is invalid with respect to MqConsumerUpdatedSettings
  */
  public static MqConsumerUpdatedSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MqConsumerUpdatedSettings.class);
  }

 /**
  * Convert an instance of MqConsumerUpdatedSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

