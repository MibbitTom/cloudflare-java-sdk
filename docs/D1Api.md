# D1Api

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cloudflareD1CreateDatabase**](D1Api.md#cloudflareD1CreateDatabase) | **POST** /accounts/{account_id}/d1/database | Create D1 Database |
| [**cloudflareD1DeleteDatabase**](D1Api.md#cloudflareD1DeleteDatabase) | **DELETE** /accounts/{account_identifier}/d1/database/{database_identifier} | Delete D1 Database |
| [**cloudflareD1GetDatabase**](D1Api.md#cloudflareD1GetDatabase) | **GET** /accounts/{account_identifier}/d1/database/{database_identifier} | Get D1 Database |
| [**cloudflareD1ListDatabases**](D1Api.md#cloudflareD1ListDatabases) | **GET** /accounts/{account_id}/d1/database | List D1 Databases |
| [**cloudflareD1QueryDatabase**](D1Api.md#cloudflareD1QueryDatabase) | **POST** /accounts/{account_identifier}/d1/database/{database_identifier}/query | Query D1 Database |


<a id="cloudflareD1CreateDatabase"></a>
# **cloudflareD1CreateDatabase**
> CloudflareD1CreateDatabase200Response cloudflareD1CreateDatabase(accountId, cloudflareD1CreateDatabaseRequest)

Create D1 Database

Returns the created D1 database.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.D1Api;

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

    D1Api apiInstance = new D1Api(defaultClient);
    String accountId = "accountId_example"; // String | 
    CloudflareD1CreateDatabaseRequest cloudflareD1CreateDatabaseRequest = new CloudflareD1CreateDatabaseRequest(); // CloudflareD1CreateDatabaseRequest | 
    try {
      CloudflareD1CreateDatabase200Response result = apiInstance.cloudflareD1CreateDatabase(accountId, cloudflareD1CreateDatabaseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling D1Api#cloudflareD1CreateDatabase");
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
| **cloudflareD1CreateDatabaseRequest** | [**CloudflareD1CreateDatabaseRequest**](CloudflareD1CreateDatabaseRequest.md)|  | |

### Return type

[**CloudflareD1CreateDatabase200Response**](CloudflareD1CreateDatabase200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the created D1 database&#39;s metadata |  -  |
| **4XX** | Database details response failure |  -  |

<a id="cloudflareD1DeleteDatabase"></a>
# **cloudflareD1DeleteDatabase**
> CloudflareD1DeleteDatabase200Response cloudflareD1DeleteDatabase(accountIdentifier, databaseIdentifier)

Delete D1 Database

Deletes the specified D1 database.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.D1Api;

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

    D1Api apiInstance = new D1Api(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    String databaseIdentifier = "databaseIdentifier_example"; // String | 
    try {
      CloudflareD1DeleteDatabase200Response result = apiInstance.cloudflareD1DeleteDatabase(accountIdentifier, databaseIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling D1Api#cloudflareD1DeleteDatabase");
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
| **databaseIdentifier** | **String**|  | |

### Return type

[**CloudflareD1DeleteDatabase200Response**](CloudflareD1DeleteDatabase200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete D1 database response |  -  |
| **4XX** | Delete D1 database response failure |  -  |

<a id="cloudflareD1GetDatabase"></a>
# **cloudflareD1GetDatabase**
> CloudflareD1GetDatabase200Response cloudflareD1GetDatabase(accountIdentifier, databaseIdentifier)

Get D1 Database

Returns the specified D1 database.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.D1Api;

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

    D1Api apiInstance = new D1Api(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    String databaseIdentifier = "databaseIdentifier_example"; // String | 
    try {
      CloudflareD1GetDatabase200Response result = apiInstance.cloudflareD1GetDatabase(accountIdentifier, databaseIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling D1Api#cloudflareD1GetDatabase");
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
| **databaseIdentifier** | **String**|  | |

### Return type

[**CloudflareD1GetDatabase200Response**](CloudflareD1GetDatabase200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Database details response |  -  |
| **4XX** | Database details response failure |  -  |

<a id="cloudflareD1ListDatabases"></a>
# **cloudflareD1ListDatabases**
> CloudflareD1ListDatabases200Response cloudflareD1ListDatabases(accountId, name, page, perPage)

List D1 Databases

Returns a list of D1 databases.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.D1Api;

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

    D1Api apiInstance = new D1Api(defaultClient);
    String accountId = "accountId_example"; // String | 
    String name = "name_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("1000"); // BigDecimal | 
    try {
      CloudflareD1ListDatabases200Response result = apiInstance.cloudflareD1ListDatabases(accountId, name, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling D1Api#cloudflareD1ListDatabases");
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
| **name** | **String**|  | [optional] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 1000] |

### Return type

[**CloudflareD1ListDatabases200Response**](CloudflareD1ListDatabases200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List D1 databases response |  -  |
| **4XX** | List D1 databases response failure |  -  |

<a id="cloudflareD1QueryDatabase"></a>
# **cloudflareD1QueryDatabase**
> CloudflareD1QueryDatabase200Response cloudflareD1QueryDatabase(accountIdentifier, databaseIdentifier, cloudflareD1QueryDatabaseRequest)

Query D1 Database

Returns the query result.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.D1Api;

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

    D1Api apiInstance = new D1Api(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    String databaseIdentifier = "databaseIdentifier_example"; // String | 
    CloudflareD1QueryDatabaseRequest cloudflareD1QueryDatabaseRequest = new CloudflareD1QueryDatabaseRequest(); // CloudflareD1QueryDatabaseRequest | 
    try {
      CloudflareD1QueryDatabase200Response result = apiInstance.cloudflareD1QueryDatabase(accountIdentifier, databaseIdentifier, cloudflareD1QueryDatabaseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling D1Api#cloudflareD1QueryDatabase");
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
| **databaseIdentifier** | **String**|  | |
| **cloudflareD1QueryDatabaseRequest** | [**CloudflareD1QueryDatabaseRequest**](CloudflareD1QueryDatabaseRequest.md)|  | |

### Return type

[**CloudflareD1QueryDatabase200Response**](CloudflareD1QueryDatabase200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query response |  -  |
| **4XX** | Query response failure |  -  |

