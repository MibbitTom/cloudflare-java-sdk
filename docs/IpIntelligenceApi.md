# IpIntelligenceApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ipIntelligenceGetIpOverview**](IpIntelligenceApi.md#ipIntelligenceGetIpOverview) | **GET** /accounts/{account_id}/intel/ip | Get IP Overview |


<a id="ipIntelligenceGetIpOverview"></a>
# **ipIntelligenceGetIpOverview**
> IntelSchemasResponse ipIntelligenceGetIpOverview(accountId, ipv4, ipv6)

Get IP Overview

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IpIntelligenceApi;

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

    IpIntelligenceApi apiInstance = new IpIntelligenceApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String ipv4 = "ipv4_example"; // String | 
    String ipv6 = "ipv6_example"; // String | 
    try {
      IntelSchemasResponse result = apiInstance.ipIntelligenceGetIpOverview(accountId, ipv4, ipv6);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpIntelligenceApi#ipIntelligenceGetIpOverview");
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
| **ipv4** | **String**|  | [optional] |
| **ipv6** | **String**|  | [optional] |

### Return type

[**IntelSchemasResponse**](IntelSchemasResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get IP Overview response |  -  |
| **4XX** | Get IP Overview response failure |  -  |

