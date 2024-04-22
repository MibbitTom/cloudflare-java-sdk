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
 * TeamsDevicesFileInputRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TeamsDevicesFileInputRequest {
  public static final String SERIALIZED_NAME_EXISTS = "exists";
  @SerializedName(SERIALIZED_NAME_EXISTS)
  private Boolean exists;

  /**
   * Operating system
   */
  @JsonAdapter(OperatingSystemEnum.Adapter.class)
  public enum OperatingSystemEnum {
    WINDOWS("windows"),
    
    LINUX("linux"),
    
    MAC("mac");

    private String value;

    OperatingSystemEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatingSystemEnum fromValue(String value) {
      for (OperatingSystemEnum b : OperatingSystemEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperatingSystemEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatingSystemEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatingSystemEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperatingSystemEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OperatingSystemEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OPERATING_SYSTEM = "operating_system";
  @SerializedName(SERIALIZED_NAME_OPERATING_SYSTEM)
  private OperatingSystemEnum operatingSystem;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_SHA256 = "sha256";
  @SerializedName(SERIALIZED_NAME_SHA256)
  private String sha256;

  public static final String SERIALIZED_NAME_THUMBPRINT = "thumbprint";
  @SerializedName(SERIALIZED_NAME_THUMBPRINT)
  private String thumbprint;

  public TeamsDevicesFileInputRequest() {
  }

  public TeamsDevicesFileInputRequest exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

   /**
   * Whether or not file exists
   * @return exists
  **/
  @javax.annotation.Nullable
  public Boolean getExists() {
    return exists;
  }

  public void setExists(Boolean exists) {
    this.exists = exists;
  }


  public TeamsDevicesFileInputRequest operatingSystem(OperatingSystemEnum operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * Operating system
   * @return operatingSystem
  **/
  @javax.annotation.Nonnull
  public OperatingSystemEnum getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(OperatingSystemEnum operatingSystem) {
    this.operatingSystem = operatingSystem;
  }


  public TeamsDevicesFileInputRequest path(String path) {
    this.path = path;
    return this;
  }

   /**
   * File path.
   * @return path
  **/
  @javax.annotation.Nonnull
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public TeamsDevicesFileInputRequest sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }

   /**
   * SHA-256.
   * @return sha256
  **/
  @javax.annotation.Nullable
  public String getSha256() {
    return sha256;
  }

  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }


  public TeamsDevicesFileInputRequest thumbprint(String thumbprint) {
    this.thumbprint = thumbprint;
    return this;
  }

   /**
   * Signing certificate thumbprint.
   * @return thumbprint
  **/
  @javax.annotation.Nullable
  public String getThumbprint() {
    return thumbprint;
  }

  public void setThumbprint(String thumbprint) {
    this.thumbprint = thumbprint;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamsDevicesFileInputRequest teamsDevicesFileInputRequest = (TeamsDevicesFileInputRequest) o;
    return Objects.equals(this.exists, teamsDevicesFileInputRequest.exists) &&
        Objects.equals(this.operatingSystem, teamsDevicesFileInputRequest.operatingSystem) &&
        Objects.equals(this.path, teamsDevicesFileInputRequest.path) &&
        Objects.equals(this.sha256, teamsDevicesFileInputRequest.sha256) &&
        Objects.equals(this.thumbprint, teamsDevicesFileInputRequest.thumbprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exists, operatingSystem, path, sha256, thumbprint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsDevicesFileInputRequest {\n");
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    thumbprint: ").append(toIndentedString(thumbprint)).append("\n");
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
    openapiFields.add("exists");
    openapiFields.add("operating_system");
    openapiFields.add("path");
    openapiFields.add("sha256");
    openapiFields.add("thumbprint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operating_system");
    openapiRequiredFields.add("path");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TeamsDevicesFileInputRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TeamsDevicesFileInputRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TeamsDevicesFileInputRequest is not found in the empty JSON string", TeamsDevicesFileInputRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TeamsDevicesFileInputRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TeamsDevicesFileInputRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TeamsDevicesFileInputRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("operating_system").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operating_system` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operating_system").toString()));
      }
      // validate the required field `operating_system`
      OperatingSystemEnum.validateJsonElement(jsonObj.get("operating_system"));
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("sha256") != null && !jsonObj.get("sha256").isJsonNull()) && !jsonObj.get("sha256").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha256` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha256").toString()));
      }
      if ((jsonObj.get("thumbprint") != null && !jsonObj.get("thumbprint").isJsonNull()) && !jsonObj.get("thumbprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbprint").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TeamsDevicesFileInputRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TeamsDevicesFileInputRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TeamsDevicesFileInputRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TeamsDevicesFileInputRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TeamsDevicesFileInputRequest>() {
           @Override
           public void write(JsonWriter out, TeamsDevicesFileInputRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TeamsDevicesFileInputRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TeamsDevicesFileInputRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TeamsDevicesFileInputRequest
  * @throws IOException if the JSON string is invalid with respect to TeamsDevicesFileInputRequest
  */
  public static TeamsDevicesFileInputRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TeamsDevicesFileInputRequest.class);
  }

 /**
  * Convert an instance of TeamsDevicesFileInputRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

