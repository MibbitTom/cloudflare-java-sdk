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
import org.openapitools.client.model.WorkersBinding;
import org.openapitools.client.model.WorkersLimits;
import org.openapitools.client.model.WorkersPlacementConfig;
import org.openapitools.client.model.WorkersScriptAndVersionSettingsItemMigrations;
import org.openapitools.client.model.WorkersTailConsumersScript;

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
 * WorkersScriptAndVersionSettingsItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class WorkersScriptAndVersionSettingsItem {
  public static final String SERIALIZED_NAME_BINDINGS = "bindings";
  @SerializedName(SERIALIZED_NAME_BINDINGS)
  private List<WorkersBinding> bindings = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMPATIBILITY_DATE = "compatibility_date";
  @SerializedName(SERIALIZED_NAME_COMPATIBILITY_DATE)
  private String compatibilityDate;

  public static final String SERIALIZED_NAME_COMPATIBILITY_FLAGS = "compatibility_flags";
  @SerializedName(SERIALIZED_NAME_COMPATIBILITY_FLAGS)
  private List<String> compatibilityFlags = new ArrayList<>();

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private WorkersLimits limits;

  public static final String SERIALIZED_NAME_LOGPUSH = "logpush";
  @SerializedName(SERIALIZED_NAME_LOGPUSH)
  private Boolean logpush;

  public static final String SERIALIZED_NAME_MIGRATIONS = "migrations";
  @SerializedName(SERIALIZED_NAME_MIGRATIONS)
  private WorkersScriptAndVersionSettingsItemMigrations migrations;

  public static final String SERIALIZED_NAME_PLACEMENT = "placement";
  @SerializedName(SERIALIZED_NAME_PLACEMENT)
  private WorkersPlacementConfig placement;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAIL_CONSUMERS = "tail_consumers";
  @SerializedName(SERIALIZED_NAME_TAIL_CONSUMERS)
  private List<WorkersTailConsumersScript> tailConsumers = new ArrayList<>();

  public static final String SERIALIZED_NAME_USAGE_MODEL = "usage_model";
  @SerializedName(SERIALIZED_NAME_USAGE_MODEL)
  private String usageModel;

  public WorkersScriptAndVersionSettingsItem() {
  }

  public WorkersScriptAndVersionSettingsItem bindings(List<WorkersBinding> bindings) {
    this.bindings = bindings;
    return this;
  }

  public WorkersScriptAndVersionSettingsItem addBindingsItem(WorkersBinding bindingsItem) {
    if (this.bindings == null) {
      this.bindings = new ArrayList<>();
    }
    this.bindings.add(bindingsItem);
    return this;
  }

   /**
   * List of bindings attached to this Worker
   * @return bindings
  **/
  @javax.annotation.Nullable
  public List<WorkersBinding> getBindings() {
    return bindings;
  }

  public void setBindings(List<WorkersBinding> bindings) {
    this.bindings = bindings;
  }


  public WorkersScriptAndVersionSettingsItem compatibilityDate(String compatibilityDate) {
    this.compatibilityDate = compatibilityDate;
    return this;
  }

   /**
   * Opt your Worker into changes after this date
   * @return compatibilityDate
  **/
  @javax.annotation.Nullable
  public String getCompatibilityDate() {
    return compatibilityDate;
  }

  public void setCompatibilityDate(String compatibilityDate) {
    this.compatibilityDate = compatibilityDate;
  }


  public WorkersScriptAndVersionSettingsItem compatibilityFlags(List<String> compatibilityFlags) {
    this.compatibilityFlags = compatibilityFlags;
    return this;
  }

  public WorkersScriptAndVersionSettingsItem addCompatibilityFlagsItem(String compatibilityFlagsItem) {
    if (this.compatibilityFlags == null) {
      this.compatibilityFlags = new ArrayList<>();
    }
    this.compatibilityFlags.add(compatibilityFlagsItem);
    return this;
  }

   /**
   * Opt your Worker into specific changes
   * @return compatibilityFlags
  **/
  @javax.annotation.Nullable
  public List<String> getCompatibilityFlags() {
    return compatibilityFlags;
  }

  public void setCompatibilityFlags(List<String> compatibilityFlags) {
    this.compatibilityFlags = compatibilityFlags;
  }


  public WorkersScriptAndVersionSettingsItem limits(WorkersLimits limits) {
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @javax.annotation.Nullable
  public WorkersLimits getLimits() {
    return limits;
  }

  public void setLimits(WorkersLimits limits) {
    this.limits = limits;
  }


  public WorkersScriptAndVersionSettingsItem logpush(Boolean logpush) {
    this.logpush = logpush;
    return this;
  }

   /**
   * Whether Logpush is turned on for the Worker.
   * @return logpush
  **/
  @javax.annotation.Nullable
  public Boolean getLogpush() {
    return logpush;
  }

  public void setLogpush(Boolean logpush) {
    this.logpush = logpush;
  }


  public WorkersScriptAndVersionSettingsItem migrations(WorkersScriptAndVersionSettingsItemMigrations migrations) {
    this.migrations = migrations;
    return this;
  }

   /**
   * Get migrations
   * @return migrations
  **/
  @javax.annotation.Nullable
  public WorkersScriptAndVersionSettingsItemMigrations getMigrations() {
    return migrations;
  }

  public void setMigrations(WorkersScriptAndVersionSettingsItemMigrations migrations) {
    this.migrations = migrations;
  }


  public WorkersScriptAndVersionSettingsItem placement(WorkersPlacementConfig placement) {
    this.placement = placement;
    return this;
  }

   /**
   * Get placement
   * @return placement
  **/
  @javax.annotation.Nullable
  public WorkersPlacementConfig getPlacement() {
    return placement;
  }

  public void setPlacement(WorkersPlacementConfig placement) {
    this.placement = placement;
  }


  public WorkersScriptAndVersionSettingsItem tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public WorkersScriptAndVersionSettingsItem addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags to help you manage your Workers
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public WorkersScriptAndVersionSettingsItem tailConsumers(List<WorkersTailConsumersScript> tailConsumers) {
    this.tailConsumers = tailConsumers;
    return this;
  }

  public WorkersScriptAndVersionSettingsItem addTailConsumersItem(WorkersTailConsumersScript tailConsumersItem) {
    if (this.tailConsumers == null) {
      this.tailConsumers = new ArrayList<>();
    }
    this.tailConsumers.add(tailConsumersItem);
    return this;
  }

   /**
   * List of Workers that will consume logs from the attached Worker.
   * @return tailConsumers
  **/
  @javax.annotation.Nullable
  public List<WorkersTailConsumersScript> getTailConsumers() {
    return tailConsumers;
  }

  public void setTailConsumers(List<WorkersTailConsumersScript> tailConsumers) {
    this.tailConsumers = tailConsumers;
  }


  public WorkersScriptAndVersionSettingsItem usageModel(String usageModel) {
    this.usageModel = usageModel;
    return this;
  }

   /**
   * Specifies the usage model for the Worker (e.g. &#39;bundled&#39; or &#39;unbound&#39;).
   * @return usageModel
  **/
  @javax.annotation.Nullable
  public String getUsageModel() {
    return usageModel;
  }

  public void setUsageModel(String usageModel) {
    this.usageModel = usageModel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkersScriptAndVersionSettingsItem workersScriptAndVersionSettingsItem = (WorkersScriptAndVersionSettingsItem) o;
    return Objects.equals(this.bindings, workersScriptAndVersionSettingsItem.bindings) &&
        Objects.equals(this.compatibilityDate, workersScriptAndVersionSettingsItem.compatibilityDate) &&
        Objects.equals(this.compatibilityFlags, workersScriptAndVersionSettingsItem.compatibilityFlags) &&
        Objects.equals(this.limits, workersScriptAndVersionSettingsItem.limits) &&
        Objects.equals(this.logpush, workersScriptAndVersionSettingsItem.logpush) &&
        Objects.equals(this.migrations, workersScriptAndVersionSettingsItem.migrations) &&
        Objects.equals(this.placement, workersScriptAndVersionSettingsItem.placement) &&
        Objects.equals(this.tags, workersScriptAndVersionSettingsItem.tags) &&
        Objects.equals(this.tailConsumers, workersScriptAndVersionSettingsItem.tailConsumers) &&
        Objects.equals(this.usageModel, workersScriptAndVersionSettingsItem.usageModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindings, compatibilityDate, compatibilityFlags, limits, logpush, migrations, placement, tags, tailConsumers, usageModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkersScriptAndVersionSettingsItem {\n");
    sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
    sb.append("    compatibilityDate: ").append(toIndentedString(compatibilityDate)).append("\n");
    sb.append("    compatibilityFlags: ").append(toIndentedString(compatibilityFlags)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    logpush: ").append(toIndentedString(logpush)).append("\n");
    sb.append("    migrations: ").append(toIndentedString(migrations)).append("\n");
    sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tailConsumers: ").append(toIndentedString(tailConsumers)).append("\n");
    sb.append("    usageModel: ").append(toIndentedString(usageModel)).append("\n");
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
    openapiFields.add("bindings");
    openapiFields.add("compatibility_date");
    openapiFields.add("compatibility_flags");
    openapiFields.add("limits");
    openapiFields.add("logpush");
    openapiFields.add("migrations");
    openapiFields.add("placement");
    openapiFields.add("tags");
    openapiFields.add("tail_consumers");
    openapiFields.add("usage_model");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WorkersScriptAndVersionSettingsItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkersScriptAndVersionSettingsItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkersScriptAndVersionSettingsItem is not found in the empty JSON string", WorkersScriptAndVersionSettingsItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkersScriptAndVersionSettingsItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkersScriptAndVersionSettingsItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("bindings") != null && !jsonObj.get("bindings").isJsonNull()) {
        JsonArray jsonArraybindings = jsonObj.getAsJsonArray("bindings");
        if (jsonArraybindings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("bindings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `bindings` to be an array in the JSON string but got `%s`", jsonObj.get("bindings").toString()));
          }

          // validate the optional field `bindings` (array)
          for (int i = 0; i < jsonArraybindings.size(); i++) {
            WorkersBinding.validateJsonElement(jsonArraybindings.get(i));
          };
        }
      }
      if ((jsonObj.get("compatibility_date") != null && !jsonObj.get("compatibility_date").isJsonNull()) && !jsonObj.get("compatibility_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `compatibility_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("compatibility_date").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("compatibility_flags") != null && !jsonObj.get("compatibility_flags").isJsonNull() && !jsonObj.get("compatibility_flags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `compatibility_flags` to be an array in the JSON string but got `%s`", jsonObj.get("compatibility_flags").toString()));
      }
      // validate the optional field `limits`
      if (jsonObj.get("limits") != null && !jsonObj.get("limits").isJsonNull()) {
        WorkersLimits.validateJsonElement(jsonObj.get("limits"));
      }
      // validate the optional field `migrations`
      if (jsonObj.get("migrations") != null && !jsonObj.get("migrations").isJsonNull()) {
        WorkersScriptAndVersionSettingsItemMigrations.validateJsonElement(jsonObj.get("migrations"));
      }
      // validate the optional field `placement`
      if (jsonObj.get("placement") != null && !jsonObj.get("placement").isJsonNull()) {
        WorkersPlacementConfig.validateJsonElement(jsonObj.get("placement"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if (jsonObj.get("tail_consumers") != null && !jsonObj.get("tail_consumers").isJsonNull()) {
        JsonArray jsonArraytailConsumers = jsonObj.getAsJsonArray("tail_consumers");
        if (jsonArraytailConsumers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tail_consumers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tail_consumers` to be an array in the JSON string but got `%s`", jsonObj.get("tail_consumers").toString()));
          }

          // validate the optional field `tail_consumers` (array)
          for (int i = 0; i < jsonArraytailConsumers.size(); i++) {
            WorkersTailConsumersScript.validateJsonElement(jsonArraytailConsumers.get(i));
          };
        }
      }
      if ((jsonObj.get("usage_model") != null && !jsonObj.get("usage_model").isJsonNull()) && !jsonObj.get("usage_model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usage_model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usage_model").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkersScriptAndVersionSettingsItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkersScriptAndVersionSettingsItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkersScriptAndVersionSettingsItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkersScriptAndVersionSettingsItem.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkersScriptAndVersionSettingsItem>() {
           @Override
           public void write(JsonWriter out, WorkersScriptAndVersionSettingsItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkersScriptAndVersionSettingsItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkersScriptAndVersionSettingsItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkersScriptAndVersionSettingsItem
  * @throws IOException if the JSON string is invalid with respect to WorkersScriptAndVersionSettingsItem
  */
  public static WorkersScriptAndVersionSettingsItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkersScriptAndVersionSettingsItem.class);
  }

 /**
  * Convert an instance of WorkersScriptAndVersionSettingsItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

