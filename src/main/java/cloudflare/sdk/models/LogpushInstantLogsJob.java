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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
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

import cloudflare.JSON;

/**
 * LogpushInstantLogsJob
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class LogpushInstantLogsJob {
  public static final String SERIALIZED_NAME_DESTINATION_CONF = "destination_conf";
  @SerializedName(SERIALIZED_NAME_DESTINATION_CONF)
  private URI destinationConf;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private String fields;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_SAMPLE = "sample";
  @SerializedName(SERIALIZED_NAME_SAMPLE)
  private Integer sample;

  public static final String SERIALIZED_NAME_SESSION_ID = "session_id";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public LogpushInstantLogsJob() {
  }

  public LogpushInstantLogsJob destinationConf(URI destinationConf) {
    this.destinationConf = destinationConf;
    return this;
  }

   /**
   * Unique WebSocket address that will receive messages from Cloudflare’s edge.
   * @return destinationConf
  **/
  @javax.annotation.Nullable
  public URI getDestinationConf() {
    return destinationConf;
  }

  public void setDestinationConf(URI destinationConf) {
    this.destinationConf = destinationConf;
  }


  public LogpushInstantLogsJob fields(String fields) {
    this.fields = fields;
    return this;
  }

   /**
   * Comma-separated list of fields.
   * @return fields
  **/
  @javax.annotation.Nullable
  public String getFields() {
    return fields;
  }

  public void setFields(String fields) {
    this.fields = fields;
  }


  public LogpushInstantLogsJob filter(String filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Filters to drill down into specific events.
   * @return filter
  **/
  @javax.annotation.Nullable
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }


  public LogpushInstantLogsJob sample(Integer sample) {
    this.sample = sample;
    return this;
  }

   /**
   * The sample parameter is the sample rate of the records set by the client: \&quot;sample\&quot;: 1 is 100% of records \&quot;sample\&quot;: 10 is 10% and so on.
   * @return sample
  **/
  @javax.annotation.Nullable
  public Integer getSample() {
    return sample;
  }

  public void setSample(Integer sample) {
    this.sample = sample;
  }


  public LogpushInstantLogsJob sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Unique session id of the job.
   * @return sessionId
  **/
  @javax.annotation.Nullable
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogpushInstantLogsJob logpushInstantLogsJob = (LogpushInstantLogsJob) o;
    return Objects.equals(this.destinationConf, logpushInstantLogsJob.destinationConf) &&
        Objects.equals(this.fields, logpushInstantLogsJob.fields) &&
        Objects.equals(this.filter, logpushInstantLogsJob.filter) &&
        Objects.equals(this.sample, logpushInstantLogsJob.sample) &&
        Objects.equals(this.sessionId, logpushInstantLogsJob.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationConf, fields, filter, sample, sessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogpushInstantLogsJob {\n");
    sb.append("    destinationConf: ").append(toIndentedString(destinationConf)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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
    openapiFields.add("destination_conf");
    openapiFields.add("fields");
    openapiFields.add("filter");
    openapiFields.add("sample");
    openapiFields.add("session_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LogpushInstantLogsJob
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LogpushInstantLogsJob.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LogpushInstantLogsJob is not found in the empty JSON string", LogpushInstantLogsJob.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LogpushInstantLogsJob.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LogpushInstantLogsJob` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("destination_conf") != null && !jsonObj.get("destination_conf").isJsonNull()) && !jsonObj.get("destination_conf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination_conf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination_conf").toString()));
      }
      if ((jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull()) && !jsonObj.get("fields").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fields` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fields").toString()));
      }
      if ((jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      if ((jsonObj.get("session_id") != null && !jsonObj.get("session_id").isJsonNull()) && !jsonObj.get("session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LogpushInstantLogsJob.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LogpushInstantLogsJob' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LogpushInstantLogsJob> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LogpushInstantLogsJob.class));

       return (TypeAdapter<T>) new TypeAdapter<LogpushInstantLogsJob>() {
           @Override
           public void write(JsonWriter out, LogpushInstantLogsJob value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LogpushInstantLogsJob read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LogpushInstantLogsJob given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LogpushInstantLogsJob
  * @throws IOException if the JSON string is invalid with respect to LogpushInstantLogsJob
  */
  public static LogpushInstantLogsJob fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LogpushInstantLogsJob.class);
  }

 /**
  * Convert an instance of LogpushInstantLogsJob to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
