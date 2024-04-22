# RegistrarDomainsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**registrarDomainsGetDomain**](RegistrarDomainsApi.md#registrarDomainsGetDomain) | **GET** /accounts/{account_id}/registrar/domains/{domain_name} | Get domain |
| [**registrarDomainsListDomains**](RegistrarDomainsApi.md#registrarDomainsListDomains) | **GET** /accounts/{account_id}/registrar/domains | List domains |
| [**registrarDomainsUpdateDomain**](RegistrarDomainsApi.md#registrarDomainsUpdateDomain) | **PUT** /accounts/{account_id}/registrar/domains/{domain_name} | Update domain |


<a id="registrarDomainsGetDomain"></a>
# **registrarDomainsGetDomain**
> RegistrarApiDomainResponseSingle registrarDomainsGetDomain(domainName, accountId)

Get domain

Show individual domain.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrarDomainsApi;

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

    RegistrarDomainsApi apiInstance = new RegistrarDomainsApi(defaultClient);
    String domainName = "domainName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      RegistrarApiDomainResponseSingle result = apiInstance.registrarDomainsGetDomain(domainName, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrarDomainsApi#registrarDomainsGetDomain");
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
| **domainName** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**RegistrarApiDomainResponseSingle**](RegistrarApiDomainResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get domain response |  -  |
| **4XX** | Get domain response failure |  -  |

<a id="registrarDomainsListDomains"></a>
# **registrarDomainsListDomains**
> RegistrarApiDomainResponseCollection registrarDomainsListDomains(accountId)

List domains

List domains handled by Registrar.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrarDomainsApi;

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

    RegistrarDomainsApi apiInstance = new RegistrarDomainsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      RegistrarApiDomainResponseCollection result = apiInstance.registrarDomainsListDomains(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrarDomainsApi#registrarDomainsListDomains");
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

[**RegistrarApiDomainResponseCollection**](RegistrarApiDomainResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List domains response |  -  |
| **4XX** | List domains response failure |  -  |

<a id="registrarDomainsUpdateDomain"></a>
# **registrarDomainsUpdateDomain**
> RegistrarApiDomainResponseSingle registrarDomainsUpdateDomain(domainName, accountId, registrarApiDomainUpdateProperties)

Update domain

Update individual domain.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrarDomainsApi;

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

    RegistrarDomainsApi apiInstance = new RegistrarDomainsApi(defaultClient);
    String domainName = "domainName_example"; // String | 
    String accountId = "accountId_example"; // String | 
    RegistrarApiDomainUpdateProperties registrarApiDomainUpdateProperties = new RegistrarApiDomainUpdateProperties(); // RegistrarApiDomainUpdateProperties | 
    try {
      RegistrarApiDomainResponseSingle result = apiInstance.registrarDomainsUpdateDomain(domainName, accountId, registrarApiDomainUpdateProperties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrarDomainsApi#registrarDomainsUpdateDomain");
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
| **domainName** | **String**|  | |
| **accountId** | **String**|  | |
| **registrarApiDomainUpdateProperties** | [**RegistrarApiDomainUpdateProperties**](RegistrarApiDomainUpdateProperties.md)|  | |

### Return type

[**RegistrarApiDomainResponseSingle**](RegistrarApiDomainResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update domain response |  -  |
| **4XX** | Update domain response failure |  -  |

