# StreamAudioTracksApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAudioTrack**](StreamAudioTracksApi.md#addAudioTrack) | **POST** /accounts/{account_id}/stream/{identifier}/audio/copy | Add audio tracks to a video |
| [**deleteAudioTracks**](StreamAudioTracksApi.md#deleteAudioTracks) | **DELETE** /accounts/{account_id}/stream/{identifier}/audio/{audio_identifier} | Delete additional audio tracks on a video |
| [**editAudioTracks**](StreamAudioTracksApi.md#editAudioTracks) | **PATCH** /accounts/{account_id}/stream/{identifier}/audio/{audio_identifier} | Edit additional audio tracks on a video |
| [**listAudioTracks**](StreamAudioTracksApi.md#listAudioTracks) | **GET** /accounts/{account_id}/stream/{identifier}/audio | List additional audio tracks on a video |


<a id="addAudioTrack"></a>
# **addAudioTrack**
> StreamAddAudioTrackResponse addAudioTrack(accountId, identifier, streamCopyAudioTrack)

Add audio tracks to a video

Adds an additional audio track to a video using the provided audio track URL.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamAudioTracksApi;

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

    StreamAudioTracksApi apiInstance = new StreamAudioTracksApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String identifier = "identifier_example"; // String | 
    StreamCopyAudioTrack streamCopyAudioTrack = new StreamCopyAudioTrack(); // StreamCopyAudioTrack | 
    try {
      StreamAddAudioTrackResponse result = apiInstance.addAudioTrack(accountId, identifier, streamCopyAudioTrack);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamAudioTracksApi#addAudioTrack");
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
| **identifier** | **String**|  | |
| **streamCopyAudioTrack** | [**StreamCopyAudioTrack**](StreamCopyAudioTrack.md)|  | |

### Return type

[**StreamAddAudioTrackResponse**](StreamAddAudioTrackResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add audio tracks to a video |  -  |
| **4XX** | Add audio tracks to a video response failure |  -  |

<a id="deleteAudioTracks"></a>
# **deleteAudioTracks**
> StreamDeletedResponse deleteAudioTracks(accountId, identifier, audioIdentifier)

Delete additional audio tracks on a video

Deletes additional audio tracks on a video. Deleting a default audio track is not allowed. You must assign another audio track as default prior to deletion.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamAudioTracksApi;

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

    StreamAudioTracksApi apiInstance = new StreamAudioTracksApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String audioIdentifier = "audioIdentifier_example"; // String | 
    try {
      StreamDeletedResponse result = apiInstance.deleteAudioTracks(accountId, identifier, audioIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamAudioTracksApi#deleteAudioTracks");
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
| **identifier** | **String**|  | |
| **audioIdentifier** | **String**|  | |

### Return type

[**StreamDeletedResponse**](StreamDeletedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deletes additional audio tracks on a video |  -  |
| **4XX** | Deletes additional audio tracks on a video response failure |  -  |

<a id="editAudioTracks"></a>
# **editAudioTracks**
> StreamAddAudioTrackResponse editAudioTracks(accountId, identifier, audioIdentifier, streamEditAudioTrack)

Edit additional audio tracks on a video

Edits additional audio tracks on a video. Editing the default status of an audio track to &#x60;true&#x60; will mark all other audio tracks on the video default status to &#x60;false&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamAudioTracksApi;

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

    StreamAudioTracksApi apiInstance = new StreamAudioTracksApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String audioIdentifier = "audioIdentifier_example"; // String | 
    StreamEditAudioTrack streamEditAudioTrack = new StreamEditAudioTrack(); // StreamEditAudioTrack | 
    try {
      StreamAddAudioTrackResponse result = apiInstance.editAudioTracks(accountId, identifier, audioIdentifier, streamEditAudioTrack);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamAudioTracksApi#editAudioTracks");
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
| **identifier** | **String**|  | |
| **audioIdentifier** | **String**|  | |
| **streamEditAudioTrack** | [**StreamEditAudioTrack**](StreamEditAudioTrack.md)|  | |

### Return type

[**StreamAddAudioTrackResponse**](StreamAddAudioTrackResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Edits additional audio tracks on a video |  -  |
| **4XX** | Edits additional audio tracks on a video response failure |  -  |

<a id="listAudioTracks"></a>
# **listAudioTracks**
> StreamListAudioTrackResponse listAudioTracks(accountId, identifier)

List additional audio tracks on a video

Lists additional audio tracks on a video. Note this API will not return information for audio attached to the video upload.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamAudioTracksApi;

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

    StreamAudioTracksApi apiInstance = new StreamAudioTracksApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      StreamListAudioTrackResponse result = apiInstance.listAudioTracks(accountId, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamAudioTracksApi#listAudioTracks");
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
| **identifier** | **String**|  | |

### Return type

[**StreamListAudioTrackResponse**](StreamListAudioTrackResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Lists additional audio tracks on a video |  -  |
| **4XX** | Lists additional audio tracks on a video response failure |  -  |

