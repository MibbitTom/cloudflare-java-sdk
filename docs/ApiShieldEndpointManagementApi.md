# ApiShieldEndpointManagementApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiShieldEndpointManagementAddOperationsToAZone**](ApiShieldEndpointManagementApi.md#apiShieldEndpointManagementAddOperationsToAZone) | **POST** /zones/{zone_id}/api_gateway/operations | Add operations to a zone |
| [**apiShieldEndpointManagementDeleteAnOperation**](ApiShieldEndpointManagementApi.md#apiShieldEndpointManagementDeleteAnOperation) | **DELETE** /zones/{zone_id}/api_gateway/operations/{operation_id} | Delete an operation |
| [**apiShieldEndpointManagementRetrieveInformationAboutAllOperationsOnAZone**](ApiShieldEndpointManagementApi.md#apiShieldEndpointManagementRetrieveInformationAboutAllOperationsOnAZone) | **GET** /zones/{zone_id}/api_gateway/operations | Retrieve information about all operations on a zone |
| [**apiShieldEndpointManagementRetrieveInformationAboutAnOperation**](ApiShieldEndpointManagementApi.md#apiShieldEndpointManagementRetrieveInformationAboutAnOperation) | **GET** /zones/{zone_id}/api_gateway/operations/{operation_id} | Retrieve information about an operation |
| [**apiShieldEndpointManagementRetrieveOperationsAndFeaturesAsOpenApiSchemas**](ApiShieldEndpointManagementApi.md#apiShieldEndpointManagementRetrieveOperationsAndFeaturesAsOpenApiSchemas) | **GET** /zones/{zone_id}/api_gateway/schemas | Retrieve operations and features as OpenAPI schemas |


<a id="apiShieldEndpointManagementAddOperationsToAZone"></a>
# **apiShieldEndpointManagementAddOperationsToAZone**
> ApiShieldCollectionResponse apiShieldEndpointManagementAddOperationsToAZone(zoneId, apiShieldBasicOperation)

Add operations to a zone

Add one or more operations to a zone. Endpoints can contain path variables. Host, method, endpoint will be normalized to a canoncial form when creating an operation and must be unique on the zone. Inserting an operation that matches an existing one will return the record of the already existing operation and update its last_updated date.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldEndpointManagementApi;

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

    ApiShieldEndpointManagementApi apiInstance = new ApiShieldEndpointManagementApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    List<ApiShieldBasicOperation> apiShieldBasicOperation = Arrays.asList(); // List<ApiShieldBasicOperation> | 
    try {
      ApiShieldCollectionResponse result = apiInstance.apiShieldEndpointManagementAddOperationsToAZone(zoneId, apiShieldBasicOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldEndpointManagementApi#apiShieldEndpointManagementAddOperationsToAZone");
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
| **apiShieldBasicOperation** | [**List&lt;ApiShieldBasicOperation&gt;**](ApiShieldBasicOperation.md)|  | |

### Return type

[**ApiShieldCollectionResponse**](ApiShieldCollectionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add operations to a zone response |  -  |
| **4XX** | Add operations to a zone response failure |  -  |

<a id="apiShieldEndpointManagementDeleteAnOperation"></a>
# **apiShieldEndpointManagementDeleteAnOperation**
> ApiShieldDefaultResponse apiShieldEndpointManagementDeleteAnOperation(zoneId, operationId)

Delete an operation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldEndpointManagementApi;

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

    ApiShieldEndpointManagementApi apiInstance = new ApiShieldEndpointManagementApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    UUID operationId = UUID.fromString("f174e90a-fafe-4643-bbbc-4a0ed4fc8415"); // UUID | Identifier for the operation
    try {
      ApiShieldDefaultResponse result = apiInstance.apiShieldEndpointManagementDeleteAnOperation(zoneId, operationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldEndpointManagementApi#apiShieldEndpointManagementDeleteAnOperation");
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
| **operationId** | **UUID**| Identifier for the operation | |

### Return type

[**ApiShieldDefaultResponse**](ApiShieldDefaultResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete an operation response |  -  |
| **4XX** | Delete an operation response failure |  -  |

<a id="apiShieldEndpointManagementRetrieveInformationAboutAllOperationsOnAZone"></a>
# **apiShieldEndpointManagementRetrieveInformationAboutAllOperationsOnAZone**
> ApiShieldCollectionResponsePaginated apiShieldEndpointManagementRetrieveInformationAboutAllOperationsOnAZone(zoneId, page, perPage, order, direction, host, method, endpoint, feature)

Retrieve information about all operations on a zone

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldEndpointManagementApi;

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

    ApiShieldEndpointManagementApi apiInstance = new ApiShieldEndpointManagementApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    Object page = 1; // Object | Page number of paginated results.
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | Number of results to return per page
    String order = "method"; // String | 
    String direction = "asc"; // String | 
    Set<String> host = Arrays.asList(); // Set<String> | 
    Set<String> method = Arrays.asList(); // Set<String> | 
    String endpoint = "/api/v1"; // String | 
    Set<String> feature = Arrays.asList(); // Set<String> | Add feature(s) to the results. The feature name that is given here corresponds to the resulting feature object. Have a look at the top-level object description for more details on the specific meaning.
    try {
      ApiShieldCollectionResponsePaginated result = apiInstance.apiShieldEndpointManagementRetrieveInformationAboutAllOperationsOnAZone(zoneId, page, perPage, order, direction, host, method, endpoint, feature);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldEndpointManagementApi#apiShieldEndpointManagementRetrieveInformationAboutAllOperationsOnAZone");
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
| **perPage** | **BigDecimal**| Number of results to return per page | [optional] [default to 20] |
| **order** | **String**|  | [optional] [enum: method, host, endpoint, thresholds.$key] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |
| **host** | [**Set&lt;String&gt;**](String.md)|  | [optional] |
| **method** | [**Set&lt;String&gt;**](String.md)|  | [optional] |
| **endpoint** | **String**|  | [optional] |
| **feature** | [**Set&lt;String&gt;**](String.md)| Add feature(s) to the results. The feature name that is given here corresponds to the resulting feature object. Have a look at the top-level object description for more details on the specific meaning. | [optional] [enum: thresholds, parameter_schemas, schema_info] |

### Return type

[**ApiShieldCollectionResponsePaginated**](ApiShieldCollectionResponsePaginated.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve information about all operations on a zone response |  -  |
| **4XX** | Retrieve information about all operations on a zone response failure |  -  |

<a id="apiShieldEndpointManagementRetrieveInformationAboutAnOperation"></a>
# **apiShieldEndpointManagementRetrieveInformationAboutAnOperation**
> ApiShieldSchemasSingleResponse apiShieldEndpointManagementRetrieveInformationAboutAnOperation(zoneId, operationId, feature)

Retrieve information about an operation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldEndpointManagementApi;

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

    ApiShieldEndpointManagementApi apiInstance = new ApiShieldEndpointManagementApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    UUID operationId = UUID.fromString("f174e90a-fafe-4643-bbbc-4a0ed4fc8415"); // UUID | Identifier for the operation
    Set<String> feature = Arrays.asList(); // Set<String> | Add feature(s) to the results. The feature name that is given here corresponds to the resulting feature object. Have a look at the top-level object description for more details on the specific meaning.
    try {
      ApiShieldSchemasSingleResponse result = apiInstance.apiShieldEndpointManagementRetrieveInformationAboutAnOperation(zoneId, operationId, feature);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldEndpointManagementApi#apiShieldEndpointManagementRetrieveInformationAboutAnOperation");
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
| **operationId** | **UUID**| Identifier for the operation | |
| **feature** | [**Set&lt;String&gt;**](String.md)| Add feature(s) to the results. The feature name that is given here corresponds to the resulting feature object. Have a look at the top-level object description for more details on the specific meaning. | [optional] [enum: thresholds, parameter_schemas, schema_info] |

### Return type

[**ApiShieldSchemasSingleResponse**](ApiShieldSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve information about an operation response |  -  |
| **4XX** | Retrieve information about an operation response failure |  -  |

<a id="apiShieldEndpointManagementRetrieveOperationsAndFeaturesAsOpenApiSchemas"></a>
# **apiShieldEndpointManagementRetrieveOperationsAndFeaturesAsOpenApiSchemas**
> ApiShieldSchemaResponseWithThresholds apiShieldEndpointManagementRetrieveOperationsAndFeaturesAsOpenApiSchemas(zoneId, host, feature)

Retrieve operations and features as OpenAPI schemas

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldEndpointManagementApi;

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

    ApiShieldEndpointManagementApi apiInstance = new ApiShieldEndpointManagementApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    Set<String> host = Arrays.asList(); // Set<String> | 
    Set<String> feature = Arrays.asList(); // Set<String> | Add feature(s) to the results. The feature name that is given here corresponds to the resulting feature object. Have a look at the top-level object description for more details on the specific meaning.
    try {
      ApiShieldSchemaResponseWithThresholds result = apiInstance.apiShieldEndpointManagementRetrieveOperationsAndFeaturesAsOpenApiSchemas(zoneId, host, feature);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldEndpointManagementApi#apiShieldEndpointManagementRetrieveOperationsAndFeaturesAsOpenApiSchemas");
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
| **host** | [**Set&lt;String&gt;**](String.md)|  | [optional] |
| **feature** | [**Set&lt;String&gt;**](String.md)| Add feature(s) to the results. The feature name that is given here corresponds to the resulting feature object. Have a look at the top-level object description for more details on the specific meaning. | [optional] [enum: thresholds, parameter_schemas, schema_info] |

### Return type

[**ApiShieldSchemaResponseWithThresholds**](ApiShieldSchemaResponseWithThresholds.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve operations and features as OpenAPI schemas response |  -  |
| **4XX** | Retrieve operations and features as OpenAPI schemas response failure |  -  |

