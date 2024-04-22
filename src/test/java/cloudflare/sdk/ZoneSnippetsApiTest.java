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
import cloudflare.sdk.models.SnippetsApiApiResponseCommon;
import cloudflare.sdk.models.SnippetsApiApiResponseCommonFailure;
import cloudflare.sdk.models.ZoneSnippets200Response;
import cloudflare.sdk.models.ZoneSnippetsSnippet200Response;
import cloudflare.sdk.models.ZoneSnippetsSnippetContent200Response;
import cloudflare.sdk.models.ZoneSnippetsSnippetPutRequestMetadata;
import cloudflare.sdk.models.ZoneSnippetsSnippetRules200Response;
import cloudflare.sdk.models.ZoneSnippetsSnippetRulesPutRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ZoneSnippetsApi
 */
@Disabled
public class ZoneSnippetsApiTest {

    private final ZoneSnippetsApi api = new ZoneSnippetsApi();

    /**
     * All Snippets
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zoneSnippetsTest() throws ApiException {
        String zoneIdentifier = null;
        ZoneSnippets200Response response = api.zoneSnippets(zoneIdentifier);
        // TODO: test validations
    }

    /**
     * Snippet
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zoneSnippetsSnippetTest() throws ApiException {
        String zoneIdentifier = null;
        String snippetName = null;
        ZoneSnippetsSnippet200Response response = api.zoneSnippetsSnippet(zoneIdentifier, snippetName);
        // TODO: test validations
    }

    /**
     * Snippet Content
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zoneSnippetsSnippetContentTest() throws ApiException {
        String zoneIdentifier = null;
        String snippetName = null;
        ZoneSnippetsSnippetContent200Response response = api.zoneSnippetsSnippetContent(zoneIdentifier, snippetName);
        // TODO: test validations
    }

    /**
     * Delete Snippet
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zoneSnippetsSnippetDeleteTest() throws ApiException {
        String zoneIdentifier = null;
        String snippetName = null;
        SnippetsApiApiResponseCommon response = api.zoneSnippetsSnippetDelete(zoneIdentifier, snippetName);
        // TODO: test validations
    }

    /**
     * Put Snippet
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zoneSnippetsSnippetPutTest() throws ApiException {
        String zoneIdentifier = null;
        String snippetName = null;
        String files = null;
        ZoneSnippetsSnippetPutRequestMetadata metadata = null;
        ZoneSnippetsSnippet200Response response = api.zoneSnippetsSnippetPut(zoneIdentifier, snippetName, files, metadata);
        // TODO: test validations
    }

    /**
     * Rules
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zoneSnippetsSnippetRulesTest() throws ApiException {
        String zoneIdentifier = null;
        ZoneSnippetsSnippetRules200Response response = api.zoneSnippetsSnippetRules(zoneIdentifier);
        // TODO: test validations
    }

    /**
     * Put Rules
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zoneSnippetsSnippetRulesPutTest() throws ApiException {
        String zoneIdentifier = null;
        ZoneSnippetsSnippetRulesPutRequest zoneSnippetsSnippetRulesPutRequest = null;
        ZoneSnippetsSnippetRules200Response response = api.zoneSnippetsSnippetRulesPut(zoneIdentifier, zoneSnippetsSnippetRulesPutRequest);
        // TODO: test validations
    }

}
