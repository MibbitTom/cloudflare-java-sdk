# RadarDatasetsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**radarGetReportsDatasetDownload**](RadarDatasetsApi.md#radarGetReportsDatasetDownload) | **GET** /radar/datasets/{alias} | Get Dataset csv Stream |
| [**radarGetReportsDatasets**](RadarDatasetsApi.md#radarGetReportsDatasets) | **GET** /radar/datasets | Get Datasets |
| [**radarPostReportsDatasetDownloadUrl**](RadarDatasetsApi.md#radarPostReportsDatasetDownloadUrl) | **POST** /radar/datasets/download | Get Dataset download url |


<a id="radarGetReportsDatasetDownload"></a>
# **radarGetReportsDatasetDownload**
> String radarGetReportsDatasetDownload(alias, date)

Get Dataset csv Stream

Get the csv content of a given dataset by alias or id. When getting the content by alias the latest dataset is returned, optionally filtered by the latest available at a given date.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarDatasetsApi;

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

    RadarDatasetsApi apiInstance = new RadarDatasetsApi(defaultClient);
    String alias = "ranking_top_1000"; // String | 
    String date = "date_example"; // String | 
    try {
      String result = apiInstance.radarGetReportsDatasetDownload(alias, date);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarDatasetsApi#radarGetReportsDatasetDownload");
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
| **alias** | **String**|  | |
| **date** | **String**|  | [optional] |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | Bad Request |  -  |

<a id="radarGetReportsDatasets"></a>
# **radarGetReportsDatasets**
> RadarGetReportsDatasets200Response radarGetReportsDatasets(limit, offset, datasetType, format)

Get Datasets

Get a list of datasets.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarDatasetsApi;

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

    RadarDatasetsApi apiInstance = new RadarDatasetsApi(defaultClient);
    Integer limit = 5; // Integer | 
    Integer offset = 56; // Integer | 
    String datasetType = "RANKING_BUCKET"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetReportsDatasets200Response result = apiInstance.radarGetReportsDatasets(limit, offset, datasetType, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarDatasetsApi#radarGetReportsDatasets");
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
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |
| **datasetType** | **String**|  | [optional] [default to RANKING_BUCKET] [enum: RANKING_BUCKET, REPORT] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetReportsDatasets200Response**](RadarGetReportsDatasets200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | Bad Request |  -  |

<a id="radarPostReportsDatasetDownloadUrl"></a>
# **radarPostReportsDatasetDownloadUrl**
> RadarPostReportsDatasetDownloadUrl200Response radarPostReportsDatasetDownloadUrl(format, radarPostReportsDatasetDownloadUrlRequest)

Get Dataset download url

Get a url to download a single dataset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarDatasetsApi;

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

    RadarDatasetsApi apiInstance = new RadarDatasetsApi(defaultClient);
    String format = "JSON"; // String | 
    RadarPostReportsDatasetDownloadUrlRequest radarPostReportsDatasetDownloadUrlRequest = new RadarPostReportsDatasetDownloadUrlRequest(); // RadarPostReportsDatasetDownloadUrlRequest | 
    try {
      RadarPostReportsDatasetDownloadUrl200Response result = apiInstance.radarPostReportsDatasetDownloadUrl(format, radarPostReportsDatasetDownloadUrlRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarDatasetsApi#radarPostReportsDatasetDownloadUrl");
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
| **format** | **String**|  | [optional] [enum: JSON, CSV] |
| **radarPostReportsDatasetDownloadUrlRequest** | [**RadarPostReportsDatasetDownloadUrlRequest**](RadarPostReportsDatasetDownloadUrlRequest.md)|  | [optional] |

### Return type

[**RadarPostReportsDatasetDownloadUrl200Response**](RadarPostReportsDatasetDownloadUrl200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | Bad Request |  -  |

