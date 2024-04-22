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
import org.openapitools.client.model.DataZoneAnalyticsApiColoResponse;
import org.openapitools.client.model.DataZoneAnalyticsApiDashboardResponse;
import org.openapitools.client.model.DataZoneAnalyticsApiUntil;
import org.openapitools.client.model.ZoneAnalyticsDeprecatedGetAnalyticsByCoLocations4XXResponse;
import org.openapitools.client.model.ZoneAnalyticsDeprecatedGetAnalyticsByCoLocationsSinceParameter;
import org.openapitools.client.model.ZoneAnalyticsDeprecatedGetDashboard4XXResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ZoneAnalyticsDeprecatedApi
 */
@Disabled
public class ZoneAnalyticsDeprecatedApiTest {

    private final ZoneAnalyticsDeprecatedApi api = new ZoneAnalyticsDeprecatedApi();

    /**
     * Get analytics by Co-locations
     *
     * This view provides a breakdown of analytics data by datacenter. Note: This is available to Enterprise customers only.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zoneAnalyticsDeprecatedGetAnalyticsByCoLocationsTest() throws ApiException {
        String zoneIdentifier = null;
        DataZoneAnalyticsApiUntil until = null;
        ZoneAnalyticsDeprecatedGetAnalyticsByCoLocationsSinceParameter since = null;
        Boolean continuous = null;
        DataZoneAnalyticsApiColoResponse response = api.zoneAnalyticsDeprecatedGetAnalyticsByCoLocations(zoneIdentifier, until, since, continuous);
        // TODO: test validations
    }

    /**
     * Get dashboard
     *
     * The dashboard view provides both totals and timeseries data for the given zone and time period across the entire Cloudflare network.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zoneAnalyticsDeprecatedGetDashboardTest() throws ApiException {
        String zoneIdentifier = null;
        DataZoneAnalyticsApiUntil until = null;
        ZoneAnalyticsDeprecatedGetAnalyticsByCoLocationsSinceParameter since = null;
        Boolean continuous = null;
        DataZoneAnalyticsApiDashboardResponse response = api.zoneAnalyticsDeprecatedGetDashboard(zoneIdentifier, until, since, continuous);
        // TODO: test validations
    }

}