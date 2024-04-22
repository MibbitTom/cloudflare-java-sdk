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
import org.openapitools.client.model.SecondaryDnsAclDeleteAcl4XXResponse;
import org.openapitools.client.model.SecondaryDnsComponentsSchemasIdResponse;
import org.openapitools.client.model.SecondaryDnsPeer;
import org.openapitools.client.model.SecondaryDnsPeerCreatePeer4XXResponse;
import org.openapitools.client.model.SecondaryDnsPeerListPeers4XXResponse;
import org.openapitools.client.model.SecondaryDnsSchemasResponseCollection;
import org.openapitools.client.model.SecondaryDnsSchemasSingleResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecondaryDnsPeerApi
 */
@Disabled
public class SecondaryDnsPeerApiTest {

    private final SecondaryDnsPeerApi api = new SecondaryDnsPeerApi();

    /**
     * Create Peer
     *
     * Create Peer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void secondaryDnsPeerCreatePeerTest() throws ApiException {
        Object accountId = null;
        Object body = null;
        SecondaryDnsSchemasSingleResponse response = api.secondaryDnsPeerCreatePeer(accountId, body);
        // TODO: test validations
    }

    /**
     * Delete Peer
     *
     * Delete Peer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void secondaryDnsPeerDeletePeerTest() throws ApiException {
        Object peerId = null;
        Object accountId = null;
        SecondaryDnsComponentsSchemasIdResponse response = api.secondaryDnsPeerDeletePeer(peerId, accountId);
        // TODO: test validations
    }

    /**
     * List Peers
     *
     * List Peers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void secondaryDnsPeerListPeersTest() throws ApiException {
        Object accountId = null;
        SecondaryDnsSchemasResponseCollection response = api.secondaryDnsPeerListPeers(accountId);
        // TODO: test validations
    }

    /**
     * Peer Details
     *
     * Get Peer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void secondaryDnsPeerPeerDetailsTest() throws ApiException {
        Object peerId = null;
        Object accountId = null;
        SecondaryDnsSchemasSingleResponse response = api.secondaryDnsPeerPeerDetails(peerId, accountId);
        // TODO: test validations
    }

    /**
     * Update Peer
     *
     * Modify Peer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void secondaryDnsPeerUpdatePeerTest() throws ApiException {
        Object peerId = null;
        Object accountId = null;
        SecondaryDnsPeer secondaryDnsPeer = null;
        SecondaryDnsSchemasSingleResponse response = api.secondaryDnsPeerUpdatePeer(peerId, accountId, secondaryDnsPeer);
        // TODO: test validations
    }

}
