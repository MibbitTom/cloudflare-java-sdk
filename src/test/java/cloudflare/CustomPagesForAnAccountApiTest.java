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
import org.openapitools.client.model.CustomPagesCustomPagesResponseCollection;
import org.openapitools.client.model.CustomPagesCustomPagesResponseSingle;
import org.openapitools.client.model.CustomPagesForAnAccountGetACustomPage4xxResponse;
import org.openapitools.client.model.CustomPagesForAnAccountListCustomPages4xxResponse;
import org.openapitools.client.model.CustomPagesForAnAccountUpdateACustomPageRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomPagesForAnAccountApi
 */
@Disabled
public class CustomPagesForAnAccountApiTest {

    private final CustomPagesForAnAccountApi api = new CustomPagesForAnAccountApi();

    /**
     * Get a custom page
     *
     * Fetches the details of a custom page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customPagesForAnAccountGetACustomPageTest() throws ApiException {
        String identifier = null;
        String accountIdentifier = null;
        CustomPagesCustomPagesResponseSingle response = api.customPagesForAnAccountGetACustomPage(identifier, accountIdentifier);
        // TODO: test validations
    }

    /**
     * List custom pages
     *
     * Fetches all the custom pages at the account level.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customPagesForAnAccountListCustomPagesTest() throws ApiException {
        String accountIdentifier = null;
        CustomPagesCustomPagesResponseCollection response = api.customPagesForAnAccountListCustomPages(accountIdentifier);
        // TODO: test validations
    }

    /**
     * Update a custom page
     *
     * Updates the configuration of an existing custom page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customPagesForAnAccountUpdateACustomPageTest() throws ApiException {
        String identifier = null;
        String accountIdentifier = null;
        CustomPagesForAnAccountUpdateACustomPageRequest customPagesForAnAccountUpdateACustomPageRequest = null;
        CustomPagesCustomPagesResponseSingle response = api.customPagesForAnAccountUpdateACustomPage(identifier, accountIdentifier, customPagesForAnAccountUpdateACustomPageRequest);
        // TODO: test validations
    }

}
