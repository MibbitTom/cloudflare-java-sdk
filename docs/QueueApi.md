# QueueApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**queueV2CreateQueue**](QueueApi.md#queueV2CreateQueue) | **POST** /accounts/{account_id}/queues | Create Queue |
| [**queueV2CreateQueueConsumer**](QueueApi.md#queueV2CreateQueueConsumer) | **POST** /accounts/{account_id}/queues/{queue_id}/consumers | Create Queue Consumer |
| [**queueV2DeleteQueue**](QueueApi.md#queueV2DeleteQueue) | **DELETE** /accounts/{account_id}/queues/{queue_id} | Delete Queue |
| [**queueV2DeleteQueueConsumer**](QueueApi.md#queueV2DeleteQueueConsumer) | **DELETE** /accounts/{account_id}/queues/{queue_id}/consumers/{consumer_id} | Delete Queue Consumer |
| [**queueV2ListQueueConsumers**](QueueApi.md#queueV2ListQueueConsumers) | **GET** /accounts/{account_id}/queues/{queue_id}/consumers | List Queue Consumers |
| [**queueV2ListQueues**](QueueApi.md#queueV2ListQueues) | **GET** /accounts/{account_id}/queues | List Queues |
| [**queueV2MessagesAck**](QueueApi.md#queueV2MessagesAck) | **POST** /accounts/{account_id}/queues/{queue_id}/messages/ack | Acknowledge + Retry Queue Messages |
| [**queueV2MessagesPull**](QueueApi.md#queueV2MessagesPull) | **POST** /accounts/{account_id}/queues/{queue_id}/messages/pull | Pull Queue Messages |
| [**queueV2QueueDetails**](QueueApi.md#queueV2QueueDetails) | **GET** /accounts/{account_id}/queues/{queue_id} | Queue Details |
| [**queueV2UpdateQueue**](QueueApi.md#queueV2UpdateQueue) | **PUT** /accounts/{account_id}/queues/{queue_id} | Update Queue |
| [**queueV2UpdateQueueConsumer**](QueueApi.md#queueV2UpdateQueueConsumer) | **PUT** /accounts/{account_id}/queues/{queue_id}/consumers/{consumer_id} | Update Queue Consumer |


<a id="queueV2CreateQueue"></a>
# **queueV2CreateQueue**
> QueueV2CreateQueue200Response queueV2CreateQueue(accountId, body)

Create Queue

Creates a new queue.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.QueueApi;

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

    QueueApi apiInstance = new QueueApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      QueueV2CreateQueue200Response result = apiInstance.queueV2CreateQueue(accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueV2CreateQueue");
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
| **body** | **Object**|  | |

### Return type

[**QueueV2CreateQueue200Response**](QueueV2CreateQueue200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Queue response |  -  |
| **4XX** | Create Queue response failure |  -  |

<a id="queueV2CreateQueueConsumer"></a>
# **queueV2CreateQueueConsumer**
> QueueV2CreateQueueConsumer200Response queueV2CreateQueueConsumer(queueId, accountId, body)

Create Queue Consumer

Creates a new consumer for a queue.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.QueueApi;

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

    QueueApi apiInstance = new QueueApi(defaultClient);
    String queueId = "queueId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      QueueV2CreateQueueConsumer200Response result = apiInstance.queueV2CreateQueueConsumer(queueId, accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueV2CreateQueueConsumer");
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
| **queueId** | **String**|  | |
| **accountId** | **String**|  | |
| **body** | **Object**|  | |

### Return type

[**QueueV2CreateQueueConsumer200Response**](QueueV2CreateQueueConsumer200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Queue Consumer response |  -  |
| **4XX** | Create Queue Consumer response failure |  -  |

<a id="queueV2DeleteQueue"></a>
# **queueV2DeleteQueue**
> QueueV2DeleteQueue200Response queueV2DeleteQueue(queueId, accountId)

Delete Queue

Deletes a queue.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.QueueApi;

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

    QueueApi apiInstance = new QueueApi(defaultClient);
    String queueId = "queueId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      QueueV2DeleteQueue200Response result = apiInstance.queueV2DeleteQueue(queueId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueV2DeleteQueue");
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
| **queueId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**QueueV2DeleteQueue200Response**](QueueV2DeleteQueue200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Queue response |  -  |
| **4XX** | Delete Queue response failure |  -  |

<a id="queueV2DeleteQueueConsumer"></a>
# **queueV2DeleteQueueConsumer**
> QueueV2DeleteQueue200Response queueV2DeleteQueueConsumer(consumerId, queueId, accountId)

Delete Queue Consumer

Deletes the consumer for a queue.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.QueueApi;

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

    QueueApi apiInstance = new QueueApi(defaultClient);
    String consumerId = "consumerId_example"; // String | 
    String queueId = "queueId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      QueueV2DeleteQueue200Response result = apiInstance.queueV2DeleteQueueConsumer(consumerId, queueId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueV2DeleteQueueConsumer");
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
| **consumerId** | **String**|  | |
| **queueId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**QueueV2DeleteQueue200Response**](QueueV2DeleteQueue200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Queue Consumer response |  -  |
| **4XX** | Delete Queue Consumer response failure |  -  |

<a id="queueV2ListQueueConsumers"></a>
# **queueV2ListQueueConsumers**
> QueueV2ListQueueConsumers200Response queueV2ListQueueConsumers(queueId, accountId)

List Queue Consumers

Returns the consumers for a queue.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.QueueApi;

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

    QueueApi apiInstance = new QueueApi(defaultClient);
    String queueId = "queueId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      QueueV2ListQueueConsumers200Response result = apiInstance.queueV2ListQueueConsumers(queueId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueV2ListQueueConsumers");
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
| **queueId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**QueueV2ListQueueConsumers200Response**](QueueV2ListQueueConsumers200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Queue Consumers response |  -  |
| **4XX** | List Queue Consumers response failure |  -  |

<a id="queueV2ListQueues"></a>
# **queueV2ListQueues**
> QueueV2ListQueues200Response queueV2ListQueues(accountId)

List Queues

Returns the queues owned by an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.QueueApi;

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

    QueueApi apiInstance = new QueueApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      QueueV2ListQueues200Response result = apiInstance.queueV2ListQueues(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueV2ListQueues");
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

[**QueueV2ListQueues200Response**](QueueV2ListQueues200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Queues response |  -  |
| **4XX** | List Queues response failure |  -  |

<a id="queueV2MessagesAck"></a>
# **queueV2MessagesAck**
> QueueV2MessagesAck200Response queueV2MessagesAck(queueId, accountId, queueV2MessagesAckRequest)

Acknowledge + Retry Queue Messages

Acknowledge + Retry messages from a Queue.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.QueueApi;

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

    QueueApi apiInstance = new QueueApi(defaultClient);
    String queueId = "queueId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    QueueV2MessagesAckRequest queueV2MessagesAckRequest = new QueueV2MessagesAckRequest(); // QueueV2MessagesAckRequest | 
    try {
      QueueV2MessagesAck200Response result = apiInstance.queueV2MessagesAck(queueId, accountId, queueV2MessagesAckRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueV2MessagesAck");
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
| **queueId** | **String**|  | |
| **accountId** | **String**|  | |
| **queueV2MessagesAckRequest** | [**QueueV2MessagesAckRequest**](QueueV2MessagesAckRequest.md)|  | |

### Return type

[**QueueV2MessagesAck200Response**](QueueV2MessagesAck200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Acknoweldge Queue Messages response |  -  |
| **4XX** | Acknoweldge Queue Messages response failure |  -  |

<a id="queueV2MessagesPull"></a>
# **queueV2MessagesPull**
> QueueV2MessagesPull200Response queueV2MessagesPull(queueId, accountId, queueV2MessagesPullRequest)

Pull Queue Messages

Pull a batch of messages from a Queue.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.QueueApi;

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

    QueueApi apiInstance = new QueueApi(defaultClient);
    String queueId = "queueId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    QueueV2MessagesPullRequest queueV2MessagesPullRequest = new QueueV2MessagesPullRequest(); // QueueV2MessagesPullRequest | 
    try {
      QueueV2MessagesPull200Response result = apiInstance.queueV2MessagesPull(queueId, accountId, queueV2MessagesPullRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueV2MessagesPull");
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
| **queueId** | **String**|  | |
| **accountId** | **String**|  | |
| **queueV2MessagesPullRequest** | [**QueueV2MessagesPullRequest**](QueueV2MessagesPullRequest.md)|  | |

### Return type

[**QueueV2MessagesPull200Response**](QueueV2MessagesPull200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pull Queue Messages response |  -  |
| **4XX** | Pull Queue Messages response failure |  -  |

<a id="queueV2QueueDetails"></a>
# **queueV2QueueDetails**
> QueueV2QueueDetails200Response queueV2QueueDetails(queueId, accountId)

Queue Details

Get information about a specific queue.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.QueueApi;

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

    QueueApi apiInstance = new QueueApi(defaultClient);
    String queueId = "queueId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      QueueV2QueueDetails200Response result = apiInstance.queueV2QueueDetails(queueId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueV2QueueDetails");
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
| **queueId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**QueueV2QueueDetails200Response**](QueueV2QueueDetails200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Queue Details response |  -  |
| **4XX** | Queue Details response failure |  -  |

<a id="queueV2UpdateQueue"></a>
# **queueV2UpdateQueue**
> QueueV2UpdateQueue200Response queueV2UpdateQueue(queueId, accountId, body)

Update Queue

Updates a queue.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.QueueApi;

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

    QueueApi apiInstance = new QueueApi(defaultClient);
    String queueId = "queueId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      QueueV2UpdateQueue200Response result = apiInstance.queueV2UpdateQueue(queueId, accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueV2UpdateQueue");
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
| **queueId** | **String**|  | |
| **accountId** | **String**|  | |
| **body** | **Object**|  | |

### Return type

[**QueueV2UpdateQueue200Response**](QueueV2UpdateQueue200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Queue response |  -  |
| **4XX** | Update Queue response failure |  -  |

<a id="queueV2UpdateQueueConsumer"></a>
# **queueV2UpdateQueueConsumer**
> QueueV2UpdateQueueConsumer200Response queueV2UpdateQueueConsumer(consumerId, queueId, accountId, body)

Update Queue Consumer

Updates the consumer for a queue, or creates one if it does not exist.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.QueueApi;

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

    QueueApi apiInstance = new QueueApi(defaultClient);
    String consumerId = "consumerId_example"; // String | 
    String queueId = "queueId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    Object body = null; // Object | 
    try {
      QueueV2UpdateQueueConsumer200Response result = apiInstance.queueV2UpdateQueueConsumer(consumerId, queueId, accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueV2UpdateQueueConsumer");
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
| **consumerId** | **String**|  | |
| **queueId** | **String**|  | |
| **accountId** | **String**|  | |
| **body** | **Object**|  | |

### Return type

[**QueueV2UpdateQueueConsumer200Response**](QueueV2UpdateQueueConsumer200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Queue Consumer response |  -  |
| **4XX** | Update Queue Consumer response failure |  -  |

