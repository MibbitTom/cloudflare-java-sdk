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
import org.openapitools.client.model.LoadBalancerRegionsGetRegion4XXResponse;
import org.openapitools.client.model.LoadBalancerRegionsListRegions4XXResponse;
import org.openapitools.client.model.LoadBalancingComponentsSchemasSingleResponse;
import org.openapitools.client.model.LoadBalancingRegionCode;
import org.openapitools.client.model.LoadBalancingRegionComponentsSchemasResponseCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoadBalancerRegionsApi
 */
@Disabled
public class LoadBalancerRegionsApiTest {

    private final LoadBalancerRegionsApi api = new LoadBalancerRegionsApi();

    /**
     * Get Region
     *
     * Get a single region mapping.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancerRegionsGetRegionTest() throws ApiException {
        LoadBalancingRegionCode regionId = null;
        String accountId = null;
        LoadBalancingComponentsSchemasSingleResponse response = api.loadBalancerRegionsGetRegion(regionId, accountId);
        // TODO: test validations
    }

    /**
     * List Regions
     *
     * List all region mappings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancerRegionsListRegionsTest() throws ApiException {
        String accountId = null;
        String subdivisionCode = null;
        String subdivisionCodeA2 = null;
        String countryCodeA2 = null;
        LoadBalancingRegionComponentsSchemasResponseCollection response = api.loadBalancerRegionsListRegions(accountId, subdivisionCode, subdivisionCodeA2, countryCodeA2);
        // TODO: test validations
    }

}