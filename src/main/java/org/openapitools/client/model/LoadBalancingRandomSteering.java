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

import invalidPackageName.JSON;

/**
 * Configures pool weights. - &#x60;steering_policy&#x3D;\&quot;random\&quot;&#x60;: A random pool is selected with probability proportional to pool weights. - &#x60;steering_policy&#x3D;\&quot;least_outstanding_requests\&quot;&#x60;: Use pool weights to scale each pool&#39;s outstanding requests. - &#x60;steering_policy&#x3D;\&quot;least_connections\&quot;&#x60;: Use pool weights to scale each pool&#39;s open connections.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class LoadBalancingRandomSteering {
  public static final String SERIALIZED_NAME_DEFAULT_WEIGHT = "default_weight";
  @SerializedName(SERIALIZED_NAME_DEFAULT_WEIGHT)
  private BigDecimal defaultWeight = new BigDecimal("1");

  public static final String SERIALIZED_NAME_POOL_WEIGHTS = "pool_weights";
  @SerializedName(SERIALIZED_NAME_POOL_WEIGHTS)
  private Object poolWeights;

  public LoadBalancingRandomSteering() {
  }

  public LoadBalancingRandomSteering defaultWeight(BigDecimal defaultWeight) {
    this.defaultWeight = defaultWeight;
    return this;
  }

   /**
   * The default weight for pools in the load balancer that are not specified in the pool_weights map.
   * minimum: 0
   * maximum: 1
   * @return defaultWeight
  **/
  @javax.annotation.Nullable
  public BigDecimal getDefaultWeight() {
    return defaultWeight;
  }

  public void setDefaultWeight(BigDecimal defaultWeight) {
    this.defaultWeight = defaultWeight;
  }


  public LoadBalancingRandomSteering poolWeights(Object poolWeights) {
    this.poolWeights = poolWeights;
    return this;
  }

   /**
   * A mapping of pool IDs to custom weights. The weight is relative to other pools in the load balancer.
   * @return poolWeights
  **/
  @javax.annotation.Nullable
  public Object getPoolWeights() {
    return poolWeights;
  }

  public void setPoolWeights(Object poolWeights) {
    this.poolWeights = poolWeights;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadBalancingRandomSteering loadBalancingRandomSteering = (LoadBalancingRandomSteering) o;
    return Objects.equals(this.defaultWeight, loadBalancingRandomSteering.defaultWeight) &&
        Objects.equals(this.poolWeights, loadBalancingRandomSteering.poolWeights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultWeight, poolWeights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancingRandomSteering {\n");
    sb.append("    defaultWeight: ").append(toIndentedString(defaultWeight)).append("\n");
    sb.append("    poolWeights: ").append(toIndentedString(poolWeights)).append("\n");
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
    openapiFields.add("default_weight");
    openapiFields.add("pool_weights");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoadBalancingRandomSteering
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoadBalancingRandomSteering.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoadBalancingRandomSteering is not found in the empty JSON string", LoadBalancingRandomSteering.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoadBalancingRandomSteering.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoadBalancingRandomSteering` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoadBalancingRandomSteering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoadBalancingRandomSteering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoadBalancingRandomSteering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoadBalancingRandomSteering.class));

       return (TypeAdapter<T>) new TypeAdapter<LoadBalancingRandomSteering>() {
           @Override
           public void write(JsonWriter out, LoadBalancingRandomSteering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoadBalancingRandomSteering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoadBalancingRandomSteering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoadBalancingRandomSteering
  * @throws IOException if the JSON string is invalid with respect to LoadBalancingRandomSteering
  */
  public static LoadBalancingRandomSteering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoadBalancingRandomSteering.class);
  }

 /**
  * Convert an instance of LoadBalancingRandomSteering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

