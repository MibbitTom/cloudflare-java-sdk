# ZeroTrustListsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zeroTrustListsCreateZeroTrustList**](ZeroTrustListsApi.md#zeroTrustListsCreateZeroTrustList) | **POST** /accounts/{account_id}/gateway/lists | Create Zero Trust list |
| [**zeroTrustListsDeleteZeroTrustList**](ZeroTrustListsApi.md#zeroTrustListsDeleteZeroTrustList) | **DELETE** /accounts/{account_id}/gateway/lists/{list_id} | Delete Zero Trust list |
| [**zeroTrustListsListZeroTrustLists**](ZeroTrustListsApi.md#zeroTrustListsListZeroTrustLists) | **GET** /accounts/{account_id}/gateway/lists | List Zero Trust lists |
| [**zeroTrustListsPatchZeroTrustList**](ZeroTrustListsApi.md#zeroTrustListsPatchZeroTrustList) | **PATCH** /accounts/{account_id}/gateway/lists/{list_id} | Patch Zero Trust list |
| [**zeroTrustListsUpdateZeroTrustList**](ZeroTrustListsApi.md#zeroTrustListsUpdateZeroTrustList) | **PUT** /accounts/{account_id}/gateway/lists/{list_id} | Update Zero Trust list |
| [**zeroTrustListsZeroTrustListDetails**](ZeroTrustListsApi.md#zeroTrustListsZeroTrustListDetails) | **GET** /accounts/{account_id}/gateway/lists/{list_id} | Get Zero Trust list details |
| [**zeroTrustListsZeroTrustListItems**](ZeroTrustListsApi.md#zeroTrustListsZeroTrustListItems) | **GET** /accounts/{account_id}/gateway/lists/{list_id}/items | Get Zero Trust list items |


<a id="zeroTrustListsCreateZeroTrustList"></a>
# **zeroTrustListsCreateZeroTrustList**
> ZeroTrustGatewaySingleResponseWithListItems zeroTrustListsCreateZeroTrustList(accountId, zeroTrustListsCreateZeroTrustListRequest)

Create Zero Trust list

Creates a new Zero Trust list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustListsApi;

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

    ZeroTrustListsApi apiInstance = new ZeroTrustListsApi(defaultClient);
    Object accountId = null; // Object | 
    ZeroTrustListsCreateZeroTrustListRequest zeroTrustListsCreateZeroTrustListRequest = new ZeroTrustListsCreateZeroTrustListRequest(); // ZeroTrustListsCreateZeroTrustListRequest | 
    try {
      ZeroTrustGatewaySingleResponseWithListItems result = apiInstance.zeroTrustListsCreateZeroTrustList(accountId, zeroTrustListsCreateZeroTrustListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustListsApi#zeroTrustListsCreateZeroTrustList");
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
| **accountId** | [**Object**](.md)|  | |
| **zeroTrustListsCreateZeroTrustListRequest** | [**ZeroTrustListsCreateZeroTrustListRequest**](ZeroTrustListsCreateZeroTrustListRequest.md)|  | |

### Return type

[**ZeroTrustGatewaySingleResponseWithListItems**](ZeroTrustGatewaySingleResponseWithListItems.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Zero Trust list response |  -  |
| **4XX** | Create Zero Trust list response failure |  -  |

<a id="zeroTrustListsDeleteZeroTrustList"></a>
# **zeroTrustListsDeleteZeroTrustList**
> ZeroTrustGatewayEmptyResponse zeroTrustListsDeleteZeroTrustList(listId, accountId)

Delete Zero Trust list

Deletes a Zero Trust list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustListsApi;

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

    ZeroTrustListsApi apiInstance = new ZeroTrustListsApi(defaultClient);
    String listId = "listId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewayEmptyResponse result = apiInstance.zeroTrustListsDeleteZeroTrustList(listId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustListsApi#zeroTrustListsDeleteZeroTrustList");
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
| **listId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**ZeroTrustGatewayEmptyResponse**](ZeroTrustGatewayEmptyResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Zero Trust list response |  -  |
| **4XX** | Delete Zero Trust list response failure |  -  |

<a id="zeroTrustListsListZeroTrustLists"></a>
# **zeroTrustListsListZeroTrustLists**
> ZeroTrustGatewayResponseCollection zeroTrustListsListZeroTrustLists(accountId)

List Zero Trust lists

Fetches all Zero Trust lists for an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustListsApi;

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

    ZeroTrustListsApi apiInstance = new ZeroTrustListsApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewayResponseCollection result = apiInstance.zeroTrustListsListZeroTrustLists(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustListsApi#zeroTrustListsListZeroTrustLists");
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
| **accountId** | [**Object**](.md)|  | |

### Return type

[**ZeroTrustGatewayResponseCollection**](ZeroTrustGatewayResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Zero Trust lists response |  -  |
| **4XX** | List Zero Trust lists response failure |  -  |

<a id="zeroTrustListsPatchZeroTrustList"></a>
# **zeroTrustListsPatchZeroTrustList**
> ZeroTrustGatewaySingleResponse zeroTrustListsPatchZeroTrustList(listId, accountId, zeroTrustListsPatchZeroTrustListRequest)

Patch Zero Trust list

Appends or removes an item from a configured Zero Trust list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustListsApi;

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

    ZeroTrustListsApi apiInstance = new ZeroTrustListsApi(defaultClient);
    String listId = "listId_example"; // String | 
    Object accountId = null; // Object | 
    ZeroTrustListsPatchZeroTrustListRequest zeroTrustListsPatchZeroTrustListRequest = new ZeroTrustListsPatchZeroTrustListRequest(); // ZeroTrustListsPatchZeroTrustListRequest | 
    try {
      ZeroTrustGatewaySingleResponse result = apiInstance.zeroTrustListsPatchZeroTrustList(listId, accountId, zeroTrustListsPatchZeroTrustListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustListsApi#zeroTrustListsPatchZeroTrustList");
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
| **listId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |
| **zeroTrustListsPatchZeroTrustListRequest** | [**ZeroTrustListsPatchZeroTrustListRequest**](ZeroTrustListsPatchZeroTrustListRequest.md)|  | |

### Return type

[**ZeroTrustGatewaySingleResponse**](ZeroTrustGatewaySingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch Zero Trust list response |  -  |
| **4XX** | Patch Zero Trust list response failure |  -  |

<a id="zeroTrustListsUpdateZeroTrustList"></a>
# **zeroTrustListsUpdateZeroTrustList**
> ZeroTrustGatewaySingleResponse zeroTrustListsUpdateZeroTrustList(listId, accountId, zeroTrustListsUpdateZeroTrustListRequest)

Update Zero Trust list

Updates a configured Zero Trust list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustListsApi;

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

    ZeroTrustListsApi apiInstance = new ZeroTrustListsApi(defaultClient);
    String listId = "listId_example"; // String | 
    Object accountId = null; // Object | 
    ZeroTrustListsUpdateZeroTrustListRequest zeroTrustListsUpdateZeroTrustListRequest = new ZeroTrustListsUpdateZeroTrustListRequest(); // ZeroTrustListsUpdateZeroTrustListRequest | 
    try {
      ZeroTrustGatewaySingleResponse result = apiInstance.zeroTrustListsUpdateZeroTrustList(listId, accountId, zeroTrustListsUpdateZeroTrustListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustListsApi#zeroTrustListsUpdateZeroTrustList");
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
| **listId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |
| **zeroTrustListsUpdateZeroTrustListRequest** | [**ZeroTrustListsUpdateZeroTrustListRequest**](ZeroTrustListsUpdateZeroTrustListRequest.md)|  | |

### Return type

[**ZeroTrustGatewaySingleResponse**](ZeroTrustGatewaySingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Zero Trust list response |  -  |
| **4XX** | Update Zero Trust list response failure |  -  |

<a id="zeroTrustListsZeroTrustListDetails"></a>
# **zeroTrustListsZeroTrustListDetails**
> ZeroTrustGatewaySingleResponse zeroTrustListsZeroTrustListDetails(listId, accountId)

Get Zero Trust list details

Fetches a single Zero Trust list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustListsApi;

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

    ZeroTrustListsApi apiInstance = new ZeroTrustListsApi(defaultClient);
    String listId = "listId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewaySingleResponse result = apiInstance.zeroTrustListsZeroTrustListDetails(listId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustListsApi#zeroTrustListsZeroTrustListDetails");
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
| **listId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**ZeroTrustGatewaySingleResponse**](ZeroTrustGatewaySingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Zero Trust list details response |  -  |
| **4XX** | Get Zero Trust list details response failure |  -  |

<a id="zeroTrustListsZeroTrustListItems"></a>
# **zeroTrustListsZeroTrustListItems**
> ZeroTrustGatewayListItemResponseCollection zeroTrustListsZeroTrustListItems(listId, accountId)

Get Zero Trust list items

Fetches all items in a single Zero Trust list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustListsApi;

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

    ZeroTrustListsApi apiInstance = new ZeroTrustListsApi(defaultClient);
    String listId = "listId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewayListItemResponseCollection result = apiInstance.zeroTrustListsZeroTrustListItems(listId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustListsApi#zeroTrustListsZeroTrustListItems");
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
| **listId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**ZeroTrustGatewayListItemResponseCollection**](ZeroTrustGatewayListItemResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Zero Trust list items response |  -  |
| **4XX** | Get Zero Trust list items response failure |  -  |

