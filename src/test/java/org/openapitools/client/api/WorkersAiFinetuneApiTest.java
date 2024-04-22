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
import java.io.File;
import org.openapitools.client.model.WorkersAiCreateFinetune200Response;
import org.openapitools.client.model.WorkersAiCreateFinetune400Response;
import org.openapitools.client.model.WorkersAiCreateFinetuneRequest;
import org.openapitools.client.model.WorkersAiListFinetunes200Response;
import org.openapitools.client.model.WorkersAiListFinetunes400Response;
import org.openapitools.client.model.WorkersAiUploadFinetuneAsset200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkersAiFinetuneApi
 */
@Disabled
public class WorkersAiFinetuneApiTest {

    private final WorkersAiFinetuneApi api = new WorkersAiFinetuneApi();

    /**
     * Create a new Finetune
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiCreateFinetuneTest() throws ApiException {
        Integer accountId = null;
        WorkersAiCreateFinetuneRequest workersAiCreateFinetuneRequest = null;
        WorkersAiCreateFinetune200Response response = api.workersAiCreateFinetune(accountId, workersAiCreateFinetuneRequest);
        // TODO: test validations
    }

    /**
     * List Finetunes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiListFinetunesTest() throws ApiException {
        Integer accountId = null;
        WorkersAiListFinetunes200Response response = api.workersAiListFinetunes(accountId);
        // TODO: test validations
    }

    /**
     * Upload a Finetune Asset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workersAiUploadFinetuneAssetTest() throws ApiException {
        Integer accountId = null;
        String finetuneId = null;
        File _file = null;
        String fileName = null;
        WorkersAiUploadFinetuneAsset200Response response = api.workersAiUploadFinetuneAsset(accountId, finetuneId, _file, fileName);
        // TODO: test validations
    }

}
