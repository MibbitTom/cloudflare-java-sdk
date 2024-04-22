# UsersOrganizationsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userSOrganizationsLeaveOrganization**](UsersOrganizationsApi.md#userSOrganizationsLeaveOrganization) | **DELETE** /user/organizations/{organization_id} | Leave Organization |
| [**userSOrganizationsListOrganizations**](UsersOrganizationsApi.md#userSOrganizationsListOrganizations) | **GET** /user/organizations | List Organizations |
| [**userSOrganizationsOrganizationDetails**](UsersOrganizationsApi.md#userSOrganizationsOrganizationDetails) | **GET** /user/organizations/{organization_id} | Organization Details |


<a id="userSOrganizationsLeaveOrganization"></a>
# **userSOrganizationsLeaveOrganization**
> UserSOrganizationsLeaveOrganization200Response userSOrganizationsLeaveOrganization(organizationId)

Leave Organization

Removes association to an organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersOrganizationsApi;

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

    UsersOrganizationsApi apiInstance = new UsersOrganizationsApi(defaultClient);
    String organizationId = "organizationId_example"; // String | 
    try {
      UserSOrganizationsLeaveOrganization200Response result = apiInstance.userSOrganizationsLeaveOrganization(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersOrganizationsApi#userSOrganizationsLeaveOrganization");
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
| **organizationId** | **String**|  | |

### Return type

[**UserSOrganizationsLeaveOrganization200Response**](UserSOrganizationsLeaveOrganization200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Leave Organization response |  -  |
| **4XX** | Leave Organization response failure |  -  |

<a id="userSOrganizationsListOrganizations"></a>
# **userSOrganizationsListOrganizations**
> IamCollectionOrganizationResponse userSOrganizationsListOrganizations(name, page, perPage, order, direction, match, status)

List Organizations

Lists organizations the user is associated with.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersOrganizationsApi;

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

    UsersOrganizationsApi apiInstance = new UsersOrganizationsApi(defaultClient);
    String name = "name_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    String order = "id"; // String | 
    String direction = "asc"; // String | 
    String match = "any"; // String | 
    String status = "member"; // String | 
    try {
      IamCollectionOrganizationResponse result = apiInstance.userSOrganizationsListOrganizations(name, page, perPage, order, direction, match, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersOrganizationsApi#userSOrganizationsListOrganizations");
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
| **name** | **String**|  | [optional] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |
| **order** | **String**|  | [optional] [enum: id, name, status] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |
| **match** | **String**|  | [optional] [default to all] [enum: any, all] |
| **status** | **String**|  | [optional] [enum: member, invited] |

### Return type

[**IamCollectionOrganizationResponse**](IamCollectionOrganizationResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Organizations response |  -  |
| **4XX** | List Organizations response failure |  -  |

<a id="userSOrganizationsOrganizationDetails"></a>
# **userSOrganizationsOrganizationDetails**
> IamSingleOrganizationResponse userSOrganizationsOrganizationDetails(organizationId)

Organization Details

Gets a specific organization the user is associated with.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersOrganizationsApi;

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

    UsersOrganizationsApi apiInstance = new UsersOrganizationsApi(defaultClient);
    String organizationId = "organizationId_example"; // String | 
    try {
      IamSingleOrganizationResponse result = apiInstance.userSOrganizationsOrganizationDetails(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersOrganizationsApi#userSOrganizationsOrganizationDetails");
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
| **organizationId** | **String**|  | |

### Return type

[**IamSingleOrganizationResponse**](IamSingleOrganizationResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization Details response |  -  |
| **4XX** | Organization Details response failure |  -  |

