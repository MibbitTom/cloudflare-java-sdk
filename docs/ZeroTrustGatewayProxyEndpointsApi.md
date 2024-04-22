# ZeroTrustGatewayProxyEndpointsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zeroTrustGatewayProxyEndpointsCreateProxyEndpoint**](ZeroTrustGatewayProxyEndpointsApi.md#zeroTrustGatewayProxyEndpointsCreateProxyEndpoint) | **POST** /accounts/{account_id}/gateway/proxy_endpoints | Create a proxy endpoint |
| [**zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint**](ZeroTrustGatewayProxyEndpointsApi.md#zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint) | **DELETE** /accounts/{account_id}/gateway/proxy_endpoints/{proxy_endpoint_id} | Delete a proxy endpoint |
| [**zeroTrustGatewayProxyEndpointsListProxyEndpoints**](ZeroTrustGatewayProxyEndpointsApi.md#zeroTrustGatewayProxyEndpointsListProxyEndpoints) | **GET** /accounts/{account_id}/gateway/proxy_endpoints | Get a proxy endpoint |
| [**zeroTrustGatewayProxyEndpointsProxyEndpointDetails**](ZeroTrustGatewayProxyEndpointsApi.md#zeroTrustGatewayProxyEndpointsProxyEndpointDetails) | **GET** /accounts/{account_id}/gateway/proxy_endpoints/{proxy_endpoint_id} | List proxy endpoints |
| [**zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint**](ZeroTrustGatewayProxyEndpointsApi.md#zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint) | **PATCH** /accounts/{account_id}/gateway/proxy_endpoints/{proxy_endpoint_id} | Update a proxy endpoint |


<a id="zeroTrustGatewayProxyEndpointsCreateProxyEndpoint"></a>
# **zeroTrustGatewayProxyEndpointsCreateProxyEndpoint**
> ZeroTrustGatewayProxyEndpointsComponentsSchemasSingleResponse zeroTrustGatewayProxyEndpointsCreateProxyEndpoint(accountId, zeroTrustGatewayProxyEndpointsCreateProxyEndpointRequest)

Create a proxy endpoint

Creates a new Zero Trust Gateway proxy endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustGatewayProxyEndpointsApi;

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

    ZeroTrustGatewayProxyEndpointsApi apiInstance = new ZeroTrustGatewayProxyEndpointsApi(defaultClient);
    Object accountId = null; // Object | 
    ZeroTrustGatewayProxyEndpointsCreateProxyEndpointRequest zeroTrustGatewayProxyEndpointsCreateProxyEndpointRequest = new ZeroTrustGatewayProxyEndpointsCreateProxyEndpointRequest(); // ZeroTrustGatewayProxyEndpointsCreateProxyEndpointRequest | 
    try {
      ZeroTrustGatewayProxyEndpointsComponentsSchemasSingleResponse result = apiInstance.zeroTrustGatewayProxyEndpointsCreateProxyEndpoint(accountId, zeroTrustGatewayProxyEndpointsCreateProxyEndpointRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustGatewayProxyEndpointsApi#zeroTrustGatewayProxyEndpointsCreateProxyEndpoint");
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
| **zeroTrustGatewayProxyEndpointsCreateProxyEndpointRequest** | [**ZeroTrustGatewayProxyEndpointsCreateProxyEndpointRequest**](ZeroTrustGatewayProxyEndpointsCreateProxyEndpointRequest.md)|  | |

### Return type

[**ZeroTrustGatewayProxyEndpointsComponentsSchemasSingleResponse**](ZeroTrustGatewayProxyEndpointsComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a proxy endpoint response |  -  |
| **4XX** | Create a proxy endpoint response failure |  -  |

<a id="zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint"></a>
# **zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint**
> ZeroTrustGatewayEmptyResponse zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint(proxyEndpointId, accountId)

Delete a proxy endpoint

Deletes a configured Zero Trust Gateway proxy endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustGatewayProxyEndpointsApi;

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

    ZeroTrustGatewayProxyEndpointsApi apiInstance = new ZeroTrustGatewayProxyEndpointsApi(defaultClient);
    Object proxyEndpointId = null; // Object | 
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewayEmptyResponse result = apiInstance.zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint(proxyEndpointId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustGatewayProxyEndpointsApi#zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint");
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
| **proxyEndpointId** | [**Object**](.md)|  | |
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
| **200** | Delete a proxy endpoint response |  -  |
| **4XX** | Delete a proxy endpoint response failure |  -  |

<a id="zeroTrustGatewayProxyEndpointsListProxyEndpoints"></a>
# **zeroTrustGatewayProxyEndpointsListProxyEndpoints**
> ZeroTrustGatewayProxyEndpointsComponentsSchemasResponseCollection zeroTrustGatewayProxyEndpointsListProxyEndpoints(accountId)

Get a proxy endpoint

Fetches a single Zero Trust Gateway proxy endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustGatewayProxyEndpointsApi;

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

    ZeroTrustGatewayProxyEndpointsApi apiInstance = new ZeroTrustGatewayProxyEndpointsApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewayProxyEndpointsComponentsSchemasResponseCollection result = apiInstance.zeroTrustGatewayProxyEndpointsListProxyEndpoints(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustGatewayProxyEndpointsApi#zeroTrustGatewayProxyEndpointsListProxyEndpoints");
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

[**ZeroTrustGatewayProxyEndpointsComponentsSchemasResponseCollection**](ZeroTrustGatewayProxyEndpointsComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a proxy endpoint response |  -  |
| **4XX** | Get a proxy endpoint response failure |  -  |

<a id="zeroTrustGatewayProxyEndpointsProxyEndpointDetails"></a>
# **zeroTrustGatewayProxyEndpointsProxyEndpointDetails**
> ZeroTrustGatewayProxyEndpointsComponentsSchemasSingleResponse zeroTrustGatewayProxyEndpointsProxyEndpointDetails(proxyEndpointId, accountId)

List proxy endpoints

Fetches all Zero Trust Gateway proxy endpoints for an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustGatewayProxyEndpointsApi;

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

    ZeroTrustGatewayProxyEndpointsApi apiInstance = new ZeroTrustGatewayProxyEndpointsApi(defaultClient);
    Object proxyEndpointId = null; // Object | 
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewayProxyEndpointsComponentsSchemasSingleResponse result = apiInstance.zeroTrustGatewayProxyEndpointsProxyEndpointDetails(proxyEndpointId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustGatewayProxyEndpointsApi#zeroTrustGatewayProxyEndpointsProxyEndpointDetails");
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
| **proxyEndpointId** | [**Object**](.md)|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**ZeroTrustGatewayProxyEndpointsComponentsSchemasSingleResponse**](ZeroTrustGatewayProxyEndpointsComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List proxy endpoints response |  -  |
| **4XX** | List proxy endpoints response failure |  -  |

<a id="zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint"></a>
# **zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint**
> ZeroTrustGatewayProxyEndpointsComponentsSchemasSingleResponse zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint(proxyEndpointId, accountId, zeroTrustGatewayProxyEndpointsUpdateProxyEndpointRequest)

Update a proxy endpoint

Updates a configured Zero Trust Gateway proxy endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustGatewayProxyEndpointsApi;

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

    ZeroTrustGatewayProxyEndpointsApi apiInstance = new ZeroTrustGatewayProxyEndpointsApi(defaultClient);
    Object proxyEndpointId = null; // Object | 
    Object accountId = null; // Object | 
    ZeroTrustGatewayProxyEndpointsUpdateProxyEndpointRequest zeroTrustGatewayProxyEndpointsUpdateProxyEndpointRequest = new ZeroTrustGatewayProxyEndpointsUpdateProxyEndpointRequest(); // ZeroTrustGatewayProxyEndpointsUpdateProxyEndpointRequest | 
    try {
      ZeroTrustGatewayProxyEndpointsComponentsSchemasSingleResponse result = apiInstance.zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint(proxyEndpointId, accountId, zeroTrustGatewayProxyEndpointsUpdateProxyEndpointRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustGatewayProxyEndpointsApi#zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint");
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
| **proxyEndpointId** | [**Object**](.md)|  | |
| **accountId** | [**Object**](.md)|  | |
| **zeroTrustGatewayProxyEndpointsUpdateProxyEndpointRequest** | [**ZeroTrustGatewayProxyEndpointsUpdateProxyEndpointRequest**](ZeroTrustGatewayProxyEndpointsUpdateProxyEndpointRequest.md)|  | |

### Return type

[**ZeroTrustGatewayProxyEndpointsComponentsSchemasSingleResponse**](ZeroTrustGatewayProxyEndpointsComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a proxy endpoint response |  -  |
| **4XX** | Update a proxy endpoint response failure |  -  |

