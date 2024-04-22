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
import org.openapitools.client.model.DigitalExperienceMonitoringHttpDetailsResponseHttpStats;
import org.openapitools.client.model.DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner;
import org.openapitools.client.model.DigitalExperienceMonitoringHttpDetailsResponseTargetPoliciesInner;
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
 * DigitalExperienceMonitoringHttpDetailsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DigitalExperienceMonitoringHttpDetailsResponse {
  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_HTTP_STATS = "httpStats";
  @SerializedName(SERIALIZED_NAME_HTTP_STATS)
  private DigitalExperienceMonitoringHttpDetailsResponseHttpStats httpStats;

  public static final String SERIALIZED_NAME_HTTP_STATS_BY_COLO = "httpStatsByColo";
  @SerializedName(SERIALIZED_NAME_HTTP_STATS_BY_COLO)
  private List<DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner> httpStatsByColo = new ArrayList<>();

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private String interval;

  /**
   * Gets or Sets kind
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    HTTP("http");

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

  public DigitalExperienceMonitoringHttpDetailsResponse() {
  }

  public DigitalExperienceMonitoringHttpDetailsResponse host(String host) {
    this.host = host;
    return this;
  }

   /**
   * The url of the HTTP synthetic application test
   * @return host
  **/
  @javax.annotation.Nullable
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  public DigitalExperienceMonitoringHttpDetailsResponse httpStats(DigitalExperienceMonitoringHttpDetailsResponseHttpStats httpStats) {
    this.httpStats = httpStats;
    return this;
  }

   /**
   * Get httpStats
   * @return httpStats
  **/
  @javax.annotation.Nullable
  public DigitalExperienceMonitoringHttpDetailsResponseHttpStats getHttpStats() {
    return httpStats;
  }

  public void setHttpStats(DigitalExperienceMonitoringHttpDetailsResponseHttpStats httpStats) {
    this.httpStats = httpStats;
  }


  public DigitalExperienceMonitoringHttpDetailsResponse httpStatsByColo(List<DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner> httpStatsByColo) {
    this.httpStatsByColo = httpStatsByColo;
    return this;
  }

  public DigitalExperienceMonitoringHttpDetailsResponse addHttpStatsByColoItem(DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner httpStatsByColoItem) {
    if (this.httpStatsByColo == null) {
      this.httpStatsByColo = new ArrayList<>();
    }
    this.httpStatsByColo.add(httpStatsByColoItem);
    return this;
  }

   /**
   * Get httpStatsByColo
   * @return httpStatsByColo
  **/
  @javax.annotation.Nullable
  public List<DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner> getHttpStatsByColo() {
    return httpStatsByColo;
  }

  public void setHttpStatsByColo(List<DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner> httpStatsByColo) {
    this.httpStatsByColo = httpStatsByColo;
  }


  public DigitalExperienceMonitoringHttpDetailsResponse interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * The interval at which the HTTP synthetic application test is set to run.
   * @return interval
  **/
  @javax.annotation.Nullable
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }


  public DigitalExperienceMonitoringHttpDetailsResponse kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }


  public DigitalExperienceMonitoringHttpDetailsResponse method(String method) {
    this.method = method;
    return this;
  }

   /**
   * The HTTP method to use when running the test
   * @return method
  **/
  @javax.annotation.Nullable
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  public DigitalExperienceMonitoringHttpDetailsResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the HTTP synthetic application test
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DigitalExperienceMonitoringHttpDetailsResponse targetPolicies(List<DigitalExperienceMonitoringHttpDetailsResponseTargetPoliciesInner> targetPolicies) {
    this.targetPolicies = targetPolicies;
    return this;
  }

  public DigitalExperienceMonitoringHttpDetailsResponse addTargetPoliciesItem(DigitalExperienceMonitoringHttpDetailsResponseTargetPoliciesInner targetPoliciesItem) {
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


  public DigitalExperienceMonitoringHttpDetailsResponse targeted(Boolean targeted) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalExperienceMonitoringHttpDetailsResponse digitalExperienceMonitoringHttpDetailsResponse = (DigitalExperienceMonitoringHttpDetailsResponse) o;
    return Objects.equals(this.host, digitalExperienceMonitoringHttpDetailsResponse.host) &&
        Objects.equals(this.httpStats, digitalExperienceMonitoringHttpDetailsResponse.httpStats) &&
        Objects.equals(this.httpStatsByColo, digitalExperienceMonitoringHttpDetailsResponse.httpStatsByColo) &&
        Objects.equals(this.interval, digitalExperienceMonitoringHttpDetailsResponse.interval) &&
        Objects.equals(this.kind, digitalExperienceMonitoringHttpDetailsResponse.kind) &&
        Objects.equals(this.method, digitalExperienceMonitoringHttpDetailsResponse.method) &&
        Objects.equals(this.name, digitalExperienceMonitoringHttpDetailsResponse.name) &&
        Objects.equals(this.targetPolicies, digitalExperienceMonitoringHttpDetailsResponse.targetPolicies) &&
        Objects.equals(this.targeted, digitalExperienceMonitoringHttpDetailsResponse.targeted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, httpStats, httpStatsByColo, interval, kind, method, name, targetPolicies, targeted);
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
    sb.append("class DigitalExperienceMonitoringHttpDetailsResponse {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    httpStats: ").append(toIndentedString(httpStats)).append("\n");
    sb.append("    httpStatsByColo: ").append(toIndentedString(httpStatsByColo)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetPolicies: ").append(toIndentedString(targetPolicies)).append("\n");
    sb.append("    targeted: ").append(toIndentedString(targeted)).append("\n");
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
    openapiFields.add("host");
    openapiFields.add("httpStats");
    openapiFields.add("httpStatsByColo");
    openapiFields.add("interval");
    openapiFields.add("kind");
    openapiFields.add("method");
    openapiFields.add("name");
    openapiFields.add("target_policies");
    openapiFields.add("targeted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DigitalExperienceMonitoringHttpDetailsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DigitalExperienceMonitoringHttpDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DigitalExperienceMonitoringHttpDetailsResponse is not found in the empty JSON string", DigitalExperienceMonitoringHttpDetailsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DigitalExperienceMonitoringHttpDetailsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DigitalExperienceMonitoringHttpDetailsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) && !jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      // validate the optional field `httpStats`
      if (jsonObj.get("httpStats") != null && !jsonObj.get("httpStats").isJsonNull()) {
        DigitalExperienceMonitoringHttpDetailsResponseHttpStats.validateJsonElement(jsonObj.get("httpStats"));
      }
      if (jsonObj.get("httpStatsByColo") != null && !jsonObj.get("httpStatsByColo").isJsonNull()) {
        JsonArray jsonArrayhttpStatsByColo = jsonObj.getAsJsonArray("httpStatsByColo");
        if (jsonArrayhttpStatsByColo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("httpStatsByColo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `httpStatsByColo` to be an array in the JSON string but got `%s`", jsonObj.get("httpStatsByColo").toString()));
          }

          // validate the optional field `httpStatsByColo` (array)
          for (int i = 0; i < jsonArrayhttpStatsByColo.size(); i++) {
            DigitalExperienceMonitoringHttpDetailsResponseHttpStatsByColoInner.validateJsonElement(jsonArrayhttpStatsByColo.get(i));
          };
        }
      }
      if ((jsonObj.get("interval") != null && !jsonObj.get("interval").isJsonNull()) && !jsonObj.get("interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interval").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `kind`
      if (jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) {
        KindEnum.validateJsonElement(jsonObj.get("kind"));
      }
      if ((jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DigitalExperienceMonitoringHttpDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DigitalExperienceMonitoringHttpDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DigitalExperienceMonitoringHttpDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DigitalExperienceMonitoringHttpDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DigitalExperienceMonitoringHttpDetailsResponse>() {
           @Override
           public void write(JsonWriter out, DigitalExperienceMonitoringHttpDetailsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DigitalExperienceMonitoringHttpDetailsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DigitalExperienceMonitoringHttpDetailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DigitalExperienceMonitoringHttpDetailsResponse
  * @throws IOException if the JSON string is invalid with respect to DigitalExperienceMonitoringHttpDetailsResponse
  */
  public static DigitalExperienceMonitoringHttpDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DigitalExperienceMonitoringHttpDetailsResponse.class);
  }

 /**
  * Convert an instance of DigitalExperienceMonitoringHttpDetailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

