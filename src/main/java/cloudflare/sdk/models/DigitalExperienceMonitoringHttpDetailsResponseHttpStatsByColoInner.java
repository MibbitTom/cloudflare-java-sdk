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
import cloudflare.sdk.models.DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner;
import cloudflare.sdk.models.DigitalExperienceMonitoringTestStatOverTime;
import cloudflare.sdk.models.DigitalExperienceMonitoringTestStatPctOverTime;
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

import cloudflare.JSON;

/**
 * DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner {
  public static final String SERIALIZED_NAME_AVAILABILITY_PCT = "availabilityPct";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_PCT)
  private DigitalExperienceMonitoringTestStatPctOverTime availabilityPct;

  public static final String SERIALIZED_NAME_COLO = "colo";
  @SerializedName(SERIALIZED_NAME_COLO)
  private String colo;

  public static final String SERIALIZED_NAME_DNS_RESPONSE_TIME_MS = "dnsResponseTimeMs";
  @SerializedName(SERIALIZED_NAME_DNS_RESPONSE_TIME_MS)
  private DigitalExperienceMonitoringTestStatOverTime dnsResponseTimeMs;

  public static final String SERIALIZED_NAME_HTTP_STATUS_CODE = "httpStatusCode";
  @SerializedName(SERIALIZED_NAME_HTTP_STATUS_CODE)
  private List<DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner> httpStatusCode = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCE_FETCH_TIME_MS = "resourceFetchTimeMs";
  @SerializedName(SERIALIZED_NAME_RESOURCE_FETCH_TIME_MS)
  private DigitalExperienceMonitoringTestStatOverTime resourceFetchTimeMs;

  public static final String SERIALIZED_NAME_SERVER_RESPONSE_TIME_MS = "serverResponseTimeMs";
  @SerializedName(SERIALIZED_NAME_SERVER_RESPONSE_TIME_MS)
  private DigitalExperienceMonitoringTestStatOverTime serverResponseTimeMs;

  public static final String SERIALIZED_NAME_UNIQUE_DEVICES_TOTAL = "uniqueDevicesTotal";
  @SerializedName(SERIALIZED_NAME_UNIQUE_DEVICES_TOTAL)
  private Integer uniqueDevicesTotal;

  public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner() {
  }

  public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner availabilityPct(DigitalExperienceMonitoringTestStatPctOverTime availabilityPct) {
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


  public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner colo(String colo) {
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


  public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner dnsResponseTimeMs(DigitalExperienceMonitoringTestStatOverTime dnsResponseTimeMs) {
    this.dnsResponseTimeMs = dnsResponseTimeMs;
    return this;
  }

   /**
   * Get dnsResponseTimeMs
   * @return dnsResponseTimeMs
  **/
  @javax.annotation.Nonnull
  public DigitalExperienceMonitoringTestStatOverTime getDnsResponseTimeMs() {
    return dnsResponseTimeMs;
  }

  public void setDnsResponseTimeMs(DigitalExperienceMonitoringTestStatOverTime dnsResponseTimeMs) {
    this.dnsResponseTimeMs = dnsResponseTimeMs;
  }


  public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner httpStatusCode(List<DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner> httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
    return this;
  }

  public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner addHttpStatusCodeItem(DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner httpStatusCodeItem) {
    if (this.httpStatusCode == null) {
      this.httpStatusCode = new ArrayList<>();
    }
    this.httpStatusCode.add(httpStatusCodeItem);
    return this;
  }

   /**
   * Get httpStatusCode
   * @return httpStatusCode
  **/
  @javax.annotation.Nonnull
  public List<DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner> getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(List<DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner> httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }


  public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner resourceFetchTimeMs(DigitalExperienceMonitoringTestStatOverTime resourceFetchTimeMs) {
    this.resourceFetchTimeMs = resourceFetchTimeMs;
    return this;
  }

   /**
   * Get resourceFetchTimeMs
   * @return resourceFetchTimeMs
  **/
  @javax.annotation.Nonnull
  public DigitalExperienceMonitoringTestStatOverTime getResourceFetchTimeMs() {
    return resourceFetchTimeMs;
  }

  public void setResourceFetchTimeMs(DigitalExperienceMonitoringTestStatOverTime resourceFetchTimeMs) {
    this.resourceFetchTimeMs = resourceFetchTimeMs;
  }


  public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner serverResponseTimeMs(DigitalExperienceMonitoringTestStatOverTime serverResponseTimeMs) {
    this.serverResponseTimeMs = serverResponseTimeMs;
    return this;
  }

   /**
   * Get serverResponseTimeMs
   * @return serverResponseTimeMs
  **/
  @javax.annotation.Nonnull
  public DigitalExperienceMonitoringTestStatOverTime getServerResponseTimeMs() {
    return serverResponseTimeMs;
  }

  public void setServerResponseTimeMs(DigitalExperienceMonitoringTestStatOverTime serverResponseTimeMs) {
    this.serverResponseTimeMs = serverResponseTimeMs;
  }


  public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner uniqueDevicesTotal(Integer uniqueDevicesTotal) {
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
    DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner digitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner = (DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner) o;
    return Objects.equals(this.availabilityPct, digitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner.availabilityPct) &&
        Objects.equals(this.colo, digitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner.colo) &&
        Objects.equals(this.dnsResponseTimeMs, digitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner.dnsResponseTimeMs) &&
        Objects.equals(this.httpStatusCode, digitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner.httpStatusCode) &&
        Objects.equals(this.resourceFetchTimeMs, digitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner.resourceFetchTimeMs) &&
        Objects.equals(this.serverResponseTimeMs, digitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner.serverResponseTimeMs) &&
        Objects.equals(this.uniqueDevicesTotal, digitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner.uniqueDevicesTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityPct, colo, dnsResponseTimeMs, httpStatusCode, resourceFetchTimeMs, serverResponseTimeMs, uniqueDevicesTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner {\n");
    sb.append("    availabilityPct: ").append(toIndentedString(availabilityPct)).append("\n");
    sb.append("    colo: ").append(toIndentedString(colo)).append("\n");
    sb.append("    dnsResponseTimeMs: ").append(toIndentedString(dnsResponseTimeMs)).append("\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    resourceFetchTimeMs: ").append(toIndentedString(resourceFetchTimeMs)).append("\n");
    sb.append("    serverResponseTimeMs: ").append(toIndentedString(serverResponseTimeMs)).append("\n");
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
    openapiFields.add("dnsResponseTimeMs");
    openapiFields.add("httpStatusCode");
    openapiFields.add("resourceFetchTimeMs");
    openapiFields.add("serverResponseTimeMs");
    openapiFields.add("uniqueDevicesTotal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("availabilityPct");
    openapiRequiredFields.add("colo");
    openapiRequiredFields.add("dnsResponseTimeMs");
    openapiRequiredFields.add("httpStatusCode");
    openapiRequiredFields.add("resourceFetchTimeMs");
    openapiRequiredFields.add("serverResponseTimeMs");
    openapiRequiredFields.add("uniqueDevicesTotal");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner is not found in the empty JSON string", DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner.openapiRequiredFields) {
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
      // validate the required field `dnsResponseTimeMs`
      DigitalExperienceMonitoringTestStatOverTime.validateJsonElement(jsonObj.get("dnsResponseTimeMs"));
      // ensure the json data is an array
      if (!jsonObj.get("httpStatusCode").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpStatusCode` to be an array in the JSON string but got `%s`", jsonObj.get("httpStatusCode").toString()));
      }

      JsonArray jsonArrayhttpStatusCode = jsonObj.getAsJsonArray("httpStatusCode");
      // validate the required field `httpStatusCode` (array)
      for (int i = 0; i < jsonArrayhttpStatusCode.size(); i++) {
        DigitalExperienceMonitoringHttpDetailsResponseHttpStatsHttpStatusCodeInner.validateJsonElement(jsonArrayhttpStatusCode.get(i));
      };
      // validate the required field `resourceFetchTimeMs`
      DigitalExperienceMonitoringTestStatOverTime.validateJsonElement(jsonObj.get("resourceFetchTimeMs"));
      // validate the required field `serverResponseTimeMs`
      DigitalExperienceMonitoringTestStatOverTime.validateJsonElement(jsonObj.get("serverResponseTimeMs"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner>() {
           @Override
           public void write(JsonWriter out, DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner
  * @throws IOException if the JSON string is invalid with respect to DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner
  */
  public static DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner.class);
  }

 /**
  * Convert an instance of DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

