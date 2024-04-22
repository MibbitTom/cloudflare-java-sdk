# UrlNormalizationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**urlNormalizationGetUrlNormalizationSettings**](UrlNormalizationApi.md#urlNormalizationGetUrlNormalizationSettings) | **GET** /zones/{zone_id}/url_normalization | Get URL normalization settings |
| [**urlNormalizationUpdateUrlNormalizationSettings**](UrlNormalizationApi.md#urlNormalizationUpdateUrlNormalizationSettings) | **PUT** /zones/{zone_id}/url_normalization | Update URL normalization settings |


<a id="urlNormalizationGetUrlNormalizationSettings"></a>
# **urlNormalizationGetUrlNormalizationSettings**
> RulesetsSchemasResponseModel urlNormalizationGetUrlNormalizationSettings(zoneId)

Get URL normalization settings

Fetches the current URL normalization settings.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UrlNormalizationApi;

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

    UrlNormalizationApi apiInstance = new UrlNormalizationApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      RulesetsSchemasResponseModel result = apiInstance.urlNormalizationGetUrlNormalizationSettings(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlNormalizationApi#urlNormalizationGetUrlNormalizationSettings");
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

[**RulesetsSchemasResponseModel**](RulesetsSchemasResponseModel.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get URL normalization settings response |  -  |
| **4XX** | Get URL normalization settings response failure |  -  |

<a id="urlNormalizationUpdateUrlNormalizationSettings"></a>
# **urlNormalizationUpdateUrlNormalizationSettings**
> RulesetsSchemasResponseModel urlNormalizationUpdateUrlNormalizationSettings(zoneId, rulesetsSchemasRequestModel)

Update URL normalization settings

Updates the URL normalization settings.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UrlNormalizationApi;

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

    UrlNormalizationApi apiInstance = new UrlNormalizationApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    RulesetsSchemasRequestModel rulesetsSchemasRequestModel = new RulesetsSchemasRequestModel(); // RulesetsSchemasRequestModel | 
    try {
      RulesetsSchemasResponseModel result = apiInstance.urlNormalizationUpdateUrlNormalizationSettings(zoneId, rulesetsSchemasRequestModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlNormalizationApi#urlNormalizationUpdateUrlNormalizationSettings");
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
| **rulesetsSchemasRequestModel** | [**RulesetsSchemasRequestModel**](RulesetsSchemasRequestModel.md)|  | |

### Return type

[**RulesetsSchemasResponseModel**](RulesetsSchemasResponseModel.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update URL normalization settings response |  -  |
| **4XX** | Update URL normalization settings response failure |  -  |

