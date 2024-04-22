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
import org.openapitools.client.model.CreateAccountRuleset200Response;
import org.openapitools.client.model.CreateAccountRulesetRequest;
import org.openapitools.client.model.CreateAccountRulesetRuleRequest;
import org.openapitools.client.model.ListAccountRulesets200Response;
import org.openapitools.client.model.ListAccountRulesets4XXResponse;
import org.openapitools.client.model.RulesetsRulesetPhase;
import org.openapitools.client.model.UpdateAccountEntrypointRulesetRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ZoneRulesetsApi
 */
@Disabled
public class ZoneRulesetsApiTest {

    private final ZoneRulesetsApi api = new ZoneRulesetsApi();

    /**
     * Create a zone ruleset
     *
     * Creates a ruleset at the zone level.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createZoneRulesetTest() throws ApiException {
        String zoneId = null;
        CreateAccountRulesetRequest createAccountRulesetRequest = null;
        CreateAccountRuleset200Response response = api.createZoneRuleset(zoneId, createAccountRulesetRequest);
        // TODO: test validations
    }

    /**
     * Create a zone ruleset rule
     *
     * Adds a new rule to a zone ruleset. The rule will be added to the end of the existing list of rules in the ruleset by default.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createZoneRulesetRuleTest() throws ApiException {
        String rulesetId = null;
        String zoneId = null;
        CreateAccountRulesetRuleRequest createAccountRulesetRuleRequest = null;
        CreateAccountRuleset200Response response = api.createZoneRulesetRule(rulesetId, zoneId, createAccountRulesetRuleRequest);
        // TODO: test validations
    }

    /**
     * Delete a zone ruleset
     *
     * Deletes all versions of an existing zone ruleset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteZoneRulesetTest() throws ApiException {
        String rulesetId = null;
        String zoneId = null;
        api.deleteZoneRuleset(rulesetId, zoneId);
        // TODO: test validations
    }

    /**
     * Delete a zone ruleset rule
     *
     * Deletes an existing rule from a zone ruleset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteZoneRulesetRuleTest() throws ApiException {
        String ruleId = null;
        String rulesetId = null;
        String zoneId = null;
        CreateAccountRuleset200Response response = api.deleteZoneRulesetRule(ruleId, rulesetId, zoneId);
        // TODO: test validations
    }

    /**
     * Delete a zone ruleset version
     *
     * Deletes an existing version of a zone ruleset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteZoneRulesetVersionTest() throws ApiException {
        String rulesetVersion = null;
        String rulesetId = null;
        String zoneId = null;
        api.deleteZoneRulesetVersion(rulesetVersion, rulesetId, zoneId);
        // TODO: test validations
    }

    /**
     * Get a zone entry point ruleset
     *
     * Fetches the latest version of the zone entry point ruleset for a given phase.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getZoneEntrypointRulesetTest() throws ApiException {
        RulesetsRulesetPhase rulesetPhase = null;
        String zoneId = null;
        CreateAccountRuleset200Response response = api.getZoneEntrypointRuleset(rulesetPhase, zoneId);
        // TODO: test validations
    }

    /**
     * Get a zone entry point ruleset version
     *
     * Fetches a specific version of a zone entry point ruleset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getZoneEntrypointRulesetVersionTest() throws ApiException {
        String rulesetVersion = null;
        RulesetsRulesetPhase rulesetPhase = null;
        String zoneId = null;
        CreateAccountRuleset200Response response = api.getZoneEntrypointRulesetVersion(rulesetVersion, rulesetPhase, zoneId);
        // TODO: test validations
    }

    /**
     * Get a zone ruleset
     *
     * Fetches the latest version of a zone ruleset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getZoneRulesetTest() throws ApiException {
        String rulesetId = null;
        String zoneId = null;
        CreateAccountRuleset200Response response = api.getZoneRuleset(rulesetId, zoneId);
        // TODO: test validations
    }

    /**
     * Get a zone ruleset version
     *
     * Fetches a specific version of a zone ruleset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getZoneRulesetVersionTest() throws ApiException {
        String rulesetVersion = null;
        String rulesetId = null;
        String zoneId = null;
        CreateAccountRuleset200Response response = api.getZoneRulesetVersion(rulesetVersion, rulesetId, zoneId);
        // TODO: test validations
    }

    /**
     * List a zone entry point ruleset&#39;s versions
     *
     * Fetches the versions of a zone entry point ruleset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listZoneEntrypointRulesetVersionsTest() throws ApiException {
        RulesetsRulesetPhase rulesetPhase = null;
        String zoneId = null;
        ListAccountRulesets200Response response = api.listZoneEntrypointRulesetVersions(rulesetPhase, zoneId);
        // TODO: test validations
    }

    /**
     * List a zone ruleset&#39;s versions
     *
     * Fetches the versions of a zone ruleset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listZoneRulesetVersionsTest() throws ApiException {
        String rulesetId = null;
        String zoneId = null;
        ListAccountRulesets200Response response = api.listZoneRulesetVersions(rulesetId, zoneId);
        // TODO: test validations
    }

    /**
     * List zone rulesets
     *
     * Fetches all rulesets at the zone level.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listZoneRulesetsTest() throws ApiException {
        String zoneId = null;
        ListAccountRulesets200Response response = api.listZoneRulesets(zoneId);
        // TODO: test validations
    }

    /**
     * Update a zone entry point ruleset
     *
     * Updates a zone entry point ruleset, creating a new version.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateZoneEntrypointRulesetTest() throws ApiException {
        RulesetsRulesetPhase rulesetPhase = null;
        String zoneId = null;
        UpdateAccountEntrypointRulesetRequest updateAccountEntrypointRulesetRequest = null;
        CreateAccountRuleset200Response response = api.updateZoneEntrypointRuleset(rulesetPhase, zoneId, updateAccountEntrypointRulesetRequest);
        // TODO: test validations
    }

    /**
     * Update a zone ruleset
     *
     * Updates a zone ruleset, creating a new version.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateZoneRulesetTest() throws ApiException {
        String rulesetId = null;
        String zoneId = null;
        UpdateAccountEntrypointRulesetRequest updateAccountEntrypointRulesetRequest = null;
        CreateAccountRuleset200Response response = api.updateZoneRuleset(rulesetId, zoneId, updateAccountEntrypointRulesetRequest);
        // TODO: test validations
    }

    /**
     * Update a zone ruleset rule
     *
     * Updates an existing rule in a zone ruleset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateZoneRulesetRuleTest() throws ApiException {
        String ruleId = null;
        String rulesetId = null;
        String zoneId = null;
        CreateAccountRulesetRuleRequest createAccountRulesetRuleRequest = null;
        CreateAccountRuleset200Response response = api.updateZoneRulesetRule(ruleId, rulesetId, zoneId, createAccountRulesetRuleRequest);
        // TODO: test validations
    }

}