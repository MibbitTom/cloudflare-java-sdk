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
import java.math.BigDecimal;
import org.openapitools.client.model.WorkersKvApiResponseSingle;
import org.openapitools.client.model.WorkersKvBulkWriteInner;
import org.openapitools.client.model.WorkersKvCreateRenameNamespaceBody;
import org.openapitools.client.model.WorkersKvNamespaceCreateANamespace200Response;
import org.openapitools.client.model.WorkersKvNamespaceCreateANamespace4XXResponse;
import org.openapitools.client.model.WorkersKvNamespaceListANamespaceSKeys200Response;
import org.openapitools.client.model.WorkersKvNamespaceListANamespaceSKeys4XXResponse;
import org.openapitools.client.model.WorkersKvNamespaceListNamespaces200Response;
import org.openapitools.client.model.WorkersKvNamespaceListNamespaces4XXResponse;
import org.openapitools.client.model.WorkersKvNamespaceReadKeyValuePair4XXResponse;
import org.openapitools.client.model.WorkersKvNamespaceReadTheMetadataForAKey200Response;
import org.openapitools.client.model.WorkersKvNamespaceReadTheMetadataForAKey4XXResponse;
import org.openapitools.client.model.WorkersKvNamespaceRenameANamespace4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkersKvNamespaceApi
 */
@Disabled
public class WorkersKvNamespaceApiTest {

    private final WorkersKvNamespaceApi api = new WorkersKvNamespaceApi();

