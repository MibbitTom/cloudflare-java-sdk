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
import java.math.BigDecimal;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Value of the zone setting. Notes: Setting a TTL of 0 is equivalent to selecting &#x60;Respect Existing Headers&#x60;
 */
@JsonAdapter(ZonesBrowserCacheTtlValue.Adapter.class)
public enum ZonesBrowserCacheTtlValue {
  
  NUMBER_0(new BigDecimal("0")),
  
  NUMBER_30(new BigDecimal("30")),
  
  NUMBER_60(new BigDecimal("60")),
  
  NUMBER_120(new BigDecimal("120")),
  
  NUMBER_300(new BigDecimal("300")),
  
  NUMBER_1200(new BigDecimal("1200")),
  
  NUMBER_1800(new BigDecimal("1800")),
  
  NUMBER_3600(new BigDecimal("3600")),
  
  NUMBER_7200(new BigDecimal("7200")),
  
  NUMBER_10800(new BigDecimal("10800")),
  
  NUMBER_14400(new BigDecimal("14400")),
  
  NUMBER_18000(new BigDecimal("18000")),
  
  NUMBER_28800(new BigDecimal("28800")),
  
  NUMBER_43200(new BigDecimal("43200")),
  
  NUMBER_57600(new BigDecimal("57600")),
  
  NUMBER_72000(new BigDecimal("72000")),
  
  NUMBER_86400(new BigDecimal("86400")),
  
  NUMBER_172800(new BigDecimal("172800")),
  
  NUMBER_259200(new BigDecimal("259200")),
  
  NUMBER_345600(new BigDecimal("345600")),
  
  NUMBER_432000(new BigDecimal("432000")),
  
  NUMBER_691200(new BigDecimal("691200")),
  
  NUMBER_1382400(new BigDecimal("1382400")),
  
  NUMBER_2073600(new BigDecimal("2073600")),
  
  NUMBER_2678400(new BigDecimal("2678400")),
  
  NUMBER_5356800(new BigDecimal("5356800")),
  
  NUMBER_16070400(new BigDecimal("16070400")),
  
  NUMBER_31536000(new BigDecimal("31536000"));

  private BigDecimal value;

  ZonesBrowserCacheTtlValue(BigDecimal value) {
    this.value = value;
  }

  public BigDecimal getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ZonesBrowserCacheTtlValue fromValue(BigDecimal value) {
    for (ZonesBrowserCacheTtlValue b : ZonesBrowserCacheTtlValue.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ZonesBrowserCacheTtlValue> {
    @Override
    public void write(final JsonWriter jsonWriter, final ZonesBrowserCacheTtlValue enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ZonesBrowserCacheTtlValue read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ZonesBrowserCacheTtlValue.fromValue(new BigDecimal(value));
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ZonesBrowserCacheTtlValue.fromValue(new BigDecimal(value));
  }
}
