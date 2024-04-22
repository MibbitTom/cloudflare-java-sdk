# ZoneLevelZeroTrustOrganizationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization**](ZoneLevelZeroTrustOrganizationApi.md#zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization) | **POST** /zones/{identifier}/access/organizations | Create your Zero Trust organization |
| [**zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization**](ZoneLevelZeroTrustOrganizationApi.md#zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization) | **GET** /zones/{identifier}/access/organizations | Get your Zero Trust organization |
| [**zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser**](ZoneLevelZeroTrustOrganizationApi.md#zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser) | **POST** /zones/{identifier}/access/organizations/revoke_user | Revoke all Access tokens for a user |
| [**zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization**](ZoneLevelZeroTrustOrganizationApi.md#zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization) | **PUT** /zones/{identifier}/access/organizations | Update your Zero Trust organization |


<a id="zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization"></a>
# **zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization**
> AccessOrganizationsComponentsSchemasSingleResponse zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization(identifier, zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest)

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
import org.openapitools.client.api.ZoneLevelZeroTrustOrganizationApi;

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

    ZoneLevelZeroTrustOrganizationApi apiInstance = new ZoneLevelZeroTrustOrganizationApi(defaultClient);
    Object identifier = null; // Object | 
    ZoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest = new ZoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest(); // ZoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest | 
    try {
      AccessOrganizationsComponentsSchemasSingleResponse result = apiInstance.zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization(identifier, zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelZeroTrustOrganizationApi#zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization");
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
| **identifier** | [**Object**](.md)|  | |
| **zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest** | [**ZoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest**](ZoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganizationRequest.md)|  | |

### Return type

[**AccessOrganizationsComponentsSchemasSingleResponse**](AccessOrganizationsComponentsSchemasSingleResponse.md)

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

<a id="zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization"></a>
# **zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization**
> AccessOrganizationsComponentsSchemasSingleResponse zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization(identifier)

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
import org.openapitools.client.api.ZoneLevelZeroTrustOrganizationApi;

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

    ZoneLevelZeroTrustOrganizationApi apiInstance = new ZoneLevelZeroTrustOrganizationApi(defaultClient);
    Object identifier = null; // Object | 
    try {
      AccessOrganizationsComponentsSchemasSingleResponse result = apiInstance.zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelZeroTrustOrganizationApi#zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization");
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
| **identifier** | [**Object**](.md)|  | |

### Return type

[**AccessOrganizationsComponentsSchemasSingleResponse**](AccessOrganizationsComponentsSchemasSingleResponse.md)

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

<a id="zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser"></a>
# **zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser**
> AccessEmptyResponse zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser(identifier, zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest)

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
import org.openapitools.client.api.ZoneLevelZeroTrustOrganizationApi;

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

    ZoneLevelZeroTrustOrganizationApi apiInstance = new ZoneLevelZeroTrustOrganizationApi(defaultClient);
    Object identifier = null; // Object | 
    ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest = new ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest(); // ZeroTrustOrganizationRevokeAllAccessTokensForAUserRequest | 
    try {
      AccessEmptyResponse result = apiInstance.zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser(identifier, zeroTrustOrganizationRevokeAllAccessTokensForAUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelZeroTrustOrganizationApi#zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser");
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
| **identifier** | [**Object**](.md)|  | |
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

<a id="zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization"></a>
# **zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization**
> AccessOrganizationsComponentsSchemasSingleResponse zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization(identifier, zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest)

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
import org.openapitools.client.api.ZoneLevelZeroTrustOrganizationApi;

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

    ZoneLevelZeroTrustOrganizationApi apiInstance = new ZoneLevelZeroTrustOrganizationApi(defaultClient);
    Object identifier = null; // Object | 
    ZoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest = new ZoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest(); // ZoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest | 
    try {
      AccessOrganizationsComponentsSchemasSingleResponse result = apiInstance.zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization(identifier, zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneLevelZeroTrustOrganizationApi#zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization");
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
| **identifier** | [**Object**](.md)|  | |
| **zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest** | [**ZoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest**](ZoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganizationRequest.md)|  | |

### Return type

[**AccessOrganizationsComponentsSchemasSingleResponse**](AccessOrganizationsComponentsSchemasSingleResponse.md)

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

