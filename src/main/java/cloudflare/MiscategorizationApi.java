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


import org.openapitools.client.model.IntelApiResponseSingle;
import org.openapitools.client.model.IntelMiscategorization;
import org.openapitools.client.model.MiscategorizationCreateMiscategorization4XXResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MiscategorizationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MiscategorizationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MiscategorizationApi(ApiClient apiClient) {
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
     * Build call for miscategorizationCreateMiscategorization
     * @param accountId  (required)
     * @param intelMiscategorization  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Miscategorization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Miscategorization response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call miscategorizationCreateMiscategorizationCall(String accountId, IntelMiscategorization intelMiscategorization, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = intelMiscategorization;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/intel/miscategorization"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call miscategorizationCreateMiscategorizationValidateBeforeCall(String accountId, IntelMiscategorization intelMiscategorization, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling miscategorizationCreateMiscategorization(Async)");
        }

        // verify the required parameter 'intelMiscategorization' is set
        if (intelMiscategorization == null) {
            throw new ApiException("Missing the required parameter 'intelMiscategorization' when calling miscategorizationCreateMiscategorization(Async)");
        }

        return miscategorizationCreateMiscategorizationCall(accountId, intelMiscategorization, _callback);

    }

    /**
     * Create Miscategorization
     * 
     * @param accountId  (required)
     * @param intelMiscategorization  (required)
     * @return IntelApiResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Miscategorization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Miscategorization response failure </td><td>  -  </td></tr>
     </table>
     */
    public IntelApiResponseSingle miscategorizationCreateMiscategorization(String accountId, IntelMiscategorization intelMiscategorization) throws ApiException {
        ApiResponse<IntelApiResponseSingle> localVarResp = miscategorizationCreateMiscategorizationWithHttpInfo(accountId, intelMiscategorization);
        return localVarResp.getData();
    }

    /**
     * Create Miscategorization
     * 
     * @param accountId  (required)
     * @param intelMiscategorization  (required)
     * @return ApiResponse&lt;IntelApiResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Miscategorization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Miscategorization response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IntelApiResponseSingle> miscategorizationCreateMiscategorizationWithHttpInfo(String accountId, IntelMiscategorization intelMiscategorization) throws ApiException {
        okhttp3.Call localVarCall = miscategorizationCreateMiscategorizationValidateBeforeCall(accountId, intelMiscategorization, null);
        Type localVarReturnType = new TypeToken<IntelApiResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Miscategorization (asynchronously)
     * 
     * @param accountId  (required)
     * @param intelMiscategorization  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Miscategorization response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Miscategorization response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call miscategorizationCreateMiscategorizationAsync(String accountId, IntelMiscategorization intelMiscategorization, final ApiCallback<IntelApiResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = miscategorizationCreateMiscategorizationValidateBeforeCall(accountId, intelMiscategorization, _callback);
        Type localVarReturnType = new TypeToken<IntelApiResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
