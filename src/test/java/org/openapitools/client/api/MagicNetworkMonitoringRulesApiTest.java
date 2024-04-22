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
import org.openapitools.client.model.MagicNetworkMonitoringRulesListRules4XXResponse;
import org.openapitools.client.model.MagicNetworkMonitoringRulesUpdateAdvertisementForRule4XXResponse;
import org.openapitools.client.model.MagicNetworkMonitoringRulesUpdateRules4XXResponse;
import org.openapitools.client.model.MagicVisibilityMnmRuleAdvertisementSingleResponse;
import org.openapitools.client.model.MagicVisibilityMnmRulesCollectionResponse;
import org.openapitools.client.model.MagicVisibilityMnmRulesSingleResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MagicNetworkMonitoringRulesApi
 */
@Disabled
public class MagicNetworkMonitoringRulesApiTest {

    private final MagicNetworkMonitoringRulesApi api = new MagicNetworkMonitoringRulesApi();

    /**
     * Create rules
     *
     * Create network monitoring rules for account. Currently only supports creating a single rule per API request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicNetworkMonitoringRulesCreateRulesTest() throws ApiException {
        String accountId = null;
        MagicVisibilityMnmRulesSingleResponse response = api.magicNetworkMonitoringRulesCreateRules(accountId);
        // TODO: test validations
    }

    /**
     * Delete rule
     *
     * Delete a network monitoring rule for account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicNetworkMonitoringRulesDeleteRuleTest() throws ApiException {
        String ruleId = null;
        String accountId = null;
        MagicVisibilityMnmRulesSingleResponse response = api.magicNetworkMonitoringRulesDeleteRule(ruleId, accountId);
        // TODO: test validations
    }

    /**
     * Get rule
     *
     * List a single network monitoring rule for account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicNetworkMonitoringRulesGetRuleTest() throws ApiException {
        String ruleId = null;
        String accountId = null;
        MagicVisibilityMnmRulesSingleResponse response = api.magicNetworkMonitoringRulesGetRule(ruleId, accountId);
        // TODO: test validations
    }

    /**
     * List rules
     *
     * Lists network monitoring rules for account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicNetworkMonitoringRulesListRulesTest() throws ApiException {
        String accountId = null;
        MagicVisibilityMnmRulesCollectionResponse response = api.magicNetworkMonitoringRulesListRules(accountId);
        // TODO: test validations
    }

    /**
     * Update advertisement for rule
     *
     * Update advertisement for rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicNetworkMonitoringRulesUpdateAdvertisementForRuleTest() throws ApiException {
        String ruleId = null;
        String accountId = null;
        MagicVisibilityMnmRuleAdvertisementSingleResponse response = api.magicNetworkMonitoringRulesUpdateAdvertisementForRule(ruleId, accountId);
        // TODO: test validations
    }

    /**
     * Update rule
     *
     * Update a network monitoring rule for account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicNetworkMonitoringRulesUpdateRuleTest() throws ApiException {
        String ruleId = null;
        String accountId = null;
        MagicVisibilityMnmRulesSingleResponse response = api.magicNetworkMonitoringRulesUpdateRule(ruleId, accountId);
        // TODO: test validations
    }

    /**
     * Update rules
     *
     * Update network monitoring rules for account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void magicNetworkMonitoringRulesUpdateRulesTest() throws ApiException {
        String accountId = null;
        MagicVisibilityMnmRulesSingleResponse response = api.magicNetworkMonitoringRulesUpdateRules(accountId);
        // TODO: test validations
    }

}