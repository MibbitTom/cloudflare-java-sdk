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
import cloudflare.sdk.models.DlpContextAwareness;
import cloudflare.sdk.models.DlpUpdatePredefinedProfileEntriesInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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
 * DlpUpdatePredefinedProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class DlpUpdatePredefinedProfile {
  public static final String SERIALIZED_NAME_ALLOWED_MATCH_COUNT = "allowed_match_count";
  @SerializedName(SERIALIZED_NAME_ALLOWED_MATCH_COUNT)
  private BigDecimal allowedMatchCount = new BigDecimal("0");

  public static final String SERIALIZED_NAME_CONTEXT_AWARENESS = "context_awareness";
  @SerializedName(SERIALIZED_NAME_CONTEXT_AWARENESS)
  private DlpContextAwareness contextAwareness;

  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List<DlpUpdatePredefinedProfileEntriesInner> entries = new ArrayList<>();

  public static final String SERIALIZED_NAME_OCR_ENABLED = "ocr_enabled";
  @SerializedName(SERIALIZED_NAME_OCR_ENABLED)
  private Boolean ocrEnabled;

  public DlpUpdatePredefinedProfile() {
  }

  public DlpUpdatePredefinedProfile allowedMatchCount(BigDecimal allowedMatchCount) {
    this.allowedMatchCount = allowedMatchCount;
    return this;
  }

   /**
   * Related DLP policies will trigger when the match count exceeds the number set.
   * minimum: 0
   * maximum: 1000
   * @return allowedMatchCount
  **/
  @javax.annotation.Nullable
  public BigDecimal getAllowedMatchCount() {
    return allowedMatchCount;
  }

  public void setAllowedMatchCount(BigDecimal allowedMatchCount) {
    this.allowedMatchCount = allowedMatchCount;
  }


  public DlpUpdatePredefinedProfile contextAwareness(DlpContextAwareness contextAwareness) {
    this.contextAwareness = contextAwareness;
    return this;
  }

   /**
   * Get contextAwareness
   * @return contextAwareness
  **/
  @javax.annotation.Nullable
  public DlpContextAwareness getContextAwareness() {
    return contextAwareness;
  }

  public void setContextAwareness(DlpContextAwareness contextAwareness) {
    this.contextAwareness = contextAwareness;
  }


  public DlpUpdatePredefinedProfile entries(List<DlpUpdatePredefinedProfileEntriesInner> entries) {
    this.entries = entries;
    return this;
  }

  public DlpUpdatePredefinedProfile addEntriesItem(DlpUpdatePredefinedProfileEntriesInner entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * The entries for this profile.
   * @return entries
  **/
  @javax.annotation.Nullable
  public List<DlpUpdatePredefinedProfileEntriesInner> getEntries() {
    return entries;
  }

  public void setEntries(List<DlpUpdatePredefinedProfileEntriesInner> entries) {
    this.entries = entries;
  }


  public DlpUpdatePredefinedProfile ocrEnabled(Boolean ocrEnabled) {
    this.ocrEnabled = ocrEnabled;
    return this;
  }

   /**
   * If true, scan images via OCR to determine if any text present matches filters.
   * @return ocrEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getOcrEnabled() {
    return ocrEnabled;
  }

  public void setOcrEnabled(Boolean ocrEnabled) {
    this.ocrEnabled = ocrEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DlpUpdatePredefinedProfile dlpUpdatePredefinedProfile = (DlpUpdatePredefinedProfile) o;
    return Objects.equals(this.allowedMatchCount, dlpUpdatePredefinedProfile.allowedMatchCount) &&
        Objects.equals(this.contextAwareness, dlpUpdatePredefinedProfile.contextAwareness) &&
        Objects.equals(this.entries, dlpUpdatePredefinedProfile.entries) &&
        Objects.equals(this.ocrEnabled, dlpUpdatePredefinedProfile.ocrEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedMatchCount, contextAwareness, entries, ocrEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DlpUpdatePredefinedProfile {\n");
    sb.append("    allowedMatchCount: ").append(toIndentedString(allowedMatchCount)).append("\n");
    sb.append("    contextAwareness: ").append(toIndentedString(contextAwareness)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    ocrEnabled: ").append(toIndentedString(ocrEnabled)).append("\n");
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
    openapiFields.add("allowed_match_count");
    openapiFields.add("context_awareness");
    openapiFields.add("entries");
    openapiFields.add("ocr_enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DlpUpdatePredefinedProfile
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DlpUpdatePredefinedProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DlpUpdatePredefinedProfile is not found in the empty JSON string", DlpUpdatePredefinedProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DlpUpdatePredefinedProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DlpUpdatePredefinedProfile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `context_awareness`
      if (jsonObj.get("context_awareness") != null && !jsonObj.get("context_awareness").isJsonNull()) {
        DlpContextAwareness.validateJsonElement(jsonObj.get("context_awareness"));
      }
      if (jsonObj.get("entries") != null && !jsonObj.get("entries").isJsonNull()) {
        JsonArray jsonArrayentries = jsonObj.getAsJsonArray("entries");
        if (jsonArrayentries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("entries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `entries` to be an array in the JSON string but got `%s`", jsonObj.get("entries").toString()));
          }

          // validate the optional field `entries` (array)
          for (int i = 0; i < jsonArrayentries.size(); i++) {
            DlpUpdatePredefinedProfileEntriesInner.validateJsonElement(jsonArrayentries.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DlpUpdatePredefinedProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DlpUpdatePredefinedProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DlpUpdatePredefinedProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DlpUpdatePredefinedProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<DlpUpdatePredefinedProfile>() {
           @Override
           public void write(JsonWriter out, DlpUpdatePredefinedProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DlpUpdatePredefinedProfile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DlpUpdatePredefinedProfile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DlpUpdatePredefinedProfile
  * @throws IOException if the JSON string is invalid with respect to DlpUpdatePredefinedProfile
  */
  public static DlpUpdatePredefinedProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DlpUpdatePredefinedProfile.class);
  }

 /**
  * Convert an instance of DlpUpdatePredefinedProfile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

