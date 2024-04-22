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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.RulesetsResponseRule;
import org.openapitools.client.model.RulesetsRulesetKind;
import org.openapitools.client.model.RulesetsRulesetPhase;

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
 * CreateAccountRuleset200ResponseAllOfResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class CreateAccountRuleset200ResponseAllOfResult {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "";

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private RulesetsRulesetKind kind;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private RulesetsRulesetPhase phase;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<RulesetsResponseRule> rules = new ArrayList<>();

  public CreateAccountRuleset200ResponseAllOfResult() {
  }

  public CreateAccountRuleset200ResponseAllOfResult(
     OffsetDateTime lastUpdated, 
     String version
  ) {
    this();
    this.lastUpdated = lastUpdated;
    this.version = version;
  }

  public CreateAccountRuleset200ResponseAllOfResult description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An informative description of the ruleset.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CreateAccountRuleset200ResponseAllOfResult id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public CreateAccountRuleset200ResponseAllOfResult kind(RulesetsRulesetKind kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nonnull
  public RulesetsRulesetKind getKind() {
    return kind;
  }

  public void setKind(RulesetsRulesetKind kind) {
    this.kind = kind;
  }


   /**
   * The timestamp of when the ruleset was last modified.
   * @return lastUpdated
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }



  public CreateAccountRuleset200ResponseAllOfResult name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The human-readable name of the ruleset.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateAccountRuleset200ResponseAllOfResult phase(RulesetsRulesetPhase phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @javax.annotation.Nonnull
  public RulesetsRulesetPhase getPhase() {
    return phase;
  }

  public void setPhase(RulesetsRulesetPhase phase) {
    this.phase = phase;
  }


   /**
   * The version of the ruleset.
   * @return version
  **/
  @javax.annotation.Nonnull
  public String getVersion() {
    return version;
  }



  public CreateAccountRuleset200ResponseAllOfResult rules(List<RulesetsResponseRule> rules) {
    this.rules = rules;
    return this;
  }

  public CreateAccountRuleset200ResponseAllOfResult addRulesItem(RulesetsResponseRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * The list of rules in the ruleset.
   * @return rules
  **/
  @javax.annotation.Nonnull
  public List<RulesetsResponseRule> getRules() {
    return rules;
  }

  public void setRules(List<RulesetsResponseRule> rules) {
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
    CreateAccountRuleset200ResponseAllOfResult createAccountRuleset200ResponseAllOfResult = (CreateAccountRuleset200ResponseAllOfResult) o;
    return Objects.equals(this.description, createAccountRuleset200ResponseAllOfResult.description) &&
        Objects.equals(this.id, createAccountRuleset200ResponseAllOfResult.id) &&
        Objects.equals(this.kind, createAccountRuleset200ResponseAllOfResult.kind) &&
        Objects.equals(this.lastUpdated, createAccountRuleset200ResponseAllOfResult.lastUpdated) &&
        Objects.equals(this.name, createAccountRuleset200ResponseAllOfResult.name) &&
        Objects.equals(this.phase, createAccountRuleset200ResponseAllOfResult.phase) &&
        Objects.equals(this.version, createAccountRuleset200ResponseAllOfResult.version) &&
        Objects.equals(this.rules, createAccountRuleset200ResponseAllOfResult.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, kind, lastUpdated, name, phase, version, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountRuleset200ResponseAllOfResult {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("last_updated");
    openapiFields.add("name");
    openapiFields.add("phase");
    openapiFields.add("version");
    openapiFields.add("rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("kind");
    openapiRequiredFields.add("last_updated");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("phase");
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("rules");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateAccountRuleset200ResponseAllOfResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateAccountRuleset200ResponseAllOfResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAccountRuleset200ResponseAllOfResult is not found in the empty JSON string", CreateAccountRuleset200ResponseAllOfResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateAccountRuleset200ResponseAllOfResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAccountRuleset200ResponseAllOfResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAccountRuleset200ResponseAllOfResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `id`
      String.validateJsonElement(jsonObj.get("id"));
      // validate the required field `kind`
      RulesetsRulesetKind.validateJsonElement(jsonObj.get("kind"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `phase`
      RulesetsRulesetPhase.validateJsonElement(jsonObj.get("phase"));
      if (!jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("rules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
      }

      JsonArray jsonArrayrules = jsonObj.getAsJsonArray("rules");
      // validate the required field `rules` (array)
      for (int i = 0; i < jsonArrayrules.size(); i++) {
        RulesetsResponseRule.validateJsonElement(jsonArrayrules.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAccountRuleset200ResponseAllOfResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAccountRuleset200ResponseAllOfResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAccountRuleset200ResponseAllOfResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAccountRuleset200ResponseAllOfResult.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAccountRuleset200ResponseAllOfResult>() {
           @Override
           public void write(JsonWriter out, CreateAccountRuleset200ResponseAllOfResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAccountRuleset200ResponseAllOfResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAccountRuleset200ResponseAllOfResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAccountRuleset200ResponseAllOfResult
  * @throws IOException if the JSON string is invalid with respect to CreateAccountRuleset200ResponseAllOfResult
  */
  public static CreateAccountRuleset200ResponseAllOfResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAccountRuleset200ResponseAllOfResult.class);
  }

 /**
  * Convert an instance of CreateAccountRuleset200ResponseAllOfResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

