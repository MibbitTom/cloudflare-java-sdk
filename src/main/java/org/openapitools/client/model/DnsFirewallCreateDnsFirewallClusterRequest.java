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
import org.openapitools.client.model.DnsFirewallAttackMitigation;
import org.openapitools.client.model.DnsFirewallUpstreamIpsInner;
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
 * DnsFirewallCreateDnsFirewallClusterRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DnsFirewallCreateDnsFirewallClusterRequest {
  public static final String SERIALIZED_NAME_ATTACK_MITIGATION = "attack_mitigation";
  @SerializedName(SERIALIZED_NAME_ATTACK_MITIGATION)
  private DnsFirewallAttackMitigation attackMitigation;

  public static final String SERIALIZED_NAME_DEPRECATE_ANY_REQUESTS = "deprecate_any_requests";
  @SerializedName(SERIALIZED_NAME_DEPRECATE_ANY_REQUESTS)
  private Boolean deprecateAnyRequests;

  public static final String SERIALIZED_NAME_ECS_FALLBACK = "ecs_fallback";
  @SerializedName(SERIALIZED_NAME_ECS_FALLBACK)
  private Boolean ecsFallback;

  public static final String SERIALIZED_NAME_MAXIMUM_CACHE_TTL = "maximum_cache_ttl";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_CACHE_TTL)
  private BigDecimal maximumCacheTtl = new BigDecimal("900");

  public static final String SERIALIZED_NAME_MINIMUM_CACHE_TTL = "minimum_cache_ttl";
  @SerializedName(SERIALIZED_NAME_MINIMUM_CACHE_TTL)
  private BigDecimal minimumCacheTtl = new BigDecimal("60");

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEGATIVE_CACHE_TTL = "negative_cache_ttl";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_CACHE_TTL)
  private BigDecimal negativeCacheTtl;

  public static final String SERIALIZED_NAME_RATELIMIT = "ratelimit";
  @SerializedName(SERIALIZED_NAME_RATELIMIT)
  private BigDecimal ratelimit;

  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  private BigDecimal retries = new BigDecimal("2");

  public static final String SERIALIZED_NAME_UPSTREAM_IPS = "upstream_ips";
  @SerializedName(SERIALIZED_NAME_UPSTREAM_IPS)
  private List<DnsFirewallUpstreamIpsInner> upstreamIps = new ArrayList<>();

  public DnsFirewallCreateDnsFirewallClusterRequest() {
  }

  public DnsFirewallCreateDnsFirewallClusterRequest attackMitigation(DnsFirewallAttackMitigation attackMitigation) {
    this.attackMitigation = attackMitigation;
    return this;
  }

   /**
   * Get attackMitigation
   * @return attackMitigation
  **/
  @javax.annotation.Nullable
  public DnsFirewallAttackMitigation getAttackMitigation() {
    return attackMitigation;
  }

  public void setAttackMitigation(DnsFirewallAttackMitigation attackMitigation) {
    this.attackMitigation = attackMitigation;
  }


  public DnsFirewallCreateDnsFirewallClusterRequest deprecateAnyRequests(Boolean deprecateAnyRequests) {
    this.deprecateAnyRequests = deprecateAnyRequests;
    return this;
  }

   /**
   * Deprecate the response to ANY requests.
   * @return deprecateAnyRequests
  **/
  @javax.annotation.Nullable
  public Boolean getDeprecateAnyRequests() {
    return deprecateAnyRequests;
  }

  public void setDeprecateAnyRequests(Boolean deprecateAnyRequests) {
    this.deprecateAnyRequests = deprecateAnyRequests;
  }


  public DnsFirewallCreateDnsFirewallClusterRequest ecsFallback(Boolean ecsFallback) {
    this.ecsFallback = ecsFallback;
    return this;
  }

   /**
   * Forward client IP (resolver) subnet if no EDNS Client Subnet is sent.
   * @return ecsFallback
  **/
  @javax.annotation.Nullable
  public Boolean getEcsFallback() {
    return ecsFallback;
  }

  public void setEcsFallback(Boolean ecsFallback) {
    this.ecsFallback = ecsFallback;
  }


  public DnsFirewallCreateDnsFirewallClusterRequest maximumCacheTtl(BigDecimal maximumCacheTtl) {
    this.maximumCacheTtl = maximumCacheTtl;
    return this;
  }

   /**
   * Maximum DNS Cache TTL.
   * minimum: 30
   * maximum: 36000
   * @return maximumCacheTtl
  **/
  @javax.annotation.Nullable
  public BigDecimal getMaximumCacheTtl() {
    return maximumCacheTtl;
  }

  public void setMaximumCacheTtl(BigDecimal maximumCacheTtl) {
    this.maximumCacheTtl = maximumCacheTtl;
  }


  public DnsFirewallCreateDnsFirewallClusterRequest minimumCacheTtl(BigDecimal minimumCacheTtl) {
    this.minimumCacheTtl = minimumCacheTtl;
    return this;
  }

   /**
   * Minimum DNS Cache TTL.
   * minimum: 30
   * maximum: 36000
   * @return minimumCacheTtl
  **/
  @javax.annotation.Nullable
  public BigDecimal getMinimumCacheTtl() {
    return minimumCacheTtl;
  }

  public void setMinimumCacheTtl(BigDecimal minimumCacheTtl) {
    this.minimumCacheTtl = minimumCacheTtl;
  }


  public DnsFirewallCreateDnsFirewallClusterRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * DNS Firewall Cluster Name.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DnsFirewallCreateDnsFirewallClusterRequest negativeCacheTtl(BigDecimal negativeCacheTtl) {
    this.negativeCacheTtl = negativeCacheTtl;
    return this;
  }

   /**
   * Negative DNS Cache TTL.
   * minimum: 30
   * maximum: 36000
   * @return negativeCacheTtl
  **/
  @javax.annotation.Nullable
  public BigDecimal getNegativeCacheTtl() {
    return negativeCacheTtl;
  }

  public void setNegativeCacheTtl(BigDecimal negativeCacheTtl) {
    this.negativeCacheTtl = negativeCacheTtl;
  }


  public DnsFirewallCreateDnsFirewallClusterRequest ratelimit(BigDecimal ratelimit) {
    this.ratelimit = ratelimit;
    return this;
  }

   /**
   * Ratelimit in queries per second per datacenter (applies to DNS queries sent to the upstream nameservers configured on the cluster).
   * minimum: 100
   * maximum: 1000000000
   * @return ratelimit
  **/
  @javax.annotation.Nullable
  public BigDecimal getRatelimit() {
    return ratelimit;
  }

  public void setRatelimit(BigDecimal ratelimit) {
    this.ratelimit = ratelimit;
  }


  public DnsFirewallCreateDnsFirewallClusterRequest retries(BigDecimal retries) {
    this.retries = retries;
    return this;
  }

   /**
   * Number of retries for fetching DNS responses from upstream nameservers (not counting the initial attempt).
   * minimum: 0
   * maximum: 2
   * @return retries
  **/
  @javax.annotation.Nullable
  public BigDecimal getRetries() {
    return retries;
  }

  public void setRetries(BigDecimal retries) {
    this.retries = retries;
  }


  public DnsFirewallCreateDnsFirewallClusterRequest upstreamIps(List<DnsFirewallUpstreamIpsInner> upstreamIps) {
    this.upstreamIps = upstreamIps;
    return this;
  }

  public DnsFirewallCreateDnsFirewallClusterRequest addUpstreamIpsItem(DnsFirewallUpstreamIpsInner upstreamIpsItem) {
    if (this.upstreamIps == null) {
      this.upstreamIps = new ArrayList<>();
    }
    this.upstreamIps.add(upstreamIpsItem);
    return this;
  }

   /**
   * Get upstreamIps
   * @return upstreamIps
  **/
  @javax.annotation.Nonnull
  public List<DnsFirewallUpstreamIpsInner> getUpstreamIps() {
    return upstreamIps;
  }

  public void setUpstreamIps(List<DnsFirewallUpstreamIpsInner> upstreamIps) {
    this.upstreamIps = upstreamIps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsFirewallCreateDnsFirewallClusterRequest dnsFirewallCreateDnsFirewallClusterRequest = (DnsFirewallCreateDnsFirewallClusterRequest) o;
    return Objects.equals(this.attackMitigation, dnsFirewallCreateDnsFirewallClusterRequest.attackMitigation) &&
        Objects.equals(this.deprecateAnyRequests, dnsFirewallCreateDnsFirewallClusterRequest.deprecateAnyRequests) &&
        Objects.equals(this.ecsFallback, dnsFirewallCreateDnsFirewallClusterRequest.ecsFallback) &&
        Objects.equals(this.maximumCacheTtl, dnsFirewallCreateDnsFirewallClusterRequest.maximumCacheTtl) &&
        Objects.equals(this.minimumCacheTtl, dnsFirewallCreateDnsFirewallClusterRequest.minimumCacheTtl) &&
        Objects.equals(this.name, dnsFirewallCreateDnsFirewallClusterRequest.name) &&
        Objects.equals(this.negativeCacheTtl, dnsFirewallCreateDnsFirewallClusterRequest.negativeCacheTtl) &&
        Objects.equals(this.ratelimit, dnsFirewallCreateDnsFirewallClusterRequest.ratelimit) &&
        Objects.equals(this.retries, dnsFirewallCreateDnsFirewallClusterRequest.retries) &&
        Objects.equals(this.upstreamIps, dnsFirewallCreateDnsFirewallClusterRequest.upstreamIps);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attackMitigation, deprecateAnyRequests, ecsFallback, maximumCacheTtl, minimumCacheTtl, name, negativeCacheTtl, ratelimit, retries, upstreamIps);
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
    sb.append("class DnsFirewallCreateDnsFirewallClusterRequest {\n");
    sb.append("    attackMitigation: ").append(toIndentedString(attackMitigation)).append("\n");
    sb.append("    deprecateAnyRequests: ").append(toIndentedString(deprecateAnyRequests)).append("\n");
    sb.append("    ecsFallback: ").append(toIndentedString(ecsFallback)).append("\n");
    sb.append("    maximumCacheTtl: ").append(toIndentedString(maximumCacheTtl)).append("\n");
    sb.append("    minimumCacheTtl: ").append(toIndentedString(minimumCacheTtl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    negativeCacheTtl: ").append(toIndentedString(negativeCacheTtl)).append("\n");
    sb.append("    ratelimit: ").append(toIndentedString(ratelimit)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    upstreamIps: ").append(toIndentedString(upstreamIps)).append("\n");
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
    openapiFields.add("attack_mitigation");
    openapiFields.add("deprecate_any_requests");
    openapiFields.add("ecs_fallback");
    openapiFields.add("maximum_cache_ttl");
    openapiFields.add("minimum_cache_ttl");
    openapiFields.add("name");
    openapiFields.add("negative_cache_ttl");
    openapiFields.add("ratelimit");
    openapiFields.add("retries");
    openapiFields.add("upstream_ips");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("upstream_ips");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DnsFirewallCreateDnsFirewallClusterRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DnsFirewallCreateDnsFirewallClusterRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DnsFirewallCreateDnsFirewallClusterRequest is not found in the empty JSON string", DnsFirewallCreateDnsFirewallClusterRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DnsFirewallCreateDnsFirewallClusterRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DnsFirewallCreateDnsFirewallClusterRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DnsFirewallCreateDnsFirewallClusterRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `attack_mitigation`
      if (jsonObj.get("attack_mitigation") != null && !jsonObj.get("attack_mitigation").isJsonNull()) {
        DnsFirewallAttackMitigation.validateJsonElement(jsonObj.get("attack_mitigation"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("upstream_ips").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `upstream_ips` to be an array in the JSON string but got `%s`", jsonObj.get("upstream_ips").toString()));
      }

      JsonArray jsonArrayupstreamIps = jsonObj.getAsJsonArray("upstream_ips");
      // validate the required field `upstream_ips` (array)
      for (int i = 0; i < jsonArrayupstreamIps.size(); i++) {
        DnsFirewallUpstreamIpsInner.validateJsonElement(jsonArrayupstreamIps.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DnsFirewallCreateDnsFirewallClusterRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DnsFirewallCreateDnsFirewallClusterRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DnsFirewallCreateDnsFirewallClusterRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DnsFirewallCreateDnsFirewallClusterRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DnsFirewallCreateDnsFirewallClusterRequest>() {
           @Override
           public void write(JsonWriter out, DnsFirewallCreateDnsFirewallClusterRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DnsFirewallCreateDnsFirewallClusterRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DnsFirewallCreateDnsFirewallClusterRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DnsFirewallCreateDnsFirewallClusterRequest
  * @throws IOException if the JSON string is invalid with respect to DnsFirewallCreateDnsFirewallClusterRequest
  */
  public static DnsFirewallCreateDnsFirewallClusterRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DnsFirewallCreateDnsFirewallClusterRequest.class);
  }

 /**
  * Convert an instance of DnsFirewallCreateDnsFirewallClusterRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

