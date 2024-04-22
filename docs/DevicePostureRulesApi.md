# DevicePostureRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**devicePostureRulesCreateDevicePostureRule**](DevicePostureRulesApi.md#devicePostureRulesCreateDevicePostureRule) | **POST** /accounts/{account_id}/devices/posture | Create a device posture rule |
| [**devicePostureRulesDeleteDevicePostureRule**](DevicePostureRulesApi.md#devicePostureRulesDeleteDevicePostureRule) | **DELETE** /accounts/{account_id}/devices/posture/{rule_id} | Delete a device posture rule |
| [**devicePostureRulesDevicePostureRulesDetails**](DevicePostureRulesApi.md#devicePostureRulesDevicePostureRulesDetails) | **GET** /accounts/{account_id}/devices/posture/{rule_id} | Get device posture rule details |
| [**devicePostureRulesListDevicePostureRules**](DevicePostureRulesApi.md#devicePostureRulesListDevicePostureRules) | **GET** /accounts/{account_id}/devices/posture | List device posture rules |
| [**devicePostureRulesUpdateDevicePostureRule**](DevicePostureRulesApi.md#devicePostureRulesUpdateDevicePostureRule) | **PUT** /accounts/{account_id}/devices/posture/{rule_id} | Update a device posture rule |


<a id="devicePostureRulesCreateDevicePostureRule"></a>
# **devicePostureRulesCreateDevicePostureRule**
> TeamsDevicesSingleResponse devicePostureRulesCreateDevicePostureRule(accountId, devicePostureRulesCreateDevicePostureRuleRequest)

Create a device posture rule

Creates a new device posture rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DevicePostureRulesApi;

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

    DevicePostureRulesApi apiInstance = new DevicePostureRulesApi(defaultClient);
    Object accountId = null; // Object | 
    DevicePostureRulesCreateDevicePostureRuleRequest devicePostureRulesCreateDevicePostureRuleRequest = new DevicePostureRulesCreateDevicePostureRuleRequest(); // DevicePostureRulesCreateDevicePostureRuleRequest | 
    try {
      TeamsDevicesSingleResponse result = apiInstance.devicePostureRulesCreateDevicePostureRule(accountId, devicePostureRulesCreateDevicePostureRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePostureRulesApi#devicePostureRulesCreateDevicePostureRule");
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
| **devicePostureRulesCreateDevicePostureRuleRequest** | [**DevicePostureRulesCreateDevicePostureRuleRequest**](DevicePostureRulesCreateDevicePostureRuleRequest.md)|  | |

### Return type

[**TeamsDevicesSingleResponse**](TeamsDevicesSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create device posture rule response |  -  |
| **4XX** | Create device posture rule response failure |  -  |

<a id="devicePostureRulesDeleteDevicePostureRule"></a>
# **devicePostureRulesDeleteDevicePostureRule**
> TeamsDevicesIdResponse devicePostureRulesDeleteDevicePostureRule(ruleId, accountId)

Delete a device posture rule

Deletes a device posture rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DevicePostureRulesApi;

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

    DevicePostureRulesApi apiInstance = new DevicePostureRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      TeamsDevicesIdResponse result = apiInstance.devicePostureRulesDeleteDevicePostureRule(ruleId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePostureRulesApi#devicePostureRulesDeleteDevicePostureRule");
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
| **ruleId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**TeamsDevicesIdResponse**](TeamsDevicesIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a device posture rule response |  -  |
| **4XX** | Delete a device posture rule response failure |  -  |

<a id="devicePostureRulesDevicePostureRulesDetails"></a>
# **devicePostureRulesDevicePostureRulesDetails**
> TeamsDevicesSingleResponse devicePostureRulesDevicePostureRulesDetails(ruleId, accountId)

Get device posture rule details

Fetches a single device posture rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DevicePostureRulesApi;

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

    DevicePostureRulesApi apiInstance = new DevicePostureRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      TeamsDevicesSingleResponse result = apiInstance.devicePostureRulesDevicePostureRulesDetails(ruleId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePostureRulesApi#devicePostureRulesDevicePostureRulesDetails");
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
| **ruleId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**TeamsDevicesSingleResponse**](TeamsDevicesSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get device posture rule details response |  -  |
| **4XX** | Get device posture rule details response failure |  -  |

<a id="devicePostureRulesListDevicePostureRules"></a>
# **devicePostureRulesListDevicePostureRules**
> TeamsDevicesResponseCollection devicePostureRulesListDevicePostureRules(accountId)

List device posture rules

Fetches device posture rules for a Zero Trust account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DevicePostureRulesApi;

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

    DevicePostureRulesApi apiInstance = new DevicePostureRulesApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      TeamsDevicesResponseCollection result = apiInstance.devicePostureRulesListDevicePostureRules(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePostureRulesApi#devicePostureRulesListDevicePostureRules");
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

[**TeamsDevicesResponseCollection**](TeamsDevicesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List device posture rules response |  -  |
| **4XX** | List device posture rules response failure |  -  |

<a id="devicePostureRulesUpdateDevicePostureRule"></a>
# **devicePostureRulesUpdateDevicePostureRule**
> TeamsDevicesSingleResponse devicePostureRulesUpdateDevicePostureRule(ruleId, accountId, devicePostureRulesCreateDevicePostureRuleRequest)

Update a device posture rule

Updates a device posture rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DevicePostureRulesApi;

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

    DevicePostureRulesApi apiInstance = new DevicePostureRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    Object accountId = null; // Object | 
    DevicePostureRulesCreateDevicePostureRuleRequest devicePostureRulesCreateDevicePostureRuleRequest = new DevicePostureRulesCreateDevicePostureRuleRequest(); // DevicePostureRulesCreateDevicePostureRuleRequest | 
    try {
      TeamsDevicesSingleResponse result = apiInstance.devicePostureRulesUpdateDevicePostureRule(ruleId, accountId, devicePostureRulesCreateDevicePostureRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePostureRulesApi#devicePostureRulesUpdateDevicePostureRule");
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
| **ruleId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |
| **devicePostureRulesCreateDevicePostureRuleRequest** | [**DevicePostureRulesCreateDevicePostureRuleRequest**](DevicePostureRulesCreateDevicePostureRuleRequest.md)|  | |

### Return type

[**TeamsDevicesSingleResponse**](TeamsDevicesSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a device posture rule response |  -  |
| **4XX** | Update a device posture rule response failure |  -  |

