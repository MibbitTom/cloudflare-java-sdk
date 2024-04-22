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
import cloudflare.sdk.models.MagicMultipleRouteDeleteResponse;
import cloudflare.sdk.models.MagicMultipleRouteModifiedResponse;
import cloudflare.sdk.models.MagicRouteDeleteManyRequest;
import cloudflare.sdk.models.MagicRouteDeletedResponse;
import cloudflare.sdk.models.MagicRouteModifiedResponse;
import cloudflare.sdk.models.MagicRouteSingleResponse;
import cloudflare.sdk.models.MagicRouteUpdateManyRequest;
import cloudflare.sdk.models.MagicRouteUpdateRequest;
import cloudflare.sdk.models.MagicRoutesCollectionResponse;
import cloudflare.sdk.models.MagicStaticRoutesDeleteManyRoutes4XXResponse;
import cloudflare.sdk.models.MagicStaticRoutesDeleteRoute4XXResponse;
import cloudflare.sdk.models.MagicStaticRoutesListRoutes4XXResponse;
import cloudflare.sdk.models.MagicStaticRoutesRouteDetails4XXResponse;
import cloudflare.sdk.models.MagicStaticRoutesUpdateManyRoutes4XXResponse;
import cloudflare.sdk.models.MagicStaticRoutesUpdateRoute4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MagicStaticRoutesApi
 */
@Disabled
public class MagicStaticRoutesApiTest {

    private final MagicStaticRoutesApi api = new MagicStaticRoutesApi();

    /**
     * Create Routes
     *
     * Creates a new Magic static route. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to run validation only without persisting changes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicStaticRoutesCreateRoutesTest() throws ApiException {
        String accountId = null;
        Object body = null;
        MagicRoutesCollectionResponse response = api.magicStaticRoutesCreateRoutes(accountId, body);
        // TODO: test validations
    }

    /**
     * Delete Many Routes
     *
     * Delete multiple Magic static routes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicStaticRoutesDeleteManyRoutesTest() throws ApiException {
        String accountId = null;
        MagicRouteDeleteManyRequest magicRouteDeleteManyRequest = null;
        MagicMultipleRouteDeleteResponse response = api.magicStaticRoutesDeleteManyRoutes(accountId, magicRouteDeleteManyRequest);
        // TODO: test validations
    }

    /**
     * Delete Route
     *
     * Disable and remove a specific Magic static route.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicStaticRoutesDeleteRouteTest() throws ApiException {
        String routeIdentifier = null;
        String accountId = null;
        MagicRouteDeletedResponse response = api.magicStaticRoutesDeleteRoute(routeIdentifier, accountId);
        // TODO: test validations
    }

    /**
     * List Routes
     *
     * List all Magic static routes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicStaticRoutesListRoutesTest() throws ApiException {
        String accountId = null;
        MagicRoutesCollectionResponse response = api.magicStaticRoutesListRoutes(accountId);
        // TODO: test validations
    }

    /**
     * Route Details
     *
     * Get a specific Magic static route.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicStaticRoutesRouteDetailsTest() throws ApiException {
        String routeIdentifier = null;
        String accountId = null;
        MagicRouteSingleResponse response = api.magicStaticRoutesRouteDetails(routeIdentifier, accountId);
        // TODO: test validations
    }

    /**
     * Update Many Routes
     *
     * Update multiple Magic static routes. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to run validation only without persisting changes. Only fields for a route that need to be changed need be provided.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicStaticRoutesUpdateManyRoutesTest() throws ApiException {
        String accountId = null;
        MagicRouteUpdateManyRequest magicRouteUpdateManyRequest = null;
        MagicMultipleRouteModifiedResponse response = api.magicStaticRoutesUpdateManyRoutes(accountId, magicRouteUpdateManyRequest);
        // TODO: test validations
    }

    /**
     * Update Route
     *
     * Update a specific Magic static route. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to run validation only without persisting changes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicStaticRoutesUpdateRouteTest() throws ApiException {
        String routeIdentifier = null;
        String accountId = null;
        MagicRouteUpdateRequest magicRouteUpdateRequest = null;
        MagicRouteModifiedResponse response = api.magicStaticRoutesUpdateRoute(routeIdentifier, accountId, magicRouteUpdateRequest);
        // TODO: test validations
    }

}