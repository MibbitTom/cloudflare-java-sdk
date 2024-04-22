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


package cloudflare;

import invalidPackageName.ApiException;
import java.math.BigDecimal;
import org.openapitools.client.model.EmailCatchAllRuleResponseSingle;
import org.openapitools.client.model.EmailCreateRuleProperties;
import org.openapitools.client.model.EmailRuleResponseSingle;
import org.openapitools.client.model.EmailRulesResponseCollection;
import org.openapitools.client.model.EmailUpdateCatchAllRuleProperties;
import org.openapitools.client.model.EmailUpdateRuleProperties;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmailRoutingRoutingRulesApi
 */
@Disabled
public class EmailRoutingRoutingRulesApiTest {

    private final EmailRoutingRoutingRulesApi api = new EmailRoutingRoutingRulesApi();

    /**
     * Create routing rule
     *
     * Rules consist of a set of criteria for matching emails (such as an email being sent to a specific custom email address) plus a set of actions to take on the email (like forwarding it to a specific destination address).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void emailRoutingRoutingRulesCreateRoutingRuleTest() throws ApiException {
        String zoneIdentifier = null;
        EmailCreateRuleProperties emailCreateRuleProperties = null;
        EmailRuleResponseSingle response = api.emailRoutingRoutingRulesCreateRoutingRule(zoneIdentifier, emailCreateRuleProperties);
        // TODO: test validations
    }

    /**
     * Delete routing rule
     *
     * Delete a specific routing rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void emailRoutingRoutingRulesDeleteRoutingRuleTest() throws ApiException {
        String ruleIdentifier = null;
        String zoneIdentifier = null;
        EmailRuleResponseSingle response = api.emailRoutingRoutingRulesDeleteRoutingRule(ruleIdentifier, zoneIdentifier);
        // TODO: test validations
    }

    /**
     * Get catch-all rule
     *
     * Get information on the default catch-all routing rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void emailRoutingRoutingRulesGetCatchAllRuleTest() throws ApiException {
        String zoneIdentifier = null;
        EmailCatchAllRuleResponseSingle response = api.emailRoutingRoutingRulesGetCatchAllRule(zoneIdentifier);
        // TODO: test validations
    }

    /**
     * Get routing rule
     *
     * Get information for a specific routing rule already created.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void emailRoutingRoutingRulesGetRoutingRuleTest() throws ApiException {
        String ruleIdentifier = null;
        String zoneIdentifier = null;
        EmailRuleResponseSingle response = api.emailRoutingRoutingRulesGetRoutingRule(ruleIdentifier, zoneIdentifier);
        // TODO: test validations
    }

    /**
     * List routing rules
     *
     * Lists existing routing rules.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void emailRoutingRoutingRulesListRoutingRulesTest() throws ApiException {
        String zoneIdentifier = null;
        BigDecimal page = null;
        BigDecimal perPage = null;
        Boolean enabled = null;
        EmailRulesResponseCollection response = api.emailRoutingRoutingRulesListRoutingRules(zoneIdentifier, page, perPage, enabled);
        // TODO: test validations
    }

    /**
     * Update catch-all rule
     *
     * Enable or disable catch-all routing rule, or change action to forward to specific destination address.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void emailRoutingRoutingRulesUpdateCatchAllRuleTest() throws ApiException {
        String zoneIdentifier = null;
        EmailUpdateCatchAllRuleProperties emailUpdateCatchAllRuleProperties = null;
        EmailCatchAllRuleResponseSingle response = api.emailRoutingRoutingRulesUpdateCatchAllRule(zoneIdentifier, emailUpdateCatchAllRuleProperties);
        // TODO: test validations
    }

    /**
     * Update routing rule
     *
     * Update actions and matches, or enable/disable specific routing rules.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void emailRoutingRoutingRulesUpdateRoutingRuleTest() throws ApiException {
        String ruleIdentifier = null;
        String zoneIdentifier = null;
        EmailUpdateRuleProperties emailUpdateRuleProperties = null;
        EmailRuleResponseSingle response = api.emailRoutingRoutingRulesUpdateRoutingRule(ruleIdentifier, zoneIdentifier, emailUpdateRuleProperties);
        // TODO: test validations
    }

}
