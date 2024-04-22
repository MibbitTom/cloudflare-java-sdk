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
import cloudflare.sdk.models.AccessSchemasType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

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
 * AccessCustomPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessCustomPage {
  public static final String SERIALIZED_NAME_APP_COUNT = "app_count";
  @SerializedName(SERIALIZED_NAME_APP_COUNT)
  private Integer appCount;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CUSTOM_HTML = "custom_html";
  @SerializedName(SERIALIZED_NAME_CUSTOM_HTML)
  private String customHtml;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AccessSchemasType type;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public AccessCustomPage() {
  }

  public AccessCustomPage(
     OffsetDateTime createdAt, 
     String uid, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.uid = uid;
    this.updatedAt = updatedAt;
  }

  public AccessCustomPage appCount(Integer appCount) {
    this.appCount = appCount;
    return this;
  }

   /**
   * Number of apps the custom page is assigned to.
   * @return appCount
  **/
  @javax.annotation.Nullable
  public Integer getAppCount() {
    return appCount;
  }

  public void setAppCount(Integer appCount) {
    this.appCount = appCount;
  }


   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  public AccessCustomPage customHtml(String customHtml) {
    this.customHtml = customHtml;
    return this;
  }

   /**
   * Custom page HTML.
   * @return customHtml
  **/
  @javax.annotation.Nonnull
  public String getCustomHtml() {
    return customHtml;
  }

  public void setCustomHtml(String customHtml) {
    this.customHtml = customHtml;
  }


  public AccessCustomPage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Custom page name.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccessCustomPage type(AccessSchemasType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public AccessSchemasType getType() {
    return type;
  }

  public void setType(AccessSchemasType type) {
    this.type = type;
  }


   /**
   * UUID
   * @return uid
  **/
  @javax.annotation.Nullable
  public String getUid() {
    return uid;
  }



   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessCustomPage accessCustomPage = (AccessCustomPage) o;
    return Objects.equals(this.appCount, accessCustomPage.appCount) &&
        Objects.equals(this.createdAt, accessCustomPage.createdAt) &&
        Objects.equals(this.customHtml, accessCustomPage.customHtml) &&
        Objects.equals(this.name, accessCustomPage.name) &&
        Objects.equals(this.type, accessCustomPage.type) &&
        Objects.equals(this.uid, accessCustomPage.uid) &&
        Objects.equals(this.updatedAt, accessCustomPage.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appCount, createdAt, customHtml, name, type, uid, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessCustomPage {\n");
    sb.append("    appCount: ").append(toIndentedString(appCount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customHtml: ").append(toIndentedString(customHtml)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("app_count");
    openapiFields.add("created_at");
    openapiFields.add("custom_html");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("uid");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("custom_html");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessCustomPage
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessCustomPage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessCustomPage is not found in the empty JSON string", AccessCustomPage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessCustomPage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessCustomPage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccessCustomPage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("custom_html").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_html` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_html").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `type`
      AccessSchemasType.validateJsonElement(jsonObj.get("type"));
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessCustomPage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessCustomPage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessCustomPage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessCustomPage.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessCustomPage>() {
           @Override
           public void write(JsonWriter out, AccessCustomPage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessCustomPage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessCustomPage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessCustomPage
  * @throws IOException if the JSON string is invalid with respect to AccessCustomPage
  */
  public static AccessCustomPage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessCustomPage.class);
  }

 /**
  * Convert an instance of AccessCustomPage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

