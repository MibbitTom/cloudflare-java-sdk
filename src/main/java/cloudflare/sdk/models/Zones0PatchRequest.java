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
import cloudflare.sdk.models.Zones0PatchRequestPlan;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * Zones0PatchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class Zones0PatchRequest {
  public static final String SERIALIZED_NAME_PAUSED = "paused";
  @SerializedName(SERIALIZED_NAME_PAUSED)
  private Boolean paused = false;

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  private Zones0PatchRequestPlan plan;

  /**
   * A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. This parameter is only available to Enterprise customers or if it has been explicitly enabled on a zone. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FULL("full"),
    
    PARTIAL("partial"),
    
    SECONDARY("secondary");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_VANITY_NAME_SERVERS = "vanity_name_servers";
  @SerializedName(SERIALIZED_NAME_VANITY_NAME_SERVERS)
  private List<String> vanityNameServers = new ArrayList<>();

  public Zones0PatchRequest() {
  }

  public Zones0PatchRequest(
     Boolean paused
  ) {
    this();
    this.paused = paused;
  }

   /**
   * Indicates whether the zone is only using Cloudflare DNS services. A true value means the zone will not receive security or performance benefits. 
   * @return paused
  **/
  @javax.annotation.Nullable
  public Boolean getPaused() {
    return paused;
  }



  public Zones0PatchRequest plan(Zones0PatchRequestPlan plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @javax.annotation.Nullable
  public Zones0PatchRequestPlan getPlan() {
    return plan;
  }

  public void setPlan(Zones0PatchRequestPlan plan) {
    this.plan = plan;
  }


  public Zones0PatchRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. This parameter is only available to Enterprise customers or if it has been explicitly enabled on a zone. 
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Zones0PatchRequest vanityNameServers(List<String> vanityNameServers) {
    this.vanityNameServers = vanityNameServers;
    return this;
  }

  public Zones0PatchRequest addVanityNameServersItem(String vanityNameServersItem) {
    if (this.vanityNameServers == null) {
      this.vanityNameServers = new ArrayList<>();
    }
    this.vanityNameServers.add(vanityNameServersItem);
    return this;
  }

   /**
   * An array of domains used for custom name servers. This is only available for Business and Enterprise plans.
   * @return vanityNameServers
  **/
  @javax.annotation.Nullable
  public List<String> getVanityNameServers() {
    return vanityNameServers;
  }

  public void setVanityNameServers(List<String> vanityNameServers) {
    this.vanityNameServers = vanityNameServers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Zones0PatchRequest zones0PatchRequest = (Zones0PatchRequest) o;
    return Objects.equals(this.paused, zones0PatchRequest.paused) &&
        Objects.equals(this.plan, zones0PatchRequest.plan) &&
        Objects.equals(this.type, zones0PatchRequest.type) &&
        Objects.equals(this.vanityNameServers, zones0PatchRequest.vanityNameServers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paused, plan, type, vanityNameServers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Zones0PatchRequest {\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vanityNameServers: ").append(toIndentedString(vanityNameServers)).append("\n");
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
    openapiFields.add("paused");
    openapiFields.add("plan");
    openapiFields.add("type");
    openapiFields.add("vanity_name_servers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Zones0PatchRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Zones0PatchRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Zones0PatchRequest is not found in the empty JSON string", Zones0PatchRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Zones0PatchRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Zones0PatchRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `plan`
      if (jsonObj.get("plan") != null && !jsonObj.get("plan").isJsonNull()) {
        Zones0PatchRequestPlan.validateJsonElement(jsonObj.get("plan"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("vanity_name_servers") != null && !jsonObj.get("vanity_name_servers").isJsonNull() && !jsonObj.get("vanity_name_servers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vanity_name_servers` to be an array in the JSON string but got `%s`", jsonObj.get("vanity_name_servers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Zones0PatchRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Zones0PatchRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Zones0PatchRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Zones0PatchRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Zones0PatchRequest>() {
           @Override
           public void write(JsonWriter out, Zones0PatchRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Zones0PatchRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Zones0PatchRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Zones0PatchRequest
  * @throws IOException if the JSON string is invalid with respect to Zones0PatchRequest
  */
  public static Zones0PatchRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Zones0PatchRequest.class);
  }

 /**
  * Convert an instance of Zones0PatchRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

