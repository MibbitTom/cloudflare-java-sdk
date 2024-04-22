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
import org.openapitools.client.model.ZeroTrustGatewayClass;
import org.openapitools.client.model.ZeroTrustGatewaySubcategory;

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
 * ZeroTrustGatewayCategories
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZeroTrustGatewayCategories {
  public static final String SERIALIZED_NAME_BETA = "beta";
  @SerializedName(SERIALIZED_NAME_BETA)
  private Boolean beta;

  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private ZeroTrustGatewayClass propertyClass;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUBCATEGORIES = "subcategories";
  @SerializedName(SERIALIZED_NAME_SUBCATEGORIES)
  private List<ZeroTrustGatewaySubcategory> subcategories = new ArrayList<>();

  public ZeroTrustGatewayCategories() {
  }

  public ZeroTrustGatewayCategories beta(Boolean beta) {
    this.beta = beta;
    return this;
  }

   /**
   * True if the category is in beta and subject to change.
   * @return beta
  **/
  @javax.annotation.Nullable
  public Boolean getBeta() {
    return beta;
  }

  public void setBeta(Boolean beta) {
    this.beta = beta;
  }


  public ZeroTrustGatewayCategories propertyClass(ZeroTrustGatewayClass propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Get propertyClass
   * @return propertyClass
  **/
  @javax.annotation.Nullable
  public ZeroTrustGatewayClass getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(ZeroTrustGatewayClass propertyClass) {
    this.propertyClass = propertyClass;
  }


  public ZeroTrustGatewayCategories description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A short summary of domains in the category.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public ZeroTrustGatewayCategories id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier for this category. There is only one category per ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ZeroTrustGatewayCategories name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the category.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ZeroTrustGatewayCategories subcategories(List<ZeroTrustGatewaySubcategory> subcategories) {
    this.subcategories = subcategories;
    return this;
  }

  public ZeroTrustGatewayCategories addSubcategoriesItem(ZeroTrustGatewaySubcategory subcategoriesItem) {
    if (this.subcategories == null) {
      this.subcategories = new ArrayList<>();
    }
    this.subcategories.add(subcategoriesItem);
    return this;
  }

   /**
   * All subcategories for this category.
   * @return subcategories
  **/
  @javax.annotation.Nullable
  public List<ZeroTrustGatewaySubcategory> getSubcategories() {
    return subcategories;
  }

  public void setSubcategories(List<ZeroTrustGatewaySubcategory> subcategories) {
    this.subcategories = subcategories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZeroTrustGatewayCategories zeroTrustGatewayCategories = (ZeroTrustGatewayCategories) o;
    return Objects.equals(this.beta, zeroTrustGatewayCategories.beta) &&
        Objects.equals(this.propertyClass, zeroTrustGatewayCategories.propertyClass) &&
        Objects.equals(this.description, zeroTrustGatewayCategories.description) &&
        Objects.equals(this.id, zeroTrustGatewayCategories.id) &&
        Objects.equals(this.name, zeroTrustGatewayCategories.name) &&
        Objects.equals(this.subcategories, zeroTrustGatewayCategories.subcategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beta, propertyClass, description, id, name, subcategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZeroTrustGatewayCategories {\n");
    sb.append("    beta: ").append(toIndentedString(beta)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subcategories: ").append(toIndentedString(subcategories)).append("\n");
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
    openapiFields.add("beta");
    openapiFields.add("class");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("subcategories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZeroTrustGatewayCategories
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZeroTrustGatewayCategories.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZeroTrustGatewayCategories is not found in the empty JSON string", ZeroTrustGatewayCategories.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZeroTrustGatewayCategories.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZeroTrustGatewayCategories` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `class`
      if (jsonObj.get("class") != null && !jsonObj.get("class").isJsonNull()) {
        ZeroTrustGatewayClass.validateJsonElement(jsonObj.get("class"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("subcategories") != null && !jsonObj.get("subcategories").isJsonNull()) {
        JsonArray jsonArraysubcategories = jsonObj.getAsJsonArray("subcategories");
        if (jsonArraysubcategories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subcategories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subcategories` to be an array in the JSON string but got `%s`", jsonObj.get("subcategories").toString()));
          }

          // validate the optional field `subcategories` (array)
          for (int i = 0; i < jsonArraysubcategories.size(); i++) {
            ZeroTrustGatewaySubcategory.validateJsonElement(jsonArraysubcategories.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZeroTrustGatewayCategories.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZeroTrustGatewayCategories' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZeroTrustGatewayCategories> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZeroTrustGatewayCategories.class));

       return (TypeAdapter<T>) new TypeAdapter<ZeroTrustGatewayCategories>() {
           @Override
           public void write(JsonWriter out, ZeroTrustGatewayCategories value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZeroTrustGatewayCategories read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZeroTrustGatewayCategories given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZeroTrustGatewayCategories
  * @throws IOException if the JSON string is invalid with respect to ZeroTrustGatewayCategories
  */
  public static ZeroTrustGatewayCategories fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZeroTrustGatewayCategories.class);
  }

 /**
  * Convert an instance of ZeroTrustGatewayCategories to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

