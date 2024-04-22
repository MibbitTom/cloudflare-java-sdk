# RadarTrafficAnomaliesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**radarGetTrafficAnomalies**](RadarTrafficAnomaliesApi.md#radarGetTrafficAnomalies) | **GET** /radar/traffic_anomalies | Get latest Internet traffic anomalies. |
| [**radarGetTrafficAnomaliesTop**](RadarTrafficAnomaliesApi.md#radarGetTrafficAnomaliesTop) | **GET** /radar/traffic_anomalies/locations | Get top locations by total traffic anomalies generated. |


<a id="radarGetTrafficAnomalies"></a>
# **radarGetTrafficAnomalies**
> RadarGetTrafficAnomalies200Response radarGetTrafficAnomalies(limit, offset, dateRange, dateStart, dateEnd, status, asn, location, format)

Get latest Internet traffic anomalies.

Internet traffic anomalies are signals that might point to an outage,         These alerts are automatically detected by Radar and then manually verified by our team.         This endpoint returns the latest alerts.         

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarTrafficAnomaliesApi;

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

    RadarTrafficAnomaliesApi apiInstance = new RadarTrafficAnomaliesApi(defaultClient);
    Integer limit = 5; // Integer | 
    Integer offset = 56; // Integer | 
    String dateRange = "1d"; // String | 
    OffsetDateTime dateStart = OffsetDateTime.parse("2023-09-01T11:41:33.782Z"); // OffsetDateTime | 
    OffsetDateTime dateEnd = OffsetDateTime.parse("2023-09-01T11:41:33.782Z"); // OffsetDateTime | 
    String status = "VERIFIED"; // String | 
    Integer asn = 174; // Integer | 
    String location = "US"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetTrafficAnomalies200Response result = apiInstance.radarGetTrafficAnomalies(limit, offset, dateRange, dateStart, dateEnd, status, asn, location, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarTrafficAnomaliesApi#radarGetTrafficAnomalies");
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
| **status** | **String**|  | [optional] [enum: VERIFIED, UNVERIFIED] |
| **asn** | **Integer**|  | [optional] |
| **location** | **String**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetTrafficAnomalies200Response**](RadarGetTrafficAnomalies200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Internet traffic anomalies |  -  |
| **400** | Bad Request |  -  |

<a id="radarGetTrafficAnomaliesTop"></a>
# **radarGetTrafficAnomaliesTop**
> RadarGetTrafficAnomaliesTop200Response radarGetTrafficAnomaliesTop(limit, dateRange, dateStart, dateEnd, status, format)

Get top locations by total traffic anomalies generated.

Internet traffic anomalies are signals that might point to an outage,         These alerts are automatically detected by Radar and then manually verified by our team.         This endpoint returns the sum of alerts grouped by location.         

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarTrafficAnomaliesApi;

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

    RadarTrafficAnomaliesApi apiInstance = new RadarTrafficAnomaliesApi(defaultClient);
    Integer limit = 5; // Integer | 
    String dateRange = "1d"; // String | 
    OffsetDateTime dateStart = OffsetDateTime.parse("2023-09-01T11:41:33.782Z"); // OffsetDateTime | 
    OffsetDateTime dateEnd = OffsetDateTime.parse("2023-09-01T11:41:33.782Z"); // OffsetDateTime | 
    String status = "VERIFIED"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetTrafficAnomaliesTop200Response result = apiInstance.radarGetTrafficAnomaliesTop(limit, dateRange, dateStart, dateEnd, status, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarTrafficAnomaliesApi#radarGetTrafficAnomaliesTop");
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
| **status** | **String**|  | [optional] [enum: VERIFIED, UNVERIFIED] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetTrafficAnomaliesTop200Response**](RadarGetTrafficAnomaliesTop200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of locations with number of traffic anomalies |  -  |
| **400** | Bad Request |  -  |

