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
import cloudflare.sdk.models.AccessSchemasIdentityProviderScimConfig;
import cloudflare.sdk.models.AccessSchemasOidcAllOfConfig;
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
 * AccessSchemasOidc
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessSchemasOidc {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private AccessSchemasOidcAllOfConfig config;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCIM_CONFIG = "scim_config";
  @SerializedName(SERIALIZED_NAME_SCIM_CONFIG)
  private AccessSchemasIdentityProviderScimConfig scimConfig;

  /**
   * The type of identity provider. To determine the value for a specific provider, refer to our [developer documentation](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration/).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ONETIMEPIN("onetimepin"),
    
    AZUREAD("azureAD"),
    
    SAML("saml"),
    
    CENTRIFY("centrify"),
    
    FACEBOOK("facebook"),
    
    GITHUB("github"),
    
    GOOGLE_APPS("google-apps"),
    
    GOOGLE("google"),
    
    LINKEDIN("linkedin"),
    
    OIDC("oidc"),
    
    OKTA("okta"),
    
    ONELOGIN("onelogin"),
    
    PINGONE("pingone"),
    
    YANDEX("yandex");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public AccessSchemasOidc() {
  }

  public AccessSchemasOidc(
     String id
  ) {
    this();
    this.id = id;
  }

  public AccessSchemasOidc config(AccessSchemasOidcAllOfConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nonnull
  public AccessSchemasOidcAllOfConfig getConfig() {
    return config;
  }

  public void setConfig(AccessSchemasOidcAllOfConfig config) {
    this.config = config;
  }


   /**
   * UUID
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public AccessSchemasOidc name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the identity provider, shown to users on the login page.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccessSchemasOidc scimConfig(AccessSchemasIdentityProviderScimConfig scimConfig) {
    this.scimConfig = scimConfig;
    return this;
  }

   /**
   * Get scimConfig
   * @return scimConfig
  **/
  @javax.annotation.Nullable
  public AccessSchemasIdentityProviderScimConfig getScimConfig() {
    return scimConfig;
  }

  public void setScimConfig(AccessSchemasIdentityProviderScimConfig scimConfig) {
    this.scimConfig = scimConfig;
  }


  public AccessSchemasOidc type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of identity provider. To determine the value for a specific provider, refer to our [developer documentation](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration/).
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    AccessSchemasOidc accessSchemasOidc = (AccessSchemasOidc) o;
    return Objects.equals(this.config, accessSchemasOidc.config) &&
        Objects.equals(this.id, accessSchemasOidc.id) &&
        Objects.equals(this.name, accessSchemasOidc.name) &&
        Objects.equals(this.scimConfig, accessSchemasOidc.scimConfig) &&
        Objects.equals(this.type, accessSchemasOidc.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, id, name, scimConfig, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessSchemasOidc {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scimConfig: ").append(toIndentedString(scimConfig)).append("\n");
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
    openapiFields.add("config");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("scim_config");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("config");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessSchemasOidc
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessSchemasOidc.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessSchemasOidc is not found in the empty JSON string", AccessSchemasOidc.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessSchemasOidc.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessSchemasOidc` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccessSchemasOidc.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `config`
      AccessSchemasOidcAllOfConfig.validateJsonElement(jsonObj.get("config"));
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `scim_config`
      if (jsonObj.get("scim_config") != null && !jsonObj.get("scim_config").isJsonNull()) {
        AccessSchemasIdentityProviderScimConfig.validateJsonElement(jsonObj.get("scim_config"));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessSchemasOidc.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessSchemasOidc' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessSchemasOidc> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessSchemasOidc.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessSchemasOidc>() {
           @Override
           public void write(JsonWriter out, AccessSchemasOidc value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessSchemasOidc read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessSchemasOidc given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessSchemasOidc
  * @throws IOException if the JSON string is invalid with respect to AccessSchemasOidc
  */
  public static AccessSchemasOidc fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessSchemasOidc.class);
  }

 /**
  * Convert an instance of AccessSchemasOidc to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

