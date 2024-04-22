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
import cloudflare.sdk.models.RadarGetReportsDatasets200Response;
import cloudflare.sdk.models.RadarPostReportsDatasetDownloadUrl200Response;
import cloudflare.sdk.models.RadarPostReportsDatasetDownloadUrlRequest;
import cloudflare.sdk.models.WorkersAiListFinetunes400Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RadarDatasetsApi
 */
@Disabled
public class RadarDatasetsApiTest {

    private final RadarDatasetsApi api = new RadarDatasetsApi();

    /**
     * Get Dataset csv Stream
     *
     * Get the csv content of a given dataset by alias or id. When getting the content by alias the latest dataset is returned, optionally filtered by the latest available at a given date.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarGetReportsDatasetDownloadTest() throws ApiException {
        String alias = null;
        String date = null;
        String response = api.radarGetReportsDatasetDownload(alias, date);
        // TODO: test validations
    }

    /**
     * Get Datasets
     *
     * Get a list of datasets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarGetReportsDatasetsTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String datasetType = null;
        String format = null;
        RadarGetReportsDatasets200Response response = api.radarGetReportsDatasets(limit, offset, datasetType, format);
        // TODO: test validations
    }

    /**
     * Get Dataset download url
     *
     * Get a url to download a single dataset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void radarPostReportsDatasetDownloadUrlTest() throws ApiException {
        String format = null;
        RadarPostReportsDatasetDownloadUrlRequest radarPostReportsDatasetDownloadUrlRequest = null;
        RadarPostReportsDatasetDownloadUrl200Response response = api.radarPostReportsDatasetDownloadUrl(format, radarPostReportsDatasetDownloadUrlRequest);
        // TODO: test validations
    }

}
