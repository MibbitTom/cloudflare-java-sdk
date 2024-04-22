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
import cloudflare.sdk.models.ZeroTrustGatewayComponentsSchemasResponseCollection;
import cloudflare.sdk.models.ZeroTrustGatewayComponentsSchemasSingleResponse;
import cloudflare.sdk.models.ZeroTrustGatewayEmptyResponse;
import cloudflare.sdk.models.ZeroTrustGatewayRulesCreateZeroTrustGatewayRule4XXResponse;
import cloudflare.sdk.models.ZeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest;
import cloudflare.sdk.models.ZeroTrustGatewayRulesListZeroTrustGatewayRules4XXResponse;
import cloudflare.sdk.models.ZeroTrustListsDeleteZeroTrustList4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ZeroTrustGatewayRulesApi
 */
@Disabled
public class ZeroTrustGatewayRulesApiTest {

    private final ZeroTrustGatewayRulesApi api = new ZeroTrustGatewayRulesApi();

    /**
     * Create a Zero Trust Gateway rule
     *
     * Creates a new Zero Trust Gateway rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustGatewayRulesCreateZeroTrustGatewayRuleTest() throws ApiException {
        Object accountId = null;
        ZeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest zeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest = null;
        ZeroTrustGatewayComponentsSchemasSingleResponse response = api.zeroTrustGatewayRulesCreateZeroTrustGatewayRule(accountId, zeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest);
        // TODO: test validations
    }

    /**
     * Delete a Zero Trust Gateway rule
     *
     * Deletes a Zero Trust Gateway rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustGatewayRulesDeleteZeroTrustGatewayRuleTest() throws ApiException {
        String ruleId = null;
        Object accountId = null;
        ZeroTrustGatewayEmptyResponse response = api.zeroTrustGatewayRulesDeleteZeroTrustGatewayRule(ruleId, accountId);
        // TODO: test validations
    }

    /**
     * List Zero Trust Gateway rules
     *
     * Fetches the Zero Trust Gateway rules for an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustGatewayRulesListZeroTrustGatewayRulesTest() throws ApiException {
        Object accountId = null;
        ZeroTrustGatewayComponentsSchemasResponseCollection response = api.zeroTrustGatewayRulesListZeroTrustGatewayRules(accountId);
        // TODO: test validations
    }

    /**
     * Update a Zero Trust Gateway rule
     *
     * Updates a configured Zero Trust Gateway rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustGatewayRulesUpdateZeroTrustGatewayRuleTest() throws ApiException {
        String ruleId = null;
        Object accountId = null;
        ZeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest zeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest = null;
        ZeroTrustGatewayComponentsSchemasSingleResponse response = api.zeroTrustGatewayRulesUpdateZeroTrustGatewayRule(ruleId, accountId, zeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest);
        // TODO: test validations
    }

    /**
     * Get Zero Trust Gateway rule details
     *
     * Fetches a single Zero Trust Gateway rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustGatewayRulesZeroTrustGatewayRuleDetailsTest() throws ApiException {
        String ruleId = null;
        Object accountId = null;
        ZeroTrustGatewayComponentsSchemasSingleResponse response = api.zeroTrustGatewayRulesZeroTrustGatewayRuleDetails(ruleId, accountId);
        // TODO: test validations
    }

}
