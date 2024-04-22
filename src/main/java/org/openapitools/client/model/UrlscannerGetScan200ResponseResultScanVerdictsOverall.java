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
import org.openapitools.client.model.UrlscannerGetScan200ResponseResultScanVerdictsOverallCategoriesInner;

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
 * UrlscannerGetScan200ResponseResultScanVerdictsOverall
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class UrlscannerGetScan200ResponseResultScanVerdictsOverall {
  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<UrlscannerGetScan200ResponseResultScanVerdictsOverallCategoriesInner> categories = new ArrayList<>();

  public static final String SERIALIZED_NAME_MALICIOUS = "malicious";
  @SerializedName(SERIALIZED_NAME_MALICIOUS)
  private Boolean malicious;

  public static final String SERIALIZED_NAME_PHISHING = "phishing";
  @SerializedName(SERIALIZED_NAME_PHISHING)
  private List<String> phishing = new ArrayList<>();

  public UrlscannerGetScan200ResponseResultScanVerdictsOverall() {
  }

  public UrlscannerGetScan200ResponseResultScanVerdictsOverall categories(List<UrlscannerGetScan200ResponseResultScanVerdictsOverallCategoriesInner> categories) {
    this.categories = categories;
    return this;
  }

  public UrlscannerGetScan200ResponseResultScanVerdictsOverall addCategoriesItem(UrlscannerGetScan200ResponseResultScanVerdictsOverallCategoriesInner categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nonnull
  public List<UrlscannerGetScan200ResponseResultScanVerdictsOverallCategoriesInner> getCategories() {
    return categories;
  }

  public void setCategories(List<UrlscannerGetScan200ResponseResultScanVerdictsOverallCategoriesInner> categories) {
    this.categories = categories;
  }


  public UrlscannerGetScan200ResponseResultScanVerdictsOverall malicious(Boolean malicious) {
    this.malicious = malicious;
    return this;
  }

   /**
   * At least one of our subsystems marked the site as potentially malicious at the time of the scan.
   * @return malicious
  **/
  @javax.annotation.Nonnull
  public Boolean getMalicious() {
    return malicious;
  }

  public void setMalicious(Boolean malicious) {
    this.malicious = malicious;
  }


  public UrlscannerGetScan200ResponseResultScanVerdictsOverall phishing(List<String> phishing) {
    this.phishing = phishing;
    return this;
  }

  public UrlscannerGetScan200ResponseResultScanVerdictsOverall addPhishingItem(String phishingItem) {
    if (this.phishing == null) {
      this.phishing = new ArrayList<>();
    }
    this.phishing.add(phishingItem);
    return this;
  }

   /**
   * Get phishing
   * @return phishing
  **/
  @javax.annotation.Nonnull
  public List<String> getPhishing() {
    return phishing;
  }

  public void setPhishing(List<String> phishing) {
    this.phishing = phishing;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlscannerGetScan200ResponseResultScanVerdictsOverall urlscannerGetScan200ResponseResultScanVerdictsOverall = (UrlscannerGetScan200ResponseResultScanVerdictsOverall) o;
    return Objects.equals(this.categories, urlscannerGetScan200ResponseResultScanVerdictsOverall.categories) &&
        Objects.equals(this.malicious, urlscannerGetScan200ResponseResultScanVerdictsOverall.malicious) &&
        Objects.equals(this.phishing, urlscannerGetScan200ResponseResultScanVerdictsOverall.phishing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, malicious, phishing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlscannerGetScan200ResponseResultScanVerdictsOverall {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    malicious: ").append(toIndentedString(malicious)).append("\n");
    sb.append("    phishing: ").append(toIndentedString(phishing)).append("\n");
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
    openapiFields.add("categories");
    openapiFields.add("malicious");
    openapiFields.add("phishing");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("categories");
    openapiRequiredFields.add("malicious");
    openapiRequiredFields.add("phishing");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UrlscannerGetScan200ResponseResultScanVerdictsOverall
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlscannerGetScan200ResponseResultScanVerdictsOverall.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlscannerGetScan200ResponseResultScanVerdictsOverall is not found in the empty JSON string", UrlscannerGetScan200ResponseResultScanVerdictsOverall.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UrlscannerGetScan200ResponseResultScanVerdictsOverall.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UrlscannerGetScan200ResponseResultScanVerdictsOverall` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UrlscannerGetScan200ResponseResultScanVerdictsOverall.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
      }

      JsonArray jsonArraycategories = jsonObj.getAsJsonArray("categories");
      // validate the required field `categories` (array)
      for (int i = 0; i < jsonArraycategories.size(); i++) {
        UrlscannerGetScan200ResponseResultScanVerdictsOverallCategoriesInner.validateJsonElement(jsonArraycategories.get(i));
      };
      // ensure the required json array is present
      if (jsonObj.get("phishing") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("phishing").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `phishing` to be an array in the JSON string but got `%s`", jsonObj.get("phishing").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlscannerGetScan200ResponseResultScanVerdictsOverall.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlscannerGetScan200ResponseResultScanVerdictsOverall' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlscannerGetScan200ResponseResultScanVerdictsOverall> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlscannerGetScan200ResponseResultScanVerdictsOverall.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlscannerGetScan200ResponseResultScanVerdictsOverall>() {
           @Override
           public void write(JsonWriter out, UrlscannerGetScan200ResponseResultScanVerdictsOverall value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlscannerGetScan200ResponseResultScanVerdictsOverall read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlscannerGetScan200ResponseResultScanVerdictsOverall given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlscannerGetScan200ResponseResultScanVerdictsOverall
  * @throws IOException if the JSON string is invalid with respect to UrlscannerGetScan200ResponseResultScanVerdictsOverall
  */
  public static UrlscannerGetScan200ResponseResultScanVerdictsOverall fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlscannerGetScan200ResponseResultScanVerdictsOverall.class);
  }

 /**
  * Convert an instance of UrlscannerGetScan200ResponseResultScanVerdictsOverall to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

