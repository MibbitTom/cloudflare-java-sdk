# Web3HostnameApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**web3HostnameCreateIpfsUniversalPathGatewayContentListEntry**](Web3HostnameApi.md#web3HostnameCreateIpfsUniversalPathGatewayContentListEntry) | **POST** /zones/{zone_identifier}/web3/hostnames/{identifier}/ipfs_universal_path/content_list/entries | Create IPFS Universal Path Gateway Content List Entry |
| [**web3HostnameCreateWeb3Hostname**](Web3HostnameApi.md#web3HostnameCreateWeb3Hostname) | **POST** /zones/{zone_identifier}/web3/hostnames | Create Web3 Hostname |
| [**web3HostnameDeleteIpfsUniversalPathGatewayContentListEntry**](Web3HostnameApi.md#web3HostnameDeleteIpfsUniversalPathGatewayContentListEntry) | **DELETE** /zones/{zone_identifier}/web3/hostnames/{identifier}/ipfs_universal_path/content_list/entries/{content_list_entry_identifier} | Delete IPFS Universal Path Gateway Content List Entry |
| [**web3HostnameDeleteWeb3Hostname**](Web3HostnameApi.md#web3HostnameDeleteWeb3Hostname) | **DELETE** /zones/{zone_identifier}/web3/hostnames/{identifier} | Delete Web3 Hostname |
| [**web3HostnameEditIpfsUniversalPathGatewayContentListEntry**](Web3HostnameApi.md#web3HostnameEditIpfsUniversalPathGatewayContentListEntry) | **PUT** /zones/{zone_identifier}/web3/hostnames/{identifier}/ipfs_universal_path/content_list/entries/{content_list_entry_identifier} | Edit IPFS Universal Path Gateway Content List Entry |
| [**web3HostnameEditWeb3Hostname**](Web3HostnameApi.md#web3HostnameEditWeb3Hostname) | **PATCH** /zones/{zone_identifier}/web3/hostnames/{identifier} | Edit Web3 Hostname |
| [**web3HostnameIpfsUniversalPathGatewayContentListDetails**](Web3HostnameApi.md#web3HostnameIpfsUniversalPathGatewayContentListDetails) | **GET** /zones/{zone_identifier}/web3/hostnames/{identifier}/ipfs_universal_path/content_list | IPFS Universal Path Gateway Content List Details |
| [**web3HostnameIpfsUniversalPathGatewayContentListEntryDetails**](Web3HostnameApi.md#web3HostnameIpfsUniversalPathGatewayContentListEntryDetails) | **GET** /zones/{zone_identifier}/web3/hostnames/{identifier}/ipfs_universal_path/content_list/entries/{content_list_entry_identifier} | IPFS Universal Path Gateway Content List Entry Details |
| [**web3HostnameListIpfsUniversalPathGatewayContentListEntries**](Web3HostnameApi.md#web3HostnameListIpfsUniversalPathGatewayContentListEntries) | **GET** /zones/{zone_identifier}/web3/hostnames/{identifier}/ipfs_universal_path/content_list/entries | List IPFS Universal Path Gateway Content List Entries |
| [**web3HostnameListWeb3Hostnames**](Web3HostnameApi.md#web3HostnameListWeb3Hostnames) | **GET** /zones/{zone_identifier}/web3/hostnames | List Web3 Hostnames |
| [**web3HostnameUpdateIpfsUniversalPathGatewayContentList**](Web3HostnameApi.md#web3HostnameUpdateIpfsUniversalPathGatewayContentList) | **PUT** /zones/{zone_identifier}/web3/hostnames/{identifier}/ipfs_universal_path/content_list | Update IPFS Universal Path Gateway Content List |
| [**web3HostnameWeb3HostnameDetails**](Web3HostnameApi.md#web3HostnameWeb3HostnameDetails) | **GET** /zones/{zone_identifier}/web3/hostnames/{identifier} | Web3 Hostname Details |


<a id="web3HostnameCreateIpfsUniversalPathGatewayContentListEntry"></a>
# **web3HostnameCreateIpfsUniversalPathGatewayContentListEntry**
> DwebConfigContentListEntrySingleResponse web3HostnameCreateIpfsUniversalPathGatewayContentListEntry(identifier, zoneIdentifier, dwebConfigContentListEntryCreateRequest)

Create IPFS Universal Path Gateway Content List Entry

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.Web3HostnameApi;

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

    Web3HostnameApi apiInstance = new Web3HostnameApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    DwebConfigContentListEntryCreateRequest dwebConfigContentListEntryCreateRequest = new DwebConfigContentListEntryCreateRequest(); // DwebConfigContentListEntryCreateRequest | 
    try {
      DwebConfigContentListEntrySingleResponse result = apiInstance.web3HostnameCreateIpfsUniversalPathGatewayContentListEntry(identifier, zoneIdentifier, dwebConfigContentListEntryCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Web3HostnameApi#web3HostnameCreateIpfsUniversalPathGatewayContentListEntry");
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
| **zoneIdentifier** | **String**|  | |
| **dwebConfigContentListEntryCreateRequest** | [**DwebConfigContentListEntryCreateRequest**](DwebConfigContentListEntryCreateRequest.md)|  | |

### Return type

[**DwebConfigContentListEntrySingleResponse**](DwebConfigContentListEntrySingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create IPFS Universal Path Gateway Content List Entry response |  -  |
| **5XX** | Create IPFS Universal Path Gateway Content List Entry response failure |  -  |

<a id="web3HostnameCreateWeb3Hostname"></a>
# **web3HostnameCreateWeb3Hostname**
> DwebConfigSingleResponse web3HostnameCreateWeb3Hostname(zoneIdentifier, dwebConfigCreateRequest)

Create Web3 Hostname

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.Web3HostnameApi;

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

    Web3HostnameApi apiInstance = new Web3HostnameApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    DwebConfigCreateRequest dwebConfigCreateRequest = new DwebConfigCreateRequest(); // DwebConfigCreateRequest | 
    try {
      DwebConfigSingleResponse result = apiInstance.web3HostnameCreateWeb3Hostname(zoneIdentifier, dwebConfigCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Web3HostnameApi#web3HostnameCreateWeb3Hostname");
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
| **zoneIdentifier** | **String**|  | |
| **dwebConfigCreateRequest** | [**DwebConfigCreateRequest**](DwebConfigCreateRequest.md)|  | |

### Return type

[**DwebConfigSingleResponse**](DwebConfigSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Web3 Hostname response |  -  |
| **5XX** | Create Web3 Hostname response failure |  -  |

<a id="web3HostnameDeleteIpfsUniversalPathGatewayContentListEntry"></a>
# **web3HostnameDeleteIpfsUniversalPathGatewayContentListEntry**
> DwebConfigApiResponseSingleId web3HostnameDeleteIpfsUniversalPathGatewayContentListEntry(contentListEntryIdentifier, identifier, zoneIdentifier)

Delete IPFS Universal Path Gateway Content List Entry

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.Web3HostnameApi;

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

    Web3HostnameApi apiInstance = new Web3HostnameApi(defaultClient);
    String contentListEntryIdentifier = "contentListEntryIdentifier_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      DwebConfigApiResponseSingleId result = apiInstance.web3HostnameDeleteIpfsUniversalPathGatewayContentListEntry(contentListEntryIdentifier, identifier, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Web3HostnameApi#web3HostnameDeleteIpfsUniversalPathGatewayContentListEntry");
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
| **contentListEntryIdentifier** | **String**|  | |
| **identifier** | **String**|  | |
| **zoneIdentifier** | **String**|  | |

### Return type

[**DwebConfigApiResponseSingleId**](DwebConfigApiResponseSingleId.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete IPFS Universal Path Gateway Content List Entry response |  -  |
| **5XX** | Delete IPFS Universal Path Gateway Content List Entry response failure |  -  |

<a id="web3HostnameDeleteWeb3Hostname"></a>
# **web3HostnameDeleteWeb3Hostname**
> DwebConfigApiResponseSingleId web3HostnameDeleteWeb3Hostname(identifier, zoneIdentifier)

Delete Web3 Hostname

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.Web3HostnameApi;

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

    Web3HostnameApi apiInstance = new Web3HostnameApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      DwebConfigApiResponseSingleId result = apiInstance.web3HostnameDeleteWeb3Hostname(identifier, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Web3HostnameApi#web3HostnameDeleteWeb3Hostname");
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
| **zoneIdentifier** | **String**|  | |

### Return type

[**DwebConfigApiResponseSingleId**](DwebConfigApiResponseSingleId.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Web3 Hostname response |  -  |
| **5XX** | Delete Web3 Hostname response failure |  -  |

<a id="web3HostnameEditIpfsUniversalPathGatewayContentListEntry"></a>
# **web3HostnameEditIpfsUniversalPathGatewayContentListEntry**
> DwebConfigContentListEntrySingleResponse web3HostnameEditIpfsUniversalPathGatewayContentListEntry(contentListEntryIdentifier, identifier, zoneIdentifier, dwebConfigContentListEntryCreateRequest)

Edit IPFS Universal Path Gateway Content List Entry

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.Web3HostnameApi;

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

    Web3HostnameApi apiInstance = new Web3HostnameApi(defaultClient);
    String contentListEntryIdentifier = "contentListEntryIdentifier_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    DwebConfigContentListEntryCreateRequest dwebConfigContentListEntryCreateRequest = new DwebConfigContentListEntryCreateRequest(); // DwebConfigContentListEntryCreateRequest | 
    try {
      DwebConfigContentListEntrySingleResponse result = apiInstance.web3HostnameEditIpfsUniversalPathGatewayContentListEntry(contentListEntryIdentifier, identifier, zoneIdentifier, dwebConfigContentListEntryCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Web3HostnameApi#web3HostnameEditIpfsUniversalPathGatewayContentListEntry");
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
| **contentListEntryIdentifier** | **String**|  | |
| **identifier** | **String**|  | |
| **zoneIdentifier** | **String**|  | |
| **dwebConfigContentListEntryCreateRequest** | [**DwebConfigContentListEntryCreateRequest**](DwebConfigContentListEntryCreateRequest.md)|  | |

### Return type

[**DwebConfigContentListEntrySingleResponse**](DwebConfigContentListEntrySingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Edit IPFS Universal Path Gateway Content List Entry response |  -  |
| **5XX** | Edit IPFS Universal Path Gateway Content List Entry response failure |  -  |

<a id="web3HostnameEditWeb3Hostname"></a>
# **web3HostnameEditWeb3Hostname**
> DwebConfigSingleResponse web3HostnameEditWeb3Hostname(identifier, zoneIdentifier, dwebConfigModifyRequest)

Edit Web3 Hostname

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.Web3HostnameApi;

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

    Web3HostnameApi apiInstance = new Web3HostnameApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    DwebConfigModifyRequest dwebConfigModifyRequest = new DwebConfigModifyRequest(); // DwebConfigModifyRequest | 
    try {
      DwebConfigSingleResponse result = apiInstance.web3HostnameEditWeb3Hostname(identifier, zoneIdentifier, dwebConfigModifyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Web3HostnameApi#web3HostnameEditWeb3Hostname");
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
| **zoneIdentifier** | **String**|  | |
| **dwebConfigModifyRequest** | [**DwebConfigModifyRequest**](DwebConfigModifyRequest.md)|  | |

### Return type

[**DwebConfigSingleResponse**](DwebConfigSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Edit Web3 Hostname response |  -  |
| **5XX** | Edit Web3 Hostname response failure |  -  |

<a id="web3HostnameIpfsUniversalPathGatewayContentListDetails"></a>
# **web3HostnameIpfsUniversalPathGatewayContentListDetails**
> DwebConfigContentListDetailsResponse web3HostnameIpfsUniversalPathGatewayContentListDetails(identifier, zoneIdentifier)

IPFS Universal Path Gateway Content List Details

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.Web3HostnameApi;

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

    Web3HostnameApi apiInstance = new Web3HostnameApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      DwebConfigContentListDetailsResponse result = apiInstance.web3HostnameIpfsUniversalPathGatewayContentListDetails(identifier, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Web3HostnameApi#web3HostnameIpfsUniversalPathGatewayContentListDetails");
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
| **zoneIdentifier** | **String**|  | |

### Return type

[**DwebConfigContentListDetailsResponse**](DwebConfigContentListDetailsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | IPFS Universal Path Gateway Content List Details response |  -  |
| **5XX** | IPFS Universal Path Gateway Content List Details response failure |  -  |

<a id="web3HostnameIpfsUniversalPathGatewayContentListEntryDetails"></a>
# **web3HostnameIpfsUniversalPathGatewayContentListEntryDetails**
> DwebConfigContentListEntrySingleResponse web3HostnameIpfsUniversalPathGatewayContentListEntryDetails(contentListEntryIdentifier, identifier, zoneIdentifier)

IPFS Universal Path Gateway Content List Entry Details

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.Web3HostnameApi;

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

    Web3HostnameApi apiInstance = new Web3HostnameApi(defaultClient);
    String contentListEntryIdentifier = "contentListEntryIdentifier_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      DwebConfigContentListEntrySingleResponse result = apiInstance.web3HostnameIpfsUniversalPathGatewayContentListEntryDetails(contentListEntryIdentifier, identifier, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Web3HostnameApi#web3HostnameIpfsUniversalPathGatewayContentListEntryDetails");
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
| **contentListEntryIdentifier** | **String**|  | |
| **identifier** | **String**|  | |
| **zoneIdentifier** | **String**|  | |

### Return type

[**DwebConfigContentListEntrySingleResponse**](DwebConfigContentListEntrySingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | IPFS Universal Path Gateway Content List Entry Details response |  -  |
| **5XX** | IPFS Universal Path Gateway Content List Entry Details response failure |  -  |

<a id="web3HostnameListIpfsUniversalPathGatewayContentListEntries"></a>
# **web3HostnameListIpfsUniversalPathGatewayContentListEntries**
> DwebConfigContentListEntryCollectionResponse web3HostnameListIpfsUniversalPathGatewayContentListEntries(identifier, zoneIdentifier)

List IPFS Universal Path Gateway Content List Entries

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.Web3HostnameApi;

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

    Web3HostnameApi apiInstance = new Web3HostnameApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      DwebConfigContentListEntryCollectionResponse result = apiInstance.web3HostnameListIpfsUniversalPathGatewayContentListEntries(identifier, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Web3HostnameApi#web3HostnameListIpfsUniversalPathGatewayContentListEntries");
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
| **zoneIdentifier** | **String**|  | |

### Return type

[**DwebConfigContentListEntryCollectionResponse**](DwebConfigContentListEntryCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List IPFS Universal Path Gateway Content List Entries response |  -  |
| **5XX** | List IPFS Universal Path Gateway Content List Entries response failure |  -  |

<a id="web3HostnameListWeb3Hostnames"></a>
# **web3HostnameListWeb3Hostnames**
> DwebConfigCollectionResponse web3HostnameListWeb3Hostnames(zoneIdentifier)

List Web3 Hostnames

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.Web3HostnameApi;

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

    Web3HostnameApi apiInstance = new Web3HostnameApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      DwebConfigCollectionResponse result = apiInstance.web3HostnameListWeb3Hostnames(zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Web3HostnameApi#web3HostnameListWeb3Hostnames");
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
| **zoneIdentifier** | **String**|  | |

### Return type

[**DwebConfigCollectionResponse**](DwebConfigCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Web3 Hostnames response |  -  |
| **5XX** | List Web3 Hostnames response failure |  -  |

<a id="web3HostnameUpdateIpfsUniversalPathGatewayContentList"></a>
# **web3HostnameUpdateIpfsUniversalPathGatewayContentList**
> DwebConfigContentListDetailsResponse web3HostnameUpdateIpfsUniversalPathGatewayContentList(identifier, zoneIdentifier, dwebConfigContentListUpdateRequest)

Update IPFS Universal Path Gateway Content List

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.Web3HostnameApi;

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

    Web3HostnameApi apiInstance = new Web3HostnameApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    DwebConfigContentListUpdateRequest dwebConfigContentListUpdateRequest = new DwebConfigContentListUpdateRequest(); // DwebConfigContentListUpdateRequest | 
    try {
      DwebConfigContentListDetailsResponse result = apiInstance.web3HostnameUpdateIpfsUniversalPathGatewayContentList(identifier, zoneIdentifier, dwebConfigContentListUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Web3HostnameApi#web3HostnameUpdateIpfsUniversalPathGatewayContentList");
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
| **zoneIdentifier** | **String**|  | |
| **dwebConfigContentListUpdateRequest** | [**DwebConfigContentListUpdateRequest**](DwebConfigContentListUpdateRequest.md)|  | |

### Return type

[**DwebConfigContentListDetailsResponse**](DwebConfigContentListDetailsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update IPFS Universal Path Gateway Content List response |  -  |
| **5XX** | Update IPFS Universal Path Gateway Content List response failure |  -  |

<a id="web3HostnameWeb3HostnameDetails"></a>
# **web3HostnameWeb3HostnameDetails**
> DwebConfigSingleResponse web3HostnameWeb3HostnameDetails(identifier, zoneIdentifier)

Web3 Hostname Details

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.Web3HostnameApi;

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

    Web3HostnameApi apiInstance = new Web3HostnameApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      DwebConfigSingleResponse result = apiInstance.web3HostnameWeb3HostnameDetails(identifier, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Web3HostnameApi#web3HostnameWeb3HostnameDetails");
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
| **zoneIdentifier** | **String**|  | |

### Return type

[**DwebConfigSingleResponse**](DwebConfigSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Web3 Hostname Details response |  -  |
| **5XX** | Web3 Hostname Details response failure |  -  |

