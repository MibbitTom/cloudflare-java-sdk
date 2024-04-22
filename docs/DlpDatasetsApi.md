# DlpDatasetsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dlpDatasetsCreate**](DlpDatasetsApi.md#dlpDatasetsCreate) | **POST** /accounts/{account_id}/dlp/datasets | Create a new dataset. |
| [**dlpDatasetsCreateVersion**](DlpDatasetsApi.md#dlpDatasetsCreateVersion) | **POST** /accounts/{account_id}/dlp/datasets/{dataset_id}/upload | Prepare to upload a new version of a dataset. |
| [**dlpDatasetsDelete**](DlpDatasetsApi.md#dlpDatasetsDelete) | **DELETE** /accounts/{account_id}/dlp/datasets/{dataset_id} | Delete a dataset. |
| [**dlpDatasetsRead**](DlpDatasetsApi.md#dlpDatasetsRead) | **GET** /accounts/{account_id}/dlp/datasets/{dataset_id} | Fetch a specific dataset with information about available versions. |
| [**dlpDatasetsReadAll**](DlpDatasetsApi.md#dlpDatasetsReadAll) | **GET** /accounts/{account_id}/dlp/datasets | Fetch all datasets with information about available versions. |
| [**dlpDatasetsUpdate**](DlpDatasetsApi.md#dlpDatasetsUpdate) | **PUT** /accounts/{account_id}/dlp/datasets/{dataset_id} | Update details about a dataset. |
| [**dlpDatasetsUploadVersion**](DlpDatasetsApi.md#dlpDatasetsUploadVersion) | **POST** /accounts/{account_id}/dlp/datasets/{dataset_id}/upload/{version} | Upload a new version of a dataset. |


<a id="dlpDatasetsCreate"></a>
# **dlpDatasetsCreate**
> DlpDatasetCreationResponse dlpDatasetsCreate(accountId, dlpNewDataset)

Create a new dataset.

Create a new dataset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpDatasetsApi;

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

    DlpDatasetsApi apiInstance = new DlpDatasetsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    DlpNewDataset dlpNewDataset = new DlpNewDataset(); // DlpNewDataset | Dataset description
    try {
      DlpDatasetCreationResponse result = apiInstance.dlpDatasetsCreate(accountId, dlpNewDataset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpDatasetsApi#dlpDatasetsCreate");
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
| **dlpNewDataset** | [**DlpNewDataset**](DlpNewDataset.md)| Dataset description | |

### Return type

[**DlpDatasetCreationResponse**](DlpDatasetCreationResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dataset created successfully |  -  |
| **4XX** | Dataset creation failed |  -  |

<a id="dlpDatasetsCreateVersion"></a>
# **dlpDatasetsCreateVersion**
> DlpDatasetNewVersionResponse dlpDatasetsCreateVersion(accountId, datasetId)

Prepare to upload a new version of a dataset.

Prepare to upload a new version of a dataset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpDatasetsApi;

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

    DlpDatasetsApi apiInstance = new DlpDatasetsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    UUID datasetId = UUID.randomUUID(); // UUID | 
    try {
      DlpDatasetNewVersionResponse result = apiInstance.dlpDatasetsCreateVersion(accountId, datasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpDatasetsApi#dlpDatasetsCreateVersion");
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
| **datasetId** | **UUID**|  | |

### Return type

[**DlpDatasetNewVersionResponse**](DlpDatasetNewVersionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dataset version created successfully |  -  |
| **4XX** | Dataset version creation failed |  -  |

<a id="dlpDatasetsDelete"></a>
# **dlpDatasetsDelete**
> dlpDatasetsDelete(accountId, datasetId)

Delete a dataset.

Delete a dataset.  This deletes all versions of the dataset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpDatasetsApi;

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

    DlpDatasetsApi apiInstance = new DlpDatasetsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    UUID datasetId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.dlpDatasetsDelete(accountId, datasetId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpDatasetsApi#dlpDatasetsDelete");
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
| **datasetId** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dataset deleted successfully |  -  |
| **4XX** | Dataset delete failed |  -  |

<a id="dlpDatasetsRead"></a>
# **dlpDatasetsRead**
> DlpDatasetResponse dlpDatasetsRead(accountId, datasetId)

Fetch a specific dataset with information about available versions.

Fetch a specific dataset with information about available versions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpDatasetsApi;

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

    DlpDatasetsApi apiInstance = new DlpDatasetsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    UUID datasetId = UUID.randomUUID(); // UUID | 
    try {
      DlpDatasetResponse result = apiInstance.dlpDatasetsRead(accountId, datasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpDatasetsApi#dlpDatasetsRead");
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
| **datasetId** | **UUID**|  | |

### Return type

[**DlpDatasetResponse**](DlpDatasetResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dataset read successfully |  -  |
| **4XX** | Dataset read failed |  -  |

<a id="dlpDatasetsReadAll"></a>
# **dlpDatasetsReadAll**
> DlpDatasetArrayResponse dlpDatasetsReadAll(accountId)

Fetch all datasets with information about available versions.

Fetch all datasets with information about available versions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpDatasetsApi;

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

    DlpDatasetsApi apiInstance = new DlpDatasetsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      DlpDatasetArrayResponse result = apiInstance.dlpDatasetsReadAll(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpDatasetsApi#dlpDatasetsReadAll");
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

[**DlpDatasetArrayResponse**](DlpDatasetArrayResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Datasets read successfully |  -  |
| **4XX** | Datasets read failed |  -  |

<a id="dlpDatasetsUpdate"></a>
# **dlpDatasetsUpdate**
> DlpDatasetResponse dlpDatasetsUpdate(accountId, datasetId, dlpDatasetUpdate)

Update details about a dataset.

Update details about a dataset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpDatasetsApi;

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

    DlpDatasetsApi apiInstance = new DlpDatasetsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    UUID datasetId = UUID.randomUUID(); // UUID | 
    DlpDatasetUpdate dlpDatasetUpdate = new DlpDatasetUpdate(); // DlpDatasetUpdate | Dataset description
    try {
      DlpDatasetResponse result = apiInstance.dlpDatasetsUpdate(accountId, datasetId, dlpDatasetUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpDatasetsApi#dlpDatasetsUpdate");
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
| **datasetId** | **UUID**|  | |
| **dlpDatasetUpdate** | [**DlpDatasetUpdate**](DlpDatasetUpdate.md)| Dataset description | |

### Return type

[**DlpDatasetResponse**](DlpDatasetResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dataset updated successfully |  -  |
| **4XX** | Dataset update failed |  -  |

<a id="dlpDatasetsUploadVersion"></a>
# **dlpDatasetsUploadVersion**
> DlpDatasetResponse dlpDatasetsUploadVersion(accountId, datasetId, version, body)

Upload a new version of a dataset.

Upload a new version of a dataset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpDatasetsApi;

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

    DlpDatasetsApi apiInstance = new DlpDatasetsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    UUID datasetId = UUID.randomUUID(); // UUID | 
    Long version = 56L; // Long | 
    String body = "body_example"; // String | Dataset. For custom wordlists this contains UTF-8 patterns separated by newline characters.
    try {
      DlpDatasetResponse result = apiInstance.dlpDatasetsUploadVersion(accountId, datasetId, version, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpDatasetsApi#dlpDatasetsUploadVersion");
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
| **datasetId** | **UUID**|  | |
| **version** | **Long**|  | |
| **body** | **String**| Dataset. For custom wordlists this contains UTF-8 patterns separated by newline characters. | |

### Return type

[**DlpDatasetResponse**](DlpDatasetResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dataset version uploaded successfully |  -  |
| **4XX** | Dataset version upload failed |  -  |

