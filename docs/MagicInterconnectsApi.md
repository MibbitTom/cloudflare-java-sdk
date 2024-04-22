# MagicInterconnectsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**magicInterconnectsListInterconnectDetails**](MagicInterconnectsApi.md#magicInterconnectsListInterconnectDetails) | **GET** /accounts/{account_id}/magic/cf_interconnects/{tunnel_identifier} | List interconnect Details |
| [**magicInterconnectsListInterconnects**](MagicInterconnectsApi.md#magicInterconnectsListInterconnects) | **GET** /accounts/{account_id}/magic/cf_interconnects | List interconnects |
| [**magicInterconnectsUpdateInterconnect**](MagicInterconnectsApi.md#magicInterconnectsUpdateInterconnect) | **PUT** /accounts/{account_id}/magic/cf_interconnects/{tunnel_identifier} | Update interconnect |
| [**magicInterconnectsUpdateMultipleInterconnects**](MagicInterconnectsApi.md#magicInterconnectsUpdateMultipleInterconnects) | **PUT** /accounts/{account_id}/magic/cf_interconnects | Update multiple interconnects |


<a id="magicInterconnectsListInterconnectDetails"></a>
# **magicInterconnectsListInterconnectDetails**
> MagicComponentsSchemasTunnelSingleResponse magicInterconnectsListInterconnectDetails(tunnelIdentifier, accountId)

List interconnect Details

Lists details for a specific interconnect.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicInterconnectsApi;

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

    MagicInterconnectsApi apiInstance = new MagicInterconnectsApi(defaultClient);
    String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      MagicComponentsSchemasTunnelSingleResponse result = apiInstance.magicInterconnectsListInterconnectDetails(tunnelIdentifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicInterconnectsApi#magicInterconnectsListInterconnectDetails");
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
| **tunnelIdentifier** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**MagicComponentsSchemasTunnelSingleResponse**](MagicComponentsSchemasTunnelSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List interconnect Details response |  -  |
| **4xx** | List interconnect Details response failure |  -  |

<a id="magicInterconnectsListInterconnects"></a>
# **magicInterconnectsListInterconnects**
> MagicComponentsSchemasTunnelsCollectionResponse magicInterconnectsListInterconnects(accountId)

List interconnects

Lists interconnects associated with an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicInterconnectsApi;

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

    MagicInterconnectsApi apiInstance = new MagicInterconnectsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      MagicComponentsSchemasTunnelsCollectionResponse result = apiInstance.magicInterconnectsListInterconnects(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicInterconnectsApi#magicInterconnectsListInterconnects");
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

[**MagicComponentsSchemasTunnelsCollectionResponse**](MagicComponentsSchemasTunnelsCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List interconnects response |  -  |
| **4xx** | List interconnects response failure |  -  |

<a id="magicInterconnectsUpdateInterconnect"></a>
# **magicInterconnectsUpdateInterconnect**
> MagicComponentsSchemasTunnelModifiedResponse magicInterconnectsUpdateInterconnect(tunnelIdentifier, accountId, magicComponentsSchemasTunnelUpdateRequest)

Update interconnect

Updates a specific interconnect associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicInterconnectsApi;

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

    MagicInterconnectsApi apiInstance = new MagicInterconnectsApi(defaultClient);
    String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    MagicComponentsSchemasTunnelUpdateRequest magicComponentsSchemasTunnelUpdateRequest = new MagicComponentsSchemasTunnelUpdateRequest(); // MagicComponentsSchemasTunnelUpdateRequest | 
    try {
      MagicComponentsSchemasTunnelModifiedResponse result = apiInstance.magicInterconnectsUpdateInterconnect(tunnelIdentifier, accountId, magicComponentsSchemasTunnelUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicInterconnectsApi#magicInterconnectsUpdateInterconnect");
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
| **tunnelIdentifier** | **String**|  | |
| **accountId** | **String**|  | |
| **magicComponentsSchemasTunnelUpdateRequest** | [**MagicComponentsSchemasTunnelUpdateRequest**](MagicComponentsSchemasTunnelUpdateRequest.md)|  | |

### Return type

[**MagicComponentsSchemasTunnelModifiedResponse**](MagicComponentsSchemasTunnelModifiedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update interconnect response |  -  |
| **4xx** | Update interconnect response failure |  -  |

<a id="magicInterconnectsUpdateMultipleInterconnects"></a>
# **magicInterconnectsUpdateMultipleInterconnects**
> MagicComponentsSchemasModifiedTunnelsCollectionResponse magicInterconnectsUpdateMultipleInterconnects(accountId, body)

Update multiple interconnects

Updates multiple interconnects associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagicInterconnectsApi;

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

    MagicInterconnectsApi apiInstance = new MagicInterconnectsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      MagicComponentsSchemasModifiedTunnelsCollectionResponse result = apiInstance.magicInterconnectsUpdateMultipleInterconnects(accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicInterconnectsApi#magicInterconnectsUpdateMultipleInterconnects");
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
| **body** | **Object**|  | |

### Return type

[**MagicComponentsSchemasModifiedTunnelsCollectionResponse**](MagicComponentsSchemasModifiedTunnelsCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update multiple interconnects response |  -  |
| **4xx** | Update multiple interconnects response failure |  -  |

