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
import org.openapitools.client.model.ZeroTrustGatewayEmptyResponse;
import org.openapitools.client.model.ZeroTrustGatewayListItemResponseCollection;
import org.openapitools.client.model.ZeroTrustGatewayResponseCollection;
import org.openapitools.client.model.ZeroTrustGatewaySingleResponse;
import org.openapitools.client.model.ZeroTrustGatewaySingleResponseWithListItems;
import org.openapitools.client.model.ZeroTrustListsCreateZeroTrustList4XXResponse;
import org.openapitools.client.model.ZeroTrustListsCreateZeroTrustListRequest;
import org.openapitools.client.model.ZeroTrustListsDeleteZeroTrustList4XXResponse;
import org.openapitools.client.model.ZeroTrustListsListZeroTrustLists4XXResponse;
import org.openapitools.client.model.ZeroTrustListsPatchZeroTrustListRequest;
import org.openapitools.client.model.ZeroTrustListsUpdateZeroTrustListRequest;
import org.openapitools.client.model.ZeroTrustListsZeroTrustListDetails4XXResponse;
import org.openapitools.client.model.ZeroTrustListsZeroTrustListItems4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ZeroTrustListsApi
 */
@Disabled
public class ZeroTrustListsApiTest {

    private final ZeroTrustListsApi api = new ZeroTrustListsApi();

    /**
     * Create Zero Trust list
     *
     * Creates a new Zero Trust list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustListsCreateZeroTrustListTest() throws ApiException {
        Object accountId = null;
        ZeroTrustListsCreateZeroTrustListRequest zeroTrustListsCreateZeroTrustListRequest = null;
        ZeroTrustGatewaySingleResponseWithListItems response = api.zeroTrustListsCreateZeroTrustList(accountId, zeroTrustListsCreateZeroTrustListRequest);
        // TODO: test validations
    }

    /**
     * Delete Zero Trust list
     *
     * Deletes a Zero Trust list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustListsDeleteZeroTrustListTest() throws ApiException {
        String listId = null;
        Object accountId = null;
        ZeroTrustGatewayEmptyResponse response = api.zeroTrustListsDeleteZeroTrustList(listId, accountId);
        // TODO: test validations
    }

    /**
     * List Zero Trust lists
     *
     * Fetches all Zero Trust lists for an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustListsListZeroTrustListsTest() throws ApiException {
        Object accountId = null;
        ZeroTrustGatewayResponseCollection response = api.zeroTrustListsListZeroTrustLists(accountId);
        // TODO: test validations
    }

    /**
     * Patch Zero Trust list
     *
     * Appends or removes an item from a configured Zero Trust list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustListsPatchZeroTrustListTest() throws ApiException {
        String listId = null;
        Object accountId = null;
        ZeroTrustListsPatchZeroTrustListRequest zeroTrustListsPatchZeroTrustListRequest = null;
        ZeroTrustGatewaySingleResponse response = api.zeroTrustListsPatchZeroTrustList(listId, accountId, zeroTrustListsPatchZeroTrustListRequest);
        // TODO: test validations
    }

    /**
     * Update Zero Trust list
     *
     * Updates a configured Zero Trust list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustListsUpdateZeroTrustListTest() throws ApiException {
        String listId = null;
        Object accountId = null;
        ZeroTrustListsUpdateZeroTrustListRequest zeroTrustListsUpdateZeroTrustListRequest = null;
        ZeroTrustGatewaySingleResponse response = api.zeroTrustListsUpdateZeroTrustList(listId, accountId, zeroTrustListsUpdateZeroTrustListRequest);
        // TODO: test validations
    }

    /**
     * Get Zero Trust list details
     *
     * Fetches a single Zero Trust list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustListsZeroTrustListDetailsTest() throws ApiException {
        String listId = null;
        Object accountId = null;
        ZeroTrustGatewaySingleResponse response = api.zeroTrustListsZeroTrustListDetails(listId, accountId);
        // TODO: test validations
    }

    /**
     * Get Zero Trust list items
     *
     * Fetches all items in a single Zero Trust list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustListsZeroTrustListItemsTest() throws ApiException {
        String listId = null;
        Object accountId = null;
        ZeroTrustGatewayListItemResponseCollection response = api.zeroTrustListsZeroTrustListItems(listId, accountId);
        // TODO: test validations
    }

}
