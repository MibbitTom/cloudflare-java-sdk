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
 * ZarazVariableMatchRuleSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZarazVariableMatchRuleSettings {
  public static final String SERIALIZED_NAME_MATCH = "match";
  @SerializedName(SERIALIZED_NAME_MATCH)
  private String match;

  public static final String SERIALIZED_NAME_VARIABLE = "variable";
  @SerializedName(SERIALIZED_NAME_VARIABLE)
  private String variable;

  public ZarazVariableMatchRuleSettings() {
  }

  public ZarazVariableMatchRuleSettings match(String match) {
    this.match = match;
    return this;
  }

   /**
   * Get match
   * @return match
  **/
  @javax.annotation.Nonnull
  public String getMatch() {
    return match;
  }

  public void setMatch(String match) {
    this.match = match;
  }


  public ZarazVariableMatchRuleSettings variable(String variable) {
    this.variable = variable;
    return this;
  }

   /**
   * Get variable
   * @return variable
  **/
  @javax.annotation.Nonnull
  public String getVariable() {
    return variable;
  }

  public void setVariable(String variable) {
    this.variable = variable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZarazVariableMatchRuleSettings zarazVariableMatchRuleSettings = (ZarazVariableMatchRuleSettings) o;
    return Objects.equals(this.match, zarazVariableMatchRuleSettings.match) &&
        Objects.equals(this.variable, zarazVariableMatchRuleSettings.variable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(match, variable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZarazVariableMatchRuleSettings {\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
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
    openapiFields.add("match");
    openapiFields.add("variable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("match");
    openapiRequiredFields.add("variable");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZarazVariableMatchRuleSettings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZarazVariableMatchRuleSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZarazVariableMatchRuleSettings is not found in the empty JSON string", ZarazVariableMatchRuleSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZarazVariableMatchRuleSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZarazVariableMatchRuleSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ZarazVariableMatchRuleSettings.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("match").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `match` to be a primitive type in the JSON string but got `%s`", jsonObj.get("match").toString()));
      }
      if (!jsonObj.get("variable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variable").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZarazVariableMatchRuleSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZarazVariableMatchRuleSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZarazVariableMatchRuleSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZarazVariableMatchRuleSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<ZarazVariableMatchRuleSettings>() {
           @Override
           public void write(JsonWriter out, ZarazVariableMatchRuleSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZarazVariableMatchRuleSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZarazVariableMatchRuleSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZarazVariableMatchRuleSettings
  * @throws IOException if the JSON string is invalid with respect to ZarazVariableMatchRuleSettings
  */
  public static ZarazVariableMatchRuleSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZarazVariableMatchRuleSettings.class);
  }

 /**
  * Convert an instance of ZarazVariableMatchRuleSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

