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
import java.util.UUID;
import org.openapitools.client.model.UrlscannerCreateScan200Response;
import org.openapitools.client.model.UrlscannerCreateScan409Response;
import org.openapitools.client.model.UrlscannerCreateScan429Response;
import org.openapitools.client.model.UrlscannerCreateScanRequest;
import org.openapitools.client.model.UrlscannerGetScan200Response;
import org.openapitools.client.model.UrlscannerGetScan202Response;
import org.openapitools.client.model.UrlscannerGetScan404Response;
import org.openapitools.client.model.UrlscannerGetScanHar200Response;
import org.openapitools.client.model.UrlscannerSearchScans200Response;
import org.openapitools.client.model.UrlscannerSearchScans400Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UrlScannerApi
 */
@Disabled
public class UrlScannerApiTest {

    private final UrlScannerApi api = new UrlScannerApi();

    /**
     * Create URL Scan
     *
     * Submit a URL to scan. You can also set some options, like the visibility level and custom headers. Accounts are limited to 1 new scan every 10 seconds and 8000 per month. If you need more, please reach out.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void urlscannerCreateScanTest() throws ApiException {
        String accountId = null;
        UrlscannerCreateScanRequest urlscannerCreateScanRequest = null;
        UrlscannerCreateScan200Response response = api.urlscannerCreateScan(accountId, urlscannerCreateScanRequest);
        // TODO: test validations
    }

    /**
     * Get URL scan
     *
     * Get URL scan by uuid
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void urlscannerGetScanTest() throws ApiException {
        UUID scanId = null;
        String accountId = null;
        UrlscannerGetScan200Response response = api.urlscannerGetScan(scanId, accountId);
        // TODO: test validations
    }

    /**
     * Get URL scan&#39;s HAR
     *
     * Get a URL scan&#39;s HAR file. See HAR spec at http://www.softwareishard.com/blog/har-12-spec/.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void urlscannerGetScanHarTest() throws ApiException {
        UUID scanId = null;
        String accountId = null;
        UrlscannerGetScanHar200Response response = api.urlscannerGetScanHar(scanId, accountId);
        // TODO: test validations
    }

    /**
     * Get screenshot
     *
     * Get scan&#39;s screenshot by resolution (desktop/mobile/tablet).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void urlscannerGetScanScreenshotTest() throws ApiException {
        UUID scanId = null;
        String accountId = null;
        String resolution = null;
        String response = api.urlscannerGetScanScreenshot(scanId, accountId, resolution);
        // TODO: test validations
    }

    /**
     * Search URL scans
     *
     * Search scans by date and webpages&#39; requests, including full URL (after redirects), hostname, and path. &lt;br/&gt; A successful scan will appear in search results a few minutes after finishing but may take much longer if the system in under load. By default, only successfully completed scans will appear in search results, unless searching by &#x60;scanId&#x60;. Please take into account that older scans may be removed from the search index at an unspecified time.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void urlscannerSearchScansTest() throws ApiException {
        String accountId = null;
        UUID scanId = null;
        Integer limit = null;
        String nextCursor = null;
        OffsetDateTime dateStart = null;
        OffsetDateTime dateEnd = null;
        String url = null;
        String hostname = null;
        String path = null;
        String ip = null;
        String asn = null;
        String hash = null;
        String pageUrl = null;
        String pageHostname = null;
        String pagePath = null;
        String pageAsn = null;
        String pageIp = null;
        Boolean accountScans = null;
        Boolean isMalicious = null;
        UrlscannerSearchScans200Response response = api.urlscannerSearchScans(accountId, scanId, limit, nextCursor, dateStart, dateEnd, url, hostname, path, ip, asn, hash, pageUrl, pageHostname, pagePath, pageAsn, pageIp, accountScans, isMalicious);
        // TODO: test validations
    }

}
