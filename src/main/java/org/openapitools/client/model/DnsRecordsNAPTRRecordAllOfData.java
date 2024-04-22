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
 * Components of a NAPTR record.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DnsRecordsNAPTRRecordAllOfData {
  public static final String SERIALIZED_NAME_FLAGS = "flags";
  @SerializedName(SERIALIZED_NAME_FLAGS)
  private String flags;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private BigDecimal order;

  public static final String SERIALIZED_NAME_PREFERENCE = "preference";
  @SerializedName(SERIALIZED_NAME_PREFERENCE)
  private BigDecimal preference;

  public static final String SERIALIZED_NAME_REGEX = "regex";
  @SerializedName(SERIALIZED_NAME_REGEX)
  private String regex;

  public static final String SERIALIZED_NAME_REPLACEMENT = "replacement";
  @SerializedName(SERIALIZED_NAME_REPLACEMENT)
  private String replacement;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public DnsRecordsNAPTRRecordAllOfData() {
  }

  public DnsRecordsNAPTRRecordAllOfData flags(String flags) {
    this.flags = flags;
    return this;
  }

   /**
   * Flags.
   * @return flags
  **/
  @javax.annotation.Nullable
  public String getFlags() {
    return flags;
  }

  public void setFlags(String flags) {
    this.flags = flags;
  }


  public DnsRecordsNAPTRRecordAllOfData order(BigDecimal order) {
    this.order = order;
    return this;
  }

   /**
   * Order.
   * minimum: 0
   * maximum: 65535
   * @return order
  **/
  @javax.annotation.Nullable
  public BigDecimal getOrder() {
    return order;
  }

  public void setOrder(BigDecimal order) {
    this.order = order;
  }


  public DnsRecordsNAPTRRecordAllOfData preference(BigDecimal preference) {
    this.preference = preference;
    return this;
  }

   /**
   * Preference.
   * minimum: 0
   * maximum: 65535
   * @return preference
  **/
  @javax.annotation.Nullable
  public BigDecimal getPreference() {
    return preference;
  }

  public void setPreference(BigDecimal preference) {
    this.preference = preference;
  }


  public DnsRecordsNAPTRRecordAllOfData regex(String regex) {
    this.regex = regex;
    return this;
  }

   /**
   * Regex.
   * @return regex
  **/
  @javax.annotation.Nullable
  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }


  public DnsRecordsNAPTRRecordAllOfData replacement(String replacement) {
    this.replacement = replacement;
    return this;
  }

   /**
   * Replacement.
   * @return replacement
  **/
  @javax.annotation.Nullable
  public String getReplacement() {
    return replacement;
  }

  public void setReplacement(String replacement) {
    this.replacement = replacement;
  }


  public DnsRecordsNAPTRRecordAllOfData service(String service) {
    this.service = service;
    return this;
  }

   /**
   * Service.
   * @return service
  **/
  @javax.annotation.Nullable
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRecordsNAPTRRecordAllOfData dnsRecordsNAPTRRecordAllOfData = (DnsRecordsNAPTRRecordAllOfData) o;
    return Objects.equals(this.flags, dnsRecordsNAPTRRecordAllOfData.flags) &&
        Objects.equals(this.order, dnsRecordsNAPTRRecordAllOfData.order) &&
        Objects.equals(this.preference, dnsRecordsNAPTRRecordAllOfData.preference) &&
        Objects.equals(this.regex, dnsRecordsNAPTRRecordAllOfData.regex) &&
        Objects.equals(this.replacement, dnsRecordsNAPTRRecordAllOfData.replacement) &&
        Objects.equals(this.service, dnsRecordsNAPTRRecordAllOfData.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flags, order, preference, regex, replacement, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRecordsNAPTRRecordAllOfData {\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    replacement: ").append(toIndentedString(replacement)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
    openapiFields.add("flags");
    openapiFields.add("order");
    openapiFields.add("preference");
    openapiFields.add("regex");
    openapiFields.add("replacement");
    openapiFields.add("service");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DnsRecordsNAPTRRecordAllOfData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DnsRecordsNAPTRRecordAllOfData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DnsRecordsNAPTRRecordAllOfData is not found in the empty JSON string", DnsRecordsNAPTRRecordAllOfData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DnsRecordsNAPTRRecordAllOfData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DnsRecordsNAPTRRecordAllOfData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("flags") != null && !jsonObj.get("flags").isJsonNull()) && !jsonObj.get("flags").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flags` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flags").toString()));
      }
      if ((jsonObj.get("regex") != null && !jsonObj.get("regex").isJsonNull()) && !jsonObj.get("regex").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regex` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regex").toString()));
      }
      if ((jsonObj.get("replacement") != null && !jsonObj.get("replacement").isJsonNull()) && !jsonObj.get("replacement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replacement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replacement").toString()));
      }
      if ((jsonObj.get("service") != null && !jsonObj.get("service").isJsonNull()) && !jsonObj.get("service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DnsRecordsNAPTRRecordAllOfData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DnsRecordsNAPTRRecordAllOfData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DnsRecordsNAPTRRecordAllOfData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DnsRecordsNAPTRRecordAllOfData.class));

       return (TypeAdapter<T>) new TypeAdapter<DnsRecordsNAPTRRecordAllOfData>() {
           @Override
           public void write(JsonWriter out, DnsRecordsNAPTRRecordAllOfData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DnsRecordsNAPTRRecordAllOfData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DnsRecordsNAPTRRecordAllOfData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DnsRecordsNAPTRRecordAllOfData
  * @throws IOException if the JSON string is invalid with respect to DnsRecordsNAPTRRecordAllOfData
  */
  public static DnsRecordsNAPTRRecordAllOfData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DnsRecordsNAPTRRecordAllOfData.class);
  }

 /**
  * Convert an instance of DnsRecordsNAPTRRecordAllOfData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
