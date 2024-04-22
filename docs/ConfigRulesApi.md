# ConfigRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**configRulesListConfigRules**](ConfigRulesApi.md#configRulesListConfigRules) | **GET** /zones/{zone_id}/rulesets/phases/http_config_settings/entrypoint | List Config Rules |
| [**configRulesUpdateConfigRules**](ConfigRulesApi.md#configRulesUpdateConfigRules) | **PUT** /zones/{zone_id}/rulesets/phases/http_config_settings/entrypoint | Update Config Rules |


<a id="configRulesListConfigRules"></a>
# **configRulesListConfigRules**
> FirewallComponentsSchemasRuleset configRulesListConfigRules(zoneId)

List Config Rules

Fetches all Config Rules in a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigRulesApi;

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

    ConfigRulesApi apiInstance = new ConfigRulesApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      FirewallComponentsSchemasRuleset result = apiInstance.configRulesListConfigRules(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigRulesApi#configRulesListConfigRules");
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

[**FirewallComponentsSchemasRuleset**](FirewallComponentsSchemasRuleset.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Config Rules response |  -  |
| **4XX** | List Config Rules response failure |  -  |

<a id="configRulesUpdateConfigRules"></a>
# **configRulesUpdateConfigRules**
> FirewallApiResponseSingle configRulesUpdateConfigRules(zoneId, firewallUpdateRuleset)

Update Config Rules

Updates the Config Rules of a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigRulesApi;

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

    ConfigRulesApi apiInstance = new ConfigRulesApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    FirewallUpdateRuleset firewallUpdateRuleset = new FirewallUpdateRuleset(); // FirewallUpdateRuleset | 
    try {
      FirewallApiResponseSingle result = apiInstance.configRulesUpdateConfigRules(zoneId, firewallUpdateRuleset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigRulesApi#configRulesUpdateConfigRules");
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
| **200** | Update Config Rules response |  -  |
| **4XX** | Update Config Rules response failure |  -  |

