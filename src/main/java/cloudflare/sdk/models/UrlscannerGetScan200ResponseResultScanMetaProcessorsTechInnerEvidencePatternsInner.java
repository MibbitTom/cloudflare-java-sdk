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
 * UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner {
  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private Integer confidence;

  public static final String SERIALIZED_NAME_EXCLUDES = "excludes";
  @SerializedName(SERIALIZED_NAME_EXCLUDES)
  private List<String> excludes = new ArrayList<>();

  public static final String SERIALIZED_NAME_IMPLIES = "implies";
  @SerializedName(SERIALIZED_NAME_IMPLIES)
  private List<String> implies = new ArrayList<>();

  public static final String SERIALIZED_NAME_MATCH = "match";
  @SerializedName(SERIALIZED_NAME_MATCH)
  private String match;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REGEX = "regex";
  @SerializedName(SERIALIZED_NAME_REGEX)
  private String regex;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner() {
  }

  public UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @javax.annotation.Nonnull
  public Integer getConfidence() {
    return confidence;
  }

  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }


  public UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner excludes(List<String> excludes) {
    this.excludes = excludes;
    return this;
  }

  public UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner addExcludesItem(String excludesItem) {
    if (this.excludes == null) {
      this.excludes = new ArrayList<>();
    }
    this.excludes.add(excludesItem);
    return this;
  }

   /**
   * Get excludes
   * @return excludes
  **/
  @javax.annotation.Nonnull
  public List<String> getExcludes() {
    return excludes;
  }

  public void setExcludes(List<String> excludes) {
    this.excludes = excludes;
  }


  public UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner implies(List<String> implies) {
    this.implies = implies;
    return this;
  }

  public UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner addImpliesItem(String impliesItem) {
    if (this.implies == null) {
      this.implies = new ArrayList<>();
    }
    this.implies.add(impliesItem);
    return this;
  }

   /**
   * Get implies
   * @return implies
  **/
  @javax.annotation.Nonnull
  public List<String> getImplies() {
    return implies;
  }

  public void setImplies(List<String> implies) {
    this.implies = implies;
  }


  public UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner match(String match) {
    this.match = match;
    return this;
  }

   /**
   * Get match
   * @return match
  **/
  @javax.annotation.Nonnull
  public String getMatch() {
    return match;
  }

  public void setMatch(String match) {
    this.match = match;
  }


  public UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Header or Cookie name when set
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner regex(String regex) {
    this.regex = regex;
    return this;
  }

   /**
   * Get regex
   * @return regex
  **/
  @javax.annotation.Nonnull
  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }


  public UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner urlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner = (UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner) o;
    return Objects.equals(this.confidence, urlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner.confidence) &&
        Objects.equals(this.excludes, urlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner.excludes) &&
        Objects.equals(this.implies, urlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner.implies) &&
        Objects.equals(this.match, urlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner.match) &&
        Objects.equals(this.name, urlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner.name) &&
        Objects.equals(this.regex, urlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner.regex) &&
        Objects.equals(this.type, urlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner.type) &&
        Objects.equals(this.value, urlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner.value) &&
        Objects.equals(this.version, urlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, excludes, implies, match, name, regex, type, value, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner {\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    excludes: ").append(toIndentedString(excludes)).append("\n");
    sb.append("    implies: ").append(toIndentedString(implies)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("confidence");
    openapiFields.add("excludes");
    openapiFields.add("implies");
    openapiFields.add("match");
    openapiFields.add("name");
    openapiFields.add("regex");
    openapiFields.add("type");
    openapiFields.add("value");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("confidence");
    openapiRequiredFields.add("excludes");
    openapiRequiredFields.add("implies");
    openapiRequiredFields.add("match");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("regex");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("version");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner is not found in the empty JSON string", UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("excludes") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("excludes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludes` to be an array in the JSON string but got `%s`", jsonObj.get("excludes").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("implies") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("implies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `implies` to be an array in the JSON string but got `%s`", jsonObj.get("implies").toString()));
      }
      if (!jsonObj.get("match").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `match` to be a primitive type in the JSON string but got `%s`", jsonObj.get("match").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("regex").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regex` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regex").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if (!jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner>() {
           @Override
           public void write(JsonWriter out, UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner
  * @throws IOException if the JSON string is invalid with respect to UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner
  */
  public static UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner.class);
  }

 /**
  * Convert an instance of UrlscannerGetScan200ResponseResultScanMetaProcessorsTechInnerEvidencePatternsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

