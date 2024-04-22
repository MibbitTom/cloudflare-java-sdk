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
 * UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom {
  public static final String SERIALIZED_NAME_COLO = "colo";
  @SerializedName(SERIALIZED_NAME_COLO)
  private String colo;

  public UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom() {
  }

  public UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom colo(String colo) {
    this.colo = colo;
    return this;
  }

   /**
   * IATA code of Cloudflare datacenter
   * @return colo
  **/
  @javax.annotation.Nonnull
  public String getColo() {
    return colo;
  }

  public void setColo(String colo) {
    this.colo = colo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom urlscannerCreateScan409ResponseResultTasksInnerScannedFrom = (UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom) o;
    return Objects.equals(this.colo, urlscannerCreateScan409ResponseResultTasksInnerScannedFrom.colo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom {\n");
    sb.append("    colo: ").append(toIndentedString(colo)).append("\n");
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
    openapiFields.add("colo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("colo");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom is not found in the empty JSON string", UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("colo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `colo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("colo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom>() {
           @Override
           public void write(JsonWriter out, UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom
  * @throws IOException if the JSON string is invalid with respect to UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom
  */
  public static UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom.class);
  }

 /**
  * Convert an instance of UrlscannerCreateScan409ResponseResultTasksInnerScannedFrom to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

