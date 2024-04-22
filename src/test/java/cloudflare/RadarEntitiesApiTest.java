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
import org.openapitools.client.model.RadarGetAsnsRel200Response;
import org.openapitools.client.model.RadarGetDnsAs112TopLocations404Response;
import org.openapitools.client.model.RadarGetEntitiesAsnById200Response;
import org.openapitools.client.model.RadarGetEntitiesAsnByIp200Response;
import org.openapitools.client.model.RadarGetEntitiesAsnList200Response;
import org.openapitools.client.model.RadarGetEntitiesIp200Response;
import org.openapitools.client.model.RadarGetEntitiesLocationByAlpha2200Response;
import org.openapitools.client.model.RadarGetEntitiesLocations200Response;
import org.openapitools.client.model.WorkersAiListFinetunes400Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RadarEntitiesApi
 */
@Disabled
public class RadarEntitiesApiTest {

    private final RadarEntitiesApi api = new RadarEntitiesApi();

    /**
     * Get AS-level relationships by AS number
     *
     * Get AS-level relationship for given networks.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarGetAsnsRelTest() throws ApiException {
        Integer asn = null;
        Integer asn2 = null;
        String format = null;
        RadarGetAsnsRel200Response response = api.radarGetAsnsRel(asn, asn2, format);
        // TODO: test validations
    }

    /**
     * Get autonomous system information by AS number
     *
     * Get the requested autonomous system information. A confidence level below &#x60;5&#x60; indicates a low level of confidence in the traffic data - normally this happens because Cloudflare has a small amount of traffic from/to this AS). Population estimates come from APNIC (refer to https://labs.apnic.net/?p&#x3D;526).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarGetEntitiesAsnByIdTest() throws ApiException {
        Integer asn = null;
        String format = null;
        RadarGetEntitiesAsnById200Response response = api.radarGetEntitiesAsnById(asn, format);
        // TODO: test validations
    }

    /**
     * Get autonomous system information by IP address
     *
     * Get the requested autonomous system information based on IP address. Population estimates come from APNIC (refer to https://labs.apnic.net/?p&#x3D;526).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarGetEntitiesAsnByIpTest() throws ApiException {
        String ip = null;
        String format = null;
        RadarGetEntitiesAsnByIp200Response response = api.radarGetEntitiesAsnByIp(ip, format);
        // TODO: test validations
    }

    /**
     * Get autonomous systems
     *
     * Gets a list of autonomous systems (AS).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarGetEntitiesAsnListTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String asn = null;
        String location = null;
        String orderBy = null;
        String format = null;
        RadarGetEntitiesAsnList200Response response = api.radarGetEntitiesAsnList(limit, offset, asn, location, orderBy, format);
        // TODO: test validations
    }

    /**
     * Get IP address
     *
     * Get IP address information. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarGetEntitiesIpTest() throws ApiException {
        String ip = null;
        String format = null;
        RadarGetEntitiesIp200Response response = api.radarGetEntitiesIp(ip, format);
        // TODO: test validations
    }

    /**
     * Get location
     *
     * Get the requested location information. A confidence level below &#x60;5&#x60; indicates a low level of confidence in the traffic data - normally this happens because Cloudflare has a small amount of traffic from/to this location).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarGetEntitiesLocationByAlpha2Test() throws ApiException {
        String location = null;
        String format = null;
        RadarGetEntitiesLocationByAlpha2200Response response = api.radarGetEntitiesLocationByAlpha2(location, format);
        // TODO: test validations
    }

    /**
     * Get locations
     *
     * Get a list of locations.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarGetEntitiesLocationsTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String location = null;
        String format = null;
        RadarGetEntitiesLocations200Response response = api.radarGetEntitiesLocations(limit, offset, location, format);
        // TODO: test validations
    }

}
