# IpAddressManagementAddressMapsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMap) | **PUT** /accounts/{account_id}/addressing/address_maps/{address_map_id}/zones/{zone_id} | Add a zone membership to an Address Map |
| [**ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMap) | **PUT** /accounts/{account_id}/addressing/address_maps/{address_map_id}/accounts/{account_id} | Add an account membership to an Address Map |
| [**ipAddressManagementAddressMapsAddAnIpToAnAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsAddAnIpToAnAddressMap) | **PUT** /accounts/{account_id}/addressing/address_maps/{address_map_id}/ips/{ip_address} | Add an IP to an Address Map |
| [**ipAddressManagementAddressMapsAddressMapDetails**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsAddressMapDetails) | **GET** /accounts/{account_id}/addressing/address_maps/{address_map_id} | Address Map Details |
| [**ipAddressManagementAddressMapsCreateAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsCreateAddressMap) | **POST** /accounts/{account_id}/addressing/address_maps | Create Address Map |
| [**ipAddressManagementAddressMapsDeleteAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsDeleteAddressMap) | **DELETE** /accounts/{account_id}/addressing/address_maps/{address_map_id} | Delete Address Map |
| [**ipAddressManagementAddressMapsListAddressMaps**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsListAddressMaps) | **GET** /accounts/{account_id}/addressing/address_maps | List Address Maps |
| [**ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMap) | **DELETE** /accounts/{account_id}/addressing/address_maps/{address_map_id}/zones/{zone_id} | Remove a zone membership from an Address Map |
| [**ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMap) | **DELETE** /accounts/{account_id}/addressing/address_maps/{address_map_id}/accounts/{account_id} | Remove an account membership from an Address Map |
| [**ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMap) | **DELETE** /accounts/{account_id}/addressing/address_maps/{address_map_id}/ips/{ip_address} | Remove an IP from an Address Map |
| [**ipAddressManagementAddressMapsUpdateAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsUpdateAddressMap) | **PATCH** /accounts/{account_id}/addressing/address_maps/{address_map_id} | Update Address Map |


<a id="ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMap"></a>
# **ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMap**
> AddressingApiResponseCollection ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMap(zoneId, addressMapId, accountId)

Add a zone membership to an Address Map

