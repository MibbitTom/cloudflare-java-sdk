# ApiShieldClientCertificatesForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clientCertificateForAZoneClientCertificateDetails**](ApiShieldClientCertificatesForAZoneApi.md#clientCertificateForAZoneClientCertificateDetails) | **GET** /zones/{zone_id}/client_certificates/{client_certificate_id} | Client Certificate Details |
| [**clientCertificateForAZoneCreateClientCertificate**](ApiShieldClientCertificatesForAZoneApi.md#clientCertificateForAZoneCreateClientCertificate) | **POST** /zones/{zone_id}/client_certificates | Create Client Certificate |
| [**clientCertificateForAZoneDeleteClientCertificate**](ApiShieldClientCertificatesForAZoneApi.md#clientCertificateForAZoneDeleteClientCertificate) | **DELETE** /zones/{zone_id}/client_certificates/{client_certificate_id} | Revoke Client Certificate |
| [**clientCertificateForAZoneEditClientCertificate**](ApiShieldClientCertificatesForAZoneApi.md#clientCertificateForAZoneEditClientCertificate) | **PATCH** /zones/{zone_id}/client_certificates/{client_certificate_id} | Reactivate Client Certificate |
| [**clientCertificateForAZoneListClientCertificates**](ApiShieldClientCertificatesForAZoneApi.md#clientCertificateForAZoneListClientCertificates) | **GET** /zones/{zone_id}/client_certificates | List Client Certificates |
| [**clientCertificateForAZoneListHostnameAssociations**](ApiShieldClientCertificatesForAZoneApi.md#clientCertificateForAZoneListHostnameAssociations) | **GET** /zones/{zone_id}/certificate_authorities/hostname_associations | List Hostname Associations |
| [**clientCertificateForAZonePutHostnameAssociations**](ApiShieldClientCertificatesForAZoneApi.md#clientCertificateForAZonePutHostnameAssociations) | **PUT** /zones/{zone_id}/certificate_authorities/hostname_associations | Replace Hostname Associations |


<a id="clientCertificateForAZoneClientCertificateDetails"></a>
# **clientCertificateForAZoneClientCertificateDetails**
> TlsCertificatesAndHostnamesClientCertificateResponseSingle clientCertificateForAZoneClientCertificateDetails(zoneId, clientCertificateId)

Client Certificate Details

Get Details for a single mTLS API Shield Client Certificate

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldClientCertificatesForAZoneApi;

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

    ApiShieldClientCertificatesForAZoneApi apiInstance = new ApiShieldClientCertificatesForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String clientCertificateId = "clientCertificateId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesClientCertificateResponseSingle result = apiInstance.clientCertificateForAZoneClientCertificateDetails(zoneId, clientCertificateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldClientCertificatesForAZoneApi#clientCertificateForAZoneClientCertificateDetails");
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
| **clientCertificateId** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesClientCertificateResponseSingle**](TlsCertificatesAndHostnamesClientCertificateResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Client Certificate Details Response |  -  |
| **4XX** | Client Certificate Details Response Failure |  -  |

<a id="clientCertificateForAZoneCreateClientCertificate"></a>
# **clientCertificateForAZoneCreateClientCertificate**
> TlsCertificatesAndHostnamesClientCertificateResponseSingle clientCertificateForAZoneCreateClientCertificate(zoneId, clientCertificateForAZoneCreateClientCertificateRequest)

Create Client Certificate

Create a new API Shield mTLS Client Certificate

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldClientCertificatesForAZoneApi;

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

    ApiShieldClientCertificatesForAZoneApi apiInstance = new ApiShieldClientCertificatesForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ClientCertificateForAZoneCreateClientCertificateRequest clientCertificateForAZoneCreateClientCertificateRequest = new ClientCertificateForAZoneCreateClientCertificateRequest(); // ClientCertificateForAZoneCreateClientCertificateRequest | 
    try {
      TlsCertificatesAndHostnamesClientCertificateResponseSingle result = apiInstance.clientCertificateForAZoneCreateClientCertificate(zoneId, clientCertificateForAZoneCreateClientCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldClientCertificatesForAZoneApi#clientCertificateForAZoneCreateClientCertificate");
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
| **clientCertificateForAZoneCreateClientCertificateRequest** | [**ClientCertificateForAZoneCreateClientCertificateRequest**](ClientCertificateForAZoneCreateClientCertificateRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesClientCertificateResponseSingle**](TlsCertificatesAndHostnamesClientCertificateResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Client Certificate Response |  -  |
| **4XX** | Create Client Certificate Response Failure |  -  |

<a id="clientCertificateForAZoneDeleteClientCertificate"></a>
# **clientCertificateForAZoneDeleteClientCertificate**
> TlsCertificatesAndHostnamesClientCertificateResponseSingle clientCertificateForAZoneDeleteClientCertificate(zoneId, clientCertificateId)

Revoke Client Certificate

Set a API Shield mTLS Client Certificate to pending_revocation status for processing to revoked status.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldClientCertificatesForAZoneApi;

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

    ApiShieldClientCertificatesForAZoneApi apiInstance = new ApiShieldClientCertificatesForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String clientCertificateId = "clientCertificateId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesClientCertificateResponseSingle result = apiInstance.clientCertificateForAZoneDeleteClientCertificate(zoneId, clientCertificateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldClientCertificatesForAZoneApi#clientCertificateForAZoneDeleteClientCertificate");
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
| **clientCertificateId** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesClientCertificateResponseSingle**](TlsCertificatesAndHostnamesClientCertificateResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Revoke Client Certificate Response |  -  |
| **4XX** | Revoke Client Certificate Response Failure |  -  |

<a id="clientCertificateForAZoneEditClientCertificate"></a>
# **clientCertificateForAZoneEditClientCertificate**
> TlsCertificatesAndHostnamesClientCertificateResponseSingle clientCertificateForAZoneEditClientCertificate(zoneId, clientCertificateId)

Reactivate Client Certificate

If a API Shield mTLS Client Certificate is in a pending_revocation state, you may reactivate it with this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldClientCertificatesForAZoneApi;

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

    ApiShieldClientCertificatesForAZoneApi apiInstance = new ApiShieldClientCertificatesForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String clientCertificateId = "clientCertificateId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesClientCertificateResponseSingle result = apiInstance.clientCertificateForAZoneEditClientCertificate(zoneId, clientCertificateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldClientCertificatesForAZoneApi#clientCertificateForAZoneEditClientCertificate");
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
| **clientCertificateId** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesClientCertificateResponseSingle**](TlsCertificatesAndHostnamesClientCertificateResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reactivate Client Certificate Response |  -  |
| **4XX** | Reactivate Client Certificate Response Failure |  -  |

<a id="clientCertificateForAZoneListClientCertificates"></a>
# **clientCertificateForAZoneListClientCertificates**
> TlsCertificatesAndHostnamesClientCertificateResponseCollection clientCertificateForAZoneListClientCertificates(zoneId, status, page, perPage, limit, offset)

List Client Certificates

List all of your Zone&#39;s API Shield mTLS Client Certificates by Status and/or using Pagination

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldClientCertificatesForAZoneApi;

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

    ApiShieldClientCertificatesForAZoneApi apiInstance = new ApiShieldClientCertificatesForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String status = "all"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    Integer limit = 10; // Integer | 
    Integer offset = 10; // Integer | 
    try {
      TlsCertificatesAndHostnamesClientCertificateResponseCollection result = apiInstance.clientCertificateForAZoneListClientCertificates(zoneId, status, page, perPage, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldClientCertificatesForAZoneApi#clientCertificateForAZoneListClientCertificates");
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
| **status** | **String**|  | [optional] [enum: all, active, pending_reactivation, pending_revocation, revoked] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |

### Return type

[**TlsCertificatesAndHostnamesClientCertificateResponseCollection**](TlsCertificatesAndHostnamesClientCertificateResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Client Certificates Response |  -  |
| **4XX** | List Client Certificates Response Failure |  -  |

<a id="clientCertificateForAZoneListHostnameAssociations"></a>
# **clientCertificateForAZoneListHostnameAssociations**
> TlsCertificatesAndHostnamesHostnameAssociationsResponse clientCertificateForAZoneListHostnameAssociations(zoneId, mtlsCertificateId)

List Hostname Associations

List Hostname Associations

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldClientCertificatesForAZoneApi;

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

    ApiShieldClientCertificatesForAZoneApi apiInstance = new ApiShieldClientCertificatesForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String mtlsCertificateId = "b2134436-2555-4acf-be5b-26c48136575e"; // String | 
    try {
      TlsCertificatesAndHostnamesHostnameAssociationsResponse result = apiInstance.clientCertificateForAZoneListHostnameAssociations(zoneId, mtlsCertificateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldClientCertificatesForAZoneApi#clientCertificateForAZoneListHostnameAssociations");
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
| **mtlsCertificateId** | **String**|  | [optional] |

### Return type

[**TlsCertificatesAndHostnamesHostnameAssociationsResponse**](TlsCertificatesAndHostnamesHostnameAssociationsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Hostname Associations Response |  -  |
| **4XX** | List Hostname Associations Response Failure |  -  |

<a id="clientCertificateForAZonePutHostnameAssociations"></a>
# **clientCertificateForAZonePutHostnameAssociations**
> TlsCertificatesAndHostnamesHostnameAssociationsResponse clientCertificateForAZonePutHostnameAssociations(zoneId, tlsCertificatesAndHostnamesHostnameAssociation)

Replace Hostname Associations

Replace Hostname Associations

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldClientCertificatesForAZoneApi;

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

    ApiShieldClientCertificatesForAZoneApi apiInstance = new ApiShieldClientCertificatesForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    TlsCertificatesAndHostnamesHostnameAssociation tlsCertificatesAndHostnamesHostnameAssociation = new TlsCertificatesAndHostnamesHostnameAssociation(); // TlsCertificatesAndHostnamesHostnameAssociation | 
    try {
      TlsCertificatesAndHostnamesHostnameAssociationsResponse result = apiInstance.clientCertificateForAZonePutHostnameAssociations(zoneId, tlsCertificatesAndHostnamesHostnameAssociation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldClientCertificatesForAZoneApi#clientCertificateForAZonePutHostnameAssociations");
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
| **tlsCertificatesAndHostnamesHostnameAssociation** | [**TlsCertificatesAndHostnamesHostnameAssociation**](TlsCertificatesAndHostnamesHostnameAssociation.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesHostnameAssociationsResponse**](TlsCertificatesAndHostnamesHostnameAssociationsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Replace Hostname Associations Response |  -  |
| **4XX** | Replace Hostname Associations Response Failure |  -  |

