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

import invalidPackageName.ApiCallback;
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.ApiResponse;
import invalidPackageName.Configuration;
import invalidPackageName.Pair;
import invalidPackageName.ProgressRequestBody;
import invalidPackageName.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.time.OffsetDateTime;
import org.openapitools.client.model.RadarGetVerifiedBotsTopByHttpRequests200Response;
import org.openapitools.client.model.RadarGetVerifiedBotsTopCategoriesByHttpRequests200Response;
import org.openapitools.client.model.WorkersAiListFinetunes400Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RadarVerifiedBotsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RadarVerifiedBotsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RadarVerifiedBotsApi(ApiClient apiClient) {
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
     * Build call for radarGetVerifiedBotsTopByHttpRequests
     * @param limit  (optional)
     * @param name  (optional)
     * @param dateRange  (optional)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param asn  (optional)
     * @param location  (optional)
     * @param continent  (optional)
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
    public okhttp3.Call radarGetVerifiedBotsTopByHttpRequestsCall(Integer limit, List<String> name, List<String> dateRange, List<OffsetDateTime> dateStart, List<OffsetDateTime> dateEnd, List<String> asn, List<String> location, List<String> continent, String format, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/radar/verified_bots/top/bots";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (name != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "name", name));
        }

        if (dateRange != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "dateRange", dateRange));
        }

        if (dateStart != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "dateStart", dateStart));
        }

        if (dateEnd != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "dateEnd", dateEnd));
        }

        if (asn != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "asn", asn));
        }

        if (location != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "location", location));
        }

        if (continent != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "continent", continent));
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
    private okhttp3.Call radarGetVerifiedBotsTopByHttpRequestsValidateBeforeCall(Integer limit, List<String> name, List<String> dateRange, List<OffsetDateTime> dateStart, List<OffsetDateTime> dateEnd, List<String> asn, List<String> location, List<String> continent, String format, final ApiCallback _callback) throws ApiException {
        return radarGetVerifiedBotsTopByHttpRequestsCall(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format, _callback);

    }

    /**
     * Get Top Verified Bots By HTTP Requests
     * Get top verified bots by HTTP requests, with owner and category.
     * @param limit  (optional)
     * @param name  (optional)
     * @param dateRange  (optional)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param asn  (optional)
     * @param location  (optional)
     * @param continent  (optional)
     * @param format  (optional)
     * @return RadarGetVerifiedBotsTopByHttpRequests200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public RadarGetVerifiedBotsTopByHttpRequests200Response radarGetVerifiedBotsTopByHttpRequests(Integer limit, List<String> name, List<String> dateRange, List<OffsetDateTime> dateStart, List<OffsetDateTime> dateEnd, List<String> asn, List<String> location, List<String> continent, String format) throws ApiException {
        ApiResponse<RadarGetVerifiedBotsTopByHttpRequests200Response> localVarResp = radarGetVerifiedBotsTopByHttpRequestsWithHttpInfo(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
        return localVarResp.getData();
    }

    /**
     * Get Top Verified Bots By HTTP Requests
     * Get top verified bots by HTTP requests, with owner and category.
     * @param limit  (optional)
     * @param name  (optional)
     * @param dateRange  (optional)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param asn  (optional)
     * @param location  (optional)
     * @param continent  (optional)
     * @param format  (optional)
     * @return ApiResponse&lt;RadarGetVerifiedBotsTopByHttpRequests200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RadarGetVerifiedBotsTopByHttpRequests200Response> radarGetVerifiedBotsTopByHttpRequestsWithHttpInfo(Integer limit, List<String> name, List<String> dateRange, List<OffsetDateTime> dateStart, List<OffsetDateTime> dateEnd, List<String> asn, List<String> location, List<String> continent, String format) throws ApiException {
        okhttp3.Call localVarCall = radarGetVerifiedBotsTopByHttpRequestsValidateBeforeCall(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format, null);
        Type localVarReturnType = new TypeToken<RadarGetVerifiedBotsTopByHttpRequests200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Top Verified Bots By HTTP Requests (asynchronously)
     * Get top verified bots by HTTP requests, with owner and category.
     * @param limit  (optional)
     * @param name  (optional)
     * @param dateRange  (optional)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param asn  (optional)
     * @param location  (optional)
     * @param continent  (optional)
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
    public okhttp3.Call radarGetVerifiedBotsTopByHttpRequestsAsync(Integer limit, List<String> name, List<String> dateRange, List<OffsetDateTime> dateStart, List<OffsetDateTime> dateEnd, List<String> asn, List<String> location, List<String> continent, String format, final ApiCallback<RadarGetVerifiedBotsTopByHttpRequests200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = radarGetVerifiedBotsTopByHttpRequestsValidateBeforeCall(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format, _callback);
        Type localVarReturnType = new TypeToken<RadarGetVerifiedBotsTopByHttpRequests200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for radarGetVerifiedBotsTopCategoriesByHttpRequests
     * @param limit  (optional)
     * @param name  (optional)
     * @param dateRange  (optional)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param asn  (optional)
     * @param location  (optional)
     * @param continent  (optional)
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
    public okhttp3.Call radarGetVerifiedBotsTopCategoriesByHttpRequestsCall(Integer limit, List<String> name, List<String> dateRange, List<OffsetDateTime> dateStart, List<OffsetDateTime> dateEnd, List<String> asn, List<String> location, List<String> continent, String format, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/radar/verified_bots/top/categories";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (name != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "name", name));
        }

        if (dateRange != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "dateRange", dateRange));
        }

        if (dateStart != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "dateStart", dateStart));
        }

        if (dateEnd != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "dateEnd", dateEnd));
        }

        if (asn != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "asn", asn));
        }

        if (location != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "location", location));
        }

        if (continent != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "continent", continent));
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
    private okhttp3.Call radarGetVerifiedBotsTopCategoriesByHttpRequestsValidateBeforeCall(Integer limit, List<String> name, List<String> dateRange, List<OffsetDateTime> dateStart, List<OffsetDateTime> dateEnd, List<String> asn, List<String> location, List<String> continent, String format, final ApiCallback _callback) throws ApiException {
        return radarGetVerifiedBotsTopCategoriesByHttpRequestsCall(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format, _callback);

    }

    /**
     * Get Top Verified Bot Categories By HTTP Requests
     * Get top verified bot categories by HTTP requests, along with their corresponding percentage, over the total verified bot HTTP requests.
     * @param limit  (optional)
     * @param name  (optional)
     * @param dateRange  (optional)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param asn  (optional)
     * @param location  (optional)
     * @param continent  (optional)
     * @param format  (optional)
     * @return RadarGetVerifiedBotsTopCategoriesByHttpRequests200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public RadarGetVerifiedBotsTopCategoriesByHttpRequests200Response radarGetVerifiedBotsTopCategoriesByHttpRequests(Integer limit, List<String> name, List<String> dateRange, List<OffsetDateTime> dateStart, List<OffsetDateTime> dateEnd, List<String> asn, List<String> location, List<String> continent, String format) throws ApiException {
        ApiResponse<RadarGetVerifiedBotsTopCategoriesByHttpRequests200Response> localVarResp = radarGetVerifiedBotsTopCategoriesByHttpRequestsWithHttpInfo(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
        return localVarResp.getData();
    }

    /**
     * Get Top Verified Bot Categories By HTTP Requests
     * Get top verified bot categories by HTTP requests, along with their corresponding percentage, over the total verified bot HTTP requests.
     * @param limit  (optional)
     * @param name  (optional)
     * @param dateRange  (optional)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param asn  (optional)
     * @param location  (optional)
     * @param continent  (optional)
     * @param format  (optional)
     * @return ApiResponse&lt;RadarGetVerifiedBotsTopCategoriesByHttpRequests200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RadarGetVerifiedBotsTopCategoriesByHttpRequests200Response> radarGetVerifiedBotsTopCategoriesByHttpRequestsWithHttpInfo(Integer limit, List<String> name, List<String> dateRange, List<OffsetDateTime> dateStart, List<OffsetDateTime> dateEnd, List<String> asn, List<String> location, List<String> continent, String format) throws ApiException {
        okhttp3.Call localVarCall = radarGetVerifiedBotsTopCategoriesByHttpRequestsValidateBeforeCall(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format, null);
        Type localVarReturnType = new TypeToken<RadarGetVerifiedBotsTopCategoriesByHttpRequests200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Top Verified Bot Categories By HTTP Requests (asynchronously)
     * Get top verified bot categories by HTTP requests, along with their corresponding percentage, over the total verified bot HTTP requests.
     * @param limit  (optional)
     * @param name  (optional)
     * @param dateRange  (optional)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param asn  (optional)
     * @param location  (optional)
     * @param continent  (optional)
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
    public okhttp3.Call radarGetVerifiedBotsTopCategoriesByHttpRequestsAsync(Integer limit, List<String> name, List<String> dateRange, List<OffsetDateTime> dateStart, List<OffsetDateTime> dateEnd, List<String> asn, List<String> location, List<String> continent, String format, final ApiCallback<RadarGetVerifiedBotsTopCategoriesByHttpRequests200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = radarGetVerifiedBotsTopCategoriesByHttpRequestsValidateBeforeCall(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format, _callback);
        Type localVarReturnType = new TypeToken<RadarGetVerifiedBotsTopCategoriesByHttpRequests200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
