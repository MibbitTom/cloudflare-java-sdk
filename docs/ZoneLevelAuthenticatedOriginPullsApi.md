# ZoneLevelAuthenticatedOriginPullsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneLevelAuthenticatedOriginPullsDeleteCertificate**](ZoneLevelAuthenticatedOriginPullsApi.md#zoneLevelAuthenticatedOriginPullsDeleteCertificate) | **DELETE** /zones/{zone_id}/origin_tls_client_auth/{certificate_id} | Delete Certificate |
| [**zoneLevelAuthenticatedOriginPullsGetCertificateDetails**](ZoneLevelAuthenticatedOriginPullsApi.md#zoneLevelAuthenticatedOriginPullsGetCertificateDetails) | **GET** /zones/{zone_id}/origin_tls_client_auth/{certificate_id} | Get Certificate Details |
| [**zoneLevelAuthenticatedOriginPullsGetEnablementSettingForZone**](ZoneLevelAuthenticatedOriginPullsApi.md#zoneLevelAuthenticatedOriginPullsGetEnablementSettingForZone) | **GET** /zones/{zone_id}/origin_tls_client_auth/settings | Get Enablement Setting for Zone |
| [**zoneLevelAuthenticatedOriginPullsListCertificates**](ZoneLevelAuthenticatedOriginPullsApi.md#zoneLevelAuthenticatedOriginPullsListCertificates) | **GET** /zones/{zone_id}/origin_tls_client_auth | List Certificates |
| [**zoneLevelAuthenticatedOriginPullsSetEnablementForZone**](ZoneLevelAuthenticatedOriginPullsApi.md#zoneLevelAuthenticatedOriginPullsSetEnablementForZone) | **PUT** /zones/{zone_id}/origin_tls_client_auth/settings | Set Enablement for Zone |
| [**zoneLevelAuthenticatedOriginPullsUploadCertificate**](ZoneLevelAuthenticatedOriginPullsApi.md#zoneLevelAuthenticatedOriginPullsUploadCertificate) | **POST** /zones/{zone_id}/origin_tls_client_auth | Upload Certificate |


<a id="zoneLevelAuthenticatedOriginPullsDeleteCertificate"></a>
# **zoneLevelAuthenticatedOriginPullsDeleteCertificate**
> TlsCertificatesAndHostnamesCertificateResponseSingle zoneLevelAuthenticatedOriginPullsDeleteCertificate(certificateId, zoneId)

Delete Certificate

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAuthenticatedOriginPullsApi;

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

    ZoneLevelAuthenticatedOriginPullsApi apiInstance = new ZoneLevelAuthenticatedOriginPullsApi(defaultClient);
    String certificateId = "certificateId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesCertificateResponseSingle result = apiInstance.zoneLevelAuthenticatedOriginPullsDeleteCertificate(certificateId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAuthenticatedOriginPullsApi#zoneLevelAuthenticatedOriginPullsDeleteCertificate");
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
| **certificateId** | **String**|  | |
| **zoneId** | **String**|  | |

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
| **200** | Delete Certificate response |  -  |
| **4XX** | Delete Certificate response failure |  -  |

<a id="zoneLevelAuthenticatedOriginPullsGetCertificateDetails"></a>
# **zoneLevelAuthenticatedOriginPullsGetCertificateDetails**
> TlsCertificatesAndHostnamesCertificateResponseSingle zoneLevelAuthenticatedOriginPullsGetCertificateDetails(certificateId, zoneId)

Get Certificate Details

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAuthenticatedOriginPullsApi;

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

    ZoneLevelAuthenticatedOriginPullsApi apiInstance = new ZoneLevelAuthenticatedOriginPullsApi(defaultClient);
    String certificateId = "certificateId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesCertificateResponseSingle result = apiInstance.zoneLevelAuthenticatedOriginPullsGetCertificateDetails(certificateId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAuthenticatedOriginPullsApi#zoneLevelAuthenticatedOriginPullsGetCertificateDetails");
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
| **certificateId** | **String**|  | |
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
| **200** | Get Certificate Details response |  -  |
| **4XX** | Get Certificate Details response failure |  -  |

<a id="zoneLevelAuthenticatedOriginPullsGetEnablementSettingForZone"></a>
# **zoneLevelAuthenticatedOriginPullsGetEnablementSettingForZone**
> TlsCertificatesAndHostnamesEnabledResponse zoneLevelAuthenticatedOriginPullsGetEnablementSettingForZone(zoneId)

Get Enablement Setting for Zone

Get whether zone-level authenticated origin pulls is enabled or not. It is false by default.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAuthenticatedOriginPullsApi;

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

    ZoneLevelAuthenticatedOriginPullsApi apiInstance = new ZoneLevelAuthenticatedOriginPullsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesEnabledResponse result = apiInstance.zoneLevelAuthenticatedOriginPullsGetEnablementSettingForZone(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAuthenticatedOriginPullsApi#zoneLevelAuthenticatedOriginPullsGetEnablementSettingForZone");
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

[**TlsCertificatesAndHostnamesEnabledResponse**](TlsCertificatesAndHostnamesEnabledResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Enablement Setting for Zone response |  -  |
| **4XX** | Get Enablement Setting for Zone response failure |  -  |

<a id="zoneLevelAuthenticatedOriginPullsListCertificates"></a>
# **zoneLevelAuthenticatedOriginPullsListCertificates**
> TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseCollection zoneLevelAuthenticatedOriginPullsListCertificates(zoneId)

List Certificates

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAuthenticatedOriginPullsApi;

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

    ZoneLevelAuthenticatedOriginPullsApi apiInstance = new ZoneLevelAuthenticatedOriginPullsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseCollection result = apiInstance.zoneLevelAuthenticatedOriginPullsListCertificates(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAuthenticatedOriginPullsApi#zoneLevelAuthenticatedOriginPullsListCertificates");
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

[**TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseCollection**](TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Certificates response |  -  |
| **4XX** | List Certificates response failure |  -  |

<a id="zoneLevelAuthenticatedOriginPullsSetEnablementForZone"></a>
# **zoneLevelAuthenticatedOriginPullsSetEnablementForZone**
> TlsCertificatesAndHostnamesEnabledResponse zoneLevelAuthenticatedOriginPullsSetEnablementForZone(zoneId, zoneLevelAuthenticatedOriginPullsSetEnablementForZoneRequest)

Set Enablement for Zone

Enable or disable zone-level authenticated origin pulls. &#39;enabled&#39; should be set true either before/after the certificate is uploaded to see the certificate in use.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAuthenticatedOriginPullsApi;

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

    ZoneLevelAuthenticatedOriginPullsApi apiInstance = new ZoneLevelAuthenticatedOriginPullsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneLevelAuthenticatedOriginPullsSetEnablementForZoneRequest zoneLevelAuthenticatedOriginPullsSetEnablementForZoneRequest = new ZoneLevelAuthenticatedOriginPullsSetEnablementForZoneRequest(); // ZoneLevelAuthenticatedOriginPullsSetEnablementForZoneRequest | 
    try {
      TlsCertificatesAndHostnamesEnabledResponse result = apiInstance.zoneLevelAuthenticatedOriginPullsSetEnablementForZone(zoneId, zoneLevelAuthenticatedOriginPullsSetEnablementForZoneRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAuthenticatedOriginPullsApi#zoneLevelAuthenticatedOriginPullsSetEnablementForZone");
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
| **zoneLevelAuthenticatedOriginPullsSetEnablementForZoneRequest** | [**ZoneLevelAuthenticatedOriginPullsSetEnablementForZoneRequest**](ZoneLevelAuthenticatedOriginPullsSetEnablementForZoneRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesEnabledResponse**](TlsCertificatesAndHostnamesEnabledResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set Enablement for Zone response |  -  |
| **4XX** | Set Enablement for Zone response failure |  -  |

<a id="zoneLevelAuthenticatedOriginPullsUploadCertificate"></a>
# **zoneLevelAuthenticatedOriginPullsUploadCertificate**
> TlsCertificatesAndHostnamesCertificateResponseSingle zoneLevelAuthenticatedOriginPullsUploadCertificate(zoneId, zoneLevelAuthenticatedOriginPullsUploadCertificateRequest)

Upload Certificate

Upload your own certificate you want Cloudflare to use for edge-to-origin communication to override the shared certificate. Please note that it is important to keep only one certificate active. Also, make sure to enable zone-level authenticated origin pulls by making a PUT call to settings endpoint to see the uploaded certificate in use.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAuthenticatedOriginPullsApi;

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

    ZoneLevelAuthenticatedOriginPullsApi apiInstance = new ZoneLevelAuthenticatedOriginPullsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneLevelAuthenticatedOriginPullsUploadCertificateRequest zoneLevelAuthenticatedOriginPullsUploadCertificateRequest = new ZoneLevelAuthenticatedOriginPullsUploadCertificateRequest(); // ZoneLevelAuthenticatedOriginPullsUploadCertificateRequest | 
    try {
      TlsCertificatesAndHostnamesCertificateResponseSingle result = apiInstance.zoneLevelAuthenticatedOriginPullsUploadCertificate(zoneId, zoneLevelAuthenticatedOriginPullsUploadCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAuthenticatedOriginPullsApi#zoneLevelAuthenticatedOriginPullsUploadCertificate");
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
| **zoneLevelAuthenticatedOriginPullsUploadCertificateRequest** | [**ZoneLevelAuthenticatedOriginPullsUploadCertificateRequest**](ZoneLevelAuthenticatedOriginPullsUploadCertificateRequest.md)|  | |

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
| **200** | Upload Certificate response |  -  |
| **4XX** | Upload Certificate response failure |  -  |

