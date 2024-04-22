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
import cloudflare.sdk.models.TurnstileClearanceLevel;
import cloudflare.sdk.models.TurnstileMode;
import cloudflare.sdk.models.TurnstileRegion;
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
 * AccountsTurnstileWidgetCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccountsTurnstileWidgetCreateRequest {
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

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private TurnstileRegion region = TurnstileRegion.WORLD;

  public AccountsTurnstileWidgetCreateRequest() {
  }

  public AccountsTurnstileWidgetCreateRequest botFightMode(Boolean botFightMode) {
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


  public AccountsTurnstileWidgetCreateRequest clearanceLevel(TurnstileClearanceLevel clearanceLevel) {
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


  public AccountsTurnstileWidgetCreateRequest domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public AccountsTurnstileWidgetCreateRequest addDomainsItem(String domainsItem) {
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


  public AccountsTurnstileWidgetCreateRequest mode(TurnstileMode mode) {
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


  public AccountsTurnstileWidgetCreateRequest name(String name) {
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


  public AccountsTurnstileWidgetCreateRequest offlabel(Boolean offlabel) {
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


  public AccountsTurnstileWidgetCreateRequest region(TurnstileRegion region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  public TurnstileRegion getRegion() {
    return region;
  }

  public void setRegion(TurnstileRegion region) {
    this.region = region;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsTurnstileWidgetCreateRequest accountsTurnstileWidgetCreateRequest = (AccountsTurnstileWidgetCreateRequest) o;
    return Objects.equals(this.botFightMode, accountsTurnstileWidgetCreateRequest.botFightMode) &&
        Objects.equals(this.clearanceLevel, accountsTurnstileWidgetCreateRequest.clearanceLevel) &&
        Objects.equals(this.domains, accountsTurnstileWidgetCreateRequest.domains) &&
        Objects.equals(this.mode, accountsTurnstileWidgetCreateRequest.mode) &&
        Objects.equals(this.name, accountsTurnstileWidgetCreateRequest.name) &&
        Objects.equals(this.offlabel, accountsTurnstileWidgetCreateRequest.offlabel) &&
        Objects.equals(this.region, accountsTurnstileWidgetCreateRequest.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botFightMode, clearanceLevel, domains, mode, name, offlabel, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsTurnstileWidgetCreateRequest {\n");
    sb.append("    botFightMode: ").append(toIndentedString(botFightMode)).append("\n");
    sb.append("    clearanceLevel: ").append(toIndentedString(clearanceLevel)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    offlabel: ").append(toIndentedString(offlabel)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
    openapiFields.add("region");

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
  * @throws IOException if the JSON Element is invalid with respect to AccountsTurnstileWidgetCreateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountsTurnstileWidgetCreateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountsTurnstileWidgetCreateRequest is not found in the empty JSON string", AccountsTurnstileWidgetCreateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountsTurnstileWidgetCreateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountsTurnstileWidgetCreateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountsTurnstileWidgetCreateRequest.openapiRequiredFields) {
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
      // validate the optional field `region`
      if (jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) {
        TurnstileRegion.validateJsonElement(jsonObj.get("region"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountsTurnstileWidgetCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountsTurnstileWidgetCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountsTurnstileWidgetCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountsTurnstileWidgetCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountsTurnstileWidgetCreateRequest>() {
           @Override
           public void write(JsonWriter out, AccountsTurnstileWidgetCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountsTurnstileWidgetCreateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountsTurnstileWidgetCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountsTurnstileWidgetCreateRequest
  * @throws IOException if the JSON string is invalid with respect to AccountsTurnstileWidgetCreateRequest
  */
  public static AccountsTurnstileWidgetCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountsTurnstileWidgetCreateRequest.class);
  }

 /**
  * Convert an instance of AccountsTurnstileWidgetCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
