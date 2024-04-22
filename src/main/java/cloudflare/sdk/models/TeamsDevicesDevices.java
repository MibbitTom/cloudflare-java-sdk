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
import cloudflare.sdk.models.TeamsDevicesPlatform;
import cloudflare.sdk.models.TeamsDevicesUser;
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
 * TeamsDevicesDevices
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TeamsDevicesDevices {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_DEVICE_TYPE = "device_type";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
  private TeamsDevicesPlatform deviceType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_LAST_SEEN = "last_seen";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN)
  private OffsetDateTime lastSeen;

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_MANUFACTURER = "manufacturer";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER)
  private String manufacturer;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OS_DISTRO_NAME = "os_distro_name";
  @SerializedName(SERIALIZED_NAME_OS_DISTRO_NAME)
  private String osDistroName;

  public static final String SERIALIZED_NAME_OS_DISTRO_REVISION = "os_distro_revision";
  @SerializedName(SERIALIZED_NAME_OS_DISTRO_REVISION)
  private String osDistroRevision;

  public static final String SERIALIZED_NAME_OS_VERSION = "os_version";
  @SerializedName(SERIALIZED_NAME_OS_VERSION)
  private String osVersion;

  public static final String SERIALIZED_NAME_OS_VERSION_EXTRA = "os_version_extra";
  @SerializedName(SERIALIZED_NAME_OS_VERSION_EXTRA)
  private String osVersionExtra;

  public static final String SERIALIZED_NAME_REVOKED_AT = "revoked_at";
  @SerializedName(SERIALIZED_NAME_REVOKED_AT)
  private OffsetDateTime revokedAt;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serial_number";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private TeamsDevicesUser user;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public TeamsDevicesDevices() {
  }

  public TeamsDevicesDevices created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * When the device was created.
   * @return created
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public TeamsDevicesDevices deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * True if the device was deleted.
   * @return deleted
  **/
  @javax.annotation.Nullable
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public TeamsDevicesDevices deviceType(TeamsDevicesPlatform deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @javax.annotation.Nullable
  public TeamsDevicesPlatform getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(TeamsDevicesPlatform deviceType) {
    this.deviceType = deviceType;
  }


  public TeamsDevicesDevices id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Device ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public TeamsDevicesDevices ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * IPv4 or IPv6 address.
   * @return ip
  **/
  @javax.annotation.Nullable
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public TeamsDevicesDevices key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The device&#39;s public key.
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public TeamsDevicesDevices lastSeen(OffsetDateTime lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * When the device last connected to Cloudflare services.
   * @return lastSeen
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(OffsetDateTime lastSeen) {
    this.lastSeen = lastSeen;
  }


  public TeamsDevicesDevices macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * The device mac address.
   * @return macAddress
  **/
  @javax.annotation.Nullable
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public TeamsDevicesDevices manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * The device manufacturer name.
   * @return manufacturer
  **/
  @javax.annotation.Nullable
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  public TeamsDevicesDevices model(String model) {
    this.model = model;
    return this;
  }

   /**
   * The device model name.
   * @return model
  **/
  @javax.annotation.Nullable
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public TeamsDevicesDevices name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The device name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TeamsDevicesDevices osDistroName(String osDistroName) {
    this.osDistroName = osDistroName;
    return this;
  }

   /**
   * The Linux distro name.
   * @return osDistroName
  **/
  @javax.annotation.Nullable
  public String getOsDistroName() {
    return osDistroName;
  }

  public void setOsDistroName(String osDistroName) {
    this.osDistroName = osDistroName;
  }


  public TeamsDevicesDevices osDistroRevision(String osDistroRevision) {
    this.osDistroRevision = osDistroRevision;
    return this;
  }

   /**
   * The Linux distro revision.
   * @return osDistroRevision
  **/
  @javax.annotation.Nullable
  public String getOsDistroRevision() {
    return osDistroRevision;
  }

  public void setOsDistroRevision(String osDistroRevision) {
    this.osDistroRevision = osDistroRevision;
  }


  public TeamsDevicesDevices osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

   /**
   * The operating system version.
   * @return osVersion
  **/
  @javax.annotation.Nullable
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  public TeamsDevicesDevices osVersionExtra(String osVersionExtra) {
    this.osVersionExtra = osVersionExtra;
    return this;
  }

   /**
   * The operating system version extra parameter.
   * @return osVersionExtra
  **/
  @javax.annotation.Nullable
  public String getOsVersionExtra() {
    return osVersionExtra;
  }

  public void setOsVersionExtra(String osVersionExtra) {
    this.osVersionExtra = osVersionExtra;
  }


  public TeamsDevicesDevices revokedAt(OffsetDateTime revokedAt) {
    this.revokedAt = revokedAt;
    return this;
  }

   /**
   * When the device was revoked.
   * @return revokedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getRevokedAt() {
    return revokedAt;
  }

  public void setRevokedAt(OffsetDateTime revokedAt) {
    this.revokedAt = revokedAt;
  }


  public TeamsDevicesDevices serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * The device serial number.
   * @return serialNumber
  **/
  @javax.annotation.Nullable
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public TeamsDevicesDevices updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * When the device was updated.
   * @return updated
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  public TeamsDevicesDevices user(TeamsDevicesUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  public TeamsDevicesUser getUser() {
    return user;
  }

  public void setUser(TeamsDevicesUser user) {
    this.user = user;
  }


  public TeamsDevicesDevices version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The WARP client version.
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamsDevicesDevices teamsDevicesDevices = (TeamsDevicesDevices) o;
    return Objects.equals(this.created, teamsDevicesDevices.created) &&
        Objects.equals(this.deleted, teamsDevicesDevices.deleted) &&
        Objects.equals(this.deviceType, teamsDevicesDevices.deviceType) &&
        Objects.equals(this.id, teamsDevicesDevices.id) &&
        Objects.equals(this.ip, teamsDevicesDevices.ip) &&
        Objects.equals(this.key, teamsDevicesDevices.key) &&
        Objects.equals(this.lastSeen, teamsDevicesDevices.lastSeen) &&
        Objects.equals(this.macAddress, teamsDevicesDevices.macAddress) &&
        Objects.equals(this.manufacturer, teamsDevicesDevices.manufacturer) &&
        Objects.equals(this.model, teamsDevicesDevices.model) &&
        Objects.equals(this.name, teamsDevicesDevices.name) &&
        Objects.equals(this.osDistroName, teamsDevicesDevices.osDistroName) &&
        Objects.equals(this.osDistroRevision, teamsDevicesDevices.osDistroRevision) &&
        Objects.equals(this.osVersion, teamsDevicesDevices.osVersion) &&
        Objects.equals(this.osVersionExtra, teamsDevicesDevices.osVersionExtra) &&
        Objects.equals(this.revokedAt, teamsDevicesDevices.revokedAt) &&
        Objects.equals(this.serialNumber, teamsDevicesDevices.serialNumber) &&
        Objects.equals(this.updated, teamsDevicesDevices.updated) &&
        Objects.equals(this.user, teamsDevicesDevices.user) &&
        Objects.equals(this.version, teamsDevicesDevices.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, deleted, deviceType, id, ip, key, lastSeen, macAddress, manufacturer, model, name, osDistroName, osDistroRevision, osVersion, osVersionExtra, revokedAt, serialNumber, updated, user, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsDevicesDevices {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    osDistroName: ").append(toIndentedString(osDistroName)).append("\n");
    sb.append("    osDistroRevision: ").append(toIndentedString(osDistroRevision)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    osVersionExtra: ").append(toIndentedString(osVersionExtra)).append("\n");
    sb.append("    revokedAt: ").append(toIndentedString(revokedAt)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("created");
    openapiFields.add("deleted");
    openapiFields.add("device_type");
    openapiFields.add("id");
    openapiFields.add("ip");
    openapiFields.add("key");
    openapiFields.add("last_seen");
    openapiFields.add("mac_address");
    openapiFields.add("manufacturer");
    openapiFields.add("model");
    openapiFields.add("name");
    openapiFields.add("os_distro_name");
    openapiFields.add("os_distro_revision");
    openapiFields.add("os_version");
    openapiFields.add("os_version_extra");
    openapiFields.add("revoked_at");
    openapiFields.add("serial_number");
    openapiFields.add("updated");
    openapiFields.add("user");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TeamsDevicesDevices
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TeamsDevicesDevices.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TeamsDevicesDevices is not found in the empty JSON string", TeamsDevicesDevices.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TeamsDevicesDevices.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TeamsDevicesDevices` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `device_type`
      if (jsonObj.get("device_type") != null && !jsonObj.get("device_type").isJsonNull()) {
        TeamsDevicesPlatform.validateJsonElement(jsonObj.get("device_type"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("ip") != null && !jsonObj.get("ip").isJsonNull()) && !jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("mac_address") != null && !jsonObj.get("mac_address").isJsonNull()) && !jsonObj.get("mac_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mac_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mac_address").toString()));
      }
      if ((jsonObj.get("manufacturer") != null && !jsonObj.get("manufacturer").isJsonNull()) && !jsonObj.get("manufacturer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manufacturer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manufacturer").toString()));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("os_distro_name") != null && !jsonObj.get("os_distro_name").isJsonNull()) && !jsonObj.get("os_distro_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os_distro_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os_distro_name").toString()));
      }
      if ((jsonObj.get("os_distro_revision") != null && !jsonObj.get("os_distro_revision").isJsonNull()) && !jsonObj.get("os_distro_revision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os_distro_revision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os_distro_revision").toString()));
      }
      if ((jsonObj.get("os_version") != null && !jsonObj.get("os_version").isJsonNull()) && !jsonObj.get("os_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os_version").toString()));
      }
      if ((jsonObj.get("os_version_extra") != null && !jsonObj.get("os_version_extra").isJsonNull()) && !jsonObj.get("os_version_extra").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os_version_extra` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os_version_extra").toString()));
      }
      if ((jsonObj.get("serial_number") != null && !jsonObj.get("serial_number").isJsonNull()) && !jsonObj.get("serial_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serial_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serial_number").toString()));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        TeamsDevicesUser.validateJsonElement(jsonObj.get("user"));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TeamsDevicesDevices.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TeamsDevicesDevices' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TeamsDevicesDevices> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TeamsDevicesDevices.class));

       return (TypeAdapter<T>) new TypeAdapter<TeamsDevicesDevices>() {
           @Override
           public void write(JsonWriter out, TeamsDevicesDevices value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TeamsDevicesDevices read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TeamsDevicesDevices given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TeamsDevicesDevices
  * @throws IOException if the JSON string is invalid with respect to TeamsDevicesDevices
  */
  public static TeamsDevicesDevices fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TeamsDevicesDevices.class);
  }

 /**
  * Convert an instance of TeamsDevicesDevices to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

