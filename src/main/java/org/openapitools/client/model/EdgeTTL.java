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
import org.openapitools.client.model.StatusCodeTTL;

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
 * TTL (Time to Live) specifies the maximum time to cache a resource in the Cloudflare edge network.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class EdgeTTL {
  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Integer _default;

  /**
   * edge ttl options
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    RESPECT_ORIGIN("respect_origin"),
    
    BYPASS_BY_DEFAULT("bypass_by_default"),
    
    OVERRIDE_ORIGIN("override_origin");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ModeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ModeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private ModeEnum mode;

  public static final String SERIALIZED_NAME_STATUS_CODE_TTL = "status_code_ttl";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE_TTL)
  private List<StatusCodeTTL> statusCodeTtl = new ArrayList<>();

  public EdgeTTL() {
  }

  public EdgeTTL _default(Integer _default) {
    this._default = _default;
    return this;
  }

   /**
   * The TTL (in seconds) if you choose override_origin mode.
   * minimum: 1
   * maximum: -9223372036854775616
   * @return _default
  **/
  @javax.annotation.Nonnull
  public Integer getDefault() {
    return _default;
  }

  public void setDefault(Integer _default) {
    this._default = _default;
  }


  public EdgeTTL mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * edge ttl options
   * @return mode
  **/
  @javax.annotation.Nonnull
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  public EdgeTTL statusCodeTtl(List<StatusCodeTTL> statusCodeTtl) {
    this.statusCodeTtl = statusCodeTtl;
    return this;
  }

  public EdgeTTL addStatusCodeTtlItem(StatusCodeTTL statusCodeTtlItem) {
    if (this.statusCodeTtl == null) {
      this.statusCodeTtl = new ArrayList<>();
    }
    this.statusCodeTtl.add(statusCodeTtlItem);
    return this;
  }

   /**
   * List of single status codes, or status code ranges to apply the selected mode
   * @return statusCodeTtl
  **/
  @javax.annotation.Nonnull
  public List<StatusCodeTTL> getStatusCodeTtl() {
    return statusCodeTtl;
  }

  public void setStatusCodeTtl(List<StatusCodeTTL> statusCodeTtl) {
    this.statusCodeTtl = statusCodeTtl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeTTL edgeTTL = (EdgeTTL) o;
    return Objects.equals(this._default, edgeTTL._default) &&
        Objects.equals(this.mode, edgeTTL.mode) &&
        Objects.equals(this.statusCodeTtl, edgeTTL.statusCodeTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, mode, statusCodeTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeTTL {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    statusCodeTtl: ").append(toIndentedString(statusCodeTtl)).append("\n");
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
    openapiFields.add("default");
    openapiFields.add("mode");
    openapiFields.add("status_code_ttl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("default");
    openapiRequiredFields.add("mode");
    openapiRequiredFields.add("status_code_ttl");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EdgeTTL
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EdgeTTL.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EdgeTTL is not found in the empty JSON string", EdgeTTL.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EdgeTTL.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EdgeTTL` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EdgeTTL.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mode").toString()));
      }
      // validate the required field `mode`
      ModeEnum.validateJsonElement(jsonObj.get("mode"));
      // ensure the json data is an array
      if (!jsonObj.get("status_code_ttl").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_code_ttl` to be an array in the JSON string but got `%s`", jsonObj.get("status_code_ttl").toString()));
      }

      JsonArray jsonArraystatusCodeTtl = jsonObj.getAsJsonArray("status_code_ttl");
      // validate the required field `status_code_ttl` (array)
      for (int i = 0; i < jsonArraystatusCodeTtl.size(); i++) {
        StatusCodeTTL.validateJsonElement(jsonArraystatusCodeTtl.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EdgeTTL.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EdgeTTL' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EdgeTTL> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EdgeTTL.class));

       return (TypeAdapter<T>) new TypeAdapter<EdgeTTL>() {
           @Override
           public void write(JsonWriter out, EdgeTTL value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EdgeTTL read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EdgeTTL given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EdgeTTL
  * @throws IOException if the JSON string is invalid with respect to EdgeTTL
  */
  public static EdgeTTL fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EdgeTTL.class);
  }

 /**
  * Convert an instance of EdgeTTL to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
