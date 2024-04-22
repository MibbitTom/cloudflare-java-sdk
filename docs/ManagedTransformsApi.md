# ManagedTransformsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**managedTransformsListManagedTransforms**](ManagedTransformsApi.md#managedTransformsListManagedTransforms) | **GET** /zones/{zone_id}/managed_headers | List Managed Transforms |
| [**managedTransformsUpdateStatusOfManagedTransforms**](ManagedTransformsApi.md#managedTransformsUpdateStatusOfManagedTransforms) | **PATCH** /zones/{zone_id}/managed_headers | Update status of Managed Transforms |


<a id="managedTransformsListManagedTransforms"></a>
# **managedTransformsListManagedTransforms**
> ManagedTransformsListManagedTransforms200Response managedTransformsListManagedTransforms(zoneId)

List Managed Transforms

Fetches a list of all Managed Transforms.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagedTransformsApi;

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

    ManagedTransformsApi apiInstance = new ManagedTransformsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ManagedTransformsListManagedTransforms200Response result = apiInstance.managedTransformsListManagedTransforms(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedTransformsApi#managedTransformsListManagedTransforms");
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

[**ManagedTransformsListManagedTransforms200Response**](ManagedTransformsListManagedTransforms200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Managed Transforms response |  -  |
| **4XX** | List Managed Transforms response failure |  -  |

<a id="managedTransformsUpdateStatusOfManagedTransforms"></a>
# **managedTransformsUpdateStatusOfManagedTransforms**
> ManagedTransformsUpdateStatusOfManagedTransforms200Response managedTransformsUpdateStatusOfManagedTransforms(zoneId, managedTransformsUpdateStatusOfManagedTransformsRequest)

Update status of Managed Transforms

Updates the status of one or more Managed Transforms.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagedTransformsApi;

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

    ManagedTransformsApi apiInstance = new ManagedTransformsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ManagedTransformsUpdateStatusOfManagedTransformsRequest managedTransformsUpdateStatusOfManagedTransformsRequest = new ManagedTransformsUpdateStatusOfManagedTransformsRequest(); // ManagedTransformsUpdateStatusOfManagedTransformsRequest | 
    try {
      ManagedTransformsUpdateStatusOfManagedTransforms200Response result = apiInstance.managedTransformsUpdateStatusOfManagedTransforms(zoneId, managedTransformsUpdateStatusOfManagedTransformsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedTransformsApi#managedTransformsUpdateStatusOfManagedTransforms");
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
| **managedTransformsUpdateStatusOfManagedTransformsRequest** | [**ManagedTransformsUpdateStatusOfManagedTransformsRequest**](ManagedTransformsUpdateStatusOfManagedTransformsRequest.md)|  | |

### Return type

[**ManagedTransformsUpdateStatusOfManagedTransforms200Response**](ManagedTransformsUpdateStatusOfManagedTransforms200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update status of Managed Transforms response |  -  |
| **4XX** | Update status of Managed Transforms response failure |  -  |

