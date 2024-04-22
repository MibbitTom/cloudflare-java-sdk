# CloudflareImagesVariantsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cloudflareImagesVariantsCreateAVariant**](CloudflareImagesVariantsApi.md#cloudflareImagesVariantsCreateAVariant) | **POST** /accounts/{account_id}/images/v1/variants | Create a variant |
| [**cloudflareImagesVariantsDeleteAVariant**](CloudflareImagesVariantsApi.md#cloudflareImagesVariantsDeleteAVariant) | **DELETE** /accounts/{account_id}/images/v1/variants/{variant_id} | Delete a variant |
| [**cloudflareImagesVariantsListVariants**](CloudflareImagesVariantsApi.md#cloudflareImagesVariantsListVariants) | **GET** /accounts/{account_id}/images/v1/variants | List variants |
| [**cloudflareImagesVariantsUpdateAVariant**](CloudflareImagesVariantsApi.md#cloudflareImagesVariantsUpdateAVariant) | **PATCH** /accounts/{account_id}/images/v1/variants/{variant_id} | Update a variant |
| [**cloudflareImagesVariantsVariantDetails**](CloudflareImagesVariantsApi.md#cloudflareImagesVariantsVariantDetails) | **GET** /accounts/{account_id}/images/v1/variants/{variant_id} | Variant details |


<a id="cloudflareImagesVariantsCreateAVariant"></a>
# **cloudflareImagesVariantsCreateAVariant**
> ImagesImageVariantSimpleResponse cloudflareImagesVariantsCreateAVariant(accountId, imagesImageVariantDefinition)

Create a variant

Specify variants that allow you to resize images for different use cases.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesVariantsApi;

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

    CloudflareImagesVariantsApi apiInstance = new CloudflareImagesVariantsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    ImagesImageVariantDefinition imagesImageVariantDefinition = new ImagesImageVariantDefinition(); // ImagesImageVariantDefinition | 
    try {
      ImagesImageVariantSimpleResponse result = apiInstance.cloudflareImagesVariantsCreateAVariant(accountId, imagesImageVariantDefinition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesVariantsApi#cloudflareImagesVariantsCreateAVariant");
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
| **imagesImageVariantDefinition** | [**ImagesImageVariantDefinition**](ImagesImageVariantDefinition.md)|  | |

### Return type

[**ImagesImageVariantSimpleResponse**](ImagesImageVariantSimpleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a variant response |  -  |
| **4XX** | Create a variant response failure |  -  |

<a id="cloudflareImagesVariantsDeleteAVariant"></a>
# **cloudflareImagesVariantsDeleteAVariant**
> ImagesDeletedResponse cloudflareImagesVariantsDeleteAVariant(variantId, accountId)

Delete a variant

Deleting a variant purges the cache for all images associated with the variant.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesVariantsApi;

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

    CloudflareImagesVariantsApi apiInstance = new CloudflareImagesVariantsApi(defaultClient);
    Object variantId = null; // Object | 
    String accountId = "accountId_example"; // String | 
    try {
      ImagesDeletedResponse result = apiInstance.cloudflareImagesVariantsDeleteAVariant(variantId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesVariantsApi#cloudflareImagesVariantsDeleteAVariant");
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
| **variantId** | [**Object**](.md)|  | |
| **accountId** | **String**|  | |

### Return type

[**ImagesDeletedResponse**](ImagesDeletedResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a variant response |  -  |
| **4XX** | Delete a variant response failure |  -  |

<a id="cloudflareImagesVariantsListVariants"></a>
# **cloudflareImagesVariantsListVariants**
> ImagesImageVariantListResponse cloudflareImagesVariantsListVariants(accountId)

List variants

Lists existing variants.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesVariantsApi;

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

    CloudflareImagesVariantsApi apiInstance = new CloudflareImagesVariantsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      ImagesImageVariantListResponse result = apiInstance.cloudflareImagesVariantsListVariants(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesVariantsApi#cloudflareImagesVariantsListVariants");
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

[**ImagesImageVariantListResponse**](ImagesImageVariantListResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List variants response |  -  |
| **4XX** | List variants response failure |  -  |

<a id="cloudflareImagesVariantsUpdateAVariant"></a>
# **cloudflareImagesVariantsUpdateAVariant**
> ImagesImageVariantSimpleResponse cloudflareImagesVariantsUpdateAVariant(variantId, accountId, imagesImageVariantPatchRequest)

Update a variant

Updating a variant purges the cache for all images associated with the variant.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesVariantsApi;

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

    CloudflareImagesVariantsApi apiInstance = new CloudflareImagesVariantsApi(defaultClient);
    Object variantId = null; // Object | 
    String accountId = "accountId_example"; // String | 
    ImagesImageVariantPatchRequest imagesImageVariantPatchRequest = new ImagesImageVariantPatchRequest(); // ImagesImageVariantPatchRequest | 
    try {
      ImagesImageVariantSimpleResponse result = apiInstance.cloudflareImagesVariantsUpdateAVariant(variantId, accountId, imagesImageVariantPatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesVariantsApi#cloudflareImagesVariantsUpdateAVariant");
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
| **variantId** | [**Object**](.md)|  | |
| **accountId** | **String**|  | |
| **imagesImageVariantPatchRequest** | [**ImagesImageVariantPatchRequest**](ImagesImageVariantPatchRequest.md)|  | |

### Return type

[**ImagesImageVariantSimpleResponse**](ImagesImageVariantSimpleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a variant response |  -  |
| **4XX** | Update a variant response failure |  -  |

<a id="cloudflareImagesVariantsVariantDetails"></a>
# **cloudflareImagesVariantsVariantDetails**
> ImagesImageVariantSimpleResponse cloudflareImagesVariantsVariantDetails(variantId, accountId)

Variant details

Fetch details for a single variant.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CloudflareImagesVariantsApi;

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

    CloudflareImagesVariantsApi apiInstance = new CloudflareImagesVariantsApi(defaultClient);
    Object variantId = null; // Object | 
    String accountId = "accountId_example"; // String | 
    try {
      ImagesImageVariantSimpleResponse result = apiInstance.cloudflareImagesVariantsVariantDetails(variantId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudflareImagesVariantsApi#cloudflareImagesVariantsVariantDetails");
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
| **variantId** | [**Object**](.md)|  | |
| **accountId** | **String**|  | |

### Return type

[**ImagesImageVariantSimpleResponse**](ImagesImageVariantSimpleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Variant details response |  -  |
| **4XX** | Variant details response failure |  -  |

