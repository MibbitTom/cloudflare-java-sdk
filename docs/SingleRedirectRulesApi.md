# SingleRedirectRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**singleRedirectRulesListSingleRedirectRules**](SingleRedirectRulesApi.md#singleRedirectRulesListSingleRedirectRules) | **GET** /zones/{zone_id}/rulesets/phases/http_request_dynamic_redirect/entrypoint | List Single Redirect Rules |
| [**singleRedirectRulesUpdateSingleRedirectRules**](SingleRedirectRulesApi.md#singleRedirectRulesUpdateSingleRedirectRules) | **PUT** /zones/{zone_id}/rulesets/phases/http_request_dynamic_redirect/entrypoint | Update Single Redirect Rules |


<a id="singleRedirectRulesListSingleRedirectRules"></a>
# **singleRedirectRulesListSingleRedirectRules**
> FirewallSchemasRuleset singleRedirectRulesListSingleRedirectRules(zoneId)

List Single Redirect Rules

Fetches all Single Redirect Rules in a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SingleRedirectRulesApi;

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

    SingleRedirectRulesApi apiInstance = new SingleRedirectRulesApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      FirewallSchemasRuleset result = apiInstance.singleRedirectRulesListSingleRedirectRules(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SingleRedirectRulesApi#singleRedirectRulesListSingleRedirectRules");
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

[**FirewallSchemasRuleset**](FirewallSchemasRuleset.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Single Redirect Rules response |  -  |
| **4XX** | List Single Redirect Rules response failure |  -  |

<a id="singleRedirectRulesUpdateSingleRedirectRules"></a>
# **singleRedirectRulesUpdateSingleRedirectRules**
> FirewallApiResponseSingle singleRedirectRulesUpdateSingleRedirectRules(zoneId, firewallUpdateRuleset)

Update Single Redirect Rules

Updates the Single Redirect Rules of a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SingleRedirectRulesApi;

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

    SingleRedirectRulesApi apiInstance = new SingleRedirectRulesApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    FirewallUpdateRuleset firewallUpdateRuleset = new FirewallUpdateRuleset(); // FirewallUpdateRuleset | 
    try {
      FirewallApiResponseSingle result = apiInstance.singleRedirectRulesUpdateSingleRedirectRules(zoneId, firewallUpdateRuleset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SingleRedirectRulesApi#singleRedirectRulesUpdateSingleRedirectRules");
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
| **200** | Update Single Redirect Rules response |  -  |
| **4XX** | Update Single Redirect Rules response failure |  -  |

