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
import cloudflare.sdk.models.PageRulesCreateAPageRule4XXResponse;
import cloudflare.sdk.models.PageRulesCreateAPageRuleRequest;
import cloudflare.sdk.models.PageRulesDeleteAPageRule4XXResponse;
import cloudflare.sdk.models.PageRulesEditAPageRuleRequest;
import cloudflare.sdk.models.PageRulesListPageRules4XXResponse;
import cloudflare.sdk.models.ZonesPageruleResponseCollection;
import cloudflare.sdk.models.ZonesPageruleResponseSingle;
import cloudflare.sdk.models.ZonesSchemasApiResponseSingleId;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PageRulesApi
 */
@Disabled
public class PageRulesApiTest {

    private final PageRulesApi api = new PageRulesApi();

    /**
     * Create a Page Rule
     *
     * Creates a new Page Rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pageRulesCreateAPageRuleTest() throws ApiException {
        String zoneId = null;
        PageRulesCreateAPageRuleRequest pageRulesCreateAPageRuleRequest = null;
        ZonesPageruleResponseSingle response = api.pageRulesCreateAPageRule(zoneId, pageRulesCreateAPageRuleRequest);
        // TODO: test validations
    }

    /**
     * Delete a Page Rule
     *
     * Deletes an existing Page Rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pageRulesDeleteAPageRuleTest() throws ApiException {
        String pageruleId = null;
        String zoneId = null;
        ZonesSchemasApiResponseSingleId response = api.pageRulesDeleteAPageRule(pageruleId, zoneId);
        // TODO: test validations
    }

    /**
     * Edit a Page Rule
     *
     * Updates one or more fields of an existing Page Rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pageRulesEditAPageRuleTest() throws ApiException {
        String pageruleId = null;
        String zoneId = null;
        PageRulesEditAPageRuleRequest pageRulesEditAPageRuleRequest = null;
        ZonesPageruleResponseSingle response = api.pageRulesEditAPageRule(pageruleId, zoneId, pageRulesEditAPageRuleRequest);
        // TODO: test validations
    }

    /**
     * Get a Page Rule
     *
     * Fetches the details of a Page Rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pageRulesGetAPageRuleTest() throws ApiException {
        String pageruleId = null;
        String zoneId = null;
        ZonesPageruleResponseSingle response = api.pageRulesGetAPageRule(pageruleId, zoneId);
        // TODO: test validations
    }

    /**
     * List Page Rules
     *
     * Fetches Page Rules in a zone.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pageRulesListPageRulesTest() throws ApiException {
        String zoneId = null;
        String order = null;
        String direction = null;
        String match = null;
        String status = null;
        ZonesPageruleResponseCollection response = api.pageRulesListPageRules(zoneId, order, direction, match, status);
        // TODO: test validations
    }

    /**
     * Update a Page Rule
     *
     * Replaces the configuration of an existing Page Rule. The configuration of the updated Page Rule will exactly match the data passed in the API request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pageRulesUpdateAPageRuleTest() throws ApiException {
        String pageruleId = null;
        String zoneId = null;
        PageRulesCreateAPageRuleRequest pageRulesCreateAPageRuleRequest = null;
        ZonesPageruleResponseSingle response = api.pageRulesUpdateAPageRule(pageruleId, zoneId, pageRulesCreateAPageRuleRequest);
        // TODO: test validations
    }

}
