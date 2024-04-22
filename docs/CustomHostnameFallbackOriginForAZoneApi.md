# CustomHostnameFallbackOriginForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customHostnameFallbackOriginForAZoneDeleteFallbackOriginForCustomHostnames**](CustomHostnameFallbackOriginForAZoneApi.md#customHostnameFallbackOriginForAZoneDeleteFallbackOriginForCustomHostnames) | **DELETE** /zones/{zone_id}/custom_hostnames/fallback_origin | Delete Fallback Origin for Custom Hostnames |
| [**customHostnameFallbackOriginForAZoneGetFallbackOriginForCustomHostnames**](CustomHostnameFallbackOriginForAZoneApi.md#customHostnameFallbackOriginForAZoneGetFallbackOriginForCustomHostnames) | **GET** /zones/{zone_id}/custom_hostnames/fallback_origin | Get Fallback Origin for Custom Hostnames |
| [**customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnames**](CustomHostnameFallbackOriginForAZoneApi.md#customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnames) | **PUT** /zones/{zone_id}/custom_hostnames/fallback_origin | Update Fallback Origin for Custom Hostnames |


<a id="customHostnameFallbackOriginForAZoneDeleteFallbackOriginForCustomHostnames"></a>
# **customHostnameFallbackOriginForAZoneDeleteFallbackOriginForCustomHostnames**
> TlsCertificatesAndHostnamesFallbackOriginResponse customHostnameFallbackOriginForAZoneDeleteFallbackOriginForCustomHostnames(zoneId)

Delete Fallback Origin for Custom Hostnames

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomHostnameFallbackOriginForAZoneApi;

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

    CustomHostnameFallbackOriginForAZoneApi apiInstance = new CustomHostnameFallbackOriginForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesFallbackOriginResponse result = apiInstance.customHostnameFallbackOriginForAZoneDeleteFallbackOriginForCustomHostnames(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomHostnameFallbackOriginForAZoneApi#customHostnameFallbackOriginForAZoneDeleteFallbackOriginForCustomHostnames");
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

[**TlsCertificatesAndHostnamesFallbackOriginResponse**](TlsCertificatesAndHostnamesFallbackOriginResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Fallback Origin for Custom Hostnames response |  -  |
| **4XX** | Delete Fallback Origin for Custom Hostnames response failure |  -  |

<a id="customHostnameFallbackOriginForAZoneGetFallbackOriginForCustomHostnames"></a>
# **customHostnameFallbackOriginForAZoneGetFallbackOriginForCustomHostnames**
> TlsCertificatesAndHostnamesFallbackOriginResponse customHostnameFallbackOriginForAZoneGetFallbackOriginForCustomHostnames(zoneId)

Get Fallback Origin for Custom Hostnames

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomHostnameFallbackOriginForAZoneApi;

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

    CustomHostnameFallbackOriginForAZoneApi apiInstance = new CustomHostnameFallbackOriginForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesFallbackOriginResponse result = apiInstance.customHostnameFallbackOriginForAZoneGetFallbackOriginForCustomHostnames(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomHostnameFallbackOriginForAZoneApi#customHostnameFallbackOriginForAZoneGetFallbackOriginForCustomHostnames");
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

[**TlsCertificatesAndHostnamesFallbackOriginResponse**](TlsCertificatesAndHostnamesFallbackOriginResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Fallback Origin for Custom Hostnames response |  -  |
| **4XX** | Get Fallback Origin for Custom Hostnames response failure |  -  |

<a id="customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnames"></a>
# **customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnames**
> TlsCertificatesAndHostnamesFallbackOriginResponse customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnames(zoneId, customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnamesRequest)

Update Fallback Origin for Custom Hostnames

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomHostnameFallbackOriginForAZoneApi;

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

    CustomHostnameFallbackOriginForAZoneApi apiInstance = new CustomHostnameFallbackOriginForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    CustomHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnamesRequest customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnamesRequest = new CustomHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnamesRequest(); // CustomHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnamesRequest | 
    try {
      TlsCertificatesAndHostnamesFallbackOriginResponse result = apiInstance.customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnames(zoneId, customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnamesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomHostnameFallbackOriginForAZoneApi#customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnames");
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
| **customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnamesRequest** | [**CustomHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnamesRequest**](CustomHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnamesRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesFallbackOriginResponse**](TlsCertificatesAndHostnamesFallbackOriginResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Fallback Origin for Custom Hostnames response |  -  |
| **4XX** | Update Fallback Origin for Custom Hostnames response failure |  -  |

