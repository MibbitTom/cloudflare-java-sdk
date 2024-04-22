# PageRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pageRulesCreateAPageRule**](PageRulesApi.md#pageRulesCreateAPageRule) | **POST** /zones/{zone_id}/pagerules | Create a Page Rule |
| [**pageRulesDeleteAPageRule**](PageRulesApi.md#pageRulesDeleteAPageRule) | **DELETE** /zones/{zone_id}/pagerules/{pagerule_id} | Delete a Page Rule |
| [**pageRulesEditAPageRule**](PageRulesApi.md#pageRulesEditAPageRule) | **PATCH** /zones/{zone_id}/pagerules/{pagerule_id} | Edit a Page Rule |
| [**pageRulesGetAPageRule**](PageRulesApi.md#pageRulesGetAPageRule) | **GET** /zones/{zone_id}/pagerules/{pagerule_id} | Get a Page Rule |
| [**pageRulesListPageRules**](PageRulesApi.md#pageRulesListPageRules) | **GET** /zones/{zone_id}/pagerules | List Page Rules |
| [**pageRulesUpdateAPageRule**](PageRulesApi.md#pageRulesUpdateAPageRule) | **PUT** /zones/{zone_id}/pagerules/{pagerule_id} | Update a Page Rule |


<a id="pageRulesCreateAPageRule"></a>
# **pageRulesCreateAPageRule**
> ZonesPageruleResponseSingle pageRulesCreateAPageRule(zoneId, pageRulesCreateAPageRuleRequest)

Create a Page Rule

Creates a new Page Rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageRulesApi;

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

    PageRulesApi apiInstance = new PageRulesApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    PageRulesCreateAPageRuleRequest pageRulesCreateAPageRuleRequest = new PageRulesCreateAPageRuleRequest(); // PageRulesCreateAPageRuleRequest | 
    try {
      ZonesPageruleResponseSingle result = apiInstance.pageRulesCreateAPageRule(zoneId, pageRulesCreateAPageRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageRulesApi#pageRulesCreateAPageRule");
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
| **zoneId** | **String**|  | |
| **pageRulesCreateAPageRuleRequest** | [**PageRulesCreateAPageRuleRequest**](PageRulesCreateAPageRuleRequest.md)|  | |

### Return type

[**ZonesPageruleResponseSingle**](ZonesPageruleResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a Page Rule response |  -  |
| **4XX** | Create a Page Rule response failure |  -  |

<a id="pageRulesDeleteAPageRule"></a>
# **pageRulesDeleteAPageRule**
> ZonesSchemasApiResponseSingleId pageRulesDeleteAPageRule(pageruleId, zoneId)

Delete a Page Rule

Deletes an existing Page Rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageRulesApi;

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

    PageRulesApi apiInstance = new PageRulesApi(defaultClient);
    String pageruleId = "pageruleId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      ZonesSchemasApiResponseSingleId result = apiInstance.pageRulesDeleteAPageRule(pageruleId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageRulesApi#pageRulesDeleteAPageRule");
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
| **pageruleId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**ZonesSchemasApiResponseSingleId**](ZonesSchemasApiResponseSingleId.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a Page Rule response |  -  |
| **4XX** | Delete a Page Rule response failure |  -  |

<a id="pageRulesEditAPageRule"></a>
# **pageRulesEditAPageRule**
> ZonesPageruleResponseSingle pageRulesEditAPageRule(pageruleId, zoneId, pageRulesEditAPageRuleRequest)

Edit a Page Rule

Updates one or more fields of an existing Page Rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageRulesApi;

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

    PageRulesApi apiInstance = new PageRulesApi(defaultClient);
    String pageruleId = "pageruleId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    PageRulesEditAPageRuleRequest pageRulesEditAPageRuleRequest = new PageRulesEditAPageRuleRequest(); // PageRulesEditAPageRuleRequest | 
    try {
      ZonesPageruleResponseSingle result = apiInstance.pageRulesEditAPageRule(pageruleId, zoneId, pageRulesEditAPageRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageRulesApi#pageRulesEditAPageRule");
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
| **pageruleId** | **String**|  | |
| **zoneId** | **String**|  | |
| **pageRulesEditAPageRuleRequest** | [**PageRulesEditAPageRuleRequest**](PageRulesEditAPageRuleRequest.md)|  | |

### Return type

[**ZonesPageruleResponseSingle**](ZonesPageruleResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Edit a Page Rule response |  -  |
| **4XX** | Edit a Page Rule response failure |  -  |

<a id="pageRulesGetAPageRule"></a>
# **pageRulesGetAPageRule**
> ZonesPageruleResponseSingle pageRulesGetAPageRule(pageruleId, zoneId)

Get a Page Rule

Fetches the details of a Page Rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageRulesApi;

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

    PageRulesApi apiInstance = new PageRulesApi(defaultClient);
    String pageruleId = "pageruleId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      ZonesPageruleResponseSingle result = apiInstance.pageRulesGetAPageRule(pageruleId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageRulesApi#pageRulesGetAPageRule");
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
| **pageruleId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**ZonesPageruleResponseSingle**](ZonesPageruleResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a Page Rule response |  -  |
| **4XX** | Get a Page Rule response failure |  -  |

<a id="pageRulesListPageRules"></a>
# **pageRulesListPageRules**
> ZonesPageruleResponseCollection pageRulesListPageRules(zoneId, order, direction, match, status)

List Page Rules

Fetches Page Rules in a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageRulesApi;

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

    PageRulesApi apiInstance = new PageRulesApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String order = "status"; // String | 
    String direction = "asc"; // String | 
    String match = "any"; // String | 
    String status = "active"; // String | 
    try {
      ZonesPageruleResponseCollection result = apiInstance.pageRulesListPageRules(zoneId, order, direction, match, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageRulesApi#pageRulesListPageRules");
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
| **zoneId** | **String**|  | |
| **order** | **String**|  | [optional] [default to priority] [enum: status, priority] |
| **direction** | **String**|  | [optional] [default to desc] [enum: asc, desc] |
| **match** | **String**|  | [optional] [default to all] [enum: any, all] |
| **status** | **String**|  | [optional] [default to disabled] [enum: active, disabled] |

### Return type

[**ZonesPageruleResponseCollection**](ZonesPageruleResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Page Rules response |  -  |
| **4XX** | List Page Rules response failure |  -  |

<a id="pageRulesUpdateAPageRule"></a>
# **pageRulesUpdateAPageRule**
> ZonesPageruleResponseSingle pageRulesUpdateAPageRule(pageruleId, zoneId, pageRulesCreateAPageRuleRequest)

Update a Page Rule

Replaces the configuration of an existing Page Rule. The configuration of the updated Page Rule will exactly match the data passed in the API request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageRulesApi;

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

    PageRulesApi apiInstance = new PageRulesApi(defaultClient);
    String pageruleId = "pageruleId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    PageRulesCreateAPageRuleRequest pageRulesCreateAPageRuleRequest = new PageRulesCreateAPageRuleRequest(); // PageRulesCreateAPageRuleRequest | 
    try {
      ZonesPageruleResponseSingle result = apiInstance.pageRulesUpdateAPageRule(pageruleId, zoneId, pageRulesCreateAPageRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageRulesApi#pageRulesUpdateAPageRule");
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
| **pageruleId** | **String**|  | |
| **zoneId** | **String**|  | |
| **pageRulesCreateAPageRuleRequest** | [**PageRulesCreateAPageRuleRequest**](PageRulesCreateAPageRuleRequest.md)|  | |

### Return type

[**ZonesPageruleResponseSingle**](ZonesPageruleResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a Page Rule response |  -  |
| **4XX** | Update a Page Rule response failure |  -  |

