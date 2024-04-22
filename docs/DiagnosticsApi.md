# DiagnosticsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**diagnosticsTraceroute**](DiagnosticsApi.md#diagnosticsTraceroute) | **POST** /accounts/{account_id}/diagnostics/traceroute | Traceroute |


<a id="diagnosticsTraceroute"></a>
# **diagnosticsTraceroute**
> MagicTransitTracerouteResponseCollection diagnosticsTraceroute(accountId, diagnosticsTracerouteRequest)

Traceroute

Run traceroutes from Cloudflare colos.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiagnosticsApi;

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

    DiagnosticsApi apiInstance = new DiagnosticsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    DiagnosticsTracerouteRequest diagnosticsTracerouteRequest = new DiagnosticsTracerouteRequest(); // DiagnosticsTracerouteRequest | 
    try {
      MagicTransitTracerouteResponseCollection result = apiInstance.diagnosticsTraceroute(accountId, diagnosticsTracerouteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiagnosticsApi#diagnosticsTraceroute");
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
| **diagnosticsTracerouteRequest** | [**DiagnosticsTracerouteRequest**](DiagnosticsTracerouteRequest.md)|  | |

### Return type

[**MagicTransitTracerouteResponseCollection**](MagicTransitTracerouteResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Traceroute response |  -  |
| **4XX** | Traceroute response failure |  -  |
