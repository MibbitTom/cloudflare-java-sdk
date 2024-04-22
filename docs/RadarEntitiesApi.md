# RadarEntitiesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**radarGetAsnsRel**](RadarEntitiesApi.md#radarGetAsnsRel) | **GET** /radar/entities/asns/{asn}/rel | Get AS-level relationships by AS number |
| [**radarGetEntitiesAsnById**](RadarEntitiesApi.md#radarGetEntitiesAsnById) | **GET** /radar/entities/asns/{asn} | Get autonomous system information by AS number |
| [**radarGetEntitiesAsnByIp**](RadarEntitiesApi.md#radarGetEntitiesAsnByIp) | **GET** /radar/entities/asns/ip | Get autonomous system information by IP address |
| [**radarGetEntitiesAsnList**](RadarEntitiesApi.md#radarGetEntitiesAsnList) | **GET** /radar/entities/asns | Get autonomous systems |
| [**radarGetEntitiesIp**](RadarEntitiesApi.md#radarGetEntitiesIp) | **GET** /radar/entities/ip | Get IP address |
| [**radarGetEntitiesLocationByAlpha2**](RadarEntitiesApi.md#radarGetEntitiesLocationByAlpha2) | **GET** /radar/entities/locations/{location} | Get location |
| [**radarGetEntitiesLocations**](RadarEntitiesApi.md#radarGetEntitiesLocations) | **GET** /radar/entities/locations | Get locations |


<a id="radarGetAsnsRel"></a>
# **radarGetAsnsRel**
> RadarGetAsnsRel200Response radarGetAsnsRel(asn, asn2, format)

Get AS-level relationships by AS number

Get AS-level relationship for given networks.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarEntitiesApi;

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

    RadarEntitiesApi apiInstance = new RadarEntitiesApi(defaultClient);
    Integer asn = 3; // Integer | 
    Integer asn2 = 56; // Integer | 
    String format = "JSON"; // String | 
    try {
      RadarGetAsnsRel200Response result = apiInstance.radarGetAsnsRel(asn, asn2, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEntitiesApi#radarGetAsnsRel");
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
| **asn** | **Integer**|  | |
| **asn2** | **Integer**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetAsnsRel200Response**](RadarGetAsnsRel200Response.md)

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

<a id="radarGetEntitiesAsnById"></a>
# **radarGetEntitiesAsnById**
> RadarGetEntitiesAsnById200Response radarGetEntitiesAsnById(asn, format)

Get autonomous system information by AS number

Get the requested autonomous system information. A confidence level below &#x60;5&#x60; indicates a low level of confidence in the traffic data - normally this happens because Cloudflare has a small amount of traffic from/to this AS). Population estimates come from APNIC (refer to https://labs.apnic.net/?p&#x3D;526).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarEntitiesApi;

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

    RadarEntitiesApi apiInstance = new RadarEntitiesApi(defaultClient);
    Integer asn = 3; // Integer | 
    String format = "JSON"; // String | 
    try {
      RadarGetEntitiesAsnById200Response result = apiInstance.radarGetEntitiesAsnById(asn, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEntitiesApi#radarGetEntitiesAsnById");
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
| **asn** | **Integer**|  | |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEntitiesAsnById200Response**](RadarGetEntitiesAsnById200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |

<a id="radarGetEntitiesAsnByIp"></a>
# **radarGetEntitiesAsnByIp**
> RadarGetEntitiesAsnByIp200Response radarGetEntitiesAsnByIp(ip, format)

Get autonomous system information by IP address

Get the requested autonomous system information based on IP address. Population estimates come from APNIC (refer to https://labs.apnic.net/?p&#x3D;526).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarEntitiesApi;

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

    RadarEntitiesApi apiInstance = new RadarEntitiesApi(defaultClient);
    String ip = "8.8.8.8"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetEntitiesAsnByIp200Response result = apiInstance.radarGetEntitiesAsnByIp(ip, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEntitiesApi#radarGetEntitiesAsnByIp");
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
| **ip** | **String**|  | |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEntitiesAsnByIp200Response**](RadarGetEntitiesAsnByIp200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |

<a id="radarGetEntitiesAsnList"></a>
# **radarGetEntitiesAsnList**
> RadarGetEntitiesAsnList200Response radarGetEntitiesAsnList(limit, offset, asn, location, orderBy, format)

Get autonomous systems

Gets a list of autonomous systems (AS).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarEntitiesApi;

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

    RadarEntitiesApi apiInstance = new RadarEntitiesApi(defaultClient);
    Integer limit = 5; // Integer | 
    Integer offset = 56; // Integer | 
    String asn = "174,7922"; // String | 
    String location = "US"; // String | 
    String orderBy = "ASN"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetEntitiesAsnList200Response result = apiInstance.radarGetEntitiesAsnList(limit, offset, asn, location, orderBy, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEntitiesApi#radarGetEntitiesAsnList");
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
| **asn** | **String**|  | [optional] |
| **location** | **String**|  | [optional] |
| **orderBy** | **String**|  | [optional] [default to ASN] [enum: ASN, POPULATION] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEntitiesAsnList200Response**](RadarGetEntitiesAsnList200Response.md)

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

<a id="radarGetEntitiesIp"></a>
# **radarGetEntitiesIp**
> RadarGetEntitiesIp200Response radarGetEntitiesIp(ip, format)

Get IP address

Get IP address information. 

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarEntitiesApi;

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

    RadarEntitiesApi apiInstance = new RadarEntitiesApi(defaultClient);
    String ip = "8.8.8.8"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetEntitiesIp200Response result = apiInstance.radarGetEntitiesIp(ip, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEntitiesApi#radarGetEntitiesIp");
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
| **ip** | **String**|  | |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEntitiesIp200Response**](RadarGetEntitiesIp200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |

<a id="radarGetEntitiesLocationByAlpha2"></a>
# **radarGetEntitiesLocationByAlpha2**
> RadarGetEntitiesLocationByAlpha2200Response radarGetEntitiesLocationByAlpha2(location, format)

Get location

Get the requested location information. A confidence level below &#x60;5&#x60; indicates a low level of confidence in the traffic data - normally this happens because Cloudflare has a small amount of traffic from/to this location).

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarEntitiesApi;

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

    RadarEntitiesApi apiInstance = new RadarEntitiesApi(defaultClient);
    String location = "US"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetEntitiesLocationByAlpha2200Response result = apiInstance.radarGetEntitiesLocationByAlpha2(location, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEntitiesApi#radarGetEntitiesLocationByAlpha2");
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
| **location** | **String**|  | |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEntitiesLocationByAlpha2200Response**](RadarGetEntitiesLocationByAlpha2200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |

<a id="radarGetEntitiesLocations"></a>
# **radarGetEntitiesLocations**
> RadarGetEntitiesLocations200Response radarGetEntitiesLocations(limit, offset, location, format)

Get locations

Get a list of locations.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RadarEntitiesApi;

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

    RadarEntitiesApi apiInstance = new RadarEntitiesApi(defaultClient);
    Integer limit = 5; // Integer | 
    Integer offset = 56; // Integer | 
    String location = "US,CA"; // String | 
    String format = "JSON"; // String | 
    try {
      RadarGetEntitiesLocations200Response result = apiInstance.radarGetEntitiesLocations(limit, offset, location, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RadarEntitiesApi#radarGetEntitiesLocations");
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
| **location** | **String**|  | [optional] |
| **format** | **String**|  | [optional] [enum: JSON, CSV] |

### Return type

[**RadarGetEntitiesLocations200Response**](RadarGetEntitiesLocations200Response.md)

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

