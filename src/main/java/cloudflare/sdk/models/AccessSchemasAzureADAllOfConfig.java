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
 * AccessSchemasAzureADAllOfConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessSchemasAzureADAllOfConfig {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_CONDITIONAL_ACCESS_ENABLED = "conditional_access_enabled";
  @SerializedName(SERIALIZED_NAME_CONDITIONAL_ACCESS_ENABLED)
  private Boolean conditionalAccessEnabled;

  public static final String SERIALIZED_NAME_DIRECTORY_ID = "directory_id";
  @SerializedName(SERIALIZED_NAME_DIRECTORY_ID)
  private String directoryId;

  /**
   * Indicates the type of user interaction that is required. prompt&#x3D;login forces the user to enter their credentials on that request, negating single-sign on. prompt&#x3D;none is the opposite. It ensures that the user isn&#39;t presented with any interactive prompt. If the request can&#39;t be completed silently by using single-sign on, the Microsoft identity platform returns an interaction_required error. prompt&#x3D;select_account interrupts single sign-on providing account selection experience listing all the accounts either in session or any remembered account or an option to choose to use a different account altogether.
   */
  @JsonAdapter(PromptEnum.Adapter.class)
  public enum PromptEnum {
    LOGIN("login"),
    
    SELECT_ACCOUNT("select_account"),
    
    NONE("none");

    private String value;

    PromptEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PromptEnum fromValue(String value) {
      for (PromptEnum b : PromptEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PromptEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PromptEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PromptEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PromptEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PromptEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PROMPT = "prompt";
  @SerializedName(SERIALIZED_NAME_PROMPT)
  private PromptEnum prompt;

  public static final String SERIALIZED_NAME_SUPPORT_GROUPS = "support_groups";
  @SerializedName(SERIALIZED_NAME_SUPPORT_GROUPS)
  private Boolean supportGroups;

  public AccessSchemasAzureADAllOfConfig() {
  }

  public AccessSchemasAzureADAllOfConfig clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Your OAuth Client ID
   * @return clientId
  **/
  @javax.annotation.Nullable
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public AccessSchemasAzureADAllOfConfig clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Your OAuth Client Secret
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public AccessSchemasAzureADAllOfConfig conditionalAccessEnabled(Boolean conditionalAccessEnabled) {
    this.conditionalAccessEnabled = conditionalAccessEnabled;
    return this;
  }

   /**
   * Should Cloudflare try to load authentication contexts from your account
   * @return conditionalAccessEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getConditionalAccessEnabled() {
    return conditionalAccessEnabled;
  }

  public void setConditionalAccessEnabled(Boolean conditionalAccessEnabled) {
    this.conditionalAccessEnabled = conditionalAccessEnabled;
  }


  public AccessSchemasAzureADAllOfConfig directoryId(String directoryId) {
    this.directoryId = directoryId;
    return this;
  }

   /**
   * Your Azure directory uuid
   * @return directoryId
  **/
  @javax.annotation.Nullable
  public String getDirectoryId() {
    return directoryId;
  }

  public void setDirectoryId(String directoryId) {
    this.directoryId = directoryId;
  }


  public AccessSchemasAzureADAllOfConfig prompt(PromptEnum prompt) {
    this.prompt = prompt;
    return this;
  }

   /**
   * Indicates the type of user interaction that is required. prompt&#x3D;login forces the user to enter their credentials on that request, negating single-sign on. prompt&#x3D;none is the opposite. It ensures that the user isn&#39;t presented with any interactive prompt. If the request can&#39;t be completed silently by using single-sign on, the Microsoft identity platform returns an interaction_required error. prompt&#x3D;select_account interrupts single sign-on providing account selection experience listing all the accounts either in session or any remembered account or an option to choose to use a different account altogether.
   * @return prompt
  **/
  @javax.annotation.Nullable
  public PromptEnum getPrompt() {
    return prompt;
  }

  public void setPrompt(PromptEnum prompt) {
    this.prompt = prompt;
  }


  public AccessSchemasAzureADAllOfConfig supportGroups(Boolean supportGroups) {
    this.supportGroups = supportGroups;
    return this;
  }

   /**
   * Should Cloudflare try to load groups from your account
   * @return supportGroups
  **/
  @javax.annotation.Nullable
  public Boolean getSupportGroups() {
    return supportGroups;
  }

  public void setSupportGroups(Boolean supportGroups) {
    this.supportGroups = supportGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessSchemasAzureADAllOfConfig accessSchemasAzureADAllOfConfig = (AccessSchemasAzureADAllOfConfig) o;
    return Objects.equals(this.clientId, accessSchemasAzureADAllOfConfig.clientId) &&
        Objects.equals(this.clientSecret, accessSchemasAzureADAllOfConfig.clientSecret) &&
        Objects.equals(this.conditionalAccessEnabled, accessSchemasAzureADAllOfConfig.conditionalAccessEnabled) &&
        Objects.equals(this.directoryId, accessSchemasAzureADAllOfConfig.directoryId) &&
        Objects.equals(this.prompt, accessSchemasAzureADAllOfConfig.prompt) &&
        Objects.equals(this.supportGroups, accessSchemasAzureADAllOfConfig.supportGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, conditionalAccessEnabled, directoryId, prompt, supportGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessSchemasAzureADAllOfConfig {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    conditionalAccessEnabled: ").append(toIndentedString(conditionalAccessEnabled)).append("\n");
    sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    supportGroups: ").append(toIndentedString(supportGroups)).append("\n");
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
    openapiFields.add("client_id");
    openapiFields.add("client_secret");
    openapiFields.add("conditional_access_enabled");
    openapiFields.add("directory_id");
    openapiFields.add("prompt");
    openapiFields.add("support_groups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessSchemasAzureADAllOfConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessSchemasAzureADAllOfConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessSchemasAzureADAllOfConfig is not found in the empty JSON string", AccessSchemasAzureADAllOfConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessSchemasAzureADAllOfConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessSchemasAzureADAllOfConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("client_id") != null && !jsonObj.get("client_id").isJsonNull()) && !jsonObj.get("client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_id").toString()));
      }
      if ((jsonObj.get("client_secret") != null && !jsonObj.get("client_secret").isJsonNull()) && !jsonObj.get("client_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_secret").toString()));
      }
      if ((jsonObj.get("directory_id") != null && !jsonObj.get("directory_id").isJsonNull()) && !jsonObj.get("directory_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `directory_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("directory_id").toString()));
      }
      if ((jsonObj.get("prompt") != null && !jsonObj.get("prompt").isJsonNull()) && !jsonObj.get("prompt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prompt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prompt").toString()));
      }
      // validate the optional field `prompt`
      if (jsonObj.get("prompt") != null && !jsonObj.get("prompt").isJsonNull()) {
        PromptEnum.validateJsonElement(jsonObj.get("prompt"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessSchemasAzureADAllOfConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessSchemasAzureADAllOfConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessSchemasAzureADAllOfConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessSchemasAzureADAllOfConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessSchemasAzureADAllOfConfig>() {
           @Override
           public void write(JsonWriter out, AccessSchemasAzureADAllOfConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessSchemasAzureADAllOfConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessSchemasAzureADAllOfConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessSchemasAzureADAllOfConfig
  * @throws IOException if the JSON string is invalid with respect to AccessSchemasAzureADAllOfConfig
  */
  public static AccessSchemasAzureADAllOfConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessSchemasAzureADAllOfConfig.class);
  }

 /**
  * Convert an instance of AccessSchemasAzureADAllOfConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

