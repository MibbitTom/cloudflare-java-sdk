# PhishingUrlInformationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**phishingUrlInformationGetResultsForAUrlScan**](PhishingUrlInformationApi.md#phishingUrlInformationGetResultsForAUrlScan) | **GET** /accounts/{account_id}/brand-protection/url-info | Get results for a URL scan |


<a id="phishingUrlInformationGetResultsForAUrlScan"></a>
# **phishingUrlInformationGetResultsForAUrlScan**
> IntelPhishingUrlInfoComponentsSchemasSingleResponse phishingUrlInformationGetResultsForAUrlScan(accountId, urlIdParam, url)

Get results for a URL scan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PhishingUrlInformationApi;

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

    PhishingUrlInformationApi apiInstance = new PhishingUrlInformationApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    IntelUrlIdParam urlIdParam = new IntelUrlIdParam(); // IntelUrlIdParam | 
    String url = "url_example"; // String | 
    try {
      IntelPhishingUrlInfoComponentsSchemasSingleResponse result = apiInstance.phishingUrlInformationGetResultsForAUrlScan(accountId, urlIdParam, url);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhishingUrlInformationApi#phishingUrlInformationGetResultsForAUrlScan");
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
| **urlIdParam** | [**IntelUrlIdParam**](.md)|  | [optional] |
| **url** | **String**|  | [optional] |

### Return type

[**IntelPhishingUrlInfoComponentsSchemasSingleResponse**](IntelPhishingUrlInfoComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get results for a URL scan response |  -  |
| **4XX** | Get results for a URL scan response failure |  -  |

