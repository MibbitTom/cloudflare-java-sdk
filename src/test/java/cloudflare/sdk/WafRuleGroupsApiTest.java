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
import cloudflare.sdk.models.WafManagedRulesMode;
import cloudflare.sdk.models.WafManagedRulesRuleGroupResponseCollection;
import cloudflare.sdk.models.WafManagedRulesRuleGroupResponseSingle;
import cloudflare.sdk.models.WafRuleGroupsGetAWafRuleGroup4XXResponse;
import cloudflare.sdk.models.WafRuleGroupsListWafRuleGroups4XXResponse;
import cloudflare.sdk.models.WafRuleGroupsUpdateAWafRuleGroupRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WafRuleGroupsApi
 */
@Disabled
public class WafRuleGroupsApiTest {

    private final WafRuleGroupsApi api = new WafRuleGroupsApi();

    /**
     * Get a WAF rule group
     *
     * Fetches the details of a WAF rule group.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wafRuleGroupsGetAWafRuleGroupTest() throws ApiException {
        String groupId = null;
        String packageId = null;
        String zoneId = null;
        WafManagedRulesRuleGroupResponseSingle response = api.wafRuleGroupsGetAWafRuleGroup(groupId, packageId, zoneId);
        // TODO: test validations
    }

    /**
     * List WAF rule groups
     *
     * Fetches the WAF rule groups in a WAF package.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wafRuleGroupsListWafRuleGroupsTest() throws ApiException {
        String packageId = null;
        String zoneId = null;
        WafManagedRulesMode mode = null;
        BigDecimal page = null;
        BigDecimal perPage = null;
        String order = null;
        String direction = null;
        String match = null;
        String name = null;
        BigDecimal rulesCount = null;
        WafManagedRulesRuleGroupResponseCollection response = api.wafRuleGroupsListWafRuleGroups(packageId, zoneId, mode, page, perPage, order, direction, match, name, rulesCount);
        // TODO: test validations
    }

    /**
     * Update a WAF rule group
     *
     * Updates a WAF rule group. You can update the state (&#x60;mode&#x60; parameter) of a rule group.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wafRuleGroupsUpdateAWafRuleGroupTest() throws ApiException {
        String groupId = null;
        String packageId = null;
        String zoneId = null;
        WafRuleGroupsUpdateAWafRuleGroupRequest wafRuleGroupsUpdateAWafRuleGroupRequest = null;
        WafManagedRulesRuleGroupResponseSingle response = api.wafRuleGroupsUpdateAWafRuleGroup(groupId, packageId, zoneId, wafRuleGroupsUpdateAWafRuleGroupRequest);
        // TODO: test validations
    }

}
