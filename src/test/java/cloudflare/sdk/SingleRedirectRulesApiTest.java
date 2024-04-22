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
import cloudflare.sdk.models.ConfigRulesUpdateConfigRules4XXResponse;
import cloudflare.sdk.models.FirewallApiResponseSingle;
import cloudflare.sdk.models.FirewallSchemasRuleset;
import cloudflare.sdk.models.FirewallUpdateRuleset;
import cloudflare.sdk.models.SingleRedirectRulesListSingleRedirectRules4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SingleRedirectRulesApi
 */
@Disabled
public class SingleRedirectRulesApiTest {

    private final SingleRedirectRulesApi api = new SingleRedirectRulesApi();

    /**
     * List Single Redirect Rules
     *
     * Fetches all Single Redirect Rules in a zone.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void singleRedirectRulesListSingleRedirectRulesTest() throws ApiException {
        String zoneId = null;
        FirewallSchemasRuleset response = api.singleRedirectRulesListSingleRedirectRules(zoneId);
        // TODO: test validations
    }

    /**
     * Update Single Redirect Rules
     *
     * Updates the Single Redirect Rules of a zone.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void singleRedirectRulesUpdateSingleRedirectRulesTest() throws ApiException {
        String zoneId = null;
        FirewallUpdateRuleset firewallUpdateRuleset = null;
        FirewallApiResponseSingle response = api.singleRedirectRulesUpdateSingleRedirectRules(zoneId, firewallUpdateRuleset);
        // TODO: test validations
    }

}
