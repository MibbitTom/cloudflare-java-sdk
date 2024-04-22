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
import org.openapitools.client.model.MagicVisibilityPcapsFilterV1;
import org.openapitools.client.model.MagicVisibilityPcapsSystem;
import org.openapitools.client.model.MagicVisibilityPcapsType;

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
 * MagicVisibilityPcapsRequestSimple
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class MagicVisibilityPcapsRequestSimple {
  public static final String SERIALIZED_NAME_FILTER_V1 = "filter_v1";
  @SerializedName(SERIALIZED_NAME_FILTER_V1)
  private MagicVisibilityPcapsFilterV1 filterV1;

  public static final String SERIALIZED_NAME_PACKET_LIMIT = "packet_limit";
  @SerializedName(SERIALIZED_NAME_PACKET_LIMIT)
  private BigDecimal packetLimit;

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  private MagicVisibilityPcapsSystem system;

  public static final String SERIALIZED_NAME_TIME_LIMIT = "time_limit";
  @SerializedName(SERIALIZED_NAME_TIME_LIMIT)
  private BigDecimal timeLimit;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private MagicVisibilityPcapsType type;

  public MagicVisibilityPcapsRequestSimple() {
  }

  public MagicVisibilityPcapsRequestSimple filterV1(MagicVisibilityPcapsFilterV1 filterV1) {
    this.filterV1 = filterV1;
    return this;
  }

   /**
   * Get filterV1
   * @return filterV1
  **/
  @javax.annotation.Nullable
  public MagicVisibilityPcapsFilterV1 getFilterV1() {
    return filterV1;
  }

  public void setFilterV1(MagicVisibilityPcapsFilterV1 filterV1) {
    this.filterV1 = filterV1;
  }


  public MagicVisibilityPcapsRequestSimple packetLimit(BigDecimal packetLimit) {
    this.packetLimit = packetLimit;
    return this;
  }

   /**
   * The limit of packets contained in a packet capture.
   * minimum: 1
   * maximum: 10000
   * @return packetLimit
  **/
  @javax.annotation.Nonnull
  public BigDecimal getPacketLimit() {
    return packetLimit;
  }

  public void setPacketLimit(BigDecimal packetLimit) {
    this.packetLimit = packetLimit;
  }


  public MagicVisibilityPcapsRequestSimple system(MagicVisibilityPcapsSystem system) {
    this.system = system;
    return this;
  }

   /**
   * Get system
   * @return system
  **/
  @javax.annotation.Nonnull
  public MagicVisibilityPcapsSystem getSystem() {
    return system;
  }

  public void setSystem(MagicVisibilityPcapsSystem system) {
    this.system = system;
  }


  public MagicVisibilityPcapsRequestSimple timeLimit(BigDecimal timeLimit) {
    this.timeLimit = timeLimit;
    return this;
  }

   /**
   * The packet capture duration in seconds.
   * minimum: 1
   * maximum: 300
   * @return timeLimit
  **/
  @javax.annotation.Nonnull
  public BigDecimal getTimeLimit() {
    return timeLimit;
  }

  public void setTimeLimit(BigDecimal timeLimit) {
    this.timeLimit = timeLimit;
  }


  public MagicVisibilityPcapsRequestSimple type(MagicVisibilityPcapsType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public MagicVisibilityPcapsType getType() {
    return type;
  }

  public void setType(MagicVisibilityPcapsType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagicVisibilityPcapsRequestSimple magicVisibilityPcapsRequestSimple = (MagicVisibilityPcapsRequestSimple) o;
    return Objects.equals(this.filterV1, magicVisibilityPcapsRequestSimple.filterV1) &&
        Objects.equals(this.packetLimit, magicVisibilityPcapsRequestSimple.packetLimit) &&
        Objects.equals(this.system, magicVisibilityPcapsRequestSimple.system) &&
        Objects.equals(this.timeLimit, magicVisibilityPcapsRequestSimple.timeLimit) &&
        Objects.equals(this.type, magicVisibilityPcapsRequestSimple.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterV1, packetLimit, system, timeLimit, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicVisibilityPcapsRequestSimple {\n");
    sb.append("    filterV1: ").append(toIndentedString(filterV1)).append("\n");
    sb.append("    packetLimit: ").append(toIndentedString(packetLimit)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    timeLimit: ").append(toIndentedString(timeLimit)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("filter_v1");
    openapiFields.add("packet_limit");
    openapiFields.add("system");
    openapiFields.add("time_limit");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("packet_limit");
    openapiRequiredFields.add("system");
    openapiRequiredFields.add("time_limit");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MagicVisibilityPcapsRequestSimple
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MagicVisibilityPcapsRequestSimple.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MagicVisibilityPcapsRequestSimple is not found in the empty JSON string", MagicVisibilityPcapsRequestSimple.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MagicVisibilityPcapsRequestSimple.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MagicVisibilityPcapsRequestSimple` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MagicVisibilityPcapsRequestSimple.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `filter_v1`
      if (jsonObj.get("filter_v1") != null && !jsonObj.get("filter_v1").isJsonNull()) {
        MagicVisibilityPcapsFilterV1.validateJsonElement(jsonObj.get("filter_v1"));
      }
      // validate the required field `system`
      MagicVisibilityPcapsSystem.validateJsonElement(jsonObj.get("system"));
      // validate the required field `type`
      MagicVisibilityPcapsType.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MagicVisibilityPcapsRequestSimple.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MagicVisibilityPcapsRequestSimple' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MagicVisibilityPcapsRequestSimple> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MagicVisibilityPcapsRequestSimple.class));

       return (TypeAdapter<T>) new TypeAdapter<MagicVisibilityPcapsRequestSimple>() {
           @Override
           public void write(JsonWriter out, MagicVisibilityPcapsRequestSimple value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MagicVisibilityPcapsRequestSimple read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MagicVisibilityPcapsRequestSimple given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MagicVisibilityPcapsRequestSimple
  * @throws IOException if the JSON string is invalid with respect to MagicVisibilityPcapsRequestSimple
  */
  public static MagicVisibilityPcapsRequestSimple fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MagicVisibilityPcapsRequestSimple.class);
  }

 /**
  * Convert an instance of MagicVisibilityPcapsRequestSimple to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

