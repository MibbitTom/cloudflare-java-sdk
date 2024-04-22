# R2BucketApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**r2CreateBucket**](R2BucketApi.md#r2CreateBucket) | **POST** /accounts/{account_id}/r2/buckets | Create Bucket |
| [**r2DeleteBucket**](R2BucketApi.md#r2DeleteBucket) | **DELETE** /accounts/{account_id}/r2/buckets/{bucket_name} | Delete Bucket |
| [**r2DeleteBucketSippyConfig**](R2BucketApi.md#r2DeleteBucketSippyConfig) | **DELETE** /accounts/{account_id}/r2/buckets/{bucket_name}/sippy | Disable Sippy |
| [**r2GetBucket**](R2BucketApi.md#r2GetBucket) | **GET** /accounts/{account_id}/r2/buckets/{bucket_name} | Get Bucket |
| [**r2GetBucketSippyConfig**](R2BucketApi.md#r2GetBucketSippyConfig) | **GET** /accounts/{account_id}/r2/buckets/{bucket_name}/sippy | Get Sippy Configuration |
| [**r2ListBuckets**](R2BucketApi.md#r2ListBuckets) | **GET** /accounts/{account_id}/r2/buckets | List Buckets |
| [**r2PutBucketSippyConfig**](R2BucketApi.md#r2PutBucketSippyConfig) | **PUT** /accounts/{account_id}/r2/buckets/{bucket_name}/sippy | Enable Sippy |


<a id="r2CreateBucket"></a>
# **r2CreateBucket**
> R2CreateBucket200Response r2CreateBucket(accountId, r2CreateBucketRequest)

Create Bucket

Creates a new R2 bucket.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.R2BucketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    R2BucketApi apiInstance = new R2BucketApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    R2CreateBucketRequest r2CreateBucketRequest = new R2CreateBucketRequest(); // R2CreateBucketRequest | 
    try {
      R2CreateBucket200Response result = apiInstance.r2CreateBucket(accountId, r2CreateBucketRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling R2BucketApi#r2CreateBucket");
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
| **r2CreateBucketRequest** | [**R2CreateBucketRequest**](R2CreateBucketRequest.md)|  | |

### Return type

[**R2CreateBucket200Response**](R2CreateBucket200Response.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Bucket response |  -  |
| **4XX** | Create Bucket response failure |  -  |

<a id="r2DeleteBucket"></a>
# **r2DeleteBucket**
> R2V4Response r2DeleteBucket(bucketName, accountId)

Delete Bucket

Deletes an existing R2 bucket.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.R2BucketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    R2BucketApi apiInstance = new R2BucketApi(defaultClient);
    String bucketName = "bucketName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      R2V4Response result = apiInstance.r2DeleteBucket(bucketName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling R2BucketApi#r2DeleteBucket");
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
| **bucketName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**R2V4Response**](R2V4Response.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Bucket response |  -  |
| **4XX** | Delete Bucket response failure |  -  |

<a id="r2DeleteBucketSippyConfig"></a>
# **r2DeleteBucketSippyConfig**
> R2DeleteBucketSippyConfig200Response r2DeleteBucketSippyConfig(bucketName, accountId)

Disable Sippy

Disables Sippy on this bucket

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.R2BucketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    R2BucketApi apiInstance = new R2BucketApi(defaultClient);
    String bucketName = "bucketName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      R2DeleteBucketSippyConfig200Response result = apiInstance.r2DeleteBucketSippyConfig(bucketName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling R2BucketApi#r2DeleteBucketSippyConfig");
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
| **bucketName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**R2DeleteBucketSippyConfig200Response**](R2DeleteBucketSippyConfig200Response.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Sippy Configuration response |  -  |
| **4XX** | Delete Sippy Configuration response failure |  -  |

<a id="r2GetBucket"></a>
# **r2GetBucket**
> R2CreateBucket200Response r2GetBucket(accountId, bucketName)

Get Bucket

Gets metadata for an existing R2 bucket.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.R2BucketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    R2BucketApi apiInstance = new R2BucketApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String bucketName = "bucketName_example"; // String | 
    try {
      R2CreateBucket200Response result = apiInstance.r2GetBucket(accountId, bucketName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling R2BucketApi#r2GetBucket");
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
| **bucketName** | **String**|  | |

### Return type

[**R2CreateBucket200Response**](R2CreateBucket200Response.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Bucket response |  -  |
| **4XX** | Get Bucket response failure |  -  |

<a id="r2GetBucketSippyConfig"></a>
# **r2GetBucketSippyConfig**
> R2GetBucketSippyConfig200Response r2GetBucketSippyConfig(accountId, bucketName)

Get Sippy Configuration

Gets configuration for Sippy for an existing R2 bucket.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.R2BucketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    R2BucketApi apiInstance = new R2BucketApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String bucketName = "bucketName_example"; // String | 
    try {
      R2GetBucketSippyConfig200Response result = apiInstance.r2GetBucketSippyConfig(accountId, bucketName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling R2BucketApi#r2GetBucketSippyConfig");
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
| **bucketName** | **String**|  | |

### Return type

[**R2GetBucketSippyConfig200Response**](R2GetBucketSippyConfig200Response.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Sippy Configuration response |  -  |
| **4XX** | Get Sippy Configuration response failure |  -  |

<a id="r2ListBuckets"></a>
# **r2ListBuckets**
> R2ListBuckets200Response r2ListBuckets(accountId, nameContains, startAfter, perPage, order, direction, cursor)

List Buckets

Lists all R2 buckets on your account

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.R2BucketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    R2BucketApi apiInstance = new R2BucketApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String nameContains = "my-bucket"; // String | 
    String startAfter = "my-bucket"; // String | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    String order = "name"; // String | 
    String direction = "asc"; // String | 
    String cursor = "cursor_example"; // String | 
    try {
      R2ListBuckets200Response result = apiInstance.r2ListBuckets(accountId, nameContains, startAfter, perPage, order, direction, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling R2BucketApi#r2ListBuckets");
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
| **nameContains** | **String**|  | [optional] |
| **startAfter** | **String**|  | [optional] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |
| **order** | **String**|  | [optional] [enum: name] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |
| **cursor** | **String**|  | [optional] |

### Return type

[**R2ListBuckets200Response**](R2ListBuckets200Response.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Buckets response |  -  |
| **4XX** | List Buckets response failure |  -  |

<a id="r2PutBucketSippyConfig"></a>
# **r2PutBucketSippyConfig**
> R2GetBucketSippyConfig200Response r2PutBucketSippyConfig(accountId, bucketName, r2PutBucketSippyConfigRequest)

Enable Sippy

Sets configuration for Sippy for an existing R2 bucket.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.R2BucketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    R2BucketApi apiInstance = new R2BucketApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String bucketName = "bucketName_example"; // String | 
    R2PutBucketSippyConfigRequest r2PutBucketSippyConfigRequest = new R2PutBucketSippyConfigRequest(); // R2PutBucketSippyConfigRequest | 
    try {
      R2GetBucketSippyConfig200Response result = apiInstance.r2PutBucketSippyConfig(accountId, bucketName, r2PutBucketSippyConfigRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling R2BucketApi#r2PutBucketSippyConfig");
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
| **bucketName** | **String**|  | |
| **r2PutBucketSippyConfigRequest** | [**R2PutBucketSippyConfigRequest**](R2PutBucketSippyConfigRequest.md)|  | |

### Return type

[**R2GetBucketSippyConfig200Response**](R2GetBucketSippyConfig200Response.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set Sippy Configuration response |  -  |
| **4XX** | Get Sippy Configuration response failure |  -  |

