# HyperdriveApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createHyperdrive**](HyperdriveApi.md#createHyperdrive) | **POST** /accounts/{account_id}/hyperdrive/configs | Create Hyperdrive |
| [**deleteHyperdrive**](HyperdriveApi.md#deleteHyperdrive) | **DELETE** /accounts/{account_id}/hyperdrive/configs/{hyperdrive_id} | Delete Hyperdrive |
| [**getHyperdrive**](HyperdriveApi.md#getHyperdrive) | **GET** /accounts/{account_id}/hyperdrive/configs/{hyperdrive_id} | Get Hyperdrive |
| [**listHyperdrive**](HyperdriveApi.md#listHyperdrive) | **GET** /accounts/{account_id}/hyperdrive/configs | List Hyperdrives |
| [**patchHyperdrive**](HyperdriveApi.md#patchHyperdrive) | **PATCH** /accounts/{account_id}/hyperdrive/configs/{hyperdrive_id} | Patch Hyperdrive |
| [**updateHyperdrive**](HyperdriveApi.md#updateHyperdrive) | **PUT** /accounts/{account_id}/hyperdrive/configs/{hyperdrive_id} | Update Hyperdrive |


<a id="createHyperdrive"></a>
# **createHyperdrive**
> CreateHyperdrive200Response createHyperdrive(accountId, hyperdriveCreateUpdateHyperdriveConfig)

Create Hyperdrive

Creates and returns a new Hyperdrive configuration.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.HyperdriveApi;

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

    HyperdriveApi apiInstance = new HyperdriveApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    HyperdriveCreateUpdateHyperdriveConfig hyperdriveCreateUpdateHyperdriveConfig = new HyperdriveCreateUpdateHyperdriveConfig(); // HyperdriveCreateUpdateHyperdriveConfig | 
    try {
      CreateHyperdrive200Response result = apiInstance.createHyperdrive(accountId, hyperdriveCreateUpdateHyperdriveConfig);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperdriveApi#createHyperdrive");
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
| **hyperdriveCreateUpdateHyperdriveConfig** | [**HyperdriveCreateUpdateHyperdriveConfig**](HyperdriveCreateUpdateHyperdriveConfig.md)|  | |

### Return type

[**CreateHyperdrive200Response**](CreateHyperdrive200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Hyperdrive Response |  -  |
| **4XX** | Create Hyperdrive Failure Response |  -  |

<a id="deleteHyperdrive"></a>
# **deleteHyperdrive**
> DeleteHyperdrive200Response deleteHyperdrive(accountId, hyperdriveId)

Delete Hyperdrive

Deletes the specified Hyperdrive.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.HyperdriveApi;

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

    HyperdriveApi apiInstance = new HyperdriveApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String hyperdriveId = "hyperdriveId_example"; // String | 
    try {
      DeleteHyperdrive200Response result = apiInstance.deleteHyperdrive(accountId, hyperdriveId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperdriveApi#deleteHyperdrive");
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
| **hyperdriveId** | **String**|  | |

### Return type

[**DeleteHyperdrive200Response**](DeleteHyperdrive200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Hyperdrive Response |  -  |
| **4XX** | Delete Hyperdrive Failure |  -  |

<a id="getHyperdrive"></a>
# **getHyperdrive**
> CreateHyperdrive200Response getHyperdrive(accountId, hyperdriveId)

Get Hyperdrive

Returns the specified Hyperdrive configuration.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.HyperdriveApi;

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

    HyperdriveApi apiInstance = new HyperdriveApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String hyperdriveId = "hyperdriveId_example"; // String | 
    try {
      CreateHyperdrive200Response result = apiInstance.getHyperdrive(accountId, hyperdriveId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperdriveApi#getHyperdrive");
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
| **hyperdriveId** | **String**|  | |

### Return type

[**CreateHyperdrive200Response**](CreateHyperdrive200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Hyperdrive Response |  -  |
| **4XX** | Get Hyperdrive Failure |  -  |

<a id="listHyperdrive"></a>
# **listHyperdrive**
> ListHyperdrive200Response listHyperdrive(accountId)

List Hyperdrives

Returns a list of Hyperdrives

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.HyperdriveApi;

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

    HyperdriveApi apiInstance = new HyperdriveApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      ListHyperdrive200Response result = apiInstance.listHyperdrive(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperdriveApi#listHyperdrive");
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

[**ListHyperdrive200Response**](ListHyperdrive200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Hyperdrives Response |  -  |
| **4XX** | List Hyperdrives Failure Response |  -  |

<a id="patchHyperdrive"></a>
# **patchHyperdrive**
> CreateHyperdrive200Response patchHyperdrive(accountId, hyperdriveId, hyperdrivePatchHyperdriveConfig)

Patch Hyperdrive

Patches and returns the specified Hyperdrive configuration. Updates to the origin and caching settings are applied with an all-or-nothing approach.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.HyperdriveApi;

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

    HyperdriveApi apiInstance = new HyperdriveApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String hyperdriveId = "hyperdriveId_example"; // String | 
    HyperdrivePatchHyperdriveConfig hyperdrivePatchHyperdriveConfig = new HyperdrivePatchHyperdriveConfig(); // HyperdrivePatchHyperdriveConfig | 
    try {
      CreateHyperdrive200Response result = apiInstance.patchHyperdrive(accountId, hyperdriveId, hyperdrivePatchHyperdriveConfig);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperdriveApi#patchHyperdrive");
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
| **hyperdriveId** | **String**|  | |
| **hyperdrivePatchHyperdriveConfig** | [**HyperdrivePatchHyperdriveConfig**](HyperdrivePatchHyperdriveConfig.md)|  | |

### Return type

[**CreateHyperdrive200Response**](CreateHyperdrive200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch Hyperdrive Response |  -  |
| **4XX** | Patch Hyperdrive Failure Response |  -  |

<a id="updateHyperdrive"></a>
# **updateHyperdrive**
> CreateHyperdrive200Response updateHyperdrive(accountId, hyperdriveId, hyperdriveCreateUpdateHyperdriveConfig)

Update Hyperdrive

Updates and returns the specified Hyperdrive configuration.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.HyperdriveApi;

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

    HyperdriveApi apiInstance = new HyperdriveApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String hyperdriveId = "hyperdriveId_example"; // String | 
    HyperdriveCreateUpdateHyperdriveConfig hyperdriveCreateUpdateHyperdriveConfig = new HyperdriveCreateUpdateHyperdriveConfig(); // HyperdriveCreateUpdateHyperdriveConfig | 
    try {
      CreateHyperdrive200Response result = apiInstance.updateHyperdrive(accountId, hyperdriveId, hyperdriveCreateUpdateHyperdriveConfig);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HyperdriveApi#updateHyperdrive");
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
| **hyperdriveId** | **String**|  | |
| **hyperdriveCreateUpdateHyperdriveConfig** | [**HyperdriveCreateUpdateHyperdriveConfig**](HyperdriveCreateUpdateHyperdriveConfig.md)|  | |

### Return type

[**CreateHyperdrive200Response**](CreateHyperdrive200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Hyperdrive Response |  -  |
| **4XX** | Update Hyperdrive Failure Response |  -  |

