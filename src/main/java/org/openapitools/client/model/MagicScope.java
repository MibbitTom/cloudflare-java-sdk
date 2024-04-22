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

import invalidPackageName.JSON;

/**
 * Used only for ECMP routes.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class MagicScope {
  public static final String SERIALIZED_NAME_COLO_NAMES = "colo_names";
  @SerializedName(SERIALIZED_NAME_COLO_NAMES)
  private List<String> coloNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_COLO_REGIONS = "colo_regions";
  @SerializedName(SERIALIZED_NAME_COLO_REGIONS)
  private List<String> coloRegions = new ArrayList<>();

  public MagicScope() {
  }

  public MagicScope coloNames(List<String> coloNames) {
    this.coloNames = coloNames;
    return this;
  }

  public MagicScope addColoNamesItem(String coloNamesItem) {
    if (this.coloNames == null) {
      this.coloNames = new ArrayList<>();
    }
    this.coloNames.add(coloNamesItem);
    return this;
  }

   /**
   * List of colo names for the ECMP scope.
   * @return coloNames
  **/
  @javax.annotation.Nullable
  public List<String> getColoNames() {
    return coloNames;
  }

  public void setColoNames(List<String> coloNames) {
    this.coloNames = coloNames;
  }


  public MagicScope coloRegions(List<String> coloRegions) {
    this.coloRegions = coloRegions;
    return this;
  }

  public MagicScope addColoRegionsItem(String coloRegionsItem) {
    if (this.coloRegions == null) {
      this.coloRegions = new ArrayList<>();
    }
    this.coloRegions.add(coloRegionsItem);
    return this;
  }

   /**
   * List of colo regions for the ECMP scope.
   * @return coloRegions
  **/
  @javax.annotation.Nullable
  public List<String> getColoRegions() {
    return coloRegions;
  }

  public void setColoRegions(List<String> coloRegions) {
    this.coloRegions = coloRegions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagicScope magicScope = (MagicScope) o;
    return Objects.equals(this.coloNames, magicScope.coloNames) &&
        Objects.equals(this.coloRegions, magicScope.coloRegions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coloNames, coloRegions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicScope {\n");
    sb.append("    coloNames: ").append(toIndentedString(coloNames)).append("\n");
    sb.append("    coloRegions: ").append(toIndentedString(coloRegions)).append("\n");
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
    openapiFields.add("colo_names");
    openapiFields.add("colo_regions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MagicScope
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MagicScope.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MagicScope is not found in the empty JSON string", MagicScope.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MagicScope.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MagicScope` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("colo_names") != null && !jsonObj.get("colo_names").isJsonNull() && !jsonObj.get("colo_names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `colo_names` to be an array in the JSON string but got `%s`", jsonObj.get("colo_names").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("colo_regions") != null && !jsonObj.get("colo_regions").isJsonNull() && !jsonObj.get("colo_regions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `colo_regions` to be an array in the JSON string but got `%s`", jsonObj.get("colo_regions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MagicScope.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MagicScope' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MagicScope> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MagicScope.class));

       return (TypeAdapter<T>) new TypeAdapter<MagicScope>() {
           @Override
           public void write(JsonWriter out, MagicScope value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MagicScope read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MagicScope given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MagicScope
  * @throws IOException if the JSON string is invalid with respect to MagicScope
  */
  public static MagicScope fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MagicScope.class);
  }

 /**
  * Convert an instance of MagicScope to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

