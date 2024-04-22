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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * EmailDestinationAddressesResponseCollectionAllOfResultInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class EmailDestinationAddressesResponseCollectionAllOfResultInfo {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Object count = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Object page = null;

  public static final String SERIALIZED_NAME_PER_PAGE = "per_page";
  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private Object perPage = null;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Object totalCount = null;

  public EmailDestinationAddressesResponseCollectionAllOfResultInfo() {
  }

  public EmailDestinationAddressesResponseCollectionAllOfResultInfo count(Object count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  public Object getCount() {
    return count;
  }

  public void setCount(Object count) {
    this.count = count;
  }


  public EmailDestinationAddressesResponseCollectionAllOfResultInfo page(Object page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  public Object getPage() {
    return page;
  }

  public void setPage(Object page) {
    this.page = page;
  }


  public EmailDestinationAddressesResponseCollectionAllOfResultInfo perPage(Object perPage) {
    this.perPage = perPage;
    return this;
  }

   /**
   * Get perPage
   * @return perPage
  **/
  @javax.annotation.Nullable
  public Object getPerPage() {
    return perPage;
  }

  public void setPerPage(Object perPage) {
    this.perPage = perPage;
  }


  public EmailDestinationAddressesResponseCollectionAllOfResultInfo totalCount(Object totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  public Object getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Object totalCount) {
    this.totalCount = totalCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailDestinationAddressesResponseCollectionAllOfResultInfo emailDestinationAddressesResponseCollectionAllOfResultInfo = (EmailDestinationAddressesResponseCollectionAllOfResultInfo) o;
    return Objects.equals(this.count, emailDestinationAddressesResponseCollectionAllOfResultInfo.count) &&
        Objects.equals(this.page, emailDestinationAddressesResponseCollectionAllOfResultInfo.page) &&
        Objects.equals(this.perPage, emailDestinationAddressesResponseCollectionAllOfResultInfo.perPage) &&
        Objects.equals(this.totalCount, emailDestinationAddressesResponseCollectionAllOfResultInfo.totalCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, page, perPage, totalCount);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailDestinationAddressesResponseCollectionAllOfResultInfo {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
    openapiFields.add("page");
    openapiFields.add("per_page");
    openapiFields.add("total_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EmailDestinationAddressesResponseCollectionAllOfResultInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmailDestinationAddressesResponseCollectionAllOfResultInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailDestinationAddressesResponseCollectionAllOfResultInfo is not found in the empty JSON string", EmailDestinationAddressesResponseCollectionAllOfResultInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmailDestinationAddressesResponseCollectionAllOfResultInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailDestinationAddressesResponseCollectionAllOfResultInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailDestinationAddressesResponseCollectionAllOfResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailDestinationAddressesResponseCollectionAllOfResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailDestinationAddressesResponseCollectionAllOfResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailDestinationAddressesResponseCollectionAllOfResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailDestinationAddressesResponseCollectionAllOfResultInfo>() {
           @Override
           public void write(JsonWriter out, EmailDestinationAddressesResponseCollectionAllOfResultInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailDestinationAddressesResponseCollectionAllOfResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EmailDestinationAddressesResponseCollectionAllOfResultInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmailDestinationAddressesResponseCollectionAllOfResultInfo
  * @throws IOException if the JSON string is invalid with respect to EmailDestinationAddressesResponseCollectionAllOfResultInfo
  */
  public static EmailDestinationAddressesResponseCollectionAllOfResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailDestinationAddressesResponseCollectionAllOfResultInfo.class);
  }

 /**
  * Convert an instance of EmailDestinationAddressesResponseCollectionAllOfResultInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

