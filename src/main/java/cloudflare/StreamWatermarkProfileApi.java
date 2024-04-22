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


import java.math.BigDecimal;
import org.openapitools.client.model.StreamApiResponseCommonFailure;
import org.openapitools.client.model.StreamWatermarkProfileDeleteWatermarkProfiles200Response;
import org.openapitools.client.model.StreamWatermarkResponseCollection;
import org.openapitools.client.model.StreamWatermarkResponseSingle;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamWatermarkProfileApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StreamWatermarkProfileApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StreamWatermarkProfileApi(ApiClient apiClient) {
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
     * Build call for streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload
     * @param accountId  (required)
     * @param _file The image file to upload. (required)
     * @param name A short description of the watermark profile. (optional, default to )
     * @param opacity The translucency of the image. A value of &#x60;0.0&#x60; makes the image completely transparent, and &#x60;1.0&#x60; makes the image completely opaque. Note that if the image is already semi-transparent, setting this to &#x60;1.0&#x60; will not make the image completely opaque. (optional, default to 1)
     * @param padding The whitespace between the adjacent edges (determined by position) of the video and the image. &#x60;0.0&#x60; indicates no padding, and &#x60;1.0&#x60; indicates a fully padded video width or length, as determined by the algorithm. (optional, default to 0.05)
     * @param position The location of the image. Valid positions are: &#x60;upperRight&#x60;, &#x60;upperLeft&#x60;, &#x60;lowerLeft&#x60;, &#x60;lowerRight&#x60;, and &#x60;center&#x60;. Note that &#x60;center&#x60; ignores the &#x60;padding&#x60; parameter. (optional, default to upperRight)
     * @param scale The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. &#x60;0.0&#x60; indicates no scaling (use the size of the image as-is), and &#x60;1.0 &#x60;fills the entire video. (optional, default to 0.15)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create watermark profiles via basic upload response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create watermark profiles via basic upload response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamWatermarkProfileCreateWatermarkProfilesViaBasicUploadCall(String accountId, String _file, String name, BigDecimal opacity, BigDecimal padding, String position, BigDecimal scale, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/stream/watermarks"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        if (name != null) {
            localVarFormParams.put("name", name);
        }

        if (opacity != null) {
            localVarFormParams.put("opacity", opacity);
        }

        if (padding != null) {
            localVarFormParams.put("padding", padding);
        }

        if (position != null) {
            localVarFormParams.put("position", position);
        }

        if (scale != null) {
            localVarFormParams.put("scale", scale);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call streamWatermarkProfileCreateWatermarkProfilesViaBasicUploadValidateBeforeCall(String accountId, String _file, String name, BigDecimal opacity, BigDecimal padding, String position, BigDecimal scale, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload(Async)");
        }

        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException("Missing the required parameter '_file' when calling streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload(Async)");
        }

        return streamWatermarkProfileCreateWatermarkProfilesViaBasicUploadCall(accountId, _file, name, opacity, padding, position, scale, _callback);

    }

    /**
     * Create watermark profiles via basic upload
     * Creates watermark profiles using a single &#x60;HTTP POST multipart/form-data&#x60; request.
     * @param accountId  (required)
     * @param _file The image file to upload. (required)
     * @param name A short description of the watermark profile. (optional, default to )
     * @param opacity The translucency of the image. A value of &#x60;0.0&#x60; makes the image completely transparent, and &#x60;1.0&#x60; makes the image completely opaque. Note that if the image is already semi-transparent, setting this to &#x60;1.0&#x60; will not make the image completely opaque. (optional, default to 1)
     * @param padding The whitespace between the adjacent edges (determined by position) of the video and the image. &#x60;0.0&#x60; indicates no padding, and &#x60;1.0&#x60; indicates a fully padded video width or length, as determined by the algorithm. (optional, default to 0.05)
     * @param position The location of the image. Valid positions are: &#x60;upperRight&#x60;, &#x60;upperLeft&#x60;, &#x60;lowerLeft&#x60;, &#x60;lowerRight&#x60;, and &#x60;center&#x60;. Note that &#x60;center&#x60; ignores the &#x60;padding&#x60; parameter. (optional, default to upperRight)
     * @param scale The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. &#x60;0.0&#x60; indicates no scaling (use the size of the image as-is), and &#x60;1.0 &#x60;fills the entire video. (optional, default to 0.15)
     * @return StreamWatermarkResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create watermark profiles via basic upload response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create watermark profiles via basic upload response failure </td><td>  -  </td></tr>
     </table>
     */
    public StreamWatermarkResponseSingle streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload(String accountId, String _file, String name, BigDecimal opacity, BigDecimal padding, String position, BigDecimal scale) throws ApiException {
        ApiResponse<StreamWatermarkResponseSingle> localVarResp = streamWatermarkProfileCreateWatermarkProfilesViaBasicUploadWithHttpInfo(accountId, _file, name, opacity, padding, position, scale);
        return localVarResp.getData();
    }

    /**
     * Create watermark profiles via basic upload
     * Creates watermark profiles using a single &#x60;HTTP POST multipart/form-data&#x60; request.
     * @param accountId  (required)
     * @param _file The image file to upload. (required)
     * @param name A short description of the watermark profile. (optional, default to )
     * @param opacity The translucency of the image. A value of &#x60;0.0&#x60; makes the image completely transparent, and &#x60;1.0&#x60; makes the image completely opaque. Note that if the image is already semi-transparent, setting this to &#x60;1.0&#x60; will not make the image completely opaque. (optional, default to 1)
     * @param padding The whitespace between the adjacent edges (determined by position) of the video and the image. &#x60;0.0&#x60; indicates no padding, and &#x60;1.0&#x60; indicates a fully padded video width or length, as determined by the algorithm. (optional, default to 0.05)
     * @param position The location of the image. Valid positions are: &#x60;upperRight&#x60;, &#x60;upperLeft&#x60;, &#x60;lowerLeft&#x60;, &#x60;lowerRight&#x60;, and &#x60;center&#x60;. Note that &#x60;center&#x60; ignores the &#x60;padding&#x60; parameter. (optional, default to upperRight)
     * @param scale The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. &#x60;0.0&#x60; indicates no scaling (use the size of the image as-is), and &#x60;1.0 &#x60;fills the entire video. (optional, default to 0.15)
     * @return ApiResponse&lt;StreamWatermarkResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create watermark profiles via basic upload response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create watermark profiles via basic upload response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StreamWatermarkResponseSingle> streamWatermarkProfileCreateWatermarkProfilesViaBasicUploadWithHttpInfo(String accountId, String _file, String name, BigDecimal opacity, BigDecimal padding, String position, BigDecimal scale) throws ApiException {
        okhttp3.Call localVarCall = streamWatermarkProfileCreateWatermarkProfilesViaBasicUploadValidateBeforeCall(accountId, _file, name, opacity, padding, position, scale, null);
        Type localVarReturnType = new TypeToken<StreamWatermarkResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create watermark profiles via basic upload (asynchronously)
     * Creates watermark profiles using a single &#x60;HTTP POST multipart/form-data&#x60; request.
     * @param accountId  (required)
     * @param _file The image file to upload. (required)
     * @param name A short description of the watermark profile. (optional, default to )
     * @param opacity The translucency of the image. A value of &#x60;0.0&#x60; makes the image completely transparent, and &#x60;1.0&#x60; makes the image completely opaque. Note that if the image is already semi-transparent, setting this to &#x60;1.0&#x60; will not make the image completely opaque. (optional, default to 1)
     * @param padding The whitespace between the adjacent edges (determined by position) of the video and the image. &#x60;0.0&#x60; indicates no padding, and &#x60;1.0&#x60; indicates a fully padded video width or length, as determined by the algorithm. (optional, default to 0.05)
     * @param position The location of the image. Valid positions are: &#x60;upperRight&#x60;, &#x60;upperLeft&#x60;, &#x60;lowerLeft&#x60;, &#x60;lowerRight&#x60;, and &#x60;center&#x60;. Note that &#x60;center&#x60; ignores the &#x60;padding&#x60; parameter. (optional, default to upperRight)
     * @param scale The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. &#x60;0.0&#x60; indicates no scaling (use the size of the image as-is), and &#x60;1.0 &#x60;fills the entire video. (optional, default to 0.15)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create watermark profiles via basic upload response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create watermark profiles via basic upload response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamWatermarkProfileCreateWatermarkProfilesViaBasicUploadAsync(String accountId, String _file, String name, BigDecimal opacity, BigDecimal padding, String position, BigDecimal scale, final ApiCallback<StreamWatermarkResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = streamWatermarkProfileCreateWatermarkProfilesViaBasicUploadValidateBeforeCall(accountId, _file, name, opacity, padding, position, scale, _callback);
        Type localVarReturnType = new TypeToken<StreamWatermarkResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for streamWatermarkProfileDeleteWatermarkProfiles
     * @param identifier  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete watermark profiles response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete watermark profiles response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamWatermarkProfileDeleteWatermarkProfilesCall(String identifier, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/stream/watermarks/{identifier}"
            .replace("{" + "identifier" + "}", localVarApiClient.escapeString(identifier.toString()))
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
    private okhttp3.Call streamWatermarkProfileDeleteWatermarkProfilesValidateBeforeCall(String identifier, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling streamWatermarkProfileDeleteWatermarkProfiles(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling streamWatermarkProfileDeleteWatermarkProfiles(Async)");
        }

        return streamWatermarkProfileDeleteWatermarkProfilesCall(identifier, accountId, _callback);

    }

    /**
     * Delete watermark profiles
     * Deletes a watermark profile.
     * @param identifier  (required)
     * @param accountId  (required)
     * @return StreamWatermarkProfileDeleteWatermarkProfiles200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete watermark profiles response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete watermark profiles response failure </td><td>  -  </td></tr>
     </table>
     */
    public StreamWatermarkProfileDeleteWatermarkProfiles200Response streamWatermarkProfileDeleteWatermarkProfiles(String identifier, String accountId) throws ApiException {
        ApiResponse<StreamWatermarkProfileDeleteWatermarkProfiles200Response> localVarResp = streamWatermarkProfileDeleteWatermarkProfilesWithHttpInfo(identifier, accountId);
        return localVarResp.getData();
    }

    /**
     * Delete watermark profiles
     * Deletes a watermark profile.
     * @param identifier  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;StreamWatermarkProfileDeleteWatermarkProfiles200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete watermark profiles response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete watermark profiles response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StreamWatermarkProfileDeleteWatermarkProfiles200Response> streamWatermarkProfileDeleteWatermarkProfilesWithHttpInfo(String identifier, String accountId) throws ApiException {
        okhttp3.Call localVarCall = streamWatermarkProfileDeleteWatermarkProfilesValidateBeforeCall(identifier, accountId, null);
        Type localVarReturnType = new TypeToken<StreamWatermarkProfileDeleteWatermarkProfiles200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete watermark profiles (asynchronously)
     * Deletes a watermark profile.
     * @param identifier  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete watermark profiles response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Delete watermark profiles response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamWatermarkProfileDeleteWatermarkProfilesAsync(String identifier, String accountId, final ApiCallback<StreamWatermarkProfileDeleteWatermarkProfiles200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = streamWatermarkProfileDeleteWatermarkProfilesValidateBeforeCall(identifier, accountId, _callback);
        Type localVarReturnType = new TypeToken<StreamWatermarkProfileDeleteWatermarkProfiles200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for streamWatermarkProfileListWatermarkProfiles
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List watermark profiles response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List watermark profiles response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamWatermarkProfileListWatermarkProfilesCall(String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/stream/watermarks"
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
    private okhttp3.Call streamWatermarkProfileListWatermarkProfilesValidateBeforeCall(String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling streamWatermarkProfileListWatermarkProfiles(Async)");
        }

        return streamWatermarkProfileListWatermarkProfilesCall(accountId, _callback);

    }

    /**
     * List watermark profiles
     * Lists all watermark profiles for an account.
     * @param accountId  (required)
     * @return StreamWatermarkResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List watermark profiles response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List watermark profiles response failure </td><td>  -  </td></tr>
     </table>
     */
    public StreamWatermarkResponseCollection streamWatermarkProfileListWatermarkProfiles(String accountId) throws ApiException {
        ApiResponse<StreamWatermarkResponseCollection> localVarResp = streamWatermarkProfileListWatermarkProfilesWithHttpInfo(accountId);
        return localVarResp.getData();
    }

    /**
     * List watermark profiles
     * Lists all watermark profiles for an account.
     * @param accountId  (required)
     * @return ApiResponse&lt;StreamWatermarkResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List watermark profiles response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List watermark profiles response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StreamWatermarkResponseCollection> streamWatermarkProfileListWatermarkProfilesWithHttpInfo(String accountId) throws ApiException {
        okhttp3.Call localVarCall = streamWatermarkProfileListWatermarkProfilesValidateBeforeCall(accountId, null);
        Type localVarReturnType = new TypeToken<StreamWatermarkResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List watermark profiles (asynchronously)
     * Lists all watermark profiles for an account.
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List watermark profiles response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List watermark profiles response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamWatermarkProfileListWatermarkProfilesAsync(String accountId, final ApiCallback<StreamWatermarkResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = streamWatermarkProfileListWatermarkProfilesValidateBeforeCall(accountId, _callback);
        Type localVarReturnType = new TypeToken<StreamWatermarkResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for streamWatermarkProfileWatermarkProfileDetails
     * @param identifier  (required)
     * @param accountId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Watermark profile details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Watermark profile details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamWatermarkProfileWatermarkProfileDetailsCall(String identifier, String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/stream/watermarks/{identifier}"
            .replace("{" + "identifier" + "}", localVarApiClient.escapeString(identifier.toString()))
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
    private okhttp3.Call streamWatermarkProfileWatermarkProfileDetailsValidateBeforeCall(String identifier, String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling streamWatermarkProfileWatermarkProfileDetails(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling streamWatermarkProfileWatermarkProfileDetails(Async)");
        }

        return streamWatermarkProfileWatermarkProfileDetailsCall(identifier, accountId, _callback);

    }

    /**
     * Watermark profile details
     * Retrieves details for a single watermark profile.
     * @param identifier  (required)
     * @param accountId  (required)
     * @return StreamWatermarkResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Watermark profile details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Watermark profile details response failure </td><td>  -  </td></tr>
     </table>
     */
    public StreamWatermarkResponseSingle streamWatermarkProfileWatermarkProfileDetails(String identifier, String accountId) throws ApiException {
        ApiResponse<StreamWatermarkResponseSingle> localVarResp = streamWatermarkProfileWatermarkProfileDetailsWithHttpInfo(identifier, accountId);
        return localVarResp.getData();
    }

    /**
     * Watermark profile details
     * Retrieves details for a single watermark profile.
     * @param identifier  (required)
     * @param accountId  (required)
     * @return ApiResponse&lt;StreamWatermarkResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Watermark profile details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Watermark profile details response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StreamWatermarkResponseSingle> streamWatermarkProfileWatermarkProfileDetailsWithHttpInfo(String identifier, String accountId) throws ApiException {
        okhttp3.Call localVarCall = streamWatermarkProfileWatermarkProfileDetailsValidateBeforeCall(identifier, accountId, null);
        Type localVarReturnType = new TypeToken<StreamWatermarkResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Watermark profile details (asynchronously)
     * Retrieves details for a single watermark profile.
     * @param identifier  (required)
     * @param accountId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Watermark profile details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Watermark profile details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamWatermarkProfileWatermarkProfileDetailsAsync(String identifier, String accountId, final ApiCallback<StreamWatermarkResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = streamWatermarkProfileWatermarkProfileDetailsValidateBeforeCall(identifier, accountId, _callback);
        Type localVarReturnType = new TypeToken<StreamWatermarkResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}