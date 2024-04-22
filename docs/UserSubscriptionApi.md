# UserSubscriptionApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userSubscriptionDeleteUserSubscription**](UserSubscriptionApi.md#userSubscriptionDeleteUserSubscription) | **DELETE** /user/subscriptions/{identifier} | Delete User Subscription |
| [**userSubscriptionGetUserSubscriptions**](UserSubscriptionApi.md#userSubscriptionGetUserSubscriptions) | **GET** /user/subscriptions | Get User Subscriptions |
| [**userSubscriptionUpdateUserSubscription**](UserSubscriptionApi.md#userSubscriptionUpdateUserSubscription) | **PUT** /user/subscriptions/{identifier} | Update User Subscription |


<a id="userSubscriptionDeleteUserSubscription"></a>
# **userSubscriptionDeleteUserSubscription**
> AccountSubscriptionsDeleteSubscription200ResponseAllOfResult userSubscriptionDeleteUserSubscription(identifier)

Delete User Subscription

Deletes a user&#39;s subscription.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserSubscriptionApi;

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

    UserSubscriptionApi apiInstance = new UserSubscriptionApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccountSubscriptionsDeleteSubscription200ResponseAllOfResult result = apiInstance.userSubscriptionDeleteUserSubscription(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserSubscriptionApi#userSubscriptionDeleteUserSubscription");
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

[**AccountSubscriptionsDeleteSubscription200ResponseAllOfResult**](AccountSubscriptionsDeleteSubscription200ResponseAllOfResult.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete User Subscription response |  -  |
| **4XX** | Delete User Subscription response failure |  -  |

<a id="userSubscriptionGetUserSubscriptions"></a>
# **userSubscriptionGetUserSubscriptions**
> BillSubsApiUserSubscriptionResponseCollection userSubscriptionGetUserSubscriptions()

Get User Subscriptions

Lists all of a user&#39;s subscriptions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserSubscriptionApi;

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

    UserSubscriptionApi apiInstance = new UserSubscriptionApi(defaultClient);
    try {
      BillSubsApiUserSubscriptionResponseCollection result = apiInstance.userSubscriptionGetUserSubscriptions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserSubscriptionApi#userSubscriptionGetUserSubscriptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BillSubsApiUserSubscriptionResponseCollection**](BillSubsApiUserSubscriptionResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get User Subscriptions response |  -  |
| **4XX** | Get User Subscriptions response failure |  -  |

<a id="userSubscriptionUpdateUserSubscription"></a>
# **userSubscriptionUpdateUserSubscription**
> BillSubsApiUserSubscriptionResponseSingle userSubscriptionUpdateUserSubscription(identifier, billSubsApiSubscriptionV2)

Update User Subscription

Updates a user&#39;s subscriptions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserSubscriptionApi;

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

    UserSubscriptionApi apiInstance = new UserSubscriptionApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2 = new BillSubsApiSubscriptionV2(); // BillSubsApiSubscriptionV2 | 
    try {
      BillSubsApiUserSubscriptionResponseSingle result = apiInstance.userSubscriptionUpdateUserSubscription(identifier, billSubsApiSubscriptionV2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserSubscriptionApi#userSubscriptionUpdateUserSubscription");
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

[**BillSubsApiUserSubscriptionResponseSingle**](BillSubsApiUserSubscriptionResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update User Subscription response |  -  |
| **4XX** | Update User Subscription response failure |  -  |

