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
import org.openapitools.client.model.CloudforceOneTlp;

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
 * CloudforceOnePriorityEdit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class CloudforceOnePriorityEdit {
  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_REQUIREMENT = "requirement";
  @SerializedName(SERIALIZED_NAME_REQUIREMENT)
  private String requirement;

  public static final String SERIALIZED_NAME_TLP = "tlp";
  @SerializedName(SERIALIZED_NAME_TLP)
  private CloudforceOneTlp tlp;

  public CloudforceOnePriorityEdit() {
  }

  public CloudforceOnePriorityEdit labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public CloudforceOnePriorityEdit addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * List of labels
   * @return labels
  **/
  @javax.annotation.Nonnull
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public CloudforceOnePriorityEdit priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Priority
   * @return priority
  **/
  @javax.annotation.Nonnull
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public CloudforceOnePriorityEdit requirement(String requirement) {
    this.requirement = requirement;
    return this;
  }

   /**
   * Requirement
   * @return requirement
  **/
  @javax.annotation.Nonnull
  public String getRequirement() {
    return requirement;
  }

  public void setRequirement(String requirement) {
    this.requirement = requirement;
  }


  public CloudforceOnePriorityEdit tlp(CloudforceOneTlp tlp) {
    this.tlp = tlp;
    return this;
  }

   /**
   * Get tlp
   * @return tlp
  **/
  @javax.annotation.Nonnull
  public CloudforceOneTlp getTlp() {
    return tlp;
  }

  public void setTlp(CloudforceOneTlp tlp) {
    this.tlp = tlp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudforceOnePriorityEdit cloudforceOnePriorityEdit = (CloudforceOnePriorityEdit) o;
    return Objects.equals(this.labels, cloudforceOnePriorityEdit.labels) &&
        Objects.equals(this.priority, cloudforceOnePriorityEdit.priority) &&
        Objects.equals(this.requirement, cloudforceOnePriorityEdit.requirement) &&
        Objects.equals(this.tlp, cloudforceOnePriorityEdit.tlp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, priority, requirement, tlp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudforceOnePriorityEdit {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requirement: ").append(toIndentedString(requirement)).append("\n");
    sb.append("    tlp: ").append(toIndentedString(tlp)).append("\n");
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
    openapiFields.add("labels");
    openapiFields.add("priority");
    openapiFields.add("requirement");
    openapiFields.add("tlp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("labels");
    openapiRequiredFields.add("priority");
    openapiRequiredFields.add("requirement");
    openapiRequiredFields.add("tlp");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CloudforceOnePriorityEdit
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudforceOnePriorityEdit.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudforceOnePriorityEdit is not found in the empty JSON string", CloudforceOnePriorityEdit.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudforceOnePriorityEdit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudforceOnePriorityEdit` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CloudforceOnePriorityEdit.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("labels") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("labels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
      }
      if (!jsonObj.get("requirement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requirement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requirement").toString()));
      }
      // validate the required field `tlp`
      CloudforceOneTlp.validateJsonElement(jsonObj.get("tlp"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudforceOnePriorityEdit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudforceOnePriorityEdit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudforceOnePriorityEdit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudforceOnePriorityEdit.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudforceOnePriorityEdit>() {
           @Override
           public void write(JsonWriter out, CloudforceOnePriorityEdit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudforceOnePriorityEdit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CloudforceOnePriorityEdit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudforceOnePriorityEdit
  * @throws IOException if the JSON string is invalid with respect to CloudforceOnePriorityEdit
  */
  public static CloudforceOnePriorityEdit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudforceOnePriorityEdit.class);
  }

 /**
  * Convert an instance of CloudforceOnePriorityEdit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
