# CertificatePacksApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**certificatePacksDeleteAdvancedCertificateManagerCertificatePack**](CertificatePacksApi.md#certificatePacksDeleteAdvancedCertificateManagerCertificatePack) | **DELETE** /zones/{zone_id}/ssl/certificate_packs/{certificate_pack_id} | Delete Advanced Certificate Manager Certificate Pack |
| [**certificatePacksGetCertificatePack**](CertificatePacksApi.md#certificatePacksGetCertificatePack) | **GET** /zones/{zone_id}/ssl/certificate_packs/{certificate_pack_id} | Get Certificate Pack |
| [**certificatePacksGetCertificatePackQuotas**](CertificatePacksApi.md#certificatePacksGetCertificatePackQuotas) | **GET** /zones/{zone_id}/ssl/certificate_packs/quota | Get Certificate Pack Quotas |
| [**certificatePacksListCertificatePacks**](CertificatePacksApi.md#certificatePacksListCertificatePacks) | **GET** /zones/{zone_id}/ssl/certificate_packs | List Certificate Packs |
| [**certificatePacksOrderAdvancedCertificateManagerCertificatePack**](CertificatePacksApi.md#certificatePacksOrderAdvancedCertificateManagerCertificatePack) | **POST** /zones/{zone_id}/ssl/certificate_packs/order | Order Advanced Certificate Manager Certificate Pack |
| [**certificatePacksRestartValidationForAdvancedCertificateManagerCertificatePack**](CertificatePacksApi.md#certificatePacksRestartValidationForAdvancedCertificateManagerCertificatePack) | **PATCH** /zones/{zone_id}/ssl/certificate_packs/{certificate_pack_id} | Restart Validation for Advanced Certificate Manager Certificate Pack |


<a id="certificatePacksDeleteAdvancedCertificateManagerCertificatePack"></a>
# **certificatePacksDeleteAdvancedCertificateManagerCertificatePack**
> TlsCertificatesAndHostnamesDeleteAdvancedCertificatePackResponseSingle certificatePacksDeleteAdvancedCertificateManagerCertificatePack(certificatePackId, zoneId)

Delete Advanced Certificate Manager Certificate Pack

For a given zone, delete an advanced certificate pack.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatePacksApi;

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

    CertificatePacksApi apiInstance = new CertificatePacksApi(defaultClient);
    String certificatePackId = "certificatePackId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesDeleteAdvancedCertificatePackResponseSingle result = apiInstance.certificatePacksDeleteAdvancedCertificateManagerCertificatePack(certificatePackId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatePacksApi#certificatePacksDeleteAdvancedCertificateManagerCertificatePack");
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
| **certificatePackId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesDeleteAdvancedCertificatePackResponseSingle**](TlsCertificatesAndHostnamesDeleteAdvancedCertificatePackResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Advanced Certificate Manager Certificate Pack response |  -  |
| **4XX** | Delete Advanced Certificate Manager Certificate Pack response failure |  -  |

<a id="certificatePacksGetCertificatePack"></a>
# **certificatePacksGetCertificatePack**
> TlsCertificatesAndHostnamesCertificatePackResponseSingle certificatePacksGetCertificatePack(certificatePackId, zoneId)

Get Certificate Pack

For a given zone, get a certificate pack.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatePacksApi;

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

    CertificatePacksApi apiInstance = new CertificatePacksApi(defaultClient);
    String certificatePackId = "certificatePackId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesCertificatePackResponseSingle result = apiInstance.certificatePacksGetCertificatePack(certificatePackId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatePacksApi#certificatePacksGetCertificatePack");
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
| **certificatePackId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesCertificatePackResponseSingle**](TlsCertificatesAndHostnamesCertificatePackResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Certificate Pack response |  -  |
| **4XX** | Get Certificate Pack response failure |  -  |

<a id="certificatePacksGetCertificatePackQuotas"></a>
# **certificatePacksGetCertificatePackQuotas**
> TlsCertificatesAndHostnamesCertificatePackQuotaResponse certificatePacksGetCertificatePackQuotas(zoneId)

Get Certificate Pack Quotas

For a given zone, list certificate pack quotas.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatePacksApi;

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

    CertificatePacksApi apiInstance = new CertificatePacksApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesCertificatePackQuotaResponse result = apiInstance.certificatePacksGetCertificatePackQuotas(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatePacksApi#certificatePacksGetCertificatePackQuotas");
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

[**TlsCertificatesAndHostnamesCertificatePackQuotaResponse**](TlsCertificatesAndHostnamesCertificatePackQuotaResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Certificate Pack Quotas response |  -  |
| **4XX** | Get Certificate Pack Quotas response failure |  -  |

<a id="certificatePacksListCertificatePacks"></a>
# **certificatePacksListCertificatePacks**
> TlsCertificatesAndHostnamesCertificatePackResponseCollection certificatePacksListCertificatePacks(zoneId, status)

List Certificate Packs

For a given zone, list all active certificate packs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatePacksApi;

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

    CertificatePacksApi apiInstance = new CertificatePacksApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String status = "all"; // String | 
    try {
      TlsCertificatesAndHostnamesCertificatePackResponseCollection result = apiInstance.certificatePacksListCertificatePacks(zoneId, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatePacksApi#certificatePacksListCertificatePacks");
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
| **status** | **String**|  | [optional] [enum: all] |

### Return type

[**TlsCertificatesAndHostnamesCertificatePackResponseCollection**](TlsCertificatesAndHostnamesCertificatePackResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Certificate Packs response |  -  |
| **4XX** | List Certificate Packs response failure |  -  |

<a id="certificatePacksOrderAdvancedCertificateManagerCertificatePack"></a>
# **certificatePacksOrderAdvancedCertificateManagerCertificatePack**
> TlsCertificatesAndHostnamesAdvancedCertificatePackResponseSingle certificatePacksOrderAdvancedCertificateManagerCertificatePack(zoneId, certificatePacksOrderAdvancedCertificateManagerCertificatePackRequest)

Order Advanced Certificate Manager Certificate Pack

For a given zone, order an advanced certificate pack.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatePacksApi;

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

    CertificatePacksApi apiInstance = new CertificatePacksApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest certificatePacksOrderAdvancedCertificateManagerCertificatePackRequest = new CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest(); // CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest | 
    try {
      TlsCertificatesAndHostnamesAdvancedCertificatePackResponseSingle result = apiInstance.certificatePacksOrderAdvancedCertificateManagerCertificatePack(zoneId, certificatePacksOrderAdvancedCertificateManagerCertificatePackRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatePacksApi#certificatePacksOrderAdvancedCertificateManagerCertificatePack");
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
| **certificatePacksOrderAdvancedCertificateManagerCertificatePackRequest** | [**CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest**](CertificatePacksOrderAdvancedCertificateManagerCertificatePackRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesAdvancedCertificatePackResponseSingle**](TlsCertificatesAndHostnamesAdvancedCertificatePackResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order Advanced Certificate Manager Certificate Pack response |  -  |
| **4XX** | Order Advanced Certificate Manager Certificate Pack response failure |  -  |

<a id="certificatePacksRestartValidationForAdvancedCertificateManagerCertificatePack"></a>
# **certificatePacksRestartValidationForAdvancedCertificateManagerCertificatePack**
> TlsCertificatesAndHostnamesAdvancedCertificatePackResponseSingle certificatePacksRestartValidationForAdvancedCertificateManagerCertificatePack(certificatePackId, zoneId)

Restart Validation for Advanced Certificate Manager Certificate Pack

For a given zone, restart validation for an advanced certificate pack.  This is only a validation operation for a Certificate Pack in a validation_timed_out status.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CertificatePacksApi;

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

    CertificatePacksApi apiInstance = new CertificatePacksApi(defaultClient);
    String certificatePackId = "certificatePackId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesAdvancedCertificatePackResponseSingle result = apiInstance.certificatePacksRestartValidationForAdvancedCertificateManagerCertificatePack(certificatePackId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatePacksApi#certificatePacksRestartValidationForAdvancedCertificateManagerCertificatePack");
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
| **certificatePackId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesAdvancedCertificatePackResponseSingle**](TlsCertificatesAndHostnamesAdvancedCertificatePackResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Restart Validation for Advanced Certificate Manager Certificate Pack response |  -  |
| **4XX** | Restart Validation for Advanced Certificate Manager Certificate Pack response failure |  -  |

