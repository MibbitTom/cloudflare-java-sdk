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
import org.openapitools.client.model.UrlscannerGetScan200ResponseResultScanMetaProcessorsCategoriesContentInner;
import org.openapitools.client.model.UrlscannerGetScan200ResponseResultScanMetaProcessorsCategoriesRisksInner;

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
 * UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private List<UrlscannerGetScan200ResponseResultScanMetaProcessorsCategoriesContentInner> content = new ArrayList<>();

  public static final String SERIALIZED_NAME_RISKS = "risks";
  @SerializedName(SERIALIZED_NAME_RISKS)
  private List<UrlscannerGetScan200ResponseResultScanMetaProcessorsCategoriesRisksInner> risks = new ArrayList<>();

  public UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories() {
  }

  public UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories content(List<UrlscannerGetScan200ResponseResultScanMetaProcessorsCategoriesContentInner> content) {
    this.content = content;
    return this;
  }

  public UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories addContentItem(UrlscannerGetScan200ResponseResultScanMetaProcessorsCategoriesContentInner contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nonnull
  public List<UrlscannerGetScan200ResponseResultScanMetaProcessorsCategoriesContentInner> getContent() {
    return content;
  }

  public void setContent(List<UrlscannerGetScan200ResponseResultScanMetaProcessorsCategoriesContentInner> content) {
    this.content = content;
  }


  public UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories risks(List<UrlscannerGetScan200ResponseResultScanMetaProcessorsCategoriesRisksInner> risks) {
    this.risks = risks;
    return this;
  }

  public UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories addRisksItem(UrlscannerGetScan200ResponseResultScanMetaProcessorsCategoriesRisksInner risksItem) {
    if (this.risks == null) {
      this.risks = new ArrayList<>();
    }
    this.risks.add(risksItem);
    return this;
  }

   /**
   * Get risks
   * @return risks
  **/
  @javax.annotation.Nonnull
  public List<UrlscannerGetScan200ResponseResultScanMetaProcessorsCategoriesRisksInner> getRisks() {
    return risks;
  }

  public void setRisks(List<UrlscannerGetScan200ResponseResultScanMetaProcessorsCategoriesRisksInner> risks) {
    this.risks = risks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories urlscannerGetScan200ResponseResultScanMetaProcessorsCategories = (UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories) o;
    return Objects.equals(this.content, urlscannerGetScan200ResponseResultScanMetaProcessorsCategories.content) &&
        Objects.equals(this.risks, urlscannerGetScan200ResponseResultScanMetaProcessorsCategories.risks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, risks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    risks: ").append(toIndentedString(risks)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("risks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("risks");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories is not found in the empty JSON string", UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("content").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be an array in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }

      JsonArray jsonArraycontent = jsonObj.getAsJsonArray("content");
      // validate the required field `content` (array)
      for (int i = 0; i < jsonArraycontent.size(); i++) {
        UrlscannerGetScan200ResponseResultScanMetaProcessorsCategoriesContentInner.validateJsonElement(jsonArraycontent.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("risks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `risks` to be an array in the JSON string but got `%s`", jsonObj.get("risks").toString()));
      }

      JsonArray jsonArrayrisks = jsonObj.getAsJsonArray("risks");
      // validate the required field `risks` (array)
      for (int i = 0; i < jsonArrayrisks.size(); i++) {
        UrlscannerGetScan200ResponseResultScanMetaProcessorsCategoriesRisksInner.validateJsonElement(jsonArrayrisks.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories>() {
           @Override
           public void write(JsonWriter out, UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories
  * @throws IOException if the JSON string is invalid with respect to UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories
  */
  public static UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories.class);
  }

 /**
  * Convert an instance of UrlscannerGetScan200ResponseResultScanMetaProcessorsCategories to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

