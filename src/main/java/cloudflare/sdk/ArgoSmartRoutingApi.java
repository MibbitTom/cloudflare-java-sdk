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


import cloudflare.sdk.models.ArgoConfigPatch;
import cloudflare.sdk.models.ArgoConfigResponseSingle;
import cloudflare.sdk.models.ArgoSmartRoutingGetArgoSmartRoutingSetting4XXResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArgoSmartRoutingApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ArgoSmartRoutingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ArgoSmartRoutingApi(ApiClient apiClient) {
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
     * Build call for argoSmartRoutingGetArgoSmartRoutingSetting
     * @param zoneId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Argo Smart Routing setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Argo Smart Routing setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call argoSmartRoutingGetArgoSmartRoutingSettingCall(String zoneId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/argo/smart_routing"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call argoSmartRoutingGetArgoSmartRoutingSettingValidateBeforeCall(String zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling argoSmartRoutingGetArgoSmartRoutingSetting(Async)");
        }

        return argoSmartRoutingGetArgoSmartRoutingSettingCall(zoneId, _callback);

    }

    /**
     * Get Argo Smart Routing setting
     * 
     * @param zoneId  (required)
     * @return ArgoConfigResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Argo Smart Routing setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Argo Smart Routing setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public ArgoConfigResponseSingle argoSmartRoutingGetArgoSmartRoutingSetting(String zoneId) throws ApiException {
        ApiResponse<ArgoConfigResponseSingle> localVarResp = argoSmartRoutingGetArgoSmartRoutingSettingWithHttpInfo(zoneId);
        return localVarResp.getData();
    }

    /**
     * Get Argo Smart Routing setting
     * 
     * @param zoneId  (required)
     * @return ApiResponse&lt;ArgoConfigResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Argo Smart Routing setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Argo Smart Routing setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ArgoConfigResponseSingle> argoSmartRoutingGetArgoSmartRoutingSettingWithHttpInfo(String zoneId) throws ApiException {
        okhttp3.Call localVarCall = argoSmartRoutingGetArgoSmartRoutingSettingValidateBeforeCall(zoneId, null);
        Type localVarReturnType = new TypeToken<ArgoConfigResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Argo Smart Routing setting (asynchronously)
     * 
     * @param zoneId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Argo Smart Routing setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Argo Smart Routing setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call argoSmartRoutingGetArgoSmartRoutingSettingAsync(String zoneId, final ApiCallback<ArgoConfigResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = argoSmartRoutingGetArgoSmartRoutingSettingValidateBeforeCall(zoneId, _callback);
        Type localVarReturnType = new TypeToken<ArgoConfigResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for argoSmartRoutingPatchArgoSmartRoutingSetting
     * @param zoneId  (required)
     * @param argoConfigPatch  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Patch Argo Smart Routing setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Patch Argo Smart Routing setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call argoSmartRoutingPatchArgoSmartRoutingSettingCall(String zoneId, ArgoConfigPatch argoConfigPatch, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = argoConfigPatch;

        // create path and map variables
        String localVarPath = "/zones/{zone_id}/argo/smart_routing"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call argoSmartRoutingPatchArgoSmartRoutingSettingValidateBeforeCall(String zoneId, ArgoConfigPatch argoConfigPatch, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling argoSmartRoutingPatchArgoSmartRoutingSetting(Async)");
        }

        // verify the required parameter 'argoConfigPatch' is set
        if (argoConfigPatch == null) {
            throw new ApiException("Missing the required parameter 'argoConfigPatch' when calling argoSmartRoutingPatchArgoSmartRoutingSetting(Async)");
        }

        return argoSmartRoutingPatchArgoSmartRoutingSettingCall(zoneId, argoConfigPatch, _callback);

    }

    /**
     * Patch Argo Smart Routing setting
     * Updates enablement of Argo Smart Routing.
     * @param zoneId  (required)
     * @param argoConfigPatch  (required)
     * @return ArgoConfigResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Patch Argo Smart Routing setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Patch Argo Smart Routing setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public ArgoConfigResponseSingle argoSmartRoutingPatchArgoSmartRoutingSetting(String zoneId, ArgoConfigPatch argoConfigPatch) throws ApiException {
        ApiResponse<ArgoConfigResponseSingle> localVarResp = argoSmartRoutingPatchArgoSmartRoutingSettingWithHttpInfo(zoneId, argoConfigPatch);
        return localVarResp.getData();
    }

    /**
     * Patch Argo Smart Routing setting
     * Updates enablement of Argo Smart Routing.
     * @param zoneId  (required)
     * @param argoConfigPatch  (required)
     * @return ApiResponse&lt;ArgoConfigResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Patch Argo Smart Routing setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Patch Argo Smart Routing setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ArgoConfigResponseSingle> argoSmartRoutingPatchArgoSmartRoutingSettingWithHttpInfo(String zoneId, ArgoConfigPatch argoConfigPatch) throws ApiException {
        okhttp3.Call localVarCall = argoSmartRoutingPatchArgoSmartRoutingSettingValidateBeforeCall(zoneId, argoConfigPatch, null);
        Type localVarReturnType = new TypeToken<ArgoConfigResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Patch Argo Smart Routing setting (asynchronously)
     * Updates enablement of Argo Smart Routing.
     * @param zoneId  (required)
     * @param argoConfigPatch  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Patch Argo Smart Routing setting response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Patch Argo Smart Routing setting response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call argoSmartRoutingPatchArgoSmartRoutingSettingAsync(String zoneId, ArgoConfigPatch argoConfigPatch, final ApiCallback<ArgoConfigResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = argoSmartRoutingPatchArgoSmartRoutingSettingValidateBeforeCall(zoneId, argoConfigPatch, _callback);
        Type localVarReturnType = new TypeToken<ArgoConfigResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
