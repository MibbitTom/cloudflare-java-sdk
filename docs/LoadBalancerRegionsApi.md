# LoadBalancerRegionsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**loadBalancerRegionsGetRegion**](LoadBalancerRegionsApi.md#loadBalancerRegionsGetRegion) | **GET** /accounts/{account_id}/load_balancers/regions/{region_id} | Get Region |
| [**loadBalancerRegionsListRegions**](LoadBalancerRegionsApi.md#loadBalancerRegionsListRegions) | **GET** /accounts/{account_id}/load_balancers/regions | List Regions |


<a id="loadBalancerRegionsGetRegion"></a>
# **loadBalancerRegionsGetRegion**
> LoadBalancingComponentsSchemasSingleResponse loadBalancerRegionsGetRegion(regionId, accountId)

Get Region

Get a single region mapping.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancerRegionsApi;

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

    LoadBalancerRegionsApi apiInstance = new LoadBalancerRegionsApi(defaultClient);
    LoadBalancingRegionCode regionId = LoadBalancingRegionCode.fromValue("WNAM"); // LoadBalancingRegionCode | 
    String accountId = "accountId_example"; // String | 
    try {
      LoadBalancingComponentsSchemasSingleResponse result = apiInstance.loadBalancerRegionsGetRegion(regionId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerRegionsApi#loadBalancerRegionsGetRegion");
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
| **regionId** | [**LoadBalancingRegionCode**](.md)|  | [enum: WNAM, ENAM, WEU, EEU, NSAM, SSAM, OC, ME, NAF, SAF, SAS, SEAS, NEAS] |
| **accountId** | **String**|  | |

### Return type

[**LoadBalancingComponentsSchemasSingleResponse**](LoadBalancingComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Region response |  -  |
| **4XX** | Get Region response failure |  -  |

<a id="loadBalancerRegionsListRegions"></a>
# **loadBalancerRegionsListRegions**
> LoadBalancingRegionComponentsSchemasResponseCollection loadBalancerRegionsListRegions(accountId, subdivisionCode, subdivisionCodeA2, countryCodeA2)

List Regions

List all region mappings.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LoadBalancerRegionsApi;

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

    LoadBalancerRegionsApi apiInstance = new LoadBalancerRegionsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String subdivisionCode = "subdivisionCode_example"; // String | 
    String subdivisionCodeA2 = "subdivisionCodeA2_example"; // String | 
    String countryCodeA2 = "US"; // String | 
    try {
      LoadBalancingRegionComponentsSchemasResponseCollection result = apiInstance.loadBalancerRegionsListRegions(accountId, subdivisionCode, subdivisionCodeA2, countryCodeA2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerRegionsApi#loadBalancerRegionsListRegions");
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
| **subdivisionCode** | **String**|  | [optional] |
| **subdivisionCodeA2** | **String**|  | [optional] |
| **countryCodeA2** | **String**|  | [optional] |

### Return type

[**LoadBalancingRegionComponentsSchemasResponseCollection**](LoadBalancingRegionComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Regions response |  -  |
| **4XX** | List Regions response failure |  -  |

