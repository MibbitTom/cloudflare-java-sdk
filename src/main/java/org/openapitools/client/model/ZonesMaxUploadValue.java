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
import java.math.BigDecimal;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Value of the zone setting. Notes: The size depends on the plan level of the zone. (Enterprise &#x3D; 500, Business &#x3D; 200, Pro &#x3D; 100, Free &#x3D; 100)
 */
@JsonAdapter(ZonesMaxUploadValue.Adapter.class)
public enum ZonesMaxUploadValue {
  
  NUMBER_100(new BigDecimal("100")),
  
  NUMBER_200(new BigDecimal("200")),
  
  NUMBER_500(new BigDecimal("500"));

  private BigDecimal value;

  ZonesMaxUploadValue(BigDecimal value) {
    this.value = value;
  }

  public BigDecimal getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ZonesMaxUploadValue fromValue(BigDecimal value) {
    for (ZonesMaxUploadValue b : ZonesMaxUploadValue.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ZonesMaxUploadValue> {
    @Override
    public void write(final JsonWriter jsonWriter, final ZonesMaxUploadValue enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ZonesMaxUploadValue read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ZonesMaxUploadValue.fromValue(new BigDecimal(value));
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ZonesMaxUploadValue.fromValue(new BigDecimal(value));
  }
}

