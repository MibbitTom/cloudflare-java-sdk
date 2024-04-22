# CustomPagesForAnAccountApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customPagesForAnAccountGetACustomPage**](CustomPagesForAnAccountApi.md#customPagesForAnAccountGetACustomPage) | **GET** /accounts/{account_identifier}/custom_pages/{identifier} | Get a custom page |
| [**customPagesForAnAccountListCustomPages**](CustomPagesForAnAccountApi.md#customPagesForAnAccountListCustomPages) | **GET** /accounts/{account_identifier}/custom_pages | List custom pages |
| [**customPagesForAnAccountUpdateACustomPage**](CustomPagesForAnAccountApi.md#customPagesForAnAccountUpdateACustomPage) | **PUT** /accounts/{account_identifier}/custom_pages/{identifier} | Update a custom page |


<a id="customPagesForAnAccountGetACustomPage"></a>
# **customPagesForAnAccountGetACustomPage**
> CustomPagesCustomPagesResponseSingle customPagesForAnAccountGetACustomPage(identifier, accountIdentifier)

Get a custom page

Fetches the details of a custom page.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CustomPagesForAnAccountApi;

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

    CustomPagesForAnAccountApi apiInstance = new CustomPagesForAnAccountApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String accountIdentifier = "accountIdentifier_example"; // String | 
    try {
      CustomPagesCustomPagesResponseSingle result = apiInstance.customPagesForAnAccountGetACustomPage(identifier, accountIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomPagesForAnAccountApi#customPagesForAnAccountGetACustomPage");
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
| **accountIdentifier** | **String**|  | |

### Return type

[**CustomPagesCustomPagesResponseSingle**](CustomPagesCustomPagesResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a custom page response |  -  |
| **4xx** | Get a custom page response failure |  -  |

<a id="customPagesForAnAccountListCustomPages"></a>
# **customPagesForAnAccountListCustomPages**
> CustomPagesCustomPagesResponseCollection customPagesForAnAccountListCustomPages(accountIdentifier)

List custom pages

Fetches all the custom pages at the account level.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CustomPagesForAnAccountApi;

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

    CustomPagesForAnAccountApi apiInstance = new CustomPagesForAnAccountApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    try {
      CustomPagesCustomPagesResponseCollection result = apiInstance.customPagesForAnAccountListCustomPages(accountIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomPagesForAnAccountApi#customPagesForAnAccountListCustomPages");
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

[**CustomPagesCustomPagesResponseCollection**](CustomPagesCustomPagesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List custom pages response |  -  |
| **4xx** | List custom pages response failure |  -  |

<a id="customPagesForAnAccountUpdateACustomPage"></a>
# **customPagesForAnAccountUpdateACustomPage**
> CustomPagesCustomPagesResponseSingle customPagesForAnAccountUpdateACustomPage(identifier, accountIdentifier, customPagesForAnAccountUpdateACustomPageRequest)

Update a custom page

Updates the configuration of an existing custom page.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CustomPagesForAnAccountApi;

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

    CustomPagesForAnAccountApi apiInstance = new CustomPagesForAnAccountApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String accountIdentifier = "accountIdentifier_example"; // String | 
    CustomPagesForAnAccountUpdateACustomPageRequest customPagesForAnAccountUpdateACustomPageRequest = new CustomPagesForAnAccountUpdateACustomPageRequest(); // CustomPagesForAnAccountUpdateACustomPageRequest | 
    try {
      CustomPagesCustomPagesResponseSingle result = apiInstance.customPagesForAnAccountUpdateACustomPage(identifier, accountIdentifier, customPagesForAnAccountUpdateACustomPageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomPagesForAnAccountApi#customPagesForAnAccountUpdateACustomPage");
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
| **accountIdentifier** | **String**|  | |
| **customPagesForAnAccountUpdateACustomPageRequest** | [**CustomPagesForAnAccountUpdateACustomPageRequest**](CustomPagesForAnAccountUpdateACustomPageRequest.md)|  | |

### Return type

[**CustomPagesCustomPagesResponseSingle**](CustomPagesCustomPagesResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a custom page response |  -  |
| **4xx** | Update a custom page response failure |  -  |

