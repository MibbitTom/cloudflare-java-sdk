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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ZarazZarazConfigBaseTriggersValueExcludeRulesInner;

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
 * ZarazZarazConfigBaseTriggersValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZarazZarazConfigBaseTriggersValue {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXCLUDE_RULES = "excludeRules";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_RULES)
  private List<ZarazZarazConfigBaseTriggersValueExcludeRulesInner> excludeRules = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOAD_RULES = "loadRules";
  @SerializedName(SERIALIZED_NAME_LOAD_RULES)
  private List<ZarazZarazConfigBaseTriggersValueExcludeRulesInner> loadRules = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets system
   */
  @JsonAdapter(SystemEnum.Adapter.class)
  public enum SystemEnum {
    PAGELOAD("pageload");

    private String value;

    SystemEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SystemEnum fromValue(String value) {
      for (SystemEnum b : SystemEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SystemEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SystemEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SystemEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SystemEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SystemEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  private SystemEnum system;

  public ZarazZarazConfigBaseTriggersValue() {
  }

  public ZarazZarazConfigBaseTriggersValue description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Trigger description.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public ZarazZarazConfigBaseTriggersValue excludeRules(List<ZarazZarazConfigBaseTriggersValueExcludeRulesInner> excludeRules) {
    this.excludeRules = excludeRules;
    return this;
  }

  public ZarazZarazConfigBaseTriggersValue addExcludeRulesItem(ZarazZarazConfigBaseTriggersValueExcludeRulesInner excludeRulesItem) {
    if (this.excludeRules == null) {
      this.excludeRules = new ArrayList<>();
    }
    this.excludeRules.add(excludeRulesItem);
    return this;
  }

   /**
   * Rules defining when the trigger is not fired.
   * @return excludeRules
  **/
  @javax.annotation.Nonnull
  public List<ZarazZarazConfigBaseTriggersValueExcludeRulesInner> getExcludeRules() {
    return excludeRules;
  }

  public void setExcludeRules(List<ZarazZarazConfigBaseTriggersValueExcludeRulesInner> excludeRules) {
    this.excludeRules = excludeRules;
  }


  public ZarazZarazConfigBaseTriggersValue loadRules(List<ZarazZarazConfigBaseTriggersValueExcludeRulesInner> loadRules) {
    this.loadRules = loadRules;
    return this;
  }

  public ZarazZarazConfigBaseTriggersValue addLoadRulesItem(ZarazZarazConfigBaseTriggersValueExcludeRulesInner loadRulesItem) {
    if (this.loadRules == null) {
      this.loadRules = new ArrayList<>();
    }
    this.loadRules.add(loadRulesItem);
    return this;
  }

   /**
   * Rules defining when the trigger is fired.
   * @return loadRules
  **/
  @javax.annotation.Nonnull
  public List<ZarazZarazConfigBaseTriggersValueExcludeRulesInner> getLoadRules() {
    return loadRules;
  }

  public void setLoadRules(List<ZarazZarazConfigBaseTriggersValueExcludeRulesInner> loadRules) {
    this.loadRules = loadRules;
  }


  public ZarazZarazConfigBaseTriggersValue name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Trigger name.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ZarazZarazConfigBaseTriggersValue system(SystemEnum system) {
    this.system = system;
    return this;
  }

   /**
   * Get system
   * @return system
  **/
  @javax.annotation.Nullable
  public SystemEnum getSystem() {
    return system;
  }

  public void setSystem(SystemEnum system) {
    this.system = system;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZarazZarazConfigBaseTriggersValue zarazZarazConfigBaseTriggersValue = (ZarazZarazConfigBaseTriggersValue) o;
    return Objects.equals(this.description, zarazZarazConfigBaseTriggersValue.description) &&
        Objects.equals(this.excludeRules, zarazZarazConfigBaseTriggersValue.excludeRules) &&
        Objects.equals(this.loadRules, zarazZarazConfigBaseTriggersValue.loadRules) &&
        Objects.equals(this.name, zarazZarazConfigBaseTriggersValue.name) &&
        Objects.equals(this.system, zarazZarazConfigBaseTriggersValue.system);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, excludeRules, loadRules, name, system);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZarazZarazConfigBaseTriggersValue {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    excludeRules: ").append(toIndentedString(excludeRules)).append("\n");
    sb.append("    loadRules: ").append(toIndentedString(loadRules)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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
    openapiFields.add("excludeRules");
    openapiFields.add("loadRules");
    openapiFields.add("name");
    openapiFields.add("system");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("excludeRules");
    openapiRequiredFields.add("loadRules");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZarazZarazConfigBaseTriggersValue
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZarazZarazConfigBaseTriggersValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZarazZarazConfigBaseTriggersValue is not found in the empty JSON string", ZarazZarazConfigBaseTriggersValue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZarazZarazConfigBaseTriggersValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZarazZarazConfigBaseTriggersValue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ZarazZarazConfigBaseTriggersValue.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("excludeRules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludeRules` to be an array in the JSON string but got `%s`", jsonObj.get("excludeRules").toString()));
      }

      JsonArray jsonArrayexcludeRules = jsonObj.getAsJsonArray("excludeRules");
      // validate the required field `excludeRules` (array)
      for (int i = 0; i < jsonArrayexcludeRules.size(); i++) {
        ZarazZarazConfigBaseTriggersValueExcludeRulesInner.validateJsonElement(jsonArrayexcludeRules.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("loadRules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `loadRules` to be an array in the JSON string but got `%s`", jsonObj.get("loadRules").toString()));
      }

      JsonArray jsonArrayloadRules = jsonObj.getAsJsonArray("loadRules");
      // validate the required field `loadRules` (array)
      for (int i = 0; i < jsonArrayloadRules.size(); i++) {
        ZarazZarazConfigBaseTriggersValueExcludeRulesInner.validateJsonElement(jsonArrayloadRules.get(i));
      };
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("system") != null && !jsonObj.get("system").isJsonNull()) && !jsonObj.get("system").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `system` to be a primitive type in the JSON string but got `%s`", jsonObj.get("system").toString()));
      }
      // validate the optional field `system`
      if (jsonObj.get("system") != null && !jsonObj.get("system").isJsonNull()) {
        SystemEnum.validateJsonElement(jsonObj.get("system"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZarazZarazConfigBaseTriggersValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZarazZarazConfigBaseTriggersValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZarazZarazConfigBaseTriggersValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZarazZarazConfigBaseTriggersValue.class));

       return (TypeAdapter<T>) new TypeAdapter<ZarazZarazConfigBaseTriggersValue>() {
           @Override
           public void write(JsonWriter out, ZarazZarazConfigBaseTriggersValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZarazZarazConfigBaseTriggersValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZarazZarazConfigBaseTriggersValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZarazZarazConfigBaseTriggersValue
  * @throws IOException if the JSON string is invalid with respect to ZarazZarazConfigBaseTriggersValue
  */
  public static ZarazZarazConfigBaseTriggersValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZarazZarazConfigBaseTriggersValue.class);
  }

 /**
  * Convert an instance of ZarazZarazConfigBaseTriggersValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

