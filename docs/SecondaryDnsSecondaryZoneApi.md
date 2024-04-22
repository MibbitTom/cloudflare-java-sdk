# SecondaryDnsSecondaryZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration**](SecondaryDnsSecondaryZoneApi.md#secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration) | **POST** /zones/{zone_id}/secondary_dns/incoming | Create Secondary Zone Configuration |
| [**secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration**](SecondaryDnsSecondaryZoneApi.md#secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration) | **DELETE** /zones/{zone_id}/secondary_dns/incoming | Delete Secondary Zone Configuration |
| [**secondaryDnsSecondaryZoneForceAxfr**](SecondaryDnsSecondaryZoneApi.md#secondaryDnsSecondaryZoneForceAxfr) | **POST** /zones/{zone_id}/secondary_dns/force_axfr | Force AXFR |
| [**secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails**](SecondaryDnsSecondaryZoneApi.md#secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails) | **GET** /zones/{zone_id}/secondary_dns/incoming | Secondary Zone Configuration Details |
| [**secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration**](SecondaryDnsSecondaryZoneApi.md#secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration) | **PUT** /zones/{zone_id}/secondary_dns/incoming | Update Secondary Zone Configuration |


<a id="secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration"></a>
# **secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration**
> SecondaryDnsSingleResponseIncoming secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration(zoneId, secondaryDnsDnsSecondarySecondaryZone)

Create Secondary Zone Configuration

Create secondary zone configuration for incoming zone transfers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsSecondaryZoneApi;

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

    SecondaryDnsSecondaryZoneApi apiInstance = new SecondaryDnsSecondaryZoneApi(defaultClient);
    Object zoneId = null; // Object | 
    SecondaryDnsDnsSecondarySecondaryZone secondaryDnsDnsSecondarySecondaryZone = new SecondaryDnsDnsSecondarySecondaryZone(); // SecondaryDnsDnsSecondarySecondaryZone | 
    try {
      SecondaryDnsSingleResponseIncoming result = apiInstance.secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration(zoneId, secondaryDnsDnsSecondarySecondaryZone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsSecondaryZoneApi#secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration");
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
| **zoneId** | [**Object**](.md)|  | |
| **secondaryDnsDnsSecondarySecondaryZone** | [**SecondaryDnsDnsSecondarySecondaryZone**](SecondaryDnsDnsSecondarySecondaryZone.md)|  | |

### Return type

[**SecondaryDnsSingleResponseIncoming**](SecondaryDnsSingleResponseIncoming.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Secondary Zone Configuration response |  -  |
| **4XX** | Create Secondary Zone Configuration response failure |  -  |

<a id="secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration"></a>
# **secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration**
> SecondaryDnsIdResponse secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration(zoneId)

Delete Secondary Zone Configuration

Delete secondary zone configuration for incoming zone transfers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsSecondaryZoneApi;

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

    SecondaryDnsSecondaryZoneApi apiInstance = new SecondaryDnsSecondaryZoneApi(defaultClient);
    Object zoneId = null; // Object | 
    try {
      SecondaryDnsIdResponse result = apiInstance.secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsSecondaryZoneApi#secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration");
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
| **zoneId** | [**Object**](.md)|  | |

### Return type

[**SecondaryDnsIdResponse**](SecondaryDnsIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Secondary Zone Configuration response |  -  |
| **4XX** | Delete Secondary Zone Configuration response failure |  -  |

<a id="secondaryDnsSecondaryZoneForceAxfr"></a>
# **secondaryDnsSecondaryZoneForceAxfr**
> SecondaryDnsForceResponse secondaryDnsSecondaryZoneForceAxfr(zoneId)

Force AXFR

Sends AXFR zone transfer request to primary nameserver(s).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsSecondaryZoneApi;

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

    SecondaryDnsSecondaryZoneApi apiInstance = new SecondaryDnsSecondaryZoneApi(defaultClient);
    Object zoneId = null; // Object | 
    try {
      SecondaryDnsForceResponse result = apiInstance.secondaryDnsSecondaryZoneForceAxfr(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsSecondaryZoneApi#secondaryDnsSecondaryZoneForceAxfr");
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
| **zoneId** | [**Object**](.md)|  | |

### Return type

[**SecondaryDnsForceResponse**](SecondaryDnsForceResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Force AXFR response |  -  |
| **4XX** | Force AXFR response failure |  -  |

<a id="secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails"></a>
# **secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails**
> SecondaryDnsSingleResponseIncoming secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails(zoneId)

Secondary Zone Configuration Details

Get secondary zone configuration for incoming zone transfers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsSecondaryZoneApi;

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

    SecondaryDnsSecondaryZoneApi apiInstance = new SecondaryDnsSecondaryZoneApi(defaultClient);
    Object zoneId = null; // Object | 
    try {
      SecondaryDnsSingleResponseIncoming result = apiInstance.secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsSecondaryZoneApi#secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails");
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
| **zoneId** | [**Object**](.md)|  | |

### Return type

[**SecondaryDnsSingleResponseIncoming**](SecondaryDnsSingleResponseIncoming.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Secondary Zone Configuration Details response |  -  |
| **4XX** | Secondary Zone Configuration Details response failure |  -  |

<a id="secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration"></a>
# **secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration**
> SecondaryDnsSingleResponseIncoming secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration(zoneId, secondaryDnsDnsSecondarySecondaryZone)

Update Secondary Zone Configuration

Update secondary zone configuration for incoming zone transfers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsSecondaryZoneApi;

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

    SecondaryDnsSecondaryZoneApi apiInstance = new SecondaryDnsSecondaryZoneApi(defaultClient);
    Object zoneId = null; // Object | 
    SecondaryDnsDnsSecondarySecondaryZone secondaryDnsDnsSecondarySecondaryZone = new SecondaryDnsDnsSecondarySecondaryZone(); // SecondaryDnsDnsSecondarySecondaryZone | 
    try {
      SecondaryDnsSingleResponseIncoming result = apiInstance.secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration(zoneId, secondaryDnsDnsSecondarySecondaryZone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsSecondaryZoneApi#secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration");
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
| **zoneId** | [**Object**](.md)|  | |
| **secondaryDnsDnsSecondarySecondaryZone** | [**SecondaryDnsDnsSecondarySecondaryZone**](SecondaryDnsDnsSecondarySecondaryZone.md)|  | |

### Return type

[**SecondaryDnsSingleResponseIncoming**](SecondaryDnsSingleResponseIncoming.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Secondary Zone Configuration response |  -  |
| **4XX** | Update Secondary Zone Configuration response failure |  -  |

