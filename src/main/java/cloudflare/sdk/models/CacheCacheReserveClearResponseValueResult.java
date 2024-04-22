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
import cloudflare.sdk.models.CacheCacheReserveClearState;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * CacheCacheReserveClearResponseValueResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class CacheCacheReserveClearResponseValueResult {
  /**
   * ID of the zone setting.
   */
  @JsonAdapter(IdEnum.Adapter.class)
  public enum IdEnum {
    CACHE_RESERVE_CLEAR("cache_reserve_clear");

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

  public static final String SERIALIZED_NAME_END_TS = "end_ts";
  @SerializedName(SERIALIZED_NAME_END_TS)
  private OffsetDateTime endTs;

  public static final String SERIALIZED_NAME_START_TS = "start_ts";
  @SerializedName(SERIALIZED_NAME_START_TS)
  private OffsetDateTime startTs;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private CacheCacheReserveClearState state;

  public CacheCacheReserveClearResponseValueResult() {
  }

  public CacheCacheReserveClearResponseValueResult(
     OffsetDateTime modifiedOn
  ) {
    this();
    this.modifiedOn = modifiedOn;
  }

  public CacheCacheReserveClearResponseValueResult id(IdEnum id) {
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



  public CacheCacheReserveClearResponseValueResult endTs(OffsetDateTime endTs) {
    this.endTs = endTs;
    return this;
  }

   /**
   * The time that the latest Cache Reserve Clear operation completed.
   * @return endTs
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndTs() {
    return endTs;
  }

  public void setEndTs(OffsetDateTime endTs) {
    this.endTs = endTs;
  }


  public CacheCacheReserveClearResponseValueResult startTs(OffsetDateTime startTs) {
    this.startTs = startTs;
    return this;
  }

   /**
   * The time that the latest Cache Reserve Clear operation started.
   * @return startTs
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getStartTs() {
    return startTs;
  }

  public void setStartTs(OffsetDateTime startTs) {
    this.startTs = startTs;
  }


  public CacheCacheReserveClearResponseValueResult state(CacheCacheReserveClearState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  public CacheCacheReserveClearState getState() {
    return state;
  }

  public void setState(CacheCacheReserveClearState state) {
    this.state = state;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheCacheReserveClearResponseValueResult cacheCacheReserveClearResponseValueResult = (CacheCacheReserveClearResponseValueResult) o;
    return Objects.equals(this.id, cacheCacheReserveClearResponseValueResult.id) &&
        Objects.equals(this.modifiedOn, cacheCacheReserveClearResponseValueResult.modifiedOn) &&
        Objects.equals(this.endTs, cacheCacheReserveClearResponseValueResult.endTs) &&
        Objects.equals(this.startTs, cacheCacheReserveClearResponseValueResult.startTs) &&
        Objects.equals(this.state, cacheCacheReserveClearResponseValueResult.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, modifiedOn, endTs, startTs, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheCacheReserveClearResponseValueResult {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    endTs: ").append(toIndentedString(endTs)).append("\n");
    sb.append("    startTs: ").append(toIndentedString(startTs)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("modified_on");
    openapiFields.add("end_ts");
    openapiFields.add("start_ts");
    openapiFields.add("state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("modified_on");
    openapiRequiredFields.add("start_ts");
    openapiRequiredFields.add("state");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CacheCacheReserveClearResponseValueResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CacheCacheReserveClearResponseValueResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CacheCacheReserveClearResponseValueResult is not found in the empty JSON string", CacheCacheReserveClearResponseValueResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CacheCacheReserveClearResponseValueResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CacheCacheReserveClearResponseValueResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CacheCacheReserveClearResponseValueResult.openapiRequiredFields) {
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
      // validate the required field `state`
      CacheCacheReserveClearState.validateJsonElement(jsonObj.get("state"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CacheCacheReserveClearResponseValueResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CacheCacheReserveClearResponseValueResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CacheCacheReserveClearResponseValueResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CacheCacheReserveClearResponseValueResult.class));

       return (TypeAdapter<T>) new TypeAdapter<CacheCacheReserveClearResponseValueResult>() {
           @Override
           public void write(JsonWriter out, CacheCacheReserveClearResponseValueResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CacheCacheReserveClearResponseValueResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CacheCacheReserveClearResponseValueResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CacheCacheReserveClearResponseValueResult
  * @throws IOException if the JSON string is invalid with respect to CacheCacheReserveClearResponseValueResult
  */
  public static CacheCacheReserveClearResponseValueResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CacheCacheReserveClearResponseValueResult.class);
  }

 /**
  * Convert an instance of CacheCacheReserveClearResponseValueResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
