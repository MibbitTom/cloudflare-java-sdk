# StreamVideoClippingApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**streamVideoClippingClipVideosGivenAStartAndEndTime**](StreamVideoClippingApi.md#streamVideoClippingClipVideosGivenAStartAndEndTime) | **POST** /accounts/{account_id}/stream/clip | Clip videos given a start and end time |


<a id="streamVideoClippingClipVideosGivenAStartAndEndTime"></a>
# **streamVideoClippingClipVideosGivenAStartAndEndTime**
> StreamClipResponseSingle streamVideoClippingClipVideosGivenAStartAndEndTime(accountId, streamVideoClipStandard)

Clip videos given a start and end time

Clips a video based on the specified start and end times provided in seconds.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.StreamVideoClippingApi;

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

    StreamVideoClippingApi apiInstance = new StreamVideoClippingApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    StreamVideoClipStandard streamVideoClipStandard = new StreamVideoClipStandard(); // StreamVideoClipStandard | 
    try {
      StreamClipResponseSingle result = apiInstance.streamVideoClippingClipVideosGivenAStartAndEndTime(accountId, streamVideoClipStandard);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamVideoClippingApi#streamVideoClippingClipVideosGivenAStartAndEndTime");
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
| **streamVideoClipStandard** | [**StreamVideoClipStandard**](StreamVideoClipStandard.md)|  | |

### Return type

[**StreamClipResponseSingle**](StreamClipResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Clip videos given a start and end time response |  -  |
| **4XX** | Clip videos given a start and end time response failure |  -  |

