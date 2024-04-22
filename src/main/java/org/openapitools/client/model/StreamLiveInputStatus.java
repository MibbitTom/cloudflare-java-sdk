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
 * The connection status of a live input.
 */
@JsonAdapter(StreamLiveInputStatus.Adapter.class)
public enum StreamLiveInputStatus {
  
  NULL("null"),
  
  CONNECTED("connected"),
  
  RECONNECTED("reconnected"),
  
  RECONNECTING("reconnecting"),
  
  CLIENT_DISCONNECT("client_disconnect"),
  
  TTL_EXCEEDED("ttl_exceeded"),
  
  FAILED_TO_CONNECT("failed_to_connect"),
  
  FAILED_TO_RECONNECT("failed_to_reconnect"),
  
  NEW_CONFIGURATION_ACCEPTED("new_configuration_accepted");

  private String value;

  StreamLiveInputStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StreamLiveInputStatus fromValue(String value) {
    for (StreamLiveInputStatus b : StreamLiveInputStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StreamLiveInputStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final StreamLiveInputStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StreamLiveInputStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StreamLiveInputStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    StreamLiveInputStatus.fromValue(value);
  }
}

