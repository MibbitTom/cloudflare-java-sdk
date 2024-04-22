# FirewallRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**firewallRulesCreateFirewallRules**](FirewallRulesApi.md#firewallRulesCreateFirewallRules) | **POST** /zones/{zone_identifier}/firewall/rules | Create firewall rules |
| [**firewallRulesDeleteAFirewallRule**](FirewallRulesApi.md#firewallRulesDeleteAFirewallRule) | **DELETE** /zones/{zone_identifier}/firewall/rules/{id} | Delete a firewall rule |
| [**firewallRulesDeleteFirewallRules**](FirewallRulesApi.md#firewallRulesDeleteFirewallRules) | **DELETE** /zones/{zone_identifier}/firewall/rules | Delete firewall rules |
| [**firewallRulesGetAFirewallRule**](FirewallRulesApi.md#firewallRulesGetAFirewallRule) | **GET** /zones/{zone_identifier}/firewall/rules/{id} | Get a firewall rule |
| [**firewallRulesListFirewallRules**](FirewallRulesApi.md#firewallRulesListFirewallRules) | **GET** /zones/{zone_identifier}/firewall/rules | List firewall rules |
| [**firewallRulesUpdateAFirewallRule**](FirewallRulesApi.md#firewallRulesUpdateAFirewallRule) | **PUT** /zones/{zone_identifier}/firewall/rules/{id} | Update a firewall rule |
| [**firewallRulesUpdateFirewallRules**](FirewallRulesApi.md#firewallRulesUpdateFirewallRules) | **PUT** /zones/{zone_identifier}/firewall/rules | Update firewall rules |
| [**firewallRulesUpdatePriorityOfAFirewallRule**](FirewallRulesApi.md#firewallRulesUpdatePriorityOfAFirewallRule) | **PATCH** /zones/{zone_identifier}/firewall/rules/{id} | Update priority of a firewall rule |
| [**firewallRulesUpdatePriorityOfFirewallRules**](FirewallRulesApi.md#firewallRulesUpdatePriorityOfFirewallRules) | **PATCH** /zones/{zone_identifier}/firewall/rules | Update priority of firewall rules |


<a id="firewallRulesCreateFirewallRules"></a>
# **firewallRulesCreateFirewallRules**
> FirewallFilterRulesResponseCollection firewallRulesCreateFirewallRules(zoneIdentifier, body)

Create firewall rules

Create one or more firewall rules.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.FirewallRulesApi;

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

    FirewallRulesApi apiInstance = new FirewallRulesApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Object body = null; // Object | 
    try {
      FirewallFilterRulesResponseCollection result = apiInstance.firewallRulesCreateFirewallRules(zoneIdentifier, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirewallRulesApi#firewallRulesCreateFirewallRules");
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

[**FirewallFilterRulesResponseCollection**](FirewallFilterRulesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create firewall rules response |  -  |
| **4XX** | Create firewall rules response failure |  -  |

<a id="firewallRulesDeleteAFirewallRule"></a>
# **firewallRulesDeleteAFirewallRule**
> FirewallFilterRulesSingleResponseDelete firewallRulesDeleteAFirewallRule(id, zoneIdentifier, firewallRulesDeleteAFirewallRuleRequest)

Delete a firewall rule

Deletes an existing firewall rule.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.FirewallRulesApi;

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

    FirewallRulesApi apiInstance = new FirewallRulesApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    FirewallRulesDeleteAFirewallRuleRequest firewallRulesDeleteAFirewallRuleRequest = new FirewallRulesDeleteAFirewallRuleRequest(); // FirewallRulesDeleteAFirewallRuleRequest | 
    try {
      FirewallFilterRulesSingleResponseDelete result = apiInstance.firewallRulesDeleteAFirewallRule(id, zoneIdentifier, firewallRulesDeleteAFirewallRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirewallRulesApi#firewallRulesDeleteAFirewallRule");
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
| **firewallRulesDeleteAFirewallRuleRequest** | [**FirewallRulesDeleteAFirewallRuleRequest**](FirewallRulesDeleteAFirewallRuleRequest.md)|  | |

### Return type

[**FirewallFilterRulesSingleResponseDelete**](FirewallFilterRulesSingleResponseDelete.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a firewall rule response |  -  |
| **4XX** | Delete a firewall rule response failure |  -  |

<a id="firewallRulesDeleteFirewallRules"></a>
# **firewallRulesDeleteFirewallRules**
> FirewallFilterRulesResponseCollectionDelete firewallRulesDeleteFirewallRules(zoneIdentifier, firewallRulesDeleteFirewallRulesRequest)

Delete firewall rules

Deletes existing firewall rules.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.FirewallRulesApi;

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

    FirewallRulesApi apiInstance = new FirewallRulesApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    FirewallRulesDeleteFirewallRulesRequest firewallRulesDeleteFirewallRulesRequest = new FirewallRulesDeleteFirewallRulesRequest(); // FirewallRulesDeleteFirewallRulesRequest | 
    try {
      FirewallFilterRulesResponseCollectionDelete result = apiInstance.firewallRulesDeleteFirewallRules(zoneIdentifier, firewallRulesDeleteFirewallRulesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirewallRulesApi#firewallRulesDeleteFirewallRules");
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
| **firewallRulesDeleteFirewallRulesRequest** | [**FirewallRulesDeleteFirewallRulesRequest**](FirewallRulesDeleteFirewallRulesRequest.md)|  | |

### Return type

[**FirewallFilterRulesResponseCollectionDelete**](FirewallFilterRulesResponseCollectionDelete.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete firewall rules response |  -  |
| **4XX** | Delete firewall rules response failure |  -  |

<a id="firewallRulesGetAFirewallRule"></a>
# **firewallRulesGetAFirewallRule**
> FirewallFilterRulesSingleResponse firewallRulesGetAFirewallRule(id, zoneIdentifier, id2)

Get a firewall rule

Fetches the details of a firewall rule.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.FirewallRulesApi;

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

    FirewallRulesApi apiInstance = new FirewallRulesApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    String id2 = "id_example"; // String | 
    try {
      FirewallFilterRulesSingleResponse result = apiInstance.firewallRulesGetAFirewallRule(id, zoneIdentifier, id2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirewallRulesApi#firewallRulesGetAFirewallRule");
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
| **id2** | **String**|  | [optional] |

### Return type

[**FirewallFilterRulesSingleResponse**](FirewallFilterRulesSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a firewall rule response |  -  |
| **4XX** | Get a firewall rule response failure |  -  |

<a id="firewallRulesListFirewallRules"></a>
# **firewallRulesListFirewallRules**
> FirewallFilterRulesResponseCollection firewallRulesListFirewallRules(zoneIdentifier, description, action, page, perPage, id, paused)

List firewall rules

Fetches firewall rules in a zone. You can filter the results using several optional parameters.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.FirewallRulesApi;

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

    FirewallRulesApi apiInstance = new FirewallRulesApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    String description = "mir"; // String | 
    String action = "block"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("25"); // BigDecimal | 
    String id = "372e67954025e0ba6aaa6d586b9e0b60"; // String | 
    Boolean paused = false; // Boolean | 
    try {
      FirewallFilterRulesResponseCollection result = apiInstance.firewallRulesListFirewallRules(zoneIdentifier, description, action, page, perPage, id, paused);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirewallRulesApi#firewallRulesListFirewallRules");
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
| **description** | **String**|  | [optional] |
| **action** | **String**|  | [optional] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 25] |
| **id** | **String**|  | [optional] |
| **paused** | **Boolean**|  | [optional] |

### Return type

[**FirewallFilterRulesResponseCollection**](FirewallFilterRulesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List firewall rules response |  -  |
| **4XX** | List firewall rules response failure |  -  |

<a id="firewallRulesUpdateAFirewallRule"></a>
# **firewallRulesUpdateAFirewallRule**
> FirewallFilterRulesSingleResponse firewallRulesUpdateAFirewallRule(id, zoneIdentifier, body)

Update a firewall rule

Updates an existing firewall rule.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.FirewallRulesApi;

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

    FirewallRulesApi apiInstance = new FirewallRulesApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Object body = null; // Object | 
    try {
      FirewallFilterRulesSingleResponse result = apiInstance.firewallRulesUpdateAFirewallRule(id, zoneIdentifier, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirewallRulesApi#firewallRulesUpdateAFirewallRule");
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

[**FirewallFilterRulesSingleResponse**](FirewallFilterRulesSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a firewall rule response |  -  |
| **4XX** | Update a firewall rule response failure |  -  |

<a id="firewallRulesUpdateFirewallRules"></a>
# **firewallRulesUpdateFirewallRules**
> FirewallFilterRulesResponseCollection firewallRulesUpdateFirewallRules(zoneIdentifier, body)

Update firewall rules

Updates one or more existing firewall rules.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.FirewallRulesApi;

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

    FirewallRulesApi apiInstance = new FirewallRulesApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Object body = null; // Object | 
    try {
      FirewallFilterRulesResponseCollection result = apiInstance.firewallRulesUpdateFirewallRules(zoneIdentifier, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirewallRulesApi#firewallRulesUpdateFirewallRules");
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

[**FirewallFilterRulesResponseCollection**](FirewallFilterRulesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update firewall rules response |  -  |
| **4XX** | Update firewall rules response failure |  -  |

<a id="firewallRulesUpdatePriorityOfAFirewallRule"></a>
# **firewallRulesUpdatePriorityOfAFirewallRule**
> FirewallFilterRulesResponseCollection firewallRulesUpdatePriorityOfAFirewallRule(id, zoneIdentifier, body)

Update priority of a firewall rule

Updates the priority of an existing firewall rule.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.FirewallRulesApi;

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

    FirewallRulesApi apiInstance = new FirewallRulesApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Object body = null; // Object | 
    try {
      FirewallFilterRulesResponseCollection result = apiInstance.firewallRulesUpdatePriorityOfAFirewallRule(id, zoneIdentifier, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirewallRulesApi#firewallRulesUpdatePriorityOfAFirewallRule");
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

[**FirewallFilterRulesResponseCollection**](FirewallFilterRulesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update priority of a firewall rule response |  -  |
| **4XX** | Update priority of a firewall rule response failure |  -  |

<a id="firewallRulesUpdatePriorityOfFirewallRules"></a>
# **firewallRulesUpdatePriorityOfFirewallRules**
> FirewallFilterRulesResponseCollection firewallRulesUpdatePriorityOfFirewallRules(zoneIdentifier, body)

Update priority of firewall rules

Updates the priority of existing firewall rules.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.FirewallRulesApi;

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

    FirewallRulesApi apiInstance = new FirewallRulesApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Object body = null; // Object | 
    try {
      FirewallFilterRulesResponseCollection result = apiInstance.firewallRulesUpdatePriorityOfFirewallRules(zoneIdentifier, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirewallRulesApi#firewallRulesUpdatePriorityOfFirewallRules");
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

[**FirewallFilterRulesResponseCollection**](FirewallFilterRulesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update priority of firewall rules response |  -  |
| **4XX** | Update priority of firewall rules response failure |  -  |

