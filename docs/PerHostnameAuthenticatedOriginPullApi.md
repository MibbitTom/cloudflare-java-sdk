# PerHostnameAuthenticatedOriginPullApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificate**](PerHostnameAuthenticatedOriginPullApi.md#perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificate) | **DELETE** /zones/{zone_id}/origin_tls_client_auth/hostnames/certificates/{certificate_id} | Delete Hostname Client Certificate |
| [**perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication**](PerHostnameAuthenticatedOriginPullApi.md#perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication) | **PUT** /zones/{zone_id}/origin_tls_client_auth/hostnames | Enable or Disable a Hostname for Client Authentication |
| [**perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificate**](PerHostnameAuthenticatedOriginPullApi.md#perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificate) | **GET** /zones/{zone_id}/origin_tls_client_auth/hostnames/certificates/{certificate_id} | Get the Hostname Client Certificate |
| [**perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication**](PerHostnameAuthenticatedOriginPullApi.md#perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication) | **GET** /zones/{zone_id}/origin_tls_client_auth/hostnames/{hostname} | Get the Hostname Status for Client Authentication |
| [**perHostnameAuthenticatedOriginPullListCertificates**](PerHostnameAuthenticatedOriginPullApi.md#perHostnameAuthenticatedOriginPullListCertificates) | **GET** /zones/{zone_id}/origin_tls_client_auth/hostnames/certificates | List Certificates |
| [**perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate**](PerHostnameAuthenticatedOriginPullApi.md#perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate) | **POST** /zones/{zone_id}/origin_tls_client_auth/hostnames/certificates | Upload a Hostname Client Certificate |


<a id="perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificate"></a>
# **perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificate**
> TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificate(certificateId, zoneId)

Delete Hostname Client Certificate

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PerHostnameAuthenticatedOriginPullApi;

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

    PerHostnameAuthenticatedOriginPullApi apiInstance = new PerHostnameAuthenticatedOriginPullApi(defaultClient);
    String certificateId = "certificateId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle result = apiInstance.perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificate(certificateId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PerHostnameAuthenticatedOriginPullApi#perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificate");
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

[**TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle**](TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Hostname Client Certificate response |  -  |
| **4XX** | Delete Hostname Client Certificate response failure |  -  |

<a id="perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication"></a>
# **perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication**
> TlsCertificatesAndHostnamesHostnameAopResponseCollection perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication(zoneId, perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthenticationRequest)

Enable or Disable a Hostname for Client Authentication

Associate a hostname to a certificate and enable, disable or invalidate the association. If disabled, client certificate will not be sent to the hostname even if activated at the zone level. 100 maximum associations on a single certificate are allowed. Note: Use a null value for parameter *enabled* to invalidate the association.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PerHostnameAuthenticatedOriginPullApi;

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

    PerHostnameAuthenticatedOriginPullApi apiInstance = new PerHostnameAuthenticatedOriginPullApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    PerHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthenticationRequest perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthenticationRequest = new PerHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthenticationRequest(); // PerHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthenticationRequest | 
    try {
      TlsCertificatesAndHostnamesHostnameAopResponseCollection result = apiInstance.perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication(zoneId, perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthenticationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PerHostnameAuthenticatedOriginPullApi#perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication");
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
| **perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthenticationRequest** | [**PerHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthenticationRequest**](PerHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthenticationRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesHostnameAopResponseCollection**](TlsCertificatesAndHostnamesHostnameAopResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Enable or Disable a Hostname for Client Authentication response |  -  |
| **4XX** | Enable or Disable a Hostname for Client Authentication response failure |  -  |

<a id="perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificate"></a>
# **perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificate**
> TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificate(certificateId, zoneId)

Get the Hostname Client Certificate

Get the certificate by ID to be used for client authentication on a hostname.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PerHostnameAuthenticatedOriginPullApi;

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

    PerHostnameAuthenticatedOriginPullApi apiInstance = new PerHostnameAuthenticatedOriginPullApi(defaultClient);
    String certificateId = "certificateId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle result = apiInstance.perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificate(certificateId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PerHostnameAuthenticatedOriginPullApi#perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificate");
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

[**TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle**](TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the Hostname Client Certificate response |  -  |
| **4XX** | Get the Hostname Client Certificate response failure |  -  |

<a id="perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication"></a>
# **perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication**
> TlsCertificatesAndHostnamesHostnameAopSingleResponse perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication(hostname, zoneId)

Get the Hostname Status for Client Authentication

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PerHostnameAuthenticatedOriginPullApi;

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

    PerHostnameAuthenticatedOriginPullApi apiInstance = new PerHostnameAuthenticatedOriginPullApi(defaultClient);
    String hostname = "hostname_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesHostnameAopSingleResponse result = apiInstance.perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication(hostname, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PerHostnameAuthenticatedOriginPullApi#perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication");
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
| **hostname** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesHostnameAopSingleResponse**](TlsCertificatesAndHostnamesHostnameAopSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the Hostname Status for Client Authentication response |  -  |
| **4XX** | Get the Hostname Status for Client Authentication response failure |  -  |

<a id="perHostnameAuthenticatedOriginPullListCertificates"></a>
# **perHostnameAuthenticatedOriginPullListCertificates**
> TlsCertificatesAndHostnamesHostnameAuthenticatedOriginPullComponentsSchemasCertificateResponseCollection perHostnameAuthenticatedOriginPullListCertificates(zoneId)

List Certificates

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PerHostnameAuthenticatedOriginPullApi;

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

    PerHostnameAuthenticatedOriginPullApi apiInstance = new PerHostnameAuthenticatedOriginPullApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesHostnameAuthenticatedOriginPullComponentsSchemasCertificateResponseCollection result = apiInstance.perHostnameAuthenticatedOriginPullListCertificates(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PerHostnameAuthenticatedOriginPullApi#perHostnameAuthenticatedOriginPullListCertificates");
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

[**TlsCertificatesAndHostnamesHostnameAuthenticatedOriginPullComponentsSchemasCertificateResponseCollection**](TlsCertificatesAndHostnamesHostnameAuthenticatedOriginPullComponentsSchemasCertificateResponseCollection.md)

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

<a id="perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate"></a>
# **perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate**
> TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate(zoneId, perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificateRequest)

Upload a Hostname Client Certificate

Upload a certificate to be used for client authentication on a hostname. 10 hostname certificates per zone are allowed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PerHostnameAuthenticatedOriginPullApi;

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

    PerHostnameAuthenticatedOriginPullApi apiInstance = new PerHostnameAuthenticatedOriginPullApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    PerHostnameAuthenticatedOriginPullUploadAHostnameClientCertificateRequest perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificateRequest = new PerHostnameAuthenticatedOriginPullUploadAHostnameClientCertificateRequest(); // PerHostnameAuthenticatedOriginPullUploadAHostnameClientCertificateRequest | 
    try {
      TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle result = apiInstance.perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate(zoneId, perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PerHostnameAuthenticatedOriginPullApi#perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate");
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
| **perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificateRequest** | [**PerHostnameAuthenticatedOriginPullUploadAHostnameClientCertificateRequest**](PerHostnameAuthenticatedOriginPullUploadAHostnameClientCertificateRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle**](TlsCertificatesAndHostnamesComponentsSchemasCertificateResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload a Hostname Client Certificate response |  -  |
| **4XX** | Upload a Hostname Client Certificate response failure |  -  |

