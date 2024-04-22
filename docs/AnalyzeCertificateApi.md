# AnalyzeCertificateApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**analyzeCertificateAnalyzeCertificate**](AnalyzeCertificateApi.md#analyzeCertificateAnalyzeCertificate) | **POST** /zones/{zone_id}/ssl/analyze | Analyze Certificate |


<a id="analyzeCertificateAnalyzeCertificate"></a>
# **analyzeCertificateAnalyzeCertificate**
> TlsCertificatesAndHostnamesCertificateAnalyzeResponse analyzeCertificateAnalyzeCertificate(zoneId, analyzeCertificateAnalyzeCertificateRequest)

Analyze Certificate

Returns the set of hostnames, the signature algorithm, and the expiration date of the certificate.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AnalyzeCertificateApi;

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

    AnalyzeCertificateApi apiInstance = new AnalyzeCertificateApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    AnalyzeCertificateAnalyzeCertificateRequest analyzeCertificateAnalyzeCertificateRequest = new AnalyzeCertificateAnalyzeCertificateRequest(); // AnalyzeCertificateAnalyzeCertificateRequest | 
    try {
      TlsCertificatesAndHostnamesCertificateAnalyzeResponse result = apiInstance.analyzeCertificateAnalyzeCertificate(zoneId, analyzeCertificateAnalyzeCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyzeCertificateApi#analyzeCertificateAnalyzeCertificate");
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
| **analyzeCertificateAnalyzeCertificateRequest** | [**AnalyzeCertificateAnalyzeCertificateRequest**](AnalyzeCertificateAnalyzeCertificateRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesCertificateAnalyzeResponse**](TlsCertificatesAndHostnamesCertificateAnalyzeResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Analyze Certificate response |  -  |
| **4XX** | Analyze Certificate response failure |  -  |

