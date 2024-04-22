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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.EmailRuleCatchallAction;
import org.openapitools.client.model.EmailRuleCatchallMatcher;

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
 * EmailCatchAllRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class EmailCatchAllRule {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<EmailRuleCatchallAction> actions = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = true;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MATCHERS = "matchers";
  @SerializedName(SERIALIZED_NAME_MATCHERS)
  private List<EmailRuleCatchallMatcher> matchers = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public EmailCatchAllRule() {
  }

  public EmailCatchAllRule(
     String id, 
     String tag
  ) {
    this();
    this.id = id;
    this.tag = tag;
  }

  public EmailCatchAllRule actions(List<EmailRuleCatchallAction> actions) {
    this.actions = actions;
    return this;
  }

  public EmailCatchAllRule addActionsItem(EmailRuleCatchallAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * List actions for the catch-all routing rule.
   * @return actions
  **/
  @javax.annotation.Nullable
  public List<EmailRuleCatchallAction> getActions() {
    return actions;
  }

  public void setActions(List<EmailRuleCatchallAction> actions) {
    this.actions = actions;
  }


  public EmailCatchAllRule enabled(Boolean enabled) {
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



  public EmailCatchAllRule matchers(List<EmailRuleCatchallMatcher> matchers) {
    this.matchers = matchers;
    return this;
  }

  public EmailCatchAllRule addMatchersItem(EmailRuleCatchallMatcher matchersItem) {
    if (this.matchers == null) {
      this.matchers = new ArrayList<>();
    }
    this.matchers.add(matchersItem);
    return this;
  }

   /**
   * List of matchers for the catch-all routing rule.
   * @return matchers
  **/
  @javax.annotation.Nullable
  public List<EmailRuleCatchallMatcher> getMatchers() {
    return matchers;
  }

  public void setMatchers(List<EmailRuleCatchallMatcher> matchers) {
    this.matchers = matchers;
  }


  public EmailCatchAllRule name(String name) {
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
    EmailCatchAllRule emailCatchAllRule = (EmailCatchAllRule) o;
    return Objects.equals(this.actions, emailCatchAllRule.actions) &&
        Objects.equals(this.enabled, emailCatchAllRule.enabled) &&
        Objects.equals(this.id, emailCatchAllRule.id) &&
        Objects.equals(this.matchers, emailCatchAllRule.matchers) &&
        Objects.equals(this.name, emailCatchAllRule.name) &&
        Objects.equals(this.tag, emailCatchAllRule.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, enabled, id, matchers, name, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailCatchAllRule {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    matchers: ").append(toIndentedString(matchers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EmailCatchAllRule
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmailCatchAllRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailCatchAllRule is not found in the empty JSON string", EmailCatchAllRule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmailCatchAllRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailCatchAllRule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            EmailRuleCatchallAction.validateJsonElement(jsonArrayactions.get(i));
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
            EmailRuleCatchallMatcher.validateJsonElement(jsonArraymatchers.get(i));
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
       if (!EmailCatchAllRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailCatchAllRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailCatchAllRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailCatchAllRule.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailCatchAllRule>() {
           @Override
           public void write(JsonWriter out, EmailCatchAllRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailCatchAllRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EmailCatchAllRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmailCatchAllRule
  * @throws IOException if the JSON string is invalid with respect to EmailCatchAllRule
  */
  public static EmailCatchAllRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailCatchAllRule.class);
  }

 /**
  * Convert an instance of EmailCatchAllRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

