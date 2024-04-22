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
 * A breakdown of requests by their SSL protocol.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DataZoneAnalyticsApiBandwidthSslProtocols {
  public static final String SERIALIZED_NAME_TL_SV1 = "TLSv1";
  @SerializedName(SERIALIZED_NAME_TL_SV1)
  private Integer tlSv1;

  public static final String SERIALIZED_NAME_TL_SV11 = "TLSv1.1";
  @SerializedName(SERIALIZED_NAME_TL_SV11)
  private Integer tlSv11;

  public static final String SERIALIZED_NAME_TL_SV12 = "TLSv1.2";
  @SerializedName(SERIALIZED_NAME_TL_SV12)
  private Integer tlSv12;

  public static final String SERIALIZED_NAME_TL_SV13 = "TLSv1.3";
  @SerializedName(SERIALIZED_NAME_TL_SV13)
  private Integer tlSv13;

  public static final String SERIALIZED_NAME_NONE = "none";
  @SerializedName(SERIALIZED_NAME_NONE)
  private Integer none;

  public DataZoneAnalyticsApiBandwidthSslProtocols() {
  }

  public DataZoneAnalyticsApiBandwidthSslProtocols tlSv1(Integer tlSv1) {
    this.tlSv1 = tlSv1;
    return this;
  }

   /**
   * The number of requests served over TLS v1.0.
   * @return tlSv1
  **/
  @javax.annotation.Nullable
  public Integer getTlSv1() {
    return tlSv1;
  }

  public void setTlSv1(Integer tlSv1) {
    this.tlSv1 = tlSv1;
  }


  public DataZoneAnalyticsApiBandwidthSslProtocols tlSv11(Integer tlSv11) {
    this.tlSv11 = tlSv11;
    return this;
  }

   /**
   * The number of requests served over TLS v1.1.
   * @return tlSv11
  **/
  @javax.annotation.Nullable
  public Integer getTlSv11() {
    return tlSv11;
  }

  public void setTlSv11(Integer tlSv11) {
    this.tlSv11 = tlSv11;
  }


  public DataZoneAnalyticsApiBandwidthSslProtocols tlSv12(Integer tlSv12) {
    this.tlSv12 = tlSv12;
    return this;
  }

   /**
   * The number of requests served over TLS v1.2.
   * @return tlSv12
  **/
  @javax.annotation.Nullable
  public Integer getTlSv12() {
    return tlSv12;
  }

  public void setTlSv12(Integer tlSv12) {
    this.tlSv12 = tlSv12;
  }


  public DataZoneAnalyticsApiBandwidthSslProtocols tlSv13(Integer tlSv13) {
    this.tlSv13 = tlSv13;
    return this;
  }

   /**
   * The number of requests served over TLS v1.3.
   * @return tlSv13
  **/
  @javax.annotation.Nullable
  public Integer getTlSv13() {
    return tlSv13;
  }

  public void setTlSv13(Integer tlSv13) {
    this.tlSv13 = tlSv13;
  }


  public DataZoneAnalyticsApiBandwidthSslProtocols none(Integer none) {
    this.none = none;
    return this;
  }

   /**
   * The number of requests served over HTTP.
   * @return none
  **/
  @javax.annotation.Nullable
  public Integer getNone() {
    return none;
  }

  public void setNone(Integer none) {
    this.none = none;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataZoneAnalyticsApiBandwidthSslProtocols dataZoneAnalyticsApiBandwidthSslProtocols = (DataZoneAnalyticsApiBandwidthSslProtocols) o;
    return Objects.equals(this.tlSv1, dataZoneAnalyticsApiBandwidthSslProtocols.tlSv1) &&
        Objects.equals(this.tlSv11, dataZoneAnalyticsApiBandwidthSslProtocols.tlSv11) &&
        Objects.equals(this.tlSv12, dataZoneAnalyticsApiBandwidthSslProtocols.tlSv12) &&
        Objects.equals(this.tlSv13, dataZoneAnalyticsApiBandwidthSslProtocols.tlSv13) &&
        Objects.equals(this.none, dataZoneAnalyticsApiBandwidthSslProtocols.none);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tlSv1, tlSv11, tlSv12, tlSv13, none);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataZoneAnalyticsApiBandwidthSslProtocols {\n");
    sb.append("    tlSv1: ").append(toIndentedString(tlSv1)).append("\n");
    sb.append("    tlSv11: ").append(toIndentedString(tlSv11)).append("\n");
    sb.append("    tlSv12: ").append(toIndentedString(tlSv12)).append("\n");
    sb.append("    tlSv13: ").append(toIndentedString(tlSv13)).append("\n");
    sb.append("    none: ").append(toIndentedString(none)).append("\n");
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
    openapiFields.add("TLSv1");
    openapiFields.add("TLSv1.1");
    openapiFields.add("TLSv1.2");
    openapiFields.add("TLSv1.3");
    openapiFields.add("none");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataZoneAnalyticsApiBandwidthSslProtocols
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataZoneAnalyticsApiBandwidthSslProtocols.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataZoneAnalyticsApiBandwidthSslProtocols is not found in the empty JSON string", DataZoneAnalyticsApiBandwidthSslProtocols.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataZoneAnalyticsApiBandwidthSslProtocols.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataZoneAnalyticsApiBandwidthSslProtocols` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataZoneAnalyticsApiBandwidthSslProtocols.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataZoneAnalyticsApiBandwidthSslProtocols' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataZoneAnalyticsApiBandwidthSslProtocols> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataZoneAnalyticsApiBandwidthSslProtocols.class));

       return (TypeAdapter<T>) new TypeAdapter<DataZoneAnalyticsApiBandwidthSslProtocols>() {
           @Override
           public void write(JsonWriter out, DataZoneAnalyticsApiBandwidthSslProtocols value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataZoneAnalyticsApiBandwidthSslProtocols read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataZoneAnalyticsApiBandwidthSslProtocols given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataZoneAnalyticsApiBandwidthSslProtocols
  * @throws IOException if the JSON string is invalid with respect to DataZoneAnalyticsApiBandwidthSslProtocols
  */
  public static DataZoneAnalyticsApiBandwidthSslProtocols fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataZoneAnalyticsApiBandwidthSslProtocols.class);
  }

 /**
  * Convert an instance of DataZoneAnalyticsApiBandwidthSslProtocols to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

