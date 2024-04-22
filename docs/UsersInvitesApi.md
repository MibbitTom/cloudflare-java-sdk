# UsersInvitesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userSInvitesInvitationDetails**](UsersInvitesApi.md#userSInvitesInvitationDetails) | **GET** /user/invites/{invite_id} | Invitation Details |
| [**userSInvitesListInvitations**](UsersInvitesApi.md#userSInvitesListInvitations) | **GET** /user/invites | List Invitations |
| [**userSInvitesRespondToInvitation**](UsersInvitesApi.md#userSInvitesRespondToInvitation) | **PATCH** /user/invites/{invite_id} | Respond to Invitation |


<a id="userSInvitesInvitationDetails"></a>
# **userSInvitesInvitationDetails**
> IamSingleInviteResponse userSInvitesInvitationDetails(inviteId)

Invitation Details

Gets the details of an invitation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersInvitesApi;

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

    UsersInvitesApi apiInstance = new UsersInvitesApi(defaultClient);
    String inviteId = "inviteId_example"; // String | 
    try {
      IamSingleInviteResponse result = apiInstance.userSInvitesInvitationDetails(inviteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersInvitesApi#userSInvitesInvitationDetails");
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
| **inviteId** | **String**|  | |

### Return type

[**IamSingleInviteResponse**](IamSingleInviteResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invitation Details response |  -  |
| **4XX** | Invitation Details response failure |  -  |

<a id="userSInvitesListInvitations"></a>
# **userSInvitesListInvitations**
> IamSchemasCollectionInviteResponse userSInvitesListInvitations()

List Invitations

Lists all invitations associated with my user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersInvitesApi;

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

    UsersInvitesApi apiInstance = new UsersInvitesApi(defaultClient);
    try {
      IamSchemasCollectionInviteResponse result = apiInstance.userSInvitesListInvitations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersInvitesApi#userSInvitesListInvitations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IamSchemasCollectionInviteResponse**](IamSchemasCollectionInviteResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Invitations response |  -  |
| **4XX** | List Invitations response failure |  -  |

<a id="userSInvitesRespondToInvitation"></a>
# **userSInvitesRespondToInvitation**
> IamSingleInviteResponse userSInvitesRespondToInvitation(inviteId, userSInvitesRespondToInvitationRequest)

Respond to Invitation

Responds to an invitation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersInvitesApi;

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

    UsersInvitesApi apiInstance = new UsersInvitesApi(defaultClient);
    String inviteId = "inviteId_example"; // String | 
    UserSInvitesRespondToInvitationRequest userSInvitesRespondToInvitationRequest = new UserSInvitesRespondToInvitationRequest(); // UserSInvitesRespondToInvitationRequest | 
    try {
      IamSingleInviteResponse result = apiInstance.userSInvitesRespondToInvitation(inviteId, userSInvitesRespondToInvitationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersInvitesApi#userSInvitesRespondToInvitation");
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
| **inviteId** | **String**|  | |
| **userSInvitesRespondToInvitationRequest** | [**UserSInvitesRespondToInvitationRequest**](UserSInvitesRespondToInvitationRequest.md)|  | |

### Return type

[**IamSingleInviteResponse**](IamSingleInviteResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Respond to Invitation response |  -  |
| **4XX** | Respond to Invitation response failure |  -  |

