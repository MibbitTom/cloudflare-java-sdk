# AccountLevelCustomNameserversApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountLevelCustomNameserversAddAccountCustomNameserver**](AccountLevelCustomNameserversApi.md#accountLevelCustomNameserversAddAccountCustomNameserver) | **POST** /accounts/{account_id}/custom_ns | Add Account Custom Nameserver |
| [**accountLevelCustomNameserversDeleteAccountCustomNameserver**](AccountLevelCustomNameserversApi.md#accountLevelCustomNameserversDeleteAccountCustomNameserver) | **DELETE** /accounts/{account_id}/custom_ns/{custom_ns_id} | Delete Account Custom Nameserver |
| [**accountLevelCustomNameserversGetEligibleZonesForAccountCustomNameservers**](AccountLevelCustomNameserversApi.md#accountLevelCustomNameserversGetEligibleZonesForAccountCustomNameservers) | **GET** /accounts/{account_id}/custom_ns/availability | Get Eligible Zones for Account Custom Nameservers |
| [**accountLevelCustomNameserversListAccountCustomNameservers**](AccountLevelCustomNameserversApi.md#accountLevelCustomNameserversListAccountCustomNameservers) | **GET** /accounts/{account_id}/custom_ns | List Account Custom Nameservers |
| [**accountLevelCustomNameserversVerifyAccountCustomNameserverGlueRecords**](AccountLevelCustomNameserversApi.md#accountLevelCustomNameserversVerifyAccountCustomNameserverGlueRecords) | **POST** /accounts/{account_id}/custom_ns/verify | Verify Account Custom Nameserver Glue Records |


<a id="accountLevelCustomNameserversAddAccountCustomNameserver"></a>
# **accountLevelCustomNameserversAddAccountCustomNameserver**
> DnsCustomNameserversAcnsResponseSingle accountLevelCustomNameserversAddAccountCustomNameserver(accountId, dnsCustomNameserversCustomNSInput)

Add Account Custom Nameserver

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountLevelCustomNameserversApi;

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

    AccountLevelCustomNameserversApi apiInstance = new AccountLevelCustomNameserversApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    DnsCustomNameserversCustomNSInput dnsCustomNameserversCustomNSInput = new DnsCustomNameserversCustomNSInput(); // DnsCustomNameserversCustomNSInput | 
    try {
      DnsCustomNameserversAcnsResponseSingle result = apiInstance.accountLevelCustomNameserversAddAccountCustomNameserver(accountId, dnsCustomNameserversCustomNSInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLevelCustomNameserversApi#accountLevelCustomNameserversAddAccountCustomNameserver");
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
| **accountId** | **String**|  | |
| **dnsCustomNameserversCustomNSInput** | [**DnsCustomNameserversCustomNSInput**](DnsCustomNameserversCustomNSInput.md)|  | |

### Return type

[**DnsCustomNameserversAcnsResponseSingle**](DnsCustomNameserversAcnsResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add Account Custom Nameserver response |  -  |
| **4XX** | Add Account Custom Nameserver response failure |  -  |

<a id="accountLevelCustomNameserversDeleteAccountCustomNameserver"></a>
# **accountLevelCustomNameserversDeleteAccountCustomNameserver**
> DnsCustomNameserversEmptyResponse accountLevelCustomNameserversDeleteAccountCustomNameserver(customNsId, accountId)

Delete Account Custom Nameserver

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountLevelCustomNameserversApi;

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

    AccountLevelCustomNameserversApi apiInstance = new AccountLevelCustomNameserversApi(defaultClient);
    String customNsId = "customNsId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      DnsCustomNameserversEmptyResponse result = apiInstance.accountLevelCustomNameserversDeleteAccountCustomNameserver(customNsId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLevelCustomNameserversApi#accountLevelCustomNameserversDeleteAccountCustomNameserver");
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
| **customNsId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**DnsCustomNameserversEmptyResponse**](DnsCustomNameserversEmptyResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Account Custom Nameserver response |  -  |
| **4XX** | Delete Account Custom Nameserver response failure |  -  |

<a id="accountLevelCustomNameserversGetEligibleZonesForAccountCustomNameservers"></a>
# **accountLevelCustomNameserversGetEligibleZonesForAccountCustomNameservers**
> DnsCustomNameserversAvailabilityResponse accountLevelCustomNameserversGetEligibleZonesForAccountCustomNameservers(accountId)

Get Eligible Zones for Account Custom Nameservers

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountLevelCustomNameserversApi;

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

    AccountLevelCustomNameserversApi apiInstance = new AccountLevelCustomNameserversApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      DnsCustomNameserversAvailabilityResponse result = apiInstance.accountLevelCustomNameserversGetEligibleZonesForAccountCustomNameservers(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLevelCustomNameserversApi#accountLevelCustomNameserversGetEligibleZonesForAccountCustomNameservers");
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
| **accountId** | **String**|  | |

### Return type

[**DnsCustomNameserversAvailabilityResponse**](DnsCustomNameserversAvailabilityResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Eligible Zones for Account Custom Nameservers response |  -  |
| **4XX** | Get Eligible Zones for Account Custom Nameservers response failure |  -  |

<a id="accountLevelCustomNameserversListAccountCustomNameservers"></a>
# **accountLevelCustomNameserversListAccountCustomNameservers**
> DnsCustomNameserversAcnsResponseCollection accountLevelCustomNameserversListAccountCustomNameservers(accountId)

List Account Custom Nameservers

List an account&#39;s custom nameservers.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountLevelCustomNameserversApi;

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

    AccountLevelCustomNameserversApi apiInstance = new AccountLevelCustomNameserversApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      DnsCustomNameserversAcnsResponseCollection result = apiInstance.accountLevelCustomNameserversListAccountCustomNameservers(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLevelCustomNameserversApi#accountLevelCustomNameserversListAccountCustomNameservers");
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
| **accountId** | **String**|  | |

### Return type

[**DnsCustomNameserversAcnsResponseCollection**](DnsCustomNameserversAcnsResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Account Custom Nameservers response |  -  |
| **4XX** | List Account Custom Nameservers response failure |  -  |

<a id="accountLevelCustomNameserversVerifyAccountCustomNameserverGlueRecords"></a>
# **accountLevelCustomNameserversVerifyAccountCustomNameserverGlueRecords**
> DnsCustomNameserversAcnsResponseCollection accountLevelCustomNameserversVerifyAccountCustomNameserverGlueRecords(accountId)

Verify Account Custom Nameserver Glue Records

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountLevelCustomNameserversApi;

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

    AccountLevelCustomNameserversApi apiInstance = new AccountLevelCustomNameserversApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      DnsCustomNameserversAcnsResponseCollection result = apiInstance.accountLevelCustomNameserversVerifyAccountCustomNameserverGlueRecords(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountLevelCustomNameserversApi#accountLevelCustomNameserversVerifyAccountCustomNameserverGlueRecords");
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
| **accountId** | **String**|  | |

### Return type

[**DnsCustomNameserversAcnsResponseCollection**](DnsCustomNameserversAcnsResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Verify Account Custom Nameserver Glue Records response |  -  |
| **4XX** | Verify Account Custom Nameserver Glue Records response failure |  -  |

