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
import org.openapitools.client.model.CreateHyperdrive200Response;
import org.openapitools.client.model.DeleteHyperdrive200Response;
import org.openapitools.client.model.HyperdriveCreateUpdateHyperdriveConfig;
import org.openapitools.client.model.HyperdrivePatchHyperdriveConfig;
import org.openapitools.client.model.ListHyperdrive200Response;
import org.openapitools.client.model.ListHyperdrive4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HyperdriveApi
 */
@Disabled
public class HyperdriveApiTest {

    private final HyperdriveApi api = new HyperdriveApi();

    /**
     * Create Hyperdrive
     *
     * Creates and returns a new Hyperdrive configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createHyperdriveTest() throws ApiException {
        String accountId = null;
        HyperdriveCreateUpdateHyperdriveConfig hyperdriveCreateUpdateHyperdriveConfig = null;
        CreateHyperdrive200Response response = api.createHyperdrive(accountId, hyperdriveCreateUpdateHyperdriveConfig);
        // TODO: test validations
    }

    /**
     * Delete Hyperdrive
     *
     * Deletes the specified Hyperdrive.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteHyperdriveTest() throws ApiException {
        String accountId = null;
        String hyperdriveId = null;
        DeleteHyperdrive200Response response = api.deleteHyperdrive(accountId, hyperdriveId);
        // TODO: test validations
    }

    /**
     * Get Hyperdrive
     *
     * Returns the specified Hyperdrive configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHyperdriveTest() throws ApiException {
        String accountId = null;
        String hyperdriveId = null;
        CreateHyperdrive200Response response = api.getHyperdrive(accountId, hyperdriveId);
        // TODO: test validations
    }

    /**
     * List Hyperdrives
     *
     * Returns a list of Hyperdrives
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listHyperdriveTest() throws ApiException {
        String accountId = null;
        ListHyperdrive200Response response = api.listHyperdrive(accountId);
        // TODO: test validations
    }

    /**
     * Patch Hyperdrive
     *
     * Patches and returns the specified Hyperdrive configuration. Updates to the origin and caching settings are applied with an all-or-nothing approach.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchHyperdriveTest() throws ApiException {
        String accountId = null;
        String hyperdriveId = null;
        HyperdrivePatchHyperdriveConfig hyperdrivePatchHyperdriveConfig = null;
        CreateHyperdrive200Response response = api.patchHyperdrive(accountId, hyperdriveId, hyperdrivePatchHyperdriveConfig);
        // TODO: test validations
    }

    /**
     * Update Hyperdrive
     *
     * Updates and returns the specified Hyperdrive configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateHyperdriveTest() throws ApiException {
        String accountId = null;
        String hyperdriveId = null;
        HyperdriveCreateUpdateHyperdriveConfig hyperdriveCreateUpdateHyperdriveConfig = null;
        CreateHyperdrive200Response response = api.updateHyperdrive(accountId, hyperdriveId, hyperdriveCreateUpdateHyperdriveConfig);
        // TODO: test validations
    }

}
