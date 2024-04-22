# CacheRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cacheRulesListCacheRules**](CacheRulesApi.md#cacheRulesListCacheRules) | **GET** /zones/{zone_id}/rulesets/phases/http_request_cache_settings/entrypoint | List Cache Rules |
| [**cacheRulesUpdateCacheRules**](CacheRulesApi.md#cacheRulesUpdateCacheRules) | **PUT** /zones/{zone_id}/rulesets/phases/http_request_cache_settings/entrypoint | Update Cache Rules |


<a id="cacheRulesListCacheRules"></a>
# **cacheRulesListCacheRules**
> FirewallCacheRulesComponentsSchemasRuleset cacheRulesListCacheRules(zoneId)

List Cache Rules

Fetches all Cache Rules in a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CacheRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    CacheRulesApi apiInstance = new CacheRulesApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      FirewallCacheRulesComponentsSchemasRuleset result = apiInstance.cacheRulesListCacheRules(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CacheRulesApi#cacheRulesListCacheRules");
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
| **zoneId** | **String**|  | |

### Return type

[**FirewallCacheRulesComponentsSchemasRuleset**](FirewallCacheRulesComponentsSchemasRuleset.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Cache Rules response |  -  |
| **4XX** | List Cache Rules response failure |  -  |

<a id="cacheRulesUpdateCacheRules"></a>
# **cacheRulesUpdateCacheRules**
> FirewallApiResponseSingle cacheRulesUpdateCacheRules(zoneId, firewallUpdateRuleset)

Update Cache Rules

Updates the Cache Rules of a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CacheRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    CacheRulesApi apiInstance = new CacheRulesApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    FirewallUpdateRuleset firewallUpdateRuleset = new FirewallUpdateRuleset(); // FirewallUpdateRuleset | 
    try {
      FirewallApiResponseSingle result = apiInstance.cacheRulesUpdateCacheRules(zoneId, firewallUpdateRuleset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CacheRulesApi#cacheRulesUpdateCacheRules");
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
| **zoneId** | **String**|  | |
| **firewallUpdateRuleset** | [**FirewallUpdateRuleset**](FirewallUpdateRuleset.md)|  | |

### Return type

[**FirewallApiResponseSingle**](FirewallApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Cache Rules response |  -  |
| **4XX** | Update Cache Rules response failure |  -  |

