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
import cloudflare.sdk.models.DnsRecordsBaseMeta;
import cloudflare.sdk.models.DnsRecordsSRVRecordAllOfData;
import cloudflare.sdk.models.DnsRecordsTtl;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * DnsRecordsSRVRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DnsRecordsSRVRecord {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CREATED_ON = "created_on";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private DnsRecordsBaseMeta meta;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modified_on";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

  public static final String SERIALIZED_NAME_PROXIABLE = "proxiable";
  @SerializedName(SERIALIZED_NAME_PROXIABLE)
  private Boolean proxiable;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private DnsRecordsTtl ttl = new BigDecimal("1");

  public static final String SERIALIZED_NAME_ZONE_ID = "zone_id";
  @SerializedName(SERIALIZED_NAME_ZONE_ID)
  private String zoneId;

  public static final String SERIALIZED_NAME_ZONE_NAME = "zone_name";
  @SerializedName(SERIALIZED_NAME_ZONE_NAME)
  private String zoneName;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private DnsRecordsSRVRecordAllOfData data;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Record type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SRV("SRV");

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

  public DnsRecordsSRVRecord() {
  }

  public DnsRecordsSRVRecord(
     OffsetDateTime createdOn, 
     String id, 
     Boolean locked, 
     OffsetDateTime modifiedOn, 
     Boolean proxiable, 
     String zoneId, 
     String zoneName, 
     String content
  ) {
    this();
    this.createdOn = createdOn;
    this.id = id;
    this.locked = locked;
    this.modifiedOn = modifiedOn;
    this.proxiable = proxiable;
    this.zoneId = zoneId;
    this.zoneName = zoneName;
    this.content = content;
  }

  public DnsRecordsSRVRecord comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Comments or notes about the DNS record. This field has no effect on DNS responses.
   * @return comment
  **/
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


   /**
   * When the record was created.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedOn() {
    return createdOn;
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
   * Whether this record can be modified/deleted (true means it&#39;s managed by Cloudflare).
   * @return locked
  **/
  @javax.annotation.Nullable
  public Boolean getLocked() {
    return locked;
  }



  public DnsRecordsSRVRecord meta(DnsRecordsBaseMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  public DnsRecordsBaseMeta getMeta() {
    return meta;
  }

  public void setMeta(DnsRecordsBaseMeta meta) {
    this.meta = meta;
  }


   /**
   * When the record was last modified.
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }



   /**
   * Whether the record can be proxied by Cloudflare or not.
   * @return proxiable
  **/
  @javax.annotation.Nullable
  public Boolean getProxiable() {
    return proxiable;
  }



  public DnsRecordsSRVRecord tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DnsRecordsSRVRecord addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Custom tags for the DNS record. This field has no effect on DNS responses.
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public DnsRecordsSRVRecord ttl(DnsRecordsTtl ttl) {
    this.ttl = ttl;
    return this;
  }

   /**
   * Get ttl
   * @return ttl
  **/
  @javax.annotation.Nullable
  public DnsRecordsTtl getTtl() {
    return ttl;
  }

  public void setTtl(DnsRecordsTtl ttl) {
    this.ttl = ttl;
  }


   /**
   * Identifier
   * @return zoneId
  **/
  @javax.annotation.Nullable
  public String getZoneId() {
    return zoneId;
  }



   /**
   * The domain of the record.
   * @return zoneName
  **/
  @javax.annotation.Nullable
  public String getZoneName() {
    return zoneName;
  }



   /**
   * Priority, weight, port, and SRV target. See &#39;data&#39; for setting the individual component values.
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }



  public DnsRecordsSRVRecord data(DnsRecordsSRVRecordAllOfData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  public DnsRecordsSRVRecordAllOfData getData() {
    return data;
  }

  public void setData(DnsRecordsSRVRecordAllOfData data) {
    this.data = data;
  }


  public DnsRecordsSRVRecord name(String name) {
    this.name = name;
    return this;
  }

   /**
   * DNS record name (or @ for the zone apex) in Punycode. For SRV records, the first label is normally a service and the second a protocol name, each starting with an underscore.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DnsRecordsSRVRecord type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Record type.
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRecordsSRVRecord dnsRecordsSRVRecord = (DnsRecordsSRVRecord) o;
    return Objects.equals(this.comment, dnsRecordsSRVRecord.comment) &&
        Objects.equals(this.createdOn, dnsRecordsSRVRecord.createdOn) &&
        Objects.equals(this.id, dnsRecordsSRVRecord.id) &&
        Objects.equals(this.locked, dnsRecordsSRVRecord.locked) &&
        Objects.equals(this.meta, dnsRecordsSRVRecord.meta) &&
        Objects.equals(this.modifiedOn, dnsRecordsSRVRecord.modifiedOn) &&
        Objects.equals(this.proxiable, dnsRecordsSRVRecord.proxiable) &&
        Objects.equals(this.tags, dnsRecordsSRVRecord.tags) &&
        Objects.equals(this.ttl, dnsRecordsSRVRecord.ttl) &&
        Objects.equals(this.zoneId, dnsRecordsSRVRecord.zoneId) &&
        Objects.equals(this.zoneName, dnsRecordsSRVRecord.zoneName) &&
        Objects.equals(this.content, dnsRecordsSRVRecord.content) &&
        Objects.equals(this.data, dnsRecordsSRVRecord.data) &&
        Objects.equals(this.name, dnsRecordsSRVRecord.name) &&
        Objects.equals(this.type, dnsRecordsSRVRecord.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, createdOn, id, locked, meta, modifiedOn, proxiable, tags, ttl, zoneId, zoneName, content, data, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRecordsSRVRecord {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    proxiable: ").append(toIndentedString(proxiable)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("created_on");
    openapiFields.add("id");
    openapiFields.add("locked");
    openapiFields.add("meta");
    openapiFields.add("modified_on");
    openapiFields.add("proxiable");
    openapiFields.add("tags");
    openapiFields.add("ttl");
    openapiFields.add("zone_id");
    openapiFields.add("zone_name");
    openapiFields.add("content");
    openapiFields.add("data");
    openapiFields.add("name");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DnsRecordsSRVRecord
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DnsRecordsSRVRecord.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DnsRecordsSRVRecord is not found in the empty JSON string", DnsRecordsSRVRecord.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DnsRecordsSRVRecord.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DnsRecordsSRVRecord` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DnsRecordsSRVRecord.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        DnsRecordsBaseMeta.validateJsonElement(jsonObj.get("meta"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      // validate the optional field `ttl`
      if (jsonObj.get("ttl") != null && !jsonObj.get("ttl").isJsonNull()) {
        DnsRecordsTtl.validateJsonElement(jsonObj.get("ttl"));
      }
      if ((jsonObj.get("zone_id") != null && !jsonObj.get("zone_id").isJsonNull()) && !jsonObj.get("zone_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zone_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zone_id").toString()));
      }
      if ((jsonObj.get("zone_name") != null && !jsonObj.get("zone_name").isJsonNull()) && !jsonObj.get("zone_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zone_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zone_name").toString()));
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      // validate the required field `data`
      DnsRecordsSRVRecordAllOfData.validateJsonElement(jsonObj.get("data"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DnsRecordsSRVRecord.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DnsRecordsSRVRecord' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DnsRecordsSRVRecord> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DnsRecordsSRVRecord.class));

       return (TypeAdapter<T>) new TypeAdapter<DnsRecordsSRVRecord>() {
           @Override
           public void write(JsonWriter out, DnsRecordsSRVRecord value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DnsRecordsSRVRecord read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DnsRecordsSRVRecord given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DnsRecordsSRVRecord
  * @throws IOException if the JSON string is invalid with respect to DnsRecordsSRVRecord
  */
  public static DnsRecordsSRVRecord fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DnsRecordsSRVRecord.class);
  }

 /**
  * Convert an instance of DnsRecordsSRVRecord to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
