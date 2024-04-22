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
import java.io.File;
import cloudflare.sdk.models.NamespaceWorkerCreateRequest;
import cloudflare.sdk.models.NamespaceWorkerGetScriptBindings200Response;
import cloudflare.sdk.models.NamespaceWorkerGetScriptSecrets200Response;
import cloudflare.sdk.models.NamespaceWorkerGetScriptSettings200Response;
import cloudflare.sdk.models.NamespaceWorkerGetScriptTags200Response;
import cloudflare.sdk.models.NamespaceWorkerPutScriptContentRequestMetadata;
import cloudflare.sdk.models.NamespaceWorkerPutScriptSecrets200Response;
import cloudflare.sdk.models.NamespaceWorkerPutScriptTag200Response;
import cloudflare.sdk.models.NamespaceWorkerPutScriptTags200Response;
import cloudflare.sdk.models.NamespaceWorkerScriptUploadWorkerModule200Response;
import cloudflare.sdk.models.NamespaceWorkerScriptUploadWorkerModule4XXResponse;
import cloudflare.sdk.models.NamespaceWorkerScriptUploadWorkerModuleRequest;
import cloudflare.sdk.models.WorkersApiResponseCommon;
import cloudflare.sdk.models.WorkersNamespaceDeleteResponse;
import cloudflare.sdk.models.WorkersNamespaceListResponse;
import cloudflare.sdk.models.WorkersNamespaceScriptResponseSingle;
import cloudflare.sdk.models.WorkersNamespaceSingleResponse;
import cloudflare.sdk.models.WorkersScriptAndVersionSettingsItem;
import cloudflare.sdk.models.WorkersScriptResponseSingle;
import cloudflare.sdk.models.WorkersSecret;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkersForPlatformsApi
 */
@Disabled
public class WorkersForPlatformsApiTest {

    private final WorkersForPlatformsApi api = new WorkersForPlatformsApi();

