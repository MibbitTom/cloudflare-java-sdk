# StreamSubtitlesCaptionsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**streamSubtitlesCaptionsDeleteCaptionsOrSubtitles**](StreamSubtitlesCaptionsApi.md#streamSubtitlesCaptionsDeleteCaptionsOrSubtitles) | **DELETE** /accounts/{account_id}/stream/{identifier}/captions/{language} | Delete captions or subtitles |
| [**streamSubtitlesCaptionsGetCaptionOrSubtitleForLanguage**](StreamSubtitlesCaptionsApi.md#streamSubtitlesCaptionsGetCaptionOrSubtitleForLanguage) | **GET** /accounts/{account_id}/stream/{identifier}/captions/{language} | List captions or subtitles for a provided language |
| [**streamSubtitlesCaptionsGetVttCaptionOrSubtitle**](StreamSubtitlesCaptionsApi.md#streamSubtitlesCaptionsGetVttCaptionOrSubtitle) | **GET** /accounts/{account_id}/stream/{identifier}/captions/{language}/vtt | Return WebVTT captions for a provided language |
| [**streamSubtitlesCaptionsListCaptionsOrSubtitles**](StreamSubtitlesCaptionsApi.md#streamSubtitlesCaptionsListCaptionsOrSubtitles) | **GET** /accounts/{account_id}/stream/{identifier}/captions | List captions or subtitles |
| [**streamSubtitlesCaptionsUploadCaptionsOrSubtitles**](StreamSubtitlesCaptionsApi.md#streamSubtitlesCaptionsUploadCaptionsOrSubtitles) | **PUT** /accounts/{account_id}/stream/{identifier}/captions/{language} | Upload captions or subtitles |


<a id="streamSubtitlesCaptionsDeleteCaptionsOrSubtitles"></a>
# **streamSubtitlesCaptionsDeleteCaptionsOrSubtitles**
> StreamSubtitlesCaptionsDeleteCaptionsOrSubtitles200Response streamSubtitlesCaptionsDeleteCaptionsOrSubtitles(language, identifier, accountId)

Delete captions or subtitles

Removes the captions or subtitles from a video.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.StreamSubtitlesCaptionsApi;

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

    StreamSubtitlesCaptionsApi apiInstance = new StreamSubtitlesCaptionsApi(defaultClient);
    String language = "language_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      StreamSubtitlesCaptionsDeleteCaptionsOrSubtitles200Response result = apiInstance.streamSubtitlesCaptionsDeleteCaptionsOrSubtitles(language, identifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamSubtitlesCaptionsApi#streamSubtitlesCaptionsDeleteCaptionsOrSubtitles");
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
| **language** | **String**|  | |
| **identifier** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**StreamSubtitlesCaptionsDeleteCaptionsOrSubtitles200Response**](StreamSubtitlesCaptionsDeleteCaptionsOrSubtitles200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete captions or subtitles response |  -  |
| **4XX** | Delete captions or subtitles response failure |  -  |

<a id="streamSubtitlesCaptionsGetCaptionOrSubtitleForLanguage"></a>
# **streamSubtitlesCaptionsGetCaptionOrSubtitleForLanguage**
> StreamLanguageResponseSingle streamSubtitlesCaptionsGetCaptionOrSubtitleForLanguage(language, identifier, accountId)

List captions or subtitles for a provided language

Lists the captions or subtitles for provided language.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.StreamSubtitlesCaptionsApi;

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

    StreamSubtitlesCaptionsApi apiInstance = new StreamSubtitlesCaptionsApi(defaultClient);
    String language = "language_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      StreamLanguageResponseSingle result = apiInstance.streamSubtitlesCaptionsGetCaptionOrSubtitleForLanguage(language, identifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamSubtitlesCaptionsApi#streamSubtitlesCaptionsGetCaptionOrSubtitleForLanguage");
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
| **language** | **String**|  | |
| **identifier** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**StreamLanguageResponseSingle**](StreamLanguageResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List captions or subtitles response for a provided language |  -  |
| **4XX** | List captions or subtitles response for a provided language |  -  |

<a id="streamSubtitlesCaptionsGetVttCaptionOrSubtitle"></a>
# **streamSubtitlesCaptionsGetVttCaptionOrSubtitle**
> String streamSubtitlesCaptionsGetVttCaptionOrSubtitle(language, identifier, accountId)

Return WebVTT captions for a provided language

Return WebVTT captions for a provided language.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.StreamSubtitlesCaptionsApi;

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

    StreamSubtitlesCaptionsApi apiInstance = new StreamSubtitlesCaptionsApi(defaultClient);
    String language = "language_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      String result = apiInstance.streamSubtitlesCaptionsGetVttCaptionOrSubtitle(language, identifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamSubtitlesCaptionsApi#streamSubtitlesCaptionsGetVttCaptionOrSubtitle");
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
| **language** | **String**|  | |
| **identifier** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/vtt, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return WebVTT caption or subtitle response |  -  |
| **4XX** | Return WebVTT caption or subtitle response failure |  -  |

<a id="streamSubtitlesCaptionsListCaptionsOrSubtitles"></a>
# **streamSubtitlesCaptionsListCaptionsOrSubtitles**
> StreamLanguageResponseCollection streamSubtitlesCaptionsListCaptionsOrSubtitles(identifier, accountId)

List captions or subtitles

Lists the available captions or subtitles for a specific video.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.StreamSubtitlesCaptionsApi;

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

    StreamSubtitlesCaptionsApi apiInstance = new StreamSubtitlesCaptionsApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      StreamLanguageResponseCollection result = apiInstance.streamSubtitlesCaptionsListCaptionsOrSubtitles(identifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamSubtitlesCaptionsApi#streamSubtitlesCaptionsListCaptionsOrSubtitles");
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

[**StreamLanguageResponseCollection**](StreamLanguageResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List captions or subtitles response |  -  |
| **4XX** | List captions or subtitles response failure |  -  |

<a id="streamSubtitlesCaptionsUploadCaptionsOrSubtitles"></a>
# **streamSubtitlesCaptionsUploadCaptionsOrSubtitles**
> StreamLanguageResponseSingle streamSubtitlesCaptionsUploadCaptionsOrSubtitles(language, identifier, accountId, _file)

Upload captions or subtitles

Uploads the caption or subtitle file to the endpoint for a specific BCP47 language. One caption or subtitle file per language is allowed.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.StreamSubtitlesCaptionsApi;

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

    StreamSubtitlesCaptionsApi apiInstance = new StreamSubtitlesCaptionsApi(defaultClient);
    String language = "language_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String _file = "_file_example"; // String | The WebVTT file containing the caption or subtitle content.
    try {
      StreamLanguageResponseSingle result = apiInstance.streamSubtitlesCaptionsUploadCaptionsOrSubtitles(language, identifier, accountId, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamSubtitlesCaptionsApi#streamSubtitlesCaptionsUploadCaptionsOrSubtitles");
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
| **language** | **String**|  | |
| **identifier** | **String**|  | |
| **accountId** | **String**|  | |
| **_file** | **String**| The WebVTT file containing the caption or subtitle content. | |

### Return type

[**StreamLanguageResponseSingle**](StreamLanguageResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload captions or subtitles response |  -  |
| **4XX** | Upload captions or subtitles response failure |  -  |

