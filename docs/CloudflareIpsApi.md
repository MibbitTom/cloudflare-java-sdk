# CloudflareIpsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cloudflareIPsCloudflareIpDetails**](CloudflareIpsApi.md#cloudflareIPsCloudflareIpDetails) | **GET** /ips | Cloudflare/JD Cloud IP Details |


<a id="cloudflareIPsCloudflareIpDetails"></a>
# **cloudflareIPsCloudflareIpDetails**
> CloudflareIPsCloudflareIpDetails200Response cloudflareIPsCloudflareIpDetails(networks)

Cloudflare/JD Cloud IP Details

Get IPs used on the Cloudflare/JD Cloud network, see https://www.cloudflare.com/ips for Cloudflare IPs or https://developers.cloudflare.com/china-network/reference/infrastructure/ for JD Cloud IPs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudflareIpsApi;

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

    CloudflareIpsApi apiInstance = new CloudflareIpsApi(defaultClient);
    String networks = "networks_example"; // String | Specified as `jdcloud` to list IPs used by JD Cloud data centers.
    try {
      CloudflareIPsCloudflareIpDetails200Response result = apiInstance.cloudflareIPsCloudflareIpDetails(networks);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareIpsApi#cloudflareIPsCloudflareIpDetails");
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
| **networks** | **String**| Specified as &#x60;jdcloud&#x60; to list IPs used by JD Cloud data centers. | [optional] |

### Return type

[**CloudflareIPsCloudflareIpDetails200Response**](CloudflareIPsCloudflareIpDetails200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cloudflare IP Details response |  -  |
| **4XX** | Cloudflare IP Details response failure |  -  |

