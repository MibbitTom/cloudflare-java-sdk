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
 * ZarazBaseTool
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZarazBaseTool {
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

  public ZarazBaseTool() {
  }

  public ZarazBaseTool blockingTriggers(List<String> blockingTriggers) {
    this.blockingTriggers = blockingTriggers;
    return this;
  }

  public ZarazBaseTool addBlockingTriggersItem(String blockingTriggersItem) {
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


  public ZarazBaseTool defaultFields(Map<String, ZarazBaseMcAllOfSettings> defaultFields) {
    this.defaultFields = defaultFields;
    return this;
  }

  public ZarazBaseTool putDefaultFieldsItem(String key, ZarazBaseMcAllOfSettings defaultFieldsItem) {
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


  public ZarazBaseTool defaultPurpose(String defaultPurpose) {
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


  public ZarazBaseTool enabled(Boolean enabled) {
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


  public ZarazBaseTool name(String name) {
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


  public ZarazBaseTool vendorName(String vendorName) {
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


  public ZarazBaseTool vendorPolicyUrl(String vendorPolicyUrl) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZarazBaseTool zarazBaseTool = (ZarazBaseTool) o;
    return Objects.equals(this.blockingTriggers, zarazBaseTool.blockingTriggers) &&
        Objects.equals(this.defaultFields, zarazBaseTool.defaultFields) &&
        Objects.equals(this.defaultPurpose, zarazBaseTool.defaultPurpose) &&
        Objects.equals(this.enabled, zarazBaseTool.enabled) &&
        Objects.equals(this.name, zarazBaseTool.name) &&
        Objects.equals(this.vendorName, zarazBaseTool.vendorName) &&
        Objects.equals(this.vendorPolicyUrl, zarazBaseTool.vendorPolicyUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockingTriggers, defaultFields, defaultPurpose, enabled, name, vendorName, vendorPolicyUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZarazBaseTool {\n");
    sb.append("    blockingTriggers: ").append(toIndentedString(blockingTriggers)).append("\n");
    sb.append("    defaultFields: ").append(toIndentedString(defaultFields)).append("\n");
    sb.append("    defaultPurpose: ").append(toIndentedString(defaultPurpose)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorPolicyUrl: ").append(toIndentedString(vendorPolicyUrl)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("blockingTriggers");
    openapiRequiredFields.add("defaultFields");
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZarazBaseTool
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZarazBaseTool.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZarazBaseTool is not found in the empty JSON string", ZarazBaseTool.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZarazBaseTool.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZarazBaseTool` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ZarazBaseTool.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZarazBaseTool.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZarazBaseTool' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZarazBaseTool> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZarazBaseTool.class));

       return (TypeAdapter<T>) new TypeAdapter<ZarazBaseTool>() {
           @Override
           public void write(JsonWriter out, ZarazBaseTool value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZarazBaseTool read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZarazBaseTool given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZarazBaseTool
  * @throws IOException if the JSON string is invalid with respect to ZarazBaseTool
  */
  public static ZarazBaseTool fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZarazBaseTool.class);
  }

 /**
  * Convert an instance of ZarazBaseTool to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
