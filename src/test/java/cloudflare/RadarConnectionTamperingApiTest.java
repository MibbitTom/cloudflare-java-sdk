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
import java.time.OffsetDateTime;
import org.openapitools.client.model.RadarGetConnectionTamperingSummary200Response;
import org.openapitools.client.model.RadarGetConnectionTamperingTimeseriesGroup200Response;
import org.openapitools.client.model.WorkersAiListFinetunes400Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RadarConnectionTamperingApi
 */
@Disabled
public class RadarConnectionTamperingApiTest {

    private final RadarConnectionTamperingApi api = new RadarConnectionTamperingApi();

    /**
     * Get Connection Tampering Summary
     *
     * Distribution of connection tampering types over a given time period.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarGetConnectionTamperingSummaryTest() throws ApiException {
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        List<String> continent = null;
        String format = null;
        RadarGetConnectionTamperingSummary200Response response = api.radarGetConnectionTamperingSummary(name, dateRange, dateStart, dateEnd, asn, location, continent, format);
        // TODO: test validations
    }

    /**
     * Get Connection Tampering Time Series
     *
     * Distribution of connection tampering types over time.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarGetConnectionTamperingTimeseriesGroupTest() throws ApiException {
        String aggInterval = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        List<String> continent = null;
        String format = null;
        RadarGetConnectionTamperingTimeseriesGroup200Response response = api.radarGetConnectionTamperingTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
        // TODO: test validations
    }

}