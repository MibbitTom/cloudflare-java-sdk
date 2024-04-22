# ZeroTrustAccountsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zeroTrustAccountsCreateZeroTrustAccount**](ZeroTrustAccountsApi.md#zeroTrustAccountsCreateZeroTrustAccount) | **POST** /accounts/{account_id}/gateway | Create Zero Trust account |
| [**zeroTrustAccountsGetDeviceSettingsForZeroTrustAccount**](ZeroTrustAccountsApi.md#zeroTrustAccountsGetDeviceSettingsForZeroTrustAccount) | **GET** /accounts/{account_id}/devices/settings | Get device settings for a Zero Trust account |
| [**zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount**](ZeroTrustAccountsApi.md#zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount) | **GET** /accounts/{account_id}/gateway/logging | Get logging settings for the Zero Trust account |
| [**zeroTrustAccountsGetZeroTrustAccountConfiguration**](ZeroTrustAccountsApi.md#zeroTrustAccountsGetZeroTrustAccountConfiguration) | **GET** /accounts/{account_id}/gateway/configuration | Get Zero Trust account configuration |
| [**zeroTrustAccountsGetZeroTrustAccountInformation**](ZeroTrustAccountsApi.md#zeroTrustAccountsGetZeroTrustAccountInformation) | **GET** /accounts/{account_id}/gateway | Get Zero Trust account information |
| [**zeroTrustAccountsPatchZeroTrustAccountConfiguration**](ZeroTrustAccountsApi.md#zeroTrustAccountsPatchZeroTrustAccountConfiguration) | **PATCH** /accounts/{account_id}/gateway/configuration | Patch Zero Trust account configuration |
| [**zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccount**](ZeroTrustAccountsApi.md#zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccount) | **PUT** /accounts/{account_id}/devices/settings | Update device settings for a Zero Trust account |
| [**zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccount**](ZeroTrustAccountsApi.md#zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccount) | **PUT** /accounts/{account_id}/gateway/logging | Update Zero Trust account logging settings |
| [**zeroTrustAccountsUpdateZeroTrustAccountConfiguration**](ZeroTrustAccountsApi.md#zeroTrustAccountsUpdateZeroTrustAccountConfiguration) | **PUT** /accounts/{account_id}/gateway/configuration | Update Zero Trust account configuration |


<a id="zeroTrustAccountsCreateZeroTrustAccount"></a>
# **zeroTrustAccountsCreateZeroTrustAccount**
> ZeroTrustGatewayGatewayAccount zeroTrustAccountsCreateZeroTrustAccount(accountId)

Create Zero Trust account

Creates a Zero Trust account with an existing Cloudflare account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustAccountsApi;

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

    ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewayGatewayAccount result = apiInstance.zeroTrustAccountsCreateZeroTrustAccount(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsCreateZeroTrustAccount");
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

[**ZeroTrustGatewayGatewayAccount**](ZeroTrustGatewayGatewayAccount.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Zero Trust account response |  -  |
| **4XX** | Create Zero Trust account response failure |  -  |

<a id="zeroTrustAccountsGetDeviceSettingsForZeroTrustAccount"></a>
# **zeroTrustAccountsGetDeviceSettingsForZeroTrustAccount**
> TeamsDevicesZeroTrustAccountDeviceSettingsResponse zeroTrustAccountsGetDeviceSettingsForZeroTrustAccount(accountId)

Get device settings for a Zero Trust account

Describes the current device settings for a Zero Trust account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustAccountsApi;

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

    ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      TeamsDevicesZeroTrustAccountDeviceSettingsResponse result = apiInstance.zeroTrustAccountsGetDeviceSettingsForZeroTrustAccount(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsGetDeviceSettingsForZeroTrustAccount");
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

[**TeamsDevicesZeroTrustAccountDeviceSettingsResponse**](TeamsDevicesZeroTrustAccountDeviceSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get device settings for a Zero Trust account response |  -  |
| **4XX** | Get device settings for a Zero Trust account response failure |  -  |

<a id="zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount"></a>
# **zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount**
> ZeroTrustGatewayGatewayAccountLoggingSettingsResponse zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount(accountId)

Get logging settings for the Zero Trust account

Fetches the current logging settings for Zero Trust account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustAccountsApi;

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

    ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewayGatewayAccountLoggingSettingsResponse result = apiInstance.zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount");
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

[**ZeroTrustGatewayGatewayAccountLoggingSettingsResponse**](ZeroTrustGatewayGatewayAccountLoggingSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get logging settings for the Zero Trust account response |  -  |
| **4XX** | Get logging settings for the Zero Trust account response failure |  -  |

<a id="zeroTrustAccountsGetZeroTrustAccountConfiguration"></a>
# **zeroTrustAccountsGetZeroTrustAccountConfiguration**
> ZeroTrustGatewayGatewayAccountConfig zeroTrustAccountsGetZeroTrustAccountConfiguration(accountId)

Get Zero Trust account configuration

Fetches the current Zero Trust account configuration.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustAccountsApi;

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

    ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewayGatewayAccountConfig result = apiInstance.zeroTrustAccountsGetZeroTrustAccountConfiguration(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsGetZeroTrustAccountConfiguration");
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

[**ZeroTrustGatewayGatewayAccountConfig**](ZeroTrustGatewayGatewayAccountConfig.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Zero Trust account configuration response |  -  |
| **4XX** | Get Zero Trust account configuration response failure |  -  |

<a id="zeroTrustAccountsGetZeroTrustAccountInformation"></a>
# **zeroTrustAccountsGetZeroTrustAccountInformation**
> ZeroTrustGatewayGatewayAccount zeroTrustAccountsGetZeroTrustAccountInformation(accountId)

Get Zero Trust account information

Gets information about the current Zero Trust account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustAccountsApi;

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

    ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewayGatewayAccount result = apiInstance.zeroTrustAccountsGetZeroTrustAccountInformation(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsGetZeroTrustAccountInformation");
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

[**ZeroTrustGatewayGatewayAccount**](ZeroTrustGatewayGatewayAccount.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Zero Trust account information response |  -  |
| **4XX** | Get Zero Trust account information response failure |  -  |

<a id="zeroTrustAccountsPatchZeroTrustAccountConfiguration"></a>
# **zeroTrustAccountsPatchZeroTrustAccountConfiguration**
> ZeroTrustGatewayGatewayAccountConfig zeroTrustAccountsPatchZeroTrustAccountConfiguration(accountId, zeroTrustGatewayGatewayAccountSettings)

Patch Zero Trust account configuration

Patches the current Zero Trust account configuration. This endpoint can update a single subcollection of settings such as &#x60;antivirus&#x60;, &#x60;tls_decrypt&#x60;, &#x60;activity_log&#x60;, &#x60;block_page&#x60;, &#x60;browser_isolation&#x60;, &#x60;fips&#x60;, &#x60;body_scanning&#x60;, or &#x60;custom_certificate&#x60;, without updating the entire configuration object. Returns an error if any collection of settings is not properly configured.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustAccountsApi;

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

    ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi(defaultClient);
    Object accountId = null; // Object | 
    ZeroTrustGatewayGatewayAccountSettings zeroTrustGatewayGatewayAccountSettings = new ZeroTrustGatewayGatewayAccountSettings(); // ZeroTrustGatewayGatewayAccountSettings | 
    try {
      ZeroTrustGatewayGatewayAccountConfig result = apiInstance.zeroTrustAccountsPatchZeroTrustAccountConfiguration(accountId, zeroTrustGatewayGatewayAccountSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsPatchZeroTrustAccountConfiguration");
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
| **zeroTrustGatewayGatewayAccountSettings** | [**ZeroTrustGatewayGatewayAccountSettings**](ZeroTrustGatewayGatewayAccountSettings.md)|  | |

### Return type

[**ZeroTrustGatewayGatewayAccountConfig**](ZeroTrustGatewayGatewayAccountConfig.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Zero Trust account configuration response |  -  |
| **4XX** | Update Zero Trust account configuration response failure |  -  |

<a id="zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccount"></a>
# **zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccount**
> TeamsDevicesZeroTrustAccountDeviceSettingsResponse zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccount(accountId, teamsDevicesZeroTrustAccountDeviceSettings)

Update device settings for a Zero Trust account

Updates the current device settings for a Zero Trust account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustAccountsApi;

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

    ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi(defaultClient);
    Object accountId = null; // Object | 
    TeamsDevicesZeroTrustAccountDeviceSettings teamsDevicesZeroTrustAccountDeviceSettings = new TeamsDevicesZeroTrustAccountDeviceSettings(); // TeamsDevicesZeroTrustAccountDeviceSettings | 
    try {
      TeamsDevicesZeroTrustAccountDeviceSettingsResponse result = apiInstance.zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccount(accountId, teamsDevicesZeroTrustAccountDeviceSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccount");
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
| **teamsDevicesZeroTrustAccountDeviceSettings** | [**TeamsDevicesZeroTrustAccountDeviceSettings**](TeamsDevicesZeroTrustAccountDeviceSettings.md)|  | |

### Return type

[**TeamsDevicesZeroTrustAccountDeviceSettingsResponse**](TeamsDevicesZeroTrustAccountDeviceSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update device settings for a Zero Trust account response |  -  |
| **4XX** | Update device settings for a Zero Trust account response failure |  -  |

<a id="zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccount"></a>
# **zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccount**
> ZeroTrustGatewayGatewayAccountLoggingSettingsResponse zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccount(accountId, zeroTrustGatewayGatewayAccountLoggingSettings)

Update Zero Trust account logging settings

Updates logging settings for the current Zero Trust account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustAccountsApi;

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

    ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi(defaultClient);
    Object accountId = null; // Object | 
    ZeroTrustGatewayGatewayAccountLoggingSettings zeroTrustGatewayGatewayAccountLoggingSettings = new ZeroTrustGatewayGatewayAccountLoggingSettings(); // ZeroTrustGatewayGatewayAccountLoggingSettings | 
    try {
      ZeroTrustGatewayGatewayAccountLoggingSettingsResponse result = apiInstance.zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccount(accountId, zeroTrustGatewayGatewayAccountLoggingSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccount");
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
| **zeroTrustGatewayGatewayAccountLoggingSettings** | [**ZeroTrustGatewayGatewayAccountLoggingSettings**](ZeroTrustGatewayGatewayAccountLoggingSettings.md)|  | |

### Return type

[**ZeroTrustGatewayGatewayAccountLoggingSettingsResponse**](ZeroTrustGatewayGatewayAccountLoggingSettingsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update logging settings for the Zero Trust account response |  -  |
| **4XX** | Update logging settings for the Zero Trust account response failure |  -  |

<a id="zeroTrustAccountsUpdateZeroTrustAccountConfiguration"></a>
# **zeroTrustAccountsUpdateZeroTrustAccountConfiguration**
> ZeroTrustGatewayGatewayAccountConfig zeroTrustAccountsUpdateZeroTrustAccountConfiguration(accountId, zeroTrustGatewayGatewayAccountSettings)

Update Zero Trust account configuration

Updates the current Zero Trust account configuration.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZeroTrustAccountsApi;

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

    ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi(defaultClient);
    Object accountId = null; // Object | 
    ZeroTrustGatewayGatewayAccountSettings zeroTrustGatewayGatewayAccountSettings = new ZeroTrustGatewayGatewayAccountSettings(); // ZeroTrustGatewayGatewayAccountSettings | 
    try {
      ZeroTrustGatewayGatewayAccountConfig result = apiInstance.zeroTrustAccountsUpdateZeroTrustAccountConfiguration(accountId, zeroTrustGatewayGatewayAccountSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsUpdateZeroTrustAccountConfiguration");
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
| **zeroTrustGatewayGatewayAccountSettings** | [**ZeroTrustGatewayGatewayAccountSettings**](ZeroTrustGatewayGatewayAccountSettings.md)|  | |

### Return type

[**ZeroTrustGatewayGatewayAccountConfig**](ZeroTrustGatewayGatewayAccountConfig.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Zero Trust account configuration response |  -  |
| **4XX** | Update Zero Trust account configuration response failure |  -  |

