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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.WorkersScriptResponse;

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
 * Details about a worker uploaded to a Workers for Platforms namespace.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class WorkersNamespaceScriptResponse {
  public static final String SERIALIZED_NAME_CREATED_ON = "created_on";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_DISPATCH_NAMESPACE = "dispatch_namespace";
  @SerializedName(SERIALIZED_NAME_DISPATCH_NAMESPACE)
  private String dispatchNamespace;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modified_on";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private WorkersScriptResponse script;

  public WorkersNamespaceScriptResponse() {
  }

  public WorkersNamespaceScriptResponse(
     OffsetDateTime createdOn, 
     OffsetDateTime modifiedOn
  ) {
    this();
    this.createdOn = createdOn;
    this.modifiedOn = modifiedOn;
  }

   /**
   * When the script was created.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  public WorkersNamespaceScriptResponse dispatchNamespace(String dispatchNamespace) {
    this.dispatchNamespace = dispatchNamespace;
    return this;
  }

   /**
   * Name of the Workers for Platforms dispatch namespace.
   * @return dispatchNamespace
  **/
  @javax.annotation.Nullable
  public String getDispatchNamespace() {
    return dispatchNamespace;
  }

  public void setDispatchNamespace(String dispatchNamespace) {
    this.dispatchNamespace = dispatchNamespace;
  }


   /**
   * When the script was last modified.
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }



  public WorkersNamespaceScriptResponse script(WorkersScriptResponse script) {
    this.script = script;
    return this;
  }

   /**
   * Get script
   * @return script
  **/
  @javax.annotation.Nullable
  public WorkersScriptResponse getScript() {
    return script;
  }

  public void setScript(WorkersScriptResponse script) {
    this.script = script;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkersNamespaceScriptResponse workersNamespaceScriptResponse = (WorkersNamespaceScriptResponse) o;
    return Objects.equals(this.createdOn, workersNamespaceScriptResponse.createdOn) &&
        Objects.equals(this.dispatchNamespace, workersNamespaceScriptResponse.dispatchNamespace) &&
        Objects.equals(this.modifiedOn, workersNamespaceScriptResponse.modifiedOn) &&
        Objects.equals(this.script, workersNamespaceScriptResponse.script);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, dispatchNamespace, modifiedOn, script);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkersNamespaceScriptResponse {\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    dispatchNamespace: ").append(toIndentedString(dispatchNamespace)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
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
    openapiFields.add("created_on");
    openapiFields.add("dispatch_namespace");
    openapiFields.add("modified_on");
    openapiFields.add("script");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WorkersNamespaceScriptResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkersNamespaceScriptResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkersNamespaceScriptResponse is not found in the empty JSON string", WorkersNamespaceScriptResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkersNamespaceScriptResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkersNamespaceScriptResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dispatch_namespace") != null && !jsonObj.get("dispatch_namespace").isJsonNull()) && !jsonObj.get("dispatch_namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dispatch_namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dispatch_namespace").toString()));
      }
      // validate the optional field `script`
      if (jsonObj.get("script") != null && !jsonObj.get("script").isJsonNull()) {
        WorkersScriptResponse.validateJsonElement(jsonObj.get("script"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkersNamespaceScriptResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkersNamespaceScriptResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkersNamespaceScriptResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkersNamespaceScriptResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkersNamespaceScriptResponse>() {
           @Override
           public void write(JsonWriter out, WorkersNamespaceScriptResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkersNamespaceScriptResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkersNamespaceScriptResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkersNamespaceScriptResponse
  * @throws IOException if the JSON string is invalid with respect to WorkersNamespaceScriptResponse
  */
  public static WorkersNamespaceScriptResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkersNamespaceScriptResponse.class);
  }

 /**
  * Convert an instance of WorkersNamespaceScriptResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

