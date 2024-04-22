# ZeroTrustConnectivitySettingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zeroTrustAccountsGetConnectivitySettings**](ZeroTrustConnectivitySettingsApi.md#zeroTrustAccountsGetConnectivitySettings) | **GET** /accounts/{account_id}/zerotrust/connectivity_settings | Get Zero Trust Connectivity Settings |
| [**zeroTrustAccountsPatchConnectivitySettings**](ZeroTrustConnectivitySettingsApi.md#zeroTrustAccountsPatchConnectivitySettings) | **PATCH** /accounts/{account_id}/zerotrust/connectivity_settings | Updates the Zero Trust Connectivity Settings |


<a id="zeroTrustAccountsGetConnectivitySettings"></a>
# **zeroTrustAccountsGetConnectivitySettings**
> TunnelZeroTrustConnectivitySettingsResponse zeroTrustAccountsGetConnectivitySettings(accountId)

Get Zero Trust Connectivity Settings

Gets the Zero Trust Connectivity Settings for the given account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustConnectivitySettingsApi;

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

    ZeroTrustConnectivitySettingsApi apiInstance = new ZeroTrustConnectivitySettingsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      TunnelZeroTrustConnectivitySettingsResponse result = apiInstance.zeroTrustAccountsGetConnectivitySettings(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustConnectivitySettingsApi#zeroTrustAccountsGetConnectivitySettings");
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

[**TunnelZeroTrustConnectivitySettingsResponse**](TunnelZeroTrustConnectivitySettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Zero Trust Connectivity Settings response |  -  |
| **4XX** | Get Zero Trust Connectivity Settings response failure |  -  |

<a id="zeroTrustAccountsPatchConnectivitySettings"></a>
# **zeroTrustAccountsPatchConnectivitySettings**
> TunnelZeroTrustConnectivitySettingsResponse zeroTrustAccountsPatchConnectivitySettings(accountId, zeroTrustAccountsPatchConnectivitySettingsRequest)

Updates the Zero Trust Connectivity Settings

Updates the Zero Trust Connectivity Settings for the given account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustConnectivitySettingsApi;

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

    ZeroTrustConnectivitySettingsApi apiInstance = new ZeroTrustConnectivitySettingsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    ZeroTrustAccountsPatchConnectivitySettingsRequest zeroTrustAccountsPatchConnectivitySettingsRequest = new ZeroTrustAccountsPatchConnectivitySettingsRequest(); // ZeroTrustAccountsPatchConnectivitySettingsRequest | 
    try {
      TunnelZeroTrustConnectivitySettingsResponse result = apiInstance.zeroTrustAccountsPatchConnectivitySettings(accountId, zeroTrustAccountsPatchConnectivitySettingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustConnectivitySettingsApi#zeroTrustAccountsPatchConnectivitySettings");
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
| **zeroTrustAccountsPatchConnectivitySettingsRequest** | [**ZeroTrustAccountsPatchConnectivitySettingsRequest**](ZeroTrustAccountsPatchConnectivitySettingsRequest.md)|  | |

### Return type

[**TunnelZeroTrustConnectivitySettingsResponse**](TunnelZeroTrustConnectivitySettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Zero Trust Connectivity Settings response |  -  |
| **4XX** | Update Zero Trust Connectivity Settings response failure |  -  |

