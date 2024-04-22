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
import java.math.BigDecimal;
import cloudflare.sdk.models.CloudflareD1CreateDatabase200Response;
import cloudflare.sdk.models.CloudflareD1CreateDatabaseRequest;
import cloudflare.sdk.models.CloudflareD1DeleteDatabase200Response;
import cloudflare.sdk.models.CloudflareD1GetDatabase200Response;
import cloudflare.sdk.models.CloudflareD1GetDatabase4XXResponse;
import cloudflare.sdk.models.CloudflareD1ListDatabases200Response;
import cloudflare.sdk.models.CloudflareD1QueryDatabase200Response;
import cloudflare.sdk.models.CloudflareD1QueryDatabaseRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for D1Api
 */
@Disabled
public class D1ApiTest {

    private final D1Api api = new D1Api();

    /**
     * Create D1 Database
     *
     * Returns the created D1 database.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cloudflareD1CreateDatabaseTest() throws ApiException {
        String accountId = null;
        CloudflareD1CreateDatabaseRequest cloudflareD1CreateDatabaseRequest = null;
        CloudflareD1CreateDatabase200Response response = api.cloudflareD1CreateDatabase(accountId, cloudflareD1CreateDatabaseRequest);
        // TODO: test validations
    }

    /**
     * Delete D1 Database
     *
     * Deletes the specified D1 database.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cloudflareD1DeleteDatabaseTest() throws ApiException {
        String accountIdentifier = null;
        String databaseIdentifier = null;
        CloudflareD1DeleteDatabase200Response response = api.cloudflareD1DeleteDatabase(accountIdentifier, databaseIdentifier);
        // TODO: test validations
    }

    /**
     * Get D1 Database
     *
     * Returns the specified D1 database.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cloudflareD1GetDatabaseTest() throws ApiException {
        String accountIdentifier = null;
        String databaseIdentifier = null;
        CloudflareD1GetDatabase200Response response = api.cloudflareD1GetDatabase(accountIdentifier, databaseIdentifier);
        // TODO: test validations
    }

    /**
     * List D1 Databases
     *
     * Returns a list of D1 databases.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cloudflareD1ListDatabasesTest() throws ApiException {
        String accountId = null;
        String name = null;
        BigDecimal page = null;
        BigDecimal perPage = null;
        CloudflareD1ListDatabases200Response response = api.cloudflareD1ListDatabases(accountId, name, page, perPage);
        // TODO: test validations
    }

    /**
     * Query D1 Database
     *
     * Returns the query result.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cloudflareD1QueryDatabaseTest() throws ApiException {
        String accountIdentifier = null;
        String databaseIdentifier = null;
        CloudflareD1QueryDatabaseRequest cloudflareD1QueryDatabaseRequest = null;
        CloudflareD1QueryDatabase200Response response = api.cloudflareD1QueryDatabase(accountIdentifier, databaseIdentifier, cloudflareD1QueryDatabaseRequest);
        // TODO: test validations
    }

}
