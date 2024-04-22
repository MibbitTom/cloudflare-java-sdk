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
import org.openapitools.client.model.MagicWanStaticAddressing;

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

import invalidPackageName.JSON;

/**
 * MagicWanUpdateRequestWan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class MagicWanUpdateRequestWan {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PHYSPORT = "physport";
  @SerializedName(SERIALIZED_NAME_PHYSPORT)
  private Integer physport;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_STATIC_ADDRESSING = "static_addressing";
  @SerializedName(SERIALIZED_NAME_STATIC_ADDRESSING)
  private MagicWanStaticAddressing staticAddressing;

  public static final String SERIALIZED_NAME_VLAN_TAG = "vlan_tag";
  @SerializedName(SERIALIZED_NAME_VLAN_TAG)
  private Integer vlanTag;

  public MagicWanUpdateRequestWan() {
  }

  public MagicWanUpdateRequestWan description(String description) {
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


  public MagicWanUpdateRequestWan physport(Integer physport) {
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


  public MagicWanUpdateRequestWan priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public MagicWanUpdateRequestWan staticAddressing(MagicWanStaticAddressing staticAddressing) {
    this.staticAddressing = staticAddressing;
    return this;
  }

   /**
   * Get staticAddressing
   * @return staticAddressing
  **/
  @javax.annotation.Nullable
  public MagicWanStaticAddressing getStaticAddressing() {
    return staticAddressing;
  }

  public void setStaticAddressing(MagicWanStaticAddressing staticAddressing) {
    this.staticAddressing = staticAddressing;
  }


  public MagicWanUpdateRequestWan vlanTag(Integer vlanTag) {
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
    MagicWanUpdateRequestWan magicWanUpdateRequestWan = (MagicWanUpdateRequestWan) o;
    return Objects.equals(this.description, magicWanUpdateRequestWan.description) &&
        Objects.equals(this.physport, magicWanUpdateRequestWan.physport) &&
        Objects.equals(this.priority, magicWanUpdateRequestWan.priority) &&
        Objects.equals(this.staticAddressing, magicWanUpdateRequestWan.staticAddressing) &&
        Objects.equals(this.vlanTag, magicWanUpdateRequestWan.vlanTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, physport, priority, staticAddressing, vlanTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicWanUpdateRequestWan {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    physport: ").append(toIndentedString(physport)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
    openapiFields.add("physport");
    openapiFields.add("priority");
    openapiFields.add("static_addressing");
    openapiFields.add("vlan_tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MagicWanUpdateRequestWan
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MagicWanUpdateRequestWan.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MagicWanUpdateRequestWan is not found in the empty JSON string", MagicWanUpdateRequestWan.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MagicWanUpdateRequestWan.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MagicWanUpdateRequestWan` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `static_addressing`
      if (jsonObj.get("static_addressing") != null && !jsonObj.get("static_addressing").isJsonNull()) {
        MagicWanStaticAddressing.validateJsonElement(jsonObj.get("static_addressing"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MagicWanUpdateRequestWan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MagicWanUpdateRequestWan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MagicWanUpdateRequestWan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MagicWanUpdateRequestWan.class));

       return (TypeAdapter<T>) new TypeAdapter<MagicWanUpdateRequestWan>() {
           @Override
           public void write(JsonWriter out, MagicWanUpdateRequestWan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MagicWanUpdateRequestWan read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MagicWanUpdateRequestWan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MagicWanUpdateRequestWan
  * @throws IOException if the JSON string is invalid with respect to MagicWanUpdateRequestWan
  */
  public static MagicWanUpdateRequestWan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MagicWanUpdateRequestWan.class);
  }

 /**
  * Convert an instance of MagicWanUpdateRequestWan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

