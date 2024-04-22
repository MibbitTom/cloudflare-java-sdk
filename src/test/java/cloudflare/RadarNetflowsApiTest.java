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
import org.openapitools.client.model.RadarGetDnsAs112Timeseries200Response;
import org.openapitools.client.model.RadarGetNetflowsTopAses200Response;
import org.openapitools.client.model.RadarGetNetflowsTopLocations200Response;
import org.openapitools.client.model.WorkersAiListFinetunes400Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RadarNetflowsApi
 */
@Disabled
public class RadarNetflowsApiTest {

    private final RadarNetflowsApi api = new RadarNetflowsApi();

    /**
     * Get NetFlows Time Series
     *
     * Get network traffic change over time. Visit https://en.wikipedia.org/wiki/NetFlow for more information on NetFlows. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarGetNetflowsTimeseriesTest() throws ApiException {
        String aggInterval = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> product = null;
        List<String> asn = null;
        List<String> location = null;
        List<String> continent = null;
        String normalization = null;
        String format = null;
        RadarGetDnsAs112Timeseries200Response response = api.radarGetNetflowsTimeseries(aggInterval, name, dateRange, dateStart, dateEnd, product, asn, location, continent, normalization, format);
        // TODO: test validations
    }

    /**
     * Get Top Autonomous Systems By Network Traffic
     *
     * Get the top autonomous systems (AS) by network traffic (NetFlows) over a given time period. Visit https://en.wikipedia.org/wiki/NetFlow for more information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarGetNetflowsTopAsesTest() throws ApiException {
        Integer limit = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        List<String> continent = null;
        String format = null;
        RadarGetNetflowsTopAses200Response response = api.radarGetNetflowsTopAses(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
        // TODO: test validations
    }

    /**
     * Get Top Locations By Network Traffic
     *
     * Get the top locations by network traffic (NetFlows) over a given time period. Visit https://en.wikipedia.org/wiki/NetFlow for more information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarGetNetflowsTopLocationsTest() throws ApiException {
        Integer limit = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        List<String> continent = null;
        String format = null;
        RadarGetNetflowsTopLocations200Response response = api.radarGetNetflowsTopLocations(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
        // TODO: test validations
    }

}
