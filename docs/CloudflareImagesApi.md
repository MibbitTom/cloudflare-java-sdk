# CloudflareImagesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cloudflareImagesBaseImage**](CloudflareImagesApi.md#cloudflareImagesBaseImage) | **GET** /accounts/{account_id}/images/v1/{image_id}/blob | Base image |
| [**cloudflareImagesCreateAuthenticatedDirectUploadUrlV2**](CloudflareImagesApi.md#cloudflareImagesCreateAuthenticatedDirectUploadUrlV2) | **POST** /accounts/{account_id}/images/v2/direct_upload | Create authenticated direct upload URL V2 |
| [**cloudflareImagesDeleteImage**](CloudflareImagesApi.md#cloudflareImagesDeleteImage) | **DELETE** /accounts/{account_id}/images/v1/{image_id} | Delete image |
| [**cloudflareImagesImageDetails**](CloudflareImagesApi.md#cloudflareImagesImageDetails) | **GET** /accounts/{account_id}/images/v1/{image_id} | Image details |
| [**cloudflareImagesImagesUsageStatistics**](CloudflareImagesApi.md#cloudflareImagesImagesUsageStatistics) | **GET** /accounts/{account_id}/images/v1/stats | Images usage statistics |
| [**cloudflareImagesListImages**](CloudflareImagesApi.md#cloudflareImagesListImages) | **GET** /accounts/{account_id}/images/v1 | List images |
| [**cloudflareImagesListImagesV2**](CloudflareImagesApi.md#cloudflareImagesListImagesV2) | **GET** /accounts/{account_id}/images/v2 | List images V2 |
| [**cloudflareImagesUpdateImage**](CloudflareImagesApi.md#cloudflareImagesUpdateImage) | **PATCH** /accounts/{account_id}/images/v1/{image_id} | Update image |
| [**cloudflareImagesUploadAnImageViaUrl**](CloudflareImagesApi.md#cloudflareImagesUploadAnImageViaUrl) | **POST** /accounts/{account_id}/images/v1 | Upload an image |


<a id="cloudflareImagesBaseImage"></a>
# **cloudflareImagesBaseImage**
> File cloudflareImagesBaseImage(imageId, accountId)

Base image

Fetch base image. For most images this will be the originally uploaded file. For larger images it can be a near-lossless version of the original.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesApi;

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

    CloudflareImagesApi apiInstance = new CloudflareImagesApi(defaultClient);
    String imageId = "imageId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      File result = apiInstance.cloudflareImagesBaseImage(imageId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesBaseImage");
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
| **imageId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Base image response. Returns uploaded image data. |  -  |
| **4XX** | Base image response failure |  -  |

<a id="cloudflareImagesCreateAuthenticatedDirectUploadUrlV2"></a>
# **cloudflareImagesCreateAuthenticatedDirectUploadUrlV2**
> ImagesImageDirectUploadResponseV2 cloudflareImagesCreateAuthenticatedDirectUploadUrlV2(accountId, expiry, id, metadata, requireSignedURLs)

Create authenticated direct upload URL V2

Direct uploads allow users to upload images without API keys. A common use case are web apps, client-side applications, or mobile devices where users upload content directly to Cloudflare Images. This method creates a draft record for a future image. It returns an upload URL and an image identifier. To verify if the image itself has been uploaded, send an image details request (accounts/:account_identifier/images/v1/:identifier), and check that the &#x60;draft: true&#x60; property is not present.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesApi;

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

    CloudflareImagesApi apiInstance = new CloudflareImagesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    OffsetDateTime expiry = OffsetDateTime.now(); // OffsetDateTime | The date after which the upload will not be accepted. Minimum: Now + 2 minutes. Maximum: Now + 6 hours.
    String id = "id_example"; // String | Optional Image Custom ID. Up to 1024 chars. Can include any number of subpaths, and utf8 characters. Cannot start nor end with a / (forward slash). Cannot be a UUID.
    Object metadata = null; // Object | User modifiable key-value store. Can be used for keeping references to another system of record, for managing images.
    Boolean requireSignedURLs = false; // Boolean | Indicates whether the image requires a signature token to be accessed.
    try {
      ImagesImageDirectUploadResponseV2 result = apiInstance.cloudflareImagesCreateAuthenticatedDirectUploadUrlV2(accountId, expiry, id, metadata, requireSignedURLs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesCreateAuthenticatedDirectUploadUrlV2");
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
| **expiry** | **OffsetDateTime**| The date after which the upload will not be accepted. Minimum: Now + 2 minutes. Maximum: Now + 6 hours. | [optional] |
| **id** | **String**| Optional Image Custom ID. Up to 1024 chars. Can include any number of subpaths, and utf8 characters. Cannot start nor end with a / (forward slash). Cannot be a UUID. | [optional] |
| **metadata** | [**Object**](Object.md)| User modifiable key-value store. Can be used for keeping references to another system of record, for managing images. | [optional] |
| **requireSignedURLs** | **Boolean**| Indicates whether the image requires a signature token to be accessed. | [optional] [default to false] |

### Return type

[**ImagesImageDirectUploadResponseV2**](ImagesImageDirectUploadResponseV2.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create authenticated direct upload URL V2 response |  -  |
| **4XX** | Create authenticated direct upload URL V2 response failure |  -  |

<a id="cloudflareImagesDeleteImage"></a>
# **cloudflareImagesDeleteImage**
> ImagesDeletedResponse cloudflareImagesDeleteImage(imageId, accountId)

Delete image

Delete an image on Cloudflare Images. On success, all copies of the image are deleted and purged from cache.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesApi;

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

    CloudflareImagesApi apiInstance = new CloudflareImagesApi(defaultClient);
    String imageId = "imageId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      ImagesDeletedResponse result = apiInstance.cloudflareImagesDeleteImage(imageId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesDeleteImage");
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
| **imageId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**ImagesDeletedResponse**](ImagesDeletedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete image response |  -  |
| **4XX** | Delete image response failure |  -  |

<a id="cloudflareImagesImageDetails"></a>
# **cloudflareImagesImageDetails**
> ImagesImageResponseSingle cloudflareImagesImageDetails(imageId, accountId)

Image details

Fetch details for a single image.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesApi;

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

    CloudflareImagesApi apiInstance = new CloudflareImagesApi(defaultClient);
    String imageId = "imageId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      ImagesImageResponseSingle result = apiInstance.cloudflareImagesImageDetails(imageId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesImageDetails");
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
| **imageId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**ImagesImageResponseSingle**](ImagesImageResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image details response |  -  |
| **4XX** | Image details response failure |  -  |

<a id="cloudflareImagesImagesUsageStatistics"></a>
# **cloudflareImagesImagesUsageStatistics**
> ImagesImagesStatsResponse cloudflareImagesImagesUsageStatistics(accountId)

Images usage statistics

Fetch usage statistics details for Cloudflare Images.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesApi;

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

    CloudflareImagesApi apiInstance = new CloudflareImagesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      ImagesImagesStatsResponse result = apiInstance.cloudflareImagesImagesUsageStatistics(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesImagesUsageStatistics");
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

[**ImagesImagesStatsResponse**](ImagesImagesStatsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Images usage statistics response |  -  |
| **4XX** | Images usage statistics response failure |  -  |

<a id="cloudflareImagesListImages"></a>
# **cloudflareImagesListImages**
> ImagesImagesListResponse cloudflareImagesListImages(accountId, page, perPage)

List images

List up to 100 images with one request. Use the optional parameters below to get a specific range of images.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesApi;

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

    CloudflareImagesApi apiInstance = new CloudflareImagesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("1000"); // BigDecimal | 
    try {
      ImagesImagesListResponse result = apiInstance.cloudflareImagesListImages(accountId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesListImages");
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
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 1000] |

### Return type

[**ImagesImagesListResponse**](ImagesImagesListResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List images response |  -  |
| **4XX** | List images response failure |  -  |

<a id="cloudflareImagesListImagesV2"></a>
# **cloudflareImagesListImagesV2**
> ImagesImagesListResponseV2 cloudflareImagesListImagesV2(accountId, continuationToken, perPage, sortOrder)

List images V2

List up to 10000 images with one request. Use the optional parameters below to get a specific range of images. Endpoint returns continuation_token if more images are present. 

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesApi;

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

    CloudflareImagesApi apiInstance = new CloudflareImagesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String continuationToken = "continuationToken_example"; // String | 
    BigDecimal perPage = new BigDecimal("1000"); // BigDecimal | 
    String sortOrder = "asc"; // String | 
    try {
      ImagesImagesListResponseV2 result = apiInstance.cloudflareImagesListImagesV2(accountId, continuationToken, perPage, sortOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesListImagesV2");
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
| **continuationToken** | **String**|  | [optional] |
| **perPage** | **BigDecimal**|  | [optional] [default to 1000] |
| **sortOrder** | **String**|  | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**ImagesImagesListResponseV2**](ImagesImagesListResponseV2.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List images response |  -  |
| **4XX** | List images response failure |  -  |

<a id="cloudflareImagesUpdateImage"></a>
# **cloudflareImagesUpdateImage**
> ImagesImageResponseSingle cloudflareImagesUpdateImage(imageId, accountId, imagesImagePatchRequest)

Update image

Update image access control. On access control change, all copies of the image are purged from cache.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesApi;

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

    CloudflareImagesApi apiInstance = new CloudflareImagesApi(defaultClient);
    String imageId = "imageId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    ImagesImagePatchRequest imagesImagePatchRequest = new ImagesImagePatchRequest(); // ImagesImagePatchRequest | 
    try {
      ImagesImageResponseSingle result = apiInstance.cloudflareImagesUpdateImage(imageId, accountId, imagesImagePatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesUpdateImage");
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
| **imageId** | **String**|  | |
| **accountId** | **String**|  | |
| **imagesImagePatchRequest** | [**ImagesImagePatchRequest**](ImagesImagePatchRequest.md)|  | |

### Return type

[**ImagesImageResponseSingle**](ImagesImageResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update image response |  -  |
| **4XX** | Update image response failure |  -  |

<a id="cloudflareImagesUploadAnImageViaUrl"></a>
# **cloudflareImagesUploadAnImageViaUrl**
> ImagesImageResponseSingle cloudflareImagesUploadAnImageViaUrl(accountId, _file, metadata, requireSignedURLs, url)

Upload an image

Upload an image with up to 10 Megabytes using a single HTTP POST (multipart/form-data) request. An image can be uploaded by sending an image file or passing an accessible to an API url. 

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesApi;

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

    CloudflareImagesApi apiInstance = new CloudflareImagesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Object _file = null; // Object | An image binary data. Only needed when type is uploading a file.
    Object metadata = null; // Object | User modifiable key-value store. Can use used for keeping references to another system of record for managing images.
    Boolean requireSignedURLs = false; // Boolean | Indicates whether the image requires a signature token for the access.
    String url = "url_example"; // String | A URL to fetch an image from origin. Only needed when type is uploading from a URL.
    try {
      ImagesImageResponseSingle result = apiInstance.cloudflareImagesUploadAnImageViaUrl(accountId, _file, metadata, requireSignedURLs, url);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesUploadAnImageViaUrl");
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
| **_file** | [**Object**](Object.md)| An image binary data. Only needed when type is uploading a file. | [optional] |
| **metadata** | [**Object**](Object.md)| User modifiable key-value store. Can use used for keeping references to another system of record for managing images. | [optional] |
| **requireSignedURLs** | **Boolean**| Indicates whether the image requires a signature token for the access. | [optional] [default to false] |
| **url** | **String**| A URL to fetch an image from origin. Only needed when type is uploading from a URL. | [optional] |

### Return type

[**ImagesImageResponseSingle**](ImagesImageResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload an image response |  -  |
| **4XX** | Upload an image response failure |  -  |

