# DevicesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**devicesCreateDeviceSettingsPolicy**](DevicesApi.md#devicesCreateDeviceSettingsPolicy) | **POST** /accounts/{account_id}/devices/policy | Create a device settings profile |
| [**devicesDeleteDeviceSettingsPolicy**](DevicesApi.md#devicesDeleteDeviceSettingsPolicy) | **DELETE** /accounts/{account_id}/devices/policy/{policy_id} | Delete a device settings profile |
| [**devicesDeviceDetails**](DevicesApi.md#devicesDeviceDetails) | **GET** /accounts/{account_id}/devices/{device_id} | Get device details |
| [**devicesGetDefaultDeviceSettingsPolicy**](DevicesApi.md#devicesGetDefaultDeviceSettingsPolicy) | **GET** /accounts/{account_id}/devices/policy | Get the default device settings profile |
| [**devicesGetDeviceSettingsPolicyById**](DevicesApi.md#devicesGetDeviceSettingsPolicyById) | **GET** /accounts/{account_id}/devices/policy/{policy_id} | Get device settings profile by ID |
| [**devicesGetLocalDomainFallbackList**](DevicesApi.md#devicesGetLocalDomainFallbackList) | **GET** /accounts/{account_id}/devices/policy/fallback_domains | Get your Local Domain Fallback list |
| [**devicesGetLocalDomainFallbackListForADeviceSettingsPolicy**](DevicesApi.md#devicesGetLocalDomainFallbackListForADeviceSettingsPolicy) | **GET** /accounts/{account_id}/devices/policy/{policy_id}/fallback_domains | Get the Local Domain Fallback list for a device settings profile |
| [**devicesGetSplitTunnelExcludeList**](DevicesApi.md#devicesGetSplitTunnelExcludeList) | **GET** /accounts/{account_id}/devices/policy/exclude | Get the Split Tunnel exclude list |
| [**devicesGetSplitTunnelExcludeListForADeviceSettingsPolicy**](DevicesApi.md#devicesGetSplitTunnelExcludeListForADeviceSettingsPolicy) | **GET** /accounts/{account_id}/devices/policy/{policy_id}/exclude | Get the Split Tunnel exclude list for a device settings profile |
| [**devicesGetSplitTunnelIncludeList**](DevicesApi.md#devicesGetSplitTunnelIncludeList) | **GET** /accounts/{account_id}/devices/policy/include | Get the Split Tunnel include list |
| [**devicesGetSplitTunnelIncludeListForADeviceSettingsPolicy**](DevicesApi.md#devicesGetSplitTunnelIncludeListForADeviceSettingsPolicy) | **GET** /accounts/{account_id}/devices/policy/{policy_id}/include | Get the Split Tunnel include list for a device settings profile |
| [**devicesListAdminOverrideCodeForDevice**](DevicesApi.md#devicesListAdminOverrideCodeForDevice) | **GET** /accounts/{account_id}/devices/{device_id}/override_codes | Get an admin override code for a device |
| [**devicesListDeviceSettingsPolicies**](DevicesApi.md#devicesListDeviceSettingsPolicies) | **GET** /accounts/{account_id}/devices/policies | List device settings profiles |
| [**devicesListDevices**](DevicesApi.md#devicesListDevices) | **GET** /accounts/{account_id}/devices | List devices |
| [**devicesRevokeDevices**](DevicesApi.md#devicesRevokeDevices) | **POST** /accounts/{account_id}/devices/revoke | Revoke devices |
| [**devicesSetLocalDomainFallbackList**](DevicesApi.md#devicesSetLocalDomainFallbackList) | **PUT** /accounts/{account_id}/devices/policy/fallback_domains | Set your Local Domain Fallback list |
| [**devicesSetLocalDomainFallbackListForADeviceSettingsPolicy**](DevicesApi.md#devicesSetLocalDomainFallbackListForADeviceSettingsPolicy) | **PUT** /accounts/{account_id}/devices/policy/{policy_id}/fallback_domains | Set the Local Domain Fallback list for a device settings profile |
| [**devicesSetSplitTunnelExcludeList**](DevicesApi.md#devicesSetSplitTunnelExcludeList) | **PUT** /accounts/{account_id}/devices/policy/exclude | Set the Split Tunnel exclude list |
| [**devicesSetSplitTunnelExcludeListForADeviceSettingsPolicy**](DevicesApi.md#devicesSetSplitTunnelExcludeListForADeviceSettingsPolicy) | **PUT** /accounts/{account_id}/devices/policy/{policy_id}/exclude | Set the Split Tunnel exclude list for a device settings profile |
| [**devicesSetSplitTunnelIncludeList**](DevicesApi.md#devicesSetSplitTunnelIncludeList) | **PUT** /accounts/{account_id}/devices/policy/include | Set the Split Tunnel include list |
| [**devicesSetSplitTunnelIncludeListForADeviceSettingsPolicy**](DevicesApi.md#devicesSetSplitTunnelIncludeListForADeviceSettingsPolicy) | **PUT** /accounts/{account_id}/devices/policy/{policy_id}/include | Set the Split Tunnel include list for a device settings profile |
| [**devicesUnrevokeDevices**](DevicesApi.md#devicesUnrevokeDevices) | **POST** /accounts/{account_id}/devices/unrevoke | Unrevoke devices |
| [**devicesUpdateDefaultDeviceSettingsPolicy**](DevicesApi.md#devicesUpdateDefaultDeviceSettingsPolicy) | **PATCH** /accounts/{account_id}/devices/policy | Update the default device settings profile |
| [**devicesUpdateDeviceSettingsPolicy**](DevicesApi.md#devicesUpdateDeviceSettingsPolicy) | **PATCH** /accounts/{account_id}/devices/policy/{policy_id} | Update a device settings profile |


<a id="devicesCreateDeviceSettingsPolicy"></a>
# **devicesCreateDeviceSettingsPolicy**
> TeamsDevicesDeviceSettingsResponse devicesCreateDeviceSettingsPolicy(accountId, devicesCreateDeviceSettingsPolicyRequest)

Create a device settings profile

Creates a device settings profile to be applied to certain devices matching the criteria.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    Object accountId = null; // Object | 
    DevicesCreateDeviceSettingsPolicyRequest devicesCreateDeviceSettingsPolicyRequest = new DevicesCreateDeviceSettingsPolicyRequest(); // DevicesCreateDeviceSettingsPolicyRequest | 
    try {
      TeamsDevicesDeviceSettingsResponse result = apiInstance.devicesCreateDeviceSettingsPolicy(accountId, devicesCreateDeviceSettingsPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesCreateDeviceSettingsPolicy");
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
| **devicesCreateDeviceSettingsPolicyRequest** | [**DevicesCreateDeviceSettingsPolicyRequest**](DevicesCreateDeviceSettingsPolicyRequest.md)|  | |

### Return type

[**TeamsDevicesDeviceSettingsResponse**](TeamsDevicesDeviceSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a device settings profile response |  -  |
| **4XX** | Create a device settings profile response failure |  -  |

<a id="devicesDeleteDeviceSettingsPolicy"></a>
# **devicesDeleteDeviceSettingsPolicy**
> TeamsDevicesDeviceSettingsResponseCollection devicesDeleteDeviceSettingsPolicy(policyId, accountId)

Delete a device settings profile

Deletes a device settings profile and fetches a list of the remaining profiles for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      TeamsDevicesDeviceSettingsResponseCollection result = apiInstance.devicesDeleteDeviceSettingsPolicy(policyId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesDeleteDeviceSettingsPolicy");
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
| **policyId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**TeamsDevicesDeviceSettingsResponseCollection**](TeamsDevicesDeviceSettingsResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a device settings profile response |  -  |
| **4XX** | Delete a device settings profile response failure |  -  |

<a id="devicesDeviceDetails"></a>
# **devicesDeviceDetails**
> TeamsDevicesDeviceResponse devicesDeviceDetails(deviceId, accountId)

Get device details

Fetches details for a single device.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String deviceId = "deviceId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      TeamsDevicesDeviceResponse result = apiInstance.devicesDeviceDetails(deviceId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesDeviceDetails");
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
| **deviceId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**TeamsDevicesDeviceResponse**](TeamsDevicesDeviceResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get device details response |  -  |
| **4XX** | Get device details response failure |  -  |

<a id="devicesGetDefaultDeviceSettingsPolicy"></a>
# **devicesGetDefaultDeviceSettingsPolicy**
> TeamsDevicesDefaultDeviceSettingsResponse devicesGetDefaultDeviceSettingsPolicy(accountId)

Get the default device settings profile

Fetches the default device settings profile for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      TeamsDevicesDefaultDeviceSettingsResponse result = apiInstance.devicesGetDefaultDeviceSettingsPolicy(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesGetDefaultDeviceSettingsPolicy");
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

[**TeamsDevicesDefaultDeviceSettingsResponse**](TeamsDevicesDefaultDeviceSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the default device settings profile response |  -  |
| **4XX** | Get the default device settings profile response failure |  -  |

<a id="devicesGetDeviceSettingsPolicyById"></a>
# **devicesGetDeviceSettingsPolicyById**
> TeamsDevicesDeviceSettingsResponse devicesGetDeviceSettingsPolicyById(policyId, accountId)

Get device settings profile by ID

Fetches a device settings profile by ID.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      TeamsDevicesDeviceSettingsResponse result = apiInstance.devicesGetDeviceSettingsPolicyById(policyId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesGetDeviceSettingsPolicyById");
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
| **policyId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**TeamsDevicesDeviceSettingsResponse**](TeamsDevicesDeviceSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get device settings profile by ID response |  -  |
| **4XX** | Get device settings profile by ID response failure |  -  |

<a id="devicesGetLocalDomainFallbackList"></a>
# **devicesGetLocalDomainFallbackList**
> TeamsDevicesFallbackDomainResponseCollection devicesGetLocalDomainFallbackList(accountId)

Get your Local Domain Fallback list

Fetches a list of domains to bypass Gateway DNS resolution. These domains will use the specified local DNS resolver instead.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      TeamsDevicesFallbackDomainResponseCollection result = apiInstance.devicesGetLocalDomainFallbackList(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesGetLocalDomainFallbackList");
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

[**TeamsDevicesFallbackDomainResponseCollection**](TeamsDevicesFallbackDomainResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get your Local Domain Fallback list response |  -  |
| **4XX** | Get your Local Domain Fallback list response failure |  -  |

<a id="devicesGetLocalDomainFallbackListForADeviceSettingsPolicy"></a>
# **devicesGetLocalDomainFallbackListForADeviceSettingsPolicy**
> TeamsDevicesFallbackDomainResponseCollection devicesGetLocalDomainFallbackListForADeviceSettingsPolicy(policyId, accountId)

Get the Local Domain Fallback list for a device settings profile

Fetches the list of domains to bypass Gateway DNS resolution from a specified device settings profile. These domains will use the specified local DNS resolver instead.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      TeamsDevicesFallbackDomainResponseCollection result = apiInstance.devicesGetLocalDomainFallbackListForADeviceSettingsPolicy(policyId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesGetLocalDomainFallbackListForADeviceSettingsPolicy");
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
| **policyId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**TeamsDevicesFallbackDomainResponseCollection**](TeamsDevicesFallbackDomainResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the Local Domain Fallback list for a device settings profile response |  -  |
| **4XX** | Get the Local Domain Fallback list for a device settings profile response failure |  -  |

<a id="devicesGetSplitTunnelExcludeList"></a>
# **devicesGetSplitTunnelExcludeList**
> TeamsDevicesSplitTunnelResponseCollection devicesGetSplitTunnelExcludeList(accountId)

Get the Split Tunnel exclude list

Fetches the list of routes excluded from the WARP client&#39;s tunnel.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      TeamsDevicesSplitTunnelResponseCollection result = apiInstance.devicesGetSplitTunnelExcludeList(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesGetSplitTunnelExcludeList");
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

[**TeamsDevicesSplitTunnelResponseCollection**](TeamsDevicesSplitTunnelResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the Split Tunnel exclude list response |  -  |
| **4XX** | Get the Split Tunnel exclude list response failure |  -  |

<a id="devicesGetSplitTunnelExcludeListForADeviceSettingsPolicy"></a>
# **devicesGetSplitTunnelExcludeListForADeviceSettingsPolicy**
> TeamsDevicesSplitTunnelResponseCollection devicesGetSplitTunnelExcludeListForADeviceSettingsPolicy(policyId, accountId)

Get the Split Tunnel exclude list for a device settings profile

Fetches the list of routes excluded from the WARP client&#39;s tunnel for a specific device settings profile.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      TeamsDevicesSplitTunnelResponseCollection result = apiInstance.devicesGetSplitTunnelExcludeListForADeviceSettingsPolicy(policyId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesGetSplitTunnelExcludeListForADeviceSettingsPolicy");
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
| **policyId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**TeamsDevicesSplitTunnelResponseCollection**](TeamsDevicesSplitTunnelResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the Split Tunnel exclude list for a device settings profile response |  -  |
| **4XX** | Get the Split Tunnel exclude list for a device settings profile response failure |  -  |

<a id="devicesGetSplitTunnelIncludeList"></a>
# **devicesGetSplitTunnelIncludeList**
> TeamsDevicesSplitTunnelIncludeResponseCollection devicesGetSplitTunnelIncludeList(accountId)

Get the Split Tunnel include list

Fetches the list of routes included in the WARP client&#39;s tunnel.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      TeamsDevicesSplitTunnelIncludeResponseCollection result = apiInstance.devicesGetSplitTunnelIncludeList(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesGetSplitTunnelIncludeList");
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

[**TeamsDevicesSplitTunnelIncludeResponseCollection**](TeamsDevicesSplitTunnelIncludeResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the Split Tunnel include list response |  -  |
| **4XX** | Get the Split Tunnel include list response failure |  -  |

<a id="devicesGetSplitTunnelIncludeListForADeviceSettingsPolicy"></a>
# **devicesGetSplitTunnelIncludeListForADeviceSettingsPolicy**
> TeamsDevicesSplitTunnelIncludeResponseCollection devicesGetSplitTunnelIncludeListForADeviceSettingsPolicy(policyId, accountId)

Get the Split Tunnel include list for a device settings profile

Fetches the list of routes included in the WARP client&#39;s tunnel for a specific device settings profile.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      TeamsDevicesSplitTunnelIncludeResponseCollection result = apiInstance.devicesGetSplitTunnelIncludeListForADeviceSettingsPolicy(policyId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesGetSplitTunnelIncludeListForADeviceSettingsPolicy");
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
| **policyId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**TeamsDevicesSplitTunnelIncludeResponseCollection**](TeamsDevicesSplitTunnelIncludeResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the Split Tunnel include list for a device settings profile response |  -  |
| **4XX** | Get the Split Tunnel include list for a device settings profile response failure |  -  |

<a id="devicesListAdminOverrideCodeForDevice"></a>
# **devicesListAdminOverrideCodeForDevice**
> TeamsDevicesOverrideCodesResponse devicesListAdminOverrideCodeForDevice(deviceId, accountId)

Get an admin override code for a device

Fetches a one-time use admin override code for a device. This relies on the **Admin Override** setting being enabled in your device configuration.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String deviceId = "deviceId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      TeamsDevicesOverrideCodesResponse result = apiInstance.devicesListAdminOverrideCodeForDevice(deviceId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesListAdminOverrideCodeForDevice");
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
| **deviceId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**TeamsDevicesOverrideCodesResponse**](TeamsDevicesOverrideCodesResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get an admin override code for a device response |  -  |
| **4XX** | Get an admin override code for a device response failure |  -  |

<a id="devicesListDeviceSettingsPolicies"></a>
# **devicesListDeviceSettingsPolicies**
> TeamsDevicesDeviceSettingsResponseCollection devicesListDeviceSettingsPolicies(accountId)

List device settings profiles

Fetches a list of the device settings profiles for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      TeamsDevicesDeviceSettingsResponseCollection result = apiInstance.devicesListDeviceSettingsPolicies(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesListDeviceSettingsPolicies");
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

[**TeamsDevicesDeviceSettingsResponseCollection**](TeamsDevicesDeviceSettingsResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List device settings profiles response |  -  |
| **4XX** | List device settings profiles response failure |  -  |

<a id="devicesListDevices"></a>
# **devicesListDevices**
> TeamsDevicesDevicesResponse devicesListDevices(accountId)

List devices

Fetches a list of enrolled devices.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      TeamsDevicesDevicesResponse result = apiInstance.devicesListDevices(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesListDevices");
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

[**TeamsDevicesDevicesResponse**](TeamsDevicesDevicesResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List devices response |  -  |
| **4XX** | List devices response failure |  -  |

<a id="devicesRevokeDevices"></a>
# **devicesRevokeDevices**
> TeamsDevicesApiResponseSingle devicesRevokeDevices(accountId, requestBody)

Revoke devices

Revokes a list of devices.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    Object accountId = null; // Object | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      TeamsDevicesApiResponseSingle result = apiInstance.devicesRevokeDevices(accountId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesRevokeDevices");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

### Return type

[**TeamsDevicesApiResponseSingle**](TeamsDevicesApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Revoke devices response |  -  |
| **4XX** | Revoke devices response failure |  -  |

<a id="devicesSetLocalDomainFallbackList"></a>
# **devicesSetLocalDomainFallbackList**
> TeamsDevicesFallbackDomainResponseCollection devicesSetLocalDomainFallbackList(accountId, teamsDevicesFallbackDomain)

Set your Local Domain Fallback list

Sets the list of domains to bypass Gateway DNS resolution. These domains will use the specified local DNS resolver instead.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    Object accountId = null; // Object | 
    List<TeamsDevicesFallbackDomain> teamsDevicesFallbackDomain = Arrays.asList(); // List<TeamsDevicesFallbackDomain> | 
    try {
      TeamsDevicesFallbackDomainResponseCollection result = apiInstance.devicesSetLocalDomainFallbackList(accountId, teamsDevicesFallbackDomain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesSetLocalDomainFallbackList");
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
| **teamsDevicesFallbackDomain** | [**List&lt;TeamsDevicesFallbackDomain&gt;**](TeamsDevicesFallbackDomain.md)|  | |

### Return type

[**TeamsDevicesFallbackDomainResponseCollection**](TeamsDevicesFallbackDomainResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set your Local Domain Fallback list response |  -  |
| **4XX** | Set your Local Domain Fallback list response failure |  -  |

<a id="devicesSetLocalDomainFallbackListForADeviceSettingsPolicy"></a>
# **devicesSetLocalDomainFallbackListForADeviceSettingsPolicy**
> TeamsDevicesFallbackDomainResponseCollection devicesSetLocalDomainFallbackListForADeviceSettingsPolicy(policyId, accountId, teamsDevicesFallbackDomain)

Set the Local Domain Fallback list for a device settings profile

Sets the list of domains to bypass Gateway DNS resolution. These domains will use the specified local DNS resolver instead. This will only apply to the specified device settings profile.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    Object accountId = null; // Object | 
    List<TeamsDevicesFallbackDomain> teamsDevicesFallbackDomain = Arrays.asList(); // List<TeamsDevicesFallbackDomain> | 
    try {
      TeamsDevicesFallbackDomainResponseCollection result = apiInstance.devicesSetLocalDomainFallbackListForADeviceSettingsPolicy(policyId, accountId, teamsDevicesFallbackDomain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesSetLocalDomainFallbackListForADeviceSettingsPolicy");
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
| **policyId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |
| **teamsDevicesFallbackDomain** | [**List&lt;TeamsDevicesFallbackDomain&gt;**](TeamsDevicesFallbackDomain.md)|  | |

### Return type

[**TeamsDevicesFallbackDomainResponseCollection**](TeamsDevicesFallbackDomainResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set the Local Domain Fallback list for a device settings profile response |  -  |
| **4XX** | Set the Local Domain Fallback list for a device settings profile response failure |  -  |

<a id="devicesSetSplitTunnelExcludeList"></a>
# **devicesSetSplitTunnelExcludeList**
> TeamsDevicesSplitTunnelResponseCollection devicesSetSplitTunnelExcludeList(accountId, teamsDevicesSplitTunnel)

Set the Split Tunnel exclude list

Sets the list of routes excluded from the WARP client&#39;s tunnel.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    Object accountId = null; // Object | 
    List<TeamsDevicesSplitTunnel> teamsDevicesSplitTunnel = Arrays.asList(); // List<TeamsDevicesSplitTunnel> | 
    try {
      TeamsDevicesSplitTunnelResponseCollection result = apiInstance.devicesSetSplitTunnelExcludeList(accountId, teamsDevicesSplitTunnel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesSetSplitTunnelExcludeList");
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
| **teamsDevicesSplitTunnel** | [**List&lt;TeamsDevicesSplitTunnel&gt;**](TeamsDevicesSplitTunnel.md)|  | |

### Return type

[**TeamsDevicesSplitTunnelResponseCollection**](TeamsDevicesSplitTunnelResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set the Split Tunnel exclude list response |  -  |
| **4XX** | Set the Split Tunnel exclude list response failure |  -  |

<a id="devicesSetSplitTunnelExcludeListForADeviceSettingsPolicy"></a>
# **devicesSetSplitTunnelExcludeListForADeviceSettingsPolicy**
> TeamsDevicesSplitTunnelResponseCollection devicesSetSplitTunnelExcludeListForADeviceSettingsPolicy(policyId, accountId, teamsDevicesSplitTunnel)

Set the Split Tunnel exclude list for a device settings profile

Sets the list of routes excluded from the WARP client&#39;s tunnel for a specific device settings profile.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    Object accountId = null; // Object | 
    List<TeamsDevicesSplitTunnel> teamsDevicesSplitTunnel = Arrays.asList(); // List<TeamsDevicesSplitTunnel> | 
    try {
      TeamsDevicesSplitTunnelResponseCollection result = apiInstance.devicesSetSplitTunnelExcludeListForADeviceSettingsPolicy(policyId, accountId, teamsDevicesSplitTunnel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesSetSplitTunnelExcludeListForADeviceSettingsPolicy");
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
| **policyId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |
| **teamsDevicesSplitTunnel** | [**List&lt;TeamsDevicesSplitTunnel&gt;**](TeamsDevicesSplitTunnel.md)|  | |

### Return type

[**TeamsDevicesSplitTunnelResponseCollection**](TeamsDevicesSplitTunnelResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set the Split Tunnel exclude list for a device settings profile response |  -  |
| **4XX** | Set the Split Tunnel exclude list for a device settings profile response failure |  -  |

<a id="devicesSetSplitTunnelIncludeList"></a>
# **devicesSetSplitTunnelIncludeList**
> TeamsDevicesSplitTunnelIncludeResponseCollection devicesSetSplitTunnelIncludeList(accountId, teamsDevicesSplitTunnelInclude)

Set the Split Tunnel include list

Sets the list of routes included in the WARP client&#39;s tunnel.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    Object accountId = null; // Object | 
    List<TeamsDevicesSplitTunnelInclude> teamsDevicesSplitTunnelInclude = Arrays.asList(); // List<TeamsDevicesSplitTunnelInclude> | 
    try {
      TeamsDevicesSplitTunnelIncludeResponseCollection result = apiInstance.devicesSetSplitTunnelIncludeList(accountId, teamsDevicesSplitTunnelInclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesSetSplitTunnelIncludeList");
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
| **teamsDevicesSplitTunnelInclude** | [**List&lt;TeamsDevicesSplitTunnelInclude&gt;**](TeamsDevicesSplitTunnelInclude.md)|  | |

### Return type

[**TeamsDevicesSplitTunnelIncludeResponseCollection**](TeamsDevicesSplitTunnelIncludeResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set the Split Tunnel include list response |  -  |
| **4XX** | Set the Split Tunnel include list response failure |  -  |

<a id="devicesSetSplitTunnelIncludeListForADeviceSettingsPolicy"></a>
# **devicesSetSplitTunnelIncludeListForADeviceSettingsPolicy**
> TeamsDevicesSplitTunnelIncludeResponseCollection devicesSetSplitTunnelIncludeListForADeviceSettingsPolicy(policyId, accountId, teamsDevicesSplitTunnelInclude)

Set the Split Tunnel include list for a device settings profile

Sets the list of routes included in the WARP client&#39;s tunnel for a specific device settings profile.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    Object accountId = null; // Object | 
    List<TeamsDevicesSplitTunnelInclude> teamsDevicesSplitTunnelInclude = Arrays.asList(); // List<TeamsDevicesSplitTunnelInclude> | 
    try {
      TeamsDevicesSplitTunnelIncludeResponseCollection result = apiInstance.devicesSetSplitTunnelIncludeListForADeviceSettingsPolicy(policyId, accountId, teamsDevicesSplitTunnelInclude);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesSetSplitTunnelIncludeListForADeviceSettingsPolicy");
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
| **policyId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |
| **teamsDevicesSplitTunnelInclude** | [**List&lt;TeamsDevicesSplitTunnelInclude&gt;**](TeamsDevicesSplitTunnelInclude.md)|  | |

### Return type

[**TeamsDevicesSplitTunnelIncludeResponseCollection**](TeamsDevicesSplitTunnelIncludeResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set the Split Tunnel include list for a device settings profile response |  -  |
| **4XX** | Set the Split Tunnel include list for a device settings profile response failure |  -  |

<a id="devicesUnrevokeDevices"></a>
# **devicesUnrevokeDevices**
> TeamsDevicesApiResponseSingle devicesUnrevokeDevices(accountId, requestBody)

Unrevoke devices

Unrevokes a list of devices.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    Object accountId = null; // Object | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      TeamsDevicesApiResponseSingle result = apiInstance.devicesUnrevokeDevices(accountId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesUnrevokeDevices");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

### Return type

[**TeamsDevicesApiResponseSingle**](TeamsDevicesApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Unrevoke devices response |  -  |
| **4XX** | Unrevoke devices response failure |  -  |

<a id="devicesUpdateDefaultDeviceSettingsPolicy"></a>
# **devicesUpdateDefaultDeviceSettingsPolicy**
> TeamsDevicesDefaultDeviceSettingsResponse devicesUpdateDefaultDeviceSettingsPolicy(accountId, devicesUpdateDefaultDeviceSettingsPolicyRequest)

Update the default device settings profile

Updates the default device settings profile for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    Object accountId = null; // Object | 
    DevicesUpdateDefaultDeviceSettingsPolicyRequest devicesUpdateDefaultDeviceSettingsPolicyRequest = new DevicesUpdateDefaultDeviceSettingsPolicyRequest(); // DevicesUpdateDefaultDeviceSettingsPolicyRequest | 
    try {
      TeamsDevicesDefaultDeviceSettingsResponse result = apiInstance.devicesUpdateDefaultDeviceSettingsPolicy(accountId, devicesUpdateDefaultDeviceSettingsPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesUpdateDefaultDeviceSettingsPolicy");
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
| **devicesUpdateDefaultDeviceSettingsPolicyRequest** | [**DevicesUpdateDefaultDeviceSettingsPolicyRequest**](DevicesUpdateDefaultDeviceSettingsPolicyRequest.md)|  | |

### Return type

[**TeamsDevicesDefaultDeviceSettingsResponse**](TeamsDevicesDefaultDeviceSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update the default device settings profile response |  -  |
| **4XX** | Update the default device settings profile response failure |  -  |

<a id="devicesUpdateDeviceSettingsPolicy"></a>
# **devicesUpdateDeviceSettingsPolicy**
> TeamsDevicesDeviceSettingsResponse devicesUpdateDeviceSettingsPolicy(policyId, accountId, devicesUpdateDeviceSettingsPolicyRequest)

Update a device settings profile

Updates a configured device settings profile.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.DevicesApi;

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

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    Object accountId = null; // Object | 
    DevicesUpdateDeviceSettingsPolicyRequest devicesUpdateDeviceSettingsPolicyRequest = new DevicesUpdateDeviceSettingsPolicyRequest(); // DevicesUpdateDeviceSettingsPolicyRequest | 
    try {
      TeamsDevicesDeviceSettingsResponse result = apiInstance.devicesUpdateDeviceSettingsPolicy(policyId, accountId, devicesUpdateDeviceSettingsPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#devicesUpdateDeviceSettingsPolicy");
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
| **policyId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |
| **devicesUpdateDeviceSettingsPolicyRequest** | [**DevicesUpdateDeviceSettingsPolicyRequest**](DevicesUpdateDeviceSettingsPolicyRequest.md)|  | |

### Return type

[**TeamsDevicesDeviceSettingsResponse**](TeamsDevicesDeviceSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a device settings profile Policy response |  -  |
| **4XX** | Update a device settings profile Policy response failure |  -  |

