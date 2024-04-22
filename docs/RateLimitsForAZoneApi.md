# RateLimitsForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rateLimitsForAZoneCreateARateLimit**](RateLimitsForAZoneApi.md#rateLimitsForAZoneCreateARateLimit) | **POST** /zones/{zone_identifier}/rate_limits | Create a rate limit |
| [**rateLimitsForAZoneDeleteARateLimit**](RateLimitsForAZoneApi.md#rateLimitsForAZoneDeleteARateLimit) | **DELETE** /zones/{zone_identifier}/rate_limits/{id} | Delete a rate limit |
| [**rateLimitsForAZoneGetARateLimit**](RateLimitsForAZoneApi.md#rateLimitsForAZoneGetARateLimit) | **GET** /zones/{zone_identifier}/rate_limits/{id} | Get a rate limit |
| [**rateLimitsForAZoneListRateLimits**](RateLimitsForAZoneApi.md#rateLimitsForAZoneListRateLimits) | **GET** /zones/{zone_identifier}/rate_limits | List rate limits |
| [**rateLimitsForAZoneUpdateARateLimit**](RateLimitsForAZoneApi.md#rateLimitsForAZoneUpdateARateLimit) | **PUT** /zones/{zone_identifier}/rate_limits/{id} | Update a rate limit |


<a id="rateLimitsForAZoneCreateARateLimit"></a>
# **rateLimitsForAZoneCreateARateLimit**
> FirewallRatelimitResponseSingle rateLimitsForAZoneCreateARateLimit(zoneIdentifier, body)

Create a rate limit

Creates a new rate limit for a zone. Refer to the object definition for a list of required attributes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RateLimitsForAZoneApi;

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

    RateLimitsForAZoneApi apiInstance = new RateLimitsForAZoneApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Object body = null; // Object | 
    try {
      FirewallRatelimitResponseSingle result = apiInstance.rateLimitsForAZoneCreateARateLimit(zoneIdentifier, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RateLimitsForAZoneApi#rateLimitsForAZoneCreateARateLimit");
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

[**FirewallRatelimitResponseSingle**](FirewallRatelimitResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a rate limit response |  -  |
| **4XX** | Create a rate limit response failure |  -  |

<a id="rateLimitsForAZoneDeleteARateLimit"></a>
# **rateLimitsForAZoneDeleteARateLimit**
> RateLimitsForAZoneDeleteARateLimit200Response rateLimitsForAZoneDeleteARateLimit(id, zoneIdentifier)

Delete a rate limit

Deletes an existing rate limit.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RateLimitsForAZoneApi;

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

    RateLimitsForAZoneApi apiInstance = new RateLimitsForAZoneApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      RateLimitsForAZoneDeleteARateLimit200Response result = apiInstance.rateLimitsForAZoneDeleteARateLimit(id, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RateLimitsForAZoneApi#rateLimitsForAZoneDeleteARateLimit");
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

[**RateLimitsForAZoneDeleteARateLimit200Response**](RateLimitsForAZoneDeleteARateLimit200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a rate limit response |  -  |
| **4XX** | Delete a rate limit response failure |  -  |

<a id="rateLimitsForAZoneGetARateLimit"></a>
# **rateLimitsForAZoneGetARateLimit**
> FirewallRatelimitResponseSingle rateLimitsForAZoneGetARateLimit(id, zoneIdentifier)

Get a rate limit

Fetches the details of a rate limit.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RateLimitsForAZoneApi;

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

    RateLimitsForAZoneApi apiInstance = new RateLimitsForAZoneApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      FirewallRatelimitResponseSingle result = apiInstance.rateLimitsForAZoneGetARateLimit(id, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RateLimitsForAZoneApi#rateLimitsForAZoneGetARateLimit");
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

[**FirewallRatelimitResponseSingle**](FirewallRatelimitResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a rate limit response |  -  |
| **4XX** | Get a rate limit response failure |  -  |

<a id="rateLimitsForAZoneListRateLimits"></a>
# **rateLimitsForAZoneListRateLimits**
> FirewallRatelimitResponseCollection rateLimitsForAZoneListRateLimits(zoneIdentifier, page, perPage)

List rate limits

Fetches the rate limits for a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RateLimitsForAZoneApi;

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

    RateLimitsForAZoneApi apiInstance = new RateLimitsForAZoneApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    try {
      FirewallRatelimitResponseCollection result = apiInstance.rateLimitsForAZoneListRateLimits(zoneIdentifier, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RateLimitsForAZoneApi#rateLimitsForAZoneListRateLimits");
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
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |

### Return type

[**FirewallRatelimitResponseCollection**](FirewallRatelimitResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List rate limits response |  -  |
| **4XX** | List rate limits response failure |  -  |

<a id="rateLimitsForAZoneUpdateARateLimit"></a>
# **rateLimitsForAZoneUpdateARateLimit**
> FirewallRatelimitResponseSingle rateLimitsForAZoneUpdateARateLimit(id, zoneIdentifier, body)

Update a rate limit

Updates an existing rate limit.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RateLimitsForAZoneApi;

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

    RateLimitsForAZoneApi apiInstance = new RateLimitsForAZoneApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Object body = null; // Object | 
    try {
      FirewallRatelimitResponseSingle result = apiInstance.rateLimitsForAZoneUpdateARateLimit(id, zoneIdentifier, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RateLimitsForAZoneApi#rateLimitsForAZoneUpdateARateLimit");
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

[**FirewallRatelimitResponseSingle**](FirewallRatelimitResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a rate limit response |  -  |
| **4XX** | Update a rate limit response failure |  -  |

