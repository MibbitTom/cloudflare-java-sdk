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
import org.openapitools.client.model.ZoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest;
import org.openapitools.client.model.ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response;
import org.openapitools.client.model.ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OriginPostQuantumApi
 */
@Disabled
public class OriginPostQuantumApiTest {

    private final OriginPostQuantumApi api = new OriginPostQuantumApi();

    /**
     * Change Origin Post-Quantum Encryption setting
     *
     * Instructs Cloudflare to use Post-Quantum (PQ) key agreement algorithms when connecting to your origin. Preferred instructs Cloudflare to opportunistically send a Post-Quantum keyshare in the first message to the origin (for fastest connections when the origin supports and prefers PQ), supported means that PQ algorithms are advertised but only used when requested by the origin, and off means that PQ algorithms are not advertised
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingTest() throws ApiException {
        String zoneId = null;
        ZoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest = null;
        ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response response = api.zoneCacheSettingsChangeOriginPostQuantumEncryptionSetting(zoneId, zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest);
        // TODO: test validations
    }

    /**
     * Get Origin Post-Quantum Encryption setting
     *
     * Instructs Cloudflare to use Post-Quantum (PQ) key agreement algorithms when connecting to your origin. Preferred instructs Cloudflare to opportunistically send a Post-Quantum keyshare in the first message to the origin (for fastest connections when the origin supports and prefers PQ), supported means that PQ algorithms are advertised but only used when requested by the origin, and off means that PQ algorithms are not advertised
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zoneCacheSettingsGetOriginPostQuantumEncryptionSettingTest() throws ApiException {
        String zoneId = null;
        ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response response = api.zoneCacheSettingsGetOriginPostQuantumEncryptionSetting(zoneId);
        // TODO: test validations
    }

}