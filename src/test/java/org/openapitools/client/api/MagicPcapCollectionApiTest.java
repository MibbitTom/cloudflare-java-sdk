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
import org.openapitools.client.model.MagicPcapCollectionAddBucketsForFullPacketCapturesDefaultResponse;
import org.openapitools.client.model.MagicPcapCollectionCreatePcapRequestDefaultResponse;
import org.openapitools.client.model.MagicPcapCollectionListPacketCaptureRequestsDefaultResponse;
import org.openapitools.client.model.MagicPcapCollectionListPcaPsBucketOwnershipDefaultResponse;
import org.openapitools.client.model.MagicVisibilityPcapsCollectionResponse;
import org.openapitools.client.model.MagicVisibilityPcapsOwnershipCollection;
import org.openapitools.client.model.MagicVisibilityPcapsOwnershipRequest;
import org.openapitools.client.model.MagicVisibilityPcapsOwnershipSingleResponse;
import org.openapitools.client.model.MagicVisibilityPcapsOwnershipValidateRequest;
import org.openapitools.client.model.MagicVisibilityPcapsRequestPcap;
import org.openapitools.client.model.MagicVisibilityPcapsSingleResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MagicPcapCollectionApi
 */
@Disabled
public class MagicPcapCollectionApiTest {

    private final MagicPcapCollectionApi api = new MagicPcapCollectionApi();

    /**
     * Add buckets for full packet captures
     *
     * Adds an AWS or GCP bucket to use with full packet captures.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicPcapCollectionAddBucketsForFullPacketCapturesTest() throws ApiException {
        String accountId = null;
        MagicVisibilityPcapsOwnershipRequest magicVisibilityPcapsOwnershipRequest = null;
        MagicVisibilityPcapsOwnershipSingleResponse response = api.magicPcapCollectionAddBucketsForFullPacketCaptures(accountId, magicVisibilityPcapsOwnershipRequest);
        // TODO: test validations
    }

    /**
     * Create PCAP request
     *
     * Create new PCAP request for account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicPcapCollectionCreatePcapRequestTest() throws ApiException {
        String accountId = null;
        MagicVisibilityPcapsRequestPcap magicVisibilityPcapsRequestPcap = null;
        MagicVisibilityPcapsSingleResponse response = api.magicPcapCollectionCreatePcapRequest(accountId, magicVisibilityPcapsRequestPcap);
        // TODO: test validations
    }

    /**
     * Delete buckets for full packet captures
     *
     * Deletes buckets added to the packet captures API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicPcapCollectionDeleteBucketsForFullPacketCapturesTest() throws ApiException {
        String ownershipId = null;
        String accountId = null;
        api.magicPcapCollectionDeleteBucketsForFullPacketCaptures(ownershipId, accountId);
        // TODO: test validations
    }

    /**
     * Download Simple PCAP
     *
     * Download PCAP information into a file. Response is a binary PCAP file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicPcapCollectionDownloadSimplePcapTest() throws ApiException {
        String pcapId = null;
        String accountId = null;
        api.magicPcapCollectionDownloadSimplePcap(pcapId, accountId);
        // TODO: test validations
    }

    /**
     * Get PCAP request
     *
     * Get information for a PCAP request by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicPcapCollectionGetPcapRequestTest() throws ApiException {
        String pcapId = null;
        String accountId = null;
        MagicVisibilityPcapsSingleResponse response = api.magicPcapCollectionGetPcapRequest(pcapId, accountId);
        // TODO: test validations
    }

    /**
     * List packet capture requests
     *
     * Lists all packet capture requests for an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicPcapCollectionListPacketCaptureRequestsTest() throws ApiException {
        String accountId = null;
        MagicVisibilityPcapsCollectionResponse response = api.magicPcapCollectionListPacketCaptureRequests(accountId);
        // TODO: test validations
    }

    /**
     * List PCAPs Bucket Ownership
     *
     * List all buckets configured for use with PCAPs API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicPcapCollectionListPcaPsBucketOwnershipTest() throws ApiException {
        String accountId = null;
        MagicVisibilityPcapsOwnershipCollection response = api.magicPcapCollectionListPcaPsBucketOwnership(accountId);
        // TODO: test validations
    }

    /**
     * Validate buckets for full packet captures
     *
     * Validates buckets added to the packet captures API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicPcapCollectionValidateBucketsForFullPacketCapturesTest() throws ApiException {
        String accountId = null;
        MagicVisibilityPcapsOwnershipValidateRequest magicVisibilityPcapsOwnershipValidateRequest = null;
        MagicVisibilityPcapsOwnershipSingleResponse response = api.magicPcapCollectionValidateBucketsForFullPacketCaptures(accountId, magicVisibilityPcapsOwnershipValidateRequest);
        // TODO: test validations
    }

}