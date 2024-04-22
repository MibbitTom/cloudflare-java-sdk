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
import cloudflare.sdk.models.AccessSamlSaasAppCustomAttributesSource;
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
 * AccessSamlSaasAppCustomAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccessSamlSaasAppCustomAttributes {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * A globally unique name for an identity or service provider.
   */
  @JsonAdapter(NameFormatEnum.Adapter.class)
  public enum NameFormatEnum {
    UNSPECIFIED("urn:oasis:names:tc:SAML:2.0:attrname-format:unspecified"),
    
    BASIC("urn:oasis:names:tc:SAML:2.0:attrname-format:basic"),
    
    URI("urn:oasis:names:tc:SAML:2.0:attrname-format:uri");

    private String value;

    NameFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameFormatEnum fromValue(String value) {
      for (NameFormatEnum b : NameFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NameFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameFormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      NameFormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_NAME_FORMAT = "name_format";
  @SerializedName(SERIALIZED_NAME_NAME_FORMAT)
  private NameFormatEnum nameFormat;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private AccessSamlSaasAppCustomAttributesSource source;

  public AccessSamlSaasAppCustomAttributes() {
  }

  public AccessSamlSaasAppCustomAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the attribute.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccessSamlSaasAppCustomAttributes nameFormat(NameFormatEnum nameFormat) {
    this.nameFormat = nameFormat;
    return this;
  }

   /**
   * A globally unique name for an identity or service provider.
   * @return nameFormat
  **/
  @javax.annotation.Nullable
  public NameFormatEnum getNameFormat() {
    return nameFormat;
  }

  public void setNameFormat(NameFormatEnum nameFormat) {
    this.nameFormat = nameFormat;
  }


  public AccessSamlSaasAppCustomAttributes source(AccessSamlSaasAppCustomAttributesSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public AccessSamlSaasAppCustomAttributesSource getSource() {
    return source;
  }

  public void setSource(AccessSamlSaasAppCustomAttributesSource source) {
    this.source = source;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessSamlSaasAppCustomAttributes accessSamlSaasAppCustomAttributes = (AccessSamlSaasAppCustomAttributes) o;
    return Objects.equals(this.name, accessSamlSaasAppCustomAttributes.name) &&
        Objects.equals(this.nameFormat, accessSamlSaasAppCustomAttributes.nameFormat) &&
        Objects.equals(this.source, accessSamlSaasAppCustomAttributes.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nameFormat, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessSamlSaasAppCustomAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameFormat: ").append(toIndentedString(nameFormat)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("name_format");
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessSamlSaasAppCustomAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessSamlSaasAppCustomAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessSamlSaasAppCustomAttributes is not found in the empty JSON string", AccessSamlSaasAppCustomAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessSamlSaasAppCustomAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessSamlSaasAppCustomAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("name_format") != null && !jsonObj.get("name_format").isJsonNull()) && !jsonObj.get("name_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_format").toString()));
      }
      // validate the optional field `name_format`
      if (jsonObj.get("name_format") != null && !jsonObj.get("name_format").isJsonNull()) {
        NameFormatEnum.validateJsonElement(jsonObj.get("name_format"));
      }
      // validate the optional field `source`
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) {
        AccessSamlSaasAppCustomAttributesSource.validateJsonElement(jsonObj.get("source"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessSamlSaasAppCustomAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessSamlSaasAppCustomAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessSamlSaasAppCustomAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessSamlSaasAppCustomAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessSamlSaasAppCustomAttributes>() {
           @Override
           public void write(JsonWriter out, AccessSamlSaasAppCustomAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessSamlSaasAppCustomAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessSamlSaasAppCustomAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessSamlSaasAppCustomAttributes
  * @throws IOException if the JSON string is invalid with respect to AccessSamlSaasAppCustomAttributes
  */
  public static AccessSamlSaasAppCustomAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessSamlSaasAppCustomAttributes.class);
  }

 /**
  * Convert an instance of AccessSamlSaasAppCustomAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
