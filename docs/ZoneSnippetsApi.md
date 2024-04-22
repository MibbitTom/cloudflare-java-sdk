# ZoneSnippetsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneSnippets**](ZoneSnippetsApi.md#zoneSnippets) | **GET** /zones/{zone_identifier}/snippets | All Snippets |
| [**zoneSnippetsSnippet**](ZoneSnippetsApi.md#zoneSnippetsSnippet) | **GET** /zones/{zone_identifier}/snippets/{snippet_name} | Snippet |
| [**zoneSnippetsSnippetContent**](ZoneSnippetsApi.md#zoneSnippetsSnippetContent) | **GET** /zones/{zone_identifier}/snippets/{snippet_name}/content | Snippet Content |
| [**zoneSnippetsSnippetDelete**](ZoneSnippetsApi.md#zoneSnippetsSnippetDelete) | **DELETE** /zones/{zone_identifier}/snippets/{snippet_name} | Delete Snippet |
| [**zoneSnippetsSnippetPut**](ZoneSnippetsApi.md#zoneSnippetsSnippetPut) | **PUT** /zones/{zone_identifier}/snippets/{snippet_name} | Put Snippet |
| [**zoneSnippetsSnippetRules**](ZoneSnippetsApi.md#zoneSnippetsSnippetRules) | **GET** /zones/{zone_identifier}/snippets/snippet_rules | Rules |
| [**zoneSnippetsSnippetRulesPut**](ZoneSnippetsApi.md#zoneSnippetsSnippetRulesPut) | **PUT** /zones/{zone_identifier}/snippets/snippet_rules | Put Rules |


<a id="zoneSnippets"></a>
# **zoneSnippets**
> ZoneSnippets200Response zoneSnippets(zoneIdentifier)

All Snippets

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneSnippetsApi;

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

    ZoneSnippetsApi apiInstance = new ZoneSnippetsApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      ZoneSnippets200Response result = apiInstance.zoneSnippets(zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSnippetsApi#zoneSnippets");
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
| **zoneIdentifier** | **String**|  | |

### Return type

[**ZoneSnippets200Response**](ZoneSnippets200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Snippets response |  -  |
| **4XX** | Snippet response failure |  -  |
| **5XX** | Snippet response failure |  -  |

<a id="zoneSnippetsSnippet"></a>
# **zoneSnippetsSnippet**
> ZoneSnippetsSnippet200Response zoneSnippetsSnippet(zoneIdentifier, snippetName)

Snippet

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneSnippetsApi;

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

    ZoneSnippetsApi apiInstance = new ZoneSnippetsApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    String snippetName = "snippetName_example"; // String | 
    try {
      ZoneSnippetsSnippet200Response result = apiInstance.zoneSnippetsSnippet(zoneIdentifier, snippetName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSnippetsApi#zoneSnippetsSnippet");
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
| **zoneIdentifier** | **String**|  | |
| **snippetName** | **String**|  | |

### Return type

[**ZoneSnippetsSnippet200Response**](ZoneSnippetsSnippet200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Snippet response |  -  |
| **4XX** | Snippet response failure |  -  |
| **5XX** | Snippet response failure |  -  |

<a id="zoneSnippetsSnippetContent"></a>
# **zoneSnippetsSnippetContent**
> ZoneSnippetsSnippetContent200Response zoneSnippetsSnippetContent(zoneIdentifier, snippetName)

Snippet Content

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneSnippetsApi;

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

    ZoneSnippetsApi apiInstance = new ZoneSnippetsApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    String snippetName = "snippetName_example"; // String | 
    try {
      ZoneSnippetsSnippetContent200Response result = apiInstance.zoneSnippetsSnippetContent(zoneIdentifier, snippetName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSnippetsApi#zoneSnippetsSnippetContent");
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
| **zoneIdentifier** | **String**|  | |
| **snippetName** | **String**|  | |

### Return type

[**ZoneSnippetsSnippetContent200Response**](ZoneSnippetsSnippetContent200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: multipart/form-data, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Snippet response |  -  |
| **4XX** | Snippet response failure |  -  |
| **5XX** | Snippet response failure |  -  |

<a id="zoneSnippetsSnippetDelete"></a>
# **zoneSnippetsSnippetDelete**
> SnippetsApiApiResponseCommon zoneSnippetsSnippetDelete(zoneIdentifier, snippetName)

Delete Snippet

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneSnippetsApi;

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

    ZoneSnippetsApi apiInstance = new ZoneSnippetsApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    String snippetName = "snippetName_example"; // String | 
    try {
      SnippetsApiApiResponseCommon result = apiInstance.zoneSnippetsSnippetDelete(zoneIdentifier, snippetName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSnippetsApi#zoneSnippetsSnippetDelete");
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
| **zoneIdentifier** | **String**|  | |
| **snippetName** | **String**|  | |

### Return type

[**SnippetsApiApiResponseCommon**](SnippetsApiApiResponseCommon.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Snippet response |  -  |
| **4XX** | Snippet response failure |  -  |
| **5XX** | Snippet response failure |  -  |

<a id="zoneSnippetsSnippetPut"></a>
# **zoneSnippetsSnippetPut**
> ZoneSnippetsSnippet200Response zoneSnippetsSnippetPut(zoneIdentifier, snippetName, files, metadata)

Put Snippet

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneSnippetsApi;

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

    ZoneSnippetsApi apiInstance = new ZoneSnippetsApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    String snippetName = "snippetName_example"; // String | 
    String files = "files_example"; // String | Content files of uploaded snippet
    ZoneSnippetsSnippetPutRequestMetadata metadata = new ZoneSnippetsSnippetPutRequestMetadata(); // ZoneSnippetsSnippetPutRequestMetadata | 
    try {
      ZoneSnippetsSnippet200Response result = apiInstance.zoneSnippetsSnippetPut(zoneIdentifier, snippetName, files, metadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSnippetsApi#zoneSnippetsSnippetPut");
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
| **zoneIdentifier** | **String**|  | |
| **snippetName** | **String**|  | |
| **files** | **String**| Content files of uploaded snippet | [optional] |
| **metadata** | [**ZoneSnippetsSnippetPutRequestMetadata**](ZoneSnippetsSnippetPutRequestMetadata.md)|  | [optional] |

### Return type

[**ZoneSnippetsSnippet200Response**](ZoneSnippetsSnippet200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Snippet response |  -  |
| **4XX** | Snippet response failure |  -  |
| **5XX** | Snippet response failure |  -  |

<a id="zoneSnippetsSnippetRules"></a>
# **zoneSnippetsSnippetRules**
> ZoneSnippetsSnippetRules200Response zoneSnippetsSnippetRules(zoneIdentifier)

Rules

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneSnippetsApi;

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

    ZoneSnippetsApi apiInstance = new ZoneSnippetsApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      ZoneSnippetsSnippetRules200Response result = apiInstance.zoneSnippetsSnippetRules(zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSnippetsApi#zoneSnippetsSnippetRules");
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
| **zoneIdentifier** | **String**|  | |

### Return type

[**ZoneSnippetsSnippetRules200Response**](ZoneSnippetsSnippetRules200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Snippets rules response |  -  |
| **4XX** | Snippet response failure |  -  |
| **5XX** | Snippet response failure |  -  |

<a id="zoneSnippetsSnippetRulesPut"></a>
# **zoneSnippetsSnippetRulesPut**
> ZoneSnippetsSnippetRules200Response zoneSnippetsSnippetRulesPut(zoneIdentifier, zoneSnippetsSnippetRulesPutRequest)

Put Rules

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneSnippetsApi;

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

    ZoneSnippetsApi apiInstance = new ZoneSnippetsApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    ZoneSnippetsSnippetRulesPutRequest zoneSnippetsSnippetRulesPutRequest = new ZoneSnippetsSnippetRulesPutRequest(); // ZoneSnippetsSnippetRulesPutRequest | 
    try {
      ZoneSnippetsSnippetRules200Response result = apiInstance.zoneSnippetsSnippetRulesPut(zoneIdentifier, zoneSnippetsSnippetRulesPutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneSnippetsApi#zoneSnippetsSnippetRulesPut");
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
| **zoneIdentifier** | **String**|  | |
| **zoneSnippetsSnippetRulesPutRequest** | [**ZoneSnippetsSnippetRulesPutRequest**](ZoneSnippetsSnippetRulesPutRequest.md)|  | [optional] |

### Return type

[**ZoneSnippetsSnippetRules200Response**](ZoneSnippetsSnippetRules200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Snippets rules response |  -  |
| **4XX** | Snippet response failure |  -  |
| **5XX** | Snippet response failure |  -  |

