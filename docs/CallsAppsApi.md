# CallsAppsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callsAppsCreateANewApp**](CallsAppsApi.md#callsAppsCreateANewApp) | **POST** /accounts/{account_id}/calls/apps | Create a new app |
| [**callsAppsDeleteApp**](CallsAppsApi.md#callsAppsDeleteApp) | **DELETE** /accounts/{account_id}/calls/apps/{app_id} | Delete app |
| [**callsAppsList**](CallsAppsApi.md#callsAppsList) | **GET** /accounts/{account_id}/calls/apps | List apps |
| [**callsAppsRetrieveAppDetails**](CallsAppsApi.md#callsAppsRetrieveAppDetails) | **GET** /accounts/{account_id}/calls/apps/{app_id} | Retrieve app details |
| [**callsAppsUpdateAppDetails**](CallsAppsApi.md#callsAppsUpdateAppDetails) | **PUT** /accounts/{account_id}/calls/apps/{app_id} | Edit app details |


<a id="callsAppsCreateANewApp"></a>
# **callsAppsCreateANewApp**
> CallsAppResponseSingleWithSecret callsAppsCreateANewApp(accountId, callsAppEditableFields)

Create a new app

Creates a new Cloudflare calls app. An app is an unique enviroment where each Session can access all Tracks within the app.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallsAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    CallsAppsApi apiInstance = new CallsAppsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    CallsAppEditableFields callsAppEditableFields = new CallsAppEditableFields(); // CallsAppEditableFields | 
    try {
      CallsAppResponseSingleWithSecret result = apiInstance.callsAppsCreateANewApp(accountId, callsAppEditableFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsAppsApi#callsAppsCreateANewApp");
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
| **callsAppEditableFields** | [**CallsAppEditableFields**](CallsAppEditableFields.md)|  | |

### Return type

[**CallsAppResponseSingleWithSecret**](CallsAppResponseSingleWithSecret.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created a new app |  -  |

<a id="callsAppsDeleteApp"></a>
# **callsAppsDeleteApp**
> CallsAppResponseSingle callsAppsDeleteApp(appId, accountId)

Delete app

Deletes an app from Cloudflare Calls

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallsAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    CallsAppsApi apiInstance = new CallsAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      CallsAppResponseSingle result = apiInstance.callsAppsDeleteApp(appId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsAppsApi#callsAppsDeleteApp");
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
| **appId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**CallsAppResponseSingle**](CallsAppResponseSingle.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete app response |  -  |
| **4XX** | Delete app response failure |  -  |

<a id="callsAppsList"></a>
# **callsAppsList**
> CallsAppResponseCollection callsAppsList(accountId)

List apps

Lists all apps in the Cloudflare account

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallsAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    CallsAppsApi apiInstance = new CallsAppsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      CallsAppResponseCollection result = apiInstance.callsAppsList(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsAppsApi#callsAppsList");
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

[**CallsAppResponseCollection**](CallsAppResponseCollection.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List apps response |  -  |
| **4XX** | List videos response failure |  -  |

<a id="callsAppsRetrieveAppDetails"></a>
# **callsAppsRetrieveAppDetails**
> CallsAppResponseSingle callsAppsRetrieveAppDetails(appId, accountId)

Retrieve app details

Fetches details for a single Calls app.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallsAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    CallsAppsApi apiInstance = new CallsAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      CallsAppResponseSingle result = apiInstance.callsAppsRetrieveAppDetails(appId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsAppsApi#callsAppsRetrieveAppDetails");
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
| **appId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**CallsAppResponseSingle**](CallsAppResponseSingle.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve app details response |  -  |
| **4XX** | Retrieve video details response failure |  -  |

<a id="callsAppsUpdateAppDetails"></a>
# **callsAppsUpdateAppDetails**
> CallsAppResponseSingle callsAppsUpdateAppDetails(appId, accountId, callsAppEditableFields)

Edit app details

Edit details for a single app.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallsAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    CallsAppsApi apiInstance = new CallsAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    CallsAppEditableFields callsAppEditableFields = new CallsAppEditableFields(); // CallsAppEditableFields | 
    try {
      CallsAppResponseSingle result = apiInstance.callsAppsUpdateAppDetails(appId, accountId, callsAppEditableFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsAppsApi#callsAppsUpdateAppDetails");
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
| **appId** | **String**|  | |
| **accountId** | **String**|  | |
| **callsAppEditableFields** | [**CallsAppEditableFields**](CallsAppEditableFields.md)|  | |

### Return type

[**CallsAppResponseSingle**](CallsAppResponseSingle.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Edit app details response |  -  |
| **4XX** | Edit app details response failure |  -  |

