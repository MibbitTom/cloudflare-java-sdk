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
import cloudflare.sdk.models.AccountRequestTracerRequestTraceRequestContextGeoloc;
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
 * Additional request parameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class AccountRequestTracerRequestTraceRequestContext {
  public static final String SERIALIZED_NAME_BOT_SCORE = "bot_score";
  @SerializedName(SERIALIZED_NAME_BOT_SCORE)
  private Integer botScore;

  public static final String SERIALIZED_NAME_GEOLOC = "geoloc";
  @SerializedName(SERIALIZED_NAME_GEOLOC)
  private AccountRequestTracerRequestTraceRequestContextGeoloc geoloc;

  public static final String SERIALIZED_NAME_SKIP_CHALLENGE = "skip_challenge";
  @SerializedName(SERIALIZED_NAME_SKIP_CHALLENGE)
  private Boolean skipChallenge;

  public static final String SERIALIZED_NAME_THREAT_SCORE = "threat_score";
  @SerializedName(SERIALIZED_NAME_THREAT_SCORE)
  private Integer threatScore;

  public AccountRequestTracerRequestTraceRequestContext() {
  }

  public AccountRequestTracerRequestTraceRequestContext botScore(Integer botScore) {
    this.botScore = botScore;
    return this;
  }

   /**
   * Bot score used for evaluating tracing request processing
   * @return botScore
  **/
  @javax.annotation.Nullable
  public Integer getBotScore() {
    return botScore;
  }

  public void setBotScore(Integer botScore) {
    this.botScore = botScore;
  }


  public AccountRequestTracerRequestTraceRequestContext geoloc(AccountRequestTracerRequestTraceRequestContextGeoloc geoloc) {
    this.geoloc = geoloc;
    return this;
  }

   /**
   * Get geoloc
   * @return geoloc
  **/
  @javax.annotation.Nullable
  public AccountRequestTracerRequestTraceRequestContextGeoloc getGeoloc() {
    return geoloc;
  }

  public void setGeoloc(AccountRequestTracerRequestTraceRequestContextGeoloc geoloc) {
    this.geoloc = geoloc;
  }


  public AccountRequestTracerRequestTraceRequestContext skipChallenge(Boolean skipChallenge) {
    this.skipChallenge = skipChallenge;
    return this;
  }

   /**
   * Whether to skip any challenges for tracing request (e.g.: captcha)
   * @return skipChallenge
  **/
  @javax.annotation.Nullable
  public Boolean getSkipChallenge() {
    return skipChallenge;
  }

  public void setSkipChallenge(Boolean skipChallenge) {
    this.skipChallenge = skipChallenge;
  }


  public AccountRequestTracerRequestTraceRequestContext threatScore(Integer threatScore) {
    this.threatScore = threatScore;
    return this;
  }

   /**
   * Threat score used for evaluating tracing request processing
   * @return threatScore
  **/
  @javax.annotation.Nullable
  public Integer getThreatScore() {
    return threatScore;
  }

  public void setThreatScore(Integer threatScore) {
    this.threatScore = threatScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRequestTracerRequestTraceRequestContext accountRequestTracerRequestTraceRequestContext = (AccountRequestTracerRequestTraceRequestContext) o;
    return Objects.equals(this.botScore, accountRequestTracerRequestTraceRequestContext.botScore) &&
        Objects.equals(this.geoloc, accountRequestTracerRequestTraceRequestContext.geoloc) &&
        Objects.equals(this.skipChallenge, accountRequestTracerRequestTraceRequestContext.skipChallenge) &&
        Objects.equals(this.threatScore, accountRequestTracerRequestTraceRequestContext.threatScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botScore, geoloc, skipChallenge, threatScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRequestTracerRequestTraceRequestContext {\n");
    sb.append("    botScore: ").append(toIndentedString(botScore)).append("\n");
    sb.append("    geoloc: ").append(toIndentedString(geoloc)).append("\n");
    sb.append("    skipChallenge: ").append(toIndentedString(skipChallenge)).append("\n");
    sb.append("    threatScore: ").append(toIndentedString(threatScore)).append("\n");
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
    openapiFields.add("bot_score");
    openapiFields.add("geoloc");
    openapiFields.add("skip_challenge");
    openapiFields.add("threat_score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccountRequestTracerRequestTraceRequestContext
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountRequestTracerRequestTraceRequestContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountRequestTracerRequestTraceRequestContext is not found in the empty JSON string", AccountRequestTracerRequestTraceRequestContext.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountRequestTracerRequestTraceRequestContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountRequestTracerRequestTraceRequestContext` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `geoloc`
      if (jsonObj.get("geoloc") != null && !jsonObj.get("geoloc").isJsonNull()) {
        AccountRequestTracerRequestTraceRequestContextGeoloc.validateJsonElement(jsonObj.get("geoloc"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountRequestTracerRequestTraceRequestContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountRequestTracerRequestTraceRequestContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountRequestTracerRequestTraceRequestContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountRequestTracerRequestTraceRequestContext.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountRequestTracerRequestTraceRequestContext>() {
           @Override
           public void write(JsonWriter out, AccountRequestTracerRequestTraceRequestContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountRequestTracerRequestTraceRequestContext read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountRequestTracerRequestTraceRequestContext given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountRequestTracerRequestTraceRequestContext
  * @throws IOException if the JSON string is invalid with respect to AccountRequestTracerRequestTraceRequestContext
  */
  public static AccountRequestTracerRequestTraceRequestContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountRequestTracerRequestTraceRequestContext.class);
  }

 /**
  * Convert an instance of AccountRequestTracerRequestTraceRequestContext to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
