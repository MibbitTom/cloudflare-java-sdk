# AsnIntelligenceApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**asnIntelligenceGetAsnOverview**](AsnIntelligenceApi.md#asnIntelligenceGetAsnOverview) | **GET** /accounts/{account_id}/intel/asn/{asn} | Get ASN Overview |
| [**asnIntelligenceGetAsnSubnets**](AsnIntelligenceApi.md#asnIntelligenceGetAsnSubnets) | **GET** /accounts/{account_id}/intel/asn/{asn}/subnets | Get ASN Subnets |


<a id="asnIntelligenceGetAsnOverview"></a>
# **asnIntelligenceGetAsnOverview**
> IntelAsnComponentsSchemasResponse asnIntelligenceGetAsnOverview(asn, accountId)

Get ASN Overview

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AsnIntelligenceApi;

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

    AsnIntelligenceApi apiInstance = new AsnIntelligenceApi(defaultClient);
    Integer asn = 56; // Integer | 
    String accountId = "accountId_example"; // String | 
    try {
      IntelAsnComponentsSchemasResponse result = apiInstance.asnIntelligenceGetAsnOverview(asn, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AsnIntelligenceApi#asnIntelligenceGetAsnOverview");
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
| **asn** | **Integer**|  | |
| **accountId** | **String**|  | |

### Return type

[**IntelAsnComponentsSchemasResponse**](IntelAsnComponentsSchemasResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get ASN Overview response |  -  |
| **4XX** | Get ASN Overview response failure |  -  |

<a id="asnIntelligenceGetAsnSubnets"></a>
# **asnIntelligenceGetAsnSubnets**
> AsnIntelligenceGetAsnSubnets200Response asnIntelligenceGetAsnSubnets(asn, accountId)

Get ASN Subnets

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AsnIntelligenceApi;

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

    AsnIntelligenceApi apiInstance = new AsnIntelligenceApi(defaultClient);
    Integer asn = 56; // Integer | 
    String accountId = "accountId_example"; // String | 
    try {
      AsnIntelligenceGetAsnSubnets200Response result = apiInstance.asnIntelligenceGetAsnSubnets(asn, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AsnIntelligenceApi#asnIntelligenceGetAsnSubnets");
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
| **asn** | **Integer**|  | |
| **accountId** | **String**|  | |

### Return type

[**AsnIntelligenceGetAsnSubnets200Response**](AsnIntelligenceGetAsnSubnets200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get ASN Subnets response |  -  |
| **4XX** | Get ASN Subnets response failure |  -  |

