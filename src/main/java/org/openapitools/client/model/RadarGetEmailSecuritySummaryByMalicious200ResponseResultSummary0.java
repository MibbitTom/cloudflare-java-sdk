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
 * RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0 {
  public static final String SERIALIZED_NAME_M_A_L_I_C_I_O_U_S = "MALICIOUS";
  @SerializedName(SERIALIZED_NAME_M_A_L_I_C_I_O_U_S)
  private String MALICIOUS;

  public static final String SERIALIZED_NAME_N_O_T_M_A_L_I_C_I_O_U_S = "NOT_MALICIOUS";
  @SerializedName(SERIALIZED_NAME_N_O_T_M_A_L_I_C_I_O_U_S)
  private String NOT_MALICIOUS;

  public RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0() {
  }

  public RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0 MALICIOUS(String MALICIOUS) {
    this.MALICIOUS = MALICIOUS;
    return this;
  }

   /**
   * Get MALICIOUS
   * @return MALICIOUS
  **/
  @javax.annotation.Nonnull
  public String getMALICIOUS() {
    return MALICIOUS;
  }

  public void setMALICIOUS(String MALICIOUS) {
    this.MALICIOUS = MALICIOUS;
  }


  public RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0 NOT_MALICIOUS(String NOT_MALICIOUS) {
    this.NOT_MALICIOUS = NOT_MALICIOUS;
    return this;
  }

   /**
   * Get NOT_MALICIOUS
   * @return NOT_MALICIOUS
  **/
  @javax.annotation.Nonnull
  public String getNOTMALICIOUS() {
    return NOT_MALICIOUS;
  }

  public void setNOTMALICIOUS(String NOT_MALICIOUS) {
    this.NOT_MALICIOUS = NOT_MALICIOUS;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0 radarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0 = (RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0) o;
    return Objects.equals(this.MALICIOUS, radarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0.MALICIOUS) &&
        Objects.equals(this.NOT_MALICIOUS, radarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0.NOT_MALICIOUS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MALICIOUS, NOT_MALICIOUS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0 {\n");
    sb.append("    MALICIOUS: ").append(toIndentedString(MALICIOUS)).append("\n");
    sb.append("    NOT_MALICIOUS: ").append(toIndentedString(NOT_MALICIOUS)).append("\n");
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
    openapiFields.add("MALICIOUS");
    openapiFields.add("NOT_MALICIOUS");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MALICIOUS");
    openapiRequiredFields.add("NOT_MALICIOUS");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0 is not found in the empty JSON string", RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("MALICIOUS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MALICIOUS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MALICIOUS").toString()));
      }
      if (!jsonObj.get("NOT_MALICIOUS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NOT_MALICIOUS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NOT_MALICIOUS").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0>() {
           @Override
           public void write(JsonWriter out, RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0
  * @throws IOException if the JSON string is invalid with respect to RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0
  */
  public static RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0.class);
  }

 /**
  * Convert an instance of RadarGetEmailSecuritySummaryByMalicious200ResponseResultSummary0 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

