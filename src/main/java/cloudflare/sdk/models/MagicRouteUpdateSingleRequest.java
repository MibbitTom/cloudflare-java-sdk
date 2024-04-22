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
import cloudflare.sdk.models.MagicScope;
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
 * MagicRouteUpdateSingleRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class MagicRouteUpdateSingleRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NEXTHOP = "nexthop";
  @SerializedName(SERIALIZED_NAME_NEXTHOP)
  private String nexthop;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private MagicScope scope;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public MagicRouteUpdateSingleRequest() {
  }

  public MagicRouteUpdateSingleRequest(
     String id
  ) {
    this();
    this.id = id;
  }

  public MagicRouteUpdateSingleRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An optional human provided description of the static route.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public MagicRouteUpdateSingleRequest nexthop(String nexthop) {
    this.nexthop = nexthop;
    return this;
  }

   /**
   * The next-hop IP Address for the static route.
   * @return nexthop
  **/
  @javax.annotation.Nonnull
  public String getNexthop() {
    return nexthop;
  }

  public void setNexthop(String nexthop) {
    this.nexthop = nexthop;
  }


  public MagicRouteUpdateSingleRequest prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * IP Prefix in Classless Inter-Domain Routing format.
   * @return prefix
  **/
  @javax.annotation.Nonnull
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public MagicRouteUpdateSingleRequest priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Priority of the static route.
   * @return priority
  **/
  @javax.annotation.Nonnull
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public MagicRouteUpdateSingleRequest scope(MagicScope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  public MagicScope getScope() {
    return scope;
  }

  public void setScope(MagicScope scope) {
    this.scope = scope;
  }


  public MagicRouteUpdateSingleRequest weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Optional weight of the ECMP scope - if provided.
   * @return weight
  **/
  @javax.annotation.Nullable
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }


   /**
   * Identifier
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagicRouteUpdateSingleRequest magicRouteUpdateSingleRequest = (MagicRouteUpdateSingleRequest) o;
    return Objects.equals(this.description, magicRouteUpdateSingleRequest.description) &&
        Objects.equals(this.nexthop, magicRouteUpdateSingleRequest.nexthop) &&
        Objects.equals(this.prefix, magicRouteUpdateSingleRequest.prefix) &&
        Objects.equals(this.priority, magicRouteUpdateSingleRequest.priority) &&
        Objects.equals(this.scope, magicRouteUpdateSingleRequest.scope) &&
        Objects.equals(this.weight, magicRouteUpdateSingleRequest.weight) &&
        Objects.equals(this.id, magicRouteUpdateSingleRequest.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, nexthop, prefix, priority, scope, weight, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicRouteUpdateSingleRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("nexthop");
    openapiFields.add("prefix");
    openapiFields.add("priority");
    openapiFields.add("scope");
    openapiFields.add("weight");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nexthop");
    openapiRequiredFields.add("prefix");
    openapiRequiredFields.add("priority");
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MagicRouteUpdateSingleRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MagicRouteUpdateSingleRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MagicRouteUpdateSingleRequest is not found in the empty JSON string", MagicRouteUpdateSingleRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MagicRouteUpdateSingleRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MagicRouteUpdateSingleRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MagicRouteUpdateSingleRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("nexthop").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nexthop` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nexthop").toString()));
      }
      if (!jsonObj.get("prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix").toString()));
      }
      // validate the optional field `scope`
      if (jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) {
        MagicScope.validateJsonElement(jsonObj.get("scope"));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MagicRouteUpdateSingleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MagicRouteUpdateSingleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MagicRouteUpdateSingleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MagicRouteUpdateSingleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<MagicRouteUpdateSingleRequest>() {
           @Override
           public void write(JsonWriter out, MagicRouteUpdateSingleRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MagicRouteUpdateSingleRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MagicRouteUpdateSingleRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MagicRouteUpdateSingleRequest
  * @throws IOException if the JSON string is invalid with respect to MagicRouteUpdateSingleRequest
  */
  public static MagicRouteUpdateSingleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MagicRouteUpdateSingleRequest.class);
  }

 /**
  * Convert an instance of MagicRouteUpdateSingleRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

