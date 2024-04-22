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
import java.util.Arrays;
import org.openapitools.client.model.FirewallCacheRulesComponentsSchemasActionParameters;
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

import org.openapitools.client.JSON;

/**
 * FirewallCacheRulesComponentsSchemasRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class FirewallCacheRulesComponentsSchemasRule {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private Object action = null;

  public static final String SERIALIZED_NAME_ACTION_PARAMETERS = "action_parameters";
  @SerializedName(SERIALIZED_NAME_ACTION_PARAMETERS)
  private FirewallCacheRulesComponentsSchemasActionParameters actionParameters;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private Object description = null;

  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private Object expression = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Object id = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Object version = null;

  public FirewallCacheRulesComponentsSchemasRule() {
  }

  public FirewallCacheRulesComponentsSchemasRule action(Object action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  public Object getAction() {
    return action;
  }

  public void setAction(Object action) {
    this.action = action;
  }


  public FirewallCacheRulesComponentsSchemasRule actionParameters(FirewallCacheRulesComponentsSchemasActionParameters actionParameters) {
    this.actionParameters = actionParameters;
    return this;
  }

   /**
   * Get actionParameters
   * @return actionParameters
  **/
  @javax.annotation.Nullable
  public FirewallCacheRulesComponentsSchemasActionParameters getActionParameters() {
    return actionParameters;
  }

  public void setActionParameters(FirewallCacheRulesComponentsSchemasActionParameters actionParameters) {
    this.actionParameters = actionParameters;
  }


  public FirewallCacheRulesComponentsSchemasRule description(Object description) {
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


  public FirewallCacheRulesComponentsSchemasRule expression(Object expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Get expression
   * @return expression
  **/
  @javax.annotation.Nullable
  public Object getExpression() {
    return expression;
  }

  public void setExpression(Object expression) {
    this.expression = expression;
  }


  public FirewallCacheRulesComponentsSchemasRule id(Object id) {
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


  public FirewallCacheRulesComponentsSchemasRule version(Object version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  public Object getVersion() {
    return version;
  }

  public void setVersion(Object version) {
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
    FirewallCacheRulesComponentsSchemasRule firewallCacheRulesComponentsSchemasRule = (FirewallCacheRulesComponentsSchemasRule) o;
    return Objects.equals(this.action, firewallCacheRulesComponentsSchemasRule.action) &&
        Objects.equals(this.actionParameters, firewallCacheRulesComponentsSchemasRule.actionParameters) &&
        Objects.equals(this.description, firewallCacheRulesComponentsSchemasRule.description) &&
        Objects.equals(this.expression, firewallCacheRulesComponentsSchemasRule.expression) &&
        Objects.equals(this.id, firewallCacheRulesComponentsSchemasRule.id) &&
        Objects.equals(this.version, firewallCacheRulesComponentsSchemasRule.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, actionParameters, description, expression, id, version);
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
    sb.append("class FirewallCacheRulesComponentsSchemasRule {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionParameters: ").append(toIndentedString(actionParameters)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("action_parameters");
    openapiFields.add("description");
    openapiFields.add("expression");
    openapiFields.add("id");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FirewallCacheRulesComponentsSchemasRule
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FirewallCacheRulesComponentsSchemasRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FirewallCacheRulesComponentsSchemasRule is not found in the empty JSON string", FirewallCacheRulesComponentsSchemasRule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FirewallCacheRulesComponentsSchemasRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FirewallCacheRulesComponentsSchemasRule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `action_parameters`
      if (jsonObj.get("action_parameters") != null && !jsonObj.get("action_parameters").isJsonNull()) {
        FirewallCacheRulesComponentsSchemasActionParameters.validateJsonElement(jsonObj.get("action_parameters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FirewallCacheRulesComponentsSchemasRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FirewallCacheRulesComponentsSchemasRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FirewallCacheRulesComponentsSchemasRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FirewallCacheRulesComponentsSchemasRule.class));

       return (TypeAdapter<T>) new TypeAdapter<FirewallCacheRulesComponentsSchemasRule>() {
           @Override
           public void write(JsonWriter out, FirewallCacheRulesComponentsSchemasRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FirewallCacheRulesComponentsSchemasRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FirewallCacheRulesComponentsSchemasRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FirewallCacheRulesComponentsSchemasRule
  * @throws IOException if the JSON string is invalid with respect to FirewallCacheRulesComponentsSchemasRule
  */
  public static FirewallCacheRulesComponentsSchemasRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FirewallCacheRulesComponentsSchemasRule.class);
  }

 /**
  * Convert an instance of FirewallCacheRulesComponentsSchemasRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

