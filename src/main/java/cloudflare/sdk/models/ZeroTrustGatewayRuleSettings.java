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
import cloudflare.sdk.models.ZeroTrustGatewayRuleSettingsAuditSsh;
import cloudflare.sdk.models.ZeroTrustGatewayRuleSettingsBisoAdminControls;
import cloudflare.sdk.models.ZeroTrustGatewayRuleSettingsCheckSession;
import cloudflare.sdk.models.ZeroTrustGatewayRuleSettingsDnsResolvers;
import cloudflare.sdk.models.ZeroTrustGatewayRuleSettingsEgress;
import cloudflare.sdk.models.ZeroTrustGatewayRuleSettingsL4override;
import cloudflare.sdk.models.ZeroTrustGatewayRuleSettingsNotificationSettings;
import cloudflare.sdk.models.ZeroTrustGatewayRuleSettingsPayloadLog;
import cloudflare.sdk.models.ZeroTrustGatewayRuleSettingsUntrustedCert;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Additional settings that modify the rule&#39;s action.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZeroTrustGatewayRuleSettings {
  public static final String SERIALIZED_NAME_ADD_HEADERS = "add_headers";
  @SerializedName(SERIALIZED_NAME_ADD_HEADERS)
  private Object addHeaders;

  public static final String SERIALIZED_NAME_ALLOW_CHILD_BYPASS = "allow_child_bypass";
  @SerializedName(SERIALIZED_NAME_ALLOW_CHILD_BYPASS)
  private Boolean allowChildBypass;

  public static final String SERIALIZED_NAME_AUDIT_SSH = "audit_ssh";
  @SerializedName(SERIALIZED_NAME_AUDIT_SSH)
  private ZeroTrustGatewayRuleSettingsAuditSsh auditSsh;

  public static final String SERIALIZED_NAME_BISO_ADMIN_CONTROLS = "biso_admin_controls";
  @SerializedName(SERIALIZED_NAME_BISO_ADMIN_CONTROLS)
  private ZeroTrustGatewayRuleSettingsBisoAdminControls bisoAdminControls;

  public static final String SERIALIZED_NAME_BLOCK_PAGE_ENABLED = "block_page_enabled";
  @SerializedName(SERIALIZED_NAME_BLOCK_PAGE_ENABLED)
  private Boolean blockPageEnabled;

  public static final String SERIALIZED_NAME_BLOCK_REASON = "block_reason";
  @SerializedName(SERIALIZED_NAME_BLOCK_REASON)
  private String blockReason;

  public static final String SERIALIZED_NAME_BYPASS_PARENT_RULE = "bypass_parent_rule";
  @SerializedName(SERIALIZED_NAME_BYPASS_PARENT_RULE)
  private Boolean bypassParentRule;

  public static final String SERIALIZED_NAME_CHECK_SESSION = "check_session";
  @SerializedName(SERIALIZED_NAME_CHECK_SESSION)
  private ZeroTrustGatewayRuleSettingsCheckSession checkSession;

  public static final String SERIALIZED_NAME_DNS_RESOLVERS = "dns_resolvers";
  @SerializedName(SERIALIZED_NAME_DNS_RESOLVERS)
  private ZeroTrustGatewayRuleSettingsDnsResolvers dnsResolvers;

  public static final String SERIALIZED_NAME_EGRESS = "egress";
  @SerializedName(SERIALIZED_NAME_EGRESS)
  private ZeroTrustGatewayRuleSettingsEgress egress;

  public static final String SERIALIZED_NAME_INSECURE_DISABLE_DNSSEC_VALIDATION = "insecure_disable_dnssec_validation";
  @SerializedName(SERIALIZED_NAME_INSECURE_DISABLE_DNSSEC_VALIDATION)
  private Boolean insecureDisableDnssecValidation;

  public static final String SERIALIZED_NAME_IP_CATEGORIES = "ip_categories";
  @SerializedName(SERIALIZED_NAME_IP_CATEGORIES)
  private Boolean ipCategories;

  public static final String SERIALIZED_NAME_IP_INDICATOR_FEEDS = "ip_indicator_feeds";
  @SerializedName(SERIALIZED_NAME_IP_INDICATOR_FEEDS)
  private Boolean ipIndicatorFeeds;

  public static final String SERIALIZED_NAME_L4OVERRIDE = "l4override";
  @SerializedName(SERIALIZED_NAME_L4OVERRIDE)
  private ZeroTrustGatewayRuleSettingsL4override l4override;

  public static final String SERIALIZED_NAME_NOTIFICATION_SETTINGS = "notification_settings";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_SETTINGS)
  private ZeroTrustGatewayRuleSettingsNotificationSettings notificationSettings;

  public static final String SERIALIZED_NAME_OVERRIDE_HOST = "override_host";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_HOST)
  private String overrideHost;

  public static final String SERIALIZED_NAME_OVERRIDE_IPS = "override_ips";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_IPS)
  private List<String> overrideIps = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYLOAD_LOG = "payload_log";
  @SerializedName(SERIALIZED_NAME_PAYLOAD_LOG)
  private ZeroTrustGatewayRuleSettingsPayloadLog payloadLog;

  public static final String SERIALIZED_NAME_RESOLVE_DNS_THROUGH_CLOUDFLARE = "resolve_dns_through_cloudflare";
  @SerializedName(SERIALIZED_NAME_RESOLVE_DNS_THROUGH_CLOUDFLARE)
  private Boolean resolveDnsThroughCloudflare;

  public static final String SERIALIZED_NAME_UNTRUSTED_CERT = "untrusted_cert";
  @SerializedName(SERIALIZED_NAME_UNTRUSTED_CERT)
  private ZeroTrustGatewayRuleSettingsUntrustedCert untrustedCert;

  public ZeroTrustGatewayRuleSettings() {
  }

  public ZeroTrustGatewayRuleSettings addHeaders(Object addHeaders) {
    this.addHeaders = addHeaders;
    return this;
  }

   /**
   * Add custom headers to allowed requests, in the form of key-value pairs. Keys are header names, pointing to an array with its header value(s).
   * @return addHeaders
  **/
  @javax.annotation.Nullable
  public Object getAddHeaders() {
    return addHeaders;
  }

  public void setAddHeaders(Object addHeaders) {
    this.addHeaders = addHeaders;
  }


  public ZeroTrustGatewayRuleSettings allowChildBypass(Boolean allowChildBypass) {
    this.allowChildBypass = allowChildBypass;
    return this;
  }

   /**
   * Set by parent MSP accounts to enable their children to bypass this rule.
   * @return allowChildBypass
  **/
  @javax.annotation.Nullable
  public Boolean getAllowChildBypass() {
    return allowChildBypass;
  }

  public void setAllowChildBypass(Boolean allowChildBypass) {
    this.allowChildBypass = allowChildBypass;
  }


  public ZeroTrustGatewayRuleSettings auditSsh(ZeroTrustGatewayRuleSettingsAuditSsh auditSsh) {
    this.auditSsh = auditSsh;
    return this;
  }

   /**
   * Get auditSsh
   * @return auditSsh
  **/
  @javax.annotation.Nullable
  public ZeroTrustGatewayRuleSettingsAuditSsh getAuditSsh() {
    return auditSsh;
  }

  public void setAuditSsh(ZeroTrustGatewayRuleSettingsAuditSsh auditSsh) {
    this.auditSsh = auditSsh;
  }


  public ZeroTrustGatewayRuleSettings bisoAdminControls(ZeroTrustGatewayRuleSettingsBisoAdminControls bisoAdminControls) {
    this.bisoAdminControls = bisoAdminControls;
    return this;
  }

   /**
   * Get bisoAdminControls
   * @return bisoAdminControls
  **/
  @javax.annotation.Nullable
  public ZeroTrustGatewayRuleSettingsBisoAdminControls getBisoAdminControls() {
    return bisoAdminControls;
  }

  public void setBisoAdminControls(ZeroTrustGatewayRuleSettingsBisoAdminControls bisoAdminControls) {
    this.bisoAdminControls = bisoAdminControls;
  }


  public ZeroTrustGatewayRuleSettings blockPageEnabled(Boolean blockPageEnabled) {
    this.blockPageEnabled = blockPageEnabled;
    return this;
  }

   /**
   * Enable the custom block page.
   * @return blockPageEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getBlockPageEnabled() {
    return blockPageEnabled;
  }

  public void setBlockPageEnabled(Boolean blockPageEnabled) {
    this.blockPageEnabled = blockPageEnabled;
  }


  public ZeroTrustGatewayRuleSettings blockReason(String blockReason) {
    this.blockReason = blockReason;
    return this;
  }

   /**
   * The text describing why this block occurred, displayed on the custom block page (if enabled).
   * @return blockReason
  **/
  @javax.annotation.Nullable
  public String getBlockReason() {
    return blockReason;
  }

  public void setBlockReason(String blockReason) {
    this.blockReason = blockReason;
  }


  public ZeroTrustGatewayRuleSettings bypassParentRule(Boolean bypassParentRule) {
    this.bypassParentRule = bypassParentRule;
    return this;
  }

   /**
   * Set by children MSP accounts to bypass their parent&#39;s rules.
   * @return bypassParentRule
  **/
  @javax.annotation.Nullable
  public Boolean getBypassParentRule() {
    return bypassParentRule;
  }

  public void setBypassParentRule(Boolean bypassParentRule) {
    this.bypassParentRule = bypassParentRule;
  }


  public ZeroTrustGatewayRuleSettings checkSession(ZeroTrustGatewayRuleSettingsCheckSession checkSession) {
    this.checkSession = checkSession;
    return this;
  }

   /**
   * Get checkSession
   * @return checkSession
  **/
  @javax.annotation.Nullable
  public ZeroTrustGatewayRuleSettingsCheckSession getCheckSession() {
    return checkSession;
  }

  public void setCheckSession(ZeroTrustGatewayRuleSettingsCheckSession checkSession) {
    this.checkSession = checkSession;
  }


  public ZeroTrustGatewayRuleSettings dnsResolvers(ZeroTrustGatewayRuleSettingsDnsResolvers dnsResolvers) {
    this.dnsResolvers = dnsResolvers;
    return this;
  }

   /**
   * Get dnsResolvers
   * @return dnsResolvers
  **/
  @javax.annotation.Nullable
  public ZeroTrustGatewayRuleSettingsDnsResolvers getDnsResolvers() {
    return dnsResolvers;
  }

  public void setDnsResolvers(ZeroTrustGatewayRuleSettingsDnsResolvers dnsResolvers) {
    this.dnsResolvers = dnsResolvers;
  }


  public ZeroTrustGatewayRuleSettings egress(ZeroTrustGatewayRuleSettingsEgress egress) {
    this.egress = egress;
    return this;
  }

   /**
   * Get egress
   * @return egress
  **/
  @javax.annotation.Nullable
  public ZeroTrustGatewayRuleSettingsEgress getEgress() {
    return egress;
  }

  public void setEgress(ZeroTrustGatewayRuleSettingsEgress egress) {
    this.egress = egress;
  }


  public ZeroTrustGatewayRuleSettings insecureDisableDnssecValidation(Boolean insecureDisableDnssecValidation) {
    this.insecureDisableDnssecValidation = insecureDisableDnssecValidation;
    return this;
  }

   /**
   * INSECURE - disable DNSSEC validation (for Allow actions).
   * @return insecureDisableDnssecValidation
  **/
  @javax.annotation.Nullable
  public Boolean getInsecureDisableDnssecValidation() {
    return insecureDisableDnssecValidation;
  }

  public void setInsecureDisableDnssecValidation(Boolean insecureDisableDnssecValidation) {
    this.insecureDisableDnssecValidation = insecureDisableDnssecValidation;
  }


  public ZeroTrustGatewayRuleSettings ipCategories(Boolean ipCategories) {
    this.ipCategories = ipCategories;
    return this;
  }

   /**
   * Set to true to enable IPs in DNS resolver category blocks. By default categories only block based on domain names.
   * @return ipCategories
  **/
  @javax.annotation.Nullable
  public Boolean getIpCategories() {
    return ipCategories;
  }

  public void setIpCategories(Boolean ipCategories) {
    this.ipCategories = ipCategories;
  }


  public ZeroTrustGatewayRuleSettings ipIndicatorFeeds(Boolean ipIndicatorFeeds) {
    this.ipIndicatorFeeds = ipIndicatorFeeds;
    return this;
  }

   /**
   * Set to true to include IPs in DNS resolver indicator feed blocks. By default indicator feeds only block based on domain names.
   * @return ipIndicatorFeeds
  **/
  @javax.annotation.Nullable
  public Boolean getIpIndicatorFeeds() {
    return ipIndicatorFeeds;
  }

  public void setIpIndicatorFeeds(Boolean ipIndicatorFeeds) {
    this.ipIndicatorFeeds = ipIndicatorFeeds;
  }


  public ZeroTrustGatewayRuleSettings l4override(ZeroTrustGatewayRuleSettingsL4override l4override) {
    this.l4override = l4override;
    return this;
  }

   /**
   * Get l4override
   * @return l4override
  **/
  @javax.annotation.Nullable
  public ZeroTrustGatewayRuleSettingsL4override getL4override() {
    return l4override;
  }

  public void setL4override(ZeroTrustGatewayRuleSettingsL4override l4override) {
    this.l4override = l4override;
  }


  public ZeroTrustGatewayRuleSettings notificationSettings(ZeroTrustGatewayRuleSettingsNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

   /**
   * Get notificationSettings
   * @return notificationSettings
  **/
  @javax.annotation.Nullable
  public ZeroTrustGatewayRuleSettingsNotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  public void setNotificationSettings(ZeroTrustGatewayRuleSettingsNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
  }


  public ZeroTrustGatewayRuleSettings overrideHost(String overrideHost) {
    this.overrideHost = overrideHost;
    return this;
  }

   /**
   * Override matching DNS queries with a hostname.
   * @return overrideHost
  **/
  @javax.annotation.Nullable
  public String getOverrideHost() {
    return overrideHost;
  }

  public void setOverrideHost(String overrideHost) {
    this.overrideHost = overrideHost;
  }


  public ZeroTrustGatewayRuleSettings overrideIps(List<String> overrideIps) {
    this.overrideIps = overrideIps;
    return this;
  }

  public ZeroTrustGatewayRuleSettings addOverrideIpsItem(String overrideIpsItem) {
    if (this.overrideIps == null) {
      this.overrideIps = new ArrayList<>();
    }
    this.overrideIps.add(overrideIpsItem);
    return this;
  }

   /**
   * Override matching DNS queries with an IP or set of IPs.
   * @return overrideIps
  **/
  @javax.annotation.Nullable
  public List<String> getOverrideIps() {
    return overrideIps;
  }

  public void setOverrideIps(List<String> overrideIps) {
    this.overrideIps = overrideIps;
  }


  public ZeroTrustGatewayRuleSettings payloadLog(ZeroTrustGatewayRuleSettingsPayloadLog payloadLog) {
    this.payloadLog = payloadLog;
    return this;
  }

   /**
   * Get payloadLog
   * @return payloadLog
  **/
  @javax.annotation.Nullable
  public ZeroTrustGatewayRuleSettingsPayloadLog getPayloadLog() {
    return payloadLog;
  }

  public void setPayloadLog(ZeroTrustGatewayRuleSettingsPayloadLog payloadLog) {
    this.payloadLog = payloadLog;
  }


  public ZeroTrustGatewayRuleSettings resolveDnsThroughCloudflare(Boolean resolveDnsThroughCloudflare) {
    this.resolveDnsThroughCloudflare = resolveDnsThroughCloudflare;
    return this;
  }

   /**
   * Enable to send queries that match the policy to Cloudflare&#39;s default 1.1.1.1 DNS resolver. Cannot be set when dns_resolvers are specified. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
   * @return resolveDnsThroughCloudflare
  **/
  @javax.annotation.Nullable
  public Boolean getResolveDnsThroughCloudflare() {
    return resolveDnsThroughCloudflare;
  }

  public void setResolveDnsThroughCloudflare(Boolean resolveDnsThroughCloudflare) {
    this.resolveDnsThroughCloudflare = resolveDnsThroughCloudflare;
  }


  public ZeroTrustGatewayRuleSettings untrustedCert(ZeroTrustGatewayRuleSettingsUntrustedCert untrustedCert) {
    this.untrustedCert = untrustedCert;
    return this;
  }

   /**
   * Get untrustedCert
   * @return untrustedCert
  **/
  @javax.annotation.Nullable
  public ZeroTrustGatewayRuleSettingsUntrustedCert getUntrustedCert() {
    return untrustedCert;
  }

  public void setUntrustedCert(ZeroTrustGatewayRuleSettingsUntrustedCert untrustedCert) {
    this.untrustedCert = untrustedCert;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZeroTrustGatewayRuleSettings zeroTrustGatewayRuleSettings = (ZeroTrustGatewayRuleSettings) o;
    return Objects.equals(this.addHeaders, zeroTrustGatewayRuleSettings.addHeaders) &&
        Objects.equals(this.allowChildBypass, zeroTrustGatewayRuleSettings.allowChildBypass) &&
        Objects.equals(this.auditSsh, zeroTrustGatewayRuleSettings.auditSsh) &&
        Objects.equals(this.bisoAdminControls, zeroTrustGatewayRuleSettings.bisoAdminControls) &&
        Objects.equals(this.blockPageEnabled, zeroTrustGatewayRuleSettings.blockPageEnabled) &&
        Objects.equals(this.blockReason, zeroTrustGatewayRuleSettings.blockReason) &&
        Objects.equals(this.bypassParentRule, zeroTrustGatewayRuleSettings.bypassParentRule) &&
        Objects.equals(this.checkSession, zeroTrustGatewayRuleSettings.checkSession) &&
        Objects.equals(this.dnsResolvers, zeroTrustGatewayRuleSettings.dnsResolvers) &&
        Objects.equals(this.egress, zeroTrustGatewayRuleSettings.egress) &&
        Objects.equals(this.insecureDisableDnssecValidation, zeroTrustGatewayRuleSettings.insecureDisableDnssecValidation) &&
        Objects.equals(this.ipCategories, zeroTrustGatewayRuleSettings.ipCategories) &&
        Objects.equals(this.ipIndicatorFeeds, zeroTrustGatewayRuleSettings.ipIndicatorFeeds) &&
        Objects.equals(this.l4override, zeroTrustGatewayRuleSettings.l4override) &&
        Objects.equals(this.notificationSettings, zeroTrustGatewayRuleSettings.notificationSettings) &&
        Objects.equals(this.overrideHost, zeroTrustGatewayRuleSettings.overrideHost) &&
        Objects.equals(this.overrideIps, zeroTrustGatewayRuleSettings.overrideIps) &&
        Objects.equals(this.payloadLog, zeroTrustGatewayRuleSettings.payloadLog) &&
        Objects.equals(this.resolveDnsThroughCloudflare, zeroTrustGatewayRuleSettings.resolveDnsThroughCloudflare) &&
        Objects.equals(this.untrustedCert, zeroTrustGatewayRuleSettings.untrustedCert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addHeaders, allowChildBypass, auditSsh, bisoAdminControls, blockPageEnabled, blockReason, bypassParentRule, checkSession, dnsResolvers, egress, insecureDisableDnssecValidation, ipCategories, ipIndicatorFeeds, l4override, notificationSettings, overrideHost, overrideIps, payloadLog, resolveDnsThroughCloudflare, untrustedCert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZeroTrustGatewayRuleSettings {\n");
    sb.append("    addHeaders: ").append(toIndentedString(addHeaders)).append("\n");
    sb.append("    allowChildBypass: ").append(toIndentedString(allowChildBypass)).append("\n");
    sb.append("    auditSsh: ").append(toIndentedString(auditSsh)).append("\n");
    sb.append("    bisoAdminControls: ").append(toIndentedString(bisoAdminControls)).append("\n");
    sb.append("    blockPageEnabled: ").append(toIndentedString(blockPageEnabled)).append("\n");
    sb.append("    blockReason: ").append(toIndentedString(blockReason)).append("\n");
    sb.append("    bypassParentRule: ").append(toIndentedString(bypassParentRule)).append("\n");
    sb.append("    checkSession: ").append(toIndentedString(checkSession)).append("\n");
    sb.append("    dnsResolvers: ").append(toIndentedString(dnsResolvers)).append("\n");
    sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
    sb.append("    insecureDisableDnssecValidation: ").append(toIndentedString(insecureDisableDnssecValidation)).append("\n");
    sb.append("    ipCategories: ").append(toIndentedString(ipCategories)).append("\n");
    sb.append("    ipIndicatorFeeds: ").append(toIndentedString(ipIndicatorFeeds)).append("\n");
    sb.append("    l4override: ").append(toIndentedString(l4override)).append("\n");
    sb.append("    notificationSettings: ").append(toIndentedString(notificationSettings)).append("\n");
    sb.append("    overrideHost: ").append(toIndentedString(overrideHost)).append("\n");
    sb.append("    overrideIps: ").append(toIndentedString(overrideIps)).append("\n");
    sb.append("    payloadLog: ").append(toIndentedString(payloadLog)).append("\n");
    sb.append("    resolveDnsThroughCloudflare: ").append(toIndentedString(resolveDnsThroughCloudflare)).append("\n");
    sb.append("    untrustedCert: ").append(toIndentedString(untrustedCert)).append("\n");
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
    openapiFields.add("add_headers");
    openapiFields.add("allow_child_bypass");
    openapiFields.add("audit_ssh");
    openapiFields.add("biso_admin_controls");
    openapiFields.add("block_page_enabled");
    openapiFields.add("block_reason");
    openapiFields.add("bypass_parent_rule");
    openapiFields.add("check_session");
    openapiFields.add("dns_resolvers");
    openapiFields.add("egress");
    openapiFields.add("insecure_disable_dnssec_validation");
    openapiFields.add("ip_categories");
    openapiFields.add("ip_indicator_feeds");
    openapiFields.add("l4override");
    openapiFields.add("notification_settings");
    openapiFields.add("override_host");
    openapiFields.add("override_ips");
    openapiFields.add("payload_log");
    openapiFields.add("resolve_dns_through_cloudflare");
    openapiFields.add("untrusted_cert");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZeroTrustGatewayRuleSettings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZeroTrustGatewayRuleSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZeroTrustGatewayRuleSettings is not found in the empty JSON string", ZeroTrustGatewayRuleSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZeroTrustGatewayRuleSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZeroTrustGatewayRuleSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `audit_ssh`
      if (jsonObj.get("audit_ssh") != null && !jsonObj.get("audit_ssh").isJsonNull()) {
        ZeroTrustGatewayRuleSettingsAuditSsh.validateJsonElement(jsonObj.get("audit_ssh"));
      }
      // validate the optional field `biso_admin_controls`
      if (jsonObj.get("biso_admin_controls") != null && !jsonObj.get("biso_admin_controls").isJsonNull()) {
        ZeroTrustGatewayRuleSettingsBisoAdminControls.validateJsonElement(jsonObj.get("biso_admin_controls"));
      }
      if ((jsonObj.get("block_reason") != null && !jsonObj.get("block_reason").isJsonNull()) && !jsonObj.get("block_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `block_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("block_reason").toString()));
      }
      // validate the optional field `check_session`
      if (jsonObj.get("check_session") != null && !jsonObj.get("check_session").isJsonNull()) {
        ZeroTrustGatewayRuleSettingsCheckSession.validateJsonElement(jsonObj.get("check_session"));
      }
      // validate the optional field `dns_resolvers`
      if (jsonObj.get("dns_resolvers") != null && !jsonObj.get("dns_resolvers").isJsonNull()) {
        ZeroTrustGatewayRuleSettingsDnsResolvers.validateJsonElement(jsonObj.get("dns_resolvers"));
      }
      // validate the optional field `egress`
      if (jsonObj.get("egress") != null && !jsonObj.get("egress").isJsonNull()) {
        ZeroTrustGatewayRuleSettingsEgress.validateJsonElement(jsonObj.get("egress"));
      }
      // validate the optional field `l4override`
      if (jsonObj.get("l4override") != null && !jsonObj.get("l4override").isJsonNull()) {
        ZeroTrustGatewayRuleSettingsL4override.validateJsonElement(jsonObj.get("l4override"));
      }
      // validate the optional field `notification_settings`
      if (jsonObj.get("notification_settings") != null && !jsonObj.get("notification_settings").isJsonNull()) {
        ZeroTrustGatewayRuleSettingsNotificationSettings.validateJsonElement(jsonObj.get("notification_settings"));
      }
      if ((jsonObj.get("override_host") != null && !jsonObj.get("override_host").isJsonNull()) && !jsonObj.get("override_host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `override_host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("override_host").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("override_ips") != null && !jsonObj.get("override_ips").isJsonNull() && !jsonObj.get("override_ips").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `override_ips` to be an array in the JSON string but got `%s`", jsonObj.get("override_ips").toString()));
      }
      // validate the optional field `payload_log`
      if (jsonObj.get("payload_log") != null && !jsonObj.get("payload_log").isJsonNull()) {
        ZeroTrustGatewayRuleSettingsPayloadLog.validateJsonElement(jsonObj.get("payload_log"));
      }
      // validate the optional field `untrusted_cert`
      if (jsonObj.get("untrusted_cert") != null && !jsonObj.get("untrusted_cert").isJsonNull()) {
        ZeroTrustGatewayRuleSettingsUntrustedCert.validateJsonElement(jsonObj.get("untrusted_cert"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZeroTrustGatewayRuleSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZeroTrustGatewayRuleSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZeroTrustGatewayRuleSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZeroTrustGatewayRuleSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<ZeroTrustGatewayRuleSettings>() {
           @Override
           public void write(JsonWriter out, ZeroTrustGatewayRuleSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZeroTrustGatewayRuleSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZeroTrustGatewayRuleSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZeroTrustGatewayRuleSettings
  * @throws IOException if the JSON string is invalid with respect to ZeroTrustGatewayRuleSettings
  */
  public static ZeroTrustGatewayRuleSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZeroTrustGatewayRuleSettings.class);
  }

 /**
  * Convert an instance of ZeroTrustGatewayRuleSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
