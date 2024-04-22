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
import cloudflare.sdk.models.DnsAnalyticsTimeDelta;
import cloudflare.sdk.models.DnsFirewallAnalyticsByTime200Response;
import cloudflare.sdk.models.DnsFirewallAnalyticsByTime4XXResponse;
import cloudflare.sdk.models.DnsFirewallAnalyticsTable200Response;
import cloudflare.sdk.models.DnsFirewallAnalyticsTable4XXResponse;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DnsFirewallAnalyticsApi
 */
@Disabled
public class DnsFirewallAnalyticsApiTest {

    private final DnsFirewallAnalyticsApi api = new DnsFirewallAnalyticsApi();

    /**
     * By Time
     *
     * Retrieves a list of aggregate metrics grouped by time interval.  See [Analytics API properties](https://developers.cloudflare.com/dns/reference/analytics-api-properties/) for detailed information about the available query parameters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dnsFirewallAnalyticsByTimeTest() throws ApiException {
        String dnsFirewallId = null;
        String accountId = null;
        String metrics = null;
        String dimensions = null;
        OffsetDateTime since = null;
        OffsetDateTime until = null;
        Integer limit = null;
        String sort = null;
        String filters = null;
        DnsAnalyticsTimeDelta timeDelta = null;
        DnsFirewallAnalyticsByTime200Response response = api.dnsFirewallAnalyticsByTime(dnsFirewallId, accountId, metrics, dimensions, since, until, limit, sort, filters, timeDelta);
        // TODO: test validations
    }

    /**
     * Table
     *
     * Retrieves a list of summarised aggregate metrics over a given time period.  See [Analytics API properties](https://developers.cloudflare.com/dns/reference/analytics-api-properties/) for detailed information about the available query parameters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dnsFirewallAnalyticsTableTest() throws ApiException {
        String dnsFirewallId = null;
        String accountId = null;
        String metrics = null;
        String dimensions = null;
        OffsetDateTime since = null;
        OffsetDateTime until = null;
        Integer limit = null;
        String sort = null;
        String filters = null;
        DnsFirewallAnalyticsTable200Response response = api.dnsFirewallAnalyticsTable(dnsFirewallId, accountId, metrics, dimensions, since, until, limit, sort, filters);
        // TODO: test validations
    }

}
