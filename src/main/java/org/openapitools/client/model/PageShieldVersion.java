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

import org.openapitools.client.JSON;

/**
 * The version of the analyzed script.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class PageShieldVersion {
  public static final String SERIALIZED_NAME_DATAFLOW_SCORE = "dataflow_score";
  @SerializedName(SERIALIZED_NAME_DATAFLOW_SCORE)
  private Integer dataflowScore;

  public static final String SERIALIZED_NAME_FETCHED_AT = "fetched_at";
  @SerializedName(SERIALIZED_NAME_FETCHED_AT)
  private String fetchedAt;

  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_JS_INTEGRITY_SCORE = "js_integrity_score";
  @SerializedName(SERIALIZED_NAME_JS_INTEGRITY_SCORE)
  private Integer jsIntegrityScore;

  public static final String SERIALIZED_NAME_OBFUSCATION_SCORE = "obfuscation_score";
  @SerializedName(SERIALIZED_NAME_OBFUSCATION_SCORE)
  private Integer obfuscationScore;

  public PageShieldVersion() {
  }

  public PageShieldVersion dataflowScore(Integer dataflowScore) {
    this.dataflowScore = dataflowScore;
    return this;
  }

   /**
   * The dataflow score of the JavaScript content.
   * minimum: 1
   * maximum: 99
   * @return dataflowScore
  **/
  @javax.annotation.Nullable
  public Integer getDataflowScore() {
    return dataflowScore;
  }

  public void setDataflowScore(Integer dataflowScore) {
    this.dataflowScore = dataflowScore;
  }


  public PageShieldVersion fetchedAt(String fetchedAt) {
    this.fetchedAt = fetchedAt;
    return this;
  }

   /**
   * The timestamp of when the script was last fetched.
   * @return fetchedAt
  **/
  @javax.annotation.Nullable
  public String getFetchedAt() {
    return fetchedAt;
  }

  public void setFetchedAt(String fetchedAt) {
    this.fetchedAt = fetchedAt;
  }


  public PageShieldVersion hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * The computed hash of the analyzed script.
   * @return hash
  **/
  @javax.annotation.Nullable
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }


  public PageShieldVersion jsIntegrityScore(Integer jsIntegrityScore) {
    this.jsIntegrityScore = jsIntegrityScore;
    return this;
  }

   /**
   * The integrity score of the JavaScript content.
   * minimum: 1
   * maximum: 99
   * @return jsIntegrityScore
  **/
  @javax.annotation.Nullable
  public Integer getJsIntegrityScore() {
    return jsIntegrityScore;
  }

  public void setJsIntegrityScore(Integer jsIntegrityScore) {
    this.jsIntegrityScore = jsIntegrityScore;
  }


  public PageShieldVersion obfuscationScore(Integer obfuscationScore) {
    this.obfuscationScore = obfuscationScore;
    return this;
  }

   /**
   * The obfuscation score of the JavaScript content.
   * minimum: 1
   * maximum: 99
   * @return obfuscationScore
  **/
  @javax.annotation.Nullable
  public Integer getObfuscationScore() {
    return obfuscationScore;
  }

  public void setObfuscationScore(Integer obfuscationScore) {
    this.obfuscationScore = obfuscationScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageShieldVersion pageShieldVersion = (PageShieldVersion) o;
    return Objects.equals(this.dataflowScore, pageShieldVersion.dataflowScore) &&
        Objects.equals(this.fetchedAt, pageShieldVersion.fetchedAt) &&
        Objects.equals(this.hash, pageShieldVersion.hash) &&
        Objects.equals(this.jsIntegrityScore, pageShieldVersion.jsIntegrityScore) &&
        Objects.equals(this.obfuscationScore, pageShieldVersion.obfuscationScore);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataflowScore, fetchedAt, hash, jsIntegrityScore, obfuscationScore);
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
    sb.append("class PageShieldVersion {\n");
    sb.append("    dataflowScore: ").append(toIndentedString(dataflowScore)).append("\n");
    sb.append("    fetchedAt: ").append(toIndentedString(fetchedAt)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    jsIntegrityScore: ").append(toIndentedString(jsIntegrityScore)).append("\n");
    sb.append("    obfuscationScore: ").append(toIndentedString(obfuscationScore)).append("\n");
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
    openapiFields.add("dataflow_score");
    openapiFields.add("fetched_at");
    openapiFields.add("hash");
    openapiFields.add("js_integrity_score");
    openapiFields.add("obfuscation_score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PageShieldVersion
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PageShieldVersion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageShieldVersion is not found in the empty JSON string", PageShieldVersion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PageShieldVersion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageShieldVersion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fetched_at") != null && !jsonObj.get("fetched_at").isJsonNull()) && !jsonObj.get("fetched_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fetched_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fetched_at").toString()));
      }
      if ((jsonObj.get("hash") != null && !jsonObj.get("hash").isJsonNull()) && !jsonObj.get("hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hash").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageShieldVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageShieldVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageShieldVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageShieldVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<PageShieldVersion>() {
           @Override
           public void write(JsonWriter out, PageShieldVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageShieldVersion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PageShieldVersion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageShieldVersion
  * @throws IOException if the JSON string is invalid with respect to PageShieldVersion
  */
  public static PageShieldVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageShieldVersion.class);
  }

 /**
  * Convert an instance of PageShieldVersion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

