# MagicNetworkMonitoringRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**magicNetworkMonitoringRulesCreateRules**](MagicNetworkMonitoringRulesApi.md#magicNetworkMonitoringRulesCreateRules) | **POST** /accounts/{account_id}/mnm/rules | Create rules |
| [**magicNetworkMonitoringRulesDeleteRule**](MagicNetworkMonitoringRulesApi.md#magicNetworkMonitoringRulesDeleteRule) | **DELETE** /accounts/{account_id}/mnm/rules/{rule_id} | Delete rule |
| [**magicNetworkMonitoringRulesGetRule**](MagicNetworkMonitoringRulesApi.md#magicNetworkMonitoringRulesGetRule) | **GET** /accounts/{account_id}/mnm/rules/{rule_id} | Get rule |
| [**magicNetworkMonitoringRulesListRules**](MagicNetworkMonitoringRulesApi.md#magicNetworkMonitoringRulesListRules) | **GET** /accounts/{account_id}/mnm/rules | List rules |
| [**magicNetworkMonitoringRulesUpdateAdvertisementForRule**](MagicNetworkMonitoringRulesApi.md#magicNetworkMonitoringRulesUpdateAdvertisementForRule) | **PATCH** /accounts/{account_id}/mnm/rules/{rule_id}/advertisement | Update advertisement for rule |
| [**magicNetworkMonitoringRulesUpdateRule**](MagicNetworkMonitoringRulesApi.md#magicNetworkMonitoringRulesUpdateRule) | **PATCH** /accounts/{account_id}/mnm/rules/{rule_id} | Update rule |
| [**magicNetworkMonitoringRulesUpdateRules**](MagicNetworkMonitoringRulesApi.md#magicNetworkMonitoringRulesUpdateRules) | **PUT** /accounts/{account_id}/mnm/rules | Update rules |


<a id="magicNetworkMonitoringRulesCreateRules"></a>
# **magicNetworkMonitoringRulesCreateRules**
> MagicVisibilityMnmRulesSingleResponse magicNetworkMonitoringRulesCreateRules(accountId)

Create rules

Create network monitoring rules for account. Currently only supports creating a single rule per API request.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicNetworkMonitoringRulesApi;

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

    MagicNetworkMonitoringRulesApi apiInstance = new MagicNetworkMonitoringRulesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      MagicVisibilityMnmRulesSingleResponse result = apiInstance.magicNetworkMonitoringRulesCreateRules(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicNetworkMonitoringRulesApi#magicNetworkMonitoringRulesCreateRules");
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
| **accountId** | **String**|  | |

### Return type

[**MagicVisibilityMnmRulesSingleResponse**](MagicVisibilityMnmRulesSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create rules response |  -  |
| **4XX** | Create rules response failure |  -  |

<a id="magicNetworkMonitoringRulesDeleteRule"></a>
# **magicNetworkMonitoringRulesDeleteRule**
> MagicVisibilityMnmRulesSingleResponse magicNetworkMonitoringRulesDeleteRule(ruleId, accountId)

Delete rule

Delete a network monitoring rule for account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicNetworkMonitoringRulesApi;

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

    MagicNetworkMonitoringRulesApi apiInstance = new MagicNetworkMonitoringRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      MagicVisibilityMnmRulesSingleResponse result = apiInstance.magicNetworkMonitoringRulesDeleteRule(ruleId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicNetworkMonitoringRulesApi#magicNetworkMonitoringRulesDeleteRule");
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
| **ruleId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**MagicVisibilityMnmRulesSingleResponse**](MagicVisibilityMnmRulesSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete rule response |  -  |
| **4XX** | Delete rule response failure |  -  |

<a id="magicNetworkMonitoringRulesGetRule"></a>
# **magicNetworkMonitoringRulesGetRule**
> MagicVisibilityMnmRulesSingleResponse magicNetworkMonitoringRulesGetRule(ruleId, accountId)

Get rule

List a single network monitoring rule for account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicNetworkMonitoringRulesApi;

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

    MagicNetworkMonitoringRulesApi apiInstance = new MagicNetworkMonitoringRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      MagicVisibilityMnmRulesSingleResponse result = apiInstance.magicNetworkMonitoringRulesGetRule(ruleId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicNetworkMonitoringRulesApi#magicNetworkMonitoringRulesGetRule");
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
| **ruleId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**MagicVisibilityMnmRulesSingleResponse**](MagicVisibilityMnmRulesSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get rule response |  -  |
| **4XX** | Get rule response failure |  -  |

<a id="magicNetworkMonitoringRulesListRules"></a>
# **magicNetworkMonitoringRulesListRules**
> MagicVisibilityMnmRulesCollectionResponse magicNetworkMonitoringRulesListRules(accountId)

List rules

Lists network monitoring rules for account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicNetworkMonitoringRulesApi;

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

    MagicNetworkMonitoringRulesApi apiInstance = new MagicNetworkMonitoringRulesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      MagicVisibilityMnmRulesCollectionResponse result = apiInstance.magicNetworkMonitoringRulesListRules(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicNetworkMonitoringRulesApi#magicNetworkMonitoringRulesListRules");
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
| **accountId** | **String**|  | |

### Return type

[**MagicVisibilityMnmRulesCollectionResponse**](MagicVisibilityMnmRulesCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List rules response |  -  |
| **4XX** | List rules response failure |  -  |

<a id="magicNetworkMonitoringRulesUpdateAdvertisementForRule"></a>
# **magicNetworkMonitoringRulesUpdateAdvertisementForRule**
> MagicVisibilityMnmRuleAdvertisementSingleResponse magicNetworkMonitoringRulesUpdateAdvertisementForRule(ruleId, accountId)

Update advertisement for rule

Update advertisement for rule.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicNetworkMonitoringRulesApi;

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

    MagicNetworkMonitoringRulesApi apiInstance = new MagicNetworkMonitoringRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      MagicVisibilityMnmRuleAdvertisementSingleResponse result = apiInstance.magicNetworkMonitoringRulesUpdateAdvertisementForRule(ruleId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicNetworkMonitoringRulesApi#magicNetworkMonitoringRulesUpdateAdvertisementForRule");
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
| **ruleId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**MagicVisibilityMnmRuleAdvertisementSingleResponse**](MagicVisibilityMnmRuleAdvertisementSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update advertisement for rule response |  -  |
| **4XX** | Update advertisement for rule response failure |  -  |

<a id="magicNetworkMonitoringRulesUpdateRule"></a>
# **magicNetworkMonitoringRulesUpdateRule**
> MagicVisibilityMnmRulesSingleResponse magicNetworkMonitoringRulesUpdateRule(ruleId, accountId)

Update rule

Update a network monitoring rule for account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicNetworkMonitoringRulesApi;

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

    MagicNetworkMonitoringRulesApi apiInstance = new MagicNetworkMonitoringRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      MagicVisibilityMnmRulesSingleResponse result = apiInstance.magicNetworkMonitoringRulesUpdateRule(ruleId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicNetworkMonitoringRulesApi#magicNetworkMonitoringRulesUpdateRule");
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
| **ruleId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**MagicVisibilityMnmRulesSingleResponse**](MagicVisibilityMnmRulesSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update rule response |  -  |
| **4XX** | Update rule response failure |  -  |

<a id="magicNetworkMonitoringRulesUpdateRules"></a>
# **magicNetworkMonitoringRulesUpdateRules**
> MagicVisibilityMnmRulesSingleResponse magicNetworkMonitoringRulesUpdateRules(accountId)

Update rules

Update network monitoring rules for account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicNetworkMonitoringRulesApi;

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

    MagicNetworkMonitoringRulesApi apiInstance = new MagicNetworkMonitoringRulesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      MagicVisibilityMnmRulesSingleResponse result = apiInstance.magicNetworkMonitoringRulesUpdateRules(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicNetworkMonitoringRulesApi#magicNetworkMonitoringRulesUpdateRules");
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
| **accountId** | **String**|  | |

### Return type

[**MagicVisibilityMnmRulesSingleResponse**](MagicVisibilityMnmRulesSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update rules response |  -  |
| **4XX** | Update rules response failure |  -  |

