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
import cloudflare.sdk.models.WorkersMigrationStepRenamedClassesInner;
import cloudflare.sdk.models.WorkersMigrationStepTransferredClassesInner;
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
 * WorkersMigrationStep
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class WorkersMigrationStep {
  public static final String SERIALIZED_NAME_DELETED_CLASSES = "deleted_classes";
  @SerializedName(SERIALIZED_NAME_DELETED_CLASSES)
  private List<String> deletedClasses = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEW_CLASSES = "new_classes";
  @SerializedName(SERIALIZED_NAME_NEW_CLASSES)
  private List<String> newClasses = new ArrayList<>();

  public static final String SERIALIZED_NAME_RENAMED_CLASSES = "renamed_classes";
  @SerializedName(SERIALIZED_NAME_RENAMED_CLASSES)
  private List<WorkersMigrationStepRenamedClassesInner> renamedClasses = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRANSFERRED_CLASSES = "transferred_classes";
  @SerializedName(SERIALIZED_NAME_TRANSFERRED_CLASSES)
  private List<WorkersMigrationStepTransferredClassesInner> transferredClasses = new ArrayList<>();

  public WorkersMigrationStep() {
  }

  public WorkersMigrationStep deletedClasses(List<String> deletedClasses) {
    this.deletedClasses = deletedClasses;
    return this;
  }

  public WorkersMigrationStep addDeletedClassesItem(String deletedClassesItem) {
    if (this.deletedClasses == null) {
      this.deletedClasses = new ArrayList<>();
    }
    this.deletedClasses.add(deletedClassesItem);
    return this;
  }

   /**
   * A list of classes to delete Durable Object namespaces from.
   * @return deletedClasses
  **/
  @javax.annotation.Nullable
  public List<String> getDeletedClasses() {
    return deletedClasses;
  }

  public void setDeletedClasses(List<String> deletedClasses) {
    this.deletedClasses = deletedClasses;
  }


  public WorkersMigrationStep newClasses(List<String> newClasses) {
    this.newClasses = newClasses;
    return this;
  }

  public WorkersMigrationStep addNewClassesItem(String newClassesItem) {
    if (this.newClasses == null) {
      this.newClasses = new ArrayList<>();
    }
    this.newClasses.add(newClassesItem);
    return this;
  }

   /**
   * A list of classes to create Durable Object namespaces from.
   * @return newClasses
  **/
  @javax.annotation.Nullable
  public List<String> getNewClasses() {
    return newClasses;
  }

  public void setNewClasses(List<String> newClasses) {
    this.newClasses = newClasses;
  }


  public WorkersMigrationStep renamedClasses(List<WorkersMigrationStepRenamedClassesInner> renamedClasses) {
    this.renamedClasses = renamedClasses;
    return this;
  }

  public WorkersMigrationStep addRenamedClassesItem(WorkersMigrationStepRenamedClassesInner renamedClassesItem) {
    if (this.renamedClasses == null) {
      this.renamedClasses = new ArrayList<>();
    }
    this.renamedClasses.add(renamedClassesItem);
    return this;
  }

   /**
   * A list of classes with Durable Object namespaces that were renamed.
   * @return renamedClasses
  **/
  @javax.annotation.Nullable
  public List<WorkersMigrationStepRenamedClassesInner> getRenamedClasses() {
    return renamedClasses;
  }

  public void setRenamedClasses(List<WorkersMigrationStepRenamedClassesInner> renamedClasses) {
    this.renamedClasses = renamedClasses;
  }


  public WorkersMigrationStep transferredClasses(List<WorkersMigrationStepTransferredClassesInner> transferredClasses) {
    this.transferredClasses = transferredClasses;
    return this;
  }

  public WorkersMigrationStep addTransferredClassesItem(WorkersMigrationStepTransferredClassesInner transferredClassesItem) {
    if (this.transferredClasses == null) {
      this.transferredClasses = new ArrayList<>();
    }
    this.transferredClasses.add(transferredClassesItem);
    return this;
  }

   /**
   * A list of transfers for Durable Object namespaces from a different Worker and class to a class defined in this Worker.
   * @return transferredClasses
  **/
  @javax.annotation.Nullable
  public List<WorkersMigrationStepTransferredClassesInner> getTransferredClasses() {
    return transferredClasses;
  }

  public void setTransferredClasses(List<WorkersMigrationStepTransferredClassesInner> transferredClasses) {
    this.transferredClasses = transferredClasses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkersMigrationStep workersMigrationStep = (WorkersMigrationStep) o;
    return Objects.equals(this.deletedClasses, workersMigrationStep.deletedClasses) &&
        Objects.equals(this.newClasses, workersMigrationStep.newClasses) &&
        Objects.equals(this.renamedClasses, workersMigrationStep.renamedClasses) &&
        Objects.equals(this.transferredClasses, workersMigrationStep.transferredClasses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedClasses, newClasses, renamedClasses, transferredClasses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkersMigrationStep {\n");
    sb.append("    deletedClasses: ").append(toIndentedString(deletedClasses)).append("\n");
    sb.append("    newClasses: ").append(toIndentedString(newClasses)).append("\n");
    sb.append("    renamedClasses: ").append(toIndentedString(renamedClasses)).append("\n");
    sb.append("    transferredClasses: ").append(toIndentedString(transferredClasses)).append("\n");
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
    openapiFields.add("deleted_classes");
    openapiFields.add("new_classes");
    openapiFields.add("renamed_classes");
    openapiFields.add("transferred_classes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WorkersMigrationStep
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkersMigrationStep.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkersMigrationStep is not found in the empty JSON string", WorkersMigrationStep.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkersMigrationStep.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkersMigrationStep` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("deleted_classes") != null && !jsonObj.get("deleted_classes").isJsonNull() && !jsonObj.get("deleted_classes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `deleted_classes` to be an array in the JSON string but got `%s`", jsonObj.get("deleted_classes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("new_classes") != null && !jsonObj.get("new_classes").isJsonNull() && !jsonObj.get("new_classes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_classes` to be an array in the JSON string but got `%s`", jsonObj.get("new_classes").toString()));
      }
      if (jsonObj.get("renamed_classes") != null && !jsonObj.get("renamed_classes").isJsonNull()) {
        JsonArray jsonArrayrenamedClasses = jsonObj.getAsJsonArray("renamed_classes");
        if (jsonArrayrenamedClasses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("renamed_classes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `renamed_classes` to be an array in the JSON string but got `%s`", jsonObj.get("renamed_classes").toString()));
          }

          // validate the optional field `renamed_classes` (array)
          for (int i = 0; i < jsonArrayrenamedClasses.size(); i++) {
            WorkersMigrationStepRenamedClassesInner.validateJsonElement(jsonArrayrenamedClasses.get(i));
          };
        }
      }
      if (jsonObj.get("transferred_classes") != null && !jsonObj.get("transferred_classes").isJsonNull()) {
        JsonArray jsonArraytransferredClasses = jsonObj.getAsJsonArray("transferred_classes");
        if (jsonArraytransferredClasses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("transferred_classes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `transferred_classes` to be an array in the JSON string but got `%s`", jsonObj.get("transferred_classes").toString()));
          }

          // validate the optional field `transferred_classes` (array)
          for (int i = 0; i < jsonArraytransferredClasses.size(); i++) {
            WorkersMigrationStepTransferredClassesInner.validateJsonElement(jsonArraytransferredClasses.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkersMigrationStep.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkersMigrationStep' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkersMigrationStep> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkersMigrationStep.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkersMigrationStep>() {
           @Override
           public void write(JsonWriter out, WorkersMigrationStep value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkersMigrationStep read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkersMigrationStep given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkersMigrationStep
  * @throws IOException if the JSON string is invalid with respect to WorkersMigrationStep
  */
  public static WorkersMigrationStep fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkersMigrationStep.class);
  }

 /**
  * Convert an instance of WorkersMigrationStep to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
