# DurableObjectsNamespaceApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**durableObjectsNamespaceListNamespaces**](DurableObjectsNamespaceApi.md#durableObjectsNamespaceListNamespaces) | **GET** /accounts/{account_id}/workers/durable_objects/namespaces | List Namespaces |
| [**durableObjectsNamespaceListObjects**](DurableObjectsNamespaceApi.md#durableObjectsNamespaceListObjects) | **GET** /accounts/{account_id}/workers/durable_objects/namespaces/{id}/objects | List Objects |


<a id="durableObjectsNamespaceListNamespaces"></a>
# **durableObjectsNamespaceListNamespaces**
> DurableObjectsNamespaceListNamespaces200Response durableObjectsNamespaceListNamespaces(accountId)

List Namespaces

Returns the Durable Object namespaces owned by an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DurableObjectsNamespaceApi;

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

    DurableObjectsNamespaceApi apiInstance = new DurableObjectsNamespaceApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      DurableObjectsNamespaceListNamespaces200Response result = apiInstance.durableObjectsNamespaceListNamespaces(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DurableObjectsNamespaceApi#durableObjectsNamespaceListNamespaces");
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

[**DurableObjectsNamespaceListNamespaces200Response**](DurableObjectsNamespaceListNamespaces200Response.md)

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

<a id="durableObjectsNamespaceListObjects"></a>
# **durableObjectsNamespaceListObjects**
> DurableObjectsNamespaceListObjects200Response durableObjectsNamespaceListObjects(id, accountId, limit, cursor)

List Objects

Returns the Durable Objects in a given namespace.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DurableObjectsNamespaceApi;

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

    DurableObjectsNamespaceApi apiInstance = new DurableObjectsNamespaceApi(defaultClient);
    String id = "id_example"; // String | 
    String accountId = "accountId_example"; // String | 
    BigDecimal limit = new BigDecimal("1000"); // BigDecimal | 
    String cursor = "AAAAANuhDN7SjacTnSVsDu3WW1Lvst6dxJGTjRY5BhxPXdf6L6uTcpd_NVtjhn11OUYRsVEykxoUwF-JQU4dn6QylZSKTOJuG0indrdn_MlHpMRtsxgXjs-RPdHYIVm3odE_uvEQ_dTQGFm8oikZMohns34DLBgrQpc"; // String | 
    try {
      DurableObjectsNamespaceListObjects200Response result = apiInstance.durableObjectsNamespaceListObjects(id, accountId, limit, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DurableObjectsNamespaceApi#durableObjectsNamespaceListObjects");
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
| **id** | **String**|  | |
| **accountId** | **String**|  | |
| **limit** | **BigDecimal**|  | [optional] [default to 1000] |
| **cursor** | **String**|  | [optional] |

### Return type

[**DurableObjectsNamespaceListObjects200Response**](DurableObjectsNamespaceListObjects200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Objects response |  -  |
| **4XX** | List Objects response failure |  -  |

