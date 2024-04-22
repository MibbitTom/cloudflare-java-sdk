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
import org.openapitools.client.model.SecurityCenterIssue;

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
 * GetSecurityCenterIssues200ResponseAllOfResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class GetSecurityCenterIssues200ResponseAllOfResult {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_ISSUES = "issues";
  @SerializedName(SERIALIZED_NAME_ISSUES)
  private List<SecurityCenterIssue> issues = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PER_PAGE = "per_page";
  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private Integer perPage;

  public GetSecurityCenterIssues200ResponseAllOfResult() {
  }

  public GetSecurityCenterIssues200ResponseAllOfResult count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Total number of results
   * @return count
  **/
  @javax.annotation.Nullable
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  public GetSecurityCenterIssues200ResponseAllOfResult issues(List<SecurityCenterIssue> issues) {
    this.issues = issues;
    return this;
  }

  public GetSecurityCenterIssues200ResponseAllOfResult addIssuesItem(SecurityCenterIssue issuesItem) {
    if (this.issues == null) {
      this.issues = new ArrayList<>();
    }
    this.issues.add(issuesItem);
    return this;
  }

   /**
   * Get issues
   * @return issues
  **/
  @javax.annotation.Nullable
  public List<SecurityCenterIssue> getIssues() {
    return issues;
  }

  public void setIssues(List<SecurityCenterIssue> issues) {
    this.issues = issues;
  }


  public GetSecurityCenterIssues200ResponseAllOfResult page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Current page within paginated list of results
   * @return page
  **/
  @javax.annotation.Nullable
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }


  public GetSecurityCenterIssues200ResponseAllOfResult perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }

   /**
   * Number of results per page of results
   * minimum: 1
   * maximum: 1000
   * @return perPage
  **/
  @javax.annotation.Nullable
  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSecurityCenterIssues200ResponseAllOfResult getSecurityCenterIssues200ResponseAllOfResult = (GetSecurityCenterIssues200ResponseAllOfResult) o;
    return Objects.equals(this.count, getSecurityCenterIssues200ResponseAllOfResult.count) &&
        Objects.equals(this.issues, getSecurityCenterIssues200ResponseAllOfResult.issues) &&
        Objects.equals(this.page, getSecurityCenterIssues200ResponseAllOfResult.page) &&
        Objects.equals(this.perPage, getSecurityCenterIssues200ResponseAllOfResult.perPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, issues, page, perPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSecurityCenterIssues200ResponseAllOfResult {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("issues");
    openapiFields.add("page");
    openapiFields.add("per_page");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetSecurityCenterIssues200ResponseAllOfResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetSecurityCenterIssues200ResponseAllOfResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetSecurityCenterIssues200ResponseAllOfResult is not found in the empty JSON string", GetSecurityCenterIssues200ResponseAllOfResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetSecurityCenterIssues200ResponseAllOfResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetSecurityCenterIssues200ResponseAllOfResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("issues") != null && !jsonObj.get("issues").isJsonNull()) {
        JsonArray jsonArrayissues = jsonObj.getAsJsonArray("issues");
        if (jsonArrayissues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("issues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `issues` to be an array in the JSON string but got `%s`", jsonObj.get("issues").toString()));
          }

          // validate the optional field `issues` (array)
          for (int i = 0; i < jsonArrayissues.size(); i++) {
            SecurityCenterIssue.validateJsonElement(jsonArrayissues.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetSecurityCenterIssues200ResponseAllOfResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetSecurityCenterIssues200ResponseAllOfResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetSecurityCenterIssues200ResponseAllOfResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetSecurityCenterIssues200ResponseAllOfResult.class));

       return (TypeAdapter<T>) new TypeAdapter<GetSecurityCenterIssues200ResponseAllOfResult>() {
           @Override
           public void write(JsonWriter out, GetSecurityCenterIssues200ResponseAllOfResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetSecurityCenterIssues200ResponseAllOfResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetSecurityCenterIssues200ResponseAllOfResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetSecurityCenterIssues200ResponseAllOfResult
  * @throws IOException if the JSON string is invalid with respect to GetSecurityCenterIssues200ResponseAllOfResult
  */
  public static GetSecurityCenterIssues200ResponseAllOfResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetSecurityCenterIssues200ResponseAllOfResult.class);
  }

 /**
  * Convert an instance of GetSecurityCenterIssues200ResponseAllOfResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

