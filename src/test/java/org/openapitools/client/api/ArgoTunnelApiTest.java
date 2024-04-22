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
import org.openapitools.client.model.ArgoTunnelCreateAnArgoTunnel4XXResponse;
import org.openapitools.client.model.ArgoTunnelCreateAnArgoTunnelRequest;
import org.openapitools.client.model.CloudflareTunnelCleanUpCloudflareTunnelConnections4XXResponse;
import org.openapitools.client.model.TunnelEmptyResponse;
import org.openapitools.client.model.TunnelLegacyTunnelResponseSingle;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ArgoTunnelApi
 */
@Disabled
public class ArgoTunnelApiTest {

    private final ArgoTunnelApi api = new ArgoTunnelApi();

    /**
     * Clean up Argo Tunnel connections
     *
     * Removes connections that are in a disconnected or pending reconnect state. We recommend running this command after shutting down a tunnel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void argoTunnelCleanUpArgoTunnelConnectionsTest() throws ApiException {
        String tunnelId = null;
        String accountId = null;
        Object body = null;
        TunnelEmptyResponse response = api.argoTunnelCleanUpArgoTunnelConnections(tunnelId, accountId, body);
        // TODO: test validations
    }

    /**
     * Create an Argo Tunnel
     *
     * Creates a new Argo Tunnel in an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void argoTunnelCreateAnArgoTunnelTest() throws ApiException {
        String accountId = null;
        ArgoTunnelCreateAnArgoTunnelRequest argoTunnelCreateAnArgoTunnelRequest = null;
        TunnelLegacyTunnelResponseSingle response = api.argoTunnelCreateAnArgoTunnel(accountId, argoTunnelCreateAnArgoTunnelRequest);
        // TODO: test validations
    }

    /**
     * Delete an Argo Tunnel
     *
     * Deletes an Argo Tunnel from an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void argoTunnelDeleteAnArgoTunnelTest() throws ApiException {
        String tunnelId = null;
        String accountId = null;
        Object body = null;
        TunnelLegacyTunnelResponseSingle response = api.argoTunnelDeleteAnArgoTunnel(tunnelId, accountId, body);
        // TODO: test validations
    }

    /**
     * Get an Argo Tunnel
     *
     * Fetches a single Argo Tunnel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void argoTunnelGetAnArgoTunnelTest() throws ApiException {
        String tunnelId = null;
        String accountId = null;
        TunnelLegacyTunnelResponseSingle response = api.argoTunnelGetAnArgoTunnel(tunnelId, accountId);
        // TODO: test validations
    }

}
