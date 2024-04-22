# CustomPagesForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customPagesForAZoneGetACustomPage**](CustomPagesForAZoneApi.md#customPagesForAZoneGetACustomPage) | **GET** /zones/{zone_identifier}/custom_pages/{identifier} | Get a custom page |
| [**customPagesForAZoneListCustomPages**](CustomPagesForAZoneApi.md#customPagesForAZoneListCustomPages) | **GET** /zones/{zone_identifier}/custom_pages | List custom pages |
| [**customPagesForAZoneUpdateACustomPage**](CustomPagesForAZoneApi.md#customPagesForAZoneUpdateACustomPage) | **PUT** /zones/{zone_identifier}/custom_pages/{identifier} | Update a custom page |


<a id="customPagesForAZoneGetACustomPage"></a>
# **customPagesForAZoneGetACustomPage**
> CustomPagesCustomPagesResponseSingle customPagesForAZoneGetACustomPage(identifier, zoneIdentifier)

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
import cloudflare.sdk.CustomPagesForAZoneApi;

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

    CustomPagesForAZoneApi apiInstance = new CustomPagesForAZoneApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      CustomPagesCustomPagesResponseSingle result = apiInstance.customPagesForAZoneGetACustomPage(identifier, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomPagesForAZoneApi#customPagesForAZoneGetACustomPage");
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
| **zoneIdentifier** | **String**|  | |

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

<a id="customPagesForAZoneListCustomPages"></a>
# **customPagesForAZoneListCustomPages**
> CustomPagesCustomPagesResponseCollection customPagesForAZoneListCustomPages(zoneIdentifier)

List custom pages

Fetches all the custom pages at the zone level.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CustomPagesForAZoneApi;

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

    CustomPagesForAZoneApi apiInstance = new CustomPagesForAZoneApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      CustomPagesCustomPagesResponseCollection result = apiInstance.customPagesForAZoneListCustomPages(zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomPagesForAZoneApi#customPagesForAZoneListCustomPages");
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

<a id="customPagesForAZoneUpdateACustomPage"></a>
# **customPagesForAZoneUpdateACustomPage**
> CustomPagesCustomPagesResponseSingle customPagesForAZoneUpdateACustomPage(identifier, zoneIdentifier, customPagesForAnAccountUpdateACustomPageRequest)

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
import cloudflare.sdk.CustomPagesForAZoneApi;

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

    CustomPagesForAZoneApi apiInstance = new CustomPagesForAZoneApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    CustomPagesForAnAccountUpdateACustomPageRequest customPagesForAnAccountUpdateACustomPageRequest = new CustomPagesForAnAccountUpdateACustomPageRequest(); // CustomPagesForAnAccountUpdateACustomPageRequest | 
    try {
      CustomPagesCustomPagesResponseSingle result = apiInstance.customPagesForAZoneUpdateACustomPage(identifier, zoneIdentifier, customPagesForAnAccountUpdateACustomPageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomPagesForAZoneApi#customPagesForAZoneUpdateACustomPage");
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
| **zoneIdentifier** | **String**|  | |
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

