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
import org.openapitools.client.model.EmailRuleAction;
import org.openapitools.client.model.EmailRuleMatcher;

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
 * EmailRules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class EmailRules {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<EmailRuleAction> actions = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = true;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MATCHERS = "matchers";
  @SerializedName(SERIALIZED_NAME_MATCHERS)
  private List<EmailRuleMatcher> matchers = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private BigDecimal priority = new BigDecimal("0");

  public static final String SERIALIZED_NAME_TAG = "tag";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public EmailRules() {
  }

  public EmailRules(
     String id, 
     String tag
  ) {
    this();
    this.id = id;
    this.tag = tag;
  }

  public EmailRules actions(List<EmailRuleAction> actions) {
    this.actions = actions;
    return this;
  }

  public EmailRules addActionsItem(EmailRuleAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * List actions patterns.
   * @return actions
  **/
  @javax.annotation.Nullable
  public List<EmailRuleAction> getActions() {
    return actions;
  }

  public void setActions(List<EmailRuleAction> actions) {
    this.actions = actions;
  }


  public EmailRules enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Routing rule status.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


   /**
   * Routing rule identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public EmailRules matchers(List<EmailRuleMatcher> matchers) {
    this.matchers = matchers;
    return this;
  }

  public EmailRules addMatchersItem(EmailRuleMatcher matchersItem) {
    if (this.matchers == null) {
      this.matchers = new ArrayList<>();
    }
    this.matchers.add(matchersItem);
    return this;
  }

   /**
   * Matching patterns to forward to your actions.
   * @return matchers
  **/
  @javax.annotation.Nullable
  public List<EmailRuleMatcher> getMatchers() {
    return matchers;
  }

  public void setMatchers(List<EmailRuleMatcher> matchers) {
    this.matchers = matchers;
  }


  public EmailRules name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Routing rule name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public EmailRules priority(BigDecimal priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Priority of the routing rule.
   * minimum: 0
   * @return priority
  **/
  @javax.annotation.Nullable
  public BigDecimal getPriority() {
    return priority;
  }

  public void setPriority(BigDecimal priority) {
    this.priority = priority;
  }


   /**
   * Routing rule tag. (Deprecated, replaced by routing rule identifier)
   * @return tag
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailRules emailRules = (EmailRules) o;
    return Objects.equals(this.actions, emailRules.actions) &&
        Objects.equals(this.enabled, emailRules.enabled) &&
        Objects.equals(this.id, emailRules.id) &&
        Objects.equals(this.matchers, emailRules.matchers) &&
        Objects.equals(this.name, emailRules.name) &&
        Objects.equals(this.priority, emailRules.priority) &&
        Objects.equals(this.tag, emailRules.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, enabled, id, matchers, name, priority, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailRules {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    matchers: ").append(toIndentedString(matchers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("actions");
    openapiFields.add("enabled");
    openapiFields.add("id");
    openapiFields.add("matchers");
    openapiFields.add("name");
    openapiFields.add("priority");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EmailRules
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmailRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailRules is not found in the empty JSON string", EmailRules.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmailRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailRules` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("actions") != null && !jsonObj.get("actions").isJsonNull()) {
        JsonArray jsonArrayactions = jsonObj.getAsJsonArray("actions");
        if (jsonArrayactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("actions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `actions` to be an array in the JSON string but got `%s`", jsonObj.get("actions").toString()));
          }

          // validate the optional field `actions` (array)
          for (int i = 0; i < jsonArrayactions.size(); i++) {
            EmailRuleAction.validateJsonElement(jsonArrayactions.get(i));
          };
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("matchers") != null && !jsonObj.get("matchers").isJsonNull()) {
        JsonArray jsonArraymatchers = jsonObj.getAsJsonArray("matchers");
        if (jsonArraymatchers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("matchers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `matchers` to be an array in the JSON string but got `%s`", jsonObj.get("matchers").toString()));
          }

          // validate the optional field `matchers` (array)
          for (int i = 0; i < jsonArraymatchers.size(); i++) {
            EmailRuleMatcher.validateJsonElement(jsonArraymatchers.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailRules.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailRules>() {
           @Override
           public void write(JsonWriter out, EmailRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailRules read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EmailRules given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmailRules
  * @throws IOException if the JSON string is invalid with respect to EmailRules
  */
  public static EmailRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailRules.class);
  }

 /**
  * Convert an instance of EmailRules to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

