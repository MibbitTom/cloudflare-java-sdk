# MagicNetworkMonitoringConfigurationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**magicNetworkMonitoringConfigurationCreateAccountConfiguration**](MagicNetworkMonitoringConfigurationApi.md#magicNetworkMonitoringConfigurationCreateAccountConfiguration) | **POST** /accounts/{account_id}/mnm/config | Create account configuration |
| [**magicNetworkMonitoringConfigurationDeleteAccountConfiguration**](MagicNetworkMonitoringConfigurationApi.md#magicNetworkMonitoringConfigurationDeleteAccountConfiguration) | **DELETE** /accounts/{account_id}/mnm/config | Delete account configuration |
| [**magicNetworkMonitoringConfigurationListAccountConfiguration**](MagicNetworkMonitoringConfigurationApi.md#magicNetworkMonitoringConfigurationListAccountConfiguration) | **GET** /accounts/{account_id}/mnm/config | List account configuration |
| [**magicNetworkMonitoringConfigurationListRulesAndAccountConfiguration**](MagicNetworkMonitoringConfigurationApi.md#magicNetworkMonitoringConfigurationListRulesAndAccountConfiguration) | **GET** /accounts/{account_id}/mnm/config/full | List rules and account configuration |
| [**magicNetworkMonitoringConfigurationUpdateAccountConfigurationFields**](MagicNetworkMonitoringConfigurationApi.md#magicNetworkMonitoringConfigurationUpdateAccountConfigurationFields) | **PATCH** /accounts/{account_id}/mnm/config | Update account configuration fields |
| [**magicNetworkMonitoringConfigurationUpdateAnEntireAccountConfiguration**](MagicNetworkMonitoringConfigurationApi.md#magicNetworkMonitoringConfigurationUpdateAnEntireAccountConfiguration) | **PUT** /accounts/{account_id}/mnm/config | Update an entire account configuration |


<a id="magicNetworkMonitoringConfigurationCreateAccountConfiguration"></a>
# **magicNetworkMonitoringConfigurationCreateAccountConfiguration**
> MagicVisibilityMnmConfigSingleResponse magicNetworkMonitoringConfigurationCreateAccountConfiguration(accountId)

Create account configuration

Create a new network monitoring configuration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicNetworkMonitoringConfigurationApi;

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

    MagicNetworkMonitoringConfigurationApi apiInstance = new MagicNetworkMonitoringConfigurationApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      MagicVisibilityMnmConfigSingleResponse result = apiInstance.magicNetworkMonitoringConfigurationCreateAccountConfiguration(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicNetworkMonitoringConfigurationApi#magicNetworkMonitoringConfigurationCreateAccountConfiguration");
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

[**MagicVisibilityMnmConfigSingleResponse**](MagicVisibilityMnmConfigSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create account configuration response |  -  |
| **4XX** | Create account configuration response failure |  -  |

<a id="magicNetworkMonitoringConfigurationDeleteAccountConfiguration"></a>
# **magicNetworkMonitoringConfigurationDeleteAccountConfiguration**
> MagicVisibilityMnmConfigSingleResponse magicNetworkMonitoringConfigurationDeleteAccountConfiguration(accountId)

Delete account configuration

Delete an existing network monitoring configuration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicNetworkMonitoringConfigurationApi;

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

    MagicNetworkMonitoringConfigurationApi apiInstance = new MagicNetworkMonitoringConfigurationApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      MagicVisibilityMnmConfigSingleResponse result = apiInstance.magicNetworkMonitoringConfigurationDeleteAccountConfiguration(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicNetworkMonitoringConfigurationApi#magicNetworkMonitoringConfigurationDeleteAccountConfiguration");
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

[**MagicVisibilityMnmConfigSingleResponse**](MagicVisibilityMnmConfigSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete account configuration response |  -  |
| **4XX** | Delete account configuration response failure |  -  |

<a id="magicNetworkMonitoringConfigurationListAccountConfiguration"></a>
# **magicNetworkMonitoringConfigurationListAccountConfiguration**
> MagicVisibilityMnmConfigSingleResponse magicNetworkMonitoringConfigurationListAccountConfiguration(accountId)

List account configuration

Lists default sampling and router IPs for account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicNetworkMonitoringConfigurationApi;

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

    MagicNetworkMonitoringConfigurationApi apiInstance = new MagicNetworkMonitoringConfigurationApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      MagicVisibilityMnmConfigSingleResponse result = apiInstance.magicNetworkMonitoringConfigurationListAccountConfiguration(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicNetworkMonitoringConfigurationApi#magicNetworkMonitoringConfigurationListAccountConfiguration");
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

[**MagicVisibilityMnmConfigSingleResponse**](MagicVisibilityMnmConfigSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List account configuration response |  -  |
| **4XX** | List account configuration response failure |  -  |

<a id="magicNetworkMonitoringConfigurationListRulesAndAccountConfiguration"></a>
# **magicNetworkMonitoringConfigurationListRulesAndAccountConfiguration**
> MagicVisibilityMnmConfigSingleResponse magicNetworkMonitoringConfigurationListRulesAndAccountConfiguration(accountId)

List rules and account configuration

Lists default sampling, router IPs, and rules for account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicNetworkMonitoringConfigurationApi;

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

    MagicNetworkMonitoringConfigurationApi apiInstance = new MagicNetworkMonitoringConfigurationApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      MagicVisibilityMnmConfigSingleResponse result = apiInstance.magicNetworkMonitoringConfigurationListRulesAndAccountConfiguration(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicNetworkMonitoringConfigurationApi#magicNetworkMonitoringConfigurationListRulesAndAccountConfiguration");
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

[**MagicVisibilityMnmConfigSingleResponse**](MagicVisibilityMnmConfigSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List rules and account configuration response |  -  |
| **4XX** | List rules and account configuration response failure |  -  |

<a id="magicNetworkMonitoringConfigurationUpdateAccountConfigurationFields"></a>
# **magicNetworkMonitoringConfigurationUpdateAccountConfigurationFields**
> MagicVisibilityMnmConfigSingleResponse magicNetworkMonitoringConfigurationUpdateAccountConfigurationFields(accountId)

Update account configuration fields

Update fields in an existing network monitoring configuration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicNetworkMonitoringConfigurationApi;

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

    MagicNetworkMonitoringConfigurationApi apiInstance = new MagicNetworkMonitoringConfigurationApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      MagicVisibilityMnmConfigSingleResponse result = apiInstance.magicNetworkMonitoringConfigurationUpdateAccountConfigurationFields(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicNetworkMonitoringConfigurationApi#magicNetworkMonitoringConfigurationUpdateAccountConfigurationFields");
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

[**MagicVisibilityMnmConfigSingleResponse**](MagicVisibilityMnmConfigSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update account configuration fields response |  -  |
| **4XX** | Update account configuration fields response failure |  -  |

<a id="magicNetworkMonitoringConfigurationUpdateAnEntireAccountConfiguration"></a>
# **magicNetworkMonitoringConfigurationUpdateAnEntireAccountConfiguration**
> MagicVisibilityMnmConfigSingleResponse magicNetworkMonitoringConfigurationUpdateAnEntireAccountConfiguration(accountId)

Update an entire account configuration

Update an existing network monitoring configuration, requires the entire configuration to be updated at once.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicNetworkMonitoringConfigurationApi;

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

    MagicNetworkMonitoringConfigurationApi apiInstance = new MagicNetworkMonitoringConfigurationApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      MagicVisibilityMnmConfigSingleResponse result = apiInstance.magicNetworkMonitoringConfigurationUpdateAnEntireAccountConfiguration(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicNetworkMonitoringConfigurationApi#magicNetworkMonitoringConfigurationUpdateAnEntireAccountConfiguration");
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

[**MagicVisibilityMnmConfigSingleResponse**](MagicVisibilityMnmConfigSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update an entire account configuration response |  -  |
| **4XX** | Update an entire account configuration response failure |  -  |

