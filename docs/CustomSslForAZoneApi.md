# CustomSslForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customSslForAZoneCreateSslConfiguration**](CustomSslForAZoneApi.md#customSslForAZoneCreateSslConfiguration) | **POST** /zones/{zone_id}/custom_certificates | Create SSL Configuration |
| [**customSslForAZoneDeleteSslConfiguration**](CustomSslForAZoneApi.md#customSslForAZoneDeleteSslConfiguration) | **DELETE** /zones/{zone_id}/custom_certificates/{custom_certificate_id} | Delete SSL Configuration |
| [**customSslForAZoneEditSslConfiguration**](CustomSslForAZoneApi.md#customSslForAZoneEditSslConfiguration) | **PATCH** /zones/{zone_id}/custom_certificates/{custom_certificate_id} | Edit SSL Configuration |
| [**customSslForAZoneListSslConfigurations**](CustomSslForAZoneApi.md#customSslForAZoneListSslConfigurations) | **GET** /zones/{zone_id}/custom_certificates | List SSL Configurations |
| [**customSslForAZoneRePrioritizeSslCertificates**](CustomSslForAZoneApi.md#customSslForAZoneRePrioritizeSslCertificates) | **PUT** /zones/{zone_id}/custom_certificates/prioritize | Re-prioritize SSL Certificates |
| [**customSslForAZoneSslConfigurationDetails**](CustomSslForAZoneApi.md#customSslForAZoneSslConfigurationDetails) | **GET** /zones/{zone_id}/custom_certificates/{custom_certificate_id} | SSL Configuration Details |


<a id="customSslForAZoneCreateSslConfiguration"></a>
# **customSslForAZoneCreateSslConfiguration**
> TlsCertificatesAndHostnamesCertificateResponseSingle customSslForAZoneCreateSslConfiguration(zoneId, customSslForAZoneCreateSslConfigurationRequest)

Create SSL Configuration

Upload a new SSL certificate for a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CustomSslForAZoneApi;

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

    CustomSslForAZoneApi apiInstance = new CustomSslForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    CustomSslForAZoneCreateSslConfigurationRequest customSslForAZoneCreateSslConfigurationRequest = new CustomSslForAZoneCreateSslConfigurationRequest(); // CustomSslForAZoneCreateSslConfigurationRequest | 
    try {
      TlsCertificatesAndHostnamesCertificateResponseSingle result = apiInstance.customSslForAZoneCreateSslConfiguration(zoneId, customSslForAZoneCreateSslConfigurationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomSslForAZoneApi#customSslForAZoneCreateSslConfiguration");
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
| **zoneId** | **String**|  | |
| **customSslForAZoneCreateSslConfigurationRequest** | [**CustomSslForAZoneCreateSslConfigurationRequest**](CustomSslForAZoneCreateSslConfigurationRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesCertificateResponseSingle**](TlsCertificatesAndHostnamesCertificateResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create SSL Configuration response |  -  |
| **4XX** | Create SSL Configuration response failure |  -  |

<a id="customSslForAZoneDeleteSslConfiguration"></a>
# **customSslForAZoneDeleteSslConfiguration**
> TlsCertificatesAndHostnamesCertificateResponseIdOnly customSslForAZoneDeleteSslConfiguration(customCertificateId, zoneId)

Delete SSL Configuration

Remove a SSL certificate from a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CustomSslForAZoneApi;

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

    CustomSslForAZoneApi apiInstance = new CustomSslForAZoneApi(defaultClient);
    String customCertificateId = "customCertificateId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesCertificateResponseIdOnly result = apiInstance.customSslForAZoneDeleteSslConfiguration(customCertificateId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomSslForAZoneApi#customSslForAZoneDeleteSslConfiguration");
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
| **customCertificateId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesCertificateResponseIdOnly**](TlsCertificatesAndHostnamesCertificateResponseIdOnly.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete SSL Configuration response |  -  |
| **4XX** | Delete SSL Configuration response failure |  -  |

<a id="customSslForAZoneEditSslConfiguration"></a>
# **customSslForAZoneEditSslConfiguration**
> TlsCertificatesAndHostnamesCertificateResponseSingle customSslForAZoneEditSslConfiguration(customCertificateId, zoneId, customSslForAZoneEditSslConfigurationRequest)

Edit SSL Configuration

Upload a new private key and/or PEM/CRT for the SSL certificate. Note: PATCHing a configuration for sni_custom certificates will result in a new resource id being returned, and the previous one being deleted.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CustomSslForAZoneApi;

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

    CustomSslForAZoneApi apiInstance = new CustomSslForAZoneApi(defaultClient);
    String customCertificateId = "customCertificateId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    CustomSslForAZoneEditSslConfigurationRequest customSslForAZoneEditSslConfigurationRequest = new CustomSslForAZoneEditSslConfigurationRequest(); // CustomSslForAZoneEditSslConfigurationRequest | 
    try {
      TlsCertificatesAndHostnamesCertificateResponseSingle result = apiInstance.customSslForAZoneEditSslConfiguration(customCertificateId, zoneId, customSslForAZoneEditSslConfigurationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomSslForAZoneApi#customSslForAZoneEditSslConfiguration");
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
| **customCertificateId** | **String**|  | |
| **zoneId** | **String**|  | |
| **customSslForAZoneEditSslConfigurationRequest** | [**CustomSslForAZoneEditSslConfigurationRequest**](CustomSslForAZoneEditSslConfigurationRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesCertificateResponseSingle**](TlsCertificatesAndHostnamesCertificateResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Edit SSL Configuration response |  -  |
| **4XX** | Edit SSL Configuration response failure |  -  |

<a id="customSslForAZoneListSslConfigurations"></a>
# **customSslForAZoneListSslConfigurations**
> TlsCertificatesAndHostnamesCertificateResponseCollection customSslForAZoneListSslConfigurations(zoneId, page, perPage, match, status)

List SSL Configurations

List, search, and filter all of your custom SSL certificates. The higher priority will break ties across overlapping &#39;legacy_custom&#39; certificates, but &#39;legacy_custom&#39; certificates will always supercede &#39;sni_custom&#39; certificates.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CustomSslForAZoneApi;

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

    CustomSslForAZoneApi apiInstance = new CustomSslForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    String match = "any"; // String | 
    String status = "active"; // String | 
    try {
      TlsCertificatesAndHostnamesCertificateResponseCollection result = apiInstance.customSslForAZoneListSslConfigurations(zoneId, page, perPage, match, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomSslForAZoneApi#customSslForAZoneListSslConfigurations");
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
| **zoneId** | **String**|  | |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |
| **match** | **String**|  | [optional] [default to all] [enum: any, all] |
| **status** | **String**|  | [optional] [enum: active, expired, deleted, pending, initializing] |

### Return type

[**TlsCertificatesAndHostnamesCertificateResponseCollection**](TlsCertificatesAndHostnamesCertificateResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List SSL Configurations response |  -  |
| **4XX** | List SSL Configurations response failure |  -  |

<a id="customSslForAZoneRePrioritizeSslCertificates"></a>
# **customSslForAZoneRePrioritizeSslCertificates**
> TlsCertificatesAndHostnamesCertificateResponseCollection customSslForAZoneRePrioritizeSslCertificates(zoneId, customSslForAZoneRePrioritizeSslCertificatesRequest)

Re-prioritize SSL Certificates

If a zone has multiple SSL certificates, you can set the order in which they should be used during a request. The higher priority will break ties across overlapping &#39;legacy_custom&#39; certificates.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CustomSslForAZoneApi;

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

    CustomSslForAZoneApi apiInstance = new CustomSslForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    CustomSslForAZoneRePrioritizeSslCertificatesRequest customSslForAZoneRePrioritizeSslCertificatesRequest = new CustomSslForAZoneRePrioritizeSslCertificatesRequest(); // CustomSslForAZoneRePrioritizeSslCertificatesRequest | 
    try {
      TlsCertificatesAndHostnamesCertificateResponseCollection result = apiInstance.customSslForAZoneRePrioritizeSslCertificates(zoneId, customSslForAZoneRePrioritizeSslCertificatesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomSslForAZoneApi#customSslForAZoneRePrioritizeSslCertificates");
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
| **zoneId** | **String**|  | |
| **customSslForAZoneRePrioritizeSslCertificatesRequest** | [**CustomSslForAZoneRePrioritizeSslCertificatesRequest**](CustomSslForAZoneRePrioritizeSslCertificatesRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesCertificateResponseCollection**](TlsCertificatesAndHostnamesCertificateResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Re-prioritize SSL Certificates response |  -  |
| **4XX** | Re-prioritize SSL Certificates response failure |  -  |

<a id="customSslForAZoneSslConfigurationDetails"></a>
# **customSslForAZoneSslConfigurationDetails**
> TlsCertificatesAndHostnamesCertificateResponseSingle customSslForAZoneSslConfigurationDetails(customCertificateId, zoneId)

SSL Configuration Details

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CustomSslForAZoneApi;

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

    CustomSslForAZoneApi apiInstance = new CustomSslForAZoneApi(defaultClient);
    String customCertificateId = "customCertificateId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesCertificateResponseSingle result = apiInstance.customSslForAZoneSslConfigurationDetails(customCertificateId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomSslForAZoneApi#customSslForAZoneSslConfigurationDetails");
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
| **customCertificateId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesCertificateResponseSingle**](TlsCertificatesAndHostnamesCertificateResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SSL Configuration Details response |  -  |
| **4XX** | SSL Configuration Details response failure |  -  |

