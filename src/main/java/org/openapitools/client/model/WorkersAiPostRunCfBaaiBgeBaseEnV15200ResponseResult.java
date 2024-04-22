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
import java.math.BigDecimal;
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
 * WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<List<BigDecimal>> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHAPE = "shape";
  @SerializedName(SERIALIZED_NAME_SHAPE)
  private List<BigDecimal> shape = new ArrayList<>();

  public WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult() {
  }

  public WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult data(List<List<BigDecimal>> data) {
    this.data = data;
    return this;
  }

  public WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult addDataItem(List<BigDecimal> dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public List<List<BigDecimal>> getData() {
    return data;
  }

  public void setData(List<List<BigDecimal>> data) {
    this.data = data;
  }


  public WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult shape(List<BigDecimal> shape) {
    this.shape = shape;
    return this;
  }

  public WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult addShapeItem(BigDecimal shapeItem) {
    if (this.shape == null) {
      this.shape = new ArrayList<>();
    }
    this.shape.add(shapeItem);
    return this;
  }

   /**
   * Get shape
   * @return shape
  **/
  @javax.annotation.Nullable
  public List<BigDecimal> getShape() {
    return shape;
  }

  public void setShape(List<BigDecimal> shape) {
    this.shape = shape;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult workersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult = (WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult) o;
    return Objects.equals(this.data, workersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult.data) &&
        Objects.equals(this.shape, workersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult.shape);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, shape);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("shape");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult is not found in the empty JSON string", WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull() && !jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("shape") != null && !jsonObj.get("shape").isJsonNull() && !jsonObj.get("shape").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shape` to be an array in the JSON string but got `%s`", jsonObj.get("shape").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult>() {
           @Override
           public void write(JsonWriter out, WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult
  * @throws IOException if the JSON string is invalid with respect to WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult
  */
  public static WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult.class);
  }

 /**
  * Convert an instance of WorkersAiPostRunCfBaaiBgeBaseEnV15200ResponseResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

