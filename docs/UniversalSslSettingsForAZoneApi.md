# UniversalSslSettingsForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**universalSslSettingsForAZoneEditUniversalSslSettings**](UniversalSslSettingsForAZoneApi.md#universalSslSettingsForAZoneEditUniversalSslSettings) | **PATCH** /zones/{zone_id}/ssl/universal/settings | Edit Universal SSL Settings |
| [**universalSslSettingsForAZoneUniversalSslSettingsDetails**](UniversalSslSettingsForAZoneApi.md#universalSslSettingsForAZoneUniversalSslSettingsDetails) | **GET** /zones/{zone_id}/ssl/universal/settings | Universal SSL Settings Details |


<a id="universalSslSettingsForAZoneEditUniversalSslSettings"></a>
# **universalSslSettingsForAZoneEditUniversalSslSettings**
> TlsCertificatesAndHostnamesSslUniversalSettingsResponse universalSslSettingsForAZoneEditUniversalSslSettings(zoneId, tlsCertificatesAndHostnamesUniversal)

Edit Universal SSL Settings

Patch Universal SSL Settings for a Zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.UniversalSslSettingsForAZoneApi;

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

    UniversalSslSettingsForAZoneApi apiInstance = new UniversalSslSettingsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    TlsCertificatesAndHostnamesUniversal tlsCertificatesAndHostnamesUniversal = new TlsCertificatesAndHostnamesUniversal(); // TlsCertificatesAndHostnamesUniversal | 
    try {
      TlsCertificatesAndHostnamesSslUniversalSettingsResponse result = apiInstance.universalSslSettingsForAZoneEditUniversalSslSettings(zoneId, tlsCertificatesAndHostnamesUniversal);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UniversalSslSettingsForAZoneApi#universalSslSettingsForAZoneEditUniversalSslSettings");
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
| **tlsCertificatesAndHostnamesUniversal** | [**TlsCertificatesAndHostnamesUniversal**](TlsCertificatesAndHostnamesUniversal.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesSslUniversalSettingsResponse**](TlsCertificatesAndHostnamesSslUniversalSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Edit Universal SSL Settings response |  -  |
| **4XX** | Edit Universal SSL Settings response failure |  -  |

<a id="universalSslSettingsForAZoneUniversalSslSettingsDetails"></a>
# **universalSslSettingsForAZoneUniversalSslSettingsDetails**
> TlsCertificatesAndHostnamesSslUniversalSettingsResponse universalSslSettingsForAZoneUniversalSslSettingsDetails(zoneId)

Universal SSL Settings Details

Get Universal SSL Settings for a Zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.UniversalSslSettingsForAZoneApi;

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

    UniversalSslSettingsForAZoneApi apiInstance = new UniversalSslSettingsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesSslUniversalSettingsResponse result = apiInstance.universalSslSettingsForAZoneUniversalSslSettingsDetails(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UniversalSslSettingsForAZoneApi#universalSslSettingsForAZoneUniversalSslSettingsDetails");
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

[**TlsCertificatesAndHostnamesSslUniversalSettingsResponse**](TlsCertificatesAndHostnamesSslUniversalSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Universal SSL Settings Details response |  -  |
| **4XX** | Universal SSL Settings Details response failure |  -  |

