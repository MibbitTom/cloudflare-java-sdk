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
import cloudflare.sdk.models.ZarazBaseMcAllOfActions;
import cloudflare.sdk.models.ZarazBaseMcAllOfSettings;
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
 * ZarazManagedComponent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZarazManagedComponent {
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

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private Map<String, ZarazBaseMcAllOfActions> actions = new HashMap<>();

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_NEO_EVENTS = "neoEvents";
  @SerializedName(SERIALIZED_NAME_NEO_EVENTS)
  private List<ZarazBaseMcAllOfActions> neoEvents = new ArrayList<>();

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<String> permissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private Map<String, ZarazBaseMcAllOfSettings> settings = new HashMap<>();

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    COMPONENT("component");

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

  public ZarazManagedComponent() {
  }

  public ZarazManagedComponent blockingTriggers(List<String> blockingTriggers) {
    this.blockingTriggers = blockingTriggers;
    return this;
  }

  public ZarazManagedComponent addBlockingTriggersItem(String blockingTriggersItem) {
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


  public ZarazManagedComponent defaultFields(Map<String, ZarazBaseMcAllOfSettings> defaultFields) {
    this.defaultFields = defaultFields;
    return this;
  }

  public ZarazManagedComponent putDefaultFieldsItem(String key, ZarazBaseMcAllOfSettings defaultFieldsItem) {
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


  public ZarazManagedComponent defaultPurpose(String defaultPurpose) {
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


  public ZarazManagedComponent enabled(Boolean enabled) {
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


  public ZarazManagedComponent name(String name) {
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


  public ZarazManagedComponent vendorName(String vendorName) {
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


  public ZarazManagedComponent vendorPolicyUrl(String vendorPolicyUrl) {
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


  public ZarazManagedComponent actions(Map<String, ZarazBaseMcAllOfActions> actions) {
    this.actions = actions;
    return this;
  }

  public ZarazManagedComponent putActionsItem(String key, ZarazBaseMcAllOfActions actionsItem) {
    if (this.actions == null) {
      this.actions = new HashMap<>();
    }
    this.actions.put(key, actionsItem);
    return this;
  }

   /**
   * Actions configured on a tool. Either this or neoEvents field is required.
   * @return actions
  **/
  @javax.annotation.Nullable
  public Map<String, ZarazBaseMcAllOfActions> getActions() {
    return actions;
  }

  public void setActions(Map<String, ZarazBaseMcAllOfActions> actions) {
    this.actions = actions;
  }


  public ZarazManagedComponent component(String component) {
    this.component = component;
    return this;
  }

   /**
   * Tool&#39;s internal name
   * @return component
  **/
  @javax.annotation.Nonnull
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }


  public ZarazManagedComponent neoEvents(List<ZarazBaseMcAllOfActions> neoEvents) {
    this.neoEvents = neoEvents;
    return this;
  }

  public ZarazManagedComponent addNeoEventsItem(ZarazBaseMcAllOfActions neoEventsItem) {
    if (this.neoEvents == null) {
      this.neoEvents = new ArrayList<>();
    }
    this.neoEvents.add(neoEventsItem);
    return this;
  }

   /**
   * DEPRECATED - List of actions configured on a tool. Either this or actions field is required. If both are present, actions field will take precedence.
   * @return neoEvents
  **/
  @javax.annotation.Nullable
  public List<ZarazBaseMcAllOfActions> getNeoEvents() {
    return neoEvents;
  }

  public void setNeoEvents(List<ZarazBaseMcAllOfActions> neoEvents) {
    this.neoEvents = neoEvents;
  }


  public ZarazManagedComponent permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public ZarazManagedComponent addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * List of permissions granted to the component
   * @return permissions
  **/
  @javax.annotation.Nonnull
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }


  public ZarazManagedComponent settings(Map<String, ZarazBaseMcAllOfSettings> settings) {
    this.settings = settings;
    return this;
  }

  public ZarazManagedComponent putSettingsItem(String key, ZarazBaseMcAllOfSettings settingsItem) {
    if (this.settings == null) {
      this.settings = new HashMap<>();
    }
    this.settings.put(key, settingsItem);
    return this;
  }

   /**
   * Tool&#39;s settings
   * @return settings
  **/
  @javax.annotation.Nonnull
  public Map<String, ZarazBaseMcAllOfSettings> getSettings() {
    return settings;
  }

  public void setSettings(Map<String, ZarazBaseMcAllOfSettings> settings) {
    this.settings = settings;
  }


  public ZarazManagedComponent type(TypeEnum type) {
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
    ZarazManagedComponent zarazManagedComponent = (ZarazManagedComponent) o;
    return Objects.equals(this.blockingTriggers, zarazManagedComponent.blockingTriggers) &&
        Objects.equals(this.defaultFields, zarazManagedComponent.defaultFields) &&
        Objects.equals(this.defaultPurpose, zarazManagedComponent.defaultPurpose) &&
        Objects.equals(this.enabled, zarazManagedComponent.enabled) &&
        Objects.equals(this.name, zarazManagedComponent.name) &&
        Objects.equals(this.vendorName, zarazManagedComponent.vendorName) &&
        Objects.equals(this.vendorPolicyUrl, zarazManagedComponent.vendorPolicyUrl) &&
        Objects.equals(this.actions, zarazManagedComponent.actions) &&
        Objects.equals(this.component, zarazManagedComponent.component) &&
        Objects.equals(this.neoEvents, zarazManagedComponent.neoEvents) &&
        Objects.equals(this.permissions, zarazManagedComponent.permissions) &&
        Objects.equals(this.settings, zarazManagedComponent.settings) &&
        Objects.equals(this.type, zarazManagedComponent.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockingTriggers, defaultFields, defaultPurpose, enabled, name, vendorName, vendorPolicyUrl, actions, component, neoEvents, permissions, settings, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZarazManagedComponent {\n");
    sb.append("    blockingTriggers: ").append(toIndentedString(blockingTriggers)).append("\n");
    sb.append("    defaultFields: ").append(toIndentedString(defaultFields)).append("\n");
    sb.append("    defaultPurpose: ").append(toIndentedString(defaultPurpose)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorPolicyUrl: ").append(toIndentedString(vendorPolicyUrl)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    neoEvents: ").append(toIndentedString(neoEvents)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
    openapiFields.add("actions");
    openapiFields.add("component");
    openapiFields.add("neoEvents");
    openapiFields.add("permissions");
    openapiFields.add("settings");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("blockingTriggers");
    openapiRequiredFields.add("defaultFields");
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("component");
    openapiRequiredFields.add("permissions");
    openapiRequiredFields.add("settings");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZarazManagedComponent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZarazManagedComponent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZarazManagedComponent is not found in the empty JSON string", ZarazManagedComponent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZarazManagedComponent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZarazManagedComponent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ZarazManagedComponent.openapiRequiredFields) {
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
      if (!jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      if (jsonObj.get("neoEvents") != null && !jsonObj.get("neoEvents").isJsonNull()) {
        JsonArray jsonArrayneoEvents = jsonObj.getAsJsonArray("neoEvents");
        if (jsonArrayneoEvents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("neoEvents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `neoEvents` to be an array in the JSON string but got `%s`", jsonObj.get("neoEvents").toString()));
          }

          // validate the optional field `neoEvents` (array)
          for (int i = 0; i < jsonArrayneoEvents.size(); i++) {
            ZarazBaseMcAllOfActions.validateJsonElement(jsonArrayneoEvents.get(i));
          };
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("permissions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
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
       if (!ZarazManagedComponent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZarazManagedComponent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZarazManagedComponent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZarazManagedComponent.class));

       return (TypeAdapter<T>) new TypeAdapter<ZarazManagedComponent>() {
           @Override
           public void write(JsonWriter out, ZarazManagedComponent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZarazManagedComponent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZarazManagedComponent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZarazManagedComponent
  * @throws IOException if the JSON string is invalid with respect to ZarazManagedComponent
  */
  public static ZarazManagedComponent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZarazManagedComponent.class);
  }

 /**
  * Convert an instance of ZarazManagedComponent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
