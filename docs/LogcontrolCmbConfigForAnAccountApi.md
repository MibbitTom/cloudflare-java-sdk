# LogcontrolCmbConfigForAnAccountApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAccountsAccountIdentifierLogsControlCmbConfig**](LogcontrolCmbConfigForAnAccountApi.md#deleteAccountsAccountIdentifierLogsControlCmbConfig) | **DELETE** /accounts/{account_id}/logs/control/cmb/config | Delete CMB config |
| [**getAccountsAccountIdentifierLogsControlCmbConfig**](LogcontrolCmbConfigForAnAccountApi.md#getAccountsAccountIdentifierLogsControlCmbConfig) | **GET** /accounts/{account_id}/logs/control/cmb/config | Get CMB config |
| [**putAccountsAccountIdentifierLogsControlCmbConfig**](LogcontrolCmbConfigForAnAccountApi.md#putAccountsAccountIdentifierLogsControlCmbConfig) | **POST** /accounts/{account_id}/logs/control/cmb/config | Update CMB config |


<a id="deleteAccountsAccountIdentifierLogsControlCmbConfig"></a>
# **deleteAccountsAccountIdentifierLogsControlCmbConfig**
> DeleteAccountsAccountIdentifierLogsControlCmbConfig200Response deleteAccountsAccountIdentifierLogsControlCmbConfig(accountId)

Delete CMB config

Deletes CMB config.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogcontrolCmbConfigForAnAccountApi;

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

    LogcontrolCmbConfigForAnAccountApi apiInstance = new LogcontrolCmbConfigForAnAccountApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      DeleteAccountsAccountIdentifierLogsControlCmbConfig200Response result = apiInstance.deleteAccountsAccountIdentifierLogsControlCmbConfig(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogcontrolCmbConfigForAnAccountApi#deleteAccountsAccountIdentifierLogsControlCmbConfig");
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

[**DeleteAccountsAccountIdentifierLogsControlCmbConfig200Response**](DeleteAccountsAccountIdentifierLogsControlCmbConfig200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete CMB config response |  -  |
| **4XX** | Delete CMB config response failure |  -  |

<a id="getAccountsAccountIdentifierLogsControlCmbConfig"></a>
# **getAccountsAccountIdentifierLogsControlCmbConfig**
> LogcontrolCmbConfigResponseSingle getAccountsAccountIdentifierLogsControlCmbConfig(accountId)

Get CMB config

Gets CMB config.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogcontrolCmbConfigForAnAccountApi;

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

    LogcontrolCmbConfigForAnAccountApi apiInstance = new LogcontrolCmbConfigForAnAccountApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      LogcontrolCmbConfigResponseSingle result = apiInstance.getAccountsAccountIdentifierLogsControlCmbConfig(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogcontrolCmbConfigForAnAccountApi#getAccountsAccountIdentifierLogsControlCmbConfig");
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

[**LogcontrolCmbConfigResponseSingle**](LogcontrolCmbConfigResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get CMB config response |  -  |
| **4XX** | Get CMB config response failure |  -  |

<a id="putAccountsAccountIdentifierLogsControlCmbConfig"></a>
# **putAccountsAccountIdentifierLogsControlCmbConfig**
> LogcontrolCmbConfigResponseSingle putAccountsAccountIdentifierLogsControlCmbConfig(accountId, logcontrolCmbConfig)

Update CMB config

Updates CMB config.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogcontrolCmbConfigForAnAccountApi;

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

    LogcontrolCmbConfigForAnAccountApi apiInstance = new LogcontrolCmbConfigForAnAccountApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    LogcontrolCmbConfig logcontrolCmbConfig = new LogcontrolCmbConfig(); // LogcontrolCmbConfig | 
    try {
      LogcontrolCmbConfigResponseSingle result = apiInstance.putAccountsAccountIdentifierLogsControlCmbConfig(accountId, logcontrolCmbConfig);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogcontrolCmbConfigForAnAccountApi#putAccountsAccountIdentifierLogsControlCmbConfig");
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
| **logcontrolCmbConfig** | [**LogcontrolCmbConfig**](LogcontrolCmbConfig.md)|  | |

### Return type

[**LogcontrolCmbConfigResponseSingle**](LogcontrolCmbConfigResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update CMB config response |  -  |
| **4XX** | Update CMB config response failure |  -  |

