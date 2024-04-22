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
import org.openapitools.client.model.DigitalExperienceMonitoringTestStatOverTime;
import org.openapitools.client.model.DigitalExperienceMonitoringTestStatPctOverTime;

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
 * DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner {
  public static final String SERIALIZED_NAME_AVAILABILITY_PCT = "availabilityPct";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_PCT)
  private DigitalExperienceMonitoringTestStatPctOverTime availabilityPct;

  public static final String SERIALIZED_NAME_COLO = "colo";
  @SerializedName(SERIALIZED_NAME_COLO)
  private String colo;

  public static final String SERIALIZED_NAME_HOPS_COUNT = "hopsCount";
  @SerializedName(SERIALIZED_NAME_HOPS_COUNT)
  private DigitalExperienceMonitoringTestStatOverTime hopsCount;

  public static final String SERIALIZED_NAME_PACKET_LOSS_PCT = "packetLossPct";
  @SerializedName(SERIALIZED_NAME_PACKET_LOSS_PCT)
  private DigitalExperienceMonitoringTestStatPctOverTime packetLossPct;

  public static final String SERIALIZED_NAME_ROUND_TRIP_TIME_MS = "roundTripTimeMs";
  @SerializedName(SERIALIZED_NAME_ROUND_TRIP_TIME_MS)
  private DigitalExperienceMonitoringTestStatOverTime roundTripTimeMs;

  public static final String SERIALIZED_NAME_UNIQUE_DEVICES_TOTAL = "uniqueDevicesTotal";
  @SerializedName(SERIALIZED_NAME_UNIQUE_DEVICES_TOTAL)
  private Integer uniqueDevicesTotal;

  public DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner() {
  }

  public DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner availabilityPct(DigitalExperienceMonitoringTestStatPctOverTime availabilityPct) {
    this.availabilityPct = availabilityPct;
    return this;
  }

   /**
   * Get availabilityPct
   * @return availabilityPct
  **/
  @javax.annotation.Nonnull
  public DigitalExperienceMonitoringTestStatPctOverTime getAvailabilityPct() {
    return availabilityPct;
  }

  public void setAvailabilityPct(DigitalExperienceMonitoringTestStatPctOverTime availabilityPct) {
    this.availabilityPct = availabilityPct;
  }


  public DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner colo(String colo) {
    this.colo = colo;
    return this;
  }

   /**
   * Get colo
   * @return colo
  **/
  @javax.annotation.Nonnull
  public String getColo() {
    return colo;
  }

  public void setColo(String colo) {
    this.colo = colo;
  }


  public DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner hopsCount(DigitalExperienceMonitoringTestStatOverTime hopsCount) {
    this.hopsCount = hopsCount;
    return this;
  }

   /**
   * Get hopsCount
   * @return hopsCount
  **/
  @javax.annotation.Nonnull
  public DigitalExperienceMonitoringTestStatOverTime getHopsCount() {
    return hopsCount;
  }

  public void setHopsCount(DigitalExperienceMonitoringTestStatOverTime hopsCount) {
    this.hopsCount = hopsCount;
  }


  public DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner packetLossPct(DigitalExperienceMonitoringTestStatPctOverTime packetLossPct) {
    this.packetLossPct = packetLossPct;
    return this;
  }

   /**
   * Get packetLossPct
   * @return packetLossPct
  **/
  @javax.annotation.Nonnull
  public DigitalExperienceMonitoringTestStatPctOverTime getPacketLossPct() {
    return packetLossPct;
  }

  public void setPacketLossPct(DigitalExperienceMonitoringTestStatPctOverTime packetLossPct) {
    this.packetLossPct = packetLossPct;
  }


  public DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner roundTripTimeMs(DigitalExperienceMonitoringTestStatOverTime roundTripTimeMs) {
    this.roundTripTimeMs = roundTripTimeMs;
    return this;
  }

   /**
   * Get roundTripTimeMs
   * @return roundTripTimeMs
  **/
  @javax.annotation.Nonnull
  public DigitalExperienceMonitoringTestStatOverTime getRoundTripTimeMs() {
    return roundTripTimeMs;
  }

  public void setRoundTripTimeMs(DigitalExperienceMonitoringTestStatOverTime roundTripTimeMs) {
    this.roundTripTimeMs = roundTripTimeMs;
  }


  public DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner uniqueDevicesTotal(Integer uniqueDevicesTotal) {
    this.uniqueDevicesTotal = uniqueDevicesTotal;
    return this;
  }

   /**
   * Count of unique devices that have run this test in the given time period
   * @return uniqueDevicesTotal
  **/
  @javax.annotation.Nonnull
  public Integer getUniqueDevicesTotal() {
    return uniqueDevicesTotal;
  }

  public void setUniqueDevicesTotal(Integer uniqueDevicesTotal) {
    this.uniqueDevicesTotal = uniqueDevicesTotal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner digitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner = (DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner) o;
    return Objects.equals(this.availabilityPct, digitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner.availabilityPct) &&
        Objects.equals(this.colo, digitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner.colo) &&
        Objects.equals(this.hopsCount, digitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner.hopsCount) &&
        Objects.equals(this.packetLossPct, digitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner.packetLossPct) &&
        Objects.equals(this.roundTripTimeMs, digitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner.roundTripTimeMs) &&
        Objects.equals(this.uniqueDevicesTotal, digitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner.uniqueDevicesTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityPct, colo, hopsCount, packetLossPct, roundTripTimeMs, uniqueDevicesTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner {\n");
    sb.append("    availabilityPct: ").append(toIndentedString(availabilityPct)).append("\n");
    sb.append("    colo: ").append(toIndentedString(colo)).append("\n");
    sb.append("    hopsCount: ").append(toIndentedString(hopsCount)).append("\n");
    sb.append("    packetLossPct: ").append(toIndentedString(packetLossPct)).append("\n");
    sb.append("    roundTripTimeMs: ").append(toIndentedString(roundTripTimeMs)).append("\n");
    sb.append("    uniqueDevicesTotal: ").append(toIndentedString(uniqueDevicesTotal)).append("\n");
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
    openapiFields.add("availabilityPct");
    openapiFields.add("colo");
    openapiFields.add("hopsCount");
    openapiFields.add("packetLossPct");
    openapiFields.add("roundTripTimeMs");
    openapiFields.add("uniqueDevicesTotal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("availabilityPct");
    openapiRequiredFields.add("colo");
    openapiRequiredFields.add("hopsCount");
    openapiRequiredFields.add("packetLossPct");
    openapiRequiredFields.add("roundTripTimeMs");
    openapiRequiredFields.add("uniqueDevicesTotal");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner is not found in the empty JSON string", DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `availabilityPct`
      DigitalExperienceMonitoringTestStatPctOverTime.validateJsonElement(jsonObj.get("availabilityPct"));
      if (!jsonObj.get("colo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `colo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("colo").toString()));
      }
      // validate the required field `hopsCount`
      DigitalExperienceMonitoringTestStatOverTime.validateJsonElement(jsonObj.get("hopsCount"));
      // validate the required field `packetLossPct`
      DigitalExperienceMonitoringTestStatPctOverTime.validateJsonElement(jsonObj.get("packetLossPct"));
      // validate the required field `roundTripTimeMs`
      DigitalExperienceMonitoringTestStatOverTime.validateJsonElement(jsonObj.get("roundTripTimeMs"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner>() {
           @Override
           public void write(JsonWriter out, DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner
  * @throws IOException if the JSON string is invalid with respect to DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner
  */
  public static DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner.class);
  }

 /**
  * Convert an instance of DigitalExperienceMonitoringTracerouteDetailsResponseTracerouteStatsByColoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
