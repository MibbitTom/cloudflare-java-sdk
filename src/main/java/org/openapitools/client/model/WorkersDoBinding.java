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
 * WorkersDoBinding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class WorkersDoBinding {
  public static final String SERIALIZED_NAME_CLASS_NAME = "class_name";
  @SerializedName(SERIALIZED_NAME_CLASS_NAME)
  private String className;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private String environment;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE_ID = "namespace_id";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_ID)
  private String namespaceId;

  public static final String SERIALIZED_NAME_SCRIPT_NAME = "script_name";
  @SerializedName(SERIALIZED_NAME_SCRIPT_NAME)
  private String scriptName;

  /**
   * The class of resource that the binding provides.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DURABLE_OBJECT_NAMESPACE("durable_object_namespace");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public WorkersDoBinding() {
  }

  public WorkersDoBinding(
     String name, 
     String namespaceId
  ) {
    this();
    this.name = name;
    this.namespaceId = namespaceId;
  }

  public WorkersDoBinding className(String className) {
    this.className = className;
    return this;
  }

   /**
   * The exported class name of the Durable Object
   * @return className
  **/
  @javax.annotation.Nonnull
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }


  public WorkersDoBinding environment(String environment) {
    this.environment = environment;
    return this;
  }

   /**
   * The environment of the script_name to bind to
   * @return environment
  **/
  @javax.annotation.Nullable
  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }


   /**
   * A JavaScript variable name for the binding.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }



   /**
   * Namespace identifier tag.
   * @return namespaceId
  **/
  @javax.annotation.Nullable
  public String getNamespaceId() {
    return namespaceId;
  }



  public WorkersDoBinding scriptName(String scriptName) {
    this.scriptName = scriptName;
    return this;
  }

   /**
   * The script where the Durable Object is defined, if it is external to this Worker
   * @return scriptName
  **/
  @javax.annotation.Nullable
  public String getScriptName() {
    return scriptName;
  }

  public void setScriptName(String scriptName) {
    this.scriptName = scriptName;
  }


  public WorkersDoBinding type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The class of resource that the binding provides.
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkersDoBinding workersDoBinding = (WorkersDoBinding) o;
    return Objects.equals(this.className, workersDoBinding.className) &&
        Objects.equals(this.environment, workersDoBinding.environment) &&
        Objects.equals(this.name, workersDoBinding.name) &&
        Objects.equals(this.namespaceId, workersDoBinding.namespaceId) &&
        Objects.equals(this.scriptName, workersDoBinding.scriptName) &&
        Objects.equals(this.type, workersDoBinding.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, environment, name, namespaceId, scriptName, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkersDoBinding {\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
    sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("class_name");
    openapiFields.add("environment");
    openapiFields.add("name");
    openapiFields.add("namespace_id");
    openapiFields.add("script_name");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("class_name");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WorkersDoBinding
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkersDoBinding.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkersDoBinding is not found in the empty JSON string", WorkersDoBinding.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkersDoBinding.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkersDoBinding` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkersDoBinding.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("class_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class_name").toString()));
      }
      if ((jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) && !jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace_id") != null && !jsonObj.get("namespace_id").isJsonNull()) && !jsonObj.get("namespace_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace_id").toString()));
      }
      if ((jsonObj.get("script_name") != null && !jsonObj.get("script_name").isJsonNull()) && !jsonObj.get("script_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `script_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("script_name").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkersDoBinding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkersDoBinding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkersDoBinding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkersDoBinding.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkersDoBinding>() {
           @Override
           public void write(JsonWriter out, WorkersDoBinding value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkersDoBinding read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkersDoBinding given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkersDoBinding
  * @throws IOException if the JSON string is invalid with respect to WorkersDoBinding
  */
  public static WorkersDoBinding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkersDoBinding.class);
  }

 /**
  * Convert an instance of WorkersDoBinding to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
