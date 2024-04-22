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
import org.openapitools.client.model.MagicLanStaticAddressing;
import org.openapitools.client.model.MagicNat;
import org.openapitools.client.model.MagicRoutedSubnet;

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
 * MagicLan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class MagicLan {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HA_LINK = "ha_link";
  @SerializedName(SERIALIZED_NAME_HA_LINK)
  private Boolean haLink;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAT = "nat";
  @SerializedName(SERIALIZED_NAME_NAT)
  private MagicNat nat;

  public static final String SERIALIZED_NAME_PHYSPORT = "physport";
  @SerializedName(SERIALIZED_NAME_PHYSPORT)
  private Integer physport;

  public static final String SERIALIZED_NAME_ROUTED_SUBNETS = "routed_subnets";
  @SerializedName(SERIALIZED_NAME_ROUTED_SUBNETS)
  private List<MagicRoutedSubnet> routedSubnets = new ArrayList<>();

  public static final String SERIALIZED_NAME_SITE_ID = "site_id";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private String siteId;

  public static final String SERIALIZED_NAME_STATIC_ADDRESSING = "static_addressing";
  @SerializedName(SERIALIZED_NAME_STATIC_ADDRESSING)
  private MagicLanStaticAddressing staticAddressing;

  public static final String SERIALIZED_NAME_VLAN_TAG = "vlan_tag";
  @SerializedName(SERIALIZED_NAME_VLAN_TAG)
  private Integer vlanTag;

  public MagicLan() {
  }

  public MagicLan(
     String id, 
     String siteId
  ) {
    this();
    this.id = id;
    this.siteId = siteId;
  }

  public MagicLan description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public MagicLan haLink(Boolean haLink) {
    this.haLink = haLink;
    return this;
  }

   /**
   * mark true to use this LAN for HA probing. only works for site with HA turned on. only one LAN can be set as the ha_link.
   * @return haLink
  **/
  @javax.annotation.Nullable
  public Boolean getHaLink() {
    return haLink;
  }

  public void setHaLink(Boolean haLink) {
    this.haLink = haLink;
  }


   /**
   * Identifier
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public MagicLan nat(MagicNat nat) {
    this.nat = nat;
    return this;
  }

   /**
   * Get nat
   * @return nat
  **/
  @javax.annotation.Nullable
  public MagicNat getNat() {
    return nat;
  }

  public void setNat(MagicNat nat) {
    this.nat = nat;
  }


  public MagicLan physport(Integer physport) {
    this.physport = physport;
    return this;
  }

   /**
   * Get physport
   * @return physport
  **/
  @javax.annotation.Nullable
  public Integer getPhysport() {
    return physport;
  }

  public void setPhysport(Integer physport) {
    this.physport = physport;
  }


  public MagicLan routedSubnets(List<MagicRoutedSubnet> routedSubnets) {
    this.routedSubnets = routedSubnets;
    return this;
  }

  public MagicLan addRoutedSubnetsItem(MagicRoutedSubnet routedSubnetsItem) {
    if (this.routedSubnets == null) {
      this.routedSubnets = new ArrayList<>();
    }
    this.routedSubnets.add(routedSubnetsItem);
    return this;
  }

   /**
   * Get routedSubnets
   * @return routedSubnets
  **/
  @javax.annotation.Nullable
  public List<MagicRoutedSubnet> getRoutedSubnets() {
    return routedSubnets;
  }

  public void setRoutedSubnets(List<MagicRoutedSubnet> routedSubnets) {
    this.routedSubnets = routedSubnets;
  }


   /**
   * Identifier
   * @return siteId
  **/
  @javax.annotation.Nullable
  public String getSiteId() {
    return siteId;
  }



  public MagicLan staticAddressing(MagicLanStaticAddressing staticAddressing) {
    this.staticAddressing = staticAddressing;
    return this;
  }

   /**
   * Get staticAddressing
   * @return staticAddressing
  **/
  @javax.annotation.Nullable
  public MagicLanStaticAddressing getStaticAddressing() {
    return staticAddressing;
  }

  public void setStaticAddressing(MagicLanStaticAddressing staticAddressing) {
    this.staticAddressing = staticAddressing;
  }


  public MagicLan vlanTag(Integer vlanTag) {
    this.vlanTag = vlanTag;
    return this;
  }

   /**
   * VLAN port number.
   * @return vlanTag
  **/
  @javax.annotation.Nullable
  public Integer getVlanTag() {
    return vlanTag;
  }

  public void setVlanTag(Integer vlanTag) {
    this.vlanTag = vlanTag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagicLan magicLan = (MagicLan) o;
    return Objects.equals(this.description, magicLan.description) &&
        Objects.equals(this.haLink, magicLan.haLink) &&
        Objects.equals(this.id, magicLan.id) &&
        Objects.equals(this.nat, magicLan.nat) &&
        Objects.equals(this.physport, magicLan.physport) &&
        Objects.equals(this.routedSubnets, magicLan.routedSubnets) &&
        Objects.equals(this.siteId, magicLan.siteId) &&
        Objects.equals(this.staticAddressing, magicLan.staticAddressing) &&
        Objects.equals(this.vlanTag, magicLan.vlanTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, haLink, id, nat, physport, routedSubnets, siteId, staticAddressing, vlanTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicLan {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    haLink: ").append(toIndentedString(haLink)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nat: ").append(toIndentedString(nat)).append("\n");
    sb.append("    physport: ").append(toIndentedString(physport)).append("\n");
    sb.append("    routedSubnets: ").append(toIndentedString(routedSubnets)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    staticAddressing: ").append(toIndentedString(staticAddressing)).append("\n");
    sb.append("    vlanTag: ").append(toIndentedString(vlanTag)).append("\n");
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
    openapiFields.add("ha_link");
    openapiFields.add("id");
    openapiFields.add("nat");
    openapiFields.add("physport");
    openapiFields.add("routed_subnets");
    openapiFields.add("site_id");
    openapiFields.add("static_addressing");
    openapiFields.add("vlan_tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MagicLan
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MagicLan.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MagicLan is not found in the empty JSON string", MagicLan.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MagicLan.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MagicLan` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `nat`
      if (jsonObj.get("nat") != null && !jsonObj.get("nat").isJsonNull()) {
        MagicNat.validateJsonElement(jsonObj.get("nat"));
      }
      if (jsonObj.get("routed_subnets") != null && !jsonObj.get("routed_subnets").isJsonNull()) {
        JsonArray jsonArrayroutedSubnets = jsonObj.getAsJsonArray("routed_subnets");
        if (jsonArrayroutedSubnets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("routed_subnets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `routed_subnets` to be an array in the JSON string but got `%s`", jsonObj.get("routed_subnets").toString()));
          }

          // validate the optional field `routed_subnets` (array)
          for (int i = 0; i < jsonArrayroutedSubnets.size(); i++) {
            MagicRoutedSubnet.validateJsonElement(jsonArrayroutedSubnets.get(i));
          };
        }
      }
      if ((jsonObj.get("site_id") != null && !jsonObj.get("site_id").isJsonNull()) && !jsonObj.get("site_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `site_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("site_id").toString()));
      }
      // validate the optional field `static_addressing`
      if (jsonObj.get("static_addressing") != null && !jsonObj.get("static_addressing").isJsonNull()) {
        MagicLanStaticAddressing.validateJsonElement(jsonObj.get("static_addressing"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MagicLan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MagicLan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MagicLan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MagicLan.class));

       return (TypeAdapter<T>) new TypeAdapter<MagicLan>() {
           @Override
           public void write(JsonWriter out, MagicLan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MagicLan read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MagicLan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MagicLan
  * @throws IOException if the JSON string is invalid with respect to MagicLan
  */
  public static MagicLan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MagicLan.class);
  }

 /**
  * Convert an instance of MagicLan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

