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
import cloudflare.sdk.models.TlsCertificatesAndHostnamesCertificateAuthority;
import cloudflare.sdk.models.TlsCertificatesAndHostnamesSslsettings;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * TlsCertificatesAndHostnamesSslpostOneOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TlsCertificatesAndHostnamesSslpostOneOf {
  /**
   * A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
   */
  @JsonAdapter(BundleMethodEnum.Adapter.class)
  public enum BundleMethodEnum {
    UBIQUITOUS("ubiquitous"),
    
    OPTIMAL("optimal"),
    
    FORCE("force");

    private String value;

    BundleMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BundleMethodEnum fromValue(String value) {
      for (BundleMethodEnum b : BundleMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BundleMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BundleMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BundleMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BundleMethodEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      BundleMethodEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_BUNDLE_METHOD = "bundle_method";
  @SerializedName(SERIALIZED_NAME_BUNDLE_METHOD)
  private BundleMethodEnum bundleMethod = BundleMethodEnum.UBIQUITOUS;

  public static final String SERIALIZED_NAME_CERTIFICATE_AUTHORITY = "certificate_authority";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_AUTHORITY)
  private TlsCertificatesAndHostnamesCertificateAuthority certificateAuthority;

  public static final String SERIALIZED_NAME_CUSTOM_CERTIFICATE = "custom_certificate";
  @SerializedName(SERIALIZED_NAME_CUSTOM_CERTIFICATE)
  private String customCertificate;

  public static final String SERIALIZED_NAME_CUSTOM_KEY = "custom_key";
  @SerializedName(SERIALIZED_NAME_CUSTOM_KEY)
  private String customKey;

  /**
   * Domain control validation (DCV) method used for this hostname.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    HTTP("http"),
    
    TXT("txt"),
    
    EMAIL("email");

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
  private MethodEnum method;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private TlsCertificatesAndHostnamesSslsettings settings;

  /**
   * Level of validation to be used for this hostname. Domain validation (dv) must be used.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DV("dv");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_WILDCARD = "wildcard";
  @SerializedName(SERIALIZED_NAME_WILDCARD)
  private Boolean wildcard;

  public TlsCertificatesAndHostnamesSslpostOneOf() {
  }

  public TlsCertificatesAndHostnamesSslpostOneOf bundleMethod(BundleMethodEnum bundleMethod) {
    this.bundleMethod = bundleMethod;
    return this;
  }

   /**
   * A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it.
   * @return bundleMethod
  **/
  @javax.annotation.Nullable
  public BundleMethodEnum getBundleMethod() {
    return bundleMethod;
  }

  public void setBundleMethod(BundleMethodEnum bundleMethod) {
    this.bundleMethod = bundleMethod;
  }


  public TlsCertificatesAndHostnamesSslpostOneOf certificateAuthority(TlsCertificatesAndHostnamesCertificateAuthority certificateAuthority) {
    this.certificateAuthority = certificateAuthority;
    return this;
  }

   /**
   * Get certificateAuthority
   * @return certificateAuthority
  **/
  @javax.annotation.Nullable
  public TlsCertificatesAndHostnamesCertificateAuthority getCertificateAuthority() {
    return certificateAuthority;
  }

  public void setCertificateAuthority(TlsCertificatesAndHostnamesCertificateAuthority certificateAuthority) {
    this.certificateAuthority = certificateAuthority;
  }


  public TlsCertificatesAndHostnamesSslpostOneOf customCertificate(String customCertificate) {
    this.customCertificate = customCertificate;
    return this;
  }

   /**
   * If a custom uploaded certificate is used.
   * @return customCertificate
  **/
  @javax.annotation.Nullable
  public String getCustomCertificate() {
    return customCertificate;
  }

  public void setCustomCertificate(String customCertificate) {
    this.customCertificate = customCertificate;
  }


  public TlsCertificatesAndHostnamesSslpostOneOf customKey(String customKey) {
    this.customKey = customKey;
    return this;
  }

   /**
   * The key for a custom uploaded certificate.
   * @return customKey
  **/
  @javax.annotation.Nullable
  public String getCustomKey() {
    return customKey;
  }

  public void setCustomKey(String customKey) {
    this.customKey = customKey;
  }


  public TlsCertificatesAndHostnamesSslpostOneOf method(MethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * Domain control validation (DCV) method used for this hostname.
   * @return method
  **/
  @javax.annotation.Nullable
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public TlsCertificatesAndHostnamesSslpostOneOf settings(TlsCertificatesAndHostnamesSslsettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  public TlsCertificatesAndHostnamesSslsettings getSettings() {
    return settings;
  }

  public void setSettings(TlsCertificatesAndHostnamesSslsettings settings) {
    this.settings = settings;
  }


  public TlsCertificatesAndHostnamesSslpostOneOf type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Level of validation to be used for this hostname. Domain validation (dv) must be used.
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public TlsCertificatesAndHostnamesSslpostOneOf wildcard(Boolean wildcard) {
    this.wildcard = wildcard;
    return this;
  }

   /**
   * Indicates whether the certificate covers a wildcard.
   * @return wildcard
  **/
  @javax.annotation.Nullable
  public Boolean getWildcard() {
    return wildcard;
  }

  public void setWildcard(Boolean wildcard) {
    this.wildcard = wildcard;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TlsCertificatesAndHostnamesSslpostOneOf tlsCertificatesAndHostnamesSslpostOneOf = (TlsCertificatesAndHostnamesSslpostOneOf) o;
    return Objects.equals(this.bundleMethod, tlsCertificatesAndHostnamesSslpostOneOf.bundleMethod) &&
        Objects.equals(this.certificateAuthority, tlsCertificatesAndHostnamesSslpostOneOf.certificateAuthority) &&
        Objects.equals(this.customCertificate, tlsCertificatesAndHostnamesSslpostOneOf.customCertificate) &&
        Objects.equals(this.customKey, tlsCertificatesAndHostnamesSslpostOneOf.customKey) &&
        Objects.equals(this.method, tlsCertificatesAndHostnamesSslpostOneOf.method) &&
        Objects.equals(this.settings, tlsCertificatesAndHostnamesSslpostOneOf.settings) &&
        Objects.equals(this.type, tlsCertificatesAndHostnamesSslpostOneOf.type) &&
        Objects.equals(this.wildcard, tlsCertificatesAndHostnamesSslpostOneOf.wildcard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleMethod, certificateAuthority, customCertificate, customKey, method, settings, type, wildcard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TlsCertificatesAndHostnamesSslpostOneOf {\n");
    sb.append("    bundleMethod: ").append(toIndentedString(bundleMethod)).append("\n");
    sb.append("    certificateAuthority: ").append(toIndentedString(certificateAuthority)).append("\n");
    sb.append("    customCertificate: ").append(toIndentedString(customCertificate)).append("\n");
    sb.append("    customKey: ").append(toIndentedString(customKey)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    wildcard: ").append(toIndentedString(wildcard)).append("\n");
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
    openapiFields.add("bundle_method");
    openapiFields.add("certificate_authority");
    openapiFields.add("custom_certificate");
    openapiFields.add("custom_key");
    openapiFields.add("method");
    openapiFields.add("settings");
    openapiFields.add("type");
    openapiFields.add("wildcard");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TlsCertificatesAndHostnamesSslpostOneOf
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TlsCertificatesAndHostnamesSslpostOneOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TlsCertificatesAndHostnamesSslpostOneOf is not found in the empty JSON string", TlsCertificatesAndHostnamesSslpostOneOf.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TlsCertificatesAndHostnamesSslpostOneOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TlsCertificatesAndHostnamesSslpostOneOf` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bundle_method") != null && !jsonObj.get("bundle_method").isJsonNull()) && !jsonObj.get("bundle_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundle_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundle_method").toString()));
      }
      // validate the optional field `bundle_method`
      if (jsonObj.get("bundle_method") != null && !jsonObj.get("bundle_method").isJsonNull()) {
        BundleMethodEnum.validateJsonElement(jsonObj.get("bundle_method"));
      }
      // validate the optional field `certificate_authority`
      if (jsonObj.get("certificate_authority") != null && !jsonObj.get("certificate_authority").isJsonNull()) {
        TlsCertificatesAndHostnamesCertificateAuthority.validateJsonElement(jsonObj.get("certificate_authority"));
      }
      if ((jsonObj.get("custom_certificate") != null && !jsonObj.get("custom_certificate").isJsonNull()) && !jsonObj.get("custom_certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_certificate").toString()));
      }
      if ((jsonObj.get("custom_key") != null && !jsonObj.get("custom_key").isJsonNull()) && !jsonObj.get("custom_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_key").toString()));
      }
      if ((jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      // validate the optional field `method`
      if (jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) {
        MethodEnum.validateJsonElement(jsonObj.get("method"));
      }
      // validate the optional field `settings`
      if (jsonObj.get("settings") != null && !jsonObj.get("settings").isJsonNull()) {
        TlsCertificatesAndHostnamesSslsettings.validateJsonElement(jsonObj.get("settings"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TlsCertificatesAndHostnamesSslpostOneOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TlsCertificatesAndHostnamesSslpostOneOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TlsCertificatesAndHostnamesSslpostOneOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TlsCertificatesAndHostnamesSslpostOneOf.class));

       return (TypeAdapter<T>) new TypeAdapter<TlsCertificatesAndHostnamesSslpostOneOf>() {
           @Override
           public void write(JsonWriter out, TlsCertificatesAndHostnamesSslpostOneOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TlsCertificatesAndHostnamesSslpostOneOf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TlsCertificatesAndHostnamesSslpostOneOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TlsCertificatesAndHostnamesSslpostOneOf
  * @throws IOException if the JSON string is invalid with respect to TlsCertificatesAndHostnamesSslpostOneOf
  */
  public static TlsCertificatesAndHostnamesSslpostOneOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TlsCertificatesAndHostnamesSslpostOneOf.class);
  }

 /**
  * Convert an instance of TlsCertificatesAndHostnamesSslpostOneOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

