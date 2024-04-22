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
import cloudflare.sdk.models.FirewallCacheRulesComponentsSchemasRule;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * FirewallCacheRulesComponentsSchemasRuleset
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class FirewallCacheRulesComponentsSchemasRuleset {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private Object description = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Object id = null;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private Object kind = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Object name = null;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private Object phase = null;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<FirewallCacheRulesComponentsSchemasRule> rules = new ArrayList<>();

  public FirewallCacheRulesComponentsSchemasRuleset() {
  }

  public FirewallCacheRulesComponentsSchemasRuleset description(Object description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public Object getDescription() {
    return description;
  }

  public void setDescription(Object description) {
    this.description = description;
  }


  public FirewallCacheRulesComponentsSchemasRuleset id(Object id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }


  public FirewallCacheRulesComponentsSchemasRuleset kind(Object kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  public Object getKind() {
    return kind;
  }

  public void setKind(Object kind) {
    this.kind = kind;
  }


  public FirewallCacheRulesComponentsSchemasRuleset name(Object name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public Object getName() {
    return name;
  }

  public void setName(Object name) {
    this.name = name;
  }


  public FirewallCacheRulesComponentsSchemasRuleset phase(Object phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @javax.annotation.Nullable
  public Object getPhase() {
    return phase;
  }

  public void setPhase(Object phase) {
    this.phase = phase;
  }


  public FirewallCacheRulesComponentsSchemasRuleset rules(List<FirewallCacheRulesComponentsSchemasRule> rules) {
    this.rules = rules;
    return this;
  }

  public FirewallCacheRulesComponentsSchemasRuleset addRulesItem(FirewallCacheRulesComponentsSchemasRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * The rules in the ruleset.
   * @return rules
  **/
  @javax.annotation.Nullable
  public List<FirewallCacheRulesComponentsSchemasRule> getRules() {
    return rules;
  }

  public void setRules(List<FirewallCacheRulesComponentsSchemasRule> rules) {
    this.rules = rules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirewallCacheRulesComponentsSchemasRuleset firewallCacheRulesComponentsSchemasRuleset = (FirewallCacheRulesComponentsSchemasRuleset) o;
    return Objects.equals(this.description, firewallCacheRulesComponentsSchemasRuleset.description) &&
        Objects.equals(this.id, firewallCacheRulesComponentsSchemasRuleset.id) &&
        Objects.equals(this.kind, firewallCacheRulesComponentsSchemasRuleset.kind) &&
        Objects.equals(this.name, firewallCacheRulesComponentsSchemasRuleset.name) &&
        Objects.equals(this.phase, firewallCacheRulesComponentsSchemasRuleset.phase) &&
        Objects.equals(this.rules, firewallCacheRulesComponentsSchemasRuleset.rules);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, kind, name, phase, rules);
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
    sb.append("class FirewallCacheRulesComponentsSchemasRuleset {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("kind");
    openapiFields.add("name");
    openapiFields.add("phase");
    openapiFields.add("rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FirewallCacheRulesComponentsSchemasRuleset
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FirewallCacheRulesComponentsSchemasRuleset.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FirewallCacheRulesComponentsSchemasRuleset is not found in the empty JSON string", FirewallCacheRulesComponentsSchemasRuleset.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FirewallCacheRulesComponentsSchemasRuleset.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FirewallCacheRulesComponentsSchemasRuleset` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) {
        JsonArray jsonArrayrules = jsonObj.getAsJsonArray("rules");
        if (jsonArrayrules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
          }

          // validate the optional field `rules` (array)
          for (int i = 0; i < jsonArrayrules.size(); i++) {
            FirewallCacheRulesComponentsSchemasRule.validateJsonElement(jsonArrayrules.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FirewallCacheRulesComponentsSchemasRuleset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FirewallCacheRulesComponentsSchemasRuleset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FirewallCacheRulesComponentsSchemasRuleset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FirewallCacheRulesComponentsSchemasRuleset.class));

       return (TypeAdapter<T>) new TypeAdapter<FirewallCacheRulesComponentsSchemasRuleset>() {
           @Override
           public void write(JsonWriter out, FirewallCacheRulesComponentsSchemasRuleset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FirewallCacheRulesComponentsSchemasRuleset read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FirewallCacheRulesComponentsSchemasRuleset given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FirewallCacheRulesComponentsSchemasRuleset
  * @throws IOException if the JSON string is invalid with respect to FirewallCacheRulesComponentsSchemasRuleset
  */
  public static FirewallCacheRulesComponentsSchemasRuleset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FirewallCacheRulesComponentsSchemasRuleset.class);
  }

 /**
  * Convert an instance of FirewallCacheRulesComponentsSchemasRuleset to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

