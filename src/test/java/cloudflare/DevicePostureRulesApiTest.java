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
import org.openapitools.client.model.DevicePostureRulesCreateDevicePostureRule4XXResponse;
import org.openapitools.client.model.DevicePostureRulesCreateDevicePostureRuleRequest;
import org.openapitools.client.model.DevicePostureRulesDeleteDevicePostureRule4XXResponse;
import org.openapitools.client.model.DevicePostureRulesListDevicePostureRules4XXResponse;
import org.openapitools.client.model.TeamsDevicesIdResponse;
import org.openapitools.client.model.TeamsDevicesResponseCollection;
import org.openapitools.client.model.TeamsDevicesSingleResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevicePostureRulesApi
 */
@Disabled
public class DevicePostureRulesApiTest {

    private final DevicePostureRulesApi api = new DevicePostureRulesApi();

    /**
     * Create a device posture rule
     *
     * Creates a new device posture rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void devicePostureRulesCreateDevicePostureRuleTest() throws ApiException {
        Object accountId = null;
        DevicePostureRulesCreateDevicePostureRuleRequest devicePostureRulesCreateDevicePostureRuleRequest = null;
        TeamsDevicesSingleResponse response = api.devicePostureRulesCreateDevicePostureRule(accountId, devicePostureRulesCreateDevicePostureRuleRequest);
        // TODO: test validations
    }

    /**
     * Delete a device posture rule
     *
     * Deletes a device posture rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void devicePostureRulesDeleteDevicePostureRuleTest() throws ApiException {
        String ruleId = null;
        Object accountId = null;
        TeamsDevicesIdResponse response = api.devicePostureRulesDeleteDevicePostureRule(ruleId, accountId);
        // TODO: test validations
    }

    /**
     * Get device posture rule details
     *
     * Fetches a single device posture rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void devicePostureRulesDevicePostureRulesDetailsTest() throws ApiException {
        String ruleId = null;
        Object accountId = null;
        TeamsDevicesSingleResponse response = api.devicePostureRulesDevicePostureRulesDetails(ruleId, accountId);
        // TODO: test validations
    }

    /**
     * List device posture rules
     *
     * Fetches device posture rules for a Zero Trust account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void devicePostureRulesListDevicePostureRulesTest() throws ApiException {
        Object accountId = null;
        TeamsDevicesResponseCollection response = api.devicePostureRulesListDevicePostureRules(accountId);
        // TODO: test validations
    }

    /**
     * Update a device posture rule
     *
     * Updates a device posture rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void devicePostureRulesUpdateDevicePostureRuleTest() throws ApiException {
        String ruleId = null;
        Object accountId = null;
        DevicePostureRulesCreateDevicePostureRuleRequest devicePostureRulesCreateDevicePostureRuleRequest = null;
        TeamsDevicesSingleResponse response = api.devicePostureRulesUpdateDevicePostureRule(ruleId, accountId, devicePostureRulesCreateDevicePostureRuleRequest);
        // TODO: test validations
    }

}