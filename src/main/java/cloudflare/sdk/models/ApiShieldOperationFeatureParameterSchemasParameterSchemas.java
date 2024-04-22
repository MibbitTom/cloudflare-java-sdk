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
import cloudflare.sdk.models.ApiShieldParameterSchemasDefinition;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * ApiShieldOperationFeatureParameterSchemasParameterSchemas
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ApiShieldOperationFeatureParameterSchemasParameterSchemas {
  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public static final String SERIALIZED_NAME_PARAMETER_SCHEMAS = "parameter_schemas";
  @SerializedName(SERIALIZED_NAME_PARAMETER_SCHEMAS)
  private ApiShieldParameterSchemasDefinition parameterSchemas;

  public ApiShieldOperationFeatureParameterSchemasParameterSchemas() {
  }

  public ApiShieldOperationFeatureParameterSchemasParameterSchemas(
     OffsetDateTime lastUpdated
  ) {
    this();
    this.lastUpdated = lastUpdated;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }



  public ApiShieldOperationFeatureParameterSchemasParameterSchemas parameterSchemas(ApiShieldParameterSchemasDefinition parameterSchemas) {
    this.parameterSchemas = parameterSchemas;
    return this;
  }

   /**
   * Get parameterSchemas
   * @return parameterSchemas
  **/
  @javax.annotation.Nullable
  public ApiShieldParameterSchemasDefinition getParameterSchemas() {
    return parameterSchemas;
  }

  public void setParameterSchemas(ApiShieldParameterSchemasDefinition parameterSchemas) {
    this.parameterSchemas = parameterSchemas;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiShieldOperationFeatureParameterSchemasParameterSchemas apiShieldOperationFeatureParameterSchemasParameterSchemas = (ApiShieldOperationFeatureParameterSchemasParameterSchemas) o;
    return Objects.equals(this.lastUpdated, apiShieldOperationFeatureParameterSchemasParameterSchemas.lastUpdated) &&
        Objects.equals(this.parameterSchemas, apiShieldOperationFeatureParameterSchemasParameterSchemas.parameterSchemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdated, parameterSchemas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiShieldOperationFeatureParameterSchemasParameterSchemas {\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    parameterSchemas: ").append(toIndentedString(parameterSchemas)).append("\n");
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
    openapiFields.add("last_updated");
    openapiFields.add("parameter_schemas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiShieldOperationFeatureParameterSchemasParameterSchemas
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiShieldOperationFeatureParameterSchemasParameterSchemas.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiShieldOperationFeatureParameterSchemasParameterSchemas is not found in the empty JSON string", ApiShieldOperationFeatureParameterSchemasParameterSchemas.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiShieldOperationFeatureParameterSchemasParameterSchemas.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiShieldOperationFeatureParameterSchemasParameterSchemas` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `parameter_schemas`
      if (jsonObj.get("parameter_schemas") != null && !jsonObj.get("parameter_schemas").isJsonNull()) {
        ApiShieldParameterSchemasDefinition.validateJsonElement(jsonObj.get("parameter_schemas"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiShieldOperationFeatureParameterSchemasParameterSchemas.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiShieldOperationFeatureParameterSchemasParameterSchemas' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiShieldOperationFeatureParameterSchemasParameterSchemas> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiShieldOperationFeatureParameterSchemasParameterSchemas.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiShieldOperationFeatureParameterSchemasParameterSchemas>() {
           @Override
           public void write(JsonWriter out, ApiShieldOperationFeatureParameterSchemasParameterSchemas value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiShieldOperationFeatureParameterSchemasParameterSchemas read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiShieldOperationFeatureParameterSchemasParameterSchemas given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiShieldOperationFeatureParameterSchemasParameterSchemas
  * @throws IOException if the JSON string is invalid with respect to ApiShieldOperationFeatureParameterSchemasParameterSchemas
  */
  public static ApiShieldOperationFeatureParameterSchemasParameterSchemas fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiShieldOperationFeatureParameterSchemasParameterSchemas.class);
  }

 /**
  * Convert an instance of ApiShieldOperationFeatureParameterSchemasParameterSchemas to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

