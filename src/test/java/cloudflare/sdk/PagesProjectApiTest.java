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
import cloudflare.sdk.models.PagesNewProjectResponse;
import cloudflare.sdk.models.PagesProjectCreateProject4XXResponse;
import cloudflare.sdk.models.PagesProjectDeleteProject4XXResponse;
import cloudflare.sdk.models.PagesProjectGetProject4XXResponse;
import cloudflare.sdk.models.PagesProjectGetProjects4XXResponse;
import cloudflare.sdk.models.PagesProjectResponse;
import cloudflare.sdk.models.PagesProjects;
import cloudflare.sdk.models.PagesProjectsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PagesProjectApi
 */
@Disabled
public class PagesProjectApiTest {

    private final PagesProjectApi api = new PagesProjectApi();

    /**
     * Create project
     *
     * Create a new project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pagesProjectCreateProjectTest() throws ApiException {
        String accountId = null;
        PagesProjects pagesProjects = null;
        PagesNewProjectResponse response = api.pagesProjectCreateProject(accountId, pagesProjects);
        // TODO: test validations
    }

    /**
     * Delete project
     *
     * Delete a project by name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pagesProjectDeleteProjectTest() throws ApiException {
        String projectName = null;
        String accountId = null;
        Object response = api.pagesProjectDeleteProject(projectName, accountId);
        // TODO: test validations
    }

    /**
     * Get project
     *
     * Fetch a project by name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pagesProjectGetProjectTest() throws ApiException {
        String projectName = null;
        String accountId = null;
        PagesProjectResponse response = api.pagesProjectGetProject(projectName, accountId);
        // TODO: test validations
    }

    /**
     * Get projects
     *
     * Fetch a list of all user projects.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pagesProjectGetProjectsTest() throws ApiException {
        String accountId = null;
        PagesProjectsResponse response = api.pagesProjectGetProjects(accountId);
        // TODO: test validations
    }

    /**
     * Update project
     *
     * Set new attributes for an existing project. Modify environment variables. To delete an environment variable, set the key to null.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pagesProjectUpdateProjectTest() throws ApiException {
        String projectName = null;
        String accountId = null;
        Object body = null;
        PagesNewProjectResponse response = api.pagesProjectUpdateProject(projectName, accountId, body);
        // TODO: test validations
    }

}