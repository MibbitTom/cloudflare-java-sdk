# EmailRoutingSettingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**emailRoutingSettingsDisableEmailRouting**](EmailRoutingSettingsApi.md#emailRoutingSettingsDisableEmailRouting) | **POST** /zones/{zone_identifier}/email/routing/disable | Disable Email Routing |
| [**emailRoutingSettingsEmailRoutingDnsSettings**](EmailRoutingSettingsApi.md#emailRoutingSettingsEmailRoutingDnsSettings) | **GET** /zones/{zone_identifier}/email/routing/dns | Email Routing - DNS settings |
| [**emailRoutingSettingsEnableEmailRouting**](EmailRoutingSettingsApi.md#emailRoutingSettingsEnableEmailRouting) | **POST** /zones/{zone_identifier}/email/routing/enable | Enable Email Routing |
| [**emailRoutingSettingsGetEmailRoutingSettings**](EmailRoutingSettingsApi.md#emailRoutingSettingsGetEmailRoutingSettings) | **GET** /zones/{zone_identifier}/email/routing | Get Email Routing settings |


<a id="emailRoutingSettingsDisableEmailRouting"></a>
# **emailRoutingSettingsDisableEmailRouting**
> EmailEmailSettingsResponseSingle emailRoutingSettingsDisableEmailRouting(zoneIdentifier)

Disable Email Routing

Disable your Email Routing zone. Also removes additional MX records previously required for Email Routing to work.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.EmailRoutingSettingsApi;

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

    EmailRoutingSettingsApi apiInstance = new EmailRoutingSettingsApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      EmailEmailSettingsResponseSingle result = apiInstance.emailRoutingSettingsDisableEmailRouting(zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailRoutingSettingsApi#emailRoutingSettingsDisableEmailRouting");
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

[**EmailEmailSettingsResponseSingle**](EmailEmailSettingsResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Disable Email Routing response |  -  |

<a id="emailRoutingSettingsEmailRoutingDnsSettings"></a>
# **emailRoutingSettingsEmailRoutingDnsSettings**
> EmailDnsSettingsResponseCollection emailRoutingSettingsEmailRoutingDnsSettings(zoneIdentifier)

Email Routing - DNS settings

Show the DNS records needed to configure your Email Routing zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.EmailRoutingSettingsApi;

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

    EmailRoutingSettingsApi apiInstance = new EmailRoutingSettingsApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      EmailDnsSettingsResponseCollection result = apiInstance.emailRoutingSettingsEmailRoutingDnsSettings(zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailRoutingSettingsApi#emailRoutingSettingsEmailRoutingDnsSettings");
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

[**EmailDnsSettingsResponseCollection**](EmailDnsSettingsResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Email Routing - DNS settings response |  -  |

<a id="emailRoutingSettingsEnableEmailRouting"></a>
# **emailRoutingSettingsEnableEmailRouting**
> EmailEmailSettingsResponseSingle emailRoutingSettingsEnableEmailRouting(zoneIdentifier)

Enable Email Routing

Enable you Email Routing zone. Add and lock the necessary MX and SPF records.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.EmailRoutingSettingsApi;

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

    EmailRoutingSettingsApi apiInstance = new EmailRoutingSettingsApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      EmailEmailSettingsResponseSingle result = apiInstance.emailRoutingSettingsEnableEmailRouting(zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailRoutingSettingsApi#emailRoutingSettingsEnableEmailRouting");
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

[**EmailEmailSettingsResponseSingle**](EmailEmailSettingsResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Enable Email Routing response |  -  |

<a id="emailRoutingSettingsGetEmailRoutingSettings"></a>
# **emailRoutingSettingsGetEmailRoutingSettings**
> EmailEmailSettingsResponseSingle emailRoutingSettingsGetEmailRoutingSettings(zoneIdentifier)

Get Email Routing settings

Get information about the settings for your Email Routing zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.EmailRoutingSettingsApi;

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

    EmailRoutingSettingsApi apiInstance = new EmailRoutingSettingsApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      EmailEmailSettingsResponseSingle result = apiInstance.emailRoutingSettingsGetEmailRoutingSettings(zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailRoutingSettingsApi#emailRoutingSettingsGetEmailRoutingSettings");
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

[**EmailEmailSettingsResponseSingle**](EmailEmailSettingsResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Email Routing settings response |  -  |

