# AccountRolesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountRolesListRoles**](AccountRolesApi.md#accountRolesListRoles) | **GET** /accounts/{account_id}/roles | List Roles |
| [**accountRolesRoleDetails**](AccountRolesApi.md#accountRolesRoleDetails) | **GET** /accounts/{account_id}/roles/{role_id} | Role Details |


<a id="accountRolesListRoles"></a>
# **accountRolesListRoles**
> IamCollectionRoleResponse accountRolesListRoles(accountId)

List Roles

Get all available roles for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRolesApi;

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

    AccountRolesApi apiInstance = new AccountRolesApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      IamCollectionRoleResponse result = apiInstance.accountRolesListRoles(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRolesApi#accountRolesListRoles");
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

[**IamCollectionRoleResponse**](IamCollectionRoleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Roles response |  -  |
| **4XX** | List Roles response failure |  -  |

<a id="accountRolesRoleDetails"></a>
# **accountRolesRoleDetails**
> IamSingleRoleResponse accountRolesRoleDetails(roleId, accountId)

Role Details

Get information about a specific role for an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRolesApi;

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

    AccountRolesApi apiInstance = new AccountRolesApi(defaultClient);
    Object roleId = null; // Object | 
    Object accountId = null; // Object | 
    try {
      IamSingleRoleResponse result = apiInstance.accountRolesRoleDetails(roleId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRolesApi#accountRolesRoleDetails");
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
| **roleId** | [**Object**](.md)|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**IamSingleRoleResponse**](IamSingleRoleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Role Details response |  -  |
| **4XX** | Role Details response failure |  -  |

