# DlpPayloadLogSettingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dlpPayloadLogSettingsGetSettings**](DlpPayloadLogSettingsApi.md#dlpPayloadLogSettingsGetSettings) | **GET** /accounts/{account_id}/dlp/payload_log | Get settings |
| [**dlpPayloadLogSettingsUpdateSettings**](DlpPayloadLogSettingsApi.md#dlpPayloadLogSettingsUpdateSettings) | **PUT** /accounts/{account_id}/dlp/payload_log | Update settings |


<a id="dlpPayloadLogSettingsGetSettings"></a>
# **dlpPayloadLogSettingsGetSettings**
> DlpGetSettingsResponse dlpPayloadLogSettingsGetSettings(accountId)

Get settings

Gets the current DLP payload log settings for this account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpPayloadLogSettingsApi;

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

    DlpPayloadLogSettingsApi apiInstance = new DlpPayloadLogSettingsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      DlpGetSettingsResponse result = apiInstance.dlpPayloadLogSettingsGetSettings(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpPayloadLogSettingsApi#dlpPayloadLogSettingsGetSettings");
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

[**DlpGetSettingsResponse**](DlpGetSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get settings response |  -  |
| **4XX** | Get settings response failure |  -  |

<a id="dlpPayloadLogSettingsUpdateSettings"></a>
# **dlpPayloadLogSettingsUpdateSettings**
> DlpUpdateSettingsResponse dlpPayloadLogSettingsUpdateSettings(accountId, dlpUpdateSettings)

Update settings

Updates the DLP payload log settings for this account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpPayloadLogSettingsApi;

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

    DlpPayloadLogSettingsApi apiInstance = new DlpPayloadLogSettingsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    DlpUpdateSettings dlpUpdateSettings = new DlpUpdateSettings(); // DlpUpdateSettings | 
    try {
      DlpUpdateSettingsResponse result = apiInstance.dlpPayloadLogSettingsUpdateSettings(accountId, dlpUpdateSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpPayloadLogSettingsApi#dlpPayloadLogSettingsUpdateSettings");
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
| **dlpUpdateSettings** | [**DlpUpdateSettings**](DlpUpdateSettings.md)|  | |

### Return type

[**DlpUpdateSettingsResponse**](DlpUpdateSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update settings response |  -  |
| **4XX** | Update settings response failure |  -  |

