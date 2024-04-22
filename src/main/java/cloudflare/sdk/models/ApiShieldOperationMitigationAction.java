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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * When set, this applies a mitigation action to this operation    - &#x60;log&#x60; log request when request does not conform to schema for this operation   - &#x60;block&#x60; deny access to the site when request does not conform to schema for this operation   - &#x60;none&#x60; will skip mitigation for this operation   - &#x60;null&#x60; indicates that no operation level mitigation is in place, see Zone Level Schema Validation Settings for mitigation action that will be applied 
 */
@JsonAdapter(ApiShieldOperationMitigationAction.Adapter.class)
public enum ApiShieldOperationMitigationAction {
  
  LOG("log"),
  
  BLOCK("block"),
  
  NONE("none"),
  
  NULL("null");

  private String value;

  ApiShieldOperationMitigationAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ApiShieldOperationMitigationAction fromValue(String value) {
    for (ApiShieldOperationMitigationAction b : ApiShieldOperationMitigationAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ApiShieldOperationMitigationAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final ApiShieldOperationMitigationAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ApiShieldOperationMitigationAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ApiShieldOperationMitigationAction.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ApiShieldOperationMitigationAction.fromValue(value);
  }
}

