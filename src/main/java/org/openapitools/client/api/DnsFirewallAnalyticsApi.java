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


import org.openapitools.client.model.DnsAnalyticsTimeDelta;
import org.openapitools.client.model.DnsFirewallAnalyticsByTime200Response;
import org.openapitools.client.model.DnsFirewallAnalyticsByTime4XXResponse;
import org.openapitools.client.model.DnsFirewallAnalyticsTable200Response;
import org.openapitools.client.model.DnsFirewallAnalyticsTable4XXResponse;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DnsFirewallAnalyticsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DnsFirewallAnalyticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DnsFirewallAnalyticsApi(ApiClient apiClient) {
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
     * Build call for dnsFirewallAnalyticsByTime
     * @param dnsFirewallId  (required)
     * @param accountId  (required)
     * @param metrics  (optional)
     * @param dimensions  (optional)
     * @param since  (optional)
     * @param until  (optional)
     * @param limit  (optional, default to 100000)
     * @param sort  (optional)
     * @param filters  (optional)
     * @param timeDelta  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> By Time response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> By Time response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dnsFirewallAnalyticsByTimeCall(String dnsFirewallId, String accountId, String metrics, String dimensions, OffsetDateTime since, OffsetDateTime until, Integer limit, String sort, String filters, DnsAnalyticsTimeDelta timeDelta, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/dns_firewall/{dns_firewall_id}/dns_analytics/report/bytime"
            .replace("{" + "dns_firewall_id" + "}", localVarApiClient.escapeString(dnsFirewallId.toString()))
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (metrics != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("metrics", metrics));
        }

        if (dimensions != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dimensions", dimensions));
        }

        if (since != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("since", since));
        }

        if (until != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("until", until));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (filters != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filters", filters));
        }

        if (timeDelta != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("time_delta", timeDelta));
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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call dnsFirewallAnalyticsByTimeValidateBeforeCall(String dnsFirewallId, String accountId, String metrics, String dimensions, OffsetDateTime since, OffsetDateTime until, Integer limit, String sort, String filters, DnsAnalyticsTimeDelta timeDelta, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'dnsFirewallId' is set
        if (dnsFirewallId == null) {
            throw new ApiException("Missing the required parameter 'dnsFirewallId' when calling dnsFirewallAnalyticsByTime(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling dnsFirewallAnalyticsByTime(Async)");
        }

        return dnsFirewallAnalyticsByTimeCall(dnsFirewallId, accountId, metrics, dimensions, since, until, limit, sort, filters, timeDelta, _callback);

    }

    /**
     * By Time
     * Retrieves a list of aggregate metrics grouped by time interval.  See [Analytics API properties](https://developers.cloudflare.com/dns/reference/analytics-api-properties/) for detailed information about the available query parameters.
     * @param dnsFirewallId  (required)
     * @param accountId  (required)
     * @param metrics  (optional)
     * @param dimensions  (optional)
     * @param since  (optional)
     * @param until  (optional)
     * @param limit  (optional, default to 100000)
     * @param sort  (optional)
     * @param filters  (optional)
     * @param timeDelta  (optional)
     * @return DnsFirewallAnalyticsByTime200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> By Time response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> By Time response failure </td><td>  -  </td></tr>
     </table>
     */
    public DnsFirewallAnalyticsByTime200Response dnsFirewallAnalyticsByTime(String dnsFirewallId, String accountId, String metrics, String dimensions, OffsetDateTime since, OffsetDateTime until, Integer limit, String sort, String filters, DnsAnalyticsTimeDelta timeDelta) throws ApiException {
        ApiResponse<DnsFirewallAnalyticsByTime200Response> localVarResp = dnsFirewallAnalyticsByTimeWithHttpInfo(dnsFirewallId, accountId, metrics, dimensions, since, until, limit, sort, filters, timeDelta);
        return localVarResp.getData();
    }

    /**
     * By Time
     * Retrieves a list of aggregate metrics grouped by time interval.  See [Analytics API properties](https://developers.cloudflare.com/dns/reference/analytics-api-properties/) for detailed information about the available query parameters.
     * @param dnsFirewallId  (required)
     * @param accountId  (required)
     * @param metrics  (optional)
     * @param dimensions  (optional)
     * @param since  (optional)
     * @param until  (optional)
     * @param limit  (optional, default to 100000)
     * @param sort  (optional)
     * @param filters  (optional)
     * @param timeDelta  (optional)
     * @return ApiResponse&lt;DnsFirewallAnalyticsByTime200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> By Time response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> By Time response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DnsFirewallAnalyticsByTime200Response> dnsFirewallAnalyticsByTimeWithHttpInfo(String dnsFirewallId, String accountId, String metrics, String dimensions, OffsetDateTime since, OffsetDateTime until, Integer limit, String sort, String filters, DnsAnalyticsTimeDelta timeDelta) throws ApiException {
        okhttp3.Call localVarCall = dnsFirewallAnalyticsByTimeValidateBeforeCall(dnsFirewallId, accountId, metrics, dimensions, since, until, limit, sort, filters, timeDelta, null);
        Type localVarReturnType = new TypeToken<DnsFirewallAnalyticsByTime200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * By Time (asynchronously)
     * Retrieves a list of aggregate metrics grouped by time interval.  See [Analytics API properties](https://developers.cloudflare.com/dns/reference/analytics-api-properties/) for detailed information about the available query parameters.
     * @param dnsFirewallId  (required)
     * @param accountId  (required)
     * @param metrics  (optional)
     * @param dimensions  (optional)
     * @param since  (optional)
     * @param until  (optional)
     * @param limit  (optional, default to 100000)
     * @param sort  (optional)
     * @param filters  (optional)
     * @param timeDelta  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> By Time response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> By Time response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dnsFirewallAnalyticsByTimeAsync(String dnsFirewallId, String accountId, String metrics, String dimensions, OffsetDateTime since, OffsetDateTime until, Integer limit, String sort, String filters, DnsAnalyticsTimeDelta timeDelta, final ApiCallback<DnsFirewallAnalyticsByTime200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = dnsFirewallAnalyticsByTimeValidateBeforeCall(dnsFirewallId, accountId, metrics, dimensions, since, until, limit, sort, filters, timeDelta, _callback);
        Type localVarReturnType = new TypeToken<DnsFirewallAnalyticsByTime200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for dnsFirewallAnalyticsTable
     * @param dnsFirewallId  (required)
     * @param accountId  (required)
     * @param metrics  (optional)
     * @param dimensions  (optional)
     * @param since  (optional)
     * @param until  (optional)
     * @param limit  (optional, default to 100000)
     * @param sort  (optional)
     * @param filters  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Table response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Table response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dnsFirewallAnalyticsTableCall(String dnsFirewallId, String accountId, String metrics, String dimensions, OffsetDateTime since, OffsetDateTime until, Integer limit, String sort, String filters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/dns_firewall/{dns_firewall_id}/dns_analytics/report"
            .replace("{" + "dns_firewall_id" + "}", localVarApiClient.escapeString(dnsFirewallId.toString()))
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (metrics != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("metrics", metrics));
        }

        if (dimensions != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dimensions", dimensions));
        }

        if (since != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("since", since));
        }

        if (until != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("until", until));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (filters != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filters", filters));
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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call dnsFirewallAnalyticsTableValidateBeforeCall(String dnsFirewallId, String accountId, String metrics, String dimensions, OffsetDateTime since, OffsetDateTime until, Integer limit, String sort, String filters, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'dnsFirewallId' is set
        if (dnsFirewallId == null) {
            throw new ApiException("Missing the required parameter 'dnsFirewallId' when calling dnsFirewallAnalyticsTable(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling dnsFirewallAnalyticsTable(Async)");
        }

        return dnsFirewallAnalyticsTableCall(dnsFirewallId, accountId, metrics, dimensions, since, until, limit, sort, filters, _callback);

    }

    /**
     * Table
     * Retrieves a list of summarised aggregate metrics over a given time period.  See [Analytics API properties](https://developers.cloudflare.com/dns/reference/analytics-api-properties/) for detailed information about the available query parameters.
     * @param dnsFirewallId  (required)
     * @param accountId  (required)
     * @param metrics  (optional)
     * @param dimensions  (optional)
     * @param since  (optional)
     * @param until  (optional)
     * @param limit  (optional, default to 100000)
     * @param sort  (optional)
     * @param filters  (optional)
     * @return DnsFirewallAnalyticsTable200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Table response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Table response failure </td><td>  -  </td></tr>
     </table>
     */
    public DnsFirewallAnalyticsTable200Response dnsFirewallAnalyticsTable(String dnsFirewallId, String accountId, String metrics, String dimensions, OffsetDateTime since, OffsetDateTime until, Integer limit, String sort, String filters) throws ApiException {
        ApiResponse<DnsFirewallAnalyticsTable200Response> localVarResp = dnsFirewallAnalyticsTableWithHttpInfo(dnsFirewallId, accountId, metrics, dimensions, since, until, limit, sort, filters);
        return localVarResp.getData();
    }

    /**
     * Table
     * Retrieves a list of summarised aggregate metrics over a given time period.  See [Analytics API properties](https://developers.cloudflare.com/dns/reference/analytics-api-properties/) for detailed information about the available query parameters.
     * @param dnsFirewallId  (required)
     * @param accountId  (required)
     * @param metrics  (optional)
     * @param dimensions  (optional)
     * @param since  (optional)
     * @param until  (optional)
     * @param limit  (optional, default to 100000)
     * @param sort  (optional)
     * @param filters  (optional)
     * @return ApiResponse&lt;DnsFirewallAnalyticsTable200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Table response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Table response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DnsFirewallAnalyticsTable200Response> dnsFirewallAnalyticsTableWithHttpInfo(String dnsFirewallId, String accountId, String metrics, String dimensions, OffsetDateTime since, OffsetDateTime until, Integer limit, String sort, String filters) throws ApiException {
        okhttp3.Call localVarCall = dnsFirewallAnalyticsTableValidateBeforeCall(dnsFirewallId, accountId, metrics, dimensions, since, until, limit, sort, filters, null);
        Type localVarReturnType = new TypeToken<DnsFirewallAnalyticsTable200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Table (asynchronously)
     * Retrieves a list of summarised aggregate metrics over a given time period.  See [Analytics API properties](https://developers.cloudflare.com/dns/reference/analytics-api-properties/) for detailed information about the available query parameters.
     * @param dnsFirewallId  (required)
     * @param accountId  (required)
     * @param metrics  (optional)
     * @param dimensions  (optional)
     * @param since  (optional)
     * @param until  (optional)
     * @param limit  (optional, default to 100000)
     * @param sort  (optional)
     * @param filters  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Table response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Table response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dnsFirewallAnalyticsTableAsync(String dnsFirewallId, String accountId, String metrics, String dimensions, OffsetDateTime since, OffsetDateTime until, Integer limit, String sort, String filters, final ApiCallback<DnsFirewallAnalyticsTable200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = dnsFirewallAnalyticsTableValidateBeforeCall(dnsFirewallId, accountId, metrics, dimensions, since, until, limit, sort, filters, _callback);
        Type localVarReturnType = new TypeToken<DnsFirewallAnalyticsTable200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
