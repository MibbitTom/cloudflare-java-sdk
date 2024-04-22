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
import org.openapitools.client.model.WorkersDeploymentsBaseAnnotations;
import org.openapitools.client.model.WorkersDeploymentsStrategyPercentageVersionsInner;

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
 * WorkersSchemasDeploymentsListResponseAllOfResultDeployments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class WorkersSchemasDeploymentsListResponseAllOfResultDeployments {
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

  /**
   * Gets or Sets strategy
   */
  @JsonAdapter(StrategyEnum.Adapter.class)
  public enum StrategyEnum {
    PERCENTAGE("percentage");

    private String value;

    StrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StrategyEnum fromValue(String value) {
      for (StrategyEnum b : StrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StrategyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StrategyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private StrategyEnum strategy;

  public static final String SERIALIZED_NAME_VERSIONS = "versions";
  @SerializedName(SERIALIZED_NAME_VERSIONS)
  private List<WorkersDeploymentsStrategyPercentageVersionsInner> versions = new ArrayList<>();

  public WorkersSchemasDeploymentsListResponseAllOfResultDeployments() {
  }

  public WorkersSchemasDeploymentsListResponseAllOfResultDeployments(
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

  public WorkersSchemasDeploymentsListResponseAllOfResultDeployments annotations(WorkersDeploymentsBaseAnnotations annotations) {
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



  public WorkersSchemasDeploymentsListResponseAllOfResultDeployments strategy(StrategyEnum strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @javax.annotation.Nonnull
  public StrategyEnum getStrategy() {
    return strategy;
  }

  public void setStrategy(StrategyEnum strategy) {
    this.strategy = strategy;
  }


  public WorkersSchemasDeploymentsListResponseAllOfResultDeployments versions(List<WorkersDeploymentsStrategyPercentageVersionsInner> versions) {
    this.versions = versions;
    return this;
  }

  public WorkersSchemasDeploymentsListResponseAllOfResultDeployments addVersionsItem(WorkersDeploymentsStrategyPercentageVersionsInner versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * Get versions
   * @return versions
  **/
  @javax.annotation.Nonnull
  public List<WorkersDeploymentsStrategyPercentageVersionsInner> getVersions() {
    return versions;
  }

  public void setVersions(List<WorkersDeploymentsStrategyPercentageVersionsInner> versions) {
    this.versions = versions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkersSchemasDeploymentsListResponseAllOfResultDeployments workersSchemasDeploymentsListResponseAllOfResultDeployments = (WorkersSchemasDeploymentsListResponseAllOfResultDeployments) o;
    return Objects.equals(this.annotations, workersSchemasDeploymentsListResponseAllOfResultDeployments.annotations) &&
        Objects.equals(this.authorEmail, workersSchemasDeploymentsListResponseAllOfResultDeployments.authorEmail) &&
        Objects.equals(this.createdOn, workersSchemasDeploymentsListResponseAllOfResultDeployments.createdOn) &&
        Objects.equals(this.id, workersSchemasDeploymentsListResponseAllOfResultDeployments.id) &&
        Objects.equals(this.source, workersSchemasDeploymentsListResponseAllOfResultDeployments.source) &&
        Objects.equals(this.strategy, workersSchemasDeploymentsListResponseAllOfResultDeployments.strategy) &&
        Objects.equals(this.versions, workersSchemasDeploymentsListResponseAllOfResultDeployments.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, authorEmail, createdOn, id, source, strategy, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkersSchemasDeploymentsListResponseAllOfResultDeployments {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
    openapiFields.add("versions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("strategy");
    openapiRequiredFields.add("versions");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WorkersSchemasDeploymentsListResponseAllOfResultDeployments
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkersSchemasDeploymentsListResponseAllOfResultDeployments.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkersSchemasDeploymentsListResponseAllOfResultDeployments is not found in the empty JSON string", WorkersSchemasDeploymentsListResponseAllOfResultDeployments.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkersSchemasDeploymentsListResponseAllOfResultDeployments.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkersSchemasDeploymentsListResponseAllOfResultDeployments` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkersSchemasDeploymentsListResponseAllOfResultDeployments.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
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
      if (!jsonObj.get("strategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `strategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("strategy").toString()));
      }
      // validate the required field `strategy`
      StrategyEnum.validateJsonElement(jsonObj.get("strategy"));
      // ensure the json data is an array
      if (!jsonObj.get("versions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `versions` to be an array in the JSON string but got `%s`", jsonObj.get("versions").toString()));
      }

      JsonArray jsonArrayversions = jsonObj.getAsJsonArray("versions");
      // validate the required field `versions` (array)
      for (int i = 0; i < jsonArrayversions.size(); i++) {
        WorkersDeploymentsStrategyPercentageVersionsInner.validateJsonElement(jsonArrayversions.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkersSchemasDeploymentsListResponseAllOfResultDeployments.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkersSchemasDeploymentsListResponseAllOfResultDeployments' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkersSchemasDeploymentsListResponseAllOfResultDeployments> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkersSchemasDeploymentsListResponseAllOfResultDeployments.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkersSchemasDeploymentsListResponseAllOfResultDeployments>() {
           @Override
           public void write(JsonWriter out, WorkersSchemasDeploymentsListResponseAllOfResultDeployments value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkersSchemasDeploymentsListResponseAllOfResultDeployments read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkersSchemasDeploymentsListResponseAllOfResultDeployments given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkersSchemasDeploymentsListResponseAllOfResultDeployments
  * @throws IOException if the JSON string is invalid with respect to WorkersSchemasDeploymentsListResponseAllOfResultDeployments
  */
  public static WorkersSchemasDeploymentsListResponseAllOfResultDeployments fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkersSchemasDeploymentsListResponseAllOfResultDeployments.class);
  }

 /**
  * Convert an instance of WorkersSchemasDeploymentsListResponseAllOfResultDeployments to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

