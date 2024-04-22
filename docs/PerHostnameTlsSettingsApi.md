# PerHostnameTlsSettingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**perHostnameTlsSettingsDelete**](PerHostnameTlsSettingsApi.md#perHostnameTlsSettingsDelete) | **DELETE** /zones/{zone_id}/hostnames/settings/{setting_id}/{hostname} | Delete TLS setting for hostname |
| [**perHostnameTlsSettingsList**](PerHostnameTlsSettingsApi.md#perHostnameTlsSettingsList) | **GET** /zones/{zone_id}/hostnames/settings/{setting_id} | List TLS setting for hostnames |
| [**perHostnameTlsSettingsPut**](PerHostnameTlsSettingsApi.md#perHostnameTlsSettingsPut) | **PUT** /zones/{zone_id}/hostnames/settings/{setting_id}/{hostname} | Edit TLS setting for hostname |


<a id="perHostnameTlsSettingsDelete"></a>
# **perHostnameTlsSettingsDelete**
> TlsCertificatesAndHostnamesPerHostnameSettingsResponseDelete perHostnameTlsSettingsDelete(zoneId, settingId, hostname)

Delete TLS setting for hostname

Delete the tls setting value for the hostname.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PerHostnameTlsSettingsApi;

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

    PerHostnameTlsSettingsApi apiInstance = new PerHostnameTlsSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    TlsCertificatesAndHostnamesSettingId settingId = TlsCertificatesAndHostnamesSettingId.fromValue("ciphers"); // TlsCertificatesAndHostnamesSettingId | 
    String hostname = "hostname_example"; // String | 
    try {
      TlsCertificatesAndHostnamesPerHostnameSettingsResponseDelete result = apiInstance.perHostnameTlsSettingsDelete(zoneId, settingId, hostname);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PerHostnameTlsSettingsApi#perHostnameTlsSettingsDelete");
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
| **settingId** | [**TlsCertificatesAndHostnamesSettingId**](.md)|  | [enum: ciphers, min_tls_version, http2] |
| **hostname** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesPerHostnameSettingsResponseDelete**](TlsCertificatesAndHostnamesPerHostnameSettingsResponseDelete.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete TLS setting for hostname response |  -  |
| **4XX** | Delete TLS setting for hostname response failure |  -  |

<a id="perHostnameTlsSettingsList"></a>
# **perHostnameTlsSettingsList**
> TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollection perHostnameTlsSettingsList(zoneId, settingId)

List TLS setting for hostnames

List the requested TLS setting for the hostnames under this zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PerHostnameTlsSettingsApi;

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

    PerHostnameTlsSettingsApi apiInstance = new PerHostnameTlsSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    TlsCertificatesAndHostnamesSettingId settingId = TlsCertificatesAndHostnamesSettingId.fromValue("ciphers"); // TlsCertificatesAndHostnamesSettingId | 
    try {
      TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollection result = apiInstance.perHostnameTlsSettingsList(zoneId, settingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PerHostnameTlsSettingsApi#perHostnameTlsSettingsList");
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
| **settingId** | [**TlsCertificatesAndHostnamesSettingId**](.md)|  | [enum: ciphers, min_tls_version, http2] |

### Return type

[**TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollection**](TlsCertificatesAndHostnamesPerHostnameSettingsResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List per-hostname TLS settings response |  -  |
| **4XX** | List per-hostname TLS settings response failure |  -  |

<a id="perHostnameTlsSettingsPut"></a>
# **perHostnameTlsSettingsPut**
> TlsCertificatesAndHostnamesPerHostnameSettingsResponse perHostnameTlsSettingsPut(zoneId, settingId, hostname, perHostnameTlsSettingsPutRequest)

Edit TLS setting for hostname

Update the tls setting value for the hostname.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PerHostnameTlsSettingsApi;

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

    PerHostnameTlsSettingsApi apiInstance = new PerHostnameTlsSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    TlsCertificatesAndHostnamesSettingId settingId = TlsCertificatesAndHostnamesSettingId.fromValue("ciphers"); // TlsCertificatesAndHostnamesSettingId | 
    String hostname = "hostname_example"; // String | 
    PerHostnameTlsSettingsPutRequest perHostnameTlsSettingsPutRequest = new PerHostnameTlsSettingsPutRequest(); // PerHostnameTlsSettingsPutRequest | 
    try {
      TlsCertificatesAndHostnamesPerHostnameSettingsResponse result = apiInstance.perHostnameTlsSettingsPut(zoneId, settingId, hostname, perHostnameTlsSettingsPutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PerHostnameTlsSettingsApi#perHostnameTlsSettingsPut");
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
| **settingId** | [**TlsCertificatesAndHostnamesSettingId**](.md)|  | [enum: ciphers, min_tls_version, http2] |
| **hostname** | **String**|  | |
| **perHostnameTlsSettingsPutRequest** | [**PerHostnameTlsSettingsPutRequest**](PerHostnameTlsSettingsPutRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesPerHostnameSettingsResponse**](TlsCertificatesAndHostnamesPerHostnameSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Edit TLS setting for hostname response |  -  |
| **4XX** | Edit TLS setting for hostname response failure |  -  |

