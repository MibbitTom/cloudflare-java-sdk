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
import org.openapitools.client.model.ImagesImageVariantFit;
import org.openapitools.client.model.ImagesImageVariantSchemasMetadata;

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
 * Allows you to define image resizing sizes for different use cases.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T11:29:23.936635354+01:00[Europe/London]", comments = "Generator version: 7.5.0")
public class ImagesImageVariantOptions {
  public static final String SERIALIZED_NAME_FIT = "fit";
  @SerializedName(SERIALIZED_NAME_FIT)
  private ImagesImageVariantFit fit;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private BigDecimal height;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private ImagesImageVariantSchemasMetadata metadata;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private BigDecimal width;

  public ImagesImageVariantOptions() {
  }

  public ImagesImageVariantOptions fit(ImagesImageVariantFit fit) {
    this.fit = fit;
    return this;
  }

   /**
   * Get fit
   * @return fit
  **/
  @javax.annotation.Nonnull
  public ImagesImageVariantFit getFit() {
    return fit;
  }

  public void setFit(ImagesImageVariantFit fit) {
    this.fit = fit;
  }


  public ImagesImageVariantOptions height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * Maximum height in image pixels.
   * minimum: 1
   * @return height
  **/
  @javax.annotation.Nonnull
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }


  public ImagesImageVariantOptions metadata(ImagesImageVariantSchemasMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  public ImagesImageVariantSchemasMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ImagesImageVariantSchemasMetadata metadata) {
    this.metadata = metadata;
  }


  public ImagesImageVariantOptions width(BigDecimal width) {
    this.width = width;
    return this;
  }

   /**
   * Maximum width in image pixels.
   * minimum: 1
   * @return width
  **/
  @javax.annotation.Nonnull
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImagesImageVariantOptions imagesImageVariantOptions = (ImagesImageVariantOptions) o;
    return Objects.equals(this.fit, imagesImageVariantOptions.fit) &&
        Objects.equals(this.height, imagesImageVariantOptions.height) &&
        Objects.equals(this.metadata, imagesImageVariantOptions.metadata) &&
        Objects.equals(this.width, imagesImageVariantOptions.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fit, height, metadata, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagesImageVariantOptions {\n");
    sb.append("    fit: ").append(toIndentedString(fit)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("fit");
    openapiFields.add("height");
    openapiFields.add("metadata");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fit");
    openapiRequiredFields.add("height");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("width");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ImagesImageVariantOptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImagesImageVariantOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImagesImageVariantOptions is not found in the empty JSON string", ImagesImageVariantOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ImagesImageVariantOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImagesImageVariantOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImagesImageVariantOptions.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `fit`
      ImagesImageVariantFit.validateJsonElement(jsonObj.get("fit"));
      // validate the required field `metadata`
      ImagesImageVariantSchemasMetadata.validateJsonElement(jsonObj.get("metadata"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImagesImageVariantOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImagesImageVariantOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImagesImageVariantOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImagesImageVariantOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<ImagesImageVariantOptions>() {
           @Override
           public void write(JsonWriter out, ImagesImageVariantOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImagesImageVariantOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ImagesImageVariantOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImagesImageVariantOptions
  * @throws IOException if the JSON string is invalid with respect to ImagesImageVariantOptions
  */
  public static ImagesImageVariantOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImagesImageVariantOptions.class);
  }

 /**
  * Convert an instance of ImagesImageVariantOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

