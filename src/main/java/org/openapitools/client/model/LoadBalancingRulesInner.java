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
import org.openapitools.client.model.LoadBalancingRulesInnerFixedResponse;
import org.openapitools.client.model.LoadBalancingRulesInnerOverrides;

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
 * A rule object containing conditions and overrides for this load balancer to evaluate.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class LoadBalancingRulesInner {
  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private String condition;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled = false;

  public static final String SERIALIZED_NAME_FIXED_RESPONSE = "fixed_response";
  @SerializedName(SERIALIZED_NAME_FIXED_RESPONSE)
  private LoadBalancingRulesInnerFixedResponse fixedResponse;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OVERRIDES = "overrides";
  @SerializedName(SERIALIZED_NAME_OVERRIDES)
  private LoadBalancingRulesInnerOverrides overrides;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority = 0;

  public static final String SERIALIZED_NAME_TERMINATES = "terminates";
  @SerializedName(SERIALIZED_NAME_TERMINATES)
  private Boolean terminates = false;

  public LoadBalancingRulesInner() {
  }

  public LoadBalancingRulesInner condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * The condition expressions to evaluate. If the condition evaluates to true, the overrides or fixed_response in this rule will be applied. An empty condition is always true. For more details on condition expressions, please see https://developers.cloudflare.com/load-balancing/understand-basics/load-balancing-rules/expressions.
   * @return condition
  **/
  @javax.annotation.Nullable
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }


  public LoadBalancingRulesInner disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Disable this specific rule. It will no longer be evaluated by this load balancer.
   * @return disabled
  **/
  @javax.annotation.Nullable
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public LoadBalancingRulesInner fixedResponse(LoadBalancingRulesInnerFixedResponse fixedResponse) {
    this.fixedResponse = fixedResponse;
    return this;
  }

   /**
   * Get fixedResponse
   * @return fixedResponse
  **/
  @javax.annotation.Nullable
  public LoadBalancingRulesInnerFixedResponse getFixedResponse() {
    return fixedResponse;
  }

  public void setFixedResponse(LoadBalancingRulesInnerFixedResponse fixedResponse) {
    this.fixedResponse = fixedResponse;
  }


  public LoadBalancingRulesInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of this rule. Only used for human readability.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public LoadBalancingRulesInner overrides(LoadBalancingRulesInnerOverrides overrides) {
    this.overrides = overrides;
    return this;
  }

   /**
   * Get overrides
   * @return overrides
  **/
  @javax.annotation.Nullable
  public LoadBalancingRulesInnerOverrides getOverrides() {
    return overrides;
  }

  public void setOverrides(LoadBalancingRulesInnerOverrides overrides) {
    this.overrides = overrides;
  }


  public LoadBalancingRulesInner priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The order in which rules should be executed in relation to each other. Lower values are executed first. Values do not need to be sequential. If no value is provided for any rule the array order of the rules field will be used to assign a priority.
   * minimum: 0
   * @return priority
  **/
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public LoadBalancingRulesInner terminates(Boolean terminates) {
    this.terminates = terminates;
    return this;
  }

   /**
   * If this rule&#39;s condition is true, this causes rule evaluation to stop after processing this rule.
   * @return terminates
  **/
  @javax.annotation.Nullable
  public Boolean getTerminates() {
    return terminates;
  }

  public void setTerminates(Boolean terminates) {
    this.terminates = terminates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadBalancingRulesInner loadBalancingRulesInner = (LoadBalancingRulesInner) o;
    return Objects.equals(this.condition, loadBalancingRulesInner.condition) &&
        Objects.equals(this.disabled, loadBalancingRulesInner.disabled) &&
        Objects.equals(this.fixedResponse, loadBalancingRulesInner.fixedResponse) &&
        Objects.equals(this.name, loadBalancingRulesInner.name) &&
        Objects.equals(this.overrides, loadBalancingRulesInner.overrides) &&
        Objects.equals(this.priority, loadBalancingRulesInner.priority) &&
        Objects.equals(this.terminates, loadBalancingRulesInner.terminates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, disabled, fixedResponse, name, overrides, priority, terminates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancingRulesInner {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    fixedResponse: ").append(toIndentedString(fixedResponse)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    terminates: ").append(toIndentedString(terminates)).append("\n");
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
    openapiFields.add("condition");
    openapiFields.add("disabled");
    openapiFields.add("fixed_response");
    openapiFields.add("name");
    openapiFields.add("overrides");
    openapiFields.add("priority");
    openapiFields.add("terminates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoadBalancingRulesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoadBalancingRulesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoadBalancingRulesInner is not found in the empty JSON string", LoadBalancingRulesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoadBalancingRulesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoadBalancingRulesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("condition") != null && !jsonObj.get("condition").isJsonNull()) && !jsonObj.get("condition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `condition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("condition").toString()));
      }
      // validate the optional field `fixed_response`
      if (jsonObj.get("fixed_response") != null && !jsonObj.get("fixed_response").isJsonNull()) {
        LoadBalancingRulesInnerFixedResponse.validateJsonElement(jsonObj.get("fixed_response"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `overrides`
      if (jsonObj.get("overrides") != null && !jsonObj.get("overrides").isJsonNull()) {
        LoadBalancingRulesInnerOverrides.validateJsonElement(jsonObj.get("overrides"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoadBalancingRulesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoadBalancingRulesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoadBalancingRulesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoadBalancingRulesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LoadBalancingRulesInner>() {
           @Override
           public void write(JsonWriter out, LoadBalancingRulesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoadBalancingRulesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoadBalancingRulesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoadBalancingRulesInner
  * @throws IOException if the JSON string is invalid with respect to LoadBalancingRulesInner
  */
  public static LoadBalancingRulesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoadBalancingRulesInner.class);
  }

 /**
  * Convert an instance of LoadBalancingRulesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

