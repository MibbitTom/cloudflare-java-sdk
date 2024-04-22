# LogpushJobsForAnAccountApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAccountsAccountIdentifierLogpushJobsJobIdentifier**](LogpushJobsForAnAccountApi.md#deleteAccountsAccountIdentifierLogpushJobsJobIdentifier) | **DELETE** /accounts/{account_id}/logpush/jobs/{job_id} | Delete Logpush job |
| [**deleteAccountsAccountIdentifierLogpushValidateDestinationExists**](LogpushJobsForAnAccountApi.md#deleteAccountsAccountIdentifierLogpushValidateDestinationExists) | **POST** /accounts/{account_id}/logpush/validate/destination/exists | Check destination exists |
| [**getAccountsAccountIdentifierLogpushDatasetsDatasetFields**](LogpushJobsForAnAccountApi.md#getAccountsAccountIdentifierLogpushDatasetsDatasetFields) | **GET** /accounts/{account_id}/logpush/datasets/{dataset_id}/fields | List fields |
| [**getAccountsAccountIdentifierLogpushDatasetsDatasetJobs**](LogpushJobsForAnAccountApi.md#getAccountsAccountIdentifierLogpushDatasetsDatasetJobs) | **GET** /accounts/{account_id}/logpush/datasets/{dataset_id}/jobs | List Logpush jobs for a dataset |
| [**getAccountsAccountIdentifierLogpushJobs**](LogpushJobsForAnAccountApi.md#getAccountsAccountIdentifierLogpushJobs) | **GET** /accounts/{account_id}/logpush/jobs | List Logpush jobs |
| [**getAccountsAccountIdentifierLogpushJobsJobIdentifier**](LogpushJobsForAnAccountApi.md#getAccountsAccountIdentifierLogpushJobsJobIdentifier) | **GET** /accounts/{account_id}/logpush/jobs/{job_id} | Get Logpush job details |
| [**postAccountsAccountIdentifierLogpushJobs**](LogpushJobsForAnAccountApi.md#postAccountsAccountIdentifierLogpushJobs) | **POST** /accounts/{account_id}/logpush/jobs | Create Logpush job |
| [**postAccountsAccountIdentifierLogpushOwnership**](LogpushJobsForAnAccountApi.md#postAccountsAccountIdentifierLogpushOwnership) | **POST** /accounts/{account_id}/logpush/ownership | Get ownership challenge |
| [**postAccountsAccountIdentifierLogpushOwnershipValidate**](LogpushJobsForAnAccountApi.md#postAccountsAccountIdentifierLogpushOwnershipValidate) | **POST** /accounts/{account_id}/logpush/ownership/validate | Validate ownership challenge |
| [**postAccountsAccountIdentifierLogpushValidateOrigin**](LogpushJobsForAnAccountApi.md#postAccountsAccountIdentifierLogpushValidateOrigin) | **POST** /accounts/{account_id}/logpush/validate/origin | Validate origin |
| [**putAccountsAccountIdentifierLogpushJobsJobIdentifier**](LogpushJobsForAnAccountApi.md#putAccountsAccountIdentifierLogpushJobsJobIdentifier) | **PUT** /accounts/{account_id}/logpush/jobs/{job_id} | Update Logpush job |


<a id="deleteAccountsAccountIdentifierLogpushJobsJobIdentifier"></a>
# **deleteAccountsAccountIdentifierLogpushJobsJobIdentifier**
> DeleteAccountsAccountIdentifierLogpushJobsJobIdentifier200Response deleteAccountsAccountIdentifierLogpushJobsJobIdentifier(jobId, accountId)

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
import cloudflare.sdk.LogpushJobsForAnAccountApi;

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

    LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi(defaultClient);
    Integer jobId = 56; // Integer | 
    String accountId = "accountId_example"; // String | 
    try {
      DeleteAccountsAccountIdentifierLogpushJobsJobIdentifier200Response result = apiInstance.deleteAccountsAccountIdentifierLogpushJobsJobIdentifier(jobId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAnAccountApi#deleteAccountsAccountIdentifierLogpushJobsJobIdentifier");
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
| **accountId** | **String**|  | |

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

<a id="deleteAccountsAccountIdentifierLogpushValidateDestinationExists"></a>
# **deleteAccountsAccountIdentifierLogpushValidateDestinationExists**
> LogpushDestinationExistsResponse deleteAccountsAccountIdentifierLogpushValidateDestinationExists(accountId, postAccountsAccountIdentifierLogpushOwnershipRequest)

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
import cloudflare.sdk.LogpushJobsForAnAccountApi;

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

    LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    PostAccountsAccountIdentifierLogpushOwnershipRequest postAccountsAccountIdentifierLogpushOwnershipRequest = new PostAccountsAccountIdentifierLogpushOwnershipRequest(); // PostAccountsAccountIdentifierLogpushOwnershipRequest | 
    try {
      LogpushDestinationExistsResponse result = apiInstance.deleteAccountsAccountIdentifierLogpushValidateDestinationExists(accountId, postAccountsAccountIdentifierLogpushOwnershipRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAnAccountApi#deleteAccountsAccountIdentifierLogpushValidateDestinationExists");
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

<a id="getAccountsAccountIdentifierLogpushDatasetsDatasetFields"></a>
# **getAccountsAccountIdentifierLogpushDatasetsDatasetFields**
> LogpushLogpushFieldResponseCollection getAccountsAccountIdentifierLogpushDatasetsDatasetFields(datasetId, accountId)

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
import cloudflare.sdk.LogpushJobsForAnAccountApi;

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

    LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi(defaultClient);
    String datasetId = "datasetId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      LogpushLogpushFieldResponseCollection result = apiInstance.getAccountsAccountIdentifierLogpushDatasetsDatasetFields(datasetId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAnAccountApi#getAccountsAccountIdentifierLogpushDatasetsDatasetFields");
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
| **accountId** | **String**|  | |

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

<a id="getAccountsAccountIdentifierLogpushDatasetsDatasetJobs"></a>
# **getAccountsAccountIdentifierLogpushDatasetsDatasetJobs**
> LogpushLogpushJobResponseCollection getAccountsAccountIdentifierLogpushDatasetsDatasetJobs(datasetId, accountId)

List Logpush jobs for a dataset

Lists Logpush jobs for an account for a dataset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogpushJobsForAnAccountApi;

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

    LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi(defaultClient);
    String datasetId = "datasetId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      LogpushLogpushJobResponseCollection result = apiInstance.getAccountsAccountIdentifierLogpushDatasetsDatasetJobs(datasetId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAnAccountApi#getAccountsAccountIdentifierLogpushDatasetsDatasetJobs");
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
| **accountId** | **String**|  | |

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

<a id="getAccountsAccountIdentifierLogpushJobs"></a>
# **getAccountsAccountIdentifierLogpushJobs**
> LogpushLogpushJobResponseCollection getAccountsAccountIdentifierLogpushJobs(accountId)

List Logpush jobs

Lists Logpush jobs for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogpushJobsForAnAccountApi;

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

    LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      LogpushLogpushJobResponseCollection result = apiInstance.getAccountsAccountIdentifierLogpushJobs(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAnAccountApi#getAccountsAccountIdentifierLogpushJobs");
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

<a id="getAccountsAccountIdentifierLogpushJobsJobIdentifier"></a>
# **getAccountsAccountIdentifierLogpushJobsJobIdentifier**
> LogpushLogpushJobResponseSingle getAccountsAccountIdentifierLogpushJobsJobIdentifier(jobId, accountId)

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
import cloudflare.sdk.LogpushJobsForAnAccountApi;

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

    LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi(defaultClient);
    Integer jobId = 56; // Integer | 
    String accountId = "accountId_example"; // String | 
    try {
      LogpushLogpushJobResponseSingle result = apiInstance.getAccountsAccountIdentifierLogpushJobsJobIdentifier(jobId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAnAccountApi#getAccountsAccountIdentifierLogpushJobsJobIdentifier");
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
| **accountId** | **String**|  | |

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

<a id="postAccountsAccountIdentifierLogpushJobs"></a>
# **postAccountsAccountIdentifierLogpushJobs**
> LogpushLogpushJobResponseSingle postAccountsAccountIdentifierLogpushJobs(accountId, postAccountsAccountIdentifierLogpushJobsRequest)

Create Logpush job

Creates a new Logpush job for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.LogpushJobsForAnAccountApi;

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

    LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    PostAccountsAccountIdentifierLogpushJobsRequest postAccountsAccountIdentifierLogpushJobsRequest = new PostAccountsAccountIdentifierLogpushJobsRequest(); // PostAccountsAccountIdentifierLogpushJobsRequest | 
    try {
      LogpushLogpushJobResponseSingle result = apiInstance.postAccountsAccountIdentifierLogpushJobs(accountId, postAccountsAccountIdentifierLogpushJobsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAnAccountApi#postAccountsAccountIdentifierLogpushJobs");
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

<a id="postAccountsAccountIdentifierLogpushOwnership"></a>
# **postAccountsAccountIdentifierLogpushOwnership**
> LogpushGetOwnershipResponse postAccountsAccountIdentifierLogpushOwnership(accountId, postAccountsAccountIdentifierLogpushOwnershipRequest)

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
import cloudflare.sdk.LogpushJobsForAnAccountApi;

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

    LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    PostAccountsAccountIdentifierLogpushOwnershipRequest postAccountsAccountIdentifierLogpushOwnershipRequest = new PostAccountsAccountIdentifierLogpushOwnershipRequest(); // PostAccountsAccountIdentifierLogpushOwnershipRequest | 
    try {
      LogpushGetOwnershipResponse result = apiInstance.postAccountsAccountIdentifierLogpushOwnership(accountId, postAccountsAccountIdentifierLogpushOwnershipRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAnAccountApi#postAccountsAccountIdentifierLogpushOwnership");
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

<a id="postAccountsAccountIdentifierLogpushOwnershipValidate"></a>
# **postAccountsAccountIdentifierLogpushOwnershipValidate**
> LogpushValidateOwnershipResponse postAccountsAccountIdentifierLogpushOwnershipValidate(accountId, postAccountsAccountIdentifierLogpushOwnershipValidateRequest)

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
import cloudflare.sdk.LogpushJobsForAnAccountApi;

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

    LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    PostAccountsAccountIdentifierLogpushOwnershipValidateRequest postAccountsAccountIdentifierLogpushOwnershipValidateRequest = new PostAccountsAccountIdentifierLogpushOwnershipValidateRequest(); // PostAccountsAccountIdentifierLogpushOwnershipValidateRequest | 
    try {
      LogpushValidateOwnershipResponse result = apiInstance.postAccountsAccountIdentifierLogpushOwnershipValidate(accountId, postAccountsAccountIdentifierLogpushOwnershipValidateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAnAccountApi#postAccountsAccountIdentifierLogpushOwnershipValidate");
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

<a id="postAccountsAccountIdentifierLogpushValidateOrigin"></a>
# **postAccountsAccountIdentifierLogpushValidateOrigin**
> LogpushValidateResponse postAccountsAccountIdentifierLogpushValidateOrigin(accountId, postAccountsAccountIdentifierLogpushValidateOriginRequest)

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
import cloudflare.sdk.LogpushJobsForAnAccountApi;

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

    LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    PostAccountsAccountIdentifierLogpushValidateOriginRequest postAccountsAccountIdentifierLogpushValidateOriginRequest = new PostAccountsAccountIdentifierLogpushValidateOriginRequest(); // PostAccountsAccountIdentifierLogpushValidateOriginRequest | 
    try {
      LogpushValidateResponse result = apiInstance.postAccountsAccountIdentifierLogpushValidateOrigin(accountId, postAccountsAccountIdentifierLogpushValidateOriginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAnAccountApi#postAccountsAccountIdentifierLogpushValidateOrigin");
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

<a id="putAccountsAccountIdentifierLogpushJobsJobIdentifier"></a>
# **putAccountsAccountIdentifierLogpushJobsJobIdentifier**
> LogpushLogpushJobResponseSingle putAccountsAccountIdentifierLogpushJobsJobIdentifier(jobId, accountId, putAccountsAccountIdentifierLogpushJobsJobIdentifierRequest)

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
import cloudflare.sdk.LogpushJobsForAnAccountApi;

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

    LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi(defaultClient);
    Integer jobId = 56; // Integer | 
    String accountId = "accountId_example"; // String | 
    PutAccountsAccountIdentifierLogpushJobsJobIdentifierRequest putAccountsAccountIdentifierLogpushJobsJobIdentifierRequest = new PutAccountsAccountIdentifierLogpushJobsJobIdentifierRequest(); // PutAccountsAccountIdentifierLogpushJobsJobIdentifierRequest | 
    try {
      LogpushLogpushJobResponseSingle result = apiInstance.putAccountsAccountIdentifierLogpushJobsJobIdentifier(jobId, accountId, putAccountsAccountIdentifierLogpushJobsJobIdentifierRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogpushJobsForAnAccountApi#putAccountsAccountIdentifierLogpushJobsJobIdentifier");
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
| **accountId** | **String**|  | |
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

