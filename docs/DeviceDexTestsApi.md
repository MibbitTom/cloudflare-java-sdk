# DeviceDexTestsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deviceDexTestCreateDeviceDexTest**](DeviceDexTestsApi.md#deviceDexTestCreateDeviceDexTest) | **POST** /accounts/{account_id}/devices/dex_tests | Create Device DEX test |
| [**deviceDexTestDeleteDeviceDexTest**](DeviceDexTestsApi.md#deviceDexTestDeleteDeviceDexTest) | **DELETE** /accounts/{account_id}/devices/dex_tests/{dex_test_id} | Delete Device DEX test |
| [**deviceDexTestDetails**](DeviceDexTestsApi.md#deviceDexTestDetails) | **GET** /accounts/{account_id}/devices/dex_tests | List Device DEX tests |
| [**deviceDexTestGetDeviceDexTest**](DeviceDexTestsApi.md#deviceDexTestGetDeviceDexTest) | **GET** /accounts/{account_id}/devices/dex_tests/{dex_test_id} | Get Device DEX test |
| [**deviceDexTestUpdateDeviceDexTest**](DeviceDexTestsApi.md#deviceDexTestUpdateDeviceDexTest) | **PUT** /accounts/{account_id}/devices/dex_tests/{dex_test_id} | Update Device DEX test |


<a id="deviceDexTestCreateDeviceDexTest"></a>
# **deviceDexTestCreateDeviceDexTest**
> TeamsDevicesDexSingleResponse deviceDexTestCreateDeviceDexTest(accountId, teamsDevicesDeviceDexTestSchemasHttp)

Create Device DEX test

Create a DEX test.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceDexTestsApi;

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

    DeviceDexTestsApi apiInstance = new DeviceDexTestsApi(defaultClient);
    Object accountId = null; // Object | 
    TeamsDevicesDeviceDexTestSchemasHttp teamsDevicesDeviceDexTestSchemasHttp = new TeamsDevicesDeviceDexTestSchemasHttp(); // TeamsDevicesDeviceDexTestSchemasHttp | 
    try {
      TeamsDevicesDexSingleResponse result = apiInstance.deviceDexTestCreateDeviceDexTest(accountId, teamsDevicesDeviceDexTestSchemasHttp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceDexTestsApi#deviceDexTestCreateDeviceDexTest");
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
| **teamsDevicesDeviceDexTestSchemasHttp** | [**TeamsDevicesDeviceDexTestSchemasHttp**](TeamsDevicesDeviceDexTestSchemasHttp.md)|  | |

### Return type

[**TeamsDevicesDexSingleResponse**](TeamsDevicesDexSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Dex test response |  -  |
| **4XX** | Update Dex test response failure |  -  |

<a id="deviceDexTestDeleteDeviceDexTest"></a>
# **deviceDexTestDeleteDeviceDexTest**
> TeamsDevicesDexResponseCollection deviceDexTestDeleteDeviceDexTest(accountId, dexTestId)

Delete Device DEX test

Delete a Device DEX test. Returns the remaining device dex tests for the account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceDexTestsApi;

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

    DeviceDexTestsApi apiInstance = new DeviceDexTestsApi(defaultClient);
    Object accountId = null; // Object | 
    String dexTestId = "dexTestId_example"; // String | 
    try {
      TeamsDevicesDexResponseCollection result = apiInstance.deviceDexTestDeleteDeviceDexTest(accountId, dexTestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceDexTestsApi#deviceDexTestDeleteDeviceDexTest");
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
| **dexTestId** | **String**|  | |

### Return type

[**TeamsDevicesDexResponseCollection**](TeamsDevicesDexResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Device DEX test response |  -  |
| **4XX** | Delete DEX test response failure |  -  |

<a id="deviceDexTestDetails"></a>
# **deviceDexTestDetails**
> TeamsDevicesDexResponseCollection deviceDexTestDetails(accountId)

List Device DEX tests

Fetch all DEX tests.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceDexTestsApi;

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

    DeviceDexTestsApi apiInstance = new DeviceDexTestsApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      TeamsDevicesDexResponseCollection result = apiInstance.deviceDexTestDetails(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceDexTestsApi#deviceDexTestDetails");
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

[**TeamsDevicesDexResponseCollection**](TeamsDevicesDexResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Device DEX test details response |  -  |
| **4XX** | Device DEX test response failure |  -  |

<a id="deviceDexTestGetDeviceDexTest"></a>
# **deviceDexTestGetDeviceDexTest**
> TeamsDevicesDexSingleResponse deviceDexTestGetDeviceDexTest(accountId, dexTestId)

Get Device DEX test

Fetch a single DEX test.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceDexTestsApi;

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

    DeviceDexTestsApi apiInstance = new DeviceDexTestsApi(defaultClient);
    Object accountId = null; // Object | 
    String dexTestId = "dexTestId_example"; // String | 
    try {
      TeamsDevicesDexSingleResponse result = apiInstance.deviceDexTestGetDeviceDexTest(accountId, dexTestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceDexTestsApi#deviceDexTestGetDeviceDexTest");
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
| **dexTestId** | **String**|  | |

### Return type

[**TeamsDevicesDexSingleResponse**](TeamsDevicesDexSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Device DEX test details response |  -  |
| **4XX** | Device DEX test response failure |  -  |

<a id="deviceDexTestUpdateDeviceDexTest"></a>
# **deviceDexTestUpdateDeviceDexTest**
> TeamsDevicesDexSingleResponse deviceDexTestUpdateDeviceDexTest(accountId, dexTestId, teamsDevicesDeviceDexTestSchemasHttp)

Update Device DEX test

Update a DEX test.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceDexTestsApi;

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

    DeviceDexTestsApi apiInstance = new DeviceDexTestsApi(defaultClient);
    Object accountId = null; // Object | 
    String dexTestId = "dexTestId_example"; // String | 
    TeamsDevicesDeviceDexTestSchemasHttp teamsDevicesDeviceDexTestSchemasHttp = new TeamsDevicesDeviceDexTestSchemasHttp(); // TeamsDevicesDeviceDexTestSchemasHttp | 
    try {
      TeamsDevicesDexSingleResponse result = apiInstance.deviceDexTestUpdateDeviceDexTest(accountId, dexTestId, teamsDevicesDeviceDexTestSchemasHttp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceDexTestsApi#deviceDexTestUpdateDeviceDexTest");
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
| **dexTestId** | **String**|  | |
| **teamsDevicesDeviceDexTestSchemasHttp** | [**TeamsDevicesDeviceDexTestSchemasHttp**](TeamsDevicesDeviceDexTestSchemasHttp.md)|  | |

### Return type

[**TeamsDevicesDexSingleResponse**](TeamsDevicesDexSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Dex test response |  -  |
| **4XX** | Update Dex test response failure |  -  |

