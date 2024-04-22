# BotSettingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**botManagementForAZoneGetConfig**](BotSettingsApi.md#botManagementForAZoneGetConfig) | **GET** /zones/{zone_id}/bot_management | Get Zone Bot Management Config |
| [**botManagementForAZoneUpdateConfig**](BotSettingsApi.md#botManagementForAZoneUpdateConfig) | **PUT** /zones/{zone_id}/bot_management | Update Zone Bot Management Config |


<a id="botManagementForAZoneGetConfig"></a>
# **botManagementForAZoneGetConfig**
> BotManagementBotManagementResponseBody botManagementForAZoneGetConfig(zoneId)

Get Zone Bot Management Config

Retrieve a zone&#39;s Bot Management Config

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BotSettingsApi;

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

    BotSettingsApi apiInstance = new BotSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      BotManagementBotManagementResponseBody result = apiInstance.botManagementForAZoneGetConfig(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BotSettingsApi#botManagementForAZoneGetConfig");
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

[**BotManagementBotManagementResponseBody**](BotManagementBotManagementResponseBody.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bot Management config response |  -  |
| **4XX** | Bot Management config response failure |  -  |

<a id="botManagementForAZoneUpdateConfig"></a>
# **botManagementForAZoneUpdateConfig**
> BotManagementBotManagementResponseBody botManagementForAZoneUpdateConfig(zoneId, botManagementConfigSingle)

Update Zone Bot Management Config

Updates the Bot Management configuration for a zone.  This API is used to update: - **Bot Fight Mode** - **Super Bot Fight Mode** - **Bot Management for Enterprise**  See [Bot Plans](https://developers.cloudflare.com/bots/plans/) for more information on the different plans 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BotSettingsApi;

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

    BotSettingsApi apiInstance = new BotSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    BotManagementConfigSingle botManagementConfigSingle = new BotManagementConfigSingle(); // BotManagementConfigSingle | 
    try {
      BotManagementBotManagementResponseBody result = apiInstance.botManagementForAZoneUpdateConfig(zoneId, botManagementConfigSingle);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BotSettingsApi#botManagementForAZoneUpdateConfig");
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
| **botManagementConfigSingle** | [**BotManagementConfigSingle**](BotManagementConfigSingle.md)|  | |

### Return type

[**BotManagementBotManagementResponseBody**](BotManagementBotManagementResponseBody.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Bot Management response |  -  |
| **4XX** | Update Bot Management response failure |  -  |

