# UsersAccountMembershipsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userSAccountMembershipsDeleteMembership**](UsersAccountMembershipsApi.md#userSAccountMembershipsDeleteMembership) | **DELETE** /memberships/{membership_id} | Delete Membership |
| [**userSAccountMembershipsListMemberships**](UsersAccountMembershipsApi.md#userSAccountMembershipsListMemberships) | **GET** /memberships | List Memberships |
| [**userSAccountMembershipsMembershipDetails**](UsersAccountMembershipsApi.md#userSAccountMembershipsMembershipDetails) | **GET** /memberships/{membership_id} | Membership Details |
| [**userSAccountMembershipsUpdateMembership**](UsersAccountMembershipsApi.md#userSAccountMembershipsUpdateMembership) | **PUT** /memberships/{membership_id} | Update Membership |


<a id="userSAccountMembershipsDeleteMembership"></a>
# **userSAccountMembershipsDeleteMembership**
> UserSAccountMembershipsDeleteMembership200Response userSAccountMembershipsDeleteMembership(membershipId)

Delete Membership

Remove the associated member from an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersAccountMembershipsApi;

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

    UsersAccountMembershipsApi apiInstance = new UsersAccountMembershipsApi(defaultClient);
    String membershipId = "membershipId_example"; // String | 
    try {
      UserSAccountMembershipsDeleteMembership200Response result = apiInstance.userSAccountMembershipsDeleteMembership(membershipId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersAccountMembershipsApi#userSAccountMembershipsDeleteMembership");
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
| **membershipId** | **String**|  | |

### Return type

[**UserSAccountMembershipsDeleteMembership200Response**](UserSAccountMembershipsDeleteMembership200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Membership response |  -  |
| **4XX** | Delete Membership response failure |  -  |

<a id="userSAccountMembershipsListMemberships"></a>
# **userSAccountMembershipsListMemberships**
> IamCollectionMembershipResponse userSAccountMembershipsListMemberships(accountName, page, perPage, order, direction, name, status)

List Memberships

List memberships of accounts the user can access.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersAccountMembershipsApi;

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

    UsersAccountMembershipsApi apiInstance = new UsersAccountMembershipsApi(defaultClient);
    String accountName = "accountName_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    String order = "id"; // String | 
    String direction = "asc"; // String | 
    String name = "name_example"; // String | 
    String status = "accepted"; // String | 
    try {
      IamCollectionMembershipResponse result = apiInstance.userSAccountMembershipsListMemberships(accountName, page, perPage, order, direction, name, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersAccountMembershipsApi#userSAccountMembershipsListMemberships");
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
| **accountName** | **String**|  | [optional] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |
| **order** | **String**|  | [optional] [enum: id, account.name, status] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |
| **name** | **String**|  | [optional] |
| **status** | **String**|  | [optional] [enum: accepted, pending, rejected] |

### Return type

[**IamCollectionMembershipResponse**](IamCollectionMembershipResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Memberships response |  -  |
| **4XX** | List Memberships response failure |  -  |

<a id="userSAccountMembershipsMembershipDetails"></a>
# **userSAccountMembershipsMembershipDetails**
> IamSingleMembershipResponse userSAccountMembershipsMembershipDetails(membershipId)

Membership Details

Get a specific membership.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersAccountMembershipsApi;

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

    UsersAccountMembershipsApi apiInstance = new UsersAccountMembershipsApi(defaultClient);
    String membershipId = "membershipId_example"; // String | 
    try {
      IamSingleMembershipResponse result = apiInstance.userSAccountMembershipsMembershipDetails(membershipId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersAccountMembershipsApi#userSAccountMembershipsMembershipDetails");
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
| **membershipId** | **String**|  | |

### Return type

[**IamSingleMembershipResponse**](IamSingleMembershipResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Membership Details response |  -  |
| **4XX** | Membership Details response failure |  -  |

<a id="userSAccountMembershipsUpdateMembership"></a>
# **userSAccountMembershipsUpdateMembership**
> IamSingleMembershipResponse userSAccountMembershipsUpdateMembership(membershipId, userSAccountMembershipsUpdateMembershipRequest)

Update Membership

Accept or reject this account invitation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersAccountMembershipsApi;

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

    UsersAccountMembershipsApi apiInstance = new UsersAccountMembershipsApi(defaultClient);
    String membershipId = "membershipId_example"; // String | 
    UserSAccountMembershipsUpdateMembershipRequest userSAccountMembershipsUpdateMembershipRequest = new UserSAccountMembershipsUpdateMembershipRequest(); // UserSAccountMembershipsUpdateMembershipRequest | 
    try {
      IamSingleMembershipResponse result = apiInstance.userSAccountMembershipsUpdateMembership(membershipId, userSAccountMembershipsUpdateMembershipRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersAccountMembershipsApi#userSAccountMembershipsUpdateMembership");
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
| **membershipId** | **String**|  | |
| **userSAccountMembershipsUpdateMembershipRequest** | [**UserSAccountMembershipsUpdateMembershipRequest**](UserSAccountMembershipsUpdateMembershipRequest.md)|  | |

### Return type

[**IamSingleMembershipResponse**](IamSingleMembershipResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Membership response |  -  |
| **4XX** | Update Membership response failure |  -  |

