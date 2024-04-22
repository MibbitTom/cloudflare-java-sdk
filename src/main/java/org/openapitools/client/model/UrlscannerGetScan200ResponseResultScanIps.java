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
import org.openapitools.client.model.UrlscannerGetScan200ResponseResultScanIpsIp;

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
 * UrlscannerGetScan200ResponseResultScanIps
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class UrlscannerGetScan200ResponseResultScanIps {
  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private UrlscannerGetScan200ResponseResultScanIpsIp ip;

  public UrlscannerGetScan200ResponseResultScanIps() {
  }

  public UrlscannerGetScan200ResponseResultScanIps ip(UrlscannerGetScan200ResponseResultScanIpsIp ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nullable
  public UrlscannerGetScan200ResponseResultScanIpsIp getIp() {
    return ip;
  }

  public void setIp(UrlscannerGetScan200ResponseResultScanIpsIp ip) {
    this.ip = ip;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlscannerGetScan200ResponseResultScanIps urlscannerGetScan200ResponseResultScanIps = (UrlscannerGetScan200ResponseResultScanIps) o;
    return Objects.equals(this.ip, urlscannerGetScan200ResponseResultScanIps.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlscannerGetScan200ResponseResultScanIps {\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
    openapiFields.add("ip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UrlscannerGetScan200ResponseResultScanIps
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlscannerGetScan200ResponseResultScanIps.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlscannerGetScan200ResponseResultScanIps is not found in the empty JSON string", UrlscannerGetScan200ResponseResultScanIps.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UrlscannerGetScan200ResponseResultScanIps.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UrlscannerGetScan200ResponseResultScanIps` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ip`
      if (jsonObj.get("ip") != null && !jsonObj.get("ip").isJsonNull()) {
        UrlscannerGetScan200ResponseResultScanIpsIp.validateJsonElement(jsonObj.get("ip"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlscannerGetScan200ResponseResultScanIps.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlscannerGetScan200ResponseResultScanIps' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlscannerGetScan200ResponseResultScanIps> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlscannerGetScan200ResponseResultScanIps.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlscannerGetScan200ResponseResultScanIps>() {
           @Override
           public void write(JsonWriter out, UrlscannerGetScan200ResponseResultScanIps value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlscannerGetScan200ResponseResultScanIps read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlscannerGetScan200ResponseResultScanIps given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlscannerGetScan200ResponseResultScanIps
  * @throws IOException if the JSON string is invalid with respect to UrlscannerGetScan200ResponseResultScanIps
  */
  public static UrlscannerGetScan200ResponseResultScanIps fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlscannerGetScan200ResponseResultScanIps.class);
  }

 /**
  * Convert an instance of UrlscannerGetScan200ResponseResultScanIps to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

