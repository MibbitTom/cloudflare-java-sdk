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
import org.openapitools.client.model.CustomSslForAZoneRePrioritizeSslCertificatesRequestCertificatesInner;

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
 * CustomSslForAZoneRePrioritizeSslCertificatesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class CustomSslForAZoneRePrioritizeSslCertificatesRequest {
  public static final String SERIALIZED_NAME_CERTIFICATES = "certificates";
  @SerializedName(SERIALIZED_NAME_CERTIFICATES)
  private List<CustomSslForAZoneRePrioritizeSslCertificatesRequestCertificatesInner> certificates = new ArrayList<>();

  public CustomSslForAZoneRePrioritizeSslCertificatesRequest() {
  }

  public CustomSslForAZoneRePrioritizeSslCertificatesRequest certificates(List<CustomSslForAZoneRePrioritizeSslCertificatesRequestCertificatesInner> certificates) {
    this.certificates = certificates;
    return this;
  }

  public CustomSslForAZoneRePrioritizeSslCertificatesRequest addCertificatesItem(CustomSslForAZoneRePrioritizeSslCertificatesRequestCertificatesInner certificatesItem) {
    if (this.certificates == null) {
      this.certificates = new ArrayList<>();
    }
    this.certificates.add(certificatesItem);
    return this;
  }

   /**
   * Array of ordered certificates.
   * @return certificates
  **/
  @javax.annotation.Nonnull
  public List<CustomSslForAZoneRePrioritizeSslCertificatesRequestCertificatesInner> getCertificates() {
    return certificates;
  }

  public void setCertificates(List<CustomSslForAZoneRePrioritizeSslCertificatesRequestCertificatesInner> certificates) {
    this.certificates = certificates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomSslForAZoneRePrioritizeSslCertificatesRequest customSslForAZoneRePrioritizeSslCertificatesRequest = (CustomSslForAZoneRePrioritizeSslCertificatesRequest) o;
    return Objects.equals(this.certificates, customSslForAZoneRePrioritizeSslCertificatesRequest.certificates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomSslForAZoneRePrioritizeSslCertificatesRequest {\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
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
    openapiFields.add("certificates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("certificates");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomSslForAZoneRePrioritizeSslCertificatesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomSslForAZoneRePrioritizeSslCertificatesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomSslForAZoneRePrioritizeSslCertificatesRequest is not found in the empty JSON string", CustomSslForAZoneRePrioritizeSslCertificatesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomSslForAZoneRePrioritizeSslCertificatesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomSslForAZoneRePrioritizeSslCertificatesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomSslForAZoneRePrioritizeSslCertificatesRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("certificates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificates` to be an array in the JSON string but got `%s`", jsonObj.get("certificates").toString()));
      }

      JsonArray jsonArraycertificates = jsonObj.getAsJsonArray("certificates");
      // validate the required field `certificates` (array)
      for (int i = 0; i < jsonArraycertificates.size(); i++) {
        CustomSslForAZoneRePrioritizeSslCertificatesRequestCertificatesInner.validateJsonElement(jsonArraycertificates.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomSslForAZoneRePrioritizeSslCertificatesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomSslForAZoneRePrioritizeSslCertificatesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomSslForAZoneRePrioritizeSslCertificatesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomSslForAZoneRePrioritizeSslCertificatesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomSslForAZoneRePrioritizeSslCertificatesRequest>() {
           @Override
           public void write(JsonWriter out, CustomSslForAZoneRePrioritizeSslCertificatesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomSslForAZoneRePrioritizeSslCertificatesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomSslForAZoneRePrioritizeSslCertificatesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomSslForAZoneRePrioritizeSslCertificatesRequest
  * @throws IOException if the JSON string is invalid with respect to CustomSslForAZoneRePrioritizeSslCertificatesRequest
  */
  public static CustomSslForAZoneRePrioritizeSslCertificatesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomSslForAZoneRePrioritizeSslCertificatesRequest.class);
  }

 /**
  * Convert an instance of CustomSslForAZoneRePrioritizeSslCertificatesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

