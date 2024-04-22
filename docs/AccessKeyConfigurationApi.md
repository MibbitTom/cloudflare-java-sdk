# AccessKeyConfigurationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accessKeyConfigurationGetTheAccessKeyConfiguration**](AccessKeyConfigurationApi.md#accessKeyConfigurationGetTheAccessKeyConfiguration) | **GET** /accounts/{identifier}/access/keys | Get the Access key configuration |
| [**accessKeyConfigurationRotateAccessKeys**](AccessKeyConfigurationApi.md#accessKeyConfigurationRotateAccessKeys) | **POST** /accounts/{identifier}/access/keys/rotate | Rotate Access keys |
| [**accessKeyConfigurationUpdateTheAccessKeyConfiguration**](AccessKeyConfigurationApi.md#accessKeyConfigurationUpdateTheAccessKeyConfiguration) | **PUT** /accounts/{identifier}/access/keys | Update the Access key configuration |


<a id="accessKeyConfigurationGetTheAccessKeyConfiguration"></a>
# **accessKeyConfigurationGetTheAccessKeyConfiguration**
> AccessKeysComponentsSchemasSingleResponse accessKeyConfigurationGetTheAccessKeyConfiguration(identifier)

Get the Access key configuration

Gets the Access key rotation settings for an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessKeyConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    AccessKeyConfigurationApi apiInstance = new AccessKeyConfigurationApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessKeysComponentsSchemasSingleResponse result = apiInstance.accessKeyConfigurationGetTheAccessKeyConfiguration(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessKeyConfigurationApi#accessKeyConfigurationGetTheAccessKeyConfiguration");
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

[**AccessKeysComponentsSchemasSingleResponse**](AccessKeysComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the Access key configuration response |  -  |
| **4XX** | Get the Access key configuration response failure |  -  |

<a id="accessKeyConfigurationRotateAccessKeys"></a>
# **accessKeyConfigurationRotateAccessKeys**
> AccessKeysComponentsSchemasSingleResponse accessKeyConfigurationRotateAccessKeys(identifier)

Rotate Access keys

Perfoms a key rotation for an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessKeyConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    AccessKeyConfigurationApi apiInstance = new AccessKeyConfigurationApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessKeysComponentsSchemasSingleResponse result = apiInstance.accessKeyConfigurationRotateAccessKeys(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessKeyConfigurationApi#accessKeyConfigurationRotateAccessKeys");
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

[**AccessKeysComponentsSchemasSingleResponse**](AccessKeysComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rotate Access keys response |  -  |
| **4XX** | Rotate Access keys response failure |  -  |

<a id="accessKeyConfigurationUpdateTheAccessKeyConfiguration"></a>
# **accessKeyConfigurationUpdateTheAccessKeyConfiguration**
> AccessKeysComponentsSchemasSingleResponse accessKeyConfigurationUpdateTheAccessKeyConfiguration(identifier, accessKeyConfigurationUpdateTheAccessKeyConfigurationRequest)

Update the Access key configuration

Updates the Access key rotation settings for an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessKeyConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    AccessKeyConfigurationApi apiInstance = new AccessKeyConfigurationApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    AccessKeyConfigurationUpdateTheAccessKeyConfigurationRequest accessKeyConfigurationUpdateTheAccessKeyConfigurationRequest = new AccessKeyConfigurationUpdateTheAccessKeyConfigurationRequest(); // AccessKeyConfigurationUpdateTheAccessKeyConfigurationRequest | 
    try {
      AccessKeysComponentsSchemasSingleResponse result = apiInstance.accessKeyConfigurationUpdateTheAccessKeyConfiguration(identifier, accessKeyConfigurationUpdateTheAccessKeyConfigurationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessKeyConfigurationApi#accessKeyConfigurationUpdateTheAccessKeyConfiguration");
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
| **accessKeyConfigurationUpdateTheAccessKeyConfigurationRequest** | [**AccessKeyConfigurationUpdateTheAccessKeyConfigurationRequest**](AccessKeyConfigurationUpdateTheAccessKeyConfigurationRequest.md)|  | |

### Return type

[**AccessKeysComponentsSchemasSingleResponse**](AccessKeysComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update the Access key configuration response |  -  |
| **4XX** | Update the Access key configuration response failure |  -  |

