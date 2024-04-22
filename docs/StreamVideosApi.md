# StreamVideosApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**streamVideosCreateSignedUrlTokensForVideos**](StreamVideosApi.md#streamVideosCreateSignedUrlTokensForVideos) | **POST** /accounts/{account_id}/stream/{identifier}/token | Create signed URL tokens for videos |
| [**streamVideosDeleteVideo**](StreamVideosApi.md#streamVideosDeleteVideo) | **DELETE** /accounts/{account_id}/stream/{identifier} | Delete video |
| [**streamVideosInitiateVideoUploadsUsingTus**](StreamVideosApi.md#streamVideosInitiateVideoUploadsUsingTus) | **POST** /accounts/{account_id}/stream | Initiate video uploads using TUS |
| [**streamVideosListVideos**](StreamVideosApi.md#streamVideosListVideos) | **GET** /accounts/{account_id}/stream | List videos |
| [**streamVideosRetreieveEmbedCodeHtml**](StreamVideosApi.md#streamVideosRetreieveEmbedCodeHtml) | **GET** /accounts/{account_id}/stream/{identifier}/embed | Retrieve embed Code HTML |
| [**streamVideosRetrieveVideoDetails**](StreamVideosApi.md#streamVideosRetrieveVideoDetails) | **GET** /accounts/{account_id}/stream/{identifier} | Retrieve video details |
| [**streamVideosStorageUsage**](StreamVideosApi.md#streamVideosStorageUsage) | **GET** /accounts/{account_id}/stream/storage-usage | Storage use |
| [**streamVideosUpdateVideoDetails**](StreamVideosApi.md#streamVideosUpdateVideoDetails) | **POST** /accounts/{account_id}/stream/{identifier} | Edit video details |
| [**streamVideosUploadVideosFromAUrl**](StreamVideosApi.md#streamVideosUploadVideosFromAUrl) | **POST** /accounts/{account_id}/stream/copy | Upload videos from a URL |
| [**streamVideosUploadVideosViaDirectUploadUrLs**](StreamVideosApi.md#streamVideosUploadVideosViaDirectUploadUrLs) | **POST** /accounts/{account_id}/stream/direct_upload | Upload videos via direct upload URLs |


<a id="streamVideosCreateSignedUrlTokensForVideos"></a>
# **streamVideosCreateSignedUrlTokensForVideos**
> StreamSignedTokenResponse streamVideosCreateSignedUrlTokensForVideos(identifier, accountId, streamSignedTokenRequest)

Create signed URL tokens for videos

Creates a signed URL token for a video. If a body is not provided in the request, a token is created with default values.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamVideosApi;

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

    StreamVideosApi apiInstance = new StreamVideosApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    StreamSignedTokenRequest streamSignedTokenRequest = new StreamSignedTokenRequest(); // StreamSignedTokenRequest | 
    try {
      StreamSignedTokenResponse result = apiInstance.streamVideosCreateSignedUrlTokensForVideos(identifier, accountId, streamSignedTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamVideosApi#streamVideosCreateSignedUrlTokensForVideos");
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
| **accountId** | **String**|  | |
| **streamSignedTokenRequest** | [**StreamSignedTokenRequest**](StreamSignedTokenRequest.md)|  | |

### Return type

[**StreamSignedTokenResponse**](StreamSignedTokenResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create signed URL tokens for videos response |  -  |
| **4XX** | Create signed URL tokens for videos response failure |  -  |

<a id="streamVideosDeleteVideo"></a>
# **streamVideosDeleteVideo**
> streamVideosDeleteVideo(identifier, accountId)

Delete video

Deletes a video and its copies from Cloudflare Stream.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamVideosApi;

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

    StreamVideosApi apiInstance = new StreamVideosApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      apiInstance.streamVideosDeleteVideo(identifier, accountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamVideosApi#streamVideosDeleteVideo");
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
| **accountId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete video response |  -  |
| **4XX** | Delete video response failure |  -  |

<a id="streamVideosInitiateVideoUploadsUsingTus"></a>
# **streamVideosInitiateVideoUploadsUsingTus**
> streamVideosInitiateVideoUploadsUsingTus(tusResumable, uploadLength, accountId, uploadCreator, uploadMetadata)

Initiate video uploads using TUS

Initiates a video upload using the TUS protocol. On success, the server responds with a status code 201 (created) and includes a &#x60;location&#x60; header to indicate where the content should be uploaded. Refer to https://tus.io for protocol details.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamVideosApi;

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

    StreamVideosApi apiInstance = new StreamVideosApi(defaultClient);
    StreamTusResumable tusResumable = StreamTusResumable.fromValue("1.0.0"); // StreamTusResumable | 
    Integer uploadLength = 56; // Integer | 
    String accountId = "accountId_example"; // String | 
    String uploadCreator = "uploadCreator_example"; // String | 
    String uploadMetadata = "uploadMetadata_example"; // String | 
    try {
      apiInstance.streamVideosInitiateVideoUploadsUsingTus(tusResumable, uploadLength, accountId, uploadCreator, uploadMetadata);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamVideosApi#streamVideosInitiateVideoUploadsUsingTus");
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
| **tusResumable** | [**StreamTusResumable**](.md)|  | [enum: 1.0.0] |
| **uploadLength** | **Integer**|  | |
| **accountId** | **String**|  | |
| **uploadCreator** | **String**|  | [optional] |
| **uploadMetadata** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Initiate video uploads using TUS response |  -  |
| **4XX** | Initiate video uploads using TUS response failure |  -  |

<a id="streamVideosListVideos"></a>
# **streamVideosListVideos**
> StreamVideoResponseCollection streamVideosListVideos(accountId, status, creator, type, asc, search, start, end, includeCounts)

List videos

Lists up to 1000 videos from a single request. For a specific range, refer to the optional parameters.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamVideosApi;

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

    StreamVideosApi apiInstance = new StreamVideosApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    StreamMediaState status = StreamMediaState.fromValue("pendingupload"); // StreamMediaState | 
    String creator = "creator_example"; // String | 
    String type = "type_example"; // String | 
    Boolean asc = false; // Boolean | 
    String search = "search_example"; // String | 
    OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | 
    Boolean includeCounts = false; // Boolean | 
    try {
      StreamVideoResponseCollection result = apiInstance.streamVideosListVideos(accountId, status, creator, type, asc, search, start, end, includeCounts);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamVideosApi#streamVideosListVideos");
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
| **status** | [**StreamMediaState**](.md)|  | [optional] [enum: pendingupload, downloading, queued, inprogress, ready, error] |
| **creator** | **String**|  | [optional] |
| **type** | **String**|  | [optional] |
| **asc** | **Boolean**|  | [optional] [default to false] |
| **search** | **String**|  | [optional] |
| **start** | **OffsetDateTime**|  | [optional] |
| **end** | **OffsetDateTime**|  | [optional] |
| **includeCounts** | **Boolean**|  | [optional] [default to false] |

### Return type

[**StreamVideoResponseCollection**](StreamVideoResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List videos response |  -  |
| **4XX** | List videos response failure |  -  |

<a id="streamVideosRetreieveEmbedCodeHtml"></a>
# **streamVideosRetreieveEmbedCodeHtml**
> Object streamVideosRetreieveEmbedCodeHtml(identifier, accountId)

Retrieve embed Code HTML

Fetches an HTML code snippet to embed a video in a web page delivered through Cloudflare. On success, returns an HTML fragment for use on web pages to display a video. On failure, returns a JSON response body.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamVideosApi;

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

    StreamVideosApi apiInstance = new StreamVideosApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      Object result = apiInstance.streamVideosRetreieveEmbedCodeHtml(identifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamVideosApi#streamVideosRetreieveEmbedCodeHtml");
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
| **accountId** | **String**|  | |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retreieve embed Code HTML response |  -  |
| **4XX** | Retreieve embed Code HTML response failure |  -  |

<a id="streamVideosRetrieveVideoDetails"></a>
# **streamVideosRetrieveVideoDetails**
> StreamVideoResponseSingle streamVideosRetrieveVideoDetails(identifier, accountId)

Retrieve video details

Fetches details for a single video.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamVideosApi;

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

    StreamVideosApi apiInstance = new StreamVideosApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      StreamVideoResponseSingle result = apiInstance.streamVideosRetrieveVideoDetails(identifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamVideosApi#streamVideosRetrieveVideoDetails");
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
| **accountId** | **String**|  | |

### Return type

[**StreamVideoResponseSingle**](StreamVideoResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve video details response |  -  |
| **4XX** | Retrieve video details response failure |  -  |

<a id="streamVideosStorageUsage"></a>
# **streamVideosStorageUsage**
> StreamStorageUseResponse streamVideosStorageUsage(accountId, creator)

Storage use

Returns information about an account&#39;s storage use.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamVideosApi;

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

    StreamVideosApi apiInstance = new StreamVideosApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String creator = "creator_example"; // String | 
    try {
      StreamStorageUseResponse result = apiInstance.streamVideosStorageUsage(accountId, creator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamVideosApi#streamVideosStorageUsage");
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
| **creator** | **String**|  | [optional] |

### Return type

[**StreamStorageUseResponse**](StreamStorageUseResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns information about an account&#39;s storage use response |  -  |
| **4XX** | Returns information about an account&#39;s storage use response failure |  -  |

<a id="streamVideosUpdateVideoDetails"></a>
# **streamVideosUpdateVideoDetails**
> StreamVideoResponseSingle streamVideosUpdateVideoDetails(identifier, accountId, streamVideoUpdate)

Edit video details

Edit details for a single video.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamVideosApi;

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

    StreamVideosApi apiInstance = new StreamVideosApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    StreamVideoUpdate streamVideoUpdate = new StreamVideoUpdate(); // StreamVideoUpdate | 
    try {
      StreamVideoResponseSingle result = apiInstance.streamVideosUpdateVideoDetails(identifier, accountId, streamVideoUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamVideosApi#streamVideosUpdateVideoDetails");
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
| **accountId** | **String**|  | |
| **streamVideoUpdate** | [**StreamVideoUpdate**](StreamVideoUpdate.md)|  | |

### Return type

[**StreamVideoResponseSingle**](StreamVideoResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Edit video details response |  -  |
| **4XX** | Edit video details response failure |  -  |

<a id="streamVideosUploadVideosFromAUrl"></a>
# **streamVideosUploadVideosFromAUrl**
> StreamVideoResponseSingle streamVideosUploadVideosFromAUrl(accountId, streamVideoCopyRequest, uploadCreator, uploadMetadata)

Upload videos from a URL

Uploads a video to Stream from a provided URL.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamVideosApi;

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

    StreamVideosApi apiInstance = new StreamVideosApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    StreamVideoCopyRequest streamVideoCopyRequest = new StreamVideoCopyRequest(); // StreamVideoCopyRequest | 
    String uploadCreator = "uploadCreator_example"; // String | 
    String uploadMetadata = "uploadMetadata_example"; // String | 
    try {
      StreamVideoResponseSingle result = apiInstance.streamVideosUploadVideosFromAUrl(accountId, streamVideoCopyRequest, uploadCreator, uploadMetadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamVideosApi#streamVideosUploadVideosFromAUrl");
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
| **streamVideoCopyRequest** | [**StreamVideoCopyRequest**](StreamVideoCopyRequest.md)|  | |
| **uploadCreator** | **String**|  | [optional] |
| **uploadMetadata** | **String**|  | [optional] |

### Return type

[**StreamVideoResponseSingle**](StreamVideoResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload videos from a URL response |  -  |
| **4XX** | Upload videos from a URL response failure |  -  |

<a id="streamVideosUploadVideosViaDirectUploadUrLs"></a>
# **streamVideosUploadVideosViaDirectUploadUrLs**
> StreamDirectUploadResponse streamVideosUploadVideosViaDirectUploadUrLs(accountId, streamDirectUploadRequest, uploadCreator)

Upload videos via direct upload URLs

Creates a direct upload that allows video uploads without an API key.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamVideosApi;

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

    StreamVideosApi apiInstance = new StreamVideosApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    StreamDirectUploadRequest streamDirectUploadRequest = new StreamDirectUploadRequest(); // StreamDirectUploadRequest | 
    String uploadCreator = "uploadCreator_example"; // String | 
    try {
      StreamDirectUploadResponse result = apiInstance.streamVideosUploadVideosViaDirectUploadUrLs(accountId, streamDirectUploadRequest, uploadCreator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamVideosApi#streamVideosUploadVideosViaDirectUploadUrLs");
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
| **streamDirectUploadRequest** | [**StreamDirectUploadRequest**](StreamDirectUploadRequest.md)|  | |
| **uploadCreator** | **String**|  | [optional] |

### Return type

[**StreamDirectUploadResponse**](StreamDirectUploadResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload videos via direct upload URLs response |  -  |
| **4XX** | Upload videos via direct upload URLs response failure |  -  |

