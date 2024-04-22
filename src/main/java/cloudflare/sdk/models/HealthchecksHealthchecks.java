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
import cloudflare.sdk.models.HealthchecksHttpConfig;
import cloudflare.sdk.models.HealthchecksStatus;
import cloudflare.sdk.models.HealthchecksTcpConfig;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

import cloudflare.JSON;

/**
 * HealthchecksHealthchecks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class HealthchecksHealthchecks {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  /**
   * WNAM: Western North America, ENAM: Eastern North America, WEU: Western Europe, EEU: Eastern Europe, NSAM: Northern South America, SSAM: Southern South America, OC: Oceania, ME: Middle East, NAF: North Africa, SAF: South Africa, IN: India, SEAS: South East Asia, NEAS: North East Asia, ALL_REGIONS: all regions (BUSINESS and ENTERPRISE customers only).
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
    
    IN("IN"),
    
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

  public static final String SERIALIZED_NAME_CONSECUTIVE_FAILS = "consecutive_fails";
  @SerializedName(SERIALIZED_NAME_CONSECUTIVE_FAILS)
  private Integer consecutiveFails = 1;

  public static final String SERIALIZED_NAME_CONSECUTIVE_SUCCESSES = "consecutive_successes";
  @SerializedName(SERIALIZED_NAME_CONSECUTIVE_SUCCESSES)
  private Integer consecutiveSuccesses = 1;

  public static final String SERIALIZED_NAME_CREATED_ON = "created_on";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public static final String SERIALIZED_NAME_HTTP_CONFIG = "http_config";
  @SerializedName(SERIALIZED_NAME_HTTP_CONFIG)
  private HealthchecksHttpConfig httpConfig;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private Integer interval = 60;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modified_on";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  private Integer retries = 2;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private HealthchecksStatus status;

  public static final String SERIALIZED_NAME_SUSPENDED = "suspended";
  @SerializedName(SERIALIZED_NAME_SUSPENDED)
  private Boolean suspended = false;

  public static final String SERIALIZED_NAME_TCP_CONFIG = "tcp_config";
  @SerializedName(SERIALIZED_NAME_TCP_CONFIG)
  private HealthchecksTcpConfig tcpConfig;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout = 5;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = "HTTP";

  public HealthchecksHealthchecks() {
  }

  public HealthchecksHealthchecks(
     OffsetDateTime createdOn, 
     String failureReason, 
     String id, 
     OffsetDateTime modifiedOn
  ) {
    this();
    this.createdOn = createdOn;
    this.failureReason = failureReason;
    this.id = id;
    this.modifiedOn = modifiedOn;
  }

  public HealthchecksHealthchecks address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The hostname or IP address of the origin server to run health checks on.
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public HealthchecksHealthchecks checkRegions(List<CheckRegionsEnum> checkRegions) {
    this.checkRegions = checkRegions;
    return this;
  }

  public HealthchecksHealthchecks addCheckRegionsItem(CheckRegionsEnum checkRegionsItem) {
    if (this.checkRegions == null) {
      this.checkRegions = new ArrayList<>();
    }
    this.checkRegions.add(checkRegionsItem);
    return this;
  }

   /**
   * A list of regions from which to run health checks. Null means Cloudflare will pick a default region.
   * @return checkRegions
  **/
  @javax.annotation.Nullable
  public List<CheckRegionsEnum> getCheckRegions() {
    return checkRegions;
  }

  public void setCheckRegions(List<CheckRegionsEnum> checkRegions) {
    this.checkRegions = checkRegions;
  }


  public HealthchecksHealthchecks consecutiveFails(Integer consecutiveFails) {
    this.consecutiveFails = consecutiveFails;
    return this;
  }

   /**
   * The number of consecutive fails required from a health check before changing the health to unhealthy.
   * @return consecutiveFails
  **/
  @javax.annotation.Nullable
  public Integer getConsecutiveFails() {
    return consecutiveFails;
  }

  public void setConsecutiveFails(Integer consecutiveFails) {
    this.consecutiveFails = consecutiveFails;
  }


  public HealthchecksHealthchecks consecutiveSuccesses(Integer consecutiveSuccesses) {
    this.consecutiveSuccesses = consecutiveSuccesses;
    return this;
  }

   /**
   * The number of consecutive successes required from a health check before changing the health to healthy.
   * @return consecutiveSuccesses
  **/
  @javax.annotation.Nullable
  public Integer getConsecutiveSuccesses() {
    return consecutiveSuccesses;
  }

  public void setConsecutiveSuccesses(Integer consecutiveSuccesses) {
    this.consecutiveSuccesses = consecutiveSuccesses;
  }


   /**
   * Get createdOn
   * @return createdOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  public HealthchecksHealthchecks description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human-readable description of the health check.
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
   * The current failure reason if status is unhealthy.
   * @return failureReason
  **/
  @javax.annotation.Nullable
  public String getFailureReason() {
    return failureReason;
  }



  public HealthchecksHealthchecks httpConfig(HealthchecksHttpConfig httpConfig) {
    this.httpConfig = httpConfig;
    return this;
  }

   /**
   * Get httpConfig
   * @return httpConfig
  **/
  @javax.annotation.Nullable
  public HealthchecksHttpConfig getHttpConfig() {
    return httpConfig;
  }

  public void setHttpConfig(HealthchecksHttpConfig httpConfig) {
    this.httpConfig = httpConfig;
  }


   /**
   * Identifier
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public HealthchecksHealthchecks interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase load on the origin as we check from multiple locations.
   * @return interval
  **/
  @javax.annotation.Nullable
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }


   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }



  public HealthchecksHealthchecks name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A short name to identify the health check. Only alphanumeric characters, hyphens and underscores are allowed.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public HealthchecksHealthchecks retries(Integer retries) {
    this.retries = retries;
    return this;
  }

   /**
   * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately.
   * @return retries
  **/
  @javax.annotation.Nullable
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }


  public HealthchecksHealthchecks status(HealthchecksStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public HealthchecksStatus getStatus() {
    return status;
  }

  public void setStatus(HealthchecksStatus status) {
    this.status = status;
  }


  public HealthchecksHealthchecks suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

   /**
   * If suspended, no health checks are sent to the origin.
   * @return suspended
  **/
  @javax.annotation.Nullable
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }


  public HealthchecksHealthchecks tcpConfig(HealthchecksTcpConfig tcpConfig) {
    this.tcpConfig = tcpConfig;
    return this;
  }

   /**
   * Get tcpConfig
   * @return tcpConfig
  **/
  @javax.annotation.Nullable
  public HealthchecksTcpConfig getTcpConfig() {
    return tcpConfig;
  }

  public void setTcpConfig(HealthchecksTcpConfig tcpConfig) {
    this.tcpConfig = tcpConfig;
  }


  public HealthchecksHealthchecks timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * The timeout (in seconds) before marking the health check as failed.
   * @return timeout
  **/
  @javax.annotation.Nullable
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  public HealthchecksHealthchecks type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The protocol to use for the health check. Currently supported protocols are &#39;HTTP&#39;, &#39;HTTPS&#39; and &#39;TCP&#39;.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
    HealthchecksHealthchecks healthchecksHealthchecks = (HealthchecksHealthchecks) o;
    return Objects.equals(this.address, healthchecksHealthchecks.address) &&
        Objects.equals(this.checkRegions, healthchecksHealthchecks.checkRegions) &&
        Objects.equals(this.consecutiveFails, healthchecksHealthchecks.consecutiveFails) &&
        Objects.equals(this.consecutiveSuccesses, healthchecksHealthchecks.consecutiveSuccesses) &&
        Objects.equals(this.createdOn, healthchecksHealthchecks.createdOn) &&
        Objects.equals(this.description, healthchecksHealthchecks.description) &&
        Objects.equals(this.failureReason, healthchecksHealthchecks.failureReason) &&
        Objects.equals(this.httpConfig, healthchecksHealthchecks.httpConfig) &&
        Objects.equals(this.id, healthchecksHealthchecks.id) &&
        Objects.equals(this.interval, healthchecksHealthchecks.interval) &&
        Objects.equals(this.modifiedOn, healthchecksHealthchecks.modifiedOn) &&
        Objects.equals(this.name, healthchecksHealthchecks.name) &&
        Objects.equals(this.retries, healthchecksHealthchecks.retries) &&
        Objects.equals(this.status, healthchecksHealthchecks.status) &&
        Objects.equals(this.suspended, healthchecksHealthchecks.suspended) &&
        Objects.equals(this.tcpConfig, healthchecksHealthchecks.tcpConfig) &&
        Objects.equals(this.timeout, healthchecksHealthchecks.timeout) &&
        Objects.equals(this.type, healthchecksHealthchecks.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, checkRegions, consecutiveFails, consecutiveSuccesses, createdOn, description, failureReason, httpConfig, id, interval, modifiedOn, name, retries, status, suspended, tcpConfig, timeout, type);
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
    sb.append("class HealthchecksHealthchecks {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    checkRegions: ").append(toIndentedString(checkRegions)).append("\n");
    sb.append("    consecutiveFails: ").append(toIndentedString(consecutiveFails)).append("\n");
    sb.append("    consecutiveSuccesses: ").append(toIndentedString(consecutiveSuccesses)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    httpConfig: ").append(toIndentedString(httpConfig)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    tcpConfig: ").append(toIndentedString(tcpConfig)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("check_regions");
    openapiFields.add("consecutive_fails");
    openapiFields.add("consecutive_successes");
    openapiFields.add("created_on");
    openapiFields.add("description");
    openapiFields.add("failure_reason");
    openapiFields.add("http_config");
    openapiFields.add("id");
    openapiFields.add("interval");
    openapiFields.add("modified_on");
    openapiFields.add("name");
    openapiFields.add("retries");
    openapiFields.add("status");
    openapiFields.add("suspended");
    openapiFields.add("tcp_config");
    openapiFields.add("timeout");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to HealthchecksHealthchecks
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HealthchecksHealthchecks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HealthchecksHealthchecks is not found in the empty JSON string", HealthchecksHealthchecks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HealthchecksHealthchecks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HealthchecksHealthchecks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("check_regions") != null && !jsonObj.get("check_regions").isJsonNull() && !jsonObj.get("check_regions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `check_regions` to be an array in the JSON string but got `%s`", jsonObj.get("check_regions").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("failure_reason") != null && !jsonObj.get("failure_reason").isJsonNull()) && !jsonObj.get("failure_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failure_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failure_reason").toString()));
      }
      // validate the optional field `http_config`
      if (jsonObj.get("http_config") != null && !jsonObj.get("http_config").isJsonNull()) {
        HealthchecksHttpConfig.validateJsonElement(jsonObj.get("http_config"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        HealthchecksStatus.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `tcp_config`
      if (jsonObj.get("tcp_config") != null && !jsonObj.get("tcp_config").isJsonNull()) {
        HealthchecksTcpConfig.validateJsonElement(jsonObj.get("tcp_config"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HealthchecksHealthchecks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HealthchecksHealthchecks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HealthchecksHealthchecks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HealthchecksHealthchecks.class));

       return (TypeAdapter<T>) new TypeAdapter<HealthchecksHealthchecks>() {
           @Override
           public void write(JsonWriter out, HealthchecksHealthchecks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HealthchecksHealthchecks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HealthchecksHealthchecks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HealthchecksHealthchecks
  * @throws IOException if the JSON string is invalid with respect to HealthchecksHealthchecks
  */
  public static HealthchecksHealthchecks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HealthchecksHealthchecks.class);
  }

 /**
  * Convert an instance of HealthchecksHealthchecks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
