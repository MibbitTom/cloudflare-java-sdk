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

import cloudflare.JSON;

/**
 * DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner {
  public static final String SERIALIZED_NAME_STATUS200 = "status200";
  @SerializedName(SERIALIZED_NAME_STATUS200)
  private Integer status200;

  public static final String SERIALIZED_NAME_STATUS300 = "status300";
  @SerializedName(SERIALIZED_NAME_STATUS300)
  private Integer status300;

  public static final String SERIALIZED_NAME_STATUS400 = "status400";
  @SerializedName(SERIALIZED_NAME_STATUS400)
  private Integer status400;

  public static final String SERIALIZED_NAME_STATUS500 = "status500";
  @SerializedName(SERIALIZED_NAME_STATUS500)
  private Integer status500;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner() {
  }

  public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner status200(Integer status200) {
    this.status200 = status200;
    return this;
  }

   /**
   * Get status200
   * @return status200
  **/
  @javax.annotation.Nonnull
  public Integer getStatus200() {
    return status200;
  }

  public void setStatus200(Integer status200) {
    this.status200 = status200;
  }


  public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner status300(Integer status300) {
    this.status300 = status300;
    return this;
  }

   /**
   * Get status300
   * @return status300
  **/
  @javax.annotation.Nonnull
  public Integer getStatus300() {
    return status300;
  }

  public void setStatus300(Integer status300) {
    this.status300 = status300;
  }


  public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner status400(Integer status400) {
    this.status400 = status400;
    return this;
  }

   /**
   * Get status400
   * @return status400
  **/
  @javax.annotation.Nonnull
  public Integer getStatus400() {
    return status400;
  }

  public void setStatus400(Integer status400) {
    this.status400 = status400;
  }


  public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner status500(Integer status500) {
    this.status500 = status500;
    return this;
  }

   /**
   * Get status500
   * @return status500
  **/
  @javax.annotation.Nonnull
  public Integer getStatus500() {
    return status500;
  }

  public void setStatus500(Integer status500) {
    this.status500 = status500;
  }


  public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner digitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner = (DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner) o;
    return Objects.equals(this.status200, digitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner.status200) &&
        Objects.equals(this.status300, digitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner.status300) &&
        Objects.equals(this.status400, digitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner.status400) &&
        Objects.equals(this.status500, digitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner.status500) &&
        Objects.equals(this.timestamp, digitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status200, status300, status400, status500, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner {\n");
    sb.append("    status200: ").append(toIndentedString(status200)).append("\n");
    sb.append("    status300: ").append(toIndentedString(status300)).append("\n");
    sb.append("    status400: ").append(toIndentedString(status400)).append("\n");
    sb.append("    status500: ").append(toIndentedString(status500)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
    openapiFields.add("status200");
    openapiFields.add("status300");
    openapiFields.add("status400");
    openapiFields.add("status500");
    openapiFields.add("timestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status200");
    openapiRequiredFields.add("status300");
    openapiRequiredFields.add("status400");
    openapiRequiredFields.add("status500");
    openapiRequiredFields.add("timestamp");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner is not found in the empty JSON string", DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner>() {
           @Override
           public void write(JsonWriter out, DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner
  * @throws IOException if the JSON string is invalid with respect to DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner
  */
  public static DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner.class);
  }

 /**
  * Convert an instance of DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

