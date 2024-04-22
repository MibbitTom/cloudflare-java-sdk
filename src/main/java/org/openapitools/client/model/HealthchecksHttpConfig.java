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
 * Parameters specific to an HTTP or HTTPS health check.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class HealthchecksHttpConfig {
  public static final String SERIALIZED_NAME_ALLOW_INSECURE = "allow_insecure";
  @SerializedName(SERIALIZED_NAME_ALLOW_INSECURE)
  private Boolean allowInsecure = false;

  public static final String SERIALIZED_NAME_EXPECTED_BODY = "expected_body";
  @SerializedName(SERIALIZED_NAME_EXPECTED_BODY)
  private String expectedBody;

  public static final String SERIALIZED_NAME_EXPECTED_CODES = "expected_codes";
  @SerializedName(SERIALIZED_NAME_EXPECTED_CODES)
  private List<String> expectedCodes;

  public static final String SERIALIZED_NAME_FOLLOW_REDIRECTS = "follow_redirects";
  @SerializedName(SERIALIZED_NAME_FOLLOW_REDIRECTS)
  private Boolean followRedirects = false;

  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private Object header;

  /**
   * The HTTP method to use for the health check.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    GET("GET"),
    
    HEAD("HEAD");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MethodEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method = MethodEnum.GET;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path = "/";

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port = 80;

  public HealthchecksHttpConfig() {
  }

  public HealthchecksHttpConfig allowInsecure(Boolean allowInsecure) {
    this.allowInsecure = allowInsecure;
    return this;
  }

   /**
   * Do not validate the certificate when the health check uses HTTPS.
   * @return allowInsecure
  **/
  @javax.annotation.Nullable
  public Boolean getAllowInsecure() {
    return allowInsecure;
  }

  public void setAllowInsecure(Boolean allowInsecure) {
    this.allowInsecure = allowInsecure;
  }


  public HealthchecksHttpConfig expectedBody(String expectedBody) {
    this.expectedBody = expectedBody;
    return this;
  }

   /**
   * A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy.
   * @return expectedBody
  **/
  @javax.annotation.Nullable
  public String getExpectedBody() {
    return expectedBody;
  }

  public void setExpectedBody(String expectedBody) {
    this.expectedBody = expectedBody;
  }


  public HealthchecksHttpConfig expectedCodes(List<String> expectedCodes) {
    this.expectedCodes = expectedCodes;
    return this;
  }

  public HealthchecksHttpConfig addExpectedCodesItem(String expectedCodesItem) {
    if (this.expectedCodes == null) {
      this.expectedCodes = new ArrayList<>();
    }
    this.expectedCodes.add(expectedCodesItem);
    return this;
  }

   /**
   * The expected HTTP response codes (e.g. \&quot;200\&quot;) or code ranges (e.g. \&quot;2xx\&quot; for all codes starting with 2) of the health check.
   * @return expectedCodes
  **/
  @javax.annotation.Nullable
  public List<String> getExpectedCodes() {
    return expectedCodes;
  }

  public void setExpectedCodes(List<String> expectedCodes) {
    this.expectedCodes = expectedCodes;
  }


  public HealthchecksHttpConfig followRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
    return this;
  }

   /**
   * Follow redirects if the origin returns a 3xx status code.
   * @return followRedirects
  **/
  @javax.annotation.Nullable
  public Boolean getFollowRedirects() {
    return followRedirects;
  }

  public void setFollowRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
  }


  public HealthchecksHttpConfig header(Object header) {
    this.header = header;
    return this;
  }

   /**
   * The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden.
   * @return header
  **/
  @javax.annotation.Nullable
  public Object getHeader() {
    return header;
  }

  public void setHeader(Object header) {
    this.header = header;
  }


  public HealthchecksHttpConfig method(MethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * The HTTP method to use for the health check.
   * @return method
  **/
  @javax.annotation.Nullable
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public HealthchecksHttpConfig path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The endpoint path to health check against.
   * @return path
  **/
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public HealthchecksHttpConfig port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port number to connect to for the health check. Defaults to 80 if type is HTTP or 443 if type is HTTPS.
   * @return port
  **/
  @javax.annotation.Nullable
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthchecksHttpConfig healthchecksHttpConfig = (HealthchecksHttpConfig) o;
    return Objects.equals(this.allowInsecure, healthchecksHttpConfig.allowInsecure) &&
        Objects.equals(this.expectedBody, healthchecksHttpConfig.expectedBody) &&
        Objects.equals(this.expectedCodes, healthchecksHttpConfig.expectedCodes) &&
        Objects.equals(this.followRedirects, healthchecksHttpConfig.followRedirects) &&
        Objects.equals(this.header, healthchecksHttpConfig.header) &&
        Objects.equals(this.method, healthchecksHttpConfig.method) &&
        Objects.equals(this.path, healthchecksHttpConfig.path) &&
        Objects.equals(this.port, healthchecksHttpConfig.port);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowInsecure, expectedBody, expectedCodes, followRedirects, header, method, path, port);
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
    sb.append("class HealthchecksHttpConfig {\n");
    sb.append("    allowInsecure: ").append(toIndentedString(allowInsecure)).append("\n");
    sb.append("    expectedBody: ").append(toIndentedString(expectedBody)).append("\n");
    sb.append("    expectedCodes: ").append(toIndentedString(expectedCodes)).append("\n");
    sb.append("    followRedirects: ").append(toIndentedString(followRedirects)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
    openapiFields.add("allow_insecure");
    openapiFields.add("expected_body");
    openapiFields.add("expected_codes");
    openapiFields.add("follow_redirects");
    openapiFields.add("header");
    openapiFields.add("method");
    openapiFields.add("path");
    openapiFields.add("port");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to HealthchecksHttpConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HealthchecksHttpConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HealthchecksHttpConfig is not found in the empty JSON string", HealthchecksHttpConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HealthchecksHttpConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HealthchecksHttpConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("expected_body") != null && !jsonObj.get("expected_body").isJsonNull()) && !jsonObj.get("expected_body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expected_body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expected_body").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("expected_codes") != null && !jsonObj.get("expected_codes").isJsonNull() && !jsonObj.get("expected_codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `expected_codes` to be an array in the JSON string but got `%s`", jsonObj.get("expected_codes").toString()));
      }
      if ((jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      // validate the optional field `method`
      if (jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) {
        MethodEnum.validateJsonElement(jsonObj.get("method"));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HealthchecksHttpConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HealthchecksHttpConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HealthchecksHttpConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HealthchecksHttpConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<HealthchecksHttpConfig>() {
           @Override
           public void write(JsonWriter out, HealthchecksHttpConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HealthchecksHttpConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HealthchecksHttpConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HealthchecksHttpConfig
  * @throws IOException if the JSON string is invalid with respect to HealthchecksHttpConfig
  */
  public static HealthchecksHttpConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HealthchecksHttpConfig.class);
  }

 /**
  * Convert an instance of HealthchecksHttpConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
