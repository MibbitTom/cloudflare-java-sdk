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
import org.openapitools.client.model.WorkersDeploymentsBaseAnnotations;

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
 * WorkersDeploymentsBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class WorkersDeploymentsBase {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private WorkersDeploymentsBaseAnnotations annotations;

  public static final String SERIALIZED_NAME_AUTHOR_EMAIL = "author_email";
  @SerializedName(SERIALIZED_NAME_AUTHOR_EMAIL)
  private String authorEmail;

  public static final String SERIALIZED_NAME_CREATED_ON = "created_on";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private String createdOn;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private String strategy;

  public WorkersDeploymentsBase() {
  }

  public WorkersDeploymentsBase(
     String authorEmail, 
     String createdOn, 
     String id, 
     String source
  ) {
    this();
    this.authorEmail = authorEmail;
    this.createdOn = createdOn;
    this.id = id;
    this.source = source;
  }

  public WorkersDeploymentsBase annotations(WorkersDeploymentsBaseAnnotations annotations) {
    this.annotations = annotations;
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @javax.annotation.Nullable
  public WorkersDeploymentsBaseAnnotations getAnnotations() {
    return annotations;
  }

  public void setAnnotations(WorkersDeploymentsBaseAnnotations annotations) {
    this.annotations = annotations;
  }


   /**
   * Get authorEmail
   * @return authorEmail
  **/
  @javax.annotation.Nullable
  public String getAuthorEmail() {
    return authorEmail;
  }



   /**
   * Get createdOn
   * @return createdOn
  **/
  @javax.annotation.Nullable
  public String getCreatedOn() {
    return createdOn;
  }



   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }



  public WorkersDeploymentsBase strategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @javax.annotation.Nullable
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkersDeploymentsBase workersDeploymentsBase = (WorkersDeploymentsBase) o;
    return Objects.equals(this.annotations, workersDeploymentsBase.annotations) &&
        Objects.equals(this.authorEmail, workersDeploymentsBase.authorEmail) &&
        Objects.equals(this.createdOn, workersDeploymentsBase.createdOn) &&
        Objects.equals(this.id, workersDeploymentsBase.id) &&
        Objects.equals(this.source, workersDeploymentsBase.source) &&
        Objects.equals(this.strategy, workersDeploymentsBase.strategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, authorEmail, createdOn, id, source, strategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkersDeploymentsBase {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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
    openapiFields.add("annotations");
    openapiFields.add("author_email");
    openapiFields.add("created_on");
    openapiFields.add("id");
    openapiFields.add("source");
    openapiFields.add("strategy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WorkersDeploymentsBase
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkersDeploymentsBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkersDeploymentsBase is not found in the empty JSON string", WorkersDeploymentsBase.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkersDeploymentsBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkersDeploymentsBase` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `annotations`
      if (jsonObj.get("annotations") != null && !jsonObj.get("annotations").isJsonNull()) {
        WorkersDeploymentsBaseAnnotations.validateJsonElement(jsonObj.get("annotations"));
      }
      if ((jsonObj.get("author_email") != null && !jsonObj.get("author_email").isJsonNull()) && !jsonObj.get("author_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author_email").toString()));
      }
      if ((jsonObj.get("created_on") != null && !jsonObj.get("created_on").isJsonNull()) && !jsonObj.get("created_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_on").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("strategy") != null && !jsonObj.get("strategy").isJsonNull()) && !jsonObj.get("strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("strategy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkersDeploymentsBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkersDeploymentsBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkersDeploymentsBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkersDeploymentsBase.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkersDeploymentsBase>() {
           @Override
           public void write(JsonWriter out, WorkersDeploymentsBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkersDeploymentsBase read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkersDeploymentsBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkersDeploymentsBase
  * @throws IOException if the JSON string is invalid with respect to WorkersDeploymentsBase
  */
  public static WorkersDeploymentsBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkersDeploymentsBase.class);
  }

 /**
  * Convert an instance of WorkersDeploymentsBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

