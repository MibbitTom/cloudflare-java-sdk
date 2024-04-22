# ZoneRulesetsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createZoneRuleset**](ZoneRulesetsApi.md#createZoneRuleset) | **POST** /zones/{zone_id}/rulesets | Create a zone ruleset |
| [**createZoneRulesetRule**](ZoneRulesetsApi.md#createZoneRulesetRule) | **POST** /zones/{zone_id}/rulesets/{ruleset_id}/rules | Create a zone ruleset rule |
| [**deleteZoneRuleset**](ZoneRulesetsApi.md#deleteZoneRuleset) | **DELETE** /zones/{zone_id}/rulesets/{ruleset_id} | Delete a zone ruleset |
| [**deleteZoneRulesetRule**](ZoneRulesetsApi.md#deleteZoneRulesetRule) | **DELETE** /zones/{zone_id}/rulesets/{ruleset_id}/rules/{rule_id} | Delete a zone ruleset rule |
| [**deleteZoneRulesetVersion**](ZoneRulesetsApi.md#deleteZoneRulesetVersion) | **DELETE** /zones/{zone_id}/rulesets/{ruleset_id}/versions/{ruleset_version} | Delete a zone ruleset version |
| [**getZoneEntrypointRuleset**](ZoneRulesetsApi.md#getZoneEntrypointRuleset) | **GET** /zones/{zone_id}/rulesets/phases/{ruleset_phase}/entrypoint | Get a zone entry point ruleset |
| [**getZoneEntrypointRulesetVersion**](ZoneRulesetsApi.md#getZoneEntrypointRulesetVersion) | **GET** /zones/{zone_id}/rulesets/phases/{ruleset_phase}/entrypoint/versions/{ruleset_version} | Get a zone entry point ruleset version |
| [**getZoneRuleset**](ZoneRulesetsApi.md#getZoneRuleset) | **GET** /zones/{zone_id}/rulesets/{ruleset_id} | Get a zone ruleset |
| [**getZoneRulesetVersion**](ZoneRulesetsApi.md#getZoneRulesetVersion) | **GET** /zones/{zone_id}/rulesets/{ruleset_id}/versions/{ruleset_version} | Get a zone ruleset version |
| [**listZoneEntrypointRulesetVersions**](ZoneRulesetsApi.md#listZoneEntrypointRulesetVersions) | **GET** /zones/{zone_id}/rulesets/phases/{ruleset_phase}/entrypoint/versions | List a zone entry point ruleset&#39;s versions |
| [**listZoneRulesetVersions**](ZoneRulesetsApi.md#listZoneRulesetVersions) | **GET** /zones/{zone_id}/rulesets/{ruleset_id}/versions | List a zone ruleset&#39;s versions |
| [**listZoneRulesets**](ZoneRulesetsApi.md#listZoneRulesets) | **GET** /zones/{zone_id}/rulesets | List zone rulesets |
| [**updateZoneEntrypointRuleset**](ZoneRulesetsApi.md#updateZoneEntrypointRuleset) | **PUT** /zones/{zone_id}/rulesets/phases/{ruleset_phase}/entrypoint | Update a zone entry point ruleset |
| [**updateZoneRuleset**](ZoneRulesetsApi.md#updateZoneRuleset) | **PUT** /zones/{zone_id}/rulesets/{ruleset_id} | Update a zone ruleset |
| [**updateZoneRulesetRule**](ZoneRulesetsApi.md#updateZoneRulesetRule) | **PATCH** /zones/{zone_id}/rulesets/{ruleset_id}/rules/{rule_id} | Update a zone ruleset rule |


<a id="createZoneRuleset"></a>
# **createZoneRuleset**
> CreateAccountRuleset200Response createZoneRuleset(zoneId, createAccountRulesetRequest)

Create a zone ruleset

Creates a ruleset at the zone level.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRulesetsApi;

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

    ZoneRulesetsApi apiInstance = new ZoneRulesetsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    CreateAccountRulesetRequest createAccountRulesetRequest = new CreateAccountRulesetRequest(); // CreateAccountRulesetRequest | 
    try {
      CreateAccountRuleset200Response result = apiInstance.createZoneRuleset(zoneId, createAccountRulesetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRulesetsApi#createZoneRuleset");
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
| **createAccountRulesetRequest** | [**CreateAccountRulesetRequest**](CreateAccountRulesetRequest.md)|  | |

### Return type

[**CreateAccountRuleset200Response**](CreateAccountRuleset200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A ruleset response. |  -  |
| **4XX** | A failure response. |  -  |

<a id="createZoneRulesetRule"></a>
# **createZoneRulesetRule**
> CreateAccountRuleset200Response createZoneRulesetRule(rulesetId, zoneId, createAccountRulesetRuleRequest)

Create a zone ruleset rule

Adds a new rule to a zone ruleset. The rule will be added to the end of the existing list of rules in the ruleset by default.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRulesetsApi;

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

    ZoneRulesetsApi apiInstance = new ZoneRulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    CreateAccountRulesetRuleRequest createAccountRulesetRuleRequest = new CreateAccountRulesetRuleRequest(); // CreateAccountRulesetRuleRequest | 
    try {
      CreateAccountRuleset200Response result = apiInstance.createZoneRulesetRule(rulesetId, zoneId, createAccountRulesetRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRulesetsApi#createZoneRulesetRule");
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
| **rulesetId** | **String**|  | |
| **zoneId** | **String**|  | |
| **createAccountRulesetRuleRequest** | [**CreateAccountRulesetRuleRequest**](CreateAccountRulesetRuleRequest.md)|  | |

### Return type

[**CreateAccountRuleset200Response**](CreateAccountRuleset200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A ruleset response. |  -  |
| **4XX** | A failure response. |  -  |

<a id="deleteZoneRuleset"></a>
# **deleteZoneRuleset**
> deleteZoneRuleset(rulesetId, zoneId)

Delete a zone ruleset

Deletes all versions of an existing zone ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRulesetsApi;

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

    ZoneRulesetsApi apiInstance = new ZoneRulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      apiInstance.deleteZoneRuleset(rulesetId, zoneId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRulesetsApi#deleteZoneRuleset");
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
| **rulesetId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | An empty response. |  -  |
| **4XX** | A failure response. |  -  |

<a id="deleteZoneRulesetRule"></a>
# **deleteZoneRulesetRule**
> CreateAccountRuleset200Response deleteZoneRulesetRule(ruleId, rulesetId, zoneId)

Delete a zone ruleset rule

Deletes an existing rule from a zone ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRulesetsApi;

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

    ZoneRulesetsApi apiInstance = new ZoneRulesetsApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    String rulesetId = "rulesetId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      CreateAccountRuleset200Response result = apiInstance.deleteZoneRulesetRule(ruleId, rulesetId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRulesetsApi#deleteZoneRulesetRule");
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
| **ruleId** | **String**|  | |
| **rulesetId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**CreateAccountRuleset200Response**](CreateAccountRuleset200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A ruleset response. |  -  |
| **4XX** | A failure response. |  -  |

<a id="deleteZoneRulesetVersion"></a>
# **deleteZoneRulesetVersion**
> deleteZoneRulesetVersion(rulesetVersion, rulesetId, zoneId)

Delete a zone ruleset version

Deletes an existing version of a zone ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRulesetsApi;

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

    ZoneRulesetsApi apiInstance = new ZoneRulesetsApi(defaultClient);
    String rulesetVersion = "rulesetVersion_example"; // String | 
    String rulesetId = "rulesetId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      apiInstance.deleteZoneRulesetVersion(rulesetVersion, rulesetId, zoneId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRulesetsApi#deleteZoneRulesetVersion");
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
| **rulesetVersion** | **String**|  | |
| **rulesetId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | An empty response. |  -  |
| **4XX** | A failure response. |  -  |

<a id="getZoneEntrypointRuleset"></a>
# **getZoneEntrypointRuleset**
> CreateAccountRuleset200Response getZoneEntrypointRuleset(rulesetPhase, zoneId)

Get a zone entry point ruleset

Fetches the latest version of the zone entry point ruleset for a given phase.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRulesetsApi;

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

    ZoneRulesetsApi apiInstance = new ZoneRulesetsApi(defaultClient);
    RulesetsRulesetPhase rulesetPhase = RulesetsRulesetPhase.fromValue("ddos_l4"); // RulesetsRulesetPhase | 
    String zoneId = "zoneId_example"; // String | 
    try {
      CreateAccountRuleset200Response result = apiInstance.getZoneEntrypointRuleset(rulesetPhase, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRulesetsApi#getZoneEntrypointRuleset");
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
| **rulesetPhase** | [**RulesetsRulesetPhase**](.md)|  | [enum: ddos_l4, ddos_l7, http_config_settings, http_custom_errors, http_log_custom_fields, http_ratelimit, http_request_cache_settings, http_request_dynamic_redirect, http_request_firewall_custom, http_request_firewall_managed, http_request_late_transform, http_request_origin, http_request_redirect, http_request_sanitize, http_request_sbfm, http_request_select_configuration, http_request_transform, http_response_compression, http_response_firewall_managed, http_response_headers_transform, magic_transit, magic_transit_ids_managed, magic_transit_managed] |
| **zoneId** | **String**|  | |

### Return type

[**CreateAccountRuleset200Response**](CreateAccountRuleset200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A ruleset response. |  -  |
| **4XX** | A failure response. |  -  |

<a id="getZoneEntrypointRulesetVersion"></a>
# **getZoneEntrypointRulesetVersion**
> CreateAccountRuleset200Response getZoneEntrypointRulesetVersion(rulesetVersion, rulesetPhase, zoneId)

Get a zone entry point ruleset version

Fetches a specific version of a zone entry point ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRulesetsApi;

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

    ZoneRulesetsApi apiInstance = new ZoneRulesetsApi(defaultClient);
    String rulesetVersion = "rulesetVersion_example"; // String | 
    RulesetsRulesetPhase rulesetPhase = RulesetsRulesetPhase.fromValue("ddos_l4"); // RulesetsRulesetPhase | 
    String zoneId = "zoneId_example"; // String | 
    try {
      CreateAccountRuleset200Response result = apiInstance.getZoneEntrypointRulesetVersion(rulesetVersion, rulesetPhase, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRulesetsApi#getZoneEntrypointRulesetVersion");
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
| **rulesetVersion** | **String**|  | |
| **rulesetPhase** | [**RulesetsRulesetPhase**](.md)|  | [enum: ddos_l4, ddos_l7, http_config_settings, http_custom_errors, http_log_custom_fields, http_ratelimit, http_request_cache_settings, http_request_dynamic_redirect, http_request_firewall_custom, http_request_firewall_managed, http_request_late_transform, http_request_origin, http_request_redirect, http_request_sanitize, http_request_sbfm, http_request_select_configuration, http_request_transform, http_response_compression, http_response_firewall_managed, http_response_headers_transform, magic_transit, magic_transit_ids_managed, magic_transit_managed] |
| **zoneId** | **String**|  | |

### Return type

[**CreateAccountRuleset200Response**](CreateAccountRuleset200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A ruleset response. |  -  |
| **4XX** | A failure response. |  -  |

<a id="getZoneRuleset"></a>
# **getZoneRuleset**
> CreateAccountRuleset200Response getZoneRuleset(rulesetId, zoneId)

Get a zone ruleset

Fetches the latest version of a zone ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRulesetsApi;

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

    ZoneRulesetsApi apiInstance = new ZoneRulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      CreateAccountRuleset200Response result = apiInstance.getZoneRuleset(rulesetId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRulesetsApi#getZoneRuleset");
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
| **rulesetId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**CreateAccountRuleset200Response**](CreateAccountRuleset200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A ruleset response. |  -  |
| **4XX** | A failure response. |  -  |

<a id="getZoneRulesetVersion"></a>
# **getZoneRulesetVersion**
> CreateAccountRuleset200Response getZoneRulesetVersion(rulesetVersion, rulesetId, zoneId)

Get a zone ruleset version

Fetches a specific version of a zone ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRulesetsApi;

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

    ZoneRulesetsApi apiInstance = new ZoneRulesetsApi(defaultClient);
    String rulesetVersion = "rulesetVersion_example"; // String | 
    String rulesetId = "rulesetId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      CreateAccountRuleset200Response result = apiInstance.getZoneRulesetVersion(rulesetVersion, rulesetId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRulesetsApi#getZoneRulesetVersion");
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
| **rulesetVersion** | **String**|  | |
| **rulesetId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**CreateAccountRuleset200Response**](CreateAccountRuleset200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A ruleset response. |  -  |
| **4XX** | A failure response. |  -  |

<a id="listZoneEntrypointRulesetVersions"></a>
# **listZoneEntrypointRulesetVersions**
> ListAccountRulesets200Response listZoneEntrypointRulesetVersions(rulesetPhase, zoneId)

List a zone entry point ruleset&#39;s versions

Fetches the versions of a zone entry point ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRulesetsApi;

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

    ZoneRulesetsApi apiInstance = new ZoneRulesetsApi(defaultClient);
    RulesetsRulesetPhase rulesetPhase = RulesetsRulesetPhase.fromValue("ddos_l4"); // RulesetsRulesetPhase | 
    String zoneId = "zoneId_example"; // String | 
    try {
      ListAccountRulesets200Response result = apiInstance.listZoneEntrypointRulesetVersions(rulesetPhase, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRulesetsApi#listZoneEntrypointRulesetVersions");
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
| **rulesetPhase** | [**RulesetsRulesetPhase**](.md)|  | [enum: ddos_l4, ddos_l7, http_config_settings, http_custom_errors, http_log_custom_fields, http_ratelimit, http_request_cache_settings, http_request_dynamic_redirect, http_request_firewall_custom, http_request_firewall_managed, http_request_late_transform, http_request_origin, http_request_redirect, http_request_sanitize, http_request_sbfm, http_request_select_configuration, http_request_transform, http_response_compression, http_response_firewall_managed, http_response_headers_transform, magic_transit, magic_transit_ids_managed, magic_transit_managed] |
| **zoneId** | **String**|  | |

### Return type

[**ListAccountRulesets200Response**](ListAccountRulesets200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A rulesets response. |  -  |
| **4XX** | A failure response. |  -  |

<a id="listZoneRulesetVersions"></a>
# **listZoneRulesetVersions**
> ListAccountRulesets200Response listZoneRulesetVersions(rulesetId, zoneId)

List a zone ruleset&#39;s versions

Fetches the versions of a zone ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRulesetsApi;

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

    ZoneRulesetsApi apiInstance = new ZoneRulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      ListAccountRulesets200Response result = apiInstance.listZoneRulesetVersions(rulesetId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRulesetsApi#listZoneRulesetVersions");
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
| **rulesetId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**ListAccountRulesets200Response**](ListAccountRulesets200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A rulesets response. |  -  |
| **4XX** | A failure response. |  -  |

<a id="listZoneRulesets"></a>
# **listZoneRulesets**
> ListAccountRulesets200Response listZoneRulesets(zoneId)

List zone rulesets

Fetches all rulesets at the zone level.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRulesetsApi;

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

    ZoneRulesetsApi apiInstance = new ZoneRulesetsApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      ListAccountRulesets200Response result = apiInstance.listZoneRulesets(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRulesetsApi#listZoneRulesets");
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

[**ListAccountRulesets200Response**](ListAccountRulesets200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A rulesets response. |  -  |
| **4XX** | A failure response. |  -  |

<a id="updateZoneEntrypointRuleset"></a>
# **updateZoneEntrypointRuleset**
> CreateAccountRuleset200Response updateZoneEntrypointRuleset(rulesetPhase, zoneId, updateAccountEntrypointRulesetRequest)

Update a zone entry point ruleset

Updates a zone entry point ruleset, creating a new version.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRulesetsApi;

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

    ZoneRulesetsApi apiInstance = new ZoneRulesetsApi(defaultClient);
    RulesetsRulesetPhase rulesetPhase = RulesetsRulesetPhase.fromValue("ddos_l4"); // RulesetsRulesetPhase | 
    String zoneId = "zoneId_example"; // String | 
    UpdateAccountEntrypointRulesetRequest updateAccountEntrypointRulesetRequest = new UpdateAccountEntrypointRulesetRequest(); // UpdateAccountEntrypointRulesetRequest | 
    try {
      CreateAccountRuleset200Response result = apiInstance.updateZoneEntrypointRuleset(rulesetPhase, zoneId, updateAccountEntrypointRulesetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRulesetsApi#updateZoneEntrypointRuleset");
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
| **rulesetPhase** | [**RulesetsRulesetPhase**](.md)|  | [enum: ddos_l4, ddos_l7, http_config_settings, http_custom_errors, http_log_custom_fields, http_ratelimit, http_request_cache_settings, http_request_dynamic_redirect, http_request_firewall_custom, http_request_firewall_managed, http_request_late_transform, http_request_origin, http_request_redirect, http_request_sanitize, http_request_sbfm, http_request_select_configuration, http_request_transform, http_response_compression, http_response_firewall_managed, http_response_headers_transform, magic_transit, magic_transit_ids_managed, magic_transit_managed] |
| **zoneId** | **String**|  | |
| **updateAccountEntrypointRulesetRequest** | [**UpdateAccountEntrypointRulesetRequest**](UpdateAccountEntrypointRulesetRequest.md)|  | |

### Return type

[**CreateAccountRuleset200Response**](CreateAccountRuleset200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A ruleset response. |  -  |
| **4XX** | A failure response. |  -  |

<a id="updateZoneRuleset"></a>
# **updateZoneRuleset**
> CreateAccountRuleset200Response updateZoneRuleset(rulesetId, zoneId, updateAccountEntrypointRulesetRequest)

Update a zone ruleset

Updates a zone ruleset, creating a new version.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRulesetsApi;

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

    ZoneRulesetsApi apiInstance = new ZoneRulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    UpdateAccountEntrypointRulesetRequest updateAccountEntrypointRulesetRequest = new UpdateAccountEntrypointRulesetRequest(); // UpdateAccountEntrypointRulesetRequest | 
    try {
      CreateAccountRuleset200Response result = apiInstance.updateZoneRuleset(rulesetId, zoneId, updateAccountEntrypointRulesetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRulesetsApi#updateZoneRuleset");
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
| **rulesetId** | **String**|  | |
| **zoneId** | **String**|  | |
| **updateAccountEntrypointRulesetRequest** | [**UpdateAccountEntrypointRulesetRequest**](UpdateAccountEntrypointRulesetRequest.md)|  | |

### Return type

[**CreateAccountRuleset200Response**](CreateAccountRuleset200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A ruleset response. |  -  |
| **4XX** | A failure response. |  -  |

<a id="updateZoneRulesetRule"></a>
# **updateZoneRulesetRule**
> CreateAccountRuleset200Response updateZoneRulesetRule(ruleId, rulesetId, zoneId, createAccountRulesetRuleRequest)

Update a zone ruleset rule

Updates an existing rule in a zone ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.ZoneRulesetsApi;

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

    ZoneRulesetsApi apiInstance = new ZoneRulesetsApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    String rulesetId = "rulesetId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    CreateAccountRulesetRuleRequest createAccountRulesetRuleRequest = new CreateAccountRulesetRuleRequest(); // CreateAccountRulesetRuleRequest | 
    try {
      CreateAccountRuleset200Response result = apiInstance.updateZoneRulesetRule(ruleId, rulesetId, zoneId, createAccountRulesetRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZoneRulesetsApi#updateZoneRulesetRule");
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
| **ruleId** | **String**|  | |
| **rulesetId** | **String**|  | |
| **zoneId** | **String**|  | |
| **createAccountRulesetRuleRequest** | [**CreateAccountRulesetRuleRequest**](CreateAccountRulesetRuleRequest.md)|  | |

### Return type

[**CreateAccountRuleset200Response**](CreateAccountRuleset200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A ruleset response. |  -  |
| **4XX** | A failure response. |  -  |

