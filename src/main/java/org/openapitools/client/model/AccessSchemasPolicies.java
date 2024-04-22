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
import org.openapitools.client.model.AccessDecision;
import org.openapitools.client.model.AccessRule;
import org.openapitools.client.model.AccessSchemasApprovalGroup;

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
 * AccessSchemasPolicies
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessSchemasPolicies {
  public static final String SERIALIZED_NAME_APPROVAL_GROUPS = "approval_groups";
  @SerializedName(SERIALIZED_NAME_APPROVAL_GROUPS)
  private List<AccessSchemasApprovalGroup> approvalGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPROVAL_REQUIRED = "approval_required";
  @SerializedName(SERIALIZED_NAME_APPROVAL_REQUIRED)
  private Boolean approvalRequired = false;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DECISION = "decision";
  @SerializedName(SERIALIZED_NAME_DECISION)
  private AccessDecision decision;

  public static final String SERIALIZED_NAME_EXCLUDE = "exclude";
  @SerializedName(SERIALIZED_NAME_EXCLUDE)
  private List<AccessRule> exclude = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INCLUDE = "include";
  @SerializedName(SERIALIZED_NAME_INCLUDE)
  private List<AccessRule> include = new ArrayList<>();

  public static final String SERIALIZED_NAME_ISOLATION_REQUIRED = "isolation_required";
  @SerializedName(SERIALIZED_NAME_ISOLATION_REQUIRED)
  private Boolean isolationRequired = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRECEDENCE = "precedence";
  @SerializedName(SERIALIZED_NAME_PRECEDENCE)
  private Integer precedence;

  public static final String SERIALIZED_NAME_PURPOSE_JUSTIFICATION_PROMPT = "purpose_justification_prompt";
  @SerializedName(SERIALIZED_NAME_PURPOSE_JUSTIFICATION_PROMPT)
  private String purposeJustificationPrompt;

  public static final String SERIALIZED_NAME_PURPOSE_JUSTIFICATION_REQUIRED = "purpose_justification_required";
  @SerializedName(SERIALIZED_NAME_PURPOSE_JUSTIFICATION_REQUIRED)
  private Boolean purposeJustificationRequired = false;

  public static final String SERIALIZED_NAME_REQUIRE = "require";
  @SerializedName(SERIALIZED_NAME_REQUIRE)
  private List<AccessRule> require = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public AccessSchemasPolicies() {
  }

  public AccessSchemasPolicies(
     OffsetDateTime createdAt, 
     String id, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.id = id;
    this.updatedAt = updatedAt;
  }

  public AccessSchemasPolicies approvalGroups(List<AccessSchemasApprovalGroup> approvalGroups) {
    this.approvalGroups = approvalGroups;
    return this;
  }

  public AccessSchemasPolicies addApprovalGroupsItem(AccessSchemasApprovalGroup approvalGroupsItem) {
    if (this.approvalGroups == null) {
      this.approvalGroups = new ArrayList<>();
    }
    this.approvalGroups.add(approvalGroupsItem);
    return this;
  }

   /**
   * Administrators who can approve a temporary authentication request.
   * @return approvalGroups
  **/
  @javax.annotation.Nullable
  public List<AccessSchemasApprovalGroup> getApprovalGroups() {
    return approvalGroups;
  }

  public void setApprovalGroups(List<AccessSchemasApprovalGroup> approvalGroups) {
    this.approvalGroups = approvalGroups;
  }


  public AccessSchemasPolicies approvalRequired(Boolean approvalRequired) {
    this.approvalRequired = approvalRequired;
    return this;
  }

   /**
   * Requires the user to request access from an administrator at the start of each session.
   * @return approvalRequired
  **/
  @javax.annotation.Nullable
  public Boolean getApprovalRequired() {
    return approvalRequired;
  }

  public void setApprovalRequired(Boolean approvalRequired) {
    this.approvalRequired = approvalRequired;
  }


   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  public AccessSchemasPolicies decision(AccessDecision decision) {
    this.decision = decision;
    return this;
  }

   /**
   * Get decision
   * @return decision
  **/
  @javax.annotation.Nullable
  public AccessDecision getDecision() {
    return decision;
  }

  public void setDecision(AccessDecision decision) {
    this.decision = decision;
  }


  public AccessSchemasPolicies exclude(List<AccessRule> exclude) {
    this.exclude = exclude;
    return this;
  }

  public AccessSchemasPolicies addExcludeItem(AccessRule excludeItem) {
    if (this.exclude == null) {
      this.exclude = new ArrayList<>();
    }
    this.exclude.add(excludeItem);
    return this;
  }

   /**
   * Rules evaluated with a NOT logical operator. To match the policy, a user cannot meet any of the Exclude rules.
   * @return exclude
  **/
  @javax.annotation.Nullable
  public List<AccessRule> getExclude() {
    return exclude;
  }

  public void setExclude(List<AccessRule> exclude) {
    this.exclude = exclude;
  }


   /**
   * UUID
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public AccessSchemasPolicies include(List<AccessRule> include) {
    this.include = include;
    return this;
  }

  public AccessSchemasPolicies addIncludeItem(AccessRule includeItem) {
    if (this.include == null) {
      this.include = new ArrayList<>();
    }
    this.include.add(includeItem);
    return this;
  }

   /**
   * Rules evaluated with an OR logical operator. A user needs to meet only one of the Include rules.
   * @return include
  **/
  @javax.annotation.Nullable
  public List<AccessRule> getInclude() {
    return include;
  }

  public void setInclude(List<AccessRule> include) {
    this.include = include;
  }


  public AccessSchemasPolicies isolationRequired(Boolean isolationRequired) {
    this.isolationRequired = isolationRequired;
    return this;
  }

   /**
   * Require this application to be served in an isolated browser for users matching this policy.
   * @return isolationRequired
  **/
  @javax.annotation.Nullable
  public Boolean getIsolationRequired() {
    return isolationRequired;
  }

  public void setIsolationRequired(Boolean isolationRequired) {
    this.isolationRequired = isolationRequired;
  }


  public AccessSchemasPolicies name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the Access policy.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccessSchemasPolicies precedence(Integer precedence) {
    this.precedence = precedence;
    return this;
  }

   /**
   * The order of execution for this policy. Must be unique for each policy.
   * @return precedence
  **/
  @javax.annotation.Nullable
  public Integer getPrecedence() {
    return precedence;
  }

  public void setPrecedence(Integer precedence) {
    this.precedence = precedence;
  }


  public AccessSchemasPolicies purposeJustificationPrompt(String purposeJustificationPrompt) {
    this.purposeJustificationPrompt = purposeJustificationPrompt;
    return this;
  }

   /**
   * A custom message that will appear on the purpose justification screen.
   * @return purposeJustificationPrompt
  **/
  @javax.annotation.Nullable
  public String getPurposeJustificationPrompt() {
    return purposeJustificationPrompt;
  }

  public void setPurposeJustificationPrompt(String purposeJustificationPrompt) {
    this.purposeJustificationPrompt = purposeJustificationPrompt;
  }


  public AccessSchemasPolicies purposeJustificationRequired(Boolean purposeJustificationRequired) {
    this.purposeJustificationRequired = purposeJustificationRequired;
    return this;
  }

   /**
   * Require users to enter a justification when they log in to the application.
   * @return purposeJustificationRequired
  **/
  @javax.annotation.Nullable
  public Boolean getPurposeJustificationRequired() {
    return purposeJustificationRequired;
  }

  public void setPurposeJustificationRequired(Boolean purposeJustificationRequired) {
    this.purposeJustificationRequired = purposeJustificationRequired;
  }


  public AccessSchemasPolicies require(List<AccessRule> require) {
    this.require = require;
    return this;
  }

  public AccessSchemasPolicies addRequireItem(AccessRule requireItem) {
    if (this.require == null) {
      this.require = new ArrayList<>();
    }
    this.require.add(requireItem);
    return this;
  }

   /**
   * Rules evaluated with an AND logical operator. To match the policy, a user must meet all of the Require rules.
   * @return require
  **/
  @javax.annotation.Nullable
  public List<AccessRule> getRequire() {
    return require;
  }

  public void setRequire(List<AccessRule> require) {
    this.require = require;
  }


   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessSchemasPolicies accessSchemasPolicies = (AccessSchemasPolicies) o;
    return Objects.equals(this.approvalGroups, accessSchemasPolicies.approvalGroups) &&
        Objects.equals(this.approvalRequired, accessSchemasPolicies.approvalRequired) &&
        Objects.equals(this.createdAt, accessSchemasPolicies.createdAt) &&
        Objects.equals(this.decision, accessSchemasPolicies.decision) &&
        Objects.equals(this.exclude, accessSchemasPolicies.exclude) &&
        Objects.equals(this.id, accessSchemasPolicies.id) &&
        Objects.equals(this.include, accessSchemasPolicies.include) &&
        Objects.equals(this.isolationRequired, accessSchemasPolicies.isolationRequired) &&
        Objects.equals(this.name, accessSchemasPolicies.name) &&
        Objects.equals(this.precedence, accessSchemasPolicies.precedence) &&
        Objects.equals(this.purposeJustificationPrompt, accessSchemasPolicies.purposeJustificationPrompt) &&
        Objects.equals(this.purposeJustificationRequired, accessSchemasPolicies.purposeJustificationRequired) &&
        Objects.equals(this.require, accessSchemasPolicies.require) &&
        Objects.equals(this.updatedAt, accessSchemasPolicies.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalGroups, approvalRequired, createdAt, decision, exclude, id, include, isolationRequired, name, precedence, purposeJustificationPrompt, purposeJustificationRequired, require, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessSchemasPolicies {\n");
    sb.append("    approvalGroups: ").append(toIndentedString(approvalGroups)).append("\n");
    sb.append("    approvalRequired: ").append(toIndentedString(approvalRequired)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    isolationRequired: ").append(toIndentedString(isolationRequired)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    precedence: ").append(toIndentedString(precedence)).append("\n");
    sb.append("    purposeJustificationPrompt: ").append(toIndentedString(purposeJustificationPrompt)).append("\n");
    sb.append("    purposeJustificationRequired: ").append(toIndentedString(purposeJustificationRequired)).append("\n");
    sb.append("    require: ").append(toIndentedString(require)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("approval_groups");
    openapiFields.add("approval_required");
    openapiFields.add("created_at");
    openapiFields.add("decision");
    openapiFields.add("exclude");
    openapiFields.add("id");
    openapiFields.add("include");
    openapiFields.add("isolation_required");
    openapiFields.add("name");
    openapiFields.add("precedence");
    openapiFields.add("purpose_justification_prompt");
    openapiFields.add("purpose_justification_required");
    openapiFields.add("require");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessSchemasPolicies
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessSchemasPolicies.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessSchemasPolicies is not found in the empty JSON string", AccessSchemasPolicies.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessSchemasPolicies.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessSchemasPolicies` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("approval_groups") != null && !jsonObj.get("approval_groups").isJsonNull()) {
        JsonArray jsonArrayapprovalGroups = jsonObj.getAsJsonArray("approval_groups");
        if (jsonArrayapprovalGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("approval_groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `approval_groups` to be an array in the JSON string but got `%s`", jsonObj.get("approval_groups").toString()));
          }

          // validate the optional field `approval_groups` (array)
          for (int i = 0; i < jsonArrayapprovalGroups.size(); i++) {
            AccessSchemasApprovalGroup.validateJsonElement(jsonArrayapprovalGroups.get(i));
          };
        }
      }
      // validate the optional field `decision`
      if (jsonObj.get("decision") != null && !jsonObj.get("decision").isJsonNull()) {
        AccessDecision.validateJsonElement(jsonObj.get("decision"));
      }
      if (jsonObj.get("exclude") != null && !jsonObj.get("exclude").isJsonNull()) {
        JsonArray jsonArrayexclude = jsonObj.getAsJsonArray("exclude");
        if (jsonArrayexclude != null) {
          // ensure the json data is an array
          if (!jsonObj.get("exclude").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `exclude` to be an array in the JSON string but got `%s`", jsonObj.get("exclude").toString()));
          }

          // validate the optional field `exclude` (array)
          for (int i = 0; i < jsonArrayexclude.size(); i++) {
            AccessRule.validateJsonElement(jsonArrayexclude.get(i));
          };
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("include") != null && !jsonObj.get("include").isJsonNull()) {
        JsonArray jsonArrayinclude = jsonObj.getAsJsonArray("include");
        if (jsonArrayinclude != null) {
          // ensure the json data is an array
          if (!jsonObj.get("include").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `include` to be an array in the JSON string but got `%s`", jsonObj.get("include").toString()));
          }

          // validate the optional field `include` (array)
          for (int i = 0; i < jsonArrayinclude.size(); i++) {
            AccessRule.validateJsonElement(jsonArrayinclude.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("purpose_justification_prompt") != null && !jsonObj.get("purpose_justification_prompt").isJsonNull()) && !jsonObj.get("purpose_justification_prompt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purpose_justification_prompt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purpose_justification_prompt").toString()));
      }
      if (jsonObj.get("require") != null && !jsonObj.get("require").isJsonNull()) {
        JsonArray jsonArrayrequire = jsonObj.getAsJsonArray("require");
        if (jsonArrayrequire != null) {
          // ensure the json data is an array
          if (!jsonObj.get("require").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `require` to be an array in the JSON string but got `%s`", jsonObj.get("require").toString()));
          }

          // validate the optional field `require` (array)
          for (int i = 0; i < jsonArrayrequire.size(); i++) {
            AccessRule.validateJsonElement(jsonArrayrequire.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessSchemasPolicies.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessSchemasPolicies' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessSchemasPolicies> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessSchemasPolicies.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessSchemasPolicies>() {
           @Override
           public void write(JsonWriter out, AccessSchemasPolicies value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessSchemasPolicies read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessSchemasPolicies given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessSchemasPolicies
  * @throws IOException if the JSON string is invalid with respect to AccessSchemasPolicies
  */
  public static AccessSchemasPolicies fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessSchemasPolicies.class);
  }

 /**
  * Convert an instance of AccessSchemasPolicies to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

