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
import org.openapitools.client.model.DeleteAccountsAccountIdentifierLogpushJobsJobIdentifier200Response;
import org.openapitools.client.model.DeleteAccountsAccountIdentifierLogpushJobsJobIdentifier4XXResponse;
import org.openapitools.client.model.DeleteAccountsAccountIdentifierLogpushValidateDestinationExists4XXResponse;
import org.openapitools.client.model.GetAccountsAccountIdentifierLogpushDatasetsDatasetFields4XXResponse;
import org.openapitools.client.model.GetAccountsAccountIdentifierLogpushDatasetsDatasetJobs4XXResponse;
import org.openapitools.client.model.LogpushDestinationExistsResponse;
import org.openapitools.client.model.LogpushGetOwnershipResponse;
import org.openapitools.client.model.LogpushLogpushFieldResponseCollection;
import org.openapitools.client.model.LogpushLogpushJobResponseCollection;
import org.openapitools.client.model.LogpushLogpushJobResponseSingle;
import org.openapitools.client.model.LogpushValidateOwnershipResponse;
import org.openapitools.client.model.LogpushValidateResponse;
import org.openapitools.client.model.PostAccountsAccountIdentifierLogpushJobs4XXResponse;
import org.openapitools.client.model.PostAccountsAccountIdentifierLogpushJobsRequest;
import org.openapitools.client.model.PostAccountsAccountIdentifierLogpushOwnership4XXResponse;
import org.openapitools.client.model.PostAccountsAccountIdentifierLogpushOwnershipRequest;
import org.openapitools.client.model.PostAccountsAccountIdentifierLogpushOwnershipValidate4XXResponse;
import org.openapitools.client.model.PostAccountsAccountIdentifierLogpushOwnershipValidateRequest;
import org.openapitools.client.model.PostAccountsAccountIdentifierLogpushValidateOrigin4XXResponse;
import org.openapitools.client.model.PostAccountsAccountIdentifierLogpushValidateOriginRequest;
import org.openapitools.client.model.PutAccountsAccountIdentifierLogpushJobsJobIdentifierRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LogpushJobsForAnAccountApi
 */
@Disabled
public class LogpushJobsForAnAccountApiTest {

    private final LogpushJobsForAnAccountApi api = new LogpushJobsForAnAccountApi();

