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
import org.openapitools.client.model.MagicInterconnect;

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
 * MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult {
  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private Boolean modified;

  public static final String SERIALIZED_NAME_MODIFIED_INTERCONNECTS = "modified_interconnects";
  @SerializedName(SERIALIZED_NAME_MODIFIED_INTERCONNECTS)
  private List<MagicInterconnect> modifiedInterconnects = new ArrayList<>();

  public MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult() {
  }

  public MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult modified(Boolean modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @javax.annotation.Nullable
  public Boolean getModified() {
    return modified;
  }

  public void setModified(Boolean modified) {
    this.modified = modified;
  }


  public MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult modifiedInterconnects(List<MagicInterconnect> modifiedInterconnects) {
    this.modifiedInterconnects = modifiedInterconnects;
    return this;
  }

  public MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult addModifiedInterconnectsItem(MagicInterconnect modifiedInterconnectsItem) {
    if (this.modifiedInterconnects == null) {
      this.modifiedInterconnects = new ArrayList<>();
    }
    this.modifiedInterconnects.add(modifiedInterconnectsItem);
    return this;
  }

   /**
   * Get modifiedInterconnects
   * @return modifiedInterconnects
  **/
  @javax.annotation.Nullable
  public List<MagicInterconnect> getModifiedInterconnects() {
    return modifiedInterconnects;
  }

  public void setModifiedInterconnects(List<MagicInterconnect> modifiedInterconnects) {
    this.modifiedInterconnects = modifiedInterconnects;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult magicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult = (MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult) o;
    return Objects.equals(this.modified, magicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult.modified) &&
        Objects.equals(this.modifiedInterconnects, magicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult.modifiedInterconnects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modified, modifiedInterconnects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult {\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    modifiedInterconnects: ").append(toIndentedString(modifiedInterconnects)).append("\n");
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
    openapiFields.add("modified");
    openapiFields.add("modified_interconnects");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult is not found in the empty JSON string", MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("modified_interconnects") != null && !jsonObj.get("modified_interconnects").isJsonNull()) {
        JsonArray jsonArraymodifiedInterconnects = jsonObj.getAsJsonArray("modified_interconnects");
        if (jsonArraymodifiedInterconnects != null) {
          // ensure the json data is an array
          if (!jsonObj.get("modified_interconnects").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `modified_interconnects` to be an array in the JSON string but got `%s`", jsonObj.get("modified_interconnects").toString()));
          }

          // validate the optional field `modified_interconnects` (array)
          for (int i = 0; i < jsonArraymodifiedInterconnects.size(); i++) {
            MagicInterconnect.validateJsonElement(jsonArraymodifiedInterconnects.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult.class));

       return (TypeAdapter<T>) new TypeAdapter<MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult>() {
           @Override
           public void write(JsonWriter out, MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult
  * @throws IOException if the JSON string is invalid with respect to MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult
  */
  public static MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult.class);
  }

 /**
  * Convert an instance of MagicComponentsSchemasModifiedTunnelsCollectionResponseAllOfResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

