# NotificationPoliciesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notificationPoliciesCreateANotificationPolicy**](NotificationPoliciesApi.md#notificationPoliciesCreateANotificationPolicy) | **POST** /accounts/{account_id}/alerting/v3/policies | Create a Notification policy |
| [**notificationPoliciesDeleteANotificationPolicy**](NotificationPoliciesApi.md#notificationPoliciesDeleteANotificationPolicy) | **DELETE** /accounts/{account_id}/alerting/v3/policies/{policy_id} | Delete a Notification policy |
| [**notificationPoliciesGetANotificationPolicy**](NotificationPoliciesApi.md#notificationPoliciesGetANotificationPolicy) | **GET** /accounts/{account_id}/alerting/v3/policies/{policy_id} | Get a Notification policy |
| [**notificationPoliciesListNotificationPolicies**](NotificationPoliciesApi.md#notificationPoliciesListNotificationPolicies) | **GET** /accounts/{account_id}/alerting/v3/policies | List Notification policies |
| [**notificationPoliciesUpdateANotificationPolicy**](NotificationPoliciesApi.md#notificationPoliciesUpdateANotificationPolicy) | **PUT** /accounts/{account_id}/alerting/v3/policies/{policy_id} | Update a Notification policy |


<a id="notificationPoliciesCreateANotificationPolicy"></a>
# **notificationPoliciesCreateANotificationPolicy**
> AaaIdResponse notificationPoliciesCreateANotificationPolicy(accountId, notificationPoliciesCreateANotificationPolicyRequest)

Create a Notification policy

Creates a new Notification policy.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.NotificationPoliciesApi;

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

    NotificationPoliciesApi apiInstance = new NotificationPoliciesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    NotificationPoliciesCreateANotificationPolicyRequest notificationPoliciesCreateANotificationPolicyRequest = new NotificationPoliciesCreateANotificationPolicyRequest(); // NotificationPoliciesCreateANotificationPolicyRequest | 
    try {
      AaaIdResponse result = apiInstance.notificationPoliciesCreateANotificationPolicy(accountId, notificationPoliciesCreateANotificationPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationPoliciesApi#notificationPoliciesCreateANotificationPolicy");
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
| **notificationPoliciesCreateANotificationPolicyRequest** | [**NotificationPoliciesCreateANotificationPolicyRequest**](NotificationPoliciesCreateANotificationPolicyRequest.md)|  | |

### Return type

[**AaaIdResponse**](AaaIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a Notification policy response |  -  |
| **4XX** | Create a Notification policy response failure |  -  |

<a id="notificationPoliciesDeleteANotificationPolicy"></a>
# **notificationPoliciesDeleteANotificationPolicy**
> AaaApiResponseCollection notificationPoliciesDeleteANotificationPolicy(accountId, policyId)

Delete a Notification policy

Delete a Notification policy.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.NotificationPoliciesApi;

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

    NotificationPoliciesApi apiInstance = new NotificationPoliciesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String policyId = "policyId_example"; // String | 
    try {
      AaaApiResponseCollection result = apiInstance.notificationPoliciesDeleteANotificationPolicy(accountId, policyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationPoliciesApi#notificationPoliciesDeleteANotificationPolicy");
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
| **policyId** | **String**|  | |

### Return type

[**AaaApiResponseCollection**](AaaApiResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a Notification policy response |  -  |
| **4XX** | Delete a Notification policy response failure |  -  |

<a id="notificationPoliciesGetANotificationPolicy"></a>
# **notificationPoliciesGetANotificationPolicy**
> AaaSingleResponse notificationPoliciesGetANotificationPolicy(accountId, policyId)

Get a Notification policy

Get details for a single policy.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.NotificationPoliciesApi;

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

    NotificationPoliciesApi apiInstance = new NotificationPoliciesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String policyId = "policyId_example"; // String | 
    try {
      AaaSingleResponse result = apiInstance.notificationPoliciesGetANotificationPolicy(accountId, policyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationPoliciesApi#notificationPoliciesGetANotificationPolicy");
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
| **policyId** | **String**|  | |

### Return type

[**AaaSingleResponse**](AaaSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a Notification policy response |  -  |
| **4XX** | Get a Notification policy response failure |  -  |

<a id="notificationPoliciesListNotificationPolicies"></a>
# **notificationPoliciesListNotificationPolicies**
> AaaPoliciesComponentsSchemasResponseCollection notificationPoliciesListNotificationPolicies(accountId)

List Notification policies

Get a list of all Notification policies.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.NotificationPoliciesApi;

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

    NotificationPoliciesApi apiInstance = new NotificationPoliciesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      AaaPoliciesComponentsSchemasResponseCollection result = apiInstance.notificationPoliciesListNotificationPolicies(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationPoliciesApi#notificationPoliciesListNotificationPolicies");
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

### Return type

[**AaaPoliciesComponentsSchemasResponseCollection**](AaaPoliciesComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Notification policies response |  -  |
| **4XX** | List Notification policies response failure |  -  |

<a id="notificationPoliciesUpdateANotificationPolicy"></a>
# **notificationPoliciesUpdateANotificationPolicy**
> AaaIdResponse notificationPoliciesUpdateANotificationPolicy(accountId, policyId, notificationPoliciesUpdateANotificationPolicyRequest)

Update a Notification policy

Update a Notification policy.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.NotificationPoliciesApi;

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

    NotificationPoliciesApi apiInstance = new NotificationPoliciesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String policyId = "policyId_example"; // String | 
    NotificationPoliciesUpdateANotificationPolicyRequest notificationPoliciesUpdateANotificationPolicyRequest = new NotificationPoliciesUpdateANotificationPolicyRequest(); // NotificationPoliciesUpdateANotificationPolicyRequest | 
    try {
      AaaIdResponse result = apiInstance.notificationPoliciesUpdateANotificationPolicy(accountId, policyId, notificationPoliciesUpdateANotificationPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationPoliciesApi#notificationPoliciesUpdateANotificationPolicy");
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
| **policyId** | **String**|  | |
| **notificationPoliciesUpdateANotificationPolicyRequest** | [**NotificationPoliciesUpdateANotificationPolicyRequest**](NotificationPoliciesUpdateANotificationPolicyRequest.md)|  | |

### Return type

[**AaaIdResponse**](AaaIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a Notification policy response |  -  |
| **4XX** | Update a Notification policy response failure |  -  |

