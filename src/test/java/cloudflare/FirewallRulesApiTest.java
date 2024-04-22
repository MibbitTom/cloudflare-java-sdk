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
import org.openapitools.client.model.FirewallFilterRulesResponseCollection;
import org.openapitools.client.model.FirewallFilterRulesResponseCollectionDelete;
import org.openapitools.client.model.FirewallFilterRulesSingleResponse;
import org.openapitools.client.model.FirewallFilterRulesSingleResponseDelete;
import org.openapitools.client.model.FirewallRulesDeleteAFirewallRule4XXResponse;
import org.openapitools.client.model.FirewallRulesDeleteAFirewallRuleRequest;
import org.openapitools.client.model.FirewallRulesDeleteFirewallRules4XXResponse;
import org.openapitools.client.model.FirewallRulesDeleteFirewallRulesRequest;
import org.openapitools.client.model.FirewallRulesGetAFirewallRule4XXResponse;
import org.openapitools.client.model.FirewallRulesListFirewallRules4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FirewallRulesApi
 */
@Disabled
public class FirewallRulesApiTest {

    private final FirewallRulesApi api = new FirewallRulesApi();

    /**
     * Create firewall rules
     *
     * Create one or more firewall rules.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void firewallRulesCreateFirewallRulesTest() throws ApiException {
        String zoneIdentifier = null;
        Object body = null;
        FirewallFilterRulesResponseCollection response = api.firewallRulesCreateFirewallRules(zoneIdentifier, body);
        // TODO: test validations
    }

    /**
     * Delete a firewall rule
     *
     * Deletes an existing firewall rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void firewallRulesDeleteAFirewallRuleTest() throws ApiException {
        String id = null;
        String zoneIdentifier = null;
        FirewallRulesDeleteAFirewallRuleRequest firewallRulesDeleteAFirewallRuleRequest = null;
        FirewallFilterRulesSingleResponseDelete response = api.firewallRulesDeleteAFirewallRule(id, zoneIdentifier, firewallRulesDeleteAFirewallRuleRequest);
        // TODO: test validations
    }

    /**
     * Delete firewall rules
     *
     * Deletes existing firewall rules.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void firewallRulesDeleteFirewallRulesTest() throws ApiException {
        String zoneIdentifier = null;
        FirewallRulesDeleteFirewallRulesRequest firewallRulesDeleteFirewallRulesRequest = null;
        FirewallFilterRulesResponseCollectionDelete response = api.firewallRulesDeleteFirewallRules(zoneIdentifier, firewallRulesDeleteFirewallRulesRequest);
        // TODO: test validations
    }

    /**
     * Get a firewall rule
     *
     * Fetches the details of a firewall rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void firewallRulesGetAFirewallRuleTest() throws ApiException {
        String id = null;
        String zoneIdentifier = null;
        String id2 = null;
        FirewallFilterRulesSingleResponse response = api.firewallRulesGetAFirewallRule(id, zoneIdentifier, id2);
        // TODO: test validations
    }

    /**
     * List firewall rules
     *
     * Fetches firewall rules in a zone. You can filter the results using several optional parameters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void firewallRulesListFirewallRulesTest() throws ApiException {
        String zoneIdentifier = null;
        String description = null;
        String action = null;
        BigDecimal page = null;
        BigDecimal perPage = null;
        String id = null;
        Boolean paused = null;
        FirewallFilterRulesResponseCollection response = api.firewallRulesListFirewallRules(zoneIdentifier, description, action, page, perPage, id, paused);
        // TODO: test validations
    }

    /**
     * Update a firewall rule
     *
     * Updates an existing firewall rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void firewallRulesUpdateAFirewallRuleTest() throws ApiException {
        String id = null;
        String zoneIdentifier = null;
        Object body = null;
        FirewallFilterRulesSingleResponse response = api.firewallRulesUpdateAFirewallRule(id, zoneIdentifier, body);
        // TODO: test validations
    }

    /**
     * Update firewall rules
     *
     * Updates one or more existing firewall rules.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void firewallRulesUpdateFirewallRulesTest() throws ApiException {
        String zoneIdentifier = null;
        Object body = null;
        FirewallFilterRulesResponseCollection response = api.firewallRulesUpdateFirewallRules(zoneIdentifier, body);
        // TODO: test validations
    }

    /**
     * Update priority of a firewall rule
     *
     * Updates the priority of an existing firewall rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void firewallRulesUpdatePriorityOfAFirewallRuleTest() throws ApiException {
        String id = null;
        String zoneIdentifier = null;
        Object body = null;
        FirewallFilterRulesResponseCollection response = api.firewallRulesUpdatePriorityOfAFirewallRule(id, zoneIdentifier, body);
        // TODO: test validations
    }

    /**
     * Update priority of firewall rules
     *
     * Updates the priority of existing firewall rules.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void firewallRulesUpdatePriorityOfFirewallRulesTest() throws ApiException {
        String zoneIdentifier = null;
        Object body = null;
        FirewallFilterRulesResponseCollection response = api.firewallRulesUpdatePriorityOfFirewallRules(zoneIdentifier, body);
        // TODO: test validations
    }

}
