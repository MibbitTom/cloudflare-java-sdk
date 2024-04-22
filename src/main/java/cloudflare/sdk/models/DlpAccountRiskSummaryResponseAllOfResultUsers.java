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
import cloudflare.sdk.models.DlpRiskLevel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * DlpAccountRiskSummaryResponseAllOfResultUsers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DlpAccountRiskSummaryResponseAllOfResultUsers {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EVENT_COUNT = "event_count";
  @SerializedName(SERIALIZED_NAME_EVENT_COUNT)
  private Integer eventCount;

  public static final String SERIALIZED_NAME_LAST_EVENT = "last_event";
  @SerializedName(SERIALIZED_NAME_LAST_EVENT)
  private OffsetDateTime lastEvent;

  public static final String SERIALIZED_NAME_MAX_RISK_LEVEL = "max_risk_level";
  @SerializedName(SERIALIZED_NAME_MAX_RISK_LEVEL)
  private DlpRiskLevel maxRiskLevel;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Object userId;

  public DlpAccountRiskSummaryResponseAllOfResultUsers() {
  }

  public DlpAccountRiskSummaryResponseAllOfResultUsers(
     OffsetDateTime lastEvent
  ) {
    this();
    this.lastEvent = lastEvent;
  }

  public DlpAccountRiskSummaryResponseAllOfResultUsers email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public DlpAccountRiskSummaryResponseAllOfResultUsers eventCount(Integer eventCount) {
    this.eventCount = eventCount;
    return this;
  }

   /**
   * Get eventCount
   * @return eventCount
  **/
  @javax.annotation.Nonnull
  public Integer getEventCount() {
    return eventCount;
  }

  public void setEventCount(Integer eventCount) {
    this.eventCount = eventCount;
  }


   /**
   * Get lastEvent
   * @return lastEvent
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getLastEvent() {
    return lastEvent;
  }



  public DlpAccountRiskSummaryResponseAllOfResultUsers maxRiskLevel(DlpRiskLevel maxRiskLevel) {
    this.maxRiskLevel = maxRiskLevel;
    return this;
  }

   /**
   * Get maxRiskLevel
   * @return maxRiskLevel
  **/
  @javax.annotation.Nonnull
  public DlpRiskLevel getMaxRiskLevel() {
    return maxRiskLevel;
  }

  public void setMaxRiskLevel(DlpRiskLevel maxRiskLevel) {
    this.maxRiskLevel = maxRiskLevel;
  }


  public DlpAccountRiskSummaryResponseAllOfResultUsers name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DlpAccountRiskSummaryResponseAllOfResultUsers userId(Object userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nonnull
  public Object getUserId() {
    return userId;
  }

  public void setUserId(Object userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DlpAccountRiskSummaryResponseAllOfResultUsers dlpAccountRiskSummaryResponseAllOfResultUsers = (DlpAccountRiskSummaryResponseAllOfResultUsers) o;
    return Objects.equals(this.email, dlpAccountRiskSummaryResponseAllOfResultUsers.email) &&
        Objects.equals(this.eventCount, dlpAccountRiskSummaryResponseAllOfResultUsers.eventCount) &&
        Objects.equals(this.lastEvent, dlpAccountRiskSummaryResponseAllOfResultUsers.lastEvent) &&
        Objects.equals(this.maxRiskLevel, dlpAccountRiskSummaryResponseAllOfResultUsers.maxRiskLevel) &&
        Objects.equals(this.name, dlpAccountRiskSummaryResponseAllOfResultUsers.name) &&
        Objects.equals(this.userId, dlpAccountRiskSummaryResponseAllOfResultUsers.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, eventCount, lastEvent, maxRiskLevel, name, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DlpAccountRiskSummaryResponseAllOfResultUsers {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
    sb.append("    lastEvent: ").append(toIndentedString(lastEvent)).append("\n");
    sb.append("    maxRiskLevel: ").append(toIndentedString(maxRiskLevel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("event_count");
    openapiFields.add("last_event");
    openapiFields.add("max_risk_level");
    openapiFields.add("name");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("event_count");
    openapiRequiredFields.add("last_event");
    openapiRequiredFields.add("max_risk_level");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("user_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DlpAccountRiskSummaryResponseAllOfResultUsers
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DlpAccountRiskSummaryResponseAllOfResultUsers.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DlpAccountRiskSummaryResponseAllOfResultUsers is not found in the empty JSON string", DlpAccountRiskSummaryResponseAllOfResultUsers.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DlpAccountRiskSummaryResponseAllOfResultUsers.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DlpAccountRiskSummaryResponseAllOfResultUsers` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DlpAccountRiskSummaryResponseAllOfResultUsers.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the required field `max_risk_level`
      DlpRiskLevel.validateJsonElement(jsonObj.get("max_risk_level"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `user_id`
      Object.validateJsonElement(jsonObj.get("user_id"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DlpAccountRiskSummaryResponseAllOfResultUsers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DlpAccountRiskSummaryResponseAllOfResultUsers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DlpAccountRiskSummaryResponseAllOfResultUsers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DlpAccountRiskSummaryResponseAllOfResultUsers.class));

       return (TypeAdapter<T>) new TypeAdapter<DlpAccountRiskSummaryResponseAllOfResultUsers>() {
           @Override
           public void write(JsonWriter out, DlpAccountRiskSummaryResponseAllOfResultUsers value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DlpAccountRiskSummaryResponseAllOfResultUsers read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DlpAccountRiskSummaryResponseAllOfResultUsers given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DlpAccountRiskSummaryResponseAllOfResultUsers
  * @throws IOException if the JSON string is invalid with respect to DlpAccountRiskSummaryResponseAllOfResultUsers
  */
  public static DlpAccountRiskSummaryResponseAllOfResultUsers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DlpAccountRiskSummaryResponseAllOfResultUsers.class);
  }

 /**
  * Convert an instance of DlpAccountRiskSummaryResponseAllOfResultUsers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

