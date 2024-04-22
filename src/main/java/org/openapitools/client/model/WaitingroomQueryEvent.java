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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * WaitingroomQueryEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class WaitingroomQueryEvent {
  public static final String SERIALIZED_NAME_CUSTOM_PAGE_HTML = "custom_page_html";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PAGE_HTML)
  private String customPageHtml;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "";

  public static final String SERIALIZED_NAME_DISABLE_SESSION_RENEWAL = "disable_session_renewal";
  @SerializedName(SERIALIZED_NAME_DISABLE_SESSION_RENEWAL)
  private Boolean disableSessionRenewal;

  public static final String SERIALIZED_NAME_EVENT_END_TIME = "event_end_time";
  @SerializedName(SERIALIZED_NAME_EVENT_END_TIME)
  private String eventEndTime;

  public static final String SERIALIZED_NAME_EVENT_START_TIME = "event_start_time";
  @SerializedName(SERIALIZED_NAME_EVENT_START_TIME)
  private String eventStartTime;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_USERS_PER_MINUTE = "new_users_per_minute";
  @SerializedName(SERIALIZED_NAME_NEW_USERS_PER_MINUTE)
  private Integer newUsersPerMinute;

  public static final String SERIALIZED_NAME_PREQUEUE_START_TIME = "prequeue_start_time";
  @SerializedName(SERIALIZED_NAME_PREQUEUE_START_TIME)
  private String prequeueStartTime;

  public static final String SERIALIZED_NAME_QUEUEING_METHOD = "queueing_method";
  @SerializedName(SERIALIZED_NAME_QUEUEING_METHOD)
  private String queueingMethod;

  public static final String SERIALIZED_NAME_SESSION_DURATION = "session_duration";
  @SerializedName(SERIALIZED_NAME_SESSION_DURATION)
  private Integer sessionDuration;

  public static final String SERIALIZED_NAME_SHUFFLE_AT_EVENT_START = "shuffle_at_event_start";
  @SerializedName(SERIALIZED_NAME_SHUFFLE_AT_EVENT_START)
  private Boolean shuffleAtEventStart = false;

  public static final String SERIALIZED_NAME_SUSPENDED = "suspended";
  @SerializedName(SERIALIZED_NAME_SUSPENDED)
  private Boolean suspended = false;

  public static final String SERIALIZED_NAME_TOTAL_ACTIVE_USERS = "total_active_users";
  @SerializedName(SERIALIZED_NAME_TOTAL_ACTIVE_USERS)
  private Integer totalActiveUsers;

  public WaitingroomQueryEvent() {
  }

  public WaitingroomQueryEvent customPageHtml(String customPageHtml) {
    this.customPageHtml = customPageHtml;
    return this;
  }

   /**
   * If set, the event will override the waiting room&#39;s &#x60;custom_page_html&#x60; property while it is active. If null, the event will inherit it.
   * @return customPageHtml
  **/
  @javax.annotation.Nullable
  public String getCustomPageHtml() {
    return customPageHtml;
  }

  public void setCustomPageHtml(String customPageHtml) {
    this.customPageHtml = customPageHtml;
  }


  public WaitingroomQueryEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A note that you can use to add more details about the event.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public WaitingroomQueryEvent disableSessionRenewal(Boolean disableSessionRenewal) {
    this.disableSessionRenewal = disableSessionRenewal;
    return this;
  }

   /**
   * If set, the event will override the waiting room&#39;s &#x60;disable_session_renewal&#x60; property while it is active. If null, the event will inherit it.
   * @return disableSessionRenewal
  **/
  @javax.annotation.Nullable
  public Boolean getDisableSessionRenewal() {
    return disableSessionRenewal;
  }

  public void setDisableSessionRenewal(Boolean disableSessionRenewal) {
    this.disableSessionRenewal = disableSessionRenewal;
  }


  public WaitingroomQueryEvent eventEndTime(String eventEndTime) {
    this.eventEndTime = eventEndTime;
    return this;
  }

   /**
   * An ISO 8601 timestamp that marks the end of the event.
   * @return eventEndTime
  **/
  @javax.annotation.Nonnull
  public String getEventEndTime() {
    return eventEndTime;
  }

  public void setEventEndTime(String eventEndTime) {
    this.eventEndTime = eventEndTime;
  }


  public WaitingroomQueryEvent eventStartTime(String eventStartTime) {
    this.eventStartTime = eventStartTime;
    return this;
  }

   /**
   * An ISO 8601 timestamp that marks the start of the event. At this time, queued users will be processed with the event&#39;s configuration. The start time must be at least one minute before &#x60;event_end_time&#x60;.
   * @return eventStartTime
  **/
  @javax.annotation.Nonnull
  public String getEventStartTime() {
    return eventStartTime;
  }

  public void setEventStartTime(String eventStartTime) {
    this.eventStartTime = eventStartTime;
  }


  public WaitingroomQueryEvent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A unique name to identify the event. Only alphanumeric characters, hyphens and underscores are allowed.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public WaitingroomQueryEvent newUsersPerMinute(Integer newUsersPerMinute) {
    this.newUsersPerMinute = newUsersPerMinute;
    return this;
  }

   /**
   * If set, the event will override the waiting room&#39;s &#x60;new_users_per_minute&#x60; property while it is active. If null, the event will inherit it. This can only be set if the event&#39;s &#x60;total_active_users&#x60; property is also set.
   * minimum: 200
   * maximum: 2147483647
   * @return newUsersPerMinute
  **/
  @javax.annotation.Nullable
  public Integer getNewUsersPerMinute() {
    return newUsersPerMinute;
  }

  public void setNewUsersPerMinute(Integer newUsersPerMinute) {
    this.newUsersPerMinute = newUsersPerMinute;
  }


  public WaitingroomQueryEvent prequeueStartTime(String prequeueStartTime) {
    this.prequeueStartTime = prequeueStartTime;
    return this;
  }

   /**
   * An ISO 8601 timestamp that marks when to begin queueing all users before the event starts. The prequeue must start at least five minutes before &#x60;event_start_time&#x60;.
   * @return prequeueStartTime
  **/
  @javax.annotation.Nullable
  public String getPrequeueStartTime() {
    return prequeueStartTime;
  }

  public void setPrequeueStartTime(String prequeueStartTime) {
    this.prequeueStartTime = prequeueStartTime;
  }


  public WaitingroomQueryEvent queueingMethod(String queueingMethod) {
    this.queueingMethod = queueingMethod;
    return this;
  }

   /**
   * If set, the event will override the waiting room&#39;s &#x60;queueing_method&#x60; property while it is active. If null, the event will inherit it.
   * @return queueingMethod
  **/
  @javax.annotation.Nullable
  public String getQueueingMethod() {
    return queueingMethod;
  }

  public void setQueueingMethod(String queueingMethod) {
    this.queueingMethod = queueingMethod;
  }


  public WaitingroomQueryEvent sessionDuration(Integer sessionDuration) {
    this.sessionDuration = sessionDuration;
    return this;
  }

   /**
   * If set, the event will override the waiting room&#39;s &#x60;session_duration&#x60; property while it is active. If null, the event will inherit it.
   * minimum: 1
   * maximum: 30
   * @return sessionDuration
  **/
  @javax.annotation.Nullable
  public Integer getSessionDuration() {
    return sessionDuration;
  }

  public void setSessionDuration(Integer sessionDuration) {
    this.sessionDuration = sessionDuration;
  }


  public WaitingroomQueryEvent shuffleAtEventStart(Boolean shuffleAtEventStart) {
    this.shuffleAtEventStart = shuffleAtEventStart;
    return this;
  }

   /**
   * If enabled, users in the prequeue will be shuffled randomly at the &#x60;event_start_time&#x60;. Requires that &#x60;prequeue_start_time&#x60; is not null. This is useful for situations when many users will join the event prequeue at the same time and you want to shuffle them to ensure fairness. Naturally, it makes the most sense to enable this feature when the &#x60;queueing_method&#x60; during the event respects ordering such as **fifo**, or else the shuffling may be unnecessary.
   * @return shuffleAtEventStart
  **/
  @javax.annotation.Nullable
  public Boolean getShuffleAtEventStart() {
    return shuffleAtEventStart;
  }

  public void setShuffleAtEventStart(Boolean shuffleAtEventStart) {
    this.shuffleAtEventStart = shuffleAtEventStart;
  }


  public WaitingroomQueryEvent suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

   /**
   * Suspends or allows an event. If set to &#x60;true&#x60;, the event is ignored and traffic will be handled based on the waiting room configuration.
   * @return suspended
  **/
  @javax.annotation.Nullable
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }


  public WaitingroomQueryEvent totalActiveUsers(Integer totalActiveUsers) {
    this.totalActiveUsers = totalActiveUsers;
    return this;
  }

   /**
   * If set, the event will override the waiting room&#39;s &#x60;total_active_users&#x60; property while it is active. If null, the event will inherit it. This can only be set if the event&#39;s &#x60;new_users_per_minute&#x60; property is also set.
   * minimum: 200
   * maximum: 2147483647
   * @return totalActiveUsers
  **/
  @javax.annotation.Nullable
  public Integer getTotalActiveUsers() {
    return totalActiveUsers;
  }

  public void setTotalActiveUsers(Integer totalActiveUsers) {
    this.totalActiveUsers = totalActiveUsers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaitingroomQueryEvent waitingroomQueryEvent = (WaitingroomQueryEvent) o;
    return Objects.equals(this.customPageHtml, waitingroomQueryEvent.customPageHtml) &&
        Objects.equals(this.description, waitingroomQueryEvent.description) &&
        Objects.equals(this.disableSessionRenewal, waitingroomQueryEvent.disableSessionRenewal) &&
        Objects.equals(this.eventEndTime, waitingroomQueryEvent.eventEndTime) &&
        Objects.equals(this.eventStartTime, waitingroomQueryEvent.eventStartTime) &&
        Objects.equals(this.name, waitingroomQueryEvent.name) &&
        Objects.equals(this.newUsersPerMinute, waitingroomQueryEvent.newUsersPerMinute) &&
        Objects.equals(this.prequeueStartTime, waitingroomQueryEvent.prequeueStartTime) &&
        Objects.equals(this.queueingMethod, waitingroomQueryEvent.queueingMethod) &&
        Objects.equals(this.sessionDuration, waitingroomQueryEvent.sessionDuration) &&
        Objects.equals(this.shuffleAtEventStart, waitingroomQueryEvent.shuffleAtEventStart) &&
        Objects.equals(this.suspended, waitingroomQueryEvent.suspended) &&
        Objects.equals(this.totalActiveUsers, waitingroomQueryEvent.totalActiveUsers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customPageHtml, description, disableSessionRenewal, eventEndTime, eventStartTime, name, newUsersPerMinute, prequeueStartTime, queueingMethod, sessionDuration, shuffleAtEventStart, suspended, totalActiveUsers);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaitingroomQueryEvent {\n");
    sb.append("    customPageHtml: ").append(toIndentedString(customPageHtml)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disableSessionRenewal: ").append(toIndentedString(disableSessionRenewal)).append("\n");
    sb.append("    eventEndTime: ").append(toIndentedString(eventEndTime)).append("\n");
    sb.append("    eventStartTime: ").append(toIndentedString(eventStartTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newUsersPerMinute: ").append(toIndentedString(newUsersPerMinute)).append("\n");
    sb.append("    prequeueStartTime: ").append(toIndentedString(prequeueStartTime)).append("\n");
    sb.append("    queueingMethod: ").append(toIndentedString(queueingMethod)).append("\n");
    sb.append("    sessionDuration: ").append(toIndentedString(sessionDuration)).append("\n");
    sb.append("    shuffleAtEventStart: ").append(toIndentedString(shuffleAtEventStart)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    totalActiveUsers: ").append(toIndentedString(totalActiveUsers)).append("\n");
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
    openapiFields.add("custom_page_html");
    openapiFields.add("description");
    openapiFields.add("disable_session_renewal");
    openapiFields.add("event_end_time");
    openapiFields.add("event_start_time");
    openapiFields.add("name");
    openapiFields.add("new_users_per_minute");
    openapiFields.add("prequeue_start_time");
    openapiFields.add("queueing_method");
    openapiFields.add("session_duration");
    openapiFields.add("shuffle_at_event_start");
    openapiFields.add("suspended");
    openapiFields.add("total_active_users");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("event_end_time");
    openapiRequiredFields.add("event_start_time");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WaitingroomQueryEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WaitingroomQueryEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WaitingroomQueryEvent is not found in the empty JSON string", WaitingroomQueryEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WaitingroomQueryEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WaitingroomQueryEvent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WaitingroomQueryEvent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("custom_page_html") != null && !jsonObj.get("custom_page_html").isJsonNull()) && !jsonObj.get("custom_page_html").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_page_html` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_page_html").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("event_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_end_time").toString()));
      }
      if (!jsonObj.get("event_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_start_time").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("prequeue_start_time") != null && !jsonObj.get("prequeue_start_time").isJsonNull()) && !jsonObj.get("prequeue_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prequeue_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prequeue_start_time").toString()));
      }
      if ((jsonObj.get("queueing_method") != null && !jsonObj.get("queueing_method").isJsonNull()) && !jsonObj.get("queueing_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `queueing_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("queueing_method").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WaitingroomQueryEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WaitingroomQueryEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WaitingroomQueryEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WaitingroomQueryEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<WaitingroomQueryEvent>() {
           @Override
           public void write(JsonWriter out, WaitingroomQueryEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WaitingroomQueryEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WaitingroomQueryEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WaitingroomQueryEvent
  * @throws IOException if the JSON string is invalid with respect to WaitingroomQueryEvent
  */
  public static WaitingroomQueryEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WaitingroomQueryEvent.class);
  }

 /**
  * Convert an instance of WaitingroomQueryEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

