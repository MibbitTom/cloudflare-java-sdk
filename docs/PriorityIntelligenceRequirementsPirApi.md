# PriorityIntelligenceRequirementsPirApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cloudforceOnePriorityDelete**](PriorityIntelligenceRequirementsPirApi.md#cloudforceOnePriorityDelete) | **DELETE** /accounts/{account_identifier}/cloudforce-one/requests/priority/{priority_identifer} | Delete a Priority Intelligence Report |
| [**cloudforceOnePriorityGet**](PriorityIntelligenceRequirementsPirApi.md#cloudforceOnePriorityGet) | **GET** /accounts/{account_identifier}/cloudforce-one/requests/priority/{priority_identifer} | Get a Priority Intelligence Requirement |
| [**cloudforceOnePriorityList**](PriorityIntelligenceRequirementsPirApi.md#cloudforceOnePriorityList) | **POST** /accounts/{account_identifier}/cloudforce-one/requests/priority | List Priority Intelligence Requirements |
| [**cloudforceOnePriorityNew**](PriorityIntelligenceRequirementsPirApi.md#cloudforceOnePriorityNew) | **POST** /accounts/{account_identifier}/cloudforce-one/requests/priority/new | Create a New Priority Requirement |
| [**cloudforceOnePriorityQuota**](PriorityIntelligenceRequirementsPirApi.md#cloudforceOnePriorityQuota) | **GET** /accounts/{account_identifier}/cloudforce-one/requests/priority/quota | Get Priority Intelligence Requirement Quota |
| [**cloudforceOnePriorityUpdate**](PriorityIntelligenceRequirementsPirApi.md#cloudforceOnePriorityUpdate) | **PUT** /accounts/{account_identifier}/cloudforce-one/requests/priority/{priority_identifer} | Update a Priority Intelligence Requirement |


<a id="cloudforceOnePriorityDelete"></a>
# **cloudforceOnePriorityDelete**
> CloudforceOneApiResponseCommon cloudforceOnePriorityDelete(accountIdentifier, priorityIdentifer)

Delete a Priority Intelligence Report

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriorityIntelligenceRequirementsPirApi;

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

    PriorityIntelligenceRequirementsPirApi apiInstance = new PriorityIntelligenceRequirementsPirApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    String priorityIdentifer = "priorityIdentifer_example"; // String | 
    try {
      CloudforceOneApiResponseCommon result = apiInstance.cloudforceOnePriorityDelete(accountIdentifier, priorityIdentifer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriorityIntelligenceRequirementsPirApi#cloudforceOnePriorityDelete");
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
| **accountIdentifier** | **String**|  | |
| **priorityIdentifer** | **String**|  | |

### Return type

[**CloudforceOneApiResponseCommon**](CloudforceOneApiResponseCommon.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a priority response |  -  |
| **4XX** | Delete a priority response failure |  -  |

<a id="cloudforceOnePriorityGet"></a>
# **cloudforceOnePriorityGet**
> CloudforceOneRequestNew200Response cloudforceOnePriorityGet(accountIdentifier, priorityIdentifer)

Get a Priority Intelligence Requirement

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriorityIntelligenceRequirementsPirApi;

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

    PriorityIntelligenceRequirementsPirApi apiInstance = new PriorityIntelligenceRequirementsPirApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    String priorityIdentifer = "priorityIdentifer_example"; // String | 
    try {
      CloudforceOneRequestNew200Response result = apiInstance.cloudforceOnePriorityGet(accountIdentifier, priorityIdentifer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriorityIntelligenceRequirementsPirApi#cloudforceOnePriorityGet");
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
| **accountIdentifier** | **String**|  | |
| **priorityIdentifer** | **String**|  | |

### Return type

[**CloudforceOneRequestNew200Response**](CloudforceOneRequestNew200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a priority response |  -  |
| **4XX** | Get a priority response failure |  -  |

<a id="cloudforceOnePriorityList"></a>
# **cloudforceOnePriorityList**
> CloudforceOnePriorityList200Response cloudforceOnePriorityList(accountIdentifier, cloudforceOnePriorityList)

List Priority Intelligence Requirements

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriorityIntelligenceRequirementsPirApi;

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

    PriorityIntelligenceRequirementsPirApi apiInstance = new PriorityIntelligenceRequirementsPirApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    CloudforceOnePriorityList cloudforceOnePriorityList = new CloudforceOnePriorityList(); // CloudforceOnePriorityList | 
    try {
      CloudforceOnePriorityList200Response result = apiInstance.cloudforceOnePriorityList(accountIdentifier, cloudforceOnePriorityList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriorityIntelligenceRequirementsPirApi#cloudforceOnePriorityList");
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
| **accountIdentifier** | **String**|  | |
| **cloudforceOnePriorityList** | [**CloudforceOnePriorityList**](CloudforceOnePriorityList.md)|  | |

### Return type

[**CloudforceOnePriorityList200Response**](CloudforceOnePriorityList200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List priorities response |  -  |
| **4XX** | List priorities response failure |  -  |

<a id="cloudforceOnePriorityNew"></a>
# **cloudforceOnePriorityNew**
> CloudforceOnePriorityNew200Response cloudforceOnePriorityNew(accountIdentifier, cloudforceOnePriorityEdit)

Create a New Priority Requirement

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriorityIntelligenceRequirementsPirApi;

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

    PriorityIntelligenceRequirementsPirApi apiInstance = new PriorityIntelligenceRequirementsPirApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    CloudforceOnePriorityEdit cloudforceOnePriorityEdit = new CloudforceOnePriorityEdit(); // CloudforceOnePriorityEdit | 
    try {
      CloudforceOnePriorityNew200Response result = apiInstance.cloudforceOnePriorityNew(accountIdentifier, cloudforceOnePriorityEdit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriorityIntelligenceRequirementsPirApi#cloudforceOnePriorityNew");
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
| **accountIdentifier** | **String**|  | |
| **cloudforceOnePriorityEdit** | [**CloudforceOnePriorityEdit**](CloudforceOnePriorityEdit.md)|  | |

### Return type

[**CloudforceOnePriorityNew200Response**](CloudforceOnePriorityNew200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create priority response |  -  |
| **4XX** | Create priority response  failure |  -  |

<a id="cloudforceOnePriorityQuota"></a>
# **cloudforceOnePriorityQuota**
> CloudforceOnePriorityQuota200Response cloudforceOnePriorityQuota(accountIdentifier)

Get Priority Intelligence Requirement Quota

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriorityIntelligenceRequirementsPirApi;

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

    PriorityIntelligenceRequirementsPirApi apiInstance = new PriorityIntelligenceRequirementsPirApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    try {
      CloudforceOnePriorityQuota200Response result = apiInstance.cloudforceOnePriorityQuota(accountIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriorityIntelligenceRequirementsPirApi#cloudforceOnePriorityQuota");
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
| **accountIdentifier** | **String**|  | |

### Return type

[**CloudforceOnePriorityQuota200Response**](CloudforceOnePriorityQuota200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get priority quota response |  -  |
| **4XX** | Get priority quota response failure |  -  |

<a id="cloudforceOnePriorityUpdate"></a>
# **cloudforceOnePriorityUpdate**
> CloudforceOneRequestNew200Response cloudforceOnePriorityUpdate(accountIdentifier, priorityIdentifer, cloudforceOnePriorityEdit)

Update a Priority Intelligence Requirement

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PriorityIntelligenceRequirementsPirApi;

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

    PriorityIntelligenceRequirementsPirApi apiInstance = new PriorityIntelligenceRequirementsPirApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    String priorityIdentifer = "priorityIdentifer_example"; // String | 
    CloudforceOnePriorityEdit cloudforceOnePriorityEdit = new CloudforceOnePriorityEdit(); // CloudforceOnePriorityEdit | 
    try {
      CloudforceOneRequestNew200Response result = apiInstance.cloudforceOnePriorityUpdate(accountIdentifier, priorityIdentifer, cloudforceOnePriorityEdit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriorityIntelligenceRequirementsPirApi#cloudforceOnePriorityUpdate");
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
| **accountIdentifier** | **String**|  | |
| **priorityIdentifer** | **String**|  | |
| **cloudforceOnePriorityEdit** | [**CloudforceOnePriorityEdit**](CloudforceOnePriorityEdit.md)|  | |

### Return type

[**CloudforceOneRequestNew200Response**](CloudforceOneRequestNew200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a priority response |  -  |
| **4XX** | Update a priority response failure |  -  |

