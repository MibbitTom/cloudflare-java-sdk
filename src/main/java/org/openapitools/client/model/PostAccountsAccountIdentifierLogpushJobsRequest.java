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
import java.net.URI;
import java.util.Arrays;
import org.openapitools.client.model.LogpushFrequency;
import org.openapitools.client.model.LogpushOutputOptions;
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

import org.openapitools.client.JSON;

/**
 * PostAccountsAccountIdentifierLogpushJobsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class PostAccountsAccountIdentifierLogpushJobsRequest {
  public static final String SERIALIZED_NAME_DATASET = "dataset";
  @SerializedName(SERIALIZED_NAME_DATASET)
  private String dataset;

  public static final String SERIALIZED_NAME_DESTINATION_CONF = "destination_conf";
  @SerializedName(SERIALIZED_NAME_DESTINATION_CONF)
  private URI destinationConf;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private LogpushFrequency frequency = LogpushFrequency.HIGH;

  public static final String SERIALIZED_NAME_LOGPULL_OPTIONS = "logpull_options";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_LOGPULL_OPTIONS)
  private String logpullOptions;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OUTPUT_OPTIONS = "output_options";
  @SerializedName(SERIALIZED_NAME_OUTPUT_OPTIONS)
  private LogpushOutputOptions outputOptions;

  public static final String SERIALIZED_NAME_OWNERSHIP_CHALLENGE = "ownership_challenge";
  @SerializedName(SERIALIZED_NAME_OWNERSHIP_CHALLENGE)
  private String ownershipChallenge;

  public PostAccountsAccountIdentifierLogpushJobsRequest() {
  }

  public PostAccountsAccountIdentifierLogpushJobsRequest dataset(String dataset) {
    this.dataset = dataset;
    return this;
  }

   /**
   * Name of the dataset.
   * @return dataset
  **/
  @javax.annotation.Nullable
  public String getDataset() {
    return dataset;
  }

  public void setDataset(String dataset) {
    this.dataset = dataset;
  }


  public PostAccountsAccountIdentifierLogpushJobsRequest destinationConf(URI destinationConf) {
    this.destinationConf = destinationConf;
    return this;
  }

   /**
   * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included.
   * @return destinationConf
  **/
  @javax.annotation.Nonnull
  public URI getDestinationConf() {
    return destinationConf;
  }

  public void setDestinationConf(URI destinationConf) {
    this.destinationConf = destinationConf;
  }


  public PostAccountsAccountIdentifierLogpushJobsRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Flag that indicates if the job is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public PostAccountsAccountIdentifierLogpushJobsRequest frequency(LogpushFrequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  public LogpushFrequency getFrequency() {
    return frequency;
  }

  public void setFrequency(LogpushFrequency frequency) {
    this.frequency = frequency;
  }


  @Deprecated
  public PostAccountsAccountIdentifierLogpushJobsRequest logpullOptions(String logpullOptions) {
    this.logpullOptions = logpullOptions;
    return this;
  }

   /**
   * This field is deprecated. Use &#x60;output_options&#x60; instead. Configuration string. It specifies things like requested fields and timestamp formats. If migrating from the logpull api, copy the url (full url or just the query string) of your call here, and logpush will keep on making this call for you, setting start and end times appropriately.
   * @return logpullOptions
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public String getLogpullOptions() {
    return logpullOptions;
  }

  @Deprecated
  public void setLogpullOptions(String logpullOptions) {
    this.logpullOptions = logpullOptions;
  }


  public PostAccountsAccountIdentifierLogpushJobsRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Optional human readable job name. Not unique. Cloudflare suggests that you set this to a meaningful string, like the domain name, to make it easier to identify your job.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public PostAccountsAccountIdentifierLogpushJobsRequest outputOptions(LogpushOutputOptions outputOptions) {
    this.outputOptions = outputOptions;
    return this;
  }

   /**
   * Get outputOptions
   * @return outputOptions
  **/
  @javax.annotation.Nullable
  public LogpushOutputOptions getOutputOptions() {
    return outputOptions;
  }

  public void setOutputOptions(LogpushOutputOptions outputOptions) {
    this.outputOptions = outputOptions;
  }


  public PostAccountsAccountIdentifierLogpushJobsRequest ownershipChallenge(String ownershipChallenge) {
    this.ownershipChallenge = ownershipChallenge;
    return this;
  }

   /**
   * Ownership challenge token to prove destination ownership.
   * @return ownershipChallenge
  **/
  @javax.annotation.Nullable
  public String getOwnershipChallenge() {
    return ownershipChallenge;
  }

  public void setOwnershipChallenge(String ownershipChallenge) {
    this.ownershipChallenge = ownershipChallenge;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAccountsAccountIdentifierLogpushJobsRequest postAccountsAccountIdentifierLogpushJobsRequest = (PostAccountsAccountIdentifierLogpushJobsRequest) o;
    return Objects.equals(this.dataset, postAccountsAccountIdentifierLogpushJobsRequest.dataset) &&
        Objects.equals(this.destinationConf, postAccountsAccountIdentifierLogpushJobsRequest.destinationConf) &&
        Objects.equals(this.enabled, postAccountsAccountIdentifierLogpushJobsRequest.enabled) &&
        Objects.equals(this.frequency, postAccountsAccountIdentifierLogpushJobsRequest.frequency) &&
        Objects.equals(this.logpullOptions, postAccountsAccountIdentifierLogpushJobsRequest.logpullOptions) &&
        Objects.equals(this.name, postAccountsAccountIdentifierLogpushJobsRequest.name) &&
        Objects.equals(this.outputOptions, postAccountsAccountIdentifierLogpushJobsRequest.outputOptions) &&
        Objects.equals(this.ownershipChallenge, postAccountsAccountIdentifierLogpushJobsRequest.ownershipChallenge);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataset, destinationConf, enabled, frequency, logpullOptions, name, outputOptions, ownershipChallenge);
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
    sb.append("class PostAccountsAccountIdentifierLogpushJobsRequest {\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    destinationConf: ").append(toIndentedString(destinationConf)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    logpullOptions: ").append(toIndentedString(logpullOptions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outputOptions: ").append(toIndentedString(outputOptions)).append("\n");
    sb.append("    ownershipChallenge: ").append(toIndentedString(ownershipChallenge)).append("\n");
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
    openapiFields.add("dataset");
    openapiFields.add("destination_conf");
    openapiFields.add("enabled");
    openapiFields.add("frequency");
    openapiFields.add("logpull_options");
    openapiFields.add("name");
    openapiFields.add("output_options");
    openapiFields.add("ownership_challenge");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("destination_conf");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PostAccountsAccountIdentifierLogpushJobsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PostAccountsAccountIdentifierLogpushJobsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostAccountsAccountIdentifierLogpushJobsRequest is not found in the empty JSON string", PostAccountsAccountIdentifierLogpushJobsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PostAccountsAccountIdentifierLogpushJobsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostAccountsAccountIdentifierLogpushJobsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PostAccountsAccountIdentifierLogpushJobsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dataset") != null && !jsonObj.get("dataset").isJsonNull()) && !jsonObj.get("dataset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataset").toString()));
      }
      if (!jsonObj.get("destination_conf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination_conf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination_conf").toString()));
      }
      // validate the optional field `frequency`
      if (jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) {
        LogpushFrequency.validateJsonElement(jsonObj.get("frequency"));
      }
      if ((jsonObj.get("logpull_options") != null && !jsonObj.get("logpull_options").isJsonNull()) && !jsonObj.get("logpull_options").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logpull_options` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logpull_options").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `output_options`
      if (jsonObj.get("output_options") != null && !jsonObj.get("output_options").isJsonNull()) {
        LogpushOutputOptions.validateJsonElement(jsonObj.get("output_options"));
      }
      if ((jsonObj.get("ownership_challenge") != null && !jsonObj.get("ownership_challenge").isJsonNull()) && !jsonObj.get("ownership_challenge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownership_challenge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownership_challenge").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostAccountsAccountIdentifierLogpushJobsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostAccountsAccountIdentifierLogpushJobsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostAccountsAccountIdentifierLogpushJobsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostAccountsAccountIdentifierLogpushJobsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PostAccountsAccountIdentifierLogpushJobsRequest>() {
           @Override
           public void write(JsonWriter out, PostAccountsAccountIdentifierLogpushJobsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostAccountsAccountIdentifierLogpushJobsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostAccountsAccountIdentifierLogpushJobsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostAccountsAccountIdentifierLogpushJobsRequest
  * @throws IOException if the JSON string is invalid with respect to PostAccountsAccountIdentifierLogpushJobsRequest
  */
  public static PostAccountsAccountIdentifierLogpushJobsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostAccountsAccountIdentifierLogpushJobsRequest.class);
  }

 /**
  * Convert an instance of PostAccountsAccountIdentifierLogpushJobsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
