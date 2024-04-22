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


import org.openapitools.client.model.SslVerificationEditSslCertificatePackValidationMethod4XXResponse;
import org.openapitools.client.model.SslVerificationSslVerificationDetails4XXResponse;
import org.openapitools.client.model.TlsCertificatesAndHostnamesComponentsSchemasValidationMethod;
import org.openapitools.client.model.TlsCertificatesAndHostnamesSslValidationMethodResponseCollection;
import org.openapitools.client.model.TlsCertificatesAndHostnamesSslVerificationResponseCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SslVerificationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SslVerificationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SslVerificationApi(ApiClient apiClient) {
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
     * Build call for sslVerificationEditSslCertificatePackValidationMethod
     * @param certificatePackId  (required)
     * @param zoneId  (required)
     * @param tlsCertificatesAndHostnamesComponentsSchemasValidationMethod  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Edit SSL Certificate Pack Validation Method response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Edit SSL Certificate Pack Validation Method response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sslVerificationEditSslCertificatePackValidationMethodCall(String certificatePackId, String zoneId, TlsCertificatesAndHostnamesComponentsSchemasValidationMethod tlsCertificatesAndHostnamesComponentsSchemasValidationMethod, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = tlsCertificatesAndHostnamesComponentsSchemasValidationMethod;

        // create path and map variables
        String localVarPath = "/zones/{zone_id}/ssl/verification/{certificate_pack_id}"
            .replace("{" + "certificate_pack_id" + "}", localVarApiClient.escapeString(certificatePackId.toString()))
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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sslVerificationEditSslCertificatePackValidationMethodValidateBeforeCall(String certificatePackId, String zoneId, TlsCertificatesAndHostnamesComponentsSchemasValidationMethod tlsCertificatesAndHostnamesComponentsSchemasValidationMethod, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'certificatePackId' is set
        if (certificatePackId == null) {
            throw new ApiException("Missing the required parameter 'certificatePackId' when calling sslVerificationEditSslCertificatePackValidationMethod(Async)");
        }

        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling sslVerificationEditSslCertificatePackValidationMethod(Async)");
        }

        // verify the required parameter 'tlsCertificatesAndHostnamesComponentsSchemasValidationMethod' is set
        if (tlsCertificatesAndHostnamesComponentsSchemasValidationMethod == null) {
            throw new ApiException("Missing the required parameter 'tlsCertificatesAndHostnamesComponentsSchemasValidationMethod' when calling sslVerificationEditSslCertificatePackValidationMethod(Async)");
        }

        return sslVerificationEditSslCertificatePackValidationMethodCall(certificatePackId, zoneId, tlsCertificatesAndHostnamesComponentsSchemasValidationMethod, _callback);

    }

    /**
     * Edit SSL Certificate Pack Validation Method
     * Edit SSL validation method for a certificate pack. A PATCH request will request an immediate validation check on any certificate, and return the updated status. If a validation method is provided, the validation will be immediately attempted using that method.
     * @param certificatePackId  (required)
     * @param zoneId  (required)
     * @param tlsCertificatesAndHostnamesComponentsSchemasValidationMethod  (required)
     * @return TlsCertificatesAndHostnamesSslValidationMethodResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Edit SSL Certificate Pack Validation Method response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Edit SSL Certificate Pack Validation Method response failure </td><td>  -  </td></tr>
     </table>
     */
    public TlsCertificatesAndHostnamesSslValidationMethodResponseCollection sslVerificationEditSslCertificatePackValidationMethod(String certificatePackId, String zoneId, TlsCertificatesAndHostnamesComponentsSchemasValidationMethod tlsCertificatesAndHostnamesComponentsSchemasValidationMethod) throws ApiException {
        ApiResponse<TlsCertificatesAndHostnamesSslValidationMethodResponseCollection> localVarResp = sslVerificationEditSslCertificatePackValidationMethodWithHttpInfo(certificatePackId, zoneId, tlsCertificatesAndHostnamesComponentsSchemasValidationMethod);
        return localVarResp.getData();
    }

    /**
     * Edit SSL Certificate Pack Validation Method
     * Edit SSL validation method for a certificate pack. A PATCH request will request an immediate validation check on any certificate, and return the updated status. If a validation method is provided, the validation will be immediately attempted using that method.
     * @param certificatePackId  (required)
     * @param zoneId  (required)
     * @param tlsCertificatesAndHostnamesComponentsSchemasValidationMethod  (required)
     * @return ApiResponse&lt;TlsCertificatesAndHostnamesSslValidationMethodResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Edit SSL Certificate Pack Validation Method response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Edit SSL Certificate Pack Validation Method response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TlsCertificatesAndHostnamesSslValidationMethodResponseCollection> sslVerificationEditSslCertificatePackValidationMethodWithHttpInfo(String certificatePackId, String zoneId, TlsCertificatesAndHostnamesComponentsSchemasValidationMethod tlsCertificatesAndHostnamesComponentsSchemasValidationMethod) throws ApiException {
        okhttp3.Call localVarCall = sslVerificationEditSslCertificatePackValidationMethodValidateBeforeCall(certificatePackId, zoneId, tlsCertificatesAndHostnamesComponentsSchemasValidationMethod, null);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesSslValidationMethodResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Edit SSL Certificate Pack Validation Method (asynchronously)
     * Edit SSL validation method for a certificate pack. A PATCH request will request an immediate validation check on any certificate, and return the updated status. If a validation method is provided, the validation will be immediately attempted using that method.
     * @param certificatePackId  (required)
     * @param zoneId  (required)
     * @param tlsCertificatesAndHostnamesComponentsSchemasValidationMethod  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Edit SSL Certificate Pack Validation Method response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Edit SSL Certificate Pack Validation Method response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sslVerificationEditSslCertificatePackValidationMethodAsync(String certificatePackId, String zoneId, TlsCertificatesAndHostnamesComponentsSchemasValidationMethod tlsCertificatesAndHostnamesComponentsSchemasValidationMethod, final ApiCallback<TlsCertificatesAndHostnamesSslValidationMethodResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = sslVerificationEditSslCertificatePackValidationMethodValidateBeforeCall(certificatePackId, zoneId, tlsCertificatesAndHostnamesComponentsSchemasValidationMethod, _callback);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesSslValidationMethodResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sslVerificationSslVerificationDetails
     * @param zoneId  (required)
     * @param retry  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> SSL Verification Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> SSL Verification Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sslVerificationSslVerificationDetailsCall(String zoneId, Boolean retry, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/ssl/verification"
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (retry != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("retry", retry));
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

        String[] localVarAuthNames = new String[] { "api_key", "api_email" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sslVerificationSslVerificationDetailsValidateBeforeCall(String zoneId, Boolean retry, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling sslVerificationSslVerificationDetails(Async)");
        }

        return sslVerificationSslVerificationDetailsCall(zoneId, retry, _callback);

    }

    /**
     * SSL Verification Details
     * Get SSL Verification Info for a Zone.
     * @param zoneId  (required)
     * @param retry  (optional)
     * @return TlsCertificatesAndHostnamesSslVerificationResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> SSL Verification Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> SSL Verification Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public TlsCertificatesAndHostnamesSslVerificationResponseCollection sslVerificationSslVerificationDetails(String zoneId, Boolean retry) throws ApiException {
        ApiResponse<TlsCertificatesAndHostnamesSslVerificationResponseCollection> localVarResp = sslVerificationSslVerificationDetailsWithHttpInfo(zoneId, retry);
        return localVarResp.getData();
    }

    /**
     * SSL Verification Details
     * Get SSL Verification Info for a Zone.
     * @param zoneId  (required)
     * @param retry  (optional)
     * @return ApiResponse&lt;TlsCertificatesAndHostnamesSslVerificationResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> SSL Verification Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> SSL Verification Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TlsCertificatesAndHostnamesSslVerificationResponseCollection> sslVerificationSslVerificationDetailsWithHttpInfo(String zoneId, Boolean retry) throws ApiException {
        okhttp3.Call localVarCall = sslVerificationSslVerificationDetailsValidateBeforeCall(zoneId, retry, null);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesSslVerificationResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * SSL Verification Details (asynchronously)
     * Get SSL Verification Info for a Zone.
     * @param zoneId  (required)
     * @param retry  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> SSL Verification Details response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> SSL Verification Details response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sslVerificationSslVerificationDetailsAsync(String zoneId, Boolean retry, final ApiCallback<TlsCertificatesAndHostnamesSslVerificationResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = sslVerificationSslVerificationDetailsValidateBeforeCall(zoneId, retry, _callback);
        Type localVarReturnType = new TypeToken<TlsCertificatesAndHostnamesSslVerificationResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
