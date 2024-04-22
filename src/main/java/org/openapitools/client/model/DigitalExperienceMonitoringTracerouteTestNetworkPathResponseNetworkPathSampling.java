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

import org.openapitools.client.JSON;

/**
 * Specifies the sampling applied, if any, to the slots response. When sampled, results shown represent the first test run to the start of each sampling interval.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling {
  /**
   * Gets or Sets unit
   */
  @JsonAdapter(UnitEnum.Adapter.class)
  public enum UnitEnum {
    HOURS("hours");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UnitEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      UnitEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private UnitEnum unit;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Integer value;

  public DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling() {
  }

  public DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nonnull
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }


  public DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling digitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling = (DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling) o;
    return Objects.equals(this.unit, digitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling.unit) &&
        Objects.equals(this.value, digitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("unit");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("unit");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling is not found in the empty JSON string", DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
      // validate the required field `unit`
      UnitEnum.validateJsonElement(jsonObj.get("unit"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling.class));

       return (TypeAdapter<T>) new TypeAdapter<DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling>() {
           @Override
           public void write(JsonWriter out, DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling
  * @throws IOException if the JSON string is invalid with respect to DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling
  */
  public static DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling.class);
  }

 /**
  * Convert an instance of DigitalExperienceMonitoringTracerouteTestNetworkPathResponseNetworkPathSampling to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

