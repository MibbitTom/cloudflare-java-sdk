# FiltersApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**filtersCreateFilters**](FiltersApi.md#filtersCreateFilters) | **POST** /zones/{zone_identifier}/filters | Create filters |
| [**filtersDeleteAFilter**](FiltersApi.md#filtersDeleteAFilter) | **DELETE** /zones/{zone_identifier}/filters/{id} | Delete a filter |
| [**filtersDeleteFilters**](FiltersApi.md#filtersDeleteFilters) | **DELETE** /zones/{zone_identifier}/filters | Delete filters |
| [**filtersGetAFilter**](FiltersApi.md#filtersGetAFilter) | **GET** /zones/{zone_identifier}/filters/{id} | Get a filter |
| [**filtersListFilters**](FiltersApi.md#filtersListFilters) | **GET** /zones/{zone_identifier}/filters | List filters |
| [**filtersUpdateAFilter**](FiltersApi.md#filtersUpdateAFilter) | **PUT** /zones/{zone_identifier}/filters/{id} | Update a filter |
| [**filtersUpdateFilters**](FiltersApi.md#filtersUpdateFilters) | **PUT** /zones/{zone_identifier}/filters | Update filters |


<a id="filtersCreateFilters"></a>
# **filtersCreateFilters**
> FirewallFilterResponseCollection filtersCreateFilters(zoneIdentifier, body)

Create filters

Creates one or more filters.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.FiltersApi;

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

    FiltersApi apiInstance = new FiltersApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Object body = null; // Object | 
    try {
      FirewallFilterResponseCollection result = apiInstance.filtersCreateFilters(zoneIdentifier, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiltersApi#filtersCreateFilters");
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

[**FirewallFilterResponseCollection**](FirewallFilterResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create filters response |  -  |
| **4XX** | Create filters response failure |  -  |

<a id="filtersDeleteAFilter"></a>
# **filtersDeleteAFilter**
> FirewallFilterDeleteResponseSingle filtersDeleteAFilter(id, zoneIdentifier)

Delete a filter

Deletes an existing filter.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.FiltersApi;

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

    FiltersApi apiInstance = new FiltersApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      FirewallFilterDeleteResponseSingle result = apiInstance.filtersDeleteAFilter(id, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiltersApi#filtersDeleteAFilter");
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

[**FirewallFilterDeleteResponseSingle**](FirewallFilterDeleteResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a filter response |  -  |
| **4XX** | Delete a filter response failure |  -  |

<a id="filtersDeleteFilters"></a>
# **filtersDeleteFilters**
> FirewallFilterDeleteResponseCollection filtersDeleteFilters(zoneIdentifier, filtersDeleteFiltersRequest)

Delete filters

Deletes one or more existing filters.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.FiltersApi;

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

    FiltersApi apiInstance = new FiltersApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    FiltersDeleteFiltersRequest filtersDeleteFiltersRequest = new FiltersDeleteFiltersRequest(); // FiltersDeleteFiltersRequest | 
    try {
      FirewallFilterDeleteResponseCollection result = apiInstance.filtersDeleteFilters(zoneIdentifier, filtersDeleteFiltersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiltersApi#filtersDeleteFilters");
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
| **filtersDeleteFiltersRequest** | [**FiltersDeleteFiltersRequest**](FiltersDeleteFiltersRequest.md)|  | |

### Return type

[**FirewallFilterDeleteResponseCollection**](FirewallFilterDeleteResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete filters response |  -  |
| **4XX** | Delete filters response failure |  -  |

<a id="filtersGetAFilter"></a>
# **filtersGetAFilter**
> FirewallFilterResponseSingle filtersGetAFilter(id, zoneIdentifier)

Get a filter

Fetches the details of a filter.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.FiltersApi;

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

    FiltersApi apiInstance = new FiltersApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      FirewallFilterResponseSingle result = apiInstance.filtersGetAFilter(id, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiltersApi#filtersGetAFilter");
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

[**FirewallFilterResponseSingle**](FirewallFilterResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a filter response |  -  |
| **4XX** | Get a filter response failure |  -  |

<a id="filtersListFilters"></a>
# **filtersListFilters**
> FirewallFilterResponseCollection filtersListFilters(zoneIdentifier, paused, expression, description, ref, page, perPage, id)

List filters

Fetches filters in a zone. You can filter the results using several optional parameters.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.FiltersApi;

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

    FiltersApi apiInstance = new FiltersApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Boolean paused = true; // Boolean | 
    String expression = "php"; // String | 
    String description = "browsers"; // String | 
    String ref = "FIL-100"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("25"); // BigDecimal | 
    String id = "372e67954025e0ba6aaa6d586b9e0b61"; // String | 
    try {
      FirewallFilterResponseCollection result = apiInstance.filtersListFilters(zoneIdentifier, paused, expression, description, ref, page, perPage, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiltersApi#filtersListFilters");
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
| **paused** | **Boolean**|  | [optional] |
| **expression** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **ref** | **String**|  | [optional] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 25] |
| **id** | **String**|  | [optional] |

### Return type

[**FirewallFilterResponseCollection**](FirewallFilterResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List filters response |  -  |
| **4XX** | List filters response failure |  -  |

<a id="filtersUpdateAFilter"></a>
# **filtersUpdateAFilter**
> FirewallFilterResponseSingle filtersUpdateAFilter(id, zoneIdentifier, body)

Update a filter

Updates an existing filter.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.FiltersApi;

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

    FiltersApi apiInstance = new FiltersApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Object body = null; // Object | 
    try {
      FirewallFilterResponseSingle result = apiInstance.filtersUpdateAFilter(id, zoneIdentifier, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiltersApi#filtersUpdateAFilter");
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

[**FirewallFilterResponseSingle**](FirewallFilterResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a filter response |  -  |
| **4XX** | Update a filter response failure |  -  |

<a id="filtersUpdateFilters"></a>
# **filtersUpdateFilters**
> FirewallFilterResponseCollection filtersUpdateFilters(zoneIdentifier, body)

Update filters

Updates one or more existing filters.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.FiltersApi;

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

    FiltersApi apiInstance = new FiltersApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Object body = null; // Object | 
    try {
      FirewallFilterResponseCollection result = apiInstance.filtersUpdateFilters(zoneIdentifier, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FiltersApi#filtersUpdateFilters");
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

[**FirewallFilterResponseCollection**](FirewallFilterResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update filters response |  -  |
| **4XX** | Update filters response failure |  -  |

