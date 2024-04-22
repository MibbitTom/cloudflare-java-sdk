# ZoneHoldsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zones0HoldDelete**](ZoneHoldsApi.md#zones0HoldDelete) | **DELETE** /zones/{zone_id}/hold | Remove Zone Hold |
| [**zones0HoldGet**](ZoneHoldsApi.md#zones0HoldGet) | **GET** /zones/{zone_id}/hold | Get Zone Hold |
| [**zones0HoldPost**](ZoneHoldsApi.md#zones0HoldPost) | **POST** /zones/{zone_id}/hold | Create Zone Hold |


<a id="zones0HoldDelete"></a>
# **zones0HoldDelete**
> Zones0HoldDelete200Response zones0HoldDelete(zoneId, holdAfter)

Remove Zone Hold

Stop enforcement of a zone hold on the zone, permanently or temporarily, allowing the creation and activation of zones with this zone&#39;s hostname.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneHoldsApi;

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

    ZoneHoldsApi apiInstance = new ZoneHoldsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | Zone ID
    String holdAfter = "2023-01-31T15:56:36+00:00"; // String | If `hold_after` is provided, the hold will be temporarily disabled, then automatically re-enabled by the system at the time specified in this RFC3339-formatted timestamp. Otherwise, the hold will be disabled indefinitely.
    try {
      Zones0HoldDelete200Response result = apiInstance.zones0HoldDelete(zoneId, holdAfter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneHoldsApi#zones0HoldDelete");
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
| **zoneId** | **String**| Zone ID | |
| **holdAfter** | **String**| If &#x60;hold_after&#x60; is provided, the hold will be temporarily disabled, then automatically re-enabled by the system at the time specified in this RFC3339-formatted timestamp. Otherwise, the hold will be disabled indefinitely. | [optional] |

### Return type

[**Zones0HoldDelete200Response**](Zones0HoldDelete200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **4XX** | Client Error |  -  |

<a id="zones0HoldGet"></a>
# **zones0HoldGet**
> Zones0HoldGet200Response zones0HoldGet(zoneId)

Get Zone Hold

Retrieve whether the zone is subject to a zone hold, and metadata about the hold.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneHoldsApi;

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

    ZoneHoldsApi apiInstance = new ZoneHoldsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | Zone ID
    try {
      Zones0HoldGet200Response result = apiInstance.zones0HoldGet(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneHoldsApi#zones0HoldGet");
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
| **zoneId** | **String**| Zone ID | |

### Return type

[**Zones0HoldGet200Response**](Zones0HoldGet200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **4XX** | Client Error |  -  |

<a id="zones0HoldPost"></a>
# **zones0HoldPost**
> Zones0HoldPost200Response zones0HoldPost(zoneId, includeSubdomains)

Create Zone Hold

Enforce a zone hold on the zone, blocking the creation and activation of zones with this zone&#39;s hostname.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneHoldsApi;

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

    ZoneHoldsApi apiInstance = new ZoneHoldsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | Zone ID
    Boolean includeSubdomains = true; // Boolean | If provided, the zone hold will extend to block any subdomain of the given zone, as well as SSL4SaaS Custom Hostnames. For example, a zone hold on a zone with the hostname 'example.com' and include_subdomains=true will block 'example.com', 'staging.example.com', 'api.staging.example.com', etc.
    try {
      Zones0HoldPost200Response result = apiInstance.zones0HoldPost(zoneId, includeSubdomains);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneHoldsApi#zones0HoldPost");
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
| **zoneId** | **String**| Zone ID | |
| **includeSubdomains** | **Boolean**| If provided, the zone hold will extend to block any subdomain of the given zone, as well as SSL4SaaS Custom Hostnames. For example, a zone hold on a zone with the hostname &#39;example.com&#39; and include_subdomains&#x3D;true will block &#39;example.com&#39;, &#39;staging.example.com&#39;, &#39;api.staging.example.com&#39;, etc. | [optional] |

### Return type

[**Zones0HoldPost200Response**](Zones0HoldPost200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **4XX** | Client Error |  -  |

