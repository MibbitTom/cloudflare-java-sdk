# WafOverridesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**wafOverridesCreateAWafOverride**](WafOverridesApi.md#wafOverridesCreateAWafOverride) | **POST** /zones/{zone_identifier}/firewall/waf/overrides | Create a WAF override |
| [**wafOverridesDeleteAWafOverride**](WafOverridesApi.md#wafOverridesDeleteAWafOverride) | **DELETE** /zones/{zone_identifier}/firewall/waf/overrides/{id} | Delete a WAF override |
| [**wafOverridesGetAWafOverride**](WafOverridesApi.md#wafOverridesGetAWafOverride) | **GET** /zones/{zone_identifier}/firewall/waf/overrides/{id} | Get a WAF override |
| [**wafOverridesListWafOverrides**](WafOverridesApi.md#wafOverridesListWafOverrides) | **GET** /zones/{zone_identifier}/firewall/waf/overrides | List WAF overrides |
| [**wafOverridesUpdateWafOverride**](WafOverridesApi.md#wafOverridesUpdateWafOverride) | **PUT** /zones/{zone_identifier}/firewall/waf/overrides/{id} | Update WAF override |


<a id="wafOverridesCreateAWafOverride"></a>
# **wafOverridesCreateAWafOverride**
> FirewallOverrideResponseSingle wafOverridesCreateAWafOverride(zoneIdentifier, body)

Create a WAF override

Creates a URI-based WAF override for a zone.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WafOverridesApi;

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

    WafOverridesApi apiInstance = new WafOverridesApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Object body = null; // Object | 
    try {
      FirewallOverrideResponseSingle result = apiInstance.wafOverridesCreateAWafOverride(zoneIdentifier, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafOverridesApi#wafOverridesCreateAWafOverride");
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
| **body** | **Object**|  | |

### Return type

[**FirewallOverrideResponseSingle**](FirewallOverrideResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a WAF override response |  -  |
| **4XX** | Create a WAF override response failure |  -  |

<a id="wafOverridesDeleteAWafOverride"></a>
# **wafOverridesDeleteAWafOverride**
> WafOverridesDeleteAWafOverride200Response wafOverridesDeleteAWafOverride(id, zoneIdentifier)

Delete a WAF override

Deletes an existing URI-based WAF override.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WafOverridesApi;

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

    WafOverridesApi apiInstance = new WafOverridesApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      WafOverridesDeleteAWafOverride200Response result = apiInstance.wafOverridesDeleteAWafOverride(id, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafOverridesApi#wafOverridesDeleteAWafOverride");
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
| **id** | **String**|  | |
| **zoneIdentifier** | **String**|  | |

### Return type

[**WafOverridesDeleteAWafOverride200Response**](WafOverridesDeleteAWafOverride200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a WAF override response |  -  |
| **4XX** | Delete a WAF override response failure |  -  |

<a id="wafOverridesGetAWafOverride"></a>
# **wafOverridesGetAWafOverride**
> FirewallOverrideResponseSingle wafOverridesGetAWafOverride(id, zoneIdentifier)

Get a WAF override

Fetches the details of a URI-based WAF override.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WafOverridesApi;

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

    WafOverridesApi apiInstance = new WafOverridesApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      FirewallOverrideResponseSingle result = apiInstance.wafOverridesGetAWafOverride(id, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafOverridesApi#wafOverridesGetAWafOverride");
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
| **id** | **String**|  | |
| **zoneIdentifier** | **String**|  | |

### Return type

[**FirewallOverrideResponseSingle**](FirewallOverrideResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a WAF override response |  -  |
| **4XX** | Get a WAF override response failure |  -  |

<a id="wafOverridesListWafOverrides"></a>
# **wafOverridesListWafOverrides**
> FirewallOverrideResponseCollection wafOverridesListWafOverrides(zoneIdentifier, page, perPage)

List WAF overrides

Fetches the URI-based WAF overrides in a zone.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WafOverridesApi;

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

    WafOverridesApi apiInstance = new WafOverridesApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("50"); // BigDecimal | 
    try {
      FirewallOverrideResponseCollection result = apiInstance.wafOverridesListWafOverrides(zoneIdentifier, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafOverridesApi#wafOverridesListWafOverrides");
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

### Return type

[**FirewallOverrideResponseCollection**](FirewallOverrideResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List WAF overrides response |  -  |
| **4XX** | List WAF overrides response failure |  -  |

<a id="wafOverridesUpdateWafOverride"></a>
# **wafOverridesUpdateWafOverride**
> FirewallOverrideResponseSingle wafOverridesUpdateWafOverride(id, zoneIdentifier, body)

Update WAF override

Updates an existing URI-based WAF override.  **Note:** Applies only to the [previous version of WAF managed rules](https://developers.cloudflare.com/support/firewall/managed-rules-web-application-firewall-waf/understanding-waf-managed-rules-web-application-firewall/).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WafOverridesApi;

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

    WafOverridesApi apiInstance = new WafOverridesApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Object body = null; // Object | 
    try {
      FirewallOverrideResponseSingle result = apiInstance.wafOverridesUpdateWafOverride(id, zoneIdentifier, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WafOverridesApi#wafOverridesUpdateWafOverride");
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
| **id** | **String**|  | |
| **zoneIdentifier** | **String**|  | |
| **body** | **Object**|  | |

### Return type

[**FirewallOverrideResponseSingle**](FirewallOverrideResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update WAF override response |  -  |
| **4XX** | Update WAF override response failure |  -  |

