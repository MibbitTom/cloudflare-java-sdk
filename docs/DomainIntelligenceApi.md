# DomainIntelligenceApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**domainIntelligenceGetDomainDetails**](DomainIntelligenceApi.md#domainIntelligenceGetDomainDetails) | **GET** /accounts/{account_id}/intel/domain | Get Domain Details |
| [**domainIntelligenceGetMultipleDomainDetails**](DomainIntelligenceApi.md#domainIntelligenceGetMultipleDomainDetails) | **GET** /accounts/{account_id}/intel/domain/bulk | Get Multiple Domain Details |


<a id="domainIntelligenceGetDomainDetails"></a>
# **domainIntelligenceGetDomainDetails**
> IntelSingleResponse domainIntelligenceGetDomainDetails(accountId, domain)

Get Domain Details

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DomainIntelligenceApi;

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

    DomainIntelligenceApi apiInstance = new DomainIntelligenceApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String domain = "domain_example"; // String | 
    try {
      IntelSingleResponse result = apiInstance.domainIntelligenceGetDomainDetails(accountId, domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainIntelligenceApi#domainIntelligenceGetDomainDetails");
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
| **domain** | **String**|  | [optional] |

### Return type

[**IntelSingleResponse**](IntelSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Domain Details response |  -  |
| **4XX** | Get Domain Details response failure |  -  |

<a id="domainIntelligenceGetMultipleDomainDetails"></a>
# **domainIntelligenceGetMultipleDomainDetails**
> IntelCollectionResponse domainIntelligenceGetMultipleDomainDetails(accountId, domain)

Get Multiple Domain Details

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DomainIntelligenceApi;

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

    DomainIntelligenceApi apiInstance = new DomainIntelligenceApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Object domain = null; // Object | 
    try {
      IntelCollectionResponse result = apiInstance.domainIntelligenceGetMultipleDomainDetails(accountId, domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainIntelligenceApi#domainIntelligenceGetMultipleDomainDetails");
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
| **domain** | [**Object**](.md)|  | [optional] |

### Return type

[**IntelCollectionResponse**](IntelCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Multiple Domain Details response |  -  |
| **4XX** | Get Multiple Domain Details response failure |  -  |

