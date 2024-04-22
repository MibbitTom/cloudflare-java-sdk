# ZeroTrustUsersApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zeroTrustUsersGetActiveSession**](ZeroTrustUsersApi.md#zeroTrustUsersGetActiveSession) | **GET** /accounts/{identifier}/access/users/{id}/active_sessions/{nonce} | Get single active session |
| [**zeroTrustUsersGetActiveSessions**](ZeroTrustUsersApi.md#zeroTrustUsersGetActiveSessions) | **GET** /accounts/{identifier}/access/users/{id}/active_sessions | Get active sessions |
| [**zeroTrustUsersGetFailedLogins**](ZeroTrustUsersApi.md#zeroTrustUsersGetFailedLogins) | **GET** /accounts/{identifier}/access/users/{id}/failed_logins | Get failed logins |
| [**zeroTrustUsersGetLastSeenIdentity**](ZeroTrustUsersApi.md#zeroTrustUsersGetLastSeenIdentity) | **GET** /accounts/{identifier}/access/users/{id}/last_seen_identity | Get last seen identity |
| [**zeroTrustUsersGetUsers**](ZeroTrustUsersApi.md#zeroTrustUsersGetUsers) | **GET** /accounts/{identifier}/access/users | Get users |


<a id="zeroTrustUsersGetActiveSession"></a>
# **zeroTrustUsersGetActiveSession**
> AccessActiveSessionResponse zeroTrustUsersGetActiveSession(id, identifier, nonce)

Get single active session

Get an active session for a single user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustUsersApi;

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

    ZeroTrustUsersApi apiInstance = new ZeroTrustUsersApi(defaultClient);
    String id = "id_example"; // String | 
    String identifier = "identifier_example"; // String | 
    String nonce = "nonce_example"; // String | 
    try {
      AccessActiveSessionResponse result = apiInstance.zeroTrustUsersGetActiveSession(id, identifier, nonce);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustUsersApi#zeroTrustUsersGetActiveSession");
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
| **id** | **String**|  | |
| **identifier** | **String**|  | |
| **nonce** | **String**|  | |

### Return type

[**AccessActiveSessionResponse**](AccessActiveSessionResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get active session response |  -  |
| **4XX** | Get active session response failure |  -  |

<a id="zeroTrustUsersGetActiveSessions"></a>
# **zeroTrustUsersGetActiveSessions**
> AccessActiveSessionsResponse zeroTrustUsersGetActiveSessions(id, identifier)

Get active sessions

Get active sessions for a single user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustUsersApi;

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

    ZeroTrustUsersApi apiInstance = new ZeroTrustUsersApi(defaultClient);
    String id = "id_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessActiveSessionsResponse result = apiInstance.zeroTrustUsersGetActiveSessions(id, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustUsersApi#zeroTrustUsersGetActiveSessions");
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
| **id** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**AccessActiveSessionsResponse**](AccessActiveSessionsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get active sessions response |  -  |
| **4XX** | Get active sessions response failure |  -  |

<a id="zeroTrustUsersGetFailedLogins"></a>
# **zeroTrustUsersGetFailedLogins**
> AccessFailedLoginResponse zeroTrustUsersGetFailedLogins(id, identifier)

Get failed logins

Get all failed login attempts for a single user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustUsersApi;

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

    ZeroTrustUsersApi apiInstance = new ZeroTrustUsersApi(defaultClient);
    String id = "id_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessFailedLoginResponse result = apiInstance.zeroTrustUsersGetFailedLogins(id, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustUsersApi#zeroTrustUsersGetFailedLogins");
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
| **id** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**AccessFailedLoginResponse**](AccessFailedLoginResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get failed logins response |  -  |
| **4XX** | Get failed logins response failure |  -  |

<a id="zeroTrustUsersGetLastSeenIdentity"></a>
# **zeroTrustUsersGetLastSeenIdentity**
> AccessLastSeenIdentityResponse zeroTrustUsersGetLastSeenIdentity(id, identifier)

Get last seen identity

Get last seen identity for a single user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustUsersApi;

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

    ZeroTrustUsersApi apiInstance = new ZeroTrustUsersApi(defaultClient);
    String id = "id_example"; // String | 
    String identifier = "identifier_example"; // String | 
    try {
      AccessLastSeenIdentityResponse result = apiInstance.zeroTrustUsersGetLastSeenIdentity(id, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustUsersApi#zeroTrustUsersGetLastSeenIdentity");
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
| **id** | **String**|  | |
| **identifier** | **String**|  | |

### Return type

[**AccessLastSeenIdentityResponse**](AccessLastSeenIdentityResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get active session response |  -  |
| **4XX** | Get active session response failure |  -  |

<a id="zeroTrustUsersGetUsers"></a>
# **zeroTrustUsersGetUsers**
> AccessUsersComponentsSchemasResponseCollection zeroTrustUsersGetUsers(identifier)

Get users

Gets a list of users for an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustUsersApi;

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

    ZeroTrustUsersApi apiInstance = new ZeroTrustUsersApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessUsersComponentsSchemasResponseCollection result = apiInstance.zeroTrustUsersGetUsers(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustUsersApi#zeroTrustUsersGetUsers");
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
| **identifier** | **String**|  | |

### Return type

[**AccessUsersComponentsSchemasResponseCollection**](AccessUsersComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get users response |  -  |
| **4XX** | Get users response failure |  -  |

