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
import org.openapitools.client.model.FirewallConfiguration;
import org.openapitools.client.model.FirewallSchemasMode;

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
 * IpAccessRulesForAZoneCreateAnIpAccessRuleRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class IpAccessRulesForAZoneCreateAnIpAccessRuleRequest {
  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private FirewallConfiguration _configuration;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private FirewallSchemasMode mode;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public IpAccessRulesForAZoneCreateAnIpAccessRuleRequest() {
  }

  public IpAccessRulesForAZoneCreateAnIpAccessRuleRequest _configuration(FirewallConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @javax.annotation.Nonnull
  public FirewallConfiguration getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(FirewallConfiguration _configuration) {
    this._configuration = _configuration;
  }


  public IpAccessRulesForAZoneCreateAnIpAccessRuleRequest mode(FirewallSchemasMode mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nonnull
  public FirewallSchemasMode getMode() {
    return mode;
  }

  public void setMode(FirewallSchemasMode mode) {
    this.mode = mode;
  }


  public IpAccessRulesForAZoneCreateAnIpAccessRuleRequest notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * An informative summary of the rule, typically used as a reminder or explanation.
   * @return notes
  **/
  @javax.annotation.Nonnull
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAccessRulesForAZoneCreateAnIpAccessRuleRequest ipAccessRulesForAZoneCreateAnIpAccessRuleRequest = (IpAccessRulesForAZoneCreateAnIpAccessRuleRequest) o;
    return Objects.equals(this._configuration, ipAccessRulesForAZoneCreateAnIpAccessRuleRequest._configuration) &&
        Objects.equals(this.mode, ipAccessRulesForAZoneCreateAnIpAccessRuleRequest.mode) &&
        Objects.equals(this.notes, ipAccessRulesForAZoneCreateAnIpAccessRuleRequest.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, mode, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAccessRulesForAZoneCreateAnIpAccessRuleRequest {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
    openapiFields.add("configuration");
    openapiFields.add("mode");
    openapiFields.add("notes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("configuration");
    openapiRequiredFields.add("mode");
    openapiRequiredFields.add("notes");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IpAccessRulesForAZoneCreateAnIpAccessRuleRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IpAccessRulesForAZoneCreateAnIpAccessRuleRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IpAccessRulesForAZoneCreateAnIpAccessRuleRequest is not found in the empty JSON string", IpAccessRulesForAZoneCreateAnIpAccessRuleRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IpAccessRulesForAZoneCreateAnIpAccessRuleRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IpAccessRulesForAZoneCreateAnIpAccessRuleRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IpAccessRulesForAZoneCreateAnIpAccessRuleRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `configuration`
      FirewallConfiguration.validateJsonElement(jsonObj.get("configuration"));
      // validate the required field `mode`
      FirewallSchemasMode.validateJsonElement(jsonObj.get("mode"));
      if (!jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IpAccessRulesForAZoneCreateAnIpAccessRuleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IpAccessRulesForAZoneCreateAnIpAccessRuleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IpAccessRulesForAZoneCreateAnIpAccessRuleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IpAccessRulesForAZoneCreateAnIpAccessRuleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IpAccessRulesForAZoneCreateAnIpAccessRuleRequest>() {
           @Override
           public void write(JsonWriter out, IpAccessRulesForAZoneCreateAnIpAccessRuleRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IpAccessRulesForAZoneCreateAnIpAccessRuleRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IpAccessRulesForAZoneCreateAnIpAccessRuleRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IpAccessRulesForAZoneCreateAnIpAccessRuleRequest
  * @throws IOException if the JSON string is invalid with respect to IpAccessRulesForAZoneCreateAnIpAccessRuleRequest
  */
  public static IpAccessRulesForAZoneCreateAnIpAccessRuleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IpAccessRulesForAZoneCreateAnIpAccessRuleRequest.class);
  }

 /**
  * Convert an instance of IpAccessRulesForAZoneCreateAnIpAccessRuleRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

