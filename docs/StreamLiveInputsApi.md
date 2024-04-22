# StreamLiveInputsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**streamLiveInputsCreateALiveInput**](StreamLiveInputsApi.md#streamLiveInputsCreateALiveInput) | **POST** /accounts/{account_id}/stream/live_inputs | Create a live input |
| [**streamLiveInputsCreateANewOutputConnectedToALiveInput**](StreamLiveInputsApi.md#streamLiveInputsCreateANewOutputConnectedToALiveInput) | **POST** /accounts/{account_id}/stream/live_inputs/{live_input_identifier}/outputs | Create a new output, connected to a live input |
| [**streamLiveInputsDeleteALiveInput**](StreamLiveInputsApi.md#streamLiveInputsDeleteALiveInput) | **DELETE** /accounts/{account_id}/stream/live_inputs/{live_input_identifier} | Delete a live input |
| [**streamLiveInputsDeleteAnOutput**](StreamLiveInputsApi.md#streamLiveInputsDeleteAnOutput) | **DELETE** /accounts/{account_id}/stream/live_inputs/{live_input_identifier}/outputs/{output_identifier} | Delete an output |
| [**streamLiveInputsListAllOutputsAssociatedWithASpecifiedLiveInput**](StreamLiveInputsApi.md#streamLiveInputsListAllOutputsAssociatedWithASpecifiedLiveInput) | **GET** /accounts/{account_id}/stream/live_inputs/{live_input_identifier}/outputs | List all outputs associated with a specified live input |
| [**streamLiveInputsListLiveInputs**](StreamLiveInputsApi.md#streamLiveInputsListLiveInputs) | **GET** /accounts/{account_id}/stream/live_inputs | List live inputs |
| [**streamLiveInputsRetrieveALiveInput**](StreamLiveInputsApi.md#streamLiveInputsRetrieveALiveInput) | **GET** /accounts/{account_id}/stream/live_inputs/{live_input_identifier} | Retrieve a live input |
| [**streamLiveInputsUpdateALiveInput**](StreamLiveInputsApi.md#streamLiveInputsUpdateALiveInput) | **PUT** /accounts/{account_id}/stream/live_inputs/{live_input_identifier} | Update a live input |
| [**streamLiveInputsUpdateAnOutput**](StreamLiveInputsApi.md#streamLiveInputsUpdateAnOutput) | **PUT** /accounts/{account_id}/stream/live_inputs/{live_input_identifier}/outputs/{output_identifier} | Update an output |


<a id="streamLiveInputsCreateALiveInput"></a>
# **streamLiveInputsCreateALiveInput**
> StreamLiveInputResponseSingle streamLiveInputsCreateALiveInput(accountId, streamCreateInputRequest)

Create a live input

Creates a live input, and returns credentials that you or your users can use to stream live video to Cloudflare Stream.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamLiveInputsApi;

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

    StreamLiveInputsApi apiInstance = new StreamLiveInputsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    StreamCreateInputRequest streamCreateInputRequest = new StreamCreateInputRequest(); // StreamCreateInputRequest | 
    try {
      StreamLiveInputResponseSingle result = apiInstance.streamLiveInputsCreateALiveInput(accountId, streamCreateInputRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsCreateALiveInput");
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
| **streamCreateInputRequest** | [**StreamCreateInputRequest**](StreamCreateInputRequest.md)|  | |

### Return type

[**StreamLiveInputResponseSingle**](StreamLiveInputResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a live input response |  -  |
| **4XX** | Create a live input response failure |  -  |

<a id="streamLiveInputsCreateANewOutputConnectedToALiveInput"></a>
# **streamLiveInputsCreateANewOutputConnectedToALiveInput**
> StreamOutputResponseSingle streamLiveInputsCreateANewOutputConnectedToALiveInput(liveInputIdentifier, accountId, streamCreateOutputRequest)

Create a new output, connected to a live input

Creates a new output that can be used to simulcast or restream live video to other RTMP or SRT destinations. Outputs are always linked to a specific live input — one live input can have many outputs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamLiveInputsApi;

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

    StreamLiveInputsApi apiInstance = new StreamLiveInputsApi(defaultClient);
    String liveInputIdentifier = "liveInputIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    StreamCreateOutputRequest streamCreateOutputRequest = new StreamCreateOutputRequest(); // StreamCreateOutputRequest | 
    try {
      StreamOutputResponseSingle result = apiInstance.streamLiveInputsCreateANewOutputConnectedToALiveInput(liveInputIdentifier, accountId, streamCreateOutputRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsCreateANewOutputConnectedToALiveInput");
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
| **liveInputIdentifier** | **String**|  | |
| **accountId** | **String**|  | |
| **streamCreateOutputRequest** | [**StreamCreateOutputRequest**](StreamCreateOutputRequest.md)|  | |

### Return type

[**StreamOutputResponseSingle**](StreamOutputResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a new output, connected to a live input response |  -  |
| **4XX** | Create a new output, connected to a live input response failure |  -  |

<a id="streamLiveInputsDeleteALiveInput"></a>
# **streamLiveInputsDeleteALiveInput**
> streamLiveInputsDeleteALiveInput(liveInputIdentifier, accountId)

Delete a live input

Prevents a live input from being streamed to and makes the live input inaccessible to any future API calls.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamLiveInputsApi;

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

    StreamLiveInputsApi apiInstance = new StreamLiveInputsApi(defaultClient);
    String liveInputIdentifier = "liveInputIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      apiInstance.streamLiveInputsDeleteALiveInput(liveInputIdentifier, accountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsDeleteALiveInput");
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
| **liveInputIdentifier** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a live input response |  -  |
| **4XX** | Delete a live input response failure |  -  |

<a id="streamLiveInputsDeleteAnOutput"></a>
# **streamLiveInputsDeleteAnOutput**
> streamLiveInputsDeleteAnOutput(outputIdentifier, liveInputIdentifier, accountId)

Delete an output

Deletes an output and removes it from the associated live input.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamLiveInputsApi;

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

    StreamLiveInputsApi apiInstance = new StreamLiveInputsApi(defaultClient);
    String outputIdentifier = "outputIdentifier_example"; // String | 
    String liveInputIdentifier = "liveInputIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      apiInstance.streamLiveInputsDeleteAnOutput(outputIdentifier, liveInputIdentifier, accountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsDeleteAnOutput");
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
| **outputIdentifier** | **String**|  | |
| **liveInputIdentifier** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete an output response |  -  |
| **4XX** | Delete an output response failure |  -  |

<a id="streamLiveInputsListAllOutputsAssociatedWithASpecifiedLiveInput"></a>
# **streamLiveInputsListAllOutputsAssociatedWithASpecifiedLiveInput**
> StreamOutputResponseCollection streamLiveInputsListAllOutputsAssociatedWithASpecifiedLiveInput(liveInputIdentifier, accountId)

List all outputs associated with a specified live input

Retrieves all outputs associated with a specified live input.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamLiveInputsApi;

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

    StreamLiveInputsApi apiInstance = new StreamLiveInputsApi(defaultClient);
    String liveInputIdentifier = "liveInputIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      StreamOutputResponseCollection result = apiInstance.streamLiveInputsListAllOutputsAssociatedWithASpecifiedLiveInput(liveInputIdentifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsListAllOutputsAssociatedWithASpecifiedLiveInput");
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
| **liveInputIdentifier** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**StreamOutputResponseCollection**](StreamOutputResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List all outputs associated with a specified live input response |  -  |
| **4XX** | List all outputs associated with a specified live input response failure |  -  |

<a id="streamLiveInputsListLiveInputs"></a>
# **streamLiveInputsListLiveInputs**
> StreamLiveInputResponseCollection streamLiveInputsListLiveInputs(accountId, includeCounts)

List live inputs

Lists the live inputs created for an account. To get the credentials needed to stream to a specific live input, request a single live input.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamLiveInputsApi;

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

    StreamLiveInputsApi apiInstance = new StreamLiveInputsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Boolean includeCounts = false; // Boolean | 
    try {
      StreamLiveInputResponseCollection result = apiInstance.streamLiveInputsListLiveInputs(accountId, includeCounts);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsListLiveInputs");
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
| **includeCounts** | **Boolean**|  | [optional] [default to false] |

### Return type

[**StreamLiveInputResponseCollection**](StreamLiveInputResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List live inputs response |  -  |
| **4XX** | List live inputs response failure |  -  |

<a id="streamLiveInputsRetrieveALiveInput"></a>
# **streamLiveInputsRetrieveALiveInput**
> StreamLiveInputResponseSingle streamLiveInputsRetrieveALiveInput(liveInputIdentifier, accountId)

Retrieve a live input

Retrieves details of an existing live input.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamLiveInputsApi;

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

    StreamLiveInputsApi apiInstance = new StreamLiveInputsApi(defaultClient);
    String liveInputIdentifier = "liveInputIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      StreamLiveInputResponseSingle result = apiInstance.streamLiveInputsRetrieveALiveInput(liveInputIdentifier, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsRetrieveALiveInput");
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
| **liveInputIdentifier** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**StreamLiveInputResponseSingle**](StreamLiveInputResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve a live input response |  -  |
| **4XX** | Retrieve a live input response failure |  -  |

<a id="streamLiveInputsUpdateALiveInput"></a>
# **streamLiveInputsUpdateALiveInput**
> StreamLiveInputResponseSingle streamLiveInputsUpdateALiveInput(liveInputIdentifier, accountId, streamUpdateInputRequest)

Update a live input

Updates a specified live input.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamLiveInputsApi;

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

    StreamLiveInputsApi apiInstance = new StreamLiveInputsApi(defaultClient);
    String liveInputIdentifier = "liveInputIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    StreamUpdateInputRequest streamUpdateInputRequest = new StreamUpdateInputRequest(); // StreamUpdateInputRequest | 
    try {
      StreamLiveInputResponseSingle result = apiInstance.streamLiveInputsUpdateALiveInput(liveInputIdentifier, accountId, streamUpdateInputRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsUpdateALiveInput");
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
| **liveInputIdentifier** | **String**|  | |
| **accountId** | **String**|  | |
| **streamUpdateInputRequest** | [**StreamUpdateInputRequest**](StreamUpdateInputRequest.md)|  | |

### Return type

[**StreamLiveInputResponseSingle**](StreamLiveInputResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a live input response |  -  |
| **4XX** | Update a live input response failure |  -  |

<a id="streamLiveInputsUpdateAnOutput"></a>
# **streamLiveInputsUpdateAnOutput**
> StreamOutputResponseSingle streamLiveInputsUpdateAnOutput(outputIdentifier, liveInputIdentifier, accountId, streamUpdateOutputRequest)

Update an output

Updates the state of an output.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamLiveInputsApi;

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

    StreamLiveInputsApi apiInstance = new StreamLiveInputsApi(defaultClient);
    String outputIdentifier = "outputIdentifier_example"; // String | 
    String liveInputIdentifier = "liveInputIdentifier_example"; // String | 
    String accountId = "accountId_example"; // String | 
    StreamUpdateOutputRequest streamUpdateOutputRequest = new StreamUpdateOutputRequest(); // StreamUpdateOutputRequest | 
    try {
      StreamOutputResponseSingle result = apiInstance.streamLiveInputsUpdateAnOutput(outputIdentifier, liveInputIdentifier, accountId, streamUpdateOutputRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsUpdateAnOutput");
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
| **outputIdentifier** | **String**|  | |
| **liveInputIdentifier** | **String**|  | |
| **accountId** | **String**|  | |
| **streamUpdateOutputRequest** | [**StreamUpdateOutputRequest**](StreamUpdateOutputRequest.md)|  | |

### Return type

[**StreamOutputResponseSingle**](StreamOutputResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update an output response |  -  |
| **4XX** | Update an output response failure |  -  |

