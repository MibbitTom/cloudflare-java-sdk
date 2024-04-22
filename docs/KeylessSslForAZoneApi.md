# KeylessSslForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**keylessSslForAZoneCreateKeylessSslConfiguration**](KeylessSslForAZoneApi.md#keylessSslForAZoneCreateKeylessSslConfiguration) | **POST** /zones/{zone_id}/keyless_certificates | Create Keyless SSL Configuration |
| [**keylessSslForAZoneDeleteKeylessSslConfiguration**](KeylessSslForAZoneApi.md#keylessSslForAZoneDeleteKeylessSslConfiguration) | **DELETE** /zones/{zone_id}/keyless_certificates/{keyless_certificate_id} | Delete Keyless SSL Configuration |
| [**keylessSslForAZoneEditKeylessSslConfiguration**](KeylessSslForAZoneApi.md#keylessSslForAZoneEditKeylessSslConfiguration) | **PATCH** /zones/{zone_id}/keyless_certificates/{keyless_certificate_id} | Edit Keyless SSL Configuration |
| [**keylessSslForAZoneGetKeylessSslConfiguration**](KeylessSslForAZoneApi.md#keylessSslForAZoneGetKeylessSslConfiguration) | **GET** /zones/{zone_id}/keyless_certificates/{keyless_certificate_id} | Get Keyless SSL Configuration |
| [**keylessSslForAZoneListKeylessSslConfigurations**](KeylessSslForAZoneApi.md#keylessSslForAZoneListKeylessSslConfigurations) | **GET** /zones/{zone_id}/keyless_certificates | List Keyless SSL Configurations |


<a id="keylessSslForAZoneCreateKeylessSslConfiguration"></a>
# **keylessSslForAZoneCreateKeylessSslConfiguration**
> TlsCertificatesAndHostnamesKeylessResponseSingle keylessSslForAZoneCreateKeylessSslConfiguration(zoneId, keylessSslForAZoneCreateKeylessSslConfigurationRequest)

Create Keyless SSL Configuration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KeylessSslForAZoneApi;

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

    KeylessSslForAZoneApi apiInstance = new KeylessSslForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    KeylessSslForAZoneCreateKeylessSslConfigurationRequest keylessSslForAZoneCreateKeylessSslConfigurationRequest = new KeylessSslForAZoneCreateKeylessSslConfigurationRequest(); // KeylessSslForAZoneCreateKeylessSslConfigurationRequest | 
    try {
      TlsCertificatesAndHostnamesKeylessResponseSingle result = apiInstance.keylessSslForAZoneCreateKeylessSslConfiguration(zoneId, keylessSslForAZoneCreateKeylessSslConfigurationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeylessSslForAZoneApi#keylessSslForAZoneCreateKeylessSslConfiguration");
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
| **keylessSslForAZoneCreateKeylessSslConfigurationRequest** | [**KeylessSslForAZoneCreateKeylessSslConfigurationRequest**](KeylessSslForAZoneCreateKeylessSslConfigurationRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesKeylessResponseSingle**](TlsCertificatesAndHostnamesKeylessResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Keyless SSL Configuration response |  -  |
| **4XX** | Create Keyless SSL Configuration response failure |  -  |

<a id="keylessSslForAZoneDeleteKeylessSslConfiguration"></a>
# **keylessSslForAZoneDeleteKeylessSslConfiguration**
> TlsCertificatesAndHostnamesKeylessResponseSingleId keylessSslForAZoneDeleteKeylessSslConfiguration(keylessCertificateId, zoneId)

Delete Keyless SSL Configuration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KeylessSslForAZoneApi;

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

    KeylessSslForAZoneApi apiInstance = new KeylessSslForAZoneApi(defaultClient);
    String keylessCertificateId = "keylessCertificateId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesKeylessResponseSingleId result = apiInstance.keylessSslForAZoneDeleteKeylessSslConfiguration(keylessCertificateId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeylessSslForAZoneApi#keylessSslForAZoneDeleteKeylessSslConfiguration");
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
| **keylessCertificateId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesKeylessResponseSingleId**](TlsCertificatesAndHostnamesKeylessResponseSingleId.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Keyless SSL Configuration response |  -  |
| **4XX** | Delete Keyless SSL Configuration response failure |  -  |

<a id="keylessSslForAZoneEditKeylessSslConfiguration"></a>
# **keylessSslForAZoneEditKeylessSslConfiguration**
> TlsCertificatesAndHostnamesKeylessResponseSingle keylessSslForAZoneEditKeylessSslConfiguration(keylessCertificateId, zoneId, keylessSslForAZoneEditKeylessSslConfigurationRequest)

Edit Keyless SSL Configuration

This will update attributes of a Keyless SSL. Consists of one or more of the following:  host,name,port.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KeylessSslForAZoneApi;

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

    KeylessSslForAZoneApi apiInstance = new KeylessSslForAZoneApi(defaultClient);
    String keylessCertificateId = "keylessCertificateId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    KeylessSslForAZoneEditKeylessSslConfigurationRequest keylessSslForAZoneEditKeylessSslConfigurationRequest = new KeylessSslForAZoneEditKeylessSslConfigurationRequest(); // KeylessSslForAZoneEditKeylessSslConfigurationRequest | 
    try {
      TlsCertificatesAndHostnamesKeylessResponseSingle result = apiInstance.keylessSslForAZoneEditKeylessSslConfiguration(keylessCertificateId, zoneId, keylessSslForAZoneEditKeylessSslConfigurationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeylessSslForAZoneApi#keylessSslForAZoneEditKeylessSslConfiguration");
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
| **keylessCertificateId** | **String**|  | |
| **zoneId** | **String**|  | |
| **keylessSslForAZoneEditKeylessSslConfigurationRequest** | [**KeylessSslForAZoneEditKeylessSslConfigurationRequest**](KeylessSslForAZoneEditKeylessSslConfigurationRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesKeylessResponseSingle**](TlsCertificatesAndHostnamesKeylessResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Edit Keyless SSL Configuration response |  -  |
| **4XX** | Edit Keyless SSL Configuration response failure |  -  |

<a id="keylessSslForAZoneGetKeylessSslConfiguration"></a>
# **keylessSslForAZoneGetKeylessSslConfiguration**
> TlsCertificatesAndHostnamesKeylessResponseSingle keylessSslForAZoneGetKeylessSslConfiguration(keylessCertificateId, zoneId)

Get Keyless SSL Configuration

Get details for one Keyless SSL configuration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KeylessSslForAZoneApi;

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

    KeylessSslForAZoneApi apiInstance = new KeylessSslForAZoneApi(defaultClient);
    String keylessCertificateId = "keylessCertificateId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesKeylessResponseSingle result = apiInstance.keylessSslForAZoneGetKeylessSslConfiguration(keylessCertificateId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeylessSslForAZoneApi#keylessSslForAZoneGetKeylessSslConfiguration");
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
| **keylessCertificateId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesKeylessResponseSingle**](TlsCertificatesAndHostnamesKeylessResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Keyless SSL Configuration response |  -  |
| **4XX** | Get Keyless SSL Configuration response failure |  -  |

<a id="keylessSslForAZoneListKeylessSslConfigurations"></a>
# **keylessSslForAZoneListKeylessSslConfigurations**
> TlsCertificatesAndHostnamesKeylessResponseCollection keylessSslForAZoneListKeylessSslConfigurations(zoneId)

List Keyless SSL Configurations

List all Keyless SSL configurations for a given zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KeylessSslForAZoneApi;

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

    KeylessSslForAZoneApi apiInstance = new KeylessSslForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesKeylessResponseCollection result = apiInstance.keylessSslForAZoneListKeylessSslConfigurations(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeylessSslForAZoneApi#keylessSslForAZoneListKeylessSslConfigurations");
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

### Return type

[**TlsCertificatesAndHostnamesKeylessResponseCollection**](TlsCertificatesAndHostnamesKeylessResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Keyless SSL Configurations response |  -  |
| **4XX** | List Keyless SSL Configurations response failure |  -  |

