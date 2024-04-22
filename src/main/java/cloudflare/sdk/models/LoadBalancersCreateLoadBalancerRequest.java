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
import cloudflare.sdk.models.LoadBalancingAdaptiveRouting;
import cloudflare.sdk.models.LoadBalancingLocationStrategy;
import cloudflare.sdk.models.LoadBalancingRandomSteering;
import cloudflare.sdk.models.LoadBalancingRulesInner;
import cloudflare.sdk.models.LoadBalancingSessionAffinity;
import cloudflare.sdk.models.LoadBalancingSessionAffinityAttributes;
import cloudflare.sdk.models.LoadBalancingSteeringPolicy;
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
 * LoadBalancersCreateLoadBalancerRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class LoadBalancersCreateLoadBalancerRequest {
  public static final String SERIALIZED_NAME_ADAPTIVE_ROUTING = "adaptive_routing";
  @SerializedName(SERIALIZED_NAME_ADAPTIVE_ROUTING)
  private LoadBalancingAdaptiveRouting adaptiveRouting;

  public static final String SERIALIZED_NAME_COUNTRY_POOLS = "country_pools";
  @SerializedName(SERIALIZED_NAME_COUNTRY_POOLS)
  private Object countryPools;

  public static final String SERIALIZED_NAME_DEFAULT_POOLS = "default_pools";
  @SerializedName(SERIALIZED_NAME_DEFAULT_POOLS)
  private List<String> defaultPools = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FALLBACK_POOL = "fallback_pool";
  @SerializedName(SERIALIZED_NAME_FALLBACK_POOL)
  private Object fallbackPool = null;

  public static final String SERIALIZED_NAME_LOCATION_STRATEGY = "location_strategy";
  @SerializedName(SERIALIZED_NAME_LOCATION_STRATEGY)
  private LoadBalancingLocationStrategy locationStrategy;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POP_POOLS = "pop_pools";
  @SerializedName(SERIALIZED_NAME_POP_POOLS)
  private Object popPools;

  public static final String SERIALIZED_NAME_PROXIED = "proxied";
  @SerializedName(SERIALIZED_NAME_PROXIED)
  private Boolean proxied = false;

  public static final String SERIALIZED_NAME_RANDOM_STEERING = "random_steering";
  @SerializedName(SERIALIZED_NAME_RANDOM_STEERING)
  private LoadBalancingRandomSteering randomSteering;

  public static final String SERIALIZED_NAME_REGION_POOLS = "region_pools";
  @SerializedName(SERIALIZED_NAME_REGION_POOLS)
  private Object regionPools;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<LoadBalancingRulesInner> rules = new ArrayList<>();

  public static final String SERIALIZED_NAME_SESSION_AFFINITY = "session_affinity";
  @SerializedName(SERIALIZED_NAME_SESSION_AFFINITY)
  private LoadBalancingSessionAffinity sessionAffinity = LoadBalancingSessionAffinity.u;

  public static final String SERIALIZED_NAME_SESSION_AFFINITY_ATTRIBUTES = "session_affinity_attributes";
  @SerializedName(SERIALIZED_NAME_SESSION_AFFINITY_ATTRIBUTES)
  private LoadBalancingSessionAffinityAttributes sessionAffinityAttributes;

  public static final String SERIALIZED_NAME_SESSION_AFFINITY_TTL = "session_affinity_ttl";
  @SerializedName(SERIALIZED_NAME_SESSION_AFFINITY_TTL)
  private BigDecimal sessionAffinityTtl;

  public static final String SERIALIZED_NAME_STEERING_POLICY = "steering_policy";
  @SerializedName(SERIALIZED_NAME_STEERING_POLICY)
  private LoadBalancingSteeringPolicy steeringPolicy = LoadBalancingSteeringPolicy.u;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private BigDecimal ttl;

  public LoadBalancersCreateLoadBalancerRequest() {
  }

  public LoadBalancersCreateLoadBalancerRequest adaptiveRouting(LoadBalancingAdaptiveRouting adaptiveRouting) {
    this.adaptiveRouting = adaptiveRouting;
    return this;
  }

   /**
   * Get adaptiveRouting
   * @return adaptiveRouting
  **/
  @javax.annotation.Nullable
  public LoadBalancingAdaptiveRouting getAdaptiveRouting() {
    return adaptiveRouting;
  }

  public void setAdaptiveRouting(LoadBalancingAdaptiveRouting adaptiveRouting) {
    this.adaptiveRouting = adaptiveRouting;
  }


  public LoadBalancersCreateLoadBalancerRequest countryPools(Object countryPools) {
    this.countryPools = countryPools;
    return this;
  }

   /**
   * A mapping of country codes to a list of pool IDs (ordered by their failover priority) for the given country. Any country not explicitly defined will fall back to using the corresponding region_pool mapping if it exists else to default_pools.
   * @return countryPools
  **/
  @javax.annotation.Nullable
  public Object getCountryPools() {
    return countryPools;
  }

  public void setCountryPools(Object countryPools) {
    this.countryPools = countryPools;
  }


  public LoadBalancersCreateLoadBalancerRequest defaultPools(List<String> defaultPools) {
    this.defaultPools = defaultPools;
    return this;
  }

  public LoadBalancersCreateLoadBalancerRequest addDefaultPoolsItem(String defaultPoolsItem) {
    if (this.defaultPools == null) {
      this.defaultPools = new ArrayList<>();
    }
    this.defaultPools.add(defaultPoolsItem);
    return this;
  }

   /**
   * A list of pool IDs ordered by their failover priority. Pools defined here are used by default, or when region_pools are not configured for a given region.
   * @return defaultPools
  **/
  @javax.annotation.Nonnull
  public List<String> getDefaultPools() {
    return defaultPools;
  }

  public void setDefaultPools(List<String> defaultPools) {
    this.defaultPools = defaultPools;
  }


  public LoadBalancersCreateLoadBalancerRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Object description.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public LoadBalancersCreateLoadBalancerRequest fallbackPool(Object fallbackPool) {
    this.fallbackPool = fallbackPool;
    return this;
  }

   /**
   * The pool ID to use when all other pools are detected as unhealthy.
   * @return fallbackPool
  **/
  @javax.annotation.Nullable
  public Object getFallbackPool() {
    return fallbackPool;
  }

  public void setFallbackPool(Object fallbackPool) {
    this.fallbackPool = fallbackPool;
  }


  public LoadBalancersCreateLoadBalancerRequest locationStrategy(LoadBalancingLocationStrategy locationStrategy) {
    this.locationStrategy = locationStrategy;
    return this;
  }

   /**
   * Get locationStrategy
   * @return locationStrategy
  **/
  @javax.annotation.Nullable
  public LoadBalancingLocationStrategy getLocationStrategy() {
    return locationStrategy;
  }

  public void setLocationStrategy(LoadBalancingLocationStrategy locationStrategy) {
    this.locationStrategy = locationStrategy;
  }


  public LoadBalancersCreateLoadBalancerRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The DNS hostname to associate with your Load Balancer. If this hostname already exists as a DNS record in Cloudflare&#39;s DNS, the Load Balancer will take precedence and the DNS record will not be used.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public LoadBalancersCreateLoadBalancerRequest popPools(Object popPools) {
    this.popPools = popPools;
    return this;
  }

   /**
   * (Enterprise only): A mapping of Cloudflare PoP identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). Any PoPs not explicitly defined will fall back to using the corresponding country_pool, then region_pool mapping if it exists else to default_pools.
   * @return popPools
  **/
  @javax.annotation.Nullable
  public Object getPopPools() {
    return popPools;
  }

  public void setPopPools(Object popPools) {
    this.popPools = popPools;
  }


  public LoadBalancersCreateLoadBalancerRequest proxied(Boolean proxied) {
    this.proxied = proxied;
    return this;
  }

   /**
   * Whether the hostname should be gray clouded (false) or orange clouded (true).
   * @return proxied
  **/
  @javax.annotation.Nullable
  public Boolean getProxied() {
    return proxied;
  }

  public void setProxied(Boolean proxied) {
    this.proxied = proxied;
  }


  public LoadBalancersCreateLoadBalancerRequest randomSteering(LoadBalancingRandomSteering randomSteering) {
    this.randomSteering = randomSteering;
    return this;
  }

   /**
   * Get randomSteering
   * @return randomSteering
  **/
  @javax.annotation.Nullable
  public LoadBalancingRandomSteering getRandomSteering() {
    return randomSteering;
  }

  public void setRandomSteering(LoadBalancingRandomSteering randomSteering) {
    this.randomSteering = randomSteering;
  }


  public LoadBalancersCreateLoadBalancerRequest regionPools(Object regionPools) {
    this.regionPools = regionPools;
    return this;
  }

   /**
   * A mapping of region codes to a list of pool IDs (ordered by their failover priority) for the given region. Any regions not explicitly defined will fall back to using default_pools.
   * @return regionPools
  **/
  @javax.annotation.Nullable
  public Object getRegionPools() {
    return regionPools;
  }

  public void setRegionPools(Object regionPools) {
    this.regionPools = regionPools;
  }


  public LoadBalancersCreateLoadBalancerRequest rules(List<LoadBalancingRulesInner> rules) {
    this.rules = rules;
    return this;
  }

  public LoadBalancersCreateLoadBalancerRequest addRulesItem(LoadBalancingRulesInner rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * BETA Field Not General Access: A list of rules for this load balancer to execute.
   * @return rules
  **/
  @javax.annotation.Nullable
  public List<LoadBalancingRulesInner> getRules() {
    return rules;
  }

  public void setRules(List<LoadBalancingRulesInner> rules) {
    this.rules = rules;
  }


  public LoadBalancersCreateLoadBalancerRequest sessionAffinity(LoadBalancingSessionAffinity sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
    return this;
  }

   /**
   * Get sessionAffinity
   * @return sessionAffinity
  **/
  @javax.annotation.Nullable
  public LoadBalancingSessionAffinity getSessionAffinity() {
    return sessionAffinity;
  }

  public void setSessionAffinity(LoadBalancingSessionAffinity sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
  }


  public LoadBalancersCreateLoadBalancerRequest sessionAffinityAttributes(LoadBalancingSessionAffinityAttributes sessionAffinityAttributes) {
    this.sessionAffinityAttributes = sessionAffinityAttributes;
    return this;
  }

   /**
   * Get sessionAffinityAttributes
   * @return sessionAffinityAttributes
  **/
  @javax.annotation.Nullable
  public LoadBalancingSessionAffinityAttributes getSessionAffinityAttributes() {
    return sessionAffinityAttributes;
  }

  public void setSessionAffinityAttributes(LoadBalancingSessionAffinityAttributes sessionAffinityAttributes) {
    this.sessionAffinityAttributes = sessionAffinityAttributes;
  }


  public LoadBalancersCreateLoadBalancerRequest sessionAffinityTtl(BigDecimal sessionAffinityTtl) {
    this.sessionAffinityTtl = sessionAffinityTtl;
    return this;
  }

   /**
   * Time, in seconds, until a client&#39;s session expires after being created. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. The accepted ranges per &#x60;session_affinity&#x60; policy are: - &#x60;\&quot;cookie\&quot;&#x60; / &#x60;\&quot;ip_cookie\&quot;&#x60;: The current default of 23 hours will be used unless explicitly set. The accepted range of values is between [1800, 604800]. - &#x60;\&quot;header\&quot;&#x60;: The current default of 1800 seconds will be used unless explicitly set. The accepted range of values is between [30, 3600]. Note: With session affinity by header, sessions only expire after they haven&#39;t been used for the number of seconds specified.
   * @return sessionAffinityTtl
  **/
  @javax.annotation.Nullable
  public BigDecimal getSessionAffinityTtl() {
    return sessionAffinityTtl;
  }

  public void setSessionAffinityTtl(BigDecimal sessionAffinityTtl) {
    this.sessionAffinityTtl = sessionAffinityTtl;
  }


  public LoadBalancersCreateLoadBalancerRequest steeringPolicy(LoadBalancingSteeringPolicy steeringPolicy) {
    this.steeringPolicy = steeringPolicy;
    return this;
  }

   /**
   * Get steeringPolicy
   * @return steeringPolicy
  **/
  @javax.annotation.Nullable
  public LoadBalancingSteeringPolicy getSteeringPolicy() {
    return steeringPolicy;
  }

  public void setSteeringPolicy(LoadBalancingSteeringPolicy steeringPolicy) {
    this.steeringPolicy = steeringPolicy;
  }


  public LoadBalancersCreateLoadBalancerRequest ttl(BigDecimal ttl) {
    this.ttl = ttl;
    return this;
  }

   /**
   * Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This only applies to gray-clouded (unproxied) load balancers.
   * @return ttl
  **/
  @javax.annotation.Nullable
  public BigDecimal getTtl() {
    return ttl;
  }

  public void setTtl(BigDecimal ttl) {
    this.ttl = ttl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadBalancersCreateLoadBalancerRequest loadBalancersCreateLoadBalancerRequest = (LoadBalancersCreateLoadBalancerRequest) o;
    return Objects.equals(this.adaptiveRouting, loadBalancersCreateLoadBalancerRequest.adaptiveRouting) &&
        Objects.equals(this.countryPools, loadBalancersCreateLoadBalancerRequest.countryPools) &&
        Objects.equals(this.defaultPools, loadBalancersCreateLoadBalancerRequest.defaultPools) &&
        Objects.equals(this.description, loadBalancersCreateLoadBalancerRequest.description) &&
        Objects.equals(this.fallbackPool, loadBalancersCreateLoadBalancerRequest.fallbackPool) &&
        Objects.equals(this.locationStrategy, loadBalancersCreateLoadBalancerRequest.locationStrategy) &&
        Objects.equals(this.name, loadBalancersCreateLoadBalancerRequest.name) &&
        Objects.equals(this.popPools, loadBalancersCreateLoadBalancerRequest.popPools) &&
        Objects.equals(this.proxied, loadBalancersCreateLoadBalancerRequest.proxied) &&
        Objects.equals(this.randomSteering, loadBalancersCreateLoadBalancerRequest.randomSteering) &&
        Objects.equals(this.regionPools, loadBalancersCreateLoadBalancerRequest.regionPools) &&
        Objects.equals(this.rules, loadBalancersCreateLoadBalancerRequest.rules) &&
        Objects.equals(this.sessionAffinity, loadBalancersCreateLoadBalancerRequest.sessionAffinity) &&
        Objects.equals(this.sessionAffinityAttributes, loadBalancersCreateLoadBalancerRequest.sessionAffinityAttributes) &&
        Objects.equals(this.sessionAffinityTtl, loadBalancersCreateLoadBalancerRequest.sessionAffinityTtl) &&
        Objects.equals(this.steeringPolicy, loadBalancersCreateLoadBalancerRequest.steeringPolicy) &&
        Objects.equals(this.ttl, loadBalancersCreateLoadBalancerRequest.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adaptiveRouting, countryPools, defaultPools, description, fallbackPool, locationStrategy, name, popPools, proxied, randomSteering, regionPools, rules, sessionAffinity, sessionAffinityAttributes, sessionAffinityTtl, steeringPolicy, ttl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancersCreateLoadBalancerRequest {\n");
    sb.append("    adaptiveRouting: ").append(toIndentedString(adaptiveRouting)).append("\n");
    sb.append("    countryPools: ").append(toIndentedString(countryPools)).append("\n");
    sb.append("    defaultPools: ").append(toIndentedString(defaultPools)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fallbackPool: ").append(toIndentedString(fallbackPool)).append("\n");
    sb.append("    locationStrategy: ").append(toIndentedString(locationStrategy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    popPools: ").append(toIndentedString(popPools)).append("\n");
    sb.append("    proxied: ").append(toIndentedString(proxied)).append("\n");
    sb.append("    randomSteering: ").append(toIndentedString(randomSteering)).append("\n");
    sb.append("    regionPools: ").append(toIndentedString(regionPools)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    sessionAffinity: ").append(toIndentedString(sessionAffinity)).append("\n");
    sb.append("    sessionAffinityAttributes: ").append(toIndentedString(sessionAffinityAttributes)).append("\n");
    sb.append("    sessionAffinityTtl: ").append(toIndentedString(sessionAffinityTtl)).append("\n");
    sb.append("    steeringPolicy: ").append(toIndentedString(steeringPolicy)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
    openapiFields.add("adaptive_routing");
    openapiFields.add("country_pools");
    openapiFields.add("default_pools");
    openapiFields.add("description");
    openapiFields.add("fallback_pool");
    openapiFields.add("location_strategy");
    openapiFields.add("name");
    openapiFields.add("pop_pools");
    openapiFields.add("proxied");
    openapiFields.add("random_steering");
    openapiFields.add("region_pools");
    openapiFields.add("rules");
    openapiFields.add("session_affinity");
    openapiFields.add("session_affinity_attributes");
    openapiFields.add("session_affinity_ttl");
    openapiFields.add("steering_policy");
    openapiFields.add("ttl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("default_pools");
    openapiRequiredFields.add("fallback_pool");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoadBalancersCreateLoadBalancerRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoadBalancersCreateLoadBalancerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoadBalancersCreateLoadBalancerRequest is not found in the empty JSON string", LoadBalancersCreateLoadBalancerRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoadBalancersCreateLoadBalancerRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoadBalancersCreateLoadBalancerRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LoadBalancersCreateLoadBalancerRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `adaptive_routing`
      if (jsonObj.get("adaptive_routing") != null && !jsonObj.get("adaptive_routing").isJsonNull()) {
        LoadBalancingAdaptiveRouting.validateJsonElement(jsonObj.get("adaptive_routing"));
      }
      // ensure the required json array is present
      if (jsonObj.get("default_pools") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("default_pools").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_pools` to be an array in the JSON string but got `%s`", jsonObj.get("default_pools").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `location_strategy`
      if (jsonObj.get("location_strategy") != null && !jsonObj.get("location_strategy").isJsonNull()) {
        LoadBalancingLocationStrategy.validateJsonElement(jsonObj.get("location_strategy"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `random_steering`
      if (jsonObj.get("random_steering") != null && !jsonObj.get("random_steering").isJsonNull()) {
        LoadBalancingRandomSteering.validateJsonElement(jsonObj.get("random_steering"));
      }
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) {
        JsonArray jsonArrayrules = jsonObj.getAsJsonArray("rules");
        if (jsonArrayrules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
          }

          // validate the optional field `rules` (array)
          for (int i = 0; i < jsonArrayrules.size(); i++) {
            LoadBalancingRulesInner.validateJsonElement(jsonArrayrules.get(i));
          };
        }
      }
      // validate the optional field `session_affinity`
      if (jsonObj.get("session_affinity") != null && !jsonObj.get("session_affinity").isJsonNull()) {
        LoadBalancingSessionAffinity.validateJsonElement(jsonObj.get("session_affinity"));
      }
      // validate the optional field `session_affinity_attributes`
      if (jsonObj.get("session_affinity_attributes") != null && !jsonObj.get("session_affinity_attributes").isJsonNull()) {
        LoadBalancingSessionAffinityAttributes.validateJsonElement(jsonObj.get("session_affinity_attributes"));
      }
      // validate the optional field `steering_policy`
      if (jsonObj.get("steering_policy") != null && !jsonObj.get("steering_policy").isJsonNull()) {
        LoadBalancingSteeringPolicy.validateJsonElement(jsonObj.get("steering_policy"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoadBalancersCreateLoadBalancerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoadBalancersCreateLoadBalancerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoadBalancersCreateLoadBalancerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoadBalancersCreateLoadBalancerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<LoadBalancersCreateLoadBalancerRequest>() {
           @Override
           public void write(JsonWriter out, LoadBalancersCreateLoadBalancerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoadBalancersCreateLoadBalancerRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoadBalancersCreateLoadBalancerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoadBalancersCreateLoadBalancerRequest
  * @throws IOException if the JSON string is invalid with respect to LoadBalancersCreateLoadBalancerRequest
  */
  public static LoadBalancersCreateLoadBalancerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoadBalancersCreateLoadBalancerRequest.class);
  }

 /**
  * Convert an instance of LoadBalancersCreateLoadBalancerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

