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
import org.openapitools.client.model.NamespaceWorkerPutScriptContentRequestMetadata;
import org.openapitools.client.model.WorkersApiResponseCommon;
import org.openapitools.client.model.WorkersApiResponseCommonFailure;
import org.openapitools.client.model.WorkersScriptResponseSingle;
import org.openapitools.client.model.WorkersScriptSettingsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkerEnvironmentApi
 */
@Disabled
public class WorkerEnvironmentApiTest {

    private final WorkerEnvironmentApi api = new WorkerEnvironmentApi();

    /**
     * Get script content
     *
     * Get script content from a worker with an environment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerEnvironmentGetScriptContentTest() throws ApiException {
        String accountId = null;
        String serviceName = null;
        String environmentName = null;
        Object response = api.workerEnvironmentGetScriptContent(accountId, serviceName, environmentName);
        // TODO: test validations
    }

    /**
     * Put script content
     *
     * Put script content from a worker with an environment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerEnvironmentPutScriptContentTest() throws ApiException {
        String accountId = null;
        String serviceName = null;
        String environmentName = null;
        String CF_WORKER_BODY_PART = null;
        String CF_WORKER_MAIN_MODULE_PART = null;
        List<File> lessThanAnyPartNameGreaterThan = null;
        NamespaceWorkerPutScriptContentRequestMetadata metadata = null;
        WorkersScriptResponseSingle response = api.workerEnvironmentPutScriptContent(accountId, serviceName, environmentName, CF_WORKER_BODY_PART, CF_WORKER_MAIN_MODULE_PART, lessThanAnyPartNameGreaterThan, metadata);
        // TODO: test validations
    }

    /**
     * Get Script Settings
     *
     * Get script settings from a worker with an environment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerScriptEnvironmentGetSettingsTest() throws ApiException {
        String accountId = null;
        String serviceName = null;
        String environmentName = null;
        WorkersScriptSettingsResponse response = api.workerScriptEnvironmentGetSettings(accountId, serviceName, environmentName);
        // TODO: test validations
    }

    /**
     * Patch Script Settings
     *
     * Patch script metadata, such as bindings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerScriptEnvironmentPatchSettingsTest() throws ApiException {
        String accountId = null;
        String serviceName = null;
        String environmentName = null;
        WorkersScriptSettingsResponse workersScriptSettingsResponse = null;
        WorkersScriptSettingsResponse response = api.workerScriptEnvironmentPatchSettings(accountId, serviceName, environmentName, workersScriptSettingsResponse);
        // TODO: test validations
    }

}
