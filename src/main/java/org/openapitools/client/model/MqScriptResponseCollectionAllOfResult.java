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
 * MqScriptResponseCollectionAllOfResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class MqScriptResponseCollectionAllOfResult {
  public static final String SERIALIZED_NAME_CREATED_ON = "created_on";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private Object createdOn = null;

  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private Object etag = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Object id = null;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modified_on";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private Object modifiedOn = null;

  public static final String SERIALIZED_NAME_USAGE_MODEL = "usage_model";
  @SerializedName(SERIALIZED_NAME_USAGE_MODEL)
  private Object usageModel = null;

  public MqScriptResponseCollectionAllOfResult() {
  }

  public MqScriptResponseCollectionAllOfResult(
     Object createdOn, 
     Object etag, 
     Object id, 
     Object modifiedOn, 
     Object usageModel
  ) {
    this();
    this.createdOn = createdOn;
    this.etag = etag;
    this.id = id;
    this.modifiedOn = modifiedOn;
    this.usageModel = usageModel;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @javax.annotation.Nullable
  public Object getCreatedOn() {
    return createdOn;
  }



   /**
   * Get etag
   * @return etag
  **/
  @javax.annotation.Nullable
  public Object getEtag() {
    return etag;
  }



   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Object getId() {
    return id;
  }



   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  public Object getModifiedOn() {
    return modifiedOn;
  }



   /**
   * Get usageModel
   * @return usageModel
  **/
  @javax.annotation.Nullable
  public Object getUsageModel() {
    return usageModel;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MqScriptResponseCollectionAllOfResult mqScriptResponseCollectionAllOfResult = (MqScriptResponseCollectionAllOfResult) o;
    return Objects.equals(this.createdOn, mqScriptResponseCollectionAllOfResult.createdOn) &&
        Objects.equals(this.etag, mqScriptResponseCollectionAllOfResult.etag) &&
        Objects.equals(this.id, mqScriptResponseCollectionAllOfResult.id) &&
        Objects.equals(this.modifiedOn, mqScriptResponseCollectionAllOfResult.modifiedOn) &&
        Objects.equals(this.usageModel, mqScriptResponseCollectionAllOfResult.usageModel);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, etag, id, modifiedOn, usageModel);
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
    sb.append("class MqScriptResponseCollectionAllOfResult {\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    usageModel: ").append(toIndentedString(usageModel)).append("\n");
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
    openapiFields.add("created_on");
    openapiFields.add("etag");
    openapiFields.add("id");
    openapiFields.add("modified_on");
    openapiFields.add("usage_model");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MqScriptResponseCollectionAllOfResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MqScriptResponseCollectionAllOfResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MqScriptResponseCollectionAllOfResult is not found in the empty JSON string", MqScriptResponseCollectionAllOfResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MqScriptResponseCollectionAllOfResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MqScriptResponseCollectionAllOfResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MqScriptResponseCollectionAllOfResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MqScriptResponseCollectionAllOfResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MqScriptResponseCollectionAllOfResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MqScriptResponseCollectionAllOfResult.class));

       return (TypeAdapter<T>) new TypeAdapter<MqScriptResponseCollectionAllOfResult>() {
           @Override
           public void write(JsonWriter out, MqScriptResponseCollectionAllOfResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MqScriptResponseCollectionAllOfResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MqScriptResponseCollectionAllOfResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MqScriptResponseCollectionAllOfResult
  * @throws IOException if the JSON string is invalid with respect to MqScriptResponseCollectionAllOfResult
  */
  public static MqScriptResponseCollectionAllOfResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MqScriptResponseCollectionAllOfResult.class);
  }

 /**
  * Convert an instance of MqScriptResponseCollectionAllOfResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

