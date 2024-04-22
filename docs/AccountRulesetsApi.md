# AccountRulesetsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAccountRuleset**](AccountRulesetsApi.md#createAccountRuleset) | **POST** /accounts/{account_id}/rulesets | Create an account ruleset |
| [**createAccountRulesetRule**](AccountRulesetsApi.md#createAccountRulesetRule) | **POST** /accounts/{account_id}/rulesets/{ruleset_id}/rules | Create an account ruleset rule |
| [**deleteAccountRuleset**](AccountRulesetsApi.md#deleteAccountRuleset) | **DELETE** /accounts/{account_id}/rulesets/{ruleset_id} | Delete an account ruleset |
| [**deleteAccountRulesetRule**](AccountRulesetsApi.md#deleteAccountRulesetRule) | **DELETE** /accounts/{account_id}/rulesets/{ruleset_id}/rules/{rule_id} | Delete an account ruleset rule |
| [**deleteAccountRulesetVersion**](AccountRulesetsApi.md#deleteAccountRulesetVersion) | **DELETE** /accounts/{account_id}/rulesets/{ruleset_id}/versions/{ruleset_version} | Delete an account ruleset version |
| [**getAccountEntrypointRuleset**](AccountRulesetsApi.md#getAccountEntrypointRuleset) | **GET** /accounts/{account_id}/rulesets/phases/{ruleset_phase}/entrypoint | Get an account entry point ruleset |
| [**getAccountEntrypointRulesetVersion**](AccountRulesetsApi.md#getAccountEntrypointRulesetVersion) | **GET** /accounts/{account_id}/rulesets/phases/{ruleset_phase}/entrypoint/versions/{ruleset_version} | Get an account entry point ruleset version |
| [**getAccountRuleset**](AccountRulesetsApi.md#getAccountRuleset) | **GET** /accounts/{account_id}/rulesets/{ruleset_id} | Get an account ruleset |
| [**getAccountRulesetVersion**](AccountRulesetsApi.md#getAccountRulesetVersion) | **GET** /accounts/{account_id}/rulesets/{ruleset_id}/versions/{ruleset_version} | Get an account ruleset version |
| [**listAccountEntrypointRulesetVersions**](AccountRulesetsApi.md#listAccountEntrypointRulesetVersions) | **GET** /accounts/{account_id}/rulesets/phases/{ruleset_phase}/entrypoint/versions | List an account entry point ruleset&#39;s versions |
| [**listAccountRulesetVersionRulesByTag**](AccountRulesetsApi.md#listAccountRulesetVersionRulesByTag) | **GET** /accounts/{account_id}/rulesets/{ruleset_id}/versions/{ruleset_version}/by_tag/{rule_tag} | List an account ruleset version&#39;s rules by tag |
| [**listAccountRulesetVersions**](AccountRulesetsApi.md#listAccountRulesetVersions) | **GET** /accounts/{account_id}/rulesets/{ruleset_id}/versions | List an account ruleset&#39;s versions |
| [**listAccountRulesets**](AccountRulesetsApi.md#listAccountRulesets) | **GET** /accounts/{account_id}/rulesets | List account rulesets |
| [**updateAccountEntrypointRuleset**](AccountRulesetsApi.md#updateAccountEntrypointRuleset) | **PUT** /accounts/{account_id}/rulesets/phases/{ruleset_phase}/entrypoint | Update an account entry point ruleset |
| [**updateAccountRuleset**](AccountRulesetsApi.md#updateAccountRuleset) | **PUT** /accounts/{account_id}/rulesets/{ruleset_id} | Update an account ruleset |
| [**updateAccountRulesetRule**](AccountRulesetsApi.md#updateAccountRulesetRule) | **PATCH** /accounts/{account_id}/rulesets/{ruleset_id}/rules/{rule_id} | Update an account ruleset rule |


<a id="createAccountRuleset"></a>
# **createAccountRuleset**
> CreateAccountRuleset200Response createAccountRuleset(accountId, createAccountRulesetRequest)

Create an account ruleset

Creates a ruleset at the account level.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRulesetsApi;

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

    AccountRulesetsApi apiInstance = new AccountRulesetsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    CreateAccountRulesetRequest createAccountRulesetRequest = new CreateAccountRulesetRequest(); // CreateAccountRulesetRequest | 
    try {
      CreateAccountRuleset200Response result = apiInstance.createAccountRuleset(accountId, createAccountRulesetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRulesetsApi#createAccountRuleset");
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

<a id="createAccountRulesetRule"></a>
# **createAccountRulesetRule**
> CreateAccountRuleset200Response createAccountRulesetRule(rulesetId, accountId, createAccountRulesetRuleRequest)

Create an account ruleset rule

Adds a new rule to an account ruleset. The rule will be added to the end of the existing list of rules in the ruleset by default.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRulesetsApi;

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

    AccountRulesetsApi apiInstance = new AccountRulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    CreateAccountRulesetRuleRequest createAccountRulesetRuleRequest = new CreateAccountRulesetRuleRequest(); // CreateAccountRulesetRuleRequest | 
    try {
      CreateAccountRuleset200Response result = apiInstance.createAccountRulesetRule(rulesetId, accountId, createAccountRulesetRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRulesetsApi#createAccountRulesetRule");
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
| **accountId** | **String**|  | |
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

<a id="deleteAccountRuleset"></a>
# **deleteAccountRuleset**
> deleteAccountRuleset(rulesetId, accountId)

Delete an account ruleset

Deletes all versions of an existing account ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRulesetsApi;

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

    AccountRulesetsApi apiInstance = new AccountRulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      apiInstance.deleteAccountRuleset(rulesetId, accountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRulesetsApi#deleteAccountRuleset");
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
| **accountId** | **String**|  | |

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

<a id="deleteAccountRulesetRule"></a>
# **deleteAccountRulesetRule**
> CreateAccountRuleset200Response deleteAccountRulesetRule(ruleId, rulesetId, accountId)

Delete an account ruleset rule

Deletes an existing rule from an account ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRulesetsApi;

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

    AccountRulesetsApi apiInstance = new AccountRulesetsApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    String rulesetId = "rulesetId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      CreateAccountRuleset200Response result = apiInstance.deleteAccountRulesetRule(ruleId, rulesetId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRulesetsApi#deleteAccountRulesetRule");
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
| **accountId** | **String**|  | |

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

<a id="deleteAccountRulesetVersion"></a>
# **deleteAccountRulesetVersion**
> deleteAccountRulesetVersion(rulesetVersion, rulesetId, accountId)

Delete an account ruleset version

Deletes an existing version of an account ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRulesetsApi;

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

    AccountRulesetsApi apiInstance = new AccountRulesetsApi(defaultClient);
    String rulesetVersion = "rulesetVersion_example"; // String | 
    String rulesetId = "rulesetId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      apiInstance.deleteAccountRulesetVersion(rulesetVersion, rulesetId, accountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRulesetsApi#deleteAccountRulesetVersion");
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
| **accountId** | **String**|  | |

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

<a id="getAccountEntrypointRuleset"></a>
# **getAccountEntrypointRuleset**
> CreateAccountRuleset200Response getAccountEntrypointRuleset(rulesetPhase, accountId)

Get an account entry point ruleset

Fetches the latest version of the account entry point ruleset for a given phase.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRulesetsApi;

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

    AccountRulesetsApi apiInstance = new AccountRulesetsApi(defaultClient);
    RulesetsRulesetPhase rulesetPhase = RulesetsRulesetPhase.fromValue("ddos_l4"); // RulesetsRulesetPhase | 
    String accountId = "accountId_example"; // String | 
    try {
      CreateAccountRuleset200Response result = apiInstance.getAccountEntrypointRuleset(rulesetPhase, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRulesetsApi#getAccountEntrypointRuleset");
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
| **accountId** | **String**|  | |

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

<a id="getAccountEntrypointRulesetVersion"></a>
# **getAccountEntrypointRulesetVersion**
> CreateAccountRuleset200Response getAccountEntrypointRulesetVersion(rulesetVersion, rulesetPhase, accountId)

Get an account entry point ruleset version

Fetches a specific version of an account entry point ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRulesetsApi;

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

    AccountRulesetsApi apiInstance = new AccountRulesetsApi(defaultClient);
    String rulesetVersion = "rulesetVersion_example"; // String | 
    RulesetsRulesetPhase rulesetPhase = RulesetsRulesetPhase.fromValue("ddos_l4"); // RulesetsRulesetPhase | 
    String accountId = "accountId_example"; // String | 
    try {
      CreateAccountRuleset200Response result = apiInstance.getAccountEntrypointRulesetVersion(rulesetVersion, rulesetPhase, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRulesetsApi#getAccountEntrypointRulesetVersion");
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
| **accountId** | **String**|  | |

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

<a id="getAccountRuleset"></a>
# **getAccountRuleset**
> CreateAccountRuleset200Response getAccountRuleset(rulesetId, accountId)

Get an account ruleset

Fetches the latest version of an account ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRulesetsApi;

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

    AccountRulesetsApi apiInstance = new AccountRulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      CreateAccountRuleset200Response result = apiInstance.getAccountRuleset(rulesetId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRulesetsApi#getAccountRuleset");
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
| **accountId** | **String**|  | |

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

<a id="getAccountRulesetVersion"></a>
# **getAccountRulesetVersion**
> CreateAccountRuleset200Response getAccountRulesetVersion(rulesetVersion, rulesetId, accountId)

Get an account ruleset version

Fetches a specific version of an account ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRulesetsApi;

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

    AccountRulesetsApi apiInstance = new AccountRulesetsApi(defaultClient);
    String rulesetVersion = "rulesetVersion_example"; // String | 
    String rulesetId = "rulesetId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      CreateAccountRuleset200Response result = apiInstance.getAccountRulesetVersion(rulesetVersion, rulesetId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRulesetsApi#getAccountRulesetVersion");
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
| **accountId** | **String**|  | |

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

<a id="listAccountEntrypointRulesetVersions"></a>
# **listAccountEntrypointRulesetVersions**
> ListAccountRulesets200Response listAccountEntrypointRulesetVersions(rulesetPhase, accountId)

List an account entry point ruleset&#39;s versions

Fetches the versions of an account entry point ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRulesetsApi;

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

    AccountRulesetsApi apiInstance = new AccountRulesetsApi(defaultClient);
    RulesetsRulesetPhase rulesetPhase = RulesetsRulesetPhase.fromValue("ddos_l4"); // RulesetsRulesetPhase | 
    String accountId = "accountId_example"; // String | 
    try {
      ListAccountRulesets200Response result = apiInstance.listAccountEntrypointRulesetVersions(rulesetPhase, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRulesetsApi#listAccountEntrypointRulesetVersions");
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
| **accountId** | **String**|  | |

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

<a id="listAccountRulesetVersionRulesByTag"></a>
# **listAccountRulesetVersionRulesByTag**
> CreateAccountRuleset200Response listAccountRulesetVersionRulesByTag(ruleTag, rulesetVersion, rulesetId, accountId)

List an account ruleset version&#39;s rules by tag

Fetches the rules of a managed account ruleset version for a given tag.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRulesetsApi;

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

    AccountRulesetsApi apiInstance = new AccountRulesetsApi(defaultClient);
    String ruleTag = "ruleTag_example"; // String | 
    String rulesetVersion = "rulesetVersion_example"; // String | 
    String rulesetId = "rulesetId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      CreateAccountRuleset200Response result = apiInstance.listAccountRulesetVersionRulesByTag(ruleTag, rulesetVersion, rulesetId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRulesetsApi#listAccountRulesetVersionRulesByTag");
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
| **ruleTag** | **String**|  | |
| **rulesetVersion** | **String**|  | |
| **rulesetId** | **String**|  | |
| **accountId** | **String**|  | |

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

<a id="listAccountRulesetVersions"></a>
# **listAccountRulesetVersions**
> ListAccountRulesets200Response listAccountRulesetVersions(rulesetId, accountId)

List an account ruleset&#39;s versions

Fetches the versions of an account ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRulesetsApi;

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

    AccountRulesetsApi apiInstance = new AccountRulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      ListAccountRulesets200Response result = apiInstance.listAccountRulesetVersions(rulesetId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRulesetsApi#listAccountRulesetVersions");
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
| **accountId** | **String**|  | |

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

<a id="listAccountRulesets"></a>
# **listAccountRulesets**
> ListAccountRulesets200Response listAccountRulesets(accountId)

List account rulesets

Fetches all rulesets at the account level.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRulesetsApi;

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

    AccountRulesetsApi apiInstance = new AccountRulesetsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      ListAccountRulesets200Response result = apiInstance.listAccountRulesets(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRulesetsApi#listAccountRulesets");
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

<a id="updateAccountEntrypointRuleset"></a>
# **updateAccountEntrypointRuleset**
> CreateAccountRuleset200Response updateAccountEntrypointRuleset(rulesetPhase, accountId, updateAccountEntrypointRulesetRequest)

Update an account entry point ruleset

Updates an account entry point ruleset, creating a new version.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRulesetsApi;

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

    AccountRulesetsApi apiInstance = new AccountRulesetsApi(defaultClient);
    RulesetsRulesetPhase rulesetPhase = RulesetsRulesetPhase.fromValue("ddos_l4"); // RulesetsRulesetPhase | 
    String accountId = "accountId_example"; // String | 
    UpdateAccountEntrypointRulesetRequest updateAccountEntrypointRulesetRequest = new UpdateAccountEntrypointRulesetRequest(); // UpdateAccountEntrypointRulesetRequest | 
    try {
      CreateAccountRuleset200Response result = apiInstance.updateAccountEntrypointRuleset(rulesetPhase, accountId, updateAccountEntrypointRulesetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRulesetsApi#updateAccountEntrypointRuleset");
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
| **accountId** | **String**|  | |
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

<a id="updateAccountRuleset"></a>
# **updateAccountRuleset**
> CreateAccountRuleset200Response updateAccountRuleset(rulesetId, accountId, updateAccountEntrypointRulesetRequest)

Update an account ruleset

Updates an account ruleset, creating a new version.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRulesetsApi;

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

    AccountRulesetsApi apiInstance = new AccountRulesetsApi(defaultClient);
    String rulesetId = "rulesetId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    UpdateAccountEntrypointRulesetRequest updateAccountEntrypointRulesetRequest = new UpdateAccountEntrypointRulesetRequest(); // UpdateAccountEntrypointRulesetRequest | 
    try {
      CreateAccountRuleset200Response result = apiInstance.updateAccountRuleset(rulesetId, accountId, updateAccountEntrypointRulesetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRulesetsApi#updateAccountRuleset");
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
| **accountId** | **String**|  | |
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

<a id="updateAccountRulesetRule"></a>
# **updateAccountRulesetRule**
> CreateAccountRuleset200Response updateAccountRulesetRule(ruleId, rulesetId, accountId, createAccountRulesetRuleRequest)

Update an account ruleset rule

Updates an existing rule in an account ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AccountRulesetsApi;

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

    AccountRulesetsApi apiInstance = new AccountRulesetsApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    String rulesetId = "rulesetId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    CreateAccountRulesetRuleRequest createAccountRulesetRuleRequest = new CreateAccountRulesetRuleRequest(); // CreateAccountRulesetRuleRequest | 
    try {
      CreateAccountRuleset200Response result = apiInstance.updateAccountRulesetRule(ruleId, rulesetId, accountId, createAccountRulesetRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRulesetsApi#updateAccountRulesetRule");
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
| **accountId** | **String**|  | |
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

