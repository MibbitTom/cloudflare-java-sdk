# PassiveDnsByIpApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**passiveDnsByIpGetPassiveDnsByIp**](PassiveDnsByIpApi.md#passiveDnsByIpGetPassiveDnsByIp) | **GET** /accounts/{account_id}/intel/dns | Get Passive DNS by IP |


<a id="passiveDnsByIpGetPassiveDnsByIp"></a>
# **passiveDnsByIpGetPassiveDnsByIp**
> IntelComponentsSchemasSingleResponse passiveDnsByIpGetPassiveDnsByIp(accountId, startEndParams, ipv4, page, perPage)

Get Passive DNS by IP

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.PassiveDnsByIpApi;

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

    PassiveDnsByIpApi apiInstance = new PassiveDnsByIpApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    IntelStartEndParams startEndParams = new IntelStartEndParams(); // IntelStartEndParams | 
    String ipv4 = "ipv4_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    try {
      IntelComponentsSchemasSingleResponse result = apiInstance.passiveDnsByIpGetPassiveDnsByIp(accountId, startEndParams, ipv4, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PassiveDnsByIpApi#passiveDnsByIpGetPassiveDnsByIp");
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
| **startEndParams** | [**IntelStartEndParams**](.md)|  | [optional] |
| **ipv4** | **String**|  | [optional] |
| **page** | **BigDecimal**|  | [optional] |
| **perPage** | **BigDecimal**|  | [optional] |

### Return type

[**IntelComponentsSchemasSingleResponse**](IntelComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Passive DNS by IP response |  -  |
| **4XX** | Get Passive DNS by IP response failure |  -  |

