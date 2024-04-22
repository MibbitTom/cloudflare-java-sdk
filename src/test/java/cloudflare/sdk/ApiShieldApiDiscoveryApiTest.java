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


package cloudflare.sdk;

import cloudflare.ApiException;
import cloudflare.sdk.models.ApiShieldApiDiscoveryOrigin;
import cloudflare.sdk.models.ApiShieldApiDiscoveryPatchMultipleRequestEntry;
import cloudflare.sdk.models.ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200Response;
import cloudflare.sdk.models.ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZoneAsOpenapi4XXResponse;
import cloudflare.sdk.models.ApiShieldApiDiscoveryState;
import cloudflare.sdk.models.ApiShieldApiPatchDiscoveredOperationRequest;
import cloudflare.sdk.models.ApiShieldApiResponseCommonFailure;
import cloudflare.sdk.models.ApiShieldPatchDiscoveriesResponse;
import cloudflare.sdk.models.ApiShieldPatchDiscoveryResponse;
import cloudflare.sdk.models.ApiShieldSchemaResponseDiscovery;
import java.util.Set;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiShieldApiDiscoveryApi
 */
@Disabled
public class ApiShieldApiDiscoveryApiTest {

    private final ApiShieldApiDiscoveryApi api = new ApiShieldApiDiscoveryApi();

    /**
     * Retrieve discovered operations on a zone
     *
     * Retrieve the most up to date view of discovered operations
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZoneTest() throws ApiException {
        String zoneId = null;
        Object page = null;
        Object perPage = null;
        Set<String> host = null;
        Set<String> method = null;
        String endpoint = null;
        String direction = null;
        String order = null;
        Boolean diff = null;
        ApiShieldApiDiscoveryOrigin origin = null;
        ApiShieldApiDiscoveryState state = null;
        ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200Response response = api.apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone(zoneId, page, perPage, host, method, endpoint, direction, order, diff, origin, state);
        // TODO: test validations
    }

    /**
     * Retrieve discovered operations on a zone rendered as OpenAPI schemas
     *
     * Retrieve the most up to date view of discovered operations, rendered as OpenAPI schemas
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZoneAsOpenapiTest() throws ApiException {
        String zoneId = null;
        ApiShieldSchemaResponseDiscovery response = api.apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZoneAsOpenapi(zoneId);
        // TODO: test validations
    }

    /**
     * Patch discovered operation
     *
     * Update the &#x60;state&#x60; on a discovered operation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiShieldApiPatchDiscoveredOperationTest() throws ApiException {
        String zoneId = null;
        UUID operationId = null;
        ApiShieldApiPatchDiscoveredOperationRequest apiShieldApiPatchDiscoveredOperationRequest = null;
        ApiShieldPatchDiscoveryResponse response = api.apiShieldApiPatchDiscoveredOperation(zoneId, operationId, apiShieldApiPatchDiscoveredOperationRequest);
        // TODO: test validations
    }

    /**
     * Patch discovered operations
     *
     * Update the &#x60;state&#x60; on one or more discovered operations
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiShieldApiPatchDiscoveredOperationsTest() throws ApiException {
        String zoneId = null;
        Map<String, ApiShieldApiDiscoveryPatchMultipleRequestEntry> requestBody = null;
        ApiShieldPatchDiscoveriesResponse response = api.apiShieldApiPatchDiscoveredOperations(zoneId, requestBody);
        // TODO: test validations
    }

}
