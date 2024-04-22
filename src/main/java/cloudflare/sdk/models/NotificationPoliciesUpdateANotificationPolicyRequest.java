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
import cloudflare.sdk.models.AaaAlertType;
import cloudflare.sdk.models.AaaFilters;
import cloudflare.sdk.models.AaaMechanismsValueInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * NotificationPoliciesUpdateANotificationPolicyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class NotificationPoliciesUpdateANotificationPolicyRequest {
  public static final String SERIALIZED_NAME_ALERT_TYPE = "alert_type";
  @SerializedName(SERIALIZED_NAME_ALERT_TYPE)
  private AaaAlertType alertType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = true;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private AaaFilters filters;

  public static final String SERIALIZED_NAME_MECHANISMS = "mechanisms";
  @SerializedName(SERIALIZED_NAME_MECHANISMS)
  private Map<String, List<AaaMechanismsValueInner>> mechanisms = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public NotificationPoliciesUpdateANotificationPolicyRequest() {
  }

  public NotificationPoliciesUpdateANotificationPolicyRequest alertType(AaaAlertType alertType) {
    this.alertType = alertType;
    return this;
  }

   /**
   * Get alertType
   * @return alertType
  **/
  @javax.annotation.Nullable
  public AaaAlertType getAlertType() {
    return alertType;
  }

  public void setAlertType(AaaAlertType alertType) {
    this.alertType = alertType;
  }


  public NotificationPoliciesUpdateANotificationPolicyRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Optional description for the Notification policy.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public NotificationPoliciesUpdateANotificationPolicyRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether or not the Notification policy is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public NotificationPoliciesUpdateANotificationPolicyRequest filters(AaaFilters filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  public AaaFilters getFilters() {
    return filters;
  }

  public void setFilters(AaaFilters filters) {
    this.filters = filters;
  }


  public NotificationPoliciesUpdateANotificationPolicyRequest mechanisms(Map<String, List<AaaMechanismsValueInner>> mechanisms) {
    this.mechanisms = mechanisms;
    return this;
  }

  public NotificationPoliciesUpdateANotificationPolicyRequest putMechanismsItem(String key, List<AaaMechanismsValueInner> mechanismsItem) {
    if (this.mechanisms == null) {
      this.mechanisms = new HashMap<>();
    }
    this.mechanisms.put(key, mechanismsItem);
    return this;
  }

   /**
   * List of IDs that will be used when dispatching a notification. IDs for email type will be the email address.
   * @return mechanisms
  **/
  @javax.annotation.Nullable
  public Map<String, List<AaaMechanismsValueInner>> getMechanisms() {
    return mechanisms;
  }

  public void setMechanisms(Map<String, List<AaaMechanismsValueInner>> mechanisms) {
    this.mechanisms = mechanisms;
  }


  public NotificationPoliciesUpdateANotificationPolicyRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the policy.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationPoliciesUpdateANotificationPolicyRequest notificationPoliciesUpdateANotificationPolicyRequest = (NotificationPoliciesUpdateANotificationPolicyRequest) o;
    return Objects.equals(this.alertType, notificationPoliciesUpdateANotificationPolicyRequest.alertType) &&
        Objects.equals(this.description, notificationPoliciesUpdateANotificationPolicyRequest.description) &&
        Objects.equals(this.enabled, notificationPoliciesUpdateANotificationPolicyRequest.enabled) &&
        Objects.equals(this.filters, notificationPoliciesUpdateANotificationPolicyRequest.filters) &&
        Objects.equals(this.mechanisms, notificationPoliciesUpdateANotificationPolicyRequest.mechanisms) &&
        Objects.equals(this.name, notificationPoliciesUpdateANotificationPolicyRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertType, description, enabled, filters, mechanisms, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationPoliciesUpdateANotificationPolicyRequest {\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    mechanisms: ").append(toIndentedString(mechanisms)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("alert_type");
    openapiFields.add("description");
    openapiFields.add("enabled");
    openapiFields.add("filters");
    openapiFields.add("mechanisms");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NotificationPoliciesUpdateANotificationPolicyRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NotificationPoliciesUpdateANotificationPolicyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotificationPoliciesUpdateANotificationPolicyRequest is not found in the empty JSON string", NotificationPoliciesUpdateANotificationPolicyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NotificationPoliciesUpdateANotificationPolicyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotificationPoliciesUpdateANotificationPolicyRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `alert_type`
      if (jsonObj.get("alert_type") != null && !jsonObj.get("alert_type").isJsonNull()) {
        AaaAlertType.validateJsonElement(jsonObj.get("alert_type"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `filters`
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        AaaFilters.validateJsonElement(jsonObj.get("filters"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationPoliciesUpdateANotificationPolicyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationPoliciesUpdateANotificationPolicyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationPoliciesUpdateANotificationPolicyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationPoliciesUpdateANotificationPolicyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationPoliciesUpdateANotificationPolicyRequest>() {
           @Override
           public void write(JsonWriter out, NotificationPoliciesUpdateANotificationPolicyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotificationPoliciesUpdateANotificationPolicyRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NotificationPoliciesUpdateANotificationPolicyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotificationPoliciesUpdateANotificationPolicyRequest
  * @throws IOException if the JSON string is invalid with respect to NotificationPoliciesUpdateANotificationPolicyRequest
  */
  public static NotificationPoliciesUpdateANotificationPolicyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationPoliciesUpdateANotificationPolicyRequest.class);
  }

 /**
  * Convert an instance of NotificationPoliciesUpdateANotificationPolicyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

