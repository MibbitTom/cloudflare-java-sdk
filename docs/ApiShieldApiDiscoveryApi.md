# ApiShieldApiDiscoveryApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone**](ApiShieldApiDiscoveryApi.md#apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone) | **GET** /zones/{zone_id}/api_gateway/discovery/operations | Retrieve discovered operations on a zone |
| [**apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZoneAsOpenapi**](ApiShieldApiDiscoveryApi.md#apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZoneAsOpenapi) | **GET** /zones/{zone_id}/api_gateway/discovery | Retrieve discovered operations on a zone rendered as OpenAPI schemas |
| [**apiShieldApiPatchDiscoveredOperation**](ApiShieldApiDiscoveryApi.md#apiShieldApiPatchDiscoveredOperation) | **PATCH** /zones/{zone_id}/api_gateway/discovery/operations/{operation_id} | Patch discovered operation |
| [**apiShieldApiPatchDiscoveredOperations**](ApiShieldApiDiscoveryApi.md#apiShieldApiPatchDiscoveredOperations) | **PATCH** /zones/{zone_id}/api_gateway/discovery/operations | Patch discovered operations |


<a id="apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone"></a>
# **apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone**
> ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200Response apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone(zoneId, page, perPage, host, method, endpoint, direction, order, diff, origin, state)

Retrieve discovered operations on a zone

Retrieve the most up to date view of discovered operations

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ApiShieldApiDiscoveryApi;

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

    ApiShieldApiDiscoveryApi apiInstance = new ApiShieldApiDiscoveryApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    Object page = 1; // Object | Page number of paginated results.
    Object perPage = 20; // Object | Maximum number of results per page.
    Set<String> host = Arrays.asList(); // Set<String> | 
    Set<String> method = Arrays.asList(); // Set<String> | 
    String endpoint = "/api/v1"; // String | 
    String direction = "asc"; // String | 
    String order = "host"; // String | 
    Boolean diff = true; // Boolean | 
    ApiShieldApiDiscoveryOrigin origin = ApiShieldApiDiscoveryOrigin.fromValue("ML"); // ApiShieldApiDiscoveryOrigin | Filter results to only include discovery results sourced from a particular discovery engine   * `ML` - Discovered operations that were sourced using ML API Discovery   * `SessionIdentifier` - Discovered operations that were sourced using Session Identifier API Discovery 
    ApiShieldApiDiscoveryState state = ApiShieldApiDiscoveryState.fromValue("review"); // ApiShieldApiDiscoveryState | Filter results to only include discovery results in a particular state. States are as follows   * `review` - Discovered operations that are not saved into API Shield Endpoint Management   * `saved` - Discovered operations that are already saved into API Shield Endpoint Management   * `ignored` - Discovered operations that have been marked as ignored 
    try {
      ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200Response result = apiInstance.apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone(zoneId, page, perPage, host, method, endpoint, direction, order, diff, origin, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldApiDiscoveryApi#apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone");
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
| **page** | [**Object**](.md)| Page number of paginated results. | [optional] [default to 1] |
| **perPage** | [**Object**](.md)| Maximum number of results per page. | [optional] [default to 20] |
| **host** | [**Set&lt;String&gt;**](String.md)|  | [optional] |
| **method** | [**Set&lt;String&gt;**](String.md)|  | [optional] |
| **endpoint** | **String**|  | [optional] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |
| **order** | **String**|  | [optional] [enum: host, method, endpoint, traffic_stats.requests, traffic_stats.last_updated] |
| **diff** | **Boolean**|  | [optional] |
| **origin** | [**ApiShieldApiDiscoveryOrigin**](.md)| Filter results to only include discovery results sourced from a particular discovery engine   * &#x60;ML&#x60; - Discovered operations that were sourced using ML API Discovery   * &#x60;SessionIdentifier&#x60; - Discovered operations that were sourced using Session Identifier API Discovery  | [optional] [enum: ML, SessionIdentifier] |
| **state** | [**ApiShieldApiDiscoveryState**](.md)| Filter results to only include discovery results in a particular state. States are as follows   * &#x60;review&#x60; - Discovered operations that are not saved into API Shield Endpoint Management   * &#x60;saved&#x60; - Discovered operations that are already saved into API Shield Endpoint Management   * &#x60;ignored&#x60; - Discovered operations that have been marked as ignored  | [optional] [enum: review, saved, ignored] |

### Return type

[**ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200Response**](ApiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZone200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve discovered operations on a zone response |  -  |
| **4XX** | Retrieve discovered operations on a zone response failure |  -  |

<a id="apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZoneAsOpenapi"></a>
# **apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZoneAsOpenapi**
> ApiShieldSchemaResponseDiscovery apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZoneAsOpenapi(zoneId)

Retrieve discovered operations on a zone rendered as OpenAPI schemas

Retrieve the most up to date view of discovered operations, rendered as OpenAPI schemas

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ApiShieldApiDiscoveryApi;

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

    ApiShieldApiDiscoveryApi apiInstance = new ApiShieldApiDiscoveryApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ApiShieldSchemaResponseDiscovery result = apiInstance.apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZoneAsOpenapi(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldApiDiscoveryApi#apiShieldApiDiscoveryRetrieveDiscoveredOperationsOnAZoneAsOpenapi");
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

[**ApiShieldSchemaResponseDiscovery**](ApiShieldSchemaResponseDiscovery.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve discovered operations on a zone, rendered as OpenAPI schemas response |  -  |
| **4XX** | Retrieve discovered operations on a zone, rendered as OpenAPI schemas response failure |  -  |

<a id="apiShieldApiPatchDiscoveredOperation"></a>
# **apiShieldApiPatchDiscoveredOperation**
> ApiShieldPatchDiscoveryResponse apiShieldApiPatchDiscoveredOperation(zoneId, operationId, apiShieldApiPatchDiscoveredOperationRequest)

Patch discovered operation

Update the &#x60;state&#x60; on a discovered operation

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ApiShieldApiDiscoveryApi;

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

    ApiShieldApiDiscoveryApi apiInstance = new ApiShieldApiDiscoveryApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    UUID operationId = UUID.randomUUID(); // UUID | Identifier for the discovered operation
    ApiShieldApiPatchDiscoveredOperationRequest apiShieldApiPatchDiscoveredOperationRequest = new ApiShieldApiPatchDiscoveredOperationRequest(); // ApiShieldApiPatchDiscoveredOperationRequest | 
    try {
      ApiShieldPatchDiscoveryResponse result = apiInstance.apiShieldApiPatchDiscoveredOperation(zoneId, operationId, apiShieldApiPatchDiscoveredOperationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldApiDiscoveryApi#apiShieldApiPatchDiscoveredOperation");
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
| **operationId** | **UUID**| Identifier for the discovered operation | |
| **apiShieldApiPatchDiscoveredOperationRequest** | [**ApiShieldApiPatchDiscoveredOperationRequest**](ApiShieldApiPatchDiscoveredOperationRequest.md)|  | |

### Return type

[**ApiShieldPatchDiscoveryResponse**](ApiShieldPatchDiscoveryResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch discovered operation response |  -  |
| **4XX** | Patch discovered operation response failure |  -  |

<a id="apiShieldApiPatchDiscoveredOperations"></a>
# **apiShieldApiPatchDiscoveredOperations**
> ApiShieldPatchDiscoveriesResponse apiShieldApiPatchDiscoveredOperations(zoneId, requestBody)

Patch discovered operations

Update the &#x60;state&#x60; on one or more discovered operations

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ApiShieldApiDiscoveryApi;

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

    ApiShieldApiDiscoveryApi apiInstance = new ApiShieldApiDiscoveryApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    Map<String, ApiShieldApiDiscoveryPatchMultipleRequestEntry> requestBody = new HashMap(); // Map<String, ApiShieldApiDiscoveryPatchMultipleRequestEntry> | 
    try {
      ApiShieldPatchDiscoveriesResponse result = apiInstance.apiShieldApiPatchDiscoveredOperations(zoneId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldApiDiscoveryApi#apiShieldApiPatchDiscoveredOperations");
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
| **requestBody** | [**Map&lt;String, ApiShieldApiDiscoveryPatchMultipleRequestEntry&gt;**](ApiShieldApiDiscoveryPatchMultipleRequestEntry.md)|  | |

### Return type

[**ApiShieldPatchDiscoveriesResponse**](ApiShieldPatchDiscoveriesResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch discovered operations response |  -  |
| **4XX** | Patch discovered operations response failure |  -  |

