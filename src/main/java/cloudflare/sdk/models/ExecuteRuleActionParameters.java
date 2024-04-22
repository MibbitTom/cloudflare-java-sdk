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
import cloudflare.sdk.models.ExecuteRuleActionParametersId;
import cloudflare.sdk.models.MatchedData;
import cloudflare.sdk.models.Overrides;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * ExecuteRuleActionParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ExecuteRuleActionParameters {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ExecuteRuleActionParametersId id;

  public static final String SERIALIZED_NAME_MATCHED_DATA = "matched_data";
  @SerializedName(SERIALIZED_NAME_MATCHED_DATA)
  private MatchedData matchedData;

  public static final String SERIALIZED_NAME_OVERRIDES = "overrides";
  @SerializedName(SERIALIZED_NAME_OVERRIDES)
  private Overrides overrides;

  public ExecuteRuleActionParameters() {
  }

  public ExecuteRuleActionParameters id(ExecuteRuleActionParametersId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public ExecuteRuleActionParametersId getId() {
    return id;
  }

  public void setId(ExecuteRuleActionParametersId id) {
    this.id = id;
  }


  public ExecuteRuleActionParameters matchedData(MatchedData matchedData) {
    this.matchedData = matchedData;
    return this;
  }

   /**
   * Get matchedData
   * @return matchedData
  **/
  @javax.annotation.Nullable
  public MatchedData getMatchedData() {
    return matchedData;
  }

  public void setMatchedData(MatchedData matchedData) {
    this.matchedData = matchedData;
  }


  public ExecuteRuleActionParameters overrides(Overrides overrides) {
    this.overrides = overrides;
    return this;
  }

   /**
   * Get overrides
   * @return overrides
  **/
  @javax.annotation.Nullable
  public Overrides getOverrides() {
    return overrides;
  }

  public void setOverrides(Overrides overrides) {
    this.overrides = overrides;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteRuleActionParameters executeRuleActionParameters = (ExecuteRuleActionParameters) o;
    return Objects.equals(this.id, executeRuleActionParameters.id) &&
        Objects.equals(this.matchedData, executeRuleActionParameters.matchedData) &&
        Objects.equals(this.overrides, executeRuleActionParameters.overrides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, matchedData, overrides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteRuleActionParameters {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    matchedData: ").append(toIndentedString(matchedData)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("matched_data");
    openapiFields.add("overrides");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExecuteRuleActionParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExecuteRuleActionParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExecuteRuleActionParameters is not found in the empty JSON string", ExecuteRuleActionParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExecuteRuleActionParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExecuteRuleActionParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExecuteRuleActionParameters.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `id`
      ExecuteRuleActionParametersId.validateJsonElement(jsonObj.get("id"));
      // validate the optional field `matched_data`
      if (jsonObj.get("matched_data") != null && !jsonObj.get("matched_data").isJsonNull()) {
        MatchedData.validateJsonElement(jsonObj.get("matched_data"));
      }
      // validate the optional field `overrides`
      if (jsonObj.get("overrides") != null && !jsonObj.get("overrides").isJsonNull()) {
        Overrides.validateJsonElement(jsonObj.get("overrides"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExecuteRuleActionParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExecuteRuleActionParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExecuteRuleActionParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExecuteRuleActionParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<ExecuteRuleActionParameters>() {
           @Override
           public void write(JsonWriter out, ExecuteRuleActionParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExecuteRuleActionParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExecuteRuleActionParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExecuteRuleActionParameters
  * @throws IOException if the JSON string is invalid with respect to ExecuteRuleActionParameters
  */
  public static ExecuteRuleActionParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExecuteRuleActionParameters.class);
  }

 /**
  * Convert an instance of ExecuteRuleActionParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

