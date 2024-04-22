# AccessMTlsAuthenticationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accessMtlsAuthenticationAddAnMtlsCertificate**](AccessMTlsAuthenticationApi.md#accessMtlsAuthenticationAddAnMtlsCertificate) | **POST** /accounts/{identifier}/access/certificates | Add an mTLS certificate |
| [**accessMtlsAuthenticationDeleteAnMtlsCertificate**](AccessMTlsAuthenticationApi.md#accessMtlsAuthenticationDeleteAnMtlsCertificate) | **DELETE** /accounts/{identifier}/access/certificates/{uuid} | Delete an mTLS certificate |
| [**accessMtlsAuthenticationGetAnMtlsCertificate**](AccessMTlsAuthenticationApi.md#accessMtlsAuthenticationGetAnMtlsCertificate) | **GET** /accounts/{identifier}/access/certificates/{uuid} | Get an mTLS certificate |
| [**accessMtlsAuthenticationListMtlsCertificates**](AccessMTlsAuthenticationApi.md#accessMtlsAuthenticationListMtlsCertificates) | **GET** /accounts/{identifier}/access/certificates | List mTLS certificates |
| [**accessMtlsAuthenticationListMtlsCertificatesHostnameSettings**](AccessMTlsAuthenticationApi.md#accessMtlsAuthenticationListMtlsCertificatesHostnameSettings) | **GET** /accounts/{identifier}/access/certificates/settings | List all mTLS hostname settings |
| [**accessMtlsAuthenticationUpdateAnMtlsCertificate**](AccessMTlsAuthenticationApi.md#accessMtlsAuthenticationUpdateAnMtlsCertificate) | **PUT** /accounts/{identifier}/access/certificates/{uuid} | Update an mTLS certificate |
| [**accessMtlsAuthenticationUpdateAnMtlsCertificateSettings**](AccessMTlsAuthenticationApi.md#accessMtlsAuthenticationUpdateAnMtlsCertificateSettings) | **PUT** /accounts/{identifier}/access/certificates/settings | Update an mTLS certificate&#39;s hostname settings |


<a id="accessMtlsAuthenticationAddAnMtlsCertificate"></a>
# **accessMtlsAuthenticationAddAnMtlsCertificate**
> AccessCertificatesComponentsSchemasSingleResponse accessMtlsAuthenticationAddAnMtlsCertificate(identifier, accessMtlsAuthenticationAddAnMtlsCertificateRequest)

Add an mTLS certificate

Adds a new mTLS root certificate to Access.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccessMTlsAuthenticationApi;

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

    AccessMTlsAuthenticationApi apiInstance = new AccessMTlsAuthenticationApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    AccessMtlsAuthenticationAddAnMtlsCertificateRequest accessMtlsAuthenticationAddAnMtlsCertificateRequest = new AccessMtlsAuthenticationAddAnMtlsCertificateRequest(); // AccessMtlsAuthenticationAddAnMtlsCertificateRequest | 
    try {
      AccessCertificatesComponentsSchemasSingleResponse result = apiInstance.accessMtlsAuthenticationAddAnMtlsCertificate(identifier, accessMtlsAuthenticationAddAnMtlsCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessMTlsAuthenticationApi#accessMtlsAuthenticationAddAnMtlsCertificate");
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

[**AccessCertificatesComponentsSchemasSingleResponse**](AccessCertificatesComponentsSchemasSingleResponse.md)

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

<a id="accessMtlsAuthenticationDeleteAnMtlsCertificate"></a>
# **accessMtlsAuthenticationDeleteAnMtlsCertificate**
> AccessComponentsSchemasIdResponse accessMtlsAuthenticationDeleteAnMtlsCertificate(uuid, identifier)

Delete an mTLS certificate

Deletes an mTLS certificate.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccessMTlsAuthenticationApi;

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

    AccessMTlsAuthenticationApi apiInstance = new AccessMTlsAuthenticationApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessComponentsSchemasIdResponse result = apiInstance.accessMtlsAuthenticationDeleteAnMtlsCertificate(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessMTlsAuthenticationApi#accessMtlsAuthenticationDeleteAnMtlsCertificate");
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

<a id="accessMtlsAuthenticationGetAnMtlsCertificate"></a>
# **accessMtlsAuthenticationGetAnMtlsCertificate**
> AccessCertificatesComponentsSchemasSingleResponse accessMtlsAuthenticationGetAnMtlsCertificate(uuid, identifier)

Get an mTLS certificate

Fetches a single mTLS certificate.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccessMTlsAuthenticationApi;

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

    AccessMTlsAuthenticationApi apiInstance = new AccessMTlsAuthenticationApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessCertificatesComponentsSchemasSingleResponse result = apiInstance.accessMtlsAuthenticationGetAnMtlsCertificate(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessMTlsAuthenticationApi#accessMtlsAuthenticationGetAnMtlsCertificate");
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

[**AccessCertificatesComponentsSchemasSingleResponse**](AccessCertificatesComponentsSchemasSingleResponse.md)

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

<a id="accessMtlsAuthenticationListMtlsCertificates"></a>
# **accessMtlsAuthenticationListMtlsCertificates**
> AccessCertificatesComponentsSchemasResponseCollection accessMtlsAuthenticationListMtlsCertificates(identifier)

List mTLS certificates

Lists all mTLS root certificates.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccessMTlsAuthenticationApi;

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

    AccessMTlsAuthenticationApi apiInstance = new AccessMTlsAuthenticationApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessCertificatesComponentsSchemasResponseCollection result = apiInstance.accessMtlsAuthenticationListMtlsCertificates(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessMTlsAuthenticationApi#accessMtlsAuthenticationListMtlsCertificates");
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

[**AccessCertificatesComponentsSchemasResponseCollection**](AccessCertificatesComponentsSchemasResponseCollection.md)

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

<a id="accessMtlsAuthenticationListMtlsCertificatesHostnameSettings"></a>
# **accessMtlsAuthenticationListMtlsCertificatesHostnameSettings**
> AccessResponseCollectionHostnames accessMtlsAuthenticationListMtlsCertificatesHostnameSettings(identifier)

List all mTLS hostname settings

List all mTLS hostname settings for this account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccessMTlsAuthenticationApi;

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

    AccessMTlsAuthenticationApi apiInstance = new AccessMTlsAuthenticationApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessResponseCollectionHostnames result = apiInstance.accessMtlsAuthenticationListMtlsCertificatesHostnameSettings(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessMTlsAuthenticationApi#accessMtlsAuthenticationListMtlsCertificatesHostnameSettings");
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

<a id="accessMtlsAuthenticationUpdateAnMtlsCertificate"></a>
# **accessMtlsAuthenticationUpdateAnMtlsCertificate**
> AccessCertificatesComponentsSchemasSingleResponse accessMtlsAuthenticationUpdateAnMtlsCertificate(uuid, identifier, accessMtlsAuthenticationUpdateAnMtlsCertificateRequest)

Update an mTLS certificate

Updates a configured mTLS certificate.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccessMTlsAuthenticationApi;

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

    AccessMTlsAuthenticationApi apiInstance = new AccessMTlsAuthenticationApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    AccessMtlsAuthenticationUpdateAnMtlsCertificateRequest accessMtlsAuthenticationUpdateAnMtlsCertificateRequest = new AccessMtlsAuthenticationUpdateAnMtlsCertificateRequest(); // AccessMtlsAuthenticationUpdateAnMtlsCertificateRequest | 
    try {
      AccessCertificatesComponentsSchemasSingleResponse result = apiInstance.accessMtlsAuthenticationUpdateAnMtlsCertificate(uuid, identifier, accessMtlsAuthenticationUpdateAnMtlsCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessMTlsAuthenticationApi#accessMtlsAuthenticationUpdateAnMtlsCertificate");
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

[**AccessCertificatesComponentsSchemasSingleResponse**](AccessCertificatesComponentsSchemasSingleResponse.md)

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

<a id="accessMtlsAuthenticationUpdateAnMtlsCertificateSettings"></a>
# **accessMtlsAuthenticationUpdateAnMtlsCertificateSettings**
> AccessResponseCollectionHostnames accessMtlsAuthenticationUpdateAnMtlsCertificateSettings(identifier, accessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest)

Update an mTLS certificate&#39;s hostname settings

Updates an mTLS certificate&#39;s hostname settings.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccessMTlsAuthenticationApi;

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

    AccessMTlsAuthenticationApi apiInstance = new AccessMTlsAuthenticationApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest accessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest = new AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest(); // AccessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest | 
    try {
      AccessResponseCollectionHostnames result = apiInstance.accessMtlsAuthenticationUpdateAnMtlsCertificateSettings(identifier, accessMtlsAuthenticationUpdateAnMtlsCertificateSettingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessMTlsAuthenticationApi#accessMtlsAuthenticationUpdateAnMtlsCertificateSettings");
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

