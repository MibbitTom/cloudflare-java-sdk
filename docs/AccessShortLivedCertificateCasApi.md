# AccessShortLivedCertificateCasApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accessShortLivedCertificateCAsCreateAShortLivedCertificateCa**](AccessShortLivedCertificateCasApi.md#accessShortLivedCertificateCAsCreateAShortLivedCertificateCa) | **POST** /accounts/{identifier}/access/apps/{uuid}/ca | Create a short-lived certificate CA |
| [**accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa**](AccessShortLivedCertificateCasApi.md#accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa) | **DELETE** /accounts/{identifier}/access/apps/{uuid}/ca | Delete a short-lived certificate CA |
| [**accessShortLivedCertificateCAsGetAShortLivedCertificateCa**](AccessShortLivedCertificateCasApi.md#accessShortLivedCertificateCAsGetAShortLivedCertificateCa) | **GET** /accounts/{identifier}/access/apps/{uuid}/ca | Get a short-lived certificate CA |
| [**accessShortLivedCertificateCAsListShortLivedCertificateCAs**](AccessShortLivedCertificateCasApi.md#accessShortLivedCertificateCAsListShortLivedCertificateCAs) | **GET** /accounts/{identifier}/access/apps/ca | List short-lived certificate CAs |


<a id="accessShortLivedCertificateCAsCreateAShortLivedCertificateCa"></a>
# **accessShortLivedCertificateCAsCreateAShortLivedCertificateCa**
> AccessCaComponentsSchemasSingleResponse accessShortLivedCertificateCAsCreateAShortLivedCertificateCa(uuid, identifier)

Create a short-lived certificate CA

Generates a new short-lived certificate CA and public key.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessShortLivedCertificateCasApi;

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

    AccessShortLivedCertificateCasApi apiInstance = new AccessShortLivedCertificateCasApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessCaComponentsSchemasSingleResponse result = apiInstance.accessShortLivedCertificateCAsCreateAShortLivedCertificateCa(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessShortLivedCertificateCasApi#accessShortLivedCertificateCAsCreateAShortLivedCertificateCa");
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

<a id="accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa"></a>
# **accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa**
> AccessSchemasIdResponse accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa(uuid, identifier)

Delete a short-lived certificate CA

Deletes a short-lived certificate CA.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessShortLivedCertificateCasApi;

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

    AccessShortLivedCertificateCasApi apiInstance = new AccessShortLivedCertificateCasApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessSchemasIdResponse result = apiInstance.accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessShortLivedCertificateCasApi#accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa");
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

<a id="accessShortLivedCertificateCAsGetAShortLivedCertificateCa"></a>
# **accessShortLivedCertificateCAsGetAShortLivedCertificateCa**
> AccessCaComponentsSchemasSingleResponse accessShortLivedCertificateCAsGetAShortLivedCertificateCa(uuid, identifier)

Get a short-lived certificate CA

Fetches a short-lived certificate CA and its public key.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessShortLivedCertificateCasApi;

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

    AccessShortLivedCertificateCasApi apiInstance = new AccessShortLivedCertificateCasApi(defaultClient);
    String uuid = "uuid_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessCaComponentsSchemasSingleResponse result = apiInstance.accessShortLivedCertificateCAsGetAShortLivedCertificateCa(uuid, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessShortLivedCertificateCasApi#accessShortLivedCertificateCAsGetAShortLivedCertificateCa");
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

<a id="accessShortLivedCertificateCAsListShortLivedCertificateCAs"></a>
# **accessShortLivedCertificateCAsListShortLivedCertificateCAs**
> AccessCaComponentsSchemasResponseCollection accessShortLivedCertificateCAsListShortLivedCertificateCAs(identifier)

List short-lived certificate CAs

Lists short-lived certificate CAs and their public keys.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccessShortLivedCertificateCasApi;

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

    AccessShortLivedCertificateCasApi apiInstance = new AccessShortLivedCertificateCasApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessCaComponentsSchemasResponseCollection result = apiInstance.accessShortLivedCertificateCAsListShortLivedCertificateCAs(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessShortLivedCertificateCasApi#accessShortLivedCertificateCAsListShortLivedCertificateCAs");
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

