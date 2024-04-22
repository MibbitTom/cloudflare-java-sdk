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
 * TeamsDevicesOsVersionInputRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TeamsDevicesOsVersionInputRequest {
  /**
   * Operating System
   */
  @JsonAdapter(OperatingSystemEnum.Adapter.class)
  public enum OperatingSystemEnum {
    WINDOWS("windows");

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

  /**
   * Operator
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    LESS_THAN("<"),
    
    LESS_THAN_OR_EQUAL_TO("<="),
    
    GREATER_THAN(">"),
    
    GREATER_THAN_OR_EQUAL_TO(">="),
    
    u("==");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperatorEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OperatorEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private OperatorEnum operator;

  public static final String SERIALIZED_NAME_OS_DISTRO_NAME = "os_distro_name";
  @SerializedName(SERIALIZED_NAME_OS_DISTRO_NAME)
  private String osDistroName;

  public static final String SERIALIZED_NAME_OS_DISTRO_REVISION = "os_distro_revision";
  @SerializedName(SERIALIZED_NAME_OS_DISTRO_REVISION)
  private String osDistroRevision;

  public static final String SERIALIZED_NAME_OS_VERSION_EXTRA = "os_version_extra";
  @SerializedName(SERIALIZED_NAME_OS_VERSION_EXTRA)
  private String osVersionExtra;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public TeamsDevicesOsVersionInputRequest() {
  }

  public TeamsDevicesOsVersionInputRequest operatingSystem(OperatingSystemEnum operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * Operating System
   * @return operatingSystem
  **/
  @javax.annotation.Nonnull
  public OperatingSystemEnum getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(OperatingSystemEnum operatingSystem) {
    this.operatingSystem = operatingSystem;
  }


  public TeamsDevicesOsVersionInputRequest operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Operator
   * @return operator
  **/
  @javax.annotation.Nonnull
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  public TeamsDevicesOsVersionInputRequest osDistroName(String osDistroName) {
    this.osDistroName = osDistroName;
    return this;
  }

   /**
   * Operating System Distribution Name (linux only)
   * @return osDistroName
  **/
  @javax.annotation.Nullable
  public String getOsDistroName() {
    return osDistroName;
  }

  public void setOsDistroName(String osDistroName) {
    this.osDistroName = osDistroName;
  }


  public TeamsDevicesOsVersionInputRequest osDistroRevision(String osDistroRevision) {
    this.osDistroRevision = osDistroRevision;
    return this;
  }

   /**
   * Version of OS Distribution (linux only)
   * @return osDistroRevision
  **/
  @javax.annotation.Nullable
  public String getOsDistroRevision() {
    return osDistroRevision;
  }

  public void setOsDistroRevision(String osDistroRevision) {
    this.osDistroRevision = osDistroRevision;
  }


  public TeamsDevicesOsVersionInputRequest osVersionExtra(String osVersionExtra) {
    this.osVersionExtra = osVersionExtra;
    return this;
  }

   /**
   * Additional version data. For Mac or iOS, the Product Verison Extra. For Linux, the kernel release version. (Mac, iOS, and Linux only)
   * @return osVersionExtra
  **/
  @javax.annotation.Nullable
  public String getOsVersionExtra() {
    return osVersionExtra;
  }

  public void setOsVersionExtra(String osVersionExtra) {
    this.osVersionExtra = osVersionExtra;
  }


  public TeamsDevicesOsVersionInputRequest version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version of OS
   * @return version
  **/
  @javax.annotation.Nonnull
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamsDevicesOsVersionInputRequest teamsDevicesOsVersionInputRequest = (TeamsDevicesOsVersionInputRequest) o;
    return Objects.equals(this.operatingSystem, teamsDevicesOsVersionInputRequest.operatingSystem) &&
        Objects.equals(this.operator, teamsDevicesOsVersionInputRequest.operator) &&
        Objects.equals(this.osDistroName, teamsDevicesOsVersionInputRequest.osDistroName) &&
        Objects.equals(this.osDistroRevision, teamsDevicesOsVersionInputRequest.osDistroRevision) &&
        Objects.equals(this.osVersionExtra, teamsDevicesOsVersionInputRequest.osVersionExtra) &&
        Objects.equals(this.version, teamsDevicesOsVersionInputRequest.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatingSystem, operator, osDistroName, osDistroRevision, osVersionExtra, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsDevicesOsVersionInputRequest {\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    osDistroName: ").append(toIndentedString(osDistroName)).append("\n");
    sb.append("    osDistroRevision: ").append(toIndentedString(osDistroRevision)).append("\n");
    sb.append("    osVersionExtra: ").append(toIndentedString(osVersionExtra)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("operating_system");
    openapiFields.add("operator");
    openapiFields.add("os_distro_name");
    openapiFields.add("os_distro_revision");
    openapiFields.add("os_version_extra");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operating_system");
    openapiRequiredFields.add("operator");
    openapiRequiredFields.add("version");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TeamsDevicesOsVersionInputRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TeamsDevicesOsVersionInputRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TeamsDevicesOsVersionInputRequest is not found in the empty JSON string", TeamsDevicesOsVersionInputRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TeamsDevicesOsVersionInputRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TeamsDevicesOsVersionInputRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TeamsDevicesOsVersionInputRequest.openapiRequiredFields) {
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
      if (!jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      // validate the required field `operator`
      OperatorEnum.validateJsonElement(jsonObj.get("operator"));
      if ((jsonObj.get("os_distro_name") != null && !jsonObj.get("os_distro_name").isJsonNull()) && !jsonObj.get("os_distro_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os_distro_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os_distro_name").toString()));
      }
      if ((jsonObj.get("os_distro_revision") != null && !jsonObj.get("os_distro_revision").isJsonNull()) && !jsonObj.get("os_distro_revision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os_distro_revision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os_distro_revision").toString()));
      }
      if ((jsonObj.get("os_version_extra") != null && !jsonObj.get("os_version_extra").isJsonNull()) && !jsonObj.get("os_version_extra").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os_version_extra` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os_version_extra").toString()));
      }
      if (!jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TeamsDevicesOsVersionInputRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TeamsDevicesOsVersionInputRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TeamsDevicesOsVersionInputRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TeamsDevicesOsVersionInputRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TeamsDevicesOsVersionInputRequest>() {
           @Override
           public void write(JsonWriter out, TeamsDevicesOsVersionInputRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TeamsDevicesOsVersionInputRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TeamsDevicesOsVersionInputRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TeamsDevicesOsVersionInputRequest
  * @throws IOException if the JSON string is invalid with respect to TeamsDevicesOsVersionInputRequest
  */
  public static TeamsDevicesOsVersionInputRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TeamsDevicesOsVersionInputRequest.class);
  }

 /**
  * Convert an instance of TeamsDevicesOsVersionInputRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

