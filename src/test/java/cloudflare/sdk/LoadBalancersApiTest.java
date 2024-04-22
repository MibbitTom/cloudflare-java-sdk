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
import cloudflare.sdk.models.LoadBalancersCreateLoadBalancer4XXResponse;
import cloudflare.sdk.models.LoadBalancersCreateLoadBalancerRequest;
import cloudflare.sdk.models.LoadBalancersDeleteLoadBalancer4XXResponse;
import cloudflare.sdk.models.LoadBalancersListLoadBalancers4XXResponse;
import cloudflare.sdk.models.LoadBalancersPatchLoadBalancerRequest;
import cloudflare.sdk.models.LoadBalancersUpdateLoadBalancerRequest;
import cloudflare.sdk.models.LoadBalancingComponentsSchemasIdResponse;
import cloudflare.sdk.models.LoadBalancingLoadBalancerComponentsSchemasResponseCollection;
import cloudflare.sdk.models.LoadBalancingLoadBalancerComponentsSchemasSingleResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoadBalancersApi
 */
@Disabled
public class LoadBalancersApiTest {

    private final LoadBalancersApi api = new LoadBalancersApi();

    /**
     * Create Load Balancer
     *
     * Create a new load balancer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancersCreateLoadBalancerTest() throws ApiException {
        String zoneId = null;
        LoadBalancersCreateLoadBalancerRequest loadBalancersCreateLoadBalancerRequest = null;
        LoadBalancingLoadBalancerComponentsSchemasSingleResponse response = api.loadBalancersCreateLoadBalancer(zoneId, loadBalancersCreateLoadBalancerRequest);
        // TODO: test validations
    }

    /**
     * Delete Load Balancer
     *
     * Delete a configured load balancer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancersDeleteLoadBalancerTest() throws ApiException {
        String zoneId = null;
        String loadBalancerId = null;
        LoadBalancingComponentsSchemasIdResponse response = api.loadBalancersDeleteLoadBalancer(zoneId, loadBalancerId);
        // TODO: test validations
    }

    /**
     * List Load Balancers
     *
     * List configured load balancers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancersListLoadBalancersTest() throws ApiException {
        String zoneId = null;
        LoadBalancingLoadBalancerComponentsSchemasResponseCollection response = api.loadBalancersListLoadBalancers(zoneId);
        // TODO: test validations
    }

    /**
     * Load Balancer Details
     *
     * Fetch a single configured load balancer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancersLoadBalancerDetailsTest() throws ApiException {
        String zoneId = null;
        String loadBalancerId = null;
        LoadBalancingLoadBalancerComponentsSchemasSingleResponse response = api.loadBalancersLoadBalancerDetails(zoneId, loadBalancerId);
        // TODO: test validations
    }

    /**
     * Patch Load Balancer
     *
     * Apply changes to an existing load balancer, overwriting the supplied properties.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancersPatchLoadBalancerTest() throws ApiException {
        String zoneId = null;
        String loadBalancerId = null;
        LoadBalancersPatchLoadBalancerRequest loadBalancersPatchLoadBalancerRequest = null;
        LoadBalancingLoadBalancerComponentsSchemasSingleResponse response = api.loadBalancersPatchLoadBalancer(zoneId, loadBalancerId, loadBalancersPatchLoadBalancerRequest);
        // TODO: test validations
    }

    /**
     * Update Load Balancer
     *
     * Update a configured load balancer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loadBalancersUpdateLoadBalancerTest() throws ApiException {
        String zoneId = null;
        String loadBalancerId = null;
        LoadBalancersUpdateLoadBalancerRequest loadBalancersUpdateLoadBalancerRequest = null;
        LoadBalancingLoadBalancerComponentsSchemasSingleResponse response = api.loadBalancersUpdateLoadBalancer(zoneId, loadBalancerId, loadBalancersUpdateLoadBalancerRequest);
        // TODO: test validations
    }

}
