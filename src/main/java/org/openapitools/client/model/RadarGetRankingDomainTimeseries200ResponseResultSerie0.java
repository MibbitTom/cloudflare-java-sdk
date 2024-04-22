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
 * RadarGetRankingDomainTimeseries200ResponseResultSerie0
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetRankingDomainTimeseries200ResponseResultSerie0 {
  public static final String SERIALIZED_NAME_TIMESTAMPS = "timestamps";
  @SerializedName(SERIALIZED_NAME_TIMESTAMPS)
  private List<String> timestamps = new ArrayList<>();

  public RadarGetRankingDomainTimeseries200ResponseResultSerie0() {
  }

  public RadarGetRankingDomainTimeseries200ResponseResultSerie0 timestamps(List<String> timestamps) {
    this.timestamps = timestamps;
    return this;
  }

  public RadarGetRankingDomainTimeseries200ResponseResultSerie0 addTimestampsItem(String timestampsItem) {
    if (this.timestamps == null) {
      this.timestamps = new ArrayList<>();
    }
    this.timestamps.add(timestampsItem);
    return this;
  }

   /**
   * Get timestamps
   * @return timestamps
  **/
  @javax.annotation.Nonnull
  public List<String> getTimestamps() {
    return timestamps;
  }

  public void setTimestamps(List<String> timestamps) {
    this.timestamps = timestamps;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the RadarGetRankingDomainTimeseries200ResponseResultSerie0 instance itself
   */
  public RadarGetRankingDomainTimeseries200ResponseResultSerie0 putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetRankingDomainTimeseries200ResponseResultSerie0 radarGetRankingDomainTimeseries200ResponseResultSerie0 = (RadarGetRankingDomainTimeseries200ResponseResultSerie0) o;
    return Objects.equals(this.timestamps, radarGetRankingDomainTimeseries200ResponseResultSerie0.timestamps)&&
        Objects.equals(this.additionalProperties, radarGetRankingDomainTimeseries200ResponseResultSerie0.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamps, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetRankingDomainTimeseries200ResponseResultSerie0 {\n");
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("timestamps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("timestamps");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetRankingDomainTimeseries200ResponseResultSerie0
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetRankingDomainTimeseries200ResponseResultSerie0.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetRankingDomainTimeseries200ResponseResultSerie0 is not found in the empty JSON string", RadarGetRankingDomainTimeseries200ResponseResultSerie0.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetRankingDomainTimeseries200ResponseResultSerie0.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("timestamps") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("timestamps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamps` to be an array in the JSON string but got `%s`", jsonObj.get("timestamps").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetRankingDomainTimeseries200ResponseResultSerie0.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetRankingDomainTimeseries200ResponseResultSerie0' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetRankingDomainTimeseries200ResponseResultSerie0> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetRankingDomainTimeseries200ResponseResultSerie0.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetRankingDomainTimeseries200ResponseResultSerie0>() {
           @Override
           public void write(JsonWriter out, RadarGetRankingDomainTimeseries200ResponseResultSerie0 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetRankingDomainTimeseries200ResponseResultSerie0 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RadarGetRankingDomainTimeseries200ResponseResultSerie0 instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetRankingDomainTimeseries200ResponseResultSerie0 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetRankingDomainTimeseries200ResponseResultSerie0
  * @throws IOException if the JSON string is invalid with respect to RadarGetRankingDomainTimeseries200ResponseResultSerie0
  */
  public static RadarGetRankingDomainTimeseries200ResponseResultSerie0 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetRankingDomainTimeseries200ResponseResultSerie0.class);
  }

 /**
  * Convert an instance of RadarGetRankingDomainTimeseries200ResponseResultSerie0 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

