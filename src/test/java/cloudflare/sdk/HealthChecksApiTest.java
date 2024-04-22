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
import cloudflare.sdk.models.HealthChecksCreateHealthCheck4XXResponse;
import cloudflare.sdk.models.HealthChecksDeletePreviewHealthCheck4XXResponse;
import cloudflare.sdk.models.HealthChecksListHealthChecks4XXResponse;
import cloudflare.sdk.models.HealthchecksIdResponse;
import cloudflare.sdk.models.HealthchecksQueryHealthcheck;
import cloudflare.sdk.models.HealthchecksResponseCollection;
import cloudflare.sdk.models.HealthchecksSingleResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HealthChecksApi
 */
@Disabled
public class HealthChecksApiTest {

    private final HealthChecksApi api = new HealthChecksApi();

    /**
     * Create Health Check
     *
     * Create a new health check.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void healthChecksCreateHealthCheckTest() throws ApiException {
        String zoneId = null;
        HealthchecksQueryHealthcheck healthchecksQueryHealthcheck = null;
        HealthchecksSingleResponse response = api.healthChecksCreateHealthCheck(zoneId, healthchecksQueryHealthcheck);
        // TODO: test validations
    }

    /**
     * Create Preview Health Check
     *
     * Create a new preview health check.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void healthChecksCreatePreviewHealthCheckTest() throws ApiException {
        String zoneId = null;
        HealthchecksQueryHealthcheck healthchecksQueryHealthcheck = null;
        HealthchecksSingleResponse response = api.healthChecksCreatePreviewHealthCheck(zoneId, healthchecksQueryHealthcheck);
        // TODO: test validations
    }

    /**
     * Delete Health Check
     *
     * Delete a health check.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void healthChecksDeleteHealthCheckTest() throws ApiException {
        String healthcheckId = null;
        String zoneId = null;
        HealthchecksIdResponse response = api.healthChecksDeleteHealthCheck(healthcheckId, zoneId);
        // TODO: test validations
    }

    /**
     * Delete Preview Health Check
     *
     * Delete a health check.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void healthChecksDeletePreviewHealthCheckTest() throws ApiException {
        String healthcheckId = null;
        String zoneId = null;
        HealthchecksIdResponse response = api.healthChecksDeletePreviewHealthCheck(healthcheckId, zoneId);
        // TODO: test validations
    }

    /**
     * Health Check Details
     *
     * Fetch a single configured health check.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void healthChecksHealthCheckDetailsTest() throws ApiException {
        String healthcheckId = null;
        String zoneId = null;
        HealthchecksSingleResponse response = api.healthChecksHealthCheckDetails(healthcheckId, zoneId);
        // TODO: test validations
    }

    /**
     * Health Check Preview Details
     *
     * Fetch a single configured health check preview.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void healthChecksHealthCheckPreviewDetailsTest() throws ApiException {
        String healthcheckId = null;
        String zoneId = null;
        HealthchecksSingleResponse response = api.healthChecksHealthCheckPreviewDetails(healthcheckId, zoneId);
        // TODO: test validations
    }

    /**
     * List Health Checks
     *
     * List configured health checks.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void healthChecksListHealthChecksTest() throws ApiException {
        String zoneId = null;
        Object page = null;
        Object perPage = null;
        HealthchecksResponseCollection response = api.healthChecksListHealthChecks(zoneId, page, perPage);
        // TODO: test validations
    }

    /**
     * Patch Health Check
     *
     * Patch a configured health check.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void healthChecksPatchHealthCheckTest() throws ApiException {
        String healthcheckId = null;
        String zoneId = null;
        HealthchecksQueryHealthcheck healthchecksQueryHealthcheck = null;
        HealthchecksSingleResponse response = api.healthChecksPatchHealthCheck(healthcheckId, zoneId, healthchecksQueryHealthcheck);
        // TODO: test validations
    }

    /**
     * Update Health Check
     *
     * Update a configured health check.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void healthChecksUpdateHealthCheckTest() throws ApiException {
        String healthcheckId = null;
        String zoneId = null;
        HealthchecksQueryHealthcheck healthchecksQueryHealthcheck = null;
        HealthchecksSingleResponse response = api.healthChecksUpdateHealthCheck(healthcheckId, zoneId, healthchecksQueryHealthcheck);
        // TODO: test validations
    }

}