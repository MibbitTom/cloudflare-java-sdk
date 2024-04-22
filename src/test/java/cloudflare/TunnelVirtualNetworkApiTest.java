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
import org.openapitools.client.model.TunnelVirtualNetworkCreateAVirtualNetwork4XXResponse;
import org.openapitools.client.model.TunnelVirtualNetworkCreateAVirtualNetworkRequest;
import org.openapitools.client.model.TunnelVirtualNetworkListVirtualNetworks4XXResponse;
import org.openapitools.client.model.TunnelVirtualNetworkUpdateAVirtualNetworkRequest;
import org.openapitools.client.model.TunnelVnetResponseCollection;
import org.openapitools.client.model.TunnelVnetResponseSingle;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TunnelVirtualNetworkApi
 */
@Disabled
public class TunnelVirtualNetworkApiTest {

    private final TunnelVirtualNetworkApi api = new TunnelVirtualNetworkApi();

    /**
     * Create a virtual network
     *
     * Adds a new virtual network to an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tunnelVirtualNetworkCreateAVirtualNetworkTest() throws ApiException {
        String accountId = null;
        TunnelVirtualNetworkCreateAVirtualNetworkRequest tunnelVirtualNetworkCreateAVirtualNetworkRequest = null;
        TunnelVnetResponseSingle response = api.tunnelVirtualNetworkCreateAVirtualNetwork(accountId, tunnelVirtualNetworkCreateAVirtualNetworkRequest);
        // TODO: test validations
    }

    /**
     * Delete a virtual network
     *
     * Deletes an existing virtual network.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tunnelVirtualNetworkDeleteAVirtualNetworkTest() throws ApiException {
        String virtualNetworkId = null;
        String accountId = null;
        TunnelVnetResponseSingle response = api.tunnelVirtualNetworkDeleteAVirtualNetwork(virtualNetworkId, accountId);
        // TODO: test validations
    }

    /**
     * List virtual networks
     *
     * Lists and filters virtual networks in an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tunnelVirtualNetworkListVirtualNetworksTest() throws ApiException {
        String accountId = null;
        String name = null;
        Object isDefault = null;
        Object isDeleted = null;
        String vnetName = null;
        String vnetId = null;
        TunnelVnetResponseCollection response = api.tunnelVirtualNetworkListVirtualNetworks(accountId, name, isDefault, isDeleted, vnetName, vnetId);
        // TODO: test validations
    }

    /**
     * Update a virtual network
     *
     * Updates an existing virtual network.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tunnelVirtualNetworkUpdateAVirtualNetworkTest() throws ApiException {
        String virtualNetworkId = null;
        String accountId = null;
        TunnelVirtualNetworkUpdateAVirtualNetworkRequest tunnelVirtualNetworkUpdateAVirtualNetworkRequest = null;
        TunnelVnetResponseSingle response = api.tunnelVirtualNetworkUpdateAVirtualNetwork(virtualNetworkId, accountId, tunnelVirtualNetworkUpdateAVirtualNetworkRequest);
        // TODO: test validations
    }

}
