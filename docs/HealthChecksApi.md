# HealthChecksApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**healthChecksCreateHealthCheck**](HealthChecksApi.md#healthChecksCreateHealthCheck) | **POST** /zones/{zone_id}/healthchecks | Create Health Check |
| [**healthChecksCreatePreviewHealthCheck**](HealthChecksApi.md#healthChecksCreatePreviewHealthCheck) | **POST** /zones/{zone_id}/healthchecks/preview | Create Preview Health Check |
| [**healthChecksDeleteHealthCheck**](HealthChecksApi.md#healthChecksDeleteHealthCheck) | **DELETE** /zones/{zone_id}/healthchecks/{healthcheck_id} | Delete Health Check |
| [**healthChecksDeletePreviewHealthCheck**](HealthChecksApi.md#healthChecksDeletePreviewHealthCheck) | **DELETE** /zones/{zone_id}/healthchecks/preview/{healthcheck_id} | Delete Preview Health Check |
| [**healthChecksHealthCheckDetails**](HealthChecksApi.md#healthChecksHealthCheckDetails) | **GET** /zones/{zone_id}/healthchecks/{healthcheck_id} | Health Check Details |
| [**healthChecksHealthCheckPreviewDetails**](HealthChecksApi.md#healthChecksHealthCheckPreviewDetails) | **GET** /zones/{zone_id}/healthchecks/preview/{healthcheck_id} | Health Check Preview Details |
| [**healthChecksListHealthChecks**](HealthChecksApi.md#healthChecksListHealthChecks) | **GET** /zones/{zone_id}/healthchecks | List Health Checks |
| [**healthChecksPatchHealthCheck**](HealthChecksApi.md#healthChecksPatchHealthCheck) | **PATCH** /zones/{zone_id}/healthchecks/{healthcheck_id} | Patch Health Check |
| [**healthChecksUpdateHealthCheck**](HealthChecksApi.md#healthChecksUpdateHealthCheck) | **PUT** /zones/{zone_id}/healthchecks/{healthcheck_id} | Update Health Check |


<a id="healthChecksCreateHealthCheck"></a>
# **healthChecksCreateHealthCheck**
> HealthchecksSingleResponse healthChecksCreateHealthCheck(zoneId, healthchecksQueryHealthcheck)

Create Health Check

Create a new health check.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HealthChecksApi;

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

    HealthChecksApi apiInstance = new HealthChecksApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    HealthchecksQueryHealthcheck healthchecksQueryHealthcheck = new HealthchecksQueryHealthcheck(); // HealthchecksQueryHealthcheck | 
    try {
      HealthchecksSingleResponse result = apiInstance.healthChecksCreateHealthCheck(zoneId, healthchecksQueryHealthcheck);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthChecksApi#healthChecksCreateHealthCheck");
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
| **healthchecksQueryHealthcheck** | [**HealthchecksQueryHealthcheck**](HealthchecksQueryHealthcheck.md)|  | |

### Return type

[**HealthchecksSingleResponse**](HealthchecksSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Health Check response |  -  |
| **4XX** | Create Health Check response failure |  -  |

<a id="healthChecksCreatePreviewHealthCheck"></a>
# **healthChecksCreatePreviewHealthCheck**
> HealthchecksSingleResponse healthChecksCreatePreviewHealthCheck(zoneId, healthchecksQueryHealthcheck)

Create Preview Health Check

Create a new preview health check.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HealthChecksApi;

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

    HealthChecksApi apiInstance = new HealthChecksApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    HealthchecksQueryHealthcheck healthchecksQueryHealthcheck = new HealthchecksQueryHealthcheck(); // HealthchecksQueryHealthcheck | 
    try {
      HealthchecksSingleResponse result = apiInstance.healthChecksCreatePreviewHealthCheck(zoneId, healthchecksQueryHealthcheck);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthChecksApi#healthChecksCreatePreviewHealthCheck");
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
| **healthchecksQueryHealthcheck** | [**HealthchecksQueryHealthcheck**](HealthchecksQueryHealthcheck.md)|  | |

### Return type

[**HealthchecksSingleResponse**](HealthchecksSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Preview Health Check response |  -  |
| **4XX** | Create Preview Health Check response failure |  -  |

<a id="healthChecksDeleteHealthCheck"></a>
# **healthChecksDeleteHealthCheck**
> HealthchecksIdResponse healthChecksDeleteHealthCheck(healthcheckId, zoneId)

Delete Health Check

Delete a health check.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HealthChecksApi;

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

    HealthChecksApi apiInstance = new HealthChecksApi(defaultClient);
    String healthcheckId = "healthcheckId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      HealthchecksIdResponse result = apiInstance.healthChecksDeleteHealthCheck(healthcheckId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthChecksApi#healthChecksDeleteHealthCheck");
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
| **healthcheckId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**HealthchecksIdResponse**](HealthchecksIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Health Check response |  -  |
| **4XX** | Delete Health Check response failure |  -  |

<a id="healthChecksDeletePreviewHealthCheck"></a>
# **healthChecksDeletePreviewHealthCheck**
> HealthchecksIdResponse healthChecksDeletePreviewHealthCheck(healthcheckId, zoneId)

Delete Preview Health Check

Delete a health check.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HealthChecksApi;

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

    HealthChecksApi apiInstance = new HealthChecksApi(defaultClient);
    String healthcheckId = "healthcheckId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      HealthchecksIdResponse result = apiInstance.healthChecksDeletePreviewHealthCheck(healthcheckId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthChecksApi#healthChecksDeletePreviewHealthCheck");
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
| **healthcheckId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**HealthchecksIdResponse**](HealthchecksIdResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Preview Health Check response |  -  |
| **4XX** | Delete Preview Health Check response failure |  -  |

<a id="healthChecksHealthCheckDetails"></a>
# **healthChecksHealthCheckDetails**
> HealthchecksSingleResponse healthChecksHealthCheckDetails(healthcheckId, zoneId)

Health Check Details

Fetch a single configured health check.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HealthChecksApi;

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

    HealthChecksApi apiInstance = new HealthChecksApi(defaultClient);
    String healthcheckId = "healthcheckId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      HealthchecksSingleResponse result = apiInstance.healthChecksHealthCheckDetails(healthcheckId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthChecksApi#healthChecksHealthCheckDetails");
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
| **healthcheckId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**HealthchecksSingleResponse**](HealthchecksSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Health Check Details response |  -  |
| **4XX** | Health Check Details response failure |  -  |

<a id="healthChecksHealthCheckPreviewDetails"></a>
# **healthChecksHealthCheckPreviewDetails**
> HealthchecksSingleResponse healthChecksHealthCheckPreviewDetails(healthcheckId, zoneId)

Health Check Preview Details

Fetch a single configured health check preview.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HealthChecksApi;

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

    HealthChecksApi apiInstance = new HealthChecksApi(defaultClient);
    String healthcheckId = "healthcheckId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      HealthchecksSingleResponse result = apiInstance.healthChecksHealthCheckPreviewDetails(healthcheckId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthChecksApi#healthChecksHealthCheckPreviewDetails");
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
| **healthcheckId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**HealthchecksSingleResponse**](HealthchecksSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Health Check Preview Details response |  -  |
| **4XX** | Health Check Preview Details response failure |  -  |

<a id="healthChecksListHealthChecks"></a>
# **healthChecksListHealthChecks**
> HealthchecksResponseCollection healthChecksListHealthChecks(zoneId, page, perPage)

List Health Checks

List configured health checks.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HealthChecksApi;

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

    HealthChecksApi apiInstance = new HealthChecksApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    Object page = 1; // Object | Page number of paginated results.
    Object perPage = 25; // Object | Maximum number of results per page. Must be a multiple of 5.
    try {
      HealthchecksResponseCollection result = apiInstance.healthChecksListHealthChecks(zoneId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthChecksApi#healthChecksListHealthChecks");
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
| **page** | [**Object**](.md)| Page number of paginated results. | [optional] [default to 1] |
| **perPage** | [**Object**](.md)| Maximum number of results per page. Must be a multiple of 5. | [optional] [default to 25] |

### Return type

[**HealthchecksResponseCollection**](HealthchecksResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Health Checks response |  -  |
| **4XX** | List Health Checks response failure |  -  |

<a id="healthChecksPatchHealthCheck"></a>
# **healthChecksPatchHealthCheck**
> HealthchecksSingleResponse healthChecksPatchHealthCheck(healthcheckId, zoneId, healthchecksQueryHealthcheck)

Patch Health Check

Patch a configured health check.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HealthChecksApi;

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

    HealthChecksApi apiInstance = new HealthChecksApi(defaultClient);
    String healthcheckId = "healthcheckId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    HealthchecksQueryHealthcheck healthchecksQueryHealthcheck = new HealthchecksQueryHealthcheck(); // HealthchecksQueryHealthcheck | 
    try {
      HealthchecksSingleResponse result = apiInstance.healthChecksPatchHealthCheck(healthcheckId, zoneId, healthchecksQueryHealthcheck);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthChecksApi#healthChecksPatchHealthCheck");
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
| **healthcheckId** | **String**|  | |
| **zoneId** | **String**|  | |
| **healthchecksQueryHealthcheck** | [**HealthchecksQueryHealthcheck**](HealthchecksQueryHealthcheck.md)|  | |

### Return type

[**HealthchecksSingleResponse**](HealthchecksSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch Health Check response |  -  |
| **4XX** | Patch Health Check response failure |  -  |

<a id="healthChecksUpdateHealthCheck"></a>
# **healthChecksUpdateHealthCheck**
> HealthchecksSingleResponse healthChecksUpdateHealthCheck(healthcheckId, zoneId, healthchecksQueryHealthcheck)

Update Health Check

Update a configured health check.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HealthChecksApi;

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

    HealthChecksApi apiInstance = new HealthChecksApi(defaultClient);
    String healthcheckId = "healthcheckId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    HealthchecksQueryHealthcheck healthchecksQueryHealthcheck = new HealthchecksQueryHealthcheck(); // HealthchecksQueryHealthcheck | 
    try {
      HealthchecksSingleResponse result = apiInstance.healthChecksUpdateHealthCheck(healthcheckId, zoneId, healthchecksQueryHealthcheck);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthChecksApi#healthChecksUpdateHealthCheck");
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
| **healthcheckId** | **String**|  | |
| **zoneId** | **String**|  | |
| **healthchecksQueryHealthcheck** | [**HealthchecksQueryHealthcheck**](HealthchecksQueryHealthcheck.md)|  | |

### Return type

[**HealthchecksSingleResponse**](HealthchecksSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Health Check response |  -  |
| **4XX** | Update Health Check response failure |  -  |

