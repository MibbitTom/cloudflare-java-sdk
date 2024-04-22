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

import org.openapitools.client.JSON;

/**
 * VectorizeIndexQueryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class VectorizeIndexQueryRequest {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private Object filter;

  public static final String SERIALIZED_NAME_RETURN_METADATA = "returnMetadata";
  @SerializedName(SERIALIZED_NAME_RETURN_METADATA)
  private Boolean returnMetadata = false;

  public static final String SERIALIZED_NAME_RETURN_VALUES = "returnValues";
  @SerializedName(SERIALIZED_NAME_RETURN_VALUES)
  private Boolean returnValues = false;

  public static final String SERIALIZED_NAME_TOP_K = "topK";
  @SerializedName(SERIALIZED_NAME_TOP_K)
  private BigDecimal topK = new BigDecimal("5");

  public static final String SERIALIZED_NAME_VECTOR = "vector";
  @SerializedName(SERIALIZED_NAME_VECTOR)
  private List<BigDecimal> vector = new ArrayList<>();

  public VectorizeIndexQueryRequest() {
  }

  public VectorizeIndexQueryRequest filter(Object filter) {
    this.filter = filter;
    return this;
  }

   /**
   * A metadata filter expression used to limit nearest neighbor results.
   * @return filter
  **/
  @javax.annotation.Nullable
  public Object getFilter() {
    return filter;
  }

  public void setFilter(Object filter) {
    this.filter = filter;
  }


  public VectorizeIndexQueryRequest returnMetadata(Boolean returnMetadata) {
    this.returnMetadata = returnMetadata;
    return this;
  }

   /**
   * Whether to return the metadata associated with the closest vectors.
   * @return returnMetadata
  **/
  @javax.annotation.Nullable
  public Boolean getReturnMetadata() {
    return returnMetadata;
  }

  public void setReturnMetadata(Boolean returnMetadata) {
    this.returnMetadata = returnMetadata;
  }


  public VectorizeIndexQueryRequest returnValues(Boolean returnValues) {
    this.returnValues = returnValues;
    return this;
  }

   /**
   * Whether to return the values associated with the closest vectors.
   * @return returnValues
  **/
  @javax.annotation.Nullable
  public Boolean getReturnValues() {
    return returnValues;
  }

  public void setReturnValues(Boolean returnValues) {
    this.returnValues = returnValues;
  }


  public VectorizeIndexQueryRequest topK(BigDecimal topK) {
    this.topK = topK;
    return this;
  }

   /**
   * The number of nearest neighbors to find.
   * @return topK
  **/
  @javax.annotation.Nullable
  public BigDecimal getTopK() {
    return topK;
  }

  public void setTopK(BigDecimal topK) {
    this.topK = topK;
  }


  public VectorizeIndexQueryRequest vector(List<BigDecimal> vector) {
    this.vector = vector;
    return this;
  }

  public VectorizeIndexQueryRequest addVectorItem(BigDecimal vectorItem) {
    if (this.vector == null) {
      this.vector = new ArrayList<>();
    }
    this.vector.add(vectorItem);
    return this;
  }

   /**
   * The search vector that will be used to find the nearest neighbors.
   * @return vector
  **/
  @javax.annotation.Nonnull
  public List<BigDecimal> getVector() {
    return vector;
  }

  public void setVector(List<BigDecimal> vector) {
    this.vector = vector;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VectorizeIndexQueryRequest vectorizeIndexQueryRequest = (VectorizeIndexQueryRequest) o;
    return Objects.equals(this.filter, vectorizeIndexQueryRequest.filter) &&
        Objects.equals(this.returnMetadata, vectorizeIndexQueryRequest.returnMetadata) &&
        Objects.equals(this.returnValues, vectorizeIndexQueryRequest.returnValues) &&
        Objects.equals(this.topK, vectorizeIndexQueryRequest.topK) &&
        Objects.equals(this.vector, vectorizeIndexQueryRequest.vector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, returnMetadata, returnValues, topK, vector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VectorizeIndexQueryRequest {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    returnMetadata: ").append(toIndentedString(returnMetadata)).append("\n");
    sb.append("    returnValues: ").append(toIndentedString(returnValues)).append("\n");
    sb.append("    topK: ").append(toIndentedString(topK)).append("\n");
    sb.append("    vector: ").append(toIndentedString(vector)).append("\n");
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
    openapiFields.add("filter");
    openapiFields.add("returnMetadata");
    openapiFields.add("returnValues");
    openapiFields.add("topK");
    openapiFields.add("vector");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vector");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VectorizeIndexQueryRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VectorizeIndexQueryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VectorizeIndexQueryRequest is not found in the empty JSON string", VectorizeIndexQueryRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VectorizeIndexQueryRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VectorizeIndexQueryRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VectorizeIndexQueryRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("vector") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("vector").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vector` to be an array in the JSON string but got `%s`", jsonObj.get("vector").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VectorizeIndexQueryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VectorizeIndexQueryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VectorizeIndexQueryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VectorizeIndexQueryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<VectorizeIndexQueryRequest>() {
           @Override
           public void write(JsonWriter out, VectorizeIndexQueryRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VectorizeIndexQueryRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VectorizeIndexQueryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VectorizeIndexQueryRequest
  * @throws IOException if the JSON string is invalid with respect to VectorizeIndexQueryRequest
  */
  public static VectorizeIndexQueryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VectorizeIndexQueryRequest.class);
  }

 /**
  * Convert an instance of VectorizeIndexQueryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

