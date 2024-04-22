# LogpushJobsForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteZonesZoneIdentifierLogpushJobsJobIdentifier**](LogpushJobsForAZoneApi.md#deleteZonesZoneIdentifierLogpushJobsJobIdentifier) | **DELETE** /zones/{zone_id}/logpush/jobs/{job_id} | Delete Logpush job |
| [**getZonesZoneIdentifierLogpushDatasetsDatasetFields**](LogpushJobsForAZoneApi.md#getZonesZoneIdentifierLogpushDatasetsDatasetFields) | **GET** /zones/{zone_id}/logpush/datasets/{dataset_id}/fields | List fields |
| [**getZonesZoneIdentifierLogpushDatasetsDatasetJobs**](LogpushJobsForAZoneApi.md#getZonesZoneIdentifierLogpushDatasetsDatasetJobs) | **GET** /zones/{zone_id}/logpush/datasets/{dataset_id}/jobs | List Logpush jobs for a dataset |
| [**getZonesZoneIdentifierLogpushJobs**](LogpushJobsForAZoneApi.md#getZonesZoneIdentifierLogpushJobs) | **GET** /zones/{zone_id}/logpush/jobs | List Logpush jobs |
| [**getZonesZoneIdentifierLogpushJobsJobIdentifier**](LogpushJobsForAZoneApi.md#getZonesZoneIdentifierLogpushJobsJobIdentifier) | **GET** /zones/{zone_id}/logpush/jobs/{job_id} | Get Logpush job details |
| [**postZonesZoneIdentifierLogpushJobs**](LogpushJobsForAZoneApi.md#postZonesZoneIdentifierLogpushJobs) | **POST** /zones/{zone_id}/logpush/jobs | Create Logpush job |
| [**postZonesZoneIdentifierLogpushOwnership**](LogpushJobsForAZoneApi.md#postZonesZoneIdentifierLogpushOwnership) | **POST** /zones/{zone_id}/logpush/ownership | Get ownership challenge |
| [**postZonesZoneIdentifierLogpushOwnershipValidate**](LogpushJobsForAZoneApi.md#postZonesZoneIdentifierLogpushOwnershipValidate) | **POST** /zones/{zone_id}/logpush/ownership/validate | Validate ownership challenge |
| [**postZonesZoneIdentifierLogpushValidateDestinationExists**](LogpushJobsForAZoneApi.md#postZonesZoneIdentifierLogpushValidateDestinationExists) | **POST** /zones/{zone_id}/logpush/validate/destination/exists | Check destination exists |
| [**postZonesZoneIdentifierLogpushValidateOrigin**](LogpushJobsForAZoneApi.md#postZonesZoneIdentifierLogpushValidateOrigin) | **POST** /zones/{zone_id}/logpush/validate/origin | Validate origin |
| [**putZonesZoneIdentifierLogpushJobsJobIdentifier**](LogpushJobsForAZoneApi.md#putZonesZoneIdentifierLogpushJobsJobIdentifier) | **PUT** /zones/{zone_id}/logpush/jobs/{job_id} | Update Logpush job |


<a id="deleteZonesZoneIdentifierLogpushJobsJobIdentifier"></a>
# **deleteZonesZoneIdentifierLogpushJobsJobIdentifier**
> DeleteAccountsAccountIdentifierLogpushJobsJobIdentifier200Response deleteZonesZoneIdentifierLogpushJobsJobIdentifier(jobId, zoneId)

Delete Logpush job

Deletes a Logpush job.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogpushJobsForAZoneApi;

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

    LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi(defaultClient);
    Integer jobId = 56; // Integer | 
    String zoneId = "zoneId_example"; // String | 
    try {
      DeleteAccountsAccountIdentifierLogpushJobsJobIdentifier200Response result = apiInstance.deleteZonesZoneIdentifierLogpushJobsJobIdentifier(jobId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAZoneApi#deleteZonesZoneIdentifierLogpushJobsJobIdentifier");
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
| **jobId** | **Integer**|  | |
| **zoneId** | **String**|  | |

### Return type

[**DeleteAccountsAccountIdentifierLogpushJobsJobIdentifier200Response**](DeleteAccountsAccountIdentifierLogpushJobsJobIdentifier200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Logpush job response |  -  |
| **4XX** | Delete Logpush job response failure |  -  |

<a id="getZonesZoneIdentifierLogpushDatasetsDatasetFields"></a>
# **getZonesZoneIdentifierLogpushDatasetsDatasetFields**
> LogpushLogpushFieldResponseCollection getZonesZoneIdentifierLogpushDatasetsDatasetFields(datasetId, zoneId)

List fields

Lists all fields available for a dataset. The response result is an object with key-value pairs, where keys are field names, and values are descriptions.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogpushJobsForAZoneApi;

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

    LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi(defaultClient);
    String datasetId = "datasetId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      LogpushLogpushFieldResponseCollection result = apiInstance.getZonesZoneIdentifierLogpushDatasetsDatasetFields(datasetId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAZoneApi#getZonesZoneIdentifierLogpushDatasetsDatasetFields");
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
| **datasetId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**LogpushLogpushFieldResponseCollection**](LogpushLogpushFieldResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List fields response |  -  |
| **4XX** | List fields response failure |  -  |

<a id="getZonesZoneIdentifierLogpushDatasetsDatasetJobs"></a>
# **getZonesZoneIdentifierLogpushDatasetsDatasetJobs**
> LogpushLogpushJobResponseCollection getZonesZoneIdentifierLogpushDatasetsDatasetJobs(datasetId, zoneId)

List Logpush jobs for a dataset

Lists Logpush jobs for a zone for a dataset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogpushJobsForAZoneApi;

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

    LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi(defaultClient);
    String datasetId = "datasetId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      LogpushLogpushJobResponseCollection result = apiInstance.getZonesZoneIdentifierLogpushDatasetsDatasetJobs(datasetId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAZoneApi#getZonesZoneIdentifierLogpushDatasetsDatasetJobs");
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
| **datasetId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**LogpushLogpushJobResponseCollection**](LogpushLogpushJobResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Logpush jobs for a dataset response |  -  |
| **4XX** | List Logpush jobs for a dataset response failure |  -  |

<a id="getZonesZoneIdentifierLogpushJobs"></a>
# **getZonesZoneIdentifierLogpushJobs**
> LogpushLogpushJobResponseCollection getZonesZoneIdentifierLogpushJobs(zoneId)

List Logpush jobs

Lists Logpush jobs for a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogpushJobsForAZoneApi;

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

    LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      LogpushLogpushJobResponseCollection result = apiInstance.getZonesZoneIdentifierLogpushJobs(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAZoneApi#getZonesZoneIdentifierLogpushJobs");
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

[**LogpushLogpushJobResponseCollection**](LogpushLogpushJobResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Logpush jobs response |  -  |
| **4XX** | List Logpush jobs response failure |  -  |

<a id="getZonesZoneIdentifierLogpushJobsJobIdentifier"></a>
# **getZonesZoneIdentifierLogpushJobsJobIdentifier**
> LogpushLogpushJobResponseSingle getZonesZoneIdentifierLogpushJobsJobIdentifier(jobId, zoneId)

Get Logpush job details

Gets the details of a Logpush job.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogpushJobsForAZoneApi;

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

    LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi(defaultClient);
    Integer jobId = 56; // Integer | 
    String zoneId = "zoneId_example"; // String | 
    try {
      LogpushLogpushJobResponseSingle result = apiInstance.getZonesZoneIdentifierLogpushJobsJobIdentifier(jobId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAZoneApi#getZonesZoneIdentifierLogpushJobsJobIdentifier");
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
| **jobId** | **Integer**|  | |
| **zoneId** | **String**|  | |

### Return type

[**LogpushLogpushJobResponseSingle**](LogpushLogpushJobResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Logpush job details response |  -  |
| **4XX** | Get Logpush job details response failure |  -  |

<a id="postZonesZoneIdentifierLogpushJobs"></a>
# **postZonesZoneIdentifierLogpushJobs**
> LogpushLogpushJobResponseSingle postZonesZoneIdentifierLogpushJobs(zoneId, postAccountsAccountIdentifierLogpushJobsRequest)

Create Logpush job

Creates a new Logpush job for a zone.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogpushJobsForAZoneApi;

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

    LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    PostAccountsAccountIdentifierLogpushJobsRequest postAccountsAccountIdentifierLogpushJobsRequest = new PostAccountsAccountIdentifierLogpushJobsRequest(); // PostAccountsAccountIdentifierLogpushJobsRequest | 
    try {
      LogpushLogpushJobResponseSingle result = apiInstance.postZonesZoneIdentifierLogpushJobs(zoneId, postAccountsAccountIdentifierLogpushJobsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAZoneApi#postZonesZoneIdentifierLogpushJobs");
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
| **postAccountsAccountIdentifierLogpushJobsRequest** | [**PostAccountsAccountIdentifierLogpushJobsRequest**](PostAccountsAccountIdentifierLogpushJobsRequest.md)|  | |

### Return type

[**LogpushLogpushJobResponseSingle**](LogpushLogpushJobResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Logpush job response |  -  |
| **4XX** | Create Logpush job response failure |  -  |

<a id="postZonesZoneIdentifierLogpushOwnership"></a>
# **postZonesZoneIdentifierLogpushOwnership**
> LogpushGetOwnershipResponse postZonesZoneIdentifierLogpushOwnership(zoneId, postAccountsAccountIdentifierLogpushOwnershipRequest)

Get ownership challenge

Gets a new ownership challenge sent to your destination.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogpushJobsForAZoneApi;

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

    LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    PostAccountsAccountIdentifierLogpushOwnershipRequest postAccountsAccountIdentifierLogpushOwnershipRequest = new PostAccountsAccountIdentifierLogpushOwnershipRequest(); // PostAccountsAccountIdentifierLogpushOwnershipRequest | 
    try {
      LogpushGetOwnershipResponse result = apiInstance.postZonesZoneIdentifierLogpushOwnership(zoneId, postAccountsAccountIdentifierLogpushOwnershipRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAZoneApi#postZonesZoneIdentifierLogpushOwnership");
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
| **postAccountsAccountIdentifierLogpushOwnershipRequest** | [**PostAccountsAccountIdentifierLogpushOwnershipRequest**](PostAccountsAccountIdentifierLogpushOwnershipRequest.md)|  | |

### Return type

[**LogpushGetOwnershipResponse**](LogpushGetOwnershipResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get ownership challenge response |  -  |
| **4XX** | Get ownership challenge response failure |  -  |

<a id="postZonesZoneIdentifierLogpushOwnershipValidate"></a>
# **postZonesZoneIdentifierLogpushOwnershipValidate**
> LogpushValidateOwnershipResponse postZonesZoneIdentifierLogpushOwnershipValidate(zoneId, postAccountsAccountIdentifierLogpushOwnershipValidateRequest)

Validate ownership challenge

Validates ownership challenge of the destination.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogpushJobsForAZoneApi;

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

    LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    PostAccountsAccountIdentifierLogpushOwnershipValidateRequest postAccountsAccountIdentifierLogpushOwnershipValidateRequest = new PostAccountsAccountIdentifierLogpushOwnershipValidateRequest(); // PostAccountsAccountIdentifierLogpushOwnershipValidateRequest | 
    try {
      LogpushValidateOwnershipResponse result = apiInstance.postZonesZoneIdentifierLogpushOwnershipValidate(zoneId, postAccountsAccountIdentifierLogpushOwnershipValidateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAZoneApi#postZonesZoneIdentifierLogpushOwnershipValidate");
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
| **postAccountsAccountIdentifierLogpushOwnershipValidateRequest** | [**PostAccountsAccountIdentifierLogpushOwnershipValidateRequest**](PostAccountsAccountIdentifierLogpushOwnershipValidateRequest.md)|  | |

### Return type

[**LogpushValidateOwnershipResponse**](LogpushValidateOwnershipResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Validate ownership challenge response |  -  |
| **4XX** | Validate ownership challenge response failure |  -  |

<a id="postZonesZoneIdentifierLogpushValidateDestinationExists"></a>
# **postZonesZoneIdentifierLogpushValidateDestinationExists**
> LogpushDestinationExistsResponse postZonesZoneIdentifierLogpushValidateDestinationExists(zoneId, postAccountsAccountIdentifierLogpushOwnershipRequest)

Check destination exists

Checks if there is an existing job with a destination.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogpushJobsForAZoneApi;

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

    LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    PostAccountsAccountIdentifierLogpushOwnershipRequest postAccountsAccountIdentifierLogpushOwnershipRequest = new PostAccountsAccountIdentifierLogpushOwnershipRequest(); // PostAccountsAccountIdentifierLogpushOwnershipRequest | 
    try {
      LogpushDestinationExistsResponse result = apiInstance.postZonesZoneIdentifierLogpushValidateDestinationExists(zoneId, postAccountsAccountIdentifierLogpushOwnershipRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAZoneApi#postZonesZoneIdentifierLogpushValidateDestinationExists");
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
| **postAccountsAccountIdentifierLogpushOwnershipRequest** | [**PostAccountsAccountIdentifierLogpushOwnershipRequest**](PostAccountsAccountIdentifierLogpushOwnershipRequest.md)|  | |

### Return type

[**LogpushDestinationExistsResponse**](LogpushDestinationExistsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Check destination exists response |  -  |
| **4XX** | Check destination exists response failure |  -  |

<a id="postZonesZoneIdentifierLogpushValidateOrigin"></a>
# **postZonesZoneIdentifierLogpushValidateOrigin**
> LogpushValidateResponse postZonesZoneIdentifierLogpushValidateOrigin(zoneId, postAccountsAccountIdentifierLogpushValidateOriginRequest)

Validate origin

Validates logpull origin with logpull_options.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogpushJobsForAZoneApi;

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

    LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    PostAccountsAccountIdentifierLogpushValidateOriginRequest postAccountsAccountIdentifierLogpushValidateOriginRequest = new PostAccountsAccountIdentifierLogpushValidateOriginRequest(); // PostAccountsAccountIdentifierLogpushValidateOriginRequest | 
    try {
      LogpushValidateResponse result = apiInstance.postZonesZoneIdentifierLogpushValidateOrigin(zoneId, postAccountsAccountIdentifierLogpushValidateOriginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAZoneApi#postZonesZoneIdentifierLogpushValidateOrigin");
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
| **postAccountsAccountIdentifierLogpushValidateOriginRequest** | [**PostAccountsAccountIdentifierLogpushValidateOriginRequest**](PostAccountsAccountIdentifierLogpushValidateOriginRequest.md)|  | |

### Return type

[**LogpushValidateResponse**](LogpushValidateResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Validate origin response |  -  |
| **4XX** | Validate origin response failure |  -  |

<a id="putZonesZoneIdentifierLogpushJobsJobIdentifier"></a>
# **putZonesZoneIdentifierLogpushJobsJobIdentifier**
> LogpushLogpushJobResponseSingle putZonesZoneIdentifierLogpushJobsJobIdentifier(jobId, zoneId, putAccountsAccountIdentifierLogpushJobsJobIdentifierRequest)

Update Logpush job

Updates a Logpush job.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogpushJobsForAZoneApi;

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

    LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi(defaultClient);
    Integer jobId = 56; // Integer | 
    String zoneId = "zoneId_example"; // String | 
    PutAccountsAccountIdentifierLogpushJobsJobIdentifierRequest putAccountsAccountIdentifierLogpushJobsJobIdentifierRequest = new PutAccountsAccountIdentifierLogpushJobsJobIdentifierRequest(); // PutAccountsAccountIdentifierLogpushJobsJobIdentifierRequest | 
    try {
      LogpushLogpushJobResponseSingle result = apiInstance.putZonesZoneIdentifierLogpushJobsJobIdentifier(jobId, zoneId, putAccountsAccountIdentifierLogpushJobsJobIdentifierRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAZoneApi#putZonesZoneIdentifierLogpushJobsJobIdentifier");
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
| **jobId** | **Integer**|  | |
| **zoneId** | **String**|  | |
| **putAccountsAccountIdentifierLogpushJobsJobIdentifierRequest** | [**PutAccountsAccountIdentifierLogpushJobsJobIdentifierRequest**](PutAccountsAccountIdentifierLogpushJobsJobIdentifierRequest.md)|  | |

### Return type

[**LogpushLogpushJobResponseSingle**](LogpushLogpushJobResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Logpush job response |  -  |
| **4XX** | Update Logpush job response failure |  -  |

