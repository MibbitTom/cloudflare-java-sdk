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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.BillSubsApiSchemasZone;

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
 * BillSubsApiBillingHistory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class BillSubsApiBillingHistory {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_OCCURRED_AT = "occurred_at";
  @SerializedName(SERIALIZED_NAME_OCCURRED_AT)
  private OffsetDateTime occurredAt;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ZONE = "zone";
  @SerializedName(SERIALIZED_NAME_ZONE)
  private BillSubsApiSchemasZone zone;

  public BillSubsApiBillingHistory() {
  }

  public BillSubsApiBillingHistory(
     String action, 
     BigDecimal amount, 
     String currency, 
     String description, 
     String id, 
     OffsetDateTime occurredAt, 
     String type
  ) {
    this();
    this.action = action;
    this.amount = amount;
    this.currency = currency;
    this.description = description;
    this.id = id;
    this.occurredAt = occurredAt;
    this.type = type;
  }

   /**
   * The billing item action.
   * @return action
  **/
  @javax.annotation.Nonnull
  public String getAction() {
    return action;
  }



   /**
   * The amount associated with this billing item.
   * @return amount
  **/
  @javax.annotation.Nonnull
  public BigDecimal getAmount() {
    return amount;
  }



   /**
   * The monetary unit in which pricing information is displayed.
   * @return currency
  **/
  @javax.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }



   /**
   * The billing item description.
   * @return description
  **/
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }



   /**
   * Billing item identifier tag.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }



   /**
   * When the billing item was created.
   * @return occurredAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }



   /**
   * The billing item type.
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }



  public BillSubsApiBillingHistory zone(BillSubsApiSchemasZone zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
  @javax.annotation.Nonnull
  public BillSubsApiSchemasZone getZone() {
    return zone;
  }

  public void setZone(BillSubsApiSchemasZone zone) {
    this.zone = zone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillSubsApiBillingHistory billSubsApiBillingHistory = (BillSubsApiBillingHistory) o;
    return Objects.equals(this.action, billSubsApiBillingHistory.action) &&
        Objects.equals(this.amount, billSubsApiBillingHistory.amount) &&
        Objects.equals(this.currency, billSubsApiBillingHistory.currency) &&
        Objects.equals(this.description, billSubsApiBillingHistory.description) &&
        Objects.equals(this.id, billSubsApiBillingHistory.id) &&
        Objects.equals(this.occurredAt, billSubsApiBillingHistory.occurredAt) &&
        Objects.equals(this.type, billSubsApiBillingHistory.type) &&
        Objects.equals(this.zone, billSubsApiBillingHistory.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, amount, currency, description, id, occurredAt, type, zone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillSubsApiBillingHistory {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("occurred_at");
    openapiFields.add("type");
    openapiFields.add("zone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("occurred_at");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("zone");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BillSubsApiBillingHistory
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BillSubsApiBillingHistory.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BillSubsApiBillingHistory is not found in the empty JSON string", BillSubsApiBillingHistory.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BillSubsApiBillingHistory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BillSubsApiBillingHistory` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BillSubsApiBillingHistory.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `zone`
      BillSubsApiSchemasZone.validateJsonElement(jsonObj.get("zone"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BillSubsApiBillingHistory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BillSubsApiBillingHistory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BillSubsApiBillingHistory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BillSubsApiBillingHistory.class));

       return (TypeAdapter<T>) new TypeAdapter<BillSubsApiBillingHistory>() {
           @Override
           public void write(JsonWriter out, BillSubsApiBillingHistory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BillSubsApiBillingHistory read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BillSubsApiBillingHistory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BillSubsApiBillingHistory
  * @throws IOException if the JSON string is invalid with respect to BillSubsApiBillingHistory
  */
  public static BillSubsApiBillingHistory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BillSubsApiBillingHistory.class);
  }

 /**
  * Convert an instance of BillSubsApiBillingHistory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

