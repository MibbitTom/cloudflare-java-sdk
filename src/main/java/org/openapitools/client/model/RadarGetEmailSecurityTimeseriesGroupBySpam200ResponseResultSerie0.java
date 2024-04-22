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
 * RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0 {
  public static final String SERIALIZED_NAME_N_O_T_S_P_A_M = "NOT_SPAM";
  @SerializedName(SERIALIZED_NAME_N_O_T_S_P_A_M)
  private List<String> NOT_SPAM = new ArrayList<>();

  public static final String SERIALIZED_NAME_S_P_A_M = "SPAM";
  @SerializedName(SERIALIZED_NAME_S_P_A_M)
  private List<String> SPAM = new ArrayList<>();

  public RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0() {
  }

  public RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0 NOT_SPAM(List<String> NOT_SPAM) {
    this.NOT_SPAM = NOT_SPAM;
    return this;
  }

  public RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0 addNOTSPAMItem(String NOT_SPAMItem) {
    if (this.NOT_SPAM == null) {
      this.NOT_SPAM = new ArrayList<>();
    }
    this.NOT_SPAM.add(NOT_SPAMItem);
    return this;
  }

   /**
   * Get NOT_SPAM
   * @return NOT_SPAM
  **/
  @javax.annotation.Nonnull
  public List<String> getNOTSPAM() {
    return NOT_SPAM;
  }

  public void setNOTSPAM(List<String> NOT_SPAM) {
    this.NOT_SPAM = NOT_SPAM;
  }


  public RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0 SPAM(List<String> SPAM) {
    this.SPAM = SPAM;
    return this;
  }

  public RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0 addSPAMItem(String SPAMItem) {
    if (this.SPAM == null) {
      this.SPAM = new ArrayList<>();
    }
    this.SPAM.add(SPAMItem);
    return this;
  }

   /**
   * Get SPAM
   * @return SPAM
  **/
  @javax.annotation.Nonnull
  public List<String> getSPAM() {
    return SPAM;
  }

  public void setSPAM(List<String> SPAM) {
    this.SPAM = SPAM;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0 radarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0 = (RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0) o;
    return Objects.equals(this.NOT_SPAM, radarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0.NOT_SPAM) &&
        Objects.equals(this.SPAM, radarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0.SPAM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NOT_SPAM, SPAM);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0 {\n");
    sb.append("    NOT_SPAM: ").append(toIndentedString(NOT_SPAM)).append("\n");
    sb.append("    SPAM: ").append(toIndentedString(SPAM)).append("\n");
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
    openapiFields.add("NOT_SPAM");
    openapiFields.add("SPAM");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("NOT_SPAM");
    openapiRequiredFields.add("SPAM");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0 is not found in the empty JSON string", RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("NOT_SPAM") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("NOT_SPAM").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `NOT_SPAM` to be an array in the JSON string but got `%s`", jsonObj.get("NOT_SPAM").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("SPAM") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("SPAM").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SPAM` to be an array in the JSON string but got `%s`", jsonObj.get("SPAM").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0>() {
           @Override
           public void write(JsonWriter out, RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0
  * @throws IOException if the JSON string is invalid with respect to RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0
  */
  public static RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0.class);
  }

 /**
  * Convert an instance of RadarGetEmailSecurityTimeseriesGroupBySpam200ResponseResultSerie0 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

