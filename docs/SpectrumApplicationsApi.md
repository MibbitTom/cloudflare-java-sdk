# SpectrumApplicationsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOrigin**](SpectrumApplicationsApi.md#spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOrigin) | **POST** /zones/{zone}/spectrum/apps | Create Spectrum application using a name for the origin |
| [**spectrumApplicationsDeleteSpectrumApplication**](SpectrumApplicationsApi.md#spectrumApplicationsDeleteSpectrumApplication) | **DELETE** /zones/{zone}/spectrum/apps/{app_id} | Delete Spectrum application |
| [**spectrumApplicationsGetSpectrumApplicationConfiguration**](SpectrumApplicationsApi.md#spectrumApplicationsGetSpectrumApplicationConfiguration) | **GET** /zones/{zone}/spectrum/apps/{app_id} | Get Spectrum application configuration |
| [**spectrumApplicationsListSpectrumApplications**](SpectrumApplicationsApi.md#spectrumApplicationsListSpectrumApplications) | **GET** /zones/{zone}/spectrum/apps | List Spectrum applications |
| [**spectrumApplicationsUpdateSpectrumApplicationConfigurationUsingANameForTheOrigin**](SpectrumApplicationsApi.md#spectrumApplicationsUpdateSpectrumApplicationConfigurationUsingANameForTheOrigin) | **PUT** /zones/{zone}/spectrum/apps/{app_id} | Update Spectrum application configuration using a name for the origin |


<a id="spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOrigin"></a>
# **spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOrigin**
> LegacyJhsResponseSingleOriginDns spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOrigin(zone, spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest)

Create Spectrum application using a name for the origin

Creates a new Spectrum application from a configuration using a name for the origin.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SpectrumApplicationsApi;

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

    SpectrumApplicationsApi apiInstance = new SpectrumApplicationsApi(defaultClient);
    String zone = "zone_example"; // String | 
    SpectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest = new SpectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest(); // SpectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest | 
    try {
      LegacyJhsResponseSingleOriginDns result = apiInstance.spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOrigin(zone, spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpectrumApplicationsApi#spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOrigin");
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
| **zone** | **String**|  | |
| **spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest** | [**SpectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest**](SpectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest.md)|  | |

### Return type

[**LegacyJhsResponseSingleOriginDns**](LegacyJhsResponseSingleOriginDns.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Spectrum application using a name for the origin response |  -  |
| **4XX** | Create Spectrum application using a name for the origin response failure |  -  |

<a id="spectrumApplicationsDeleteSpectrumApplication"></a>
# **spectrumApplicationsDeleteSpectrumApplication**
> SpectrumApplicationsDeleteSpectrumApplication200Response spectrumApplicationsDeleteSpectrumApplication(appId, zone)

Delete Spectrum application

Deletes a previously existing application.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SpectrumApplicationsApi;

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

    SpectrumApplicationsApi apiInstance = new SpectrumApplicationsApi(defaultClient);
    String appId = "appId_example"; // String | 
    String zone = "zone_example"; // String | 
    try {
      SpectrumApplicationsDeleteSpectrumApplication200Response result = apiInstance.spectrumApplicationsDeleteSpectrumApplication(appId, zone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpectrumApplicationsApi#spectrumApplicationsDeleteSpectrumApplication");
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
| **appId** | **String**|  | |
| **zone** | **String**|  | |

### Return type

[**SpectrumApplicationsDeleteSpectrumApplication200Response**](SpectrumApplicationsDeleteSpectrumApplication200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Spectrum application response |  -  |
| **4XX** | Delete Spectrum application response failure |  -  |

<a id="spectrumApplicationsGetSpectrumApplicationConfiguration"></a>
# **spectrumApplicationsGetSpectrumApplicationConfiguration**
> LegacyJhsResponseSingle spectrumApplicationsGetSpectrumApplicationConfiguration(appId, zone)

Get Spectrum application configuration

Gets the application configuration of a specific application inside a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SpectrumApplicationsApi;

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

    SpectrumApplicationsApi apiInstance = new SpectrumApplicationsApi(defaultClient);
    String appId = "appId_example"; // String | 
    String zone = "zone_example"; // String | 
    try {
      LegacyJhsResponseSingle result = apiInstance.spectrumApplicationsGetSpectrumApplicationConfiguration(appId, zone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpectrumApplicationsApi#spectrumApplicationsGetSpectrumApplicationConfiguration");
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
| **appId** | **String**|  | |
| **zone** | **String**|  | |

### Return type

[**LegacyJhsResponseSingle**](LegacyJhsResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Spectrum application configuration response |  -  |
| **4XX** | Get Spectrum application configuration response failure |  -  |

<a id="spectrumApplicationsListSpectrumApplications"></a>
# **spectrumApplicationsListSpectrumApplications**
> LegacyJhsResponseCollection spectrumApplicationsListSpectrumApplications(zone, page, perPage, direction, order)

List Spectrum applications

Retrieves a list of currently existing Spectrum applications inside a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SpectrumApplicationsApi;

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

    SpectrumApplicationsApi apiInstance = new SpectrumApplicationsApi(defaultClient);
    String zone = "zone_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    String direction = "asc"; // String | 
    String order = "protocol"; // String | 
    try {
      LegacyJhsResponseCollection result = apiInstance.spectrumApplicationsListSpectrumApplications(zone, page, perPage, direction, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpectrumApplicationsApi#spectrumApplicationsListSpectrumApplications");
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
| **zone** | **String**|  | |
| **page** | **BigDecimal**|  | [optional] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |
| **direction** | **String**|  | [optional] [default to asc] [enum: asc, desc] |
| **order** | **String**|  | [optional] [default to dns] [enum: protocol, app_id, created_on, modified_on, dns] |

### Return type

[**LegacyJhsResponseCollection**](LegacyJhsResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Spectrum applications response |  -  |
| **4XX** | List Spectrum applications response failure |  -  |

<a id="spectrumApplicationsUpdateSpectrumApplicationConfigurationUsingANameForTheOrigin"></a>
# **spectrumApplicationsUpdateSpectrumApplicationConfigurationUsingANameForTheOrigin**
> LegacyJhsResponseSingleOriginDns spectrumApplicationsUpdateSpectrumApplicationConfigurationUsingANameForTheOrigin(appId, zone, spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest)

Update Spectrum application configuration using a name for the origin

Updates a previously existing application&#39;s configuration that uses a name for the origin.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SpectrumApplicationsApi;

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

    SpectrumApplicationsApi apiInstance = new SpectrumApplicationsApi(defaultClient);
    String appId = "appId_example"; // String | 
    String zone = "zone_example"; // String | 
    SpectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest = new SpectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest(); // SpectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest | 
    try {
      LegacyJhsResponseSingleOriginDns result = apiInstance.spectrumApplicationsUpdateSpectrumApplicationConfigurationUsingANameForTheOrigin(appId, zone, spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpectrumApplicationsApi#spectrumApplicationsUpdateSpectrumApplicationConfigurationUsingANameForTheOrigin");
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
| **appId** | **String**|  | |
| **zone** | **String**|  | |
| **spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest** | [**SpectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest**](SpectrumApplicationsCreateSpectrumApplicationUsingANameForTheOriginRequest.md)|  | |

### Return type

[**LegacyJhsResponseSingleOriginDns**](LegacyJhsResponseSingleOriginDns.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Spectrum application configuration using a name for the origin response |  -  |
| **4XX** | Update Spectrum application configuration using a name for the origin response failure |  -  |

