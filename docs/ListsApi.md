# ListsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listsCreateAList**](ListsApi.md#listsCreateAList) | **POST** /accounts/{account_id}/rules/lists | Create a list |
| [**listsCreateListItems**](ListsApi.md#listsCreateListItems) | **POST** /accounts/{account_id}/rules/lists/{list_id}/items | Create list items |
| [**listsDeleteAList**](ListsApi.md#listsDeleteAList) | **DELETE** /accounts/{account_id}/rules/lists/{list_id} | Delete a list |
| [**listsDeleteListItems**](ListsApi.md#listsDeleteListItems) | **DELETE** /accounts/{account_id}/rules/lists/{list_id}/items | Delete list items |
| [**listsGetAList**](ListsApi.md#listsGetAList) | **GET** /accounts/{account_id}/rules/lists/{list_id} | Get a list |
| [**listsGetAListItem**](ListsApi.md#listsGetAListItem) | **GET** /accounts/{account_identifier}/rules/lists/{list_id}/items/{item_id} | Get a list item |
| [**listsGetBulkOperationStatus**](ListsApi.md#listsGetBulkOperationStatus) | **GET** /accounts/{account_identifier}/rules/lists/bulk_operations/{operation_id} | Get bulk operation status |
| [**listsGetListItems**](ListsApi.md#listsGetListItems) | **GET** /accounts/{account_id}/rules/lists/{list_id}/items | Get list items |
| [**listsGetLists**](ListsApi.md#listsGetLists) | **GET** /accounts/{account_id}/rules/lists | Get lists |
| [**listsUpdateAList**](ListsApi.md#listsUpdateAList) | **PUT** /accounts/{account_id}/rules/lists/{list_id} | Update a list |
| [**listsUpdateAllListItems**](ListsApi.md#listsUpdateAllListItems) | **PUT** /accounts/{account_id}/rules/lists/{list_id}/items | Update all list items |


<a id="listsCreateAList"></a>
# **listsCreateAList**
> ListsListResponseCollection listsCreateAList(accountId, listsCreateAListRequest)

Create a list

Creates a new list of the specified type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ListsApi;

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

    ListsApi apiInstance = new ListsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    ListsCreateAListRequest listsCreateAListRequest = new ListsCreateAListRequest(); // ListsCreateAListRequest | 
    try {
      ListsListResponseCollection result = apiInstance.listsCreateAList(accountId, listsCreateAListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsCreateAList");
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
| **listsCreateAListRequest** | [**ListsCreateAListRequest**](ListsCreateAListRequest.md)|  | |

### Return type

[**ListsListResponseCollection**](ListsListResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a list response |  -  |
| **4XX** | Create a list response failure |  -  |

<a id="listsCreateListItems"></a>
# **listsCreateListItems**
> ListsListsAsyncResponse listsCreateListItems(listId, accountId, listsItemsUpdateRequestCollectionInner)

Create list items

Appends new items to the list.  This operation is asynchronous. To get current the operation status, invoke the [Get bulk operation status](/operations/lists-get-bulk-operation-status) endpoint with the returned &#x60;operation_id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ListsApi;

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

    ListsApi apiInstance = new ListsApi(defaultClient);
    String listId = "listId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    List<ListsItemsUpdateRequestCollectionInner> listsItemsUpdateRequestCollectionInner = Arrays.asList(); // List<ListsItemsUpdateRequestCollectionInner> | 
    try {
      ListsListsAsyncResponse result = apiInstance.listsCreateListItems(listId, accountId, listsItemsUpdateRequestCollectionInner);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsCreateListItems");
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
| **accountId** | **String**|  | |
| **listsItemsUpdateRequestCollectionInner** | [**List&lt;ListsItemsUpdateRequestCollectionInner&gt;**](ListsItemsUpdateRequestCollectionInner.md)|  | |

### Return type

[**ListsListsAsyncResponse**](ListsListsAsyncResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create list items response |  -  |
| **4XX** | Create list items response failure |  -  |

<a id="listsDeleteAList"></a>
# **listsDeleteAList**
> ListsListDeleteResponseCollection listsDeleteAList(listId, accountId)

Delete a list

Deletes a specific list and all its items.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ListsApi;

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

    ListsApi apiInstance = new ListsApi(defaultClient);
    String listId = "listId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      ListsListDeleteResponseCollection result = apiInstance.listsDeleteAList(listId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsDeleteAList");
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
| **accountId** | **String**|  | |

### Return type

[**ListsListDeleteResponseCollection**](ListsListDeleteResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a list response |  -  |
| **4XX** | Delete a list response failure |  -  |

<a id="listsDeleteListItems"></a>
# **listsDeleteListItems**
> ListsListsAsyncResponse listsDeleteListItems(listId, accountId, listsDeleteListItemsRequest)

Delete list items

Removes one or more items from a list.  This operation is asynchronous. To get current the operation status, invoke the [Get bulk operation status](/operations/lists-get-bulk-operation-status) endpoint with the returned &#x60;operation_id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ListsApi;

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

    ListsApi apiInstance = new ListsApi(defaultClient);
    String listId = "listId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    ListsDeleteListItemsRequest listsDeleteListItemsRequest = new ListsDeleteListItemsRequest(); // ListsDeleteListItemsRequest | 
    try {
      ListsListsAsyncResponse result = apiInstance.listsDeleteListItems(listId, accountId, listsDeleteListItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsDeleteListItems");
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
| **accountId** | **String**|  | |
| **listsDeleteListItemsRequest** | [**ListsDeleteListItemsRequest**](ListsDeleteListItemsRequest.md)|  | |

### Return type

[**ListsListsAsyncResponse**](ListsListsAsyncResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete list items response |  -  |
| **4XX** | Delete list items response failure |  -  |

<a id="listsGetAList"></a>
# **listsGetAList**
> ListsListResponseCollection listsGetAList(listId, accountId)

Get a list

Fetches the details of a list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ListsApi;

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

    ListsApi apiInstance = new ListsApi(defaultClient);
    String listId = "listId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      ListsListResponseCollection result = apiInstance.listsGetAList(listId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsGetAList");
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
| **accountId** | **String**|  | |

### Return type

[**ListsListResponseCollection**](ListsListResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a list response |  -  |
| **4XX** | Get a list response failure |  -  |

<a id="listsGetAListItem"></a>
# **listsGetAListItem**
> ListsItemResponseCollection listsGetAListItem(itemId, listId, accountIdentifier)

Get a list item

Fetches a list item in the list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ListsApi;

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

    ListsApi apiInstance = new ListsApi(defaultClient);
    String itemId = "itemId_example"; // String | 
    String listId = "listId_example"; // String | 
    String accountIdentifier = "accountIdentifier_example"; // String | 
    try {
      ListsItemResponseCollection result = apiInstance.listsGetAListItem(itemId, listId, accountIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsGetAListItem");
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
| **itemId** | **String**|  | |
| **listId** | **String**|  | |
| **accountIdentifier** | **String**|  | |

### Return type

[**ListsItemResponseCollection**](ListsItemResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a list item response |  -  |
| **4XX** | Get a list item response failure |  -  |

<a id="listsGetBulkOperationStatus"></a>
# **listsGetBulkOperationStatus**
> ListsBulkOperationResponseCollection listsGetBulkOperationStatus(operationId, accountIdentifier)

Get bulk operation status

Gets the current status of an asynchronous operation on a list.  The &#x60;status&#x60; property can have one of the following values: &#x60;pending&#x60;, &#x60;running&#x60;, &#x60;completed&#x60;, or &#x60;failed&#x60;. If the status is &#x60;failed&#x60;, the &#x60;error&#x60; property will contain a message describing the error.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ListsApi;

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

    ListsApi apiInstance = new ListsApi(defaultClient);
    String operationId = "operationId_example"; // String | 
    String accountIdentifier = "accountIdentifier_example"; // String | 
    try {
      ListsBulkOperationResponseCollection result = apiInstance.listsGetBulkOperationStatus(operationId, accountIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsGetBulkOperationStatus");
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
| **operationId** | **String**|  | |
| **accountIdentifier** | **String**|  | |

### Return type

[**ListsBulkOperationResponseCollection**](ListsBulkOperationResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get bulk operation status response |  -  |
| **4XX** | Get bulk operation status response failure |  -  |

<a id="listsGetListItems"></a>
# **listsGetListItems**
> ListsItemsListResponseCollection listsGetListItems(listId, accountId, cursor, perPage, search)

Get list items

Fetches all the items in the list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ListsApi;

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

    ListsApi apiInstance = new ListsApi(defaultClient);
    String listId = "listId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String cursor = "zzz"; // String | 
    Integer perPage = 56; // Integer | 
    String search = "1.1.1."; // String | 
    try {
      ListsItemsListResponseCollection result = apiInstance.listsGetListItems(listId, accountId, cursor, perPage, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsGetListItems");
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
| **accountId** | **String**|  | |
| **cursor** | **String**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |
| **search** | **String**|  | [optional] |

### Return type

[**ListsItemsListResponseCollection**](ListsItemsListResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get list items response |  -  |
| **4XX** | Get list items response failure |  -  |

<a id="listsGetLists"></a>
# **listsGetLists**
> ListsListsResponseCollection listsGetLists(accountId)

Get lists

Fetches all lists in the account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ListsApi;

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

    ListsApi apiInstance = new ListsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      ListsListsResponseCollection result = apiInstance.listsGetLists(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsGetLists");
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

[**ListsListsResponseCollection**](ListsListsResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get lists response |  -  |
| **4XX** | Get lists response failure |  -  |

<a id="listsUpdateAList"></a>
# **listsUpdateAList**
> ListsListResponseCollection listsUpdateAList(listId, accountId, listsUpdateAListRequest)

Update a list

Updates the description of a list.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ListsApi;

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

    ListsApi apiInstance = new ListsApi(defaultClient);
    String listId = "listId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    ListsUpdateAListRequest listsUpdateAListRequest = new ListsUpdateAListRequest(); // ListsUpdateAListRequest | 
    try {
      ListsListResponseCollection result = apiInstance.listsUpdateAList(listId, accountId, listsUpdateAListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsUpdateAList");
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
| **accountId** | **String**|  | |
| **listsUpdateAListRequest** | [**ListsUpdateAListRequest**](ListsUpdateAListRequest.md)|  | |

### Return type

[**ListsListResponseCollection**](ListsListResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a list response |  -  |
| **4XX** | Update a list response failure |  -  |

<a id="listsUpdateAllListItems"></a>
# **listsUpdateAllListItems**
> ListsListsAsyncResponse listsUpdateAllListItems(listId, accountId, listsItemsUpdateRequestCollectionInner)

Update all list items

Removes all existing items from the list and adds the provided items to the list.  This operation is asynchronous. To get current the operation status, invoke the [Get bulk operation status](/operations/lists-get-bulk-operation-status) endpoint with the returned &#x60;operation_id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ListsApi;

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

    ListsApi apiInstance = new ListsApi(defaultClient);
    String listId = "listId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    List<ListsItemsUpdateRequestCollectionInner> listsItemsUpdateRequestCollectionInner = Arrays.asList(); // List<ListsItemsUpdateRequestCollectionInner> | 
    try {
      ListsListsAsyncResponse result = apiInstance.listsUpdateAllListItems(listId, accountId, listsItemsUpdateRequestCollectionInner);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsUpdateAllListItems");
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
| **accountId** | **String**|  | |
| **listsItemsUpdateRequestCollectionInner** | [**List&lt;ListsItemsUpdateRequestCollectionInner&gt;**](ListsItemsUpdateRequestCollectionInner.md)|  | |

### Return type

[**ListsListsAsyncResponse**](ListsListsAsyncResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update all list items response |  -  |
| **4XX** | Update all list items response failure |  -  |

