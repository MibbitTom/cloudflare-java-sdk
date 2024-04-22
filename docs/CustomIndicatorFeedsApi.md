# CustomIndicatorFeedsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customIndicatorFeedsAddPermission**](CustomIndicatorFeedsApi.md#customIndicatorFeedsAddPermission) | **PUT** /accounts/{account_id}/intel/indicator-feeds/permissions/add | Grant permission to indicator feed |
| [**customIndicatorFeedsCreateIndicatorFeeds**](CustomIndicatorFeedsApi.md#customIndicatorFeedsCreateIndicatorFeeds) | **POST** /accounts/{account_id}/intel/indicator-feeds | Create new indicator feed |
| [**customIndicatorFeedsGetIndicatorFeedData**](CustomIndicatorFeedsApi.md#customIndicatorFeedsGetIndicatorFeedData) | **GET** /accounts/{account_id}/intel/indicator-feeds/{feed_id}/data | Get indicator feed data |
| [**customIndicatorFeedsGetIndicatorFeedMetadata**](CustomIndicatorFeedsApi.md#customIndicatorFeedsGetIndicatorFeedMetadata) | **GET** /accounts/{account_id}/intel/indicator-feeds/{feed_id} | Get indicator feed metadata |
| [**customIndicatorFeedsGetIndicatorFeeds**](CustomIndicatorFeedsApi.md#customIndicatorFeedsGetIndicatorFeeds) | **GET** /accounts/{account_id}/intel/indicator-feeds | Get indicator feeds owned by this account |
| [**customIndicatorFeedsRemovePermission**](CustomIndicatorFeedsApi.md#customIndicatorFeedsRemovePermission) | **PUT** /accounts/{account_id}/intel/indicator-feeds/permissions/remove | Revoke permission to indicator feed |
| [**customIndicatorFeedsUpdateIndicatorFeedData**](CustomIndicatorFeedsApi.md#customIndicatorFeedsUpdateIndicatorFeedData) | **PUT** /accounts/{account_id}/intel/indicator-feeds/{feed_id}/snapshot | Update indicator feed data |
| [**customIndicatorFeedsViewPermissions**](CustomIndicatorFeedsApi.md#customIndicatorFeedsViewPermissions) | **GET** /accounts/{account_id}/intel/indicator-feeds/permissions/view | List indicator feed permissions |


<a id="customIndicatorFeedsAddPermission"></a>
# **customIndicatorFeedsAddPermission**
> CustomIndicatorFeedsPermissionsResponse customIndicatorFeedsAddPermission(accountId, customIndicatorFeedsPermissionsRequest)

Grant permission to indicator feed

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomIndicatorFeedsApi;

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

    CustomIndicatorFeedsApi apiInstance = new CustomIndicatorFeedsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    CustomIndicatorFeedsPermissionsRequest customIndicatorFeedsPermissionsRequest = new CustomIndicatorFeedsPermissionsRequest(); // CustomIndicatorFeedsPermissionsRequest | 
    try {
      CustomIndicatorFeedsPermissionsResponse result = apiInstance.customIndicatorFeedsAddPermission(accountId, customIndicatorFeedsPermissionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomIndicatorFeedsApi#customIndicatorFeedsAddPermission");
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
| **customIndicatorFeedsPermissionsRequest** | [**CustomIndicatorFeedsPermissionsRequest**](CustomIndicatorFeedsPermissionsRequest.md)|  | |

### Return type

[**CustomIndicatorFeedsPermissionsResponse**](CustomIndicatorFeedsPermissionsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get indicator feed metadata |  -  |
| **4XX** | Get indicator feeds response failure |  -  |

<a id="customIndicatorFeedsCreateIndicatorFeeds"></a>
# **customIndicatorFeedsCreateIndicatorFeeds**
> CustomIndicatorFeedsCreateFeedResponse customIndicatorFeedsCreateIndicatorFeeds(accountId, customIndicatorFeedsCreateFeed)

Create new indicator feed

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomIndicatorFeedsApi;

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

    CustomIndicatorFeedsApi apiInstance = new CustomIndicatorFeedsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    CustomIndicatorFeedsCreateFeed customIndicatorFeedsCreateFeed = new CustomIndicatorFeedsCreateFeed(); // CustomIndicatorFeedsCreateFeed | 
    try {
      CustomIndicatorFeedsCreateFeedResponse result = apiInstance.customIndicatorFeedsCreateIndicatorFeeds(accountId, customIndicatorFeedsCreateFeed);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomIndicatorFeedsApi#customIndicatorFeedsCreateIndicatorFeeds");
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
| **customIndicatorFeedsCreateFeed** | [**CustomIndicatorFeedsCreateFeed**](CustomIndicatorFeedsCreateFeed.md)|  | |

### Return type

[**CustomIndicatorFeedsCreateFeedResponse**](CustomIndicatorFeedsCreateFeedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create indicator feed response |  -  |
| **4XX** | Get indicator feeds failure response |  -  |

<a id="customIndicatorFeedsGetIndicatorFeedData"></a>
# **customIndicatorFeedsGetIndicatorFeedData**
> String customIndicatorFeedsGetIndicatorFeedData(accountId, feedId)

Get indicator feed data

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomIndicatorFeedsApi;

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

    CustomIndicatorFeedsApi apiInstance = new CustomIndicatorFeedsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Integer feedId = 56; // Integer | 
    try {
      String result = apiInstance.customIndicatorFeedsGetIndicatorFeedData(accountId, feedId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomIndicatorFeedsApi#customIndicatorFeedsGetIndicatorFeedData");
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
| **feedId** | **Integer**|  | |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get indicator feed metadata |  -  |
| **4XX** | Get indicator feeds response failure |  -  |

<a id="customIndicatorFeedsGetIndicatorFeedMetadata"></a>
# **customIndicatorFeedsGetIndicatorFeedMetadata**
> CustomIndicatorFeedsIndicatorFeedMetadataResponse customIndicatorFeedsGetIndicatorFeedMetadata(accountId, feedId)

Get indicator feed metadata

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomIndicatorFeedsApi;

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

    CustomIndicatorFeedsApi apiInstance = new CustomIndicatorFeedsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Integer feedId = 56; // Integer | 
    try {
      CustomIndicatorFeedsIndicatorFeedMetadataResponse result = apiInstance.customIndicatorFeedsGetIndicatorFeedMetadata(accountId, feedId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomIndicatorFeedsApi#customIndicatorFeedsGetIndicatorFeedMetadata");
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
| **feedId** | **Integer**|  | |

### Return type

[**CustomIndicatorFeedsIndicatorFeedMetadataResponse**](CustomIndicatorFeedsIndicatorFeedMetadataResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get indicator feed metadata |  -  |
| **4XX** | Get indicator feeds response failure |  -  |

<a id="customIndicatorFeedsGetIndicatorFeeds"></a>
# **customIndicatorFeedsGetIndicatorFeeds**
> CustomIndicatorFeedsIndicatorFeedResponse customIndicatorFeedsGetIndicatorFeeds(accountId)

Get indicator feeds owned by this account

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomIndicatorFeedsApi;

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

    CustomIndicatorFeedsApi apiInstance = new CustomIndicatorFeedsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      CustomIndicatorFeedsIndicatorFeedResponse result = apiInstance.customIndicatorFeedsGetIndicatorFeeds(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomIndicatorFeedsApi#customIndicatorFeedsGetIndicatorFeeds");
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

[**CustomIndicatorFeedsIndicatorFeedResponse**](CustomIndicatorFeedsIndicatorFeedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get indicator feeds response |  -  |
| **4XX** | Get indicator feeds response failure |  -  |

<a id="customIndicatorFeedsRemovePermission"></a>
# **customIndicatorFeedsRemovePermission**
> CustomIndicatorFeedsPermissionsResponse customIndicatorFeedsRemovePermission(accountId, customIndicatorFeedsPermissionsRequest)

Revoke permission to indicator feed

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomIndicatorFeedsApi;

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

    CustomIndicatorFeedsApi apiInstance = new CustomIndicatorFeedsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    CustomIndicatorFeedsPermissionsRequest customIndicatorFeedsPermissionsRequest = new CustomIndicatorFeedsPermissionsRequest(); // CustomIndicatorFeedsPermissionsRequest | 
    try {
      CustomIndicatorFeedsPermissionsResponse result = apiInstance.customIndicatorFeedsRemovePermission(accountId, customIndicatorFeedsPermissionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomIndicatorFeedsApi#customIndicatorFeedsRemovePermission");
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
| **customIndicatorFeedsPermissionsRequest** | [**CustomIndicatorFeedsPermissionsRequest**](CustomIndicatorFeedsPermissionsRequest.md)|  | |

### Return type

[**CustomIndicatorFeedsPermissionsResponse**](CustomIndicatorFeedsPermissionsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get indicator feed metadata |  -  |
| **4XX** | Get indicator feeds response failure |  -  |

<a id="customIndicatorFeedsUpdateIndicatorFeedData"></a>
# **customIndicatorFeedsUpdateIndicatorFeedData**
> CustomIndicatorFeedsUpdateFeedResponse customIndicatorFeedsUpdateIndicatorFeedData(accountId, feedId, source)

Update indicator feed data

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomIndicatorFeedsApi;

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

    CustomIndicatorFeedsApi apiInstance = new CustomIndicatorFeedsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Integer feedId = 56; // Integer | 
    String source = "source_example"; // String | The file to upload
    try {
      CustomIndicatorFeedsUpdateFeedResponse result = apiInstance.customIndicatorFeedsUpdateIndicatorFeedData(accountId, feedId, source);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomIndicatorFeedsApi#customIndicatorFeedsUpdateIndicatorFeedData");
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
| **feedId** | **Integer**|  | |
| **source** | **String**| The file to upload | [optional] |

### Return type

[**CustomIndicatorFeedsUpdateFeedResponse**](CustomIndicatorFeedsUpdateFeedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get indicator feed metadata |  -  |
| **4XX** | Get indicator feeds response failure |  -  |

<a id="customIndicatorFeedsViewPermissions"></a>
# **customIndicatorFeedsViewPermissions**
> CustomIndicatorFeedsPermissionListItemResponse customIndicatorFeedsViewPermissions(accountId)

List indicator feed permissions

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomIndicatorFeedsApi;

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

    CustomIndicatorFeedsApi apiInstance = new CustomIndicatorFeedsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      CustomIndicatorFeedsPermissionListItemResponse result = apiInstance.customIndicatorFeedsViewPermissions(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomIndicatorFeedsApi#customIndicatorFeedsViewPermissions");
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

[**CustomIndicatorFeedsPermissionListItemResponse**](CustomIndicatorFeedsPermissionListItemResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get indicator feed metadata |  -  |
| **4XX** | Get indicator feeds response failure |  -  |

