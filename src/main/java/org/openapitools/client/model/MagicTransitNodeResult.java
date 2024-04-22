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

import org.openapitools.client.JSON;

/**
 * MagicTransitNodeResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class MagicTransitNodeResult {
  public static final String SERIALIZED_NAME_ASN = "asn";
  @SerializedName(SERIALIZED_NAME_ASN)
  private String asn;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels = new ArrayList<>();

  public static final String SERIALIZED_NAME_MAX_RTT_MS = "max_rtt_ms";
  @SerializedName(SERIALIZED_NAME_MAX_RTT_MS)
  private BigDecimal maxRttMs;

  public static final String SERIALIZED_NAME_MEAN_RTT_MS = "mean_rtt_ms";
  @SerializedName(SERIALIZED_NAME_MEAN_RTT_MS)
  private BigDecimal meanRttMs;

  public static final String SERIALIZED_NAME_MIN_RTT_MS = "min_rtt_ms";
  @SerializedName(SERIALIZED_NAME_MIN_RTT_MS)
  private BigDecimal minRttMs;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PACKET_COUNT = "packet_count";
  @SerializedName(SERIALIZED_NAME_PACKET_COUNT)
  private Integer packetCount;

  public static final String SERIALIZED_NAME_STD_DEV_RTT_MS = "std_dev_rtt_ms";
  @SerializedName(SERIALIZED_NAME_STD_DEV_RTT_MS)
  private BigDecimal stdDevRttMs;

  public MagicTransitNodeResult() {
  }

  public MagicTransitNodeResult asn(String asn) {
    this.asn = asn;
    return this;
  }

   /**
   * AS number associated with the node object.
   * @return asn
  **/
  @javax.annotation.Nullable
  public String getAsn() {
    return asn;
  }

  public void setAsn(String asn) {
    this.asn = asn;
  }


  public MagicTransitNodeResult ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * IP address of the node.
   * @return ip
  **/
  @javax.annotation.Nullable
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public MagicTransitNodeResult labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public MagicTransitNodeResult addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Field appears if there is an additional annotation printed when the probe returns. Field also appears when running a GRE+ICMP traceroute to denote which traceroute a node comes from.
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public MagicTransitNodeResult maxRttMs(BigDecimal maxRttMs) {
    this.maxRttMs = maxRttMs;
    return this;
  }

   /**
   * Maximum RTT in ms.
   * @return maxRttMs
  **/
  @javax.annotation.Nullable
  public BigDecimal getMaxRttMs() {
    return maxRttMs;
  }

  public void setMaxRttMs(BigDecimal maxRttMs) {
    this.maxRttMs = maxRttMs;
  }


  public MagicTransitNodeResult meanRttMs(BigDecimal meanRttMs) {
    this.meanRttMs = meanRttMs;
    return this;
  }

   /**
   * Mean RTT in ms.
   * @return meanRttMs
  **/
  @javax.annotation.Nullable
  public BigDecimal getMeanRttMs() {
    return meanRttMs;
  }

  public void setMeanRttMs(BigDecimal meanRttMs) {
    this.meanRttMs = meanRttMs;
  }


  public MagicTransitNodeResult minRttMs(BigDecimal minRttMs) {
    this.minRttMs = minRttMs;
    return this;
  }

   /**
   * Minimum RTT in ms.
   * @return minRttMs
  **/
  @javax.annotation.Nullable
  public BigDecimal getMinRttMs() {
    return minRttMs;
  }

  public void setMinRttMs(BigDecimal minRttMs) {
    this.minRttMs = minRttMs;
  }


  public MagicTransitNodeResult name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Host name of the address, this may be the same as the IP address.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public MagicTransitNodeResult packetCount(Integer packetCount) {
    this.packetCount = packetCount;
    return this;
  }

   /**
   * Number of packets with a response from this node.
   * @return packetCount
  **/
  @javax.annotation.Nullable
  public Integer getPacketCount() {
    return packetCount;
  }

  public void setPacketCount(Integer packetCount) {
    this.packetCount = packetCount;
  }


  public MagicTransitNodeResult stdDevRttMs(BigDecimal stdDevRttMs) {
    this.stdDevRttMs = stdDevRttMs;
    return this;
  }

   /**
   * Standard deviation of the RTTs in ms.
   * @return stdDevRttMs
  **/
  @javax.annotation.Nullable
  public BigDecimal getStdDevRttMs() {
    return stdDevRttMs;
  }

  public void setStdDevRttMs(BigDecimal stdDevRttMs) {
    this.stdDevRttMs = stdDevRttMs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagicTransitNodeResult magicTransitNodeResult = (MagicTransitNodeResult) o;
    return Objects.equals(this.asn, magicTransitNodeResult.asn) &&
        Objects.equals(this.ip, magicTransitNodeResult.ip) &&
        Objects.equals(this.labels, magicTransitNodeResult.labels) &&
        Objects.equals(this.maxRttMs, magicTransitNodeResult.maxRttMs) &&
        Objects.equals(this.meanRttMs, magicTransitNodeResult.meanRttMs) &&
        Objects.equals(this.minRttMs, magicTransitNodeResult.minRttMs) &&
        Objects.equals(this.name, magicTransitNodeResult.name) &&
        Objects.equals(this.packetCount, magicTransitNodeResult.packetCount) &&
        Objects.equals(this.stdDevRttMs, magicTransitNodeResult.stdDevRttMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asn, ip, labels, maxRttMs, meanRttMs, minRttMs, name, packetCount, stdDevRttMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicTransitNodeResult {\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    maxRttMs: ").append(toIndentedString(maxRttMs)).append("\n");
    sb.append("    meanRttMs: ").append(toIndentedString(meanRttMs)).append("\n");
    sb.append("    minRttMs: ").append(toIndentedString(minRttMs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packetCount: ").append(toIndentedString(packetCount)).append("\n");
    sb.append("    stdDevRttMs: ").append(toIndentedString(stdDevRttMs)).append("\n");
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
    openapiFields.add("asn");
    openapiFields.add("ip");
    openapiFields.add("labels");
    openapiFields.add("max_rtt_ms");
    openapiFields.add("mean_rtt_ms");
    openapiFields.add("min_rtt_ms");
    openapiFields.add("name");
    openapiFields.add("packet_count");
    openapiFields.add("std_dev_rtt_ms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MagicTransitNodeResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MagicTransitNodeResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MagicTransitNodeResult is not found in the empty JSON string", MagicTransitNodeResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MagicTransitNodeResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MagicTransitNodeResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("asn") != null && !jsonObj.get("asn").isJsonNull()) && !jsonObj.get("asn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asn").toString()));
      }
      if ((jsonObj.get("ip") != null && !jsonObj.get("ip").isJsonNull()) && !jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull() && !jsonObj.get("labels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MagicTransitNodeResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MagicTransitNodeResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MagicTransitNodeResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MagicTransitNodeResult.class));

       return (TypeAdapter<T>) new TypeAdapter<MagicTransitNodeResult>() {
           @Override
           public void write(JsonWriter out, MagicTransitNodeResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MagicTransitNodeResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MagicTransitNodeResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MagicTransitNodeResult
  * @throws IOException if the JSON string is invalid with respect to MagicTransitNodeResult
  */
  public static MagicTransitNodeResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MagicTransitNodeResult.class);
  }

 /**
  * Convert an instance of MagicTransitNodeResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
