# CustomHostnameForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomHostname**](CustomHostnameForAZoneApi.md#createCustomHostname) | **POST** /zones/{zone_id}/custom_hostnames | Create Custom Hostname |
| [**createCustomHostnameWithHttpInfo**](CustomHostnameForAZoneApi.md#createCustomHostnameWithHttpInfo) | **POST** /zones/{zone_id}/custom_hostnames | Create Custom Hostname |
| [**customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates**](CustomHostnameForAZoneApi.md#customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates) | **DELETE** /zones/{zone_id}/custom_hostnames/{custom_hostname_id} | Delete Custom Hostname (and any issued SSL certificates) |
| [**customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificatesWithHttpInfo**](CustomHostnameForAZoneApi.md#customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificatesWithHttpInfo) | **DELETE** /zones/{zone_id}/custom_hostnames/{custom_hostname_id} | Delete Custom Hostname (and any issued SSL certificates) |
| [**listCustomHostnames**](CustomHostnameForAZoneApi.md#listCustomHostnames) | **GET** /zones/{zone_id}/custom_hostnames | List Custom Hostnames |
| [**listCustomHostnamesWithHttpInfo**](CustomHostnameForAZoneApi.md#listCustomHostnamesWithHttpInfo) | **GET** /zones/{zone_id}/custom_hostnames | List Custom Hostnames |



## createCustomHostname

> TlsCertificatesAndHostnamesCustomHostnameResponseSingle createCustomHostname(zoneId, createCustomHostnameRequest)

Create Custom Hostname

Add a new custom hostname and request that an SSL certificate be issued for it. One of three validation methods—http, txt, email—should be used, with &#39;http&#39; recommended if the CNAME is already in place (or will be soon). Specifying &#39;email&#39; will send an email to the WHOIS contacts on file for the base domain plus hostmaster, postmaster, webmaster, admin, administrator. If http is used and the domain is not already pointing to the Managed CNAME host, the PATCH method must be used once it is (to complete validation).

### Example

```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CustomHostnameForAZoneApi;

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

        CustomHostnameForAZoneApi apiInstance = new CustomHostnameForAZoneApi(defaultClient);
        String zoneId = "zoneId_example"; // String | 
        CreateCustomHostnameRequest createCustomHostnameRequest = new CreateCustomHostnameRequest(); // CreateCustomHostnameRequest | 
        try {
            TlsCertificatesAndHostnamesCustomHostnameResponseSingle result = apiInstance.createCustomHostname(zoneId, createCustomHostnameRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomHostnameForAZoneApi#createCustomHostname");
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
| **createCustomHostnameRequest** | [**CreateCustomHostnameRequest**](CreateCustomHostnameRequest.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesCustomHostnameResponseSingle**](TlsCertificatesAndHostnamesCustomHostnameResponseSingle.md)


### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Custom Hostname response |  -  |
| **4XX** | Create Custom Hostname response failure |  -  |

## createCustomHostnameWithHttpInfo

> ApiResponse<TlsCertificatesAndHostnamesCustomHostnameResponseSingle> createCustomHostname createCustomHostnameWithHttpInfo(zoneId, createCustomHostnameRequest)

Create Custom Hostname

Add a new custom hostname and request that an SSL certificate be issued for it. One of three validation methods—http, txt, email—should be used, with &#39;http&#39; recommended if the CNAME is already in place (or will be soon). Specifying &#39;email&#39; will send an email to the WHOIS contacts on file for the base domain plus hostmaster, postmaster, webmaster, admin, administrator. If http is used and the domain is not already pointing to the Managed CNAME host, the PATCH method must be used once it is (to complete validation).

### Example

```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.ApiResponse;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CustomHostnameForAZoneApi;

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

        CustomHostnameForAZoneApi apiInstance = new CustomHostnameForAZoneApi(defaultClient);
        String zoneId = "zoneId_example"; // String | 
        CreateCustomHostnameRequest createCustomHostnameRequest = new CreateCustomHostnameRequest(); // CreateCustomHostnameRequest | 
        try {
            ApiResponse<TlsCertificatesAndHostnamesCustomHostnameResponseSingle> response = apiInstance.createCustomHostnameWithHttpInfo(zoneId, createCustomHostnameRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomHostnameForAZoneApi#createCustomHostname");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **createCustomHostnameRequest** | [**CreateCustomHostnameRequest**](CreateCustomHostnameRequest.md)|  | |

### Return type

ApiResponse<[**TlsCertificatesAndHostnamesCustomHostnameResponseSingle**](TlsCertificatesAndHostnamesCustomHostnameResponseSingle.md)>


### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Custom Hostname response |  -  |
| **4XX** | Create Custom Hostname response failure |  -  |


## customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates

> CustomHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates200Response customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates(customHostnameId, zoneId)

Delete Custom Hostname (and any issued SSL certificates)

### Example

```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CustomHostnameForAZoneApi;

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

        CustomHostnameForAZoneApi apiInstance = new CustomHostnameForAZoneApi(defaultClient);
        String customHostnameId = "customHostnameId_example"; // String | 
        String zoneId = "zoneId_example"; // String | 
        try {
            CustomHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates200Response result = apiInstance.customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates(customHostnameId, zoneId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomHostnameForAZoneApi#customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates");
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
| **customHostnameId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**CustomHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates200Response**](CustomHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates200Response.md)


### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Custom Hostname (and any issued SSL certificates) response |  -  |
| **4XX** | Delete Custom Hostname (and any issued SSL certificates) response failure |  -  |

## customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificatesWithHttpInfo

> ApiResponse<CustomHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates200Response> customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificatesWithHttpInfo(customHostnameId, zoneId)

Delete Custom Hostname (and any issued SSL certificates)

### Example

```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.ApiResponse;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CustomHostnameForAZoneApi;

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

        CustomHostnameForAZoneApi apiInstance = new CustomHostnameForAZoneApi(defaultClient);
        String customHostnameId = "customHostnameId_example"; // String | 
        String zoneId = "zoneId_example"; // String | 
        try {
            ApiResponse<CustomHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates200Response> response = apiInstance.customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificatesWithHttpInfo(customHostnameId, zoneId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomHostnameForAZoneApi#customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customHostnameId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

ApiResponse<[**CustomHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates200Response**](CustomHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates200Response.md)>


### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Custom Hostname (and any issued SSL certificates) response |  -  |
| **4XX** | Delete Custom Hostname (and any issued SSL certificates) response failure |  -  |


## listCustomHostnames

> TlsCertificatesAndHostnamesCustomHostnameResponseCollection listCustomHostnames(zoneId, hostname, id, page, perPage, order, direction, ssl)

List Custom Hostnames

List, search, sort, and filter all of your custom hostnames.

### Example

```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CustomHostnameForAZoneApi;

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

        CustomHostnameForAZoneApi apiInstance = new CustomHostnameForAZoneApi(defaultClient);
        String zoneId = "zoneId_example"; // String | 
        String hostname = "app.example.com"; // String | 
        String id = "0d89c70d-ad9f-4843-b99f-6cc0252067e9"; // String | 
        BigDecimal page = new BigDecimal("1"); // BigDecimal | 
        BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
        String order = "ssl"; // String | 
        String direction = "asc"; // String | 
        BigDecimal ssl = new BigDecimal("0"); // BigDecimal | 
        try {
            TlsCertificatesAndHostnamesCustomHostnameResponseCollection result = apiInstance.listCustomHostnames(zoneId, hostname, id, page, perPage, order, direction, ssl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomHostnameForAZoneApi#listCustomHostnames");
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
| **hostname** | **String**|  | [optional] |
| **id** | **String**|  | [optional] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |
| **order** | **String**|  | [optional] [default to ssl] [enum: ssl, ssl_status] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |
| **ssl** | **BigDecimal**|  | [optional] [enum: 0, 1] |

### Return type

[**TlsCertificatesAndHostnamesCustomHostnameResponseCollection**](TlsCertificatesAndHostnamesCustomHostnameResponseCollection.md)


### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Custom Hostnames response |  -  |
| **4XX** | List Custom Hostnames response failure |  -  |

## listCustomHostnamesWithHttpInfo

> ApiResponse<TlsCertificatesAndHostnamesCustomHostnameResponseCollection> listCustomHostnames listCustomHostnamesWithHttpInfo(zoneId, hostname, id, page, perPage, order, direction, ssl)

List Custom Hostnames

List, search, sort, and filter all of your custom hostnames.

### Example

```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.ApiResponse;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.CustomHostnameForAZoneApi;

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

        CustomHostnameForAZoneApi apiInstance = new CustomHostnameForAZoneApi(defaultClient);
        String zoneId = "zoneId_example"; // String | 
        String hostname = "app.example.com"; // String | 
        String id = "0d89c70d-ad9f-4843-b99f-6cc0252067e9"; // String | 
        BigDecimal page = new BigDecimal("1"); // BigDecimal | 
        BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
        String order = "ssl"; // String | 
        String direction = "asc"; // String | 
        BigDecimal ssl = new BigDecimal("0"); // BigDecimal | 
        try {
            ApiResponse<TlsCertificatesAndHostnamesCustomHostnameResponseCollection> response = apiInstance.listCustomHostnamesWithHttpInfo(zoneId, hostname, id, page, perPage, order, direction, ssl);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomHostnameForAZoneApi#listCustomHostnames");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **zoneId** | **String**|  | |
| **hostname** | **String**|  | [optional] |
| **id** | **String**|  | [optional] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |
| **order** | **String**|  | [optional] [default to ssl] [enum: ssl, ssl_status] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |
| **ssl** | **BigDecimal**|  | [optional] [enum: 0, 1] |

### Return type

ApiResponse<[**TlsCertificatesAndHostnamesCustomHostnameResponseCollection**](TlsCertificatesAndHostnamesCustomHostnameResponseCollection.md)>


### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Custom Hostnames response |  -  |
| **4XX** | List Custom Hostnames response failure |  -  |

