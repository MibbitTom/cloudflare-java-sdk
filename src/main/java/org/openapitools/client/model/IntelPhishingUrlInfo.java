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
import org.openapitools.client.model.IntelPhishingUrlInfoCategorizationsInner;
import org.openapitools.client.model.IntelPhishingUrlInfoModelResultsInner;
import org.openapitools.client.model.IntelPhishingUrlInfoRuleMatchesInner;
import org.openapitools.client.model.IntelPhishingUrlInfoScanStatus;

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
 * IntelPhishingUrlInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class IntelPhishingUrlInfo {
  public static final String SERIALIZED_NAME_CATEGORIZATIONS = "categorizations";
  @SerializedName(SERIALIZED_NAME_CATEGORIZATIONS)
  private List<IntelPhishingUrlInfoCategorizationsInner> categorizations = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODEL_RESULTS = "model_results";
  @SerializedName(SERIALIZED_NAME_MODEL_RESULTS)
  private List<IntelPhishingUrlInfoModelResultsInner> modelResults = new ArrayList<>();

  public static final String SERIALIZED_NAME_RULE_MATCHES = "rule_matches";
  @SerializedName(SERIALIZED_NAME_RULE_MATCHES)
  private List<IntelPhishingUrlInfoRuleMatchesInner> ruleMatches = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCAN_STATUS = "scan_status";
  @SerializedName(SERIALIZED_NAME_SCAN_STATUS)
  private IntelPhishingUrlInfoScanStatus scanStatus;

  public static final String SERIALIZED_NAME_SCREENSHOT_DOWNLOAD_SIGNATURE = "screenshot_download_signature";
  @SerializedName(SERIALIZED_NAME_SCREENSHOT_DOWNLOAD_SIGNATURE)
  private String screenshotDownloadSignature;

  public static final String SERIALIZED_NAME_SCREENSHOT_PATH = "screenshot_path";
  @SerializedName(SERIALIZED_NAME_SCREENSHOT_PATH)
  private String screenshotPath;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public IntelPhishingUrlInfo() {
  }

  public IntelPhishingUrlInfo categorizations(List<IntelPhishingUrlInfoCategorizationsInner> categorizations) {
    this.categorizations = categorizations;
    return this;
  }

  public IntelPhishingUrlInfo addCategorizationsItem(IntelPhishingUrlInfoCategorizationsInner categorizationsItem) {
    if (this.categorizations == null) {
      this.categorizations = new ArrayList<>();
    }
    this.categorizations.add(categorizationsItem);
    return this;
  }

   /**
   * List of categorizations applied to this submission.
   * @return categorizations
  **/
  @javax.annotation.Nullable
  public List<IntelPhishingUrlInfoCategorizationsInner> getCategorizations() {
    return categorizations;
  }

  public void setCategorizations(List<IntelPhishingUrlInfoCategorizationsInner> categorizations) {
    this.categorizations = categorizations;
  }


  public IntelPhishingUrlInfo modelResults(List<IntelPhishingUrlInfoModelResultsInner> modelResults) {
    this.modelResults = modelResults;
    return this;
  }

  public IntelPhishingUrlInfo addModelResultsItem(IntelPhishingUrlInfoModelResultsInner modelResultsItem) {
    if (this.modelResults == null) {
      this.modelResults = new ArrayList<>();
    }
    this.modelResults.add(modelResultsItem);
    return this;
  }

   /**
   * List of model results for completed scans.
   * @return modelResults
  **/
  @javax.annotation.Nullable
  public List<IntelPhishingUrlInfoModelResultsInner> getModelResults() {
    return modelResults;
  }

  public void setModelResults(List<IntelPhishingUrlInfoModelResultsInner> modelResults) {
    this.modelResults = modelResults;
  }


  public IntelPhishingUrlInfo ruleMatches(List<IntelPhishingUrlInfoRuleMatchesInner> ruleMatches) {
    this.ruleMatches = ruleMatches;
    return this;
  }

  public IntelPhishingUrlInfo addRuleMatchesItem(IntelPhishingUrlInfoRuleMatchesInner ruleMatchesItem) {
    if (this.ruleMatches == null) {
      this.ruleMatches = new ArrayList<>();
    }
    this.ruleMatches.add(ruleMatchesItem);
    return this;
  }

   /**
   * List of signatures that matched against site content found when crawling the URL.
   * @return ruleMatches
  **/
  @javax.annotation.Nullable
  public List<IntelPhishingUrlInfoRuleMatchesInner> getRuleMatches() {
    return ruleMatches;
  }

  public void setRuleMatches(List<IntelPhishingUrlInfoRuleMatchesInner> ruleMatches) {
    this.ruleMatches = ruleMatches;
  }


  public IntelPhishingUrlInfo scanStatus(IntelPhishingUrlInfoScanStatus scanStatus) {
    this.scanStatus = scanStatus;
    return this;
  }

   /**
   * Get scanStatus
   * @return scanStatus
  **/
  @javax.annotation.Nullable
  public IntelPhishingUrlInfoScanStatus getScanStatus() {
    return scanStatus;
  }

  public void setScanStatus(IntelPhishingUrlInfoScanStatus scanStatus) {
    this.scanStatus = scanStatus;
  }


  public IntelPhishingUrlInfo screenshotDownloadSignature(String screenshotDownloadSignature) {
    this.screenshotDownloadSignature = screenshotDownloadSignature;
    return this;
  }

   /**
   * For internal use.
   * @return screenshotDownloadSignature
  **/
  @javax.annotation.Nullable
  public String getScreenshotDownloadSignature() {
    return screenshotDownloadSignature;
  }

  public void setScreenshotDownloadSignature(String screenshotDownloadSignature) {
    this.screenshotDownloadSignature = screenshotDownloadSignature;
  }


  public IntelPhishingUrlInfo screenshotPath(String screenshotPath) {
    this.screenshotPath = screenshotPath;
    return this;
  }

   /**
   * For internal use.
   * @return screenshotPath
  **/
  @javax.annotation.Nullable
  public String getScreenshotPath() {
    return screenshotPath;
  }

  public void setScreenshotPath(String screenshotPath) {
    this.screenshotPath = screenshotPath;
  }


  public IntelPhishingUrlInfo url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL that was submitted.
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntelPhishingUrlInfo intelPhishingUrlInfo = (IntelPhishingUrlInfo) o;
    return Objects.equals(this.categorizations, intelPhishingUrlInfo.categorizations) &&
        Objects.equals(this.modelResults, intelPhishingUrlInfo.modelResults) &&
        Objects.equals(this.ruleMatches, intelPhishingUrlInfo.ruleMatches) &&
        Objects.equals(this.scanStatus, intelPhishingUrlInfo.scanStatus) &&
        Objects.equals(this.screenshotDownloadSignature, intelPhishingUrlInfo.screenshotDownloadSignature) &&
        Objects.equals(this.screenshotPath, intelPhishingUrlInfo.screenshotPath) &&
        Objects.equals(this.url, intelPhishingUrlInfo.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categorizations, modelResults, ruleMatches, scanStatus, screenshotDownloadSignature, screenshotPath, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntelPhishingUrlInfo {\n");
    sb.append("    categorizations: ").append(toIndentedString(categorizations)).append("\n");
    sb.append("    modelResults: ").append(toIndentedString(modelResults)).append("\n");
    sb.append("    ruleMatches: ").append(toIndentedString(ruleMatches)).append("\n");
    sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
    sb.append("    screenshotDownloadSignature: ").append(toIndentedString(screenshotDownloadSignature)).append("\n");
    sb.append("    screenshotPath: ").append(toIndentedString(screenshotPath)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("categorizations");
    openapiFields.add("model_results");
    openapiFields.add("rule_matches");
    openapiFields.add("scan_status");
    openapiFields.add("screenshot_download_signature");
    openapiFields.add("screenshot_path");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IntelPhishingUrlInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IntelPhishingUrlInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntelPhishingUrlInfo is not found in the empty JSON string", IntelPhishingUrlInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IntelPhishingUrlInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntelPhishingUrlInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("categorizations") != null && !jsonObj.get("categorizations").isJsonNull()) {
        JsonArray jsonArraycategorizations = jsonObj.getAsJsonArray("categorizations");
        if (jsonArraycategorizations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("categorizations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `categorizations` to be an array in the JSON string but got `%s`", jsonObj.get("categorizations").toString()));
          }

          // validate the optional field `categorizations` (array)
          for (int i = 0; i < jsonArraycategorizations.size(); i++) {
            IntelPhishingUrlInfoCategorizationsInner.validateJsonElement(jsonArraycategorizations.get(i));
          };
        }
      }
      if (jsonObj.get("model_results") != null && !jsonObj.get("model_results").isJsonNull()) {
        JsonArray jsonArraymodelResults = jsonObj.getAsJsonArray("model_results");
        if (jsonArraymodelResults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("model_results").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `model_results` to be an array in the JSON string but got `%s`", jsonObj.get("model_results").toString()));
          }

          // validate the optional field `model_results` (array)
          for (int i = 0; i < jsonArraymodelResults.size(); i++) {
            IntelPhishingUrlInfoModelResultsInner.validateJsonElement(jsonArraymodelResults.get(i));
          };
        }
      }
      if (jsonObj.get("rule_matches") != null && !jsonObj.get("rule_matches").isJsonNull()) {
        JsonArray jsonArrayruleMatches = jsonObj.getAsJsonArray("rule_matches");
        if (jsonArrayruleMatches != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rule_matches").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rule_matches` to be an array in the JSON string but got `%s`", jsonObj.get("rule_matches").toString()));
          }

          // validate the optional field `rule_matches` (array)
          for (int i = 0; i < jsonArrayruleMatches.size(); i++) {
            IntelPhishingUrlInfoRuleMatchesInner.validateJsonElement(jsonArrayruleMatches.get(i));
          };
        }
      }
      // validate the optional field `scan_status`
      if (jsonObj.get("scan_status") != null && !jsonObj.get("scan_status").isJsonNull()) {
        IntelPhishingUrlInfoScanStatus.validateJsonElement(jsonObj.get("scan_status"));
      }
      if ((jsonObj.get("screenshot_download_signature") != null && !jsonObj.get("screenshot_download_signature").isJsonNull()) && !jsonObj.get("screenshot_download_signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `screenshot_download_signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("screenshot_download_signature").toString()));
      }
      if ((jsonObj.get("screenshot_path") != null && !jsonObj.get("screenshot_path").isJsonNull()) && !jsonObj.get("screenshot_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `screenshot_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("screenshot_path").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntelPhishingUrlInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntelPhishingUrlInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntelPhishingUrlInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntelPhishingUrlInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<IntelPhishingUrlInfo>() {
           @Override
           public void write(JsonWriter out, IntelPhishingUrlInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntelPhishingUrlInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IntelPhishingUrlInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntelPhishingUrlInfo
  * @throws IOException if the JSON string is invalid with respect to IntelPhishingUrlInfo
  */
  public static IntelPhishingUrlInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntelPhishingUrlInfo.class);
  }

 /**
  * Convert an instance of IntelPhishingUrlInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

