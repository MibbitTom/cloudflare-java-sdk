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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.ZarazBaseMcAllOfSettings;
import org.openapitools.client.model.ZarazLegacyToolAllOfNeoEvents;

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
 * ZarazLegacyTool
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZarazLegacyTool {
  public static final String SERIALIZED_NAME_BLOCKING_TRIGGERS = "blockingTriggers";
  @SerializedName(SERIALIZED_NAME_BLOCKING_TRIGGERS)
  private List<String> blockingTriggers = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEFAULT_FIELDS = "defaultFields";
  @SerializedName(SERIALIZED_NAME_DEFAULT_FIELDS)
  private Map<String, ZarazBaseMcAllOfSettings> defaultFields = new HashMap<>();

  public static final String SERIALIZED_NAME_DEFAULT_PURPOSE = "defaultPurpose";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PURPOSE)
  private String defaultPurpose;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VENDOR_NAME = "vendorName";
  @SerializedName(SERIALIZED_NAME_VENDOR_NAME)
  private String vendorName;

  public static final String SERIALIZED_NAME_VENDOR_POLICY_URL = "vendorPolicyUrl";
  @SerializedName(SERIALIZED_NAME_VENDOR_POLICY_URL)
  private String vendorPolicyUrl;

  public static final String SERIALIZED_NAME_LIBRARY = "library";
  @SerializedName(SERIALIZED_NAME_LIBRARY)
  private String library;

  public static final String SERIALIZED_NAME_NEO_EVENTS = "neoEvents";
  @SerializedName(SERIALIZED_NAME_NEO_EVENTS)
  private List<ZarazLegacyToolAllOfNeoEvents> neoEvents = new ArrayList<>();

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    LIBRARY("library");

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

  public ZarazLegacyTool() {
  }

  public ZarazLegacyTool blockingTriggers(List<String> blockingTriggers) {
    this.blockingTriggers = blockingTriggers;
    return this;
  }

  public ZarazLegacyTool addBlockingTriggersItem(String blockingTriggersItem) {
    if (this.blockingTriggers == null) {
      this.blockingTriggers = new ArrayList<>();
    }
    this.blockingTriggers.add(blockingTriggersItem);
    return this;
  }

   /**
   * List of blocking trigger IDs
   * @return blockingTriggers
  **/
  @javax.annotation.Nonnull
  public List<String> getBlockingTriggers() {
    return blockingTriggers;
  }

  public void setBlockingTriggers(List<String> blockingTriggers) {
    this.blockingTriggers = blockingTriggers;
  }


  public ZarazLegacyTool defaultFields(Map<String, ZarazBaseMcAllOfSettings> defaultFields) {
    this.defaultFields = defaultFields;
    return this;
  }

  public ZarazLegacyTool putDefaultFieldsItem(String key, ZarazBaseMcAllOfSettings defaultFieldsItem) {
    if (this.defaultFields == null) {
      this.defaultFields = new HashMap<>();
    }
    this.defaultFields.put(key, defaultFieldsItem);
    return this;
  }

   /**
   * Default fields for tool&#39;s actions
   * @return defaultFields
  **/
  @javax.annotation.Nonnull
  public Map<String, ZarazBaseMcAllOfSettings> getDefaultFields() {
    return defaultFields;
  }

  public void setDefaultFields(Map<String, ZarazBaseMcAllOfSettings> defaultFields) {
    this.defaultFields = defaultFields;
  }


  public ZarazLegacyTool defaultPurpose(String defaultPurpose) {
    this.defaultPurpose = defaultPurpose;
    return this;
  }

   /**
   * Default consent purpose ID
   * @return defaultPurpose
  **/
  @javax.annotation.Nullable
  public String getDefaultPurpose() {
    return defaultPurpose;
  }

  public void setDefaultPurpose(String defaultPurpose) {
    this.defaultPurpose = defaultPurpose;
  }


  public ZarazLegacyTool enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether tool is enabled
   * @return enabled
  **/
  @javax.annotation.Nonnull
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public ZarazLegacyTool name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Tool&#39;s name defined by the user
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ZarazLegacyTool vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * Vendor name for TCF compliant consent modal, required for Custom Managed Components and Custom HTML tool with a defaultPurpose assigned
   * @return vendorName
  **/
  @javax.annotation.Nullable
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  public ZarazLegacyTool vendorPolicyUrl(String vendorPolicyUrl) {
    this.vendorPolicyUrl = vendorPolicyUrl;
    return this;
  }

   /**
   * Vendor&#39;s Privacy Policy URL for TCF compliant consent modal, required for Custom Managed Components and Custom HTML tool with a defaultPurpose assigned
   * @return vendorPolicyUrl
  **/
  @javax.annotation.Nullable
  public String getVendorPolicyUrl() {
    return vendorPolicyUrl;
  }

  public void setVendorPolicyUrl(String vendorPolicyUrl) {
    this.vendorPolicyUrl = vendorPolicyUrl;
  }


  public ZarazLegacyTool library(String library) {
    this.library = library;
    return this;
  }

   /**
   * Tool&#39;s internal name
   * @return library
  **/
  @javax.annotation.Nonnull
  public String getLibrary() {
    return library;
  }

  public void setLibrary(String library) {
    this.library = library;
  }


  public ZarazLegacyTool neoEvents(List<ZarazLegacyToolAllOfNeoEvents> neoEvents) {
    this.neoEvents = neoEvents;
    return this;
  }

  public ZarazLegacyTool addNeoEventsItem(ZarazLegacyToolAllOfNeoEvents neoEventsItem) {
    if (this.neoEvents == null) {
      this.neoEvents = new ArrayList<>();
    }
    this.neoEvents.add(neoEventsItem);
    return this;
  }

   /**
   * List of actions configured on a tool
   * @return neoEvents
  **/
  @javax.annotation.Nonnull
  public List<ZarazLegacyToolAllOfNeoEvents> getNeoEvents() {
    return neoEvents;
  }

  public void setNeoEvents(List<ZarazLegacyToolAllOfNeoEvents> neoEvents) {
    this.neoEvents = neoEvents;
  }


  public ZarazLegacyTool type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
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
    ZarazLegacyTool zarazLegacyTool = (ZarazLegacyTool) o;
    return Objects.equals(this.blockingTriggers, zarazLegacyTool.blockingTriggers) &&
        Objects.equals(this.defaultFields, zarazLegacyTool.defaultFields) &&
        Objects.equals(this.defaultPurpose, zarazLegacyTool.defaultPurpose) &&
        Objects.equals(this.enabled, zarazLegacyTool.enabled) &&
        Objects.equals(this.name, zarazLegacyTool.name) &&
        Objects.equals(this.vendorName, zarazLegacyTool.vendorName) &&
        Objects.equals(this.vendorPolicyUrl, zarazLegacyTool.vendorPolicyUrl) &&
        Objects.equals(this.library, zarazLegacyTool.library) &&
        Objects.equals(this.neoEvents, zarazLegacyTool.neoEvents) &&
        Objects.equals(this.type, zarazLegacyTool.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockingTriggers, defaultFields, defaultPurpose, enabled, name, vendorName, vendorPolicyUrl, library, neoEvents, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZarazLegacyTool {\n");
    sb.append("    blockingTriggers: ").append(toIndentedString(blockingTriggers)).append("\n");
    sb.append("    defaultFields: ").append(toIndentedString(defaultFields)).append("\n");
    sb.append("    defaultPurpose: ").append(toIndentedString(defaultPurpose)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorPolicyUrl: ").append(toIndentedString(vendorPolicyUrl)).append("\n");
    sb.append("    library: ").append(toIndentedString(library)).append("\n");
    sb.append("    neoEvents: ").append(toIndentedString(neoEvents)).append("\n");
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
    openapiFields.add("blockingTriggers");
    openapiFields.add("defaultFields");
    openapiFields.add("defaultPurpose");
    openapiFields.add("enabled");
    openapiFields.add("name");
    openapiFields.add("vendorName");
    openapiFields.add("vendorPolicyUrl");
    openapiFields.add("library");
    openapiFields.add("neoEvents");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("blockingTriggers");
    openapiRequiredFields.add("defaultFields");
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("library");
    openapiRequiredFields.add("neoEvents");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZarazLegacyTool
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZarazLegacyTool.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZarazLegacyTool is not found in the empty JSON string", ZarazLegacyTool.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZarazLegacyTool.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZarazLegacyTool` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ZarazLegacyTool.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("blockingTriggers") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("blockingTriggers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `blockingTriggers` to be an array in the JSON string but got `%s`", jsonObj.get("blockingTriggers").toString()));
      }
      if ((jsonObj.get("defaultPurpose") != null && !jsonObj.get("defaultPurpose").isJsonNull()) && !jsonObj.get("defaultPurpose").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultPurpose` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultPurpose").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("vendorName") != null && !jsonObj.get("vendorName").isJsonNull()) && !jsonObj.get("vendorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorName").toString()));
      }
      if ((jsonObj.get("vendorPolicyUrl") != null && !jsonObj.get("vendorPolicyUrl").isJsonNull()) && !jsonObj.get("vendorPolicyUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPolicyUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPolicyUrl").toString()));
      }
      if (!jsonObj.get("library").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `library` to be a primitive type in the JSON string but got `%s`", jsonObj.get("library").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("neoEvents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `neoEvents` to be an array in the JSON string but got `%s`", jsonObj.get("neoEvents").toString()));
      }

      JsonArray jsonArrayneoEvents = jsonObj.getAsJsonArray("neoEvents");
      // validate the required field `neoEvents` (array)
      for (int i = 0; i < jsonArrayneoEvents.size(); i++) {
        ZarazLegacyToolAllOfNeoEvents.validateJsonElement(jsonArrayneoEvents.get(i));
      };
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
       if (!ZarazLegacyTool.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZarazLegacyTool' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZarazLegacyTool> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZarazLegacyTool.class));

       return (TypeAdapter<T>) new TypeAdapter<ZarazLegacyTool>() {
           @Override
           public void write(JsonWriter out, ZarazLegacyTool value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZarazLegacyTool read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZarazLegacyTool given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZarazLegacyTool
  * @throws IOException if the JSON string is invalid with respect to ZarazLegacyTool
  */
  public static ZarazLegacyTool fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZarazLegacyTool.class);
  }

 /**
  * Convert an instance of ZarazLegacyTool to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
