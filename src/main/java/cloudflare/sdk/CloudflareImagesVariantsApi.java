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


import cloudflare.sdk.models.CloudflareImagesVariantsCreateAVariant4XXResponse;
import cloudflare.sdk.models.CloudflareImagesVariantsDeleteAVariant4XXResponse;
import cloudflare.sdk.models.CloudflareImagesVariantsListVariants4XXResponse;
import cloudflare.sdk.models.ImagesDeletedResponse;
import cloudflare.sdk.models.ImagesImageVariantDefinition;
import cloudflare.sdk.models.ImagesImageVariantListResponse;
import cloudflare.sdk.models.ImagesImageVariantPatchRequest;
import cloudflare.sdk.models.ImagesImageVariantSimpleResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloudflareImagesVariantsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CloudflareImagesVariantsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CloudflareImagesVariantsApi(ApiClient apiClient) {
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
     * Build call for cloudflareImagesVariantsCreateAVariant
     * @param accountId  (required)
     * @param imagesImageVariantDefinition  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create a variant response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create a variant response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cloudflareImagesVariantsCreateAVariantCall(String accountId, ImagesImageVariantDefinition imagesImageVariantDefinition, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = imagesImageVariantDefinition;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/images/v1/variants"
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
    private okhttp3.Call cloudflareImagesVariantsCreateAVariantValidateBeforeCall(String accountId, ImagesImageVariantDefinition imagesImageVariantDefinition, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling cloudflareImagesVariantsCreateAVariant(Async)");
        }

        // verify the required parameter 'imagesImageVariantDefinition' is set
        if (imagesImageVariantDefinition == null) {
            throw new ApiException("Missing the required parameter 'imagesImageVariantDefinition' when calling cloudflareImagesVariantsCreateAVariant(Async)");
        }

        return cloudflareImagesVariantsCreateAVariantCall(accountId, imagesImageVariantDefinition, _callback);

    }

    /**
     * Create a variant
     * Specify variants that allow you to resize images for different use cases.
     * @param accountId  (required)
     * @param imagesImageVariantDefinition  (required)
     * @return ImagesImageVariantSimpleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create a variant response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create a variant response failure </td><td>  -  </td></tr>
     </table>
     */
    public ImagesImageVariantSimpleResponse cloudflareImagesVariantsCreateAVariant(String accountId, ImagesImageVariantDefinition imagesImageVariantDefinition) throws ApiException {
        ApiResponse<ImagesImageVariantSimpleResponse> localVarResp = cloudflareImagesVariantsCreateAVariantWithHttpInfo(accountId, imagesImageVariantDefinition);
        return localVarResp.getData();
    }

    /**
     * Create a variant
     * Specify variants that allow you to resize images for different use cases.
     * @param accountId  (required)
     * @param imagesImageVariantDefinition  (required)
     * @return ApiResponse&lt;ImagesImageVariantSimpleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create a variant response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create a variant response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImagesImageVariantSimpleResponse> cloudflareImagesVariantsCreateAVariantWithHttpInfo(String accountId, ImagesImageVariantDefinition imagesImageVariantDefinition) throws ApiException {
        okhttp3.Call localVarCall = cloudflareImagesVariantsCreateAVariantValidateBeforeCall(accountId, imagesImageVariantDefinition, null);
        Type localVarReturnType = new TypeToken<ImagesImageVariantSimpleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a variant (asynchronously)
     * Specify variants that allow you to resize images for different use cases.
     * @param accountId  (required)
     * @param imagesImageVariantDefinition  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create a variant response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create a variant response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cloudflareImagesVariantsCreateAVariantAsync(String accountId, ImagesImageVariantDefinition imagesImageVariantDefinition, final ApiCallback<ImagesImageVariantSimpleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = cloudflareImagesVariantsCreateAVariantValidateBeforeCall(accountId, imagesImageVariantDefinition, _callback);
        Type localVarReturnType = new TypeToken<ImagesImageVariantSimpleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for cloudflareImagesVariantsDeleteAVariant
     * @param variantId  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete a variant response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete a variant response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cloudflareImagesVariantsDeleteAVariantCall(Object variantId, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/images/v1/variants/{variant_id}"
            .replace("{" + "variant_id" + "}", localVarApiClient.escapeString(variantId.toString()))
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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cloudflareImagesVariantsDeleteAVariantValidateBeforeCall(Object variantId, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'variantId' is set
        if (variantId == null) {
            throw new ApiException("Missing the required parameter 'variantId' when calling cloudflareImagesVariantsDeleteAVariant(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling cloudflareImagesVariantsDeleteAVariant(Async)");
        }

        return cloudflareImagesVariantsDeleteAVariantCall(variantId, accountId, _callback);

    }

    /**
     * Delete a variant
     * Deleting a variant purges the cache for all images associated with the variant.
     * @param variantId  (required)
     * @param accountId  (required)
     * @return ImagesDeletedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete a variant response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete a variant response failure </td><td>  -  </td></tr>
     </table>
     */
    public ImagesDeletedResponse cloudflareImagesVariantsDeleteAVariant(Object variantId, String accountId) throws ApiException {
        ApiResponse<ImagesDeletedResponse> localVarResp = cloudflareImagesVariantsDeleteAVariantWithHttpInfo(variantId, accountId);
        return localVarResp.getData();
    }

    /**
     * Delete a variant
     * Deleting a variant purges the cache for all images associated with the variant.
     * @param variantId  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;ImagesDeletedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete a variant response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete a variant response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImagesDeletedResponse> cloudflareImagesVariantsDeleteAVariantWithHttpInfo(Object variantId, String accountId) throws ApiException {
        okhttp3.Call localVarCall = cloudflareImagesVariantsDeleteAVariantValidateBeforeCall(variantId, accountId, null);
        Type localVarReturnType = new TypeToken<ImagesDeletedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete a variant (asynchronously)
     * Deleting a variant purges the cache for all images associated with the variant.
     * @param variantId  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete a variant response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete a variant response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cloudflareImagesVariantsDeleteAVariantAsync(Object variantId, String accountId, final ApiCallback<ImagesDeletedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = cloudflareImagesVariantsDeleteAVariantValidateBeforeCall(variantId, accountId, _callback);
        Type localVarReturnType = new TypeToken<ImagesDeletedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for cloudflareImagesVariantsListVariants
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List variants response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List variants response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cloudflareImagesVariantsListVariantsCall(String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/images/v1/variants"
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

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cloudflareImagesVariantsListVariantsValidateBeforeCall(String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling cloudflareImagesVariantsListVariants(Async)");
        }

        return cloudflareImagesVariantsListVariantsCall(accountId, _callback);

    }

    /**
     * List variants
     * Lists existing variants.
     * @param accountId  (required)
     * @return ImagesImageVariantListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List variants response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List variants response failure </td><td>  -  </td></tr>
     </table>
     */
    public ImagesImageVariantListResponse cloudflareImagesVariantsListVariants(String accountId) throws ApiException {
        ApiResponse<ImagesImageVariantListResponse> localVarResp = cloudflareImagesVariantsListVariantsWithHttpInfo(accountId);
        return localVarResp.getData();
    }

    /**
     * List variants
     * Lists existing variants.
     * @param accountId  (required)
     * @return ApiResponse&lt;ImagesImageVariantListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List variants response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List variants response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImagesImageVariantListResponse> cloudflareImagesVariantsListVariantsWithHttpInfo(String accountId) throws ApiException {
        okhttp3.Call localVarCall = cloudflareImagesVariantsListVariantsValidateBeforeCall(accountId, null);
        Type localVarReturnType = new TypeToken<ImagesImageVariantListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List variants (asynchronously)
     * Lists existing variants.
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List variants response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List variants response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cloudflareImagesVariantsListVariantsAsync(String accountId, final ApiCallback<ImagesImageVariantListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = cloudflareImagesVariantsListVariantsValidateBeforeCall(accountId, _callback);
        Type localVarReturnType = new TypeToken<ImagesImageVariantListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for cloudflareImagesVariantsUpdateAVariant
     * @param variantId  (required)
     * @param accountId  (required)
     * @param imagesImageVariantPatchRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a variant response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a variant response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cloudflareImagesVariantsUpdateAVariantCall(Object variantId, String accountId, ImagesImageVariantPatchRequest imagesImageVariantPatchRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = imagesImageVariantPatchRequest;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/images/v1/variants/{variant_id}"
            .replace("{" + "variant_id" + "}", localVarApiClient.escapeString(variantId.toString()))
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
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cloudflareImagesVariantsUpdateAVariantValidateBeforeCall(Object variantId, String accountId, ImagesImageVariantPatchRequest imagesImageVariantPatchRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'variantId' is set
        if (variantId == null) {
            throw new ApiException("Missing the required parameter 'variantId' when calling cloudflareImagesVariantsUpdateAVariant(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling cloudflareImagesVariantsUpdateAVariant(Async)");
        }

        // verify the required parameter 'imagesImageVariantPatchRequest' is set
        if (imagesImageVariantPatchRequest == null) {
            throw new ApiException("Missing the required parameter 'imagesImageVariantPatchRequest' when calling cloudflareImagesVariantsUpdateAVariant(Async)");
        }

        return cloudflareImagesVariantsUpdateAVariantCall(variantId, accountId, imagesImageVariantPatchRequest, _callback);

    }

    /**
     * Update a variant
     * Updating a variant purges the cache for all images associated with the variant.
     * @param variantId  (required)
     * @param accountId  (required)
     * @param imagesImageVariantPatchRequest  (required)
     * @return ImagesImageVariantSimpleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a variant response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a variant response failure </td><td>  -  </td></tr>
     </table>
     */
    public ImagesImageVariantSimpleResponse cloudflareImagesVariantsUpdateAVariant(Object variantId, String accountId, ImagesImageVariantPatchRequest imagesImageVariantPatchRequest) throws ApiException {
        ApiResponse<ImagesImageVariantSimpleResponse> localVarResp = cloudflareImagesVariantsUpdateAVariantWithHttpInfo(variantId, accountId, imagesImageVariantPatchRequest);
        return localVarResp.getData();
    }

    /**
     * Update a variant
     * Updating a variant purges the cache for all images associated with the variant.
     * @param variantId  (required)
     * @param accountId  (required)
     * @param imagesImageVariantPatchRequest  (required)
     * @return ApiResponse&lt;ImagesImageVariantSimpleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a variant response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a variant response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImagesImageVariantSimpleResponse> cloudflareImagesVariantsUpdateAVariantWithHttpInfo(Object variantId, String accountId, ImagesImageVariantPatchRequest imagesImageVariantPatchRequest) throws ApiException {
        okhttp3.Call localVarCall = cloudflareImagesVariantsUpdateAVariantValidateBeforeCall(variantId, accountId, imagesImageVariantPatchRequest, null);
        Type localVarReturnType = new TypeToken<ImagesImageVariantSimpleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a variant (asynchronously)
     * Updating a variant purges the cache for all images associated with the variant.
     * @param variantId  (required)
     * @param accountId  (required)
     * @param imagesImageVariantPatchRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a variant response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a variant response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cloudflareImagesVariantsUpdateAVariantAsync(Object variantId, String accountId, ImagesImageVariantPatchRequest imagesImageVariantPatchRequest, final ApiCallback<ImagesImageVariantSimpleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = cloudflareImagesVariantsUpdateAVariantValidateBeforeCall(variantId, accountId, imagesImageVariantPatchRequest, _callback);
        Type localVarReturnType = new TypeToken<ImagesImageVariantSimpleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for cloudflareImagesVariantsVariantDetails
     * @param variantId  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Variant details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Variant details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cloudflareImagesVariantsVariantDetailsCall(Object variantId, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/images/v1/variants/{variant_id}"
            .replace("{" + "variant_id" + "}", localVarApiClient.escapeString(variantId.toString()))
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

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cloudflareImagesVariantsVariantDetailsValidateBeforeCall(Object variantId, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'variantId' is set
        if (variantId == null) {
            throw new ApiException("Missing the required parameter 'variantId' when calling cloudflareImagesVariantsVariantDetails(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling cloudflareImagesVariantsVariantDetails(Async)");
        }

        return cloudflareImagesVariantsVariantDetailsCall(variantId, accountId, _callback);

    }

    /**
     * Variant details
     * Fetch details for a single variant.
     * @param variantId  (required)
     * @param accountId  (required)
     * @return ImagesImageVariantSimpleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Variant details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Variant details response failure </td><td>  -  </td></tr>
     </table>
     */
    public ImagesImageVariantSimpleResponse cloudflareImagesVariantsVariantDetails(Object variantId, String accountId) throws ApiException {
        ApiResponse<ImagesImageVariantSimpleResponse> localVarResp = cloudflareImagesVariantsVariantDetailsWithHttpInfo(variantId, accountId);
        return localVarResp.getData();
    }

    /**
     * Variant details
     * Fetch details for a single variant.
     * @param variantId  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;ImagesImageVariantSimpleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Variant details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Variant details response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ImagesImageVariantSimpleResponse> cloudflareImagesVariantsVariantDetailsWithHttpInfo(Object variantId, String accountId) throws ApiException {
        okhttp3.Call localVarCall = cloudflareImagesVariantsVariantDetailsValidateBeforeCall(variantId, accountId, null);
        Type localVarReturnType = new TypeToken<ImagesImageVariantSimpleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Variant details (asynchronously)
     * Fetch details for a single variant.
     * @param variantId  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Variant details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Variant details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cloudflareImagesVariantsVariantDetailsAsync(Object variantId, String accountId, final ApiCallback<ImagesImageVariantSimpleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = cloudflareImagesVariantsVariantDetailsValidateBeforeCall(variantId, accountId, _callback);
        Type localVarReturnType = new TypeToken<ImagesImageVariantSimpleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
