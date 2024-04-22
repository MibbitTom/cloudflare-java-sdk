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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Sets the queueing method used by the waiting room. Changing this parameter from the **default** queueing method is only available for the Waiting Room Advanced subscription. Regardless of the queueing method, if &#x60;queue_all&#x60; is enabled or an event is prequeueing, users in the waiting room will not be accepted to the origin. These users will always see a waiting room page that refreshes automatically. The valid queueing methods are: 1. &#x60;fifo&#x60; **(default)**: First-In-First-Out queue where customers gain access in the order they arrived. 2. &#x60;random&#x60;: Random queue where customers gain access randomly, regardless of arrival time. 3. &#x60;passthrough&#x60;: Users will pass directly through the waiting room and into the origin website. As a result, any configured limits will not be respected while this is enabled. This method can be used as an alternative to disabling a waiting room (with &#x60;suspended&#x60;) so that analytics are still reported. This can be used if you wish to allow all traffic normally, but want to restrict traffic during a waiting room event, or vice versa. 4. &#x60;reject&#x60;: Users will be immediately rejected from the waiting room. As a result, no users will reach the origin website while this is enabled. This can be used if you wish to reject all traffic while performing maintenance, block traffic during a specified period of time (an event), or block traffic while events are not occurring. Consider a waiting room used for vaccine distribution that only allows traffic during sign-up events, and otherwise blocks all traffic. For this case, the waiting room uses &#x60;reject&#x60;, and its events override this with &#x60;fifo&#x60;, &#x60;random&#x60;, or &#x60;passthrough&#x60;. When this queueing method is enabled and neither &#x60;queueAll&#x60; is enabled nor an event is prequeueing, the waiting room page **will not refresh automatically**.
 */
@JsonAdapter(WaitingroomQueueingMethod.Adapter.class)
public enum WaitingroomQueueingMethod {
  
  FIFO("fifo"),
  
  RANDOM("random"),
  
  PASSTHROUGH("passthrough"),
  
  REJECT("reject");

  private String value;

  WaitingroomQueueingMethod(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WaitingroomQueueingMethod fromValue(String value) {
    for (WaitingroomQueueingMethod b : WaitingroomQueueingMethod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WaitingroomQueueingMethod> {
    @Override
    public void write(final JsonWriter jsonWriter, final WaitingroomQueueingMethod enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WaitingroomQueueingMethod read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WaitingroomQueueingMethod.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    WaitingroomQueueingMethod.fromValue(value);
  }
}

