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
import cloudflare.sdk.models.WafManagedRulesBaseGroup;
import cloudflare.sdk.models.WafManagedRulesModeAllowTraditional;
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
 * When triggered, traditional WAF rules cause the firewall to immediately act on the request based on the rule configuration. An &#39;allow&#39; rule will immediately allow the request and no other rules will be processed.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class WafManagedRulesTraditionalAllowRule {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private WafManagedRulesBaseGroup group;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private String packageId;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private String priority;

  public static final String SERIALIZED_NAME_ALLOWED_MODES = "allowed_modes";
  @SerializedName(SERIALIZED_NAME_ALLOWED_MODES)
  private List<WafManagedRulesModeAllowTraditional> allowedModes = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private WafManagedRulesModeAllowTraditional mode;

  public WafManagedRulesTraditionalAllowRule() {
  }

  public WafManagedRulesTraditionalAllowRule(
     String description, 
     String id, 
     String packageId, 
     String priority, 
     List<WafManagedRulesModeAllowTraditional> allowedModes
  ) {
    this();
    this.description = description;
    this.id = id;
    this.packageId = packageId;
    this.priority = priority;
    this.allowedModes = allowedModes;
  }

   /**
   * The public description of the WAF rule.
   * @return description
  **/
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }



  public WafManagedRulesTraditionalAllowRule group(WafManagedRulesBaseGroup group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nonnull
  public WafManagedRulesBaseGroup getGroup() {
    return group;
  }

  public void setGroup(WafManagedRulesBaseGroup group) {
    this.group = group;
  }


   /**
   * The unique identifier of the WAF rule.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }



   /**
   * The unique identifier of a WAF package.
   * @return packageId
  **/
  @javax.annotation.Nonnull
  public String getPackageId() {
    return packageId;
  }



   /**
   * The order in which the individual WAF rule is executed within its rule group.
   * @return priority
  **/
  @javax.annotation.Nonnull
  public String getPriority() {
    return priority;
  }



   /**
   * Defines the available modes for the current WAF rule.
   * @return allowedModes
  **/
  @javax.annotation.Nonnull
  public List<WafManagedRulesModeAllowTraditional> getAllowedModes() {
    return allowedModes;
  }



  public WafManagedRulesTraditionalAllowRule mode(WafManagedRulesModeAllowTraditional mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nonnull
  public WafManagedRulesModeAllowTraditional getMode() {
    return mode;
  }

  public void setMode(WafManagedRulesModeAllowTraditional mode) {
    this.mode = mode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafManagedRulesTraditionalAllowRule wafManagedRulesTraditionalAllowRule = (WafManagedRulesTraditionalAllowRule) o;
    return Objects.equals(this.description, wafManagedRulesTraditionalAllowRule.description) &&
        Objects.equals(this.group, wafManagedRulesTraditionalAllowRule.group) &&
        Objects.equals(this.id, wafManagedRulesTraditionalAllowRule.id) &&
        Objects.equals(this.packageId, wafManagedRulesTraditionalAllowRule.packageId) &&
        Objects.equals(this.priority, wafManagedRulesTraditionalAllowRule.priority) &&
        Objects.equals(this.allowedModes, wafManagedRulesTraditionalAllowRule.allowedModes) &&
        Objects.equals(this.mode, wafManagedRulesTraditionalAllowRule.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, group, id, packageId, priority, allowedModes, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafManagedRulesTraditionalAllowRule {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    allowedModes: ").append(toIndentedString(allowedModes)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
    openapiFields.add("group");
    openapiFields.add("id");
    openapiFields.add("package_id");
    openapiFields.add("priority");
    openapiFields.add("allowed_modes");
    openapiFields.add("mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("group");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("package_id");
    openapiRequiredFields.add("priority");
    openapiRequiredFields.add("allowed_modes");
    openapiRequiredFields.add("mode");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WafManagedRulesTraditionalAllowRule
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WafManagedRulesTraditionalAllowRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WafManagedRulesTraditionalAllowRule is not found in the empty JSON string", WafManagedRulesTraditionalAllowRule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WafManagedRulesTraditionalAllowRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WafManagedRulesTraditionalAllowRule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WafManagedRulesTraditionalAllowRule.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `group`
      WafManagedRulesBaseGroup.validateJsonElement(jsonObj.get("group"));
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("package_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_id").toString()));
      }
      if (!jsonObj.get("priority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priority").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("allowed_modes") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("allowed_modes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_modes` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_modes").toString()));
      }
      // validate the required field `mode`
      WafManagedRulesModeAllowTraditional.validateJsonElement(jsonObj.get("mode"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WafManagedRulesTraditionalAllowRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WafManagedRulesTraditionalAllowRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WafManagedRulesTraditionalAllowRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WafManagedRulesTraditionalAllowRule.class));

       return (TypeAdapter<T>) new TypeAdapter<WafManagedRulesTraditionalAllowRule>() {
           @Override
           public void write(JsonWriter out, WafManagedRulesTraditionalAllowRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WafManagedRulesTraditionalAllowRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WafManagedRulesTraditionalAllowRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WafManagedRulesTraditionalAllowRule
  * @throws IOException if the JSON string is invalid with respect to WafManagedRulesTraditionalAllowRule
  */
  public static WafManagedRulesTraditionalAllowRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WafManagedRulesTraditionalAllowRule.class);
  }

 /**
  * Convert an instance of WafManagedRulesTraditionalAllowRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
