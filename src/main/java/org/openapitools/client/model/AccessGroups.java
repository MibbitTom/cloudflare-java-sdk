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
import org.openapitools.client.model.AccessRule;

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
 * AccessGroups
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessGroups {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EXCLUDE = "exclude";
  @SerializedName(SERIALIZED_NAME_EXCLUDE)
  private List<AccessRule> exclude = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INCLUDE = "include";
  @SerializedName(SERIALIZED_NAME_INCLUDE)
  private List<AccessRule> include = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private List<AccessRule> isDefault = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REQUIRE = "require";
  @SerializedName(SERIALIZED_NAME_REQUIRE)
  private List<AccessRule> require = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public AccessGroups() {
  }

  public AccessGroups(
     OffsetDateTime createdAt, 
     String id, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.id = id;
    this.updatedAt = updatedAt;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  public AccessGroups exclude(List<AccessRule> exclude) {
    this.exclude = exclude;
    return this;
  }

  public AccessGroups addExcludeItem(AccessRule excludeItem) {
    if (this.exclude == null) {
      this.exclude = new ArrayList<>();
    }
    this.exclude.add(excludeItem);
    return this;
  }

   /**
   * Rules evaluated with a NOT logical operator. To match a policy, a user cannot meet any of the Exclude rules.
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



  public AccessGroups include(List<AccessRule> include) {
    this.include = include;
    return this;
  }

  public AccessGroups addIncludeItem(AccessRule includeItem) {
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


  public AccessGroups isDefault(List<AccessRule> isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  public AccessGroups addIsDefaultItem(AccessRule isDefaultItem) {
    if (this.isDefault == null) {
      this.isDefault = new ArrayList<>();
    }
    this.isDefault.add(isDefaultItem);
    return this;
  }

   /**
   * Rules evaluated with an AND logical operator. To match a policy, a user must meet all of the Require rules.
   * @return isDefault
  **/
  @javax.annotation.Nullable
  public List<AccessRule> getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(List<AccessRule> isDefault) {
    this.isDefault = isDefault;
  }


  public AccessGroups name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the Access group.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccessGroups require(List<AccessRule> require) {
    this.require = require;
    return this;
  }

  public AccessGroups addRequireItem(AccessRule requireItem) {
    if (this.require == null) {
      this.require = new ArrayList<>();
    }
    this.require.add(requireItem);
    return this;
  }

   /**
   * Rules evaluated with an AND logical operator. To match a policy, a user must meet all of the Require rules.
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
    AccessGroups accessGroups = (AccessGroups) o;
    return Objects.equals(this.createdAt, accessGroups.createdAt) &&
        Objects.equals(this.exclude, accessGroups.exclude) &&
        Objects.equals(this.id, accessGroups.id) &&
        Objects.equals(this.include, accessGroups.include) &&
        Objects.equals(this.isDefault, accessGroups.isDefault) &&
        Objects.equals(this.name, accessGroups.name) &&
        Objects.equals(this.require, accessGroups.require) &&
        Objects.equals(this.updatedAt, accessGroups.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, exclude, id, include, isDefault, name, require, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessGroups {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("exclude");
    openapiFields.add("id");
    openapiFields.add("include");
    openapiFields.add("is_default");
    openapiFields.add("name");
    openapiFields.add("require");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessGroups
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessGroups.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessGroups is not found in the empty JSON string", AccessGroups.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessGroups.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessGroups` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      if (jsonObj.get("is_default") != null && !jsonObj.get("is_default").isJsonNull()) {
        JsonArray jsonArrayisDefault = jsonObj.getAsJsonArray("is_default");
        if (jsonArrayisDefault != null) {
          // ensure the json data is an array
          if (!jsonObj.get("is_default").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `is_default` to be an array in the JSON string but got `%s`", jsonObj.get("is_default").toString()));
          }

          // validate the optional field `is_default` (array)
          for (int i = 0; i < jsonArrayisDefault.size(); i++) {
            AccessRule.validateJsonElement(jsonArrayisDefault.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
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
       if (!AccessGroups.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessGroups' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessGroups> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessGroups.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessGroups>() {
           @Override
           public void write(JsonWriter out, AccessGroups value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessGroups read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessGroups given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessGroups
  * @throws IOException if the JSON string is invalid with respect to AccessGroups
  */
  public static AccessGroups fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessGroups.class);
  }

 /**
  * Convert an instance of AccessGroups to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

