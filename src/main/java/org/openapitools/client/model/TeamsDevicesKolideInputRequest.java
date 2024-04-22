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
 * TeamsDevicesKolideInputRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TeamsDevicesKolideInputRequest {
  public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
  private String connectionId;

  /**
   * Count Operator
   */
  @JsonAdapter(CountOperatorEnum.Adapter.class)
  public enum CountOperatorEnum {
    LESS_THAN("<"),
    
    LESS_THAN_OR_EQUAL_TO("<="),
    
    GREATER_THAN(">"),
    
    GREATER_THAN_OR_EQUAL_TO(">="),
    
    u("==");

    private String value;

    CountOperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CountOperatorEnum fromValue(String value) {
      for (CountOperatorEnum b : CountOperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CountOperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CountOperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CountOperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CountOperatorEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CountOperatorEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_COUNT_OPERATOR = "countOperator";
  @SerializedName(SERIALIZED_NAME_COUNT_OPERATOR)
  private CountOperatorEnum countOperator;

  public static final String SERIALIZED_NAME_ISSUE_COUNT = "issue_count";
  @SerializedName(SERIALIZED_NAME_ISSUE_COUNT)
  private String issueCount;

  public TeamsDevicesKolideInputRequest() {
  }

  public TeamsDevicesKolideInputRequest connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Posture Integration ID.
   * @return connectionId
  **/
  @javax.annotation.Nonnull
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public TeamsDevicesKolideInputRequest countOperator(CountOperatorEnum countOperator) {
    this.countOperator = countOperator;
    return this;
  }

   /**
   * Count Operator
   * @return countOperator
  **/
  @javax.annotation.Nonnull
  public CountOperatorEnum getCountOperator() {
    return countOperator;
  }

  public void setCountOperator(CountOperatorEnum countOperator) {
    this.countOperator = countOperator;
  }


  public TeamsDevicesKolideInputRequest issueCount(String issueCount) {
    this.issueCount = issueCount;
    return this;
  }

   /**
   * The Number of Issues.
   * @return issueCount
  **/
  @javax.annotation.Nonnull
  public String getIssueCount() {
    return issueCount;
  }

  public void setIssueCount(String issueCount) {
    this.issueCount = issueCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamsDevicesKolideInputRequest teamsDevicesKolideInputRequest = (TeamsDevicesKolideInputRequest) o;
    return Objects.equals(this.connectionId, teamsDevicesKolideInputRequest.connectionId) &&
        Objects.equals(this.countOperator, teamsDevicesKolideInputRequest.countOperator) &&
        Objects.equals(this.issueCount, teamsDevicesKolideInputRequest.issueCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, countOperator, issueCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsDevicesKolideInputRequest {\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    countOperator: ").append(toIndentedString(countOperator)).append("\n");
    sb.append("    issueCount: ").append(toIndentedString(issueCount)).append("\n");
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
    openapiFields.add("connection_id");
    openapiFields.add("countOperator");
    openapiFields.add("issue_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("connection_id");
    openapiRequiredFields.add("countOperator");
    openapiRequiredFields.add("issue_count");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TeamsDevicesKolideInputRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TeamsDevicesKolideInputRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TeamsDevicesKolideInputRequest is not found in the empty JSON string", TeamsDevicesKolideInputRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TeamsDevicesKolideInputRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TeamsDevicesKolideInputRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TeamsDevicesKolideInputRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("connection_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_id").toString()));
      }
      if (!jsonObj.get("countOperator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countOperator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countOperator").toString()));
      }
      // validate the required field `countOperator`
      CountOperatorEnum.validateJsonElement(jsonObj.get("countOperator"));
      if (!jsonObj.get("issue_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issue_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issue_count").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TeamsDevicesKolideInputRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TeamsDevicesKolideInputRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TeamsDevicesKolideInputRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TeamsDevicesKolideInputRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TeamsDevicesKolideInputRequest>() {
           @Override
           public void write(JsonWriter out, TeamsDevicesKolideInputRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TeamsDevicesKolideInputRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TeamsDevicesKolideInputRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TeamsDevicesKolideInputRequest
  * @throws IOException if the JSON string is invalid with respect to TeamsDevicesKolideInputRequest
  */
  public static TeamsDevicesKolideInputRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TeamsDevicesKolideInputRequest.class);
  }

 /**
  * Convert an instance of TeamsDevicesKolideInputRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

