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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * IntelWhois
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class IntelWhois {
  public static final String SERIALIZED_NAME_CREATED_DATE = "created_date";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private LocalDate createdDate;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_NAMESERVERS = "nameservers";
  @SerializedName(SERIALIZED_NAME_NAMESERVERS)
  private List<String> nameservers = new ArrayList<>();

  public static final String SERIALIZED_NAME_REGISTRANT = "registrant";
  @SerializedName(SERIALIZED_NAME_REGISTRANT)
  private String registrant;

  public static final String SERIALIZED_NAME_REGISTRANT_COUNTRY = "registrant_country";
  @SerializedName(SERIALIZED_NAME_REGISTRANT_COUNTRY)
  private String registrantCountry;

  public static final String SERIALIZED_NAME_REGISTRANT_EMAIL = "registrant_email";
  @SerializedName(SERIALIZED_NAME_REGISTRANT_EMAIL)
  private String registrantEmail;

  public static final String SERIALIZED_NAME_REGISTRANT_ORG = "registrant_org";
  @SerializedName(SERIALIZED_NAME_REGISTRANT_ORG)
  private String registrantOrg;

  public static final String SERIALIZED_NAME_REGISTRAR = "registrar";
  @SerializedName(SERIALIZED_NAME_REGISTRAR)
  private String registrar;

  public static final String SERIALIZED_NAME_UPDATED_DATE = "updated_date";
  @SerializedName(SERIALIZED_NAME_UPDATED_DATE)
  private LocalDate updatedDate;

  public IntelWhois() {
  }

  public IntelWhois createdDate(LocalDate createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }


  public IntelWhois domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @javax.annotation.Nullable
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public IntelWhois nameservers(List<String> nameservers) {
    this.nameservers = nameservers;
    return this;
  }

  public IntelWhois addNameserversItem(String nameserversItem) {
    if (this.nameservers == null) {
      this.nameservers = new ArrayList<>();
    }
    this.nameservers.add(nameserversItem);
    return this;
  }

   /**
   * Get nameservers
   * @return nameservers
  **/
  @javax.annotation.Nullable
  public List<String> getNameservers() {
    return nameservers;
  }

  public void setNameservers(List<String> nameservers) {
    this.nameservers = nameservers;
  }


  public IntelWhois registrant(String registrant) {
    this.registrant = registrant;
    return this;
  }

   /**
   * Get registrant
   * @return registrant
  **/
  @javax.annotation.Nullable
  public String getRegistrant() {
    return registrant;
  }

  public void setRegistrant(String registrant) {
    this.registrant = registrant;
  }


  public IntelWhois registrantCountry(String registrantCountry) {
    this.registrantCountry = registrantCountry;
    return this;
  }

   /**
   * Get registrantCountry
   * @return registrantCountry
  **/
  @javax.annotation.Nullable
  public String getRegistrantCountry() {
    return registrantCountry;
  }

  public void setRegistrantCountry(String registrantCountry) {
    this.registrantCountry = registrantCountry;
  }


  public IntelWhois registrantEmail(String registrantEmail) {
    this.registrantEmail = registrantEmail;
    return this;
  }

   /**
   * Get registrantEmail
   * @return registrantEmail
  **/
  @javax.annotation.Nullable
  public String getRegistrantEmail() {
    return registrantEmail;
  }

  public void setRegistrantEmail(String registrantEmail) {
    this.registrantEmail = registrantEmail;
  }


  public IntelWhois registrantOrg(String registrantOrg) {
    this.registrantOrg = registrantOrg;
    return this;
  }

   /**
   * Get registrantOrg
   * @return registrantOrg
  **/
  @javax.annotation.Nullable
  public String getRegistrantOrg() {
    return registrantOrg;
  }

  public void setRegistrantOrg(String registrantOrg) {
    this.registrantOrg = registrantOrg;
  }


  public IntelWhois registrar(String registrar) {
    this.registrar = registrar;
    return this;
  }

   /**
   * Get registrar
   * @return registrar
  **/
  @javax.annotation.Nullable
  public String getRegistrar() {
    return registrar;
  }

  public void setRegistrar(String registrar) {
    this.registrar = registrar;
  }


  public IntelWhois updatedDate(LocalDate updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * Get updatedDate
   * @return updatedDate
  **/
  @javax.annotation.Nullable
  public LocalDate getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(LocalDate updatedDate) {
    this.updatedDate = updatedDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntelWhois intelWhois = (IntelWhois) o;
    return Objects.equals(this.createdDate, intelWhois.createdDate) &&
        Objects.equals(this.domain, intelWhois.domain) &&
        Objects.equals(this.nameservers, intelWhois.nameservers) &&
        Objects.equals(this.registrant, intelWhois.registrant) &&
        Objects.equals(this.registrantCountry, intelWhois.registrantCountry) &&
        Objects.equals(this.registrantEmail, intelWhois.registrantEmail) &&
        Objects.equals(this.registrantOrg, intelWhois.registrantOrg) &&
        Objects.equals(this.registrar, intelWhois.registrar) &&
        Objects.equals(this.updatedDate, intelWhois.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, domain, nameservers, registrant, registrantCountry, registrantEmail, registrantOrg, registrar, updatedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntelWhois {\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    nameservers: ").append(toIndentedString(nameservers)).append("\n");
    sb.append("    registrant: ").append(toIndentedString(registrant)).append("\n");
    sb.append("    registrantCountry: ").append(toIndentedString(registrantCountry)).append("\n");
    sb.append("    registrantEmail: ").append(toIndentedString(registrantEmail)).append("\n");
    sb.append("    registrantOrg: ").append(toIndentedString(registrantOrg)).append("\n");
    sb.append("    registrar: ").append(toIndentedString(registrar)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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
    openapiFields.add("created_date");
    openapiFields.add("domain");
    openapiFields.add("nameservers");
    openapiFields.add("registrant");
    openapiFields.add("registrant_country");
    openapiFields.add("registrant_email");
    openapiFields.add("registrant_org");
    openapiFields.add("registrar");
    openapiFields.add("updated_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IntelWhois
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IntelWhois.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntelWhois is not found in the empty JSON string", IntelWhois.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IntelWhois.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntelWhois` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("domain") != null && !jsonObj.get("domain").isJsonNull()) && !jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("nameservers") != null && !jsonObj.get("nameservers").isJsonNull() && !jsonObj.get("nameservers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameservers` to be an array in the JSON string but got `%s`", jsonObj.get("nameservers").toString()));
      }
      if ((jsonObj.get("registrant") != null && !jsonObj.get("registrant").isJsonNull()) && !jsonObj.get("registrant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrant").toString()));
      }
      if ((jsonObj.get("registrant_country") != null && !jsonObj.get("registrant_country").isJsonNull()) && !jsonObj.get("registrant_country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrant_country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrant_country").toString()));
      }
      if ((jsonObj.get("registrant_email") != null && !jsonObj.get("registrant_email").isJsonNull()) && !jsonObj.get("registrant_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrant_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrant_email").toString()));
      }
      if ((jsonObj.get("registrant_org") != null && !jsonObj.get("registrant_org").isJsonNull()) && !jsonObj.get("registrant_org").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrant_org` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrant_org").toString()));
      }
      if ((jsonObj.get("registrar") != null && !jsonObj.get("registrar").isJsonNull()) && !jsonObj.get("registrar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrar").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntelWhois.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntelWhois' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntelWhois> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntelWhois.class));

       return (TypeAdapter<T>) new TypeAdapter<IntelWhois>() {
           @Override
           public void write(JsonWriter out, IntelWhois value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntelWhois read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IntelWhois given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntelWhois
  * @throws IOException if the JSON string is invalid with respect to IntelWhois
  */
  public static IntelWhois fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntelWhois.class);
  }

 /**
  * Convert an instance of IntelWhois to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
