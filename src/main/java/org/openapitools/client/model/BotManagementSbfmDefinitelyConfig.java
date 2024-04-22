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
import org.openapitools.client.model.BotManagementSbfmDefinitelyAutomated;
import org.openapitools.client.model.BotManagementSbfmVerifiedBots;

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
 * BotManagementSbfmDefinitelyConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class BotManagementSbfmDefinitelyConfig {
  public static final String SERIALIZED_NAME_ENABLE_JS = "enable_js";
  @SerializedName(SERIALIZED_NAME_ENABLE_JS)
  private Boolean enableJs;

  public static final String SERIALIZED_NAME_USING_LATEST_MODEL = "using_latest_model";
  @SerializedName(SERIALIZED_NAME_USING_LATEST_MODEL)
  private Boolean usingLatestModel;

  public static final String SERIALIZED_NAME_OPTIMIZE_WORDPRESS = "optimize_wordpress";
  @SerializedName(SERIALIZED_NAME_OPTIMIZE_WORDPRESS)
  private Boolean optimizeWordpress;

  public static final String SERIALIZED_NAME_SBFM_DEFINITELY_AUTOMATED = "sbfm_definitely_automated";
  @SerializedName(SERIALIZED_NAME_SBFM_DEFINITELY_AUTOMATED)
  private BotManagementSbfmDefinitelyAutomated sbfmDefinitelyAutomated;

  public static final String SERIALIZED_NAME_SBFM_STATIC_RESOURCE_PROTECTION = "sbfm_static_resource_protection";
  @SerializedName(SERIALIZED_NAME_SBFM_STATIC_RESOURCE_PROTECTION)
  private Boolean sbfmStaticResourceProtection;

  public static final String SERIALIZED_NAME_SBFM_VERIFIED_BOTS = "sbfm_verified_bots";
  @SerializedName(SERIALIZED_NAME_SBFM_VERIFIED_BOTS)
  private BotManagementSbfmVerifiedBots sbfmVerifiedBots;

  public BotManagementSbfmDefinitelyConfig() {
  }

  public BotManagementSbfmDefinitelyConfig(
     Boolean usingLatestModel
  ) {
    this();
    this.usingLatestModel = usingLatestModel;
  }

  public BotManagementSbfmDefinitelyConfig enableJs(Boolean enableJs) {
    this.enableJs = enableJs;
    return this;
  }

   /**
   * Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
   * @return enableJs
  **/
  @javax.annotation.Nullable
  public Boolean getEnableJs() {
    return enableJs;
  }

  public void setEnableJs(Boolean enableJs) {
    this.enableJs = enableJs;
  }


   /**
   * A read-only field that indicates whether the zone currently is running the latest ML model. 
   * @return usingLatestModel
  **/
  @javax.annotation.Nullable
  public Boolean getUsingLatestModel() {
    return usingLatestModel;
  }



  public BotManagementSbfmDefinitelyConfig optimizeWordpress(Boolean optimizeWordpress) {
    this.optimizeWordpress = optimizeWordpress;
    return this;
  }

   /**
   * Whether to optimize Super Bot Fight Mode protections for Wordpress.
   * @return optimizeWordpress
  **/
  @javax.annotation.Nullable
  public Boolean getOptimizeWordpress() {
    return optimizeWordpress;
  }

  public void setOptimizeWordpress(Boolean optimizeWordpress) {
    this.optimizeWordpress = optimizeWordpress;
  }


  public BotManagementSbfmDefinitelyConfig sbfmDefinitelyAutomated(BotManagementSbfmDefinitelyAutomated sbfmDefinitelyAutomated) {
    this.sbfmDefinitelyAutomated = sbfmDefinitelyAutomated;
    return this;
  }

   /**
   * Get sbfmDefinitelyAutomated
   * @return sbfmDefinitelyAutomated
  **/
  @javax.annotation.Nullable
  public BotManagementSbfmDefinitelyAutomated getSbfmDefinitelyAutomated() {
    return sbfmDefinitelyAutomated;
  }

  public void setSbfmDefinitelyAutomated(BotManagementSbfmDefinitelyAutomated sbfmDefinitelyAutomated) {
    this.sbfmDefinitelyAutomated = sbfmDefinitelyAutomated;
  }


  public BotManagementSbfmDefinitelyConfig sbfmStaticResourceProtection(Boolean sbfmStaticResourceProtection) {
    this.sbfmStaticResourceProtection = sbfmStaticResourceProtection;
    return this;
  }

   /**
   * Super Bot Fight Mode (SBFM) to enable static resource protection. Enable if static resources on your application need bot protection. Note: Static resource protection can also result in legitimate traffic being blocked. 
   * @return sbfmStaticResourceProtection
  **/
  @javax.annotation.Nullable
  public Boolean getSbfmStaticResourceProtection() {
    return sbfmStaticResourceProtection;
  }

  public void setSbfmStaticResourceProtection(Boolean sbfmStaticResourceProtection) {
    this.sbfmStaticResourceProtection = sbfmStaticResourceProtection;
  }


  public BotManagementSbfmDefinitelyConfig sbfmVerifiedBots(BotManagementSbfmVerifiedBots sbfmVerifiedBots) {
    this.sbfmVerifiedBots = sbfmVerifiedBots;
    return this;
  }

   /**
   * Get sbfmVerifiedBots
   * @return sbfmVerifiedBots
  **/
  @javax.annotation.Nullable
  public BotManagementSbfmVerifiedBots getSbfmVerifiedBots() {
    return sbfmVerifiedBots;
  }

  public void setSbfmVerifiedBots(BotManagementSbfmVerifiedBots sbfmVerifiedBots) {
    this.sbfmVerifiedBots = sbfmVerifiedBots;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BotManagementSbfmDefinitelyConfig botManagementSbfmDefinitelyConfig = (BotManagementSbfmDefinitelyConfig) o;
    return Objects.equals(this.enableJs, botManagementSbfmDefinitelyConfig.enableJs) &&
        Objects.equals(this.usingLatestModel, botManagementSbfmDefinitelyConfig.usingLatestModel) &&
        Objects.equals(this.optimizeWordpress, botManagementSbfmDefinitelyConfig.optimizeWordpress) &&
        Objects.equals(this.sbfmDefinitelyAutomated, botManagementSbfmDefinitelyConfig.sbfmDefinitelyAutomated) &&
        Objects.equals(this.sbfmStaticResourceProtection, botManagementSbfmDefinitelyConfig.sbfmStaticResourceProtection) &&
        Objects.equals(this.sbfmVerifiedBots, botManagementSbfmDefinitelyConfig.sbfmVerifiedBots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableJs, usingLatestModel, optimizeWordpress, sbfmDefinitelyAutomated, sbfmStaticResourceProtection, sbfmVerifiedBots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotManagementSbfmDefinitelyConfig {\n");
    sb.append("    enableJs: ").append(toIndentedString(enableJs)).append("\n");
    sb.append("    usingLatestModel: ").append(toIndentedString(usingLatestModel)).append("\n");
    sb.append("    optimizeWordpress: ").append(toIndentedString(optimizeWordpress)).append("\n");
    sb.append("    sbfmDefinitelyAutomated: ").append(toIndentedString(sbfmDefinitelyAutomated)).append("\n");
    sb.append("    sbfmStaticResourceProtection: ").append(toIndentedString(sbfmStaticResourceProtection)).append("\n");
    sb.append("    sbfmVerifiedBots: ").append(toIndentedString(sbfmVerifiedBots)).append("\n");
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
    openapiFields.add("enable_js");
    openapiFields.add("using_latest_model");
    openapiFields.add("optimize_wordpress");
    openapiFields.add("sbfm_definitely_automated");
    openapiFields.add("sbfm_static_resource_protection");
    openapiFields.add("sbfm_verified_bots");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BotManagementSbfmDefinitelyConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BotManagementSbfmDefinitelyConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BotManagementSbfmDefinitelyConfig is not found in the empty JSON string", BotManagementSbfmDefinitelyConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BotManagementSbfmDefinitelyConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BotManagementSbfmDefinitelyConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `sbfm_definitely_automated`
      if (jsonObj.get("sbfm_definitely_automated") != null && !jsonObj.get("sbfm_definitely_automated").isJsonNull()) {
        BotManagementSbfmDefinitelyAutomated.validateJsonElement(jsonObj.get("sbfm_definitely_automated"));
      }
      // validate the optional field `sbfm_verified_bots`
      if (jsonObj.get("sbfm_verified_bots") != null && !jsonObj.get("sbfm_verified_bots").isJsonNull()) {
        BotManagementSbfmVerifiedBots.validateJsonElement(jsonObj.get("sbfm_verified_bots"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BotManagementSbfmDefinitelyConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BotManagementSbfmDefinitelyConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BotManagementSbfmDefinitelyConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BotManagementSbfmDefinitelyConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<BotManagementSbfmDefinitelyConfig>() {
           @Override
           public void write(JsonWriter out, BotManagementSbfmDefinitelyConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BotManagementSbfmDefinitelyConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BotManagementSbfmDefinitelyConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BotManagementSbfmDefinitelyConfig
  * @throws IOException if the JSON string is invalid with respect to BotManagementSbfmDefinitelyConfig
  */
  public static BotManagementSbfmDefinitelyConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BotManagementSbfmDefinitelyConfig.class);
  }

 /**
  * Convert an instance of BotManagementSbfmDefinitelyConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
