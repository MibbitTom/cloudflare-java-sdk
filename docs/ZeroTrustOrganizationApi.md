# ZeroTrustOrganizationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zeroTrustOrganizationCreateYourZeroTrustOrganization**](ZeroTrustOrganizationApi.md#zeroTrustOrganizationCreateYourZeroTrustOrganization) | **POST** /accounts/{identifier}/access/organizations | Create your Zero Trust organization |
| [**zeroTrustOrganizationGetYourZeroTrustOrganization**](ZeroTrustOrganizationApi.md#zeroTrustOrganizationGetYourZeroTrustOrganization) | **GET** /accounts/{identifier}/access/organizations | Get your Zero Trust organization |
| [**zeroTrustOrganizationRevokeAllAccessTokensForAUser**](ZeroTrustOrganizationApi.md#zeroTrustOrganizationRevokeAllAccessTokensForAUser) | **POST** /accounts/{identifier}/access/organizations/revoke_user | Revoke all Access tokens for a user |
| [**zeroTrustOrganizationUpdateYourZeroTrustOrganization**](ZeroTrustOrganizationApi.md#zeroTrustOrganizationUpdateYourZeroTrustOrganization) | **PUT** /accounts/{identifier}/access/organizations | Update your Zero Trust organization |


<a id="zeroTrustOrganizationCreateYourZeroTrustOrganization"></a>
# **zeroTrustOrganizationCreateYourZeroTrustOrganization**
> AccessSingleResponse zeroTrustOrganizationCreateYourZeroTrustOrganization(identifier, zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest)

Create your Zero Trust organization

Sets up a Zero Trust organization for your account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustOrganizationApi;

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

    ZeroTrustOrganizationApi apiInstance = new ZeroTrustOrganizationApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    ZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest = new ZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest(); // ZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest | 
    try {
      AccessSingleResponse result = apiInstance.zeroTrustOrganizationCreateYourZeroTrustOrganization(identifier, zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustOrganizationApi#zeroTrustOrganizationCreateYourZeroTrustOrganization");
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
| **zeroTrustOrganizationCreateYourZeroTrustOrganizationRequest** | [**ZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest**](ZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest.md)|  | |

### Return type

[**AccessSingleResponse**](AccessSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create your Zero Trust organization response |  -  |
| **4XX** | Create your Zero Trust organization response failure |  -  |

<a id="zeroTrustOrganizationGetYourZeroTrustOrganization"></a>
# **zeroTrustOrganizationGetYourZeroTrustOrganization**
> AccessSingleResponse zeroTrustOrganizationGetYourZeroTrustOrganization(identifier)

Get your Zero Trust organization

Returns the configuration for your Zero Trust organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustOrganizationApi;

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

    ZeroTrustOrganizationApi apiInstance = new ZeroTrustOrganizationApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      AccessSingleResponse result = apiInstance.zeroTrustOrganizationGetYourZeroTrustOrganization(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustOrganizationApi#zeroTrustOrganizationGetYourZeroTrustOrganization");
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

[**AccessSingleResponse**](AccessSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get your Zero Trust organization response |  -  |
| **4XX** | Get your Zero Trust organization response failure |  -  |

<a id="zeroTrustOrganizationRevokeAllAccessTokensForAUser"></a>
# **zeroTrustOrganizationRevokeAllAccessTokensForAUser**
> AccessEmptyResponse zeroTrustOrganizationRevokeAllAccessTokensForAUser(identifier, zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest)

Revoke all Access tokens for a user

Revokes a user&#39;s access across all applications.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustOrganizationApi;

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

    ZeroTrustOrganizationApi apiInstance = new ZeroTrustOrganizationApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest = new ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest(); // ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest | 
    try {
      AccessEmptyResponse result = apiInstance.zeroTrustOrganizationRevokeAllAccessTokensForAUser(identifier, zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustOrganizationApi#zeroTrustOrganizationRevokeAllAccessTokensForAUser");
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
| **zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest** | [**ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest**](ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest.md)|  | |

### Return type

[**AccessEmptyResponse**](AccessEmptyResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Revoke all Access tokens for a user response |  -  |
| **4xx** | Revoke all Access tokens for a user response failure |  -  |

<a id="zeroTrustOrganizationUpdateYourZeroTrustOrganization"></a>
# **zeroTrustOrganizationUpdateYourZeroTrustOrganization**
> AccessSingleResponse zeroTrustOrganizationUpdateYourZeroTrustOrganization(identifier, zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest)

Update your Zero Trust organization

Updates the configuration for your Zero Trust organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustOrganizationApi;

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

    ZeroTrustOrganizationApi apiInstance = new ZeroTrustOrganizationApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    ZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest = new ZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest(); // ZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest | 
    try {
      AccessSingleResponse result = apiInstance.zeroTrustOrganizationUpdateYourZeroTrustOrganization(identifier, zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustOrganizationApi#zeroTrustOrganizationUpdateYourZeroTrustOrganization");
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
| **zeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest** | [**ZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest**](ZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest.md)|  | |

### Return type

[**AccessSingleResponse**](AccessSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update your Zero Trust organization response |  -  |
| **4XX** | Update your Zero Trust organization response failure |  -  |

