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
import org.openapitools.client.model.DigitalExperienceMonitoringTimingAggregates;

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
 * DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner {
  public static final String SERIALIZED_NAME_COLO = "colo";
  @SerializedName(SERIALIZED_NAME_COLO)
  private String colo;

  public static final String SERIALIZED_NAME_RESOURCE_FETCH_TIME = "resourceFetchTime";
  @SerializedName(SERIALIZED_NAME_RESOURCE_FETCH_TIME)
  private DigitalExperienceMonitoringTimingAggregates resourceFetchTime;

  public DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner() {
  }

  public DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner colo(String colo) {
    this.colo = colo;
    return this;
  }

   /**
   * Cloudflare colo
   * @return colo
  **/
  @javax.annotation.Nonnull
  public String getColo() {
    return colo;
  }

  public void setColo(String colo) {
    this.colo = colo;
  }


  public DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner resourceFetchTime(DigitalExperienceMonitoringTimingAggregates resourceFetchTime) {
    this.resourceFetchTime = resourceFetchTime;
    return this;
  }

   /**
   * Get resourceFetchTime
   * @return resourceFetchTime
  **/
  @javax.annotation.Nonnull
  public DigitalExperienceMonitoringTimingAggregates getResourceFetchTime() {
    return resourceFetchTime;
  }

  public void setResourceFetchTime(DigitalExperienceMonitoringTimingAggregates resourceFetchTime) {
    this.resourceFetchTime = resourceFetchTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner digitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner = (DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner) o;
    return Objects.equals(this.colo, digitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner.colo) &&
        Objects.equals(this.resourceFetchTime, digitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner.resourceFetchTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colo, resourceFetchTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner {\n");
    sb.append("    colo: ").append(toIndentedString(colo)).append("\n");
    sb.append("    resourceFetchTime: ").append(toIndentedString(resourceFetchTime)).append("\n");
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
    openapiFields.add("colo");
    openapiFields.add("resourceFetchTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("colo");
    openapiRequiredFields.add("resourceFetchTime");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner is not found in the empty JSON string", DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("colo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `colo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("colo").toString()));
      }
      // validate the required field `resourceFetchTime`
      DigitalExperienceMonitoringTimingAggregates.validateJsonElement(jsonObj.get("resourceFetchTime"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner>() {
           @Override
           public void write(JsonWriter out, DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner
  * @throws IOException if the JSON string is invalid with respect to DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner
  */
  public static DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner.class);
  }

 /**
  * Convert an instance of DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

