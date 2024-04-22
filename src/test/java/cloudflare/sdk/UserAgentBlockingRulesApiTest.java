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
import cloudflare.sdk.models.FirewallFirewalluablockResponseCollection;
import cloudflare.sdk.models.FirewallFirewalluablockResponseSingle;
import cloudflare.sdk.models.UserAgentBlockingRulesCreateAUserAgentBlockingRule4XXResponse;
import cloudflare.sdk.models.UserAgentBlockingRulesDeleteAUserAgentBlockingRule200Response;
import cloudflare.sdk.models.UserAgentBlockingRulesDeleteAUserAgentBlockingRule4XXResponse;
import cloudflare.sdk.models.UserAgentBlockingRulesListUserAgentBlockingRules4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserAgentBlockingRulesApi
 */
@Disabled
public class UserAgentBlockingRulesApiTest {

    private final UserAgentBlockingRulesApi api = new UserAgentBlockingRulesApi();

    /**
     * Create a User Agent Blocking rule
     *
     * Creates a new User Agent Blocking rule in a zone.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userAgentBlockingRulesCreateAUserAgentBlockingRuleTest() throws ApiException {
        String zoneIdentifier = null;
        Object body = null;
        FirewallFirewalluablockResponseSingle response = api.userAgentBlockingRulesCreateAUserAgentBlockingRule(zoneIdentifier, body);
        // TODO: test validations
    }

    /**
     * Delete a User Agent Blocking rule
     *
     * Deletes an existing User Agent Blocking rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userAgentBlockingRulesDeleteAUserAgentBlockingRuleTest() throws ApiException {
        String id = null;
        String zoneIdentifier = null;
        UserAgentBlockingRulesDeleteAUserAgentBlockingRule200Response response = api.userAgentBlockingRulesDeleteAUserAgentBlockingRule(id, zoneIdentifier);
        // TODO: test validations
    }

    /**
     * Get a User Agent Blocking rule
     *
     * Fetches the details of a User Agent Blocking rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userAgentBlockingRulesGetAUserAgentBlockingRuleTest() throws ApiException {
        String id = null;
        String zoneIdentifier = null;
        FirewallFirewalluablockResponseSingle response = api.userAgentBlockingRulesGetAUserAgentBlockingRule(id, zoneIdentifier);
        // TODO: test validations
    }

    /**
     * List User Agent Blocking rules
     *
     * Fetches User Agent Blocking rules in a zone. You can filter the results using several optional parameters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userAgentBlockingRulesListUserAgentBlockingRulesTest() throws ApiException {
        String zoneIdentifier = null;
        BigDecimal page = null;
        String description = null;
        String descriptionSearch = null;
        BigDecimal perPage = null;
        String uaSearch = null;
        FirewallFirewalluablockResponseCollection response = api.userAgentBlockingRulesListUserAgentBlockingRules(zoneIdentifier, page, description, descriptionSearch, perPage, uaSearch);
        // TODO: test validations
    }

    /**
     * Update a User Agent Blocking rule
     *
     * Updates an existing User Agent Blocking rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userAgentBlockingRulesUpdateAUserAgentBlockingRuleTest() throws ApiException {
        String id = null;
        String zoneIdentifier = null;
        Object body = null;
        FirewallFirewalluablockResponseSingle response = api.userAgentBlockingRulesUpdateAUserAgentBlockingRule(id, zoneIdentifier, body);
        // TODO: test validations
    }

}
