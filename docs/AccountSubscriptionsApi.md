# AccountSubscriptionsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountSubscriptionsCreateSubscription**](AccountSubscriptionsApi.md#accountSubscriptionsCreateSubscription) | **POST** /accounts/{account_identifier}/subscriptions | Create Subscription |
| [**accountSubscriptionsDeleteSubscription**](AccountSubscriptionsApi.md#accountSubscriptionsDeleteSubscription) | **DELETE** /accounts/{account_identifier}/subscriptions/{subscription_identifier} | Delete Subscription |
| [**accountSubscriptionsListSubscriptions**](AccountSubscriptionsApi.md#accountSubscriptionsListSubscriptions) | **GET** /accounts/{account_identifier}/subscriptions | List Subscriptions |
| [**accountSubscriptionsUpdateSubscription**](AccountSubscriptionsApi.md#accountSubscriptionsUpdateSubscription) | **PUT** /accounts/{account_identifier}/subscriptions/{subscription_identifier} | Update Subscription |


<a id="accountSubscriptionsCreateSubscription"></a>
# **accountSubscriptionsCreateSubscription**
> BillSubsApiAccountSubscriptionResponseSingle accountSubscriptionsCreateSubscription(accountIdentifier, billSubsApiSubscriptionV2)

Create Subscription

Creates an account subscription.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountSubscriptionsApi;

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

    AccountSubscriptionsApi apiInstance = new AccountSubscriptionsApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2 = new BillSubsApiSubscriptionV2(); // BillSubsApiSubscriptionV2 | 
    try {
      BillSubsApiAccountSubscriptionResponseSingle result = apiInstance.accountSubscriptionsCreateSubscription(accountIdentifier, billSubsApiSubscriptionV2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountSubscriptionsApi#accountSubscriptionsCreateSubscription");
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
| **accountIdentifier** | **String**|  | |
| **billSubsApiSubscriptionV2** | [**BillSubsApiSubscriptionV2**](BillSubsApiSubscriptionV2.md)|  | |

### Return type

[**BillSubsApiAccountSubscriptionResponseSingle**](BillSubsApiAccountSubscriptionResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Subscription response |  -  |
| **4XX** | Create Subscription response failure |  -  |

<a id="accountSubscriptionsDeleteSubscription"></a>
# **accountSubscriptionsDeleteSubscription**
> AccountSubscriptionsDeleteSubscription200Response accountSubscriptionsDeleteSubscription(subscriptionIdentifier, accountIdentifier)

Delete Subscription

Deletes an account&#39;s subscription.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountSubscriptionsApi;

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

    AccountSubscriptionsApi apiInstance = new AccountSubscriptionsApi(defaultClient);
    String subscriptionIdentifier = "subscriptionIdentifier_example"; // String | 
    String accountIdentifier = "accountIdentifier_example"; // String | 
    try {
      AccountSubscriptionsDeleteSubscription200Response result = apiInstance.accountSubscriptionsDeleteSubscription(subscriptionIdentifier, accountIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountSubscriptionsApi#accountSubscriptionsDeleteSubscription");
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
| **subscriptionIdentifier** | **String**|  | |
| **accountIdentifier** | **String**|  | |

### Return type

[**AccountSubscriptionsDeleteSubscription200Response**](AccountSubscriptionsDeleteSubscription200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Subscription response |  -  |
| **4XX** | Delete Subscription response failure |  -  |

<a id="accountSubscriptionsListSubscriptions"></a>
# **accountSubscriptionsListSubscriptions**
> BillSubsApiAccountSubscriptionResponseCollection accountSubscriptionsListSubscriptions(accountIdentifier)

List Subscriptions

Lists all of an account&#39;s subscriptions.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountSubscriptionsApi;

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

    AccountSubscriptionsApi apiInstance = new AccountSubscriptionsApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    try {
      BillSubsApiAccountSubscriptionResponseCollection result = apiInstance.accountSubscriptionsListSubscriptions(accountIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountSubscriptionsApi#accountSubscriptionsListSubscriptions");
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
| **accountIdentifier** | **String**|  | |

### Return type

[**BillSubsApiAccountSubscriptionResponseCollection**](BillSubsApiAccountSubscriptionResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Subscriptions response |  -  |
| **4XX** | List Subscriptions response failure |  -  |

<a id="accountSubscriptionsUpdateSubscription"></a>
# **accountSubscriptionsUpdateSubscription**
> BillSubsApiAccountSubscriptionResponseSingle accountSubscriptionsUpdateSubscription(subscriptionIdentifier, accountIdentifier, billSubsApiSubscriptionV2)

Update Subscription

Updates an account subscription.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountSubscriptionsApi;

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

    AccountSubscriptionsApi apiInstance = new AccountSubscriptionsApi(defaultClient);
    String subscriptionIdentifier = "subscriptionIdentifier_example"; // String | 
    String accountIdentifier = "accountIdentifier_example"; // String | 
    BillSubsApiSubscriptionV2 billSubsApiSubscriptionV2 = new BillSubsApiSubscriptionV2(); // BillSubsApiSubscriptionV2 | 
    try {
      BillSubsApiAccountSubscriptionResponseSingle result = apiInstance.accountSubscriptionsUpdateSubscription(subscriptionIdentifier, accountIdentifier, billSubsApiSubscriptionV2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountSubscriptionsApi#accountSubscriptionsUpdateSubscription");
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
| **subscriptionIdentifier** | **String**|  | |
| **accountIdentifier** | **String**|  | |
| **billSubsApiSubscriptionV2** | [**BillSubsApiSubscriptionV2**](BillSubsApiSubscriptionV2.md)|  | |

### Return type

[**BillSubsApiAccountSubscriptionResponseSingle**](BillSubsApiAccountSubscriptionResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Subscription response |  -  |
| **4XX** | Update Subscription response failure |  -  |

