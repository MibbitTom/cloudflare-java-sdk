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
import cloudflare.sdk.models.AccessDevicePostureCheck;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * AccessSchemasDevicePostureRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessSchemasDevicePostureRule {
  public static final String SERIALIZED_NAME_CHECK = "check";
  @SerializedName(SERIALIZED_NAME_CHECK)
  private AccessDevicePostureCheck check;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RULE_NAME = "rule_name";
  @SerializedName(SERIALIZED_NAME_RULE_NAME)
  private String ruleName;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AccessSchemasDevicePostureRule() {
  }

  public AccessSchemasDevicePostureRule check(AccessDevicePostureCheck check) {
    this.check = check;
    return this;
  }

   /**
   * Get check
   * @return check
  **/
  @javax.annotation.Nullable
  public AccessDevicePostureCheck getCheck() {
    return check;
  }

  public void setCheck(AccessDevicePostureCheck check) {
    this.check = check;
  }


  public AccessSchemasDevicePostureRule data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }


  public AccessSchemasDevicePostureRule description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public AccessSchemasDevicePostureRule error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  public AccessSchemasDevicePostureRule id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public AccessSchemasDevicePostureRule ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Get ruleName
   * @return ruleName
  **/
  @javax.annotation.Nullable
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public AccessSchemasDevicePostureRule success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public AccessSchemasDevicePostureRule timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public AccessSchemasDevicePostureRule type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessSchemasDevicePostureRule accessSchemasDevicePostureRule = (AccessSchemasDevicePostureRule) o;
    return Objects.equals(this.check, accessSchemasDevicePostureRule.check) &&
        Objects.equals(this.data, accessSchemasDevicePostureRule.data) &&
        Objects.equals(this.description, accessSchemasDevicePostureRule.description) &&
        Objects.equals(this.error, accessSchemasDevicePostureRule.error) &&
        Objects.equals(this.id, accessSchemasDevicePostureRule.id) &&
        Objects.equals(this.ruleName, accessSchemasDevicePostureRule.ruleName) &&
        Objects.equals(this.success, accessSchemasDevicePostureRule.success) &&
        Objects.equals(this.timestamp, accessSchemasDevicePostureRule.timestamp) &&
        Objects.equals(this.type, accessSchemasDevicePostureRule.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(check, data, description, error, id, ruleName, success, timestamp, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessSchemasDevicePostureRule {\n");
    sb.append("    check: ").append(toIndentedString(check)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("check");
    openapiFields.add("data");
    openapiFields.add("description");
    openapiFields.add("error");
    openapiFields.add("id");
    openapiFields.add("rule_name");
    openapiFields.add("success");
    openapiFields.add("timestamp");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessSchemasDevicePostureRule
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessSchemasDevicePostureRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessSchemasDevicePostureRule is not found in the empty JSON string", AccessSchemasDevicePostureRule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessSchemasDevicePostureRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessSchemasDevicePostureRule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `check`
      if (jsonObj.get("check") != null && !jsonObj.get("check").isJsonNull()) {
        AccessDevicePostureCheck.validateJsonElement(jsonObj.get("check"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("rule_name") != null && !jsonObj.get("rule_name").isJsonNull()) && !jsonObj.get("rule_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_name").toString()));
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessSchemasDevicePostureRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessSchemasDevicePostureRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessSchemasDevicePostureRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessSchemasDevicePostureRule.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessSchemasDevicePostureRule>() {
           @Override
           public void write(JsonWriter out, AccessSchemasDevicePostureRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessSchemasDevicePostureRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessSchemasDevicePostureRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessSchemasDevicePostureRule
  * @throws IOException if the JSON string is invalid with respect to AccessSchemasDevicePostureRule
  */
  public static AccessSchemasDevicePostureRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessSchemasDevicePostureRule.class);
  }

 /**
  * Convert an instance of AccessSchemasDevicePostureRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

