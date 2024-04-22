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
import java.time.OffsetDateTime;
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

import invalidPackageName.JSON;

/**
 * WaitingroomEventDetailsResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class WaitingroomEventDetailsResult {
  public static final String SERIALIZED_NAME_CREATED_ON = "created_on";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

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

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modified_on";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

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

  public WaitingroomEventDetailsResult() {
  }

  public WaitingroomEventDetailsResult(
     OffsetDateTime createdOn, 
     OffsetDateTime modifiedOn
  ) {
    this();
    this.createdOn = createdOn;
    this.modifiedOn = modifiedOn;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  public WaitingroomEventDetailsResult customPageHtml(String customPageHtml) {
    this.customPageHtml = customPageHtml;
    return this;
  }

   /**
   * Get customPageHtml
   * @return customPageHtml
  **/
  @javax.annotation.Nullable
  public String getCustomPageHtml() {
    return customPageHtml;
  }

  public void setCustomPageHtml(String customPageHtml) {
    this.customPageHtml = customPageHtml;
  }


  public WaitingroomEventDetailsResult description(String description) {
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


  public WaitingroomEventDetailsResult disableSessionRenewal(Boolean disableSessionRenewal) {
    this.disableSessionRenewal = disableSessionRenewal;
    return this;
  }

   /**
   * Get disableSessionRenewal
   * @return disableSessionRenewal
  **/
  @javax.annotation.Nullable
  public Boolean getDisableSessionRenewal() {
    return disableSessionRenewal;
  }

  public void setDisableSessionRenewal(Boolean disableSessionRenewal) {
    this.disableSessionRenewal = disableSessionRenewal;
  }


  public WaitingroomEventDetailsResult eventEndTime(String eventEndTime) {
    this.eventEndTime = eventEndTime;
    return this;
  }

   /**
   * An ISO 8601 timestamp that marks the end of the event.
   * @return eventEndTime
  **/
  @javax.annotation.Nullable
  public String getEventEndTime() {
    return eventEndTime;
  }

  public void setEventEndTime(String eventEndTime) {
    this.eventEndTime = eventEndTime;
  }


  public WaitingroomEventDetailsResult eventStartTime(String eventStartTime) {
    this.eventStartTime = eventStartTime;
    return this;
  }

   /**
   * An ISO 8601 timestamp that marks the start of the event. At this time, queued users will be processed with the event&#39;s configuration. The start time must be at least one minute before &#x60;event_end_time&#x60;.
   * @return eventStartTime
  **/
  @javax.annotation.Nullable
  public String getEventStartTime() {
    return eventStartTime;
  }

  public void setEventStartTime(String eventStartTime) {
    this.eventStartTime = eventStartTime;
  }


  public WaitingroomEventDetailsResult id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }



  public WaitingroomEventDetailsResult name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A unique name to identify the event. Only alphanumeric characters, hyphens and underscores are allowed.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public WaitingroomEventDetailsResult newUsersPerMinute(Integer newUsersPerMinute) {
    this.newUsersPerMinute = newUsersPerMinute;
    return this;
  }

   /**
   * Get newUsersPerMinute
   * @return newUsersPerMinute
  **/
  @javax.annotation.Nullable
  public Integer getNewUsersPerMinute() {
    return newUsersPerMinute;
  }

  public void setNewUsersPerMinute(Integer newUsersPerMinute) {
    this.newUsersPerMinute = newUsersPerMinute;
  }


  public WaitingroomEventDetailsResult prequeueStartTime(String prequeueStartTime) {
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


  public WaitingroomEventDetailsResult queueingMethod(String queueingMethod) {
    this.queueingMethod = queueingMethod;
    return this;
  }

   /**
   * Get queueingMethod
   * @return queueingMethod
  **/
  @javax.annotation.Nullable
  public String getQueueingMethod() {
    return queueingMethod;
  }

  public void setQueueingMethod(String queueingMethod) {
    this.queueingMethod = queueingMethod;
  }


  public WaitingroomEventDetailsResult sessionDuration(Integer sessionDuration) {
    this.sessionDuration = sessionDuration;
    return this;
  }

   /**
   * Get sessionDuration
   * @return sessionDuration
  **/
  @javax.annotation.Nullable
  public Integer getSessionDuration() {
    return sessionDuration;
  }

  public void setSessionDuration(Integer sessionDuration) {
    this.sessionDuration = sessionDuration;
  }


  public WaitingroomEventDetailsResult shuffleAtEventStart(Boolean shuffleAtEventStart) {
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


  public WaitingroomEventDetailsResult suspended(Boolean suspended) {
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


  public WaitingroomEventDetailsResult totalActiveUsers(Integer totalActiveUsers) {
    this.totalActiveUsers = totalActiveUsers;
    return this;
  }

   /**
   * Get totalActiveUsers
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
    WaitingroomEventDetailsResult waitingroomEventDetailsResult = (WaitingroomEventDetailsResult) o;
    return Objects.equals(this.createdOn, waitingroomEventDetailsResult.createdOn) &&
        Objects.equals(this.customPageHtml, waitingroomEventDetailsResult.customPageHtml) &&
        Objects.equals(this.description, waitingroomEventDetailsResult.description) &&
        Objects.equals(this.disableSessionRenewal, waitingroomEventDetailsResult.disableSessionRenewal) &&
        Objects.equals(this.eventEndTime, waitingroomEventDetailsResult.eventEndTime) &&
        Objects.equals(this.eventStartTime, waitingroomEventDetailsResult.eventStartTime) &&
        Objects.equals(this.id, waitingroomEventDetailsResult.id) &&
        Objects.equals(this.modifiedOn, waitingroomEventDetailsResult.modifiedOn) &&
        Objects.equals(this.name, waitingroomEventDetailsResult.name) &&
        Objects.equals(this.newUsersPerMinute, waitingroomEventDetailsResult.newUsersPerMinute) &&
        Objects.equals(this.prequeueStartTime, waitingroomEventDetailsResult.prequeueStartTime) &&
        Objects.equals(this.queueingMethod, waitingroomEventDetailsResult.queueingMethod) &&
        Objects.equals(this.sessionDuration, waitingroomEventDetailsResult.sessionDuration) &&
        Objects.equals(this.shuffleAtEventStart, waitingroomEventDetailsResult.shuffleAtEventStart) &&
        Objects.equals(this.suspended, waitingroomEventDetailsResult.suspended) &&
        Objects.equals(this.totalActiveUsers, waitingroomEventDetailsResult.totalActiveUsers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, customPageHtml, description, disableSessionRenewal, eventEndTime, eventStartTime, id, modifiedOn, name, newUsersPerMinute, prequeueStartTime, queueingMethod, sessionDuration, shuffleAtEventStart, suspended, totalActiveUsers);
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
    sb.append("class WaitingroomEventDetailsResult {\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    customPageHtml: ").append(toIndentedString(customPageHtml)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disableSessionRenewal: ").append(toIndentedString(disableSessionRenewal)).append("\n");
    sb.append("    eventEndTime: ").append(toIndentedString(eventEndTime)).append("\n");
    sb.append("    eventStartTime: ").append(toIndentedString(eventStartTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
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
    openapiFields.add("created_on");
    openapiFields.add("custom_page_html");
    openapiFields.add("description");
    openapiFields.add("disable_session_renewal");
    openapiFields.add("event_end_time");
    openapiFields.add("event_start_time");
    openapiFields.add("id");
    openapiFields.add("modified_on");
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
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WaitingroomEventDetailsResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WaitingroomEventDetailsResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WaitingroomEventDetailsResult is not found in the empty JSON string", WaitingroomEventDetailsResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WaitingroomEventDetailsResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WaitingroomEventDetailsResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("custom_page_html") != null && !jsonObj.get("custom_page_html").isJsonNull()) && !jsonObj.get("custom_page_html").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_page_html` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_page_html").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("event_end_time") != null && !jsonObj.get("event_end_time").isJsonNull()) && !jsonObj.get("event_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_end_time").toString()));
      }
      if ((jsonObj.get("event_start_time") != null && !jsonObj.get("event_start_time").isJsonNull()) && !jsonObj.get("event_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_start_time").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
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
       if (!WaitingroomEventDetailsResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WaitingroomEventDetailsResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WaitingroomEventDetailsResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WaitingroomEventDetailsResult.class));

       return (TypeAdapter<T>) new TypeAdapter<WaitingroomEventDetailsResult>() {
           @Override
           public void write(JsonWriter out, WaitingroomEventDetailsResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WaitingroomEventDetailsResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WaitingroomEventDetailsResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WaitingroomEventDetailsResult
  * @throws IOException if the JSON string is invalid with respect to WaitingroomEventDetailsResult
  */
  public static WaitingroomEventDetailsResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WaitingroomEventDetailsResult.class);
  }

 /**
  * Convert an instance of WaitingroomEventDetailsResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

