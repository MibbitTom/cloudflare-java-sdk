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


import org.openapitools.client.model.GetZonesZoneIdentifierLogpushEdgeJobs4XXResponse;
import org.openapitools.client.model.LogpushInstantLogsJobResponseCollection;
import org.openapitools.client.model.LogpushInstantLogsJobResponseSingle;
import org.openapitools.client.model.PostZonesZoneIdentifierLogpushEdgeJobs4XXResponse;
import org.openapitools.client.model.PostZonesZoneIdentifierLogpushEdgeJobsRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstantLogsJobsForAZoneApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public InstantLogsJobsForAZoneApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InstantLogsJobsForAZoneApi(ApiClient apiClient) {
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
     * Build call for getZonesZoneIdentifierLogpushEdgeJobs
     * @param zoneId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Instant Logs jobs response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Instant Logs jobs response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getZonesZoneIdentifierLogpushEdgeJobsCall(String zoneId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/logpush/edge"
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getZonesZoneIdentifierLogpushEdgeJobsValidateBeforeCall(String zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling getZonesZoneIdentifierLogpushEdgeJobs(Async)");
        }

        return getZonesZoneIdentifierLogpushEdgeJobsCall(zoneId, _callback);

    }

    /**
     * List Instant Logs jobs
     * Lists Instant Logs jobs for a zone.
     * @param zoneId  (required)
     * @return LogpushInstantLogsJobResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Instant Logs jobs response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Instant Logs jobs response failure </td><td>  -  </td></tr>
     </table>
     */
    public LogpushInstantLogsJobResponseCollection getZonesZoneIdentifierLogpushEdgeJobs(String zoneId) throws ApiException {
        ApiResponse<LogpushInstantLogsJobResponseCollection> localVarResp = getZonesZoneIdentifierLogpushEdgeJobsWithHttpInfo(zoneId);
        return localVarResp.getData();
    }

    /**
     * List Instant Logs jobs
     * Lists Instant Logs jobs for a zone.
     * @param zoneId  (required)
     * @return ApiResponse&lt;LogpushInstantLogsJobResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Instant Logs jobs response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Instant Logs jobs response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LogpushInstantLogsJobResponseCollection> getZonesZoneIdentifierLogpushEdgeJobsWithHttpInfo(String zoneId) throws ApiException {
        okhttp3.Call localVarCall = getZonesZoneIdentifierLogpushEdgeJobsValidateBeforeCall(zoneId, null);
        Type localVarReturnType = new TypeToken<LogpushInstantLogsJobResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Instant Logs jobs (asynchronously)
     * Lists Instant Logs jobs for a zone.
     * @param zoneId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Instant Logs jobs response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Instant Logs jobs response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getZonesZoneIdentifierLogpushEdgeJobsAsync(String zoneId, final ApiCallback<LogpushInstantLogsJobResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getZonesZoneIdentifierLogpushEdgeJobsValidateBeforeCall(zoneId, _callback);
        Type localVarReturnType = new TypeToken<LogpushInstantLogsJobResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postZonesZoneIdentifierLogpushEdgeJobs
     * @param zoneId  (required)
     * @param postZonesZoneIdentifierLogpushEdgeJobsRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Instant Logs job response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Instant Logs job response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postZonesZoneIdentifierLogpushEdgeJobsCall(String zoneId, PostZonesZoneIdentifierLogpushEdgeJobsRequest postZonesZoneIdentifierLogpushEdgeJobsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = postZonesZoneIdentifierLogpushEdgeJobsRequest;

        // create path and map variables
        String localVarPath = "/zones/{zone_id}/logpush/edge"
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postZonesZoneIdentifierLogpushEdgeJobsValidateBeforeCall(String zoneId, PostZonesZoneIdentifierLogpushEdgeJobsRequest postZonesZoneIdentifierLogpushEdgeJobsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling postZonesZoneIdentifierLogpushEdgeJobs(Async)");
        }

        // verify the required parameter 'postZonesZoneIdentifierLogpushEdgeJobsRequest' is set
        if (postZonesZoneIdentifierLogpushEdgeJobsRequest == null) {
            throw new ApiException("Missing the required parameter 'postZonesZoneIdentifierLogpushEdgeJobsRequest' when calling postZonesZoneIdentifierLogpushEdgeJobs(Async)");
        }

        return postZonesZoneIdentifierLogpushEdgeJobsCall(zoneId, postZonesZoneIdentifierLogpushEdgeJobsRequest, _callback);

    }

    /**
     * Create Instant Logs job
     * Creates a new Instant Logs job for a zone.
     * @param zoneId  (required)
     * @param postZonesZoneIdentifierLogpushEdgeJobsRequest  (required)
     * @return LogpushInstantLogsJobResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Instant Logs job response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Instant Logs job response failure </td><td>  -  </td></tr>
     </table>
     */
    public LogpushInstantLogsJobResponseSingle postZonesZoneIdentifierLogpushEdgeJobs(String zoneId, PostZonesZoneIdentifierLogpushEdgeJobsRequest postZonesZoneIdentifierLogpushEdgeJobsRequest) throws ApiException {
        ApiResponse<LogpushInstantLogsJobResponseSingle> localVarResp = postZonesZoneIdentifierLogpushEdgeJobsWithHttpInfo(zoneId, postZonesZoneIdentifierLogpushEdgeJobsRequest);
        return localVarResp.getData();
    }

    /**
     * Create Instant Logs job
     * Creates a new Instant Logs job for a zone.
     * @param zoneId  (required)
     * @param postZonesZoneIdentifierLogpushEdgeJobsRequest  (required)
     * @return ApiResponse&lt;LogpushInstantLogsJobResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Instant Logs job response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Instant Logs job response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LogpushInstantLogsJobResponseSingle> postZonesZoneIdentifierLogpushEdgeJobsWithHttpInfo(String zoneId, PostZonesZoneIdentifierLogpushEdgeJobsRequest postZonesZoneIdentifierLogpushEdgeJobsRequest) throws ApiException {
        okhttp3.Call localVarCall = postZonesZoneIdentifierLogpushEdgeJobsValidateBeforeCall(zoneId, postZonesZoneIdentifierLogpushEdgeJobsRequest, null);
        Type localVarReturnType = new TypeToken<LogpushInstantLogsJobResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Instant Logs job (asynchronously)
     * Creates a new Instant Logs job for a zone.
     * @param zoneId  (required)
     * @param postZonesZoneIdentifierLogpushEdgeJobsRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Instant Logs job response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Instant Logs job response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postZonesZoneIdentifierLogpushEdgeJobsAsync(String zoneId, PostZonesZoneIdentifierLogpushEdgeJobsRequest postZonesZoneIdentifierLogpushEdgeJobsRequest, final ApiCallback<LogpushInstantLogsJobResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = postZonesZoneIdentifierLogpushEdgeJobsValidateBeforeCall(zoneId, postZonesZoneIdentifierLogpushEdgeJobsRequest, _callback);
        Type localVarReturnType = new TypeToken<LogpushInstantLogsJobResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
