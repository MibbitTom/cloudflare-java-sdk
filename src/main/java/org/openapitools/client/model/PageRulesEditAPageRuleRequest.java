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
import org.openapitools.client.model.ZonesActionsInner;
import org.openapitools.client.model.ZonesStatus;
import org.openapitools.client.model.ZonesTarget;

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
 * PageRulesEditAPageRuleRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class PageRulesEditAPageRuleRequest {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<ZonesActionsInner> actions = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority = 1;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ZonesStatus status = ZonesStatus.DISABLED;

  public static final String SERIALIZED_NAME_TARGETS = "targets";
  @SerializedName(SERIALIZED_NAME_TARGETS)
  private List<ZonesTarget> targets = new ArrayList<>();

  public PageRulesEditAPageRuleRequest() {
  }

  public PageRulesEditAPageRuleRequest actions(List<ZonesActionsInner> actions) {
    this.actions = actions;
    return this;
  }

  public PageRulesEditAPageRuleRequest addActionsItem(ZonesActionsInner actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * The set of actions to perform if the targets of this rule match the request. Actions can redirect to another URL or override settings, but not both.
   * @return actions
  **/
  @javax.annotation.Nullable
  public List<ZonesActionsInner> getActions() {
    return actions;
  }

  public void setActions(List<ZonesActionsInner> actions) {
    this.actions = actions;
  }


  public PageRulesEditAPageRuleRequest priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The priority of the rule, used to define which Page Rule is processed over another. A higher number indicates a higher priority. For example, if you have a catch-all Page Rule (rule A: &#x60;/images/_*&#x60;) but want a more specific Page Rule to take precedence (rule B: &#x60;/images/special/_*&#x60;), specify a higher priority for rule B so it overrides rule A.
   * @return priority
  **/
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public PageRulesEditAPageRuleRequest status(ZonesStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ZonesStatus getStatus() {
    return status;
  }

  public void setStatus(ZonesStatus status) {
    this.status = status;
  }


  public PageRulesEditAPageRuleRequest targets(List<ZonesTarget> targets) {
    this.targets = targets;
    return this;
  }

  public PageRulesEditAPageRuleRequest addTargetsItem(ZonesTarget targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * The rule targets to evaluate on each request.
   * @return targets
  **/
  @javax.annotation.Nullable
  public List<ZonesTarget> getTargets() {
    return targets;
  }

  public void setTargets(List<ZonesTarget> targets) {
    this.targets = targets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageRulesEditAPageRuleRequest pageRulesEditAPageRuleRequest = (PageRulesEditAPageRuleRequest) o;
    return Objects.equals(this.actions, pageRulesEditAPageRuleRequest.actions) &&
        Objects.equals(this.priority, pageRulesEditAPageRuleRequest.priority) &&
        Objects.equals(this.status, pageRulesEditAPageRuleRequest.status) &&
        Objects.equals(this.targets, pageRulesEditAPageRuleRequest.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, priority, status, targets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageRulesEditAPageRuleRequest {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
    openapiFields.add("actions");
    openapiFields.add("priority");
    openapiFields.add("status");
    openapiFields.add("targets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PageRulesEditAPageRuleRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PageRulesEditAPageRuleRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageRulesEditAPageRuleRequest is not found in the empty JSON string", PageRulesEditAPageRuleRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PageRulesEditAPageRuleRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageRulesEditAPageRuleRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("actions") != null && !jsonObj.get("actions").isJsonNull()) {
        JsonArray jsonArrayactions = jsonObj.getAsJsonArray("actions");
        if (jsonArrayactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("actions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `actions` to be an array in the JSON string but got `%s`", jsonObj.get("actions").toString()));
          }

          // validate the optional field `actions` (array)
          for (int i = 0; i < jsonArrayactions.size(); i++) {
            ZonesActionsInner.validateJsonElement(jsonArrayactions.get(i));
          };
        }
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        ZonesStatus.validateJsonElement(jsonObj.get("status"));
      }
      if (jsonObj.get("targets") != null && !jsonObj.get("targets").isJsonNull()) {
        JsonArray jsonArraytargets = jsonObj.getAsJsonArray("targets");
        if (jsonArraytargets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("targets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `targets` to be an array in the JSON string but got `%s`", jsonObj.get("targets").toString()));
          }

          // validate the optional field `targets` (array)
          for (int i = 0; i < jsonArraytargets.size(); i++) {
            ZonesTarget.validateJsonElement(jsonArraytargets.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageRulesEditAPageRuleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageRulesEditAPageRuleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageRulesEditAPageRuleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageRulesEditAPageRuleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PageRulesEditAPageRuleRequest>() {
           @Override
           public void write(JsonWriter out, PageRulesEditAPageRuleRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageRulesEditAPageRuleRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PageRulesEditAPageRuleRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageRulesEditAPageRuleRequest
  * @throws IOException if the JSON string is invalid with respect to PageRulesEditAPageRuleRequest
  */
  public static PageRulesEditAPageRuleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageRulesEditAPageRuleRequest.class);
  }

 /**
  * Convert an instance of PageRulesEditAPageRuleRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

