# PagesBuildCacheApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pagesPurgeBuildCache**](PagesBuildCacheApi.md#pagesPurgeBuildCache) | **POST** /accounts/{account_id}/pages/projects/{project_name}/purge_build_cache | Purge build cache |


<a id="pagesPurgeBuildCache"></a>
# **pagesPurgeBuildCache**
> Object pagesPurgeBuildCache(projectName, accountId)

Purge build cache

Purge all cached build artifacts for a Pages project

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.PagesBuildCacheApi;

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

    PagesBuildCacheApi apiInstance = new PagesBuildCacheApi(defaultClient);
    String projectName = "projectName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      Object result = apiInstance.pagesPurgeBuildCache(projectName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PagesBuildCacheApi#pagesPurgeBuildCache");
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
| **projectName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Purge build cache response. |  -  |
| **4XX** | Purge build cache failure. |  -  |

