# ZoneRatePlanApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneRatePlanAvailablePlanDetails**](ZoneRatePlanApi.md#zoneRatePlanAvailablePlanDetails) | **GET** /zones/{zone_identifier}/available_plans/{plan_identifier} | Available Plan Details |
| [**zoneRatePlanListAvailablePlans**](ZoneRatePlanApi.md#zoneRatePlanListAvailablePlans) | **GET** /zones/{zone_identifier}/available_plans | List Available Plans |
| [**zoneRatePlanListAvailableRatePlans**](ZoneRatePlanApi.md#zoneRatePlanListAvailableRatePlans) | **GET** /zones/{zone_identifier}/available_rate_plans | List Available Rate Plans |


<a id="zoneRatePlanAvailablePlanDetails"></a>
# **zoneRatePlanAvailablePlanDetails**
> ZoneRatePlanAvailablePlanDetails200Response zoneRatePlanAvailablePlanDetails(planIdentifier, zoneIdentifier)

Available Plan Details

Details of the available plan that the zone can subscribe to.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRatePlanApi;

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

    ZoneRatePlanApi apiInstance = new ZoneRatePlanApi(defaultClient);
    String planIdentifier = "planIdentifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      ZoneRatePlanAvailablePlanDetails200Response result = apiInstance.zoneRatePlanAvailablePlanDetails(planIdentifier, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRatePlanApi#zoneRatePlanAvailablePlanDetails");
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
| **planIdentifier** | **String**|  | |
| **zoneIdentifier** | **String**|  | |

### Return type

[**ZoneRatePlanAvailablePlanDetails200Response**](ZoneRatePlanAvailablePlanDetails200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Available Plan Details response |  -  |
| **4XX** | Available Plan Details response failure |  -  |

<a id="zoneRatePlanListAvailablePlans"></a>
# **zoneRatePlanListAvailablePlans**
> ZoneRatePlanListAvailablePlans200Response zoneRatePlanListAvailablePlans(zoneIdentifier)

List Available Plans

Lists available plans the zone can subscribe to.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRatePlanApi;

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

    ZoneRatePlanApi apiInstance = new ZoneRatePlanApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      ZoneRatePlanListAvailablePlans200Response result = apiInstance.zoneRatePlanListAvailablePlans(zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRatePlanApi#zoneRatePlanListAvailablePlans");
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

[**ZoneRatePlanListAvailablePlans200Response**](ZoneRatePlanListAvailablePlans200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Available Plans response |  -  |
| **4XX** | List Available Plans response failure |  -  |

<a id="zoneRatePlanListAvailableRatePlans"></a>
# **zoneRatePlanListAvailableRatePlans**
> BillSubsApiPlanResponseCollection zoneRatePlanListAvailableRatePlans(zoneIdentifier)

List Available Rate Plans

Lists all rate plans the zone can subscribe to.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRatePlanApi;

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

    ZoneRatePlanApi apiInstance = new ZoneRatePlanApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      BillSubsApiPlanResponseCollection result = apiInstance.zoneRatePlanListAvailableRatePlans(zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRatePlanApi#zoneRatePlanListAvailableRatePlans");
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

[**BillSubsApiPlanResponseCollection**](BillSubsApiPlanResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Available Rate Plans response |  -  |
| **4XX** | List Available Rate Plans response failure |  -  |

