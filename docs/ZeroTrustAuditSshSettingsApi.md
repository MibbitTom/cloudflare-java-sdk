# ZeroTrustAuditSshSettingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zeroTrustGetAuditSshSettings**](ZeroTrustAuditSshSettingsApi.md#zeroTrustGetAuditSshSettings) | **GET** /accounts/{account_id}/gateway/audit_ssh_settings | Get Zero Trust Audit SSH settings |
| [**zeroTrustUpdateAuditSshSettings**](ZeroTrustAuditSshSettingsApi.md#zeroTrustUpdateAuditSshSettings) | **PUT** /accounts/{account_id}/gateway/audit_ssh_settings | Update Zero Trust Audit SSH settings |


<a id="zeroTrustGetAuditSshSettings"></a>
# **zeroTrustGetAuditSshSettings**
> ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse zeroTrustGetAuditSshSettings(accountId)

Get Zero Trust Audit SSH settings

Get all Zero Trust Audit SSH settings for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustAuditSshSettingsApi;

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

    ZeroTrustAuditSshSettingsApi apiInstance = new ZeroTrustAuditSshSettingsApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse result = apiInstance.zeroTrustGetAuditSshSettings(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustAuditSshSettingsApi#zeroTrustGetAuditSshSettings");
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
| **accountId** | [**Object**](.md)|  | |

### Return type

[**ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse**](ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Zero Trust Audit SSH settings response |  -  |
| **4XX** | Get Zero Trust Audit SSH Settings response failure |  -  |

<a id="zeroTrustUpdateAuditSshSettings"></a>
# **zeroTrustUpdateAuditSshSettings**
> ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse zeroTrustUpdateAuditSshSettings(accountId, zeroTrustUpdateAuditSshSettingsRequest)

Update Zero Trust Audit SSH settings

Updates Zero Trust Audit SSH settings.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustAuditSshSettingsApi;

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

    ZeroTrustAuditSshSettingsApi apiInstance = new ZeroTrustAuditSshSettingsApi(defaultClient);
    Object accountId = null; // Object | 
    ZeroTrustUpdateAuditSshSettingsRequest zeroTrustUpdateAuditSshSettingsRequest = new ZeroTrustUpdateAuditSshSettingsRequest(); // ZeroTrustUpdateAuditSshSettingsRequest | 
    try {
      ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse result = apiInstance.zeroTrustUpdateAuditSshSettings(accountId, zeroTrustUpdateAuditSshSettingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustAuditSshSettingsApi#zeroTrustUpdateAuditSshSettings");
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
| **accountId** | [**Object**](.md)|  | |
| **zeroTrustUpdateAuditSshSettingsRequest** | [**ZeroTrustUpdateAuditSshSettingsRequest**](ZeroTrustUpdateAuditSshSettingsRequest.md)|  | |

### Return type

[**ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse**](ZeroTrustGatewayAuditSshSettingsComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Zero Trust Audit SSH Setting response |  -  |
| **4XX** | Update Zero Trust Audit SSH Setting response failure |  -  |

