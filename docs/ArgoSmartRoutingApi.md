# ArgoSmartRoutingApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**argoSmartRoutingGetArgoSmartRoutingSetting**](ArgoSmartRoutingApi.md#argoSmartRoutingGetArgoSmartRoutingSetting) | **GET** /zones/{zone_id}/argo/smart_routing | Get Argo Smart Routing setting |
| [**argoSmartRoutingPatchArgoSmartRoutingSetting**](ArgoSmartRoutingApi.md#argoSmartRoutingPatchArgoSmartRoutingSetting) | **PATCH** /zones/{zone_id}/argo/smart_routing | Patch Argo Smart Routing setting |


<a id="argoSmartRoutingGetArgoSmartRoutingSetting"></a>
# **argoSmartRoutingGetArgoSmartRoutingSetting**
> ArgoConfigResponseSingle argoSmartRoutingGetArgoSmartRoutingSetting(zoneId)

Get Argo Smart Routing setting

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ArgoSmartRoutingApi;

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

    ArgoSmartRoutingApi apiInstance = new ArgoSmartRoutingApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ArgoConfigResponseSingle result = apiInstance.argoSmartRoutingGetArgoSmartRoutingSetting(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArgoSmartRoutingApi#argoSmartRoutingGetArgoSmartRoutingSetting");
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

[**ArgoConfigResponseSingle**](ArgoConfigResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Argo Smart Routing setting response |  -  |
| **4XX** | Get Argo Smart Routing setting response failure |  -  |

<a id="argoSmartRoutingPatchArgoSmartRoutingSetting"></a>
# **argoSmartRoutingPatchArgoSmartRoutingSetting**
> ArgoConfigResponseSingle argoSmartRoutingPatchArgoSmartRoutingSetting(zoneId, argoConfigPatch)

Patch Argo Smart Routing setting

Updates enablement of Argo Smart Routing.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ArgoSmartRoutingApi;

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

    ArgoSmartRoutingApi apiInstance = new ArgoSmartRoutingApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ArgoConfigPatch argoConfigPatch = new ArgoConfigPatch(); // ArgoConfigPatch | 
    try {
      ArgoConfigResponseSingle result = apiInstance.argoSmartRoutingPatchArgoSmartRoutingSetting(zoneId, argoConfigPatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArgoSmartRoutingApi#argoSmartRoutingPatchArgoSmartRoutingSetting");
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
| **argoConfigPatch** | [**ArgoConfigPatch**](ArgoConfigPatch.md)|  | |

### Return type

[**ArgoConfigResponseSingle**](ArgoConfigResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch Argo Smart Routing setting response |  -  |
| **4XX** | Patch Argo Smart Routing setting response failure |  -  |

