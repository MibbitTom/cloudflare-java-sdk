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

import org.openapitools.client.JSON;

/**
 * Components of a SRV record.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DnsRecordsSRVRecordAllOfData {
  public static final String SERIALIZED_NAME_NAME = "name";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private BigDecimal port;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private BigDecimal priority;

  public static final String SERIALIZED_NAME_PROTO = "proto";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_PROTO)
  private String proto;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private BigDecimal weight;

  public DnsRecordsSRVRecordAllOfData() {
  }

  @Deprecated
  public DnsRecordsSRVRecordAllOfData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A valid hostname. Deprecated in favor of the regular &#39;name&#39; outside the data map. This data map field represents the remainder of the full &#39;name&#39; after the service and protocol.
   * @return name
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  @Deprecated
  public void setName(String name) {
    this.name = name;
  }


  public DnsRecordsSRVRecordAllOfData port(BigDecimal port) {
    this.port = port;
    return this;
  }

   /**
   * The port of the service.
   * minimum: 0
   * maximum: 65535
   * @return port
  **/
  @javax.annotation.Nullable
  public BigDecimal getPort() {
    return port;
  }

  public void setPort(BigDecimal port) {
    this.port = port;
  }


  public DnsRecordsSRVRecordAllOfData priority(BigDecimal priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Required for MX, SRV and URI records; unused by other record types. Records with lower priorities are preferred.
   * minimum: 0
   * maximum: 65535
   * @return priority
  **/
  @javax.annotation.Nullable
  public BigDecimal getPriority() {
    return priority;
  }

  public void setPriority(BigDecimal priority) {
    this.priority = priority;
  }


  @Deprecated
  public DnsRecordsSRVRecordAllOfData proto(String proto) {
    this.proto = proto;
    return this;
  }

   /**
   * A valid protocol, prefixed with an underscore. Deprecated in favor of the regular &#39;name&#39; outside the data map. This data map field normally represents the second label of that &#39;name&#39;.
   * @return proto
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public String getProto() {
    return proto;
  }

  @Deprecated
  public void setProto(String proto) {
    this.proto = proto;
  }


  @Deprecated
  public DnsRecordsSRVRecordAllOfData service(String service) {
    this.service = service;
    return this;
  }

   /**
   * A service type, prefixed with an underscore. Deprecated in favor of the regular &#39;name&#39; outside the data map. This data map field normally represents the first label of that &#39;name&#39;.
   * @return service
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public String getService() {
    return service;
  }

  @Deprecated
  public void setService(String service) {
    this.service = service;
  }


  public DnsRecordsSRVRecordAllOfData target(String target) {
    this.target = target;
    return this;
  }

   /**
   * A valid hostname.
   * @return target
  **/
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  public DnsRecordsSRVRecordAllOfData weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

   /**
   * The record weight.
   * minimum: 0
   * maximum: 65535
   * @return weight
  **/
  @javax.annotation.Nullable
  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRecordsSRVRecordAllOfData dnsRecordsSRVRecordAllOfData = (DnsRecordsSRVRecordAllOfData) o;
    return Objects.equals(this.name, dnsRecordsSRVRecordAllOfData.name) &&
        Objects.equals(this.port, dnsRecordsSRVRecordAllOfData.port) &&
        Objects.equals(this.priority, dnsRecordsSRVRecordAllOfData.priority) &&
        Objects.equals(this.proto, dnsRecordsSRVRecordAllOfData.proto) &&
        Objects.equals(this.service, dnsRecordsSRVRecordAllOfData.service) &&
        Objects.equals(this.target, dnsRecordsSRVRecordAllOfData.target) &&
        Objects.equals(this.weight, dnsRecordsSRVRecordAllOfData.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, port, priority, proto, service, target, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRecordsSRVRecordAllOfData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    proto: ").append(toIndentedString(proto)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("port");
    openapiFields.add("priority");
    openapiFields.add("proto");
    openapiFields.add("service");
    openapiFields.add("target");
    openapiFields.add("weight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DnsRecordsSRVRecordAllOfData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DnsRecordsSRVRecordAllOfData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DnsRecordsSRVRecordAllOfData is not found in the empty JSON string", DnsRecordsSRVRecordAllOfData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DnsRecordsSRVRecordAllOfData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DnsRecordsSRVRecordAllOfData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("proto") != null && !jsonObj.get("proto").isJsonNull()) && !jsonObj.get("proto").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proto` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proto").toString()));
      }
      if ((jsonObj.get("service") != null && !jsonObj.get("service").isJsonNull()) && !jsonObj.get("service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service").toString()));
      }
      if ((jsonObj.get("target") != null && !jsonObj.get("target").isJsonNull()) && !jsonObj.get("target").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DnsRecordsSRVRecordAllOfData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DnsRecordsSRVRecordAllOfData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DnsRecordsSRVRecordAllOfData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DnsRecordsSRVRecordAllOfData.class));

       return (TypeAdapter<T>) new TypeAdapter<DnsRecordsSRVRecordAllOfData>() {
           @Override
           public void write(JsonWriter out, DnsRecordsSRVRecordAllOfData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DnsRecordsSRVRecordAllOfData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DnsRecordsSRVRecordAllOfData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DnsRecordsSRVRecordAllOfData
  * @throws IOException if the JSON string is invalid with respect to DnsRecordsSRVRecordAllOfData
  */
  public static DnsRecordsSRVRecordAllOfData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DnsRecordsSRVRecordAllOfData.class);
  }

 /**
  * Convert an instance of DnsRecordsSRVRecordAllOfData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