    /**
     * Create a Namespace
     *
     * Creates a namespace under the given title. A &#x60;400&#x60; is returned if the account already owns a namespace with this title. A namespace must be explicitly deleted to be replaced.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersKvNamespaceCreateANamespaceTest() throws ApiException {
        String accountId = null;
        WorkersKvCreateRenameNamespaceBody workersKvCreateRenameNamespaceBody = null;
        WorkersKvNamespaceCreateANamespace200Response response = api.workersKvNamespaceCreateANamespace(accountId, workersKvCreateRenameNamespaceBody);
        // TODO: test validations
    }

    /**
     * Delete key-value pair
     *
     * Remove a KV pair from the namespace. Use URL-encoding to use special characters (for example, &#x60;:&#x60;, &#x60;!&#x60;, &#x60;%&#x60;) in the key name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersKvNamespaceDeleteKeyValuePairTest() throws ApiException {
        String keyName = null;
        String namespaceId = null;
        String accountId = null;
        WorkersKvApiResponseSingle response = api.workersKvNamespaceDeleteKeyValuePair(keyName, namespaceId, accountId);
        // TODO: test validations
    }

    /**
     * Delete multiple key-value pairs
     *
     * Remove multiple KV pairs from the namespace. Body should be an array of up to 10,000 keys to be removed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersKvNamespaceDeleteMultipleKeyValuePairsTest() throws ApiException {
        String namespaceId = null;
        String accountId = null;
        List<String> requestBody = null;
        WorkersKvApiResponseSingle response = api.workersKvNamespaceDeleteMultipleKeyValuePairs(namespaceId, accountId, requestBody);
        // TODO: test validations
    }

    /**
     * List a Namespace&#39;s Keys
     *
     * Lists a namespace&#39;s keys.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersKvNamespaceListANamespaceSKeysTest() throws ApiException {
        String namespaceId = null;
        String accountId = null;
        BigDecimal limit = null;
        String prefix = null;
        String cursor = null;
        WorkersKvNamespaceListANamespaceSKeys200Response response = api.workersKvNamespaceListANamespaceSKeys(namespaceId, accountId, limit, prefix, cursor);
        // TODO: test validations
    }

    /**
     * List Namespaces
     *
     * Returns the namespaces owned by an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersKvNamespaceListNamespacesTest() throws ApiException {
        String accountId = null;
        BigDecimal page = null;
        BigDecimal perPage = null;
        String order = null;
        String direction = null;
        WorkersKvNamespaceListNamespaces200Response response = api.workersKvNamespaceListNamespaces(accountId, page, perPage, order, direction);
        // TODO: test validations
    }

    /**
     * Read key-value pair
     *
     * Returns the value associated with the given key in the given namespace. Use URL-encoding to use special characters (for example, &#x60;:&#x60;, &#x60;!&#x60;, &#x60;%&#x60;) in the key name. If the KV-pair is set to expire at some point, the expiration time as measured in seconds since the UNIX epoch will be returned in the &#x60;expiration&#x60; response header.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersKvNamespaceReadKeyValuePairTest() throws ApiException {
        String keyName = null;
        String namespaceId = null;
        String accountId = null;
        String response = api.workersKvNamespaceReadKeyValuePair(keyName, namespaceId, accountId);
        // TODO: test validations
    }

    /**
     * Read the metadata for a key
     *
     * Returns the metadata associated with the given key in the given namespace. Use URL-encoding to use special characters (for example, &#x60;:&#x60;, &#x60;!&#x60;, &#x60;%&#x60;) in the key name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersKvNamespaceReadTheMetadataForAKeyTest() throws ApiException {
        String keyName = null;
        String namespaceId = null;
        String accountId = null;
        WorkersKvNamespaceReadTheMetadataForAKey200Response response = api.workersKvNamespaceReadTheMetadataForAKey(keyName, namespaceId, accountId);
        // TODO: test validations
    }

    /**
     * Remove a Namespace
     *
     * Deletes the namespace corresponding to the given ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersKvNamespaceRemoveANamespaceTest() throws ApiException {
        String namespaceId = null;
        String accountId = null;
        WorkersKvApiResponseSingle response = api.workersKvNamespaceRemoveANamespace(namespaceId, accountId);
        // TODO: test validations
    }

    /**
     * Rename a Namespace
     *
     * Modifies a namespace&#39;s title.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersKvNamespaceRenameANamespaceTest() throws ApiException {
        String namespaceId = null;
        String accountId = null;
        WorkersKvCreateRenameNamespaceBody workersKvCreateRenameNamespaceBody = null;
        WorkersKvApiResponseSingle response = api.workersKvNamespaceRenameANamespace(namespaceId, accountId, workersKvCreateRenameNamespaceBody);
        // TODO: test validations
    }

    /**
     * Write key-value pair with metadata
     *
     * Write a value identified by a key. Use URL-encoding to use special characters (for example, &#x60;:&#x60;, &#x60;!&#x60;, &#x60;%&#x60;) in the key name. Body should be the value to be stored along with JSON metadata to be associated with the key/value pair. Existing values, expirations, and metadata will be overwritten. If neither &#x60;expiration&#x60; nor &#x60;expiration_ttl&#x60; is specified, the key-value pair will never expire. If both are set, &#x60;expiration_ttl&#x60; is used and &#x60;expiration&#x60; is ignored.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersKvNamespaceWriteKeyValuePairWithMetadataTest() throws ApiException {
        String keyName = null;
        String namespaceId = null;
        String accountId = null;
        String metadata = null;
        String value = null;
        WorkersKvApiResponseSingle response = api.workersKvNamespaceWriteKeyValuePairWithMetadata(keyName, namespaceId, accountId, metadata, value);
        // TODO: test validations
    }

    /**
     * Write multiple key-value pairs
     *
     * Write multiple keys and values at once. Body should be an array of up to 10,000 key-value pairs to be stored, along with optional expiration information. Existing values and expirations will be overwritten. If neither &#x60;expiration&#x60; nor &#x60;expiration_ttl&#x60; is specified, the key-value pair will never expire. If both are set, &#x60;expiration_ttl&#x60; is used and &#x60;expiration&#x60; is ignored. The entire request size must be 100 megabytes or less.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersKvNamespaceWriteMultipleKeyValuePairsTest() throws ApiException {
        String namespaceId = null;
        String accountId = null;
        List<WorkersKvBulkWriteInner> workersKvBulkWriteInner = null;
        WorkersKvApiResponseSingle response = api.workersKvNamespaceWriteMultipleKeyValuePairs(namespaceId, accountId, workersKvBulkWriteInner);
        // TODO: test validations
    }

}
