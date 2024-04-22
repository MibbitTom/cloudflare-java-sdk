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

import cloudflare.ApiCallback;
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.ApiResponse;
import cloudflare.Configuration;
import cloudflare.Pair;
import cloudflare.ProgressRequestBody;
import cloudflare.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import cloudflare.sdk.models.DiagnosticsTraceroute4XXResponse;
import cloudflare.sdk.models.DiagnosticsTracerouteRequest;
import cloudflare.sdk.models.MagicTransitTracerouteResponseCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiagnosticsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DiagnosticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DiagnosticsApi(ApiClient apiClient) {
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
     * Build call for diagnosticsTraceroute
     * @param accountId  (required)
     * @param diagnosticsTracerouteRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Traceroute response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Traceroute response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call diagnosticsTracerouteCall(String accountId, DiagnosticsTracerouteRequest diagnosticsTracerouteRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = diagnosticsTracerouteRequest;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/diagnostics/traceroute"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()));

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
    private okhttp3.Call diagnosticsTracerouteValidateBeforeCall(String accountId, DiagnosticsTracerouteRequest diagnosticsTracerouteRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling diagnosticsTraceroute(Async)");
        }

        // verify the required parameter 'diagnosticsTracerouteRequest' is set
        if (diagnosticsTracerouteRequest == null) {
            throw new ApiException("Missing the required parameter 'diagnosticsTracerouteRequest' when calling diagnosticsTraceroute(Async)");
        }

        return diagnosticsTracerouteCall(accountId, diagnosticsTracerouteRequest, _callback);

    }

    /**
     * Traceroute
     * Run traceroutes from Cloudflare colos.
     * @param accountId  (required)
     * @param diagnosticsTracerouteRequest  (required)
     * @return MagicTransitTracerouteResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Traceroute response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Traceroute response failure </td><td>  -  </td></tr>
     </table>
     */
    public MagicTransitTracerouteResponseCollection diagnosticsTraceroute(String accountId, DiagnosticsTracerouteRequest diagnosticsTracerouteRequest) throws ApiException {
        ApiResponse<MagicTransitTracerouteResponseCollection> localVarResp = diagnosticsTracerouteWithHttpInfo(accountId, diagnosticsTracerouteRequest);
        return localVarResp.getData();
    }

    /**
     * Traceroute
     * Run traceroutes from Cloudflare colos.
     * @param accountId  (required)
     * @param diagnosticsTracerouteRequest  (required)
     * @return ApiResponse&lt;MagicTransitTracerouteResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Traceroute response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Traceroute response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MagicTransitTracerouteResponseCollection> diagnosticsTracerouteWithHttpInfo(String accountId, DiagnosticsTracerouteRequest diagnosticsTracerouteRequest) throws ApiException {
        okhttp3.Call localVarCall = diagnosticsTracerouteValidateBeforeCall(accountId, diagnosticsTracerouteRequest, null);
        Type localVarReturnType = new TypeToken<MagicTransitTracerouteResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Traceroute (asynchronously)
     * Run traceroutes from Cloudflare colos.
     * @param accountId  (required)
     * @param diagnosticsTracerouteRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Traceroute response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Traceroute response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call diagnosticsTracerouteAsync(String accountId, DiagnosticsTracerouteRequest diagnosticsTracerouteRequest, final ApiCallback<MagicTransitTracerouteResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = diagnosticsTracerouteValidateBeforeCall(accountId, diagnosticsTracerouteRequest, _callback);
        Type localVarReturnType = new TypeToken<MagicTransitTracerouteResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
