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


import java.math.BigDecimal;
import cloudflare.sdk.models.BillSubsApiBillingHistoryCollection;
import java.time.OffsetDateTime;
import cloudflare.sdk.models.UserBillingHistoryDeprecatedBillingHistoryDetails4XXResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserBillingHistoryApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UserBillingHistoryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserBillingHistoryApi(ApiClient apiClient) {
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
     * Build call for userBillingHistoryDeprecatedBillingHistoryDetails
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 20)
     * @param order  (optional)
     * @param occuredAt  (optional)
     * @param occurredAt  (optional)
     * @param type  (optional)
     * @param action  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Billing History Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Billing History Details response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call userBillingHistoryDeprecatedBillingHistoryDetailsCall(BigDecimal page, BigDecimal perPage, String order, OffsetDateTime occuredAt, OffsetDateTime occurredAt, String type, String action, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/user/billing/history";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

        if (order != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order", order));
        }

        if (occuredAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("occured_at", occuredAt));
        }

        if (occurredAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("occurred_at", occurredAt));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (action != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("action", action));
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

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call userBillingHistoryDeprecatedBillingHistoryDetailsValidateBeforeCall(BigDecimal page, BigDecimal perPage, String order, OffsetDateTime occuredAt, OffsetDateTime occurredAt, String type, String action, final ApiCallback _callback) throws ApiException {
        return userBillingHistoryDeprecatedBillingHistoryDetailsCall(page, perPage, order, occuredAt, occurredAt, type, action, _callback);

    }

    /**
     * Billing History Details
     * Accesses your billing history object.
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 20)
     * @param order  (optional)
     * @param occuredAt  (optional)
     * @param occurredAt  (optional)
     * @param type  (optional)
     * @param action  (optional)
     * @return BillSubsApiBillingHistoryCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Billing History Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Billing History Details response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public BillSubsApiBillingHistoryCollection userBillingHistoryDeprecatedBillingHistoryDetails(BigDecimal page, BigDecimal perPage, String order, OffsetDateTime occuredAt, OffsetDateTime occurredAt, String type, String action) throws ApiException {
        ApiResponse<BillSubsApiBillingHistoryCollection> localVarResp = userBillingHistoryDeprecatedBillingHistoryDetailsWithHttpInfo(page, perPage, order, occuredAt, occurredAt, type, action);
        return localVarResp.getData();
    }

    /**
     * Billing History Details
     * Accesses your billing history object.
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 20)
     * @param order  (optional)
     * @param occuredAt  (optional)
     * @param occurredAt  (optional)
     * @param type  (optional)
     * @param action  (optional)
     * @return ApiResponse&lt;BillSubsApiBillingHistoryCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Billing History Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Billing History Details response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<BillSubsApiBillingHistoryCollection> userBillingHistoryDeprecatedBillingHistoryDetailsWithHttpInfo(BigDecimal page, BigDecimal perPage, String order, OffsetDateTime occuredAt, OffsetDateTime occurredAt, String type, String action) throws ApiException {
        okhttp3.Call localVarCall = userBillingHistoryDeprecatedBillingHistoryDetailsValidateBeforeCall(page, perPage, order, occuredAt, occurredAt, type, action, null);
        Type localVarReturnType = new TypeToken<BillSubsApiBillingHistoryCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Billing History Details (asynchronously)
     * Accesses your billing history object.
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 20)
     * @param order  (optional)
     * @param occuredAt  (optional)
     * @param occurredAt  (optional)
     * @param type  (optional)
     * @param action  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Billing History Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Billing History Details response failure </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call userBillingHistoryDeprecatedBillingHistoryDetailsAsync(BigDecimal page, BigDecimal perPage, String order, OffsetDateTime occuredAt, OffsetDateTime occurredAt, String type, String action, final ApiCallback<BillSubsApiBillingHistoryCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = userBillingHistoryDeprecatedBillingHistoryDetailsValidateBeforeCall(page, perPage, order, occuredAt, occurredAt, type, action, _callback);
        Type localVarReturnType = new TypeToken<BillSubsApiBillingHistoryCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}