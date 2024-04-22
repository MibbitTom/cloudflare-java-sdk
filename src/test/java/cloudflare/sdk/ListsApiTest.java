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
import cloudflare.sdk.models.ListsBulkOperationResponseCollection;
import cloudflare.sdk.models.ListsCreateAList4XXResponse;
import cloudflare.sdk.models.ListsCreateAListRequest;
import cloudflare.sdk.models.ListsDeleteAList4XXResponse;
import cloudflare.sdk.models.ListsDeleteListItemsRequest;
import cloudflare.sdk.models.ListsGetAListItem4XXResponse;
import cloudflare.sdk.models.ListsGetBulkOperationStatus4XXResponse;
import cloudflare.sdk.models.ListsGetListItems4XXResponse;
import cloudflare.sdk.models.ListsGetLists4XXResponse;
import cloudflare.sdk.models.ListsItemResponseCollection;
import cloudflare.sdk.models.ListsItemsListResponseCollection;
import cloudflare.sdk.models.ListsItemsUpdateRequestCollectionInner;
import cloudflare.sdk.models.ListsListDeleteResponseCollection;
import cloudflare.sdk.models.ListsListResponseCollection;
import cloudflare.sdk.models.ListsListsAsyncResponse;
import cloudflare.sdk.models.ListsListsResponseCollection;
import cloudflare.sdk.models.ListsUpdateAListRequest;
import cloudflare.sdk.models.ListsUpdateAllListItems4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ListsApi
 */
@Disabled
public class ListsApiTest {

    private final ListsApi api = new ListsApi();

    /**
     * Create a list
     *
     * Creates a new list of the specified type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listsCreateAListTest() throws ApiException {
        String accountId = null;
        ListsCreateAListRequest listsCreateAListRequest = null;
        ListsListResponseCollection response = api.listsCreateAList(accountId, listsCreateAListRequest);
        // TODO: test validations
    }

    /**
     * Create list items
     *
     * Appends new items to the list.  This operation is asynchronous. To get current the operation status, invoke the [Get bulk operation status](/operations/lists-get-bulk-operation-status) endpoint with the returned &#x60;operation_id&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listsCreateListItemsTest() throws ApiException {
        String listId = null;
        String accountId = null;
        List<ListsItemsUpdateRequestCollectionInner> listsItemsUpdateRequestCollectionInner = null;
        ListsListsAsyncResponse response = api.listsCreateListItems(listId, accountId, listsItemsUpdateRequestCollectionInner);
        // TODO: test validations
    }

    /**
     * Delete a list
     *
     * Deletes a specific list and all its items.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listsDeleteAListTest() throws ApiException {
        String listId = null;
        String accountId = null;
        ListsListDeleteResponseCollection response = api.listsDeleteAList(listId, accountId);
        // TODO: test validations
    }

    /**
     * Delete list items
     *
     * Removes one or more items from a list.  This operation is asynchronous. To get current the operation status, invoke the [Get bulk operation status](/operations/lists-get-bulk-operation-status) endpoint with the returned &#x60;operation_id&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listsDeleteListItemsTest() throws ApiException {
        String listId = null;
        String accountId = null;
        ListsDeleteListItemsRequest listsDeleteListItemsRequest = null;
        ListsListsAsyncResponse response = api.listsDeleteListItems(listId, accountId, listsDeleteListItemsRequest);
        // TODO: test validations
    }

    /**
     * Get a list
     *
     * Fetches the details of a list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listsGetAListTest() throws ApiException {
        String listId = null;
        String accountId = null;
        ListsListResponseCollection response = api.listsGetAList(listId, accountId);
        // TODO: test validations
    }

    /**
     * Get a list item
     *
     * Fetches a list item in the list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listsGetAListItemTest() throws ApiException {
        String itemId = null;
        String listId = null;
        String accountIdentifier = null;
        ListsItemResponseCollection response = api.listsGetAListItem(itemId, listId, accountIdentifier);
        // TODO: test validations
    }

    /**
     * Get bulk operation status
     *
     * Gets the current status of an asynchronous operation on a list.  The &#x60;status&#x60; property can have one of the following values: &#x60;pending&#x60;, &#x60;running&#x60;, &#x60;completed&#x60;, or &#x60;failed&#x60;. If the status is &#x60;failed&#x60;, the &#x60;error&#x60; property will contain a message describing the error.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listsGetBulkOperationStatusTest() throws ApiException {
        String operationId = null;
        String accountIdentifier = null;
        ListsBulkOperationResponseCollection response = api.listsGetBulkOperationStatus(operationId, accountIdentifier);
        // TODO: test validations
    }

    /**
     * Get list items
     *
     * Fetches all the items in the list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listsGetListItemsTest() throws ApiException {
        String listId = null;
        String accountId = null;
        String cursor = null;
        Integer perPage = null;
        String search = null;
        ListsItemsListResponseCollection response = api.listsGetListItems(listId, accountId, cursor, perPage, search);
        // TODO: test validations
    }

    /**
     * Get lists
     *
     * Fetches all lists in the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listsGetListsTest() throws ApiException {
        String accountId = null;
        ListsListsResponseCollection response = api.listsGetLists(accountId);
        // TODO: test validations
    }

    /**
     * Update a list
     *
     * Updates the description of a list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listsUpdateAListTest() throws ApiException {
        String listId = null;
        String accountId = null;
        ListsUpdateAListRequest listsUpdateAListRequest = null;
        ListsListResponseCollection response = api.listsUpdateAList(listId, accountId, listsUpdateAListRequest);
        // TODO: test validations
    }

    /**
     * Update all list items
     *
     * Removes all existing items from the list and adds the provided items to the list.  This operation is asynchronous. To get current the operation status, invoke the [Get bulk operation status](/operations/lists-get-bulk-operation-status) endpoint with the returned &#x60;operation_id&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listsUpdateAllListItemsTest() throws ApiException {
        String listId = null;
        String accountId = null;
        List<ListsItemsUpdateRequestCollectionInner> listsItemsUpdateRequestCollectionInner = null;
        ListsListsAsyncResponse response = api.listsUpdateAllListItems(listId, accountId, listsItemsUpdateRequestCollectionInner);
        // TODO: test validations
    }

}
