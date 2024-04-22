# CloudflareImagesKeysApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cloudflareImagesKeysAddSigningKey**](CloudflareImagesKeysApi.md#cloudflareImagesKeysAddSigningKey) | **PUT** /accounts/{account_id}/images/v1/keys/{signing_key_name} | Create a new Signing Key |
| [**cloudflareImagesKeysDeleteSigningKey**](CloudflareImagesKeysApi.md#cloudflareImagesKeysDeleteSigningKey) | **DELETE** /accounts/{account_id}/images/v1/keys/{signing_key_name} | Delete Signing Key |
| [**cloudflareImagesKeysListSigningKeys**](CloudflareImagesKeysApi.md#cloudflareImagesKeysListSigningKeys) | **GET** /accounts/{account_id}/images/v1/keys | List Signing Keys |


<a id="cloudflareImagesKeysAddSigningKey"></a>
# **cloudflareImagesKeysAddSigningKey**
> ImagesImageKeyResponseCollection cloudflareImagesKeysAddSigningKey(signingKeyName, accountId)

Create a new Signing Key

Create a new signing key with specified name. Returns all keys available.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesKeysApi;

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

    CloudflareImagesKeysApi apiInstance = new CloudflareImagesKeysApi(defaultClient);
    Object signingKeyName = null; // Object | 
    String accountId = "accountId_example"; // String | 
    try {
      ImagesImageKeyResponseCollection result = apiInstance.cloudflareImagesKeysAddSigningKey(signingKeyName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesKeysApi#cloudflareImagesKeysAddSigningKey");
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
| **signingKeyName** | [**Object**](.md)|  | |
| **accountId** | **String**|  | |

### Return type

[**ImagesImageKeyResponseCollection**](ImagesImageKeyResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add Signing Key response |  -  |
| **4XX** | Add Signing Key response failure |  -  |

<a id="cloudflareImagesKeysDeleteSigningKey"></a>
# **cloudflareImagesKeysDeleteSigningKey**
> ImagesImageKeyResponseCollection cloudflareImagesKeysDeleteSigningKey(signingKeyName, accountId)

Delete Signing Key

Delete signing key with specified name. Returns all keys available. When last key is removed, a new default signing key will be generated. 

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesKeysApi;

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

    CloudflareImagesKeysApi apiInstance = new CloudflareImagesKeysApi(defaultClient);
    Object signingKeyName = null; // Object | 
    String accountId = "accountId_example"; // String | 
    try {
      ImagesImageKeyResponseCollection result = apiInstance.cloudflareImagesKeysDeleteSigningKey(signingKeyName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesKeysApi#cloudflareImagesKeysDeleteSigningKey");
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
| **signingKeyName** | [**Object**](.md)|  | |
| **accountId** | **String**|  | |

### Return type

[**ImagesImageKeyResponseCollection**](ImagesImageKeyResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Signing Key response |  -  |
| **4XX** | Delete Signing Key response failure |  -  |

<a id="cloudflareImagesKeysListSigningKeys"></a>
# **cloudflareImagesKeysListSigningKeys**
> ImagesImageKeyResponseCollection cloudflareImagesKeysListSigningKeys(accountId)

List Signing Keys

Lists your signing keys. These can be found on your Cloudflare Images dashboard.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesKeysApi;

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

    CloudflareImagesKeysApi apiInstance = new CloudflareImagesKeysApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      ImagesImageKeyResponseCollection result = apiInstance.cloudflareImagesKeysListSigningKeys(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesKeysApi#cloudflareImagesKeysListSigningKeys");
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

[**ImagesImageKeyResponseCollection**](ImagesImageKeyResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Signing Keys response |  -  |
| **4XX** | List Signing Keys response failure |  -  |

