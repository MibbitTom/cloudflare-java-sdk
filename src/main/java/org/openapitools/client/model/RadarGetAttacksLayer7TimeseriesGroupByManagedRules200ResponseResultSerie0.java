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

import invalidPackageName.JSON;

/**
 * RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0 {
  public static final String SERIALIZED_NAME_BOT = "Bot";
  @SerializedName(SERIALIZED_NAME_BOT)
  private List<String> bot = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIMESTAMPS = "timestamps";
  @SerializedName(SERIALIZED_NAME_TIMESTAMPS)
  private List<String> timestamps = new ArrayList<>();

  public RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0() {
  }

  public RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0 bot(List<String> bot) {
    this.bot = bot;
    return this;
  }

  public RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0 addBotItem(String botItem) {
    if (this.bot == null) {
      this.bot = new ArrayList<>();
    }
    this.bot.add(botItem);
    return this;
  }

   /**
   * Get bot
   * @return bot
  **/
  @javax.annotation.Nonnull
  public List<String> getBot() {
    return bot;
  }

  public void setBot(List<String> bot) {
    this.bot = bot;
  }


  public RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0 timestamps(List<String> timestamps) {
    this.timestamps = timestamps;
    return this;
  }

  public RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0 addTimestampsItem(String timestampsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0 radarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0 = (RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0) o;
    return Objects.equals(this.bot, radarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0.bot) &&
        Objects.equals(this.timestamps, radarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0.timestamps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bot, timestamps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0 {\n");
    sb.append("    bot: ").append(toIndentedString(bot)).append("\n");
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
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
    openapiFields.add("Bot");
    openapiFields.add("timestamps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Bot");
    openapiRequiredFields.add("timestamps");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0 is not found in the empty JSON string", RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("Bot") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("Bot").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Bot` to be an array in the JSON string but got `%s`", jsonObj.get("Bot").toString()));
      }
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
       if (!RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0>() {
           @Override
           public void write(JsonWriter out, RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0
  * @throws IOException if the JSON string is invalid with respect to RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0
  */
  public static RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0.class);
  }

 /**
  * Convert an instance of RadarGetAttacksLayer7TimeseriesGroupByManagedRules200ResponseResultSerie0 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

