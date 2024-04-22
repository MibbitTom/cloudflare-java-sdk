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
import org.openapitools.client.model.RadarGetAnnotationsOutages200ResponseResultAnnotationsInnerAsnsDetailsInner;
import org.openapitools.client.model.RadarGetAnnotationsOutages200ResponseResultAnnotationsInnerAsnsDetailsInnerLocations;

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
 * RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner {
  public static final String SERIALIZED_NAME_ASN_DETAILS = "asnDetails";
  @SerializedName(SERIALIZED_NAME_ASN_DETAILS)
  private RadarGetAnnotationsOutages200ResponseResultAnnotationsInnerAsnsDetailsInner asnDetails;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_LOCATION_DETAILS = "locationDetails";
  @SerializedName(SERIALIZED_NAME_LOCATION_DETAILS)
  private RadarGetAnnotationsOutages200ResponseResultAnnotationsInnerAsnsDetailsInnerLocations locationDetails;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_VISIBLE_IN_DATA_SOURCES = "visibleInDataSources";
  @SerializedName(SERIALIZED_NAME_VISIBLE_IN_DATA_SOURCES)
  private List<String> visibleInDataSources = new ArrayList<>();

  public RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner() {
  }

  public RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner asnDetails(RadarGetAnnotationsOutages200ResponseResultAnnotationsInnerAsnsDetailsInner asnDetails) {
    this.asnDetails = asnDetails;
    return this;
  }

   /**
   * Get asnDetails
   * @return asnDetails
  **/
  @javax.annotation.Nullable
  public RadarGetAnnotationsOutages200ResponseResultAnnotationsInnerAsnsDetailsInner getAsnDetails() {
    return asnDetails;
  }

  public void setAsnDetails(RadarGetAnnotationsOutages200ResponseResultAnnotationsInnerAsnsDetailsInner asnDetails) {
    this.asnDetails = asnDetails;
  }


  public RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner locationDetails(RadarGetAnnotationsOutages200ResponseResultAnnotationsInnerAsnsDetailsInnerLocations locationDetails) {
    this.locationDetails = locationDetails;
    return this;
  }

   /**
   * Get locationDetails
   * @return locationDetails
  **/
  @javax.annotation.Nullable
  public RadarGetAnnotationsOutages200ResponseResultAnnotationsInnerAsnsDetailsInnerLocations getLocationDetails() {
    return locationDetails;
  }

  public void setLocationDetails(RadarGetAnnotationsOutages200ResponseResultAnnotationsInnerAsnsDetailsInnerLocations locationDetails) {
    this.locationDetails = locationDetails;
  }


  public RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nonnull
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nonnull
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner visibleInDataSources(List<String> visibleInDataSources) {
    this.visibleInDataSources = visibleInDataSources;
    return this;
  }

  public RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner addVisibleInDataSourcesItem(String visibleInDataSourcesItem) {
    if (this.visibleInDataSources == null) {
      this.visibleInDataSources = new ArrayList<>();
    }
    this.visibleInDataSources.add(visibleInDataSourcesItem);
    return this;
  }

   /**
   * Get visibleInDataSources
   * @return visibleInDataSources
  **/
  @javax.annotation.Nullable
  public List<String> getVisibleInDataSources() {
    return visibleInDataSources;
  }

  public void setVisibleInDataSources(List<String> visibleInDataSources) {
    this.visibleInDataSources = visibleInDataSources;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner radarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner = (RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner) o;
    return Objects.equals(this.asnDetails, radarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner.asnDetails) &&
        Objects.equals(this.endDate, radarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner.endDate) &&
        Objects.equals(this.locationDetails, radarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner.locationDetails) &&
        Objects.equals(this.startDate, radarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner.startDate) &&
        Objects.equals(this.status, radarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner.status) &&
        Objects.equals(this.type, radarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner.type) &&
        Objects.equals(this.uuid, radarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner.uuid) &&
        Objects.equals(this.visibleInDataSources, radarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner.visibleInDataSources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asnDetails, endDate, locationDetails, startDate, status, type, uuid, visibleInDataSources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner {\n");
    sb.append("    asnDetails: ").append(toIndentedString(asnDetails)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    locationDetails: ").append(toIndentedString(locationDetails)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    visibleInDataSources: ").append(toIndentedString(visibleInDataSources)).append("\n");
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
    openapiFields.add("asnDetails");
    openapiFields.add("endDate");
    openapiFields.add("locationDetails");
    openapiFields.add("startDate");
    openapiFields.add("status");
    openapiFields.add("type");
    openapiFields.add("uuid");
    openapiFields.add("visibleInDataSources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("uuid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner is not found in the empty JSON string", RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `asnDetails`
      if (jsonObj.get("asnDetails") != null && !jsonObj.get("asnDetails").isJsonNull()) {
        RadarGetAnnotationsOutages200ResponseResultAnnotationsInnerAsnsDetailsInner.validateJsonElement(jsonObj.get("asnDetails"));
      }
      if ((jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) && !jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
      // validate the optional field `locationDetails`
      if (jsonObj.get("locationDetails") != null && !jsonObj.get("locationDetails").isJsonNull()) {
        RadarGetAnnotationsOutages200ResponseResultAnnotationsInnerAsnsDetailsInnerLocations.validateJsonElement(jsonObj.get("locationDetails"));
      }
      if (!jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("visibleInDataSources") != null && !jsonObj.get("visibleInDataSources").isJsonNull() && !jsonObj.get("visibleInDataSources").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibleInDataSources` to be an array in the JSON string but got `%s`", jsonObj.get("visibleInDataSources").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner>() {
           @Override
           public void write(JsonWriter out, RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner
  * @throws IOException if the JSON string is invalid with respect to RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner
  */
  public static RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner.class);
  }

 /**
  * Convert an instance of RadarGetTrafficAnomalies200ResponseResultTrafficAnomaliesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

