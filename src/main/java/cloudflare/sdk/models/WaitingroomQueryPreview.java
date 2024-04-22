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
 * WaitingroomQueryPreview
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:31:20.290775906+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class WaitingroomQueryPreview {
  public static final String SERIALIZED_NAME_CUSTOM_HTML = "custom_html";
  @SerializedName(SERIALIZED_NAME_CUSTOM_HTML)
  private String customHtml = "";

  public WaitingroomQueryPreview() {
  }

  public WaitingroomQueryPreview customHtml(String customHtml) {
    this.customHtml = customHtml;
    return this;
  }

   /**
   * Only available for the Waiting Room Advanced subscription. This is a template html file that will be rendered at the edge. If no custom_page_html is provided, the default waiting room will be used. The template is based on mustache ( https://mustache.github.io/ ). There are several variables that are evaluated by the Cloudflare edge: 1. {{&#x60;waitTimeKnown&#x60;}} Acts like a boolean value that indicates the behavior to take when wait time is not available, for instance when queue_all is **true**. 2. {{&#x60;waitTimeFormatted&#x60;}} Estimated wait time for the user. For example, five minutes. Alternatively, you can use: 3. {{&#x60;waitTime&#x60;}} Number of minutes of estimated wait for a user. 4. {{&#x60;waitTimeHours&#x60;}} Number of hours of estimated wait for a user (&#x60;Math.floor(waitTime/60)&#x60;). 5. {{&#x60;waitTimeHourMinutes&#x60;}} Number of minutes above the &#x60;waitTimeHours&#x60; value (&#x60;waitTime%60&#x60;). 6. {{&#x60;queueIsFull&#x60;}} Changes to **true** when no more people can be added to the queue.  To view the full list of variables, look at the &#x60;cfWaitingRoom&#x60; object described under the &#x60;json_response_enabled&#x60; property in other Waiting Room API calls.
   * @return customHtml
  **/
  @javax.annotation.Nonnull
  public String getCustomHtml() {
    return customHtml;
  }

  public void setCustomHtml(String customHtml) {
    this.customHtml = customHtml;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaitingroomQueryPreview waitingroomQueryPreview = (WaitingroomQueryPreview) o;
    return Objects.equals(this.customHtml, waitingroomQueryPreview.customHtml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customHtml);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaitingroomQueryPreview {\n");
    sb.append("    customHtml: ").append(toIndentedString(customHtml)).append("\n");
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
    openapiFields.add("custom_html");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("custom_html");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WaitingroomQueryPreview
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WaitingroomQueryPreview.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WaitingroomQueryPreview is not found in the empty JSON string", WaitingroomQueryPreview.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WaitingroomQueryPreview.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WaitingroomQueryPreview` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WaitingroomQueryPreview.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("custom_html").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_html` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_html").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WaitingroomQueryPreview.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WaitingroomQueryPreview' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WaitingroomQueryPreview> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WaitingroomQueryPreview.class));

       return (TypeAdapter<T>) new TypeAdapter<WaitingroomQueryPreview>() {
           @Override
           public void write(JsonWriter out, WaitingroomQueryPreview value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WaitingroomQueryPreview read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WaitingroomQueryPreview given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WaitingroomQueryPreview
  * @throws IOException if the JSON string is invalid with respect to WaitingroomQueryPreview
  */
  public static WaitingroomQueryPreview fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WaitingroomQueryPreview.class);
  }

 /**
  * Convert an instance of WaitingroomQueryPreview to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
