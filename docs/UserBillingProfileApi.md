# UserBillingProfileApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userBillingProfileDeprecatedBillingProfileDetails**](UserBillingProfileApi.md#userBillingProfileDeprecatedBillingProfileDetails) | **GET** /user/billing/profile | Billing Profile Details |


<a id="userBillingProfileDeprecatedBillingProfileDetails"></a>
# **userBillingProfileDeprecatedBillingProfileDetails**
> BillSubsApiBillingResponseSingle userBillingProfileDeprecatedBillingProfileDetails()

Billing Profile Details

Accesses your billing profile object.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.UserBillingProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    // Configure API key authorization: api_email
    ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
    api_email.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_email.setApiKeyPrefix("Token");

    UserBillingProfileApi apiInstance = new UserBillingProfileApi(defaultClient);
    try {
      BillSubsApiBillingResponseSingle result = apiInstance.userBillingProfileDeprecatedBillingProfileDetails();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserBillingProfileApi#userBillingProfileDeprecatedBillingProfileDetails");
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

[**BillSubsApiBillingResponseSingle**](BillSubsApiBillingResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Billing Profile Details response |  -  |
| **4XX** | Billing Profile Details response failure |  -  |

