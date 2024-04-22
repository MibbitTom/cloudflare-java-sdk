# ZoneSubscriptionApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneSubscriptionCreateZoneSubscription**](ZoneSubscriptionApi.md#zoneSubscriptionCreateZoneSubscription) | **POST** /zones/{identifier}/subscription | Create Zone Subscription |
| [**zoneSubscriptionUpdateZoneSubscription**](ZoneSubscriptionApi.md#zoneSubscriptionUpdateZoneSubscription) | **PUT** /zones/{identifier}/subscription | Update Zone Subscription |
| [**zoneSubscriptionZoneSubscriptionDetails**](ZoneSubscriptionApi.md#zoneSubscriptionZoneSubscriptionDetails) | **GET** /zones/{identifier}/subscription | Zone Subscription Details |


<a id="zoneSubscriptionCreateZoneSubscription"></a>
# **zoneSubscriptionCreateZoneSubscription**
> BillSubsApiZoneSubscriptionResponseSingle zoneSubscriptionCreateZoneSubscription(identifier, billSubsApiSubscriptionV2)

Create Zone Subscription

Create a zone subscription, either plan or add-ons.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneSubscriptionApi;

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

    ZoneSubscriptionApi apiInstance = new ZoneSubscriptionApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2 = new BillSubsApiSubscriptionV2(); // BillSubsApiSubscriptionV2 | 
    try {
      BillSubsApiZoneSubscriptionResponseSingle result = apiInstance.zoneSubscriptionCreateZoneSubscription(identifier, billSubsApiSubscriptionV2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSubscriptionApi#zoneSubscriptionCreateZoneSubscription");
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
| **identifier** | **String**|  | |
| **billSubsApiSubscriptionV2** | [**BillSubsApiSubscriptionV2**](BillSubsApiSubscriptionV2.md)|  | |

### Return type

[**BillSubsApiZoneSubscriptionResponseSingle**](BillSubsApiZoneSubscriptionResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Zone Subscription response |  -  |
| **4XX** | Create Zone Subscription response failure |  -  |

<a id="zoneSubscriptionUpdateZoneSubscription"></a>
# **zoneSubscriptionUpdateZoneSubscription**
> BillSubsApiZoneSubscriptionResponseSingle zoneSubscriptionUpdateZoneSubscription(identifier, billSubsApiSubscriptionV2)

Update Zone Subscription

Updates zone subscriptions, either plan or add-ons.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneSubscriptionApi;

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

    ZoneSubscriptionApi apiInstance = new ZoneSubscriptionApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2 = new BillSubsApiSubscriptionV2(); // BillSubsApiSubscriptionV2 | 
    try {
      BillSubsApiZoneSubscriptionResponseSingle result = apiInstance.zoneSubscriptionUpdateZoneSubscription(identifier, billSubsApiSubscriptionV2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSubscriptionApi#zoneSubscriptionUpdateZoneSubscription");
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
| **identifier** | **String**|  | |
| **billSubsApiSubscriptionV2** | [**BillSubsApiSubscriptionV2**](BillSubsApiSubscriptionV2.md)|  | |

### Return type

[**BillSubsApiZoneSubscriptionResponseSingle**](BillSubsApiZoneSubscriptionResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Zone Subscription response |  -  |
| **4XX** | Update Zone Subscription response failure |  -  |

<a id="zoneSubscriptionZoneSubscriptionDetails"></a>
# **zoneSubscriptionZoneSubscriptionDetails**
> BillSubsApiZoneSubscriptionResponseSingle zoneSubscriptionZoneSubscriptionDetails(identifier)

Zone Subscription Details

Lists zone subscription details.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneSubscriptionApi;

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

    ZoneSubscriptionApi apiInstance = new ZoneSubscriptionApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      BillSubsApiZoneSubscriptionResponseSingle result = apiInstance.zoneSubscriptionZoneSubscriptionDetails(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSubscriptionApi#zoneSubscriptionZoneSubscriptionDetails");
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
| **identifier** | **String**|  | |

### Return type

[**BillSubsApiZoneSubscriptionResponseSingle**](BillSubsApiZoneSubscriptionResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Zone Subscription Details response |  -  |
| **4XX** | Zone Subscription Details response failure |  -  |

