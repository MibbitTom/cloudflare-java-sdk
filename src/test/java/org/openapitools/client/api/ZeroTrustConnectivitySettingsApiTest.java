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
import org.openapitools.client.model.TunnelApiResponseCommonFailure;
import org.openapitools.client.model.TunnelZeroTrustConnectivitySettingsResponse;
import org.openapitools.client.model.ZeroTrustAccountsPatchConnectivitySettingsRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ZeroTrustConnectivitySettingsApi
 */
@Disabled
public class ZeroTrustConnectivitySettingsApiTest {

    private final ZeroTrustConnectivitySettingsApi api = new ZeroTrustConnectivitySettingsApi();

    /**
     * Get Zero Trust Connectivity Settings
     *
     * Gets the Zero Trust Connectivity Settings for the given account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustAccountsGetConnectivitySettingsTest() throws ApiException {
        String accountId = null;
        TunnelZeroTrustConnectivitySettingsResponse response = api.zeroTrustAccountsGetConnectivitySettings(accountId);
        // TODO: test validations
    }

    /**
     * Updates the Zero Trust Connectivity Settings
     *
     * Updates the Zero Trust Connectivity Settings for the given account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustAccountsPatchConnectivitySettingsTest() throws ApiException {
        String accountId = null;
        ZeroTrustAccountsPatchConnectivitySettingsRequest zeroTrustAccountsPatchConnectivitySettingsRequest = null;
        TunnelZeroTrustConnectivitySettingsResponse response = api.zeroTrustAccountsPatchConnectivitySettings(accountId, zeroTrustAccountsPatchConnectivitySettingsRequest);
        // TODO: test validations
    }

}
