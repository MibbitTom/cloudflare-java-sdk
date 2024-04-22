# ZoneLockdownApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneLockdownCreateAZoneLockdownRule**](ZoneLockdownApi.md#zoneLockdownCreateAZoneLockdownRule) | **POST** /zones/{zone_identifier}/firewall/lockdowns | Create a Zone Lockdown rule |
| [**zoneLockdownDeleteAZoneLockdownRule**](ZoneLockdownApi.md#zoneLockdownDeleteAZoneLockdownRule) | **DELETE** /zones/{zone_identifier}/firewall/lockdowns/{id} | Delete a Zone Lockdown rule |
| [**zoneLockdownGetAZoneLockdownRule**](ZoneLockdownApi.md#zoneLockdownGetAZoneLockdownRule) | **GET** /zones/{zone_identifier}/firewall/lockdowns/{id} | Get a Zone Lockdown rule |
| [**zoneLockdownListZoneLockdownRules**](ZoneLockdownApi.md#zoneLockdownListZoneLockdownRules) | **GET** /zones/{zone_identifier}/firewall/lockdowns | List Zone Lockdown rules |
| [**zoneLockdownUpdateAZoneLockdownRule**](ZoneLockdownApi.md#zoneLockdownUpdateAZoneLockdownRule) | **PUT** /zones/{zone_identifier}/firewall/lockdowns/{id} | Update a Zone Lockdown rule |


<a id="zoneLockdownCreateAZoneLockdownRule"></a>
# **zoneLockdownCreateAZoneLockdownRule**
> FirewallZonelockdownResponseSingle zoneLockdownCreateAZoneLockdownRule(zoneIdentifier, body)

Create a Zone Lockdown rule

Creates a new Zone Lockdown rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneLockdownApi;

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

    ZoneLockdownApi apiInstance = new ZoneLockdownApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Object body = null; // Object | 
    try {
      FirewallZonelockdownResponseSingle result = apiInstance.zoneLockdownCreateAZoneLockdownRule(zoneIdentifier, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLockdownApi#zoneLockdownCreateAZoneLockdownRule");
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
| **zoneIdentifier** | **String**|  | |
| **body** | **Object**|  | |

### Return type

[**FirewallZonelockdownResponseSingle**](FirewallZonelockdownResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a Zone Lockdown rule response |  -  |
| **4XX** | Create a Zone Lockdown rule response failure |  -  |

<a id="zoneLockdownDeleteAZoneLockdownRule"></a>
# **zoneLockdownDeleteAZoneLockdownRule**
> ZoneLockdownDeleteAZoneLockdownRule200Response zoneLockdownDeleteAZoneLockdownRule(id, zoneIdentifier)

Delete a Zone Lockdown rule

Deletes an existing Zone Lockdown rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneLockdownApi;

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

    ZoneLockdownApi apiInstance = new ZoneLockdownApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      ZoneLockdownDeleteAZoneLockdownRule200Response result = apiInstance.zoneLockdownDeleteAZoneLockdownRule(id, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLockdownApi#zoneLockdownDeleteAZoneLockdownRule");
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
| **id** | **String**|  | |
| **zoneIdentifier** | **String**|  | |

### Return type

[**ZoneLockdownDeleteAZoneLockdownRule200Response**](ZoneLockdownDeleteAZoneLockdownRule200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a Zone Lockdown rule response |  -  |
| **4XX** | Delete a Zone Lockdown rule response failure |  -  |

<a id="zoneLockdownGetAZoneLockdownRule"></a>
# **zoneLockdownGetAZoneLockdownRule**
> FirewallZonelockdownResponseSingle zoneLockdownGetAZoneLockdownRule(id, zoneIdentifier)

Get a Zone Lockdown rule

Fetches the details of a Zone Lockdown rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneLockdownApi;

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

    ZoneLockdownApi apiInstance = new ZoneLockdownApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      FirewallZonelockdownResponseSingle result = apiInstance.zoneLockdownGetAZoneLockdownRule(id, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLockdownApi#zoneLockdownGetAZoneLockdownRule");
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
| **id** | **String**|  | |
| **zoneIdentifier** | **String**|  | |

### Return type

[**FirewallZonelockdownResponseSingle**](FirewallZonelockdownResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a Zone Lockdown rule response |  -  |
| **4XX** | Get a Zone Lockdown rule response failure |  -  |

<a id="zoneLockdownListZoneLockdownRules"></a>
# **zoneLockdownListZoneLockdownRules**
> FirewallZonelockdownResponseCollection zoneLockdownListZoneLockdownRules(zoneIdentifier, page, description, modifiedOn, ip, priority, uriSearch, ipRangeSearch, perPage, createdOn, descriptionSearch, ipSearch)

List Zone Lockdown rules

Fetches Zone Lockdown rules. You can filter the results using several optional parameters.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneLockdownApi;

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

    ZoneLockdownApi apiInstance = new ZoneLockdownApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    String description = "description_example"; // String | 
    OffsetDateTime modifiedOn = OffsetDateTime.now(); // OffsetDateTime | 
    String ip = "ip_example"; // String | 
    BigDecimal priority = new BigDecimal(78); // BigDecimal | 
    String uriSearch = "uriSearch_example"; // String | 
    String ipRangeSearch = "ipRangeSearch_example"; // String | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    OffsetDateTime createdOn = OffsetDateTime.parse("2014-01-01T05:20:00.123450Z"); // OffsetDateTime | 
    String descriptionSearch = "endpoints"; // String | 
    String ipSearch = "1.2.3.4"; // String | 
    try {
      FirewallZonelockdownResponseCollection result = apiInstance.zoneLockdownListZoneLockdownRules(zoneIdentifier, page, description, modifiedOn, ip, priority, uriSearch, ipRangeSearch, perPage, createdOn, descriptionSearch, ipSearch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLockdownApi#zoneLockdownListZoneLockdownRules");
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
| **zoneIdentifier** | **String**|  | |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **description** | **String**|  | [optional] |
| **modifiedOn** | **OffsetDateTime**|  | [optional] |
| **ip** | **String**|  | [optional] |
| **priority** | **BigDecimal**|  | [optional] |
| **uriSearch** | **String**|  | [optional] |
| **ipRangeSearch** | **String**|  | [optional] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |
| **createdOn** | **OffsetDateTime**|  | [optional] |
| **descriptionSearch** | **String**|  | [optional] |
| **ipSearch** | **String**|  | [optional] |

### Return type

[**FirewallZonelockdownResponseCollection**](FirewallZonelockdownResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Zone Lockdown rules response |  -  |
| **4XX** | List Zone Lockdown rules response failure |  -  |

<a id="zoneLockdownUpdateAZoneLockdownRule"></a>
# **zoneLockdownUpdateAZoneLockdownRule**
> FirewallZonelockdownResponseSingle zoneLockdownUpdateAZoneLockdownRule(id, zoneIdentifier, body)

Update a Zone Lockdown rule

Updates an existing Zone Lockdown rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZoneLockdownApi;

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

    ZoneLockdownApi apiInstance = new ZoneLockdownApi(defaultClient);
    String id = "id_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    Object body = null; // Object | 
    try {
      FirewallZonelockdownResponseSingle result = apiInstance.zoneLockdownUpdateAZoneLockdownRule(id, zoneIdentifier, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLockdownApi#zoneLockdownUpdateAZoneLockdownRule");
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
| **id** | **String**|  | |
| **zoneIdentifier** | **String**|  | |
| **body** | **Object**|  | |

### Return type

[**FirewallZonelockdownResponseSingle**](FirewallZonelockdownResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a Zone Lockdown rule response |  -  |
| **4XX** | Update a Zone Lockdown rule response failure |  -  |

