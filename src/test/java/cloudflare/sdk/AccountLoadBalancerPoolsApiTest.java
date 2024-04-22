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
import cloudflare.sdk.models.AccountLoadBalancerMonitorsCreateMonitorRequest;
import cloudflare.sdk.models.AccountLoadBalancerMonitorsPreviewMonitor4XXResponse;
import cloudflare.sdk.models.AccountLoadBalancerPoolsCreatePool4XXResponse;
import cloudflare.sdk.models.AccountLoadBalancerPoolsCreatePoolRequest;
import cloudflare.sdk.models.AccountLoadBalancerPoolsDeletePool4XXResponse;
import cloudflare.sdk.models.AccountLoadBalancerPoolsListPoolReferences4XXResponse;
import cloudflare.sdk.models.AccountLoadBalancerPoolsListPools4XXResponse;
import cloudflare.sdk.models.AccountLoadBalancerPoolsPatchPoolRequest;
import cloudflare.sdk.models.AccountLoadBalancerPoolsPatchPoolsRequest;
import cloudflare.sdk.models.AccountLoadBalancerPoolsPoolHealthDetails4XXResponse;
import cloudflare.sdk.models.AccountLoadBalancerPoolsUpdatePoolRequest;
import cloudflare.sdk.models.LoadBalancingHealthDetails;
import cloudflare.sdk.models.LoadBalancingPreviewResponse;
import cloudflare.sdk.models.LoadBalancingSchemasIdResponse;
import cloudflare.sdk.models.LoadBalancingSchemasReferencesResponse;
import cloudflare.sdk.models.LoadBalancingSchemasResponseCollection;
import cloudflare.sdk.models.LoadBalancingSchemasSingleResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountLoadBalancerPoolsApi
 */
@Disabled
public class AccountLoadBalancerPoolsApiTest {

    private final AccountLoadBalancerPoolsApi api = new AccountLoadBalancerPoolsApi();

    /**
     * Create Pool
     *
     * Create a new pool.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accountLoadBalancerPoolsCreatePoolTest() throws ApiException {
        String accountId = null;
        AccountLoadBalancerPoolsCreatePoolRequest accountLoadBalancerPoolsCreatePoolRequest = null;
        LoadBalancingSchemasSingleResponse response = api.accountLoadBalancerPoolsCreatePool(accountId, accountLoadBalancerPoolsCreatePoolRequest);
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
    public void accountLoadBalancerPoolsDeletePoolTest() throws ApiException {
        String poolId = null;
        String accountId = null;
        LoadBalancingSchemasIdResponse response = api.accountLoadBalancerPoolsDeletePool(poolId, accountId);
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
    public void accountLoadBalancerPoolsListPoolReferencesTest() throws ApiException {
        String poolId = null;
        String accountId = null;
        LoadBalancingSchemasReferencesResponse response = api.accountLoadBalancerPoolsListPoolReferences(poolId, accountId);
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
    public void accountLoadBalancerPoolsListPoolsTest() throws ApiException {
        String accountId = null;
        Object monitor = null;
        LoadBalancingSchemasResponseCollection response = api.accountLoadBalancerPoolsListPools(accountId, monitor);
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
    public void accountLoadBalancerPoolsPatchPoolTest() throws ApiException {
        String poolId = null;
        String accountId = null;
        AccountLoadBalancerPoolsPatchPoolRequest accountLoadBalancerPoolsPatchPoolRequest = null;
        LoadBalancingSchemasSingleResponse response = api.accountLoadBalancerPoolsPatchPool(poolId, accountId, accountLoadBalancerPoolsPatchPoolRequest);
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
    public void accountLoadBalancerPoolsPatchPoolsTest() throws ApiException {
        String accountId = null;
        AccountLoadBalancerPoolsPatchPoolsRequest accountLoadBalancerPoolsPatchPoolsRequest = null;
        LoadBalancingSchemasResponseCollection response = api.accountLoadBalancerPoolsPatchPools(accountId, accountLoadBalancerPoolsPatchPoolsRequest);
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
    public void accountLoadBalancerPoolsPoolDetailsTest() throws ApiException {
        String poolId = null;
        String accountId = null;
        LoadBalancingSchemasSingleResponse response = api.accountLoadBalancerPoolsPoolDetails(poolId, accountId);
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
    public void accountLoadBalancerPoolsPoolHealthDetailsTest() throws ApiException {
        String poolId = null;
        String accountId = null;
        LoadBalancingHealthDetails response = api.accountLoadBalancerPoolsPoolHealthDetails(poolId, accountId);
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
    public void accountLoadBalancerPoolsPreviewPoolTest() throws ApiException {
        String poolId = null;
        String accountId = null;
        AccountLoadBalancerMonitorsCreateMonitorRequest accountLoadBalancerMonitorsCreateMonitorRequest = null;
        LoadBalancingPreviewResponse response = api.accountLoadBalancerPoolsPreviewPool(poolId, accountId, accountLoadBalancerMonitorsCreateMonitorRequest);
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
    public void accountLoadBalancerPoolsUpdatePoolTest() throws ApiException {
        String poolId = null;
        String accountId = null;
        AccountLoadBalancerPoolsUpdatePoolRequest accountLoadBalancerPoolsUpdatePoolRequest = null;
        LoadBalancingSchemasSingleResponse response = api.accountLoadBalancerPoolsUpdatePool(poolId, accountId, accountLoadBalancerPoolsUpdatePoolRequest);
        // TODO: test validations
    }

}
