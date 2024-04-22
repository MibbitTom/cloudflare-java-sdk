# UserAgentBlockingRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userAgentBlockingRulesCreateAUserAgentBlockingRule**](UserAgentBlockingRulesApi.md#userAgentBlockingRulesCreateAUserAgentBlockingRule) | **POST** /zones/{zone_identifier}/firewall/ua_rules | Create a User Agent Blocking rule |
| [**userAgentBlockingRulesDeleteAUserAgentBlockingRule**](UserAgentBlockingRulesApi.md#userAgentBlockingRulesDeleteAUserAgentBlockingRule) | **DELETE** /zones/{zone_identifier}/firewall/ua_rules/{id} | Delete a User Agent Blocking rule |
| [**userAgentBlockingRulesGetAUserAgentBlockingRule**](UserAgentBlockingRulesApi.md#userAgentBlockingRulesGetAUserAgentBlockingRule) | **GET** /zones/{zone_identifier}/firewall/ua_rules/{id} | Get a User Agent Blocking rule |
| [**userAgentBlockingRulesListUserAgentBlockingRules**](UserAgentBlockingRulesApi.md#userAgentBlockingRulesListUserAgentBlockingRules) | **GET** /zones/{zone_identifier}/firewall/ua_rules | List User Agent Blocking rules |
| [**userAgentBlockingRulesUpdateAUserAgentBlockingRule**](UserAgentBlockingRulesApi.md#userAgentBlockingRulesUpdateAUserAgentBlockingRule) | **PUT** /zones/{zone_identifier}/firewall/ua_rules/{id} | Update a User Agent Blocking rule |


<a id="userAgentBlockingRulesCreateAUserAgentBlockingRule"></a>
# **userAgentBlockingRulesCreateAUserAgentBlockingRule**
> FirewallFirewalluablockResponseSingle userAgentBlockingRulesCreateAUserAgentBlockingRule(zoneIdentifier, body)

Create a User Agent Blocking rule

Creates a new User Agent Blocking rule in a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserAgentBlockingRulesApi;

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

    UserAgentBlockingRulesApi apiInstance = new UserAgentBlockingRulesApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Object body = null; // Object | 
    try {
      FirewallFirewalluablockResponseSingle result = apiInstance.userAgentBlockingRulesCreateAUserAgentBlockingRule(zoneIdentifier, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAgentBlockingRulesApi#userAgentBlockingRulesCreateAUserAgentBlockingRule");
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

[**FirewallFirewalluablockResponseSingle**](FirewallFirewalluablockResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a User Agent Blocking rule response |  -  |
| **4XX** | Create a User Agent Blocking rule response failure |  -  |

<a id="userAgentBlockingRulesDeleteAUserAgentBlockingRule"></a>
# **userAgentBlockingRulesDeleteAUserAgentBlockingRule**
> UserAgentBlockingRulesDeleteAUserAgentBlockingRule200Response userAgentBlockingRulesDeleteAUserAgentBlockingRule(id, zoneIdentifier)

Delete a User Agent Blocking rule

Deletes an existing User Agent Blocking rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserAgentBlockingRulesApi;

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

    UserAgentBlockingRulesApi apiInstance = new UserAgentBlockingRulesApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      UserAgentBlockingRulesDeleteAUserAgentBlockingRule200Response result = apiInstance.userAgentBlockingRulesDeleteAUserAgentBlockingRule(id, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAgentBlockingRulesApi#userAgentBlockingRulesDeleteAUserAgentBlockingRule");
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

[**UserAgentBlockingRulesDeleteAUserAgentBlockingRule200Response**](UserAgentBlockingRulesDeleteAUserAgentBlockingRule200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a User Agent Blocking rule response |  -  |
| **4XX** | Delete a User Agent Blocking rule response failure |  -  |

<a id="userAgentBlockingRulesGetAUserAgentBlockingRule"></a>
# **userAgentBlockingRulesGetAUserAgentBlockingRule**
> FirewallFirewalluablockResponseSingle userAgentBlockingRulesGetAUserAgentBlockingRule(id, zoneIdentifier)

Get a User Agent Blocking rule

Fetches the details of a User Agent Blocking rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserAgentBlockingRulesApi;

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

    UserAgentBlockingRulesApi apiInstance = new UserAgentBlockingRulesApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      FirewallFirewalluablockResponseSingle result = apiInstance.userAgentBlockingRulesGetAUserAgentBlockingRule(id, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAgentBlockingRulesApi#userAgentBlockingRulesGetAUserAgentBlockingRule");
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

[**FirewallFirewalluablockResponseSingle**](FirewallFirewalluablockResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a User Agent Blocking rule response |  -  |
| **4XX** | Get a User Agent Blocking rule response failure |  -  |

<a id="userAgentBlockingRulesListUserAgentBlockingRules"></a>
# **userAgentBlockingRulesListUserAgentBlockingRules**
> FirewallFirewalluablockResponseCollection userAgentBlockingRulesListUserAgentBlockingRules(zoneIdentifier, page, description, descriptionSearch, perPage, uaSearch)

List User Agent Blocking rules

Fetches User Agent Blocking rules in a zone. You can filter the results using several optional parameters.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserAgentBlockingRulesApi;

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

    UserAgentBlockingRulesApi apiInstance = new UserAgentBlockingRulesApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    String description = "description_example"; // String | 
    String descriptionSearch = "descriptionSearch_example"; // String | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    String uaSearch = "Safari"; // String | 
    try {
      FirewallFirewalluablockResponseCollection result = apiInstance.userAgentBlockingRulesListUserAgentBlockingRules(zoneIdentifier, page, description, descriptionSearch, perPage, uaSearch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAgentBlockingRulesApi#userAgentBlockingRulesListUserAgentBlockingRules");
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
| **description** | **String**|  | [optional] |
| **descriptionSearch** | **String**|  | [optional] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |
| **uaSearch** | **String**|  | [optional] |

### Return type

[**FirewallFirewalluablockResponseCollection**](FirewallFirewalluablockResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List User Agent Blocking rules response |  -  |
| **4XX** | List User Agent Blocking rules response failure |  -  |

<a id="userAgentBlockingRulesUpdateAUserAgentBlockingRule"></a>
# **userAgentBlockingRulesUpdateAUserAgentBlockingRule**
> FirewallFirewalluablockResponseSingle userAgentBlockingRulesUpdateAUserAgentBlockingRule(id, zoneIdentifier, body)

Update a User Agent Blocking rule

Updates an existing User Agent Blocking rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserAgentBlockingRulesApi;

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

    UserAgentBlockingRulesApi apiInstance = new UserAgentBlockingRulesApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Object body = null; // Object | 
    try {
      FirewallFirewalluablockResponseSingle result = apiInstance.userAgentBlockingRulesUpdateAUserAgentBlockingRule(id, zoneIdentifier, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAgentBlockingRulesApi#userAgentBlockingRulesUpdateAUserAgentBlockingRule");
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

[**FirewallFirewalluablockResponseSingle**](FirewallFirewalluablockResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a User Agent Blocking rule response |  -  |
| **4XX** | Update a User Agent Blocking rule response failure |  -  |

