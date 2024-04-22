# PermissionGroupsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**permissionGroupsListPermissionGroups**](PermissionGroupsApi.md#permissionGroupsListPermissionGroups) | **GET** /user/tokens/permission_groups | List Permission Groups |


<a id="permissionGroupsListPermissionGroups"></a>
# **permissionGroupsListPermissionGroups**
> IamSchemasResponseCollection permissionGroupsListPermissionGroups()

List Permission Groups

Find all available permission groups.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.PermissionGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    PermissionGroupsApi apiInstance = new PermissionGroupsApi(defaultClient);
    try {
      IamSchemasResponseCollection result = apiInstance.permissionGroupsListPermissionGroups();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionGroupsApi#permissionGroupsListPermissionGroups");
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

[**IamSchemasResponseCollection**](IamSchemasResponseCollection.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Permission Groups response |  -  |
| **4XX** | List Permission Groups response failure |  -  |

