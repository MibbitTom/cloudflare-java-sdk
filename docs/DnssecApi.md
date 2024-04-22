# DnssecApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dnssecDeleteDnssecRecords**](DnssecApi.md#dnssecDeleteDnssecRecords) | **DELETE** /zones/{zone_id}/dnssec | Delete DNSSEC records |
| [**dnssecDnssecDetails**](DnssecApi.md#dnssecDnssecDetails) | **GET** /zones/{zone_id}/dnssec | DNSSEC Details |
| [**dnssecEditDnssecStatus**](DnssecApi.md#dnssecEditDnssecStatus) | **PATCH** /zones/{zone_id}/dnssec | Edit DNSSEC Status |


<a id="dnssecDeleteDnssecRecords"></a>
# **dnssecDeleteDnssecRecords**
> DnssecDeleteDnssecResponseSingle dnssecDeleteDnssecRecords(zoneId)

Delete DNSSEC records

Delete DNSSEC.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DnssecApi;

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

    DnssecApi apiInstance = new DnssecApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      DnssecDeleteDnssecResponseSingle result = apiInstance.dnssecDeleteDnssecRecords(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnssecApi#dnssecDeleteDnssecRecords");
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

[**DnssecDeleteDnssecResponseSingle**](DnssecDeleteDnssecResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete DNSSEC records response |  -  |
| **4XX** | Delete DNSSEC records response failure |  -  |

<a id="dnssecDnssecDetails"></a>
# **dnssecDnssecDetails**
> DnssecDnssecResponseSingle dnssecDnssecDetails(zoneId)

DNSSEC Details

Details about DNSSEC status and configuration.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DnssecApi;

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

    DnssecApi apiInstance = new DnssecApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      DnssecDnssecResponseSingle result = apiInstance.dnssecDnssecDetails(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnssecApi#dnssecDnssecDetails");
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

[**DnssecDnssecResponseSingle**](DnssecDnssecResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DNSSEC Details response |  -  |
| **4XX** | DNSSEC Details response failure |  -  |

<a id="dnssecEditDnssecStatus"></a>
# **dnssecEditDnssecStatus**
> DnssecDnssecResponseSingle dnssecEditDnssecStatus(zoneId, dnssecEditDnssecStatusRequest)

Edit DNSSEC Status

Enable or disable DNSSEC.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DnssecApi;

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

    DnssecApi apiInstance = new DnssecApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    DnssecEditDnssecStatusRequest dnssecEditDnssecStatusRequest = new DnssecEditDnssecStatusRequest(); // DnssecEditDnssecStatusRequest | 
    try {
      DnssecDnssecResponseSingle result = apiInstance.dnssecEditDnssecStatus(zoneId, dnssecEditDnssecStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnssecApi#dnssecEditDnssecStatus");
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
| **dnssecEditDnssecStatusRequest** | [**DnssecEditDnssecStatusRequest**](DnssecEditDnssecStatusRequest.md)|  | |

### Return type

[**DnssecDnssecResponseSingle**](DnssecDnssecResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Edit DNSSEC Status response |  -  |
| **4XX** | Edit DNSSEC Status response failure |  -  |

