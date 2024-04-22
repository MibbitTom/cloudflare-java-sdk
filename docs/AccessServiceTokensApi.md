# AccessServiceTokensApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accessServiceTokensCreateAServiceToken**](AccessServiceTokensApi.md#accessServiceTokensCreateAServiceToken) | **POST** /accounts/{identifier}/access/service_tokens | Create a service token |
| [**accessServiceTokensDeleteAServiceToken**](AccessServiceTokensApi.md#accessServiceTokensDeleteAServiceToken) | **DELETE** /accounts/{identifier}/access/service_tokens/{uuid} | Delete a service token |
| [**accessServiceTokensListServiceTokens**](AccessServiceTokensApi.md#accessServiceTokensListServiceTokens) | **GET** /accounts/{identifier}/access/service_tokens | List service tokens |
| [**accessServiceTokensRefreshAServiceToken**](AccessServiceTokensApi.md#accessServiceTokensRefreshAServiceToken) | **POST** /accounts/{identifier}/access/service_tokens/{uuid}/refresh | Refresh a service token |
| [**accessServiceTokensRotateAServiceToken**](AccessServiceTokensApi.md#accessServiceTokensRotateAServiceToken) | **POST** /accounts/{identifier}/access/service_tokens/{uuid}/rotate | Rotate a service token |
| [**accessServiceTokensUpdateAServiceToken**](AccessServiceTokensApi.md#accessServiceTokensUpdateAServiceToken) | **PUT** /accounts/{identifier}/access/service_tokens/{uuid} | Update a service token |


<a id="accessServiceTokensCreateAServiceToken"></a>
# **accessServiceTokensCreateAServiceToken**
> AccessCreateResponse accessServiceTokensCreateAServiceToken(identifier, accessServiceTokensCreateAServiceTokenRequest)

Create a service token

Generates a new service token. **Note:** This is the only time you can get the Client Secret. If you lose the Client Secret, you will have to rotate the Client Secret or create a new service token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessServiceTokensApi;

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

    AccessServiceTokensApi apiInstance = new AccessServiceTokensApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    AccessServiceTokensCreateAServiceTokenRequest accessServiceTokensCreateAServiceTokenRequest = new AccessServiceTokensCreateAServiceTokenRequest(); // AccessServiceTokensCreateAServiceTokenRequest | 
    try {
      AccessCreateResponse result = apiInstance.accessServiceTokensCreateAServiceToken(identifier, accessServiceTokensCreateAServiceTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessServiceTokensApi#accessServiceTokensCreateAServiceToken");
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
| **accessServiceTokensCreateAServiceTokenRequest** | [**AccessServiceTokensCreateAServiceTokenRequest**](AccessServiceTokensCreateAServiceTokenRequest.md)|  | |

### Return type

[**AccessCreateResponse**](AccessCreateResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create a service token response |  -  |
| **4XX** | Create a service token response failure |  -  |

<a id="accessServiceTokensDeleteAServiceToken"></a>
# **accessServiceTokensDeleteAServiceToken**
> AccessServiceTokensComponentsSchemasSingleResponse accessServiceTokensDeleteAServiceToken(uuid, identifier)

Delete a service token

Deletes a service token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessServiceTokensApi;

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

    AccessServiceTokensApi apiInstance = new AccessServiceTokensApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessServiceTokensComponentsSchemasSingleResponse result = apiInstance.accessServiceTokensDeleteAServiceToken(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessServiceTokensApi#accessServiceTokensDeleteAServiceToken");
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

[**AccessServiceTokensComponentsSchemasSingleResponse**](AccessServiceTokensComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a service token response |  -  |
| **4XX** | Delete a service token response failure |  -  |

<a id="accessServiceTokensListServiceTokens"></a>
# **accessServiceTokensListServiceTokens**
> AccessComponentsSchemasResponseCollection accessServiceTokensListServiceTokens(identifier)

List service tokens

Lists all service tokens.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessServiceTokensApi;

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

    AccessServiceTokensApi apiInstance = new AccessServiceTokensApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessComponentsSchemasResponseCollection result = apiInstance.accessServiceTokensListServiceTokens(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessServiceTokensApi#accessServiceTokensListServiceTokens");
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

[**AccessComponentsSchemasResponseCollection**](AccessComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List service tokens response |  -  |
| **4XX** | List service tokens response failure |  -  |

<a id="accessServiceTokensRefreshAServiceToken"></a>
# **accessServiceTokensRefreshAServiceToken**
> AccessServiceTokensComponentsSchemasSingleResponse accessServiceTokensRefreshAServiceToken(uuid, identifier)

Refresh a service token

Refreshes the expiration of a service token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessServiceTokensApi;

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

    AccessServiceTokensApi apiInstance = new AccessServiceTokensApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessServiceTokensComponentsSchemasSingleResponse result = apiInstance.accessServiceTokensRefreshAServiceToken(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessServiceTokensApi#accessServiceTokensRefreshAServiceToken");
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

[**AccessServiceTokensComponentsSchemasSingleResponse**](AccessServiceTokensComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Refresh a service token response |  -  |
| **4XX** | Refresh a service token response failure |  -  |

<a id="accessServiceTokensRotateAServiceToken"></a>
# **accessServiceTokensRotateAServiceToken**
> AccessCreateResponse accessServiceTokensRotateAServiceToken(uuid, identifier)

Rotate a service token

Generates a new Client Secret for a service token and revokes the old one.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessServiceTokensApi;

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

    AccessServiceTokensApi apiInstance = new AccessServiceTokensApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessCreateResponse result = apiInstance.accessServiceTokensRotateAServiceToken(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessServiceTokensApi#accessServiceTokensRotateAServiceToken");
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

[**AccessCreateResponse**](AccessCreateResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rotate a service token response |  -  |
| **4XX** | Rotate a service token response failure |  -  |

<a id="accessServiceTokensUpdateAServiceToken"></a>
# **accessServiceTokensUpdateAServiceToken**
> AccessServiceTokensComponentsSchemasSingleResponse accessServiceTokensUpdateAServiceToken(uuid, identifier, accessServiceTokensUpdateAServiceTokenRequest)

Update a service token

Updates a configured service token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessServiceTokensApi;

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

    AccessServiceTokensApi apiInstance = new AccessServiceTokensApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    AccessServiceTokensUpdateAServiceTokenRequest accessServiceTokensUpdateAServiceTokenRequest = new AccessServiceTokensUpdateAServiceTokenRequest(); // AccessServiceTokensUpdateAServiceTokenRequest | 
    try {
      AccessServiceTokensComponentsSchemasSingleResponse result = apiInstance.accessServiceTokensUpdateAServiceToken(uuid, identifier, accessServiceTokensUpdateAServiceTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessServiceTokensApi#accessServiceTokensUpdateAServiceToken");
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
| **accessServiceTokensUpdateAServiceTokenRequest** | [**AccessServiceTokensUpdateAServiceTokenRequest**](AccessServiceTokensUpdateAServiceTokenRequest.md)|  | |

### Return type

[**AccessServiceTokensComponentsSchemasSingleResponse**](AccessServiceTokensComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a service token response |  -  |
| **4XX** | Update a service token response failure |  -  |

