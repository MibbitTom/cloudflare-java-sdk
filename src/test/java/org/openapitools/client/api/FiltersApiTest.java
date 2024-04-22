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
import java.math.BigDecimal;
import org.openapitools.client.model.FiltersDeleteAFilter4XXResponse;
import org.openapitools.client.model.FiltersDeleteFilters4XXResponse;
import org.openapitools.client.model.FiltersDeleteFiltersRequest;
import org.openapitools.client.model.FiltersGetAFilter4XXResponse;
import org.openapitools.client.model.FiltersListFilters4XXResponse;
import org.openapitools.client.model.FirewallFilterDeleteResponseCollection;
import org.openapitools.client.model.FirewallFilterDeleteResponseSingle;
import org.openapitools.client.model.FirewallFilterResponseCollection;
import org.openapitools.client.model.FirewallFilterResponseSingle;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FiltersApi
 */
@Disabled
public class FiltersApiTest {

    private final FiltersApi api = new FiltersApi();

    /**
     * Create filters
     *
     * Creates one or more filters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void filtersCreateFiltersTest() throws ApiException {
        String zoneIdentifier = null;
        Object body = null;
        FirewallFilterResponseCollection response = api.filtersCreateFilters(zoneIdentifier, body);
        // TODO: test validations
    }

    /**
     * Delete a filter
     *
     * Deletes an existing filter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void filtersDeleteAFilterTest() throws ApiException {
        String id = null;
        String zoneIdentifier = null;
        FirewallFilterDeleteResponseSingle response = api.filtersDeleteAFilter(id, zoneIdentifier);
        // TODO: test validations
    }

    /**
     * Delete filters
     *
     * Deletes one or more existing filters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void filtersDeleteFiltersTest() throws ApiException {
        String zoneIdentifier = null;
        FiltersDeleteFiltersRequest filtersDeleteFiltersRequest = null;
        FirewallFilterDeleteResponseCollection response = api.filtersDeleteFilters(zoneIdentifier, filtersDeleteFiltersRequest);
        // TODO: test validations
    }

    /**
     * Get a filter
     *
     * Fetches the details of a filter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void filtersGetAFilterTest() throws ApiException {
        String id = null;
        String zoneIdentifier = null;
        FirewallFilterResponseSingle response = api.filtersGetAFilter(id, zoneIdentifier);
        // TODO: test validations
    }

    /**
     * List filters
     *
     * Fetches filters in a zone. You can filter the results using several optional parameters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void filtersListFiltersTest() throws ApiException {
        String zoneIdentifier = null;
        Boolean paused = null;
        String expression = null;
        String description = null;
        String ref = null;
        BigDecimal page = null;
        BigDecimal perPage = null;
        String id = null;
        FirewallFilterResponseCollection response = api.filtersListFilters(zoneIdentifier, paused, expression, description, ref, page, perPage, id);
        // TODO: test validations
    }

    /**
     * Update a filter
     *
     * Updates an existing filter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void filtersUpdateAFilterTest() throws ApiException {
        String id = null;
        String zoneIdentifier = null;
        Object body = null;
        FirewallFilterResponseSingle response = api.filtersUpdateAFilter(id, zoneIdentifier, body);
        // TODO: test validations
    }

    /**
     * Update filters
     *
     * Updates one or more existing filters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void filtersUpdateFiltersTest() throws ApiException {
        String zoneIdentifier = null;
        Object body = null;
        FirewallFilterResponseCollection response = api.filtersUpdateFilters(zoneIdentifier, body);
        // TODO: test validations
    }

}
