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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.CloudforceOneRequestStatus;

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
 * CloudforceOneRequestList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class CloudforceOneRequestList {
  public static final String SERIALIZED_NAME_COMPLETED_AFTER = "completed_after";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AFTER)
  private OffsetDateTime completedAfter;

  public static final String SERIALIZED_NAME_COMPLETED_BEFORE = "completed_before";
  @SerializedName(SERIALIZED_NAME_COMPLETED_BEFORE)
  private OffsetDateTime completedBefore;

  public static final String SERIALIZED_NAME_CREATED_AFTER = "created_after";
  @SerializedName(SERIALIZED_NAME_CREATED_AFTER)
  private OffsetDateTime createdAfter;

  public static final String SERIALIZED_NAME_CREATED_BEFORE = "created_before";
  @SerializedName(SERIALIZED_NAME_CREATED_BEFORE)
  private OffsetDateTime createdBefore;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PER_PAGE = "per_page";
  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private Integer perPage;

  public static final String SERIALIZED_NAME_REQUEST_TYPE = "request_type";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  private String requestType;

  public static final String SERIALIZED_NAME_SORT_BY = "sort_by";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  /**
   * Sort order (asc or desc)
   */
  @JsonAdapter(SortOrderEnum.Adapter.class)
  public enum SortOrderEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    SortOrderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortOrderEnum fromValue(String value) {
      for (SortOrderEnum b : SortOrderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SortOrderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortOrderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortOrderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SortOrderEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SortOrderEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SORT_ORDER = "sort_order";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private SortOrderEnum sortOrder;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CloudforceOneRequestStatus status;

  public CloudforceOneRequestList() {
  }

  public CloudforceOneRequestList completedAfter(OffsetDateTime completedAfter) {
    this.completedAfter = completedAfter;
    return this;
  }

   /**
   * Get completedAfter
   * @return completedAfter
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCompletedAfter() {
    return completedAfter;
  }

  public void setCompletedAfter(OffsetDateTime completedAfter) {
    this.completedAfter = completedAfter;
  }


  public CloudforceOneRequestList completedBefore(OffsetDateTime completedBefore) {
    this.completedBefore = completedBefore;
    return this;
  }

   /**
   * Get completedBefore
   * @return completedBefore
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCompletedBefore() {
    return completedBefore;
  }

  public void setCompletedBefore(OffsetDateTime completedBefore) {
    this.completedBefore = completedBefore;
  }


  public CloudforceOneRequestList createdAfter(OffsetDateTime createdAfter) {
    this.createdAfter = createdAfter;
    return this;
  }

   /**
   * Get createdAfter
   * @return createdAfter
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAfter() {
    return createdAfter;
  }

  public void setCreatedAfter(OffsetDateTime createdAfter) {
    this.createdAfter = createdAfter;
  }


  public CloudforceOneRequestList createdBefore(OffsetDateTime createdBefore) {
    this.createdBefore = createdBefore;
    return this;
  }

   /**
   * Get createdBefore
   * @return createdBefore
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedBefore() {
    return createdBefore;
  }

  public void setCreatedBefore(OffsetDateTime createdBefore) {
    this.createdBefore = createdBefore;
  }


  public CloudforceOneRequestList page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Page number of results
   * @return page
  **/
  @javax.annotation.Nonnull
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }


  public CloudforceOneRequestList perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }

   /**
   * Number of results per page
   * @return perPage
  **/
  @javax.annotation.Nonnull
  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }


  public CloudforceOneRequestList requestType(String requestType) {
    this.requestType = requestType;
    return this;
  }

   /**
   * Requested information from request
   * @return requestType
  **/
  @javax.annotation.Nullable
  public String getRequestType() {
    return requestType;
  }

  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }


  public CloudforceOneRequestList sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Field to sort results by
   * @return sortBy
  **/
  @javax.annotation.Nullable
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }


  public CloudforceOneRequestList sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Sort order (asc or desc)
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }


  public CloudforceOneRequestList status(CloudforceOneRequestStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public CloudforceOneRequestStatus getStatus() {
    return status;
  }

  public void setStatus(CloudforceOneRequestStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudforceOneRequestList cloudforceOneRequestList = (CloudforceOneRequestList) o;
    return Objects.equals(this.completedAfter, cloudforceOneRequestList.completedAfter) &&
        Objects.equals(this.completedBefore, cloudforceOneRequestList.completedBefore) &&
        Objects.equals(this.createdAfter, cloudforceOneRequestList.createdAfter) &&
        Objects.equals(this.createdBefore, cloudforceOneRequestList.createdBefore) &&
        Objects.equals(this.page, cloudforceOneRequestList.page) &&
        Objects.equals(this.perPage, cloudforceOneRequestList.perPage) &&
        Objects.equals(this.requestType, cloudforceOneRequestList.requestType) &&
        Objects.equals(this.sortBy, cloudforceOneRequestList.sortBy) &&
        Objects.equals(this.sortOrder, cloudforceOneRequestList.sortOrder) &&
        Objects.equals(this.status, cloudforceOneRequestList.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedAfter, completedBefore, createdAfter, createdBefore, page, perPage, requestType, sortBy, sortOrder, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudforceOneRequestList {\n");
    sb.append("    completedAfter: ").append(toIndentedString(completedAfter)).append("\n");
    sb.append("    completedBefore: ").append(toIndentedString(completedBefore)).append("\n");
    sb.append("    createdAfter: ").append(toIndentedString(createdAfter)).append("\n");
    sb.append("    createdBefore: ").append(toIndentedString(createdBefore)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("completed_after");
    openapiFields.add("completed_before");
    openapiFields.add("created_after");
    openapiFields.add("created_before");
    openapiFields.add("page");
    openapiFields.add("per_page");
    openapiFields.add("request_type");
    openapiFields.add("sort_by");
    openapiFields.add("sort_order");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("page");
    openapiRequiredFields.add("per_page");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CloudforceOneRequestList
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudforceOneRequestList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudforceOneRequestList is not found in the empty JSON string", CloudforceOneRequestList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudforceOneRequestList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudforceOneRequestList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CloudforceOneRequestList.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `completed_after`
      if (jsonObj.get("completed_after") != null && !jsonObj.get("completed_after").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("completed_after"));
      }
      // validate the optional field `completed_before`
      if (jsonObj.get("completed_before") != null && !jsonObj.get("completed_before").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("completed_before"));
      }
      // validate the optional field `created_after`
      if (jsonObj.get("created_after") != null && !jsonObj.get("created_after").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("created_after"));
      }
      // validate the optional field `created_before`
      if (jsonObj.get("created_before") != null && !jsonObj.get("created_before").isJsonNull()) {
        OffsetDateTime.validateJsonElement(jsonObj.get("created_before"));
      }
      if ((jsonObj.get("request_type") != null && !jsonObj.get("request_type").isJsonNull()) && !jsonObj.get("request_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_type").toString()));
      }
      if ((jsonObj.get("sort_by") != null && !jsonObj.get("sort_by").isJsonNull()) && !jsonObj.get("sort_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort_by").toString()));
      }
      if ((jsonObj.get("sort_order") != null && !jsonObj.get("sort_order").isJsonNull()) && !jsonObj.get("sort_order").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort_order` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort_order").toString()));
      }
      // validate the optional field `sort_order`
      if (jsonObj.get("sort_order") != null && !jsonObj.get("sort_order").isJsonNull()) {
        SortOrderEnum.validateJsonElement(jsonObj.get("sort_order"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        CloudforceOneRequestStatus.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudforceOneRequestList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudforceOneRequestList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudforceOneRequestList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudforceOneRequestList.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudforceOneRequestList>() {
           @Override
           public void write(JsonWriter out, CloudforceOneRequestList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudforceOneRequestList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CloudforceOneRequestList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudforceOneRequestList
  * @throws IOException if the JSON string is invalid with respect to CloudforceOneRequestList
  */
  public static CloudforceOneRequestList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudforceOneRequestList.class);
  }

 /**
  * Convert an instance of CloudforceOneRequestList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

