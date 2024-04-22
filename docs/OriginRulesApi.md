# OriginRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**originRulesListOriginRules**](OriginRulesApi.md#originRulesListOriginRules) | **GET** /zones/{zone_id}/rulesets/phases/http_request_origin/entrypoint | List Origin Rules |
| [**originRulesUpdateOriginRules**](OriginRulesApi.md#originRulesUpdateOriginRules) | **PUT** /zones/{zone_id}/rulesets/phases/http_request_origin/entrypoint | Update Origin Rules |


<a id="originRulesListOriginRules"></a>
# **originRulesListOriginRules**
> FirewallRuleset originRulesListOriginRules(zoneId)

List Origin Rules

Fetches all Origin Rules in a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OriginRulesApi;

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

    OriginRulesApi apiInstance = new OriginRulesApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      FirewallRuleset result = apiInstance.originRulesListOriginRules(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OriginRulesApi#originRulesListOriginRules");
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

[**FirewallRuleset**](FirewallRuleset.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Origin Rules response |  -  |
| **4XX** | List Origin Rules response failure |  -  |

<a id="originRulesUpdateOriginRules"></a>
# **originRulesUpdateOriginRules**
> FirewallApiResponseSingle originRulesUpdateOriginRules(zoneId, firewallUpdateRuleset)

Update Origin Rules

Updates the Origin Rules of a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OriginRulesApi;

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

    OriginRulesApi apiInstance = new OriginRulesApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    FirewallUpdateRuleset firewallUpdateRuleset = new FirewallUpdateRuleset(); // FirewallUpdateRuleset | 
    try {
      FirewallApiResponseSingle result = apiInstance.originRulesUpdateOriginRules(zoneId, firewallUpdateRuleset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OriginRulesApi#originRulesUpdateOriginRules");
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
| **200** | Update Origin Rules response |  -  |
| **4XX** | Update Origin Rules response failure |  -  |

