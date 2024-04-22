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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.LoadBalancingLoadShedding;
import org.openapitools.client.model.LoadBalancingNotificationFilter;
import org.openapitools.client.model.LoadBalancingOrigin;
import org.openapitools.client.model.LoadBalancingOriginSteering;
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
 * LoadBalancingPool
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class LoadBalancingPool {
  /**
   * WNAM: Western North America, ENAM: Eastern North America, WEU: Western Europe, EEU: Eastern Europe, NSAM: Northern South America, SSAM: Southern South America, OC: Oceania, ME: Middle East, NAF: North Africa, SAF: South Africa, SAS: Southern Asia, SEAS: South East Asia, NEAS: North East Asia, ALL_REGIONS: all regions (ENTERPRISE customers only).
   */
  @JsonAdapter(CheckRegionsEnum.Adapter.class)
  public enum CheckRegionsEnum {
    WNAM("WNAM"),
    
    ENAM("ENAM"),
    
    WEU("WEU"),
    
    EEU("EEU"),
    
    NSAM("NSAM"),
    
    SSAM("SSAM"),
    
    OC("OC"),
    
    ME("ME"),
    
    NAF("NAF"),
    
    SAF("SAF"),
    
    SAS("SAS"),
    
    SEAS("SEAS"),
    
    NEAS("NEAS"),
    
    ALL_REGIONS("ALL_REGIONS");

    private String value;

    CheckRegionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CheckRegionsEnum fromValue(String value) {
      for (CheckRegionsEnum b : CheckRegionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CheckRegionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CheckRegionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CheckRegionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CheckRegionsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CheckRegionsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CHECK_REGIONS = "check_regions";
  @SerializedName(SERIALIZED_NAME_CHECK_REGIONS)
  private List<CheckRegionsEnum> checkRegions;

  public static final String SERIALIZED_NAME_CREATED_ON = "created_on";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISABLED_AT = "disabled_at";
  @SerializedName(SERIALIZED_NAME_DISABLED_AT)
  private OffsetDateTime disabledAt;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = true;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private BigDecimal latitude;

  public static final String SERIALIZED_NAME_LOAD_SHEDDING = "load_shedding";
  @SerializedName(SERIALIZED_NAME_LOAD_SHEDDING)
  private LoadBalancingLoadShedding loadShedding;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private BigDecimal longitude;

  public static final String SERIALIZED_NAME_MINIMUM_ORIGINS = "minimum_origins";
  @SerializedName(SERIALIZED_NAME_MINIMUM_ORIGINS)
  private Integer minimumOrigins = 1;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modified_on";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

  public static final String SERIALIZED_NAME_MONITOR = "monitor";
  @SerializedName(SERIALIZED_NAME_MONITOR)
  private Object monitor = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOTIFICATION_EMAIL = "notification_email";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_EMAIL)
  private String notificationEmail;

  public static final String SERIALIZED_NAME_NOTIFICATION_FILTER = "notification_filter";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_FILTER)
  private LoadBalancingNotificationFilter notificationFilter;

  public static final String SERIALIZED_NAME_ORIGIN_STEERING = "origin_steering";
  @SerializedName(SERIALIZED_NAME_ORIGIN_STEERING)
  private LoadBalancingOriginSteering originSteering;

  public static final String SERIALIZED_NAME_ORIGINS = "origins";
  @SerializedName(SERIALIZED_NAME_ORIGINS)
  private List<LoadBalancingOrigin> origins = new ArrayList<>();

  public LoadBalancingPool() {
  }

  public LoadBalancingPool(
     OffsetDateTime createdOn, 
     OffsetDateTime disabledAt, 
     OffsetDateTime modifiedOn
  ) {
    this();
    this.createdOn = createdOn;
    this.disabledAt = disabledAt;
    this.modifiedOn = modifiedOn;
  }

  public LoadBalancingPool checkRegions(List<CheckRegionsEnum> checkRegions) {
    this.checkRegions = checkRegions;
    return this;
  }

  public LoadBalancingPool addCheckRegionsItem(CheckRegionsEnum checkRegionsItem) {
    if (this.checkRegions == null) {
      this.checkRegions = new ArrayList<>();
    }
    this.checkRegions.add(checkRegionsItem);
    return this;
  }

   /**
   * A list of regions from which to run health checks. Null means every Cloudflare data center.
   * @return checkRegions
  **/
  @javax.annotation.Nullable
  public List<CheckRegionsEnum> getCheckRegions() {
    return checkRegions;
  }

  public void setCheckRegions(List<CheckRegionsEnum> checkRegions) {
    this.checkRegions = checkRegions;
  }


   /**
   * Get createdOn
   * @return createdOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  public LoadBalancingPool description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human-readable description of the pool.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * This field shows up only if the pool is disabled. This field is set with the time the pool was disabled at.
   * @return disabledAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDisabledAt() {
    return disabledAt;
  }



  public LoadBalancingPool enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether to enable (the default) or disable this pool. Disabled pools will not receive traffic and are excluded from health checks. Disabling a pool will cause any load balancers using it to failover to the next pool (if any).
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public LoadBalancingPool id(String id) {
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


  public LoadBalancingPool latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * The latitude of the data center containing the origins used in this pool in decimal degrees. If this is set, longitude must also be set.
   * @return latitude
  **/
  @javax.annotation.Nullable
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }


  public LoadBalancingPool loadShedding(LoadBalancingLoadShedding loadShedding) {
    this.loadShedding = loadShedding;
    return this;
  }

   /**
   * Get loadShedding
   * @return loadShedding
  **/
  @javax.annotation.Nullable
  public LoadBalancingLoadShedding getLoadShedding() {
    return loadShedding;
  }

  public void setLoadShedding(LoadBalancingLoadShedding loadShedding) {
    this.loadShedding = loadShedding;
  }


  public LoadBalancingPool longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * The longitude of the data center containing the origins used in this pool in decimal degrees. If this is set, latitude must also be set.
   * @return longitude
  **/
  @javax.annotation.Nullable
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  public LoadBalancingPool minimumOrigins(Integer minimumOrigins) {
    this.minimumOrigins = minimumOrigins;
    return this;
  }

   /**
   * The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and will failover to the next available pool.
   * @return minimumOrigins
  **/
  @javax.annotation.Nullable
  public Integer getMinimumOrigins() {
    return minimumOrigins;
  }

  public void setMinimumOrigins(Integer minimumOrigins) {
    this.minimumOrigins = minimumOrigins;
  }


   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }



  public LoadBalancingPool monitor(Object monitor) {
    this.monitor = monitor;
    return this;
  }

   /**
   * The ID of the Monitor to use for checking the health of origins within this pool.
   * @return monitor
  **/
  @javax.annotation.Nullable
  public Object getMonitor() {
    return monitor;
  }

  public void setMonitor(Object monitor) {
    this.monitor = monitor;
  }


  public LoadBalancingPool name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A short name (tag) for the pool. Only alphanumeric characters, hyphens, and underscores are allowed.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public LoadBalancingPool notificationEmail(String notificationEmail) {
    this.notificationEmail = notificationEmail;
    return this;
  }

   /**
   * This field is now deprecated. It has been moved to Cloudflare&#39;s Centralized Notification service https://developers.cloudflare.com/fundamentals/notifications/. The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
   * @return notificationEmail
  **/
  @javax.annotation.Nullable
  public String getNotificationEmail() {
    return notificationEmail;
  }

  public void setNotificationEmail(String notificationEmail) {
    this.notificationEmail = notificationEmail;
  }


  public LoadBalancingPool notificationFilter(LoadBalancingNotificationFilter notificationFilter) {
    this.notificationFilter = notificationFilter;
    return this;
  }

   /**
   * Get notificationFilter
   * @return notificationFilter
  **/
  @javax.annotation.Nullable
  public LoadBalancingNotificationFilter getNotificationFilter() {
    return notificationFilter;
  }

  public void setNotificationFilter(LoadBalancingNotificationFilter notificationFilter) {
    this.notificationFilter = notificationFilter;
  }


  public LoadBalancingPool originSteering(LoadBalancingOriginSteering originSteering) {
    this.originSteering = originSteering;
    return this;
  }

   /**
   * Get originSteering
   * @return originSteering
  **/
  @javax.annotation.Nullable
  public LoadBalancingOriginSteering getOriginSteering() {
    return originSteering;
  }

  public void setOriginSteering(LoadBalancingOriginSteering originSteering) {
    this.originSteering = originSteering;
  }


  public LoadBalancingPool origins(List<LoadBalancingOrigin> origins) {
    this.origins = origins;
    return this;
  }

  public LoadBalancingPool addOriginsItem(LoadBalancingOrigin originsItem) {
    if (this.origins == null) {
      this.origins = new ArrayList<>();
    }
    this.origins.add(originsItem);
    return this;
  }

   /**
   * The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
   * @return origins
  **/
  @javax.annotation.Nullable
  public List<LoadBalancingOrigin> getOrigins() {
    return origins;
  }

  public void setOrigins(List<LoadBalancingOrigin> origins) {
    this.origins = origins;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadBalancingPool loadBalancingPool = (LoadBalancingPool) o;
    return Objects.equals(this.checkRegions, loadBalancingPool.checkRegions) &&
        Objects.equals(this.createdOn, loadBalancingPool.createdOn) &&
        Objects.equals(this.description, loadBalancingPool.description) &&
        Objects.equals(this.disabledAt, loadBalancingPool.disabledAt) &&
        Objects.equals(this.enabled, loadBalancingPool.enabled) &&
        Objects.equals(this.id, loadBalancingPool.id) &&
        Objects.equals(this.latitude, loadBalancingPool.latitude) &&
        Objects.equals(this.loadShedding, loadBalancingPool.loadShedding) &&
        Objects.equals(this.longitude, loadBalancingPool.longitude) &&
        Objects.equals(this.minimumOrigins, loadBalancingPool.minimumOrigins) &&
        Objects.equals(this.modifiedOn, loadBalancingPool.modifiedOn) &&
        Objects.equals(this.monitor, loadBalancingPool.monitor) &&
        Objects.equals(this.name, loadBalancingPool.name) &&
        Objects.equals(this.notificationEmail, loadBalancingPool.notificationEmail) &&
        Objects.equals(this.notificationFilter, loadBalancingPool.notificationFilter) &&
        Objects.equals(this.originSteering, loadBalancingPool.originSteering) &&
        Objects.equals(this.origins, loadBalancingPool.origins);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkRegions, createdOn, description, disabledAt, enabled, id, latitude, loadShedding, longitude, minimumOrigins, modifiedOn, monitor, name, notificationEmail, notificationFilter, originSteering, origins);
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
    sb.append("class LoadBalancingPool {\n");
    sb.append("    checkRegions: ").append(toIndentedString(checkRegions)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disabledAt: ").append(toIndentedString(disabledAt)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    loadShedding: ").append(toIndentedString(loadShedding)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    minimumOrigins: ").append(toIndentedString(minimumOrigins)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationEmail: ").append(toIndentedString(notificationEmail)).append("\n");
    sb.append("    notificationFilter: ").append(toIndentedString(notificationFilter)).append("\n");
    sb.append("    originSteering: ").append(toIndentedString(originSteering)).append("\n");
    sb.append("    origins: ").append(toIndentedString(origins)).append("\n");
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
    openapiFields.add("check_regions");
    openapiFields.add("created_on");
    openapiFields.add("description");
    openapiFields.add("disabled_at");
    openapiFields.add("enabled");
    openapiFields.add("id");
    openapiFields.add("latitude");
    openapiFields.add("load_shedding");
    openapiFields.add("longitude");
    openapiFields.add("minimum_origins");
    openapiFields.add("modified_on");
    openapiFields.add("monitor");
    openapiFields.add("name");
    openapiFields.add("notification_email");
    openapiFields.add("notification_filter");
    openapiFields.add("origin_steering");
    openapiFields.add("origins");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoadBalancingPool
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoadBalancingPool.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoadBalancingPool is not found in the empty JSON string", LoadBalancingPool.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoadBalancingPool.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoadBalancingPool` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("check_regions") != null && !jsonObj.get("check_regions").isJsonNull() && !jsonObj.get("check_regions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `check_regions` to be an array in the JSON string but got `%s`", jsonObj.get("check_regions").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `load_shedding`
      if (jsonObj.get("load_shedding") != null && !jsonObj.get("load_shedding").isJsonNull()) {
        LoadBalancingLoadShedding.validateJsonElement(jsonObj.get("load_shedding"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("notification_email") != null && !jsonObj.get("notification_email").isJsonNull()) && !jsonObj.get("notification_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notification_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notification_email").toString()));
      }
      // validate the optional field `notification_filter`
      if (jsonObj.get("notification_filter") != null && !jsonObj.get("notification_filter").isJsonNull()) {
        LoadBalancingNotificationFilter.validateJsonElement(jsonObj.get("notification_filter"));
      }
      // validate the optional field `origin_steering`
      if (jsonObj.get("origin_steering") != null && !jsonObj.get("origin_steering").isJsonNull()) {
        LoadBalancingOriginSteering.validateJsonElement(jsonObj.get("origin_steering"));
      }
      if (jsonObj.get("origins") != null && !jsonObj.get("origins").isJsonNull()) {
        JsonArray jsonArrayorigins = jsonObj.getAsJsonArray("origins");
        if (jsonArrayorigins != null) {
          // ensure the json data is an array
          if (!jsonObj.get("origins").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `origins` to be an array in the JSON string but got `%s`", jsonObj.get("origins").toString()));
          }

          // validate the optional field `origins` (array)
          for (int i = 0; i < jsonArrayorigins.size(); i++) {
            LoadBalancingOrigin.validateJsonElement(jsonArrayorigins.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoadBalancingPool.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoadBalancingPool' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoadBalancingPool> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoadBalancingPool.class));

       return (TypeAdapter<T>) new TypeAdapter<LoadBalancingPool>() {
           @Override
           public void write(JsonWriter out, LoadBalancingPool value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoadBalancingPool read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoadBalancingPool given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoadBalancingPool
  * @throws IOException if the JSON string is invalid with respect to LoadBalancingPool
  */
  public static LoadBalancingPool fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoadBalancingPool.class);
  }

 /**
  * Convert an instance of LoadBalancingPool to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
