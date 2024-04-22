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
 * The structured replacement for &#x60;logpull_options&#x60;. When including this field, the &#x60;logpull_option&#x60; field will be ignored.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class LogpushOutputOptions {
  public static final String SERIALIZED_NAME_C_V_E20214428 = "CVE-2021-4428";
  @SerializedName(SERIALIZED_NAME_C_V_E20214428)
  private Boolean CVE_2021_4428 = false;

  public static final String SERIALIZED_NAME_BATCH_PREFIX = "batch_prefix";
  @SerializedName(SERIALIZED_NAME_BATCH_PREFIX)
  private String batchPrefix = "";

  public static final String SERIALIZED_NAME_BATCH_SUFFIX = "batch_suffix";
  @SerializedName(SERIALIZED_NAME_BATCH_SUFFIX)
  private String batchSuffix = "";

  public static final String SERIALIZED_NAME_FIELD_DELIMITER = "field_delimiter";
  @SerializedName(SERIALIZED_NAME_FIELD_DELIMITER)
  private String fieldDelimiter = ",";

  public static final String SERIALIZED_NAME_FIELD_NAMES = "field_names";
  @SerializedName(SERIALIZED_NAME_FIELD_NAMES)
  private List<String> fieldNames = new ArrayList<>();

  /**
   * Specifies the output type, such as &#x60;ndjson&#x60; or &#x60;csv&#x60;. This sets default values for the rest of the settings, depending on the chosen output type. Some formatting rules, like string quoting, are different between output types.
   */
  @JsonAdapter(OutputTypeEnum.Adapter.class)
  public enum OutputTypeEnum {
    NDJSON("ndjson"),
    
    CSV("csv");

    private String value;

    OutputTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OutputTypeEnum fromValue(String value) {
      for (OutputTypeEnum b : OutputTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OutputTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OutputTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OutputTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OutputTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OutputTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OUTPUT_TYPE = "output_type";
  @SerializedName(SERIALIZED_NAME_OUTPUT_TYPE)
  private OutputTypeEnum outputType = OutputTypeEnum.NDJSON;

  public static final String SERIALIZED_NAME_RECORD_DELIMITER = "record_delimiter";
  @SerializedName(SERIALIZED_NAME_RECORD_DELIMITER)
  private String recordDelimiter = "";

  public static final String SERIALIZED_NAME_RECORD_PREFIX = "record_prefix";
  @SerializedName(SERIALIZED_NAME_RECORD_PREFIX)
  private String recordPrefix = "{";

  public static final String SERIALIZED_NAME_RECORD_SUFFIX = "record_suffix";
  @SerializedName(SERIALIZED_NAME_RECORD_SUFFIX)
  private String recordSuffix = "} ";

  public static final String SERIALIZED_NAME_RECORD_TEMPLATE = "record_template";
  @SerializedName(SERIALIZED_NAME_RECORD_TEMPLATE)
  private String recordTemplate = "";

  public static final String SERIALIZED_NAME_SAMPLE_RATE = "sample_rate";
  @SerializedName(SERIALIZED_NAME_SAMPLE_RATE)
  private Float sampleRate = 1f;

  /**
   * String to specify the format for timestamps, such as &#x60;unixnano&#x60;, &#x60;unix&#x60;, or &#x60;rfc3339&#x60;.
   */
  @JsonAdapter(TimestampFormatEnum.Adapter.class)
  public enum TimestampFormatEnum {
    UNIXNANO("unixnano"),
    
    UNIX("unix"),
    
    RFC3339("rfc3339");

    private String value;

    TimestampFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimestampFormatEnum fromValue(String value) {
      for (TimestampFormatEnum b : TimestampFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TimestampFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimestampFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimestampFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TimestampFormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TimestampFormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TIMESTAMP_FORMAT = "timestamp_format";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_FORMAT)
  private TimestampFormatEnum timestampFormat = TimestampFormatEnum.UNIXNANO;

  public LogpushOutputOptions() {
  }

  public LogpushOutputOptions CVE_2021_4428(Boolean CVE_2021_4428) {
    this.CVE_2021_4428 = CVE_2021_4428;
    return this;
  }

   /**
   * If set to true, will cause all occurrences of &#x60;${&#x60; in the generated files to be replaced with &#x60;x{&#x60;.
   * @return CVE_2021_4428
  **/
  @javax.annotation.Nullable
  public Boolean getCVE20214428() {
    return CVE_2021_4428;
  }

  public void setCVE20214428(Boolean CVE_2021_4428) {
    this.CVE_2021_4428 = CVE_2021_4428;
  }


  public LogpushOutputOptions batchPrefix(String batchPrefix) {
    this.batchPrefix = batchPrefix;
    return this;
  }

   /**
   * String to be prepended before each batch.
   * @return batchPrefix
  **/
  @javax.annotation.Nullable
  public String getBatchPrefix() {
    return batchPrefix;
  }

  public void setBatchPrefix(String batchPrefix) {
    this.batchPrefix = batchPrefix;
  }


  public LogpushOutputOptions batchSuffix(String batchSuffix) {
    this.batchSuffix = batchSuffix;
    return this;
  }

   /**
   * String to be appended after each batch.
   * @return batchSuffix
  **/
  @javax.annotation.Nullable
  public String getBatchSuffix() {
    return batchSuffix;
  }

  public void setBatchSuffix(String batchSuffix) {
    this.batchSuffix = batchSuffix;
  }


  public LogpushOutputOptions fieldDelimiter(String fieldDelimiter) {
    this.fieldDelimiter = fieldDelimiter;
    return this;
  }

   /**
   * String to join fields. This field be ignored when &#x60;record_template&#x60; is set.
   * @return fieldDelimiter
  **/
  @javax.annotation.Nullable
  public String getFieldDelimiter() {
    return fieldDelimiter;
  }

  public void setFieldDelimiter(String fieldDelimiter) {
    this.fieldDelimiter = fieldDelimiter;
  }


  public LogpushOutputOptions fieldNames(List<String> fieldNames) {
    this.fieldNames = fieldNames;
    return this;
  }

  public LogpushOutputOptions addFieldNamesItem(String fieldNamesItem) {
    if (this.fieldNames == null) {
      this.fieldNames = new ArrayList<>();
    }
    this.fieldNames.add(fieldNamesItem);
    return this;
  }

   /**
   * List of field names to be included in the Logpush output. For the moment, there is no option to add all fields at once, so you must specify all the fields names you are interested in.
   * @return fieldNames
  **/
  @javax.annotation.Nullable
  public List<String> getFieldNames() {
    return fieldNames;
  }

  public void setFieldNames(List<String> fieldNames) {
    this.fieldNames = fieldNames;
  }


  public LogpushOutputOptions outputType(OutputTypeEnum outputType) {
    this.outputType = outputType;
    return this;
  }

   /**
   * Specifies the output type, such as &#x60;ndjson&#x60; or &#x60;csv&#x60;. This sets default values for the rest of the settings, depending on the chosen output type. Some formatting rules, like string quoting, are different between output types.
   * @return outputType
  **/
  @javax.annotation.Nullable
  public OutputTypeEnum getOutputType() {
    return outputType;
  }

  public void setOutputType(OutputTypeEnum outputType) {
    this.outputType = outputType;
  }


  public LogpushOutputOptions recordDelimiter(String recordDelimiter) {
    this.recordDelimiter = recordDelimiter;
    return this;
  }

   /**
   * String to be inserted in-between the records as separator.
   * @return recordDelimiter
  **/
  @javax.annotation.Nullable
  public String getRecordDelimiter() {
    return recordDelimiter;
  }

  public void setRecordDelimiter(String recordDelimiter) {
    this.recordDelimiter = recordDelimiter;
  }


  public LogpushOutputOptions recordPrefix(String recordPrefix) {
    this.recordPrefix = recordPrefix;
    return this;
  }

   /**
   * String to be prepended before each record.
   * @return recordPrefix
  **/
  @javax.annotation.Nullable
  public String getRecordPrefix() {
    return recordPrefix;
  }

  public void setRecordPrefix(String recordPrefix) {
    this.recordPrefix = recordPrefix;
  }


  public LogpushOutputOptions recordSuffix(String recordSuffix) {
    this.recordSuffix = recordSuffix;
    return this;
  }

   /**
   * String to be appended after each record.
   * @return recordSuffix
  **/
  @javax.annotation.Nullable
  public String getRecordSuffix() {
    return recordSuffix;
  }

  public void setRecordSuffix(String recordSuffix) {
    this.recordSuffix = recordSuffix;
  }


  public LogpushOutputOptions recordTemplate(String recordTemplate) {
    this.recordTemplate = recordTemplate;
    return this;
  }

   /**
   * String to use as template for each record instead of the default comma-separated list. All fields used in the template must be present in &#x60;field_names&#x60; as well, otherwise they will end up as null. Format as a Go &#x60;text/template&#x60; without any standard functions, like conditionals, loops, sub-templates, etc.
   * @return recordTemplate
  **/
  @javax.annotation.Nullable
  public String getRecordTemplate() {
    return recordTemplate;
  }

  public void setRecordTemplate(String recordTemplate) {
    this.recordTemplate = recordTemplate;
  }


  public LogpushOutputOptions sampleRate(Float sampleRate) {
    this.sampleRate = sampleRate;
    return this;
  }

   /**
   * Floating number to specify sampling rate. Sampling is applied on top of filtering, and regardless of the current &#x60;sample_interval&#x60; of the data.
   * minimum: 0
   * maximum: 1
   * @return sampleRate
  **/
  @javax.annotation.Nullable
  public Float getSampleRate() {
    return sampleRate;
  }

  public void setSampleRate(Float sampleRate) {
    this.sampleRate = sampleRate;
  }


  public LogpushOutputOptions timestampFormat(TimestampFormatEnum timestampFormat) {
    this.timestampFormat = timestampFormat;
    return this;
  }

   /**
   * String to specify the format for timestamps, such as &#x60;unixnano&#x60;, &#x60;unix&#x60;, or &#x60;rfc3339&#x60;.
   * @return timestampFormat
  **/
  @javax.annotation.Nullable
  public TimestampFormatEnum getTimestampFormat() {
    return timestampFormat;
  }

  public void setTimestampFormat(TimestampFormatEnum timestampFormat) {
    this.timestampFormat = timestampFormat;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogpushOutputOptions logpushOutputOptions = (LogpushOutputOptions) o;
    return Objects.equals(this.CVE_2021_4428, logpushOutputOptions.CVE_2021_4428) &&
        Objects.equals(this.batchPrefix, logpushOutputOptions.batchPrefix) &&
        Objects.equals(this.batchSuffix, logpushOutputOptions.batchSuffix) &&
        Objects.equals(this.fieldDelimiter, logpushOutputOptions.fieldDelimiter) &&
        Objects.equals(this.fieldNames, logpushOutputOptions.fieldNames) &&
        Objects.equals(this.outputType, logpushOutputOptions.outputType) &&
        Objects.equals(this.recordDelimiter, logpushOutputOptions.recordDelimiter) &&
        Objects.equals(this.recordPrefix, logpushOutputOptions.recordPrefix) &&
        Objects.equals(this.recordSuffix, logpushOutputOptions.recordSuffix) &&
        Objects.equals(this.recordTemplate, logpushOutputOptions.recordTemplate) &&
        Objects.equals(this.sampleRate, logpushOutputOptions.sampleRate) &&
        Objects.equals(this.timestampFormat, logpushOutputOptions.timestampFormat);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(CVE_2021_4428, batchPrefix, batchSuffix, fieldDelimiter, fieldNames, outputType, recordDelimiter, recordPrefix, recordSuffix, recordTemplate, sampleRate, timestampFormat);
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
    sb.append("class LogpushOutputOptions {\n");
    sb.append("    CVE_2021_4428: ").append(toIndentedString(CVE_2021_4428)).append("\n");
    sb.append("    batchPrefix: ").append(toIndentedString(batchPrefix)).append("\n");
    sb.append("    batchSuffix: ").append(toIndentedString(batchSuffix)).append("\n");
    sb.append("    fieldDelimiter: ").append(toIndentedString(fieldDelimiter)).append("\n");
    sb.append("    fieldNames: ").append(toIndentedString(fieldNames)).append("\n");
    sb.append("    outputType: ").append(toIndentedString(outputType)).append("\n");
    sb.append("    recordDelimiter: ").append(toIndentedString(recordDelimiter)).append("\n");
    sb.append("    recordPrefix: ").append(toIndentedString(recordPrefix)).append("\n");
    sb.append("    recordSuffix: ").append(toIndentedString(recordSuffix)).append("\n");
    sb.append("    recordTemplate: ").append(toIndentedString(recordTemplate)).append("\n");
    sb.append("    sampleRate: ").append(toIndentedString(sampleRate)).append("\n");
    sb.append("    timestampFormat: ").append(toIndentedString(timestampFormat)).append("\n");
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
    openapiFields.add("CVE-2021-4428");
    openapiFields.add("batch_prefix");
    openapiFields.add("batch_suffix");
    openapiFields.add("field_delimiter");
    openapiFields.add("field_names");
    openapiFields.add("output_type");
    openapiFields.add("record_delimiter");
    openapiFields.add("record_prefix");
    openapiFields.add("record_suffix");
    openapiFields.add("record_template");
    openapiFields.add("sample_rate");
    openapiFields.add("timestamp_format");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LogpushOutputOptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LogpushOutputOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LogpushOutputOptions is not found in the empty JSON string", LogpushOutputOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LogpushOutputOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LogpushOutputOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("batch_prefix") != null && !jsonObj.get("batch_prefix").isJsonNull()) && !jsonObj.get("batch_prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_prefix").toString()));
      }
      if ((jsonObj.get("batch_suffix") != null && !jsonObj.get("batch_suffix").isJsonNull()) && !jsonObj.get("batch_suffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_suffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_suffix").toString()));
      }
      if ((jsonObj.get("field_delimiter") != null && !jsonObj.get("field_delimiter").isJsonNull()) && !jsonObj.get("field_delimiter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field_delimiter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field_delimiter").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("field_names") != null && !jsonObj.get("field_names").isJsonNull() && !jsonObj.get("field_names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `field_names` to be an array in the JSON string but got `%s`", jsonObj.get("field_names").toString()));
      }
      if ((jsonObj.get("output_type") != null && !jsonObj.get("output_type").isJsonNull()) && !jsonObj.get("output_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `output_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("output_type").toString()));
      }
      // validate the optional field `output_type`
      if (jsonObj.get("output_type") != null && !jsonObj.get("output_type").isJsonNull()) {
        OutputTypeEnum.validateJsonElement(jsonObj.get("output_type"));
      }
      if ((jsonObj.get("record_delimiter") != null && !jsonObj.get("record_delimiter").isJsonNull()) && !jsonObj.get("record_delimiter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `record_delimiter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("record_delimiter").toString()));
      }
      if ((jsonObj.get("record_prefix") != null && !jsonObj.get("record_prefix").isJsonNull()) && !jsonObj.get("record_prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `record_prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("record_prefix").toString()));
      }
      if ((jsonObj.get("record_suffix") != null && !jsonObj.get("record_suffix").isJsonNull()) && !jsonObj.get("record_suffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `record_suffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("record_suffix").toString()));
      }
      if ((jsonObj.get("record_template") != null && !jsonObj.get("record_template").isJsonNull()) && !jsonObj.get("record_template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `record_template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("record_template").toString()));
      }
      if ((jsonObj.get("timestamp_format") != null && !jsonObj.get("timestamp_format").isJsonNull()) && !jsonObj.get("timestamp_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp_format").toString()));
      }
      // validate the optional field `timestamp_format`
      if (jsonObj.get("timestamp_format") != null && !jsonObj.get("timestamp_format").isJsonNull()) {
        TimestampFormatEnum.validateJsonElement(jsonObj.get("timestamp_format"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LogpushOutputOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LogpushOutputOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LogpushOutputOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LogpushOutputOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<LogpushOutputOptions>() {
           @Override
           public void write(JsonWriter out, LogpushOutputOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LogpushOutputOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LogpushOutputOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LogpushOutputOptions
  * @throws IOException if the JSON string is invalid with respect to LogpushOutputOptions
  */
  public static LogpushOutputOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LogpushOutputOptions.class);
  }

 /**
  * Convert an instance of LogpushOutputOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
