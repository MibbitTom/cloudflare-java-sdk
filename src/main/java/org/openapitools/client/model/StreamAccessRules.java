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
 * Defines rules for fine-grained control over content than signed URL tokens alone. Access rules primarily make tokens conditionally valid based on user information. Access Rules are specified on token payloads as the &#x60;accessRules&#x60; property containing an array of Rule objects.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class StreamAccessRules {
  /**
   * The action to take when a request matches a rule. If the action is &#x60;block&#x60;, the signed token blocks views for viewers matching the rule.
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    ALLOW("allow"),
    
    BLOCK("block");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ActionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private List<String> country = new ArrayList<>();

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private List<String> ip = new ArrayList<>();

  /**
   * Lists available rule types to match for requests. An &#x60;any&#x60; type matches all requests and can be used as a wildcard to apply default actions after other rules.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ANY("any"),
    
    IP_SRC("ip.src"),
    
    IP_GEOIP_COUNTRY("ip.geoip.country");

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

  public StreamAccessRules() {
  }

  public StreamAccessRules action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * The action to take when a request matches a rule. If the action is &#x60;block&#x60;, the signed token blocks views for viewers matching the rule.
   * @return action
  **/
  @javax.annotation.Nullable
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public StreamAccessRules country(List<String> country) {
    this.country = country;
    return this;
  }

  public StreamAccessRules addCountryItem(String countryItem) {
    if (this.country == null) {
      this.country = new ArrayList<>();
    }
    this.country.add(countryItem);
    return this;
  }

   /**
   * An array of 2-letter country codes in ISO 3166-1 Alpha-2 format used to match requests.
   * @return country
  **/
  @javax.annotation.Nullable
  public List<String> getCountry() {
    return country;
  }

  public void setCountry(List<String> country) {
    this.country = country;
  }


  public StreamAccessRules ip(List<String> ip) {
    this.ip = ip;
    return this;
  }

  public StreamAccessRules addIpItem(String ipItem) {
    if (this.ip == null) {
      this.ip = new ArrayList<>();
    }
    this.ip.add(ipItem);
    return this;
  }

   /**
   * An array of IPv4 or IPV6 addresses or CIDRs used to match requests.
   * @return ip
  **/
  @javax.annotation.Nullable
  public List<String> getIp() {
    return ip;
  }

  public void setIp(List<String> ip) {
    this.ip = ip;
  }


  public StreamAccessRules type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Lists available rule types to match for requests. An &#x60;any&#x60; type matches all requests and can be used as a wildcard to apply default actions after other rules.
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamAccessRules streamAccessRules = (StreamAccessRules) o;
    return Objects.equals(this.action, streamAccessRules.action) &&
        Objects.equals(this.country, streamAccessRules.country) &&
        Objects.equals(this.ip, streamAccessRules.ip) &&
        Objects.equals(this.type, streamAccessRules.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, country, ip, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamAccessRules {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("country");
    openapiFields.add("ip");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StreamAccessRules
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StreamAccessRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StreamAccessRules is not found in the empty JSON string", StreamAccessRules.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StreamAccessRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StreamAccessRules` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      // validate the optional field `action`
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) {
        ActionEnum.validateJsonElement(jsonObj.get("action"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull() && !jsonObj.get("country").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be an array in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ip") != null && !jsonObj.get("ip").isJsonNull() && !jsonObj.get("ip").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be an array in the JSON string but got `%s`", jsonObj.get("ip").toString()));
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
       if (!StreamAccessRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StreamAccessRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StreamAccessRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StreamAccessRules.class));

       return (TypeAdapter<T>) new TypeAdapter<StreamAccessRules>() {
           @Override
           public void write(JsonWriter out, StreamAccessRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StreamAccessRules read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StreamAccessRules given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StreamAccessRules
  * @throws IOException if the JSON string is invalid with respect to StreamAccessRules
  */
  public static StreamAccessRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StreamAccessRules.class);
  }

 /**
  * Convert an instance of StreamAccessRules to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

