# OriginPostQuantumApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneCacheSettingsChangeOriginPostQuantumEncryptionSetting**](OriginPostQuantumApi.md#zoneCacheSettingsChangeOriginPostQuantumEncryptionSetting) | **PUT** /zones/{zone_id}/cache/origin_post_quantum_encryption | Change Origin Post-Quantum Encryption setting |
| [**zoneCacheSettingsGetOriginPostQuantumEncryptionSetting**](OriginPostQuantumApi.md#zoneCacheSettingsGetOriginPostQuantumEncryptionSetting) | **GET** /zones/{zone_id}/cache/origin_post_quantum_encryption | Get Origin Post-Quantum Encryption setting |


<a id="zoneCacheSettingsChangeOriginPostQuantumEncryptionSetting"></a>
# **zoneCacheSettingsChangeOriginPostQuantumEncryptionSetting**
> ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response zoneCacheSettingsChangeOriginPostQuantumEncryptionSetting(zoneId, zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest)

Change Origin Post-Quantum Encryption setting

Instructs Cloudflare to use Post-Quantum (PQ) key agreement algorithms when connecting to your origin. Preferred instructs Cloudflare to opportunistically send a Post-Quantum keyshare in the first message to the origin (for fastest connections when the origin supports and prefers PQ), supported means that PQ algorithms are advertised but only used when requested by the origin, and off means that PQ algorithms are not advertised

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.OriginPostQuantumApi;

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

    OriginPostQuantumApi apiInstance = new OriginPostQuantumApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest = new ZoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest(); // ZoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest | 
    try {
      ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response result = apiInstance.zoneCacheSettingsChangeOriginPostQuantumEncryptionSetting(zoneId, zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OriginPostQuantumApi#zoneCacheSettingsChangeOriginPostQuantumEncryptionSetting");
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
| **zoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest** | [**ZoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest**](ZoneCacheSettingsChangeOriginPostQuantumEncryptionSettingRequest.md)|  | |

### Return type

[**ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response**](ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Origin Post-Quantum Encryption setting response |  -  |
| **4XX** | Change Origin Post-Quantum Encryption setting response failure |  -  |

<a id="zoneCacheSettingsGetOriginPostQuantumEncryptionSetting"></a>
# **zoneCacheSettingsGetOriginPostQuantumEncryptionSetting**
> ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response zoneCacheSettingsGetOriginPostQuantumEncryptionSetting(zoneId)

Get Origin Post-Quantum Encryption setting

Instructs Cloudflare to use Post-Quantum (PQ) key agreement algorithms when connecting to your origin. Preferred instructs Cloudflare to opportunistically send a Post-Quantum keyshare in the first message to the origin (for fastest connections when the origin supports and prefers PQ), supported means that PQ algorithms are advertised but only used when requested by the origin, and off means that PQ algorithms are not advertised

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.OriginPostQuantumApi;

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

    OriginPostQuantumApi apiInstance = new OriginPostQuantumApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response result = apiInstance.zoneCacheSettingsGetOriginPostQuantumEncryptionSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OriginPostQuantumApi#zoneCacheSettingsGetOriginPostQuantumEncryptionSetting");
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

[**ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response**](ZoneCacheSettingsGetOriginPostQuantumEncryptionSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Origin Post-Quantum Encryption setting response |  -  |
| **4XX** | Get Origin Post-Quantum Encryption setting response failure |  -  |

