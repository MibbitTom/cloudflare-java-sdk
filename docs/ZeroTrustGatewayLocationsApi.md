# ZeroTrustGatewayLocationsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zeroTrustGatewayLocationsCreateZeroTrustGatewayLocation**](ZeroTrustGatewayLocationsApi.md#zeroTrustGatewayLocationsCreateZeroTrustGatewayLocation) | **POST** /accounts/{account_id}/gateway/locations | Create a Zero Trust Gateway location |
| [**zeroTrustGatewayLocationsDeleteZeroTrustGatewayLocation**](ZeroTrustGatewayLocationsApi.md#zeroTrustGatewayLocationsDeleteZeroTrustGatewayLocation) | **DELETE** /accounts/{account_id}/gateway/locations/{location_id} | Delete a Zero Trust Gateway location |
| [**zeroTrustGatewayLocationsListZeroTrustGatewayLocations**](ZeroTrustGatewayLocationsApi.md#zeroTrustGatewayLocationsListZeroTrustGatewayLocations) | **GET** /accounts/{account_id}/gateway/locations | List Zero Trust Gateway locations |
| [**zeroTrustGatewayLocationsUpdateZeroTrustGatewayLocation**](ZeroTrustGatewayLocationsApi.md#zeroTrustGatewayLocationsUpdateZeroTrustGatewayLocation) | **PUT** /accounts/{account_id}/gateway/locations/{location_id} | Update a Zero Trust Gateway location |
| [**zeroTrustGatewayLocationsZeroTrustGatewayLocationDetails**](ZeroTrustGatewayLocationsApi.md#zeroTrustGatewayLocationsZeroTrustGatewayLocationDetails) | **GET** /accounts/{account_id}/gateway/locations/{location_id} | Get Zero Trust Gateway location details |


<a id="zeroTrustGatewayLocationsCreateZeroTrustGatewayLocation"></a>
# **zeroTrustGatewayLocationsCreateZeroTrustGatewayLocation**
> ZeroTrustGatewaySchemasSingleResponse zeroTrustGatewayLocationsCreateZeroTrustGatewayLocation(accountId, zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest)

Create a Zero Trust Gateway location

Creates a new Zero Trust Gateway location.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustGatewayLocationsApi;

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

    ZeroTrustGatewayLocationsApi apiInstance = new ZeroTrustGatewayLocationsApi(defaultClient);
    Object accountId = null; // Object | 
    ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest = new ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest(); // ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest | 
    try {
      ZeroTrustGatewaySchemasSingleResponse result = apiInstance.zeroTrustGatewayLocationsCreateZeroTrustGatewayLocation(accountId, zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustGatewayLocationsApi#zeroTrustGatewayLocationsCreateZeroTrustGatewayLocation");
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
| **zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest** | [**ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest**](ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest.md)|  | |

### Return type

[**ZeroTrustGatewaySchemasSingleResponse**](ZeroTrustGatewaySchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a Zero Trust Gateway location response |  -  |
| **4XX** | Create a Zero Trust Gateway location response failure |  -  |

<a id="zeroTrustGatewayLocationsDeleteZeroTrustGatewayLocation"></a>
# **zeroTrustGatewayLocationsDeleteZeroTrustGatewayLocation**
> ZeroTrustGatewayEmptyResponse zeroTrustGatewayLocationsDeleteZeroTrustGatewayLocation(locationId, accountId)

Delete a Zero Trust Gateway location

Deletes a configured Zero Trust Gateway location.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustGatewayLocationsApi;

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

    ZeroTrustGatewayLocationsApi apiInstance = new ZeroTrustGatewayLocationsApi(defaultClient);
    Object locationId = null; // Object | 
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewayEmptyResponse result = apiInstance.zeroTrustGatewayLocationsDeleteZeroTrustGatewayLocation(locationId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustGatewayLocationsApi#zeroTrustGatewayLocationsDeleteZeroTrustGatewayLocation");
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
| **locationId** | [**Object**](.md)|  | |
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
| **200** | Delete a Zero Trust Gateway location response |  -  |
| **4XX** | Delete a Zero Trust Gateway location response failure |  -  |

<a id="zeroTrustGatewayLocationsListZeroTrustGatewayLocations"></a>
# **zeroTrustGatewayLocationsListZeroTrustGatewayLocations**
> ZeroTrustGatewaySchemasResponseCollection zeroTrustGatewayLocationsListZeroTrustGatewayLocations(accountId)

List Zero Trust Gateway locations

Fetches Zero Trust Gateway locations for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustGatewayLocationsApi;

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

    ZeroTrustGatewayLocationsApi apiInstance = new ZeroTrustGatewayLocationsApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewaySchemasResponseCollection result = apiInstance.zeroTrustGatewayLocationsListZeroTrustGatewayLocations(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustGatewayLocationsApi#zeroTrustGatewayLocationsListZeroTrustGatewayLocations");
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

[**ZeroTrustGatewaySchemasResponseCollection**](ZeroTrustGatewaySchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Zero Trust Gateway locations response |  -  |
| **4XX** | List Zero Trust Gateway locations response failure |  -  |

<a id="zeroTrustGatewayLocationsUpdateZeroTrustGatewayLocation"></a>
# **zeroTrustGatewayLocationsUpdateZeroTrustGatewayLocation**
> ZeroTrustGatewaySchemasSingleResponse zeroTrustGatewayLocationsUpdateZeroTrustGatewayLocation(locationId, accountId, zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest)

Update a Zero Trust Gateway location

Updates a configured Zero Trust Gateway location.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustGatewayLocationsApi;

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

    ZeroTrustGatewayLocationsApi apiInstance = new ZeroTrustGatewayLocationsApi(defaultClient);
    Object locationId = null; // Object | 
    Object accountId = null; // Object | 
    ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest = new ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest(); // ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest | 
    try {
      ZeroTrustGatewaySchemasSingleResponse result = apiInstance.zeroTrustGatewayLocationsUpdateZeroTrustGatewayLocation(locationId, accountId, zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustGatewayLocationsApi#zeroTrustGatewayLocationsUpdateZeroTrustGatewayLocation");
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
| **locationId** | [**Object**](.md)|  | |
| **accountId** | [**Object**](.md)|  | |
| **zeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest** | [**ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest**](ZeroTrustGatewayLocationsCreateZeroTrustGatewayLocationRequest.md)|  | |

### Return type

[**ZeroTrustGatewaySchemasSingleResponse**](ZeroTrustGatewaySchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a Zero Trust Gateway location response |  -  |
| **4XX** | Update a Zero Trust Gateway location response failure |  -  |

<a id="zeroTrustGatewayLocationsZeroTrustGatewayLocationDetails"></a>
# **zeroTrustGatewayLocationsZeroTrustGatewayLocationDetails**
> ZeroTrustGatewaySchemasSingleResponse zeroTrustGatewayLocationsZeroTrustGatewayLocationDetails(locationId, accountId)

Get Zero Trust Gateway location details

Fetches a single Zero Trust Gateway location.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustGatewayLocationsApi;

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

    ZeroTrustGatewayLocationsApi apiInstance = new ZeroTrustGatewayLocationsApi(defaultClient);
    Object locationId = null; // Object | 
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewaySchemasSingleResponse result = apiInstance.zeroTrustGatewayLocationsZeroTrustGatewayLocationDetails(locationId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustGatewayLocationsApi#zeroTrustGatewayLocationsZeroTrustGatewayLocationDetails");
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
| **locationId** | [**Object**](.md)|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**ZeroTrustGatewaySchemasSingleResponse**](ZeroTrustGatewaySchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Zero Trust Gateway location details response |  -  |
| **4XX** | Get Zero Trust Gateway location details response failure |  -  |

