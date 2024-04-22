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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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

import cloudflare.JSON;

/**
 * RadarGetQualitySpeedTopAses200ResponseResultTop0Inner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetQualitySpeedTopAses200ResponseResultTop0Inner {
  public static final String SERIALIZED_NAME_BANDWIDTH_DOWNLOAD = "bandwidthDownload";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH_DOWNLOAD)
  private String bandwidthDownload;

  public static final String SERIALIZED_NAME_BANDWIDTH_UPLOAD = "bandwidthUpload";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH_UPLOAD)
  private String bandwidthUpload;

  public static final String SERIALIZED_NAME_CLIENT_A_S_N = "clientASN";
  @SerializedName(SERIALIZED_NAME_CLIENT_A_S_N)
  private BigDecimal clientASN;

  public static final String SERIALIZED_NAME_CLIENT_A_S_NAME = "clientASName";
  @SerializedName(SERIALIZED_NAME_CLIENT_A_S_NAME)
  private String clientASName;

  public static final String SERIALIZED_NAME_JITTER_IDLE = "jitterIdle";
  @SerializedName(SERIALIZED_NAME_JITTER_IDLE)
  private String jitterIdle;

  public static final String SERIALIZED_NAME_JITTER_LOADED = "jitterLoaded";
  @SerializedName(SERIALIZED_NAME_JITTER_LOADED)
  private String jitterLoaded;

  public static final String SERIALIZED_NAME_LATENCY_IDLE = "latencyIdle";
  @SerializedName(SERIALIZED_NAME_LATENCY_IDLE)
  private String latencyIdle;

  public static final String SERIALIZED_NAME_LATENCY_LOADED = "latencyLoaded";
  @SerializedName(SERIALIZED_NAME_LATENCY_LOADED)
  private String latencyLoaded;

  public static final String SERIALIZED_NAME_NUM_TESTS = "numTests";
  @SerializedName(SERIALIZED_NAME_NUM_TESTS)
  private BigDecimal numTests;

  public static final String SERIALIZED_NAME_RANK_POWER = "rankPower";
  @SerializedName(SERIALIZED_NAME_RANK_POWER)
  private BigDecimal rankPower;

  public RadarGetQualitySpeedTopAses200ResponseResultTop0Inner() {
  }

  public RadarGetQualitySpeedTopAses200ResponseResultTop0Inner bandwidthDownload(String bandwidthDownload) {
    this.bandwidthDownload = bandwidthDownload;
    return this;
  }

   /**
   * Get bandwidthDownload
   * @return bandwidthDownload
  **/
  @javax.annotation.Nonnull
  public String getBandwidthDownload() {
    return bandwidthDownload;
  }

  public void setBandwidthDownload(String bandwidthDownload) {
    this.bandwidthDownload = bandwidthDownload;
  }


  public RadarGetQualitySpeedTopAses200ResponseResultTop0Inner bandwidthUpload(String bandwidthUpload) {
    this.bandwidthUpload = bandwidthUpload;
    return this;
  }

   /**
   * Get bandwidthUpload
   * @return bandwidthUpload
  **/
  @javax.annotation.Nonnull
  public String getBandwidthUpload() {
    return bandwidthUpload;
  }

  public void setBandwidthUpload(String bandwidthUpload) {
    this.bandwidthUpload = bandwidthUpload;
  }


  public RadarGetQualitySpeedTopAses200ResponseResultTop0Inner clientASN(BigDecimal clientASN) {
    this.clientASN = clientASN;
    return this;
  }

   /**
   * Get clientASN
   * @return clientASN
  **/
  @javax.annotation.Nonnull
  public BigDecimal getClientASN() {
    return clientASN;
  }

  public void setClientASN(BigDecimal clientASN) {
    this.clientASN = clientASN;
  }


  public RadarGetQualitySpeedTopAses200ResponseResultTop0Inner clientASName(String clientASName) {
    this.clientASName = clientASName;
    return this;
  }

   /**
   * Get clientASName
   * @return clientASName
  **/
  @javax.annotation.Nonnull
  public String getClientASName() {
    return clientASName;
  }

  public void setClientASName(String clientASName) {
    this.clientASName = clientASName;
  }


  public RadarGetQualitySpeedTopAses200ResponseResultTop0Inner jitterIdle(String jitterIdle) {
    this.jitterIdle = jitterIdle;
    return this;
  }

   /**
   * Get jitterIdle
   * @return jitterIdle
  **/
  @javax.annotation.Nonnull
  public String getJitterIdle() {
    return jitterIdle;
  }

  public void setJitterIdle(String jitterIdle) {
    this.jitterIdle = jitterIdle;
  }


  public RadarGetQualitySpeedTopAses200ResponseResultTop0Inner jitterLoaded(String jitterLoaded) {
    this.jitterLoaded = jitterLoaded;
    return this;
  }

   /**
   * Get jitterLoaded
   * @return jitterLoaded
  **/
  @javax.annotation.Nonnull
  public String getJitterLoaded() {
    return jitterLoaded;
  }

  public void setJitterLoaded(String jitterLoaded) {
    this.jitterLoaded = jitterLoaded;
  }


  public RadarGetQualitySpeedTopAses200ResponseResultTop0Inner latencyIdle(String latencyIdle) {
    this.latencyIdle = latencyIdle;
    return this;
  }

   /**
   * Get latencyIdle
   * @return latencyIdle
  **/
  @javax.annotation.Nonnull
  public String getLatencyIdle() {
    return latencyIdle;
  }

  public void setLatencyIdle(String latencyIdle) {
    this.latencyIdle = latencyIdle;
  }


  public RadarGetQualitySpeedTopAses200ResponseResultTop0Inner latencyLoaded(String latencyLoaded) {
    this.latencyLoaded = latencyLoaded;
    return this;
  }

   /**
   * Get latencyLoaded
   * @return latencyLoaded
  **/
  @javax.annotation.Nonnull
  public String getLatencyLoaded() {
    return latencyLoaded;
  }

  public void setLatencyLoaded(String latencyLoaded) {
    this.latencyLoaded = latencyLoaded;
  }


  public RadarGetQualitySpeedTopAses200ResponseResultTop0Inner numTests(BigDecimal numTests) {
    this.numTests = numTests;
    return this;
  }

   /**
   * Get numTests
   * @return numTests
  **/
  @javax.annotation.Nonnull
  public BigDecimal getNumTests() {
    return numTests;
  }

  public void setNumTests(BigDecimal numTests) {
    this.numTests = numTests;
  }


  public RadarGetQualitySpeedTopAses200ResponseResultTop0Inner rankPower(BigDecimal rankPower) {
    this.rankPower = rankPower;
    return this;
  }

   /**
   * Get rankPower
   * @return rankPower
  **/
  @javax.annotation.Nonnull
  public BigDecimal getRankPower() {
    return rankPower;
  }

  public void setRankPower(BigDecimal rankPower) {
    this.rankPower = rankPower;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetQualitySpeedTopAses200ResponseResultTop0Inner radarGetQualitySpeedTopAses200ResponseResultTop0Inner = (RadarGetQualitySpeedTopAses200ResponseResultTop0Inner) o;
    return Objects.equals(this.bandwidthDownload, radarGetQualitySpeedTopAses200ResponseResultTop0Inner.bandwidthDownload) &&
        Objects.equals(this.bandwidthUpload, radarGetQualitySpeedTopAses200ResponseResultTop0Inner.bandwidthUpload) &&
        Objects.equals(this.clientASN, radarGetQualitySpeedTopAses200ResponseResultTop0Inner.clientASN) &&
        Objects.equals(this.clientASName, radarGetQualitySpeedTopAses200ResponseResultTop0Inner.clientASName) &&
        Objects.equals(this.jitterIdle, radarGetQualitySpeedTopAses200ResponseResultTop0Inner.jitterIdle) &&
        Objects.equals(this.jitterLoaded, radarGetQualitySpeedTopAses200ResponseResultTop0Inner.jitterLoaded) &&
        Objects.equals(this.latencyIdle, radarGetQualitySpeedTopAses200ResponseResultTop0Inner.latencyIdle) &&
        Objects.equals(this.latencyLoaded, radarGetQualitySpeedTopAses200ResponseResultTop0Inner.latencyLoaded) &&
        Objects.equals(this.numTests, radarGetQualitySpeedTopAses200ResponseResultTop0Inner.numTests) &&
        Objects.equals(this.rankPower, radarGetQualitySpeedTopAses200ResponseResultTop0Inner.rankPower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidthDownload, bandwidthUpload, clientASN, clientASName, jitterIdle, jitterLoaded, latencyIdle, latencyLoaded, numTests, rankPower);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetQualitySpeedTopAses200ResponseResultTop0Inner {\n");
    sb.append("    bandwidthDownload: ").append(toIndentedString(bandwidthDownload)).append("\n");
    sb.append("    bandwidthUpload: ").append(toIndentedString(bandwidthUpload)).append("\n");
    sb.append("    clientASN: ").append(toIndentedString(clientASN)).append("\n");
    sb.append("    clientASName: ").append(toIndentedString(clientASName)).append("\n");
    sb.append("    jitterIdle: ").append(toIndentedString(jitterIdle)).append("\n");
    sb.append("    jitterLoaded: ").append(toIndentedString(jitterLoaded)).append("\n");
    sb.append("    latencyIdle: ").append(toIndentedString(latencyIdle)).append("\n");
    sb.append("    latencyLoaded: ").append(toIndentedString(latencyLoaded)).append("\n");
    sb.append("    numTests: ").append(toIndentedString(numTests)).append("\n");
    sb.append("    rankPower: ").append(toIndentedString(rankPower)).append("\n");
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
    openapiFields.add("bandwidthDownload");
    openapiFields.add("bandwidthUpload");
    openapiFields.add("clientASN");
    openapiFields.add("clientASName");
    openapiFields.add("jitterIdle");
    openapiFields.add("jitterLoaded");
    openapiFields.add("latencyIdle");
    openapiFields.add("latencyLoaded");
    openapiFields.add("numTests");
    openapiFields.add("rankPower");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bandwidthDownload");
    openapiRequiredFields.add("bandwidthUpload");
    openapiRequiredFields.add("clientASN");
    openapiRequiredFields.add("clientASName");
    openapiRequiredFields.add("jitterIdle");
    openapiRequiredFields.add("jitterLoaded");
    openapiRequiredFields.add("latencyIdle");
    openapiRequiredFields.add("latencyLoaded");
    openapiRequiredFields.add("numTests");
    openapiRequiredFields.add("rankPower");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetQualitySpeedTopAses200ResponseResultTop0Inner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetQualitySpeedTopAses200ResponseResultTop0Inner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetQualitySpeedTopAses200ResponseResultTop0Inner is not found in the empty JSON string", RadarGetQualitySpeedTopAses200ResponseResultTop0Inner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetQualitySpeedTopAses200ResponseResultTop0Inner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetQualitySpeedTopAses200ResponseResultTop0Inner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetQualitySpeedTopAses200ResponseResultTop0Inner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("bandwidthDownload").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bandwidthDownload` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bandwidthDownload").toString()));
      }
      if (!jsonObj.get("bandwidthUpload").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bandwidthUpload` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bandwidthUpload").toString()));
      }
      if (!jsonObj.get("clientASName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientASName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientASName").toString()));
      }
      if (!jsonObj.get("jitterIdle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jitterIdle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jitterIdle").toString()));
      }
      if (!jsonObj.get("jitterLoaded").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jitterLoaded` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jitterLoaded").toString()));
      }
      if (!jsonObj.get("latencyIdle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latencyIdle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latencyIdle").toString()));
      }
      if (!jsonObj.get("latencyLoaded").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latencyLoaded` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latencyLoaded").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetQualitySpeedTopAses200ResponseResultTop0Inner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetQualitySpeedTopAses200ResponseResultTop0Inner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetQualitySpeedTopAses200ResponseResultTop0Inner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetQualitySpeedTopAses200ResponseResultTop0Inner.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetQualitySpeedTopAses200ResponseResultTop0Inner>() {
           @Override
           public void write(JsonWriter out, RadarGetQualitySpeedTopAses200ResponseResultTop0Inner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetQualitySpeedTopAses200ResponseResultTop0Inner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetQualitySpeedTopAses200ResponseResultTop0Inner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetQualitySpeedTopAses200ResponseResultTop0Inner
  * @throws IOException if the JSON string is invalid with respect to RadarGetQualitySpeedTopAses200ResponseResultTop0Inner
  */
  public static RadarGetQualitySpeedTopAses200ResponseResultTop0Inner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetQualitySpeedTopAses200ResponseResultTop0Inner.class);
  }

 /**
  * Convert an instance of RadarGetQualitySpeedTopAses200ResponseResultTop0Inner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
