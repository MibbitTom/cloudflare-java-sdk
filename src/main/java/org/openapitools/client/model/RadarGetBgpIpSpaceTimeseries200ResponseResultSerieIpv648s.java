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
 * RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s {
  public static final String SERIALIZED_NAME_TIMESTAMPS = "timestamps";
  @SerializedName(SERIALIZED_NAME_TIMESTAMPS)
  private List<OffsetDateTime> timestamps = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Integer> values = new ArrayList<>();

  public RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s() {
  }

  public RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s timestamps(List<OffsetDateTime> timestamps) {
    this.timestamps = timestamps;
    return this;
  }

  public RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s addTimestampsItem(OffsetDateTime timestampsItem) {
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
  public List<OffsetDateTime> getTimestamps() {
    return timestamps;
  }

  public void setTimestamps(List<OffsetDateTime> timestamps) {
    this.timestamps = timestamps;
  }


  public RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s values(List<Integer> values) {
    this.values = values;
    return this;
  }

  public RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s addValuesItem(Integer valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nonnull
  public List<Integer> getValues() {
    return values;
  }

  public void setValues(List<Integer> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s radarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s = (RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s) o;
    return Objects.equals(this.timestamps, radarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s.timestamps) &&
        Objects.equals(this.values, radarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamps, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s {\n");
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("timestamps");
    openapiRequiredFields.add("values");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s is not found in the empty JSON string", RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s.openapiRequiredFields) {
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
      // ensure the required json array is present
      if (jsonObj.get("values") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s>() {
           @Override
           public void write(JsonWriter out, RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s
  * @throws IOException if the JSON string is invalid with respect to RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s
  */
  public static RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s.class);
  }

 /**
  * Convert an instance of RadarGetBgpIpSpaceTimeseries200ResponseResultSerieIpv648s to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

