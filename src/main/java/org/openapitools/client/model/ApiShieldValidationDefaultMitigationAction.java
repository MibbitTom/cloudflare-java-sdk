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
 * The default mitigation action used when there is no mitigation action defined on the operation  Mitigation actions are as follows:    * &#x60;log&#x60; - log request when request does not conform to schema   * &#x60;block&#x60; - deny access to the site when request does not conform to schema  A special value of of &#x60;none&#x60; will skip running schema validation entirely for the request when there is no mitigation action defined on the operation 
 */
@JsonAdapter(ApiShieldValidationDefaultMitigationAction.Adapter.class)
public enum ApiShieldValidationDefaultMitigationAction {
  
  NONE("none"),
  
  LOG("log"),
  
  BLOCK("block");

  private String value;

  ApiShieldValidationDefaultMitigationAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ApiShieldValidationDefaultMitigationAction fromValue(String value) {
    for (ApiShieldValidationDefaultMitigationAction b : ApiShieldValidationDefaultMitigationAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ApiShieldValidationDefaultMitigationAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final ApiShieldValidationDefaultMitigationAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ApiShieldValidationDefaultMitigationAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ApiShieldValidationDefaultMitigationAction.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ApiShieldValidationDefaultMitigationAction.fromValue(value);
  }
}
