# WorkersKvNamespaceApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workersKvNamespaceCreateANamespace**](WorkersKvNamespaceApi.md#workersKvNamespaceCreateANamespace) | **POST** /accounts/{account_id}/storage/kv/namespaces | Create a Namespace |
| [**workersKvNamespaceDeleteKeyValuePair**](WorkersKvNamespaceApi.md#workersKvNamespaceDeleteKeyValuePair) | **DELETE** /accounts/{account_id}/storage/kv/namespaces/{namespace_id}/values/{key_name} | Delete key-value pair |
| [**workersKvNamespaceDeleteMultipleKeyValuePairs**](WorkersKvNamespaceApi.md#workersKvNamespaceDeleteMultipleKeyValuePairs) | **DELETE** /accounts/{account_id}/storage/kv/namespaces/{namespace_id}/bulk | Delete multiple key-value pairs |
| [**workersKvNamespaceListANamespaceSKeys**](WorkersKvNamespaceApi.md#workersKvNamespaceListANamespaceSKeys) | **GET** /accounts/{account_id}/storage/kv/namespaces/{namespace_id}/keys | List a Namespace&#39;s Keys |
| [**workersKvNamespaceListNamespaces**](WorkersKvNamespaceApi.md#workersKvNamespaceListNamespaces) | **GET** /accounts/{account_id}/storage/kv/namespaces | List Namespaces |
| [**workersKvNamespaceReadKeyValuePair**](WorkersKvNamespaceApi.md#workersKvNamespaceReadKeyValuePair) | **GET** /accounts/{account_id}/storage/kv/namespaces/{namespace_id}/values/{key_name} | Read key-value pair |
| [**workersKvNamespaceReadTheMetadataForAKey**](WorkersKvNamespaceApi.md#workersKvNamespaceReadTheMetadataForAKey) | **GET** /accounts/{account_id}/storage/kv/namespaces/{namespace_id}/metadata/{key_name} | Read the metadata for a key |
| [**workersKvNamespaceRemoveANamespace**](WorkersKvNamespaceApi.md#workersKvNamespaceRemoveANamespace) | **DELETE** /accounts/{account_id}/storage/kv/namespaces/{namespace_id} | Remove a Namespace |
| [**workersKvNamespaceRenameANamespace**](WorkersKvNamespaceApi.md#workersKvNamespaceRenameANamespace) | **PUT** /accounts/{account_id}/storage/kv/namespaces/{namespace_id} | Rename a Namespace |
| [**workersKvNamespaceWriteKeyValuePairWithMetadata**](WorkersKvNamespaceApi.md#workersKvNamespaceWriteKeyValuePairWithMetadata) | **PUT** /accounts/{account_id}/storage/kv/namespaces/{namespace_id}/values/{key_name} | Write key-value pair with metadata |
| [**workersKvNamespaceWriteMultipleKeyValuePairs**](WorkersKvNamespaceApi.md#workersKvNamespaceWriteMultipleKeyValuePairs) | **PUT** /accounts/{account_id}/storage/kv/namespaces/{namespace_id}/bulk | Write multiple key-value pairs |


<a id="workersKvNamespaceCreateANamespace"></a>
# **workersKvNamespaceCreateANamespace**
> WorkersKvNamespaceCreateANamespace200Response workersKvNamespaceCreateANamespace(accountId, workersKvCreateRenameNamespaceBody)

Create a Namespace

Creates a namespace under the given title. A &#x60;400&#x60; is returned if the account already owns a namespace with this title. A namespace must be explicitly deleted to be replaced.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersKvNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    WorkersKvCreateRenameNamespaceBody workersKvCreateRenameNamespaceBody = new WorkersKvCreateRenameNamespaceBody(); // WorkersKvCreateRenameNamespaceBody | 
    try {
      WorkersKvNamespaceCreateANamespace200Response result = apiInstance.workersKvNamespaceCreateANamespace(accountId, workersKvCreateRenameNamespaceBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceCreateANamespace");
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
| **workersKvCreateRenameNamespaceBody** | [**WorkersKvCreateRenameNamespaceBody**](WorkersKvCreateRenameNamespaceBody.md)|  | |

### Return type

[**WorkersKvNamespaceCreateANamespace200Response**](WorkersKvNamespaceCreateANamespace200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a Namespace response |  -  |
| **4XX** | Create a Namespace response failure |  -  |

<a id="workersKvNamespaceDeleteKeyValuePair"></a>
# **workersKvNamespaceDeleteKeyValuePair**
> WorkersKvApiResponseSingle workersKvNamespaceDeleteKeyValuePair(keyName, namespaceId, accountId)

Delete key-value pair

Remove a KV pair from the namespace. Use URL-encoding to use special characters (for example, &#x60;:&#x60;, &#x60;!&#x60;, &#x60;%&#x60;) in the key name.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersKvNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi(defaultClient);
    String keyName = "keyName_example"; // String | 
    String namespaceId = "namespaceId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      WorkersKvApiResponseSingle result = apiInstance.workersKvNamespaceDeleteKeyValuePair(keyName, namespaceId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceDeleteKeyValuePair");
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
| **keyName** | **String**|  | |
| **namespaceId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**WorkersKvApiResponseSingle**](WorkersKvApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete key-value pair response |  -  |
| **4XX** | Delete key-value pair response failure |  -  |

<a id="workersKvNamespaceDeleteMultipleKeyValuePairs"></a>
# **workersKvNamespaceDeleteMultipleKeyValuePairs**
> WorkersKvApiResponseSingle workersKvNamespaceDeleteMultipleKeyValuePairs(namespaceId, accountId, requestBody)

Delete multiple key-value pairs

Remove multiple KV pairs from the namespace. Body should be an array of up to 10,000 keys to be removed.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersKvNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi(defaultClient);
    String namespaceId = "namespaceId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      WorkersKvApiResponseSingle result = apiInstance.workersKvNamespaceDeleteMultipleKeyValuePairs(namespaceId, accountId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceDeleteMultipleKeyValuePairs");
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
| **namespaceId** | **String**|  | |
| **accountId** | **String**|  | |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

### Return type

[**WorkersKvApiResponseSingle**](WorkersKvApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete multiple key-value pairs response |  -  |
| **4XX** | Delete multiple key-value pairs response failure |  -  |

<a id="workersKvNamespaceListANamespaceSKeys"></a>
# **workersKvNamespaceListANamespaceSKeys**
> WorkersKvNamespaceListANamespaceSKeys200Response workersKvNamespaceListANamespaceSKeys(namespaceId, accountId, limit, prefix, cursor)

List a Namespace&#39;s Keys

Lists a namespace&#39;s keys.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersKvNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi(defaultClient);
    String namespaceId = "namespaceId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    BigDecimal limit = new BigDecimal("1000"); // BigDecimal | 
    String prefix = "My-Prefix"; // String | 
    String cursor = "6Ck1la0VxJ0djhidm1MdX2FyDGxLKVeeHZZmORS_8XeSuhz9SjIJRaSa2lnsF01tQOHrfTGAP3R5X1Kv5iVUuMbNKhWNAXHOl6ePB0TUL8nw"; // String | 
    try {
      WorkersKvNamespaceListANamespaceSKeys200Response result = apiInstance.workersKvNamespaceListANamespaceSKeys(namespaceId, accountId, limit, prefix, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceListANamespaceSKeys");
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
| **namespaceId** | **String**|  | |
| **accountId** | **String**|  | |
| **limit** | **BigDecimal**|  | [optional] [default to 1000] |
| **prefix** | **String**|  | [optional] |
| **cursor** | **String**|  | [optional] |

### Return type

[**WorkersKvNamespaceListANamespaceSKeys200Response**](WorkersKvNamespaceListANamespaceSKeys200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List a Namespace&#39;s Keys response |  -  |
| **4XX** | List a Namespace&#39;s Keys response failure |  -  |

<a id="workersKvNamespaceListNamespaces"></a>
# **workersKvNamespaceListNamespaces**
> WorkersKvNamespaceListNamespaces200Response workersKvNamespaceListNamespaces(accountId, page, perPage, order, direction)

List Namespaces

Returns the namespaces owned by an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersKvNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    String order = "id"; // String | 
    String direction = "asc"; // String | 
    try {
      WorkersKvNamespaceListNamespaces200Response result = apiInstance.workersKvNamespaceListNamespaces(accountId, page, perPage, order, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceListNamespaces");
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
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |
| **order** | **String**|  | [optional] [enum: id, title] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |

### Return type

[**WorkersKvNamespaceListNamespaces200Response**](WorkersKvNamespaceListNamespaces200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Namespaces response |  -  |
| **4XX** | List Namespaces response failure |  -  |

<a id="workersKvNamespaceReadKeyValuePair"></a>
# **workersKvNamespaceReadKeyValuePair**
> String workersKvNamespaceReadKeyValuePair(keyName, namespaceId, accountId)

Read key-value pair

Returns the value associated with the given key in the given namespace. Use URL-encoding to use special characters (for example, &#x60;:&#x60;, &#x60;!&#x60;, &#x60;%&#x60;) in the key name. If the KV-pair is set to expire at some point, the expiration time as measured in seconds since the UNIX epoch will be returned in the &#x60;expiration&#x60; response header.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersKvNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi(defaultClient);
    String keyName = "keyName_example"; // String | 
    String namespaceId = "namespaceId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      String result = apiInstance.workersKvNamespaceReadKeyValuePair(keyName, namespaceId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceReadKeyValuePair");
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
| **keyName** | **String**|  | |
| **namespaceId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Read key-value pair response |  -  |
| **4XX** | Read key-value pair response failure |  -  |

<a id="workersKvNamespaceReadTheMetadataForAKey"></a>
# **workersKvNamespaceReadTheMetadataForAKey**
> WorkersKvNamespaceReadTheMetadataForAKey200Response workersKvNamespaceReadTheMetadataForAKey(keyName, namespaceId, accountId)

Read the metadata for a key

Returns the metadata associated with the given key in the given namespace. Use URL-encoding to use special characters (for example, &#x60;:&#x60;, &#x60;!&#x60;, &#x60;%&#x60;) in the key name.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersKvNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi(defaultClient);
    String keyName = "keyName_example"; // String | 
    String namespaceId = "namespaceId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      WorkersKvNamespaceReadTheMetadataForAKey200Response result = apiInstance.workersKvNamespaceReadTheMetadataForAKey(keyName, namespaceId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceReadTheMetadataForAKey");
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
| **keyName** | **String**|  | |
| **namespaceId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**WorkersKvNamespaceReadTheMetadataForAKey200Response**](WorkersKvNamespaceReadTheMetadataForAKey200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Read the metadata for a key response |  -  |
| **4XX** | Read the metadata for a key response failure |  -  |

<a id="workersKvNamespaceRemoveANamespace"></a>
# **workersKvNamespaceRemoveANamespace**
> WorkersKvApiResponseSingle workersKvNamespaceRemoveANamespace(namespaceId, accountId)

Remove a Namespace

Deletes the namespace corresponding to the given ID.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersKvNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi(defaultClient);
    String namespaceId = "namespaceId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      WorkersKvApiResponseSingle result = apiInstance.workersKvNamespaceRemoveANamespace(namespaceId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceRemoveANamespace");
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
| **namespaceId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**WorkersKvApiResponseSingle**](WorkersKvApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Remove a Namespace response |  -  |
| **4XX** | Remove a Namespace response failure |  -  |

<a id="workersKvNamespaceRenameANamespace"></a>
# **workersKvNamespaceRenameANamespace**
> WorkersKvApiResponseSingle workersKvNamespaceRenameANamespace(namespaceId, accountId, workersKvCreateRenameNamespaceBody)

Rename a Namespace

Modifies a namespace&#39;s title.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersKvNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi(defaultClient);
    String namespaceId = "namespaceId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    WorkersKvCreateRenameNamespaceBody workersKvCreateRenameNamespaceBody = new WorkersKvCreateRenameNamespaceBody(); // WorkersKvCreateRenameNamespaceBody | 
    try {
      WorkersKvApiResponseSingle result = apiInstance.workersKvNamespaceRenameANamespace(namespaceId, accountId, workersKvCreateRenameNamespaceBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceRenameANamespace");
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
| **namespaceId** | **String**|  | |
| **accountId** | **String**|  | |
| **workersKvCreateRenameNamespaceBody** | [**WorkersKvCreateRenameNamespaceBody**](WorkersKvCreateRenameNamespaceBody.md)|  | |

### Return type

[**WorkersKvApiResponseSingle**](WorkersKvApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rename a Namespace response |  -  |
| **4XX** | Rename a Namespace response failure |  -  |

<a id="workersKvNamespaceWriteKeyValuePairWithMetadata"></a>
# **workersKvNamespaceWriteKeyValuePairWithMetadata**
> WorkersKvApiResponseSingle workersKvNamespaceWriteKeyValuePairWithMetadata(keyName, namespaceId, accountId, metadata, value)

Write key-value pair with metadata

Write a value identified by a key. Use URL-encoding to use special characters (for example, &#x60;:&#x60;, &#x60;!&#x60;, &#x60;%&#x60;) in the key name. Body should be the value to be stored along with JSON metadata to be associated with the key/value pair. Existing values, expirations, and metadata will be overwritten. If neither &#x60;expiration&#x60; nor &#x60;expiration_ttl&#x60; is specified, the key-value pair will never expire. If both are set, &#x60;expiration_ttl&#x60; is used and &#x60;expiration&#x60; is ignored.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersKvNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi(defaultClient);
    String keyName = "keyName_example"; // String | 
    String namespaceId = "namespaceId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String metadata = "metadata_example"; // String | Arbitrary JSON to be associated with a key/value pair.
    String value = "value_example"; // String | A byte sequence to be stored, up to 25 MiB in length.
    try {
      WorkersKvApiResponseSingle result = apiInstance.workersKvNamespaceWriteKeyValuePairWithMetadata(keyName, namespaceId, accountId, metadata, value);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceWriteKeyValuePairWithMetadata");
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
| **keyName** | **String**|  | |
| **namespaceId** | **String**|  | |
| **accountId** | **String**|  | |
| **metadata** | **String**| Arbitrary JSON to be associated with a key/value pair. | |
| **value** | **String**| A byte sequence to be stored, up to 25 MiB in length. | |

### Return type

[**WorkersKvApiResponseSingle**](WorkersKvApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Write key-value pair with metadata response |  -  |
| **4XX** | Write key-value pair with metadata response failure |  -  |

<a id="workersKvNamespaceWriteMultipleKeyValuePairs"></a>
# **workersKvNamespaceWriteMultipleKeyValuePairs**
> WorkersKvApiResponseSingle workersKvNamespaceWriteMultipleKeyValuePairs(namespaceId, accountId, workersKvBulkWriteInner)

Write multiple key-value pairs

Write multiple keys and values at once. Body should be an array of up to 10,000 key-value pairs to be stored, along with optional expiration information. Existing values and expirations will be overwritten. If neither &#x60;expiration&#x60; nor &#x60;expiration_ttl&#x60; is specified, the key-value pair will never expire. If both are set, &#x60;expiration_ttl&#x60; is used and &#x60;expiration&#x60; is ignored. The entire request size must be 100 megabytes or less.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersKvNamespaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi(defaultClient);
    String namespaceId = "namespaceId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    List<WorkersKvBulkWriteInner> workersKvBulkWriteInner = Arrays.asList(); // List<WorkersKvBulkWriteInner> | 
    try {
      WorkersKvApiResponseSingle result = apiInstance.workersKvNamespaceWriteMultipleKeyValuePairs(namespaceId, accountId, workersKvBulkWriteInner);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceWriteMultipleKeyValuePairs");
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
| **namespaceId** | **String**|  | |
| **accountId** | **String**|  | |
| **workersKvBulkWriteInner** | [**List&lt;WorkersKvBulkWriteInner&gt;**](WorkersKvBulkWriteInner.md)|  | |

### Return type

[**WorkersKvApiResponseSingle**](WorkersKvApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Write multiple key-value pairs response |  -  |
| **4XX** | Write multiple key-value pairs response failure |  -  |

