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
import cloudflare.sdk.models.TeamsDevicesZeroTrustAccountDeviceSettings;
import cloudflare.sdk.models.TeamsDevicesZeroTrustAccountDeviceSettingsResponse;
import cloudflare.sdk.models.ZeroTrustAccountsGetDeviceSettingsForZeroTrustAccount4XXResponse;
import cloudflare.sdk.models.ZeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount4XXResponse;
import cloudflare.sdk.models.ZeroTrustAccountsGetZeroTrustAccountConfiguration4XXResponse;
import cloudflare.sdk.models.ZeroTrustAccountsGetZeroTrustAccountInformation4XXResponse;
import cloudflare.sdk.models.ZeroTrustGatewayGatewayAccount;
import cloudflare.sdk.models.ZeroTrustGatewayGatewayAccountConfig;
import cloudflare.sdk.models.ZeroTrustGatewayGatewayAccountLoggingSettings;
import cloudflare.sdk.models.ZeroTrustGatewayGatewayAccountLoggingSettingsResponse;
import cloudflare.sdk.models.ZeroTrustGatewayGatewayAccountSettings;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ZeroTrustAccountsApi
 */
@Disabled
public class ZeroTrustAccountsApiTest {

    private final ZeroTrustAccountsApi api = new ZeroTrustAccountsApi();

    /**
     * Create Zero Trust account
     *
     * Creates a Zero Trust account with an existing Cloudflare account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustAccountsCreateZeroTrustAccountTest() throws ApiException {
        Object accountId = null;
        ZeroTrustGatewayGatewayAccount response = api.zeroTrustAccountsCreateZeroTrustAccount(accountId);
        // TODO: test validations
    }

    /**
     * Get device settings for a Zero Trust account
     *
     * Describes the current device settings for a Zero Trust account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustAccountsGetDeviceSettingsForZeroTrustAccountTest() throws ApiException {
        Object accountId = null;
        TeamsDevicesZeroTrustAccountDeviceSettingsResponse response = api.zeroTrustAccountsGetDeviceSettingsForZeroTrustAccount(accountId);
        // TODO: test validations
    }

    /**
     * Get logging settings for the Zero Trust account
     *
     * Fetches the current logging settings for Zero Trust account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccountTest() throws ApiException {
        Object accountId = null;
        ZeroTrustGatewayGatewayAccountLoggingSettingsResponse response = api.zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount(accountId);
        // TODO: test validations
    }

    /**
     * Get Zero Trust account configuration
     *
     * Fetches the current Zero Trust account configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustAccountsGetZeroTrustAccountConfigurationTest() throws ApiException {
        Object accountId = null;
        ZeroTrustGatewayGatewayAccountConfig response = api.zeroTrustAccountsGetZeroTrustAccountConfiguration(accountId);
        // TODO: test validations
    }

    /**
     * Get Zero Trust account information
     *
     * Gets information about the current Zero Trust account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustAccountsGetZeroTrustAccountInformationTest() throws ApiException {
        Object accountId = null;
        ZeroTrustGatewayGatewayAccount response = api.zeroTrustAccountsGetZeroTrustAccountInformation(accountId);
        // TODO: test validations
    }

    /**
     * Patch Zero Trust account configuration
     *
     * Patches the current Zero Trust account configuration. This endpoint can update a single subcollection of settings such as &#x60;antivirus&#x60;, &#x60;tls_decrypt&#x60;, &#x60;activity_log&#x60;, &#x60;block_page&#x60;, &#x60;browser_isolation&#x60;, &#x60;fips&#x60;, &#x60;body_scanning&#x60;, or &#x60;custom_certificate&#x60;, without updating the entire configuration object. Returns an error if any collection of settings is not properly configured.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustAccountsPatchZeroTrustAccountConfigurationTest() throws ApiException {
        Object accountId = null;
        ZeroTrustGatewayGatewayAccountSettings zeroTrustGatewayGatewayAccountSettings = null;
        ZeroTrustGatewayGatewayAccountConfig response = api.zeroTrustAccountsPatchZeroTrustAccountConfiguration(accountId, zeroTrustGatewayGatewayAccountSettings);
        // TODO: test validations
    }

    /**
     * Update device settings for a Zero Trust account
     *
     * Updates the current device settings for a Zero Trust account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccountTest() throws ApiException {
        Object accountId = null;
        TeamsDevicesZeroTrustAccountDeviceSettings teamsDevicesZeroTrustAccountDeviceSettings = null;
        TeamsDevicesZeroTrustAccountDeviceSettingsResponse response = api.zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccount(accountId, teamsDevicesZeroTrustAccountDeviceSettings);
        // TODO: test validations
    }

    /**
     * Update Zero Trust account logging settings
     *
     * Updates logging settings for the current Zero Trust account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccountTest() throws ApiException {
        Object accountId = null;
        ZeroTrustGatewayGatewayAccountLoggingSettings zeroTrustGatewayGatewayAccountLoggingSettings = null;
        ZeroTrustGatewayGatewayAccountLoggingSettingsResponse response = api.zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccount(accountId, zeroTrustGatewayGatewayAccountLoggingSettings);
        // TODO: test validations
    }

    /**
     * Update Zero Trust account configuration
     *
     * Updates the current Zero Trust account configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zeroTrustAccountsUpdateZeroTrustAccountConfigurationTest() throws ApiException {
        Object accountId = null;
        ZeroTrustGatewayGatewayAccountSettings zeroTrustGatewayGatewayAccountSettings = null;
        ZeroTrustGatewayGatewayAccountConfig response = api.zeroTrustAccountsUpdateZeroTrustAccountConfiguration(accountId, zeroTrustGatewayGatewayAccountSettings);
        // TODO: test validations
    }

}