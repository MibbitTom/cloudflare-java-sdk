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
import org.openapitools.client.model.DigitalExperienceMonitoringHttpDetailsResponseTargetPoliciesInner;
import org.openapitools.client.model.DigitalExperienceMonitoringTestsResponseTestsInnerHttpResults;
import org.openapitools.client.model.DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner;
import org.openapitools.client.model.DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResults;
import org.openapitools.client.model.DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResultsByColoInner;
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
 * DigitalExperienceMonitoringTestsResponseTestsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DigitalExperienceMonitoringTestsResponseTestsInner {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_HTTP_RESULTS = "httpResults";
  @SerializedName(SERIALIZED_NAME_HTTP_RESULTS)
  private DigitalExperienceMonitoringTestsResponseTestsInnerHttpResults httpResults;

  public static final String SERIALIZED_NAME_HTTP_RESULTS_BY_COLO = "httpResultsByColo";
  @SerializedName(SERIALIZED_NAME_HTTP_RESULTS_BY_COLO)
  private List<DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner> httpResultsByColo = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private String interval;

  /**
   * test type, http or traceroute
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    HTTP("http"),
    
    TRACEROUTE("traceroute");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KindEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      KindEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private KindEnum kind;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TARGET_POLICIES = "target_policies";
  @SerializedName(SERIALIZED_NAME_TARGET_POLICIES)
  private List<DigitalExperienceMonitoringHttpDetailsResponseTargetPoliciesInner> targetPolicies;

  public static final String SERIALIZED_NAME_TARGETED = "targeted";
  @SerializedName(SERIALIZED_NAME_TARGETED)
  private Boolean targeted;

  public static final String SERIALIZED_NAME_TRACEROUTE_RESULTS = "tracerouteResults";
  @SerializedName(SERIALIZED_NAME_TRACEROUTE_RESULTS)
  private DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResults tracerouteResults;

  public static final String SERIALIZED_NAME_TRACEROUTE_RESULTS_BY_COLO = "tracerouteResultsByColo";
  @SerializedName(SERIALIZED_NAME_TRACEROUTE_RESULTS_BY_COLO)
  private List<DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResultsByColoInner> tracerouteResultsByColo = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private String updated;

  public DigitalExperienceMonitoringTestsResponseTestsInner() {
  }

  public DigitalExperienceMonitoringTestsResponseTestsInner created(String created) {
    this.created = created;
    return this;
  }

   /**
   * date the test was created.
   * @return created
  **/
  @javax.annotation.Nonnull
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }


  public DigitalExperienceMonitoringTestsResponseTestsInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * the test description defined during configuration
   * @return description
  **/
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public DigitalExperienceMonitoringTestsResponseTestsInner enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * if true, then the test will run on targeted devices. Else, the test will not run.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public DigitalExperienceMonitoringTestsResponseTestsInner host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nonnull
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  public DigitalExperienceMonitoringTestsResponseTestsInner httpResults(DigitalExperienceMonitoringTestsResponseTestsInnerHttpResults httpResults) {
    this.httpResults = httpResults;
    return this;
  }

   /**
   * Get httpResults
   * @return httpResults
  **/
  @javax.annotation.Nullable
  public DigitalExperienceMonitoringTestsResponseTestsInnerHttpResults getHttpResults() {
    return httpResults;
  }

  public void setHttpResults(DigitalExperienceMonitoringTestsResponseTestsInnerHttpResults httpResults) {
    this.httpResults = httpResults;
  }


  public DigitalExperienceMonitoringTestsResponseTestsInner httpResultsByColo(List<DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner> httpResultsByColo) {
    this.httpResultsByColo = httpResultsByColo;
    return this;
  }

  public DigitalExperienceMonitoringTestsResponseTestsInner addHttpResultsByColoItem(DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner httpResultsByColoItem) {
    if (this.httpResultsByColo == null) {
      this.httpResultsByColo = new ArrayList<>();
    }
    this.httpResultsByColo.add(httpResultsByColoItem);
    return this;
  }

   /**
   * Get httpResultsByColo
   * @return httpResultsByColo
  **/
  @javax.annotation.Nullable
  public List<DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner> getHttpResultsByColo() {
    return httpResultsByColo;
  }

  public void setHttpResultsByColo(List<DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner> httpResultsByColo) {
    this.httpResultsByColo = httpResultsByColo;
  }


  public DigitalExperienceMonitoringTestsResponseTestsInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * API Resource UUID tag.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public DigitalExperienceMonitoringTestsResponseTestsInner interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * The interval at which the synthetic application test is set to run.
   * @return interval
  **/
  @javax.annotation.Nonnull
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }


  public DigitalExperienceMonitoringTestsResponseTestsInner kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * test type, http or traceroute
   * @return kind
  **/
  @javax.annotation.Nonnull
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }


  public DigitalExperienceMonitoringTestsResponseTestsInner method(String method) {
    this.method = method;
    return this;
  }

   /**
   * for HTTP, the method to use when running the test
   * @return method
  **/
  @javax.annotation.Nullable
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  public DigitalExperienceMonitoringTestsResponseTestsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name given to this test
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DigitalExperienceMonitoringTestsResponseTestsInner targetPolicies(List<DigitalExperienceMonitoringHttpDetailsResponseTargetPoliciesInner> targetPolicies) {
    this.targetPolicies = targetPolicies;
    return this;
  }

  public DigitalExperienceMonitoringTestsResponseTestsInner addTargetPoliciesItem(DigitalExperienceMonitoringHttpDetailsResponseTargetPoliciesInner targetPoliciesItem) {
    if (this.targetPolicies == null) {
      this.targetPolicies = new ArrayList<>();
    }
    this.targetPolicies.add(targetPoliciesItem);
    return this;
  }

   /**
   * Get targetPolicies
   * @return targetPolicies
  **/
  @javax.annotation.Nullable
  public List<DigitalExperienceMonitoringHttpDetailsResponseTargetPoliciesInner> getTargetPolicies() {
    return targetPolicies;
  }

  public void setTargetPolicies(List<DigitalExperienceMonitoringHttpDetailsResponseTargetPoliciesInner> targetPolicies) {
    this.targetPolicies = targetPolicies;
  }


  public DigitalExperienceMonitoringTestsResponseTestsInner targeted(Boolean targeted) {
    this.targeted = targeted;
    return this;
  }

   /**
   * Get targeted
   * @return targeted
  **/
  @javax.annotation.Nullable
  public Boolean getTargeted() {
    return targeted;
  }

  public void setTargeted(Boolean targeted) {
    this.targeted = targeted;
  }


  public DigitalExperienceMonitoringTestsResponseTestsInner tracerouteResults(DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResults tracerouteResults) {
    this.tracerouteResults = tracerouteResults;
    return this;
  }

   /**
   * Get tracerouteResults
   * @return tracerouteResults
  **/
  @javax.annotation.Nullable
  public DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResults getTracerouteResults() {
    return tracerouteResults;
  }

  public void setTracerouteResults(DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResults tracerouteResults) {
    this.tracerouteResults = tracerouteResults;
  }


  public DigitalExperienceMonitoringTestsResponseTestsInner tracerouteResultsByColo(List<DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResultsByColoInner> tracerouteResultsByColo) {
    this.tracerouteResultsByColo = tracerouteResultsByColo;
    return this;
  }

  public DigitalExperienceMonitoringTestsResponseTestsInner addTracerouteResultsByColoItem(DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResultsByColoInner tracerouteResultsByColoItem) {
    if (this.tracerouteResultsByColo == null) {
      this.tracerouteResultsByColo = new ArrayList<>();
    }
    this.tracerouteResultsByColo.add(tracerouteResultsByColoItem);
    return this;
  }

   /**
   * Get tracerouteResultsByColo
   * @return tracerouteResultsByColo
  **/
  @javax.annotation.Nullable
  public List<DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResultsByColoInner> getTracerouteResultsByColo() {
    return tracerouteResultsByColo;
  }

  public void setTracerouteResultsByColo(List<DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResultsByColoInner> tracerouteResultsByColo) {
    this.tracerouteResultsByColo = tracerouteResultsByColo;
  }


  public DigitalExperienceMonitoringTestsResponseTestsInner updated(String updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nonnull
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalExperienceMonitoringTestsResponseTestsInner digitalExperienceMonitoringTestsResponseTestsInner = (DigitalExperienceMonitoringTestsResponseTestsInner) o;
    return Objects.equals(this.created, digitalExperienceMonitoringTestsResponseTestsInner.created) &&
        Objects.equals(this.description, digitalExperienceMonitoringTestsResponseTestsInner.description) &&
        Objects.equals(this.enabled, digitalExperienceMonitoringTestsResponseTestsInner.enabled) &&
        Objects.equals(this.host, digitalExperienceMonitoringTestsResponseTestsInner.host) &&
        Objects.equals(this.httpResults, digitalExperienceMonitoringTestsResponseTestsInner.httpResults) &&
        Objects.equals(this.httpResultsByColo, digitalExperienceMonitoringTestsResponseTestsInner.httpResultsByColo) &&
        Objects.equals(this.id, digitalExperienceMonitoringTestsResponseTestsInner.id) &&
        Objects.equals(this.interval, digitalExperienceMonitoringTestsResponseTestsInner.interval) &&
        Objects.equals(this.kind, digitalExperienceMonitoringTestsResponseTestsInner.kind) &&
        Objects.equals(this.method, digitalExperienceMonitoringTestsResponseTestsInner.method) &&
        Objects.equals(this.name, digitalExperienceMonitoringTestsResponseTestsInner.name) &&
        Objects.equals(this.targetPolicies, digitalExperienceMonitoringTestsResponseTestsInner.targetPolicies) &&
        Objects.equals(this.targeted, digitalExperienceMonitoringTestsResponseTestsInner.targeted) &&
        Objects.equals(this.tracerouteResults, digitalExperienceMonitoringTestsResponseTestsInner.tracerouteResults) &&
        Objects.equals(this.tracerouteResultsByColo, digitalExperienceMonitoringTestsResponseTestsInner.tracerouteResultsByColo) &&
        Objects.equals(this.updated, digitalExperienceMonitoringTestsResponseTestsInner.updated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, description, enabled, host, httpResults, httpResultsByColo, id, interval, kind, method, name, targetPolicies, targeted, tracerouteResults, tracerouteResultsByColo, updated);
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
    sb.append("class DigitalExperienceMonitoringTestsResponseTestsInner {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    httpResults: ").append(toIndentedString(httpResults)).append("\n");
    sb.append("    httpResultsByColo: ").append(toIndentedString(httpResultsByColo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetPolicies: ").append(toIndentedString(targetPolicies)).append("\n");
    sb.append("    targeted: ").append(toIndentedString(targeted)).append("\n");
    sb.append("    tracerouteResults: ").append(toIndentedString(tracerouteResults)).append("\n");
    sb.append("    tracerouteResultsByColo: ").append(toIndentedString(tracerouteResultsByColo)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    openapiFields.add("created");
    openapiFields.add("description");
    openapiFields.add("enabled");
    openapiFields.add("host");
    openapiFields.add("httpResults");
    openapiFields.add("httpResultsByColo");
    openapiFields.add("id");
    openapiFields.add("interval");
    openapiFields.add("kind");
    openapiFields.add("method");
    openapiFields.add("name");
    openapiFields.add("target_policies");
    openapiFields.add("targeted");
    openapiFields.add("tracerouteResults");
    openapiFields.add("tracerouteResultsByColo");
    openapiFields.add("updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("host");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("interval");
    openapiRequiredFields.add("kind");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("updated");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DigitalExperienceMonitoringTestsResponseTestsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DigitalExperienceMonitoringTestsResponseTestsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DigitalExperienceMonitoringTestsResponseTestsInner is not found in the empty JSON string", DigitalExperienceMonitoringTestsResponseTestsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DigitalExperienceMonitoringTestsResponseTestsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DigitalExperienceMonitoringTestsResponseTestsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DigitalExperienceMonitoringTestsResponseTestsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      // validate the optional field `httpResults`
      if (jsonObj.get("httpResults") != null && !jsonObj.get("httpResults").isJsonNull()) {
        DigitalExperienceMonitoringTestsResponseTestsInnerHttpResults.validateJsonElement(jsonObj.get("httpResults"));
      }
      if (jsonObj.get("httpResultsByColo") != null && !jsonObj.get("httpResultsByColo").isJsonNull()) {
        JsonArray jsonArrayhttpResultsByColo = jsonObj.getAsJsonArray("httpResultsByColo");
        if (jsonArrayhttpResultsByColo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("httpResultsByColo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `httpResultsByColo` to be an array in the JSON string but got `%s`", jsonObj.get("httpResultsByColo").toString()));
          }

          // validate the optional field `httpResultsByColo` (array)
          for (int i = 0; i < jsonArrayhttpResultsByColo.size(); i++) {
            DigitalExperienceMonitoringTestsResponseTestsInnerHttpResultsByColoInner.validateJsonElement(jsonArrayhttpResultsByColo.get(i));
          };
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interval").toString()));
      }
      if (!jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the required field `kind`
      KindEnum.validateJsonElement(jsonObj.get("kind"));
      if ((jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("target_policies") != null && !jsonObj.get("target_policies").isJsonNull()) {
        JsonArray jsonArraytargetPolicies = jsonObj.getAsJsonArray("target_policies");
        if (jsonArraytargetPolicies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("target_policies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `target_policies` to be an array in the JSON string but got `%s`", jsonObj.get("target_policies").toString()));
          }

          // validate the optional field `target_policies` (array)
          for (int i = 0; i < jsonArraytargetPolicies.size(); i++) {
            DigitalExperienceMonitoringHttpDetailsResponseTargetPoliciesInner.validateJsonElement(jsonArraytargetPolicies.get(i));
          };
        }
      }
      // validate the optional field `tracerouteResults`
      if (jsonObj.get("tracerouteResults") != null && !jsonObj.get("tracerouteResults").isJsonNull()) {
        DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResults.validateJsonElement(jsonObj.get("tracerouteResults"));
      }
      if (jsonObj.get("tracerouteResultsByColo") != null && !jsonObj.get("tracerouteResultsByColo").isJsonNull()) {
        JsonArray jsonArraytracerouteResultsByColo = jsonObj.getAsJsonArray("tracerouteResultsByColo");
        if (jsonArraytracerouteResultsByColo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tracerouteResultsByColo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tracerouteResultsByColo` to be an array in the JSON string but got `%s`", jsonObj.get("tracerouteResultsByColo").toString()));
          }

          // validate the optional field `tracerouteResultsByColo` (array)
          for (int i = 0; i < jsonArraytracerouteResultsByColo.size(); i++) {
            DigitalExperienceMonitoringTestsResponseTestsInnerTracerouteResultsByColoInner.validateJsonElement(jsonArraytracerouteResultsByColo.get(i));
          };
        }
      }
      if (!jsonObj.get("updated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DigitalExperienceMonitoringTestsResponseTestsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DigitalExperienceMonitoringTestsResponseTestsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DigitalExperienceMonitoringTestsResponseTestsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DigitalExperienceMonitoringTestsResponseTestsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DigitalExperienceMonitoringTestsResponseTestsInner>() {
           @Override
           public void write(JsonWriter out, DigitalExperienceMonitoringTestsResponseTestsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DigitalExperienceMonitoringTestsResponseTestsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DigitalExperienceMonitoringTestsResponseTestsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DigitalExperienceMonitoringTestsResponseTestsInner
  * @throws IOException if the JSON string is invalid with respect to DigitalExperienceMonitoringTestsResponseTestsInner
  */
  public static DigitalExperienceMonitoringTestsResponseTestsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DigitalExperienceMonitoringTestsResponseTestsInner.class);
  }

 /**
  * Convert an instance of DigitalExperienceMonitoringTestsResponseTestsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
