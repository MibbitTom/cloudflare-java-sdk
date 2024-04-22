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
import cloudflare.sdk.models.RumModifyRulesRequestRulesInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * RumModifyRulesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RumModifyRulesRequest {
  public static final String SERIALIZED_NAME_DELETE_RULES = "delete_rules";
  @SerializedName(SERIALIZED_NAME_DELETE_RULES)
  private List<String> deleteRules = new ArrayList<>();

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<RumModifyRulesRequestRulesInner> rules = new ArrayList<>();

  public RumModifyRulesRequest() {
  }

  public RumModifyRulesRequest deleteRules(List<String> deleteRules) {
    this.deleteRules = deleteRules;
    return this;
  }

  public RumModifyRulesRequest addDeleteRulesItem(String deleteRulesItem) {
    if (this.deleteRules == null) {
      this.deleteRules = new ArrayList<>();
    }
    this.deleteRules.add(deleteRulesItem);
    return this;
  }

   /**
   * A list of rule identifiers to delete.
   * @return deleteRules
  **/
  @javax.annotation.Nullable
  public List<String> getDeleteRules() {
    return deleteRules;
  }

  public void setDeleteRules(List<String> deleteRules) {
    this.deleteRules = deleteRules;
  }


  public RumModifyRulesRequest rules(List<RumModifyRulesRequestRulesInner> rules) {
    this.rules = rules;
    return this;
  }

  public RumModifyRulesRequest addRulesItem(RumModifyRulesRequestRulesInner rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * A list of rules to create or update.
   * @return rules
  **/
  @javax.annotation.Nullable
  public List<RumModifyRulesRequestRulesInner> getRules() {
    return rules;
  }

  public void setRules(List<RumModifyRulesRequestRulesInner> rules) {
    this.rules = rules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumModifyRulesRequest rumModifyRulesRequest = (RumModifyRulesRequest) o;
    return Objects.equals(this.deleteRules, rumModifyRulesRequest.deleteRules) &&
        Objects.equals(this.rules, rumModifyRulesRequest.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteRules, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumModifyRulesRequest {\n");
    sb.append("    deleteRules: ").append(toIndentedString(deleteRules)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
    openapiFields.add("delete_rules");
    openapiFields.add("rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RumModifyRulesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RumModifyRulesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RumModifyRulesRequest is not found in the empty JSON string", RumModifyRulesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RumModifyRulesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RumModifyRulesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("delete_rules") != null && !jsonObj.get("delete_rules").isJsonNull() && !jsonObj.get("delete_rules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_rules` to be an array in the JSON string but got `%s`", jsonObj.get("delete_rules").toString()));
      }
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) {
        JsonArray jsonArrayrules = jsonObj.getAsJsonArray("rules");
        if (jsonArrayrules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
          }

          // validate the optional field `rules` (array)
          for (int i = 0; i < jsonArrayrules.size(); i++) {
            RumModifyRulesRequestRulesInner.validateJsonElement(jsonArrayrules.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RumModifyRulesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RumModifyRulesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RumModifyRulesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RumModifyRulesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RumModifyRulesRequest>() {
           @Override
           public void write(JsonWriter out, RumModifyRulesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RumModifyRulesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RumModifyRulesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RumModifyRulesRequest
  * @throws IOException if the JSON string is invalid with respect to RumModifyRulesRequest
  */
  public static RumModifyRulesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RumModifyRulesRequest.class);
  }

 /**
  * Convert an instance of RumModifyRulesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

