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
 * Configure how session check behaves.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZeroTrustGatewayRuleSettingsCheckSession {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_ENFORCE = "enforce";
  @SerializedName(SERIALIZED_NAME_ENFORCE)
  private Boolean enforce;

  public ZeroTrustGatewayRuleSettingsCheckSession() {
  }

  public ZeroTrustGatewayRuleSettingsCheckSession duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Configure how fresh the session needs to be to be considered valid.
   * @return duration
  **/
  @javax.annotation.Nullable
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }


  public ZeroTrustGatewayRuleSettingsCheckSession enforce(Boolean enforce) {
    this.enforce = enforce;
    return this;
  }

   /**
   * Set to true to enable session enforcement.
   * @return enforce
  **/
  @javax.annotation.Nullable
  public Boolean getEnforce() {
    return enforce;
  }

  public void setEnforce(Boolean enforce) {
    this.enforce = enforce;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZeroTrustGatewayRuleSettingsCheckSession zeroTrustGatewayRuleSettingsCheckSession = (ZeroTrustGatewayRuleSettingsCheckSession) o;
    return Objects.equals(this.duration, zeroTrustGatewayRuleSettingsCheckSession.duration) &&
        Objects.equals(this.enforce, zeroTrustGatewayRuleSettingsCheckSession.enforce);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, enforce);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZeroTrustGatewayRuleSettingsCheckSession {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    enforce: ").append(toIndentedString(enforce)).append("\n");
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
    openapiFields.add("duration");
    openapiFields.add("enforce");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZeroTrustGatewayRuleSettingsCheckSession
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZeroTrustGatewayRuleSettingsCheckSession.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZeroTrustGatewayRuleSettingsCheckSession is not found in the empty JSON string", ZeroTrustGatewayRuleSettingsCheckSession.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZeroTrustGatewayRuleSettingsCheckSession.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZeroTrustGatewayRuleSettingsCheckSession` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) && !jsonObj.get("duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZeroTrustGatewayRuleSettingsCheckSession.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZeroTrustGatewayRuleSettingsCheckSession' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZeroTrustGatewayRuleSettingsCheckSession> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZeroTrustGatewayRuleSettingsCheckSession.class));

       return (TypeAdapter<T>) new TypeAdapter<ZeroTrustGatewayRuleSettingsCheckSession>() {
           @Override
           public void write(JsonWriter out, ZeroTrustGatewayRuleSettingsCheckSession value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZeroTrustGatewayRuleSettingsCheckSession read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZeroTrustGatewayRuleSettingsCheckSession given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZeroTrustGatewayRuleSettingsCheckSession
  * @throws IOException if the JSON string is invalid with respect to ZeroTrustGatewayRuleSettingsCheckSession
  */
  public static ZeroTrustGatewayRuleSettingsCheckSession fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZeroTrustGatewayRuleSettingsCheckSession.class);
  }

 /**
  * Convert an instance of ZeroTrustGatewayRuleSettingsCheckSession to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

