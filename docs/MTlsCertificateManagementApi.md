# MTlsCertificateManagementApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**mTlsCertificateManagementDeleteMTlsCertificate**](MTlsCertificateManagementApi.md#mTlsCertificateManagementDeleteMTlsCertificate) | **DELETE** /accounts/{account_id}/mtls_certificates/{mtls_certificate_id} | Delete mTLS certificate |
| [**mTlsCertificateManagementGetMTlsCertificate**](MTlsCertificateManagementApi.md#mTlsCertificateManagementGetMTlsCertificate) | **GET** /accounts/{account_id}/mtls_certificates/{mtls_certificate_id} | Get mTLS certificate |
| [**mTlsCertificateManagementListMTlsCertificateAssociations**](MTlsCertificateManagementApi.md#mTlsCertificateManagementListMTlsCertificateAssociations) | **GET** /accounts/{account_id}/mtls_certificates/{mtls_certificate_id}/associations | List mTLS certificate associations |
| [**mTlsCertificateManagementListMTlsCertificates**](MTlsCertificateManagementApi.md#mTlsCertificateManagementListMTlsCertificates) | **GET** /accounts/{account_id}/mtls_certificates | List mTLS certificates |
| [**mTlsCertificateManagementUploadMTlsCertificate**](MTlsCertificateManagementApi.md#mTlsCertificateManagementUploadMTlsCertificate) | **POST** /accounts/{account_id}/mtls_certificates | Upload mTLS certificate |


<a id="mTlsCertificateManagementDeleteMTlsCertificate"></a>
# **mTlsCertificateManagementDeleteMTlsCertificate**
> TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseSingle mTlsCertificateManagementDeleteMTlsCertificate(mtlsCertificateId, accountId)

Delete mTLS certificate

Deletes the mTLS certificate unless the certificate is in use by one or more Cloudflare services.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MTlsCertificateManagementApi;

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

    MTlsCertificateManagementApi apiInstance = new MTlsCertificateManagementApi(defaultClient);
    String mtlsCertificateId = "mtlsCertificateId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseSingle result = apiInstance.mTlsCertificateManagementDeleteMTlsCertificate(mtlsCertificateId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MTlsCertificateManagementApi#mTlsCertificateManagementDeleteMTlsCertificate");
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
| **mtlsCertificateId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseSingle**](TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete mTLS certificate response |  -  |
| **4XX** | Delete mTLS certificate response failure |  -  |

<a id="mTlsCertificateManagementGetMTlsCertificate"></a>
# **mTlsCertificateManagementGetMTlsCertificate**
> TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseSingle mTlsCertificateManagementGetMTlsCertificate(mtlsCertificateId, accountId)

Get mTLS certificate

Fetches a single mTLS certificate.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MTlsCertificateManagementApi;

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

    MTlsCertificateManagementApi apiInstance = new MTlsCertificateManagementApi(defaultClient);
    String mtlsCertificateId = "mtlsCertificateId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseSingle result = apiInstance.mTlsCertificateManagementGetMTlsCertificate(mtlsCertificateId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MTlsCertificateManagementApi#mTlsCertificateManagementGetMTlsCertificate");
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
| **mtlsCertificateId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseSingle**](TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get mTLS certificate response |  -  |
| **4XX** | Get mTLS certificate response failure |  -  |

<a id="mTlsCertificateManagementListMTlsCertificateAssociations"></a>
# **mTlsCertificateManagementListMTlsCertificateAssociations**
> TlsCertificatesAndHostnamesAssociationResponseCollection mTlsCertificateManagementListMTlsCertificateAssociations(mtlsCertificateId, accountId)

List mTLS certificate associations

Lists all active associations between the certificate and Cloudflare services.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MTlsCertificateManagementApi;

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

    MTlsCertificateManagementApi apiInstance = new MTlsCertificateManagementApi(defaultClient);
    String mtlsCertificateId = "mtlsCertificateId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesAssociationResponseCollection result = apiInstance.mTlsCertificateManagementListMTlsCertificateAssociations(mtlsCertificateId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MTlsCertificateManagementApi#mTlsCertificateManagementListMTlsCertificateAssociations");
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
| **mtlsCertificateId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesAssociationResponseCollection**](TlsCertificatesAndHostnamesAssociationResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List mTLS certificate associations response |  -  |
| **4XX** | List mTLS certificate associations response failure |  -  |

<a id="mTlsCertificateManagementListMTlsCertificates"></a>
# **mTlsCertificateManagementListMTlsCertificates**
> TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseCollection mTlsCertificateManagementListMTlsCertificates(accountId)

List mTLS certificates

Lists all mTLS certificates.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MTlsCertificateManagementApi;

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

    MTlsCertificateManagementApi apiInstance = new MTlsCertificateManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseCollection result = apiInstance.mTlsCertificateManagementListMTlsCertificates(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MTlsCertificateManagementApi#mTlsCertificateManagementListMTlsCertificates");
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
| **accountId** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseCollection**](TlsCertificatesAndHostnamesMtlsManagementComponentsSchemasCertificateResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List mTLS certificates response |  -  |
| **4XX** | List mTLS certificates response failure |  -  |

<a id="mTlsCertificateManagementUploadMTlsCertificate"></a>
# **mTlsCertificateManagementUploadMTlsCertificate**
> TlsCertificatesAndHostnamesCertificateResponseSinglePost mTlsCertificateManagementUploadMTlsCertificate(accountId, mtlsCertificateManagementUploadMTlsCertificateRequest)

Upload mTLS certificate

Upload a certificate that you want to use with mTLS-enabled Cloudflare services.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MTlsCertificateManagementApi;

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

    MTlsCertificateManagementApi apiInstance = new MTlsCertificateManagementApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    MTlsCertificateManagementUploadMTlsCertificateRequest mtlsCertificateManagementUploadMTlsCertificateRequest = new MTlsCertificateManagementUploadMTlsCertificateRequest(); // MTlsCertificateManagementUploadMTlsCertificateRequest | 
    try {
      TlsCertificatesAndHostnamesCertificateResponseSinglePost result = apiInstance.mTlsCertificateManagementUploadMTlsCertificate(accountId, mtlsCertificateManagementUploadMTlsCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MTlsCertificateManagementApi#mTlsCertificateManagementUploadMTlsCertificate");
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
| **accountId** | **String**|  | |
| **mtlsCertificateManagementUploadMTlsCertificateRequest** | [**MTlsCertificateManagementUploadMTlsCertificateRequest**](MTlsCertificateManagementUploadMTlsCertificateRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesCertificateResponseSinglePost**](TlsCertificatesAndHostnamesCertificateResponseSinglePost.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload mTLS certificate response |  -  |
| **4XX** | Upload mTLS certificate response failure |  -  |

