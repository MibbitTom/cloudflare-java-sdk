# StreamSigningKeysApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**streamSigningKeysCreateSigningKeys**](StreamSigningKeysApi.md#streamSigningKeysCreateSigningKeys) | **POST** /accounts/{account_id}/stream/keys | Create signing keys |
| [**streamSigningKeysDeleteSigningKeys**](StreamSigningKeysApi.md#streamSigningKeysDeleteSigningKeys) | **DELETE** /accounts/{account_id}/stream/keys/{identifier} | Delete signing keys |
| [**streamSigningKeysListSigningKeys**](StreamSigningKeysApi.md#streamSigningKeysListSigningKeys) | **GET** /accounts/{account_id}/stream/keys | List signing keys |


<a id="streamSigningKeysCreateSigningKeys"></a>
# **streamSigningKeysCreateSigningKeys**
> StreamKeyGenerationResponse streamSigningKeysCreateSigningKeys(accountId)

Create signing keys

Creates an RSA private key in PEM and JWK formats. Key files are only displayed once after creation. Keys are created, used, and deleted independently of videos, and every key can sign any video.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.StreamSigningKeysApi;

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

    StreamSigningKeysApi apiInstance = new StreamSigningKeysApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      StreamKeyGenerationResponse result = apiInstance.streamSigningKeysCreateSigningKeys(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamSigningKeysApi#streamSigningKeysCreateSigningKeys");
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

[**StreamKeyGenerationResponse**](StreamKeyGenerationResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create signing keys response |  -  |
| **4XX** | Create signing keys response failure |  -  |

<a id="streamSigningKeysDeleteSigningKeys"></a>
# **streamSigningKeysDeleteSigningKeys**
> StreamDeletedResponse streamSigningKeysDeleteSigningKeys(identifier, accountId)

Delete signing keys

Deletes signing keys and revokes all signed URLs generated with the key.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.StreamSigningKeysApi;

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

    StreamSigningKeysApi apiInstance = new StreamSigningKeysApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      StreamDeletedResponse result = apiInstance.streamSigningKeysDeleteSigningKeys(identifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamSigningKeysApi#streamSigningKeysDeleteSigningKeys");
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
| **accountId** | **String**|  | |

### Return type

[**StreamDeletedResponse**](StreamDeletedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete signing keys response |  -  |
| **4XX** | Delete signing keys response failure |  -  |

<a id="streamSigningKeysListSigningKeys"></a>
# **streamSigningKeysListSigningKeys**
> StreamKeyResponseCollection streamSigningKeysListSigningKeys(accountId)

List signing keys

Lists the video ID and creation date and time when a signing key was created.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.StreamSigningKeysApi;

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

    StreamSigningKeysApi apiInstance = new StreamSigningKeysApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      StreamKeyResponseCollection result = apiInstance.streamSigningKeysListSigningKeys(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamSigningKeysApi#streamSigningKeysListSigningKeys");
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

[**StreamKeyResponseCollection**](StreamKeyResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List signing keys response |  -  |
| **4XX** | List signing keys response failure |  -  |

