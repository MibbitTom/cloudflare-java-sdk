# TotalTlsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**totalTlsEnableOrDisableTotalTls**](TotalTlsApi.md#totalTlsEnableOrDisableTotalTls) | **POST** /zones/{zone_id}/acm/total_tls | Enable or Disable Total TLS |
| [**totalTlsTotalTlsSettingsDetails**](TotalTlsApi.md#totalTlsTotalTlsSettingsDetails) | **GET** /zones/{zone_id}/acm/total_tls | Total TLS Settings Details |


<a id="totalTlsEnableOrDisableTotalTls"></a>
# **totalTlsEnableOrDisableTotalTls**
> TlsCertificatesAndHostnamesTotalTlsSettingsResponse totalTlsEnableOrDisableTotalTls(zoneId, totalTlsEnableOrDisableTotalTlsRequest)

Enable or Disable Total TLS

Set Total TLS Settings or disable the feature for a Zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.TotalTlsApi;

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

    TotalTlsApi apiInstance = new TotalTlsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    TotalTlsEnableOrDisableTotalTlsRequest totalTlsEnableOrDisableTotalTlsRequest = new TotalTlsEnableOrDisableTotalTlsRequest(); // TotalTlsEnableOrDisableTotalTlsRequest | 
    try {
      TlsCertificatesAndHostnamesTotalTlsSettingsResponse result = apiInstance.totalTlsEnableOrDisableTotalTls(zoneId, totalTlsEnableOrDisableTotalTlsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TotalTlsApi#totalTlsEnableOrDisableTotalTls");
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
| **totalTlsEnableOrDisableTotalTlsRequest** | [**TotalTlsEnableOrDisableTotalTlsRequest**](TotalTlsEnableOrDisableTotalTlsRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesTotalTlsSettingsResponse**](TlsCertificatesAndHostnamesTotalTlsSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Enable or Disable Total TLS response |  -  |
| **4XX** | Enable or Disable Total TLS response failure |  -  |

<a id="totalTlsTotalTlsSettingsDetails"></a>
# **totalTlsTotalTlsSettingsDetails**
> TlsCertificatesAndHostnamesTotalTlsSettingsResponse totalTlsTotalTlsSettingsDetails(zoneId)

Total TLS Settings Details

Get Total TLS Settings for a Zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.TotalTlsApi;

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

    TotalTlsApi apiInstance = new TotalTlsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesTotalTlsSettingsResponse result = apiInstance.totalTlsTotalTlsSettingsDetails(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TotalTlsApi#totalTlsTotalTlsSettingsDetails");
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

[**TlsCertificatesAndHostnamesTotalTlsSettingsResponse**](TlsCertificatesAndHostnamesTotalTlsSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Total TLS Settings Details response |  -  |
| **4XX** | Total TLS Settings Details response failure |  -  |

