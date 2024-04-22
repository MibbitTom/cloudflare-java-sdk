# AccountMembersApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountMembersAddMember**](AccountMembersApi.md#accountMembersAddMember) | **POST** /accounts/{account_id}/members | Add Member |
| [**accountMembersListMembers**](AccountMembersApi.md#accountMembersListMembers) | **GET** /accounts/{account_id}/members | List Members |
| [**accountMembersMemberDetails**](AccountMembersApi.md#accountMembersMemberDetails) | **GET** /accounts/{account_id}/members/{member_id} | Member Details |
| [**accountMembersRemoveMember**](AccountMembersApi.md#accountMembersRemoveMember) | **DELETE** /accounts/{account_id}/members/{member_id} | Remove Member |
| [**accountMembersUpdateMember**](AccountMembersApi.md#accountMembersUpdateMember) | **PUT** /accounts/{account_id}/members/{member_id} | Update Member |


<a id="accountMembersAddMember"></a>
# **accountMembersAddMember**
> IamSingleMemberResponseWithCode accountMembersAddMember(accountId, iamCreate)

Add Member

Add a user to the list of members for this account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountMembersApi;

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

    AccountMembersApi apiInstance = new AccountMembersApi(defaultClient);
    Object accountId = null; // Object | 
    IamCreate iamCreate = new IamCreate(); // IamCreate | 
    try {
      IamSingleMemberResponseWithCode result = apiInstance.accountMembersAddMember(accountId, iamCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountMembersApi#accountMembersAddMember");
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
| **iamCreate** | [**IamCreate**](IamCreate.md)|  | |

### Return type

[**IamSingleMemberResponseWithCode**](IamSingleMemberResponseWithCode.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add Member response |  -  |
| **4XX** | Add Member response failure |  -  |

<a id="accountMembersListMembers"></a>
# **accountMembersListMembers**
> IamCollectionMemberResponse accountMembersListMembers(accountId, order, status, page, perPage, direction)

List Members

List all members of an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountMembersApi;

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

    AccountMembersApi apiInstance = new AccountMembersApi(defaultClient);
    Object accountId = null; // Object | 
    String order = "user.first_name"; // String | 
    String status = "accepted"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    String direction = "asc"; // String | 
    try {
      IamCollectionMemberResponse result = apiInstance.accountMembersListMembers(accountId, order, status, page, perPage, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountMembersApi#accountMembersListMembers");
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
| **order** | **String**|  | [optional] [enum: user.first_name, user.last_name, user.email, status] |
| **status** | **String**|  | [optional] [enum: accepted, pending, rejected] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |

### Return type

[**IamCollectionMemberResponse**](IamCollectionMemberResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Members response |  -  |
| **4XX** | List Members response failure |  -  |

<a id="accountMembersMemberDetails"></a>
# **accountMembersMemberDetails**
> IamSingleMemberResponse accountMembersMemberDetails(memberId, accountId)

Member Details

Get information about a specific member of an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountMembersApi;

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

    AccountMembersApi apiInstance = new AccountMembersApi(defaultClient);
    String memberId = "memberId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      IamSingleMemberResponse result = apiInstance.accountMembersMemberDetails(memberId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountMembersApi#accountMembersMemberDetails");
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
| **memberId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**IamSingleMemberResponse**](IamSingleMemberResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member Details response |  -  |
| **4XX** | Member Details response failure |  -  |

<a id="accountMembersRemoveMember"></a>
# **accountMembersRemoveMember**
> IamApiResponseSingleId accountMembersRemoveMember(memberId, accountId)

Remove Member

Remove a member from an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountMembersApi;

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

    AccountMembersApi apiInstance = new AccountMembersApi(defaultClient);
    String memberId = "memberId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      IamApiResponseSingleId result = apiInstance.accountMembersRemoveMember(memberId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountMembersApi#accountMembersRemoveMember");
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
| **memberId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |

### Return type

[**IamApiResponseSingleId**](IamApiResponseSingleId.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Remove Member response |  -  |
| **4XX** | Remove Member response failure |  -  |

<a id="accountMembersUpdateMember"></a>
# **accountMembersUpdateMember**
> IamSingleMemberResponse accountMembersUpdateMember(memberId, accountId, iamSchemasMember)

Update Member

Modify an account member.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountMembersApi;

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

    AccountMembersApi apiInstance = new AccountMembersApi(defaultClient);
    String memberId = "memberId_example"; // String | 
    Object accountId = null; // Object | 
    IamSchemasMember iamSchemasMember = new IamSchemasMember(); // IamSchemasMember | 
    try {
      IamSingleMemberResponse result = apiInstance.accountMembersUpdateMember(memberId, accountId, iamSchemasMember);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountMembersApi#accountMembersUpdateMember");
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
| **memberId** | **String**|  | |
| **accountId** | [**Object**](.md)|  | |
| **iamSchemasMember** | [**IamSchemasMember**](IamSchemasMember.md)|  | |

### Return type

[**IamSingleMemberResponse**](IamSingleMemberResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Member response |  -  |
| **4XX** | Update Member response failure |  -  |

