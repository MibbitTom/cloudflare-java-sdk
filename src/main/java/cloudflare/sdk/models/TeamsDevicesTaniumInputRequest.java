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
 * TeamsDevicesTaniumInputRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class TeamsDevicesTaniumInputRequest {
  public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
  private String connectionId;

  public static final String SERIALIZED_NAME_EID_LAST_SEEN = "eid_last_seen";
  @SerializedName(SERIALIZED_NAME_EID_LAST_SEEN)
  private String eidLastSeen;

  /**
   * Operator to evaluate risk_level or eid_last_seen.
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    LESS_THAN("<"),
    
    LESS_THAN_OR_EQUAL_TO("<="),
    
    GREATER_THAN(">"),
    
    GREATER_THAN_OR_EQUAL_TO(">="),
    
    u("==");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperatorEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OperatorEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private OperatorEnum operator;

  /**
   * For more details on risk level, refer to the Tanium documentation.
   */
  @JsonAdapter(RiskLevelEnum.Adapter.class)
  public enum RiskLevelEnum {
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high"),
    
    CRITICAL("critical");

    private String value;

    RiskLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RiskLevelEnum fromValue(String value) {
      for (RiskLevelEnum b : RiskLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RiskLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RiskLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RiskLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RiskLevelEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RiskLevelEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RISK_LEVEL = "risk_level";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private RiskLevelEnum riskLevel;

  /**
   * Score Operator
   */
  @JsonAdapter(ScoreOperatorEnum.Adapter.class)
  public enum ScoreOperatorEnum {
    LESS_THAN("<"),
    
    LESS_THAN_OR_EQUAL_TO("<="),
    
    GREATER_THAN(">"),
    
    GREATER_THAN_OR_EQUAL_TO(">="),
    
    u("==");

    private String value;

    ScoreOperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScoreOperatorEnum fromValue(String value) {
      for (ScoreOperatorEnum b : ScoreOperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScoreOperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScoreOperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScoreOperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScoreOperatorEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ScoreOperatorEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SCORE_OPERATOR = "scoreOperator";
  @SerializedName(SERIALIZED_NAME_SCORE_OPERATOR)
  private ScoreOperatorEnum scoreOperator;

  public static final String SERIALIZED_NAME_TOTAL_SCORE = "total_score";
  @SerializedName(SERIALIZED_NAME_TOTAL_SCORE)
  private BigDecimal totalScore;

  public TeamsDevicesTaniumInputRequest() {
  }

  public TeamsDevicesTaniumInputRequest connectionId(String connectionId) {
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


  public TeamsDevicesTaniumInputRequest eidLastSeen(String eidLastSeen) {
    this.eidLastSeen = eidLastSeen;
    return this;
  }

   /**
   * For more details on eid last seen, refer to the Tanium documentation.
   * @return eidLastSeen
  **/
  @javax.annotation.Nullable
  public String getEidLastSeen() {
    return eidLastSeen;
  }

  public void setEidLastSeen(String eidLastSeen) {
    this.eidLastSeen = eidLastSeen;
  }


  public TeamsDevicesTaniumInputRequest operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Operator to evaluate risk_level or eid_last_seen.
   * @return operator
  **/
  @javax.annotation.Nullable
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  public TeamsDevicesTaniumInputRequest riskLevel(RiskLevelEnum riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * For more details on risk level, refer to the Tanium documentation.
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  public RiskLevelEnum getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(RiskLevelEnum riskLevel) {
    this.riskLevel = riskLevel;
  }


  public TeamsDevicesTaniumInputRequest scoreOperator(ScoreOperatorEnum scoreOperator) {
    this.scoreOperator = scoreOperator;
    return this;
  }

   /**
   * Score Operator
   * @return scoreOperator
  **/
  @javax.annotation.Nullable
  public ScoreOperatorEnum getScoreOperator() {
    return scoreOperator;
  }

  public void setScoreOperator(ScoreOperatorEnum scoreOperator) {
    this.scoreOperator = scoreOperator;
  }


  public TeamsDevicesTaniumInputRequest totalScore(BigDecimal totalScore) {
    this.totalScore = totalScore;
    return this;
  }

   /**
   * For more details on total score, refer to the Tanium documentation.
   * @return totalScore
  **/
  @javax.annotation.Nullable
  public BigDecimal getTotalScore() {
    return totalScore;
  }

  public void setTotalScore(BigDecimal totalScore) {
    this.totalScore = totalScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamsDevicesTaniumInputRequest teamsDevicesTaniumInputRequest = (TeamsDevicesTaniumInputRequest) o;
    return Objects.equals(this.connectionId, teamsDevicesTaniumInputRequest.connectionId) &&
        Objects.equals(this.eidLastSeen, teamsDevicesTaniumInputRequest.eidLastSeen) &&
        Objects.equals(this.operator, teamsDevicesTaniumInputRequest.operator) &&
        Objects.equals(this.riskLevel, teamsDevicesTaniumInputRequest.riskLevel) &&
        Objects.equals(this.scoreOperator, teamsDevicesTaniumInputRequest.scoreOperator) &&
        Objects.equals(this.totalScore, teamsDevicesTaniumInputRequest.totalScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, eidLastSeen, operator, riskLevel, scoreOperator, totalScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsDevicesTaniumInputRequest {\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    eidLastSeen: ").append(toIndentedString(eidLastSeen)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    scoreOperator: ").append(toIndentedString(scoreOperator)).append("\n");
    sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
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
    openapiFields.add("eid_last_seen");
    openapiFields.add("operator");
    openapiFields.add("risk_level");
    openapiFields.add("scoreOperator");
    openapiFields.add("total_score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("connection_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TeamsDevicesTaniumInputRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TeamsDevicesTaniumInputRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TeamsDevicesTaniumInputRequest is not found in the empty JSON string", TeamsDevicesTaniumInputRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TeamsDevicesTaniumInputRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TeamsDevicesTaniumInputRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TeamsDevicesTaniumInputRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("connection_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_id").toString()));
      }
      if ((jsonObj.get("eid_last_seen") != null && !jsonObj.get("eid_last_seen").isJsonNull()) && !jsonObj.get("eid_last_seen").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eid_last_seen` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eid_last_seen").toString()));
      }
      if ((jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonNull()) && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      // validate the optional field `operator`
      if (jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonNull()) {
        OperatorEnum.validateJsonElement(jsonObj.get("operator"));
      }
      if ((jsonObj.get("risk_level") != null && !jsonObj.get("risk_level").isJsonNull()) && !jsonObj.get("risk_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `risk_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("risk_level").toString()));
      }
      // validate the optional field `risk_level`
      if (jsonObj.get("risk_level") != null && !jsonObj.get("risk_level").isJsonNull()) {
        RiskLevelEnum.validateJsonElement(jsonObj.get("risk_level"));
      }
      if ((jsonObj.get("scoreOperator") != null && !jsonObj.get("scoreOperator").isJsonNull()) && !jsonObj.get("scoreOperator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scoreOperator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scoreOperator").toString()));
      }
      // validate the optional field `scoreOperator`
      if (jsonObj.get("scoreOperator") != null && !jsonObj.get("scoreOperator").isJsonNull()) {
        ScoreOperatorEnum.validateJsonElement(jsonObj.get("scoreOperator"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TeamsDevicesTaniumInputRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TeamsDevicesTaniumInputRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TeamsDevicesTaniumInputRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TeamsDevicesTaniumInputRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TeamsDevicesTaniumInputRequest>() {
           @Override
           public void write(JsonWriter out, TeamsDevicesTaniumInputRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TeamsDevicesTaniumInputRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TeamsDevicesTaniumInputRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TeamsDevicesTaniumInputRequest
  * @throws IOException if the JSON string is invalid with respect to TeamsDevicesTaniumInputRequest
  */
  public static TeamsDevicesTaniumInputRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TeamsDevicesTaniumInputRequest.class);
  }

 /**
  * Convert an instance of TeamsDevicesTaniumInputRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
