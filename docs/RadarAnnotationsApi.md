# RadarAnnotationsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**radarGetAnnotationsOutages**](RadarAnnotationsApi.md#radarGetAnnotationsOutages) | **GET** /radar/annotations/outages | Get latest Internet outages and anomalies. |
| [**radarGetAnnotationsOutagesTop**](RadarAnnotationsApi.md#radarGetAnnotationsOutagesTop) | **GET** /radar/annotations/outages/locations | Get the number of outages for locations. |


<a id="radarGetAnnotationsOutages"></a>
# **radarGetAnnotationsOutages**
> RadarGetAnnotationsOutages200Response radarGetAnnotationsOutages(limit, offset, dateRange, dateStart, dateEnd, asn, location, format)

Get latest Internet outages and anomalies.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarAnnotationsApi;

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

    RadarAnnotationsApi apiInstance = new RadarAnnotationsApi(defaultClient);
    Integer limit = 5; // Integer | 
    Integer offset = 56; // Integer | 
    String dateRange = "1d"; // String | 
    OffsetDateTime dateStart = OffsetDateTime.parse("2023-09-01T11:41:33.782Z"); // OffsetDateTime | 
    OffsetDateTime dateEnd = OffsetDateTime.parse("2023-09-01T11:41:33.782Z"); // OffsetDateTime | 
    Integer asn = 174; // Integer | 
    String location = "US"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetAnnotationsOutages200Response result = apiInstance.radarGetAnnotationsOutages(limit, offset, dateRange, dateStart, dateEnd, asn, location, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAnnotationsApi#radarGetAnnotationsOutages");
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
| **dateRange** | **String**|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | **OffsetDateTime**|  | [optional] |
| **dateEnd** | **OffsetDateTime**|  | [optional] |
| **asn** | **Integer**|  | [optional] |
| **location** | **String**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAnnotationsOutages200Response**](RadarGetAnnotationsOutages200Response.md)

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

<a id="radarGetAnnotationsOutagesTop"></a>
# **radarGetAnnotationsOutagesTop**
> RadarGetAnnotationsOutagesTop200Response radarGetAnnotationsOutagesTop(limit, dateRange, dateStart, dateEnd, format)

Get the number of outages for locations.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarAnnotationsApi;

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

    RadarAnnotationsApi apiInstance = new RadarAnnotationsApi(defaultClient);
    Integer limit = 5; // Integer | 
    String dateRange = "1d"; // String | 
    OffsetDateTime dateStart = OffsetDateTime.parse("2023-09-01T11:41:33.782Z"); // OffsetDateTime | 
    OffsetDateTime dateEnd = OffsetDateTime.parse("2023-09-01T11:41:33.782Z"); // OffsetDateTime | 
    String format = "JSON"; // String | 
    try {
      RadarGetAnnotationsOutagesTop200Response result = apiInstance.radarGetAnnotationsOutagesTop(limit, dateRange, dateStart, dateEnd, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarAnnotationsApi#radarGetAnnotationsOutagesTop");
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
| **dateRange** | **String**|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | **OffsetDateTime**|  | [optional] |
| **dateEnd** | **OffsetDateTime**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAnnotationsOutagesTop200Response**](RadarGetAnnotationsOutagesTop200Response.md)

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

