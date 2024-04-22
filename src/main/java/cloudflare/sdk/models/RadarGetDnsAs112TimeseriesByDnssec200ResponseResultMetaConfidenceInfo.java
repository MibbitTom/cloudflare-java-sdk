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
import cloudflare.sdk.models.RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfoAnnotationsInner;
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
 * RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private List<RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfoAnnotationsInner> annotations = new ArrayList<>();

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;

  public RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo() {
  }

  public RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo annotations(List<RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfoAnnotationsInner> annotations) {
    this.annotations = annotations;
    return this;
  }

  public RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo addAnnotationsItem(RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfoAnnotationsInner annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @javax.annotation.Nullable
  public List<RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfoAnnotationsInner> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfoAnnotationsInner> annotations) {
    this.annotations = annotations;
  }


  public RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo radarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo = (RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo) o;
    return Objects.equals(this.annotations, radarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo.annotations) &&
        Objects.equals(this.level, radarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
    openapiFields.add("annotations");
    openapiFields.add("level");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo is not found in the empty JSON string", RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("annotations") != null && !jsonObj.get("annotations").isJsonNull()) {
        JsonArray jsonArrayannotations = jsonObj.getAsJsonArray("annotations");
        if (jsonArrayannotations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("annotations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `annotations` to be an array in the JSON string but got `%s`", jsonObj.get("annotations").toString()));
          }

          // validate the optional field `annotations` (array)
          for (int i = 0; i < jsonArrayannotations.size(); i++) {
            RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfoAnnotationsInner.validateJsonElement(jsonArrayannotations.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo>() {
           @Override
           public void write(JsonWriter out, RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo
  * @throws IOException if the JSON string is invalid with respect to RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo
  */
  public static RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo.class);
  }

 /**
  * Convert an instance of RadarGetDnsAs112TimeseriesByDnssec200ResponseResultMetaConfidenceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

