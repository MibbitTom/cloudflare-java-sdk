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

import org.openapitools.client.JSON;

/**
 * FirewallFilterDeleteResponseSingleAllOfResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class FirewallFilterDeleteResponseSingleAllOfResult {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PAUSED = "paused";
  @SerializedName(SERIALIZED_NAME_PAUSED)
  private Boolean paused;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public FirewallFilterDeleteResponseSingleAllOfResult() {
  }

  public FirewallFilterDeleteResponseSingleAllOfResult(
     String id
  ) {
    this();
    this.id = id;
  }

  public FirewallFilterDeleteResponseSingleAllOfResult description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An informative summary of the filter.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public FirewallFilterDeleteResponseSingleAllOfResult expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * The filter expression. For more information, refer to [Expressions](https://developers.cloudflare.com/ruleset-engine/rules-language/expressions/).
   * @return expression
  **/
  @javax.annotation.Nullable
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }


   /**
   * The unique identifier of the filter.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }



  public FirewallFilterDeleteResponseSingleAllOfResult paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * When true, indicates that the filter is currently paused.
   * @return paused
  **/
  @javax.annotation.Nullable
  public Boolean getPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }


  public FirewallFilterDeleteResponseSingleAllOfResult ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * A short reference tag. Allows you to select related filters.
   * @return ref
  **/
  @javax.annotation.Nullable
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirewallFilterDeleteResponseSingleAllOfResult firewallFilterDeleteResponseSingleAllOfResult = (FirewallFilterDeleteResponseSingleAllOfResult) o;
    return Objects.equals(this.description, firewallFilterDeleteResponseSingleAllOfResult.description) &&
        Objects.equals(this.expression, firewallFilterDeleteResponseSingleAllOfResult.expression) &&
        Objects.equals(this.id, firewallFilterDeleteResponseSingleAllOfResult.id) &&
        Objects.equals(this.paused, firewallFilterDeleteResponseSingleAllOfResult.paused) &&
        Objects.equals(this.ref, firewallFilterDeleteResponseSingleAllOfResult.ref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expression, id, paused, ref);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirewallFilterDeleteResponseSingleAllOfResult {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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
    openapiFields.add("expression");
    openapiFields.add("id");
    openapiFields.add("paused");
    openapiFields.add("ref");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FirewallFilterDeleteResponseSingleAllOfResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FirewallFilterDeleteResponseSingleAllOfResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FirewallFilterDeleteResponseSingleAllOfResult is not found in the empty JSON string", FirewallFilterDeleteResponseSingleAllOfResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FirewallFilterDeleteResponseSingleAllOfResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FirewallFilterDeleteResponseSingleAllOfResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FirewallFilterDeleteResponseSingleAllOfResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("expression") != null && !jsonObj.get("expression").isJsonNull()) && !jsonObj.get("expression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expression").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("ref") != null && !jsonObj.get("ref").isJsonNull()) && !jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FirewallFilterDeleteResponseSingleAllOfResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FirewallFilterDeleteResponseSingleAllOfResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FirewallFilterDeleteResponseSingleAllOfResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FirewallFilterDeleteResponseSingleAllOfResult.class));

       return (TypeAdapter<T>) new TypeAdapter<FirewallFilterDeleteResponseSingleAllOfResult>() {
           @Override
           public void write(JsonWriter out, FirewallFilterDeleteResponseSingleAllOfResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FirewallFilterDeleteResponseSingleAllOfResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FirewallFilterDeleteResponseSingleAllOfResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FirewallFilterDeleteResponseSingleAllOfResult
  * @throws IOException if the JSON string is invalid with respect to FirewallFilterDeleteResponseSingleAllOfResult
  */
  public static FirewallFilterDeleteResponseSingleAllOfResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FirewallFilterDeleteResponseSingleAllOfResult.class);
  }

 /**
  * Convert an instance of FirewallFilterDeleteResponseSingleAllOfResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