    /**
     * Create dispatch namespace
     *
     * Create a new Workers for Platforms namespace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerCreateTest() throws ApiException {
        String accountId = null;
        NamespaceWorkerCreateRequest namespaceWorkerCreateRequest = null;
        WorkersNamespaceSingleResponse response = api.namespaceWorkerCreate(accountId, namespaceWorkerCreateRequest);
        // TODO: test validations
    }

    /**
     * Delete dispatch namespace
     *
     * Delete a Workers for Platforms namespace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerDeleteNamespaceTest() throws ApiException {
        String accountId = null;
        String dispatchNamespace = null;
        WorkersNamespaceDeleteResponse response = api.namespaceWorkerDeleteNamespace(accountId, dispatchNamespace);
        // TODO: test validations
    }

    /**
     * Delete Script Tag
     *
     * Delete script tag for a script uploaded to a Workers for Platforms namespace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerDeleteScriptTagTest() throws ApiException {
        String accountId = null;
        String dispatchNamespace = null;
        String scriptName = null;
        String tag = null;
        NamespaceWorkerPutScriptTag200Response response = api.namespaceWorkerDeleteScriptTag(accountId, dispatchNamespace, scriptName, tag);
        // TODO: test validations
    }

    /**
     * Get dispatch namespace
     *
     * Get a Workers for Platforms namespace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerGetNamespaceTest() throws ApiException {
        String accountId = null;
        String dispatchNamespace = null;
        WorkersNamespaceSingleResponse response = api.namespaceWorkerGetNamespace(accountId, dispatchNamespace);
        // TODO: test validations
    }

    /**
     * Get Script Bindings
     *
     * Fetch script bindings from a script uploaded to a Workers for Platforms namespace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerGetScriptBindingsTest() throws ApiException {
        String accountId = null;
        String dispatchNamespace = null;
        String scriptName = null;
        NamespaceWorkerGetScriptBindings200Response response = api.namespaceWorkerGetScriptBindings(accountId, dispatchNamespace, scriptName);
        // TODO: test validations
    }

    /**
     * Get Script Content
     *
     * Fetch script content from a script uploaded to a Workers for Platforms namespace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerGetScriptContentTest() throws ApiException {
        String accountId = null;
        String dispatchNamespace = null;
        String scriptName = null;
        Object response = api.namespaceWorkerGetScriptContent(accountId, dispatchNamespace, scriptName);
        // TODO: test validations
    }

    /**
     * Get Script Secrets
     *
     * Fetch secrets from a script uploaded to a Workers for Platforms namespace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerGetScriptSecretsTest() throws ApiException {
        String accountId = null;
        String dispatchNamespace = null;
        String scriptName = null;
        NamespaceWorkerGetScriptSecrets200Response response = api.namespaceWorkerGetScriptSecrets(accountId, dispatchNamespace, scriptName);
        // TODO: test validations
    }

    /**
     * Get Script Settings
     *
     * Get script settings from a script uploaded to a Workers for Platforms namespace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerGetScriptSettingsTest() throws ApiException {
        String accountId = null;
        String dispatchNamespace = null;
        String scriptName = null;
        NamespaceWorkerGetScriptSettings200Response response = api.namespaceWorkerGetScriptSettings(accountId, dispatchNamespace, scriptName);
        // TODO: test validations
    }

    /**
     * Get Script Tags
     *
     * Fetch tags from a script uploaded to a Workers for Platforms namespace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerGetScriptTagsTest() throws ApiException {
        String accountId = null;
        String dispatchNamespace = null;
        String scriptName = null;
        NamespaceWorkerGetScriptTags200Response response = api.namespaceWorkerGetScriptTags(accountId, dispatchNamespace, scriptName);
        // TODO: test validations
    }

    /**
     * List dispatch namespaces
     *
     * Fetch a list of Workers for Platforms namespaces.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerListTest() throws ApiException {
        String accountId = null;
        WorkersNamespaceListResponse response = api.namespaceWorkerList(accountId);
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
    public void namespaceWorkerPatchScriptSettingsTest() throws ApiException {
        String accountId = null;
        String dispatchNamespace = null;
        String scriptName = null;
        WorkersScriptAndVersionSettingsItem settings = null;
        NamespaceWorkerGetScriptSettings200Response response = api.namespaceWorkerPatchScriptSettings(accountId, dispatchNamespace, scriptName, settings);
        // TODO: test validations
    }

    /**
     * Put Script Content
     *
     * Put script content for a script uploaded to a Workers for Platforms namespace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerPutScriptContentTest() throws ApiException {
        String accountId = null;
        String dispatchNamespace = null;
        String scriptName = null;
        String CF_WORKER_BODY_PART = null;
        String CF_WORKER_MAIN_MODULE_PART = null;
        List<File> lessThanAnyPartNameGreaterThan = null;
        NamespaceWorkerPutScriptContentRequestMetadata metadata = null;
        WorkersScriptResponseSingle response = api.namespaceWorkerPutScriptContent(accountId, dispatchNamespace, scriptName, CF_WORKER_BODY_PART, CF_WORKER_MAIN_MODULE_PART, lessThanAnyPartNameGreaterThan, metadata);
        // TODO: test validations
    }

    /**
     * Put Script Secrets
     *
     * Put secrets to a script uploaded to a Workers for Platforms namespace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerPutScriptSecretsTest() throws ApiException {
        String accountId = null;
        String dispatchNamespace = null;
        String scriptName = null;
        WorkersSecret workersSecret = null;
        NamespaceWorkerPutScriptSecrets200Response response = api.namespaceWorkerPutScriptSecrets(accountId, dispatchNamespace, scriptName, workersSecret);
        // TODO: test validations
    }

    /**
     * Put Script Tag
     *
     * Put a single tag on a script uploaded to a Workers for Platforms namespace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerPutScriptTagTest() throws ApiException {
        String accountId = null;
        String dispatchNamespace = null;
        String scriptName = null;
        String tag = null;
        NamespaceWorkerPutScriptTag200Response response = api.namespaceWorkerPutScriptTag(accountId, dispatchNamespace, scriptName, tag);
        // TODO: test validations
    }

    /**
     * Put Script Tags
     *
     * Put script tags for a script uploaded to a Workers for Platforms namespace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerPutScriptTagsTest() throws ApiException {
        String accountId = null;
        String dispatchNamespace = null;
        String scriptName = null;
        List<String> requestBody = null;
        NamespaceWorkerPutScriptTags200Response response = api.namespaceWorkerPutScriptTags(accountId, dispatchNamespace, scriptName, requestBody);
        // TODO: test validations
    }

    /**
     * Delete Worker
     *
     * Delete a worker from a Workers for Platforms namespace. This call has no response body on a successful delete.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerScriptDeleteWorkerTest() throws ApiException {
        String accountId = null;
        String dispatchNamespace = null;
        String scriptName = null;
        Boolean force = null;
        api.namespaceWorkerScriptDeleteWorker(accountId, dispatchNamespace, scriptName, force);
        // TODO: test validations
    }

    /**
     * Upload Worker Module
     *
     * Upload a worker module to a Workers for Platforms namespace. You can find an example of the metadata on our docs: https://developers.cloudflare.com/cloudflare-for-platforms/workers-for-platforms/reference/metadata/
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerScriptUploadWorkerModuleTest() throws ApiException {
        String accountId = null;
        String dispatchNamespace = null;
        String scriptName = null;
        String body = null;
        NamespaceWorkerScriptUploadWorkerModule200Response response = api.namespaceWorkerScriptUploadWorkerModule(accountId, dispatchNamespace, scriptName, body);
        // TODO: test validations
    }

    /**
     * Worker Details
     *
     * Fetch information about a script uploaded to a Workers for Platforms namespace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void namespaceWorkerScriptWorkerDetailsTest() throws ApiException {
        String accountId = null;
        String dispatchNamespace = null;
        String scriptName = null;
        WorkersNamespaceScriptResponseSingle response = api.namespaceWorkerScriptWorkerDetails(accountId, dispatchNamespace, scriptName);
        // TODO: test validations
    }

}
