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
import java.math.BigDecimal;
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

import org.openapitools.client.JSON;

/**
 * RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private BigDecimal id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUPER_CATEGORY_ID = "superCategoryId";
  @SerializedName(SERIALIZED_NAME_SUPER_CATEGORY_ID)
  private BigDecimal superCategoryId;

  public RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner() {
  }

  public RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }


  public RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner superCategoryId(BigDecimal superCategoryId) {
    this.superCategoryId = superCategoryId;
    return this;
  }

   /**
   * Get superCategoryId
   * @return superCategoryId
  **/
  @javax.annotation.Nonnull
  public BigDecimal getSuperCategoryId() {
    return superCategoryId;
  }

  public void setSuperCategoryId(BigDecimal superCategoryId) {
    this.superCategoryId = superCategoryId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner radarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner = (RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner) o;
    return Objects.equals(this.id, radarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner.id) &&
        Objects.equals(this.name, radarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner.name) &&
        Objects.equals(this.superCategoryId, radarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner.superCategoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, superCategoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    superCategoryId: ").append(toIndentedString(superCategoryId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("superCategoryId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("superCategoryId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner is not found in the empty JSON string", RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner>() {
           @Override
           public void write(JsonWriter out, RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner
  * @throws IOException if the JSON string is invalid with respect to RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner
  */
  public static RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner.class);
  }

 /**
  * Convert an instance of RadarGetRankingDomainDetails200ResponseResultDetails0CategoriesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
