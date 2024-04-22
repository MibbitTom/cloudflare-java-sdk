# ZarazApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getZonesZoneIdentifierZarazConfig**](ZarazApi.md#getZonesZoneIdentifierZarazConfig) | **GET** /zones/{zone_id}/settings/zaraz/config | Get Zaraz configuration |
| [**getZonesZoneIdentifierZarazConfigHistory**](ZarazApi.md#getZonesZoneIdentifierZarazConfigHistory) | **GET** /zones/{zone_id}/settings/zaraz/history/configs | Get Zaraz historical configurations by ID(s) |
| [**getZonesZoneIdentifierZarazDefault**](ZarazApi.md#getZonesZoneIdentifierZarazDefault) | **GET** /zones/{zone_id}/settings/zaraz/default | Get default Zaraz configuration |
| [**getZonesZoneIdentifierZarazExport**](ZarazApi.md#getZonesZoneIdentifierZarazExport) | **GET** /zones/{zone_id}/settings/zaraz/export | Export Zaraz configuration |
| [**getZonesZoneIdentifierZarazHistory**](ZarazApi.md#getZonesZoneIdentifierZarazHistory) | **GET** /zones/{zone_id}/settings/zaraz/history | List Zaraz historical configuration records |
| [**getZonesZoneIdentifierZarazWorkflow**](ZarazApi.md#getZonesZoneIdentifierZarazWorkflow) | **GET** /zones/{zone_id}/settings/zaraz/workflow | Get Zaraz workflow |
| [**postZonesZoneIdentifierZarazPublish**](ZarazApi.md#postZonesZoneIdentifierZarazPublish) | **POST** /zones/{zone_id}/settings/zaraz/publish | Publish Zaraz preview configuration |
| [**putZonesZoneIdentifierZarazConfig**](ZarazApi.md#putZonesZoneIdentifierZarazConfig) | **PUT** /zones/{zone_id}/settings/zaraz/config | Update Zaraz configuration |
| [**putZonesZoneIdentifierZarazHistory**](ZarazApi.md#putZonesZoneIdentifierZarazHistory) | **PUT** /zones/{zone_id}/settings/zaraz/history | Restore Zaraz historical configuration by ID |
| [**putZonesZoneIdentifierZarazWorkflow**](ZarazApi.md#putZonesZoneIdentifierZarazWorkflow) | **PUT** /zones/{zone_id}/settings/zaraz/workflow | Update Zaraz workflow |


<a id="getZonesZoneIdentifierZarazConfig"></a>
# **getZonesZoneIdentifierZarazConfig**
> ZarazZarazConfigResponse getZonesZoneIdentifierZarazConfig(zoneId)

Get Zaraz configuration

Gets latest Zaraz configuration for a zone. It can be preview or published configuration, whichever was the last updated. Secret variables values will not be included.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZarazApi;

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

    ZarazApi apiInstance = new ZarazApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZarazZarazConfigResponse result = apiInstance.getZonesZoneIdentifierZarazConfig(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZarazApi#getZonesZoneIdentifierZarazConfig");
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

### Return type

[**ZarazZarazConfigResponse**](ZarazZarazConfigResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Zaraz configuration response |  -  |
| **4XX** | Get Zaraz configuration response failure |  -  |

<a id="getZonesZoneIdentifierZarazConfigHistory"></a>
# **getZonesZoneIdentifierZarazConfigHistory**
> ZarazZarazConfigHistoryResponse getZonesZoneIdentifierZarazConfigHistory(zoneId, ids)

Get Zaraz historical configurations by ID(s)

Gets a history of published Zaraz configurations by ID(s) for a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZarazApi;

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

    ZarazApi apiInstance = new ZarazApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    List<Integer> ids = Arrays.asList(); // List<Integer> | Comma separated list of Zaraz configuration IDs
    try {
      ZarazZarazConfigHistoryResponse result = apiInstance.getZonesZoneIdentifierZarazConfigHistory(zoneId, ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZarazApi#getZonesZoneIdentifierZarazConfigHistory");
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
| **ids** | [**List&lt;Integer&gt;**](Integer.md)| Comma separated list of Zaraz configuration IDs | |

### Return type

[**ZarazZarazConfigHistoryResponse**](ZarazZarazConfigHistoryResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Zaraz historical configurations by ID(s) response |  -  |
| **4XX** | Get Zaraz historical configurations by ID(s) failure |  -  |

<a id="getZonesZoneIdentifierZarazDefault"></a>
# **getZonesZoneIdentifierZarazDefault**
> ZarazZarazConfigResponse getZonesZoneIdentifierZarazDefault(zoneId)

Get default Zaraz configuration

Gets default Zaraz configuration for a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZarazApi;

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

    ZarazApi apiInstance = new ZarazApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZarazZarazConfigResponse result = apiInstance.getZonesZoneIdentifierZarazDefault(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZarazApi#getZonesZoneIdentifierZarazDefault");
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

### Return type

[**ZarazZarazConfigResponse**](ZarazZarazConfigResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Zaraz default configuration response |  -  |
| **4XX** | Get Zaraz default configuration response failure |  -  |

<a id="getZonesZoneIdentifierZarazExport"></a>
# **getZonesZoneIdentifierZarazExport**
> ZarazZarazConfigReturn getZonesZoneIdentifierZarazExport(zoneId)

Export Zaraz configuration

Exports full current published Zaraz configuration for a zone, secret variables included.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZarazApi;

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

    ZarazApi apiInstance = new ZarazApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZarazZarazConfigReturn result = apiInstance.getZonesZoneIdentifierZarazExport(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZarazApi#getZonesZoneIdentifierZarazExport");
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

### Return type

[**ZarazZarazConfigReturn**](ZarazZarazConfigReturn.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Zaraz configuration response |  * Content-Disposition -  <br>  |
| **4XX** | Get Zaraz configuration response failure |  -  |

<a id="getZonesZoneIdentifierZarazHistory"></a>
# **getZonesZoneIdentifierZarazHistory**
> ZarazZarazHistoryResponse getZonesZoneIdentifierZarazHistory(zoneId, offset, limit, sortField, sortOrder)

List Zaraz historical configuration records

Lists a history of published Zaraz configuration records for a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZarazApi;

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

    ZarazApi apiInstance = new ZarazApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    Integer offset = 0; // Integer | Ordinal number to start listing the results with. Default value is 0.
    Integer limit = 10; // Integer | Maximum amount of results to list. Default value is 10.
    String sortField = "id"; // String | The field to sort by. Default is updated_at.
    String sortOrder = "DESC"; // String | Sorting order. Default is DESC.
    try {
      ZarazZarazHistoryResponse result = apiInstance.getZonesZoneIdentifierZarazHistory(zoneId, offset, limit, sortField, sortOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZarazApi#getZonesZoneIdentifierZarazHistory");
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
| **offset** | **Integer**| Ordinal number to start listing the results with. Default value is 0. | [optional] |
| **limit** | **Integer**| Maximum amount of results to list. Default value is 10. | [optional] |
| **sortField** | **String**| The field to sort by. Default is updated_at. | [optional] [enum: id, user_id, description, created_at, updated_at] |
| **sortOrder** | **String**| Sorting order. Default is DESC. | [optional] [enum: DESC, ASC] |

### Return type

[**ZarazZarazHistoryResponse**](ZarazZarazHistoryResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Zaraz historical configuration records response |  -  |
| **4XX** | List Zaraz historical configuration records failure |  -  |

<a id="getZonesZoneIdentifierZarazWorkflow"></a>
# **getZonesZoneIdentifierZarazWorkflow**
> ZarazZarazWorkflowResponse getZonesZoneIdentifierZarazWorkflow(zoneId)

Get Zaraz workflow

Gets Zaraz workflow for a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZarazApi;

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

    ZarazApi apiInstance = new ZarazApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ZarazZarazWorkflowResponse result = apiInstance.getZonesZoneIdentifierZarazWorkflow(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZarazApi#getZonesZoneIdentifierZarazWorkflow");
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

### Return type

[**ZarazZarazWorkflowResponse**](ZarazZarazWorkflowResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Zaraz workflow response |  -  |
| **4XX** | Get Zaraz workflow response failure |  -  |

<a id="postZonesZoneIdentifierZarazPublish"></a>
# **postZonesZoneIdentifierZarazPublish**
> PostZonesZoneIdentifierZarazPublish200Response postZonesZoneIdentifierZarazPublish(zoneId, body)

Publish Zaraz preview configuration

Publish current Zaraz preview configuration for a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZarazApi;

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

    ZarazApi apiInstance = new ZarazApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String body = "body_example"; // String | 
    try {
      PostZonesZoneIdentifierZarazPublish200Response result = apiInstance.postZonesZoneIdentifierZarazPublish(zoneId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZarazApi#postZonesZoneIdentifierZarazPublish");
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
| **body** | **String**|  | [optional] |

### Return type

[**PostZonesZoneIdentifierZarazPublish200Response**](PostZonesZoneIdentifierZarazPublish200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Zaraz workflow response |  -  |
| **4XX** | Update Zaraz workflow response failure |  -  |

<a id="putZonesZoneIdentifierZarazConfig"></a>
# **putZonesZoneIdentifierZarazConfig**
> ZarazZarazConfigResponse putZonesZoneIdentifierZarazConfig(zoneId, zarazZarazConfigBody)

Update Zaraz configuration

Updates Zaraz configuration for a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZarazApi;

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

    ZarazApi apiInstance = new ZarazApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ZarazZarazConfigBody zarazZarazConfigBody = new ZarazZarazConfigBody(); // ZarazZarazConfigBody | 
    try {
      ZarazZarazConfigResponse result = apiInstance.putZonesZoneIdentifierZarazConfig(zoneId, zarazZarazConfigBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZarazApi#putZonesZoneIdentifierZarazConfig");
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
| **zarazZarazConfigBody** | [**ZarazZarazConfigBody**](ZarazZarazConfigBody.md)|  | |

### Return type

[**ZarazZarazConfigResponse**](ZarazZarazConfigResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Zaraz configuration response |  -  |
| **4XX** | Update Zaraz configuration response failure |  -  |

<a id="putZonesZoneIdentifierZarazHistory"></a>
# **putZonesZoneIdentifierZarazHistory**
> ZarazZarazConfigResponse putZonesZoneIdentifierZarazHistory(zoneId, body)

Restore Zaraz historical configuration by ID

Restores a historical published Zaraz configuration by ID for a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZarazApi;

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

    ZarazApi apiInstance = new ZarazApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    Integer body = 56; // Integer | 
    try {
      ZarazZarazConfigResponse result = apiInstance.putZonesZoneIdentifierZarazHistory(zoneId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZarazApi#putZonesZoneIdentifierZarazHistory");
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
| **body** | **Integer**|  | |

### Return type

[**ZarazZarazConfigResponse**](ZarazZarazConfigResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Restore Zaraz historical configuration by ID response |  -  |
| **4XX** | Restore Zaraz historical configuration by ID failure |  -  |

<a id="putZonesZoneIdentifierZarazWorkflow"></a>
# **putZonesZoneIdentifierZarazWorkflow**
> ZarazZarazWorkflowResponse putZonesZoneIdentifierZarazWorkflow(zoneId, body)

Update Zaraz workflow

Updates Zaraz workflow for a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZarazApi;

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

    ZarazApi apiInstance = new ZarazApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String body = "body_example"; // String | 
    try {
      ZarazZarazWorkflowResponse result = apiInstance.putZonesZoneIdentifierZarazWorkflow(zoneId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZarazApi#putZonesZoneIdentifierZarazWorkflow");
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
| **body** | **String**|  | |

### Return type

[**ZarazZarazWorkflowResponse**](ZarazZarazWorkflowResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Zaraz workflow response |  -  |
| **4XX** | Update Zaraz workflow response failure |  -  |

