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
 * For all L7 requests to this hostname, cloudflared will validate each request&#39;s Cf-Access-Jwt-Assertion request header.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TunnelOriginRequestAccess {
  public static final String SERIALIZED_NAME_AUD_TAG = "audTag";
  @SerializedName(SERIALIZED_NAME_AUD_TAG)
  private List<String> audTag = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required = false;

  public static final String SERIALIZED_NAME_TEAM_NAME = "teamName";
  @SerializedName(SERIALIZED_NAME_TEAM_NAME)
  private String teamName = "Your Zero Trust authentication domain.";

  public TunnelOriginRequestAccess() {
  }

  public TunnelOriginRequestAccess audTag(List<String> audTag) {
    this.audTag = audTag;
    return this;
  }

  public TunnelOriginRequestAccess addAudTagItem(String audTagItem) {
    if (this.audTag == null) {
      this.audTag = new ArrayList<>();
    }
    this.audTag.add(audTagItem);
    return this;
  }

   /**
   * Access applications that are allowed to reach this hostname for this Tunnel. Audience tags can be identified in the dashboard or via the List Access policies API.
   * @return audTag
  **/
  @javax.annotation.Nonnull
  public List<String> getAudTag() {
    return audTag;
  }

  public void setAudTag(List<String> audTag) {
    this.audTag = audTag;
  }


  public TunnelOriginRequestAccess required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Deny traffic that has not fulfilled Access authorization.
   * @return required
  **/
  @javax.annotation.Nullable
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }


  public TunnelOriginRequestAccess teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

   /**
   * Get teamName
   * @return teamName
  **/
  @javax.annotation.Nonnull
  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TunnelOriginRequestAccess tunnelOriginRequestAccess = (TunnelOriginRequestAccess) o;
    return Objects.equals(this.audTag, tunnelOriginRequestAccess.audTag) &&
        Objects.equals(this.required, tunnelOriginRequestAccess.required) &&
        Objects.equals(this.teamName, tunnelOriginRequestAccess.teamName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audTag, required, teamName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TunnelOriginRequestAccess {\n");
    sb.append("    audTag: ").append(toIndentedString(audTag)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
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
    openapiFields.add("audTag");
    openapiFields.add("required");
    openapiFields.add("teamName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("audTag");
    openapiRequiredFields.add("teamName");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TunnelOriginRequestAccess
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TunnelOriginRequestAccess.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TunnelOriginRequestAccess is not found in the empty JSON string", TunnelOriginRequestAccess.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TunnelOriginRequestAccess.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TunnelOriginRequestAccess` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TunnelOriginRequestAccess.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("audTag") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("audTag").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `audTag` to be an array in the JSON string but got `%s`", jsonObj.get("audTag").toString()));
      }
      if (!jsonObj.get("teamName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `teamName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("teamName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TunnelOriginRequestAccess.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TunnelOriginRequestAccess' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TunnelOriginRequestAccess> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TunnelOriginRequestAccess.class));

       return (TypeAdapter<T>) new TypeAdapter<TunnelOriginRequestAccess>() {
           @Override
           public void write(JsonWriter out, TunnelOriginRequestAccess value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TunnelOriginRequestAccess read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TunnelOriginRequestAccess given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TunnelOriginRequestAccess
  * @throws IOException if the JSON string is invalid with respect to TunnelOriginRequestAccess
  */
  public static TunnelOriginRequestAccess fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TunnelOriginRequestAccess.class);
  }

 /**
  * Convert an instance of TunnelOriginRequestAccess to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

