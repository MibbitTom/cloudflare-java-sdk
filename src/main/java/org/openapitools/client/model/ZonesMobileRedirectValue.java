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
import java.util.Arrays;
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
 * Value of the zone setting.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZonesMobileRedirectValue {
  public static final String SERIALIZED_NAME_MOBILE_SUBDOMAIN = "mobile_subdomain";
  @SerializedName(SERIALIZED_NAME_MOBILE_SUBDOMAIN)
  private String mobileSubdomain;

  /**
   * Whether or not mobile redirect is enabled.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ON("on"),
    
    OFF("off");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status = StatusEnum.OFF;

  public static final String SERIALIZED_NAME_STRIP_URI = "strip_uri";
  @SerializedName(SERIALIZED_NAME_STRIP_URI)
  private Boolean stripUri = false;

  public ZonesMobileRedirectValue() {
  }

  public ZonesMobileRedirectValue mobileSubdomain(String mobileSubdomain) {
    this.mobileSubdomain = mobileSubdomain;
    return this;
  }

   /**
   * Which subdomain prefix you wish to redirect visitors on mobile devices to (subdomain must already exist).
   * @return mobileSubdomain
  **/
  @javax.annotation.Nullable
  public String getMobileSubdomain() {
    return mobileSubdomain;
  }

  public void setMobileSubdomain(String mobileSubdomain) {
    this.mobileSubdomain = mobileSubdomain;
  }


  public ZonesMobileRedirectValue status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Whether or not mobile redirect is enabled.
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ZonesMobileRedirectValue stripUri(Boolean stripUri) {
    this.stripUri = stripUri;
    return this;
  }

   /**
   * Whether to drop the current page path and redirect to the mobile subdomain URL root, or keep the path and redirect to the same page on the mobile subdomain.
   * @return stripUri
  **/
  @javax.annotation.Nullable
  public Boolean getStripUri() {
    return stripUri;
  }

  public void setStripUri(Boolean stripUri) {
    this.stripUri = stripUri;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZonesMobileRedirectValue zonesMobileRedirectValue = (ZonesMobileRedirectValue) o;
    return Objects.equals(this.mobileSubdomain, zonesMobileRedirectValue.mobileSubdomain) &&
        Objects.equals(this.status, zonesMobileRedirectValue.status) &&
        Objects.equals(this.stripUri, zonesMobileRedirectValue.stripUri);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileSubdomain, status, stripUri);
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
    sb.append("class ZonesMobileRedirectValue {\n");
    sb.append("    mobileSubdomain: ").append(toIndentedString(mobileSubdomain)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stripUri: ").append(toIndentedString(stripUri)).append("\n");
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
    openapiFields.add("mobile_subdomain");
    openapiFields.add("status");
    openapiFields.add("strip_uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZonesMobileRedirectValue
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZonesMobileRedirectValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZonesMobileRedirectValue is not found in the empty JSON string", ZonesMobileRedirectValue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZonesMobileRedirectValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZonesMobileRedirectValue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("mobile_subdomain") != null && !jsonObj.get("mobile_subdomain").isJsonNull()) && !jsonObj.get("mobile_subdomain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile_subdomain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile_subdomain").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZonesMobileRedirectValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZonesMobileRedirectValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZonesMobileRedirectValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZonesMobileRedirectValue.class));

       return (TypeAdapter<T>) new TypeAdapter<ZonesMobileRedirectValue>() {
           @Override
           public void write(JsonWriter out, ZonesMobileRedirectValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZonesMobileRedirectValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZonesMobileRedirectValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZonesMobileRedirectValue
  * @throws IOException if the JSON string is invalid with respect to ZonesMobileRedirectValue
  */
  public static ZonesMobileRedirectValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZonesMobileRedirectValue.class);
  }

 /**
  * Convert an instance of ZonesMobileRedirectValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

