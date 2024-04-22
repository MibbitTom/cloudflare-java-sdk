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


import org.openapitools.client.model.StreamAddAudioTrackResponse;
import org.openapitools.client.model.StreamApiResponseCommonFailure;
import org.openapitools.client.model.StreamCopyAudioTrack;
import org.openapitools.client.model.StreamDeletedResponse;
import org.openapitools.client.model.StreamEditAudioTrack;
import org.openapitools.client.model.StreamListAudioTrackResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamAudioTracksApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StreamAudioTracksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StreamAudioTracksApi(ApiClient apiClient) {
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
     * Build call for addAudioTrack
     * @param accountId  (required)
     * @param identifier  (required)
     * @param streamCopyAudioTrack  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Add audio tracks to a video </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Add audio tracks to a video response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addAudioTrackCall(String accountId, String identifier, StreamCopyAudioTrack streamCopyAudioTrack, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = streamCopyAudioTrack;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/stream/{identifier}/audio/copy"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()))
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

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addAudioTrackValidateBeforeCall(String accountId, String identifier, StreamCopyAudioTrack streamCopyAudioTrack, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling addAudioTrack(Async)");
        }

        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling addAudioTrack(Async)");
        }

        // verify the required parameter 'streamCopyAudioTrack' is set
        if (streamCopyAudioTrack == null) {
            throw new ApiException("Missing the required parameter 'streamCopyAudioTrack' when calling addAudioTrack(Async)");
        }

        return addAudioTrackCall(accountId, identifier, streamCopyAudioTrack, _callback);

    }

    /**
     * Add audio tracks to a video
     * Adds an additional audio track to a video using the provided audio track URL.
     * @param accountId  (required)
     * @param identifier  (required)
     * @param streamCopyAudioTrack  (required)
     * @return StreamAddAudioTrackResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Add audio tracks to a video </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Add audio tracks to a video response failure </td><td>  -  </td></tr>
     </table>
     */
    public StreamAddAudioTrackResponse addAudioTrack(String accountId, String identifier, StreamCopyAudioTrack streamCopyAudioTrack) throws ApiException {
        ApiResponse<StreamAddAudioTrackResponse> localVarResp = addAudioTrackWithHttpInfo(accountId, identifier, streamCopyAudioTrack);
        return localVarResp.getData();
    }

    /**
     * Add audio tracks to a video
     * Adds an additional audio track to a video using the provided audio track URL.
     * @param accountId  (required)
     * @param identifier  (required)
     * @param streamCopyAudioTrack  (required)
     * @return ApiResponse&lt;StreamAddAudioTrackResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Add audio tracks to a video </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Add audio tracks to a video response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StreamAddAudioTrackResponse> addAudioTrackWithHttpInfo(String accountId, String identifier, StreamCopyAudioTrack streamCopyAudioTrack) throws ApiException {
        okhttp3.Call localVarCall = addAudioTrackValidateBeforeCall(accountId, identifier, streamCopyAudioTrack, null);
        Type localVarReturnType = new TypeToken<StreamAddAudioTrackResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add audio tracks to a video (asynchronously)
     * Adds an additional audio track to a video using the provided audio track URL.
     * @param accountId  (required)
     * @param identifier  (required)
     * @param streamCopyAudioTrack  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Add audio tracks to a video </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Add audio tracks to a video response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addAudioTrackAsync(String accountId, String identifier, StreamCopyAudioTrack streamCopyAudioTrack, final ApiCallback<StreamAddAudioTrackResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = addAudioTrackValidateBeforeCall(accountId, identifier, streamCopyAudioTrack, _callback);
        Type localVarReturnType = new TypeToken<StreamAddAudioTrackResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteAudioTracks
     * @param accountId  (required)
     * @param identifier  (required)
     * @param audioIdentifier  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Deletes additional audio tracks on a video </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Deletes additional audio tracks on a video response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAudioTracksCall(String accountId, String identifier, String audioIdentifier, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/stream/{identifier}/audio/{audio_identifier}"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()))
            .replace("{" + "identifier" + "}", localVarApiClient.escapeString(identifier.toString()))
            .replace("{" + "audio_identifier" + "}", localVarApiClient.escapeString(audioIdentifier.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteAudioTracksValidateBeforeCall(String accountId, String identifier, String audioIdentifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling deleteAudioTracks(Async)");
        }

        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling deleteAudioTracks(Async)");
        }

        // verify the required parameter 'audioIdentifier' is set
        if (audioIdentifier == null) {
            throw new ApiException("Missing the required parameter 'audioIdentifier' when calling deleteAudioTracks(Async)");
        }

        return deleteAudioTracksCall(accountId, identifier, audioIdentifier, _callback);

    }

    /**
     * Delete additional audio tracks on a video
     * Deletes additional audio tracks on a video. Deleting a default audio track is not allowed. You must assign another audio track as default prior to deletion.
     * @param accountId  (required)
     * @param identifier  (required)
     * @param audioIdentifier  (required)
     * @return StreamDeletedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Deletes additional audio tracks on a video </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Deletes additional audio tracks on a video response failure </td><td>  -  </td></tr>
     </table>
     */
    public StreamDeletedResponse deleteAudioTracks(String accountId, String identifier, String audioIdentifier) throws ApiException {
        ApiResponse<StreamDeletedResponse> localVarResp = deleteAudioTracksWithHttpInfo(accountId, identifier, audioIdentifier);
        return localVarResp.getData();
    }

    /**
     * Delete additional audio tracks on a video
     * Deletes additional audio tracks on a video. Deleting a default audio track is not allowed. You must assign another audio track as default prior to deletion.
     * @param accountId  (required)
     * @param identifier  (required)
     * @param audioIdentifier  (required)
     * @return ApiResponse&lt;StreamDeletedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Deletes additional audio tracks on a video </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Deletes additional audio tracks on a video response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StreamDeletedResponse> deleteAudioTracksWithHttpInfo(String accountId, String identifier, String audioIdentifier) throws ApiException {
        okhttp3.Call localVarCall = deleteAudioTracksValidateBeforeCall(accountId, identifier, audioIdentifier, null);
        Type localVarReturnType = new TypeToken<StreamDeletedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete additional audio tracks on a video (asynchronously)
     * Deletes additional audio tracks on a video. Deleting a default audio track is not allowed. You must assign another audio track as default prior to deletion.
     * @param accountId  (required)
     * @param identifier  (required)
     * @param audioIdentifier  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Deletes additional audio tracks on a video </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Deletes additional audio tracks on a video response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAudioTracksAsync(String accountId, String identifier, String audioIdentifier, final ApiCallback<StreamDeletedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteAudioTracksValidateBeforeCall(accountId, identifier, audioIdentifier, _callback);
        Type localVarReturnType = new TypeToken<StreamDeletedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for editAudioTracks
     * @param accountId  (required)
     * @param identifier  (required)
     * @param audioIdentifier  (required)
     * @param streamEditAudioTrack  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Edits additional audio tracks on a video </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Edits additional audio tracks on a video response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call editAudioTracksCall(String accountId, String identifier, String audioIdentifier, StreamEditAudioTrack streamEditAudioTrack, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = streamEditAudioTrack;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/stream/{identifier}/audio/{audio_identifier}"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()))
            .replace("{" + "identifier" + "}", localVarApiClient.escapeString(identifier.toString()))
            .replace("{" + "audio_identifier" + "}", localVarApiClient.escapeString(audioIdentifier.toString()));

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
    private okhttp3.Call editAudioTracksValidateBeforeCall(String accountId, String identifier, String audioIdentifier, StreamEditAudioTrack streamEditAudioTrack, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling editAudioTracks(Async)");
        }

        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling editAudioTracks(Async)");
        }

        // verify the required parameter 'audioIdentifier' is set
        if (audioIdentifier == null) {
            throw new ApiException("Missing the required parameter 'audioIdentifier' when calling editAudioTracks(Async)");
        }

        // verify the required parameter 'streamEditAudioTrack' is set
        if (streamEditAudioTrack == null) {
            throw new ApiException("Missing the required parameter 'streamEditAudioTrack' when calling editAudioTracks(Async)");
        }

        return editAudioTracksCall(accountId, identifier, audioIdentifier, streamEditAudioTrack, _callback);

    }

    /**
     * Edit additional audio tracks on a video
     * Edits additional audio tracks on a video. Editing the default status of an audio track to &#x60;true&#x60; will mark all other audio tracks on the video default status to &#x60;false&#x60;.
     * @param accountId  (required)
     * @param identifier  (required)
     * @param audioIdentifier  (required)
     * @param streamEditAudioTrack  (required)
     * @return StreamAddAudioTrackResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Edits additional audio tracks on a video </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Edits additional audio tracks on a video response failure </td><td>  -  </td></tr>
     </table>
     */
    public StreamAddAudioTrackResponse editAudioTracks(String accountId, String identifier, String audioIdentifier, StreamEditAudioTrack streamEditAudioTrack) throws ApiException {
        ApiResponse<StreamAddAudioTrackResponse> localVarResp = editAudioTracksWithHttpInfo(accountId, identifier, audioIdentifier, streamEditAudioTrack);
        return localVarResp.getData();
    }

    /**
     * Edit additional audio tracks on a video
     * Edits additional audio tracks on a video. Editing the default status of an audio track to &#x60;true&#x60; will mark all other audio tracks on the video default status to &#x60;false&#x60;.
     * @param accountId  (required)
     * @param identifier  (required)
     * @param audioIdentifier  (required)
     * @param streamEditAudioTrack  (required)
     * @return ApiResponse&lt;StreamAddAudioTrackResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Edits additional audio tracks on a video </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Edits additional audio tracks on a video response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StreamAddAudioTrackResponse> editAudioTracksWithHttpInfo(String accountId, String identifier, String audioIdentifier, StreamEditAudioTrack streamEditAudioTrack) throws ApiException {
        okhttp3.Call localVarCall = editAudioTracksValidateBeforeCall(accountId, identifier, audioIdentifier, streamEditAudioTrack, null);
        Type localVarReturnType = new TypeToken<StreamAddAudioTrackResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Edit additional audio tracks on a video (asynchronously)
     * Edits additional audio tracks on a video. Editing the default status of an audio track to &#x60;true&#x60; will mark all other audio tracks on the video default status to &#x60;false&#x60;.
     * @param accountId  (required)
     * @param identifier  (required)
     * @param audioIdentifier  (required)
     * @param streamEditAudioTrack  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Edits additional audio tracks on a video </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Edits additional audio tracks on a video response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call editAudioTracksAsync(String accountId, String identifier, String audioIdentifier, StreamEditAudioTrack streamEditAudioTrack, final ApiCallback<StreamAddAudioTrackResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = editAudioTracksValidateBeforeCall(accountId, identifier, audioIdentifier, streamEditAudioTrack, _callback);
        Type localVarReturnType = new TypeToken<StreamAddAudioTrackResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listAudioTracks
     * @param accountId  (required)
     * @param identifier  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Lists additional audio tracks on a video </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Lists additional audio tracks on a video response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listAudioTracksCall(String accountId, String identifier, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/stream/{identifier}/audio"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()))
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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "api_token", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listAudioTracksValidateBeforeCall(String accountId, String identifier, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAudioTracks(Async)");
        }

        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling listAudioTracks(Async)");
        }

        return listAudioTracksCall(accountId, identifier, _callback);

    }

    /**
     * List additional audio tracks on a video
     * Lists additional audio tracks on a video. Note this API will not return information for audio attached to the video upload.
     * @param accountId  (required)
     * @param identifier  (required)
     * @return StreamListAudioTrackResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Lists additional audio tracks on a video </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Lists additional audio tracks on a video response failure </td><td>  -  </td></tr>
     </table>
     */
    public StreamListAudioTrackResponse listAudioTracks(String accountId, String identifier) throws ApiException {
        ApiResponse<StreamListAudioTrackResponse> localVarResp = listAudioTracksWithHttpInfo(accountId, identifier);
        return localVarResp.getData();
    }

    /**
     * List additional audio tracks on a video
     * Lists additional audio tracks on a video. Note this API will not return information for audio attached to the video upload.
     * @param accountId  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;StreamListAudioTrackResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Lists additional audio tracks on a video </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Lists additional audio tracks on a video response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StreamListAudioTrackResponse> listAudioTracksWithHttpInfo(String accountId, String identifier) throws ApiException {
        okhttp3.Call localVarCall = listAudioTracksValidateBeforeCall(accountId, identifier, null);
        Type localVarReturnType = new TypeToken<StreamListAudioTrackResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List additional audio tracks on a video (asynchronously)
     * Lists additional audio tracks on a video. Note this API will not return information for audio attached to the video upload.
     * @param accountId  (required)
     * @param identifier  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Lists additional audio tracks on a video </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Lists additional audio tracks on a video response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listAudioTracksAsync(String accountId, String identifier, final ApiCallback<StreamListAudioTrackResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAudioTracksValidateBeforeCall(accountId, identifier, _callback);
        Type localVarReturnType = new TypeToken<StreamListAudioTrackResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
