# VectorizeIndexApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**vectorizeCreateVectorizeIndex**](VectorizeIndexApi.md#vectorizeCreateVectorizeIndex) | **POST** /accounts/{account_id}/vectorize/indexes | Create Vectorize Index |
| [**vectorizeDeleteVectorizeIndex**](VectorizeIndexApi.md#vectorizeDeleteVectorizeIndex) | **DELETE** /accounts/{account_id}/vectorize/indexes/{index_name} | Delete Vectorize Index |
| [**vectorizeDeleteVectorsById**](VectorizeIndexApi.md#vectorizeDeleteVectorsById) | **POST** /accounts/{account_id}/vectorize/indexes/{index_name}/delete-by-ids | Delete Vectors By Identifier |
| [**vectorizeGetVectorizeIndex**](VectorizeIndexApi.md#vectorizeGetVectorizeIndex) | **GET** /accounts/{account_id}/vectorize/indexes/{index_name} | Get Vectorize Index |
| [**vectorizeGetVectorsById**](VectorizeIndexApi.md#vectorizeGetVectorsById) | **POST** /accounts/{account_id}/vectorize/indexes/{index_name}/get-by-ids | Get Vectors By Identifier |
| [**vectorizeInsertVector**](VectorizeIndexApi.md#vectorizeInsertVector) | **POST** /accounts/{account_id}/vectorize/indexes/{index_name}/insert | Insert Vectors |
| [**vectorizeListVectorizeIndexes**](VectorizeIndexApi.md#vectorizeListVectorizeIndexes) | **GET** /accounts/{account_id}/vectorize/indexes | List Vectorize Indexes |
| [**vectorizeQueryVector**](VectorizeIndexApi.md#vectorizeQueryVector) | **POST** /accounts/{account_id}/vectorize/indexes/{index_name}/query | Query Vectors |
| [**vectorizeUpdateVectorizeIndex**](VectorizeIndexApi.md#vectorizeUpdateVectorizeIndex) | **PUT** /accounts/{account_id}/vectorize/indexes/{index_name} | Update Vectorize Index |
| [**vectorizeUpsertVector**](VectorizeIndexApi.md#vectorizeUpsertVector) | **POST** /accounts/{account_id}/vectorize/indexes/{index_name}/upsert | Upsert Vectors |


<a id="vectorizeCreateVectorizeIndex"></a>
# **vectorizeCreateVectorizeIndex**
> VectorizeCreateVectorizeIndex200Response vectorizeCreateVectorizeIndex(accountId, vectorizeCreateIndexRequest)

Create Vectorize Index

Creates and returns a new Vectorize Index.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VectorizeIndexApi;

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

    VectorizeIndexApi apiInstance = new VectorizeIndexApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    VectorizeCreateIndexRequest vectorizeCreateIndexRequest = new VectorizeCreateIndexRequest(); // VectorizeCreateIndexRequest | 
    try {
      VectorizeCreateVectorizeIndex200Response result = apiInstance.vectorizeCreateVectorizeIndex(accountId, vectorizeCreateIndexRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorizeIndexApi#vectorizeCreateVectorizeIndex");
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
| **vectorizeCreateIndexRequest** | [**VectorizeCreateIndexRequest**](VectorizeCreateIndexRequest.md)|  | |

### Return type

[**VectorizeCreateVectorizeIndex200Response**](VectorizeCreateVectorizeIndex200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Vectorize Index Response |  -  |
| **4XX** | Create Vectorize Index Failure Response |  -  |

<a id="vectorizeDeleteVectorizeIndex"></a>
# **vectorizeDeleteVectorizeIndex**
> VectorizeDeleteVectorizeIndex200Response vectorizeDeleteVectorizeIndex(accountId, indexName)

Delete Vectorize Index

Deletes the specified Vectorize Index.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VectorizeIndexApi;

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

    VectorizeIndexApi apiInstance = new VectorizeIndexApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String indexName = "indexName_example"; // String | 
    try {
      VectorizeDeleteVectorizeIndex200Response result = apiInstance.vectorizeDeleteVectorizeIndex(accountId, indexName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorizeIndexApi#vectorizeDeleteVectorizeIndex");
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
| **indexName** | **String**|  | |

### Return type

[**VectorizeDeleteVectorizeIndex200Response**](VectorizeDeleteVectorizeIndex200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Vectorize Index Response |  -  |
| **4XX** | Delete Vectorize Index Failure |  -  |

<a id="vectorizeDeleteVectorsById"></a>
# **vectorizeDeleteVectorsById**
> VectorizeDeleteVectorsById200Response vectorizeDeleteVectorsById(accountId, indexName, vectorizeIndexDeleteVectorsByIdRequest)

Delete Vectors By Identifier

Delete a set of vectors from an index by their vector identifiers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VectorizeIndexApi;

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

    VectorizeIndexApi apiInstance = new VectorizeIndexApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String indexName = "indexName_example"; // String | 
    VectorizeIndexDeleteVectorsByIdRequest vectorizeIndexDeleteVectorsByIdRequest = new VectorizeIndexDeleteVectorsByIdRequest(); // VectorizeIndexDeleteVectorsByIdRequest | 
    try {
      VectorizeDeleteVectorsById200Response result = apiInstance.vectorizeDeleteVectorsById(accountId, indexName, vectorizeIndexDeleteVectorsByIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorizeIndexApi#vectorizeDeleteVectorsById");
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
| **indexName** | **String**|  | |
| **vectorizeIndexDeleteVectorsByIdRequest** | [**VectorizeIndexDeleteVectorsByIdRequest**](VectorizeIndexDeleteVectorsByIdRequest.md)|  | |

### Return type

[**VectorizeDeleteVectorsById200Response**](VectorizeDeleteVectorsById200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Vector Identifiers Response |  -  |
| **4XX** | Delete Vector Identifiers Failure Response |  -  |

<a id="vectorizeGetVectorizeIndex"></a>
# **vectorizeGetVectorizeIndex**
> VectorizeCreateVectorizeIndex200Response vectorizeGetVectorizeIndex(accountId, indexName)

Get Vectorize Index

Returns the specified Vectorize Index.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VectorizeIndexApi;

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

    VectorizeIndexApi apiInstance = new VectorizeIndexApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String indexName = "indexName_example"; // String | 
    try {
      VectorizeCreateVectorizeIndex200Response result = apiInstance.vectorizeGetVectorizeIndex(accountId, indexName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorizeIndexApi#vectorizeGetVectorizeIndex");
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
| **indexName** | **String**|  | |

### Return type

[**VectorizeCreateVectorizeIndex200Response**](VectorizeCreateVectorizeIndex200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Vectorize Index Response |  -  |
| **4XX** | Get Vectorize Index Failure |  -  |

<a id="vectorizeGetVectorsById"></a>
# **vectorizeGetVectorsById**
> VectorizeGetVectorsById200Response vectorizeGetVectorsById(accountId, indexName, vectorizeIndexGetVectorsByIdRequest)

Get Vectors By Identifier

Get a set of vectors from an index by their vector identifiers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VectorizeIndexApi;

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

    VectorizeIndexApi apiInstance = new VectorizeIndexApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String indexName = "indexName_example"; // String | 
    VectorizeIndexGetVectorsByIdRequest vectorizeIndexGetVectorsByIdRequest = new VectorizeIndexGetVectorsByIdRequest(); // VectorizeIndexGetVectorsByIdRequest | 
    try {
      VectorizeGetVectorsById200Response result = apiInstance.vectorizeGetVectorsById(accountId, indexName, vectorizeIndexGetVectorsByIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorizeIndexApi#vectorizeGetVectorsById");
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
| **indexName** | **String**|  | |
| **vectorizeIndexGetVectorsByIdRequest** | [**VectorizeIndexGetVectorsByIdRequest**](VectorizeIndexGetVectorsByIdRequest.md)|  | |

### Return type

[**VectorizeGetVectorsById200Response**](VectorizeGetVectorsById200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Vectors By Identifier Response |  -  |
| **4XX** | Get Vectors By Identifier Failure Response |  -  |

<a id="vectorizeInsertVector"></a>
# **vectorizeInsertVector**
> VectorizeInsertVector200Response vectorizeInsertVector(accountId, indexName, body)

Insert Vectors

Inserts vectors into the specified index and returns the count of the vectors successfully inserted.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VectorizeIndexApi;

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

    VectorizeIndexApi apiInstance = new VectorizeIndexApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String indexName = "indexName_example"; // String | 
    File body = new File("/path/to/file"); // File | 
    try {
      VectorizeInsertVector200Response result = apiInstance.vectorizeInsertVector(accountId, indexName, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorizeIndexApi#vectorizeInsertVector");
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
| **indexName** | **String**|  | |
| **body** | **File**|  | |

### Return type

[**VectorizeInsertVector200Response**](VectorizeInsertVector200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/x-ndjson
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Insert Vectors Response |  -  |
| **4XX** | Insert Vectors Failure Response |  -  |

<a id="vectorizeListVectorizeIndexes"></a>
# **vectorizeListVectorizeIndexes**
> VectorizeListVectorizeIndexes200Response vectorizeListVectorizeIndexes(accountId)

List Vectorize Indexes

Returns a list of Vectorize Indexes

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VectorizeIndexApi;

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

    VectorizeIndexApi apiInstance = new VectorizeIndexApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      VectorizeListVectorizeIndexes200Response result = apiInstance.vectorizeListVectorizeIndexes(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorizeIndexApi#vectorizeListVectorizeIndexes");
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

[**VectorizeListVectorizeIndexes200Response**](VectorizeListVectorizeIndexes200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Vectorize Index Response |  -  |
| **4XX** | List Vectorize Index Failure Response |  -  |

<a id="vectorizeQueryVector"></a>
# **vectorizeQueryVector**
> VectorizeQueryVector200Response vectorizeQueryVector(accountId, indexName, vectorizeIndexQueryRequest)

Query Vectors

Finds vectors closest to a given vector in an index.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VectorizeIndexApi;

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

    VectorizeIndexApi apiInstance = new VectorizeIndexApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String indexName = "indexName_example"; // String | 
    VectorizeIndexQueryRequest vectorizeIndexQueryRequest = new VectorizeIndexQueryRequest(); // VectorizeIndexQueryRequest | 
    try {
      VectorizeQueryVector200Response result = apiInstance.vectorizeQueryVector(accountId, indexName, vectorizeIndexQueryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorizeIndexApi#vectorizeQueryVector");
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
| **indexName** | **String**|  | |
| **vectorizeIndexQueryRequest** | [**VectorizeIndexQueryRequest**](VectorizeIndexQueryRequest.md)|  | |

### Return type

[**VectorizeQueryVector200Response**](VectorizeQueryVector200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Vectors Response |  -  |
| **4XX** | Query Vectors Failure Response |  -  |

<a id="vectorizeUpdateVectorizeIndex"></a>
# **vectorizeUpdateVectorizeIndex**
> VectorizeCreateVectorizeIndex200Response vectorizeUpdateVectorizeIndex(accountId, indexName, vectorizeUpdateIndexRequest)

Update Vectorize Index

Updates and returns the specified Vectorize Index.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VectorizeIndexApi;

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

    VectorizeIndexApi apiInstance = new VectorizeIndexApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String indexName = "indexName_example"; // String | 
    VectorizeUpdateIndexRequest vectorizeUpdateIndexRequest = new VectorizeUpdateIndexRequest(); // VectorizeUpdateIndexRequest | 
    try {
      VectorizeCreateVectorizeIndex200Response result = apiInstance.vectorizeUpdateVectorizeIndex(accountId, indexName, vectorizeUpdateIndexRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorizeIndexApi#vectorizeUpdateVectorizeIndex");
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
| **indexName** | **String**|  | |
| **vectorizeUpdateIndexRequest** | [**VectorizeUpdateIndexRequest**](VectorizeUpdateIndexRequest.md)|  | |

### Return type

[**VectorizeCreateVectorizeIndex200Response**](VectorizeCreateVectorizeIndex200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Vectorize Index Response |  -  |
| **4XX** | Update Vectorize Index Failure Response |  -  |

<a id="vectorizeUpsertVector"></a>
# **vectorizeUpsertVector**
> VectorizeUpsertVector200Response vectorizeUpsertVector(accountId, indexName, body)

Upsert Vectors

Upserts vectors into the specified index, creating them if they do not exist and returns the count of values and ids successfully inserted.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VectorizeIndexApi;

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

    VectorizeIndexApi apiInstance = new VectorizeIndexApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String indexName = "indexName_example"; // String | 
    File body = new File("/path/to/file"); // File | 
    try {
      VectorizeUpsertVector200Response result = apiInstance.vectorizeUpsertVector(accountId, indexName, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorizeIndexApi#vectorizeUpsertVector");
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
| **indexName** | **String**|  | |
| **body** | **File**|  | |

### Return type

[**VectorizeUpsertVector200Response**](VectorizeUpsertVector200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/x-ndjson
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Insert Vectors Response |  -  |
| **4XX** | Insert Vectors Failure Response |  -  |

