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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import java.math.BigDecimal;
import org.openapitools.client.model.StreamApiResponseCommonFailure;
import org.openapitools.client.model.StreamWatermarkProfileDeleteWatermarkProfiles200Response;
import org.openapitools.client.model.StreamWatermarkResponseCollection;
import org.openapitools.client.model.StreamWatermarkResponseSingle;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StreamWatermarkProfileApi
 */
@Disabled
public class StreamWatermarkProfileApiTest {

    private final StreamWatermarkProfileApi api = new StreamWatermarkProfileApi();

    /**
     * Create watermark profiles via basic upload
     *
     * Creates watermark profiles using a single &#x60;HTTP POST multipart/form-data&#x60; request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamWatermarkProfileCreateWatermarkProfilesViaBasicUploadTest() throws ApiException {
        String accountId = null;
        String _file = null;
        String name = null;
        BigDecimal opacity = null;
        BigDecimal padding = null;
        String position = null;
        BigDecimal scale = null;
        StreamWatermarkResponseSingle response = api.streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload(accountId, _file, name, opacity, padding, position, scale);
        // TODO: test validations
    }

    /**
     * Delete watermark profiles
     *
     * Deletes a watermark profile.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamWatermarkProfileDeleteWatermarkProfilesTest() throws ApiException {
        String identifier = null;
        String accountId = null;
        StreamWatermarkProfileDeleteWatermarkProfiles200Response response = api.streamWatermarkProfileDeleteWatermarkProfiles(identifier, accountId);
        // TODO: test validations
    }

    /**
     * List watermark profiles
     *
     * Lists all watermark profiles for an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamWatermarkProfileListWatermarkProfilesTest() throws ApiException {
        String accountId = null;
        StreamWatermarkResponseCollection response = api.streamWatermarkProfileListWatermarkProfiles(accountId);
        // TODO: test validations
    }

    /**
     * Watermark profile details
     *
     * Retrieves details for a single watermark profile.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamWatermarkProfileWatermarkProfileDetailsTest() throws ApiException {
        String identifier = null;
        String accountId = null;
        StreamWatermarkResponseSingle response = api.streamWatermarkProfileWatermarkProfileDetails(identifier, accountId);
        // TODO: test validations
    }

}