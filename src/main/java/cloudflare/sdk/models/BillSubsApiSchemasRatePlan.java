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
import cloudflare.sdk.models.BillSubsApiComponentValue;
import cloudflare.sdk.models.BillSubsApiSchemasFrequency;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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

import cloudflare.JSON;

/**
 * BillSubsApiSchemasRatePlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class BillSubsApiSchemasRatePlan {
  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  private List<BillSubsApiComponentValue> components = new ArrayList<>();

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private BigDecimal duration;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private BillSubsApiSchemasFrequency frequency;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public BillSubsApiSchemasRatePlan() {
  }

  public BillSubsApiSchemasRatePlan(
     String currency, 
     String id, 
     String name
  ) {
    this();
    this.currency = currency;
    this.id = id;
    this.name = name;
  }

  public BillSubsApiSchemasRatePlan components(List<BillSubsApiComponentValue> components) {
    this.components = components;
    return this;
  }

  public BillSubsApiSchemasRatePlan addComponentsItem(BillSubsApiComponentValue componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Array of available components values for the plan.
   * @return components
  **/
  @javax.annotation.Nullable
  public List<BillSubsApiComponentValue> getComponents() {
    return components;
  }

  public void setComponents(List<BillSubsApiComponentValue> components) {
    this.components = components;
  }


   /**
   * The monetary unit in which pricing information is displayed.
   * @return currency
  **/
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }



  public BillSubsApiSchemasRatePlan duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration of the plan subscription.
   * @return duration
  **/
  @javax.annotation.Nullable
  public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }


  public BillSubsApiSchemasRatePlan frequency(BillSubsApiSchemasFrequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  public BillSubsApiSchemasFrequency getFrequency() {
    return frequency;
  }

  public void setFrequency(BillSubsApiSchemasFrequency frequency) {
    this.frequency = frequency;
  }


   /**
   * Plan identifier tag.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



   /**
   * The plan name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillSubsApiSchemasRatePlan billSubsApiSchemasRatePlan = (BillSubsApiSchemasRatePlan) o;
    return Objects.equals(this.components, billSubsApiSchemasRatePlan.components) &&
        Objects.equals(this.currency, billSubsApiSchemasRatePlan.currency) &&
        Objects.equals(this.duration, billSubsApiSchemasRatePlan.duration) &&
        Objects.equals(this.frequency, billSubsApiSchemasRatePlan.frequency) &&
        Objects.equals(this.id, billSubsApiSchemasRatePlan.id) &&
        Objects.equals(this.name, billSubsApiSchemasRatePlan.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(components, currency, duration, frequency, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillSubsApiSchemasRatePlan {\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("components");
    openapiFields.add("currency");
    openapiFields.add("duration");
    openapiFields.add("frequency");
    openapiFields.add("id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BillSubsApiSchemasRatePlan
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BillSubsApiSchemasRatePlan.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BillSubsApiSchemasRatePlan is not found in the empty JSON string", BillSubsApiSchemasRatePlan.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BillSubsApiSchemasRatePlan.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BillSubsApiSchemasRatePlan` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("components") != null && !jsonObj.get("components").isJsonNull()) {
        JsonArray jsonArraycomponents = jsonObj.getAsJsonArray("components");
        if (jsonArraycomponents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("components").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `components` to be an array in the JSON string but got `%s`", jsonObj.get("components").toString()));
          }

          // validate the optional field `components` (array)
          for (int i = 0; i < jsonArraycomponents.size(); i++) {
            BillSubsApiComponentValue.validateJsonElement(jsonArraycomponents.get(i));
          };
        }
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // validate the optional field `frequency`
      if (jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) {
        BillSubsApiSchemasFrequency.validateJsonElement(jsonObj.get("frequency"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BillSubsApiSchemasRatePlan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BillSubsApiSchemasRatePlan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BillSubsApiSchemasRatePlan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BillSubsApiSchemasRatePlan.class));

       return (TypeAdapter<T>) new TypeAdapter<BillSubsApiSchemasRatePlan>() {
           @Override
           public void write(JsonWriter out, BillSubsApiSchemasRatePlan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BillSubsApiSchemasRatePlan read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BillSubsApiSchemasRatePlan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BillSubsApiSchemasRatePlan
  * @throws IOException if the JSON string is invalid with respect to BillSubsApiSchemasRatePlan
  */
  public static BillSubsApiSchemasRatePlan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BillSubsApiSchemasRatePlan.class);
  }

 /**
  * Convert an instance of BillSubsApiSchemasRatePlan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