    /**
     * Delete Logpush job
     *
     * Deletes a Logpush job.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAccountsAccountIdentifierLogpushJobsJobIdentifierTest() throws ApiException {
        Integer jobId = null;
        String accountId = null;
        DeleteAccountsAccountIdentifierLogpushJobsJobIdentifier200Response response = api.deleteAccountsAccountIdentifierLogpushJobsJobIdentifier(jobId, accountId);
        // TODO: test validations
    }

    /**
     * Check destination exists
     *
     * Checks if there is an existing job with a destination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAccountsAccountIdentifierLogpushValidateDestinationExistsTest() throws ApiException {
        String accountId = null;
        PostAccountsAccountIdentifierLogpushOwnershipRequest postAccountsAccountIdentifierLogpushOwnershipRequest = null;
        LogpushDestinationExistsResponse response = api.deleteAccountsAccountIdentifierLogpushValidateDestinationExists(accountId, postAccountsAccountIdentifierLogpushOwnershipRequest);
        // TODO: test validations
    }

    /**
     * List fields
     *
     * Lists all fields available for a dataset. The response result is an object with key-value pairs, where keys are field names, and values are descriptions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountsAccountIdentifierLogpushDatasetsDatasetFieldsTest() throws ApiException {
        String datasetId = null;
        String accountId = null;
        LogpushLogpushFieldResponseCollection response = api.getAccountsAccountIdentifierLogpushDatasetsDatasetFields(datasetId, accountId);
        // TODO: test validations
    }

    /**
     * List Logpush jobs for a dataset
     *
     * Lists Logpush jobs for an account for a dataset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountsAccountIdentifierLogpushDatasetsDatasetJobsTest() throws ApiException {
        String datasetId = null;
        String accountId = null;
        LogpushLogpushJobResponseCollection response = api.getAccountsAccountIdentifierLogpushDatasetsDatasetJobs(datasetId, accountId);
        // TODO: test validations
    }

    /**
     * List Logpush jobs
     *
     * Lists Logpush jobs for an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountsAccountIdentifierLogpushJobsTest() throws ApiException {
        String accountId = null;
        LogpushLogpushJobResponseCollection response = api.getAccountsAccountIdentifierLogpushJobs(accountId);
        // TODO: test validations
    }

    /**
     * Get Logpush job details
     *
     * Gets the details of a Logpush job.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountsAccountIdentifierLogpushJobsJobIdentifierTest() throws ApiException {
        Integer jobId = null;
        String accountId = null;
        LogpushLogpushJobResponseSingle response = api.getAccountsAccountIdentifierLogpushJobsJobIdentifier(jobId, accountId);
        // TODO: test validations
    }

    /**
     * Create Logpush job
     *
     * Creates a new Logpush job for an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postAccountsAccountIdentifierLogpushJobsTest() throws ApiException {
        String accountId = null;
        PostAccountsAccountIdentifierLogpushJobsRequest postAccountsAccountIdentifierLogpushJobsRequest = null;
        LogpushLogpushJobResponseSingle response = api.postAccountsAccountIdentifierLogpushJobs(accountId, postAccountsAccountIdentifierLogpushJobsRequest);
        // TODO: test validations
    }

    /**
     * Get ownership challenge
     *
     * Gets a new ownership challenge sent to your destination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postAccountsAccountIdentifierLogpushOwnershipTest() throws ApiException {
        String accountId = null;
        PostAccountsAccountIdentifierLogpushOwnershipRequest postAccountsAccountIdentifierLogpushOwnershipRequest = null;
        LogpushGetOwnershipResponse response = api.postAccountsAccountIdentifierLogpushOwnership(accountId, postAccountsAccountIdentifierLogpushOwnershipRequest);
        // TODO: test validations
    }

    /**
     * Validate ownership challenge
     *
     * Validates ownership challenge of the destination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postAccountsAccountIdentifierLogpushOwnershipValidateTest() throws ApiException {
        String accountId = null;
        PostAccountsAccountIdentifierLogpushOwnershipValidateRequest postAccountsAccountIdentifierLogpushOwnershipValidateRequest = null;
        LogpushValidateOwnershipResponse response = api.postAccountsAccountIdentifierLogpushOwnershipValidate(accountId, postAccountsAccountIdentifierLogpushOwnershipValidateRequest);
        // TODO: test validations
    }

    /**
     * Validate origin
     *
     * Validates logpull origin with logpull_options.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postAccountsAccountIdentifierLogpushValidateOriginTest() throws ApiException {
        String accountId = null;
        PostAccountsAccountIdentifierLogpushValidateOriginRequest postAccountsAccountIdentifierLogpushValidateOriginRequest = null;
        LogpushValidateResponse response = api.postAccountsAccountIdentifierLogpushValidateOrigin(accountId, postAccountsAccountIdentifierLogpushValidateOriginRequest);
        // TODO: test validations
    }

    /**
     * Update Logpush job
     *
     * Updates a Logpush job.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putAccountsAccountIdentifierLogpushJobsJobIdentifierTest() throws ApiException {
        Integer jobId = null;
        String accountId = null;
        PutAccountsAccountIdentifierLogpushJobsJobIdentifierRequest putAccountsAccountIdentifierLogpushJobsJobIdentifierRequest = null;
        LogpushLogpushJobResponseSingle response = api.putAccountsAccountIdentifierLogpushJobsJobIdentifier(jobId, accountId, putAccountsAccountIdentifierLogpushJobsJobIdentifierRequest);
        // TODO: test validations
    }

}
