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
 * WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:11:08.999300719+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private BigDecimal count;

  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private String cursor;

  public WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo() {
  }

  public WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo count(BigDecimal count) {
    this.count = count;
    return this;
  }

   /**
   * Total results returned based on your list parameters.
   * @return count
  **/
  @javax.annotation.Nullable
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }


  public WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Opaque token indicating the position from which to continue when requesting the next set of records if the amount of list results was limited by the limit parameter. A valid value for the cursor can be obtained from the cursors object in the result_info structure.
   * @return cursor
  **/
  @javax.annotation.Nullable
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo workersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo = (WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo) o;
    return Objects.equals(this.count, workersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo.count) &&
        Objects.equals(this.cursor, workersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("cursor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo is not found in the empty JSON string", WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cursor") != null && !jsonObj.get("cursor").isJsonNull()) && !jsonObj.get("cursor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cursor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cursor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo>() {
           @Override
           public void write(JsonWriter out, WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo
  * @throws IOException if the JSON string is invalid with respect to WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo
  */
  public static WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo.class);
  }

 /**
  * Convert an instance of WorkersKvNamespaceListANamespaceSKeys200ResponseAllOfResultInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
