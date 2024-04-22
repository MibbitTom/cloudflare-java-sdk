# ZoneLevelAccessShortLivedCertificateCasApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneLevelAccessShortLivedCertificateCAsCreateAShortLivedCertificateCa**](ZoneLevelAccessShortLivedCertificateCasApi.md#zoneLevelAccessShortLivedCertificateCAsCreateAShortLivedCertificateCa) | **POST** /zones/{identifier}/access/apps/{uuid}/ca | Create a short-lived certificate CA |
| [**zoneLevelAccessShortLivedCertificateCAsDeleteAShortLivedCertificateCa**](ZoneLevelAccessShortLivedCertificateCasApi.md#zoneLevelAccessShortLivedCertificateCAsDeleteAShortLivedCertificateCa) | **DELETE** /zones/{identifier}/access/apps/{uuid}/ca | Delete a short-lived certificate CA |
| [**zoneLevelAccessShortLivedCertificateCAsGetAShortLivedCertificateCa**](ZoneLevelAccessShortLivedCertificateCasApi.md#zoneLevelAccessShortLivedCertificateCAsGetAShortLivedCertificateCa) | **GET** /zones/{identifier}/access/apps/{uuid}/ca | Get a short-lived certificate CA |
| [**zoneLevelAccessShortLivedCertificateCAsListShortLivedCertificateCAs**](ZoneLevelAccessShortLivedCertificateCasApi.md#zoneLevelAccessShortLivedCertificateCAsListShortLivedCertificateCAs) | **GET** /zones/{identifier}/access/apps/ca | List short-lived certificate CAs |


<a id="zoneLevelAccessShortLivedCertificateCAsCreateAShortLivedCertificateCa"></a>
# **zoneLevelAccessShortLivedCertificateCAsCreateAShortLivedCertificateCa**
> AccessCaComponentsSchemasSingleResponse zoneLevelAccessShortLivedCertificateCAsCreateAShortLivedCertificateCa(uuid, identifier)

Create a short-lived certificate CA

Generates a new short-lived certificate CA and public key.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessShortLivedCertificateCasApi;

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

    ZoneLevelAccessShortLivedCertificateCasApi apiInstance = new ZoneLevelAccessShortLivedCertificateCasApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessCaComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessShortLivedCertificateCAsCreateAShortLivedCertificateCa(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessShortLivedCertificateCasApi#zoneLevelAccessShortLivedCertificateCAsCreateAShortLivedCertificateCa");
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
| **uuid** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**AccessCaComponentsSchemasSingleResponse**](AccessCaComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a short-lived certificate CA response |  -  |
| **4XX** | Create a short-lived certificate CA response failure |  -  |

<a id="zoneLevelAccessShortLivedCertificateCAsDeleteAShortLivedCertificateCa"></a>
# **zoneLevelAccessShortLivedCertificateCAsDeleteAShortLivedCertificateCa**
> AccessSchemasIdResponse zoneLevelAccessShortLivedCertificateCAsDeleteAShortLivedCertificateCa(uuid, identifier)

Delete a short-lived certificate CA

Deletes a short-lived certificate CA.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessShortLivedCertificateCasApi;

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

    ZoneLevelAccessShortLivedCertificateCasApi apiInstance = new ZoneLevelAccessShortLivedCertificateCasApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessSchemasIdResponse result = apiInstance.zoneLevelAccessShortLivedCertificateCAsDeleteAShortLivedCertificateCa(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessShortLivedCertificateCasApi#zoneLevelAccessShortLivedCertificateCAsDeleteAShortLivedCertificateCa");
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
| **uuid** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**AccessSchemasIdResponse**](AccessSchemasIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Delete a short-lived certificate CA response |  -  |
| **4XX** | Delete a short-lived certificate CA response failure |  -  |

<a id="zoneLevelAccessShortLivedCertificateCAsGetAShortLivedCertificateCa"></a>
# **zoneLevelAccessShortLivedCertificateCAsGetAShortLivedCertificateCa**
> AccessCaComponentsSchemasSingleResponse zoneLevelAccessShortLivedCertificateCAsGetAShortLivedCertificateCa(uuid, identifier)

Get a short-lived certificate CA

Fetches a short-lived certificate CA and its public key.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessShortLivedCertificateCasApi;

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

    ZoneLevelAccessShortLivedCertificateCasApi apiInstance = new ZoneLevelAccessShortLivedCertificateCasApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessCaComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessShortLivedCertificateCAsGetAShortLivedCertificateCa(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessShortLivedCertificateCasApi#zoneLevelAccessShortLivedCertificateCAsGetAShortLivedCertificateCa");
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
| **uuid** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**AccessCaComponentsSchemasSingleResponse**](AccessCaComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a short-lived certificate CA response |  -  |
| **4XX** | Get a short-lived certificate CA response failure |  -  |

<a id="zoneLevelAccessShortLivedCertificateCAsListShortLivedCertificateCAs"></a>
# **zoneLevelAccessShortLivedCertificateCAsListShortLivedCertificateCAs**
> AccessCaComponentsSchemasResponseCollection zoneLevelAccessShortLivedCertificateCAsListShortLivedCertificateCAs(identifier)

List short-lived certificate CAs

Lists short-lived certificate CAs and their public keys.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneLevelAccessShortLivedCertificateCasApi;

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

    ZoneLevelAccessShortLivedCertificateCasApi apiInstance = new ZoneLevelAccessShortLivedCertificateCasApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessCaComponentsSchemasResponseCollection result = apiInstance.zoneLevelAccessShortLivedCertificateCAsListShortLivedCertificateCAs(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelAccessShortLivedCertificateCasApi#zoneLevelAccessShortLivedCertificateCAsListShortLivedCertificateCAs");
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
| **identifier** | **String**|  | |

### Return type

[**AccessCaComponentsSchemasResponseCollection**](AccessCaComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List short-lived certificate CAs response |  -  |
| **4XX** | List short-lived certificate CAs response failure |  -  |

