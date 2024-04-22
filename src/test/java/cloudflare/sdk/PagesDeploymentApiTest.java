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
import cloudflare.sdk.models.PagesDeploymentCreateDeployment4XXResponse;
import cloudflare.sdk.models.PagesDeploymentGetDeploymentInfo4XXResponse;
import cloudflare.sdk.models.PagesDeploymentGetDeploymentLogs4XXResponse;
import cloudflare.sdk.models.PagesDeploymentGetDeployments4XXResponse;
import cloudflare.sdk.models.PagesDeploymentListResponse;
import cloudflare.sdk.models.PagesDeploymentNewDeployment;
import cloudflare.sdk.models.PagesDeploymentResponseDetails;
import cloudflare.sdk.models.PagesDeploymentResponseLogs;
import cloudflare.sdk.models.PagesProjectDeleteProject4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PagesDeploymentApi
 */
@Disabled
public class PagesDeploymentApiTest {

    private final PagesDeploymentApi api = new PagesDeploymentApi();

    /**
     * Create deployment
     *
     * Start a new deployment from production. The repository and account must have already been authorized on the Cloudflare Pages dashboard.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pagesDeploymentCreateDeploymentTest() throws ApiException {
        String projectName = null;
        String accountId = null;
        String branch = null;
        PagesDeploymentNewDeployment response = api.pagesDeploymentCreateDeployment(projectName, accountId, branch);
        // TODO: test validations
    }

    /**
     * Delete deployment
     *
     * Delete a deployment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pagesDeploymentDeleteDeploymentTest() throws ApiException {
        String deploymentId = null;
        String projectName = null;
        String accountId = null;
        Object response = api.pagesDeploymentDeleteDeployment(deploymentId, projectName, accountId);
        // TODO: test validations
    }

    /**
     * Get deployment info
     *
     * Fetch information about a deployment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pagesDeploymentGetDeploymentInfoTest() throws ApiException {
        String deploymentId = null;
        String projectName = null;
        String accountId = null;
        PagesDeploymentResponseDetails response = api.pagesDeploymentGetDeploymentInfo(deploymentId, projectName, accountId);
        // TODO: test validations
    }

    /**
     * Get deployment logs
     *
     * Fetch deployment logs for a project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pagesDeploymentGetDeploymentLogsTest() throws ApiException {
        String deploymentId = null;
        String projectName = null;
        String accountId = null;
        PagesDeploymentResponseLogs response = api.pagesDeploymentGetDeploymentLogs(deploymentId, projectName, accountId);
        // TODO: test validations
    }

    /**
     * Get deployments
     *
     * Fetch a list of project deployments.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pagesDeploymentGetDeploymentsTest() throws ApiException {
        String projectName = null;
        String accountId = null;
        String env = null;
        PagesDeploymentListResponse response = api.pagesDeploymentGetDeployments(projectName, accountId, env);
        // TODO: test validations
    }

    /**
     * Retry deployment
     *
     * Retry a previous deployment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pagesDeploymentRetryDeploymentTest() throws ApiException {
        String deploymentId = null;
        String projectName = null;
        String accountId = null;
        PagesDeploymentNewDeployment response = api.pagesDeploymentRetryDeployment(deploymentId, projectName, accountId);
        // TODO: test validations
    }

    /**
     * Rollback deployment
     *
     * Rollback the production deployment to a previous deployment. You can only rollback to succesful builds on production.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pagesDeploymentRollbackDeploymentTest() throws ApiException {
        String deploymentId = null;
        String projectName = null;
        String accountId = null;
        PagesDeploymentResponseDetails response = api.pagesDeploymentRollbackDeployment(deploymentId, projectName, accountId);
        // TODO: test validations
    }

}
