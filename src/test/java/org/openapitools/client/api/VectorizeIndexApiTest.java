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
import java.io.File;
import org.openapitools.client.model.VectorizeCreateIndexRequest;
import org.openapitools.client.model.VectorizeCreateVectorizeIndex200Response;
import org.openapitools.client.model.VectorizeDeleteVectorizeIndex200Response;
import org.openapitools.client.model.VectorizeDeleteVectorsById200Response;
import org.openapitools.client.model.VectorizeGetVectorsById200Response;
import org.openapitools.client.model.VectorizeIndexDeleteVectorsByIdRequest;
import org.openapitools.client.model.VectorizeIndexGetVectorsByIdRequest;
import org.openapitools.client.model.VectorizeIndexQueryRequest;
import org.openapitools.client.model.VectorizeInsertVector200Response;
import org.openapitools.client.model.VectorizeListVectorizeIndexes200Response;
import org.openapitools.client.model.VectorizeListVectorizeIndexes4XXResponse;
import org.openapitools.client.model.VectorizeQueryVector200Response;
import org.openapitools.client.model.VectorizeUpdateIndexRequest;
import org.openapitools.client.model.VectorizeUpsertVector200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VectorizeIndexApi
 */
@Disabled
public class VectorizeIndexApiTest {

    private final VectorizeIndexApi api = new VectorizeIndexApi();

    /**
     * Create Vectorize Index
     *
     * Creates and returns a new Vectorize Index.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void vectorizeCreateVectorizeIndexTest() throws ApiException {
        String accountId = null;
        VectorizeCreateIndexRequest vectorizeCreateIndexRequest = null;
        VectorizeCreateVectorizeIndex200Response response = api.vectorizeCreateVectorizeIndex(accountId, vectorizeCreateIndexRequest);
        // TODO: test validations
    }

    /**
     * Delete Vectorize Index
     *
     * Deletes the specified Vectorize Index.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void vectorizeDeleteVectorizeIndexTest() throws ApiException {
        String accountId = null;
        String indexName = null;
        VectorizeDeleteVectorizeIndex200Response response = api.vectorizeDeleteVectorizeIndex(accountId, indexName);
        // TODO: test validations
    }

    /**
     * Delete Vectors By Identifier
     *
     * Delete a set of vectors from an index by their vector identifiers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void vectorizeDeleteVectorsByIdTest() throws ApiException {
        String accountId = null;
        String indexName = null;
        VectorizeIndexDeleteVectorsByIdRequest vectorizeIndexDeleteVectorsByIdRequest = null;
        VectorizeDeleteVectorsById200Response response = api.vectorizeDeleteVectorsById(accountId, indexName, vectorizeIndexDeleteVectorsByIdRequest);
        // TODO: test validations
    }

    /**
     * Get Vectorize Index
     *
     * Returns the specified Vectorize Index.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void vectorizeGetVectorizeIndexTest() throws ApiException {
        String accountId = null;
        String indexName = null;
        VectorizeCreateVectorizeIndex200Response response = api.vectorizeGetVectorizeIndex(accountId, indexName);
        // TODO: test validations
    }

    /**
     * Get Vectors By Identifier
     *
     * Get a set of vectors from an index by their vector identifiers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void vectorizeGetVectorsByIdTest() throws ApiException {
        String accountId = null;
        String indexName = null;
        VectorizeIndexGetVectorsByIdRequest vectorizeIndexGetVectorsByIdRequest = null;
        VectorizeGetVectorsById200Response response = api.vectorizeGetVectorsById(accountId, indexName, vectorizeIndexGetVectorsByIdRequest);
        // TODO: test validations
    }

    /**
     * Insert Vectors
     *
     * Inserts vectors into the specified index and returns the count of the vectors successfully inserted.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void vectorizeInsertVectorTest() throws ApiException {
        String accountId = null;
        String indexName = null;
        File body = null;
        VectorizeInsertVector200Response response = api.vectorizeInsertVector(accountId, indexName, body);
        // TODO: test validations
    }

    /**
     * List Vectorize Indexes
     *
     * Returns a list of Vectorize Indexes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void vectorizeListVectorizeIndexesTest() throws ApiException {
        String accountId = null;
        VectorizeListVectorizeIndexes200Response response = api.vectorizeListVectorizeIndexes(accountId);
        // TODO: test validations
    }

    /**
     * Query Vectors
     *
     * Finds vectors closest to a given vector in an index.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void vectorizeQueryVectorTest() throws ApiException {
        String accountId = null;
        String indexName = null;
        VectorizeIndexQueryRequest vectorizeIndexQueryRequest = null;
        VectorizeQueryVector200Response response = api.vectorizeQueryVector(accountId, indexName, vectorizeIndexQueryRequest);
        // TODO: test validations
    }

    /**
     * Update Vectorize Index
     *
     * Updates and returns the specified Vectorize Index.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void vectorizeUpdateVectorizeIndexTest() throws ApiException {
        String accountId = null;
        String indexName = null;
        VectorizeUpdateIndexRequest vectorizeUpdateIndexRequest = null;
        VectorizeCreateVectorizeIndex200Response response = api.vectorizeUpdateVectorizeIndex(accountId, indexName, vectorizeUpdateIndexRequest);
        // TODO: test validations
    }

    /**
     * Upsert Vectors
     *
     * Upserts vectors into the specified index, creating them if they do not exist and returns the count of values and ids successfully inserted.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void vectorizeUpsertVectorTest() throws ApiException {
        String accountId = null;
        String indexName = null;
        File body = null;
        VectorizeUpsertVector200Response response = api.vectorizeUpsertVector(accountId, indexName, body);
        // TODO: test validations
    }

}