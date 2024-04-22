# ApiShieldSchemaValidation20Api

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiShieldSchemaDeleteASchema**](ApiShieldSchemaValidation20Api.md#apiShieldSchemaDeleteASchema) | **DELETE** /zones/{zone_id}/api_gateway/user_schemas/{schema_id} | Delete a schema |
| [**apiShieldSchemaValidationEnableValidationForASchema**](ApiShieldSchemaValidation20Api.md#apiShieldSchemaValidationEnableValidationForASchema) | **PATCH** /zones/{zone_id}/api_gateway/user_schemas/{schema_id} | Enable validation for a schema |
| [**apiShieldSchemaValidationExtractOperationsFromSchema**](ApiShieldSchemaValidation20Api.md#apiShieldSchemaValidationExtractOperationsFromSchema) | **GET** /zones/{zone_id}/api_gateway/user_schemas/{schema_id}/operations | Retrieve all operations from a schema. |
| [**apiShieldSchemaValidationPatchZoneLevelSettings**](ApiShieldSchemaValidation20Api.md#apiShieldSchemaValidationPatchZoneLevelSettings) | **PATCH** /zones/{zone_id}/api_gateway/settings/schema_validation | Update zone level schema validation settings |
| [**apiShieldSchemaValidationPostSchema**](ApiShieldSchemaValidation20Api.md#apiShieldSchemaValidationPostSchema) | **POST** /zones/{zone_id}/api_gateway/user_schemas | Upload a schema to a zone |
| [**apiShieldSchemaValidationRetrieveInformationAboutAllSchemas**](ApiShieldSchemaValidation20Api.md#apiShieldSchemaValidationRetrieveInformationAboutAllSchemas) | **GET** /zones/{zone_id}/api_gateway/user_schemas | Retrieve information about all schemas on a zone |
| [**apiShieldSchemaValidationRetrieveInformationAboutSpecificSchema**](ApiShieldSchemaValidation20Api.md#apiShieldSchemaValidationRetrieveInformationAboutSpecificSchema) | **GET** /zones/{zone_id}/api_gateway/user_schemas/{schema_id} | Retrieve information about a specific schema on a zone |
| [**apiShieldSchemaValidationRetrieveOperationLevelSettings**](ApiShieldSchemaValidation20Api.md#apiShieldSchemaValidationRetrieveOperationLevelSettings) | **GET** /zones/{zone_id}/api_gateway/operations/{operation_id}/schema_validation | Retrieve operation-level schema validation settings |
| [**apiShieldSchemaValidationRetrieveZoneLevelSettings**](ApiShieldSchemaValidation20Api.md#apiShieldSchemaValidationRetrieveZoneLevelSettings) | **GET** /zones/{zone_id}/api_gateway/settings/schema_validation | Retrieve zone level schema validation settings |
| [**apiShieldSchemaValidationUpdateMultipleOperationLevelSettings**](ApiShieldSchemaValidation20Api.md#apiShieldSchemaValidationUpdateMultipleOperationLevelSettings) | **PATCH** /zones/{zone_id}/api_gateway/operations/schema_validation | Update multiple operation-level schema validation settings |
| [**apiShieldSchemaValidationUpdateOperationLevelSettings**](ApiShieldSchemaValidation20Api.md#apiShieldSchemaValidationUpdateOperationLevelSettings) | **PUT** /zones/{zone_id}/api_gateway/operations/{operation_id}/schema_validation | Update operation-level schema validation settings |
| [**apiShieldSchemaValidationUpdateZoneLevelSettings**](ApiShieldSchemaValidation20Api.md#apiShieldSchemaValidationUpdateZoneLevelSettings) | **PUT** /zones/{zone_id}/api_gateway/settings/schema_validation | Update zone level schema validation settings |


<a id="apiShieldSchemaDeleteASchema"></a>
# **apiShieldSchemaDeleteASchema**
> ApiShieldApiResponseSingle apiShieldSchemaDeleteASchema(zoneId, schemaId)

Delete a schema

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldSchemaValidation20Api;

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

    ApiShieldSchemaValidation20Api apiInstance = new ApiShieldSchemaValidation20Api(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    UUID schemaId = UUID.fromString("f174e90a-fafe-4643-bbbc-4a0ed4fc8415"); // UUID | Identifier for the schema-ID
    try {
      ApiShieldApiResponseSingle result = apiInstance.apiShieldSchemaDeleteASchema(zoneId, schemaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldSchemaValidation20Api#apiShieldSchemaDeleteASchema");
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
| **schemaId** | **UUID**| Identifier for the schema-ID | |

### Return type

[**ApiShieldApiResponseSingle**](ApiShieldApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a schema response |  -  |
| **4XX** | Delete a schema response failure |  -  |

<a id="apiShieldSchemaValidationEnableValidationForASchema"></a>
# **apiShieldSchemaValidationEnableValidationForASchema**
> ApiShieldSchemaValidationRetrieveInformationAboutSpecificSchema200Response apiShieldSchemaValidationEnableValidationForASchema(zoneId, schemaId, apiShieldSchemaValidationEnableValidationForASchemaRequest)

Enable validation for a schema

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldSchemaValidation20Api;

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

    ApiShieldSchemaValidation20Api apiInstance = new ApiShieldSchemaValidation20Api(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    UUID schemaId = UUID.fromString("f174e90a-fafe-4643-bbbc-4a0ed4fc8415"); // UUID | Identifier for the schema-ID
    ApiShieldSchemaValidationEnableValidationForASchemaRequest apiShieldSchemaValidationEnableValidationForASchemaRequest = new ApiShieldSchemaValidationEnableValidationForASchemaRequest(); // ApiShieldSchemaValidationEnableValidationForASchemaRequest | 
    try {
      ApiShieldSchemaValidationRetrieveInformationAboutSpecificSchema200Response result = apiInstance.apiShieldSchemaValidationEnableValidationForASchema(zoneId, schemaId, apiShieldSchemaValidationEnableValidationForASchemaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldSchemaValidation20Api#apiShieldSchemaValidationEnableValidationForASchema");
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
| **schemaId** | **UUID**| Identifier for the schema-ID | |
| **apiShieldSchemaValidationEnableValidationForASchemaRequest** | [**ApiShieldSchemaValidationEnableValidationForASchemaRequest**](ApiShieldSchemaValidationEnableValidationForASchemaRequest.md)|  | |

### Return type

[**ApiShieldSchemaValidationRetrieveInformationAboutSpecificSchema200Response**](ApiShieldSchemaValidationRetrieveInformationAboutSpecificSchema200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Enable validation for a schema response |  -  |
| **4XX** | Enable validation for a schema response failure |  -  |

<a id="apiShieldSchemaValidationExtractOperationsFromSchema"></a>
# **apiShieldSchemaValidationExtractOperationsFromSchema**
> ApiShieldSchemaValidationExtractOperationsFromSchema200Response apiShieldSchemaValidationExtractOperationsFromSchema(schemaId, zoneId, feature, host, method, endpoint, page, perPage, operationStatus)

Retrieve all operations from a schema.

Retrieves all operations from the schema. Operations that already exist in API Shield Endpoint Management will be returned as full operations.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldSchemaValidation20Api;

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

    ApiShieldSchemaValidation20Api apiInstance = new ApiShieldSchemaValidation20Api(defaultClient);
    UUID schemaId = UUID.fromString("f174e90a-fafe-4643-bbbc-4a0ed4fc8415"); // UUID | Identifier for the schema-ID
    String zoneId = "zoneId_example"; // String | 
    Set<String> feature = Arrays.asList(); // Set<String> | Add feature(s) to the results. The feature name that is given here corresponds to the resulting feature object. Have a look at the top-level object description for more details on the specific meaning.
    Set<String> host = Arrays.asList(); // Set<String> | 
    Set<String> method = Arrays.asList(); // Set<String> | 
    String endpoint = "/api/v1"; // String | 
    Object page = 1; // Object | Page number of paginated results.
    Object perPage = 20; // Object | Maximum number of results per page.
    String operationStatus = "new"; // String | Filter results by whether operations exist in API Shield Endpoint Management or not. `new` will just return operations from the schema that do not exist in API Shield Endpoint Management. `existing` will just return operations from the schema that already exist in API Shield Endpoint Management.
    try {
      ApiShieldSchemaValidationExtractOperationsFromSchema200Response result = apiInstance.apiShieldSchemaValidationExtractOperationsFromSchema(schemaId, zoneId, feature, host, method, endpoint, page, perPage, operationStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldSchemaValidation20Api#apiShieldSchemaValidationExtractOperationsFromSchema");
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
| **schemaId** | **UUID**| Identifier for the schema-ID | |
| **zoneId** | **String**|  | |
| **feature** | [**Set&lt;String&gt;**](String.md)| Add feature(s) to the results. The feature name that is given here corresponds to the resulting feature object. Have a look at the top-level object description for more details on the specific meaning. | [optional] [enum: thresholds, parameter_schemas, schema_info] |
| **host** | [**Set&lt;String&gt;**](String.md)|  | [optional] |
| **method** | [**Set&lt;String&gt;**](String.md)|  | [optional] |
| **endpoint** | **String**|  | [optional] |
| **page** | [**Object**](.md)| Page number of paginated results. | [optional] [default to 1] |
| **perPage** | [**Object**](.md)| Maximum number of results per page. | [optional] [default to 20] |
| **operationStatus** | **String**| Filter results by whether operations exist in API Shield Endpoint Management or not. &#x60;new&#x60; will just return operations from the schema that do not exist in API Shield Endpoint Management. &#x60;existing&#x60; will just return operations from the schema that already exist in API Shield Endpoint Management. | [optional] [enum: new, existing] |

### Return type

[**ApiShieldSchemaValidationExtractOperationsFromSchema200Response**](ApiShieldSchemaValidationExtractOperationsFromSchema200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve all operations from a schema response |  -  |
| **4XX** | Retrieve all operations from a schema response failure |  -  |

<a id="apiShieldSchemaValidationPatchZoneLevelSettings"></a>
# **apiShieldSchemaValidationPatchZoneLevelSettings**
> ApiShieldZoneSchemaValidationSettings apiShieldSchemaValidationPatchZoneLevelSettings(zoneId, apiShieldZoneSchemaValidationSettingsPatch)

Update zone level schema validation settings

Updates zone level schema validation settings on the zone

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldSchemaValidation20Api;

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

    ApiShieldSchemaValidation20Api apiInstance = new ApiShieldSchemaValidation20Api(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ApiShieldZoneSchemaValidationSettingsPatch apiShieldZoneSchemaValidationSettingsPatch = new ApiShieldZoneSchemaValidationSettingsPatch(); // ApiShieldZoneSchemaValidationSettingsPatch | 
    try {
      ApiShieldZoneSchemaValidationSettings result = apiInstance.apiShieldSchemaValidationPatchZoneLevelSettings(zoneId, apiShieldZoneSchemaValidationSettingsPatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldSchemaValidation20Api#apiShieldSchemaValidationPatchZoneLevelSettings");
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
| **apiShieldZoneSchemaValidationSettingsPatch** | [**ApiShieldZoneSchemaValidationSettingsPatch**](ApiShieldZoneSchemaValidationSettingsPatch.md)|  | |

### Return type

[**ApiShieldZoneSchemaValidationSettings**](ApiShieldZoneSchemaValidationSettings.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update zone level schema validation settings response |  -  |
| **4XX** | Update zone level schema validation settings response failure |  -  |

<a id="apiShieldSchemaValidationPostSchema"></a>
# **apiShieldSchemaValidationPostSchema**
> ApiShieldSchemaValidationPostSchema200Response apiShieldSchemaValidationPostSchema(zoneId, _file, kind, name, validationEnabled)

Upload a schema to a zone

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldSchemaValidation20Api;

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

    ApiShieldSchemaValidation20Api apiInstance = new ApiShieldSchemaValidation20Api(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    File _file = new File("/path/to/file"); // File | Schema file bytes
    ApiShieldKind kind = ApiShieldKind.fromValue("openapi_v3"); // ApiShieldKind | 
    String name = "name_example"; // String | Name of the schema
    String validationEnabled = "true"; // String | Flag whether schema is enabled for validation.
    try {
      ApiShieldSchemaValidationPostSchema200Response result = apiInstance.apiShieldSchemaValidationPostSchema(zoneId, _file, kind, name, validationEnabled);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldSchemaValidation20Api#apiShieldSchemaValidationPostSchema");
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
| **_file** | **File**| Schema file bytes | |
| **kind** | [**ApiShieldKind**](ApiShieldKind.md)|  | [enum: openapi_v3] |
| **name** | **String**| Name of the schema | [optional] |
| **validationEnabled** | **String**| Flag whether schema is enabled for validation. | [optional] [enum: true, false] |

### Return type

[**ApiShieldSchemaValidationPostSchema200Response**](ApiShieldSchemaValidationPostSchema200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload a schema response |  -  |
| **4XX** | Upload a schema response failure |  -  |

<a id="apiShieldSchemaValidationRetrieveInformationAboutAllSchemas"></a>
# **apiShieldSchemaValidationRetrieveInformationAboutAllSchemas**
> ApiShieldSchemaValidationRetrieveInformationAboutAllSchemas200Response apiShieldSchemaValidationRetrieveInformationAboutAllSchemas(zoneId, page, perPage, omitSource, validationEnabled)

Retrieve information about all schemas on a zone

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldSchemaValidation20Api;

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

    ApiShieldSchemaValidation20Api apiInstance = new ApiShieldSchemaValidation20Api(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    Object page = 1; // Object | Page number of paginated results.
    Object perPage = 20; // Object | Maximum number of results per page.
    Boolean omitSource = false; // Boolean | Omit the source-files of schemas and only retrieve their meta-data.
    Boolean validationEnabled = true; // Boolean | 
    try {
      ApiShieldSchemaValidationRetrieveInformationAboutAllSchemas200Response result = apiInstance.apiShieldSchemaValidationRetrieveInformationAboutAllSchemas(zoneId, page, perPage, omitSource, validationEnabled);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldSchemaValidation20Api#apiShieldSchemaValidationRetrieveInformationAboutAllSchemas");
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
| **omitSource** | **Boolean**| Omit the source-files of schemas and only retrieve their meta-data. | [optional] [default to false] |
| **validationEnabled** | **Boolean**|  | [optional] |

### Return type

[**ApiShieldSchemaValidationRetrieveInformationAboutAllSchemas200Response**](ApiShieldSchemaValidationRetrieveInformationAboutAllSchemas200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve information about all schemas on a zone response |  -  |
| **4XX** | Retrieve information about all schemas on a zone response failure |  -  |

<a id="apiShieldSchemaValidationRetrieveInformationAboutSpecificSchema"></a>
# **apiShieldSchemaValidationRetrieveInformationAboutSpecificSchema**
> ApiShieldSchemaValidationRetrieveInformationAboutSpecificSchema200Response apiShieldSchemaValidationRetrieveInformationAboutSpecificSchema(zoneId, schemaId, omitSource)

Retrieve information about a specific schema on a zone

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldSchemaValidation20Api;

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

    ApiShieldSchemaValidation20Api apiInstance = new ApiShieldSchemaValidation20Api(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    UUID schemaId = UUID.fromString("f174e90a-fafe-4643-bbbc-4a0ed4fc8415"); // UUID | Identifier for the schema-ID
    Boolean omitSource = false; // Boolean | Omit the source-files of schemas and only retrieve their meta-data.
    try {
      ApiShieldSchemaValidationRetrieveInformationAboutSpecificSchema200Response result = apiInstance.apiShieldSchemaValidationRetrieveInformationAboutSpecificSchema(zoneId, schemaId, omitSource);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldSchemaValidation20Api#apiShieldSchemaValidationRetrieveInformationAboutSpecificSchema");
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
| **schemaId** | **UUID**| Identifier for the schema-ID | |
| **omitSource** | **Boolean**| Omit the source-files of schemas and only retrieve their meta-data. | [optional] [default to false] |

### Return type

[**ApiShieldSchemaValidationRetrieveInformationAboutSpecificSchema200Response**](ApiShieldSchemaValidationRetrieveInformationAboutSpecificSchema200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve information about a specific schema on a zone response |  -  |
| **4XX** | Retrieve information about a specific schema zone response failure |  -  |

<a id="apiShieldSchemaValidationRetrieveOperationLevelSettings"></a>
# **apiShieldSchemaValidationRetrieveOperationLevelSettings**
> ApiShieldOperationSchemaValidationSettings apiShieldSchemaValidationRetrieveOperationLevelSettings(zoneId, operationId)

Retrieve operation-level schema validation settings

Retrieves operation-level schema validation settings on the zone

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldSchemaValidation20Api;

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

    ApiShieldSchemaValidation20Api apiInstance = new ApiShieldSchemaValidation20Api(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    UUID operationId = UUID.fromString("f174e90a-fafe-4643-bbbc-4a0ed4fc8415"); // UUID | Identifier for the operation
    try {
      ApiShieldOperationSchemaValidationSettings result = apiInstance.apiShieldSchemaValidationRetrieveOperationLevelSettings(zoneId, operationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldSchemaValidation20Api#apiShieldSchemaValidationRetrieveOperationLevelSettings");
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

[**ApiShieldOperationSchemaValidationSettings**](ApiShieldOperationSchemaValidationSettings.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation-level schema validation settings response |  -  |
| **4XX** | Operation-level schema validation settings response |  -  |

<a id="apiShieldSchemaValidationRetrieveZoneLevelSettings"></a>
# **apiShieldSchemaValidationRetrieveZoneLevelSettings**
> ApiShieldZoneSchemaValidationSettings apiShieldSchemaValidationRetrieveZoneLevelSettings(zoneId)

Retrieve zone level schema validation settings

Retrieves zone level schema validation settings currently set on the zone

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldSchemaValidation20Api;

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

    ApiShieldSchemaValidation20Api apiInstance = new ApiShieldSchemaValidation20Api(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ApiShieldZoneSchemaValidationSettings result = apiInstance.apiShieldSchemaValidationRetrieveZoneLevelSettings(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldSchemaValidation20Api#apiShieldSchemaValidationRetrieveZoneLevelSettings");
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

[**ApiShieldZoneSchemaValidationSettings**](ApiShieldZoneSchemaValidationSettings.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Zone level schema validation settings response |  -  |
| **4XX** | Zone level schema validation settings response failure |  -  |

<a id="apiShieldSchemaValidationUpdateMultipleOperationLevelSettings"></a>
# **apiShieldSchemaValidationUpdateMultipleOperationLevelSettings**
> ApiShieldSchemaValidationUpdateMultipleOperationLevelSettings200Response apiShieldSchemaValidationUpdateMultipleOperationLevelSettings(zoneId, requestBody)

Update multiple operation-level schema validation settings

Updates multiple operation-level schema validation settings on the zone

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldSchemaValidation20Api;

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

    ApiShieldSchemaValidation20Api apiInstance = new ApiShieldSchemaValidation20Api(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    Map<String, ApiShieldOperationSchemaValidationSettingsMultipleRequestEntry> requestBody = new HashMap(); // Map<String, ApiShieldOperationSchemaValidationSettingsMultipleRequestEntry> | 
    try {
      ApiShieldSchemaValidationUpdateMultipleOperationLevelSettings200Response result = apiInstance.apiShieldSchemaValidationUpdateMultipleOperationLevelSettings(zoneId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldSchemaValidation20Api#apiShieldSchemaValidationUpdateMultipleOperationLevelSettings");
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
| **requestBody** | [**Map&lt;String, ApiShieldOperationSchemaValidationSettingsMultipleRequestEntry&gt;**](ApiShieldOperationSchemaValidationSettingsMultipleRequestEntry.md)|  | |

### Return type

[**ApiShieldSchemaValidationUpdateMultipleOperationLevelSettings200Response**](ApiShieldSchemaValidationUpdateMultipleOperationLevelSettings200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update multiple operation-level schema validation settings response |  -  |
| **4XX** | Update multiple operation-level schema validation settings response failure |  -  |

<a id="apiShieldSchemaValidationUpdateOperationLevelSettings"></a>
# **apiShieldSchemaValidationUpdateOperationLevelSettings**
> ApiShieldOperationSchemaValidationSettings apiShieldSchemaValidationUpdateOperationLevelSettings(zoneId, operationId, apiShieldOperationSchemaValidationSettings)

Update operation-level schema validation settings

Updates operation-level schema validation settings on the zone

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldSchemaValidation20Api;

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

    ApiShieldSchemaValidation20Api apiInstance = new ApiShieldSchemaValidation20Api(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    UUID operationId = UUID.fromString("f174e90a-fafe-4643-bbbc-4a0ed4fc8415"); // UUID | Identifier for the operation
    ApiShieldOperationSchemaValidationSettings apiShieldOperationSchemaValidationSettings = new ApiShieldOperationSchemaValidationSettings(); // ApiShieldOperationSchemaValidationSettings | 
    try {
      ApiShieldOperationSchemaValidationSettings result = apiInstance.apiShieldSchemaValidationUpdateOperationLevelSettings(zoneId, operationId, apiShieldOperationSchemaValidationSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldSchemaValidation20Api#apiShieldSchemaValidationUpdateOperationLevelSettings");
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
| **apiShieldOperationSchemaValidationSettings** | [**ApiShieldOperationSchemaValidationSettings**](ApiShieldOperationSchemaValidationSettings.md)|  | |

### Return type

[**ApiShieldOperationSchemaValidationSettings**](ApiShieldOperationSchemaValidationSettings.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update operation-level schema validation settings response |  -  |
| **4XX** | Update operation-level schema validation settings response failure |  -  |

<a id="apiShieldSchemaValidationUpdateZoneLevelSettings"></a>
# **apiShieldSchemaValidationUpdateZoneLevelSettings**
> ApiShieldZoneSchemaValidationSettings apiShieldSchemaValidationUpdateZoneLevelSettings(zoneId, apiShieldZoneSchemaValidationSettingsPut)

Update zone level schema validation settings

Updates zone level schema validation settings on the zone

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiShieldSchemaValidation20Api;

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

    ApiShieldSchemaValidation20Api apiInstance = new ApiShieldSchemaValidation20Api(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    ApiShieldZoneSchemaValidationSettingsPut apiShieldZoneSchemaValidationSettingsPut = new ApiShieldZoneSchemaValidationSettingsPut(); // ApiShieldZoneSchemaValidationSettingsPut | 
    try {
      ApiShieldZoneSchemaValidationSettings result = apiInstance.apiShieldSchemaValidationUpdateZoneLevelSettings(zoneId, apiShieldZoneSchemaValidationSettingsPut);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiShieldSchemaValidation20Api#apiShieldSchemaValidationUpdateZoneLevelSettings");
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
| **apiShieldZoneSchemaValidationSettingsPut** | [**ApiShieldZoneSchemaValidationSettingsPut**](ApiShieldZoneSchemaValidationSettingsPut.md)|  | |

### Return type

[**ApiShieldZoneSchemaValidationSettings**](ApiShieldZoneSchemaValidationSettings.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update zone level schema validation settings response |  -  |
| **4XX** | Update zone level schema validation settings response failure |  -  |

