# IpAddressManagementPrefixesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ipAddressManagementPrefixesAddPrefix**](IpAddressManagementPrefixesApi.md#ipAddressManagementPrefixesAddPrefix) | **POST** /accounts/{account_id}/addressing/prefixes | Add Prefix |
| [**ipAddressManagementPrefixesDeletePrefix**](IpAddressManagementPrefixesApi.md#ipAddressManagementPrefixesDeletePrefix) | **DELETE** /accounts/{account_id}/addressing/prefixes/{prefix_id} | Delete Prefix |
| [**ipAddressManagementPrefixesDownloadLoaDocument**](IpAddressManagementPrefixesApi.md#ipAddressManagementPrefixesDownloadLoaDocument) | **GET** /accounts/{account_id}/addressing/loa_documents/{loa_document_id}/download | Download LOA Document |
| [**ipAddressManagementPrefixesListPrefixes**](IpAddressManagementPrefixesApi.md#ipAddressManagementPrefixesListPrefixes) | **GET** /accounts/{account_id}/addressing/prefixes | List Prefixes |
| [**ipAddressManagementPrefixesPrefixDetails**](IpAddressManagementPrefixesApi.md#ipAddressManagementPrefixesPrefixDetails) | **GET** /accounts/{account_id}/addressing/prefixes/{prefix_id} | Prefix Details |
| [**ipAddressManagementPrefixesUpdatePrefixDescription**](IpAddressManagementPrefixesApi.md#ipAddressManagementPrefixesUpdatePrefixDescription) | **PATCH** /accounts/{account_id}/addressing/prefixes/{prefix_id} | Update Prefix Description |
| [**ipAddressManagementPrefixesUploadLoaDocument**](IpAddressManagementPrefixesApi.md#ipAddressManagementPrefixesUploadLoaDocument) | **POST** /accounts/{account_id}/addressing/loa_documents | Upload LOA Document |


<a id="ipAddressManagementPrefixesAddPrefix"></a>
# **ipAddressManagementPrefixesAddPrefix**
> AddressingSingleResponse ipAddressManagementPrefixesAddPrefix(accountId, ipAddressManagementPrefixesAddPrefixRequest)

Add Prefix

Add a new prefix under the account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementPrefixesApi;

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

    IpAddressManagementPrefixesApi apiInstance = new IpAddressManagementPrefixesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    IpAddressManagementPrefixesAddPrefixRequest ipAddressManagementPrefixesAddPrefixRequest = new IpAddressManagementPrefixesAddPrefixRequest(); // IpAddressManagementPrefixesAddPrefixRequest | 
    try {
      AddressingSingleResponse result = apiInstance.ipAddressManagementPrefixesAddPrefix(accountId, ipAddressManagementPrefixesAddPrefixRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementPrefixesApi#ipAddressManagementPrefixesAddPrefix");
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
| **ipAddressManagementPrefixesAddPrefixRequest** | [**IpAddressManagementPrefixesAddPrefixRequest**](IpAddressManagementPrefixesAddPrefixRequest.md)|  | |

### Return type

[**AddressingSingleResponse**](AddressingSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Add Prefix response |  -  |
| **4XX** | Add Prefix response failure |  -  |

<a id="ipAddressManagementPrefixesDeletePrefix"></a>
# **ipAddressManagementPrefixesDeletePrefix**
> AddressingApiResponseCollection ipAddressManagementPrefixesDeletePrefix(prefixId, accountId)

Delete Prefix

Delete an unapproved prefix owned by the account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementPrefixesApi;

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

    IpAddressManagementPrefixesApi apiInstance = new IpAddressManagementPrefixesApi(defaultClient);
    String prefixId = "prefixId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      AddressingApiResponseCollection result = apiInstance.ipAddressManagementPrefixesDeletePrefix(prefixId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementPrefixesApi#ipAddressManagementPrefixesDeletePrefix");
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
| **prefixId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**AddressingApiResponseCollection**](AddressingApiResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Prefix response |  -  |
| **4XX** | Delete Prefix response failure |  -  |

<a id="ipAddressManagementPrefixesDownloadLoaDocument"></a>
# **ipAddressManagementPrefixesDownloadLoaDocument**
> Object ipAddressManagementPrefixesDownloadLoaDocument(loaDocumentId, accountId)

Download LOA Document

Download specified LOA document under the account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementPrefixesApi;

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

    IpAddressManagementPrefixesApi apiInstance = new IpAddressManagementPrefixesApi(defaultClient);
    String loaDocumentId = "loaDocumentId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      Object result = apiInstance.ipAddressManagementPrefixesDownloadLoaDocument(loaDocumentId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementPrefixesApi#ipAddressManagementPrefixesDownloadLoaDocument");
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
| **loaDocumentId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download LOA Document response |  -  |
| **4XX** | Download LOA Document response failure |  -  |

<a id="ipAddressManagementPrefixesListPrefixes"></a>
# **ipAddressManagementPrefixesListPrefixes**
> AddressingResponseCollection ipAddressManagementPrefixesListPrefixes(accountId)

List Prefixes

List all prefixes owned by the account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementPrefixesApi;

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

    IpAddressManagementPrefixesApi apiInstance = new IpAddressManagementPrefixesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      AddressingResponseCollection result = apiInstance.ipAddressManagementPrefixesListPrefixes(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementPrefixesApi#ipAddressManagementPrefixesListPrefixes");
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

[**AddressingResponseCollection**](AddressingResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Prefixes response |  -  |
| **4XX** | List Prefixes response failure |  -  |

<a id="ipAddressManagementPrefixesPrefixDetails"></a>
# **ipAddressManagementPrefixesPrefixDetails**
> AddressingSingleResponse ipAddressManagementPrefixesPrefixDetails(prefixId, accountId)

Prefix Details

List a particular prefix owned by the account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementPrefixesApi;

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

    IpAddressManagementPrefixesApi apiInstance = new IpAddressManagementPrefixesApi(defaultClient);
    String prefixId = "prefixId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      AddressingSingleResponse result = apiInstance.ipAddressManagementPrefixesPrefixDetails(prefixId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementPrefixesApi#ipAddressManagementPrefixesPrefixDetails");
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
| **prefixId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**AddressingSingleResponse**](AddressingSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prefix Details response |  -  |
| **4XX** | Prefix Details response failure |  -  |

<a id="ipAddressManagementPrefixesUpdatePrefixDescription"></a>
# **ipAddressManagementPrefixesUpdatePrefixDescription**
> AddressingSingleResponse ipAddressManagementPrefixesUpdatePrefixDescription(prefixId, accountId, ipAddressManagementPrefixesUpdatePrefixDescriptionRequest)

Update Prefix Description

Modify the description for a prefix owned by the account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementPrefixesApi;

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

    IpAddressManagementPrefixesApi apiInstance = new IpAddressManagementPrefixesApi(defaultClient);
    String prefixId = "prefixId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    IpAddressManagementPrefixesUpdatePrefixDescriptionRequest ipAddressManagementPrefixesUpdatePrefixDescriptionRequest = new IpAddressManagementPrefixesUpdatePrefixDescriptionRequest(); // IpAddressManagementPrefixesUpdatePrefixDescriptionRequest | 
    try {
      AddressingSingleResponse result = apiInstance.ipAddressManagementPrefixesUpdatePrefixDescription(prefixId, accountId, ipAddressManagementPrefixesUpdatePrefixDescriptionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementPrefixesApi#ipAddressManagementPrefixesUpdatePrefixDescription");
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
| **prefixId** | **String**|  | |
| **accountId** | **String**|  | |
| **ipAddressManagementPrefixesUpdatePrefixDescriptionRequest** | [**IpAddressManagementPrefixesUpdatePrefixDescriptionRequest**](IpAddressManagementPrefixesUpdatePrefixDescriptionRequest.md)|  | |

### Return type

[**AddressingSingleResponse**](AddressingSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Prefix Description response |  -  |
| **4XX** | Update Prefix Description response failure |  -  |

<a id="ipAddressManagementPrefixesUploadLoaDocument"></a>
# **ipAddressManagementPrefixesUploadLoaDocument**
> AddressingLoaUploadResponse ipAddressManagementPrefixesUploadLoaDocument(accountId, loaDocument)

Upload LOA Document

Submit LOA document (pdf format) under the account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAddressManagementPrefixesApi;

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

    IpAddressManagementPrefixesApi apiInstance = new IpAddressManagementPrefixesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String loaDocument = "loaDocument_example"; // String | LOA document to upload.
    try {
      AddressingLoaUploadResponse result = apiInstance.ipAddressManagementPrefixesUploadLoaDocument(accountId, loaDocument);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementPrefixesApi#ipAddressManagementPrefixesUploadLoaDocument");
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
| **loaDocument** | **String**| LOA document to upload. | |

### Return type

[**AddressingLoaUploadResponse**](AddressingLoaUploadResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload LOA Document response |  -  |
| **4XX** | Upload LOA Document response failure |  -  |

