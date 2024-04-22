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


import org.openapitools.client.model.AccessApiResponseCommonFailure;
import org.openapitools.client.model.AccessSeat;
import org.openapitools.client.model.AccessSeatsComponentsSchemasResponseCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeroTrustSeatsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ZeroTrustSeatsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZeroTrustSeatsApi(ApiClient apiClient) {
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
     * Build call for zeroTrustSeatsUpdateAUserSeat
     * @param identifier  (required)
     * @param accessSeat  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a user seat response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a user seat response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zeroTrustSeatsUpdateAUserSeatCall(String identifier, List<AccessSeat> accessSeat, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = accessSeat;

        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/seats"
            .replace("{" + "identifier" + "}", localVarApiClient.escapeString(identifier.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call zeroTrustSeatsUpdateAUserSeatValidateBeforeCall(String identifier, List<AccessSeat> accessSeat, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zeroTrustSeatsUpdateAUserSeat(Async)");
        }

        // verify the required parameter 'accessSeat' is set
        if (accessSeat == null) {
            throw new ApiException("Missing the required parameter 'accessSeat' when calling zeroTrustSeatsUpdateAUserSeat(Async)");
        }

        return zeroTrustSeatsUpdateAUserSeatCall(identifier, accessSeat, _callback);

    }

    /**
     * Update a user seat
     * Removes a user from a Zero Trust seat when both &#x60;access_seat&#x60; and &#x60;gateway_seat&#x60; are set to false.
     * @param identifier  (required)
     * @param accessSeat  (required)
     * @return AccessSeatsComponentsSchemasResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a user seat response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a user seat response failure </td><td>  -  </td></tr>
     </table>
     */
    public AccessSeatsComponentsSchemasResponseCollection zeroTrustSeatsUpdateAUserSeat(String identifier, List<AccessSeat> accessSeat) throws ApiException {
        ApiResponse<AccessSeatsComponentsSchemasResponseCollection> localVarResp = zeroTrustSeatsUpdateAUserSeatWithHttpInfo(identifier, accessSeat);
        return localVarResp.getData();
    }

    /**
     * Update a user seat
     * Removes a user from a Zero Trust seat when both &#x60;access_seat&#x60; and &#x60;gateway_seat&#x60; are set to false.
     * @param identifier  (required)
     * @param accessSeat  (required)
     * @return ApiResponse&lt;AccessSeatsComponentsSchemasResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a user seat response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a user seat response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessSeatsComponentsSchemasResponseCollection> zeroTrustSeatsUpdateAUserSeatWithHttpInfo(String identifier, List<AccessSeat> accessSeat) throws ApiException {
        okhttp3.Call localVarCall = zeroTrustSeatsUpdateAUserSeatValidateBeforeCall(identifier, accessSeat, null);
        Type localVarReturnType = new TypeToken<AccessSeatsComponentsSchemasResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a user seat (asynchronously)
     * Removes a user from a Zero Trust seat when both &#x60;access_seat&#x60; and &#x60;gateway_seat&#x60; are set to false.
     * @param identifier  (required)
     * @param accessSeat  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a user seat response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a user seat response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call zeroTrustSeatsUpdateAUserSeatAsync(String identifier, List<AccessSeat> accessSeat, final ApiCallback<AccessSeatsComponentsSchemasResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = zeroTrustSeatsUpdateAUserSeatValidateBeforeCall(identifier, accessSeat, _callback);
        Type localVarReturnType = new TypeToken<AccessSeatsComponentsSchemasResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
