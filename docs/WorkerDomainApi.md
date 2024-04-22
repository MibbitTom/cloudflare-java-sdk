# WorkerDomainApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workerDomainAttachToDomain**](WorkerDomainApi.md#workerDomainAttachToDomain) | **PUT** /accounts/{account_id}/workers/domains | Attach to Domain |
| [**workerDomainDetachFromDomain**](WorkerDomainApi.md#workerDomainDetachFromDomain) | **DELETE** /accounts/{account_id}/workers/domains/{domain_id} | Detach from Domain |
| [**workerDomainGetADomain**](WorkerDomainApi.md#workerDomainGetADomain) | **GET** /accounts/{account_id}/workers/domains/{domain_id} | Get a Domain |
| [**workerDomainListDomains**](WorkerDomainApi.md#workerDomainListDomains) | **GET** /accounts/{account_id}/workers/domains | List Domains |


<a id="workerDomainAttachToDomain"></a>
# **workerDomainAttachToDomain**
> WorkersDomainResponseSingle workerDomainAttachToDomain(accountId, workerDomainAttachToDomainRequest)

Attach to Domain

Attaches a Worker to a zone and hostname.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerDomainApi;

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

    WorkerDomainApi apiInstance = new WorkerDomainApi(defaultClient);
    Object accountId = null; // Object | 
    WorkerDomainAttachToDomainRequest workerDomainAttachToDomainRequest = new WorkerDomainAttachToDomainRequest(); // WorkerDomainAttachToDomainRequest | 
    try {
      WorkersDomainResponseSingle result = apiInstance.workerDomainAttachToDomain(accountId, workerDomainAttachToDomainRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerDomainApi#workerDomainAttachToDomain");
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
| **accountId** | [**Object**](.md)|  | |
| **workerDomainAttachToDomainRequest** | [**WorkerDomainAttachToDomainRequest**](WorkerDomainAttachToDomainRequest.md)|  | |

### Return type

[**WorkersDomainResponseSingle**](WorkersDomainResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Attach to Domain response |  -  |
| **4XX** | Attach to Domain response failure |  -  |

<a id="workerDomainDetachFromDomain"></a>
# **workerDomainDetachFromDomain**
> workerDomainDetachFromDomain(domainId, accountId)

Detach from Domain

Detaches a Worker from a zone and hostname.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerDomainApi;

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

    WorkerDomainApi apiInstance = new WorkerDomainApi(defaultClient);
    Object domainId = null; // Object | 
    Object accountId = null; // Object | 
    try {
      apiInstance.workerDomainDetachFromDomain(domainId, accountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerDomainApi#workerDomainDetachFromDomain");
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
| **domainId** | [**Object**](.md)|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Detach from Domain response |  -  |
| **4XX** | Detach from Domain response failure |  -  |

<a id="workerDomainGetADomain"></a>
# **workerDomainGetADomain**
> WorkersDomainResponseSingle workerDomainGetADomain(domainId, accountId)

Get a Domain

Gets a Worker domain.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerDomainApi;

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

    WorkerDomainApi apiInstance = new WorkerDomainApi(defaultClient);
    Object domainId = null; // Object | 
    Object accountId = null; // Object | 
    try {
      WorkersDomainResponseSingle result = apiInstance.workerDomainGetADomain(domainId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerDomainApi#workerDomainGetADomain");
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
| **domainId** | [**Object**](.md)|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**WorkersDomainResponseSingle**](WorkersDomainResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a Domain response |  -  |
| **4XX** | Get a Domain response failure |  -  |

<a id="workerDomainListDomains"></a>
# **workerDomainListDomains**
> WorkersDomainResponseCollection workerDomainListDomains(accountId, zoneName, service, zoneId, hostname, environment)

List Domains

Lists all Worker Domains for an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkerDomainApi;

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

    WorkerDomainApi apiInstance = new WorkerDomainApi(defaultClient);
    Object accountId = null; // Object | 
    String zoneName = "zoneName_example"; // String | 
    String service = "service_example"; // String | 
    Object zoneId = null; // Object | 
    String hostname = "foo.example.com"; // String | 
    String environment = "production"; // String | 
    try {
      WorkersDomainResponseCollection result = apiInstance.workerDomainListDomains(accountId, zoneName, service, zoneId, hostname, environment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerDomainApi#workerDomainListDomains");
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
| **accountId** | [**Object**](.md)|  | |
| **zoneName** | **String**|  | [optional] |
| **service** | **String**|  | [optional] |
| **zoneId** | [**Object**](.md)|  | [optional] |
| **hostname** | **String**|  | [optional] |
| **environment** | **String**|  | [optional] |

### Return type

[**WorkersDomainResponseCollection**](WorkersDomainResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Domains response |  -  |
| **4XX** | List Domains response failure |  -  |

