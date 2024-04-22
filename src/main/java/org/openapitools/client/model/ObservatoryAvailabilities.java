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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.ObservatoryAvailabilitiesQuota;
import org.openapitools.client.model.ObservatoryLabeledRegion;

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
 * ObservatoryAvailabilities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ObservatoryAvailabilities {
  public static final String SERIALIZED_NAME_QUOTA = "quota";
  @SerializedName(SERIALIZED_NAME_QUOTA)
  private ObservatoryAvailabilitiesQuota quota;

  public static final String SERIALIZED_NAME_REGIONS = "regions";
  @SerializedName(SERIALIZED_NAME_REGIONS)
  private List<ObservatoryLabeledRegion> regions = new ArrayList<>();

  public static final String SERIALIZED_NAME_REGIONS_PER_PLAN = "regionsPerPlan";
  @SerializedName(SERIALIZED_NAME_REGIONS_PER_PLAN)
  private Map<String, List<ObservatoryLabeledRegion>> regionsPerPlan = new HashMap<>();

  public ObservatoryAvailabilities() {
  }

  public ObservatoryAvailabilities quota(ObservatoryAvailabilitiesQuota quota) {
    this.quota = quota;
    return this;
  }

   /**
   * Get quota
   * @return quota
  **/
  @javax.annotation.Nullable
  public ObservatoryAvailabilitiesQuota getQuota() {
    return quota;
  }

  public void setQuota(ObservatoryAvailabilitiesQuota quota) {
    this.quota = quota;
  }


  public ObservatoryAvailabilities regions(List<ObservatoryLabeledRegion> regions) {
    this.regions = regions;
    return this;
  }

  public ObservatoryAvailabilities addRegionsItem(ObservatoryLabeledRegion regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @javax.annotation.Nullable
  public List<ObservatoryLabeledRegion> getRegions() {
    return regions;
  }

  public void setRegions(List<ObservatoryLabeledRegion> regions) {
    this.regions = regions;
  }


  public ObservatoryAvailabilities regionsPerPlan(Map<String, List<ObservatoryLabeledRegion>> regionsPerPlan) {
    this.regionsPerPlan = regionsPerPlan;
    return this;
  }

  public ObservatoryAvailabilities putRegionsPerPlanItem(String key, List<ObservatoryLabeledRegion> regionsPerPlanItem) {
    if (this.regionsPerPlan == null) {
      this.regionsPerPlan = new HashMap<>();
    }
    this.regionsPerPlan.put(key, regionsPerPlanItem);
    return this;
  }

   /**
   * Get regionsPerPlan
   * @return regionsPerPlan
  **/
  @javax.annotation.Nullable
  public Map<String, List<ObservatoryLabeledRegion>> getRegionsPerPlan() {
    return regionsPerPlan;
  }

  public void setRegionsPerPlan(Map<String, List<ObservatoryLabeledRegion>> regionsPerPlan) {
    this.regionsPerPlan = regionsPerPlan;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservatoryAvailabilities observatoryAvailabilities = (ObservatoryAvailabilities) o;
    return Objects.equals(this.quota, observatoryAvailabilities.quota) &&
        Objects.equals(this.regions, observatoryAvailabilities.regions) &&
        Objects.equals(this.regionsPerPlan, observatoryAvailabilities.regionsPerPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quota, regions, regionsPerPlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservatoryAvailabilities {\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    regionsPerPlan: ").append(toIndentedString(regionsPerPlan)).append("\n");
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
    openapiFields.add("quota");
    openapiFields.add("regions");
    openapiFields.add("regionsPerPlan");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ObservatoryAvailabilities
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ObservatoryAvailabilities.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ObservatoryAvailabilities is not found in the empty JSON string", ObservatoryAvailabilities.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ObservatoryAvailabilities.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ObservatoryAvailabilities` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `quota`
      if (jsonObj.get("quota") != null && !jsonObj.get("quota").isJsonNull()) {
        ObservatoryAvailabilitiesQuota.validateJsonElement(jsonObj.get("quota"));
      }
      if (jsonObj.get("regions") != null && !jsonObj.get("regions").isJsonNull()) {
        JsonArray jsonArrayregions = jsonObj.getAsJsonArray("regions");
        if (jsonArrayregions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("regions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `regions` to be an array in the JSON string but got `%s`", jsonObj.get("regions").toString()));
          }

          // validate the optional field `regions` (array)
          for (int i = 0; i < jsonArrayregions.size(); i++) {
            ObservatoryLabeledRegion.validateJsonElement(jsonArrayregions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ObservatoryAvailabilities.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ObservatoryAvailabilities' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ObservatoryAvailabilities> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ObservatoryAvailabilities.class));

       return (TypeAdapter<T>) new TypeAdapter<ObservatoryAvailabilities>() {
           @Override
           public void write(JsonWriter out, ObservatoryAvailabilities value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ObservatoryAvailabilities read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ObservatoryAvailabilities given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ObservatoryAvailabilities
  * @throws IOException if the JSON string is invalid with respect to ObservatoryAvailabilities
  */
  public static ObservatoryAvailabilities fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ObservatoryAvailabilities.class);
  }

 /**
  * Convert an instance of ObservatoryAvailabilities to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

