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
import cloudflare.sdk.models.AccessApiResponseCommonFailure;
import cloudflare.sdk.models.AccessBookmarksComponentsSchemasResponseCollection;
import cloudflare.sdk.models.AccessBookmarksComponentsSchemasSingleResponse;
import cloudflare.sdk.models.AccessIdResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccessBookmarkApplicationsDeprecatedApi
 */
@Disabled
public class AccessBookmarkApplicationsDeprecatedApiTest {

    private final AccessBookmarkApplicationsDeprecatedApi api = new AccessBookmarkApplicationsDeprecatedApi();

    /**
     * Create a Bookmark application
     *
     * Create a new Bookmark application.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accessBookmarkApplicationsDeprecatedCreateABookmarkApplicationTest() throws ApiException {
        String uuid = null;
        String identifier = null;
        AccessBookmarksComponentsSchemasSingleResponse response = api.accessBookmarkApplicationsDeprecatedCreateABookmarkApplication(uuid, identifier);
        // TODO: test validations
    }

    /**
     * Delete a Bookmark application
     *
     * Deletes a Bookmark application.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accessBookmarkApplicationsDeprecatedDeleteABookmarkApplicationTest() throws ApiException {
        String uuid = null;
        String identifier = null;
        AccessIdResponse response = api.accessBookmarkApplicationsDeprecatedDeleteABookmarkApplication(uuid, identifier);
        // TODO: test validations
    }

    /**
     * Get a Bookmark application
     *
     * Fetches a single Bookmark application.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accessBookmarkApplicationsDeprecatedGetABookmarkApplicationTest() throws ApiException {
        String uuid = null;
        String identifier = null;
        AccessBookmarksComponentsSchemasSingleResponse response = api.accessBookmarkApplicationsDeprecatedGetABookmarkApplication(uuid, identifier);
        // TODO: test validations
    }

    /**
     * List Bookmark applications
     *
     * Lists Bookmark applications.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accessBookmarkApplicationsDeprecatedListBookmarkApplicationsTest() throws ApiException {
        String identifier = null;
        AccessBookmarksComponentsSchemasResponseCollection response = api.accessBookmarkApplicationsDeprecatedListBookmarkApplications(identifier);
        // TODO: test validations
    }

    /**
     * Update a Bookmark application
     *
     * Updates a configured Bookmark application.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accessBookmarkApplicationsDeprecatedUpdateABookmarkApplicationTest() throws ApiException {
        String uuid = null;
        String identifier = null;
        AccessBookmarksComponentsSchemasSingleResponse response = api.accessBookmarkApplicationsDeprecatedUpdateABookmarkApplication(uuid, identifier);
        // TODO: test validations
    }

}