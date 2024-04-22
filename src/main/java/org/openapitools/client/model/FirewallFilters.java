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

import invalidPackageName.JSON;

/**
 * FirewallFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class FirewallFilters {
  /**
   * The target to search in existing rules.
   */
  @JsonAdapter(ConfigurationTargetEnum.Adapter.class)
  public enum ConfigurationTargetEnum {
    IP("ip"),
    
    IP_RANGE("ip_range"),
    
    ASN("asn"),
    
    COUNTRY("country");

    private String value;

    ConfigurationTargetEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConfigurationTargetEnum fromValue(String value) {
      for (ConfigurationTargetEnum b : ConfigurationTargetEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConfigurationTargetEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConfigurationTargetEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConfigurationTargetEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConfigurationTargetEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ConfigurationTargetEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CONFIGURATION_TARGET = "configuration.target";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_TARGET)
  private ConfigurationTargetEnum configurationTarget;

  public static final String SERIALIZED_NAME_CONFIGURATION_VALUE = "configuration.value";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_VALUE)
  private String configurationValue;

  /**
   * When set to &#x60;all&#x60;, all the search requirements must match. When set to &#x60;any&#x60;, only one of the search requirements has to match.
   */
  @JsonAdapter(MatchEnum.Adapter.class)
  public enum MatchEnum {
    ANY("any"),
    
    ALL("all");

    private String value;

    MatchEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MatchEnum fromValue(String value) {
      for (MatchEnum b : MatchEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MatchEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MatchEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MatchEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MATCH = "match";
  @SerializedName(SERIALIZED_NAME_MATCH)
  private MatchEnum match = MatchEnum.ALL;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private FirewallSchemasMode mode;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public FirewallFilters() {
  }

  public FirewallFilters configurationTarget(ConfigurationTargetEnum configurationTarget) {
    this.configurationTarget = configurationTarget;
    return this;
  }

   /**
   * The target to search in existing rules.
   * @return configurationTarget
  **/
  @javax.annotation.Nullable
  public ConfigurationTargetEnum getConfigurationTarget() {
    return configurationTarget;
  }

  public void setConfigurationTarget(ConfigurationTargetEnum configurationTarget) {
    this.configurationTarget = configurationTarget;
  }


  public FirewallFilters configurationValue(String configurationValue) {
    this.configurationValue = configurationValue;
    return this;
  }

   /**
   * The target value to search for in existing rules: an IP address, an IP address range, or a country code, depending on the provided &#x60;configuration.target&#x60;. Notes: You can search for a single IPv4 address, an IP address range with a subnet of &#39;/16&#39; or &#39;/24&#39;, or a two-letter ISO-3166-1 alpha-2 country code.
   * @return configurationValue
  **/
  @javax.annotation.Nullable
  public String getConfigurationValue() {
    return configurationValue;
  }

  public void setConfigurationValue(String configurationValue) {
    this.configurationValue = configurationValue;
  }


  public FirewallFilters match(MatchEnum match) {
    this.match = match;
    return this;
  }

   /**
   * When set to &#x60;all&#x60;, all the search requirements must match. When set to &#x60;any&#x60;, only one of the search requirements has to match.
   * @return match
  **/
  @javax.annotation.Nullable
  public MatchEnum getMatch() {
    return match;
  }

  public void setMatch(MatchEnum match) {
    this.match = match;
  }


  public FirewallFilters mode(FirewallSchemasMode mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nullable
  public FirewallSchemasMode getMode() {
    return mode;
  }

  public void setMode(FirewallSchemasMode mode) {
    this.mode = mode;
  }


  public FirewallFilters notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * The string to search for in the notes of existing IP Access rules. Notes: For example, the string &#39;attack&#39; would match IP Access rules with notes &#39;Attack 26/02&#39; and &#39;Attack 27/02&#39;. The search is case insensitive.
   * @return notes
  **/
  @javax.annotation.Nullable
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
    FirewallFilters firewallFilters = (FirewallFilters) o;
    return Objects.equals(this.configurationTarget, firewallFilters.configurationTarget) &&
        Objects.equals(this.configurationValue, firewallFilters.configurationValue) &&
        Objects.equals(this.match, firewallFilters.match) &&
        Objects.equals(this.mode, firewallFilters.mode) &&
        Objects.equals(this.notes, firewallFilters.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationTarget, configurationValue, match, mode, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirewallFilters {\n");
    sb.append("    configurationTarget: ").append(toIndentedString(configurationTarget)).append("\n");
    sb.append("    configurationValue: ").append(toIndentedString(configurationValue)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
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
    openapiFields.add("configuration.target");
    openapiFields.add("configuration.value");
    openapiFields.add("match");
    openapiFields.add("mode");
    openapiFields.add("notes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FirewallFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FirewallFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FirewallFilters is not found in the empty JSON string", FirewallFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FirewallFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FirewallFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("configuration.target") != null && !jsonObj.get("configuration.target").isJsonNull()) && !jsonObj.get("configuration.target").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configuration.target` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configuration.target").toString()));
      }
      // validate the optional field `configuration.target`
      if (jsonObj.get("configuration.target") != null && !jsonObj.get("configuration.target").isJsonNull()) {
        ConfigurationTargetEnum.validateJsonElement(jsonObj.get("configuration.target"));
      }
      if ((jsonObj.get("configuration.value") != null && !jsonObj.get("configuration.value").isJsonNull()) && !jsonObj.get("configuration.value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configuration.value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configuration.value").toString()));
      }
      if ((jsonObj.get("match") != null && !jsonObj.get("match").isJsonNull()) && !jsonObj.get("match").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `match` to be a primitive type in the JSON string but got `%s`", jsonObj.get("match").toString()));
      }
      // validate the optional field `match`
      if (jsonObj.get("match") != null && !jsonObj.get("match").isJsonNull()) {
        MatchEnum.validateJsonElement(jsonObj.get("match"));
      }
      // validate the optional field `mode`
      if (jsonObj.get("mode") != null && !jsonObj.get("mode").isJsonNull()) {
        FirewallSchemasMode.validateJsonElement(jsonObj.get("mode"));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FirewallFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FirewallFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FirewallFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FirewallFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<FirewallFilters>() {
           @Override
           public void write(JsonWriter out, FirewallFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FirewallFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FirewallFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FirewallFilters
  * @throws IOException if the JSON string is invalid with respect to FirewallFilters
  */
  public static FirewallFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FirewallFilters.class);
  }

 /**
  * Convert an instance of FirewallFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

