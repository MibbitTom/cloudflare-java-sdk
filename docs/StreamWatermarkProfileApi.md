# StreamWatermarkProfileApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload**](StreamWatermarkProfileApi.md#streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload) | **POST** /accounts/{account_id}/stream/watermarks | Create watermark profiles via basic upload |
| [**streamWatermarkProfileDeleteWatermarkProfiles**](StreamWatermarkProfileApi.md#streamWatermarkProfileDeleteWatermarkProfiles) | **DELETE** /accounts/{account_id}/stream/watermarks/{identifier} | Delete watermark profiles |
| [**streamWatermarkProfileListWatermarkProfiles**](StreamWatermarkProfileApi.md#streamWatermarkProfileListWatermarkProfiles) | **GET** /accounts/{account_id}/stream/watermarks | List watermark profiles |
| [**streamWatermarkProfileWatermarkProfileDetails**](StreamWatermarkProfileApi.md#streamWatermarkProfileWatermarkProfileDetails) | **GET** /accounts/{account_id}/stream/watermarks/{identifier} | Watermark profile details |


<a id="streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload"></a>
# **streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload**
> StreamWatermarkResponseSingle streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload(accountId, _file, name, opacity, padding, position, scale)

Create watermark profiles via basic upload

Creates watermark profiles using a single &#x60;HTTP POST multipart/form-data&#x60; request.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.StreamWatermarkProfileApi;

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

    StreamWatermarkProfileApi apiInstance = new StreamWatermarkProfileApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String _file = "_file_example"; // String | The image file to upload.
    String name = ""; // String | A short description of the watermark profile.
    BigDecimal opacity = new BigDecimal("1"); // BigDecimal | The translucency of the image. A value of `0.0` makes the image completely transparent, and `1.0` makes the image completely opaque. Note that if the image is already semi-transparent, setting this to `1.0` will not make the image completely opaque.
    BigDecimal padding = new BigDecimal("0.05"); // BigDecimal | The whitespace between the adjacent edges (determined by position) of the video and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded video width or length, as determined by the algorithm.
    String position = "upperRight"; // String | The location of the image. Valid positions are: `upperRight`, `upperLeft`, `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the `padding` parameter.
    BigDecimal scale = new BigDecimal("0.15"); // BigDecimal | The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. `0.0` indicates no scaling (use the size of the image as-is), and `1.0 `fills the entire video.
    try {
      StreamWatermarkResponseSingle result = apiInstance.streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload(accountId, _file, name, opacity, padding, position, scale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamWatermarkProfileApi#streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload");
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
| **_file** | **String**| The image file to upload. | |
| **name** | **String**| A short description of the watermark profile. | [optional] [default to ] |
| **opacity** | **BigDecimal**| The translucency of the image. A value of &#x60;0.0&#x60; makes the image completely transparent, and &#x60;1.0&#x60; makes the image completely opaque. Note that if the image is already semi-transparent, setting this to &#x60;1.0&#x60; will not make the image completely opaque. | [optional] [default to 1] |
| **padding** | **BigDecimal**| The whitespace between the adjacent edges (determined by position) of the video and the image. &#x60;0.0&#x60; indicates no padding, and &#x60;1.0&#x60; indicates a fully padded video width or length, as determined by the algorithm. | [optional] [default to 0.05] |
| **position** | **String**| The location of the image. Valid positions are: &#x60;upperRight&#x60;, &#x60;upperLeft&#x60;, &#x60;lowerLeft&#x60;, &#x60;lowerRight&#x60;, and &#x60;center&#x60;. Note that &#x60;center&#x60; ignores the &#x60;padding&#x60; parameter. | [optional] [default to upperRight] |
| **scale** | **BigDecimal**| The size of the image relative to the overall size of the video. This parameter will adapt to horizontal and vertical videos automatically. &#x60;0.0&#x60; indicates no scaling (use the size of the image as-is), and &#x60;1.0 &#x60;fills the entire video. | [optional] [default to 0.15] |

### Return type

[**StreamWatermarkResponseSingle**](StreamWatermarkResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create watermark profiles via basic upload response |  -  |
| **4XX** | Create watermark profiles via basic upload response failure |  -  |

<a id="streamWatermarkProfileDeleteWatermarkProfiles"></a>
# **streamWatermarkProfileDeleteWatermarkProfiles**
> StreamWatermarkProfileDeleteWatermarkProfiles200Response streamWatermarkProfileDeleteWatermarkProfiles(identifier, accountId)

Delete watermark profiles

Deletes a watermark profile.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.StreamWatermarkProfileApi;

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

    StreamWatermarkProfileApi apiInstance = new StreamWatermarkProfileApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      StreamWatermarkProfileDeleteWatermarkProfiles200Response result = apiInstance.streamWatermarkProfileDeleteWatermarkProfiles(identifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamWatermarkProfileApi#streamWatermarkProfileDeleteWatermarkProfiles");
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

[**StreamWatermarkProfileDeleteWatermarkProfiles200Response**](StreamWatermarkProfileDeleteWatermarkProfiles200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete watermark profiles response |  -  |
| **4XX** | Delete watermark profiles response failure |  -  |

<a id="streamWatermarkProfileListWatermarkProfiles"></a>
# **streamWatermarkProfileListWatermarkProfiles**
> StreamWatermarkResponseCollection streamWatermarkProfileListWatermarkProfiles(accountId)

List watermark profiles

Lists all watermark profiles for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.StreamWatermarkProfileApi;

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

    StreamWatermarkProfileApi apiInstance = new StreamWatermarkProfileApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      StreamWatermarkResponseCollection result = apiInstance.streamWatermarkProfileListWatermarkProfiles(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamWatermarkProfileApi#streamWatermarkProfileListWatermarkProfiles");
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

[**StreamWatermarkResponseCollection**](StreamWatermarkResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List watermark profiles response |  -  |
| **4XX** | List watermark profiles response failure |  -  |

<a id="streamWatermarkProfileWatermarkProfileDetails"></a>
# **streamWatermarkProfileWatermarkProfileDetails**
> StreamWatermarkResponseSingle streamWatermarkProfileWatermarkProfileDetails(identifier, accountId)

Watermark profile details

Retrieves details for a single watermark profile.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.StreamWatermarkProfileApi;

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

    StreamWatermarkProfileApi apiInstance = new StreamWatermarkProfileApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      StreamWatermarkResponseSingle result = apiInstance.streamWatermarkProfileWatermarkProfileDetails(identifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamWatermarkProfileApi#streamWatermarkProfileWatermarkProfileDetails");
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

[**StreamWatermarkResponseSingle**](StreamWatermarkResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Watermark profile details response |  -  |
| **4XX** | Watermark profile details response failure |  -  |

