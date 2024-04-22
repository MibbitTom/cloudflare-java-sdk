# TransformRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**transformRulesListTransformRules**](TransformRulesApi.md#transformRulesListTransformRules) | **GET** /zones/{zone_id}/rulesets/phases/{phase}/entrypoint | List Transform Rules |
| [**transformRulesUpdateTransformRules**](TransformRulesApi.md#transformRulesUpdateTransformRules) | **PUT** /zones/{zone_id}/rulesets/phases/{phase}/entrypoint | Update Transform Rules |


<a id="transformRulesListTransformRules"></a>
# **transformRulesListTransformRules**
> FirewallTransformRulesComponentsSchemasRuleset transformRulesListTransformRules(phase, zoneId)

List Transform Rules

Fetches all Transform Rules in a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransformRulesApi;

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

    TransformRulesApi apiInstance = new TransformRulesApi(defaultClient);
    FirewallPhase phase = FirewallPhase.fromValue("http_request_transform"); // FirewallPhase | 
    String zoneId = "zoneId_example"; // String | 
    try {
      FirewallTransformRulesComponentsSchemasRuleset result = apiInstance.transformRulesListTransformRules(phase, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformRulesApi#transformRulesListTransformRules");
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
| **phase** | [**FirewallPhase**](.md)|  | [enum: http_request_transform, http_request_late_transform, http_response_headers_transform] |
| **zoneId** | **String**|  | |

### Return type

[**FirewallTransformRulesComponentsSchemasRuleset**](FirewallTransformRulesComponentsSchemasRuleset.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Transform Rules response |  -  |
| **4XX** | List Transform Rules response failure |  -  |

<a id="transformRulesUpdateTransformRules"></a>
# **transformRulesUpdateTransformRules**
> FirewallApiResponseSingle transformRulesUpdateTransformRules(phase, zoneId, firewallUpdateRuleset)

Update Transform Rules

Updates the Transform Rules of a zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransformRulesApi;

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

    TransformRulesApi apiInstance = new TransformRulesApi(defaultClient);
    FirewallPhase phase = FirewallPhase.fromValue("http_request_transform"); // FirewallPhase | 
    String zoneId = "zoneId_example"; // String | 
    FirewallUpdateRuleset firewallUpdateRuleset = new FirewallUpdateRuleset(); // FirewallUpdateRuleset | 
    try {
      FirewallApiResponseSingle result = apiInstance.transformRulesUpdateTransformRules(phase, zoneId, firewallUpdateRuleset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransformRulesApi#transformRulesUpdateTransformRules");
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
| **phase** | [**FirewallPhase**](.md)|  | [enum: http_request_transform, http_request_late_transform, http_response_headers_transform] |
| **zoneId** | **String**|  | |
| **firewallUpdateRuleset** | [**FirewallUpdateRuleset**](FirewallUpdateRuleset.md)|  | |

### Return type

[**FirewallApiResponseSingle**](FirewallApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Transform Rules response |  -  |
| **4XX** | Update Transform Rules response failure |  -  |

