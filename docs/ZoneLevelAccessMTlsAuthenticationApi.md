# ZoneLevelAccessMTlsAuthenticationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneLevelAccessMtlsAuthenticationAddAnMtlsCertificate**](ZoneLevelAccessMTlsAuthenticationApi.md#zoneLevelAccessMtlsAuthenticationAddAnMtlsCertificate) | **POST** /zones/{identifier}/access/certificates | Add an mTLS certificate |
| [**zoneLevelAccessMtlsAuthenticationDeleteAnMtlsCertificate**](ZoneLevelAccessMTlsAuthenticationApi.md#zoneLevelAccessMtlsAuthenticationDeleteAnMtlsCertificate) | **DELETE** /zones/{identifier}/access/certificates/{uuid} | Delete an mTLS certificate |
| [**zoneLevelAccessMtlsAuthenticationGetAnMtlsCertificate**](ZoneLevelAccessMTlsAuthenticationApi.md#zoneLevelAccessMtlsAuthenticationGetAnMtlsCertificate) | **GET** /zones/{identifier}/access/certificates/{uuid} | Get an mTLS certificate |
| [**zoneLevelAccessMtlsAuthenticationListMtlsCertificates**](ZoneLevelAccessMTlsAuthenticationApi.md#zoneLevelAccessMtlsAuthenticationListMtlsCertificates) | **GET** /zones/{identifier}/access/certificates | List mTLS certificates |
| [**zoneLevelAccessMtlsAuthenticationListMtlsCertificatesHostnameSettings**](ZoneLevelAccessMTlsAuthenticationApi.md#zoneLevelAccessMtlsAuthenticationListMtlsCertificatesHostnameSettings) | **GET** /zones/{identifier}/access/certificates/settings | List all mTLS hostname settings |
| [**zoneLevelAccessMtlsAuthenticationUpdateAnMtlsCertificate**](ZoneLevelAccessMTlsAuthenticationApi.md#zoneLevelAccessMtlsAuthenticationUpdateAnMtlsCertificate) | **PUT** /zones/{identifier}/access/certificates/{uuid} | Update an mTLS certificate |
| [**zoneLevelAccessMtlsAuthenticationUpdateAnMtlsCertificateSettings**](ZoneLevelAccessMTlsAuthenticationApi.md#zoneLevelAccessMtlsAuthenticationUpdateAnMtlsCertificateSettings) | **PUT** /zones/{identifier}/access/certificates/settings | Update an mTLS certificate&#39;s hostname settings |


<a id="zoneLevelAccessMtlsAuthenticationAddAnMtlsCertificate"></a>
# **zoneLevelAccessMtlsAuthenticationAddAnMtlsCertificate**
> AccessCertificatesComponentsSchemasSingleResponse2 zoneLevelAccessMtlsAuthenticationAddAnMtlsCertificate(identifier, accessMtlsAuthenticationAddAnMtlsCertificateRequest)

Add an mTLS certificate

Adds a new mTLS root certificate to Access.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneLevelAccessMTlsAuthenticationApi;

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

    ZoneLevelAccessMTlsAuthenticationApi apiInstance = new ZoneLevelAccessMTlsAuthenticationApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    AccessMtlsAuthenticationAddAnMtlsCertificateRequest accessMtlsAuthenticationAddAnMtlsCertificateRequest = new AccessMtlsAuthenticationAddAnMtlsCertificateRequest(); // AccessMtlsAuthenticationAddAnMtlsCertificateRequest | 
    try {
      AccessCertificatesComponentsSchemasSingleResponse2 result = apiInstance.zoneLevelAccessMtlsAuthenticationAddAnMtlsCertificate(identifier, accessMtlsAuthenticationAddAnMtlsCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessMTlsAuthenticationApi#zoneLevelAccessMtlsAuthenticationAddAnMtlsCertificate");
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
| **identifier** | **String**|  | |
| **accessMtlsAuthenticationAddAnMtlsCertificateRequest** | [**AccessMtlsAuthenticationAddAnMtlsCertificateRequest**](AccessMtlsAuthenticationAddAnMtlsCertificateRequest.md)|  | |

### Return type

[**AccessCertificatesComponentsSchemasSingleResponse2**](AccessCertificatesComponentsSchemasSingleResponse2.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Add an mTLS certificate response |  -  |
| **4XX** | Add an mTLS certificate response failure |  -  |

<a id="zoneLevelAccessMtlsAuthenticationDeleteAnMtlsCertificate"></a>
# **zoneLevelAccessMtlsAuthenticationDeleteAnMtlsCertificate**
> AccessComponentsSchemasIdResponse zoneLevelAccessMtlsAuthenticationDeleteAnMtlsCertificate(uuid, identifier)

Delete an mTLS certificate

Deletes an mTLS certificate.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneLevelAccessMTlsAuthenticationApi;

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

    ZoneLevelAccessMTlsAuthenticationApi apiInstance = new ZoneLevelAccessMTlsAuthenticationApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessComponentsSchemasIdResponse result = apiInstance.zoneLevelAccessMtlsAuthenticationDeleteAnMtlsCertificate(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessMTlsAuthenticationApi#zoneLevelAccessMtlsAuthenticationDeleteAnMtlsCertificate");
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
| **uuid** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**AccessComponentsSchemasIdResponse**](AccessComponentsSchemasIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete an mTLS certificate response |  -  |
| **4XX** | Delete an mTLS certificate response failure |  -  |

<a id="zoneLevelAccessMtlsAuthenticationGetAnMtlsCertificate"></a>
# **zoneLevelAccessMtlsAuthenticationGetAnMtlsCertificate**
> AccessCertificatesComponentsSchemasSingleResponse2 zoneLevelAccessMtlsAuthenticationGetAnMtlsCertificate(uuid, identifier)

Get an mTLS certificate

Fetches a single mTLS certificate.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneLevelAccessMTlsAuthenticationApi;

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

    ZoneLevelAccessMTlsAuthenticationApi apiInstance = new ZoneLevelAccessMTlsAuthenticationApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessCertificatesComponentsSchemasSingleResponse2 result = apiInstance.zoneLevelAccessMtlsAuthenticationGetAnMtlsCertificate(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessMTlsAuthenticationApi#zoneLevelAccessMtlsAuthenticationGetAnMtlsCertificate");
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
| **uuid** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**AccessCertificatesComponentsSchemasSingleResponse2**](AccessCertificatesComponentsSchemasSingleResponse2.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get an mTLS certificate response |  -  |
| **4XX** | Get an mTLS certificate response failure |  -  |

<a id="zoneLevelAccessMtlsAuthenticationListMtlsCertificates"></a>
# **zoneLevelAccessMtlsAuthenticationListMtlsCertificates**
> AccessCertificatesComponentsSchemasResponseCollection2 zoneLevelAccessMtlsAuthenticationListMtlsCertificates(identifier)

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
import org.openapitools.client.api.ZoneLevelAccessMTlsAuthenticationApi;

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

    ZoneLevelAccessMTlsAuthenticationApi apiInstance = new ZoneLevelAccessMTlsAuthenticationApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessCertificatesComponentsSchemasResponseCollection2 result = apiInstance.zoneLevelAccessMtlsAuthenticationListMtlsCertificates(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessMTlsAuthenticationApi#zoneLevelAccessMtlsAuthenticationListMtlsCertificates");
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
| **identifier** | **String**|  | |

### Return type

[**AccessCertificatesComponentsSchemasResponseCollection2**](AccessCertificatesComponentsSchemasResponseCollection2.md)

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

<a id="zoneLevelAccessMtlsAuthenticationListMtlsCertificatesHostnameSettings"></a>
# **zoneLevelAccessMtlsAuthenticationListMtlsCertificatesHostnameSettings**
> AccessResponseCollectionHostnames zoneLevelAccessMtlsAuthenticationListMtlsCertificatesHostnameSettings(identifier)

List all mTLS hostname settings

List all mTLS hostname settings for this zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneLevelAccessMTlsAuthenticationApi;

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

    ZoneLevelAccessMTlsAuthenticationApi apiInstance = new ZoneLevelAccessMTlsAuthenticationApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessResponseCollectionHostnames result = apiInstance.zoneLevelAccessMtlsAuthenticationListMtlsCertificatesHostnameSettings(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessMTlsAuthenticationApi#zoneLevelAccessMtlsAuthenticationListMtlsCertificatesHostnameSettings");
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
| **identifier** | **String**|  | |

### Return type

[**AccessResponseCollectionHostnames**](AccessResponseCollectionHostnames.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List mTLS hostname settings response |  -  |
| **4XX** | List mTLS hostname settings response failure |  -  |

<a id="zoneLevelAccessMtlsAuthenticationUpdateAnMtlsCertificate"></a>
# **zoneLevelAccessMtlsAuthenticationUpdateAnMtlsCertificate**
> AccessCertificatesComponentsSchemasSingleResponse2 zoneLevelAccessMtlsAuthenticationUpdateAnMtlsCertificate(uuid, identifier, accessMtlsAuthenticationUpdateAnMtlsCertificateRequest)

Update an mTLS certificate

Updates a configured mTLS certificate.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneLevelAccessMTlsAuthenticationApi;

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

    ZoneLevelAccessMTlsAuthenticationApi apiInstance = new ZoneLevelAccessMTlsAuthenticationApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    AccessMtlsAuthenticationUpdateAnMtlsCertificateRequest accessMtlsAuthenticationUpdateAnMtlsCertificateRequest = new AccessMtlsAuthenticationUpdateAnMtlsCertificateRequest(); // AccessMtlsAuthenticationUpdateAnMtlsCertificateRequest | 
    try {
      AccessCertificatesComponentsSchemasSingleResponse2 result = apiInstance.zoneLevelAccessMtlsAuthenticationUpdateAnMtlsCertificate(uuid, identifier, accessMtlsAuthenticationUpdateAnMtlsCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessMTlsAuthenticationApi#zoneLevelAccessMtlsAuthenticationUpdateAnMtlsCertificate");
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
| **uuid** | **String**|  | |
| **identifier** | **String**|  | |
| **accessMtlsAuthenticationUpdateAnMtlsCertificateRequest** | [**AccessMtlsAuthenticationUpdateAnMtlsCertificateRequest**](AccessMtlsAuthenticationUpdateAnMtlsCertificateRequest.md)|  | |

### Return type

[**AccessCertificatesComponentsSchemasSingleResponse2**](AccessCertificatesComponentsSchemasSingleResponse2.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update an mTLS certificate response |  -  |
| **4XX** | Update an mTLS certificate response failure |  -  |

<a id="zoneLevelAccessMtlsAuthenticationUpdateAnMtlsCertificateSettings"></a>
# **zoneLevelAccessMtlsAuthenticationUpdateAnMtlsCertificateSettings**
> AccessResponseCollectionHostnames zoneLevelAccessMtlsAuthenticationUpdateAnMtlsCertificateSettings(identifier, accessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest)

Update an mTLS certificate&#39;s hostname settings

Updates an mTLS certificate&#39;s hostname settings.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneLevelAccessMTlsAuthenticationApi;

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

    ZoneLevelAccessMTlsAuthenticationApi apiInstance = new ZoneLevelAccessMTlsAuthenticationApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest accessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest = new AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest(); // AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest | 
    try {
      AccessResponseCollectionHostnames result = apiInstance.zoneLevelAccessMtlsAuthenticationUpdateAnMtlsCertificateSettings(identifier, accessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessMTlsAuthenticationApi#zoneLevelAccessMtlsAuthenticationUpdateAnMtlsCertificateSettings");
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
| **identifier** | **String**|  | |
| **accessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest** | [**AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest**](AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest.md)|  | |

### Return type

[**AccessResponseCollectionHostnames**](AccessResponseCollectionHostnames.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Update an mTLS certificates hostname settings response |  -  |
| **4XX** | Update an mTLS certificates hostname settings failure |  -  |

