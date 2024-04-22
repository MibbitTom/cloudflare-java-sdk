# DcvDelegationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dcvDelegationUuidGet**](DcvDelegationApi.md#dcvDelegationUuidGet) | **GET** /zones/{zone_id}/dcv_delegation/uuid | Retrieve the DCV Delegation unique identifier. |


<a id="dcvDelegationUuidGet"></a>
# **dcvDelegationUuidGet**
> TlsCertificatesAndHostnamesDcvDelegationResponse dcvDelegationUuidGet(zoneId)

Retrieve the DCV Delegation unique identifier.

Retrieve the account and zone specific unique identifier used as part of the CNAME target for DCV Delegation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DcvDelegationApi;

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

    DcvDelegationApi apiInstance = new DcvDelegationApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      TlsCertificatesAndHostnamesDcvDelegationResponse result = apiInstance.dcvDelegationUuidGet(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DcvDelegationApi#dcvDelegationUuidGet");
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
| **zoneId** | **String**|  | |

### Return type

[**TlsCertificatesAndHostnamesDcvDelegationResponse**](TlsCertificatesAndHostnamesDcvDelegationResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve the DCV Delegation unique identifier response. |  -  |
| **4XX** | Retrieve the DCV Delegation unique identifier response failure. |  -  |

