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


package cloudflare;

import invalidPackageName.ApiException;
import org.openapitools.client.model.ZeroTrustGatewayEmptyResponse;
import org.openapitools.client.model.ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocation4XXResponse;
import org.openapitools.client.model.ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest;
import org.openapitools.client.model.ZeroTrustGatewayLocationsListZeroTrustGatewayLocations4XXResponse;
import org.openapitools.client.model.ZeroTrustGatewaySchemasResponseCollection;
import org.openapitools.client.model.ZeroTrustGatewaySchemasSingleResponse;
import org.openapitools.client.model.ZeroTrustListsDeleteZeroTrustList4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ZeroTrustGatewayLocationsApi
 */
@Disabled
public class ZeroTrustGatewayLocationsApiTest {

    private final ZeroTrustGatewayLocationsApi api = new ZeroTrustGatewayLocationsApi();

    /**
     * Create a Zero Trust Gateway location
     *
     * Creates a new Zero Trust Gateway location.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationTest() throws ApiException {
        Object accountId = null;
        ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest = null;
        ZeroTrustGatewaySchemasSingleResponse response = api.zeroTrustGatewayLocationsCreateZeroTrustGatewayLocation(accountId, zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest);
        // TODO: test validations
    }

    /**
     * Delete a Zero Trust Gateway location
     *
     * Deletes a configured Zero Trust Gateway location.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustGatewayLocationsDeleteZeroTrustGatewayLocationTest() throws ApiException {
        Object locationId = null;
        Object accountId = null;
        ZeroTrustGatewayEmptyResponse response = api.zeroTrustGatewayLocationsDeleteZeroTrustGatewayLocation(locationId, accountId);
        // TODO: test validations
    }

    /**
     * List Zero Trust Gateway locations
     *
     * Fetches Zero Trust Gateway locations for an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustGatewayLocationsListZeroTrustGatewayLocationsTest() throws ApiException {
        Object accountId = null;
        ZeroTrustGatewaySchemasResponseCollection response = api.zeroTrustGatewayLocationsListZeroTrustGatewayLocations(accountId);
        // TODO: test validations
    }

    /**
     * Update a Zero Trust Gateway location
     *
     * Updates a configured Zero Trust Gateway location.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustGatewayLocationsUpdateZeroTrustGatewayLocationTest() throws ApiException {
        Object locationId = null;
        Object accountId = null;
        ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest = null;
        ZeroTrustGatewaySchemasSingleResponse response = api.zeroTrustGatewayLocationsUpdateZeroTrustGatewayLocation(locationId, accountId, zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest);
        // TODO: test validations
    }

    /**
     * Get Zero Trust Gateway location details
     *
     * Fetches a single Zero Trust Gateway location.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustGatewayLocationsZeroTrustGatewayLocationDetailsTest() throws ApiException {
        Object locationId = null;
        Object accountId = null;
        ZeroTrustGatewaySchemasSingleResponse response = api.zeroTrustGatewayLocationsZeroTrustGatewayLocationDetails(locationId, accountId);
        // TODO: test validations
    }

}