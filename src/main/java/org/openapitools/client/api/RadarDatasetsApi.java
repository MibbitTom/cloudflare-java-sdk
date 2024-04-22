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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.RadarGetReportsDatasets200Response;
import org.openapitools.client.model.RadarPostReportsDatasetDownloadUrl200Response;
import org.openapitools.client.model.RadarPostReportsDatasetDownloadUrlRequest;
import org.openapitools.client.model.WorkersAiListFinetunes400Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RadarDatasetsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RadarDatasetsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RadarDatasetsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for radarGetReportsDatasetDownload
     * @param alias  (required)
     * @param date  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call radarGetReportsDatasetDownloadCall(String alias, String date, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/radar/datasets/{alias}"
            .replace("{" + "alias" + "}", localVarApiClient.escapeString(alias.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (date != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date", date));
        }

        final String[] localVarAccepts = {
            "text/csv",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call radarGetReportsDatasetDownloadValidateBeforeCall(String alias, String date, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'alias' is set
        if (alias == null) {
            throw new ApiException("Missing the required parameter 'alias' when calling radarGetReportsDatasetDownload(Async)");
        }

        return radarGetReportsDatasetDownloadCall(alias, date, _callback);

    }

    /**
     * Get Dataset csv Stream
     * Get the csv content of a given dataset by alias or id. When getting the content by alias the latest dataset is returned, optionally filtered by the latest available at a given date.
     * @param alias  (required)
     * @param date  (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public String radarGetReportsDatasetDownload(String alias, String date) throws ApiException {
        ApiResponse<String> localVarResp = radarGetReportsDatasetDownloadWithHttpInfo(alias, date);
        return localVarResp.getData();
    }

    /**
     * Get Dataset csv Stream
     * Get the csv content of a given dataset by alias or id. When getting the content by alias the latest dataset is returned, optionally filtered by the latest available at a given date.
     * @param alias  (required)
     * @param date  (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> radarGetReportsDatasetDownloadWithHttpInfo(String alias, String date) throws ApiException {
        okhttp3.Call localVarCall = radarGetReportsDatasetDownloadValidateBeforeCall(alias, date, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Dataset csv Stream (asynchronously)
     * Get the csv content of a given dataset by alias or id. When getting the content by alias the latest dataset is returned, optionally filtered by the latest available at a given date.
     * @param alias  (required)
     * @param date  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call radarGetReportsDatasetDownloadAsync(String alias, String date, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = radarGetReportsDatasetDownloadValidateBeforeCall(alias, date, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for radarGetReportsDatasets
     * @param limit  (optional)
     * @param offset  (optional)
     * @param datasetType  (optional, default to RANKING_BUCKET)
     * @param format  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call radarGetReportsDatasetsCall(Integer limit, Integer offset, String datasetType, String format, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/radar/datasets";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (datasetType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasetType", datasetType));
        }

        if (format != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("format", format));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call radarGetReportsDatasetsValidateBeforeCall(Integer limit, Integer offset, String datasetType, String format, final ApiCallback _callback) throws ApiException {
        return radarGetReportsDatasetsCall(limit, offset, datasetType, format, _callback);

    }

    /**
     * Get Datasets
     * Get a list of datasets.
     * @param limit  (optional)
     * @param offset  (optional)
     * @param datasetType  (optional, default to RANKING_BUCKET)
     * @param format  (optional)
     * @return RadarGetReportsDatasets200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public RadarGetReportsDatasets200Response radarGetReportsDatasets(Integer limit, Integer offset, String datasetType, String format) throws ApiException {
        ApiResponse<RadarGetReportsDatasets200Response> localVarResp = radarGetReportsDatasetsWithHttpInfo(limit, offset, datasetType, format);
        return localVarResp.getData();
    }

    /**
     * Get Datasets
     * Get a list of datasets.
     * @param limit  (optional)
     * @param offset  (optional)
     * @param datasetType  (optional, default to RANKING_BUCKET)
     * @param format  (optional)
     * @return ApiResponse&lt;RadarGetReportsDatasets200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RadarGetReportsDatasets200Response> radarGetReportsDatasetsWithHttpInfo(Integer limit, Integer offset, String datasetType, String format) throws ApiException {
        okhttp3.Call localVarCall = radarGetReportsDatasetsValidateBeforeCall(limit, offset, datasetType, format, null);
        Type localVarReturnType = new TypeToken<RadarGetReportsDatasets200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Datasets (asynchronously)
     * Get a list of datasets.
     * @param limit  (optional)
     * @param offset  (optional)
     * @param datasetType  (optional, default to RANKING_BUCKET)
     * @param format  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call radarGetReportsDatasetsAsync(Integer limit, Integer offset, String datasetType, String format, final ApiCallback<RadarGetReportsDatasets200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = radarGetReportsDatasetsValidateBeforeCall(limit, offset, datasetType, format, _callback);
        Type localVarReturnType = new TypeToken<RadarGetReportsDatasets200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for radarPostReportsDatasetDownloadUrl
     * @param format  (optional)
     * @param radarPostReportsDatasetDownloadUrlRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call radarPostReportsDatasetDownloadUrlCall(String format, RadarPostReportsDatasetDownloadUrlRequest radarPostReportsDatasetDownloadUrlRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = radarPostReportsDatasetDownloadUrlRequest;

        // create path and map variables
        String localVarPath = "/radar/datasets/download";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (format != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("format", format));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call radarPostReportsDatasetDownloadUrlValidateBeforeCall(String format, RadarPostReportsDatasetDownloadUrlRequest radarPostReportsDatasetDownloadUrlRequest, final ApiCallback _callback) throws ApiException {
        return radarPostReportsDatasetDownloadUrlCall(format, radarPostReportsDatasetDownloadUrlRequest, _callback);

    }

    /**
     * Get Dataset download url
     * Get a url to download a single dataset.
     * @param format  (optional)
     * @param radarPostReportsDatasetDownloadUrlRequest  (optional)
     * @return RadarPostReportsDatasetDownloadUrl200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public RadarPostReportsDatasetDownloadUrl200Response radarPostReportsDatasetDownloadUrl(String format, RadarPostReportsDatasetDownloadUrlRequest radarPostReportsDatasetDownloadUrlRequest) throws ApiException {
        ApiResponse<RadarPostReportsDatasetDownloadUrl200Response> localVarResp = radarPostReportsDatasetDownloadUrlWithHttpInfo(format, radarPostReportsDatasetDownloadUrlRequest);
        return localVarResp.getData();
    }

    /**
     * Get Dataset download url
     * Get a url to download a single dataset.
     * @param format  (optional)
     * @param radarPostReportsDatasetDownloadUrlRequest  (optional)
     * @return ApiResponse&lt;RadarPostReportsDatasetDownloadUrl200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RadarPostReportsDatasetDownloadUrl200Response> radarPostReportsDatasetDownloadUrlWithHttpInfo(String format, RadarPostReportsDatasetDownloadUrlRequest radarPostReportsDatasetDownloadUrlRequest) throws ApiException {
        okhttp3.Call localVarCall = radarPostReportsDatasetDownloadUrlValidateBeforeCall(format, radarPostReportsDatasetDownloadUrlRequest, null);
        Type localVarReturnType = new TypeToken<RadarPostReportsDatasetDownloadUrl200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Dataset download url (asynchronously)
     * Get a url to download a single dataset.
     * @param format  (optional)
     * @param radarPostReportsDatasetDownloadUrlRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call radarPostReportsDatasetDownloadUrlAsync(String format, RadarPostReportsDatasetDownloadUrlRequest radarPostReportsDatasetDownloadUrlRequest, final ApiCallback<RadarPostReportsDatasetDownloadUrl200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = radarPostReportsDatasetDownloadUrlValidateBeforeCall(format, radarPostReportsDatasetDownloadUrlRequest, _callback);
        Type localVarReturnType = new TypeToken<RadarPostReportsDatasetDownloadUrl200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}