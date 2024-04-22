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
import cloudflare.sdk.models.WafManagedRulesRuleResponseCollection;
import cloudflare.sdk.models.WafManagedRulesRuleResponseSingle;
import cloudflare.sdk.models.WafRulesGetAWafRule4XXResponse;
import cloudflare.sdk.models.WafRulesListWafRules4XXResponse;
import cloudflare.sdk.models.WafRulesUpdateAWafRule200Response;
import cloudflare.sdk.models.WafRulesUpdateAWafRule4XXResponse;
import cloudflare.sdk.models.WafRulesUpdateAWafRuleRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WafRulesApi
 */
@Disabled
public class WafRulesApiTest {

    private final WafRulesApi api = new WafRulesApi();

    /**
     * Get a WAF rule
     *
     * Fetches the details of a WAF rule in a WAF package.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wafRulesGetAWafRuleTest() throws ApiException {
        String ruleId = null;
        String packageId = null;
        String zoneId = null;
        WafManagedRulesRuleResponseSingle response = api.wafRulesGetAWafRule(ruleId, packageId, zoneId);
        // TODO: test validations
    }

    /**
     * List WAF rules
     *
     * Fetches WAF rules in a WAF package.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wafRulesListWafRulesTest() throws ApiException {
        String packageId = null;
        String zoneId = null;
        String mode = null;
        String groupId = null;
        BigDecimal page = null;
        BigDecimal perPage = null;
        String order = null;
        String direction = null;
        String match = null;
        String description = null;
        String priority = null;
        WafManagedRulesRuleResponseCollection response = api.wafRulesListWafRules(packageId, zoneId, mode, groupId, page, perPage, order, direction, match, description, priority);
        // TODO: test validations
    }

    /**
     * Update a WAF rule
     *
     * Updates a WAF rule. You can only update the mode/action of the rule.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void wafRulesUpdateAWafRuleTest() throws ApiException {
        String ruleId = null;
        String packageId = null;
        String zoneId = null;
        WafRulesUpdateAWafRuleRequest wafRulesUpdateAWafRuleRequest = null;
        WafRulesUpdateAWafRule200Response response = api.wafRulesUpdateAWafRule(ruleId, packageId, zoneId, wafRulesUpdateAWafRuleRequest);
        // TODO: test validations
    }

}