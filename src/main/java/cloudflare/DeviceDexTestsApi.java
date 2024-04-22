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


import org.openapitools.client.model.DeviceDexTestDeleteDeviceDexTest4XXResponse;
import org.openapitools.client.model.DeviceDexTestDetails4XXResponse;
import org.openapitools.client.model.TeamsDevicesDeviceDexTestSchemasHttp;
import org.openapitools.client.model.TeamsDevicesDexResponseCollection;
import org.openapitools.client.model.TeamsDevicesDexSingleResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeviceDexTestsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DeviceDexTestsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeviceDexTestsApi(ApiClient apiClient) {
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
     * Build call for deviceDexTestCreateDeviceDexTest
     * @param accountId  (required)
     * @param teamsDevicesDeviceDexTestSchemasHttp  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Dex test response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Dex test response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deviceDexTestCreateDeviceDexTestCall(Object accountId, TeamsDevicesDeviceDexTestSchemasHttp teamsDevicesDeviceDexTestSchemasHttp, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = teamsDevicesDeviceDexTestSchemasHttp;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/devices/dex_tests"
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
    private okhttp3.Call deviceDexTestCreateDeviceDexTestValidateBeforeCall(Object accountId, TeamsDevicesDeviceDexTestSchemasHttp teamsDevicesDeviceDexTestSchemasHttp, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling deviceDexTestCreateDeviceDexTest(Async)");
        }

        // verify the required parameter 'teamsDevicesDeviceDexTestSchemasHttp' is set
        if (teamsDevicesDeviceDexTestSchemasHttp == null) {
            throw new ApiException("Missing the required parameter 'teamsDevicesDeviceDexTestSchemasHttp' when calling deviceDexTestCreateDeviceDexTest(Async)");
        }

        return deviceDexTestCreateDeviceDexTestCall(accountId, teamsDevicesDeviceDexTestSchemasHttp, _callback);

    }

    /**
     * Create Device DEX test
     * Create a DEX test.
     * @param accountId  (required)
     * @param teamsDevicesDeviceDexTestSchemasHttp  (required)
     * @return TeamsDevicesDexSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Dex test response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Dex test response failure </td><td>  -  </td></tr>
     </table>
     */
    public TeamsDevicesDexSingleResponse deviceDexTestCreateDeviceDexTest(Object accountId, TeamsDevicesDeviceDexTestSchemasHttp teamsDevicesDeviceDexTestSchemasHttp) throws ApiException {
        ApiResponse<TeamsDevicesDexSingleResponse> localVarResp = deviceDexTestCreateDeviceDexTestWithHttpInfo(accountId, teamsDevicesDeviceDexTestSchemasHttp);
        return localVarResp.getData();
    }

    /**
     * Create Device DEX test
     * Create a DEX test.
     * @param accountId  (required)
     * @param teamsDevicesDeviceDexTestSchemasHttp  (required)
     * @return ApiResponse&lt;TeamsDevicesDexSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Dex test response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Dex test response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TeamsDevicesDexSingleResponse> deviceDexTestCreateDeviceDexTestWithHttpInfo(Object accountId, TeamsDevicesDeviceDexTestSchemasHttp teamsDevicesDeviceDexTestSchemasHttp) throws ApiException {
        okhttp3.Call localVarCall = deviceDexTestCreateDeviceDexTestValidateBeforeCall(accountId, teamsDevicesDeviceDexTestSchemasHttp, null);
        Type localVarReturnType = new TypeToken<TeamsDevicesDexSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Device DEX test (asynchronously)
     * Create a DEX test.
     * @param accountId  (required)
     * @param teamsDevicesDeviceDexTestSchemasHttp  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Dex test response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Dex test response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deviceDexTestCreateDeviceDexTestAsync(Object accountId, TeamsDevicesDeviceDexTestSchemasHttp teamsDevicesDeviceDexTestSchemasHttp, final ApiCallback<TeamsDevicesDexSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deviceDexTestCreateDeviceDexTestValidateBeforeCall(accountId, teamsDevicesDeviceDexTestSchemasHttp, _callback);
        Type localVarReturnType = new TypeToken<TeamsDevicesDexSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deviceDexTestDeleteDeviceDexTest
     * @param accountId  (required)
     * @param dexTestId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Device DEX test response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete DEX test response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deviceDexTestDeleteDeviceDexTestCall(Object accountId, String dexTestId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/devices/dex_tests/{dex_test_id}"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()))
            .replace("{" + "dex_test_id" + "}", localVarApiClient.escapeString(dexTestId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deviceDexTestDeleteDeviceDexTestValidateBeforeCall(Object accountId, String dexTestId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling deviceDexTestDeleteDeviceDexTest(Async)");
        }

        // verify the required parameter 'dexTestId' is set
        if (dexTestId == null) {
            throw new ApiException("Missing the required parameter 'dexTestId' when calling deviceDexTestDeleteDeviceDexTest(Async)");
        }

        return deviceDexTestDeleteDeviceDexTestCall(accountId, dexTestId, _callback);

    }

    /**
     * Delete Device DEX test
     * Delete a Device DEX test. Returns the remaining device dex tests for the account.
     * @param accountId  (required)
     * @param dexTestId  (required)
     * @return TeamsDevicesDexResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Device DEX test response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete DEX test response failure </td><td>  -  </td></tr>
     </table>
     */
    public TeamsDevicesDexResponseCollection deviceDexTestDeleteDeviceDexTest(Object accountId, String dexTestId) throws ApiException {
        ApiResponse<TeamsDevicesDexResponseCollection> localVarResp = deviceDexTestDeleteDeviceDexTestWithHttpInfo(accountId, dexTestId);
        return localVarResp.getData();
    }

    /**
     * Delete Device DEX test
     * Delete a Device DEX test. Returns the remaining device dex tests for the account.
     * @param accountId  (required)
     * @param dexTestId  (required)
     * @return ApiResponse&lt;TeamsDevicesDexResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Device DEX test response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete DEX test response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TeamsDevicesDexResponseCollection> deviceDexTestDeleteDeviceDexTestWithHttpInfo(Object accountId, String dexTestId) throws ApiException {
        okhttp3.Call localVarCall = deviceDexTestDeleteDeviceDexTestValidateBeforeCall(accountId, dexTestId, null);
        Type localVarReturnType = new TypeToken<TeamsDevicesDexResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Device DEX test (asynchronously)
     * Delete a Device DEX test. Returns the remaining device dex tests for the account.
     * @param accountId  (required)
     * @param dexTestId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete Device DEX test response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete DEX test response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deviceDexTestDeleteDeviceDexTestAsync(Object accountId, String dexTestId, final ApiCallback<TeamsDevicesDexResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = deviceDexTestDeleteDeviceDexTestValidateBeforeCall(accountId, dexTestId, _callback);
        Type localVarReturnType = new TypeToken<TeamsDevicesDexResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deviceDexTestDetails
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Device DEX test details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Device DEX test response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deviceDexTestDetailsCall(Object accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/devices/dex_tests"
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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deviceDexTestDetailsValidateBeforeCall(Object accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling deviceDexTestDetails(Async)");
        }

        return deviceDexTestDetailsCall(accountId, _callback);

    }

    /**
     * List Device DEX tests
     * Fetch all DEX tests.
     * @param accountId  (required)
     * @return TeamsDevicesDexResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Device DEX test details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Device DEX test response failure </td><td>  -  </td></tr>
     </table>
     */
    public TeamsDevicesDexResponseCollection deviceDexTestDetails(Object accountId) throws ApiException {
        ApiResponse<TeamsDevicesDexResponseCollection> localVarResp = deviceDexTestDetailsWithHttpInfo(accountId);
        return localVarResp.getData();
    }

    /**
     * List Device DEX tests
     * Fetch all DEX tests.
     * @param accountId  (required)
     * @return ApiResponse&lt;TeamsDevicesDexResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Device DEX test details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Device DEX test response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TeamsDevicesDexResponseCollection> deviceDexTestDetailsWithHttpInfo(Object accountId) throws ApiException {
        okhttp3.Call localVarCall = deviceDexTestDetailsValidateBeforeCall(accountId, null);
        Type localVarReturnType = new TypeToken<TeamsDevicesDexResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Device DEX tests (asynchronously)
     * Fetch all DEX tests.
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Device DEX test details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Device DEX test response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deviceDexTestDetailsAsync(Object accountId, final ApiCallback<TeamsDevicesDexResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = deviceDexTestDetailsValidateBeforeCall(accountId, _callback);
        Type localVarReturnType = new TypeToken<TeamsDevicesDexResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deviceDexTestGetDeviceDexTest
     * @param accountId  (required)
     * @param dexTestId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Device DEX test details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Device DEX test response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deviceDexTestGetDeviceDexTestCall(Object accountId, String dexTestId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/devices/dex_tests/{dex_test_id}"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()))
            .replace("{" + "dex_test_id" + "}", localVarApiClient.escapeString(dexTestId.toString()));

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
    private okhttp3.Call deviceDexTestGetDeviceDexTestValidateBeforeCall(Object accountId, String dexTestId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling deviceDexTestGetDeviceDexTest(Async)");
        }

        // verify the required parameter 'dexTestId' is set
        if (dexTestId == null) {
            throw new ApiException("Missing the required parameter 'dexTestId' when calling deviceDexTestGetDeviceDexTest(Async)");
        }

        return deviceDexTestGetDeviceDexTestCall(accountId, dexTestId, _callback);

    }

    /**
     * Get Device DEX test
     * Fetch a single DEX test.
     * @param accountId  (required)
     * @param dexTestId  (required)
     * @return TeamsDevicesDexSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Device DEX test details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Device DEX test response failure </td><td>  -  </td></tr>
     </table>
     */
    public TeamsDevicesDexSingleResponse deviceDexTestGetDeviceDexTest(Object accountId, String dexTestId) throws ApiException {
        ApiResponse<TeamsDevicesDexSingleResponse> localVarResp = deviceDexTestGetDeviceDexTestWithHttpInfo(accountId, dexTestId);
        return localVarResp.getData();
    }

    /**
     * Get Device DEX test
     * Fetch a single DEX test.
     * @param accountId  (required)
     * @param dexTestId  (required)
     * @return ApiResponse&lt;TeamsDevicesDexSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Device DEX test details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Device DEX test response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TeamsDevicesDexSingleResponse> deviceDexTestGetDeviceDexTestWithHttpInfo(Object accountId, String dexTestId) throws ApiException {
        okhttp3.Call localVarCall = deviceDexTestGetDeviceDexTestValidateBeforeCall(accountId, dexTestId, null);
        Type localVarReturnType = new TypeToken<TeamsDevicesDexSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Device DEX test (asynchronously)
     * Fetch a single DEX test.
     * @param accountId  (required)
     * @param dexTestId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Device DEX test details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Device DEX test response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deviceDexTestGetDeviceDexTestAsync(Object accountId, String dexTestId, final ApiCallback<TeamsDevicesDexSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deviceDexTestGetDeviceDexTestValidateBeforeCall(accountId, dexTestId, _callback);
        Type localVarReturnType = new TypeToken<TeamsDevicesDexSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deviceDexTestUpdateDeviceDexTest
     * @param accountId  (required)
     * @param dexTestId  (required)
     * @param teamsDevicesDeviceDexTestSchemasHttp  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Dex test response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Dex test response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deviceDexTestUpdateDeviceDexTestCall(Object accountId, String dexTestId, TeamsDevicesDeviceDexTestSchemasHttp teamsDevicesDeviceDexTestSchemasHttp, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = teamsDevicesDeviceDexTestSchemasHttp;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/devices/dex_tests/{dex_test_id}"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()))
            .replace("{" + "dex_test_id" + "}", localVarApiClient.escapeString(dexTestId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deviceDexTestUpdateDeviceDexTestValidateBeforeCall(Object accountId, String dexTestId, TeamsDevicesDeviceDexTestSchemasHttp teamsDevicesDeviceDexTestSchemasHttp, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling deviceDexTestUpdateDeviceDexTest(Async)");
        }

        // verify the required parameter 'dexTestId' is set
        if (dexTestId == null) {
            throw new ApiException("Missing the required parameter 'dexTestId' when calling deviceDexTestUpdateDeviceDexTest(Async)");
        }

        // verify the required parameter 'teamsDevicesDeviceDexTestSchemasHttp' is set
        if (teamsDevicesDeviceDexTestSchemasHttp == null) {
            throw new ApiException("Missing the required parameter 'teamsDevicesDeviceDexTestSchemasHttp' when calling deviceDexTestUpdateDeviceDexTest(Async)");
        }

        return deviceDexTestUpdateDeviceDexTestCall(accountId, dexTestId, teamsDevicesDeviceDexTestSchemasHttp, _callback);

    }

    /**
     * Update Device DEX test
     * Update a DEX test.
     * @param accountId  (required)
     * @param dexTestId  (required)
     * @param teamsDevicesDeviceDexTestSchemasHttp  (required)
     * @return TeamsDevicesDexSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Dex test response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Dex test response failure </td><td>  -  </td></tr>
     </table>
     */
    public TeamsDevicesDexSingleResponse deviceDexTestUpdateDeviceDexTest(Object accountId, String dexTestId, TeamsDevicesDeviceDexTestSchemasHttp teamsDevicesDeviceDexTestSchemasHttp) throws ApiException {
        ApiResponse<TeamsDevicesDexSingleResponse> localVarResp = deviceDexTestUpdateDeviceDexTestWithHttpInfo(accountId, dexTestId, teamsDevicesDeviceDexTestSchemasHttp);
        return localVarResp.getData();
    }

    /**
     * Update Device DEX test
     * Update a DEX test.
     * @param accountId  (required)
     * @param dexTestId  (required)
     * @param teamsDevicesDeviceDexTestSchemasHttp  (required)
     * @return ApiResponse&lt;TeamsDevicesDexSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Dex test response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Dex test response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TeamsDevicesDexSingleResponse> deviceDexTestUpdateDeviceDexTestWithHttpInfo(Object accountId, String dexTestId, TeamsDevicesDeviceDexTestSchemasHttp teamsDevicesDeviceDexTestSchemasHttp) throws ApiException {
        okhttp3.Call localVarCall = deviceDexTestUpdateDeviceDexTestValidateBeforeCall(accountId, dexTestId, teamsDevicesDeviceDexTestSchemasHttp, null);
        Type localVarReturnType = new TypeToken<TeamsDevicesDexSingleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Device DEX test (asynchronously)
     * Update a DEX test.
     * @param accountId  (required)
     * @param dexTestId  (required)
     * @param teamsDevicesDeviceDexTestSchemasHttp  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update Dex test response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update Dex test response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deviceDexTestUpdateDeviceDexTestAsync(Object accountId, String dexTestId, TeamsDevicesDeviceDexTestSchemasHttp teamsDevicesDeviceDexTestSchemasHttp, final ApiCallback<TeamsDevicesDexSingleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deviceDexTestUpdateDeviceDexTestValidateBeforeCall(accountId, dexTestId, teamsDevicesDeviceDexTestSchemasHttp, _callback);
        Type localVarReturnType = new TypeToken<TeamsDevicesDexSingleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}