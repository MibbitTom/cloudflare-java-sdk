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
import cloudflare.sdk.models.PagesBuildConfig;
import cloudflare.sdk.models.PagesDeploymentConfigs;
import cloudflare.sdk.models.PagesDeployments;
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

import cloudflare.JSON;

/**
 * PagesProjects
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class PagesProjects {
  public static final String SERIALIZED_NAME_BUILD_CONFIG = "build_config";
  @SerializedName(SERIALIZED_NAME_BUILD_CONFIG)
  private PagesBuildConfig buildConfig;

  public static final String SERIALIZED_NAME_CANONICAL_DEPLOYMENT = "canonical_deployment";
  @SerializedName(SERIALIZED_NAME_CANONICAL_DEPLOYMENT)
  private PagesDeployments canonicalDeployment;

  public static final String SERIALIZED_NAME_CREATED_ON = "created_on";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_DEPLOYMENT_CONFIGS = "deployment_configs";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_CONFIGS)
  private PagesDeploymentConfigs deploymentConfigs;

  public static final String SERIALIZED_NAME_DOMAINS = "domains";
  @SerializedName(SERIALIZED_NAME_DOMAINS)
  private List<Object> domains = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LATEST_DEPLOYMENT = "latest_deployment";
  @SerializedName(SERIALIZED_NAME_LATEST_DEPLOYMENT)
  private PagesDeployments latestDeployment;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRODUCTION_BRANCH = "production_branch";
  @SerializedName(SERIALIZED_NAME_PRODUCTION_BRANCH)
  private String productionBranch;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Object source = null;

  public static final String SERIALIZED_NAME_SUBDOMAIN = "subdomain";
  @SerializedName(SERIALIZED_NAME_SUBDOMAIN)
  private String subdomain;

  public PagesProjects() {
  }

  public PagesProjects(
     OffsetDateTime createdOn, 
     List<Object> domains, 
     String id, 
     Object source, 
     String subdomain
  ) {
    this();
    this.createdOn = createdOn;
    this.domains = domains;
    this.id = id;
    this.source = source;
    this.subdomain = subdomain;
  }

  public PagesProjects buildConfig(PagesBuildConfig buildConfig) {
    this.buildConfig = buildConfig;
    return this;
  }

   /**
   * Get buildConfig
   * @return buildConfig
  **/
  @javax.annotation.Nullable
  public PagesBuildConfig getBuildConfig() {
    return buildConfig;
  }

  public void setBuildConfig(PagesBuildConfig buildConfig) {
    this.buildConfig = buildConfig;
  }


  public PagesProjects canonicalDeployment(PagesDeployments canonicalDeployment) {
    this.canonicalDeployment = canonicalDeployment;
    return this;
  }

   /**
   * Get canonicalDeployment
   * @return canonicalDeployment
  **/
  @javax.annotation.Nullable
  public PagesDeployments getCanonicalDeployment() {
    return canonicalDeployment;
  }

  public void setCanonicalDeployment(PagesDeployments canonicalDeployment) {
    this.canonicalDeployment = canonicalDeployment;
  }


   /**
   * When the project was created.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  public PagesProjects deploymentConfigs(PagesDeploymentConfigs deploymentConfigs) {
    this.deploymentConfigs = deploymentConfigs;
    return this;
  }

   /**
   * Get deploymentConfigs
   * @return deploymentConfigs
  **/
  @javax.annotation.Nullable
  public PagesDeploymentConfigs getDeploymentConfigs() {
    return deploymentConfigs;
  }

  public void setDeploymentConfigs(PagesDeploymentConfigs deploymentConfigs) {
    this.deploymentConfigs = deploymentConfigs;
  }


   /**
   * A list of associated custom domains for the project.
   * @return domains
  **/
  @javax.annotation.Nullable
  public List<Object> getDomains() {
    return domains;
  }



   /**
   * Id of the project.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public PagesProjects latestDeployment(PagesDeployments latestDeployment) {
    this.latestDeployment = latestDeployment;
    return this;
  }

   /**
   * Get latestDeployment
   * @return latestDeployment
  **/
  @javax.annotation.Nullable
  public PagesDeployments getLatestDeployment() {
    return latestDeployment;
  }

  public void setLatestDeployment(PagesDeployments latestDeployment) {
    this.latestDeployment = latestDeployment;
  }


  public PagesProjects name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the project.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public PagesProjects productionBranch(String productionBranch) {
    this.productionBranch = productionBranch;
    return this;
  }

   /**
   * Production branch of the project. Used to identify production deployments.
   * @return productionBranch
  **/
  @javax.annotation.Nullable
  public String getProductionBranch() {
    return productionBranch;
  }

  public void setProductionBranch(String productionBranch) {
    this.productionBranch = productionBranch;
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
   * The Cloudflare subdomain associated with the project.
   * @return subdomain
  **/
  @javax.annotation.Nullable
  public String getSubdomain() {
    return subdomain;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagesProjects pagesProjects = (PagesProjects) o;
    return Objects.equals(this.buildConfig, pagesProjects.buildConfig) &&
        Objects.equals(this.canonicalDeployment, pagesProjects.canonicalDeployment) &&
        Objects.equals(this.createdOn, pagesProjects.createdOn) &&
        Objects.equals(this.deploymentConfigs, pagesProjects.deploymentConfigs) &&
        Objects.equals(this.domains, pagesProjects.domains) &&
        Objects.equals(this.id, pagesProjects.id) &&
        Objects.equals(this.latestDeployment, pagesProjects.latestDeployment) &&
        Objects.equals(this.name, pagesProjects.name) &&
        Objects.equals(this.productionBranch, pagesProjects.productionBranch) &&
        Objects.equals(this.source, pagesProjects.source) &&
        Objects.equals(this.subdomain, pagesProjects.subdomain);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildConfig, canonicalDeployment, createdOn, deploymentConfigs, domains, id, latestDeployment, name, productionBranch, source, subdomain);
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
    sb.append("class PagesProjects {\n");
    sb.append("    buildConfig: ").append(toIndentedString(buildConfig)).append("\n");
    sb.append("    canonicalDeployment: ").append(toIndentedString(canonicalDeployment)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    deploymentConfigs: ").append(toIndentedString(deploymentConfigs)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latestDeployment: ").append(toIndentedString(latestDeployment)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productionBranch: ").append(toIndentedString(productionBranch)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
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
    openapiFields.add("build_config");
    openapiFields.add("canonical_deployment");
    openapiFields.add("created_on");
    openapiFields.add("deployment_configs");
    openapiFields.add("domains");
    openapiFields.add("id");
    openapiFields.add("latest_deployment");
    openapiFields.add("name");
    openapiFields.add("production_branch");
    openapiFields.add("source");
    openapiFields.add("subdomain");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PagesProjects
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PagesProjects.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PagesProjects is not found in the empty JSON string", PagesProjects.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PagesProjects.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PagesProjects` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `build_config`
      if (jsonObj.get("build_config") != null && !jsonObj.get("build_config").isJsonNull()) {
        PagesBuildConfig.validateJsonElement(jsonObj.get("build_config"));
      }
      // validate the optional field `canonical_deployment`
      if (jsonObj.get("canonical_deployment") != null && !jsonObj.get("canonical_deployment").isJsonNull()) {
        PagesDeployments.validateJsonElement(jsonObj.get("canonical_deployment"));
      }
      // validate the optional field `deployment_configs`
      if (jsonObj.get("deployment_configs") != null && !jsonObj.get("deployment_configs").isJsonNull()) {
        PagesDeploymentConfigs.validateJsonElement(jsonObj.get("deployment_configs"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("domains") != null && !jsonObj.get("domains").isJsonNull() && !jsonObj.get("domains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `domains` to be an array in the JSON string but got `%s`", jsonObj.get("domains").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `latest_deployment`
      if (jsonObj.get("latest_deployment") != null && !jsonObj.get("latest_deployment").isJsonNull()) {
        PagesDeployments.validateJsonElement(jsonObj.get("latest_deployment"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("production_branch") != null && !jsonObj.get("production_branch").isJsonNull()) && !jsonObj.get("production_branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `production_branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("production_branch").toString()));
      }
      if ((jsonObj.get("subdomain") != null && !jsonObj.get("subdomain").isJsonNull()) && !jsonObj.get("subdomain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subdomain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subdomain").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PagesProjects.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PagesProjects' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PagesProjects> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PagesProjects.class));

       return (TypeAdapter<T>) new TypeAdapter<PagesProjects>() {
           @Override
           public void write(JsonWriter out, PagesProjects value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PagesProjects read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PagesProjects given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PagesProjects
  * @throws IOException if the JSON string is invalid with respect to PagesProjects
  */
  public static PagesProjects fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PagesProjects.class);
  }

 /**
  * Convert an instance of PagesProjects to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

