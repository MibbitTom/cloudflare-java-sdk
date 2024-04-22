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
 * ASN&#39;s contacted
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class UrlscannerGetScan200ResponseResultScanAsnsAsn {
  public static final String SERIALIZED_NAME_ASN = "asn";
  @SerializedName(SERIALIZED_NAME_ASN)
  private String asn;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LOCATION_ALPHA2 = "location_alpha2";
  @SerializedName(SERIALIZED_NAME_LOCATION_ALPHA2)
  private String locationAlpha2;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORG_NAME = "org_name";
  @SerializedName(SERIALIZED_NAME_ORG_NAME)
  private String orgName;

  public UrlscannerGetScan200ResponseResultScanAsnsAsn() {
  }

  public UrlscannerGetScan200ResponseResultScanAsnsAsn asn(String asn) {
    this.asn = asn;
    return this;
  }

   /**
   * Get asn
   * @return asn
  **/
  @javax.annotation.Nonnull
  public String getAsn() {
    return asn;
  }

  public void setAsn(String asn) {
    this.asn = asn;
  }


  public UrlscannerGetScan200ResponseResultScanAsnsAsn description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public UrlscannerGetScan200ResponseResultScanAsnsAsn locationAlpha2(String locationAlpha2) {
    this.locationAlpha2 = locationAlpha2;
    return this;
  }

   /**
   * Get locationAlpha2
   * @return locationAlpha2
  **/
  @javax.annotation.Nonnull
  public String getLocationAlpha2() {
    return locationAlpha2;
  }

  public void setLocationAlpha2(String locationAlpha2) {
    this.locationAlpha2 = locationAlpha2;
  }


  public UrlscannerGetScan200ResponseResultScanAsnsAsn name(String name) {
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


  public UrlscannerGetScan200ResponseResultScanAsnsAsn orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

   /**
   * Get orgName
   * @return orgName
  **/
  @javax.annotation.Nonnull
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlscannerGetScan200ResponseResultScanAsnsAsn urlscannerGetScan200ResponseResultScanAsnsAsn = (UrlscannerGetScan200ResponseResultScanAsnsAsn) o;
    return Objects.equals(this.asn, urlscannerGetScan200ResponseResultScanAsnsAsn.asn) &&
        Objects.equals(this.description, urlscannerGetScan200ResponseResultScanAsnsAsn.description) &&
        Objects.equals(this.locationAlpha2, urlscannerGetScan200ResponseResultScanAsnsAsn.locationAlpha2) &&
        Objects.equals(this.name, urlscannerGetScan200ResponseResultScanAsnsAsn.name) &&
        Objects.equals(this.orgName, urlscannerGetScan200ResponseResultScanAsnsAsn.orgName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asn, description, locationAlpha2, name, orgName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlscannerGetScan200ResponseResultScanAsnsAsn {\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    locationAlpha2: ").append(toIndentedString(locationAlpha2)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
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
    openapiFields.add("asn");
    openapiFields.add("description");
    openapiFields.add("location_alpha2");
    openapiFields.add("name");
    openapiFields.add("org_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("asn");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("location_alpha2");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("org_name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UrlscannerGetScan200ResponseResultScanAsnsAsn
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlscannerGetScan200ResponseResultScanAsnsAsn.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlscannerGetScan200ResponseResultScanAsnsAsn is not found in the empty JSON string", UrlscannerGetScan200ResponseResultScanAsnsAsn.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UrlscannerGetScan200ResponseResultScanAsnsAsn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UrlscannerGetScan200ResponseResultScanAsnsAsn` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UrlscannerGetScan200ResponseResultScanAsnsAsn.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("asn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asn").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("location_alpha2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location_alpha2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location_alpha2").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("org_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlscannerGetScan200ResponseResultScanAsnsAsn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlscannerGetScan200ResponseResultScanAsnsAsn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlscannerGetScan200ResponseResultScanAsnsAsn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlscannerGetScan200ResponseResultScanAsnsAsn.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlscannerGetScan200ResponseResultScanAsnsAsn>() {
           @Override
           public void write(JsonWriter out, UrlscannerGetScan200ResponseResultScanAsnsAsn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlscannerGetScan200ResponseResultScanAsnsAsn read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlscannerGetScan200ResponseResultScanAsnsAsn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlscannerGetScan200ResponseResultScanAsnsAsn
  * @throws IOException if the JSON string is invalid with respect to UrlscannerGetScan200ResponseResultScanAsnsAsn
  */
  public static UrlscannerGetScan200ResponseResultScanAsnsAsn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlscannerGetScan200ResponseResultScanAsnsAsn.class);
  }

 /**
  * Convert an instance of UrlscannerGetScan200ResponseResultScanAsnsAsn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

