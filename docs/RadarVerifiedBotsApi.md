# RadarVerifiedBotsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**radarGetVerifiedBotsTopByHttpRequests**](RadarVerifiedBotsApi.md#radarGetVerifiedBotsTopByHttpRequests) | **GET** /radar/verified_bots/top/bots | Get Top Verified Bots By HTTP Requests |
| [**radarGetVerifiedBotsTopCategoriesByHttpRequests**](RadarVerifiedBotsApi.md#radarGetVerifiedBotsTopCategoriesByHttpRequests) | **GET** /radar/verified_bots/top/categories | Get Top Verified Bot Categories By HTTP Requests |


<a id="radarGetVerifiedBotsTopByHttpRequests"></a>
# **radarGetVerifiedBotsTopByHttpRequests**
> RadarGetVerifiedBotsTopByHttpRequests200Response radarGetVerifiedBotsTopByHttpRequests(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get Top Verified Bots By HTTP Requests

Get top verified bots by HTTP requests, with owner and category.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarVerifiedBotsApi;

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

    RadarVerifiedBotsApi apiInstance = new RadarVerifiedBotsApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetVerifiedBotsTopByHttpRequests200Response result = apiInstance.radarGetVerifiedBotsTopByHttpRequests(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarVerifiedBotsApi#radarGetVerifiedBotsTopByHttpRequests");
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
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetVerifiedBotsTopByHttpRequests200Response**](RadarGetVerifiedBotsTopByHttpRequests200Response.md)

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

<a id="radarGetVerifiedBotsTopCategoriesByHttpRequests"></a>
# **radarGetVerifiedBotsTopCategoriesByHttpRequests**
> RadarGetVerifiedBotsTopCategoriesByHttpRequests200Response radarGetVerifiedBotsTopCategoriesByHttpRequests(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format)

Get Top Verified Bot Categories By HTTP Requests

Get top verified bot categories by HTTP requests, along with their corresponding percentage, over the total verified bot HTTP requests.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarVerifiedBotsApi;

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

    RadarVerifiedBotsApi apiInstance = new RadarVerifiedBotsApi(defaultClient);
    Integer limit = 5; // Integer | 
    List<String> name = Arrays.asList(); // List<String> | 
    List<String> dateRange = Arrays.asList(); // List<String> | 
    List<OffsetDateTime> dateStart = Arrays.asList(); // List<OffsetDateTime> | 
    List<OffsetDateTime> dateEnd = Arrays.asList(); // List<OffsetDateTime> | 
    List<String> asn = Arrays.asList(); // List<String> | 
    List<String> location = Arrays.asList(); // List<String> | 
    List<String> continent = Arrays.asList(); // List<String> | 
    String format = "JSON"; // String | 
    try {
      RadarGetVerifiedBotsTopCategoriesByHttpRequests200Response result = apiInstance.radarGetVerifiedBotsTopCategoriesByHttpRequests(limit, name, dateRange, dateStart, dateEnd, asn, location, continent, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarVerifiedBotsApi#radarGetVerifiedBotsTopCategoriesByHttpRequests");
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
| **name** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dateRange** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: 1d, 2d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 2dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl] |
| **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)|  | [optional] |
| **asn** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **location** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **continent** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetVerifiedBotsTopCategoriesByHttpRequests200Response**](RadarGetVerifiedBotsTopCategoriesByHttpRequests200Response.md)

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

