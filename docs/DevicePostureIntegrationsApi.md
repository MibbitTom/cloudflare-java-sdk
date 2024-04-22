# DevicePostureIntegrationsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**devicePostureIntegrationsCreateDevicePostureIntegration**](DevicePostureIntegrationsApi.md#devicePostureIntegrationsCreateDevicePostureIntegration) | **POST** /accounts/{account_id}/devices/posture/integration | Create a device posture integration |
| [**devicePostureIntegrationsDeleteDevicePostureIntegration**](DevicePostureIntegrationsApi.md#devicePostureIntegrationsDeleteDevicePostureIntegration) | **DELETE** /accounts/{account_id}/devices/posture/integration/{integration_id} | Delete a device posture integration |
| [**devicePostureIntegrationsDevicePostureIntegrationDetails**](DevicePostureIntegrationsApi.md#devicePostureIntegrationsDevicePostureIntegrationDetails) | **GET** /accounts/{account_id}/devices/posture/integration/{integration_id} | Get device posture integration details |
| [**devicePostureIntegrationsListDevicePostureIntegrations**](DevicePostureIntegrationsApi.md#devicePostureIntegrationsListDevicePostureIntegrations) | **GET** /accounts/{account_id}/devices/posture/integration | List your device posture integrations |
| [**devicePostureIntegrationsUpdateDevicePostureIntegration**](DevicePostureIntegrationsApi.md#devicePostureIntegrationsUpdateDevicePostureIntegration) | **PATCH** /accounts/{account_id}/devices/posture/integration/{integration_id} | Update a device posture integration |


<a id="devicePostureIntegrationsCreateDevicePostureIntegration"></a>
# **devicePostureIntegrationsCreateDevicePostureIntegration**
> TeamsDevicesSchemasSingleResponse devicePostureIntegrationsCreateDevicePostureIntegration(accountId, devicePostureIntegrationsCreateDevicePostureIntegrationRequest)

Create a device posture integration

Create a new device posture integration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DevicePostureIntegrationsApi;

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

    DevicePostureIntegrationsApi apiInstance = new DevicePostureIntegrationsApi(defaultClient);
    Object accountId = null; // Object | 
    DevicePostureIntegrationsCreateDevicePostureIntegrationRequest devicePostureIntegrationsCreateDevicePostureIntegrationRequest = new DevicePostureIntegrationsCreateDevicePostureIntegrationRequest(); // DevicePostureIntegrationsCreateDevicePostureIntegrationRequest | 
    try {
      TeamsDevicesSchemasSingleResponse result = apiInstance.devicePostureIntegrationsCreateDevicePostureIntegration(accountId, devicePostureIntegrationsCreateDevicePostureIntegrationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePostureIntegrationsApi#devicePostureIntegrationsCreateDevicePostureIntegration");
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
| **accountId** | [**Object**](.md)|  | |
| **devicePostureIntegrationsCreateDevicePostureIntegrationRequest** | [**DevicePostureIntegrationsCreateDevicePostureIntegrationRequest**](DevicePostureIntegrationsCreateDevicePostureIntegrationRequest.md)|  | |

### Return type

[**TeamsDevicesSchemasSingleResponse**](TeamsDevicesSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a device posture integration response |  -  |
| **4XX** | Create a device posture integration response failure |  -  |

<a id="devicePostureIntegrationsDeleteDevicePostureIntegration"></a>
# **devicePostureIntegrationsDeleteDevicePostureIntegration**
> TeamsDevicesSchemasIdResponse devicePostureIntegrationsDeleteDevicePostureIntegration(integrationId, accountId)

Delete a device posture integration

Delete a configured device posture integration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DevicePostureIntegrationsApi;

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

    DevicePostureIntegrationsApi apiInstance = new DevicePostureIntegrationsApi(defaultClient);
    String integrationId = "integrationId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      TeamsDevicesSchemasIdResponse result = apiInstance.devicePostureIntegrationsDeleteDevicePostureIntegration(integrationId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePostureIntegrationsApi#devicePostureIntegrationsDeleteDevicePostureIntegration");
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
| **integrationId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**TeamsDevicesSchemasIdResponse**](TeamsDevicesSchemasIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a device posture integration response |  -  |
| **4XX** | Delete a device posture integration response failure |  -  |

<a id="devicePostureIntegrationsDevicePostureIntegrationDetails"></a>
# **devicePostureIntegrationsDevicePostureIntegrationDetails**
> TeamsDevicesSchemasSingleResponse devicePostureIntegrationsDevicePostureIntegrationDetails(integrationId, accountId)

Get device posture integration details

Fetches details for a single device posture integration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DevicePostureIntegrationsApi;

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

    DevicePostureIntegrationsApi apiInstance = new DevicePostureIntegrationsApi(defaultClient);
    String integrationId = "integrationId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      TeamsDevicesSchemasSingleResponse result = apiInstance.devicePostureIntegrationsDevicePostureIntegrationDetails(integrationId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePostureIntegrationsApi#devicePostureIntegrationsDevicePostureIntegrationDetails");
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
| **integrationId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**TeamsDevicesSchemasSingleResponse**](TeamsDevicesSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get device posture integration details response |  -  |
| **4XX** | Get device posture integration details response failure |  -  |

<a id="devicePostureIntegrationsListDevicePostureIntegrations"></a>
# **devicePostureIntegrationsListDevicePostureIntegrations**
> TeamsDevicesSchemasResponseCollection devicePostureIntegrationsListDevicePostureIntegrations(accountId)

List your device posture integrations

Fetches the list of device posture integrations for an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DevicePostureIntegrationsApi;

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

    DevicePostureIntegrationsApi apiInstance = new DevicePostureIntegrationsApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      TeamsDevicesSchemasResponseCollection result = apiInstance.devicePostureIntegrationsListDevicePostureIntegrations(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePostureIntegrationsApi#devicePostureIntegrationsListDevicePostureIntegrations");
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
| **accountId** | [**Object**](.md)|  | |

### Return type

[**TeamsDevicesSchemasResponseCollection**](TeamsDevicesSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List your device posture integrations response |  -  |
| **4XX** | List your device posture integrations response failure |  -  |

<a id="devicePostureIntegrationsUpdateDevicePostureIntegration"></a>
# **devicePostureIntegrationsUpdateDevicePostureIntegration**
> TeamsDevicesSchemasSingleResponse devicePostureIntegrationsUpdateDevicePostureIntegration(integrationId, accountId, devicePostureIntegrationsUpdateDevicePostureIntegrationRequest)

Update a device posture integration

Updates a configured device posture integration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DevicePostureIntegrationsApi;

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

    DevicePostureIntegrationsApi apiInstance = new DevicePostureIntegrationsApi(defaultClient);
    String integrationId = "integrationId_example"; // String | 
    Object accountId = null; // Object | 
    DevicePostureIntegrationsUpdateDevicePostureIntegrationRequest devicePostureIntegrationsUpdateDevicePostureIntegrationRequest = new DevicePostureIntegrationsUpdateDevicePostureIntegrationRequest(); // DevicePostureIntegrationsUpdateDevicePostureIntegrationRequest | 
    try {
      TeamsDevicesSchemasSingleResponse result = apiInstance.devicePostureIntegrationsUpdateDevicePostureIntegration(integrationId, accountId, devicePostureIntegrationsUpdateDevicePostureIntegrationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePostureIntegrationsApi#devicePostureIntegrationsUpdateDevicePostureIntegration");
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
| **integrationId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |
| **devicePostureIntegrationsUpdateDevicePostureIntegrationRequest** | [**DevicePostureIntegrationsUpdateDevicePostureIntegrationRequest**](DevicePostureIntegrationsUpdateDevicePostureIntegrationRequest.md)|  | |

### Return type

[**TeamsDevicesSchemasSingleResponse**](TeamsDevicesSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a device posture integration response |  -  |
| **4XX** | Update a device posture integration response failure |  -  |

