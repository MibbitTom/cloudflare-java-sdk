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
import org.openapitools.client.model.DlpRiskLevel;

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
 * DlpGetBehaviorsResponseAllOfResultBehaviors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DlpGetBehaviorsResponseAllOfResultBehaviors {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RISK_LEVEL = "risk_level";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private DlpRiskLevel riskLevel;

  public DlpGetBehaviorsResponseAllOfResultBehaviors() {
  }

  public DlpGetBehaviorsResponseAllOfResultBehaviors description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public DlpGetBehaviorsResponseAllOfResultBehaviors enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public DlpGetBehaviorsResponseAllOfResultBehaviors name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DlpGetBehaviorsResponseAllOfResultBehaviors riskLevel(DlpRiskLevel riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * Get riskLevel
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  public DlpRiskLevel getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(DlpRiskLevel riskLevel) {
    this.riskLevel = riskLevel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DlpGetBehaviorsResponseAllOfResultBehaviors dlpGetBehaviorsResponseAllOfResultBehaviors = (DlpGetBehaviorsResponseAllOfResultBehaviors) o;
    return Objects.equals(this.description, dlpGetBehaviorsResponseAllOfResultBehaviors.description) &&
        Objects.equals(this.enabled, dlpGetBehaviorsResponseAllOfResultBehaviors.enabled) &&
        Objects.equals(this.name, dlpGetBehaviorsResponseAllOfResultBehaviors.name) &&
        Objects.equals(this.riskLevel, dlpGetBehaviorsResponseAllOfResultBehaviors.riskLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enabled, name, riskLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DlpGetBehaviorsResponseAllOfResultBehaviors {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("name");
    openapiFields.add("risk_level");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DlpGetBehaviorsResponseAllOfResultBehaviors
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DlpGetBehaviorsResponseAllOfResultBehaviors.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DlpGetBehaviorsResponseAllOfResultBehaviors is not found in the empty JSON string", DlpGetBehaviorsResponseAllOfResultBehaviors.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DlpGetBehaviorsResponseAllOfResultBehaviors.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DlpGetBehaviorsResponseAllOfResultBehaviors` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `risk_level`
      if (jsonObj.get("risk_level") != null && !jsonObj.get("risk_level").isJsonNull()) {
        DlpRiskLevel.validateJsonElement(jsonObj.get("risk_level"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DlpGetBehaviorsResponseAllOfResultBehaviors.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DlpGetBehaviorsResponseAllOfResultBehaviors' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DlpGetBehaviorsResponseAllOfResultBehaviors> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DlpGetBehaviorsResponseAllOfResultBehaviors.class));

       return (TypeAdapter<T>) new TypeAdapter<DlpGetBehaviorsResponseAllOfResultBehaviors>() {
           @Override
           public void write(JsonWriter out, DlpGetBehaviorsResponseAllOfResultBehaviors value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DlpGetBehaviorsResponseAllOfResultBehaviors read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DlpGetBehaviorsResponseAllOfResultBehaviors given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DlpGetBehaviorsResponseAllOfResultBehaviors
  * @throws IOException if the JSON string is invalid with respect to DlpGetBehaviorsResponseAllOfResultBehaviors
  */
  public static DlpGetBehaviorsResponseAllOfResultBehaviors fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DlpGetBehaviorsResponseAllOfResultBehaviors.class);
  }

 /**
  * Convert an instance of DlpGetBehaviorsResponseAllOfResultBehaviors to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

