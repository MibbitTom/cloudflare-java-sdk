# RequestForInformationRfiApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cloudforceOneRequestConstants**](RequestForInformationRfiApi.md#cloudforceOneRequestConstants) | **GET** /accounts/{account_identifier}/cloudforce-one/requests/constants | Get Request Priority, Status, and TLP constants |
| [**cloudforceOneRequestDelete**](RequestForInformationRfiApi.md#cloudforceOneRequestDelete) | **DELETE** /accounts/{account_identifier}/cloudforce-one/requests/{request_identifier} | Delete a Request |
| [**cloudforceOneRequestGet**](RequestForInformationRfiApi.md#cloudforceOneRequestGet) | **GET** /accounts/{account_identifier}/cloudforce-one/requests/{request_identifier} | Get a Request |
| [**cloudforceOneRequestList**](RequestForInformationRfiApi.md#cloudforceOneRequestList) | **POST** /accounts/{account_identifier}/cloudforce-one/requests | List Requests |
| [**cloudforceOneRequestMessageDelete**](RequestForInformationRfiApi.md#cloudforceOneRequestMessageDelete) | **DELETE** /accounts/{account_identifier}/cloudforce-one/requests/{request_identifier}/message/{message_identifer} | Delete a Request Message |
| [**cloudforceOneRequestMessageList**](RequestForInformationRfiApi.md#cloudforceOneRequestMessageList) | **POST** /accounts/{account_identifier}/cloudforce-one/requests/{request_identifier}/message | List Request Messages |
| [**cloudforceOneRequestMessageNew**](RequestForInformationRfiApi.md#cloudforceOneRequestMessageNew) | **POST** /accounts/{account_identifier}/cloudforce-one/requests/{request_identifier}/message/new | Create a New Request Message |
| [**cloudforceOneRequestMessageUpdate**](RequestForInformationRfiApi.md#cloudforceOneRequestMessageUpdate) | **PUT** /accounts/{account_identifier}/cloudforce-one/requests/{request_identifier}/message/{message_identifer} | Update a Request Message |
| [**cloudforceOneRequestNew**](RequestForInformationRfiApi.md#cloudforceOneRequestNew) | **POST** /accounts/{account_identifier}/cloudforce-one/requests/new | Create a New Request |
| [**cloudforceOneRequestQuota**](RequestForInformationRfiApi.md#cloudforceOneRequestQuota) | **GET** /accounts/{account_identifier}/cloudforce-one/requests/quota | Get Request Quota |
| [**cloudforceOneRequestTypes**](RequestForInformationRfiApi.md#cloudforceOneRequestTypes) | **GET** /accounts/{account_identifier}/cloudforce-one/requests/types | Get Request Types |
| [**cloudforceOneRequestUpdate**](RequestForInformationRfiApi.md#cloudforceOneRequestUpdate) | **PUT** /accounts/{account_identifier}/cloudforce-one/requests/{request_identifier} | Update a Request |


<a id="cloudforceOneRequestConstants"></a>
# **cloudforceOneRequestConstants**
> CloudforceOneRequestConstants200Response cloudforceOneRequestConstants(accountIdentifier)

Get Request Priority, Status, and TLP constants

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RequestForInformationRfiApi;

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

    RequestForInformationRfiApi apiInstance = new RequestForInformationRfiApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    try {
      CloudforceOneRequestConstants200Response result = apiInstance.cloudforceOneRequestConstants(accountIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestForInformationRfiApi#cloudforceOneRequestConstants");
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

[**CloudforceOneRequestConstants200Response**](CloudforceOneRequestConstants200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get request constants response |  -  |
| **4XX** | Get request constants response failure |  -  |

<a id="cloudforceOneRequestDelete"></a>
# **cloudforceOneRequestDelete**
> CloudforceOneApiResponseCommon cloudforceOneRequestDelete(accountIdentifier, requestIdentifier)

Delete a Request

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RequestForInformationRfiApi;

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

    RequestForInformationRfiApi apiInstance = new RequestForInformationRfiApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    String requestIdentifier = "requestIdentifier_example"; // String | 
    try {
      CloudforceOneApiResponseCommon result = apiInstance.cloudforceOneRequestDelete(accountIdentifier, requestIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestForInformationRfiApi#cloudforceOneRequestDelete");
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
| **requestIdentifier** | **String**|  | |

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
| **200** | Delete a request response |  -  |
| **4XX** | Create response failure |  -  |

<a id="cloudforceOneRequestGet"></a>
# **cloudforceOneRequestGet**
> CloudforceOneRequestNew200Response cloudforceOneRequestGet(accountIdentifier, requestIdentifier)

Get a Request

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RequestForInformationRfiApi;

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

    RequestForInformationRfiApi apiInstance = new RequestForInformationRfiApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    String requestIdentifier = "requestIdentifier_example"; // String | 
    try {
      CloudforceOneRequestNew200Response result = apiInstance.cloudforceOneRequestGet(accountIdentifier, requestIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestForInformationRfiApi#cloudforceOneRequestGet");
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
| **requestIdentifier** | **String**|  | |

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
| **200** | Get a request response |  -  |
| **4XX** | Get a request response failure |  -  |

<a id="cloudforceOneRequestList"></a>
# **cloudforceOneRequestList**
> CloudforceOneRequestList200Response cloudforceOneRequestList(accountIdentifier, cloudforceOneRequestList)

List Requests

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RequestForInformationRfiApi;

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

    RequestForInformationRfiApi apiInstance = new RequestForInformationRfiApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    CloudforceOneRequestList cloudforceOneRequestList = new CloudforceOneRequestList(); // CloudforceOneRequestList | 
    try {
      CloudforceOneRequestList200Response result = apiInstance.cloudforceOneRequestList(accountIdentifier, cloudforceOneRequestList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestForInformationRfiApi#cloudforceOneRequestList");
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
| **cloudforceOneRequestList** | [**CloudforceOneRequestList**](CloudforceOneRequestList.md)|  | |

### Return type

[**CloudforceOneRequestList200Response**](CloudforceOneRequestList200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List requests response |  -  |
| **4XX** | Create response failure |  -  |

<a id="cloudforceOneRequestMessageDelete"></a>
# **cloudforceOneRequestMessageDelete**
> CloudforceOneApiResponseCommon cloudforceOneRequestMessageDelete(accountIdentifier, requestIdentifier, messageIdentifer)

Delete a Request Message

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RequestForInformationRfiApi;

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

    RequestForInformationRfiApi apiInstance = new RequestForInformationRfiApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    String requestIdentifier = "requestIdentifier_example"; // String | 
    Integer messageIdentifer = 56; // Integer | 
    try {
      CloudforceOneApiResponseCommon result = apiInstance.cloudforceOneRequestMessageDelete(accountIdentifier, requestIdentifier, messageIdentifer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestForInformationRfiApi#cloudforceOneRequestMessageDelete");
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
| **requestIdentifier** | **String**|  | |
| **messageIdentifer** | **Integer**|  | |

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
| **200** | Delete a request message response |  -  |
| **4XX** | Delete request message response failure |  -  |

<a id="cloudforceOneRequestMessageList"></a>
# **cloudforceOneRequestMessageList**
> CloudforceOneRequestMessageList200Response cloudforceOneRequestMessageList(accountIdentifier, requestIdentifier, cloudforceOneRequestMessageList)

List Request Messages

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RequestForInformationRfiApi;

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

    RequestForInformationRfiApi apiInstance = new RequestForInformationRfiApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    String requestIdentifier = "requestIdentifier_example"; // String | 
    CloudforceOneRequestMessageList cloudforceOneRequestMessageList = new CloudforceOneRequestMessageList(); // CloudforceOneRequestMessageList | 
    try {
      CloudforceOneRequestMessageList200Response result = apiInstance.cloudforceOneRequestMessageList(accountIdentifier, requestIdentifier, cloudforceOneRequestMessageList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestForInformationRfiApi#cloudforceOneRequestMessageList");
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
| **requestIdentifier** | **String**|  | |
| **cloudforceOneRequestMessageList** | [**CloudforceOneRequestMessageList**](CloudforceOneRequestMessageList.md)|  | |

### Return type

[**CloudforceOneRequestMessageList200Response**](CloudforceOneRequestMessageList200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List request messages response |  -  |
| **4XX** | List requests message response failure |  -  |

<a id="cloudforceOneRequestMessageNew"></a>
# **cloudforceOneRequestMessageNew**
> CloudforceOneRequestMessageNew200Response cloudforceOneRequestMessageNew(accountIdentifier, requestIdentifier, cloudforceOneRequestMessageEdit)

Create a New Request Message

Creating a request adds the request into the Cloudforce One queue for analysis. In addition to the content, a short title, type, priority, and releasability should be provided. If one is not provided a default will be assigned.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RequestForInformationRfiApi;

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

    RequestForInformationRfiApi apiInstance = new RequestForInformationRfiApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    String requestIdentifier = "requestIdentifier_example"; // String | 
    CloudforceOneRequestMessageEdit cloudforceOneRequestMessageEdit = new CloudforceOneRequestMessageEdit(); // CloudforceOneRequestMessageEdit | 
    try {
      CloudforceOneRequestMessageNew200Response result = apiInstance.cloudforceOneRequestMessageNew(accountIdentifier, requestIdentifier, cloudforceOneRequestMessageEdit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestForInformationRfiApi#cloudforceOneRequestMessageNew");
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
| **requestIdentifier** | **String**|  | |
| **cloudforceOneRequestMessageEdit** | [**CloudforceOneRequestMessageEdit**](CloudforceOneRequestMessageEdit.md)|  | |

### Return type

[**CloudforceOneRequestMessageNew200Response**](CloudforceOneRequestMessageNew200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create request response |  -  |
| **4XX** | Create response failure |  -  |

<a id="cloudforceOneRequestMessageUpdate"></a>
# **cloudforceOneRequestMessageUpdate**
> CloudforceOneRequestMessageNew200Response cloudforceOneRequestMessageUpdate(accountIdentifier, requestIdentifier, messageIdentifer, cloudforceOneRequestEdit)

Update a Request Message

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RequestForInformationRfiApi;

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

    RequestForInformationRfiApi apiInstance = new RequestForInformationRfiApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    String requestIdentifier = "requestIdentifier_example"; // String | 
    Integer messageIdentifer = 56; // Integer | 
    CloudforceOneRequestEdit cloudforceOneRequestEdit = new CloudforceOneRequestEdit(); // CloudforceOneRequestEdit | 
    try {
      CloudforceOneRequestMessageNew200Response result = apiInstance.cloudforceOneRequestMessageUpdate(accountIdentifier, requestIdentifier, messageIdentifer, cloudforceOneRequestEdit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestForInformationRfiApi#cloudforceOneRequestMessageUpdate");
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
| **requestIdentifier** | **String**|  | |
| **messageIdentifer** | **Integer**|  | |
| **cloudforceOneRequestEdit** | [**CloudforceOneRequestEdit**](CloudforceOneRequestEdit.md)|  | |

### Return type

[**CloudforceOneRequestMessageNew200Response**](CloudforceOneRequestMessageNew200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a request messeage response |  -  |
| **4XX** | Update request message response failure |  -  |

<a id="cloudforceOneRequestNew"></a>
# **cloudforceOneRequestNew**
> CloudforceOneRequestNew200Response cloudforceOneRequestNew(accountIdentifier, cloudforceOneRequestEdit)

Create a New Request

Creating a request adds the request into the Cloudforce One queue for analysis. In addition to the content, a short title, type, priority, and releasability should be provided. If one is not provided a default will be assigned.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RequestForInformationRfiApi;

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

    RequestForInformationRfiApi apiInstance = new RequestForInformationRfiApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    CloudforceOneRequestEdit cloudforceOneRequestEdit = new CloudforceOneRequestEdit(); // CloudforceOneRequestEdit | 
    try {
      CloudforceOneRequestNew200Response result = apiInstance.cloudforceOneRequestNew(accountIdentifier, cloudforceOneRequestEdit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestForInformationRfiApi#cloudforceOneRequestNew");
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
| **cloudforceOneRequestEdit** | [**CloudforceOneRequestEdit**](CloudforceOneRequestEdit.md)|  | |

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
| **200** | Create request response |  -  |
| **4XX** | Create response failure |  -  |

<a id="cloudforceOneRequestQuota"></a>
# **cloudforceOneRequestQuota**
> CloudforceOnePriorityQuota200Response cloudforceOneRequestQuota(accountIdentifier)

Get Request Quota

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RequestForInformationRfiApi;

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

    RequestForInformationRfiApi apiInstance = new RequestForInformationRfiApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    try {
      CloudforceOnePriorityQuota200Response result = apiInstance.cloudforceOneRequestQuota(accountIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestForInformationRfiApi#cloudforceOneRequestQuota");
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
| **200** | Get request quota response |  -  |
| **4XX** | Get request quota response failure |  -  |

<a id="cloudforceOneRequestTypes"></a>
# **cloudforceOneRequestTypes**
> CloudforceOneRequestTypes200Response cloudforceOneRequestTypes(accountIdentifier)

Get Request Types

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RequestForInformationRfiApi;

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

    RequestForInformationRfiApi apiInstance = new RequestForInformationRfiApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    try {
      CloudforceOneRequestTypes200Response result = apiInstance.cloudforceOneRequestTypes(accountIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestForInformationRfiApi#cloudforceOneRequestTypes");
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

[**CloudforceOneRequestTypes200Response**](CloudforceOneRequestTypes200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get request types response |  -  |
| **4XX** | Get request types response failure |  -  |

<a id="cloudforceOneRequestUpdate"></a>
# **cloudforceOneRequestUpdate**
> CloudforceOneRequestNew200Response cloudforceOneRequestUpdate(accountIdentifier, requestIdentifier, cloudforceOneRequestEdit)

Update a Request

Updating a request alters the request in the Cloudforce One queue. This API may be used to update any attributes of the request after the initial submission. Only fields that you choose to update need to be add to the request body

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.RequestForInformationRfiApi;

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

    RequestForInformationRfiApi apiInstance = new RequestForInformationRfiApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    String requestIdentifier = "requestIdentifier_example"; // String | 
    CloudforceOneRequestEdit cloudforceOneRequestEdit = new CloudforceOneRequestEdit(); // CloudforceOneRequestEdit | 
    try {
      CloudforceOneRequestNew200Response result = apiInstance.cloudforceOneRequestUpdate(accountIdentifier, requestIdentifier, cloudforceOneRequestEdit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestForInformationRfiApi#cloudforceOneRequestUpdate");
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
| **requestIdentifier** | **String**|  | |
| **cloudforceOneRequestEdit** | [**CloudforceOneRequestEdit**](CloudforceOneRequestEdit.md)|  | |

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
| **200** | Update a request response |  -  |
| **4XX** | Update request response failure |  -  |

