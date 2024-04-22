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
import org.openapitools.client.model.AddressingApiResponseCollection;
import org.openapitools.client.model.AddressingLoaUploadResponse;
import org.openapitools.client.model.AddressingResponseCollection;
import org.openapitools.client.model.AddressingSingleResponse;
import org.openapitools.client.model.IpAddressManagementAddressMapsDeleteAddressMap4XXResponse;
import org.openapitools.client.model.IpAddressManagementPrefixesAddPrefix4XXResponse;
import org.openapitools.client.model.IpAddressManagementPrefixesAddPrefixRequest;
import org.openapitools.client.model.IpAddressManagementPrefixesDownloadLoaDocument4XXResponse;
import org.openapitools.client.model.IpAddressManagementPrefixesListPrefixes4XXResponse;
import org.openapitools.client.model.IpAddressManagementPrefixesUpdatePrefixDescriptionRequest;
import org.openapitools.client.model.IpAddressManagementPrefixesUploadLoaDocument4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IpAddressManagementPrefixesApi
 */
@Disabled
public class IpAddressManagementPrefixesApiTest {

    private final IpAddressManagementPrefixesApi api = new IpAddressManagementPrefixesApi();

    /**
     * Add Prefix
     *
     * Add a new prefix under the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementPrefixesAddPrefixTest() throws ApiException {
        String accountId = null;
        IpAddressManagementPrefixesAddPrefixRequest ipAddressManagementPrefixesAddPrefixRequest = null;
        AddressingSingleResponse response = api.ipAddressManagementPrefixesAddPrefix(accountId, ipAddressManagementPrefixesAddPrefixRequest);
        // TODO: test validations
    }

    /**
     * Delete Prefix
     *
     * Delete an unapproved prefix owned by the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementPrefixesDeletePrefixTest() throws ApiException {
        String prefixId = null;
        String accountId = null;
        AddressingApiResponseCollection response = api.ipAddressManagementPrefixesDeletePrefix(prefixId, accountId);
        // TODO: test validations
    }

    /**
     * Download LOA Document
     *
     * Download specified LOA document under the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementPrefixesDownloadLoaDocumentTest() throws ApiException {
        String loaDocumentId = null;
        String accountId = null;
        Object response = api.ipAddressManagementPrefixesDownloadLoaDocument(loaDocumentId, accountId);
        // TODO: test validations
    }

    /**
     * List Prefixes
     *
     * List all prefixes owned by the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementPrefixesListPrefixesTest() throws ApiException {
        String accountId = null;
        AddressingResponseCollection response = api.ipAddressManagementPrefixesListPrefixes(accountId);
        // TODO: test validations
    }

    /**
     * Prefix Details
     *
     * List a particular prefix owned by the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementPrefixesPrefixDetailsTest() throws ApiException {
        String prefixId = null;
        String accountId = null;
        AddressingSingleResponse response = api.ipAddressManagementPrefixesPrefixDetails(prefixId, accountId);
        // TODO: test validations
    }

    /**
     * Update Prefix Description
     *
     * Modify the description for a prefix owned by the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementPrefixesUpdatePrefixDescriptionTest() throws ApiException {
        String prefixId = null;
        String accountId = null;
        IpAddressManagementPrefixesUpdatePrefixDescriptionRequest ipAddressManagementPrefixesUpdatePrefixDescriptionRequest = null;
        AddressingSingleResponse response = api.ipAddressManagementPrefixesUpdatePrefixDescription(prefixId, accountId, ipAddressManagementPrefixesUpdatePrefixDescriptionRequest);
        // TODO: test validations
    }

    /**
     * Upload LOA Document
     *
     * Submit LOA document (pdf format) under the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAddressManagementPrefixesUploadLoaDocumentTest() throws ApiException {
        String accountId = null;
        String loaDocument = null;
        AddressingLoaUploadResponse response = api.ipAddressManagementPrefixesUploadLoaDocument(accountId, loaDocument);
        // TODO: test validations
    }

}