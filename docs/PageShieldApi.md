# PageShieldApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pageShieldCreateAPageShieldPolicy**](PageShieldApi.md#pageShieldCreateAPageShieldPolicy) | **POST** /zones/{zone_id}/page_shield/policies | Create a Page Shield policy |
| [**pageShieldDeleteAPageShieldPolicy**](PageShieldApi.md#pageShieldDeleteAPageShieldPolicy) | **DELETE** /zones/{zone_id}/page_shield/policies/{policy_id} | Delete a Page Shield policy |
| [**pageShieldGetAPageShieldConnection**](PageShieldApi.md#pageShieldGetAPageShieldConnection) | **GET** /zones/{zone_id}/page_shield/connections/{connection_id} | Get a Page Shield connection |
| [**pageShieldGetAPageShieldPolicy**](PageShieldApi.md#pageShieldGetAPageShieldPolicy) | **GET** /zones/{zone_id}/page_shield/policies/{policy_id} | Get a Page Shield policy |
| [**pageShieldGetAPageShieldScript**](PageShieldApi.md#pageShieldGetAPageShieldScript) | **GET** /zones/{zone_id}/page_shield/scripts/{script_id} | Get a Page Shield script |
| [**pageShieldGetPageShieldSettings**](PageShieldApi.md#pageShieldGetPageShieldSettings) | **GET** /zones/{zone_id}/page_shield | Get Page Shield settings |
| [**pageShieldListPageShieldConnections**](PageShieldApi.md#pageShieldListPageShieldConnections) | **GET** /zones/{zone_id}/page_shield/connections | List Page Shield connections |
| [**pageShieldListPageShieldPolicies**](PageShieldApi.md#pageShieldListPageShieldPolicies) | **GET** /zones/{zone_id}/page_shield/policies | List Page Shield policies |
| [**pageShieldListPageShieldScripts**](PageShieldApi.md#pageShieldListPageShieldScripts) | **GET** /zones/{zone_id}/page_shield/scripts | List Page Shield scripts |
| [**pageShieldUpdateAPageShieldPolicy**](PageShieldApi.md#pageShieldUpdateAPageShieldPolicy) | **PUT** /zones/{zone_id}/page_shield/policies/{policy_id} | Update a Page Shield policy |
| [**pageShieldUpdatePageShieldSettings**](PageShieldApi.md#pageShieldUpdatePageShieldSettings) | **PUT** /zones/{zone_id}/page_shield | Update Page Shield settings |


<a id="pageShieldCreateAPageShieldPolicy"></a>
# **pageShieldCreateAPageShieldPolicy**
> PageShieldGetZonePolicyResponse pageShieldCreateAPageShieldPolicy(zoneId, pageShieldCreateAPageShieldPolicyRequest)

Create a Page Shield policy

Create a Page Shield policy.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.PageShieldApi;

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

    PageShieldApi apiInstance = new PageShieldApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    PageShieldCreateAPageShieldPolicyRequest pageShieldCreateAPageShieldPolicyRequest = new PageShieldCreateAPageShieldPolicyRequest(); // PageShieldCreateAPageShieldPolicyRequest | 
    try {
      PageShieldGetZonePolicyResponse result = apiInstance.pageShieldCreateAPageShieldPolicy(zoneId, pageShieldCreateAPageShieldPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageShieldApi#pageShieldCreateAPageShieldPolicy");
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
| **pageShieldCreateAPageShieldPolicyRequest** | [**PageShieldCreateAPageShieldPolicyRequest**](PageShieldCreateAPageShieldPolicyRequest.md)|  | |

### Return type

[**PageShieldGetZonePolicyResponse**](PageShieldGetZonePolicyResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a Page Shield policy response |  -  |
| **4XX** | Create a Page Shield policy response failure |  -  |

<a id="pageShieldDeleteAPageShieldPolicy"></a>
# **pageShieldDeleteAPageShieldPolicy**
> pageShieldDeleteAPageShieldPolicy(zoneId, policyId)

Delete a Page Shield policy

Delete a Page Shield policy by ID.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.PageShieldApi;

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

    PageShieldApi apiInstance = new PageShieldApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String policyId = "policyId_example"; // String | 
    try {
      apiInstance.pageShieldDeleteAPageShieldPolicy(zoneId, policyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageShieldApi#pageShieldDeleteAPageShieldPolicy");
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
| **policyId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Delete a Page Shield policy response |  -  |
| **4XX** | Delete a Page Shield policy response failure |  -  |

<a id="pageShieldGetAPageShieldConnection"></a>
# **pageShieldGetAPageShieldConnection**
> PageShieldGetZoneConnectionResponse pageShieldGetAPageShieldConnection(zoneId, connectionId)

Get a Page Shield connection

Fetches a connection detected by Page Shield by connection ID.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.PageShieldApi;

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

    PageShieldApi apiInstance = new PageShieldApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String connectionId = "connectionId_example"; // String | 
    try {
      PageShieldGetZoneConnectionResponse result = apiInstance.pageShieldGetAPageShieldConnection(zoneId, connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageShieldApi#pageShieldGetAPageShieldConnection");
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
| **connectionId** | **String**|  | |

### Return type

[**PageShieldGetZoneConnectionResponse**](PageShieldGetZoneConnectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a Page Shield connection response |  -  |
| **4XX** | Get a Page Shield connection response failure |  -  |

<a id="pageShieldGetAPageShieldPolicy"></a>
# **pageShieldGetAPageShieldPolicy**
> PageShieldGetZonePolicyResponse pageShieldGetAPageShieldPolicy(zoneId, policyId)

Get a Page Shield policy

Fetches a Page Shield policy by ID.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.PageShieldApi;

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

    PageShieldApi apiInstance = new PageShieldApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String policyId = "policyId_example"; // String | 
    try {
      PageShieldGetZonePolicyResponse result = apiInstance.pageShieldGetAPageShieldPolicy(zoneId, policyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageShieldApi#pageShieldGetAPageShieldPolicy");
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
| **policyId** | **String**|  | |

### Return type

[**PageShieldGetZonePolicyResponse**](PageShieldGetZonePolicyResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a Page Shield policy response |  -  |
| **4XX** | Get a Page Shield policy response failure |  -  |

<a id="pageShieldGetAPageShieldScript"></a>
# **pageShieldGetAPageShieldScript**
> PageShieldGetZoneScriptResponse pageShieldGetAPageShieldScript(zoneId, scriptId)

Get a Page Shield script

Fetches a script detected by Page Shield by script ID.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.PageShieldApi;

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

    PageShieldApi apiInstance = new PageShieldApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String scriptId = "scriptId_example"; // String | 
    try {
      PageShieldGetZoneScriptResponse result = apiInstance.pageShieldGetAPageShieldScript(zoneId, scriptId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageShieldApi#pageShieldGetAPageShieldScript");
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
| **scriptId** | **String**|  | |

### Return type

[**PageShieldGetZoneScriptResponse**](PageShieldGetZoneScriptResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a Page Shield script response |  -  |
| **4XX** | Get a Page Shield script response failure |  -  |

<a id="pageShieldGetPageShieldSettings"></a>
# **pageShieldGetPageShieldSettings**
> PageShieldGetPageShieldSettings200Response pageShieldGetPageShieldSettings(zoneId)

Get Page Shield settings

Fetches the Page Shield settings.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.PageShieldApi;

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

    PageShieldApi apiInstance = new PageShieldApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      PageShieldGetPageShieldSettings200Response result = apiInstance.pageShieldGetPageShieldSettings(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageShieldApi#pageShieldGetPageShieldSettings");
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

[**PageShieldGetPageShieldSettings200Response**](PageShieldGetPageShieldSettings200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Page Shield settings response |  -  |
| **4XX** | Get Page Shield settings response failure |  -  |

<a id="pageShieldListPageShieldConnections"></a>
# **pageShieldListPageShieldConnections**
> PageShieldListZoneConnectionsResponse pageShieldListPageShieldConnections(zoneId, excludeUrls, urls, hosts, page, perPage, orderBy, direction, prioritizeMalicious, excludeCdnCgi, status, pageUrl, export)

List Page Shield connections

Lists all connections detected by Page Shield.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.PageShieldApi;

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

    PageShieldApi apiInstance = new PageShieldApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String excludeUrls = "blog.cloudflare.com,www.example"; // String | 
    String urls = "blog.cloudflare.com,www.example"; // String | 
    String hosts = "blog.cloudflare.com,www.example*,*cloudflare.com"; // String | 
    String page = "2"; // String | 
    BigDecimal perPage = new BigDecimal("100"); // BigDecimal | 
    String orderBy = "first_seen_at"; // String | 
    String direction = "asc"; // String | 
    Boolean prioritizeMalicious = true; // Boolean | 
    Boolean excludeCdnCgi = true; // Boolean | 
    String status = "active,inactive"; // String | 
    String pageUrl = "example.com/page,*_/checkout,example.com/_*,*checkout*"; // String | 
    String export = "csv"; // String | 
    try {
      PageShieldListZoneConnectionsResponse result = apiInstance.pageShieldListPageShieldConnections(zoneId, excludeUrls, urls, hosts, page, perPage, orderBy, direction, prioritizeMalicious, excludeCdnCgi, status, pageUrl, export);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageShieldApi#pageShieldListPageShieldConnections");
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
| **excludeUrls** | **String**|  | [optional] |
| **urls** | **String**|  | [optional] |
| **hosts** | **String**|  | [optional] |
| **page** | **String**|  | [optional] |
| **perPage** | **BigDecimal**|  | [optional] |
| **orderBy** | **String**|  | [optional] [enum: first_seen_at, last_seen_at] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |
| **prioritizeMalicious** | **Boolean**|  | [optional] |
| **excludeCdnCgi** | **Boolean**|  | [optional] |
| **status** | **String**|  | [optional] |
| **pageUrl** | **String**|  | [optional] |
| **export** | **String**|  | [optional] [enum: csv] |

### Return type

[**PageShieldListZoneConnectionsResponse**](PageShieldListZoneConnectionsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Page Shield connections response |  -  |
| **4XX** | List Page Shield connections response failure |  -  |

<a id="pageShieldListPageShieldPolicies"></a>
# **pageShieldListPageShieldPolicies**
> PageShieldListZonePoliciesResponse pageShieldListPageShieldPolicies(zoneId)

List Page Shield policies

Lists all Page Shield policies.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.PageShieldApi;

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

    PageShieldApi apiInstance = new PageShieldApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      PageShieldListZonePoliciesResponse result = apiInstance.pageShieldListPageShieldPolicies(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageShieldApi#pageShieldListPageShieldPolicies");
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

[**PageShieldListZonePoliciesResponse**](PageShieldListZonePoliciesResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Page Shield policies response |  -  |
| **4XX** | List Page Shield policies response failure |  -  |

<a id="pageShieldListPageShieldScripts"></a>
# **pageShieldListPageShieldScripts**
> PageShieldListZoneScriptsResponse pageShieldListPageShieldScripts(zoneId, excludeUrls, urls, hosts, page, perPage, orderBy, direction, prioritizeMalicious, excludeCdnCgi, excludeDuplicates, status, pageUrl, export)

List Page Shield scripts

Lists all scripts detected by Page Shield.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.PageShieldApi;

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

    PageShieldApi apiInstance = new PageShieldApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String excludeUrls = "blog.cloudflare.com,www.example"; // String | 
    String urls = "blog.cloudflare.com,www.example"; // String | 
    String hosts = "blog.cloudflare.com,www.example*,*cloudflare.com"; // String | 
    String page = "2"; // String | 
    BigDecimal perPage = new BigDecimal("100"); // BigDecimal | 
    String orderBy = "first_seen_at"; // String | 
    String direction = "asc"; // String | 
    Boolean prioritizeMalicious = true; // Boolean | 
    Boolean excludeCdnCgi = true; // Boolean | 
    Boolean excludeDuplicates = true; // Boolean | 
    String status = "active,inactive"; // String | 
    String pageUrl = "example.com/page,*_/checkout,example.com/_*,*checkout*"; // String | 
    String export = "csv"; // String | 
    try {
      PageShieldListZoneScriptsResponse result = apiInstance.pageShieldListPageShieldScripts(zoneId, excludeUrls, urls, hosts, page, perPage, orderBy, direction, prioritizeMalicious, excludeCdnCgi, excludeDuplicates, status, pageUrl, export);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageShieldApi#pageShieldListPageShieldScripts");
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
| **excludeUrls** | **String**|  | [optional] |
| **urls** | **String**|  | [optional] |
| **hosts** | **String**|  | [optional] |
| **page** | **String**|  | [optional] |
| **perPage** | **BigDecimal**|  | [optional] |
| **orderBy** | **String**|  | [optional] [enum: first_seen_at, last_seen_at] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |
| **prioritizeMalicious** | **Boolean**|  | [optional] |
| **excludeCdnCgi** | **Boolean**|  | [optional] [default to true] |
| **excludeDuplicates** | **Boolean**|  | [optional] [default to true] |
| **status** | **String**|  | [optional] |
| **pageUrl** | **String**|  | [optional] |
| **export** | **String**|  | [optional] [enum: csv] |

### Return type

[**PageShieldListZoneScriptsResponse**](PageShieldListZoneScriptsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Page Shield scripts response |  -  |
| **4XX** | List Page Shield scripts response failure |  -  |

<a id="pageShieldUpdateAPageShieldPolicy"></a>
# **pageShieldUpdateAPageShieldPolicy**
> PageShieldGetZonePolicyResponse pageShieldUpdateAPageShieldPolicy(zoneId, policyId, pageShieldCreateAPageShieldPolicyRequest)

Update a Page Shield policy

Update a Page Shield policy by ID.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.PageShieldApi;

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

    PageShieldApi apiInstance = new PageShieldApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String policyId = "policyId_example"; // String | 
    PageShieldCreateAPageShieldPolicyRequest pageShieldCreateAPageShieldPolicyRequest = new PageShieldCreateAPageShieldPolicyRequest(); // PageShieldCreateAPageShieldPolicyRequest | 
    try {
      PageShieldGetZonePolicyResponse result = apiInstance.pageShieldUpdateAPageShieldPolicy(zoneId, policyId, pageShieldCreateAPageShieldPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageShieldApi#pageShieldUpdateAPageShieldPolicy");
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
| **policyId** | **String**|  | |
| **pageShieldCreateAPageShieldPolicyRequest** | [**PageShieldCreateAPageShieldPolicyRequest**](PageShieldCreateAPageShieldPolicyRequest.md)|  | |

### Return type

[**PageShieldGetZonePolicyResponse**](PageShieldGetZonePolicyResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a Page Shield policy response |  -  |
| **4XX** | Update a Page Shield policy response failure |  -  |

<a id="pageShieldUpdatePageShieldSettings"></a>
# **pageShieldUpdatePageShieldSettings**
> PageShieldUpdatePageShieldSettings200Response pageShieldUpdatePageShieldSettings(zoneId, pageShieldUpdatePageShieldSettingsRequest)

Update Page Shield settings

Updates Page Shield settings.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.PageShieldApi;

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

    PageShieldApi apiInstance = new PageShieldApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    PageShieldUpdatePageShieldSettingsRequest pageShieldUpdatePageShieldSettingsRequest = new PageShieldUpdatePageShieldSettingsRequest(); // PageShieldUpdatePageShieldSettingsRequest | 
    try {
      PageShieldUpdatePageShieldSettings200Response result = apiInstance.pageShieldUpdatePageShieldSettings(zoneId, pageShieldUpdatePageShieldSettingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageShieldApi#pageShieldUpdatePageShieldSettings");
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
| **pageShieldUpdatePageShieldSettingsRequest** | [**PageShieldUpdatePageShieldSettingsRequest**](PageShieldUpdatePageShieldSettingsRequest.md)|  | |

### Return type

[**PageShieldUpdatePageShieldSettings200Response**](PageShieldUpdatePageShieldSettings200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Page Shield settings response |  -  |
| **4XX** | Update Page Shield settings response failure |  -  |

