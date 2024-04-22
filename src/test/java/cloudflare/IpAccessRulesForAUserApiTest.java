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
import org.openapitools.client.model.FirewallEgsPagination;
import org.openapitools.client.model.FirewallFilters;
import org.openapitools.client.model.FirewallRuleCollectionResponse;
import org.openapitools.client.model.FirewallRuleSingleIdResponse;
import org.openapitools.client.model.FirewallRuleSingleResponse;
import org.openapitools.client.model.IpAccessRulesForAUserCreateAnIpAccessRule4XXResponse;
import org.openapitools.client.model.IpAccessRulesForAUserDeleteAnIpAccessRule4XXResponse;
import org.openapitools.client.model.IpAccessRulesForAUserListIpAccessRules4XXResponse;
import org.openapitools.client.model.IpAccessRulesForAUserUpdateAnIpAccessRuleRequest;
import org.openapitools.client.model.IpAccessRulesForAnAccountCreateAnIpAccessRuleRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IpAccessRulesForAUserApi
 */
@Disabled
public class IpAccessRulesForAUserApiTest {

    private final IpAccessRulesForAUserApi api = new IpAccessRulesForAUserApi();

    /**
     * Create an IP Access rule
     *
     * Creates a new IP Access rule for all zones owned by the current user.  Note: To create an IP Access rule that applies to a specific zone, refer to the [IP Access rules for a zone](#ip-access-rules-for-a-zone) endpoints.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAccessRulesForAUserCreateAnIpAccessRuleTest() throws ApiException {
        IpAccessRulesForAnAccountCreateAnIpAccessRuleRequest ipAccessRulesForAnAccountCreateAnIpAccessRuleRequest = null;
        FirewallRuleSingleResponse response = api.ipAccessRulesForAUserCreateAnIpAccessRule(ipAccessRulesForAnAccountCreateAnIpAccessRuleRequest);
        // TODO: test validations
    }

    /**
     * Delete an IP Access rule
     *
     * Deletes an IP Access rule at the user level.  Note: Deleting a user-level rule will affect all zones owned by the user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAccessRulesForAUserDeleteAnIpAccessRuleTest() throws ApiException {
        String identifier = null;
        FirewallRuleSingleIdResponse response = api.ipAccessRulesForAUserDeleteAnIpAccessRule(identifier);
        // TODO: test validations
    }

    /**
     * List IP Access rules
     *
     * Fetches IP Access rules of the user. You can filter the results using several optional parameters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAccessRulesForAUserListIpAccessRulesTest() throws ApiException {
        FirewallFilters filters = null;
        FirewallEgsPagination egsPaginationJson = null;
        BigDecimal page = null;
        BigDecimal perPage = null;
        String order = null;
        String direction = null;
        FirewallRuleCollectionResponse response = api.ipAccessRulesForAUserListIpAccessRules(filters, egsPaginationJson, page, perPage, order, direction);
        // TODO: test validations
    }

    /**
     * Update an IP Access rule
     *
     * Updates an IP Access rule defined at the user level. You can only update the rule action (&#x60;mode&#x60; parameter) and notes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAccessRulesForAUserUpdateAnIpAccessRuleTest() throws ApiException {
        String identifier = null;
        IpAccessRulesForAUserUpdateAnIpAccessRuleRequest ipAccessRulesForAUserUpdateAnIpAccessRuleRequest = null;
        FirewallRuleSingleResponse response = api.ipAccessRulesForAUserUpdateAnIpAccessRule(identifier, ipAccessRulesForAUserUpdateAnIpAccessRuleRequest);
        // TODO: test validations
    }

}