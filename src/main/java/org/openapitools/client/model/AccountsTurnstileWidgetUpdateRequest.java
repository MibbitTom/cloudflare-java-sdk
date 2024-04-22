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
import org.openapitools.client.model.TurnstileClearanceLevel;
import org.openapitools.client.model.TurnstileMode;

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
 * AccountsTurnstileWidgetUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccountsTurnstileWidgetUpdateRequest {
  public static final String SERIALIZED_NAME_BOT_FIGHT_MODE = "bot_fight_mode";
  @SerializedName(SERIALIZED_NAME_BOT_FIGHT_MODE)
  private Boolean botFightMode;

  public static final String SERIALIZED_NAME_CLEARANCE_LEVEL = "clearance_level";
  @SerializedName(SERIALIZED_NAME_CLEARANCE_LEVEL)
  private TurnstileClearanceLevel clearanceLevel;

  public static final String SERIALIZED_NAME_DOMAINS = "domains";
  @SerializedName(SERIALIZED_NAME_DOMAINS)
  private List<String> domains = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private TurnstileMode mode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OFFLABEL = "offlabel";
  @SerializedName(SERIALIZED_NAME_OFFLABEL)
  private Boolean offlabel;

  public AccountsTurnstileWidgetUpdateRequest() {
  }

  public AccountsTurnstileWidgetUpdateRequest botFightMode(Boolean botFightMode) {
    this.botFightMode = botFightMode;
    return this;
  }

   /**
   * If bot_fight_mode is set to &#x60;true&#x60;, Cloudflare issues computationally expensive challenges in response to malicious bots (ENT only). 
   * @return botFightMode
  **/
  @javax.annotation.Nullable
  public Boolean getBotFightMode() {
    return botFightMode;
  }

  public void setBotFightMode(Boolean botFightMode) {
    this.botFightMode = botFightMode;
  }


  public AccountsTurnstileWidgetUpdateRequest clearanceLevel(TurnstileClearanceLevel clearanceLevel) {
    this.clearanceLevel = clearanceLevel;
    return this;
  }

   /**
   * Get clearanceLevel
   * @return clearanceLevel
  **/
  @javax.annotation.Nullable
  public TurnstileClearanceLevel getClearanceLevel() {
    return clearanceLevel;
  }

  public void setClearanceLevel(TurnstileClearanceLevel clearanceLevel) {
    this.clearanceLevel = clearanceLevel;
  }


  public AccountsTurnstileWidgetUpdateRequest domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public AccountsTurnstileWidgetUpdateRequest addDomainsItem(String domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<>();
    }
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * Get domains
   * @return domains
  **/
  @javax.annotation.Nonnull
  public List<String> getDomains() {
    return domains;
  }

  public void setDomains(List<String> domains) {
    this.domains = domains;
  }


  public AccountsTurnstileWidgetUpdateRequest mode(TurnstileMode mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nonnull
  public TurnstileMode getMode() {
    return mode;
  }

  public void setMode(TurnstileMode mode) {
    this.mode = mode;
  }


  public AccountsTurnstileWidgetUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Human readable widget name. Not unique. Cloudflare suggests that you set this to a meaningful string to make it easier to identify your widget, and where it is used. 
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccountsTurnstileWidgetUpdateRequest offlabel(Boolean offlabel) {
    this.offlabel = offlabel;
    return this;
  }

   /**
   * Do not show any Cloudflare branding on the widget (ENT only). 
   * @return offlabel
  **/
  @javax.annotation.Nullable
  public Boolean getOfflabel() {
    return offlabel;
  }

  public void setOfflabel(Boolean offlabel) {
    this.offlabel = offlabel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsTurnstileWidgetUpdateRequest accountsTurnstileWidgetUpdateRequest = (AccountsTurnstileWidgetUpdateRequest) o;
    return Objects.equals(this.botFightMode, accountsTurnstileWidgetUpdateRequest.botFightMode) &&
        Objects.equals(this.clearanceLevel, accountsTurnstileWidgetUpdateRequest.clearanceLevel) &&
        Objects.equals(this.domains, accountsTurnstileWidgetUpdateRequest.domains) &&
        Objects.equals(this.mode, accountsTurnstileWidgetUpdateRequest.mode) &&
        Objects.equals(this.name, accountsTurnstileWidgetUpdateRequest.name) &&
        Objects.equals(this.offlabel, accountsTurnstileWidgetUpdateRequest.offlabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botFightMode, clearanceLevel, domains, mode, name, offlabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsTurnstileWidgetUpdateRequest {\n");
    sb.append("    botFightMode: ").append(toIndentedString(botFightMode)).append("\n");
    sb.append("    clearanceLevel: ").append(toIndentedString(clearanceLevel)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    offlabel: ").append(toIndentedString(offlabel)).append("\n");
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
    openapiFields.add("bot_fight_mode");
    openapiFields.add("clearance_level");
    openapiFields.add("domains");
    openapiFields.add("mode");
    openapiFields.add("name");
    openapiFields.add("offlabel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("domains");
    openapiRequiredFields.add("mode");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccountsTurnstileWidgetUpdateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountsTurnstileWidgetUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountsTurnstileWidgetUpdateRequest is not found in the empty JSON string", AccountsTurnstileWidgetUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountsTurnstileWidgetUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountsTurnstileWidgetUpdateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountsTurnstileWidgetUpdateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `clearance_level`
      if (jsonObj.get("clearance_level") != null && !jsonObj.get("clearance_level").isJsonNull()) {
        TurnstileClearanceLevel.validateJsonElement(jsonObj.get("clearance_level"));
      }
      // ensure the required json array is present
      if (jsonObj.get("domains") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("domains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `domains` to be an array in the JSON string but got `%s`", jsonObj.get("domains").toString()));
      }
      // validate the required field `mode`
      TurnstileMode.validateJsonElement(jsonObj.get("mode"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountsTurnstileWidgetUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountsTurnstileWidgetUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountsTurnstileWidgetUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountsTurnstileWidgetUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountsTurnstileWidgetUpdateRequest>() {
           @Override
           public void write(JsonWriter out, AccountsTurnstileWidgetUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountsTurnstileWidgetUpdateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountsTurnstileWidgetUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountsTurnstileWidgetUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to AccountsTurnstileWidgetUpdateRequest
  */
  public static AccountsTurnstileWidgetUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountsTurnstileWidgetUpdateRequest.class);
  }

 /**
  * Convert an instance of AccountsTurnstileWidgetUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

