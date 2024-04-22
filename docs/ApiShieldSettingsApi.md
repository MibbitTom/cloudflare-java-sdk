# ApiShieldSettingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiShieldSettingsRetrieveInformationAboutSpecificConfigurationProperties**](ApiShieldSettingsApi.md#apiShieldSettingsRetrieveInformationAboutSpecificConfigurationProperties) | **GET** /zones/{zone_id}/api_gateway/configuration | Retrieve information about specific configuration properties |
| [**apiShieldSettingsSetConfigurationProperties**](ApiShieldSettingsApi.md#apiShieldSettingsSetConfigurationProperties) | **PUT** /zones/{zone_id}/api_gateway/configuration | Set configuration properties |


<a id="apiShieldSettingsRetrieveInformationAboutSpecificConfigurationProperties"></a>
# **apiShieldSettingsRetrieveInformationAboutSpecificConfigurationProperties**
> ApiShieldSingleResponse apiShieldSettingsRetrieveInformationAboutSpecificConfigurationProperties(zoneId, properties)

Retrieve information about specific configuration properties

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ApiShieldSettingsApi;

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

    ApiShieldSettingsApi apiInstance = new ApiShieldSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    Set<String> properties = Arrays.asList(); // Set<String> | 
    try {
      ApiShieldSingleResponse result = apiInstance.apiShieldSettingsRetrieveInformationAboutSpecificConfigurationProperties(zoneId, properties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldSettingsApi#apiShieldSettingsRetrieveInformationAboutSpecificConfigurationProperties");
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
| **properties** | [**Set&lt;String&gt;**](String.md)|  | [optional] [enum: auth_id_characteristics] |

### Return type

[**ApiShieldSingleResponse**](ApiShieldSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve information about specific configuration properties response |  -  |
| **4XX** | Retrieve information about specific configuration properties response failure |  -  |

<a id="apiShieldSettingsSetConfigurationProperties"></a>
# **apiShieldSettingsSetConfigurationProperties**
> ApiShieldDefaultResponse apiShieldSettingsSetConfigurationProperties(zoneId, apiShieldConfiguration)

Set configuration properties

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ApiShieldSettingsApi;

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

    ApiShieldSettingsApi apiInstance = new ApiShieldSettingsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ApiShieldConfiguration apiShieldConfiguration = new ApiShieldConfiguration(); // ApiShieldConfiguration | 
    try {
      ApiShieldDefaultResponse result = apiInstance.apiShieldSettingsSetConfigurationProperties(zoneId, apiShieldConfiguration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldSettingsApi#apiShieldSettingsSetConfigurationProperties");
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
| **apiShieldConfiguration** | [**ApiShieldConfiguration**](ApiShieldConfiguration.md)|  | |

### Return type

[**ApiShieldDefaultResponse**](ApiShieldDefaultResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set configuration properties response |  -  |
| **4XX** | Set configuration properties response failure |  -  |

