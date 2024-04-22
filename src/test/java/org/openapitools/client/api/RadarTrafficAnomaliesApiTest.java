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
import java.time.OffsetDateTime;
import org.openapitools.client.model.RadarGetTrafficAnomalies200Response;
import org.openapitools.client.model.RadarGetTrafficAnomaliesTop200Response;
import org.openapitools.client.model.WorkersAiListFinetunes400Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RadarTrafficAnomaliesApi
 */
@Disabled
public class RadarTrafficAnomaliesApiTest {

    private final RadarTrafficAnomaliesApi api = new RadarTrafficAnomaliesApi();

    /**
     * Get latest Internet traffic anomalies.
     *
     * Internet traffic anomalies are signals that might point to an outage,         These alerts are automatically detected by Radar and then manually verified by our team.         This endpoint returns the latest alerts.         
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarGetTrafficAnomaliesTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String dateRange = null;
        OffsetDateTime dateStart = null;
        OffsetDateTime dateEnd = null;
        String status = null;
        Integer asn = null;
        String location = null;
        String format = null;
        RadarGetTrafficAnomalies200Response response = api.radarGetTrafficAnomalies(limit, offset, dateRange, dateStart, dateEnd, status, asn, location, format);
        // TODO: test validations
    }

    /**
     * Get top locations by total traffic anomalies generated.
     *
     * Internet traffic anomalies are signals that might point to an outage,         These alerts are automatically detected by Radar and then manually verified by our team.         This endpoint returns the sum of alerts grouped by location.         
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarGetTrafficAnomaliesTopTest() throws ApiException {
        Integer limit = null;
        String dateRange = null;
        OffsetDateTime dateStart = null;
        OffsetDateTime dateEnd = null;
        String status = null;
        String format = null;
        RadarGetTrafficAnomaliesTop200Response response = api.radarGetTrafficAnomaliesTop(limit, dateRange, dateStart, dateEnd, status, format);
        // TODO: test validations
    }

}
