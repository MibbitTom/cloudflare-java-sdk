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
import org.openapitools.client.model.BillSubsApiSchemasFrequency;

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
 * BillSubsApiAvailableRatePlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class BillSubsApiAvailableRatePlan {
  public static final String SERIALIZED_NAME_CAN_SUBSCRIBE = "can_subscribe";
  @SerializedName(SERIALIZED_NAME_CAN_SUBSCRIBE)
  private Boolean canSubscribe = false;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_EXTERNALLY_MANAGED = "externally_managed";
  @SerializedName(SERIALIZED_NAME_EXTERNALLY_MANAGED)
  private Boolean externallyManaged = false;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private BillSubsApiSchemasFrequency frequency;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_SUBSCRIBED = "is_subscribed";
  @SerializedName(SERIALIZED_NAME_IS_SUBSCRIBED)
  private Boolean isSubscribed = false;

  public static final String SERIALIZED_NAME_LEGACY_DISCOUNT = "legacy_discount";
  @SerializedName(SERIALIZED_NAME_LEGACY_DISCOUNT)
  private Boolean legacyDiscount = false;

  public static final String SERIALIZED_NAME_LEGACY_ID = "legacy_id";
  @SerializedName(SERIALIZED_NAME_LEGACY_ID)
  private String legacyId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public BillSubsApiAvailableRatePlan() {
  }

  public BillSubsApiAvailableRatePlan(
     String currency, 
     String id, 
     String legacyId, 
     String name
  ) {
    this();
    this.currency = currency;
    this.id = id;
    this.legacyId = legacyId;
    this.name = name;
  }

  public BillSubsApiAvailableRatePlan canSubscribe(Boolean canSubscribe) {
    this.canSubscribe = canSubscribe;
    return this;
  }

   /**
   * Indicates whether you can subscribe to this plan.
   * @return canSubscribe
  **/
  @javax.annotation.Nullable
  public Boolean getCanSubscribe() {
    return canSubscribe;
  }

  public void setCanSubscribe(Boolean canSubscribe) {
    this.canSubscribe = canSubscribe;
  }


   /**
   * The monetary unit in which pricing information is displayed.
   * @return currency
  **/
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }



  public BillSubsApiAvailableRatePlan externallyManaged(Boolean externallyManaged) {
    this.externallyManaged = externallyManaged;
    return this;
  }

   /**
   * Indicates whether this plan is managed externally.
   * @return externallyManaged
  **/
  @javax.annotation.Nullable
  public Boolean getExternallyManaged() {
    return externallyManaged;
  }

  public void setExternallyManaged(Boolean externallyManaged) {
    this.externallyManaged = externallyManaged;
  }


  public BillSubsApiAvailableRatePlan frequency(BillSubsApiSchemasFrequency frequency) {
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
   * Identifier
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public BillSubsApiAvailableRatePlan isSubscribed(Boolean isSubscribed) {
    this.isSubscribed = isSubscribed;
    return this;
  }

   /**
   * Indicates whether you are currently subscribed to this plan.
   * @return isSubscribed
  **/
  @javax.annotation.Nullable
  public Boolean getIsSubscribed() {
    return isSubscribed;
  }

  public void setIsSubscribed(Boolean isSubscribed) {
    this.isSubscribed = isSubscribed;
  }


  public BillSubsApiAvailableRatePlan legacyDiscount(Boolean legacyDiscount) {
    this.legacyDiscount = legacyDiscount;
    return this;
  }

   /**
   * Indicates whether this plan has a legacy discount applied.
   * @return legacyDiscount
  **/
  @javax.annotation.Nullable
  public Boolean getLegacyDiscount() {
    return legacyDiscount;
  }

  public void setLegacyDiscount(Boolean legacyDiscount) {
    this.legacyDiscount = legacyDiscount;
  }


   /**
   * The legacy identifier for this rate plan, if any.
   * @return legacyId
  **/
  @javax.annotation.Nullable
  public String getLegacyId() {
    return legacyId;
  }



   /**
   * The plan name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }



  public BillSubsApiAvailableRatePlan price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * The amount you will be billed for this plan.
   * @return price
  **/
  @javax.annotation.Nullable
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillSubsApiAvailableRatePlan billSubsApiAvailableRatePlan = (BillSubsApiAvailableRatePlan) o;
    return Objects.equals(this.canSubscribe, billSubsApiAvailableRatePlan.canSubscribe) &&
        Objects.equals(this.currency, billSubsApiAvailableRatePlan.currency) &&
        Objects.equals(this.externallyManaged, billSubsApiAvailableRatePlan.externallyManaged) &&
        Objects.equals(this.frequency, billSubsApiAvailableRatePlan.frequency) &&
        Objects.equals(this.id, billSubsApiAvailableRatePlan.id) &&
        Objects.equals(this.isSubscribed, billSubsApiAvailableRatePlan.isSubscribed) &&
        Objects.equals(this.legacyDiscount, billSubsApiAvailableRatePlan.legacyDiscount) &&
        Objects.equals(this.legacyId, billSubsApiAvailableRatePlan.legacyId) &&
        Objects.equals(this.name, billSubsApiAvailableRatePlan.name) &&
        Objects.equals(this.price, billSubsApiAvailableRatePlan.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canSubscribe, currency, externallyManaged, frequency, id, isSubscribed, legacyDiscount, legacyId, name, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillSubsApiAvailableRatePlan {\n");
    sb.append("    canSubscribe: ").append(toIndentedString(canSubscribe)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    externallyManaged: ").append(toIndentedString(externallyManaged)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isSubscribed: ").append(toIndentedString(isSubscribed)).append("\n");
    sb.append("    legacyDiscount: ").append(toIndentedString(legacyDiscount)).append("\n");
    sb.append("    legacyId: ").append(toIndentedString(legacyId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
    openapiFields.add("can_subscribe");
    openapiFields.add("currency");
    openapiFields.add("externally_managed");
    openapiFields.add("frequency");
    openapiFields.add("id");
    openapiFields.add("is_subscribed");
    openapiFields.add("legacy_discount");
    openapiFields.add("legacy_id");
    openapiFields.add("name");
    openapiFields.add("price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BillSubsApiAvailableRatePlan
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BillSubsApiAvailableRatePlan.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BillSubsApiAvailableRatePlan is not found in the empty JSON string", BillSubsApiAvailableRatePlan.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BillSubsApiAvailableRatePlan.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BillSubsApiAvailableRatePlan` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      if ((jsonObj.get("legacy_id") != null && !jsonObj.get("legacy_id").isJsonNull()) && !jsonObj.get("legacy_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legacy_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legacy_id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BillSubsApiAvailableRatePlan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BillSubsApiAvailableRatePlan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BillSubsApiAvailableRatePlan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BillSubsApiAvailableRatePlan.class));

       return (TypeAdapter<T>) new TypeAdapter<BillSubsApiAvailableRatePlan>() {
           @Override
           public void write(JsonWriter out, BillSubsApiAvailableRatePlan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BillSubsApiAvailableRatePlan read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BillSubsApiAvailableRatePlan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BillSubsApiAvailableRatePlan
  * @throws IOException if the JSON string is invalid with respect to BillSubsApiAvailableRatePlan
  */
  public static BillSubsApiAvailableRatePlan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BillSubsApiAvailableRatePlan.class);
  }

 /**
  * Convert an instance of BillSubsApiAvailableRatePlan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
