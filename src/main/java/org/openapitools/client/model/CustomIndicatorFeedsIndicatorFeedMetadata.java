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
 * CustomIndicatorFeedsIndicatorFeedMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class CustomIndicatorFeedsIndicatorFeedMetadata {
  public static final String SERIALIZED_NAME_CREATED_ON = "created_on";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  /**
   * Status of the latest snapshot uploaded
   */
  @JsonAdapter(LatestUploadStatusEnum.Adapter.class)
  public enum LatestUploadStatusEnum {
    MIRRORING("Mirroring"),
    
    UNIFYING("Unifying"),
    
    LOADING("Loading"),
    
    PROVISIONING("Provisioning"),
    
    COMPLETE("Complete"),
    
    ERROR("Error");

    private String value;

    LatestUploadStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LatestUploadStatusEnum fromValue(String value) {
      for (LatestUploadStatusEnum b : LatestUploadStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LatestUploadStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LatestUploadStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LatestUploadStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LatestUploadStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      LatestUploadStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LATEST_UPLOAD_STATUS = "latest_upload_status";
  @SerializedName(SERIALIZED_NAME_LATEST_UPLOAD_STATUS)
  private LatestUploadStatusEnum latestUploadStatus;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modified_on";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public CustomIndicatorFeedsIndicatorFeedMetadata() {
  }

  public CustomIndicatorFeedsIndicatorFeedMetadata createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * The date and time when the data entry was created
   * @return createdOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }


  public CustomIndicatorFeedsIndicatorFeedMetadata description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the example test
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CustomIndicatorFeedsIndicatorFeedMetadata id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the indicator feed
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public CustomIndicatorFeedsIndicatorFeedMetadata latestUploadStatus(LatestUploadStatusEnum latestUploadStatus) {
    this.latestUploadStatus = latestUploadStatus;
    return this;
  }

   /**
   * Status of the latest snapshot uploaded
   * @return latestUploadStatus
  **/
  @javax.annotation.Nullable
  public LatestUploadStatusEnum getLatestUploadStatus() {
    return latestUploadStatus;
  }

  public void setLatestUploadStatus(LatestUploadStatusEnum latestUploadStatus) {
    this.latestUploadStatus = latestUploadStatus;
  }


  public CustomIndicatorFeedsIndicatorFeedMetadata modifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * The date and time when the data entry was last modified
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }


  public CustomIndicatorFeedsIndicatorFeedMetadata name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the indicator feed
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomIndicatorFeedsIndicatorFeedMetadata customIndicatorFeedsIndicatorFeedMetadata = (CustomIndicatorFeedsIndicatorFeedMetadata) o;
    return Objects.equals(this.createdOn, customIndicatorFeedsIndicatorFeedMetadata.createdOn) &&
        Objects.equals(this.description, customIndicatorFeedsIndicatorFeedMetadata.description) &&
        Objects.equals(this.id, customIndicatorFeedsIndicatorFeedMetadata.id) &&
        Objects.equals(this.latestUploadStatus, customIndicatorFeedsIndicatorFeedMetadata.latestUploadStatus) &&
        Objects.equals(this.modifiedOn, customIndicatorFeedsIndicatorFeedMetadata.modifiedOn) &&
        Objects.equals(this.name, customIndicatorFeedsIndicatorFeedMetadata.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, description, id, latestUploadStatus, modifiedOn, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomIndicatorFeedsIndicatorFeedMetadata {\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latestUploadStatus: ").append(toIndentedString(latestUploadStatus)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("created_on");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("latest_upload_status");
    openapiFields.add("modified_on");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomIndicatorFeedsIndicatorFeedMetadata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomIndicatorFeedsIndicatorFeedMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomIndicatorFeedsIndicatorFeedMetadata is not found in the empty JSON string", CustomIndicatorFeedsIndicatorFeedMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomIndicatorFeedsIndicatorFeedMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomIndicatorFeedsIndicatorFeedMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("latest_upload_status") != null && !jsonObj.get("latest_upload_status").isJsonNull()) && !jsonObj.get("latest_upload_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latest_upload_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latest_upload_status").toString()));
      }
      // validate the optional field `latest_upload_status`
      if (jsonObj.get("latest_upload_status") != null && !jsonObj.get("latest_upload_status").isJsonNull()) {
        LatestUploadStatusEnum.validateJsonElement(jsonObj.get("latest_upload_status"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomIndicatorFeedsIndicatorFeedMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomIndicatorFeedsIndicatorFeedMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomIndicatorFeedsIndicatorFeedMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomIndicatorFeedsIndicatorFeedMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomIndicatorFeedsIndicatorFeedMetadata>() {
           @Override
           public void write(JsonWriter out, CustomIndicatorFeedsIndicatorFeedMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomIndicatorFeedsIndicatorFeedMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomIndicatorFeedsIndicatorFeedMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomIndicatorFeedsIndicatorFeedMetadata
  * @throws IOException if the JSON string is invalid with respect to CustomIndicatorFeedsIndicatorFeedMetadata
  */
  public static CustomIndicatorFeedsIndicatorFeedMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomIndicatorFeedsIndicatorFeedMetadata.class);
  }

 /**
  * Convert an instance of CustomIndicatorFeedsIndicatorFeedMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

