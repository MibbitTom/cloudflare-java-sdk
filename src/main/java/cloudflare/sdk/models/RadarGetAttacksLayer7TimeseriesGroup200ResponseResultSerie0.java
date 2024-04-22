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
import java.time.OffsetDateTime;
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

import cloudflare.JSON;

/**
 * RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 {
  public static final String SERIALIZED_NAME_A_C_C_E_S_S_R_U_L_E_S = "ACCESS_RULES";
  @SerializedName(SERIALIZED_NAME_A_C_C_E_S_S_R_U_L_E_S)
  private List<String> ACCESS_RULES = new ArrayList<>();

  public static final String SERIALIZED_NAME_A_P_I_S_H_I_E_L_D = "API_SHIELD";
  @SerializedName(SERIALIZED_NAME_A_P_I_S_H_I_E_L_D)
  private List<String> API_SHIELD = new ArrayList<>();

  public static final String SERIALIZED_NAME_B_O_T_M_A_N_A_G_E_M_E_N_T = "BOT_MANAGEMENT";
  @SerializedName(SERIALIZED_NAME_B_O_T_M_A_N_A_G_E_M_E_N_T)
  private List<String> BOT_MANAGEMENT = new ArrayList<>();

  public static final String SERIALIZED_NAME_D_A_T_A_L_O_S_S_P_R_E_V_E_N_T_I_O_N = "DATA_LOSS_PREVENTION";
  @SerializedName(SERIALIZED_NAME_D_A_T_A_L_O_S_S_P_R_E_V_E_N_T_I_O_N)
  private List<String> DATA_LOSS_PREVENTION = new ArrayList<>();

  public static final String SERIALIZED_NAME_D_D_O_S = "DDOS";
  @SerializedName(SERIALIZED_NAME_D_D_O_S)
  private List<String> DDOS = new ArrayList<>();

  public static final String SERIALIZED_NAME_I_P_R_E_P_U_T_A_T_I_O_N = "IP_REPUTATION";
  @SerializedName(SERIALIZED_NAME_I_P_R_E_P_U_T_A_T_I_O_N)
  private List<String> IP_REPUTATION = new ArrayList<>();

  public static final String SERIALIZED_NAME_W_A_F = "WAF";
  @SerializedName(SERIALIZED_NAME_W_A_F)
  private List<String> WAF = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIMESTAMPS = "timestamps";
  @SerializedName(SERIALIZED_NAME_TIMESTAMPS)
  private List<OffsetDateTime> timestamps = new ArrayList<>();

  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0() {
  }

  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 ACCESS_RULES(List<String> ACCESS_RULES) {
    this.ACCESS_RULES = ACCESS_RULES;
    return this;
  }

  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 addACCESSRULESItem(String ACCESS_RULESItem) {
    if (this.ACCESS_RULES == null) {
      this.ACCESS_RULES = new ArrayList<>();
    }
    this.ACCESS_RULES.add(ACCESS_RULESItem);
    return this;
  }

   /**
   * Get ACCESS_RULES
   * @return ACCESS_RULES
  **/
  @javax.annotation.Nonnull
  public List<String> getACCESSRULES() {
    return ACCESS_RULES;
  }

  public void setACCESSRULES(List<String> ACCESS_RULES) {
    this.ACCESS_RULES = ACCESS_RULES;
  }


  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 API_SHIELD(List<String> API_SHIELD) {
    this.API_SHIELD = API_SHIELD;
    return this;
  }

  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 addAPISHIELDItem(String API_SHIELDItem) {
    if (this.API_SHIELD == null) {
      this.API_SHIELD = new ArrayList<>();
    }
    this.API_SHIELD.add(API_SHIELDItem);
    return this;
  }

   /**
   * Get API_SHIELD
   * @return API_SHIELD
  **/
  @javax.annotation.Nonnull
  public List<String> getAPISHIELD() {
    return API_SHIELD;
  }

  public void setAPISHIELD(List<String> API_SHIELD) {
    this.API_SHIELD = API_SHIELD;
  }


  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 BOT_MANAGEMENT(List<String> BOT_MANAGEMENT) {
    this.BOT_MANAGEMENT = BOT_MANAGEMENT;
    return this;
  }

  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 addBOTMANAGEMENTItem(String BOT_MANAGEMENTItem) {
    if (this.BOT_MANAGEMENT == null) {
      this.BOT_MANAGEMENT = new ArrayList<>();
    }
    this.BOT_MANAGEMENT.add(BOT_MANAGEMENTItem);
    return this;
  }

   /**
   * Get BOT_MANAGEMENT
   * @return BOT_MANAGEMENT
  **/
  @javax.annotation.Nonnull
  public List<String> getBOTMANAGEMENT() {
    return BOT_MANAGEMENT;
  }

  public void setBOTMANAGEMENT(List<String> BOT_MANAGEMENT) {
    this.BOT_MANAGEMENT = BOT_MANAGEMENT;
  }


  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 DATA_LOSS_PREVENTION(List<String> DATA_LOSS_PREVENTION) {
    this.DATA_LOSS_PREVENTION = DATA_LOSS_PREVENTION;
    return this;
  }

  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 addDATALOSSPREVENTIONItem(String DATA_LOSS_PREVENTIONItem) {
    if (this.DATA_LOSS_PREVENTION == null) {
      this.DATA_LOSS_PREVENTION = new ArrayList<>();
    }
    this.DATA_LOSS_PREVENTION.add(DATA_LOSS_PREVENTIONItem);
    return this;
  }

   /**
   * Get DATA_LOSS_PREVENTION
   * @return DATA_LOSS_PREVENTION
  **/
  @javax.annotation.Nonnull
  public List<String> getDATALOSSPREVENTION() {
    return DATA_LOSS_PREVENTION;
  }

  public void setDATALOSSPREVENTION(List<String> DATA_LOSS_PREVENTION) {
    this.DATA_LOSS_PREVENTION = DATA_LOSS_PREVENTION;
  }


  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 DDOS(List<String> DDOS) {
    this.DDOS = DDOS;
    return this;
  }

  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 addDDOSItem(String DDOSItem) {
    if (this.DDOS == null) {
      this.DDOS = new ArrayList<>();
    }
    this.DDOS.add(DDOSItem);
    return this;
  }

   /**
   * Get DDOS
   * @return DDOS
  **/
  @javax.annotation.Nonnull
  public List<String> getDDOS() {
    return DDOS;
  }

  public void setDDOS(List<String> DDOS) {
    this.DDOS = DDOS;
  }


  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 IP_REPUTATION(List<String> IP_REPUTATION) {
    this.IP_REPUTATION = IP_REPUTATION;
    return this;
  }

  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 addIPREPUTATIONItem(String IP_REPUTATIONItem) {
    if (this.IP_REPUTATION == null) {
      this.IP_REPUTATION = new ArrayList<>();
    }
    this.IP_REPUTATION.add(IP_REPUTATIONItem);
    return this;
  }

   /**
   * Get IP_REPUTATION
   * @return IP_REPUTATION
  **/
  @javax.annotation.Nonnull
  public List<String> getIPREPUTATION() {
    return IP_REPUTATION;
  }

  public void setIPREPUTATION(List<String> IP_REPUTATION) {
    this.IP_REPUTATION = IP_REPUTATION;
  }


  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 WAF(List<String> WAF) {
    this.WAF = WAF;
    return this;
  }

  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 addWAFItem(String WAFItem) {
    if (this.WAF == null) {
      this.WAF = new ArrayList<>();
    }
    this.WAF.add(WAFItem);
    return this;
  }

   /**
   * Get WAF
   * @return WAF
  **/
  @javax.annotation.Nonnull
  public List<String> getWAF() {
    return WAF;
  }

  public void setWAF(List<String> WAF) {
    this.WAF = WAF;
  }


  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 timestamps(List<OffsetDateTime> timestamps) {
    this.timestamps = timestamps;
    return this;
  }

  public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 addTimestampsItem(OffsetDateTime timestampsItem) {
    if (this.timestamps == null) {
      this.timestamps = new ArrayList<>();
    }
    this.timestamps.add(timestampsItem);
    return this;
  }

   /**
   * Get timestamps
   * @return timestamps
  **/
  @javax.annotation.Nonnull
  public List<OffsetDateTime> getTimestamps() {
    return timestamps;
  }

  public void setTimestamps(List<OffsetDateTime> timestamps) {
    this.timestamps = timestamps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 radarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 = (RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0) o;
    return Objects.equals(this.ACCESS_RULES, radarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0.ACCESS_RULES) &&
        Objects.equals(this.API_SHIELD, radarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0.API_SHIELD) &&
        Objects.equals(this.BOT_MANAGEMENT, radarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0.BOT_MANAGEMENT) &&
        Objects.equals(this.DATA_LOSS_PREVENTION, radarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0.DATA_LOSS_PREVENTION) &&
        Objects.equals(this.DDOS, radarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0.DDOS) &&
        Objects.equals(this.IP_REPUTATION, radarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0.IP_REPUTATION) &&
        Objects.equals(this.WAF, radarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0.WAF) &&
        Objects.equals(this.timestamps, radarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0.timestamps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ACCESS_RULES, API_SHIELD, BOT_MANAGEMENT, DATA_LOSS_PREVENTION, DDOS, IP_REPUTATION, WAF, timestamps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 {\n");
    sb.append("    ACCESS_RULES: ").append(toIndentedString(ACCESS_RULES)).append("\n");
    sb.append("    API_SHIELD: ").append(toIndentedString(API_SHIELD)).append("\n");
    sb.append("    BOT_MANAGEMENT: ").append(toIndentedString(BOT_MANAGEMENT)).append("\n");
    sb.append("    DATA_LOSS_PREVENTION: ").append(toIndentedString(DATA_LOSS_PREVENTION)).append("\n");
    sb.append("    DDOS: ").append(toIndentedString(DDOS)).append("\n");
    sb.append("    IP_REPUTATION: ").append(toIndentedString(IP_REPUTATION)).append("\n");
    sb.append("    WAF: ").append(toIndentedString(WAF)).append("\n");
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
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
    openapiFields.add("ACCESS_RULES");
    openapiFields.add("API_SHIELD");
    openapiFields.add("BOT_MANAGEMENT");
    openapiFields.add("DATA_LOSS_PREVENTION");
    openapiFields.add("DDOS");
    openapiFields.add("IP_REPUTATION");
    openapiFields.add("WAF");
    openapiFields.add("timestamps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ACCESS_RULES");
    openapiRequiredFields.add("API_SHIELD");
    openapiRequiredFields.add("BOT_MANAGEMENT");
    openapiRequiredFields.add("DATA_LOSS_PREVENTION");
    openapiRequiredFields.add("DDOS");
    openapiRequiredFields.add("IP_REPUTATION");
    openapiRequiredFields.add("WAF");
    openapiRequiredFields.add("timestamps");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 is not found in the empty JSON string", RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("ACCESS_RULES") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("ACCESS_RULES").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ACCESS_RULES` to be an array in the JSON string but got `%s`", jsonObj.get("ACCESS_RULES").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("API_SHIELD") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("API_SHIELD").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `API_SHIELD` to be an array in the JSON string but got `%s`", jsonObj.get("API_SHIELD").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("BOT_MANAGEMENT") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("BOT_MANAGEMENT").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `BOT_MANAGEMENT` to be an array in the JSON string but got `%s`", jsonObj.get("BOT_MANAGEMENT").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("DATA_LOSS_PREVENTION") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("DATA_LOSS_PREVENTION").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `DATA_LOSS_PREVENTION` to be an array in the JSON string but got `%s`", jsonObj.get("DATA_LOSS_PREVENTION").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("DDOS") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("DDOS").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `DDOS` to be an array in the JSON string but got `%s`", jsonObj.get("DDOS").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("IP_REPUTATION") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("IP_REPUTATION").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `IP_REPUTATION` to be an array in the JSON string but got `%s`", jsonObj.get("IP_REPUTATION").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("WAF") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("WAF").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `WAF` to be an array in the JSON string but got `%s`", jsonObj.get("WAF").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("timestamps") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("timestamps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamps` to be an array in the JSON string but got `%s`", jsonObj.get("timestamps").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0.class));

       return (TypeAdapter<T>) new TypeAdapter<RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0>() {
           @Override
           public void write(JsonWriter out, RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0
  * @throws IOException if the JSON string is invalid with respect to RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0
  */
  public static RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0.class);
  }

 /**
  * Convert an instance of RadarGetAttacksLayer7TimeseriesGroup200ResponseResultSerie0 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

