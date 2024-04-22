# AccountLevelCustomNameserversUsageForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountLevelCustomNameserversUsageForAZoneGetAccountCustomNameserverRelatedZoneMetadata**](AccountLevelCustomNameserversUsageForAZoneApi.md#accountLevelCustomNameserversUsageForAZoneGetAccountCustomNameserverRelatedZoneMetadata) | **GET** /zones/{zone_id}/custom_ns | Get Account Custom Nameserver Related Zone Metadata |
| [**accountLevelCustomNameserversUsageForAZoneSetAccountCustomNameserverRelatedZoneMetadata**](AccountLevelCustomNameserversUsageForAZoneApi.md#accountLevelCustomNameserversUsageForAZoneSetAccountCustomNameserverRelatedZoneMetadata) | **PUT** /zones/{zone_id}/custom_ns | Set Account Custom Nameserver Related Zone Metadata |


<a id="accountLevelCustomNameserversUsageForAZoneGetAccountCustomNameserverRelatedZoneMetadata"></a>
# **accountLevelCustomNameserversUsageForAZoneGetAccountCustomNameserverRelatedZoneMetadata**
> DnsCustomNameserversGetResponse accountLevelCustomNameserversUsageForAZoneGetAccountCustomNameserverRelatedZoneMetadata(zoneId)

Get Account Custom Nameserver Related Zone Metadata

Get metadata for account-level custom nameservers on a zone. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountLevelCustomNameserversUsageForAZoneApi;

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

    AccountLevelCustomNameserversUsageForAZoneApi apiInstance = new AccountLevelCustomNameserversUsageForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      DnsCustomNameserversGetResponse result = apiInstance.accountLevelCustomNameserversUsageForAZoneGetAccountCustomNameserverRelatedZoneMetadata(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLevelCustomNameserversUsageForAZoneApi#accountLevelCustomNameserversUsageForAZoneGetAccountCustomNameserverRelatedZoneMetadata");
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

[**DnsCustomNameserversGetResponse**](DnsCustomNameserversGetResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Account Custom Nameserver Related Zone Metadata response |  -  |
| **4XX** | Get Account Custom Nameserver Related Zone Metadata response failure |  -  |

<a id="accountLevelCustomNameserversUsageForAZoneSetAccountCustomNameserverRelatedZoneMetadata"></a>
# **accountLevelCustomNameserversUsageForAZoneSetAccountCustomNameserverRelatedZoneMetadata**
> DnsCustomNameserversSchemasEmptyResponse accountLevelCustomNameserversUsageForAZoneSetAccountCustomNameserverRelatedZoneMetadata(zoneId, dnsCustomNameserversZoneMetadata)

Set Account Custom Nameserver Related Zone Metadata

Set metadata for account-level custom nameservers on a zone.  If you would like new zones in the account to use account custom nameservers by default, use PUT /accounts/:identifier to set the account setting use_account_custom_ns_by_default to true. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountLevelCustomNameserversUsageForAZoneApi;

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

    AccountLevelCustomNameserversUsageForAZoneApi apiInstance = new AccountLevelCustomNameserversUsageForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    DnsCustomNameserversZoneMetadata dnsCustomNameserversZoneMetadata = new DnsCustomNameserversZoneMetadata(); // DnsCustomNameserversZoneMetadata | 
    try {
      DnsCustomNameserversSchemasEmptyResponse result = apiInstance.accountLevelCustomNameserversUsageForAZoneSetAccountCustomNameserverRelatedZoneMetadata(zoneId, dnsCustomNameserversZoneMetadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLevelCustomNameserversUsageForAZoneApi#accountLevelCustomNameserversUsageForAZoneSetAccountCustomNameserverRelatedZoneMetadata");
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
| **dnsCustomNameserversZoneMetadata** | [**DnsCustomNameserversZoneMetadata**](DnsCustomNameserversZoneMetadata.md)|  | |

### Return type

[**DnsCustomNameserversSchemasEmptyResponse**](DnsCustomNameserversSchemasEmptyResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set Account Custom Nameserver Related Zone Metadata response |  -  |
| **4XX** | Set Account Custom Nameserver Related Zone Metadata response failure |  -  |

