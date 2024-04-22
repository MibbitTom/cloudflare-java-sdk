# WafRuleGroupsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**wafRuleGroupsGetAWafRuleGroup**](WafRuleGroupsApi.md#wafRuleGroupsGetAWafRuleGroup) | **GET** /zones/{zone_id}/firewall/waf/packages/{package_id}/groups/{group_id} | Get a WAF rule group |
| [**wafRuleGroupsListWafRuleGroups**](WafRuleGroupsApi.md#wafRuleGroupsListWafRuleGroups) | **GET** /zones/{zone_id}/firewall/waf/packages/{package_id}/groups | List WAF rule groups |
| [**wafRuleGroupsUpdateAWafRuleGroup**](WafRuleGroupsApi.md#wafRuleGroupsUpdateAWafRuleGroup) | **PATCH** /zones/{zone_id}/firewall/waf/packages/{package_id}/groups/{group_id} | Update a WAF rule group |


<a id="wafRuleGroupsGetAWafRuleGroup"></a>
# **wafRuleGroupsGetAWafRuleGroup**
> WafManagedRulesRuleGroupResponseSingle wafRuleGroupsGetAWafRuleGroup(groupId, packageId, zoneId)

Get a WAF rule group

Fetches the details of a WAF rule group.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WafRuleGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WafRuleGroupsApi apiInstance = new WafRuleGroupsApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    String packageId = "packageId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      WafManagedRulesRuleGroupResponseSingle result = apiInstance.wafRuleGroupsGetAWafRuleGroup(groupId, packageId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafRuleGroupsApi#wafRuleGroupsGetAWafRuleGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **packageId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**WafManagedRulesRuleGroupResponseSingle**](WafManagedRulesRuleGroupResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a WAF rule group response |  -  |
| **4XX** | Get a WAF rule group response failure |  -  |

<a id="wafRuleGroupsListWafRuleGroups"></a>
# **wafRuleGroupsListWafRuleGroups**
> WafManagedRulesRuleGroupResponseCollection wafRuleGroupsListWafRuleGroups(packageId, zoneId, mode, page, perPage, order, direction, match, name, rulesCount)

List WAF rule groups

Fetches the WAF rule groups in a WAF package.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WafRuleGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WafRuleGroupsApi apiInstance = new WafRuleGroupsApi(defaultClient);
    String packageId = "packageId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    WafManagedRulesMode mode = WafManagedRulesMode.fromValue("on"); // WafManagedRulesMode | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("50"); // BigDecimal | 
    String order = "mode"; // String | 
    String direction = "asc"; // String | 
    String match = "any"; // String | 
    String name = "Project Honey Pot"; // String | 
    BigDecimal rulesCount = new BigDecimal("0"); // BigDecimal | 
    try {
      WafManagedRulesRuleGroupResponseCollection result = apiInstance.wafRuleGroupsListWafRuleGroups(packageId, zoneId, mode, page, perPage, order, direction, match, name, rulesCount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafRuleGroupsApi#wafRuleGroupsListWafRuleGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageId** | **String**|  | |
| **zoneId** | **String**|  | |
| **mode** | [**WafManagedRulesMode**](.md)|  | [optional] [default to on] [enum: on, off] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 50] |
| **order** | **String**|  | [optional] [enum: mode, rules_count] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |
| **match** | **String**|  | [optional] [default to all] [enum: any, all] |
| **name** | **String**|  | [optional] |
| **rulesCount** | **BigDecimal**|  | [optional] [default to 0] |

### Return type

[**WafManagedRulesRuleGroupResponseCollection**](WafManagedRulesRuleGroupResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List WAF rule groups response |  -  |
| **4XX** | List WAF rule groups response failure |  -  |

<a id="wafRuleGroupsUpdateAWafRuleGroup"></a>
# **wafRuleGroupsUpdateAWafRuleGroup**
> WafManagedRulesRuleGroupResponseSingle wafRuleGroupsUpdateAWafRuleGroup(groupId, packageId, zoneId, wafRuleGroupsUpdateAWafRuleGroupRequest)

Update a WAF rule group

Updates a WAF rule group. You can update the state (&#x60;mode&#x60; parameter) of a rule group.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WafRuleGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WafRuleGroupsApi apiInstance = new WafRuleGroupsApi(defaultClient);
    String groupId = "groupId_example"; // String | 
    String packageId = "packageId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    WafRuleGroupsUpdateAWafRuleGroupRequest wafRuleGroupsUpdateAWafRuleGroupRequest = new WafRuleGroupsUpdateAWafRuleGroupRequest(); // WafRuleGroupsUpdateAWafRuleGroupRequest | 
    try {
      WafManagedRulesRuleGroupResponseSingle result = apiInstance.wafRuleGroupsUpdateAWafRuleGroup(groupId, packageId, zoneId, wafRuleGroupsUpdateAWafRuleGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafRuleGroupsApi#wafRuleGroupsUpdateAWafRuleGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **packageId** | **String**|  | |
| **zoneId** | **String**|  | |
| **wafRuleGroupsUpdateAWafRuleGroupRequest** | [**WafRuleGroupsUpdateAWafRuleGroupRequest**](WafRuleGroupsUpdateAWafRuleGroupRequest.md)|  | |

### Return type

[**WafManagedRulesRuleGroupResponseSingle**](WafManagedRulesRuleGroupResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a WAF rule group response |  -  |
| **4XX** | Update a WAF rule group response failure |  -  |

