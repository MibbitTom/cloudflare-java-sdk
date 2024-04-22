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
 * RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0 {
  public static final String SERIALIZED_NAME_BRAND_IMPERSONATION = "BrandImpersonation";
  @SerializedName(SERIALIZED_NAME_BRAND_IMPERSONATION)
  private String brandImpersonation;

  public static final String SERIALIZED_NAME_CREDENTIAL_HARVESTER = "CredentialHarvester";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_HARVESTER)
  private String credentialHarvester;

  public static final String SERIALIZED_NAME_IDENTITY_DECEPTION = "IdentityDeception";
  @SerializedName(SERIALIZED_NAME_IDENTITY_DECEPTION)
  private String identityDeception;

  public static final String SERIALIZED_NAME_LINK = "Link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0() {
  }

  public RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0 brandImpersonation(String brandImpersonation) {
    this.brandImpersonation = brandImpersonation;
    return this;
  }

   /**
   * Get brandImpersonation
   * @return brandImpersonation
  **/
  @javax.annotation.Nonnull
  public String getBrandImpersonation() {
    return brandImpersonation;
  }

  public void setBrandImpersonation(String brandImpersonation) {
    this.brandImpersonation = brandImpersonation;
  }


  public RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0 credentialHarvester(String credentialHarvester) {
    this.credentialHarvester = credentialHarvester;
    return this;
  }

   /**
   * Get credentialHarvester
   * @return credentialHarvester
  **/
  @javax.annotation.Nonnull
  public String getCredentialHarvester() {
    return credentialHarvester;
  }

  public void setCredentialHarvester(String credentialHarvester) {
    this.credentialHarvester = credentialHarvester;
  }


  public RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0 identityDeception(String identityDeception) {
    this.identityDeception = identityDeception;
    return this;
  }

   /**
   * Get identityDeception
   * @return identityDeception
  **/
  @javax.annotation.Nonnull
  public String getIdentityDeception() {
    return identityDeception;
  }

  public void setIdentityDeception(String identityDeception) {
    this.identityDeception = identityDeception;
  }


  public RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0 link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nonnull
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0 radarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0 = (RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0) o;
    return Objects.equals(this.brandImpersonation, radarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0.brandImpersonation) &&
        Objects.equals(this.credentialHarvester, radarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0.credentialHarvester) &&
        Objects.equals(this.identityDeception, radarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0.identityDeception) &&
        Objects.equals(this.link, radarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandImpersonation, credentialHarvester, identityDeception, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0 {\n");
    sb.append("    brandImpersonation: ").append(toIndentedString(brandImpersonation)).append("\n");
    sb.append("    credentialHarvester: ").append(toIndentedString(credentialHarvester)).append("\n");
    sb.append("    identityDeception: ").append(toIndentedString(identityDeception)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
    openapiFields.add("BrandImpersonation");
    openapiFields.add("CredentialHarvester");
    openapiFields.add("IdentityDeception");
    openapiFields.add("Link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("BrandImpersonation");
    openapiRequiredFields.add("CredentialHarvester");
    openapiRequiredFields.add("IdentityDeception");
    openapiRequiredFields.add("Link");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0 is not found in the empty JSON string", RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("BrandImpersonation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BrandImpersonation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BrandImpersonation").toString()));
      }
      if (!jsonObj.get("CredentialHarvester").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CredentialHarvester` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CredentialHarvester").toString()));
      }
      if (!jsonObj.get("IdentityDeception").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IdentityDeception` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IdentityDeception").toString()));
      }
      if (!jsonObj.get("Link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Link").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0>() {
           @Override
           public void write(JsonWriter out, RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0
  * @throws IOException if the JSON string is invalid with respect to RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0
  */
  public static RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0.class);
  }

 /**
  * Convert an instance of RadarGetEmailSecuritySummaryByThreatCategory200ResponseResultSummary0 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
