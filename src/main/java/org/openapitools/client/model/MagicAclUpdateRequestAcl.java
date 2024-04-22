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
import org.openapitools.client.model.MagicLanAclConfiguration;

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
 * MagicAclUpdateRequestAcl
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class MagicAclUpdateRequestAcl {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FORWARD_LOCALLY = "forward_locally";
  @SerializedName(SERIALIZED_NAME_FORWARD_LOCALLY)
  private Boolean forwardLocally;

  public static final String SERIALIZED_NAME_LAN1 = "lan_1";
  @SerializedName(SERIALIZED_NAME_LAN1)
  private MagicLanAclConfiguration lan1;

  public static final String SERIALIZED_NAME_LAN2 = "lan_2";
  @SerializedName(SERIALIZED_NAME_LAN2)
  private MagicLanAclConfiguration lan2;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Array of allowed communication protocols between configured LANs. If no protocols are provided, all protocols are allowed.
   */
  @JsonAdapter(ProtocolsEnum.Adapter.class)
  public enum ProtocolsEnum {
    TCP("tcp"),
    
    UDP("udp"),
    
    ICMP("icmp");

    private String value;

    ProtocolsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProtocolsEnum fromValue(String value) {
      for (ProtocolsEnum b : ProtocolsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProtocolsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtocolsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProtocolsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ProtocolsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PROTOCOLS = "protocols";
  @SerializedName(SERIALIZED_NAME_PROTOCOLS)
  private List<ProtocolsEnum> protocols = new ArrayList<>();

  public MagicAclUpdateRequestAcl() {
  }

  public MagicAclUpdateRequestAcl description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description for the ACL.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public MagicAclUpdateRequestAcl forwardLocally(Boolean forwardLocally) {
    this.forwardLocally = forwardLocally;
    return this;
  }

   /**
   * The desired forwarding action for this ACL policy. If set to \&quot;false\&quot;, the policy will forward traffic to Cloudflare. If set to \&quot;true\&quot;, the policy will forward traffic locally on the Magic WAN Connector. If not included in request, will default to false.
   * @return forwardLocally
  **/
  @javax.annotation.Nullable
  public Boolean getForwardLocally() {
    return forwardLocally;
  }

  public void setForwardLocally(Boolean forwardLocally) {
    this.forwardLocally = forwardLocally;
  }


  public MagicAclUpdateRequestAcl lan1(MagicLanAclConfiguration lan1) {
    this.lan1 = lan1;
    return this;
  }

   /**
   * Get lan1
   * @return lan1
  **/
  @javax.annotation.Nullable
  public MagicLanAclConfiguration getLan1() {
    return lan1;
  }

  public void setLan1(MagicLanAclConfiguration lan1) {
    this.lan1 = lan1;
  }


  public MagicAclUpdateRequestAcl lan2(MagicLanAclConfiguration lan2) {
    this.lan2 = lan2;
    return this;
  }

   /**
   * Get lan2
   * @return lan2
  **/
  @javax.annotation.Nullable
  public MagicLanAclConfiguration getLan2() {
    return lan2;
  }

  public void setLan2(MagicLanAclConfiguration lan2) {
    this.lan2 = lan2;
  }


  public MagicAclUpdateRequestAcl name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the ACL.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public MagicAclUpdateRequestAcl protocols(List<ProtocolsEnum> protocols) {
    this.protocols = protocols;
    return this;
  }

  public MagicAclUpdateRequestAcl addProtocolsItem(ProtocolsEnum protocolsItem) {
    if (this.protocols == null) {
      this.protocols = new ArrayList<>();
    }
    this.protocols.add(protocolsItem);
    return this;
  }

   /**
   * Get protocols
   * @return protocols
  **/
  @javax.annotation.Nullable
  public List<ProtocolsEnum> getProtocols() {
    return protocols;
  }

  public void setProtocols(List<ProtocolsEnum> protocols) {
    this.protocols = protocols;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MagicAclUpdateRequestAcl magicAclUpdateRequestAcl = (MagicAclUpdateRequestAcl) o;
    return Objects.equals(this.description, magicAclUpdateRequestAcl.description) &&
        Objects.equals(this.forwardLocally, magicAclUpdateRequestAcl.forwardLocally) &&
        Objects.equals(this.lan1, magicAclUpdateRequestAcl.lan1) &&
        Objects.equals(this.lan2, magicAclUpdateRequestAcl.lan2) &&
        Objects.equals(this.name, magicAclUpdateRequestAcl.name) &&
        Objects.equals(this.protocols, magicAclUpdateRequestAcl.protocols);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, forwardLocally, lan1, lan2, name, protocols);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MagicAclUpdateRequestAcl {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    forwardLocally: ").append(toIndentedString(forwardLocally)).append("\n");
    sb.append("    lan1: ").append(toIndentedString(lan1)).append("\n");
    sb.append("    lan2: ").append(toIndentedString(lan2)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
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
    openapiFields.add("forward_locally");
    openapiFields.add("lan_1");
    openapiFields.add("lan_2");
    openapiFields.add("name");
    openapiFields.add("protocols");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MagicAclUpdateRequestAcl
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MagicAclUpdateRequestAcl.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MagicAclUpdateRequestAcl is not found in the empty JSON string", MagicAclUpdateRequestAcl.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MagicAclUpdateRequestAcl.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MagicAclUpdateRequestAcl` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `lan_1`
      if (jsonObj.get("lan_1") != null && !jsonObj.get("lan_1").isJsonNull()) {
        MagicLanAclConfiguration.validateJsonElement(jsonObj.get("lan_1"));
      }
      // validate the optional field `lan_2`
      if (jsonObj.get("lan_2") != null && !jsonObj.get("lan_2").isJsonNull()) {
        MagicLanAclConfiguration.validateJsonElement(jsonObj.get("lan_2"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("protocols") != null && !jsonObj.get("protocols").isJsonNull() && !jsonObj.get("protocols").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocols` to be an array in the JSON string but got `%s`", jsonObj.get("protocols").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MagicAclUpdateRequestAcl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MagicAclUpdateRequestAcl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MagicAclUpdateRequestAcl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MagicAclUpdateRequestAcl.class));

       return (TypeAdapter<T>) new TypeAdapter<MagicAclUpdateRequestAcl>() {
           @Override
           public void write(JsonWriter out, MagicAclUpdateRequestAcl value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MagicAclUpdateRequestAcl read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MagicAclUpdateRequestAcl given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MagicAclUpdateRequestAcl
  * @throws IOException if the JSON string is invalid with respect to MagicAclUpdateRequestAcl
  */
  public static MagicAclUpdateRequestAcl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MagicAclUpdateRequestAcl.class);
  }

 /**
  * Convert an instance of MagicAclUpdateRequestAcl to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

