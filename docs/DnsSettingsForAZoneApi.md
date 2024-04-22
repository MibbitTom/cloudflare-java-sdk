# DnsSettingsForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dnsSettingsForAZoneListDnsSettings**](DnsSettingsForAZoneApi.md#dnsSettingsForAZoneListDnsSettings) | **GET** /zones/{zone_id}/dns_settings | Show DNS Settings |
| [**dnsSettingsForAZoneUpdateDnsSettings**](DnsSettingsForAZoneApi.md#dnsSettingsForAZoneUpdateDnsSettings) | **PATCH** /zones/{zone_id}/dns_settings | Update DNS Settings |


<a id="dnsSettingsForAZoneListDnsSettings"></a>
# **dnsSettingsForAZoneListDnsSettings**
> DnsSettingsDnsResponseSingle dnsSettingsForAZoneListDnsSettings(zoneId)

Show DNS Settings

Show DNS settings for a zone

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DnsSettingsForAZoneApi;

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

    DnsSettingsForAZoneApi apiInstance = new DnsSettingsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      DnsSettingsDnsResponseSingle result = apiInstance.dnsSettingsForAZoneListDnsSettings(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsSettingsForAZoneApi#dnsSettingsForAZoneListDnsSettings");
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

[**DnsSettingsDnsResponseSingle**](DnsSettingsDnsResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Show DNS Settings response |  -  |
| **4XX** | Show DNS Settings response failure |  -  |

<a id="dnsSettingsForAZoneUpdateDnsSettings"></a>
# **dnsSettingsForAZoneUpdateDnsSettings**
> DnsSettingsDnsResponseSingle dnsSettingsForAZoneUpdateDnsSettings(zoneId, dnsSettingsDnsSettings)

Update DNS Settings

Update DNS settings for a zone

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DnsSettingsForAZoneApi;

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

    DnsSettingsForAZoneApi apiInstance = new DnsSettingsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    DnsSettingsDnsSettings dnsSettingsDnsSettings = new DnsSettingsDnsSettings(); // DnsSettingsDnsSettings | 
    try {
      DnsSettingsDnsResponseSingle result = apiInstance.dnsSettingsForAZoneUpdateDnsSettings(zoneId, dnsSettingsDnsSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsSettingsForAZoneApi#dnsSettingsForAZoneUpdateDnsSettings");
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
| **dnsSettingsDnsSettings** | [**DnsSettingsDnsSettings**](DnsSettingsDnsSettings.md)|  | |

### Return type

[**DnsSettingsDnsResponseSingle**](DnsSettingsDnsResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Show DNS Settings response |  -  |
| **4XX** | Show DNS Settings response failure |  -  |

