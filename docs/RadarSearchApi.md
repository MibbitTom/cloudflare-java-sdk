# RadarSearchApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**radarGetSearchGlobal**](RadarSearchApi.md#radarGetSearchGlobal) | **GET** /radar/search/global | Search for locations, autonomous systems (AS) and reports. |


<a id="radarGetSearchGlobal"></a>
# **radarGetSearchGlobal**
> RadarGetSearchGlobal200Response radarGetSearchGlobal(query, limit, limitPerGroup, include, exclude, format)

Search for locations, autonomous systems (AS) and reports.

Lets you search for locations, autonomous systems (AS) and reports.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RadarSearchApi;

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

    RadarSearchApi apiInstance = new RadarSearchApi(defaultClient);
    String query = "United"; // String | 
    Integer limit = 5; // Integer | 
    BigDecimal limitPerGroup = new BigDecimal(78); // BigDecimal | 
    List<String> include = Arrays.asList(); // List<String> | 
    List<String> exclude = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetSearchGlobal200Response result = apiInstance.radarGetSearchGlobal(query, limit, limitPerGroup, include, exclude, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarSearchApi#radarGetSearchGlobal");
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
| **query** | **String**|  | |
| **limit** | **Integer**|  | [optional] |
| **limitPerGroup** | **BigDecimal**|  | [optional] |
| **include** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: SPECIAL_EVENTS, NOTEBOOKS, LOCATIONS, ASNS] |
| **exclude** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: SPECIAL_EVENTS, NOTEBOOKS, LOCATIONS, ASNS] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetSearchGlobal200Response**](RadarGetSearchGlobal200Response.md)

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

