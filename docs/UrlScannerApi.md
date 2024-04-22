# UrlScannerApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**urlscannerCreateScan**](UrlScannerApi.md#urlscannerCreateScan) | **POST** /accounts/{accountId}/urlscanner/scan | Create URL Scan |
| [**urlscannerGetScan**](UrlScannerApi.md#urlscannerGetScan) | **GET** /accounts/{accountId}/urlscanner/scan/{scanId} | Get URL scan |
| [**urlscannerGetScanHar**](UrlScannerApi.md#urlscannerGetScanHar) | **GET** /accounts/{accountId}/urlscanner/scan/{scanId}/har | Get URL scan&#39;s HAR |
| [**urlscannerGetScanScreenshot**](UrlScannerApi.md#urlscannerGetScanScreenshot) | **GET** /accounts/{accountId}/urlscanner/scan/{scanId}/screenshot | Get screenshot |
| [**urlscannerSearchScans**](UrlScannerApi.md#urlscannerSearchScans) | **GET** /accounts/{accountId}/urlscanner/scan | Search URL scans |


<a id="urlscannerCreateScan"></a>
# **urlscannerCreateScan**
> UrlscannerCreateScan200Response urlscannerCreateScan(accountId, urlscannerCreateScanRequest)

Create URL Scan

Submit a URL to scan. You can also set some options, like the visibility level and custom headers. Accounts are limited to 1 new scan every 10 seconds and 8000 per month. If you need more, please reach out.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.UrlScannerApi;

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

    UrlScannerApi apiInstance = new UrlScannerApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    UrlscannerCreateScanRequest urlscannerCreateScanRequest = new UrlscannerCreateScanRequest(); // UrlscannerCreateScanRequest | 
    try {
      UrlscannerCreateScan200Response result = apiInstance.urlscannerCreateScan(accountId, urlscannerCreateScanRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlScannerApi#urlscannerCreateScan");
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
| **urlscannerCreateScanRequest** | [**UrlscannerCreateScanRequest**](UrlscannerCreateScanRequest.md)|  | [optional] |

### Return type

[**UrlscannerCreateScan200Response**](UrlscannerCreateScan200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scan request accepted successfully. |  -  |
| **400** | Invalid params. |  -  |
| **409** | Scan request denied: hostname was recently scanned. |  -  |
| **429** | Scan request denied: rate limited. |  -  |

<a id="urlscannerGetScan"></a>
# **urlscannerGetScan**
> UrlscannerGetScan200Response urlscannerGetScan(scanId, accountId)

Get URL scan

Get URL scan by uuid

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.UrlScannerApi;

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

    UrlScannerApi apiInstance = new UrlScannerApi(defaultClient);
    UUID scanId = UUID.randomUUID(); // UUID | 
    String accountId = "accountId_example"; // String | 
    try {
      UrlscannerGetScan200Response result = apiInstance.urlscannerGetScan(scanId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlScannerApi#urlscannerGetScan");
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
| **scanId** | **UUID**|  | |
| **accountId** | **String**|  | |

### Return type

[**UrlscannerGetScan200Response**](UrlscannerGetScan200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scan has finished. It may or may not have been successful. |  -  |
| **202** | Scan is in progress. Check current status in &#x60;result.scan.task.status&#x60;. Possible statuses: &#x60;Queued&#x60;,&#x60;InProgress&#x60;,&#x60;InPostProcessing&#x60;,&#x60;Finished&#x60;. |  -  |
| **400** | Invalid params. |  -  |
| **404** | Scan not found. |  -  |

<a id="urlscannerGetScanHar"></a>
# **urlscannerGetScanHar**
> UrlscannerGetScanHar200Response urlscannerGetScanHar(scanId, accountId)

Get URL scan&#39;s HAR

Get a URL scan&#39;s HAR file. See HAR spec at http://www.softwareishard.com/blog/har-12-spec/.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.UrlScannerApi;

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

    UrlScannerApi apiInstance = new UrlScannerApi(defaultClient);
    UUID scanId = UUID.randomUUID(); // UUID | 
    String accountId = "accountId_example"; // String | 
    try {
      UrlscannerGetScanHar200Response result = apiInstance.urlscannerGetScanHar(scanId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlScannerApi#urlscannerGetScanHar");
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
| **scanId** | **UUID**|  | |
| **accountId** | **String**|  | |

### Return type

[**UrlscannerGetScanHar200Response**](UrlscannerGetScanHar200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the scan&#39;s har. |  -  |
| **202** | Scan is in progress. Check current status in &#x60;result.scan.task.status&#x60;. Possible statuses: &#x60;Queued&#x60;,&#x60;InProgress&#x60;,&#x60;InPostProcessing&#x60;,&#x60;Finished&#x60;. |  -  |
| **400** | Invalid params. |  -  |
| **404** | Scan not found. |  -  |

<a id="urlscannerGetScanScreenshot"></a>
# **urlscannerGetScanScreenshot**
> String urlscannerGetScanScreenshot(scanId, accountId, resolution)

Get screenshot

Get scan&#39;s screenshot by resolution (desktop/mobile/tablet).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.UrlScannerApi;

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

    UrlScannerApi apiInstance = new UrlScannerApi(defaultClient);
    UUID scanId = UUID.randomUUID(); // UUID | 
    String accountId = "accountId_example"; // String | 
    String resolution = "desktop"; // String | 
    try {
      String result = apiInstance.urlscannerGetScanScreenshot(scanId, accountId, resolution);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlScannerApi#urlscannerGetScanScreenshot");
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
| **scanId** | **UUID**|  | |
| **accountId** | **String**|  | |
| **resolution** | **String**|  | [optional] [default to desktop] [enum: desktop, mobile, tablet] |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the scan&#39;s requested screenshot. |  -  |
| **202** | Scan is in progress. Check current status in &#x60;result.scan.task.status&#x60;. Possible statuses: &#x60;Queued&#x60;,&#x60;InProgress&#x60;,&#x60;InPostProcessing&#x60;,&#x60;Finished&#x60;. |  -  |
| **400** | Invalid params. |  -  |
| **404** | Scan not found. |  -  |

<a id="urlscannerSearchScans"></a>
# **urlscannerSearchScans**
> UrlscannerSearchScans200Response urlscannerSearchScans(accountId, scanId, limit, nextCursor, dateStart, dateEnd, url, hostname, path, ip, asn, hash, pageUrl, pageHostname, pagePath, pageAsn, pageIp, accountScans, isMalicious)

Search URL scans

Search scans by date and webpages&#39; requests, including full URL (after redirects), hostname, and path. &lt;br/&gt; A successful scan will appear in search results a few minutes after finishing but may take much longer if the system in under load. By default, only successfully completed scans will appear in search results, unless searching by &#x60;scanId&#x60;. Please take into account that older scans may be removed from the search index at an unspecified time.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.UrlScannerApi;

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

    UrlScannerApi apiInstance = new UrlScannerApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    UUID scanId = UUID.randomUUID(); // UUID | 
    Integer limit = 100; // Integer | 
    String nextCursor = "nextCursor_example"; // String | 
    OffsetDateTime dateStart = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime dateEnd = OffsetDateTime.now(); // OffsetDateTime | 
    String url = "https://example.com/?hello"; // String | 
    String hostname = "example.com"; // String | 
    String path = "/samples/subresource-integrity/"; // String | 
    String ip = "1.1.1.1"; // String | 
    String asn = "13335"; // String | 
    String hash = "hash_example"; // String | 
    String pageUrl = "pageUrl_example"; // String | 
    String pageHostname = "pageHostname_example"; // String | 
    String pagePath = "pagePath_example"; // String | 
    String pageAsn = "pageAsn_example"; // String | 
    String pageIp = "pageIp_example"; // String | 
    Boolean accountScans = true; // Boolean | 
    Boolean isMalicious = true; // Boolean | 
    try {
      UrlscannerSearchScans200Response result = apiInstance.urlscannerSearchScans(accountId, scanId, limit, nextCursor, dateStart, dateEnd, url, hostname, path, ip, asn, hash, pageUrl, pageHostname, pagePath, pageAsn, pageIp, accountScans, isMalicious);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlScannerApi#urlscannerSearchScans");
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
| **scanId** | **UUID**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **nextCursor** | **String**|  | [optional] |
| **dateStart** | **OffsetDateTime**|  | [optional] |
| **dateEnd** | **OffsetDateTime**|  | [optional] |
| **url** | **String**|  | [optional] |
| **hostname** | **String**|  | [optional] |
| **path** | **String**|  | [optional] |
| **ip** | **String**|  | [optional] |
| **asn** | **String**|  | [optional] |
| **hash** | **String**|  | [optional] |
| **pageUrl** | **String**|  | [optional] |
| **pageHostname** | **String**|  | [optional] |
| **pagePath** | **String**|  | [optional] |
| **pageAsn** | **String**|  | [optional] |
| **pageIp** | **String**|  | [optional] |
| **accountScans** | **Boolean**|  | [optional] |
| **isMalicious** | **Boolean**|  | [optional] |

### Return type

[**UrlscannerSearchScans200Response**](UrlscannerSearchScans200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Search results |  -  |
| **400** | Invalid params. |  -  |

