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
import cloudflare.sdk.models.FirewallRewriteAction;
import cloudflare.sdk.models.FirewallWafAction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * FirewallOverride
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class FirewallOverride {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private Map<String, Object> groups = new HashMap<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PAUSED = "paused";
  @SerializedName(SERIALIZED_NAME_PAUSED)
  private Boolean paused;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private BigDecimal priority;

  public static final String SERIALIZED_NAME_REWRITE_ACTION = "rewrite_action";
  @SerializedName(SERIALIZED_NAME_REWRITE_ACTION)
  private FirewallRewriteAction rewriteAction;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private Map<String, FirewallWafAction> rules = new HashMap<>();

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private List<String> urls = new ArrayList<>();

  public FirewallOverride() {
  }

  public FirewallOverride(
     String id
  ) {
    this();
    this.id = id;
  }

  public FirewallOverride description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An informative summary of the current URI-based WAF override.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public FirewallOverride groups(Map<String, Object> groups) {
    this.groups = groups;
    return this;
  }

  public FirewallOverride putGroupsItem(String key, Object groupsItem) {
    if (this.groups == null) {
      this.groups = new HashMap<>();
    }
    this.groups.put(key, groupsItem);
    return this;
  }

   /**
   * An object that allows you to enable or disable WAF rule groups for the current WAF override. Each key of this object must be the ID of a WAF rule group, and each value must be a valid WAF action (usually &#x60;default&#x60; or &#x60;disable&#x60;). When creating a new URI-based WAF override, you must provide a &#x60;groups&#x60; object or a &#x60;rules&#x60; object.
   * @return groups
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getGroups() {
    return groups;
  }

  public void setGroups(Map<String, Object> groups) {
    this.groups = groups;
  }


   /**
   * The unique identifier of the WAF override.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public FirewallOverride paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * When true, indicates that the WAF package is currently paused.
   * @return paused
  **/
  @javax.annotation.Nullable
  public Boolean getPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }


  public FirewallOverride priority(BigDecimal priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The relative priority of the current URI-based WAF override when multiple overrides match a single URL. A lower number indicates higher priority. Higher priority overrides may overwrite values set by lower priority overrides.
   * minimum: -1000000000
   * maximum: 1000000000
   * @return priority
  **/
  @javax.annotation.Nullable
  public BigDecimal getPriority() {
    return priority;
  }

  public void setPriority(BigDecimal priority) {
    this.priority = priority;
  }


  public FirewallOverride rewriteAction(FirewallRewriteAction rewriteAction) {
    this.rewriteAction = rewriteAction;
    return this;
  }

   /**
   * Get rewriteAction
   * @return rewriteAction
  **/
  @javax.annotation.Nullable
  public FirewallRewriteAction getRewriteAction() {
    return rewriteAction;
  }

  public void setRewriteAction(FirewallRewriteAction rewriteAction) {
    this.rewriteAction = rewriteAction;
  }


  public FirewallOverride rules(Map<String, FirewallWafAction> rules) {
    this.rules = rules;
    return this;
  }

  public FirewallOverride putRulesItem(String key, FirewallWafAction rulesItem) {
    if (this.rules == null) {
      this.rules = new HashMap<>();
    }
    this.rules.put(key, rulesItem);
    return this;
  }

   /**
   * An object that allows you to override the action of specific WAF rules. Each key of this object must be the ID of a WAF rule, and each value must be a valid WAF action. Unless you are disabling a rule, ensure that you also enable the rule group that this WAF rule belongs to. When creating a new URI-based WAF override, you must provide a &#x60;groups&#x60; object or a &#x60;rules&#x60; object.
   * @return rules
  **/
  @javax.annotation.Nullable
  public Map<String, FirewallWafAction> getRules() {
    return rules;
  }

  public void setRules(Map<String, FirewallWafAction> rules) {
    this.rules = rules;
  }


  public FirewallOverride urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public FirewallOverride addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * The URLs to include in the current WAF override. You can use wildcards. Each entered URL will be escaped before use, which means you can only use simple wildcard patterns.
   * @return urls
  **/
  @javax.annotation.Nullable
  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirewallOverride firewallOverride = (FirewallOverride) o;
    return Objects.equals(this.description, firewallOverride.description) &&
        Objects.equals(this.groups, firewallOverride.groups) &&
        Objects.equals(this.id, firewallOverride.id) &&
        Objects.equals(this.paused, firewallOverride.paused) &&
        Objects.equals(this.priority, firewallOverride.priority) &&
        Objects.equals(this.rewriteAction, firewallOverride.rewriteAction) &&
        Objects.equals(this.rules, firewallOverride.rules) &&
        Objects.equals(this.urls, firewallOverride.urls);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, groups, id, paused, priority, rewriteAction, rules, urls);
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
    sb.append("class FirewallOverride {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    rewriteAction: ").append(toIndentedString(rewriteAction)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("groups");
    openapiFields.add("id");
    openapiFields.add("paused");
    openapiFields.add("priority");
    openapiFields.add("rewrite_action");
    openapiFields.add("rules");
    openapiFields.add("urls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FirewallOverride
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FirewallOverride.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FirewallOverride is not found in the empty JSON string", FirewallOverride.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FirewallOverride.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FirewallOverride` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `rewrite_action`
      if (jsonObj.get("rewrite_action") != null && !jsonObj.get("rewrite_action").isJsonNull()) {
        FirewallRewriteAction.validateJsonElement(jsonObj.get("rewrite_action"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("urls") != null && !jsonObj.get("urls").isJsonNull() && !jsonObj.get("urls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `urls` to be an array in the JSON string but got `%s`", jsonObj.get("urls").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FirewallOverride.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FirewallOverride' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FirewallOverride> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FirewallOverride.class));

       return (TypeAdapter<T>) new TypeAdapter<FirewallOverride>() {
           @Override
           public void write(JsonWriter out, FirewallOverride value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FirewallOverride read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FirewallOverride given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FirewallOverride
  * @throws IOException if the JSON string is invalid with respect to FirewallOverride
  */
  public static FirewallOverride fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FirewallOverride.class);
  }

 /**
  * Convert an instance of FirewallOverride to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

