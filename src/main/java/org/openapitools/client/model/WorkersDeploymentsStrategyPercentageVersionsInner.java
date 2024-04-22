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

import org.openapitools.client.JSON;

/**
 * WorkersDeploymentsStrategyPercentageVersionsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class WorkersDeploymentsStrategyPercentageVersionsInner {
  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private BigDecimal percentage;

  public static final String SERIALIZED_NAME_VERSION_ID = "version_id";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  private String versionId;

  public WorkersDeploymentsStrategyPercentageVersionsInner() {
  }

  public WorkersDeploymentsStrategyPercentageVersionsInner percentage(BigDecimal percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * minimum: 0
   * maximum: 100
   * @return percentage
  **/
  @javax.annotation.Nonnull
  public BigDecimal getPercentage() {
    return percentage;
  }

  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }


  public WorkersDeploymentsStrategyPercentageVersionsInner versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * Get versionId
   * @return versionId
  **/
  @javax.annotation.Nonnull
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkersDeploymentsStrategyPercentageVersionsInner workersDeploymentsStrategyPercentageVersionsInner = (WorkersDeploymentsStrategyPercentageVersionsInner) o;
    return Objects.equals(this.percentage, workersDeploymentsStrategyPercentageVersionsInner.percentage) &&
        Objects.equals(this.versionId, workersDeploymentsStrategyPercentageVersionsInner.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, versionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkersDeploymentsStrategyPercentageVersionsInner {\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
    openapiFields.add("percentage");
    openapiFields.add("version_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("percentage");
    openapiRequiredFields.add("version_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WorkersDeploymentsStrategyPercentageVersionsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkersDeploymentsStrategyPercentageVersionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkersDeploymentsStrategyPercentageVersionsInner is not found in the empty JSON string", WorkersDeploymentsStrategyPercentageVersionsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkersDeploymentsStrategyPercentageVersionsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkersDeploymentsStrategyPercentageVersionsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkersDeploymentsStrategyPercentageVersionsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("version_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkersDeploymentsStrategyPercentageVersionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkersDeploymentsStrategyPercentageVersionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkersDeploymentsStrategyPercentageVersionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkersDeploymentsStrategyPercentageVersionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkersDeploymentsStrategyPercentageVersionsInner>() {
           @Override
           public void write(JsonWriter out, WorkersDeploymentsStrategyPercentageVersionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkersDeploymentsStrategyPercentageVersionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkersDeploymentsStrategyPercentageVersionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkersDeploymentsStrategyPercentageVersionsInner
  * @throws IOException if the JSON string is invalid with respect to WorkersDeploymentsStrategyPercentageVersionsInner
  */
  public static WorkersDeploymentsStrategyPercentageVersionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkersDeploymentsStrategyPercentageVersionsInner.class);
  }

 /**
  * Convert an instance of WorkersDeploymentsStrategyPercentageVersionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

