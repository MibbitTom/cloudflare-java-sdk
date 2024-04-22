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
 * UrlscannerGetScan200ResponseResultScanIpsIp
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class UrlscannerGetScan200ResponseResultScanIpsIp {
  public static final String SERIALIZED_NAME_ASN = "asn";
  @SerializedName(SERIALIZED_NAME_ASN)
  private String asn;

  public static final String SERIALIZED_NAME_ASN_DESCRIPTION = "asnDescription";
  @SerializedName(SERIALIZED_NAME_ASN_DESCRIPTION)
  private String asnDescription;

  public static final String SERIALIZED_NAME_ASN_LOCATION_ALPHA2 = "asnLocationAlpha2";
  @SerializedName(SERIALIZED_NAME_ASN_LOCATION_ALPHA2)
  private String asnLocationAlpha2;

  public static final String SERIALIZED_NAME_ASN_NAME = "asnName";
  @SerializedName(SERIALIZED_NAME_ASN_NAME)
  private String asnName;

  public static final String SERIALIZED_NAME_ASN_ORG_NAME = "asnOrgName";
  @SerializedName(SERIALIZED_NAME_ASN_ORG_NAME)
  private String asnOrgName;

  public static final String SERIALIZED_NAME_CONTINENT = "continent";
  @SerializedName(SERIALIZED_NAME_CONTINENT)
  private String continent;

  public static final String SERIALIZED_NAME_GEONAME_ID = "geonameId";
  @SerializedName(SERIALIZED_NAME_GEONAME_ID)
  private String geonameId;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_IP_VERSION = "ipVersion";
  @SerializedName(SERIALIZED_NAME_IP_VERSION)
  private String ipVersion;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private String latitude;

  public static final String SERIALIZED_NAME_LOCATION_ALPHA2 = "locationAlpha2";
  @SerializedName(SERIALIZED_NAME_LOCATION_ALPHA2)
  private String locationAlpha2;

  public static final String SERIALIZED_NAME_LOCATION_NAME = "locationName";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private String longitude;

  public static final String SERIALIZED_NAME_SUBDIVISION1_NAME = "subdivision1Name";
  @SerializedName(SERIALIZED_NAME_SUBDIVISION1_NAME)
  private String subdivision1Name;

  public static final String SERIALIZED_NAME_SUBDIVISION2_NAME = "subdivision2Name";
  @SerializedName(SERIALIZED_NAME_SUBDIVISION2_NAME)
  private String subdivision2Name;

  public UrlscannerGetScan200ResponseResultScanIpsIp() {
  }

  public UrlscannerGetScan200ResponseResultScanIpsIp asn(String asn) {
    this.asn = asn;
    return this;
  }

   /**
   * Get asn
   * @return asn
  **/
  @javax.annotation.Nonnull
  public String getAsn() {
    return asn;
  }

  public void setAsn(String asn) {
    this.asn = asn;
  }


  public UrlscannerGetScan200ResponseResultScanIpsIp asnDescription(String asnDescription) {
    this.asnDescription = asnDescription;
    return this;
  }

   /**
   * Get asnDescription
   * @return asnDescription
  **/
  @javax.annotation.Nonnull
  public String getAsnDescription() {
    return asnDescription;
  }

  public void setAsnDescription(String asnDescription) {
    this.asnDescription = asnDescription;
  }


  public UrlscannerGetScan200ResponseResultScanIpsIp asnLocationAlpha2(String asnLocationAlpha2) {
    this.asnLocationAlpha2 = asnLocationAlpha2;
    return this;
  }

   /**
   * Get asnLocationAlpha2
   * @return asnLocationAlpha2
  **/
  @javax.annotation.Nonnull
  public String getAsnLocationAlpha2() {
    return asnLocationAlpha2;
  }

  public void setAsnLocationAlpha2(String asnLocationAlpha2) {
    this.asnLocationAlpha2 = asnLocationAlpha2;
  }


  public UrlscannerGetScan200ResponseResultScanIpsIp asnName(String asnName) {
    this.asnName = asnName;
    return this;
  }

   /**
   * Get asnName
   * @return asnName
  **/
  @javax.annotation.Nonnull
  public String getAsnName() {
    return asnName;
  }

  public void setAsnName(String asnName) {
    this.asnName = asnName;
  }


  public UrlscannerGetScan200ResponseResultScanIpsIp asnOrgName(String asnOrgName) {
    this.asnOrgName = asnOrgName;
    return this;
  }

   /**
   * Get asnOrgName
   * @return asnOrgName
  **/
  @javax.annotation.Nonnull
  public String getAsnOrgName() {
    return asnOrgName;
  }

  public void setAsnOrgName(String asnOrgName) {
    this.asnOrgName = asnOrgName;
  }


  public UrlscannerGetScan200ResponseResultScanIpsIp continent(String continent) {
    this.continent = continent;
    return this;
  }

   /**
   * Get continent
   * @return continent
  **/
  @javax.annotation.Nonnull
  public String getContinent() {
    return continent;
  }

  public void setContinent(String continent) {
    this.continent = continent;
  }


  public UrlscannerGetScan200ResponseResultScanIpsIp geonameId(String geonameId) {
    this.geonameId = geonameId;
    return this;
  }

   /**
   * Get geonameId
   * @return geonameId
  **/
  @javax.annotation.Nonnull
  public String getGeonameId() {
    return geonameId;
  }

  public void setGeonameId(String geonameId) {
    this.geonameId = geonameId;
  }


  public UrlscannerGetScan200ResponseResultScanIpsIp ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nonnull
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public UrlscannerGetScan200ResponseResultScanIpsIp ipVersion(String ipVersion) {
    this.ipVersion = ipVersion;
    return this;
  }

   /**
   * Get ipVersion
   * @return ipVersion
  **/
  @javax.annotation.Nonnull
  public String getIpVersion() {
    return ipVersion;
  }

  public void setIpVersion(String ipVersion) {
    this.ipVersion = ipVersion;
  }


  public UrlscannerGetScan200ResponseResultScanIpsIp latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @javax.annotation.Nonnull
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  public UrlscannerGetScan200ResponseResultScanIpsIp locationAlpha2(String locationAlpha2) {
    this.locationAlpha2 = locationAlpha2;
    return this;
  }

   /**
   * Get locationAlpha2
   * @return locationAlpha2
  **/
  @javax.annotation.Nonnull
  public String getLocationAlpha2() {
    return locationAlpha2;
  }

  public void setLocationAlpha2(String locationAlpha2) {
    this.locationAlpha2 = locationAlpha2;
  }


  public UrlscannerGetScan200ResponseResultScanIpsIp locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Get locationName
   * @return locationName
  **/
  @javax.annotation.Nonnull
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  public UrlscannerGetScan200ResponseResultScanIpsIp longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @javax.annotation.Nonnull
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  public UrlscannerGetScan200ResponseResultScanIpsIp subdivision1Name(String subdivision1Name) {
    this.subdivision1Name = subdivision1Name;
    return this;
  }

   /**
   * Get subdivision1Name
   * @return subdivision1Name
  **/
  @javax.annotation.Nonnull
  public String getSubdivision1Name() {
    return subdivision1Name;
  }

  public void setSubdivision1Name(String subdivision1Name) {
    this.subdivision1Name = subdivision1Name;
  }


  public UrlscannerGetScan200ResponseResultScanIpsIp subdivision2Name(String subdivision2Name) {
    this.subdivision2Name = subdivision2Name;
    return this;
  }

   /**
   * Get subdivision2Name
   * @return subdivision2Name
  **/
  @javax.annotation.Nonnull
  public String getSubdivision2Name() {
    return subdivision2Name;
  }

  public void setSubdivision2Name(String subdivision2Name) {
    this.subdivision2Name = subdivision2Name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlscannerGetScan200ResponseResultScanIpsIp urlscannerGetScan200ResponseResultScanIpsIp = (UrlscannerGetScan200ResponseResultScanIpsIp) o;
    return Objects.equals(this.asn, urlscannerGetScan200ResponseResultScanIpsIp.asn) &&
        Objects.equals(this.asnDescription, urlscannerGetScan200ResponseResultScanIpsIp.asnDescription) &&
        Objects.equals(this.asnLocationAlpha2, urlscannerGetScan200ResponseResultScanIpsIp.asnLocationAlpha2) &&
        Objects.equals(this.asnName, urlscannerGetScan200ResponseResultScanIpsIp.asnName) &&
        Objects.equals(this.asnOrgName, urlscannerGetScan200ResponseResultScanIpsIp.asnOrgName) &&
        Objects.equals(this.continent, urlscannerGetScan200ResponseResultScanIpsIp.continent) &&
        Objects.equals(this.geonameId, urlscannerGetScan200ResponseResultScanIpsIp.geonameId) &&
        Objects.equals(this.ip, urlscannerGetScan200ResponseResultScanIpsIp.ip) &&
        Objects.equals(this.ipVersion, urlscannerGetScan200ResponseResultScanIpsIp.ipVersion) &&
        Objects.equals(this.latitude, urlscannerGetScan200ResponseResultScanIpsIp.latitude) &&
        Objects.equals(this.locationAlpha2, urlscannerGetScan200ResponseResultScanIpsIp.locationAlpha2) &&
        Objects.equals(this.locationName, urlscannerGetScan200ResponseResultScanIpsIp.locationName) &&
        Objects.equals(this.longitude, urlscannerGetScan200ResponseResultScanIpsIp.longitude) &&
        Objects.equals(this.subdivision1Name, urlscannerGetScan200ResponseResultScanIpsIp.subdivision1Name) &&
        Objects.equals(this.subdivision2Name, urlscannerGetScan200ResponseResultScanIpsIp.subdivision2Name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asn, asnDescription, asnLocationAlpha2, asnName, asnOrgName, continent, geonameId, ip, ipVersion, latitude, locationAlpha2, locationName, longitude, subdivision1Name, subdivision2Name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlscannerGetScan200ResponseResultScanIpsIp {\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    asnDescription: ").append(toIndentedString(asnDescription)).append("\n");
    sb.append("    asnLocationAlpha2: ").append(toIndentedString(asnLocationAlpha2)).append("\n");
    sb.append("    asnName: ").append(toIndentedString(asnName)).append("\n");
    sb.append("    asnOrgName: ").append(toIndentedString(asnOrgName)).append("\n");
    sb.append("    continent: ").append(toIndentedString(continent)).append("\n");
    sb.append("    geonameId: ").append(toIndentedString(geonameId)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    locationAlpha2: ").append(toIndentedString(locationAlpha2)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    subdivision1Name: ").append(toIndentedString(subdivision1Name)).append("\n");
    sb.append("    subdivision2Name: ").append(toIndentedString(subdivision2Name)).append("\n");
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
    openapiFields.add("asn");
    openapiFields.add("asnDescription");
    openapiFields.add("asnLocationAlpha2");
    openapiFields.add("asnName");
    openapiFields.add("asnOrgName");
    openapiFields.add("continent");
    openapiFields.add("geonameId");
    openapiFields.add("ip");
    openapiFields.add("ipVersion");
    openapiFields.add("latitude");
    openapiFields.add("locationAlpha2");
    openapiFields.add("locationName");
    openapiFields.add("longitude");
    openapiFields.add("subdivision1Name");
    openapiFields.add("subdivision2Name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("asn");
    openapiRequiredFields.add("asnDescription");
    openapiRequiredFields.add("asnLocationAlpha2");
    openapiRequiredFields.add("asnName");
    openapiRequiredFields.add("asnOrgName");
    openapiRequiredFields.add("continent");
    openapiRequiredFields.add("geonameId");
    openapiRequiredFields.add("ip");
    openapiRequiredFields.add("ipVersion");
    openapiRequiredFields.add("latitude");
    openapiRequiredFields.add("locationAlpha2");
    openapiRequiredFields.add("locationName");
    openapiRequiredFields.add("longitude");
    openapiRequiredFields.add("subdivision1Name");
    openapiRequiredFields.add("subdivision2Name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UrlscannerGetScan200ResponseResultScanIpsIp
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UrlscannerGetScan200ResponseResultScanIpsIp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UrlscannerGetScan200ResponseResultScanIpsIp is not found in the empty JSON string", UrlscannerGetScan200ResponseResultScanIpsIp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UrlscannerGetScan200ResponseResultScanIpsIp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UrlscannerGetScan200ResponseResultScanIpsIp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UrlscannerGetScan200ResponseResultScanIpsIp.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("asn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asn").toString()));
      }
      if (!jsonObj.get("asnDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asnDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asnDescription").toString()));
      }
      if (!jsonObj.get("asnLocationAlpha2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asnLocationAlpha2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asnLocationAlpha2").toString()));
      }
      if (!jsonObj.get("asnName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asnName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asnName").toString()));
      }
      if (!jsonObj.get("asnOrgName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asnOrgName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asnOrgName").toString()));
      }
      if (!jsonObj.get("continent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `continent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("continent").toString()));
      }
      if (!jsonObj.get("geonameId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `geonameId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("geonameId").toString()));
      }
      if (!jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
      if (!jsonObj.get("ipVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipVersion").toString()));
      }
      if (!jsonObj.get("latitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latitude").toString()));
      }
      if (!jsonObj.get("locationAlpha2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationAlpha2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationAlpha2").toString()));
      }
      if (!jsonObj.get("locationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationName").toString()));
      }
      if (!jsonObj.get("longitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `longitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("longitude").toString()));
      }
      if (!jsonObj.get("subdivision1Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subdivision1Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subdivision1Name").toString()));
      }
      if (!jsonObj.get("subdivision2Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subdivision2Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subdivision2Name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlscannerGetScan200ResponseResultScanIpsIp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlscannerGetScan200ResponseResultScanIpsIp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlscannerGetScan200ResponseResultScanIpsIp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlscannerGetScan200ResponseResultScanIpsIp.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlscannerGetScan200ResponseResultScanIpsIp>() {
           @Override
           public void write(JsonWriter out, UrlscannerGetScan200ResponseResultScanIpsIp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlscannerGetScan200ResponseResultScanIpsIp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlscannerGetScan200ResponseResultScanIpsIp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlscannerGetScan200ResponseResultScanIpsIp
  * @throws IOException if the JSON string is invalid with respect to UrlscannerGetScan200ResponseResultScanIpsIp
  */
  public static UrlscannerGetScan200ResponseResultScanIpsIp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlscannerGetScan200ResponseResultScanIpsIp.class);
  }

 /**
  * Convert an instance of UrlscannerGetScan200ResponseResultScanIpsIp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

