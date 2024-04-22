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
import cloudflare.sdk.models.CompressionAlgorithm;
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
 * CompressionRuleActionParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class CompressionRuleActionParameters {
  public static final String SERIALIZED_NAME_ALGORITHMS = "algorithms";
  @SerializedName(SERIALIZED_NAME_ALGORITHMS)
  private List<CompressionAlgorithm> algorithms = new ArrayList<>();

  public CompressionRuleActionParameters() {
  }

  public CompressionRuleActionParameters algorithms(List<CompressionAlgorithm> algorithms) {
    this.algorithms = algorithms;
    return this;
  }

  public CompressionRuleActionParameters addAlgorithmsItem(CompressionAlgorithm algorithmsItem) {
    if (this.algorithms == null) {
      this.algorithms = new ArrayList<>();
    }
    this.algorithms.add(algorithmsItem);
    return this;
  }

   /**
   * Custom order for compression algorithms.
   * @return algorithms
  **/
  @javax.annotation.Nullable
  public List<CompressionAlgorithm> getAlgorithms() {
    return algorithms;
  }

  public void setAlgorithms(List<CompressionAlgorithm> algorithms) {
    this.algorithms = algorithms;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompressionRuleActionParameters compressionRuleActionParameters = (CompressionRuleActionParameters) o;
    return Objects.equals(this.algorithms, compressionRuleActionParameters.algorithms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompressionRuleActionParameters {\n");
    sb.append("    algorithms: ").append(toIndentedString(algorithms)).append("\n");
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
    openapiFields.add("algorithms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CompressionRuleActionParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CompressionRuleActionParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompressionRuleActionParameters is not found in the empty JSON string", CompressionRuleActionParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CompressionRuleActionParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CompressionRuleActionParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("algorithms") != null && !jsonObj.get("algorithms").isJsonNull()) {
        JsonArray jsonArrayalgorithms = jsonObj.getAsJsonArray("algorithms");
        if (jsonArrayalgorithms != null) {
          // ensure the json data is an array
          if (!jsonObj.get("algorithms").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `algorithms` to be an array in the JSON string but got `%s`", jsonObj.get("algorithms").toString()));
          }

          // validate the optional field `algorithms` (array)
          for (int i = 0; i < jsonArrayalgorithms.size(); i++) {
            CompressionAlgorithm.validateJsonElement(jsonArrayalgorithms.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompressionRuleActionParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompressionRuleActionParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompressionRuleActionParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompressionRuleActionParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<CompressionRuleActionParameters>() {
           @Override
           public void write(JsonWriter out, CompressionRuleActionParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CompressionRuleActionParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CompressionRuleActionParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CompressionRuleActionParameters
  * @throws IOException if the JSON string is invalid with respect to CompressionRuleActionParameters
  */
  public static CompressionRuleActionParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompressionRuleActionParameters.class);
  }

 /**
  * Convert an instance of CompressionRuleActionParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

