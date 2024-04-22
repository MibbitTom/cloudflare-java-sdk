# ZoneLevelAccessServiceTokensApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneLevelAccessServiceTokensCreateAServiceToken**](ZoneLevelAccessServiceTokensApi.md#zoneLevelAccessServiceTokensCreateAServiceToken) | **POST** /zones/{identifier}/access/service_tokens | Create a service token |
| [**zoneLevelAccessServiceTokensDeleteAServiceToken**](ZoneLevelAccessServiceTokensApi.md#zoneLevelAccessServiceTokensDeleteAServiceToken) | **DELETE** /zones/{identifier}/access/service_tokens/{uuid} | Delete a service token |
| [**zoneLevelAccessServiceTokensListServiceTokens**](ZoneLevelAccessServiceTokensApi.md#zoneLevelAccessServiceTokensListServiceTokens) | **GET** /zones/{identifier}/access/service_tokens | List service tokens |
| [**zoneLevelAccessServiceTokensUpdateAServiceToken**](ZoneLevelAccessServiceTokensApi.md#zoneLevelAccessServiceTokensUpdateAServiceToken) | **PUT** /zones/{identifier}/access/service_tokens/{uuid} | Update a service token |


<a id="zoneLevelAccessServiceTokensCreateAServiceToken"></a>
# **zoneLevelAccessServiceTokensCreateAServiceToken**
> AccessCreateResponse zoneLevelAccessServiceTokensCreateAServiceToken(identifier, accessServiceTokensCreateAServiceTokenRequest)

Create a service token

Generates a new service token. **Note:** This is the only time you can get the Client Secret. If you lose the Client Secret, you will have to create a new service token.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessServiceTokensApi;

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

    ZoneLevelAccessServiceTokensApi apiInstance = new ZoneLevelAccessServiceTokensApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    AccessServiceTokensCreateAServiceTokenRequest accessServiceTokensCreateAServiceTokenRequest = new AccessServiceTokensCreateAServiceTokenRequest(); // AccessServiceTokensCreateAServiceTokenRequest | 
    try {
      AccessCreateResponse result = apiInstance.zoneLevelAccessServiceTokensCreateAServiceToken(identifier, accessServiceTokensCreateAServiceTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessServiceTokensApi#zoneLevelAccessServiceTokensCreateAServiceToken");
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

<a id="zoneLevelAccessServiceTokensDeleteAServiceToken"></a>
# **zoneLevelAccessServiceTokensDeleteAServiceToken**
> AccessServiceTokensComponentsSchemasSingleResponse zoneLevelAccessServiceTokensDeleteAServiceToken(uuid, identifier)

Delete a service token

Deletes a service token.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessServiceTokensApi;

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

    ZoneLevelAccessServiceTokensApi apiInstance = new ZoneLevelAccessServiceTokensApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessServiceTokensComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessServiceTokensDeleteAServiceToken(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessServiceTokensApi#zoneLevelAccessServiceTokensDeleteAServiceToken");
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

<a id="zoneLevelAccessServiceTokensListServiceTokens"></a>
# **zoneLevelAccessServiceTokensListServiceTokens**
> AccessComponentsSchemasResponseCollection zoneLevelAccessServiceTokensListServiceTokens(identifier)

List service tokens

Lists all service tokens.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessServiceTokensApi;

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

    ZoneLevelAccessServiceTokensApi apiInstance = new ZoneLevelAccessServiceTokensApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessComponentsSchemasResponseCollection result = apiInstance.zoneLevelAccessServiceTokensListServiceTokens(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessServiceTokensApi#zoneLevelAccessServiceTokensListServiceTokens");
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

<a id="zoneLevelAccessServiceTokensUpdateAServiceToken"></a>
# **zoneLevelAccessServiceTokensUpdateAServiceToken**
> AccessServiceTokensComponentsSchemasSingleResponse zoneLevelAccessServiceTokensUpdateAServiceToken(uuid, identifier, accessServiceTokensUpdateAServiceTokenRequest)

Update a service token

Updates a configured service token.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessServiceTokensApi;

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

    ZoneLevelAccessServiceTokensApi apiInstance = new ZoneLevelAccessServiceTokensApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    AccessServiceTokensUpdateAServiceTokenRequest accessServiceTokensUpdateAServiceTokenRequest = new AccessServiceTokensUpdateAServiceTokenRequest(); // AccessServiceTokensUpdateAServiceTokenRequest | 
    try {
      AccessServiceTokensComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessServiceTokensUpdateAServiceToken(uuid, identifier, accessServiceTokensUpdateAServiceTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessServiceTokensApi#zoneLevelAccessServiceTokensUpdateAServiceToken");
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

