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
 * RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0 {
  public static final String SERIALIZED_NAME_F_A_I_L = "FAIL";
  @SerializedName(SERIALIZED_NAME_F_A_I_L)
  private List<String> FAIL = new ArrayList<>();

  public static final String SERIALIZED_NAME_N_O_N_E = "NONE";
  @SerializedName(SERIALIZED_NAME_N_O_N_E)
  private List<String> NONE = new ArrayList<>();

  public static final String SERIALIZED_NAME_P_A_S_S = "PASS";
  @SerializedName(SERIALIZED_NAME_P_A_S_S)
  private List<String> PASS = new ArrayList<>();

  public RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0() {
  }

  public RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0 FAIL(List<String> FAIL) {
    this.FAIL = FAIL;
    return this;
  }

  public RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0 addFAILItem(String FAILItem) {
    if (this.FAIL == null) {
      this.FAIL = new ArrayList<>();
    }
    this.FAIL.add(FAILItem);
    return this;
  }

   /**
   * Get FAIL
   * @return FAIL
  **/
  @javax.annotation.Nonnull
  public List<String> getFAIL() {
    return FAIL;
  }

  public void setFAIL(List<String> FAIL) {
    this.FAIL = FAIL;
  }


  public RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0 NONE(List<String> NONE) {
    this.NONE = NONE;
    return this;
  }

  public RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0 addNONEItem(String NONEItem) {
    if (this.NONE == null) {
      this.NONE = new ArrayList<>();
    }
    this.NONE.add(NONEItem);
    return this;
  }

   /**
   * Get NONE
   * @return NONE
  **/
  @javax.annotation.Nonnull
  public List<String> getNONE() {
    return NONE;
  }

  public void setNONE(List<String> NONE) {
    this.NONE = NONE;
  }


  public RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0 PASS(List<String> PASS) {
    this.PASS = PASS;
    return this;
  }

  public RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0 addPASSItem(String PASSItem) {
    if (this.PASS == null) {
      this.PASS = new ArrayList<>();
    }
    this.PASS.add(PASSItem);
    return this;
  }

   /**
   * Get PASS
   * @return PASS
  **/
  @javax.annotation.Nonnull
  public List<String> getPASS() {
    return PASS;
  }

  public void setPASS(List<String> PASS) {
    this.PASS = PASS;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0 radarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0 = (RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0) o;
    return Objects.equals(this.FAIL, radarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0.FAIL) &&
        Objects.equals(this.NONE, radarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0.NONE) &&
        Objects.equals(this.PASS, radarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0.PASS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FAIL, NONE, PASS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0 {\n");
    sb.append("    FAIL: ").append(toIndentedString(FAIL)).append("\n");
    sb.append("    NONE: ").append(toIndentedString(NONE)).append("\n");
    sb.append("    PASS: ").append(toIndentedString(PASS)).append("\n");
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
    openapiFields.add("FAIL");
    openapiFields.add("NONE");
    openapiFields.add("PASS");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("FAIL");
    openapiRequiredFields.add("NONE");
    openapiRequiredFields.add("PASS");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0 is not found in the empty JSON string", RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("FAIL") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("FAIL").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `FAIL` to be an array in the JSON string but got `%s`", jsonObj.get("FAIL").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("NONE") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("NONE").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `NONE` to be an array in the JSON string but got `%s`", jsonObj.get("NONE").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("PASS") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("PASS").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `PASS` to be an array in the JSON string but got `%s`", jsonObj.get("PASS").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0>() {
           @Override
           public void write(JsonWriter out, RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0
  * @throws IOException if the JSON string is invalid with respect to RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0
  */
  public static RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0.class);
  }

 /**
  * Convert an instance of RadarGetEmailRoutingTimeseriesGroupByArc200ResponseResultSerie0 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

