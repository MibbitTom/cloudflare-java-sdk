# SecondaryDnsTsigApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**secondaryDnsTsigCreateTsig**](SecondaryDnsTsigApi.md#secondaryDnsTsigCreateTsig) | **POST** /accounts/{account_id}/secondary_dns/tsigs | Create TSIG |
| [**secondaryDnsTsigDeleteTsig**](SecondaryDnsTsigApi.md#secondaryDnsTsigDeleteTsig) | **DELETE** /accounts/{account_id}/secondary_dns/tsigs/{tsig_id} | Delete TSIG |
| [**secondaryDnsTsigListTsiGs**](SecondaryDnsTsigApi.md#secondaryDnsTsigListTsiGs) | **GET** /accounts/{account_id}/secondary_dns/tsigs | List TSIGs |
| [**secondaryDnsTsigTsigDetails**](SecondaryDnsTsigApi.md#secondaryDnsTsigTsigDetails) | **GET** /accounts/{account_id}/secondary_dns/tsigs/{tsig_id} | TSIG Details |
| [**secondaryDnsTsigUpdateTsig**](SecondaryDnsTsigApi.md#secondaryDnsTsigUpdateTsig) | **PUT** /accounts/{account_id}/secondary_dns/tsigs/{tsig_id} | Update TSIG |


<a id="secondaryDnsTsigCreateTsig"></a>
# **secondaryDnsTsigCreateTsig**
> SecondaryDnsSingleResponse secondaryDnsTsigCreateTsig(accountId, secondaryDnsTsig)

Create TSIG

Create TSIG.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SecondaryDnsTsigApi;

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

    SecondaryDnsTsigApi apiInstance = new SecondaryDnsTsigApi(defaultClient);
    Object accountId = null; // Object | 
    SecondaryDnsTsig secondaryDnsTsig = new SecondaryDnsTsig(); // SecondaryDnsTsig | 
    try {
      SecondaryDnsSingleResponse result = apiInstance.secondaryDnsTsigCreateTsig(accountId, secondaryDnsTsig);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsTsigApi#secondaryDnsTsigCreateTsig");
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
| **secondaryDnsTsig** | [**SecondaryDnsTsig**](SecondaryDnsTsig.md)|  | |

### Return type

[**SecondaryDnsSingleResponse**](SecondaryDnsSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create TSIG response |  -  |
| **4XX** | Create TSIG response failure |  -  |

<a id="secondaryDnsTsigDeleteTsig"></a>
# **secondaryDnsTsigDeleteTsig**
> SecondaryDnsSchemasIdResponse secondaryDnsTsigDeleteTsig(tsigId, accountId)

Delete TSIG

Delete TSIG.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SecondaryDnsTsigApi;

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

    SecondaryDnsTsigApi apiInstance = new SecondaryDnsTsigApi(defaultClient);
    Object tsigId = null; // Object | 
    Object accountId = null; // Object | 
    try {
      SecondaryDnsSchemasIdResponse result = apiInstance.secondaryDnsTsigDeleteTsig(tsigId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsTsigApi#secondaryDnsTsigDeleteTsig");
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
| **tsigId** | [**Object**](.md)|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**SecondaryDnsSchemasIdResponse**](SecondaryDnsSchemasIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete TSIG response |  -  |
| **4XX** | Delete TSIG response failure |  -  |

<a id="secondaryDnsTsigListTsiGs"></a>
# **secondaryDnsTsigListTsiGs**
> SecondaryDnsResponseCollection secondaryDnsTsigListTsiGs(accountId)

List TSIGs

List TSIGs.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SecondaryDnsTsigApi;

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

    SecondaryDnsTsigApi apiInstance = new SecondaryDnsTsigApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      SecondaryDnsResponseCollection result = apiInstance.secondaryDnsTsigListTsiGs(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsTsigApi#secondaryDnsTsigListTsiGs");
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

### Return type

[**SecondaryDnsResponseCollection**](SecondaryDnsResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List TSIGs response |  -  |
| **4XX** | List TSIGs response failure |  -  |

<a id="secondaryDnsTsigTsigDetails"></a>
# **secondaryDnsTsigTsigDetails**
> SecondaryDnsSingleResponse secondaryDnsTsigTsigDetails(tsigId, accountId)

TSIG Details

Get TSIG.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SecondaryDnsTsigApi;

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

    SecondaryDnsTsigApi apiInstance = new SecondaryDnsTsigApi(defaultClient);
    Object tsigId = null; // Object | 
    Object accountId = null; // Object | 
    try {
      SecondaryDnsSingleResponse result = apiInstance.secondaryDnsTsigTsigDetails(tsigId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsTsigApi#secondaryDnsTsigTsigDetails");
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
| **tsigId** | [**Object**](.md)|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**SecondaryDnsSingleResponse**](SecondaryDnsSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | TSIG Details response |  -  |
| **4XX** | TSIG Details response failure |  -  |

<a id="secondaryDnsTsigUpdateTsig"></a>
# **secondaryDnsTsigUpdateTsig**
> SecondaryDnsSingleResponse secondaryDnsTsigUpdateTsig(tsigId, accountId, secondaryDnsTsig)

Update TSIG

Modify TSIG.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SecondaryDnsTsigApi;

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

    SecondaryDnsTsigApi apiInstance = new SecondaryDnsTsigApi(defaultClient);
    Object tsigId = null; // Object | 
    Object accountId = null; // Object | 
    SecondaryDnsTsig secondaryDnsTsig = new SecondaryDnsTsig(); // SecondaryDnsTsig | 
    try {
      SecondaryDnsSingleResponse result = apiInstance.secondaryDnsTsigUpdateTsig(tsigId, accountId, secondaryDnsTsig);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecondaryDnsTsigApi#secondaryDnsTsigUpdateTsig");
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
| **tsigId** | [**Object**](.md)|  | |
| **accountId** | [**Object**](.md)|  | |
| **secondaryDnsTsig** | [**SecondaryDnsTsig**](SecondaryDnsTsig.md)|  | |

### Return type

[**SecondaryDnsSingleResponse**](SecondaryDnsSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update TSIG response |  -  |
| **4XX** | Update TSIG response failure |  -  |

