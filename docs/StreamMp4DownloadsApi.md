# StreamMp4DownloadsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**streamMP4DownloadsCreateDownloads**](StreamMp4DownloadsApi.md#streamMP4DownloadsCreateDownloads) | **POST** /accounts/{account_id}/stream/{identifier}/downloads | Create downloads |
| [**streamMP4DownloadsDeleteDownloads**](StreamMp4DownloadsApi.md#streamMP4DownloadsDeleteDownloads) | **DELETE** /accounts/{account_id}/stream/{identifier}/downloads | Delete downloads |
| [**streamMP4DownloadsListDownloads**](StreamMp4DownloadsApi.md#streamMP4DownloadsListDownloads) | **GET** /accounts/{account_id}/stream/{identifier}/downloads | List downloads |


<a id="streamMP4DownloadsCreateDownloads"></a>
# **streamMP4DownloadsCreateDownloads**
> StreamDownloadsResponse streamMP4DownloadsCreateDownloads(identifier, accountId)

Create downloads

Creates a download for a video when a video is ready to view.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamMp4DownloadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    StreamMp4DownloadsApi apiInstance = new StreamMp4DownloadsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      StreamDownloadsResponse result = apiInstance.streamMP4DownloadsCreateDownloads(identifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamMp4DownloadsApi#streamMP4DownloadsCreateDownloads");
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
| **identifier** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**StreamDownloadsResponse**](StreamDownloadsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create downloads response |  -  |
| **4XX** | Create downloads response failure |  -  |

<a id="streamMP4DownloadsDeleteDownloads"></a>
# **streamMP4DownloadsDeleteDownloads**
> StreamDeletedResponse streamMP4DownloadsDeleteDownloads(identifier, accountId)

Delete downloads

Delete the downloads for a video.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamMp4DownloadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    StreamMp4DownloadsApi apiInstance = new StreamMp4DownloadsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      StreamDeletedResponse result = apiInstance.streamMP4DownloadsDeleteDownloads(identifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamMp4DownloadsApi#streamMP4DownloadsDeleteDownloads");
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
| **identifier** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**StreamDeletedResponse**](StreamDeletedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete downloads response |  -  |
| **4XX** | Delete downloads response failure |  -  |

<a id="streamMP4DownloadsListDownloads"></a>
# **streamMP4DownloadsListDownloads**
> StreamDownloadsResponse streamMP4DownloadsListDownloads(identifier, accountId)

List downloads

Lists the downloads created for a video.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamMp4DownloadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    StreamMp4DownloadsApi apiInstance = new StreamMp4DownloadsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      StreamDownloadsResponse result = apiInstance.streamMP4DownloadsListDownloads(identifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamMp4DownloadsApi#streamMP4DownloadsListDownloads");
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
| **identifier** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**StreamDownloadsResponse**](StreamDownloadsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List downloads response |  -  |
| **4XX** | List downloads response failure |  -  |

