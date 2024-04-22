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
import java.math.BigDecimal;
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
 * AccessCorsHeaders
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessCorsHeaders {
  public static final String SERIALIZED_NAME_ALLOW_ALL_HEADERS = "allow_all_headers";
  @SerializedName(SERIALIZED_NAME_ALLOW_ALL_HEADERS)
  private Boolean allowAllHeaders;

  public static final String SERIALIZED_NAME_ALLOW_ALL_METHODS = "allow_all_methods";
  @SerializedName(SERIALIZED_NAME_ALLOW_ALL_METHODS)
  private Boolean allowAllMethods;

  public static final String SERIALIZED_NAME_ALLOW_ALL_ORIGINS = "allow_all_origins";
  @SerializedName(SERIALIZED_NAME_ALLOW_ALL_ORIGINS)
  private Boolean allowAllOrigins;

  public static final String SERIALIZED_NAME_ALLOW_CREDENTIALS = "allow_credentials";
  @SerializedName(SERIALIZED_NAME_ALLOW_CREDENTIALS)
  private Boolean allowCredentials;

  public static final String SERIALIZED_NAME_ALLOWED_HEADERS = "allowed_headers";
  @SerializedName(SERIALIZED_NAME_ALLOWED_HEADERS)
  private List<String> allowedHeaders = new ArrayList<>();

  /**
   * Gets or Sets allowedMethods
   */
  @JsonAdapter(AllowedMethodsEnum.Adapter.class)
  public enum AllowedMethodsEnum {
    GET("GET"),
    
    POST("POST"),
    
    HEAD("HEAD"),
    
    PUT("PUT"),
    
    DELETE("DELETE"),
    
    CONNECT("CONNECT"),
    
    OPTIONS("OPTIONS"),
    
    TRACE("TRACE"),
    
    PATCH("PATCH");

    private String value;

    AllowedMethodsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AllowedMethodsEnum fromValue(String value) {
      for (AllowedMethodsEnum b : AllowedMethodsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AllowedMethodsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AllowedMethodsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AllowedMethodsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AllowedMethodsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AllowedMethodsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ALLOWED_METHODS = "allowed_methods";
  @SerializedName(SERIALIZED_NAME_ALLOWED_METHODS)
  private List<AllowedMethodsEnum> allowedMethods = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALLOWED_ORIGINS = "allowed_origins";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ORIGINS)
  private List<String> allowedOrigins = new ArrayList<>();

  public static final String SERIALIZED_NAME_MAX_AGE = "max_age";
  @SerializedName(SERIALIZED_NAME_MAX_AGE)
  private BigDecimal maxAge;

  public AccessCorsHeaders() {
  }

  public AccessCorsHeaders allowAllHeaders(Boolean allowAllHeaders) {
    this.allowAllHeaders = allowAllHeaders;
    return this;
  }

   /**
   * Allows all HTTP request headers.
   * @return allowAllHeaders
  **/
  @javax.annotation.Nullable
  public Boolean getAllowAllHeaders() {
    return allowAllHeaders;
  }

  public void setAllowAllHeaders(Boolean allowAllHeaders) {
    this.allowAllHeaders = allowAllHeaders;
  }


  public AccessCorsHeaders allowAllMethods(Boolean allowAllMethods) {
    this.allowAllMethods = allowAllMethods;
    return this;
  }

   /**
   * Allows all HTTP request methods.
   * @return allowAllMethods
  **/
  @javax.annotation.Nullable
  public Boolean getAllowAllMethods() {
    return allowAllMethods;
  }

  public void setAllowAllMethods(Boolean allowAllMethods) {
    this.allowAllMethods = allowAllMethods;
  }


  public AccessCorsHeaders allowAllOrigins(Boolean allowAllOrigins) {
    this.allowAllOrigins = allowAllOrigins;
    return this;
  }

   /**
   * Allows all origins.
   * @return allowAllOrigins
  **/
  @javax.annotation.Nullable
  public Boolean getAllowAllOrigins() {
    return allowAllOrigins;
  }

  public void setAllowAllOrigins(Boolean allowAllOrigins) {
    this.allowAllOrigins = allowAllOrigins;
  }


  public AccessCorsHeaders allowCredentials(Boolean allowCredentials) {
    this.allowCredentials = allowCredentials;
    return this;
  }

   /**
   * When set to &#x60;true&#x60;, includes credentials (cookies, authorization headers, or TLS client certificates) with requests.
   * @return allowCredentials
  **/
  @javax.annotation.Nullable
  public Boolean getAllowCredentials() {
    return allowCredentials;
  }

  public void setAllowCredentials(Boolean allowCredentials) {
    this.allowCredentials = allowCredentials;
  }


  public AccessCorsHeaders allowedHeaders(List<String> allowedHeaders) {
    this.allowedHeaders = allowedHeaders;
    return this;
  }

  public AccessCorsHeaders addAllowedHeadersItem(String allowedHeadersItem) {
    if (this.allowedHeaders == null) {
      this.allowedHeaders = new ArrayList<>();
    }
    this.allowedHeaders.add(allowedHeadersItem);
    return this;
  }

   /**
   * Allowed HTTP request headers.
   * @return allowedHeaders
  **/
  @javax.annotation.Nullable
  public List<String> getAllowedHeaders() {
    return allowedHeaders;
  }

  public void setAllowedHeaders(List<String> allowedHeaders) {
    this.allowedHeaders = allowedHeaders;
  }


  public AccessCorsHeaders allowedMethods(List<AllowedMethodsEnum> allowedMethods) {
    this.allowedMethods = allowedMethods;
    return this;
  }

  public AccessCorsHeaders addAllowedMethodsItem(AllowedMethodsEnum allowedMethodsItem) {
    if (this.allowedMethods == null) {
      this.allowedMethods = new ArrayList<>();
    }
    this.allowedMethods.add(allowedMethodsItem);
    return this;
  }

   /**
   * Allowed HTTP request methods.
   * @return allowedMethods
  **/
  @javax.annotation.Nullable
  public List<AllowedMethodsEnum> getAllowedMethods() {
    return allowedMethods;
  }

  public void setAllowedMethods(List<AllowedMethodsEnum> allowedMethods) {
    this.allowedMethods = allowedMethods;
  }


  public AccessCorsHeaders allowedOrigins(List<String> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
    return this;
  }

  public AccessCorsHeaders addAllowedOriginsItem(String allowedOriginsItem) {
    if (this.allowedOrigins == null) {
      this.allowedOrigins = new ArrayList<>();
    }
    this.allowedOrigins.add(allowedOriginsItem);
    return this;
  }

   /**
   * Allowed origins.
   * @return allowedOrigins
  **/
  @javax.annotation.Nullable
  public List<String> getAllowedOrigins() {
    return allowedOrigins;
  }

  public void setAllowedOrigins(List<String> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
  }


  public AccessCorsHeaders maxAge(BigDecimal maxAge) {
    this.maxAge = maxAge;
    return this;
  }

   /**
   * The maximum number of seconds the results of a preflight request can be cached.
   * minimum: -1
   * maximum: 86400
   * @return maxAge
  **/
  @javax.annotation.Nullable
  public BigDecimal getMaxAge() {
    return maxAge;
  }

  public void setMaxAge(BigDecimal maxAge) {
    this.maxAge = maxAge;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessCorsHeaders accessCorsHeaders = (AccessCorsHeaders) o;
    return Objects.equals(this.allowAllHeaders, accessCorsHeaders.allowAllHeaders) &&
        Objects.equals(this.allowAllMethods, accessCorsHeaders.allowAllMethods) &&
        Objects.equals(this.allowAllOrigins, accessCorsHeaders.allowAllOrigins) &&
        Objects.equals(this.allowCredentials, accessCorsHeaders.allowCredentials) &&
        Objects.equals(this.allowedHeaders, accessCorsHeaders.allowedHeaders) &&
        Objects.equals(this.allowedMethods, accessCorsHeaders.allowedMethods) &&
        Objects.equals(this.allowedOrigins, accessCorsHeaders.allowedOrigins) &&
        Objects.equals(this.maxAge, accessCorsHeaders.maxAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAllHeaders, allowAllMethods, allowAllOrigins, allowCredentials, allowedHeaders, allowedMethods, allowedOrigins, maxAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessCorsHeaders {\n");
    sb.append("    allowAllHeaders: ").append(toIndentedString(allowAllHeaders)).append("\n");
    sb.append("    allowAllMethods: ").append(toIndentedString(allowAllMethods)).append("\n");
    sb.append("    allowAllOrigins: ").append(toIndentedString(allowAllOrigins)).append("\n");
    sb.append("    allowCredentials: ").append(toIndentedString(allowCredentials)).append("\n");
    sb.append("    allowedHeaders: ").append(toIndentedString(allowedHeaders)).append("\n");
    sb.append("    allowedMethods: ").append(toIndentedString(allowedMethods)).append("\n");
    sb.append("    allowedOrigins: ").append(toIndentedString(allowedOrigins)).append("\n");
    sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
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
    openapiFields.add("allow_all_headers");
    openapiFields.add("allow_all_methods");
    openapiFields.add("allow_all_origins");
    openapiFields.add("allow_credentials");
    openapiFields.add("allowed_headers");
    openapiFields.add("allowed_methods");
    openapiFields.add("allowed_origins");
    openapiFields.add("max_age");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessCorsHeaders
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessCorsHeaders.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessCorsHeaders is not found in the empty JSON string", AccessCorsHeaders.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessCorsHeaders.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessCorsHeaders` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_headers") != null && !jsonObj.get("allowed_headers").isJsonNull() && !jsonObj.get("allowed_headers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_headers` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_headers").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_methods") != null && !jsonObj.get("allowed_methods").isJsonNull() && !jsonObj.get("allowed_methods").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_methods` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_methods").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_origins") != null && !jsonObj.get("allowed_origins").isJsonNull() && !jsonObj.get("allowed_origins").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_origins` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_origins").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessCorsHeaders.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessCorsHeaders' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessCorsHeaders> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessCorsHeaders.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessCorsHeaders>() {
           @Override
           public void write(JsonWriter out, AccessCorsHeaders value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessCorsHeaders read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessCorsHeaders given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessCorsHeaders
  * @throws IOException if the JSON string is invalid with respect to AccessCorsHeaders
  */
  public static AccessCorsHeaders fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessCorsHeaders.class);
  }

 /**
  * Convert an instance of AccessCorsHeaders to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