Add a zone as a member of a particular address map.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IpAddressManagementAddressMapsApi;

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

    IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String addressMapId = "addressMapId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      AddressingApiResponseCollection result = apiInstance.ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMap(zoneId, addressMapId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMap");
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
| **addressMapId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**AddressingApiResponseCollection**](AddressingApiResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add a zone membership to an Address Map response |  -  |
| **4XX** | Add a zone membership to an Address Map response failure |  -  |

<a id="ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMap"></a>
# **ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMap**
> AddressingApiResponseCollection ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMap(accountId, addressMapId)

Add an account membership to an Address Map

Add an account as a member of a particular address map.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IpAddressManagementAddressMapsApi;

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

    IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String addressMapId = "addressMapId_example"; // String | 
    try {
      AddressingApiResponseCollection result = apiInstance.ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMap(accountId, addressMapId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMap");
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
| **accountId** | **String**|  | |
| **addressMapId** | **String**|  | |

### Return type

[**AddressingApiResponseCollection**](AddressingApiResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add an account membership to an Address Map response |  -  |
| **4XX** | Add an account membership to an Address Map response failure |  -  |

<a id="ipAddressManagementAddressMapsAddAnIpToAnAddressMap"></a>
# **ipAddressManagementAddressMapsAddAnIpToAnAddressMap**
> AddressingApiResponseCollection ipAddressManagementAddressMapsAddAnIpToAnAddressMap(ipAddress, addressMapId, accountId)

Add an IP to an Address Map

Add an IP from a prefix owned by the account to a particular address map.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IpAddressManagementAddressMapsApi;

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

    IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi(defaultClient);
    String ipAddress = "ipAddress_example"; // String | 
    String addressMapId = "addressMapId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      AddressingApiResponseCollection result = apiInstance.ipAddressManagementAddressMapsAddAnIpToAnAddressMap(ipAddress, addressMapId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsAddAnIpToAnAddressMap");
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
| **ipAddress** | **String**|  | |
| **addressMapId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**AddressingApiResponseCollection**](AddressingApiResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add an IP to an Address Map response |  -  |
| **4XX** | Add an IP to an Address Map response failure |  -  |

<a id="ipAddressManagementAddressMapsAddressMapDetails"></a>
# **ipAddressManagementAddressMapsAddressMapDetails**
> AddressingFullResponse ipAddressManagementAddressMapsAddressMapDetails(addressMapId, accountId)

Address Map Details

Show a particular address map owned by the account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IpAddressManagementAddressMapsApi;

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

    IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi(defaultClient);
    String addressMapId = "addressMapId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      AddressingFullResponse result = apiInstance.ipAddressManagementAddressMapsAddressMapDetails(addressMapId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsAddressMapDetails");
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
| **addressMapId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**AddressingFullResponse**](AddressingFullResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Address Map Details response |  -  |
| **4XX** | Address Map Details response failure |  -  |

<a id="ipAddressManagementAddressMapsCreateAddressMap"></a>
# **ipAddressManagementAddressMapsCreateAddressMap**
> AddressingFullResponse ipAddressManagementAddressMapsCreateAddressMap(accountId, ipAddressManagementAddressMapsCreateAddressMapRequest)

Create Address Map

Create a new address map under the account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IpAddressManagementAddressMapsApi;

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

    IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    IpAddressManagementAddressMapsCreateAddressMapRequest ipAddressManagementAddressMapsCreateAddressMapRequest = new IpAddressManagementAddressMapsCreateAddressMapRequest(); // IpAddressManagementAddressMapsCreateAddressMapRequest | 
    try {
      AddressingFullResponse result = apiInstance.ipAddressManagementAddressMapsCreateAddressMap(accountId, ipAddressManagementAddressMapsCreateAddressMapRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsCreateAddressMap");
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
| **accountId** | **String**|  | |
| **ipAddressManagementAddressMapsCreateAddressMapRequest** | [**IpAddressManagementAddressMapsCreateAddressMapRequest**](IpAddressManagementAddressMapsCreateAddressMapRequest.md)|  | |

### Return type

[**AddressingFullResponse**](AddressingFullResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Address Map response |  -  |
| **4XX** | Create Address Map response failure |  -  |

<a id="ipAddressManagementAddressMapsDeleteAddressMap"></a>
# **ipAddressManagementAddressMapsDeleteAddressMap**
> AddressingApiResponseCollection ipAddressManagementAddressMapsDeleteAddressMap(addressMapId, accountId)

Delete Address Map

Delete a particular address map owned by the account. An Address Map must be disabled before it can be deleted.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IpAddressManagementAddressMapsApi;

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

    IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi(defaultClient);
    String addressMapId = "addressMapId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      AddressingApiResponseCollection result = apiInstance.ipAddressManagementAddressMapsDeleteAddressMap(addressMapId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsDeleteAddressMap");
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
| **addressMapId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**AddressingApiResponseCollection**](AddressingApiResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Address Map response |  -  |
| **4XX** | Delete Address Map response failure |  -  |

<a id="ipAddressManagementAddressMapsListAddressMaps"></a>
# **ipAddressManagementAddressMapsListAddressMaps**
> AddressingComponentsSchemasResponseCollection ipAddressManagementAddressMapsListAddressMaps(accountId)

List Address Maps

List all address maps owned by the account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IpAddressManagementAddressMapsApi;

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

    IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      AddressingComponentsSchemasResponseCollection result = apiInstance.ipAddressManagementAddressMapsListAddressMaps(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsListAddressMaps");
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
| **accountId** | **String**|  | |

### Return type

[**AddressingComponentsSchemasResponseCollection**](AddressingComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Address Maps response |  -  |
| **4XX** | List Address Maps response failure |  -  |

<a id="ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMap"></a>
# **ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMap**
> AddressingApiResponseCollection ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMap(zoneId, addressMapId, accountId)

Remove a zone membership from an Address Map

Remove a zone as a member of a particular address map.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IpAddressManagementAddressMapsApi;

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

    IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String addressMapId = "addressMapId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      AddressingApiResponseCollection result = apiInstance.ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMap(zoneId, addressMapId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMap");
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
| **addressMapId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**AddressingApiResponseCollection**](AddressingApiResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Remove a zone membership from an Address Map response |  -  |
| **4XX** | Remove a zone membership from an Address Map response failure |  -  |

<a id="ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMap"></a>
# **ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMap**
> AddressingApiResponseCollection ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMap(accountId, addressMapId)

Remove an account membership from an Address Map

Remove an account as a member of a particular address map.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IpAddressManagementAddressMapsApi;

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

    IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String addressMapId = "addressMapId_example"; // String | 
    try {
      AddressingApiResponseCollection result = apiInstance.ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMap(accountId, addressMapId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMap");
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
| **accountId** | **String**|  | |
| **addressMapId** | **String**|  | |

### Return type

[**AddressingApiResponseCollection**](AddressingApiResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Remove an account membership from an Address Map response |  -  |
| **4XX** | Remove an account membership from an Address Map response failure |  -  |

<a id="ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMap"></a>
# **ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMap**
> AddressingApiResponseCollection ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMap(ipAddress, addressMapId, accountId)

Remove an IP from an Address Map

Remove an IP from a particular address map.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IpAddressManagementAddressMapsApi;

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

    IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi(defaultClient);
    String ipAddress = "ipAddress_example"; // String | 
    String addressMapId = "addressMapId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      AddressingApiResponseCollection result = apiInstance.ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMap(ipAddress, addressMapId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMap");
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
| **ipAddress** | **String**|  | |
| **addressMapId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**AddressingApiResponseCollection**](AddressingApiResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Remove an IP from an Address Map response |  -  |
| **4XX** | Remove an IP from an Address Map response failure |  -  |

<a id="ipAddressManagementAddressMapsUpdateAddressMap"></a>
# **ipAddressManagementAddressMapsUpdateAddressMap**
> AddressingComponentsSchemasSingleResponse ipAddressManagementAddressMapsUpdateAddressMap(addressMapId, accountId, ipAddressManagementAddressMapsUpdateAddressMapRequest)

Update Address Map

Modify properties of an address map owned by the account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IpAddressManagementAddressMapsApi;

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

    IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi(defaultClient);
    String addressMapId = "addressMapId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    IpAddressManagementAddressMapsUpdateAddressMapRequest ipAddressManagementAddressMapsUpdateAddressMapRequest = new IpAddressManagementAddressMapsUpdateAddressMapRequest(); // IpAddressManagementAddressMapsUpdateAddressMapRequest | 
    try {
      AddressingComponentsSchemasSingleResponse result = apiInstance.ipAddressManagementAddressMapsUpdateAddressMap(addressMapId, accountId, ipAddressManagementAddressMapsUpdateAddressMapRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsUpdateAddressMap");
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
| **addressMapId** | **String**|  | |
| **accountId** | **String**|  | |
| **ipAddressManagementAddressMapsUpdateAddressMapRequest** | [**IpAddressManagementAddressMapsUpdateAddressMapRequest**](IpAddressManagementAddressMapsUpdateAddressMapRequest.md)|  | |

### Return type

[**AddressingComponentsSchemasSingleResponse**](AddressingComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Address Map response |  -  |
| **4XX** | Update Address Map response failure |  -  |

