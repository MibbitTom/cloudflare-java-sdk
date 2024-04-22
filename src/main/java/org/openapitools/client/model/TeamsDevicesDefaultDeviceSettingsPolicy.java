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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.TeamsDevicesFallbackDomain;
import org.openapitools.client.model.TeamsDevicesServiceModeV2;
import org.openapitools.client.model.TeamsDevicesSplitTunnel;
import org.openapitools.client.model.TeamsDevicesSplitTunnelInclude;

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
 * TeamsDevicesDefaultDeviceSettingsPolicy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TeamsDevicesDefaultDeviceSettingsPolicy {
  public static final String SERIALIZED_NAME_ALLOW_MODE_SWITCH = "allow_mode_switch";
  @SerializedName(SERIALIZED_NAME_ALLOW_MODE_SWITCH)
  private Boolean allowModeSwitch;

  public static final String SERIALIZED_NAME_ALLOW_UPDATES = "allow_updates";
  @SerializedName(SERIALIZED_NAME_ALLOW_UPDATES)
  private Boolean allowUpdates;

  public static final String SERIALIZED_NAME_ALLOWED_TO_LEAVE = "allowed_to_leave";
  @SerializedName(SERIALIZED_NAME_ALLOWED_TO_LEAVE)
  private Boolean allowedToLeave;

  public static final String SERIALIZED_NAME_AUTO_CONNECT = "auto_connect";
  @SerializedName(SERIALIZED_NAME_AUTO_CONNECT)
  private BigDecimal autoConnect;

  public static final String SERIALIZED_NAME_CAPTIVE_PORTAL = "captive_portal";
  @SerializedName(SERIALIZED_NAME_CAPTIVE_PORTAL)
  private BigDecimal captivePortal;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public static final String SERIALIZED_NAME_DISABLE_AUTO_FALLBACK = "disable_auto_fallback";
  @SerializedName(SERIALIZED_NAME_DISABLE_AUTO_FALLBACK)
  private Boolean disableAutoFallback;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_EXCLUDE = "exclude";
  @SerializedName(SERIALIZED_NAME_EXCLUDE)
  private List<TeamsDevicesSplitTunnel> exclude = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXCLUDE_OFFICE_IPS = "exclude_office_ips";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_OFFICE_IPS)
  private Boolean excludeOfficeIps;

  public static final String SERIALIZED_NAME_FALLBACK_DOMAINS = "fallback_domains";
  @SerializedName(SERIALIZED_NAME_FALLBACK_DOMAINS)
  private List<TeamsDevicesFallbackDomain> fallbackDomains = new ArrayList<>();

  public static final String SERIALIZED_NAME_GATEWAY_UNIQUE_ID = "gateway_unique_id";
  @SerializedName(SERIALIZED_NAME_GATEWAY_UNIQUE_ID)
  private String gatewayUniqueId;

  public static final String SERIALIZED_NAME_INCLUDE = "include";
  @SerializedName(SERIALIZED_NAME_INCLUDE)
  private List<TeamsDevicesSplitTunnelInclude> include = new ArrayList<>();

  public static final String SERIALIZED_NAME_SERVICE_MODE_V2 = "service_mode_v2";
  @SerializedName(SERIALIZED_NAME_SERVICE_MODE_V2)
  private TeamsDevicesServiceModeV2 serviceModeV2;

  public static final String SERIALIZED_NAME_SUPPORT_URL = "support_url";
  @SerializedName(SERIALIZED_NAME_SUPPORT_URL)
  private String supportUrl;

  public static final String SERIALIZED_NAME_SWITCH_LOCKED = "switch_locked";
  @SerializedName(SERIALIZED_NAME_SWITCH_LOCKED)
  private Boolean switchLocked;

  public TeamsDevicesDefaultDeviceSettingsPolicy() {
  }

  public TeamsDevicesDefaultDeviceSettingsPolicy allowModeSwitch(Boolean allowModeSwitch) {
    this.allowModeSwitch = allowModeSwitch;
    return this;
  }

   /**
   * Whether to allow the user to switch WARP between modes.
   * @return allowModeSwitch
  **/
  @javax.annotation.Nullable
  public Boolean getAllowModeSwitch() {
    return allowModeSwitch;
  }

  public void setAllowModeSwitch(Boolean allowModeSwitch) {
    this.allowModeSwitch = allowModeSwitch;
  }


  public TeamsDevicesDefaultDeviceSettingsPolicy allowUpdates(Boolean allowUpdates) {
    this.allowUpdates = allowUpdates;
    return this;
  }

   /**
   * Whether to receive update notifications when a new version of the client is available.
   * @return allowUpdates
  **/
  @javax.annotation.Nullable
  public Boolean getAllowUpdates() {
    return allowUpdates;
  }

  public void setAllowUpdates(Boolean allowUpdates) {
    this.allowUpdates = allowUpdates;
  }


  public TeamsDevicesDefaultDeviceSettingsPolicy allowedToLeave(Boolean allowedToLeave) {
    this.allowedToLeave = allowedToLeave;
    return this;
  }

   /**
   * Whether to allow devices to leave the organization.
   * @return allowedToLeave
  **/
  @javax.annotation.Nullable
  public Boolean getAllowedToLeave() {
    return allowedToLeave;
  }

  public void setAllowedToLeave(Boolean allowedToLeave) {
    this.allowedToLeave = allowedToLeave;
  }


  public TeamsDevicesDefaultDeviceSettingsPolicy autoConnect(BigDecimal autoConnect) {
    this.autoConnect = autoConnect;
    return this;
  }

   /**
   * The amount of time in minutes to reconnect after having been disabled.
   * @return autoConnect
  **/
  @javax.annotation.Nullable
  public BigDecimal getAutoConnect() {
    return autoConnect;
  }

  public void setAutoConnect(BigDecimal autoConnect) {
    this.autoConnect = autoConnect;
  }


  public TeamsDevicesDefaultDeviceSettingsPolicy captivePortal(BigDecimal captivePortal) {
    this.captivePortal = captivePortal;
    return this;
  }

   /**
   * Turn on the captive portal after the specified amount of time.
   * @return captivePortal
  **/
  @javax.annotation.Nullable
  public BigDecimal getCaptivePortal() {
    return captivePortal;
  }

  public void setCaptivePortal(BigDecimal captivePortal) {
    this.captivePortal = captivePortal;
  }


  public TeamsDevicesDefaultDeviceSettingsPolicy _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Whether the policy will be applied to matching devices.
   * @return _default
  **/
  @javax.annotation.Nullable
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public TeamsDevicesDefaultDeviceSettingsPolicy disableAutoFallback(Boolean disableAutoFallback) {
    this.disableAutoFallback = disableAutoFallback;
    return this;
  }

   /**
   * If the &#x60;dns_server&#x60; field of a fallback domain is not present, the client will fall back to a best guess of the default/system DNS resolvers unless this policy option is set to &#x60;true&#x60;.
   * @return disableAutoFallback
  **/
  @javax.annotation.Nullable
  public Boolean getDisableAutoFallback() {
    return disableAutoFallback;
  }

  public void setDisableAutoFallback(Boolean disableAutoFallback) {
    this.disableAutoFallback = disableAutoFallback;
  }


  public TeamsDevicesDefaultDeviceSettingsPolicy enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the policy will be applied to matching devices.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public TeamsDevicesDefaultDeviceSettingsPolicy exclude(List<TeamsDevicesSplitTunnel> exclude) {
    this.exclude = exclude;
    return this;
  }

  public TeamsDevicesDefaultDeviceSettingsPolicy addExcludeItem(TeamsDevicesSplitTunnel excludeItem) {
    if (this.exclude == null) {
      this.exclude = new ArrayList<>();
    }
    this.exclude.add(excludeItem);
    return this;
  }

   /**
   * Get exclude
   * @return exclude
  **/
  @javax.annotation.Nullable
  public List<TeamsDevicesSplitTunnel> getExclude() {
    return exclude;
  }

  public void setExclude(List<TeamsDevicesSplitTunnel> exclude) {
    this.exclude = exclude;
  }


  public TeamsDevicesDefaultDeviceSettingsPolicy excludeOfficeIps(Boolean excludeOfficeIps) {
    this.excludeOfficeIps = excludeOfficeIps;
    return this;
  }

   /**
   * Whether to add Microsoft IPs to Split Tunnel exclusions.
   * @return excludeOfficeIps
  **/
  @javax.annotation.Nullable
  public Boolean getExcludeOfficeIps() {
    return excludeOfficeIps;
  }

  public void setExcludeOfficeIps(Boolean excludeOfficeIps) {
    this.excludeOfficeIps = excludeOfficeIps;
  }


  public TeamsDevicesDefaultDeviceSettingsPolicy fallbackDomains(List<TeamsDevicesFallbackDomain> fallbackDomains) {
    this.fallbackDomains = fallbackDomains;
    return this;
  }

  public TeamsDevicesDefaultDeviceSettingsPolicy addFallbackDomainsItem(TeamsDevicesFallbackDomain fallbackDomainsItem) {
    if (this.fallbackDomains == null) {
      this.fallbackDomains = new ArrayList<>();
    }
    this.fallbackDomains.add(fallbackDomainsItem);
    return this;
  }

   /**
   * Get fallbackDomains
   * @return fallbackDomains
  **/
  @javax.annotation.Nullable
  public List<TeamsDevicesFallbackDomain> getFallbackDomains() {
    return fallbackDomains;
  }

  public void setFallbackDomains(List<TeamsDevicesFallbackDomain> fallbackDomains) {
    this.fallbackDomains = fallbackDomains;
  }


  public TeamsDevicesDefaultDeviceSettingsPolicy gatewayUniqueId(String gatewayUniqueId) {
    this.gatewayUniqueId = gatewayUniqueId;
    return this;
  }

   /**
   * Get gatewayUniqueId
   * @return gatewayUniqueId
  **/
  @javax.annotation.Nullable
  public String getGatewayUniqueId() {
    return gatewayUniqueId;
  }

  public void setGatewayUniqueId(String gatewayUniqueId) {
    this.gatewayUniqueId = gatewayUniqueId;
  }


  public TeamsDevicesDefaultDeviceSettingsPolicy include(List<TeamsDevicesSplitTunnelInclude> include) {
    this.include = include;
    return this;
  }

  public TeamsDevicesDefaultDeviceSettingsPolicy addIncludeItem(TeamsDevicesSplitTunnelInclude includeItem) {
    if (this.include == null) {
      this.include = new ArrayList<>();
    }
    this.include.add(includeItem);
    return this;
  }

   /**
   * Get include
   * @return include
  **/
  @javax.annotation.Nullable
  public List<TeamsDevicesSplitTunnelInclude> getInclude() {
    return include;
  }

  public void setInclude(List<TeamsDevicesSplitTunnelInclude> include) {
    this.include = include;
  }


  public TeamsDevicesDefaultDeviceSettingsPolicy serviceModeV2(TeamsDevicesServiceModeV2 serviceModeV2) {
    this.serviceModeV2 = serviceModeV2;
    return this;
  }

   /**
   * Get serviceModeV2
   * @return serviceModeV2
  **/
  @javax.annotation.Nullable
  public TeamsDevicesServiceModeV2 getServiceModeV2() {
    return serviceModeV2;
  }

  public void setServiceModeV2(TeamsDevicesServiceModeV2 serviceModeV2) {
    this.serviceModeV2 = serviceModeV2;
  }


  public TeamsDevicesDefaultDeviceSettingsPolicy supportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
    return this;
  }

   /**
   * The URL to launch when the Send Feedback button is clicked.
   * @return supportUrl
  **/
  @javax.annotation.Nullable
  public String getSupportUrl() {
    return supportUrl;
  }

  public void setSupportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
  }


  public TeamsDevicesDefaultDeviceSettingsPolicy switchLocked(Boolean switchLocked) {
    this.switchLocked = switchLocked;
    return this;
  }

   /**
   * Whether to allow the user to turn off the WARP switch and disconnect the client.
   * @return switchLocked
  **/
  @javax.annotation.Nullable
  public Boolean getSwitchLocked() {
    return switchLocked;
  }

  public void setSwitchLocked(Boolean switchLocked) {
    this.switchLocked = switchLocked;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamsDevicesDefaultDeviceSettingsPolicy teamsDevicesDefaultDeviceSettingsPolicy = (TeamsDevicesDefaultDeviceSettingsPolicy) o;
    return Objects.equals(this.allowModeSwitch, teamsDevicesDefaultDeviceSettingsPolicy.allowModeSwitch) &&
        Objects.equals(this.allowUpdates, teamsDevicesDefaultDeviceSettingsPolicy.allowUpdates) &&
        Objects.equals(this.allowedToLeave, teamsDevicesDefaultDeviceSettingsPolicy.allowedToLeave) &&
        Objects.equals(this.autoConnect, teamsDevicesDefaultDeviceSettingsPolicy.autoConnect) &&
        Objects.equals(this.captivePortal, teamsDevicesDefaultDeviceSettingsPolicy.captivePortal) &&
        Objects.equals(this._default, teamsDevicesDefaultDeviceSettingsPolicy._default) &&
        Objects.equals(this.disableAutoFallback, teamsDevicesDefaultDeviceSettingsPolicy.disableAutoFallback) &&
        Objects.equals(this.enabled, teamsDevicesDefaultDeviceSettingsPolicy.enabled) &&
        Objects.equals(this.exclude, teamsDevicesDefaultDeviceSettingsPolicy.exclude) &&
        Objects.equals(this.excludeOfficeIps, teamsDevicesDefaultDeviceSettingsPolicy.excludeOfficeIps) &&
        Objects.equals(this.fallbackDomains, teamsDevicesDefaultDeviceSettingsPolicy.fallbackDomains) &&
        Objects.equals(this.gatewayUniqueId, teamsDevicesDefaultDeviceSettingsPolicy.gatewayUniqueId) &&
        Objects.equals(this.include, teamsDevicesDefaultDeviceSettingsPolicy.include) &&
        Objects.equals(this.serviceModeV2, teamsDevicesDefaultDeviceSettingsPolicy.serviceModeV2) &&
        Objects.equals(this.supportUrl, teamsDevicesDefaultDeviceSettingsPolicy.supportUrl) &&
        Objects.equals(this.switchLocked, teamsDevicesDefaultDeviceSettingsPolicy.switchLocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowModeSwitch, allowUpdates, allowedToLeave, autoConnect, captivePortal, _default, disableAutoFallback, enabled, exclude, excludeOfficeIps, fallbackDomains, gatewayUniqueId, include, serviceModeV2, supportUrl, switchLocked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsDevicesDefaultDeviceSettingsPolicy {\n");
    sb.append("    allowModeSwitch: ").append(toIndentedString(allowModeSwitch)).append("\n");
    sb.append("    allowUpdates: ").append(toIndentedString(allowUpdates)).append("\n");
    sb.append("    allowedToLeave: ").append(toIndentedString(allowedToLeave)).append("\n");
    sb.append("    autoConnect: ").append(toIndentedString(autoConnect)).append("\n");
    sb.append("    captivePortal: ").append(toIndentedString(captivePortal)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    disableAutoFallback: ").append(toIndentedString(disableAutoFallback)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    excludeOfficeIps: ").append(toIndentedString(excludeOfficeIps)).append("\n");
    sb.append("    fallbackDomains: ").append(toIndentedString(fallbackDomains)).append("\n");
    sb.append("    gatewayUniqueId: ").append(toIndentedString(gatewayUniqueId)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    serviceModeV2: ").append(toIndentedString(serviceModeV2)).append("\n");
    sb.append("    supportUrl: ").append(toIndentedString(supportUrl)).append("\n");
    sb.append("    switchLocked: ").append(toIndentedString(switchLocked)).append("\n");
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
    openapiFields.add("allow_mode_switch");
    openapiFields.add("allow_updates");
    openapiFields.add("allowed_to_leave");
    openapiFields.add("auto_connect");
    openapiFields.add("captive_portal");
    openapiFields.add("default");
    openapiFields.add("disable_auto_fallback");
    openapiFields.add("enabled");
    openapiFields.add("exclude");
    openapiFields.add("exclude_office_ips");
    openapiFields.add("fallback_domains");
    openapiFields.add("gateway_unique_id");
    openapiFields.add("include");
    openapiFields.add("service_mode_v2");
    openapiFields.add("support_url");
    openapiFields.add("switch_locked");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TeamsDevicesDefaultDeviceSettingsPolicy
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TeamsDevicesDefaultDeviceSettingsPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TeamsDevicesDefaultDeviceSettingsPolicy is not found in the empty JSON string", TeamsDevicesDefaultDeviceSettingsPolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TeamsDevicesDefaultDeviceSettingsPolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TeamsDevicesDefaultDeviceSettingsPolicy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("exclude") != null && !jsonObj.get("exclude").isJsonNull()) {
        JsonArray jsonArrayexclude = jsonObj.getAsJsonArray("exclude");
        if (jsonArrayexclude != null) {
          // ensure the json data is an array
          if (!jsonObj.get("exclude").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `exclude` to be an array in the JSON string but got `%s`", jsonObj.get("exclude").toString()));
          }

          // validate the optional field `exclude` (array)
          for (int i = 0; i < jsonArrayexclude.size(); i++) {
            TeamsDevicesSplitTunnel.validateJsonElement(jsonArrayexclude.get(i));
          };
        }
      }
      if (jsonObj.get("fallback_domains") != null && !jsonObj.get("fallback_domains").isJsonNull()) {
        JsonArray jsonArrayfallbackDomains = jsonObj.getAsJsonArray("fallback_domains");
        if (jsonArrayfallbackDomains != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fallback_domains").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fallback_domains` to be an array in the JSON string but got `%s`", jsonObj.get("fallback_domains").toString()));
          }

          // validate the optional field `fallback_domains` (array)
          for (int i = 0; i < jsonArrayfallbackDomains.size(); i++) {
            TeamsDevicesFallbackDomain.validateJsonElement(jsonArrayfallbackDomains.get(i));
          };
        }
      }
      if ((jsonObj.get("gateway_unique_id") != null && !jsonObj.get("gateway_unique_id").isJsonNull()) && !jsonObj.get("gateway_unique_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway_unique_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway_unique_id").toString()));
      }
      if (jsonObj.get("include") != null && !jsonObj.get("include").isJsonNull()) {
        JsonArray jsonArrayinclude = jsonObj.getAsJsonArray("include");
        if (jsonArrayinclude != null) {
          // ensure the json data is an array
          if (!jsonObj.get("include").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `include` to be an array in the JSON string but got `%s`", jsonObj.get("include").toString()));
          }

          // validate the optional field `include` (array)
          for (int i = 0; i < jsonArrayinclude.size(); i++) {
            TeamsDevicesSplitTunnelInclude.validateJsonElement(jsonArrayinclude.get(i));
          };
        }
      }
      // validate the optional field `service_mode_v2`
      if (jsonObj.get("service_mode_v2") != null && !jsonObj.get("service_mode_v2").isJsonNull()) {
        TeamsDevicesServiceModeV2.validateJsonElement(jsonObj.get("service_mode_v2"));
      }
      if ((jsonObj.get("support_url") != null && !jsonObj.get("support_url").isJsonNull()) && !jsonObj.get("support_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `support_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("support_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TeamsDevicesDefaultDeviceSettingsPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TeamsDevicesDefaultDeviceSettingsPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TeamsDevicesDefaultDeviceSettingsPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TeamsDevicesDefaultDeviceSettingsPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<TeamsDevicesDefaultDeviceSettingsPolicy>() {
           @Override
           public void write(JsonWriter out, TeamsDevicesDefaultDeviceSettingsPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TeamsDevicesDefaultDeviceSettingsPolicy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TeamsDevicesDefaultDeviceSettingsPolicy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TeamsDevicesDefaultDeviceSettingsPolicy
  * @throws IOException if the JSON string is invalid with respect to TeamsDevicesDefaultDeviceSettingsPolicy
  */
  public static TeamsDevicesDefaultDeviceSettingsPolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TeamsDevicesDefaultDeviceSettingsPolicy.class);
  }

 /**
  * Convert an instance of TeamsDevicesDefaultDeviceSettingsPolicy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

