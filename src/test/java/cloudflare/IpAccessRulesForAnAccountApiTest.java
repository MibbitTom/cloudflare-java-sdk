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
import org.openapitools.client.model.FirewallApiResponseSingleId;
import org.openapitools.client.model.FirewallEgsPagination;
import org.openapitools.client.model.FirewallFilters;
import org.openapitools.client.model.FirewallResponseCollection;
import org.openapitools.client.model.FirewallResponseSingle;
import org.openapitools.client.model.FirewallSchemasRule;
import org.openapitools.client.model.IpAccessRulesForAnAccountCreateAnIpAccessRule4XXResponse;
import org.openapitools.client.model.IpAccessRulesForAnAccountCreateAnIpAccessRuleRequest;
import org.openapitools.client.model.IpAccessRulesForAnAccountDeleteAnIpAccessRule4XXResponse;
import org.openapitools.client.model.IpAccessRulesForAnAccountListIpAccessRules4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IpAccessRulesForAnAccountApi
 */
@Disabled
public class IpAccessRulesForAnAccountApiTest {

    private final IpAccessRulesForAnAccountApi api = new IpAccessRulesForAnAccountApi();

    /**
     * Create an IP Access rule
     *
     * Creates a new IP Access rule for an account. The rule will apply to all zones in the account.  Note: To create an IP Access rule that applies to a single zone, refer to the [IP Access rules for a zone](#ip-access-rules-for-a-zone) endpoints.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAccessRulesForAnAccountCreateAnIpAccessRuleTest() throws ApiException {
        Object accountIdentifier = null;
        IpAccessRulesForAnAccountCreateAnIpAccessRuleRequest ipAccessRulesForAnAccountCreateAnIpAccessRuleRequest = null;
        FirewallResponseSingle response = api.ipAccessRulesForAnAccountCreateAnIpAccessRule(accountIdentifier, ipAccessRulesForAnAccountCreateAnIpAccessRuleRequest);
        // TODO: test validations
    }

    /**
     * Delete an IP Access rule
     *
     * Deletes an existing IP Access rule defined at the account level.  Note: This operation will affect all zones in the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAccessRulesForAnAccountDeleteAnIpAccessRuleTest() throws ApiException {
        Object identifier = null;
        Object accountIdentifier = null;
        FirewallApiResponseSingleId response = api.ipAccessRulesForAnAccountDeleteAnIpAccessRule(identifier, accountIdentifier);
        // TODO: test validations
    }

    /**
     * Get an IP Access rule
     *
     * Fetches the details of an IP Access rule defined at the account level.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAccessRulesForAnAccountGetAnIpAccessRuleTest() throws ApiException {
        Object identifier = null;
        Object accountIdentifier = null;
        FirewallResponseSingle response = api.ipAccessRulesForAnAccountGetAnIpAccessRule(identifier, accountIdentifier);
        // TODO: test validations
    }

    /**
     * List IP Access rules
     *
     * Fetches IP Access rules of an account. These rules apply to all the zones in the account. You can filter the results using several optional parameters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAccessRulesForAnAccountListIpAccessRulesTest() throws ApiException {
        Object accountIdentifier = null;
        FirewallFilters filters = null;
        FirewallEgsPagination egsPaginationJson = null;
        BigDecimal page = null;
        BigDecimal perPage = null;
        String order = null;
        String direction = null;
        FirewallResponseCollection response = api.ipAccessRulesForAnAccountListIpAccessRules(accountIdentifier, filters, egsPaginationJson, page, perPage, order, direction);
        // TODO: test validations
    }

    /**
     * Update an IP Access rule
     *
     * Updates an IP Access rule defined at the account level.  Note: This operation will affect all zones in the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ipAccessRulesForAnAccountUpdateAnIpAccessRuleTest() throws ApiException {
        Object identifier = null;
        Object accountIdentifier = null;
        FirewallSchemasRule firewallSchemasRule = null;
        FirewallResponseSingle response = api.ipAccessRulesForAnAccountUpdateAnIpAccessRule(identifier, accountIdentifier, firewallSchemasRule);
        // TODO: test validations
    }

}
