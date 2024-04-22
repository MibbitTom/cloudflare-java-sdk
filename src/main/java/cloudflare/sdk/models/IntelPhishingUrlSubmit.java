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
import cloudflare.sdk.models.IntelPhishingUrlSubmitExcludedUrlsInner;
import cloudflare.sdk.models.IntelPhishingUrlSubmitSkippedUrlsInner;
import cloudflare.sdk.models.IntelPhishingUrlSubmitSubmittedUrlsInner;
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
 * IntelPhishingUrlSubmit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class IntelPhishingUrlSubmit {
  public static final String SERIALIZED_NAME_EXCLUDED_URLS = "excluded_urls";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_URLS)
  private List<IntelPhishingUrlSubmitExcludedUrlsInner> excludedUrls = new ArrayList<>();

  public static final String SERIALIZED_NAME_SKIPPED_URLS = "skipped_urls";
  @SerializedName(SERIALIZED_NAME_SKIPPED_URLS)
  private List<IntelPhishingUrlSubmitSkippedUrlsInner> skippedUrls = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBMITTED_URLS = "submitted_urls";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_URLS)
  private List<IntelPhishingUrlSubmitSubmittedUrlsInner> submittedUrls = new ArrayList<>();

  public IntelPhishingUrlSubmit() {
  }

  public IntelPhishingUrlSubmit excludedUrls(List<IntelPhishingUrlSubmitExcludedUrlsInner> excludedUrls) {
    this.excludedUrls = excludedUrls;
    return this;
  }

  public IntelPhishingUrlSubmit addExcludedUrlsItem(IntelPhishingUrlSubmitExcludedUrlsInner excludedUrlsItem) {
    if (this.excludedUrls == null) {
      this.excludedUrls = new ArrayList<>();
    }
    this.excludedUrls.add(excludedUrlsItem);
    return this;
  }

   /**
   * URLs that were excluded from scanning because their domain is in our no-scan list.
   * @return excludedUrls
  **/
  @javax.annotation.Nullable
  public List<IntelPhishingUrlSubmitExcludedUrlsInner> getExcludedUrls() {
    return excludedUrls;
  }

  public void setExcludedUrls(List<IntelPhishingUrlSubmitExcludedUrlsInner> excludedUrls) {
    this.excludedUrls = excludedUrls;
  }


  public IntelPhishingUrlSubmit skippedUrls(List<IntelPhishingUrlSubmitSkippedUrlsInner> skippedUrls) {
    this.skippedUrls = skippedUrls;
    return this;
  }

  public IntelPhishingUrlSubmit addSkippedUrlsItem(IntelPhishingUrlSubmitSkippedUrlsInner skippedUrlsItem) {
    if (this.skippedUrls == null) {
      this.skippedUrls = new ArrayList<>();
    }
    this.skippedUrls.add(skippedUrlsItem);
    return this;
  }

   /**
   * URLs that were skipped because the same URL is currently being scanned
   * @return skippedUrls
  **/
  @javax.annotation.Nullable
  public List<IntelPhishingUrlSubmitSkippedUrlsInner> getSkippedUrls() {
    return skippedUrls;
  }

  public void setSkippedUrls(List<IntelPhishingUrlSubmitSkippedUrlsInner> skippedUrls) {
    this.skippedUrls = skippedUrls;
  }


  public IntelPhishingUrlSubmit submittedUrls(List<IntelPhishingUrlSubmitSubmittedUrlsInner> submittedUrls) {
    this.submittedUrls = submittedUrls;
    return this;
  }

  public IntelPhishingUrlSubmit addSubmittedUrlsItem(IntelPhishingUrlSubmitSubmittedUrlsInner submittedUrlsItem) {
    if (this.submittedUrls == null) {
      this.submittedUrls = new ArrayList<>();
    }
    this.submittedUrls.add(submittedUrlsItem);
    return this;
  }

   /**
   * URLs that were successfully submitted for scanning.
   * @return submittedUrls
  **/
  @javax.annotation.Nullable
  public List<IntelPhishingUrlSubmitSubmittedUrlsInner> getSubmittedUrls() {
    return submittedUrls;
  }

  public void setSubmittedUrls(List<IntelPhishingUrlSubmitSubmittedUrlsInner> submittedUrls) {
    this.submittedUrls = submittedUrls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntelPhishingUrlSubmit intelPhishingUrlSubmit = (IntelPhishingUrlSubmit) o;
    return Objects.equals(this.excludedUrls, intelPhishingUrlSubmit.excludedUrls) &&
        Objects.equals(this.skippedUrls, intelPhishingUrlSubmit.skippedUrls) &&
        Objects.equals(this.submittedUrls, intelPhishingUrlSubmit.submittedUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludedUrls, skippedUrls, submittedUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntelPhishingUrlSubmit {\n");
    sb.append("    excludedUrls: ").append(toIndentedString(excludedUrls)).append("\n");
    sb.append("    skippedUrls: ").append(toIndentedString(skippedUrls)).append("\n");
    sb.append("    submittedUrls: ").append(toIndentedString(submittedUrls)).append("\n");
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
    openapiFields.add("excluded_urls");
    openapiFields.add("skipped_urls");
    openapiFields.add("submitted_urls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IntelPhishingUrlSubmit
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IntelPhishingUrlSubmit.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntelPhishingUrlSubmit is not found in the empty JSON string", IntelPhishingUrlSubmit.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IntelPhishingUrlSubmit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntelPhishingUrlSubmit` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("excluded_urls") != null && !jsonObj.get("excluded_urls").isJsonNull()) {
        JsonArray jsonArrayexcludedUrls = jsonObj.getAsJsonArray("excluded_urls");
        if (jsonArrayexcludedUrls != null) {
          // ensure the json data is an array
          if (!jsonObj.get("excluded_urls").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `excluded_urls` to be an array in the JSON string but got `%s`", jsonObj.get("excluded_urls").toString()));
          }

          // validate the optional field `excluded_urls` (array)
          for (int i = 0; i < jsonArrayexcludedUrls.size(); i++) {
            IntelPhishingUrlSubmitExcludedUrlsInner.validateJsonElement(jsonArrayexcludedUrls.get(i));
          };
        }
      }
      if (jsonObj.get("skipped_urls") != null && !jsonObj.get("skipped_urls").isJsonNull()) {
        JsonArray jsonArrayskippedUrls = jsonObj.getAsJsonArray("skipped_urls");
        if (jsonArrayskippedUrls != null) {
          // ensure the json data is an array
          if (!jsonObj.get("skipped_urls").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `skipped_urls` to be an array in the JSON string but got `%s`", jsonObj.get("skipped_urls").toString()));
          }

          // validate the optional field `skipped_urls` (array)
          for (int i = 0; i < jsonArrayskippedUrls.size(); i++) {
            IntelPhishingUrlSubmitSkippedUrlsInner.validateJsonElement(jsonArrayskippedUrls.get(i));
          };
        }
      }
      if (jsonObj.get("submitted_urls") != null && !jsonObj.get("submitted_urls").isJsonNull()) {
        JsonArray jsonArraysubmittedUrls = jsonObj.getAsJsonArray("submitted_urls");
        if (jsonArraysubmittedUrls != null) {
          // ensure the json data is an array
          if (!jsonObj.get("submitted_urls").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `submitted_urls` to be an array in the JSON string but got `%s`", jsonObj.get("submitted_urls").toString()));
          }

          // validate the optional field `submitted_urls` (array)
          for (int i = 0; i < jsonArraysubmittedUrls.size(); i++) {
            IntelPhishingUrlSubmitSubmittedUrlsInner.validateJsonElement(jsonArraysubmittedUrls.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntelPhishingUrlSubmit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntelPhishingUrlSubmit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntelPhishingUrlSubmit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntelPhishingUrlSubmit.class));

       return (TypeAdapter<T>) new TypeAdapter<IntelPhishingUrlSubmit>() {
           @Override
           public void write(JsonWriter out, IntelPhishingUrlSubmit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntelPhishingUrlSubmit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IntelPhishingUrlSubmit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntelPhishingUrlSubmit
  * @throws IOException if the JSON string is invalid with respect to IntelPhishingUrlSubmit
  */
  public static IntelPhishingUrlSubmit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntelPhishingUrlSubmit.class);
  }

 /**
  * Convert an instance of IntelPhishingUrlSubmit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

