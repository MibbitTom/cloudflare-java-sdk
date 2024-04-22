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
import cloudflare.sdk.models.ZeroTrustGatewayDnsResolverSettingsV4;
import cloudflare.sdk.models.ZeroTrustGatewayDnsResolverSettingsV6;
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
 * Add your own custom resolvers to route queries that match the resolver policy. Cannot be used when resolve_dns_through_cloudflare is set. DNS queries will route to the address closest to their origin. Only valid when a rule&#39;s action is set to &#39;resolve&#39;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ZeroTrustGatewayRuleSettingsDnsResolvers {
  public static final String SERIALIZED_NAME_IPV4 = "ipv4";
  @SerializedName(SERIALIZED_NAME_IPV4)
  private List<ZeroTrustGatewayDnsResolverSettingsV4> ipv4 = new ArrayList<>();

  public static final String SERIALIZED_NAME_IPV6 = "ipv6";
  @SerializedName(SERIALIZED_NAME_IPV6)
  private List<ZeroTrustGatewayDnsResolverSettingsV6> ipv6 = new ArrayList<>();

  public ZeroTrustGatewayRuleSettingsDnsResolvers() {
  }

  public ZeroTrustGatewayRuleSettingsDnsResolvers ipv4(List<ZeroTrustGatewayDnsResolverSettingsV4> ipv4) {
    this.ipv4 = ipv4;
    return this;
  }

  public ZeroTrustGatewayRuleSettingsDnsResolvers addIpv4Item(ZeroTrustGatewayDnsResolverSettingsV4 ipv4Item) {
    if (this.ipv4 == null) {
      this.ipv4 = new ArrayList<>();
    }
    this.ipv4.add(ipv4Item);
    return this;
  }

   /**
   * Get ipv4
   * @return ipv4
  **/
  @javax.annotation.Nullable
  public List<ZeroTrustGatewayDnsResolverSettingsV4> getIpv4() {
    return ipv4;
  }

  public void setIpv4(List<ZeroTrustGatewayDnsResolverSettingsV4> ipv4) {
    this.ipv4 = ipv4;
  }


  public ZeroTrustGatewayRuleSettingsDnsResolvers ipv6(List<ZeroTrustGatewayDnsResolverSettingsV6> ipv6) {
    this.ipv6 = ipv6;
    return this;
  }

  public ZeroTrustGatewayRuleSettingsDnsResolvers addIpv6Item(ZeroTrustGatewayDnsResolverSettingsV6 ipv6Item) {
    if (this.ipv6 == null) {
      this.ipv6 = new ArrayList<>();
    }
    this.ipv6.add(ipv6Item);
    return this;
  }

   /**
   * Get ipv6
   * @return ipv6
  **/
  @javax.annotation.Nullable
  public List<ZeroTrustGatewayDnsResolverSettingsV6> getIpv6() {
    return ipv6;
  }

  public void setIpv6(List<ZeroTrustGatewayDnsResolverSettingsV6> ipv6) {
    this.ipv6 = ipv6;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZeroTrustGatewayRuleSettingsDnsResolvers zeroTrustGatewayRuleSettingsDnsResolvers = (ZeroTrustGatewayRuleSettingsDnsResolvers) o;
    return Objects.equals(this.ipv4, zeroTrustGatewayRuleSettingsDnsResolvers.ipv4) &&
        Objects.equals(this.ipv6, zeroTrustGatewayRuleSettingsDnsResolvers.ipv6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4, ipv6);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZeroTrustGatewayRuleSettingsDnsResolvers {\n");
    sb.append("    ipv4: ").append(toIndentedString(ipv4)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
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
    openapiFields.add("ipv4");
    openapiFields.add("ipv6");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ZeroTrustGatewayRuleSettingsDnsResolvers
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ZeroTrustGatewayRuleSettingsDnsResolvers.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZeroTrustGatewayRuleSettingsDnsResolvers is not found in the empty JSON string", ZeroTrustGatewayRuleSettingsDnsResolvers.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ZeroTrustGatewayRuleSettingsDnsResolvers.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZeroTrustGatewayRuleSettingsDnsResolvers` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("ipv4") != null && !jsonObj.get("ipv4").isJsonNull()) {
        JsonArray jsonArrayipv4 = jsonObj.getAsJsonArray("ipv4");
        if (jsonArrayipv4 != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ipv4").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ipv4` to be an array in the JSON string but got `%s`", jsonObj.get("ipv4").toString()));
          }

          // validate the optional field `ipv4` (array)
          for (int i = 0; i < jsonArrayipv4.size(); i++) {
            ZeroTrustGatewayDnsResolverSettingsV4.validateJsonElement(jsonArrayipv4.get(i));
          };
        }
      }
      if (jsonObj.get("ipv6") != null && !jsonObj.get("ipv6").isJsonNull()) {
        JsonArray jsonArrayipv6 = jsonObj.getAsJsonArray("ipv6");
        if (jsonArrayipv6 != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ipv6").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ipv6` to be an array in the JSON string but got `%s`", jsonObj.get("ipv6").toString()));
          }

          // validate the optional field `ipv6` (array)
          for (int i = 0; i < jsonArrayipv6.size(); i++) {
            ZeroTrustGatewayDnsResolverSettingsV6.validateJsonElement(jsonArrayipv6.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZeroTrustGatewayRuleSettingsDnsResolvers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZeroTrustGatewayRuleSettingsDnsResolvers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZeroTrustGatewayRuleSettingsDnsResolvers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZeroTrustGatewayRuleSettingsDnsResolvers.class));

       return (TypeAdapter<T>) new TypeAdapter<ZeroTrustGatewayRuleSettingsDnsResolvers>() {
           @Override
           public void write(JsonWriter out, ZeroTrustGatewayRuleSettingsDnsResolvers value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZeroTrustGatewayRuleSettingsDnsResolvers read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZeroTrustGatewayRuleSettingsDnsResolvers given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZeroTrustGatewayRuleSettingsDnsResolvers
  * @throws IOException if the JSON string is invalid with respect to ZeroTrustGatewayRuleSettingsDnsResolvers
  */
  public static ZeroTrustGatewayRuleSettingsDnsResolvers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZeroTrustGatewayRuleSettingsDnsResolvers.class);
  }

 /**
  * Convert an instance of ZeroTrustGatewayRuleSettingsDnsResolvers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
