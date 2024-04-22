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
 * Components of a LOC record.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DnsRecordsLOCRecordAllOfData {
  public static final String SERIALIZED_NAME_ALTITUDE = "altitude";
  @SerializedName(SERIALIZED_NAME_ALTITUDE)
  private BigDecimal altitude;

  public static final String SERIALIZED_NAME_LAT_DEGREES = "lat_degrees";
  @SerializedName(SERIALIZED_NAME_LAT_DEGREES)
  private BigDecimal latDegrees;

  /**
   * Latitude direction.
   */
  @JsonAdapter(LatDirectionEnum.Adapter.class)
  public enum LatDirectionEnum {
    N("N"),
    
    S("S");

    private String value;

    LatDirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LatDirectionEnum fromValue(String value) {
      for (LatDirectionEnum b : LatDirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LatDirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LatDirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LatDirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LatDirectionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      LatDirectionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LAT_DIRECTION = "lat_direction";
  @SerializedName(SERIALIZED_NAME_LAT_DIRECTION)
  private LatDirectionEnum latDirection;

  public static final String SERIALIZED_NAME_LAT_MINUTES = "lat_minutes";
  @SerializedName(SERIALIZED_NAME_LAT_MINUTES)
  private BigDecimal latMinutes = new BigDecimal("0");

  public static final String SERIALIZED_NAME_LAT_SECONDS = "lat_seconds";
  @SerializedName(SERIALIZED_NAME_LAT_SECONDS)
  private BigDecimal latSeconds = new BigDecimal("0");

  public static final String SERIALIZED_NAME_LONG_DEGREES = "long_degrees";
  @SerializedName(SERIALIZED_NAME_LONG_DEGREES)
  private BigDecimal longDegrees;

  /**
   * Longitude direction.
   */
  @JsonAdapter(LongDirectionEnum.Adapter.class)
  public enum LongDirectionEnum {
    E("E"),
    
    W("W");

    private String value;

    LongDirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LongDirectionEnum fromValue(String value) {
      for (LongDirectionEnum b : LongDirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LongDirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LongDirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LongDirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LongDirectionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      LongDirectionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LONG_DIRECTION = "long_direction";
  @SerializedName(SERIALIZED_NAME_LONG_DIRECTION)
  private LongDirectionEnum longDirection;

  public static final String SERIALIZED_NAME_LONG_MINUTES = "long_minutes";
  @SerializedName(SERIALIZED_NAME_LONG_MINUTES)
  private BigDecimal longMinutes = new BigDecimal("0");

  public static final String SERIALIZED_NAME_LONG_SECONDS = "long_seconds";
  @SerializedName(SERIALIZED_NAME_LONG_SECONDS)
  private BigDecimal longSeconds = new BigDecimal("0");

  public static final String SERIALIZED_NAME_PRECISION_HORZ = "precision_horz";
  @SerializedName(SERIALIZED_NAME_PRECISION_HORZ)
  private BigDecimal precisionHorz = new BigDecimal("0");

  public static final String SERIALIZED_NAME_PRECISION_VERT = "precision_vert";
  @SerializedName(SERIALIZED_NAME_PRECISION_VERT)
  private BigDecimal precisionVert = new BigDecimal("0");

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private BigDecimal size = new BigDecimal("0");

  public DnsRecordsLOCRecordAllOfData() {
  }

  public DnsRecordsLOCRecordAllOfData altitude(BigDecimal altitude) {
    this.altitude = altitude;
    return this;
  }

   /**
   * Altitude of location in meters.
   * minimum: -100000
   * maximum: 42849672.95
   * @return altitude
  **/
  @javax.annotation.Nullable
  public BigDecimal getAltitude() {
    return altitude;
  }

  public void setAltitude(BigDecimal altitude) {
    this.altitude = altitude;
  }


  public DnsRecordsLOCRecordAllOfData latDegrees(BigDecimal latDegrees) {
    this.latDegrees = latDegrees;
    return this;
  }

   /**
   * Degrees of latitude.
   * minimum: 0
   * maximum: 90
   * @return latDegrees
  **/
  @javax.annotation.Nullable
  public BigDecimal getLatDegrees() {
    return latDegrees;
  }

  public void setLatDegrees(BigDecimal latDegrees) {
    this.latDegrees = latDegrees;
  }


  public DnsRecordsLOCRecordAllOfData latDirection(LatDirectionEnum latDirection) {
    this.latDirection = latDirection;
    return this;
  }

   /**
   * Latitude direction.
   * @return latDirection
  **/
  @javax.annotation.Nullable
  public LatDirectionEnum getLatDirection() {
    return latDirection;
  }

  public void setLatDirection(LatDirectionEnum latDirection) {
    this.latDirection = latDirection;
  }


  public DnsRecordsLOCRecordAllOfData latMinutes(BigDecimal latMinutes) {
    this.latMinutes = latMinutes;
    return this;
  }

   /**
   * Minutes of latitude.
   * minimum: 0
   * maximum: 59
   * @return latMinutes
  **/
  @javax.annotation.Nullable
  public BigDecimal getLatMinutes() {
    return latMinutes;
  }

  public void setLatMinutes(BigDecimal latMinutes) {
    this.latMinutes = latMinutes;
  }


  public DnsRecordsLOCRecordAllOfData latSeconds(BigDecimal latSeconds) {
    this.latSeconds = latSeconds;
    return this;
  }

   /**
   * Seconds of latitude.
   * minimum: 0
   * maximum: 59.999
   * @return latSeconds
  **/
  @javax.annotation.Nullable
  public BigDecimal getLatSeconds() {
    return latSeconds;
  }

  public void setLatSeconds(BigDecimal latSeconds) {
    this.latSeconds = latSeconds;
  }


  public DnsRecordsLOCRecordAllOfData longDegrees(BigDecimal longDegrees) {
    this.longDegrees = longDegrees;
    return this;
  }

   /**
   * Degrees of longitude.
   * minimum: 0
   * maximum: 180
   * @return longDegrees
  **/
  @javax.annotation.Nullable
  public BigDecimal getLongDegrees() {
    return longDegrees;
  }

  public void setLongDegrees(BigDecimal longDegrees) {
    this.longDegrees = longDegrees;
  }


  public DnsRecordsLOCRecordAllOfData longDirection(LongDirectionEnum longDirection) {
    this.longDirection = longDirection;
    return this;
  }

   /**
   * Longitude direction.
   * @return longDirection
  **/
  @javax.annotation.Nullable
  public LongDirectionEnum getLongDirection() {
    return longDirection;
  }

  public void setLongDirection(LongDirectionEnum longDirection) {
    this.longDirection = longDirection;
  }


  public DnsRecordsLOCRecordAllOfData longMinutes(BigDecimal longMinutes) {
    this.longMinutes = longMinutes;
    return this;
  }

   /**
   * Minutes of longitude.
   * minimum: 0
   * maximum: 59
   * @return longMinutes
  **/
  @javax.annotation.Nullable
  public BigDecimal getLongMinutes() {
    return longMinutes;
  }

  public void setLongMinutes(BigDecimal longMinutes) {
    this.longMinutes = longMinutes;
  }


  public DnsRecordsLOCRecordAllOfData longSeconds(BigDecimal longSeconds) {
    this.longSeconds = longSeconds;
    return this;
  }

   /**
   * Seconds of longitude.
   * minimum: 0
   * maximum: 59.999
   * @return longSeconds
  **/
  @javax.annotation.Nullable
  public BigDecimal getLongSeconds() {
    return longSeconds;
  }

  public void setLongSeconds(BigDecimal longSeconds) {
    this.longSeconds = longSeconds;
  }


  public DnsRecordsLOCRecordAllOfData precisionHorz(BigDecimal precisionHorz) {
    this.precisionHorz = precisionHorz;
    return this;
  }

   /**
   * Horizontal precision of location.
   * minimum: 0
   * maximum: 90000000
   * @return precisionHorz
  **/
  @javax.annotation.Nullable
  public BigDecimal getPrecisionHorz() {
    return precisionHorz;
  }

  public void setPrecisionHorz(BigDecimal precisionHorz) {
    this.precisionHorz = precisionHorz;
  }


  public DnsRecordsLOCRecordAllOfData precisionVert(BigDecimal precisionVert) {
    this.precisionVert = precisionVert;
    return this;
  }

   /**
   * Vertical precision of location.
   * minimum: 0
   * maximum: 90000000
   * @return precisionVert
  **/
  @javax.annotation.Nullable
  public BigDecimal getPrecisionVert() {
    return precisionVert;
  }

  public void setPrecisionVert(BigDecimal precisionVert) {
    this.precisionVert = precisionVert;
  }


  public DnsRecordsLOCRecordAllOfData size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Size of location in meters.
   * minimum: 0
   * maximum: 90000000
   * @return size
  **/
  @javax.annotation.Nullable
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRecordsLOCRecordAllOfData dnsRecordsLOCRecordAllOfData = (DnsRecordsLOCRecordAllOfData) o;
    return Objects.equals(this.altitude, dnsRecordsLOCRecordAllOfData.altitude) &&
        Objects.equals(this.latDegrees, dnsRecordsLOCRecordAllOfData.latDegrees) &&
        Objects.equals(this.latDirection, dnsRecordsLOCRecordAllOfData.latDirection) &&
        Objects.equals(this.latMinutes, dnsRecordsLOCRecordAllOfData.latMinutes) &&
        Objects.equals(this.latSeconds, dnsRecordsLOCRecordAllOfData.latSeconds) &&
        Objects.equals(this.longDegrees, dnsRecordsLOCRecordAllOfData.longDegrees) &&
        Objects.equals(this.longDirection, dnsRecordsLOCRecordAllOfData.longDirection) &&
        Objects.equals(this.longMinutes, dnsRecordsLOCRecordAllOfData.longMinutes) &&
        Objects.equals(this.longSeconds, dnsRecordsLOCRecordAllOfData.longSeconds) &&
        Objects.equals(this.precisionHorz, dnsRecordsLOCRecordAllOfData.precisionHorz) &&
        Objects.equals(this.precisionVert, dnsRecordsLOCRecordAllOfData.precisionVert) &&
        Objects.equals(this.size, dnsRecordsLOCRecordAllOfData.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altitude, latDegrees, latDirection, latMinutes, latSeconds, longDegrees, longDirection, longMinutes, longSeconds, precisionHorz, precisionVert, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRecordsLOCRecordAllOfData {\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    latDegrees: ").append(toIndentedString(latDegrees)).append("\n");
    sb.append("    latDirection: ").append(toIndentedString(latDirection)).append("\n");
    sb.append("    latMinutes: ").append(toIndentedString(latMinutes)).append("\n");
    sb.append("    latSeconds: ").append(toIndentedString(latSeconds)).append("\n");
    sb.append("    longDegrees: ").append(toIndentedString(longDegrees)).append("\n");
    sb.append("    longDirection: ").append(toIndentedString(longDirection)).append("\n");
    sb.append("    longMinutes: ").append(toIndentedString(longMinutes)).append("\n");
    sb.append("    longSeconds: ").append(toIndentedString(longSeconds)).append("\n");
    sb.append("    precisionHorz: ").append(toIndentedString(precisionHorz)).append("\n");
    sb.append("    precisionVert: ").append(toIndentedString(precisionVert)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
    openapiFields.add("altitude");
    openapiFields.add("lat_degrees");
    openapiFields.add("lat_direction");
    openapiFields.add("lat_minutes");
    openapiFields.add("lat_seconds");
    openapiFields.add("long_degrees");
    openapiFields.add("long_direction");
    openapiFields.add("long_minutes");
    openapiFields.add("long_seconds");
    openapiFields.add("precision_horz");
    openapiFields.add("precision_vert");
    openapiFields.add("size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DnsRecordsLOCRecordAllOfData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DnsRecordsLOCRecordAllOfData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DnsRecordsLOCRecordAllOfData is not found in the empty JSON string", DnsRecordsLOCRecordAllOfData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DnsRecordsLOCRecordAllOfData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DnsRecordsLOCRecordAllOfData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("lat_direction") != null && !jsonObj.get("lat_direction").isJsonNull()) && !jsonObj.get("lat_direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lat_direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lat_direction").toString()));
      }
      // validate the optional field `lat_direction`
      if (jsonObj.get("lat_direction") != null && !jsonObj.get("lat_direction").isJsonNull()) {
        LatDirectionEnum.validateJsonElement(jsonObj.get("lat_direction"));
      }
      if ((jsonObj.get("long_direction") != null && !jsonObj.get("long_direction").isJsonNull()) && !jsonObj.get("long_direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `long_direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("long_direction").toString()));
      }
      // validate the optional field `long_direction`
      if (jsonObj.get("long_direction") != null && !jsonObj.get("long_direction").isJsonNull()) {
        LongDirectionEnum.validateJsonElement(jsonObj.get("long_direction"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DnsRecordsLOCRecordAllOfData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DnsRecordsLOCRecordAllOfData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DnsRecordsLOCRecordAllOfData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DnsRecordsLOCRecordAllOfData.class));

       return (TypeAdapter<T>) new TypeAdapter<DnsRecordsLOCRecordAllOfData>() {
           @Override
           public void write(JsonWriter out, DnsRecordsLOCRecordAllOfData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DnsRecordsLOCRecordAllOfData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DnsRecordsLOCRecordAllOfData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DnsRecordsLOCRecordAllOfData
  * @throws IOException if the JSON string is invalid with respect to DnsRecordsLOCRecordAllOfData
  */
  public static DnsRecordsLOCRecordAllOfData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DnsRecordsLOCRecordAllOfData.class);
  }

 /**
  * Convert an instance of DnsRecordsLOCRecordAllOfData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

