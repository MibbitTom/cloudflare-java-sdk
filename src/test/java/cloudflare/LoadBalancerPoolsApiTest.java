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
import org.openapitools.client.model.AccountLoadBalancerMonitorsCreateMonitorRequest;
import org.openapitools.client.model.AccountLoadBalancerMonitorsPreviewMonitor4XXResponse;
import org.openapitools.client.model.AccountLoadBalancerPoolsCreatePool4XXResponse;
import org.openapitools.client.model.AccountLoadBalancerPoolsDeletePool4XXResponse;
import org.openapitools.client.model.AccountLoadBalancerPoolsListPoolReferences4XXResponse;
import org.openapitools.client.model.AccountLoadBalancerPoolsListPools4XXResponse;
import org.openapitools.client.model.AccountLoadBalancerPoolsPatchPoolRequest;
import org.openapitools.client.model.AccountLoadBalancerPoolsPatchPoolsRequest;
import org.openapitools.client.model.AccountLoadBalancerPoolsPoolHealthDetails4XXResponse;
import org.openapitools.client.model.AccountLoadBalancerPoolsUpdatePoolRequest;
import org.openapitools.client.model.LoadBalancerPoolsCreatePoolRequest;
import org.openapitools.client.model.LoadBalancingHealthDetails;
import org.openapitools.client.model.LoadBalancingPreviewResponse;
import org.openapitools.client.model.LoadBalancingSchemasIdResponse;
import org.openapitools.client.model.LoadBalancingSchemasReferencesResponse;
import org.openapitools.client.model.LoadBalancingSchemasResponseCollection;
import org.openapitools.client.model.LoadBalancingSchemasSingleResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoadBalancerPoolsApi
 */
@Disabled
public class LoadBalancerPoolsApiTest {

    private final LoadBalancerPoolsApi api = new LoadBalancerPoolsApi();

    /**
     * Create Pool
     *
     * Create a new pool.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancerPoolsCreatePoolTest() throws ApiException {
        LoadBalancerPoolsCreatePoolRequest loadBalancerPoolsCreatePoolRequest = null;
        LoadBalancingSchemasSingleResponse response = api.loadBalancerPoolsCreatePool(loadBalancerPoolsCreatePoolRequest);
        // TODO: test validations
    }

    /**
     * Delete Pool
     *
     * Delete a configured pool.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancerPoolsDeletePoolTest() throws ApiException {
        String poolId = null;
        LoadBalancingSchemasIdResponse response = api.loadBalancerPoolsDeletePool(poolId);
        // TODO: test validations
    }

    /**
     * List Pool References
     *
     * Get the list of resources that reference the provided pool.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancerPoolsListPoolReferencesTest() throws ApiException {
        String poolId = null;
        LoadBalancingSchemasReferencesResponse response = api.loadBalancerPoolsListPoolReferences(poolId);
        // TODO: test validations
    }

    /**
     * List Pools
     *
     * List configured pools.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancerPoolsListPoolsTest() throws ApiException {
        Object monitor = null;
        LoadBalancingSchemasResponseCollection response = api.loadBalancerPoolsListPools(monitor);
        // TODO: test validations
    }

    /**
     * Patch Pool
     *
     * Apply changes to an existing pool, overwriting the supplied properties.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancerPoolsPatchPoolTest() throws ApiException {
        String poolId = null;
        AccountLoadBalancerPoolsPatchPoolRequest accountLoadBalancerPoolsPatchPoolRequest = null;
        LoadBalancingSchemasSingleResponse response = api.loadBalancerPoolsPatchPool(poolId, accountLoadBalancerPoolsPatchPoolRequest);
        // TODO: test validations
    }

    /**
     * Patch Pools
     *
     * Apply changes to a number of existing pools, overwriting the supplied properties. Pools are ordered by ascending &#x60;name&#x60;. Returns the list of affected pools. Supports the standard pagination query parameters, either &#x60;limit&#x60;/&#x60;offset&#x60; or &#x60;per_page&#x60;/&#x60;page&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancerPoolsPatchPoolsTest() throws ApiException {
        AccountLoadBalancerPoolsPatchPoolsRequest accountLoadBalancerPoolsPatchPoolsRequest = null;
        LoadBalancingSchemasResponseCollection response = api.loadBalancerPoolsPatchPools(accountLoadBalancerPoolsPatchPoolsRequest);
        // TODO: test validations
    }

    /**
     * Pool Details
     *
     * Fetch a single configured pool.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancerPoolsPoolDetailsTest() throws ApiException {
        String poolId = null;
        LoadBalancingSchemasSingleResponse response = api.loadBalancerPoolsPoolDetails(poolId);
        // TODO: test validations
    }

    /**
     * Pool Health Details
     *
     * Fetch the latest pool health status for a single pool.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancerPoolsPoolHealthDetailsTest() throws ApiException {
        String poolId = null;
        LoadBalancingHealthDetails response = api.loadBalancerPoolsPoolHealthDetails(poolId);
        // TODO: test validations
    }

    /**
     * Preview Pool
     *
     * Preview pool health using provided monitor details. The returned preview_id can be used in the preview endpoint to retrieve the results.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancerPoolsPreviewPoolTest() throws ApiException {
        String poolId = null;
        AccountLoadBalancerMonitorsCreateMonitorRequest accountLoadBalancerMonitorsCreateMonitorRequest = null;
        LoadBalancingPreviewResponse response = api.loadBalancerPoolsPreviewPool(poolId, accountLoadBalancerMonitorsCreateMonitorRequest);
        // TODO: test validations
    }

    /**
     * Update Pool
     *
     * Modify a configured pool.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancerPoolsUpdatePoolTest() throws ApiException {
        String poolId = null;
        AccountLoadBalancerPoolsUpdatePoolRequest accountLoadBalancerPoolsUpdatePoolRequest = null;
        LoadBalancingSchemasSingleResponse response = api.loadBalancerPoolsUpdatePool(poolId, accountLoadBalancerPoolsUpdatePoolRequest);
        // TODO: test validations
    }

}
