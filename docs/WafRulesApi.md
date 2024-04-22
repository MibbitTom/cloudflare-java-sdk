# WafRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**wafRulesGetAWafRule**](WafRulesApi.md#wafRulesGetAWafRule) | **GET** /zones/{zone_id}/firewall/waf/packages/{package_id}/rules/{rule_id} | Get a WAF rule |
| [**wafRulesListWafRules**](WafRulesApi.md#wafRulesListWafRules) | **GET** /zones/{zone_id}/firewall/waf/packages/{package_id}/rules | List WAF rules |
| [**wafRulesUpdateAWafRule**](WafRulesApi.md#wafRulesUpdateAWafRule) | **PATCH** /zones/{zone_id}/firewall/waf/packages/{package_id}/rules/{rule_id} | Update a WAF rule |


<a id="wafRulesGetAWafRule"></a>
# **wafRulesGetAWafRule**
> WafManagedRulesRuleResponseSingle wafRulesGetAWafRule(ruleId, packageId, zoneId)

Get a WAF rule

Fetches the details of a WAF rule in a WAF package.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WafRulesApi;

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

    WafRulesApi apiInstance = new WafRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    String packageId = "packageId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      WafManagedRulesRuleResponseSingle result = apiInstance.wafRulesGetAWafRule(ruleId, packageId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafRulesApi#wafRulesGetAWafRule");
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
| **ruleId** | **String**|  | |
| **packageId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**WafManagedRulesRuleResponseSingle**](WafManagedRulesRuleResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a WAF rule response |  -  |
| **4XX** | Get a WAF rule response failure |  -  |

<a id="wafRulesListWafRules"></a>
# **wafRulesListWafRules**
> WafManagedRulesRuleResponseCollection wafRulesListWafRules(packageId, zoneId, mode, groupId, page, perPage, order, direction, match, description, priority)

List WAF rules

Fetches WAF rules in a WAF package.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WafRulesApi;

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

    WafRulesApi apiInstance = new WafRulesApi(defaultClient);
    String packageId = "packageId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    String mode = "DIS"; // String | 
    String groupId = "groupId_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("50"); // BigDecimal | 
    String order = "priority"; // String | 
    String direction = "asc"; // String | 
    String match = "any"; // String | 
    String description = "SQL injection prevention for SELECT statements"; // String | 
    String priority = "priority_example"; // String | 
    try {
      WafManagedRulesRuleResponseCollection result = apiInstance.wafRulesListWafRules(packageId, zoneId, mode, groupId, page, perPage, order, direction, match, description, priority);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafRulesApi#wafRulesListWafRules");
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
| **mode** | **String**|  | [optional] [enum: DIS, CHL, BLK, SIM] |
| **groupId** | **String**|  | [optional] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 50] |
| **order** | **String**|  | [optional] [enum: priority, group_id, description] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |
| **match** | **String**|  | [optional] [default to all] [enum: any, all] |
| **description** | **String**|  | [optional] |
| **priority** | **String**|  | [optional] |

### Return type

[**WafManagedRulesRuleResponseCollection**](WafManagedRulesRuleResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List WAF rules response |  -  |
| **4XX** | List WAF rules response failure |  -  |

<a id="wafRulesUpdateAWafRule"></a>
# **wafRulesUpdateAWafRule**
> WafRulesUpdateAWafRule200Response wafRulesUpdateAWafRule(ruleId, packageId, zoneId, wafRulesUpdateAWafRuleRequest)

Update a WAF rule

Updates a WAF rule. You can only update the mode/action of the rule.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WafRulesApi;

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

    WafRulesApi apiInstance = new WafRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    String packageId = "packageId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    WafRulesUpdateAWafRuleRequest wafRulesUpdateAWafRuleRequest = new WafRulesUpdateAWafRuleRequest(); // WafRulesUpdateAWafRuleRequest | 
    try {
      WafRulesUpdateAWafRule200Response result = apiInstance.wafRulesUpdateAWafRule(ruleId, packageId, zoneId, wafRulesUpdateAWafRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafRulesApi#wafRulesUpdateAWafRule");
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
| **ruleId** | **String**|  | |
| **packageId** | **String**|  | |
| **zoneId** | **String**|  | |
| **wafRulesUpdateAWafRuleRequest** | [**WafRulesUpdateAWafRuleRequest**](WafRulesUpdateAWafRuleRequest.md)|  | |

### Return type

[**WafRulesUpdateAWafRule200Response**](WafRulesUpdateAWafRule200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a WAF rule response |  -  |
| **4XX** | Update a WAF rule response failure |  -  |

