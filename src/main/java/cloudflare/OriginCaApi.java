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


import org.openapitools.client.model.OriginCaCreateCertificate4XXResponse;
import org.openapitools.client.model.OriginCaCreateCertificateRequest;
import org.openapitools.client.model.OriginCaListCertificates4XXResponse;
import org.openapitools.client.model.OriginCaRevokeCertificate4XXResponse;
import org.openapitools.client.model.TlsCertificatesAndHostnamesCertificateResponseSingleId;
import org.openapitools.client.model.TlsCertificatesAndHostnamesSchemasCertificateResponseCollection;
import org.openapitools.client.model.TlsCertificatesAndHostnamesSchemasCertificateResponseSingle;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OriginCaApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OriginCaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OriginCaApi(ApiClient apiClient) {
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
     * Build call for originCaCreateCertificate
     * @param originCaCreateCertificateRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Certificate response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Certificate response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call originCaCreateCertificateCall(OriginCaCreateCertificateRequest originCaCreateCertificateRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = originCaCreateCertificateRequest;

        // create path and map variables
        String localVarPath = "/certificates";

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

        String[] localVarAuthNames = new String[] { "user_service_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call originCaCreateCertificateValidateBeforeCall(OriginCaCreateCertificateRequest originCaCreateCertificateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'originCaCreateCertificateRequest' is set
        if (originCaCreateCertificateRequest == null) {
            throw new ApiException("Missing the required parameter 'originCaCreateCertificateRequest' when calling originCaCreateCertificate(Async)");
        }

        return originCaCreateCertificateCall(originCaCreateCertificateRequest, _callback);

    }

    /**
     * Create Certificate
     * Create an Origin CA certificate. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param originCaCreateCertificateRequest  (required)
     * @return TlsCertificatesAndHostnamesSchemasCertificateResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Certificate response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Certificate response failure </td><td>  -  </td></tr>
     </table>
     */
    public TlsCertificatesAndHostnamesSchemasCertificateResponseSingle originCaCreateCertificate(OriginCaCreateCertificateRequest originCaCreateCertificateRequest) throws ApiException {
        ApiResponse<TlsCertificatesAndHostnamesSchemasCertificateResponseSingle> localVarResp = originCaCreateCertificateWithHttpInfo(originCaCreateCertificateRequest);
        return localVarResp.getData();
    }

    /**
     * Create Certificate
     * Create an Origin CA certificate. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param originCaCreateCertificateRequest  (required)
     * @return ApiResponse&lt;TlsCertificatesAndHostnamesSchemasCertificateResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Certificate response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Certificate response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TlsCertificatesAndHostnamesSchemasCertificateResponseSingle> originCaCreateCertificateWithHttpInfo(OriginCaCreateCertificateRequest originCaCreateCertificateRequest) throws ApiException {
        okhttp3.Call localVarCall = originCaCreateCertificateValidateBeforeCall(originCaCreateCertificateRequest, null);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesSchemasCertificateResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Certificate (asynchronously)
     * Create an Origin CA certificate. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param originCaCreateCertificateRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create Certificate response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Create Certificate response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call originCaCreateCertificateAsync(OriginCaCreateCertificateRequest originCaCreateCertificateRequest, final ApiCallback<TlsCertificatesAndHostnamesSchemasCertificateResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = originCaCreateCertificateValidateBeforeCall(originCaCreateCertificateRequest, _callback);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesSchemasCertificateResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for originCaGetCertificate
     * @param certificateId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Certificate response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Certificate response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call originCaGetCertificateCall(String certificateId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/certificates/{certificate_id}"
            .replace("{" + "certificate_id" + "}", localVarApiClient.escapeString(certificateId.toString()));

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

        String[] localVarAuthNames = new String[] { "user_service_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call originCaGetCertificateValidateBeforeCall(String certificateId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'certificateId' is set
        if (certificateId == null) {
            throw new ApiException("Missing the required parameter 'certificateId' when calling originCaGetCertificate(Async)");
        }

        return originCaGetCertificateCall(certificateId, _callback);

    }

    /**
     * Get Certificate
     * Get an existing Origin CA certificate by its serial number. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param certificateId  (required)
     * @return TlsCertificatesAndHostnamesSchemasCertificateResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Certificate response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Certificate response failure </td><td>  -  </td></tr>
     </table>
     */
    public TlsCertificatesAndHostnamesSchemasCertificateResponseSingle originCaGetCertificate(String certificateId) throws ApiException {
        ApiResponse<TlsCertificatesAndHostnamesSchemasCertificateResponseSingle> localVarResp = originCaGetCertificateWithHttpInfo(certificateId);
        return localVarResp.getData();
    }

    /**
     * Get Certificate
     * Get an existing Origin CA certificate by its serial number. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param certificateId  (required)
     * @return ApiResponse&lt;TlsCertificatesAndHostnamesSchemasCertificateResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Certificate response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Certificate response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TlsCertificatesAndHostnamesSchemasCertificateResponseSingle> originCaGetCertificateWithHttpInfo(String certificateId) throws ApiException {
        okhttp3.Call localVarCall = originCaGetCertificateValidateBeforeCall(certificateId, null);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesSchemasCertificateResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Certificate (asynchronously)
     * Get an existing Origin CA certificate by its serial number. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param certificateId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get Certificate response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get Certificate response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call originCaGetCertificateAsync(String certificateId, final ApiCallback<TlsCertificatesAndHostnamesSchemasCertificateResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = originCaGetCertificateValidateBeforeCall(certificateId, _callback);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesSchemasCertificateResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for originCaListCertificates
     * @param identifier  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Certificates response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Certificates response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call originCaListCertificatesCall(String identifier, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/certificates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (identifier != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("identifier", identifier));
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

        String[] localVarAuthNames = new String[] { "user_service_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call originCaListCertificatesValidateBeforeCall(String identifier, final ApiCallback _callback) throws ApiException {
        return originCaListCertificatesCall(identifier, _callback);

    }

    /**
     * List Certificates
     * List all existing Origin CA certificates for a given zone. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param identifier  (optional)
     * @return TlsCertificatesAndHostnamesSchemasCertificateResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Certificates response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Certificates response failure </td><td>  -  </td></tr>
     </table>
     */
    public TlsCertificatesAndHostnamesSchemasCertificateResponseCollection originCaListCertificates(String identifier) throws ApiException {
        ApiResponse<TlsCertificatesAndHostnamesSchemasCertificateResponseCollection> localVarResp = originCaListCertificatesWithHttpInfo(identifier);
        return localVarResp.getData();
    }

    /**
     * List Certificates
     * List all existing Origin CA certificates for a given zone. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param identifier  (optional)
     * @return ApiResponse&lt;TlsCertificatesAndHostnamesSchemasCertificateResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Certificates response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Certificates response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TlsCertificatesAndHostnamesSchemasCertificateResponseCollection> originCaListCertificatesWithHttpInfo(String identifier) throws ApiException {
        okhttp3.Call localVarCall = originCaListCertificatesValidateBeforeCall(identifier, null);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesSchemasCertificateResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Certificates (asynchronously)
     * List all existing Origin CA certificates for a given zone. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param identifier  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Certificates response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List Certificates response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call originCaListCertificatesAsync(String identifier, final ApiCallback<TlsCertificatesAndHostnamesSchemasCertificateResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = originCaListCertificatesValidateBeforeCall(identifier, _callback);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesSchemasCertificateResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for originCaRevokeCertificate
     * @param certificateId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Revoke Certificate response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Revoke Certificate response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call originCaRevokeCertificateCall(String certificateId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/certificates/{certificate_id}"
            .replace("{" + "certificate_id" + "}", localVarApiClient.escapeString(certificateId.toString()));

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

        String[] localVarAuthNames = new String[] { "user_service_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call originCaRevokeCertificateValidateBeforeCall(String certificateId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'certificateId' is set
        if (certificateId == null) {
            throw new ApiException("Missing the required parameter 'certificateId' when calling originCaRevokeCertificate(Async)");
        }

        return originCaRevokeCertificateCall(certificateId, _callback);

    }

    /**
     * Revoke Certificate
     * Revoke an existing Origin CA certificate by its serial number. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param certificateId  (required)
     * @return TlsCertificatesAndHostnamesCertificateResponseSingleId
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Revoke Certificate response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Revoke Certificate response failure </td><td>  -  </td></tr>
     </table>
     */
    public TlsCertificatesAndHostnamesCertificateResponseSingleId originCaRevokeCertificate(String certificateId) throws ApiException {
        ApiResponse<TlsCertificatesAndHostnamesCertificateResponseSingleId> localVarResp = originCaRevokeCertificateWithHttpInfo(certificateId);
        return localVarResp.getData();
    }

    /**
     * Revoke Certificate
     * Revoke an existing Origin CA certificate by its serial number. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param certificateId  (required)
     * @return ApiResponse&lt;TlsCertificatesAndHostnamesCertificateResponseSingleId&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Revoke Certificate response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Revoke Certificate response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TlsCertificatesAndHostnamesCertificateResponseSingleId> originCaRevokeCertificateWithHttpInfo(String certificateId) throws ApiException {
        okhttp3.Call localVarCall = originCaRevokeCertificateValidateBeforeCall(certificateId, null);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesCertificateResponseSingleId>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Revoke Certificate (asynchronously)
     * Revoke an existing Origin CA certificate by its serial number. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param certificateId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Revoke Certificate response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Revoke Certificate response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call originCaRevokeCertificateAsync(String certificateId, final ApiCallback<TlsCertificatesAndHostnamesCertificateResponseSingleId> _callback) throws ApiException {

        okhttp3.Call localVarCall = originCaRevokeCertificateValidateBeforeCall(certificateId, _callback);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesCertificateResponseSingleId>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
