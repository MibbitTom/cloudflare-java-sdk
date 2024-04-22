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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.ZonesCacheLevelValue;
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
 * Cache Level functions based off the setting level. The basic setting will cache most static resources (i.e., css, images, and JavaScript). The simplified setting will ignore the query string when delivering a cached resource. The aggressive setting will cache all static resources, including ones with a query string. (https://support.cloudflare.com/hc/en-us/articles/200168256).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZonesCacheLevel {
  public static final String SERIALIZED_NAME_EDITABLE = "editable";
  @SerializedName(SERIALIZED_NAME_EDITABLE)
  private Boolean editable = true;

  /**
   * ID of the zone setting.
   */
  @JsonAdapter(IdEnum.Adapter.class)
  public enum IdEnum {
    CACHE_LEVEL("cache_level");

    private String value;

    IdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdEnum fromValue(String value) {
      for (IdEnum b : IdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IdEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IdEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      IdEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private IdEnum id;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modified_on";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private ZonesCacheLevelValue value = ZonesCacheLevelValue.AGGRESSIVE;

  public ZonesCacheLevel() {
  }

  public ZonesCacheLevel(
     Boolean editable, 
     OffsetDateTime modifiedOn
  ) {
    this();
    this.editable = editable;
    this.modifiedOn = modifiedOn;
  }

   /**
   * Whether or not this setting can be modified for this zone (based on your Cloudflare plan level).
   * @return editable
  **/
  @javax.annotation.Nullable
  public Boolean getEditable() {
    return editable;
  }



  public ZonesCacheLevel id(IdEnum id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the zone setting.
   * @return id
  **/
  @javax.annotation.Nonnull
  public IdEnum getId() {
    return id;
  }

  public void setId(IdEnum id) {
    this.id = id;
  }


   /**
   * last time this setting was modified.
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }



  public ZonesCacheLevel value(ZonesCacheLevelValue value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  public ZonesCacheLevelValue getValue() {
    return value;
  }

  public void setValue(ZonesCacheLevelValue value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZonesCacheLevel zonesCacheLevel = (ZonesCacheLevel) o;
    return Objects.equals(this.editable, zonesCacheLevel.editable) &&
        Objects.equals(this.id, zonesCacheLevel.id) &&
        Objects.equals(this.modifiedOn, zonesCacheLevel.modifiedOn) &&
        Objects.equals(this.value, zonesCacheLevel.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(editable, id, modifiedOn, value);
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
    sb.append("class ZonesCacheLevel {\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("editable");
    openapiFields.add("id");
    openapiFields.add("modified_on");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZonesCacheLevel
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZonesCacheLevel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZonesCacheLevel is not found in the empty JSON string", ZonesCacheLevel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZonesCacheLevel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZonesCacheLevel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ZonesCacheLevel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `id`
      IdEnum.validateJsonElement(jsonObj.get("id"));
      // validate the required field `value`
      ZonesCacheLevelValue.validateJsonElement(jsonObj.get("value"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZonesCacheLevel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZonesCacheLevel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZonesCacheLevel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZonesCacheLevel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZonesCacheLevel>() {
           @Override
           public void write(JsonWriter out, ZonesCacheLevel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZonesCacheLevel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZonesCacheLevel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZonesCacheLevel
  * @throws IOException if the JSON string is invalid with respect to ZonesCacheLevel
  */
  public static ZonesCacheLevel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZonesCacheLevel.class);
  }

 /**
  * Convert an instance of ZonesCacheLevel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

