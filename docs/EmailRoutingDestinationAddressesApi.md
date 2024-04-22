# EmailRoutingDestinationAddressesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**emailRoutingDestinationAddressesCreateADestinationAddress**](EmailRoutingDestinationAddressesApi.md#emailRoutingDestinationAddressesCreateADestinationAddress) | **POST** /accounts/{account_identifier}/email/routing/addresses | Create a destination address |
| [**emailRoutingDestinationAddressesDeleteDestinationAddress**](EmailRoutingDestinationAddressesApi.md#emailRoutingDestinationAddressesDeleteDestinationAddress) | **DELETE** /accounts/{account_identifier}/email/routing/addresses/{destination_address_identifier} | Delete destination address |
| [**emailRoutingDestinationAddressesGetADestinationAddress**](EmailRoutingDestinationAddressesApi.md#emailRoutingDestinationAddressesGetADestinationAddress) | **GET** /accounts/{account_identifier}/email/routing/addresses/{destination_address_identifier} | Get a destination address |
| [**emailRoutingDestinationAddressesListDestinationAddresses**](EmailRoutingDestinationAddressesApi.md#emailRoutingDestinationAddressesListDestinationAddresses) | **GET** /accounts/{account_identifier}/email/routing/addresses | List destination addresses |


<a id="emailRoutingDestinationAddressesCreateADestinationAddress"></a>
# **emailRoutingDestinationAddressesCreateADestinationAddress**
> EmailDestinationAddressResponseSingle emailRoutingDestinationAddressesCreateADestinationAddress(accountIdentifier, emailCreateDestinationAddressProperties)

Create a destination address

Create a destination address to forward your emails to. Destination addresses need to be verified before they can be used.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailRoutingDestinationAddressesApi;

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

    EmailRoutingDestinationAddressesApi apiInstance = new EmailRoutingDestinationAddressesApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    EmailCreateDestinationAddressProperties emailCreateDestinationAddressProperties = new EmailCreateDestinationAddressProperties(); // EmailCreateDestinationAddressProperties | 
    try {
      EmailDestinationAddressResponseSingle result = apiInstance.emailRoutingDestinationAddressesCreateADestinationAddress(accountIdentifier, emailCreateDestinationAddressProperties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailRoutingDestinationAddressesApi#emailRoutingDestinationAddressesCreateADestinationAddress");
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
| **accountIdentifier** | **String**|  | |
| **emailCreateDestinationAddressProperties** | [**EmailCreateDestinationAddressProperties**](EmailCreateDestinationAddressProperties.md)|  | |

### Return type

[**EmailDestinationAddressResponseSingle**](EmailDestinationAddressResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a destination address response |  -  |

<a id="emailRoutingDestinationAddressesDeleteDestinationAddress"></a>
# **emailRoutingDestinationAddressesDeleteDestinationAddress**
> EmailDestinationAddressResponseSingle emailRoutingDestinationAddressesDeleteDestinationAddress(destinationAddressIdentifier, accountIdentifier)

Delete destination address

Deletes a specific destination address.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailRoutingDestinationAddressesApi;

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

    EmailRoutingDestinationAddressesApi apiInstance = new EmailRoutingDestinationAddressesApi(defaultClient);
    String destinationAddressIdentifier = "destinationAddressIdentifier_example"; // String | 
    String accountIdentifier = "accountIdentifier_example"; // String | 
    try {
      EmailDestinationAddressResponseSingle result = apiInstance.emailRoutingDestinationAddressesDeleteDestinationAddress(destinationAddressIdentifier, accountIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailRoutingDestinationAddressesApi#emailRoutingDestinationAddressesDeleteDestinationAddress");
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
| **destinationAddressIdentifier** | **String**|  | |
| **accountIdentifier** | **String**|  | |

### Return type

[**EmailDestinationAddressResponseSingle**](EmailDestinationAddressResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete destination address response |  -  |

<a id="emailRoutingDestinationAddressesGetADestinationAddress"></a>
# **emailRoutingDestinationAddressesGetADestinationAddress**
> EmailDestinationAddressResponseSingle emailRoutingDestinationAddressesGetADestinationAddress(destinationAddressIdentifier, accountIdentifier)

Get a destination address

Gets information for a specific destination email already created.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailRoutingDestinationAddressesApi;

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

    EmailRoutingDestinationAddressesApi apiInstance = new EmailRoutingDestinationAddressesApi(defaultClient);
    String destinationAddressIdentifier = "destinationAddressIdentifier_example"; // String | 
    String accountIdentifier = "accountIdentifier_example"; // String | 
    try {
      EmailDestinationAddressResponseSingle result = apiInstance.emailRoutingDestinationAddressesGetADestinationAddress(destinationAddressIdentifier, accountIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailRoutingDestinationAddressesApi#emailRoutingDestinationAddressesGetADestinationAddress");
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
| **destinationAddressIdentifier** | **String**|  | |
| **accountIdentifier** | **String**|  | |

### Return type

[**EmailDestinationAddressResponseSingle**](EmailDestinationAddressResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a destination address response |  -  |

<a id="emailRoutingDestinationAddressesListDestinationAddresses"></a>
# **emailRoutingDestinationAddressesListDestinationAddresses**
> EmailDestinationAddressesResponseCollection emailRoutingDestinationAddressesListDestinationAddresses(accountIdentifier, page, perPage, direction, verified)

List destination addresses

Lists existing destination addresses.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailRoutingDestinationAddressesApi;

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

    EmailRoutingDestinationAddressesApi apiInstance = new EmailRoutingDestinationAddressesApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    String direction = "asc"; // String | 
    Boolean verified = true; // Boolean | 
    try {
      EmailDestinationAddressesResponseCollection result = apiInstance.emailRoutingDestinationAddressesListDestinationAddresses(accountIdentifier, page, perPage, direction, verified);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailRoutingDestinationAddressesApi#emailRoutingDestinationAddressesListDestinationAddresses");
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
| **accountIdentifier** | **String**|  | |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |
| **direction** | **String**|  | [optional] [default to asc] [enum: asc, desc] |
| **verified** | **Boolean**|  | [optional] [default to true] |

### Return type

[**EmailDestinationAddressesResponseCollection**](EmailDestinationAddressesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List destination addresses response |  -  |

