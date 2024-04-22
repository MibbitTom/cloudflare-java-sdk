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
import cloudflare.sdk.models.ZonesZoneAccount;
import cloudflare.sdk.models.ZonesZoneMeta;
import cloudflare.sdk.models.ZonesZoneOwner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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
 * ZonesZone
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZonesZone {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private ZonesZoneAccount account;

  public static final String SERIALIZED_NAME_ACTIVATED_ON = "activated_on";
  @SerializedName(SERIALIZED_NAME_ACTIVATED_ON)
  private OffsetDateTime activatedOn;

  public static final String SERIALIZED_NAME_CREATED_ON = "created_on";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_DEVELOPMENT_MODE = "development_mode";
  @SerializedName(SERIALIZED_NAME_DEVELOPMENT_MODE)
  private BigDecimal developmentMode;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private ZonesZoneMeta meta;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modified_on";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORIGINAL_DNSHOST = "original_dnshost";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_DNSHOST)
  private String originalDnshost;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME_SERVERS = "original_name_servers";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME_SERVERS)
  private List<String> originalNameServers;

  public static final String SERIALIZED_NAME_ORIGINAL_REGISTRAR = "original_registrar";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_REGISTRAR)
  private String originalRegistrar;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private ZonesZoneOwner owner;

  public static final String SERIALIZED_NAME_VANITY_NAME_SERVERS = "vanity_name_servers";
  @SerializedName(SERIALIZED_NAME_VANITY_NAME_SERVERS)
  private List<String> vanityNameServers = new ArrayList<>();

  public ZonesZone() {
  }

  public ZonesZone(
     OffsetDateTime activatedOn, 
     OffsetDateTime createdOn, 
     BigDecimal developmentMode, 
     OffsetDateTime modifiedOn, 
     String originalDnshost, 
     List<String> originalNameServers, 
     String originalRegistrar
  ) {
    this();
    this.activatedOn = activatedOn;
    this.createdOn = createdOn;
    this.developmentMode = developmentMode;
    this.modifiedOn = modifiedOn;
    this.originalDnshost = originalDnshost;
    this.originalNameServers = originalNameServers;
    this.originalRegistrar = originalRegistrar;
  }

  public ZonesZone account(ZonesZoneAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nonnull
  public ZonesZoneAccount getAccount() {
    return account;
  }

  public void setAccount(ZonesZoneAccount account) {
    this.account = account;
  }


   /**
   * The last time proof of ownership was detected and the zone was made active
   * @return activatedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }



   /**
   * When the zone was created
   * @return createdOn
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



   /**
   * The interval (in seconds) from when development mode expires (positive integer) or last expired (negative integer) for the domain. If development mode has never been enabled, this value is 0.
   * @return developmentMode
  **/
  @javax.annotation.Nonnull
  public BigDecimal getDevelopmentMode() {
    return developmentMode;
  }



  public ZonesZone id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ZonesZone meta(ZonesZoneMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nonnull
  public ZonesZoneMeta getMeta() {
    return meta;
  }

  public void setMeta(ZonesZoneMeta meta) {
    this.meta = meta;
  }


   /**
   * When the zone was last modified
   * @return modifiedOn
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }



  public ZonesZone name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The domain name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


   /**
   * DNS host at the time of switching to Cloudflare
   * @return originalDnshost
  **/
  @javax.annotation.Nullable
  public String getOriginalDnshost() {
    return originalDnshost;
  }



   /**
   * Original name servers before moving to Cloudflare Notes: Is this only available for full zones?
   * @return originalNameServers
  **/
  @javax.annotation.Nullable
  public List<String> getOriginalNameServers() {
    return originalNameServers;
  }



   /**
   * Registrar for the domain at the time of switching to Cloudflare
   * @return originalRegistrar
  **/
  @javax.annotation.Nullable
  public String getOriginalRegistrar() {
    return originalRegistrar;
  }



  public ZonesZone owner(ZonesZoneOwner owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nonnull
  public ZonesZoneOwner getOwner() {
    return owner;
  }

  public void setOwner(ZonesZoneOwner owner) {
    this.owner = owner;
  }


  public ZonesZone vanityNameServers(List<String> vanityNameServers) {
    this.vanityNameServers = vanityNameServers;
    return this;
  }

  public ZonesZone addVanityNameServersItem(String vanityNameServersItem) {
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
    ZonesZone zonesZone = (ZonesZone) o;
    return Objects.equals(this.account, zonesZone.account) &&
        Objects.equals(this.activatedOn, zonesZone.activatedOn) &&
        Objects.equals(this.createdOn, zonesZone.createdOn) &&
        Objects.equals(this.developmentMode, zonesZone.developmentMode) &&
        Objects.equals(this.id, zonesZone.id) &&
        Objects.equals(this.meta, zonesZone.meta) &&
        Objects.equals(this.modifiedOn, zonesZone.modifiedOn) &&
        Objects.equals(this.name, zonesZone.name) &&
        Objects.equals(this.originalDnshost, zonesZone.originalDnshost) &&
        Objects.equals(this.originalNameServers, zonesZone.originalNameServers) &&
        Objects.equals(this.originalRegistrar, zonesZone.originalRegistrar) &&
        Objects.equals(this.owner, zonesZone.owner) &&
        Objects.equals(this.vanityNameServers, zonesZone.vanityNameServers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, activatedOn, createdOn, developmentMode, id, meta, modifiedOn, name, originalDnshost, originalNameServers, originalRegistrar, owner, vanityNameServers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZonesZone {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    developmentMode: ").append(toIndentedString(developmentMode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalDnshost: ").append(toIndentedString(originalDnshost)).append("\n");
    sb.append("    originalNameServers: ").append(toIndentedString(originalNameServers)).append("\n");
    sb.append("    originalRegistrar: ").append(toIndentedString(originalRegistrar)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("activated_on");
    openapiFields.add("created_on");
    openapiFields.add("development_mode");
    openapiFields.add("id");
    openapiFields.add("meta");
    openapiFields.add("modified_on");
    openapiFields.add("name");
    openapiFields.add("original_dnshost");
    openapiFields.add("original_name_servers");
    openapiFields.add("original_registrar");
    openapiFields.add("owner");
    openapiFields.add("vanity_name_servers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account");
    openapiRequiredFields.add("activated_on");
    openapiRequiredFields.add("created_on");
    openapiRequiredFields.add("development_mode");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("meta");
    openapiRequiredFields.add("modified_on");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("original_dnshost");
    openapiRequiredFields.add("original_name_servers");
    openapiRequiredFields.add("original_registrar");
    openapiRequiredFields.add("owner");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZonesZone
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZonesZone.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZonesZone is not found in the empty JSON string", ZonesZone.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZonesZone.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZonesZone` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ZonesZone.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `account`
      ZonesZoneAccount.validateJsonElement(jsonObj.get("account"));
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `meta`
      ZonesZoneMeta.validateJsonElement(jsonObj.get("meta"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("original_dnshost") != null && !jsonObj.get("original_dnshost").isJsonNull()) && !jsonObj.get("original_dnshost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_dnshost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_dnshost").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("original_name_servers") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("original_name_servers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_name_servers` to be an array in the JSON string but got `%s`", jsonObj.get("original_name_servers").toString()));
      }
      if ((jsonObj.get("original_registrar") != null && !jsonObj.get("original_registrar").isJsonNull()) && !jsonObj.get("original_registrar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_registrar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_registrar").toString()));
      }
      // validate the required field `owner`
      ZonesZoneOwner.validateJsonElement(jsonObj.get("owner"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("vanity_name_servers") != null && !jsonObj.get("vanity_name_servers").isJsonNull() && !jsonObj.get("vanity_name_servers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vanity_name_servers` to be an array in the JSON string but got `%s`", jsonObj.get("vanity_name_servers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZonesZone.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZonesZone' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZonesZone> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZonesZone.class));

       return (TypeAdapter<T>) new TypeAdapter<ZonesZone>() {
           @Override
           public void write(JsonWriter out, ZonesZone value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZonesZone read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZonesZone given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZonesZone
  * @throws IOException if the JSON string is invalid with respect to ZonesZone
  */
  public static ZonesZone fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZonesZone.class);
  }

 /**
  * Convert an instance of ZonesZone to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
