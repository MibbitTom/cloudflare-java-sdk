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
import org.openapitools.client.model.BotManagementBotManagementResponseBody;
import org.openapitools.client.model.BotManagementConfigSingle;
import org.openapitools.client.model.BotManagementForAZoneGetConfig4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BotSettingsApi
 */
@Disabled
public class BotSettingsApiTest {

    private final BotSettingsApi api = new BotSettingsApi();

    /**
     * Get Zone Bot Management Config
     *
     * Retrieve a zone&#39;s Bot Management Config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void botManagementForAZoneGetConfigTest() throws ApiException {
        String zoneId = null;
        BotManagementBotManagementResponseBody response = api.botManagementForAZoneGetConfig(zoneId);
        // TODO: test validations
    }

    /**
     * Update Zone Bot Management Config
     *
     * Updates the Bot Management configuration for a zone.  This API is used to update: - **Bot Fight Mode** - **Super Bot Fight Mode** - **Bot Management for Enterprise**  See [Bot Plans](https://developers.cloudflare.com/bots/plans/) for more information on the different plans 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void botManagementForAZoneUpdateConfigTest() throws ApiException {
        String zoneId = null;
        BotManagementConfigSingle botManagementConfigSingle = null;
        BotManagementBotManagementResponseBody response = api.botManagementForAZoneUpdateConfig(zoneId, botManagementConfigSingle);
        // TODO: test validations
    }

}
