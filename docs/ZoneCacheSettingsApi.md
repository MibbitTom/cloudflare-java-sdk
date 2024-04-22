# ZoneCacheSettingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneCacheSettingsChangeCacheReserveSetting**](ZoneCacheSettingsApi.md#zoneCacheSettingsChangeCacheReserveSetting) | **PATCH** /zones/{zone_id}/cache/cache_reserve | Change Cache Reserve setting |
| [**zoneCacheSettingsChangeOriginMaxHttpVersionSetting**](ZoneCacheSettingsApi.md#zoneCacheSettingsChangeOriginMaxHttpVersionSetting) | **PATCH** /zones/{zone_id}/settings/origin_max_http_version | Change Origin Max HTTP Version Setting |
| [**zoneCacheSettingsChangeRegionalTieredCacheSetting**](ZoneCacheSettingsApi.md#zoneCacheSettingsChangeRegionalTieredCacheSetting) | **PATCH** /zones/{zone_id}/cache/regional_tiered_cache | Change Regional Tiered Cache setting |
| [**zoneCacheSettingsChangeVariantsSetting**](ZoneCacheSettingsApi.md#zoneCacheSettingsChangeVariantsSetting) | **PATCH** /zones/{zone_id}/cache/variants | Change variants setting |
| [**zoneCacheSettingsDeleteVariantsSetting**](ZoneCacheSettingsApi.md#zoneCacheSettingsDeleteVariantsSetting) | **DELETE** /zones/{zone_id}/cache/variants | Delete variants setting |
| [**zoneCacheSettingsGetCacheReserveClear**](ZoneCacheSettingsApi.md#zoneCacheSettingsGetCacheReserveClear) | **GET** /zones/{zone_id}/cache/cache_reserve_clear | Get Cache Reserve Clear |
| [**zoneCacheSettingsGetCacheReserveSetting**](ZoneCacheSettingsApi.md#zoneCacheSettingsGetCacheReserveSetting) | **GET** /zones/{zone_id}/cache/cache_reserve | Get Cache Reserve setting |
| [**zoneCacheSettingsGetOriginMaxHttpVersionSetting**](ZoneCacheSettingsApi.md#zoneCacheSettingsGetOriginMaxHttpVersionSetting) | **GET** /zones/{zone_id}/settings/origin_max_http_version | Get Origin Max HTTP Version Setting |
| [**zoneCacheSettingsGetRegionalTieredCacheSetting**](ZoneCacheSettingsApi.md#zoneCacheSettingsGetRegionalTieredCacheSetting) | **GET** /zones/{zone_id}/cache/regional_tiered_cache | Get Regional Tiered Cache setting |
| [**zoneCacheSettingsGetVariantsSetting**](ZoneCacheSettingsApi.md#zoneCacheSettingsGetVariantsSetting) | **GET** /zones/{zone_id}/cache/variants | Get variants setting |
| [**zoneCacheSettingsStartCacheReserveClear**](ZoneCacheSettingsApi.md#zoneCacheSettingsStartCacheReserveClear) | **POST** /zones/{zone_id}/cache/cache_reserve_clear | Start Cache Reserve Clear |


<a id="zoneCacheSettingsChangeCacheReserveSetting"></a>
# **zoneCacheSettingsChangeCacheReserveSetting**
> ZoneCacheSettingsGetCacheReserveSetting200Response zoneCacheSettingsChangeCacheReserveSetting(zoneId, zoneCacheSettingsChangeCacheReserveSettingRequest)

Change Cache Reserve setting

Increase cache lifetimes by automatically storing all cacheable files into Cloudflare&#39;s persistent object storage buckets. Requires Cache Reserve subscription. Note: using Tiered Cache with Cache Reserve is highly recommended to reduce Reserve operations costs. See the [developer docs](https://developers.cloudflare.com/cache/about/cache-reserve) for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneCacheSettingsApi apiInstance = new ZoneCacheSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneCacheSettingsChangeCacheReserveSettingRequest zoneCacheSettingsChangeCacheReserveSettingRequest = new ZoneCacheSettingsChangeCacheReserveSettingRequest(); // ZoneCacheSettingsChangeCacheReserveSettingRequest | 
    try {
      ZoneCacheSettingsGetCacheReserveSetting200Response result = apiInstance.zoneCacheSettingsChangeCacheReserveSetting(zoneId, zoneCacheSettingsChangeCacheReserveSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneCacheSettingsApi#zoneCacheSettingsChangeCacheReserveSetting");
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
| **zoneId** | **String**|  | |
| **zoneCacheSettingsChangeCacheReserveSettingRequest** | [**ZoneCacheSettingsChangeCacheReserveSettingRequest**](ZoneCacheSettingsChangeCacheReserveSettingRequest.md)|  | |

### Return type

[**ZoneCacheSettingsGetCacheReserveSetting200Response**](ZoneCacheSettingsGetCacheReserveSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Cache Reserve setting response |  -  |
| **4XX** | Change Cache Reserve setting response failure |  -  |

<a id="zoneCacheSettingsChangeOriginMaxHttpVersionSetting"></a>
# **zoneCacheSettingsChangeOriginMaxHttpVersionSetting**
> ZoneCacheSettingsGetOriginMaxHttpVersionSetting200Response zoneCacheSettingsChangeOriginMaxHttpVersionSetting(zoneId, zoneCacheSettingsChangeOriginMaxHttpVersionSettingRequest)

Change Origin Max HTTP Version Setting

Origin Max HTTP Setting Version sets the highest HTTP version Cloudflare will attempt to use with your origin. This setting allows Cloudflare to make HTTP/2 requests to your origin. (Refer to [Enable HTTP/2 to Origin](https://developers.cloudflare.com/cache/how-to/enable-http2-to-origin/), for more information.). The default value is \&quot;2\&quot; for all plan types except ENT where it is \&quot;1\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneCacheSettingsApi apiInstance = new ZoneCacheSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneCacheSettingsChangeOriginMaxHttpVersionSettingRequest zoneCacheSettingsChangeOriginMaxHttpVersionSettingRequest = new ZoneCacheSettingsChangeOriginMaxHttpVersionSettingRequest(); // ZoneCacheSettingsChangeOriginMaxHttpVersionSettingRequest | 
    try {
      ZoneCacheSettingsGetOriginMaxHttpVersionSetting200Response result = apiInstance.zoneCacheSettingsChangeOriginMaxHttpVersionSetting(zoneId, zoneCacheSettingsChangeOriginMaxHttpVersionSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneCacheSettingsApi#zoneCacheSettingsChangeOriginMaxHttpVersionSetting");
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
| **zoneId** | **String**|  | |
| **zoneCacheSettingsChangeOriginMaxHttpVersionSettingRequest** | [**ZoneCacheSettingsChangeOriginMaxHttpVersionSettingRequest**](ZoneCacheSettingsChangeOriginMaxHttpVersionSettingRequest.md)|  | |

### Return type

[**ZoneCacheSettingsGetOriginMaxHttpVersionSetting200Response**](ZoneCacheSettingsGetOriginMaxHttpVersionSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Origin Max HTTP Version Setting Response |  -  |
| **4XX** | Change Origin Max HTTP Version Response Failure |  -  |

<a id="zoneCacheSettingsChangeRegionalTieredCacheSetting"></a>
# **zoneCacheSettingsChangeRegionalTieredCacheSetting**
> ZoneCacheSettingsGetRegionalTieredCacheSetting200Response zoneCacheSettingsChangeRegionalTieredCacheSetting(zoneId, zoneCacheSettingsChangeRegionalTieredCacheSettingRequest)

Change Regional Tiered Cache setting

Instructs Cloudflare to check a regional hub data center on the way to your upper tier. This can help improve performance for smart and custom tiered cache topologies.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneCacheSettingsApi apiInstance = new ZoneCacheSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneCacheSettingsChangeRegionalTieredCacheSettingRequest zoneCacheSettingsChangeRegionalTieredCacheSettingRequest = new ZoneCacheSettingsChangeRegionalTieredCacheSettingRequest(); // ZoneCacheSettingsChangeRegionalTieredCacheSettingRequest | 
    try {
      ZoneCacheSettingsGetRegionalTieredCacheSetting200Response result = apiInstance.zoneCacheSettingsChangeRegionalTieredCacheSetting(zoneId, zoneCacheSettingsChangeRegionalTieredCacheSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneCacheSettingsApi#zoneCacheSettingsChangeRegionalTieredCacheSetting");
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
| **zoneId** | **String**|  | |
| **zoneCacheSettingsChangeRegionalTieredCacheSettingRequest** | [**ZoneCacheSettingsChangeRegionalTieredCacheSettingRequest**](ZoneCacheSettingsChangeRegionalTieredCacheSettingRequest.md)|  | |

### Return type

[**ZoneCacheSettingsGetRegionalTieredCacheSetting200Response**](ZoneCacheSettingsGetRegionalTieredCacheSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Regional Tiered Cache setting response |  -  |
| **4XX** | Change Regional Tiered Cache setting response failure |  -  |

<a id="zoneCacheSettingsChangeVariantsSetting"></a>
# **zoneCacheSettingsChangeVariantsSetting**
> ZoneCacheSettingsGetVariantsSetting200Response zoneCacheSettingsChangeVariantsSetting(zoneId, zoneCacheSettingsChangeVariantsSettingRequest)

Change variants setting

Variant support enables caching variants of images with certain file extensions in addition to the original. This only applies when the origin server sends the &#39;Vary: Accept&#39; response header. If the origin server sends &#39;Vary: Accept&#39; but does not serve the variant requested, the response will not be cached. This will be indicated with BYPASS cache status in the response headers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneCacheSettingsApi apiInstance = new ZoneCacheSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZoneCacheSettingsChangeVariantsSettingRequest zoneCacheSettingsChangeVariantsSettingRequest = new ZoneCacheSettingsChangeVariantsSettingRequest(); // ZoneCacheSettingsChangeVariantsSettingRequest | 
    try {
      ZoneCacheSettingsGetVariantsSetting200Response result = apiInstance.zoneCacheSettingsChangeVariantsSetting(zoneId, zoneCacheSettingsChangeVariantsSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneCacheSettingsApi#zoneCacheSettingsChangeVariantsSetting");
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
| **zoneId** | **String**|  | |
| **zoneCacheSettingsChangeVariantsSettingRequest** | [**ZoneCacheSettingsChangeVariantsSettingRequest**](ZoneCacheSettingsChangeVariantsSettingRequest.md)|  | |

### Return type

[**ZoneCacheSettingsGetVariantsSetting200Response**](ZoneCacheSettingsGetVariantsSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change variants setting response |  -  |
| **4XX** | Change variants setting response failure |  -  |

<a id="zoneCacheSettingsDeleteVariantsSetting"></a>
# **zoneCacheSettingsDeleteVariantsSetting**
> ZoneCacheSettingsDeleteVariantsSetting200Response zoneCacheSettingsDeleteVariantsSetting(zoneId)

Delete variants setting

Variant support enables caching variants of images with certain file extensions in addition to the original. This only applies when the origin server sends the &#39;Vary: Accept&#39; response header. If the origin server sends &#39;Vary: Accept&#39; but does not serve the variant requested, the response will not be cached. This will be indicated with BYPASS cache status in the response headers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneCacheSettingsApi apiInstance = new ZoneCacheSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneCacheSettingsDeleteVariantsSetting200Response result = apiInstance.zoneCacheSettingsDeleteVariantsSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneCacheSettingsApi#zoneCacheSettingsDeleteVariantsSetting");
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
| **zoneId** | **String**|  | |

### Return type

[**ZoneCacheSettingsDeleteVariantsSetting200Response**](ZoneCacheSettingsDeleteVariantsSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete variants setting response |  -  |
| **4XX** | Delete variants setting response failure |  -  |

<a id="zoneCacheSettingsGetCacheReserveClear"></a>
# **zoneCacheSettingsGetCacheReserveClear**
> ZoneCacheSettingsGetCacheReserveClear200Response zoneCacheSettingsGetCacheReserveClear(zoneId)

Get Cache Reserve Clear

You can use Cache Reserve Clear to clear your Cache Reserve, but you must first disable Cache Reserve. In most cases, this will be accomplished within 24 hours. You cannot re-enable Cache Reserve while this process is ongoing. Keep in mind that you cannot undo or cancel this operation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneCacheSettingsApi apiInstance = new ZoneCacheSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneCacheSettingsGetCacheReserveClear200Response result = apiInstance.zoneCacheSettingsGetCacheReserveClear(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneCacheSettingsApi#zoneCacheSettingsGetCacheReserveClear");
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
| **zoneId** | **String**|  | |

### Return type

[**ZoneCacheSettingsGetCacheReserveClear200Response**](ZoneCacheSettingsGetCacheReserveClear200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Cache Reserve Clear response |  -  |
| **4XX** | Get Cache Reserve Clear failure response |  -  |

<a id="zoneCacheSettingsGetCacheReserveSetting"></a>
# **zoneCacheSettingsGetCacheReserveSetting**
> ZoneCacheSettingsGetCacheReserveSetting200Response zoneCacheSettingsGetCacheReserveSetting(zoneId)

Get Cache Reserve setting

Increase cache lifetimes by automatically storing all cacheable files into Cloudflare&#39;s persistent object storage buckets. Requires Cache Reserve subscription. Note: using Tiered Cache with Cache Reserve is highly recommended to reduce Reserve operations costs. See the [developer docs](https://developers.cloudflare.com/cache/about/cache-reserve) for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneCacheSettingsApi apiInstance = new ZoneCacheSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneCacheSettingsGetCacheReserveSetting200Response result = apiInstance.zoneCacheSettingsGetCacheReserveSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneCacheSettingsApi#zoneCacheSettingsGetCacheReserveSetting");
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
| **zoneId** | **String**|  | |

### Return type

[**ZoneCacheSettingsGetCacheReserveSetting200Response**](ZoneCacheSettingsGetCacheReserveSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Cache Reserve setting response |  -  |
| **4XX** | Get Cache Reserve setting response failure |  -  |

<a id="zoneCacheSettingsGetOriginMaxHttpVersionSetting"></a>
# **zoneCacheSettingsGetOriginMaxHttpVersionSetting**
> ZoneCacheSettingsGetOriginMaxHttpVersionSetting200Response zoneCacheSettingsGetOriginMaxHttpVersionSetting(zoneId)

Get Origin Max HTTP Version Setting

Origin Max HTTP Setting Version sets the highest HTTP version Cloudflare will attempt to use with your origin. This setting allows Cloudflare to make HTTP/2 requests to your origin. (Refer to [Enable HTTP/2 to Origin](https://developers.cloudflare.com/cache/how-to/enable-http2-to-origin/), for more information.). The default value is \&quot;2\&quot; for all plan types except ENT where it is \&quot;1\&quot;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneCacheSettingsApi apiInstance = new ZoneCacheSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneCacheSettingsGetOriginMaxHttpVersionSetting200Response result = apiInstance.zoneCacheSettingsGetOriginMaxHttpVersionSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneCacheSettingsApi#zoneCacheSettingsGetOriginMaxHttpVersionSetting");
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
| **zoneId** | **String**|  | |

### Return type

[**ZoneCacheSettingsGetOriginMaxHttpVersionSetting200Response**](ZoneCacheSettingsGetOriginMaxHttpVersionSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Origin Max HTTP Version Setting Response |  -  |
| **4XX** | Get Origin Max HTTP Version Setting Response Failure |  -  |

<a id="zoneCacheSettingsGetRegionalTieredCacheSetting"></a>
# **zoneCacheSettingsGetRegionalTieredCacheSetting**
> ZoneCacheSettingsGetRegionalTieredCacheSetting200Response zoneCacheSettingsGetRegionalTieredCacheSetting(zoneId)

Get Regional Tiered Cache setting

Instructs Cloudflare to check a regional hub data center on the way to your upper tier. This can help improve performance for smart and custom tiered cache topologies.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneCacheSettingsApi apiInstance = new ZoneCacheSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneCacheSettingsGetRegionalTieredCacheSetting200Response result = apiInstance.zoneCacheSettingsGetRegionalTieredCacheSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneCacheSettingsApi#zoneCacheSettingsGetRegionalTieredCacheSetting");
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
| **zoneId** | **String**|  | |

### Return type

[**ZoneCacheSettingsGetRegionalTieredCacheSetting200Response**](ZoneCacheSettingsGetRegionalTieredCacheSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Regional Tiered Cache setting response |  -  |
| **4XX** | Get Regional Tiered Cache setting response failure |  -  |

<a id="zoneCacheSettingsGetVariantsSetting"></a>
# **zoneCacheSettingsGetVariantsSetting**
> ZoneCacheSettingsGetVariantsSetting200Response zoneCacheSettingsGetVariantsSetting(zoneId)

Get variants setting

Variant support enables caching variants of images with certain file extensions in addition to the original. This only applies when the origin server sends the &#39;Vary: Accept&#39; response header. If the origin server sends &#39;Vary: Accept&#39; but does not serve the variant requested, the response will not be cached. This will be indicated with BYPASS cache status in the response headers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneCacheSettingsApi apiInstance = new ZoneCacheSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneCacheSettingsGetVariantsSetting200Response result = apiInstance.zoneCacheSettingsGetVariantsSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneCacheSettingsApi#zoneCacheSettingsGetVariantsSetting");
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
| **zoneId** | **String**|  | |

### Return type

[**ZoneCacheSettingsGetVariantsSetting200Response**](ZoneCacheSettingsGetVariantsSetting200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get variants setting response |  -  |
| **4XX** | Get variants setting response failure |  -  |

<a id="zoneCacheSettingsStartCacheReserveClear"></a>
# **zoneCacheSettingsStartCacheReserveClear**
> ZoneCacheSettingsGetCacheReserveClear200Response zoneCacheSettingsStartCacheReserveClear(zoneId)

Start Cache Reserve Clear

You can use Cache Reserve Clear to clear your Cache Reserve, but you must first disable Cache Reserve. In most cases, this will be accomplished within 24 hours. You cannot re-enable Cache Reserve while this process is ongoing. Keep in mind that you cannot undo or cancel this operation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneCacheSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    ZoneCacheSettingsApi apiInstance = new ZoneCacheSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZoneCacheSettingsGetCacheReserveClear200Response result = apiInstance.zoneCacheSettingsStartCacheReserveClear(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneCacheSettingsApi#zoneCacheSettingsStartCacheReserveClear");
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
| **zoneId** | **String**|  | |

### Return type

[**ZoneCacheSettingsGetCacheReserveClear200Response**](ZoneCacheSettingsGetCacheReserveClear200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Start Cache Reserve Clear response |  -  |
| **4XX** | Start Cache Reserve Clear failure response |  -  |

