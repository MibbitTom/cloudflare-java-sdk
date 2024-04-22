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
import java.math.BigDecimal;
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
 * Components of a DS record.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DnsRecordsDSRecordAllOfData {
  public static final String SERIALIZED_NAME_ALGORITHM = "algorithm";
  @SerializedName(SERIALIZED_NAME_ALGORITHM)
  private BigDecimal algorithm;

  public static final String SERIALIZED_NAME_DIGEST = "digest";
  @SerializedName(SERIALIZED_NAME_DIGEST)
  private String digest;

  public static final String SERIALIZED_NAME_DIGEST_TYPE = "digest_type";
  @SerializedName(SERIALIZED_NAME_DIGEST_TYPE)
  private BigDecimal digestType;

  public static final String SERIALIZED_NAME_KEY_TAG = "key_tag";
  @SerializedName(SERIALIZED_NAME_KEY_TAG)
  private BigDecimal keyTag;

  public DnsRecordsDSRecordAllOfData() {
  }

  public DnsRecordsDSRecordAllOfData algorithm(BigDecimal algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * Algorithm.
   * minimum: 0
   * maximum: 255
   * @return algorithm
  **/
  @javax.annotation.Nullable
  public BigDecimal getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(BigDecimal algorithm) {
    this.algorithm = algorithm;
  }


  public DnsRecordsDSRecordAllOfData digest(String digest) {
    this.digest = digest;
    return this;
  }

   /**
   * Digest.
   * @return digest
  **/
  @javax.annotation.Nullable
  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }


  public DnsRecordsDSRecordAllOfData digestType(BigDecimal digestType) {
    this.digestType = digestType;
    return this;
  }

   /**
   * Digest Type.
   * minimum: 0
   * maximum: 255
   * @return digestType
  **/
  @javax.annotation.Nullable
  public BigDecimal getDigestType() {
    return digestType;
  }

  public void setDigestType(BigDecimal digestType) {
    this.digestType = digestType;
  }


  public DnsRecordsDSRecordAllOfData keyTag(BigDecimal keyTag) {
    this.keyTag = keyTag;
    return this;
  }

   /**
   * Key Tag.
   * minimum: 0
   * maximum: 65535
   * @return keyTag
  **/
  @javax.annotation.Nullable
  public BigDecimal getKeyTag() {
    return keyTag;
  }

  public void setKeyTag(BigDecimal keyTag) {
    this.keyTag = keyTag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRecordsDSRecordAllOfData dnsRecordsDSRecordAllOfData = (DnsRecordsDSRecordAllOfData) o;
    return Objects.equals(this.algorithm, dnsRecordsDSRecordAllOfData.algorithm) &&
        Objects.equals(this.digest, dnsRecordsDSRecordAllOfData.digest) &&
        Objects.equals(this.digestType, dnsRecordsDSRecordAllOfData.digestType) &&
        Objects.equals(this.keyTag, dnsRecordsDSRecordAllOfData.keyTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, digest, digestType, keyTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRecordsDSRecordAllOfData {\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
    sb.append("    digestType: ").append(toIndentedString(digestType)).append("\n");
    sb.append("    keyTag: ").append(toIndentedString(keyTag)).append("\n");
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
    openapiFields.add("algorithm");
    openapiFields.add("digest");
    openapiFields.add("digest_type");
    openapiFields.add("key_tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DnsRecordsDSRecordAllOfData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DnsRecordsDSRecordAllOfData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DnsRecordsDSRecordAllOfData is not found in the empty JSON string", DnsRecordsDSRecordAllOfData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DnsRecordsDSRecordAllOfData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DnsRecordsDSRecordAllOfData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("digest") != null && !jsonObj.get("digest").isJsonNull()) && !jsonObj.get("digest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `digest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("digest").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DnsRecordsDSRecordAllOfData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DnsRecordsDSRecordAllOfData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DnsRecordsDSRecordAllOfData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DnsRecordsDSRecordAllOfData.class));

       return (TypeAdapter<T>) new TypeAdapter<DnsRecordsDSRecordAllOfData>() {
           @Override
           public void write(JsonWriter out, DnsRecordsDSRecordAllOfData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DnsRecordsDSRecordAllOfData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DnsRecordsDSRecordAllOfData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DnsRecordsDSRecordAllOfData
  * @throws IOException if the JSON string is invalid with respect to DnsRecordsDSRecordAllOfData
  */
  public static DnsRecordsDSRecordAllOfData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DnsRecordsDSRecordAllOfData.class);
  }

 /**
  * Convert an instance of DnsRecordsDSRecordAllOfData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

