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
import cloudflare.sdk.models.Origin;
import cloudflare.sdk.models.SNI;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import cloudflare.JSON;

/**
 * OriginRuleActionParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class OriginRuleActionParameters {
  public static final String SERIALIZED_NAME_HOST_HEADER = "host_header";
  @SerializedName(SERIALIZED_NAME_HOST_HEADER)
  private String hostHeader;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private Origin origin;

  public static final String SERIALIZED_NAME_SNI = "sni";
  @SerializedName(SERIALIZED_NAME_SNI)
  private SNI sni;

  public OriginRuleActionParameters() {
  }

  public OriginRuleActionParameters hostHeader(String hostHeader) {
    this.hostHeader = hostHeader;
    return this;
  }

   /**
   * Rewrite the HTTP Host header.
   * @return hostHeader
  **/
  @javax.annotation.Nullable
  public String getHostHeader() {
    return hostHeader;
  }

  public void setHostHeader(String hostHeader) {
    this.hostHeader = hostHeader;
  }


  public OriginRuleActionParameters origin(Origin origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @javax.annotation.Nullable
  public Origin getOrigin() {
    return origin;
  }

  public void setOrigin(Origin origin) {
    this.origin = origin;
  }


  public OriginRuleActionParameters sni(SNI sni) {
    this.sni = sni;
    return this;
  }

   /**
   * Get sni
   * @return sni
  **/
  @javax.annotation.Nullable
  public SNI getSni() {
    return sni;
  }

  public void setSni(SNI sni) {
    this.sni = sni;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginRuleActionParameters originRuleActionParameters = (OriginRuleActionParameters) o;
    return Objects.equals(this.hostHeader, originRuleActionParameters.hostHeader) &&
        Objects.equals(this.origin, originRuleActionParameters.origin) &&
        Objects.equals(this.sni, originRuleActionParameters.sni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostHeader, origin, sni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginRuleActionParameters {\n");
    sb.append("    hostHeader: ").append(toIndentedString(hostHeader)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    sni: ").append(toIndentedString(sni)).append("\n");
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
    openapiFields.add("host_header");
    openapiFields.add("origin");
    openapiFields.add("sni");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OriginRuleActionParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OriginRuleActionParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OriginRuleActionParameters is not found in the empty JSON string", OriginRuleActionParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OriginRuleActionParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OriginRuleActionParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("host_header") != null && !jsonObj.get("host_header").isJsonNull()) && !jsonObj.get("host_header").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host_header` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host_header").toString()));
      }
      // validate the optional field `origin`
      if (jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) {
        Origin.validateJsonElement(jsonObj.get("origin"));
      }
      // validate the optional field `sni`
      if (jsonObj.get("sni") != null && !jsonObj.get("sni").isJsonNull()) {
        SNI.validateJsonElement(jsonObj.get("sni"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OriginRuleActionParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OriginRuleActionParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OriginRuleActionParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OriginRuleActionParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<OriginRuleActionParameters>() {
           @Override
           public void write(JsonWriter out, OriginRuleActionParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OriginRuleActionParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OriginRuleActionParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OriginRuleActionParameters
  * @throws IOException if the JSON string is invalid with respect to OriginRuleActionParameters
  */
  public static OriginRuleActionParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OriginRuleActionParameters.class);
  }

 /**
  * Convert an instance of OriginRuleActionParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

