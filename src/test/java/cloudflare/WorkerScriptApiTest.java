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
import java.io.File;
import org.openapitools.client.model.NamespaceWorkerPutScriptContentRequestMetadata;
import org.openapitools.client.model.NamespaceWorkerScriptUploadWorkerModule200Response;
import org.openapitools.client.model.NamespaceWorkerScriptUploadWorkerModule4XXResponse;
import org.openapitools.client.model.NamespaceWorkerScriptUploadWorkerModuleRequest;
import org.openapitools.client.model.WorkerScriptFetchUsageModel4XXResponse;
import org.openapitools.client.model.WorkerScriptListWorkers4XXResponse;
import org.openapitools.client.model.WorkersApiResponseCommon;
import org.openapitools.client.model.WorkersApiResponseCommonFailure;
import org.openapitools.client.model.WorkersScriptAndVersionSettingsItem;
import org.openapitools.client.model.WorkersScriptAndVersionSettingsResponse;
import org.openapitools.client.model.WorkersScriptResponseCollection;
import org.openapitools.client.model.WorkersScriptResponseSingle;
import org.openapitools.client.model.WorkersScriptSettingsItem;
import org.openapitools.client.model.WorkersScriptSettingsResponse;
import org.openapitools.client.model.WorkersUsageModelResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkerScriptApi
 */
@Disabled
public class WorkerScriptApiTest {

    private final WorkerScriptApi api = new WorkerScriptApi();

    /**
     * Delete Worker
     *
     * Delete your worker. This call has no response body on a successful delete.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerScriptDeleteWorkerTest() throws ApiException {
        String scriptName = null;
        String accountId = null;
        Boolean force = null;
        api.workerScriptDeleteWorker(scriptName, accountId, force);
        // TODO: test validations
    }

    /**
     * Download Worker
     *
     * Fetch raw script content for your worker. Note this is the original script content, not JSON encoded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerScriptDownloadWorkerTest() throws ApiException {
        String scriptName = null;
        String accountId = null;
        Object response = api.workerScriptDownloadWorker(scriptName, accountId);
        // TODO: test validations
    }

    /**
     * Fetch Usage Model
     *
     * Fetches the Usage Model for a given Worker.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerScriptFetchUsageModelTest() throws ApiException {
        String scriptName = null;
        String accountId = null;
        WorkersUsageModelResponse response = api.workerScriptFetchUsageModel(scriptName, accountId);
        // TODO: test validations
    }

    /**
     * Get script content
     *
     * Fetch script content only
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerScriptGetContentTest() throws ApiException {
        String accountId = null;
        String scriptName = null;
        Object response = api.workerScriptGetContent(accountId, scriptName);
        // TODO: test validations
    }

    /**
     * Get Settings
     *
     * Get metadata and config, such as bindings or usage model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerScriptGetSettingsTest() throws ApiException {
        String accountId = null;
        String scriptName = null;
        WorkersScriptAndVersionSettingsResponse response = api.workerScriptGetSettings(accountId, scriptName);
        // TODO: test validations
    }

    /**
     * List Workers
     *
     * Fetch a list of uploaded workers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerScriptListWorkersTest() throws ApiException {
        String accountId = null;
        WorkersScriptResponseCollection response = api.workerScriptListWorkers(accountId);
        // TODO: test validations
    }

    /**
     * Patch Settings
     *
     * Patch metadata or config, such as bindings or usage model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerScriptPatchSettingsTest() throws ApiException {
        String accountId = null;
        String scriptName = null;
        WorkersScriptAndVersionSettingsItem settings = null;
        WorkersScriptAndVersionSettingsResponse response = api.workerScriptPatchSettings(accountId, scriptName, settings);
        // TODO: test validations
    }

    /**
     * Put script content
     *
     * Put script content without touching config or metadata
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerScriptPutContentTest() throws ApiException {
        String accountId = null;
        String scriptName = null;
        String CF_WORKER_BODY_PART = null;
        String CF_WORKER_MAIN_MODULE_PART = null;
        List<File> lessThanAnyPartNameGreaterThan = null;
        NamespaceWorkerPutScriptContentRequestMetadata metadata = null;
        WorkersScriptResponseSingle response = api.workerScriptPutContent(accountId, scriptName, CF_WORKER_BODY_PART, CF_WORKER_MAIN_MODULE_PART, lessThanAnyPartNameGreaterThan, metadata);
        // TODO: test validations
    }

    /**
     * Get Script Settings
     *
     * Get script-level settings when using [Worker Versions](https://developers.cloudflare.com/api/operations/worker-versions-list-versions). Includes Logpush and Tail Consumers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerScriptSettingsGetSettingsTest() throws ApiException {
        String accountId = null;
        String scriptName = null;
        WorkersScriptSettingsResponse response = api.workerScriptSettingsGetSettings(accountId, scriptName);
        // TODO: test validations
    }

    /**
     * Patch Script Settings
     *
     * Patch script-level settings when using [Worker Versions](https://developers.cloudflare.com/api/operations/worker-versions-list-versions). Includes Logpush and Tail Consumers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerScriptSettingsPatchSettingsTest() throws ApiException {
        String accountId = null;
        String scriptName = null;
        WorkersScriptSettingsItem workersScriptSettingsItem = null;
        WorkersScriptSettingsResponse response = api.workerScriptSettingsPatchSettings(accountId, scriptName, workersScriptSettingsItem);
        // TODO: test validations
    }

    /**
     * Update Usage Model
     *
     * Updates the Usage Model for a given Worker. Requires a Workers Paid subscription.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerScriptUpdateUsageModelTest() throws ApiException {
        String scriptName = null;
        String accountId = null;
        Object body = null;
        WorkersUsageModelResponse response = api.workerScriptUpdateUsageModel(scriptName, accountId, body);
        // TODO: test validations
    }

    /**
     * Upload Worker Module
     *
     * Upload a worker module.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workerScriptUploadWorkerModuleTest() throws ApiException {
        String scriptName = null;
        String accountId = null;
        String body = null;
        String rollbackTo = null;
        NamespaceWorkerScriptUploadWorkerModule200Response response = api.workerScriptUploadWorkerModule(scriptName, accountId, body, rollbackTo);
        // TODO: test validations
    }

}