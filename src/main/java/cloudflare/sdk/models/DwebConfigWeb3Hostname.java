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
import cloudflare.sdk.models.DwebConfigStatus;
import cloudflare.sdk.models.DwebConfigTarget;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * DwebConfigWeb3Hostname
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DwebConfigWeb3Hostname {
  public static final String SERIALIZED_NAME_CREATED_ON = "created_on";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DNSLINK = "dnslink";
  @SerializedName(SERIALIZED_NAME_DNSLINK)
  private String dnslink;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modified_on";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DwebConfigStatus status;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private DwebConfigTarget target;

  public DwebConfigWeb3Hostname() {
  }

  public DwebConfigWeb3Hostname(
     OffsetDateTime createdOn, 
     String id, 
     OffsetDateTime modifiedOn, 
     String name
  ) {
    this();
    this.createdOn = createdOn;
    this.id = id;
    this.modifiedOn = modifiedOn;
    this.name = name;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  public DwebConfigWeb3Hostname description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An optional description of the hostname.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public DwebConfigWeb3Hostname dnslink(String dnslink) {
    this.dnslink = dnslink;
    return this;
  }

   /**
   * DNSLink value used if the target is ipfs.
   * @return dnslink
  **/
  @javax.annotation.Nullable
  public String getDnslink() {
    return dnslink;
  }

  public void setDnslink(String dnslink) {
    this.dnslink = dnslink;
  }


   /**
   * Identifier
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }



   /**
   * The hostname that will point to the target gateway via CNAME.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }



  public DwebConfigWeb3Hostname status(DwebConfigStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public DwebConfigStatus getStatus() {
    return status;
  }

  public void setStatus(DwebConfigStatus status) {
    this.status = status;
  }


  public DwebConfigWeb3Hostname target(DwebConfigTarget target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nullable
  public DwebConfigTarget getTarget() {
    return target;
  }

  public void setTarget(DwebConfigTarget target) {
    this.target = target;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DwebConfigWeb3Hostname dwebConfigWeb3Hostname = (DwebConfigWeb3Hostname) o;
    return Objects.equals(this.createdOn, dwebConfigWeb3Hostname.createdOn) &&
        Objects.equals(this.description, dwebConfigWeb3Hostname.description) &&
        Objects.equals(this.dnslink, dwebConfigWeb3Hostname.dnslink) &&
        Objects.equals(this.id, dwebConfigWeb3Hostname.id) &&
        Objects.equals(this.modifiedOn, dwebConfigWeb3Hostname.modifiedOn) &&
        Objects.equals(this.name, dwebConfigWeb3Hostname.name) &&
        Objects.equals(this.status, dwebConfigWeb3Hostname.status) &&
        Objects.equals(this.target, dwebConfigWeb3Hostname.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, description, dnslink, id, modifiedOn, name, status, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DwebConfigWeb3Hostname {\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dnslink: ").append(toIndentedString(dnslink)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
    openapiFields.add("created_on");
    openapiFields.add("description");
    openapiFields.add("dnslink");
    openapiFields.add("id");
    openapiFields.add("modified_on");
    openapiFields.add("name");
    openapiFields.add("status");
    openapiFields.add("target");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DwebConfigWeb3Hostname
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DwebConfigWeb3Hostname.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DwebConfigWeb3Hostname is not found in the empty JSON string", DwebConfigWeb3Hostname.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DwebConfigWeb3Hostname.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DwebConfigWeb3Hostname` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("dnslink") != null && !jsonObj.get("dnslink").isJsonNull()) && !jsonObj.get("dnslink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dnslink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dnslink").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        DwebConfigStatus.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `target`
      if (jsonObj.get("target") != null && !jsonObj.get("target").isJsonNull()) {
        DwebConfigTarget.validateJsonElement(jsonObj.get("target"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DwebConfigWeb3Hostname.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DwebConfigWeb3Hostname' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DwebConfigWeb3Hostname> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DwebConfigWeb3Hostname.class));

       return (TypeAdapter<T>) new TypeAdapter<DwebConfigWeb3Hostname>() {
           @Override
           public void write(JsonWriter out, DwebConfigWeb3Hostname value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DwebConfigWeb3Hostname read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DwebConfigWeb3Hostname given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DwebConfigWeb3Hostname
  * @throws IOException if the JSON string is invalid with respect to DwebConfigWeb3Hostname
  */
  public static DwebConfigWeb3Hostname fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DwebConfigWeb3Hostname.class);
  }

 /**
  * Convert an instance of DwebConfigWeb3Hostname to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
