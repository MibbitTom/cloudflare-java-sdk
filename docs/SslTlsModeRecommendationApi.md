# SslTlsModeRecommendationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sslTlsModeRecommendationSslTlsRecommendation**](SslTlsModeRecommendationApi.md#sslTlsModeRecommendationSslTlsRecommendation) | **GET** /zones/{zone_identifier}/ssl/recommendation | SSL/TLS Recommendation |


<a id="sslTlsModeRecommendationSslTlsRecommendation"></a>
# **sslTlsModeRecommendationSslTlsRecommendation**
> SslTlsModeRecommendationSslTlsRecommendation200Response sslTlsModeRecommendationSslTlsRecommendation(zoneIdentifier)

SSL/TLS Recommendation

Retrieve the SSL/TLS Recommender&#39;s recommendation for a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SslTlsModeRecommendationApi;

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

    SslTlsModeRecommendationApi apiInstance = new SslTlsModeRecommendationApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      SslTlsModeRecommendationSslTlsRecommendation200Response result = apiInstance.sslTlsModeRecommendationSslTlsRecommendation(zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SslTlsModeRecommendationApi#sslTlsModeRecommendationSslTlsRecommendation");
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
| **zoneIdentifier** | **String**|  | |

### Return type

[**SslTlsModeRecommendationSslTlsRecommendation200Response**](SslTlsModeRecommendationSslTlsRecommendation200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SSL/TLS Recommendation response |  -  |
| **4XX** | SSL/TLS Recommendation response failure |  -  |

