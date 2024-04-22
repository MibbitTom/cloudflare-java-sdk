# WafPackagesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**wafPackagesGetAWafPackage**](WafPackagesApi.md#wafPackagesGetAWafPackage) | **GET** /zones/{zone_identifier}/firewall/waf/packages/{identifier} | Get a WAF package |
| [**wafPackagesListWafPackages**](WafPackagesApi.md#wafPackagesListWafPackages) | **GET** /zones/{zone_identifier}/firewall/waf/packages | List WAF packages |
| [**wafPackagesUpdateAWafPackage**](WafPackagesApi.md#wafPackagesUpdateAWafPackage) | **PATCH** /zones/{zone_identifier}/firewall/waf/packages/{identifier} | Update a WAF package |


<a id="wafPackagesGetAWafPackage"></a>
# **wafPackagesGetAWafPackage**
> FirewallApiResponseSingle wafPackagesGetAWafPackage(identifier, zoneIdentifier)

Get a WAF package

Fetches the details of a WAF package.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WafPackagesApi;

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

    WafPackagesApi apiInstance = new WafPackagesApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      FirewallApiResponseSingle result = apiInstance.wafPackagesGetAWafPackage(identifier, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafPackagesApi#wafPackagesGetAWafPackage");
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
| **identifier** | **String**|  | |
| **zoneIdentifier** | **String**|  | |

### Return type

[**FirewallApiResponseSingle**](FirewallApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a WAF package response |  -  |
| **4XX** | Get a WAF package response failure |  -  |

<a id="wafPackagesListWafPackages"></a>
# **wafPackagesListWafPackages**
> FirewallApiResponseCollection wafPackagesListWafPackages(zoneIdentifier, page, perPage, order, direction, match, name)

List WAF packages

Fetches WAF packages for a zone.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WafPackagesApi;

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

    WafPackagesApi apiInstance = new WafPackagesApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("50"); // BigDecimal | 
    String order = "name"; // String | 
    String direction = "asc"; // String | 
    String match = "any"; // String | 
    String name = "USER"; // String | 
    try {
      FirewallApiResponseCollection result = apiInstance.wafPackagesListWafPackages(zoneIdentifier, page, perPage, order, direction, match, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafPackagesApi#wafPackagesListWafPackages");
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
| **zoneIdentifier** | **String**|  | |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 50] |
| **order** | **String**|  | [optional] [enum: name] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |
| **match** | **String**|  | [optional] [default to all] [enum: any, all] |
| **name** | **String**|  | [optional] |

### Return type

[**FirewallApiResponseCollection**](FirewallApiResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List WAF packages response |  -  |
| **4XX** | List WAF packages response failure |  -  |

<a id="wafPackagesUpdateAWafPackage"></a>
# **wafPackagesUpdateAWafPackage**
> WafPackagesUpdateAWafPackage200Response wafPackagesUpdateAWafPackage(identifier, zoneIdentifier, wafPackagesUpdateAWafPackageRequest)

Update a WAF package

Updates a WAF package. You can update the sensitivity and the action of an anomaly detection WAF package.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WafPackagesApi;

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

    WafPackagesApi apiInstance = new WafPackagesApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    WafPackagesUpdateAWafPackageRequest wafPackagesUpdateAWafPackageRequest = new WafPackagesUpdateAWafPackageRequest(); // WafPackagesUpdateAWafPackageRequest | 
    try {
      WafPackagesUpdateAWafPackage200Response result = apiInstance.wafPackagesUpdateAWafPackage(identifier, zoneIdentifier, wafPackagesUpdateAWafPackageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafPackagesApi#wafPackagesUpdateAWafPackage");
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
| **identifier** | **String**|  | |
| **zoneIdentifier** | **String**|  | |
| **wafPackagesUpdateAWafPackageRequest** | [**WafPackagesUpdateAWafPackageRequest**](WafPackagesUpdateAWafPackageRequest.md)|  | |

### Return type

[**WafPackagesUpdateAWafPackage200Response**](WafPackagesUpdateAWafPackage200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a WAF package response |  -  |
| **4XX** | Update a WAF package response failure |  -  |

