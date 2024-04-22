# TurnstileApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountsTurnstileWidgetCreate**](TurnstileApi.md#accountsTurnstileWidgetCreate) | **POST** /accounts/{account_id}/challenges/widgets | Create a Turnstile Widget |
| [**accountsTurnstileWidgetDelete**](TurnstileApi.md#accountsTurnstileWidgetDelete) | **DELETE** /accounts/{account_id}/challenges/widgets/{sitekey} | Delete a Turnstile Widget |
| [**accountsTurnstileWidgetGet**](TurnstileApi.md#accountsTurnstileWidgetGet) | **GET** /accounts/{account_id}/challenges/widgets/{sitekey} | Turnstile Widget Details |
| [**accountsTurnstileWidgetRotateSecret**](TurnstileApi.md#accountsTurnstileWidgetRotateSecret) | **POST** /accounts/{account_id}/challenges/widgets/{sitekey}/rotate_secret | Rotate Secret for a Turnstile Widget |
| [**accountsTurnstileWidgetUpdate**](TurnstileApi.md#accountsTurnstileWidgetUpdate) | **PUT** /accounts/{account_id}/challenges/widgets/{sitekey} | Update a Turnstile Widget |
| [**accountsTurnstileWidgetsList**](TurnstileApi.md#accountsTurnstileWidgetsList) | **GET** /accounts/{account_id}/challenges/widgets | List Turnstile Widgets |


<a id="accountsTurnstileWidgetCreate"></a>
# **accountsTurnstileWidgetCreate**
> AccountsTurnstileWidgetCreate200Response accountsTurnstileWidgetCreate(accountId, accountsTurnstileWidgetCreateRequest, page, perPage, order, direction)

Create a Turnstile Widget

Lists challenge widgets.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TurnstileApi;

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

    TurnstileApi apiInstance = new TurnstileApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    AccountsTurnstileWidgetCreateRequest accountsTurnstileWidgetCreateRequest = new AccountsTurnstileWidgetCreateRequest(); // AccountsTurnstileWidgetCreateRequest | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("25"); // BigDecimal | 
    String order = "id"; // String | 
    String direction = "asc"; // String | 
    try {
      AccountsTurnstileWidgetCreate200Response result = apiInstance.accountsTurnstileWidgetCreate(accountId, accountsTurnstileWidgetCreateRequest, page, perPage, order, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TurnstileApi#accountsTurnstileWidgetCreate");
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
| **accountsTurnstileWidgetCreateRequest** | [**AccountsTurnstileWidgetCreateRequest**](AccountsTurnstileWidgetCreateRequest.md)|  | |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 25] |
| **order** | **String**|  | [optional] [enum: id, sitekey, name, created_on, modified_on] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |

### Return type

[**AccountsTurnstileWidgetCreate200Response**](AccountsTurnstileWidgetCreate200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Turnstile Widget Response |  -  |
| **4XX** | Create Turnstile Widget Response Error |  -  |

<a id="accountsTurnstileWidgetDelete"></a>
# **accountsTurnstileWidgetDelete**
> AccountsTurnstileWidgetGet200Response accountsTurnstileWidgetDelete(accountId, sitekey)

Delete a Turnstile Widget

Destroy a Turnstile Widget.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TurnstileApi;

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

    TurnstileApi apiInstance = new TurnstileApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String sitekey = "sitekey_example"; // String | 
    try {
      AccountsTurnstileWidgetGet200Response result = apiInstance.accountsTurnstileWidgetDelete(accountId, sitekey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TurnstileApi#accountsTurnstileWidgetDelete");
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
| **sitekey** | **String**|  | |

### Return type

[**AccountsTurnstileWidgetGet200Response**](AccountsTurnstileWidgetGet200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Turnstile Widget Response |  -  |
| **4XX** | Delete Turnstile Widget Response |  -  |

<a id="accountsTurnstileWidgetGet"></a>
# **accountsTurnstileWidgetGet**
> AccountsTurnstileWidgetGet200Response accountsTurnstileWidgetGet(accountId, sitekey)

Turnstile Widget Details

Show a single challenge widget configuration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TurnstileApi;

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

    TurnstileApi apiInstance = new TurnstileApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String sitekey = "sitekey_example"; // String | 
    try {
      AccountsTurnstileWidgetGet200Response result = apiInstance.accountsTurnstileWidgetGet(accountId, sitekey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TurnstileApi#accountsTurnstileWidgetGet");
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
| **sitekey** | **String**|  | |

### Return type

[**AccountsTurnstileWidgetGet200Response**](AccountsTurnstileWidgetGet200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Turnstile Widget Details Response |  -  |
| **4XX** | Turnstile Widget Details Response Error |  -  |

<a id="accountsTurnstileWidgetRotateSecret"></a>
# **accountsTurnstileWidgetRotateSecret**
> AccountsTurnstileWidgetGet200Response accountsTurnstileWidgetRotateSecret(accountId, sitekey, accountsTurnstileWidgetRotateSecretRequest)

Rotate Secret for a Turnstile Widget

Generate a new secret key for this widget. If &#x60;invalidate_immediately&#x60; is set to &#x60;false&#x60;, the previous secret remains valid for 2 hours.  Note that secrets cannot be rotated again during the grace period. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TurnstileApi;

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

    TurnstileApi apiInstance = new TurnstileApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String sitekey = "sitekey_example"; // String | 
    AccountsTurnstileWidgetRotateSecretRequest accountsTurnstileWidgetRotateSecretRequest = new AccountsTurnstileWidgetRotateSecretRequest(); // AccountsTurnstileWidgetRotateSecretRequest | 
    try {
      AccountsTurnstileWidgetGet200Response result = apiInstance.accountsTurnstileWidgetRotateSecret(accountId, sitekey, accountsTurnstileWidgetRotateSecretRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TurnstileApi#accountsTurnstileWidgetRotateSecret");
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
| **sitekey** | **String**|  | |
| **accountsTurnstileWidgetRotateSecretRequest** | [**AccountsTurnstileWidgetRotateSecretRequest**](AccountsTurnstileWidgetRotateSecretRequest.md)|  | |

### Return type

[**AccountsTurnstileWidgetGet200Response**](AccountsTurnstileWidgetGet200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rotate Secret Response |  -  |
| **4XX** | Rotate Secret Response Error |  -  |

<a id="accountsTurnstileWidgetUpdate"></a>
# **accountsTurnstileWidgetUpdate**
> AccountsTurnstileWidgetGet200Response accountsTurnstileWidgetUpdate(accountId, sitekey, accountsTurnstileWidgetUpdateRequest)

Update a Turnstile Widget

Update the configuration of a widget.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TurnstileApi;

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

    TurnstileApi apiInstance = new TurnstileApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String sitekey = "sitekey_example"; // String | 
    AccountsTurnstileWidgetUpdateRequest accountsTurnstileWidgetUpdateRequest = new AccountsTurnstileWidgetUpdateRequest(); // AccountsTurnstileWidgetUpdateRequest | 
    try {
      AccountsTurnstileWidgetGet200Response result = apiInstance.accountsTurnstileWidgetUpdate(accountId, sitekey, accountsTurnstileWidgetUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TurnstileApi#accountsTurnstileWidgetUpdate");
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
| **sitekey** | **String**|  | |
| **accountsTurnstileWidgetUpdateRequest** | [**AccountsTurnstileWidgetUpdateRequest**](AccountsTurnstileWidgetUpdateRequest.md)|  | |

### Return type

[**AccountsTurnstileWidgetGet200Response**](AccountsTurnstileWidgetGet200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Turnstile Widget Response |  -  |
| **4XX** | Update Turnstile Widget Response Error |  -  |

<a id="accountsTurnstileWidgetsList"></a>
# **accountsTurnstileWidgetsList**
> AccountsTurnstileWidgetsList200Response accountsTurnstileWidgetsList(accountId, page, perPage, order, direction)

List Turnstile Widgets

Lists all turnstile widgets of an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TurnstileApi;

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

    TurnstileApi apiInstance = new TurnstileApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("25"); // BigDecimal | 
    String order = "id"; // String | 
    String direction = "asc"; // String | 
    try {
      AccountsTurnstileWidgetsList200Response result = apiInstance.accountsTurnstileWidgetsList(accountId, page, perPage, order, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TurnstileApi#accountsTurnstileWidgetsList");
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
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 25] |
| **order** | **String**|  | [optional] [enum: id, sitekey, name, created_on, modified_on] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |

### Return type

[**AccountsTurnstileWidgetsList200Response**](AccountsTurnstileWidgetsList200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Turnstile Widgets |  -  |
| **4XX** | List Turnstile Widgets Error |  -  |

