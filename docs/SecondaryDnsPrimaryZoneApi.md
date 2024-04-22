# SecondaryDnsPrimaryZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**secondaryDnsPrimaryZoneCreatePrimaryZoneConfiguration**](SecondaryDnsPrimaryZoneApi.md#secondaryDnsPrimaryZoneCreatePrimaryZoneConfiguration) | **POST** /zones/{zone_id}/secondary_dns/outgoing | Create Primary Zone Configuration |
| [**secondaryDnsPrimaryZoneDeletePrimaryZoneConfiguration**](SecondaryDnsPrimaryZoneApi.md#secondaryDnsPrimaryZoneDeletePrimaryZoneConfiguration) | **DELETE** /zones/{zone_id}/secondary_dns/outgoing | Delete Primary Zone Configuration |
| [**secondaryDnsPrimaryZoneDisableOutgoingZoneTransfers**](SecondaryDnsPrimaryZoneApi.md#secondaryDnsPrimaryZoneDisableOutgoingZoneTransfers) | **POST** /zones/{zone_id}/secondary_dns/outgoing/disable | Disable Outgoing Zone Transfers |
| [**secondaryDnsPrimaryZoneEnableOutgoingZoneTransfers**](SecondaryDnsPrimaryZoneApi.md#secondaryDnsPrimaryZoneEnableOutgoingZoneTransfers) | **POST** /zones/{zone_id}/secondary_dns/outgoing/enable | Enable Outgoing Zone Transfers |
| [**secondaryDnsPrimaryZoneForceDnsNotify**](SecondaryDnsPrimaryZoneApi.md#secondaryDnsPrimaryZoneForceDnsNotify) | **POST** /zones/{zone_id}/secondary_dns/outgoing/force_notify | Force DNS NOTIFY |
| [**secondaryDnsPrimaryZoneGetOutgoingZoneTransferStatus**](SecondaryDnsPrimaryZoneApi.md#secondaryDnsPrimaryZoneGetOutgoingZoneTransferStatus) | **GET** /zones/{zone_id}/secondary_dns/outgoing/status | Get Outgoing Zone Transfer Status |
| [**secondaryDnsPrimaryZonePrimaryZoneConfigurationDetails**](SecondaryDnsPrimaryZoneApi.md#secondaryDnsPrimaryZonePrimaryZoneConfigurationDetails) | **GET** /zones/{zone_id}/secondary_dns/outgoing | Primary Zone Configuration Details |
| [**secondaryDnsPrimaryZoneUpdatePrimaryZoneConfiguration**](SecondaryDnsPrimaryZoneApi.md#secondaryDnsPrimaryZoneUpdatePrimaryZoneConfiguration) | **PUT** /zones/{zone_id}/secondary_dns/outgoing | Update Primary Zone Configuration |


<a id="secondaryDnsPrimaryZoneCreatePrimaryZoneConfiguration"></a>
# **secondaryDnsPrimaryZoneCreatePrimaryZoneConfiguration**
> SecondaryDnsSingleResponseOutgoing secondaryDnsPrimaryZoneCreatePrimaryZoneConfiguration(zoneId, secondaryDnsSingleRequestOutgoing)

Create Primary Zone Configuration

Create primary zone configuration for outgoing zone transfers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsPrimaryZoneApi;

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

    SecondaryDnsPrimaryZoneApi apiInstance = new SecondaryDnsPrimaryZoneApi(defaultClient);
    Object zoneId = null; // Object | 
    SecondaryDnsSingleRequestOutgoing secondaryDnsSingleRequestOutgoing = new SecondaryDnsSingleRequestOutgoing(); // SecondaryDnsSingleRequestOutgoing | 
    try {
      SecondaryDnsSingleResponseOutgoing result = apiInstance.secondaryDnsPrimaryZoneCreatePrimaryZoneConfiguration(zoneId, secondaryDnsSingleRequestOutgoing);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsPrimaryZoneApi#secondaryDnsPrimaryZoneCreatePrimaryZoneConfiguration");
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
| **secondaryDnsSingleRequestOutgoing** | [**SecondaryDnsSingleRequestOutgoing**](SecondaryDnsSingleRequestOutgoing.md)|  | |

### Return type

[**SecondaryDnsSingleResponseOutgoing**](SecondaryDnsSingleResponseOutgoing.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Primary Zone Configuration response |  -  |
| **4XX** | Create Primary Zone Configuration response failure |  -  |

<a id="secondaryDnsPrimaryZoneDeletePrimaryZoneConfiguration"></a>
# **secondaryDnsPrimaryZoneDeletePrimaryZoneConfiguration**
> SecondaryDnsIdResponse secondaryDnsPrimaryZoneDeletePrimaryZoneConfiguration(zoneId)

Delete Primary Zone Configuration

Delete primary zone configuration for outgoing zone transfers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsPrimaryZoneApi;

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

    SecondaryDnsPrimaryZoneApi apiInstance = new SecondaryDnsPrimaryZoneApi(defaultClient);
    Object zoneId = null; // Object | 
    try {
      SecondaryDnsIdResponse result = apiInstance.secondaryDnsPrimaryZoneDeletePrimaryZoneConfiguration(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsPrimaryZoneApi#secondaryDnsPrimaryZoneDeletePrimaryZoneConfiguration");
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
| **200** | Delete Primary Zone Configuration response |  -  |
| **4XX** | Delete Primary Zone Configuration response failure |  -  |

<a id="secondaryDnsPrimaryZoneDisableOutgoingZoneTransfers"></a>
# **secondaryDnsPrimaryZoneDisableOutgoingZoneTransfers**
> SecondaryDnsDisableTransferResponse secondaryDnsPrimaryZoneDisableOutgoingZoneTransfers(zoneId)

Disable Outgoing Zone Transfers

Disable outgoing zone transfers for primary zone and clears IXFR backlog of primary zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsPrimaryZoneApi;

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

    SecondaryDnsPrimaryZoneApi apiInstance = new SecondaryDnsPrimaryZoneApi(defaultClient);
    Object zoneId = null; // Object | 
    try {
      SecondaryDnsDisableTransferResponse result = apiInstance.secondaryDnsPrimaryZoneDisableOutgoingZoneTransfers(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsPrimaryZoneApi#secondaryDnsPrimaryZoneDisableOutgoingZoneTransfers");
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

[**SecondaryDnsDisableTransferResponse**](SecondaryDnsDisableTransferResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Disable Outgoing Zone Transfers response |  -  |
| **4XX** | Disable Outgoing Zone Transfers response failure |  -  |

<a id="secondaryDnsPrimaryZoneEnableOutgoingZoneTransfers"></a>
# **secondaryDnsPrimaryZoneEnableOutgoingZoneTransfers**
> SecondaryDnsEnableTransferResponse secondaryDnsPrimaryZoneEnableOutgoingZoneTransfers(zoneId)

Enable Outgoing Zone Transfers

Enable outgoing zone transfers for primary zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsPrimaryZoneApi;

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

    SecondaryDnsPrimaryZoneApi apiInstance = new SecondaryDnsPrimaryZoneApi(defaultClient);
    Object zoneId = null; // Object | 
    try {
      SecondaryDnsEnableTransferResponse result = apiInstance.secondaryDnsPrimaryZoneEnableOutgoingZoneTransfers(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsPrimaryZoneApi#secondaryDnsPrimaryZoneEnableOutgoingZoneTransfers");
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

[**SecondaryDnsEnableTransferResponse**](SecondaryDnsEnableTransferResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Enable Outgoing Zone Transfers response |  -  |
| **4XX** | Enable Outgoing Zone Transfers response failure |  -  |

<a id="secondaryDnsPrimaryZoneForceDnsNotify"></a>
# **secondaryDnsPrimaryZoneForceDnsNotify**
> SecondaryDnsSchemasForceResponse secondaryDnsPrimaryZoneForceDnsNotify(zoneId)

Force DNS NOTIFY

Notifies the secondary nameserver(s) and clears IXFR backlog of primary zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsPrimaryZoneApi;

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

    SecondaryDnsPrimaryZoneApi apiInstance = new SecondaryDnsPrimaryZoneApi(defaultClient);
    Object zoneId = null; // Object | 
    try {
      SecondaryDnsSchemasForceResponse result = apiInstance.secondaryDnsPrimaryZoneForceDnsNotify(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsPrimaryZoneApi#secondaryDnsPrimaryZoneForceDnsNotify");
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

[**SecondaryDnsSchemasForceResponse**](SecondaryDnsSchemasForceResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Force DNS NOTIFY response |  -  |
| **4XX** | Force DNS NOTIFY response failure |  -  |

<a id="secondaryDnsPrimaryZoneGetOutgoingZoneTransferStatus"></a>
# **secondaryDnsPrimaryZoneGetOutgoingZoneTransferStatus**
> SecondaryDnsEnableTransferResponse secondaryDnsPrimaryZoneGetOutgoingZoneTransferStatus(zoneId)

Get Outgoing Zone Transfer Status

Get primary zone transfer status.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsPrimaryZoneApi;

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

    SecondaryDnsPrimaryZoneApi apiInstance = new SecondaryDnsPrimaryZoneApi(defaultClient);
    Object zoneId = null; // Object | 
    try {
      SecondaryDnsEnableTransferResponse result = apiInstance.secondaryDnsPrimaryZoneGetOutgoingZoneTransferStatus(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsPrimaryZoneApi#secondaryDnsPrimaryZoneGetOutgoingZoneTransferStatus");
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

[**SecondaryDnsEnableTransferResponse**](SecondaryDnsEnableTransferResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Outgoing Zone Transfer Status response |  -  |
| **4XX** | Get Outgoing Zone Transfer Status response failure |  -  |

<a id="secondaryDnsPrimaryZonePrimaryZoneConfigurationDetails"></a>
# **secondaryDnsPrimaryZonePrimaryZoneConfigurationDetails**
> SecondaryDnsSingleResponseOutgoing secondaryDnsPrimaryZonePrimaryZoneConfigurationDetails(zoneId)

Primary Zone Configuration Details

Get primary zone configuration for outgoing zone transfers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsPrimaryZoneApi;

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

    SecondaryDnsPrimaryZoneApi apiInstance = new SecondaryDnsPrimaryZoneApi(defaultClient);
    Object zoneId = null; // Object | 
    try {
      SecondaryDnsSingleResponseOutgoing result = apiInstance.secondaryDnsPrimaryZonePrimaryZoneConfigurationDetails(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsPrimaryZoneApi#secondaryDnsPrimaryZonePrimaryZoneConfigurationDetails");
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

[**SecondaryDnsSingleResponseOutgoing**](SecondaryDnsSingleResponseOutgoing.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Primary Zone Configuration Details response |  -  |
| **4XX** | Primary Zone Configuration Details response failure |  -  |

<a id="secondaryDnsPrimaryZoneUpdatePrimaryZoneConfiguration"></a>
# **secondaryDnsPrimaryZoneUpdatePrimaryZoneConfiguration**
> SecondaryDnsSingleResponseOutgoing secondaryDnsPrimaryZoneUpdatePrimaryZoneConfiguration(zoneId, secondaryDnsSingleRequestOutgoing)

Update Primary Zone Configuration

Update primary zone configuration for outgoing zone transfers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecondaryDnsPrimaryZoneApi;

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

    SecondaryDnsPrimaryZoneApi apiInstance = new SecondaryDnsPrimaryZoneApi(defaultClient);
    Object zoneId = null; // Object | 
    SecondaryDnsSingleRequestOutgoing secondaryDnsSingleRequestOutgoing = new SecondaryDnsSingleRequestOutgoing(); // SecondaryDnsSingleRequestOutgoing | 
    try {
      SecondaryDnsSingleResponseOutgoing result = apiInstance.secondaryDnsPrimaryZoneUpdatePrimaryZoneConfiguration(zoneId, secondaryDnsSingleRequestOutgoing);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsPrimaryZoneApi#secondaryDnsPrimaryZoneUpdatePrimaryZoneConfiguration");
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
| **secondaryDnsSingleRequestOutgoing** | [**SecondaryDnsSingleRequestOutgoing**](SecondaryDnsSingleRequestOutgoing.md)|  | |

### Return type

[**SecondaryDnsSingleResponseOutgoing**](SecondaryDnsSingleResponseOutgoing.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Primary Zone Configuration response |  -  |
| **4XX** | Update Primary Zone Configuration response failure |  -  |

