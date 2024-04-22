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
import org.openapitools.client.model.WafManagedRulesRuleResponseCollection;
import org.openapitools.client.model.WafManagedRulesRuleResponseSingle;
import org.openapitools.client.model.WafRulesGetAWafRule4XXResponse;
import org.openapitools.client.model.WafRulesListWafRules4XXResponse;
import org.openapitools.client.model.WafRulesUpdateAWafRule200Response;
import org.openapitools.client.model.WafRulesUpdateAWafRule4XXResponse;
import org.openapitools.client.model.WafRulesUpdateAWafRuleRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WafRulesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WafRulesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WafRulesApi(ApiClient apiClient) {
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
     * Build call for wafRulesGetAWafRule
     * @param ruleId  (required)
     * @param packageId  (required)
     * @param zoneId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get a WAF rule response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get a WAF rule response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call wafRulesGetAWafRuleCall(String ruleId, String packageId, String zoneId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/firewall/waf/packages/{package_id}/rules/{rule_id}"
            .replace("{" + "rule_id" + "}", localVarApiClient.escapeString(ruleId.toString()))
            .replace("{" + "package_id" + "}", localVarApiClient.escapeString(packageId.toString()))
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
    private okhttp3.Call wafRulesGetAWafRuleValidateBeforeCall(String ruleId, String packageId, String zoneId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new ApiException("Missing the required parameter 'ruleId' when calling wafRulesGetAWafRule(Async)");
        }

        // verify the required parameter 'packageId' is set
        if (packageId == null) {
            throw new ApiException("Missing the required parameter 'packageId' when calling wafRulesGetAWafRule(Async)");
        }

        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling wafRulesGetAWafRule(Async)");
        }

        return wafRulesGetAWafRuleCall(ruleId, packageId, zoneId, _callback);

    }

    /**
     * Get a WAF rule
     * Fetches the details of a WAF rule in a WAF package.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).
     * @param ruleId  (required)
     * @param packageId  (required)
     * @param zoneId  (required)
     * @return WafManagedRulesRuleResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get a WAF rule response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get a WAF rule response failure </td><td>  -  </td></tr>
     </table>
     */
    public WafManagedRulesRuleResponseSingle wafRulesGetAWafRule(String ruleId, String packageId, String zoneId) throws ApiException {
        ApiResponse<WafManagedRulesRuleResponseSingle> localVarResp = wafRulesGetAWafRuleWithHttpInfo(ruleId, packageId, zoneId);
        return localVarResp.getData();
    }

    /**
     * Get a WAF rule
     * Fetches the details of a WAF rule in a WAF package.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).
     * @param ruleId  (required)
     * @param packageId  (required)
     * @param zoneId  (required)
     * @return ApiResponse&lt;WafManagedRulesRuleResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get a WAF rule response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get a WAF rule response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WafManagedRulesRuleResponseSingle> wafRulesGetAWafRuleWithHttpInfo(String ruleId, String packageId, String zoneId) throws ApiException {
        okhttp3.Call localVarCall = wafRulesGetAWafRuleValidateBeforeCall(ruleId, packageId, zoneId, null);
        Type localVarReturnType = new TypeToken<WafManagedRulesRuleResponseSingle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a WAF rule (asynchronously)
     * Fetches the details of a WAF rule in a WAF package.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).
     * @param ruleId  (required)
     * @param packageId  (required)
     * @param zoneId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get a WAF rule response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Get a WAF rule response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call wafRulesGetAWafRuleAsync(String ruleId, String packageId, String zoneId, final ApiCallback<WafManagedRulesRuleResponseSingle> _callback) throws ApiException {

        okhttp3.Call localVarCall = wafRulesGetAWafRuleValidateBeforeCall(ruleId, packageId, zoneId, _callback);
        Type localVarReturnType = new TypeToken<WafManagedRulesRuleResponseSingle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for wafRulesListWafRules
     * @param packageId  (required)
     * @param zoneId  (required)
     * @param mode  (optional)
     * @param groupId  (optional)
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 50)
     * @param order  (optional)
     * @param direction  (optional)
     * @param match  (optional, default to all)
     * @param description  (optional)
     * @param priority  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List WAF rules response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List WAF rules response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call wafRulesListWafRulesCall(String packageId, String zoneId, String mode, String groupId, BigDecimal page, BigDecimal perPage, String order, String direction, String match, String description, String priority, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/zones/{zone_id}/firewall/waf/packages/{package_id}/rules"
            .replace("{" + "package_id" + "}", localVarApiClient.escapeString(packageId.toString()))
            .replace("{" + "zone_id" + "}", localVarApiClient.escapeString(zoneId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (mode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("mode", mode));
        }

        if (groupId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("group_id", groupId));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

        if (order != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order", order));
        }

        if (direction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("direction", direction));
        }

        if (match != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("match", match));
        }

        if (description != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("description", description));
        }

        if (priority != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("priority", priority));
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

    @SuppressWarnings("rawtypes")
    private okhttp3.Call wafRulesListWafRulesValidateBeforeCall(String packageId, String zoneId, String mode, String groupId, BigDecimal page, BigDecimal perPage, String order, String direction, String match, String description, String priority, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'packageId' is set
        if (packageId == null) {
            throw new ApiException("Missing the required parameter 'packageId' when calling wafRulesListWafRules(Async)");
        }

        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling wafRulesListWafRules(Async)");
        }

        return wafRulesListWafRulesCall(packageId, zoneId, mode, groupId, page, perPage, order, direction, match, description, priority, _callback);

    }

    /**
     * List WAF rules
     * Fetches WAF rules in a WAF package.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).
     * @param packageId  (required)
     * @param zoneId  (required)
     * @param mode  (optional)
     * @param groupId  (optional)
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 50)
     * @param order  (optional)
     * @param direction  (optional)
     * @param match  (optional, default to all)
     * @param description  (optional)
     * @param priority  (optional)
     * @return WafManagedRulesRuleResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List WAF rules response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List WAF rules response failure </td><td>  -  </td></tr>
     </table>
     */
    public WafManagedRulesRuleResponseCollection wafRulesListWafRules(String packageId, String zoneId, String mode, String groupId, BigDecimal page, BigDecimal perPage, String order, String direction, String match, String description, String priority) throws ApiException {
        ApiResponse<WafManagedRulesRuleResponseCollection> localVarResp = wafRulesListWafRulesWithHttpInfo(packageId, zoneId, mode, groupId, page, perPage, order, direction, match, description, priority);
        return localVarResp.getData();
    }

    /**
     * List WAF rules
     * Fetches WAF rules in a WAF package.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).
     * @param packageId  (required)
     * @param zoneId  (required)
     * @param mode  (optional)
     * @param groupId  (optional)
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 50)
     * @param order  (optional)
     * @param direction  (optional)
     * @param match  (optional, default to all)
     * @param description  (optional)
     * @param priority  (optional)
     * @return ApiResponse&lt;WafManagedRulesRuleResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List WAF rules response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List WAF rules response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WafManagedRulesRuleResponseCollection> wafRulesListWafRulesWithHttpInfo(String packageId, String zoneId, String mode, String groupId, BigDecimal page, BigDecimal perPage, String order, String direction, String match, String description, String priority) throws ApiException {
        okhttp3.Call localVarCall = wafRulesListWafRulesValidateBeforeCall(packageId, zoneId, mode, groupId, page, perPage, order, direction, match, description, priority, null);
        Type localVarReturnType = new TypeToken<WafManagedRulesRuleResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List WAF rules (asynchronously)
     * Fetches WAF rules in a WAF package.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).
     * @param packageId  (required)
     * @param zoneId  (required)
     * @param mode  (optional)
     * @param groupId  (optional)
     * @param page  (optional, default to 1)
     * @param perPage  (optional, default to 50)
     * @param order  (optional)
     * @param direction  (optional)
     * @param match  (optional, default to all)
     * @param description  (optional)
     * @param priority  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List WAF rules response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> List WAF rules response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call wafRulesListWafRulesAsync(String packageId, String zoneId, String mode, String groupId, BigDecimal page, BigDecimal perPage, String order, String direction, String match, String description, String priority, final ApiCallback<WafManagedRulesRuleResponseCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = wafRulesListWafRulesValidateBeforeCall(packageId, zoneId, mode, groupId, page, perPage, order, direction, match, description, priority, _callback);
        Type localVarReturnType = new TypeToken<WafManagedRulesRuleResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for wafRulesUpdateAWafRule
     * @param ruleId  (required)
     * @param packageId  (required)
     * @param zoneId  (required)
     * @param wafRulesUpdateAWafRuleRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a WAF rule response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a WAF rule response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call wafRulesUpdateAWafRuleCall(String ruleId, String packageId, String zoneId, WafRulesUpdateAWafRuleRequest wafRulesUpdateAWafRuleRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = wafRulesUpdateAWafRuleRequest;

        // create path and map variables
        String localVarPath = "/zones/{zone_id}/firewall/waf/packages/{package_id}/rules/{rule_id}"
            .replace("{" + "rule_id" + "}", localVarApiClient.escapeString(ruleId.toString()))
            .replace("{" + "package_id" + "}", localVarApiClient.escapeString(packageId.toString()))
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
    private okhttp3.Call wafRulesUpdateAWafRuleValidateBeforeCall(String ruleId, String packageId, String zoneId, WafRulesUpdateAWafRuleRequest wafRulesUpdateAWafRuleRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new ApiException("Missing the required parameter 'ruleId' when calling wafRulesUpdateAWafRule(Async)");
        }

        // verify the required parameter 'packageId' is set
        if (packageId == null) {
            throw new ApiException("Missing the required parameter 'packageId' when calling wafRulesUpdateAWafRule(Async)");
        }

        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling wafRulesUpdateAWafRule(Async)");
        }

        // verify the required parameter 'wafRulesUpdateAWafRuleRequest' is set
        if (wafRulesUpdateAWafRuleRequest == null) {
            throw new ApiException("Missing the required parameter 'wafRulesUpdateAWafRuleRequest' when calling wafRulesUpdateAWafRule(Async)");
        }

        return wafRulesUpdateAWafRuleCall(ruleId, packageId, zoneId, wafRulesUpdateAWafRuleRequest, _callback);

    }

    /**
     * Update a WAF rule
     * Updates a WAF rule. You can only update the mode/action of the rule.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).
     * @param ruleId  (required)
     * @param packageId  (required)
     * @param zoneId  (required)
     * @param wafRulesUpdateAWafRuleRequest  (required)
     * @return WafRulesUpdateAWafRule200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a WAF rule response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a WAF rule response failure </td><td>  -  </td></tr>
     </table>
     */
    public WafRulesUpdateAWafRule200Response wafRulesUpdateAWafRule(String ruleId, String packageId, String zoneId, WafRulesUpdateAWafRuleRequest wafRulesUpdateAWafRuleRequest) throws ApiException {
        ApiResponse<WafRulesUpdateAWafRule200Response> localVarResp = wafRulesUpdateAWafRuleWithHttpInfo(ruleId, packageId, zoneId, wafRulesUpdateAWafRuleRequest);
        return localVarResp.getData();
    }

    /**
     * Update a WAF rule
     * Updates a WAF rule. You can only update the mode/action of the rule.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).
     * @param ruleId  (required)
     * @param packageId  (required)
     * @param zoneId  (required)
     * @param wafRulesUpdateAWafRuleRequest  (required)
     * @return ApiResponse&lt;WafRulesUpdateAWafRule200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a WAF rule response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a WAF rule response failure </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WafRulesUpdateAWafRule200Response> wafRulesUpdateAWafRuleWithHttpInfo(String ruleId, String packageId, String zoneId, WafRulesUpdateAWafRuleRequest wafRulesUpdateAWafRuleRequest) throws ApiException {
        okhttp3.Call localVarCall = wafRulesUpdateAWafRuleValidateBeforeCall(ruleId, packageId, zoneId, wafRulesUpdateAWafRuleRequest, null);
        Type localVarReturnType = new TypeToken<WafRulesUpdateAWafRule200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a WAF rule (asynchronously)
     * Updates a WAF rule. You can only update the mode/action of the rule.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).
     * @param ruleId  (required)
     * @param packageId  (required)
     * @param zoneId  (required)
     * @param wafRulesUpdateAWafRuleRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a WAF rule response </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Update a WAF rule response failure </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call wafRulesUpdateAWafRuleAsync(String ruleId, String packageId, String zoneId, WafRulesUpdateAWafRuleRequest wafRulesUpdateAWafRuleRequest, final ApiCallback<WafRulesUpdateAWafRule200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = wafRulesUpdateAWafRuleValidateBeforeCall(ruleId, packageId, zoneId, wafRulesUpdateAWafRuleRequest, _callback);
        Type localVarReturnType = new TypeToken<WafRulesUpdateAWafRule200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
