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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.PagesDeploymentsDeploymentTrigger;
import org.openapitools.client.model.PagesStage;
import org.openapitools.jackson.nullable.JsonNullable;

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

import invalidPackageName.JSON;

/**
 * PagesDeployments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class PagesDeployments {
  public static final String SERIALIZED_NAME_ALIASES = "aliases";
  @SerializedName(SERIALIZED_NAME_ALIASES)
  private List<Object> aliases;

  public static final String SERIALIZED_NAME_BUILD_CONFIG = "build_config";
  @SerializedName(SERIALIZED_NAME_BUILD_CONFIG)
  private Object buildConfig = null;

  public static final String SERIALIZED_NAME_CREATED_ON = "created_on";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_DEPLOYMENT_TRIGGER = "deployment_trigger";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_TRIGGER)
  private PagesDeploymentsDeploymentTrigger deploymentTrigger;

  public static final String SERIALIZED_NAME_ENV_VARS = "env_vars";
  @SerializedName(SERIALIZED_NAME_ENV_VARS)
  private Object envVars;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private String environment;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_SKIPPED = "is_skipped";
  @SerializedName(SERIALIZED_NAME_IS_SKIPPED)
  private Boolean isSkipped;

  public static final String SERIALIZED_NAME_LATEST_STAGE = "latest_stage";
  @SerializedName(SERIALIZED_NAME_LATEST_STAGE)
  private Object latestStage = null;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modified_on";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "project_name";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
  private String projectName;

  public static final String SERIALIZED_NAME_SHORT_ID = "short_id";
  @SerializedName(SERIALIZED_NAME_SHORT_ID)
  private String shortId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Object source = null;

  public static final String SERIALIZED_NAME_STAGES = "stages";
  @SerializedName(SERIALIZED_NAME_STAGES)
  private List<PagesStage> stages = new ArrayList<>();

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public PagesDeployments() {
  }

  public PagesDeployments(
     List<Object> aliases, 
     Object buildConfig, 
     OffsetDateTime createdOn, 
     Object envVars, 
     String environment, 
     String id, 
     Boolean isSkipped, 
     Object latestStage, 
     OffsetDateTime modifiedOn, 
     String projectId, 
     String projectName, 
     String shortId, 
     Object source, 
     List<PagesStage> stages, 
     String url
  ) {
    this();
    this.aliases = aliases;
    this.buildConfig = buildConfig;
    this.createdOn = createdOn;
    this.envVars = envVars;
    this.environment = environment;
    this.id = id;
    this.isSkipped = isSkipped;
    this.latestStage = latestStage;
    this.modifiedOn = modifiedOn;
    this.projectId = projectId;
    this.projectName = projectName;
    this.shortId = shortId;
    this.source = source;
    this.stages = stages;
    this.url = url;
  }

   /**
   * A list of alias URLs pointing to this deployment.
   * @return aliases
  **/
  @javax.annotation.Nullable
  public List<Object> getAliases() {
    return aliases;
  }



   /**
   * Get buildConfig
   * @return buildConfig
  **/
  @javax.annotation.Nullable
  public Object getBuildConfig() {
    return buildConfig;
  }



   /**
   * When the deployment was created.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  public PagesDeployments deploymentTrigger(PagesDeploymentsDeploymentTrigger deploymentTrigger) {
    this.deploymentTrigger = deploymentTrigger;
    return this;
  }

   /**
   * Get deploymentTrigger
   * @return deploymentTrigger
  **/
  @javax.annotation.Nullable
  public PagesDeploymentsDeploymentTrigger getDeploymentTrigger() {
    return deploymentTrigger;
  }

  public void setDeploymentTrigger(PagesDeploymentsDeploymentTrigger deploymentTrigger) {
    this.deploymentTrigger = deploymentTrigger;
  }


   /**
   * A dict of env variables to build this deploy.
   * @return envVars
  **/
  @javax.annotation.Nullable
  public Object getEnvVars() {
    return envVars;
  }



   /**
   * Type of deploy.
   * @return environment
  **/
  @javax.annotation.Nullable
  public String getEnvironment() {
    return environment;
  }



   /**
   * Id of the deployment.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



   /**
   * If the deployment has been skipped.
   * @return isSkipped
  **/
  @javax.annotation.Nullable
  public Boolean getIsSkipped() {
    return isSkipped;
  }



   /**
   * Get latestStage
   * @return latestStage
  **/
  @javax.annotation.Nullable
  public Object getLatestStage() {
    return latestStage;
  }



   /**
   * When the deployment was last modified.
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }



   /**
   * Id of the project.
   * @return projectId
  **/
  @javax.annotation.Nullable
  public String getProjectId() {
    return projectId;
  }



   /**
   * Name of the project.
   * @return projectName
  **/
  @javax.annotation.Nullable
  public String getProjectName() {
    return projectName;
  }



   /**
   * Short Id (8 character) of the deployment.
   * @return shortId
  **/
  @javax.annotation.Nullable
  public String getShortId() {
    return shortId;
  }



   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public Object getSource() {
    return source;
  }



   /**
   * List of past stages.
   * @return stages
  **/
  @javax.annotation.Nullable
  public List<PagesStage> getStages() {
    return stages;
  }



   /**
   * The live URL to view this deployment.
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagesDeployments pagesDeployments = (PagesDeployments) o;
    return Objects.equals(this.aliases, pagesDeployments.aliases) &&
        Objects.equals(this.buildConfig, pagesDeployments.buildConfig) &&
        Objects.equals(this.createdOn, pagesDeployments.createdOn) &&
        Objects.equals(this.deploymentTrigger, pagesDeployments.deploymentTrigger) &&
        Objects.equals(this.envVars, pagesDeployments.envVars) &&
        Objects.equals(this.environment, pagesDeployments.environment) &&
        Objects.equals(this.id, pagesDeployments.id) &&
        Objects.equals(this.isSkipped, pagesDeployments.isSkipped) &&
        Objects.equals(this.latestStage, pagesDeployments.latestStage) &&
        Objects.equals(this.modifiedOn, pagesDeployments.modifiedOn) &&
        Objects.equals(this.projectId, pagesDeployments.projectId) &&
        Objects.equals(this.projectName, pagesDeployments.projectName) &&
        Objects.equals(this.shortId, pagesDeployments.shortId) &&
        Objects.equals(this.source, pagesDeployments.source) &&
        Objects.equals(this.stages, pagesDeployments.stages) &&
        Objects.equals(this.url, pagesDeployments.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, buildConfig, createdOn, deploymentTrigger, envVars, environment, id, isSkipped, latestStage, modifiedOn, projectId, projectName, shortId, source, stages, url);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagesDeployments {\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    buildConfig: ").append(toIndentedString(buildConfig)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    deploymentTrigger: ").append(toIndentedString(deploymentTrigger)).append("\n");
    sb.append("    envVars: ").append(toIndentedString(envVars)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isSkipped: ").append(toIndentedString(isSkipped)).append("\n");
    sb.append("    latestStage: ").append(toIndentedString(latestStage)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("aliases");
    openapiFields.add("build_config");
    openapiFields.add("created_on");
    openapiFields.add("deployment_trigger");
    openapiFields.add("env_vars");
    openapiFields.add("environment");
    openapiFields.add("id");
    openapiFields.add("is_skipped");
    openapiFields.add("latest_stage");
    openapiFields.add("modified_on");
    openapiFields.add("project_id");
    openapiFields.add("project_name");
    openapiFields.add("short_id");
    openapiFields.add("source");
    openapiFields.add("stages");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PagesDeployments
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PagesDeployments.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PagesDeployments is not found in the empty JSON string", PagesDeployments.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PagesDeployments.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PagesDeployments` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("aliases") != null && !jsonObj.get("aliases").isJsonNull() && !jsonObj.get("aliases").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `aliases` to be an array in the JSON string but got `%s`", jsonObj.get("aliases").toString()));
      }
      // validate the optional field `deployment_trigger`
      if (jsonObj.get("deployment_trigger") != null && !jsonObj.get("deployment_trigger").isJsonNull()) {
        PagesDeploymentsDeploymentTrigger.validateJsonElement(jsonObj.get("deployment_trigger"));
      }
      if ((jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) && !jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("project_id") != null && !jsonObj.get("project_id").isJsonNull()) && !jsonObj.get("project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_id").toString()));
      }
      if ((jsonObj.get("project_name") != null && !jsonObj.get("project_name").isJsonNull()) && !jsonObj.get("project_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_name").toString()));
      }
      if ((jsonObj.get("short_id") != null && !jsonObj.get("short_id").isJsonNull()) && !jsonObj.get("short_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `short_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("short_id").toString()));
      }
      if (jsonObj.get("stages") != null && !jsonObj.get("stages").isJsonNull()) {
        JsonArray jsonArraystages = jsonObj.getAsJsonArray("stages");
        if (jsonArraystages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("stages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `stages` to be an array in the JSON string but got `%s`", jsonObj.get("stages").toString()));
          }

          // validate the optional field `stages` (array)
          for (int i = 0; i < jsonArraystages.size(); i++) {
            PagesStage.validateJsonElement(jsonArraystages.get(i));
          };
        }
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PagesDeployments.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PagesDeployments' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PagesDeployments> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PagesDeployments.class));

       return (TypeAdapter<T>) new TypeAdapter<PagesDeployments>() {
           @Override
           public void write(JsonWriter out, PagesDeployments value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PagesDeployments read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PagesDeployments given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PagesDeployments
  * @throws IOException if the JSON string is invalid with respect to PagesDeployments
  */
  public static PagesDeployments fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PagesDeployments.class);
  }

 /**
  * Convert an instance of PagesDeployments to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

