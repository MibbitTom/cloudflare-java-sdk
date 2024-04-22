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
import org.openapitools.client.model.MagicTransitOptions;

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
 * DiagnosticsTracerouteRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DiagnosticsTracerouteRequest {
  public static final String SERIALIZED_NAME_COLOS = "colos";
  @SerializedName(SERIALIZED_NAME_COLOS)
  private List<String> colos = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private MagicTransitOptions options;

  public static final String SERIALIZED_NAME_TARGETS = "targets";
  @SerializedName(SERIALIZED_NAME_TARGETS)
  private List<String> targets = new ArrayList<>();

  public DiagnosticsTracerouteRequest() {
  }

  public DiagnosticsTracerouteRequest colos(List<String> colos) {
    this.colos = colos;
    return this;
  }

  public DiagnosticsTracerouteRequest addColosItem(String colosItem) {
    if (this.colos == null) {
      this.colos = new ArrayList<>();
    }
    this.colos.add(colosItem);
    return this;
  }

   /**
   * If no source colo names specified, all colos will be used. China colos are unavailable for traceroutes.
   * @return colos
  **/
  @javax.annotation.Nullable
  public List<String> getColos() {
    return colos;
  }

  public void setColos(List<String> colos) {
    this.colos = colos;
  }


  public DiagnosticsTracerouteRequest options(MagicTransitOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  public MagicTransitOptions getOptions() {
    return options;
  }

  public void setOptions(MagicTransitOptions options) {
    this.options = options;
  }


  public DiagnosticsTracerouteRequest targets(List<String> targets) {
    this.targets = targets;
    return this;
  }

  public DiagnosticsTracerouteRequest addTargetsItem(String targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * Get targets
   * @return targets
  **/
  @javax.annotation.Nonnull
  public List<String> getTargets() {
    return targets;
  }

  public void setTargets(List<String> targets) {
    this.targets = targets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosticsTracerouteRequest diagnosticsTracerouteRequest = (DiagnosticsTracerouteRequest) o;
    return Objects.equals(this.colos, diagnosticsTracerouteRequest.colos) &&
        Objects.equals(this.options, diagnosticsTracerouteRequest.options) &&
        Objects.equals(this.targets, diagnosticsTracerouteRequest.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colos, options, targets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticsTracerouteRequest {\n");
    sb.append("    colos: ").append(toIndentedString(colos)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
    openapiFields.add("colos");
    openapiFields.add("options");
    openapiFields.add("targets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("targets");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DiagnosticsTracerouteRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DiagnosticsTracerouteRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DiagnosticsTracerouteRequest is not found in the empty JSON string", DiagnosticsTracerouteRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DiagnosticsTracerouteRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DiagnosticsTracerouteRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DiagnosticsTracerouteRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("colos") != null && !jsonObj.get("colos").isJsonNull() && !jsonObj.get("colos").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `colos` to be an array in the JSON string but got `%s`", jsonObj.get("colos").toString()));
      }
      // validate the optional field `options`
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        MagicTransitOptions.validateJsonElement(jsonObj.get("options"));
      }
      // ensure the required json array is present
      if (jsonObj.get("targets") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("targets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `targets` to be an array in the JSON string but got `%s`", jsonObj.get("targets").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiagnosticsTracerouteRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiagnosticsTracerouteRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiagnosticsTracerouteRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiagnosticsTracerouteRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DiagnosticsTracerouteRequest>() {
           @Override
           public void write(JsonWriter out, DiagnosticsTracerouteRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiagnosticsTracerouteRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DiagnosticsTracerouteRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiagnosticsTracerouteRequest
  * @throws IOException if the JSON string is invalid with respect to DiagnosticsTracerouteRequest
  */
  public static DiagnosticsTracerouteRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiagnosticsTracerouteRequest.class);
  }

 /**
  * Convert an instance of DiagnosticsTracerouteRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

