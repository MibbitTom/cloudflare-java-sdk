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
import org.openapitools.client.model.MagicRouteUpdateSingleRequest;

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
 * MagicRouteUpdateManyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class MagicRouteUpdateManyRequest {
  public static final String SERIALIZED_NAME_ROUTES = "routes";
  @SerializedName(SERIALIZED_NAME_ROUTES)
  private List<MagicRouteUpdateSingleRequest> routes = new ArrayList<>();

  public MagicRouteUpdateManyRequest() {
  }

  public MagicRouteUpdateManyRequest routes(List<MagicRouteUpdateSingleRequest> routes) {
    this.routes = routes;
    return this;
  }

  public MagicRouteUpdateManyRequest addRoutesItem(MagicRouteUpdateSingleRequest routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<>();
    }
    this.routes.add(routesItem);
    return this;
  }

   /**
   * Get routes
   * @return routes
  **/
  @javax.annotation.Nonnull
  public List<MagicRouteUpdateSingleRequest> getRoutes() {
    return routes;
  }

  public void setRoutes(List<MagicRouteUpdateSingleRequest> routes) {
    this.routes = routes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagicRouteUpdateManyRequest magicRouteUpdateManyRequest = (MagicRouteUpdateManyRequest) o;
    return Objects.equals(this.routes, magicRouteUpdateManyRequest.routes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicRouteUpdateManyRequest {\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
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
    openapiFields.add("routes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("routes");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MagicRouteUpdateManyRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MagicRouteUpdateManyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MagicRouteUpdateManyRequest is not found in the empty JSON string", MagicRouteUpdateManyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MagicRouteUpdateManyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MagicRouteUpdateManyRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MagicRouteUpdateManyRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("routes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `routes` to be an array in the JSON string but got `%s`", jsonObj.get("routes").toString()));
      }

      JsonArray jsonArrayroutes = jsonObj.getAsJsonArray("routes");
      // validate the required field `routes` (array)
      for (int i = 0; i < jsonArrayroutes.size(); i++) {
        MagicRouteUpdateSingleRequest.validateJsonElement(jsonArrayroutes.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MagicRouteUpdateManyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MagicRouteUpdateManyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MagicRouteUpdateManyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MagicRouteUpdateManyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<MagicRouteUpdateManyRequest>() {
           @Override
           public void write(JsonWriter out, MagicRouteUpdateManyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MagicRouteUpdateManyRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MagicRouteUpdateManyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MagicRouteUpdateManyRequest
  * @throws IOException if the JSON string is invalid with respect to MagicRouteUpdateManyRequest
  */
  public static MagicRouteUpdateManyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MagicRouteUpdateManyRequest.class);
  }

 /**
  * Convert an instance of MagicRouteUpdateManyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

