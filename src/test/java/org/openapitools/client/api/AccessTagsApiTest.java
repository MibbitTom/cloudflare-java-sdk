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
import org.openapitools.client.model.AccessApiResponseCommonFailure;
import org.openapitools.client.model.AccessNameResponse;
import org.openapitools.client.model.AccessTagWithoutAppCount;
import org.openapitools.client.model.AccessTagsComponentsSchemasResponseCollection;
import org.openapitools.client.model.AccessTagsComponentsSchemasSingleResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccessTagsApi
 */
@Disabled
public class AccessTagsApiTest {

    private final AccessTagsApi api = new AccessTagsApi();

    /**
     * Create a tag
     *
     * Create a tag
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accessTagsCreateTagTest() throws ApiException {
        String identifier = null;
        AccessTagWithoutAppCount accessTagWithoutAppCount = null;
        AccessTagsComponentsSchemasSingleResponse response = api.accessTagsCreateTag(identifier, accessTagWithoutAppCount);
        // TODO: test validations
    }

    /**
     * Delete a tag
     *
     * Delete a tag
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accessTagsDeleteATagTest() throws ApiException {
        String identifier = null;
        String name = null;
        AccessNameResponse response = api.accessTagsDeleteATag(identifier, name);
        // TODO: test validations
    }

    /**
     * Get a tag
     *
     * Get a tag
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accessTagsGetATagTest() throws ApiException {
        String identifier = null;
        String name = null;
        AccessTagsComponentsSchemasSingleResponse response = api.accessTagsGetATag(identifier, name);
        // TODO: test validations
    }

    /**
     * List tags
     *
     * List tags
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accessTagsListTagsTest() throws ApiException {
        String identifier = null;
        AccessTagsComponentsSchemasResponseCollection response = api.accessTagsListTags(identifier);
        // TODO: test validations
    }

    /**
     * Update a tag
     *
     * Update a tag
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void accessTagsUpdateATagTest() throws ApiException {
        String identifier = null;
        String name = null;
        AccessTagWithoutAppCount accessTagWithoutAppCount = null;
        AccessTagsComponentsSchemasSingleResponse response = api.accessTagsUpdateATag(identifier, name, accessTagWithoutAppCount);
        // TODO: test validations
    }

}
