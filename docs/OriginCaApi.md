# OriginCaApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**originCaCreateCertificate**](OriginCaApi.md#originCaCreateCertificate) | **POST** /certificates | Create Certificate |
| [**originCaGetCertificate**](OriginCaApi.md#originCaGetCertificate) | **GET** /certificates/{certificate_id} | Get Certificate |
| [**originCaListCertificates**](OriginCaApi.md#originCaListCertificates) | **GET** /certificates | List Certificates |
| [**originCaRevokeCertificate**](OriginCaApi.md#originCaRevokeCertificate) | **DELETE** /certificates/{certificate_id} | Revoke Certificate |


<a id="originCaCreateCertificate"></a>
# **originCaCreateCertificate**
> TlsCertificatesAndHostnamesSchemasCertificateResponseSingle originCaCreateCertificate(originCaCreateCertificateRequest)

Create Certificate

Create an Origin CA certificate. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.OriginCaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: user_service_key
    ApiKeyAuth user_service_key = (ApiKeyAuth) defaultClient.getAuthentication("user_service_key");
    user_service_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user_service_key.setApiKeyPrefix("Token");

    OriginCaApi apiInstance = new OriginCaApi(defaultClient);
    OriginCaCreateCertificateRequest originCaCreateCertificateRequest = new OriginCaCreateCertificateRequest(); // OriginCaCreateCertificateRequest | 
    try {
      TlsCertificatesAndHostnamesSchemasCertificateResponseSingle result = apiInstance.originCaCreateCertificate(originCaCreateCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OriginCaApi#originCaCreateCertificate");
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
| **originCaCreateCertificateRequest** | [**OriginCaCreateCertificateRequest**](OriginCaCreateCertificateRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesSchemasCertificateResponseSingle**](TlsCertificatesAndHostnamesSchemasCertificateResponseSingle.md)

### Authorization

[user_service_key](../README.md#user_service_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Certificate response |  -  |
| **4XX** | Create Certificate response failure |  -  |

<a id="originCaGetCertificate"></a>
# **originCaGetCertificate**
> TlsCertificatesAndHostnamesSchemasCertificateResponseSingle originCaGetCertificate(certificateId)

Get Certificate

Get an existing Origin CA certificate by its serial number. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.OriginCaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: user_service_key
    ApiKeyAuth user_service_key = (ApiKeyAuth) defaultClient.getAuthentication("user_service_key");
    user_service_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user_service_key.setApiKeyPrefix("Token");

    OriginCaApi apiInstance = new OriginCaApi(defaultClient);
    String certificateId = "certificateId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesSchemasCertificateResponseSingle result = apiInstance.originCaGetCertificate(certificateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OriginCaApi#originCaGetCertificate");
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

### Return type

[**TlsCertificatesAndHostnamesSchemasCertificateResponseSingle**](TlsCertificatesAndHostnamesSchemasCertificateResponseSingle.md)

### Authorization

[user_service_key](../README.md#user_service_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Certificate response |  -  |
| **4XX** | Get Certificate response failure |  -  |

<a id="originCaListCertificates"></a>
# **originCaListCertificates**
> TlsCertificatesAndHostnamesSchemasCertificateResponseCollection originCaListCertificates(identifier)

List Certificates

List all existing Origin CA certificates for a given zone. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.OriginCaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: user_service_key
    ApiKeyAuth user_service_key = (ApiKeyAuth) defaultClient.getAuthentication("user_service_key");
    user_service_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user_service_key.setApiKeyPrefix("Token");

    OriginCaApi apiInstance = new OriginCaApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      TlsCertificatesAndHostnamesSchemasCertificateResponseCollection result = apiInstance.originCaListCertificates(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OriginCaApi#originCaListCertificates");
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
| **identifier** | **String**|  | [optional] |

### Return type

[**TlsCertificatesAndHostnamesSchemasCertificateResponseCollection**](TlsCertificatesAndHostnamesSchemasCertificateResponseCollection.md)

### Authorization

[user_service_key](../README.md#user_service_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Certificates response |  -  |
| **4XX** | List Certificates response failure |  -  |

<a id="originCaRevokeCertificate"></a>
# **originCaRevokeCertificate**
> TlsCertificatesAndHostnamesCertificateResponseSingleId originCaRevokeCertificate(certificateId)

Revoke Certificate

Revoke an existing Origin CA certificate by its serial number. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.OriginCaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: user_service_key
    ApiKeyAuth user_service_key = (ApiKeyAuth) defaultClient.getAuthentication("user_service_key");
    user_service_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //user_service_key.setApiKeyPrefix("Token");

    OriginCaApi apiInstance = new OriginCaApi(defaultClient);
    String certificateId = "certificateId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesCertificateResponseSingleId result = apiInstance.originCaRevokeCertificate(certificateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OriginCaApi#originCaRevokeCertificate");
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

### Return type

[**TlsCertificatesAndHostnamesCertificateResponseSingleId**](TlsCertificatesAndHostnamesCertificateResponseSingleId.md)

### Authorization

[user_service_key](../README.md#user_service_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Revoke Certificate response |  -  |
| **4XX** | Revoke Certificate response failure |  -  |

