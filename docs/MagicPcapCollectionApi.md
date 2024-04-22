# MagicPcapCollectionApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**magicPcapCollectionAddBucketsForFullPacketCaptures**](MagicPcapCollectionApi.md#magicPcapCollectionAddBucketsForFullPacketCaptures) | **POST** /accounts/{account_id}/pcaps/ownership | Add buckets for full packet captures |
| [**magicPcapCollectionCreatePcapRequest**](MagicPcapCollectionApi.md#magicPcapCollectionCreatePcapRequest) | **POST** /accounts/{account_id}/pcaps | Create PCAP request |
| [**magicPcapCollectionDeleteBucketsForFullPacketCaptures**](MagicPcapCollectionApi.md#magicPcapCollectionDeleteBucketsForFullPacketCaptures) | **DELETE** /accounts/{account_id}/pcaps/ownership/{ownership_id} | Delete buckets for full packet captures |
| [**magicPcapCollectionDownloadSimplePcap**](MagicPcapCollectionApi.md#magicPcapCollectionDownloadSimplePcap) | **GET** /accounts/{account_id}/pcaps/{pcap_id}/download | Download Simple PCAP |
| [**magicPcapCollectionGetPcapRequest**](MagicPcapCollectionApi.md#magicPcapCollectionGetPcapRequest) | **GET** /accounts/{account_id}/pcaps/{pcap_id} | Get PCAP request |
| [**magicPcapCollectionListPacketCaptureRequests**](MagicPcapCollectionApi.md#magicPcapCollectionListPacketCaptureRequests) | **GET** /accounts/{account_id}/pcaps | List packet capture requests |
| [**magicPcapCollectionListPcaPsBucketOwnership**](MagicPcapCollectionApi.md#magicPcapCollectionListPcaPsBucketOwnership) | **GET** /accounts/{account_id}/pcaps/ownership | List PCAPs Bucket Ownership |
| [**magicPcapCollectionValidateBucketsForFullPacketCaptures**](MagicPcapCollectionApi.md#magicPcapCollectionValidateBucketsForFullPacketCaptures) | **POST** /accounts/{account_id}/pcaps/ownership/validate | Validate buckets for full packet captures |


<a id="magicPcapCollectionAddBucketsForFullPacketCaptures"></a>
# **magicPcapCollectionAddBucketsForFullPacketCaptures**
> MagicVisibilityPcapsOwnershipSingleResponse magicPcapCollectionAddBucketsForFullPacketCaptures(accountId, magicVisibilityPcapsOwnershipRequest)

Add buckets for full packet captures

Adds an AWS or GCP bucket to use with full packet captures.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicPcapCollectionApi;

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

    MagicPcapCollectionApi apiInstance = new MagicPcapCollectionApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    MagicVisibilityPcapsOwnershipRequest magicVisibilityPcapsOwnershipRequest = new MagicVisibilityPcapsOwnershipRequest(); // MagicVisibilityPcapsOwnershipRequest | 
    try {
      MagicVisibilityPcapsOwnershipSingleResponse result = apiInstance.magicPcapCollectionAddBucketsForFullPacketCaptures(accountId, magicVisibilityPcapsOwnershipRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicPcapCollectionApi#magicPcapCollectionAddBucketsForFullPacketCaptures");
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
| **magicVisibilityPcapsOwnershipRequest** | [**MagicVisibilityPcapsOwnershipRequest**](MagicVisibilityPcapsOwnershipRequest.md)|  | |

### Return type

[**MagicVisibilityPcapsOwnershipSingleResponse**](MagicVisibilityPcapsOwnershipSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add buckets for full packet captures response |  -  |
| **0** | Add buckets for full packet captures response failure |  -  |

<a id="magicPcapCollectionCreatePcapRequest"></a>
# **magicPcapCollectionCreatePcapRequest**
> MagicVisibilityPcapsSingleResponse magicPcapCollectionCreatePcapRequest(accountId, magicVisibilityPcapsRequestPcap)

Create PCAP request

Create new PCAP request for account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicPcapCollectionApi;

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

    MagicPcapCollectionApi apiInstance = new MagicPcapCollectionApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    MagicVisibilityPcapsRequestPcap magicVisibilityPcapsRequestPcap = new MagicVisibilityPcapsRequestPcap(); // MagicVisibilityPcapsRequestPcap | 
    try {
      MagicVisibilityPcapsSingleResponse result = apiInstance.magicPcapCollectionCreatePcapRequest(accountId, magicVisibilityPcapsRequestPcap);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicPcapCollectionApi#magicPcapCollectionCreatePcapRequest");
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
| **magicVisibilityPcapsRequestPcap** | [**MagicVisibilityPcapsRequestPcap**](MagicVisibilityPcapsRequestPcap.md)|  | |

### Return type

[**MagicVisibilityPcapsSingleResponse**](MagicVisibilityPcapsSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create PCAP request response |  -  |
| **0** | Create PCAP request response failure |  -  |

<a id="magicPcapCollectionDeleteBucketsForFullPacketCaptures"></a>
# **magicPcapCollectionDeleteBucketsForFullPacketCaptures**
> magicPcapCollectionDeleteBucketsForFullPacketCaptures(ownershipId, accountId)

Delete buckets for full packet captures

Deletes buckets added to the packet captures API.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicPcapCollectionApi;

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

    MagicPcapCollectionApi apiInstance = new MagicPcapCollectionApi(defaultClient);
    String ownershipId = "ownershipId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      apiInstance.magicPcapCollectionDeleteBucketsForFullPacketCaptures(ownershipId, accountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicPcapCollectionApi#magicPcapCollectionDeleteBucketsForFullPacketCaptures");
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
| **ownershipId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Delete buckets for full packet captures response |  -  |
| **0** | Delete buckets for full packet captures response failure |  -  |

<a id="magicPcapCollectionDownloadSimplePcap"></a>
# **magicPcapCollectionDownloadSimplePcap**
> magicPcapCollectionDownloadSimplePcap(pcapId, accountId)

Download Simple PCAP

Download PCAP information into a file. Response is a binary PCAP file.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicPcapCollectionApi;

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

    MagicPcapCollectionApi apiInstance = new MagicPcapCollectionApi(defaultClient);
    String pcapId = "pcapId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      apiInstance.magicPcapCollectionDownloadSimplePcap(pcapId, accountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicPcapCollectionApi#magicPcapCollectionDownloadSimplePcap");
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
| **pcapId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.tcpdump.pcap, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download Simple PCAP response |  -  |
| **0** | Download Simple PCAP response failure |  -  |

<a id="magicPcapCollectionGetPcapRequest"></a>
# **magicPcapCollectionGetPcapRequest**
> MagicVisibilityPcapsSingleResponse magicPcapCollectionGetPcapRequest(pcapId, accountId)

Get PCAP request

Get information for a PCAP request by id.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicPcapCollectionApi;

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

    MagicPcapCollectionApi apiInstance = new MagicPcapCollectionApi(defaultClient);
    String pcapId = "pcapId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      MagicVisibilityPcapsSingleResponse result = apiInstance.magicPcapCollectionGetPcapRequest(pcapId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicPcapCollectionApi#magicPcapCollectionGetPcapRequest");
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
| **pcapId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**MagicVisibilityPcapsSingleResponse**](MagicVisibilityPcapsSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get PCAP request response |  -  |
| **0** | Get PCAP request response failure |  -  |

<a id="magicPcapCollectionListPacketCaptureRequests"></a>
# **magicPcapCollectionListPacketCaptureRequests**
> MagicVisibilityPcapsCollectionResponse magicPcapCollectionListPacketCaptureRequests(accountId)

List packet capture requests

Lists all packet capture requests for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicPcapCollectionApi;

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

    MagicPcapCollectionApi apiInstance = new MagicPcapCollectionApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      MagicVisibilityPcapsCollectionResponse result = apiInstance.magicPcapCollectionListPacketCaptureRequests(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicPcapCollectionApi#magicPcapCollectionListPacketCaptureRequests");
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

[**MagicVisibilityPcapsCollectionResponse**](MagicVisibilityPcapsCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List packet capture requests response |  -  |
| **0** | List packet capture requests response failure |  -  |

<a id="magicPcapCollectionListPcaPsBucketOwnership"></a>
# **magicPcapCollectionListPcaPsBucketOwnership**
> MagicVisibilityPcapsOwnershipCollection magicPcapCollectionListPcaPsBucketOwnership(accountId)

List PCAPs Bucket Ownership

List all buckets configured for use with PCAPs API.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicPcapCollectionApi;

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

    MagicPcapCollectionApi apiInstance = new MagicPcapCollectionApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      MagicVisibilityPcapsOwnershipCollection result = apiInstance.magicPcapCollectionListPcaPsBucketOwnership(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicPcapCollectionApi#magicPcapCollectionListPcaPsBucketOwnership");
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

[**MagicVisibilityPcapsOwnershipCollection**](MagicVisibilityPcapsOwnershipCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List PCAPs Bucket Ownership response |  -  |
| **0** | List PCAPs Bucket Ownership response failure |  -  |

<a id="magicPcapCollectionValidateBucketsForFullPacketCaptures"></a>
# **magicPcapCollectionValidateBucketsForFullPacketCaptures**
> MagicVisibilityPcapsOwnershipSingleResponse magicPcapCollectionValidateBucketsForFullPacketCaptures(accountId, magicVisibilityPcapsOwnershipValidateRequest)

Validate buckets for full packet captures

Validates buckets added to the packet captures API.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.MagicPcapCollectionApi;

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

    MagicPcapCollectionApi apiInstance = new MagicPcapCollectionApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    MagicVisibilityPcapsOwnershipValidateRequest magicVisibilityPcapsOwnershipValidateRequest = new MagicVisibilityPcapsOwnershipValidateRequest(); // MagicVisibilityPcapsOwnershipValidateRequest | 
    try {
      MagicVisibilityPcapsOwnershipSingleResponse result = apiInstance.magicPcapCollectionValidateBucketsForFullPacketCaptures(accountId, magicVisibilityPcapsOwnershipValidateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicPcapCollectionApi#magicPcapCollectionValidateBucketsForFullPacketCaptures");
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
| **magicVisibilityPcapsOwnershipValidateRequest** | [**MagicVisibilityPcapsOwnershipValidateRequest**](MagicVisibilityPcapsOwnershipValidateRequest.md)|  | |

### Return type

[**MagicVisibilityPcapsOwnershipSingleResponse**](MagicVisibilityPcapsOwnershipSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Validate buckets for full packet captures response |  -  |
| **0** | Validate buckets for full packet captures response failure |  -  |

