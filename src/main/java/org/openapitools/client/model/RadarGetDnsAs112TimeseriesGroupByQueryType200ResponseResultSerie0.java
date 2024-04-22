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
 * RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 {
  public static final String SERIALIZED_NAME_A = "A";
  @SerializedName(SERIALIZED_NAME_A)
  private List<String> A = new ArrayList<>();

  public static final String SERIALIZED_NAME_A_A_A_A = "AAAA";
  @SerializedName(SERIALIZED_NAME_A_A_A_A)
  private List<String> AAAA = new ArrayList<>();

  public static final String SERIALIZED_NAME_P_T_R = "PTR";
  @SerializedName(SERIALIZED_NAME_P_T_R)
  private List<String> PTR = new ArrayList<>();

  public static final String SERIALIZED_NAME_S_O_A = "SOA";
  @SerializedName(SERIALIZED_NAME_S_O_A)
  private List<String> SOA = new ArrayList<>();

  public static final String SERIALIZED_NAME_S_R_V = "SRV";
  @SerializedName(SERIALIZED_NAME_S_R_V)
  private List<String> SRV = new ArrayList<>();

  public RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0() {
  }

  public RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 A(List<String> A) {
    this.A = A;
    return this;
  }

  public RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 addAItem(String AItem) {
    if (this.A == null) {
      this.A = new ArrayList<>();
    }
    this.A.add(AItem);
    return this;
  }

   /**
   * Get A
   * @return A
  **/
  @javax.annotation.Nonnull
  public List<String> getA() {
    return A;
  }

  public void setA(List<String> A) {
    this.A = A;
  }


  public RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 AAAA(List<String> AAAA) {
    this.AAAA = AAAA;
    return this;
  }

  public RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 addAAAAItem(String AAAAItem) {
    if (this.AAAA == null) {
      this.AAAA = new ArrayList<>();
    }
    this.AAAA.add(AAAAItem);
    return this;
  }

   /**
   * Get AAAA
   * @return AAAA
  **/
  @javax.annotation.Nonnull
  public List<String> getAAAA() {
    return AAAA;
  }

  public void setAAAA(List<String> AAAA) {
    this.AAAA = AAAA;
  }


  public RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 PTR(List<String> PTR) {
    this.PTR = PTR;
    return this;
  }

  public RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 addPTRItem(String PTRItem) {
    if (this.PTR == null) {
      this.PTR = new ArrayList<>();
    }
    this.PTR.add(PTRItem);
    return this;
  }

   /**
   * Get PTR
   * @return PTR
  **/
  @javax.annotation.Nonnull
  public List<String> getPTR() {
    return PTR;
  }

  public void setPTR(List<String> PTR) {
    this.PTR = PTR;
  }


  public RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 SOA(List<String> SOA) {
    this.SOA = SOA;
    return this;
  }

  public RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 addSOAItem(String SOAItem) {
    if (this.SOA == null) {
      this.SOA = new ArrayList<>();
    }
    this.SOA.add(SOAItem);
    return this;
  }

   /**
   * Get SOA
   * @return SOA
  **/
  @javax.annotation.Nonnull
  public List<String> getSOA() {
    return SOA;
  }

  public void setSOA(List<String> SOA) {
    this.SOA = SOA;
  }


  public RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 SRV(List<String> SRV) {
    this.SRV = SRV;
    return this;
  }

  public RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 addSRVItem(String SRVItem) {
    if (this.SRV == null) {
      this.SRV = new ArrayList<>();
    }
    this.SRV.add(SRVItem);
    return this;
  }

   /**
   * Get SRV
   * @return SRV
  **/
  @javax.annotation.Nonnull
  public List<String> getSRV() {
    return SRV;
  }

  public void setSRV(List<String> SRV) {
    this.SRV = SRV;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 radarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 = (RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0) o;
    return Objects.equals(this.A, radarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0.A) &&
        Objects.equals(this.AAAA, radarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0.AAAA) &&
        Objects.equals(this.PTR, radarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0.PTR) &&
        Objects.equals(this.SOA, radarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0.SOA) &&
        Objects.equals(this.SRV, radarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0.SRV);
  }

  @Override
  public int hashCode() {
    return Objects.hash(A, AAAA, PTR, SOA, SRV);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 {\n");
    sb.append("    A: ").append(toIndentedString(A)).append("\n");
    sb.append("    AAAA: ").append(toIndentedString(AAAA)).append("\n");
    sb.append("    PTR: ").append(toIndentedString(PTR)).append("\n");
    sb.append("    SOA: ").append(toIndentedString(SOA)).append("\n");
    sb.append("    SRV: ").append(toIndentedString(SRV)).append("\n");
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
    openapiFields.add("A");
    openapiFields.add("AAAA");
    openapiFields.add("PTR");
    openapiFields.add("SOA");
    openapiFields.add("SRV");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("A");
    openapiRequiredFields.add("AAAA");
    openapiRequiredFields.add("PTR");
    openapiRequiredFields.add("SOA");
    openapiRequiredFields.add("SRV");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 is not found in the empty JSON string", RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("A") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("A").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `A` to be an array in the JSON string but got `%s`", jsonObj.get("A").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("AAAA") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("AAAA").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `AAAA` to be an array in the JSON string but got `%s`", jsonObj.get("AAAA").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("PTR") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("PTR").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `PTR` to be an array in the JSON string but got `%s`", jsonObj.get("PTR").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("SOA") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("SOA").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SOA` to be an array in the JSON string but got `%s`", jsonObj.get("SOA").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("SRV") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("SRV").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SRV` to be an array in the JSON string but got `%s`", jsonObj.get("SRV").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0>() {
           @Override
           public void write(JsonWriter out, RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0
  * @throws IOException if the JSON string is invalid with respect to RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0
  */
  public static RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0.class);
  }

 /**
  * Convert an instance of RadarGetDnsAs112TimeseriesGroupByQueryType200ResponseResultSerie0 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

