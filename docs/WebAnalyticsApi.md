# WebAnalyticsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**webAnalyticsCreateRule**](WebAnalyticsApi.md#webAnalyticsCreateRule) | **POST** /accounts/{account_id}/rum/v2/{ruleset_id}/rule | Create a Web Analytics rule |
| [**webAnalyticsCreateSite**](WebAnalyticsApi.md#webAnalyticsCreateSite) | **POST** /accounts/{account_id}/rum/site_info | Create a Web Analytics site |
| [**webAnalyticsDeleteRule**](WebAnalyticsApi.md#webAnalyticsDeleteRule) | **DELETE** /accounts/{account_id}/rum/v2/{ruleset_id}/rule/{rule_id} | Delete a Web Analytics rule |
| [**webAnalyticsDeleteSite**](WebAnalyticsApi.md#webAnalyticsDeleteSite) | **DELETE** /accounts/{account_id}/rum/site_info/{site_id} | Delete a Web Analytics site |
| [**webAnalyticsGetSite**](WebAnalyticsApi.md#webAnalyticsGetSite) | **GET** /accounts/{account_id}/rum/site_info/{site_id} | Get a Web Analytics site |
| [**webAnalyticsListRules**](WebAnalyticsApi.md#webAnalyticsListRules) | **GET** /accounts/{account_id}/rum/v2/{ruleset_id}/rules | List rules in Web Analytics ruleset |
| [**webAnalyticsListSites**](WebAnalyticsApi.md#webAnalyticsListSites) | **GET** /accounts/{account_id}/rum/site_info/list | List Web Analytics sites |
| [**webAnalyticsModifyRules**](WebAnalyticsApi.md#webAnalyticsModifyRules) | **POST** /accounts/{account_id}/rum/v2/{ruleset_id}/rules | Update Web Analytics rules |
| [**webAnalyticsUpdateRule**](WebAnalyticsApi.md#webAnalyticsUpdateRule) | **PUT** /accounts/{account_id}/rum/v2/{ruleset_id}/rule/{rule_id} | Update a Web Analytics rule |
| [**webAnalyticsUpdateSite**](WebAnalyticsApi.md#webAnalyticsUpdateSite) | **PUT** /accounts/{account_id}/rum/site_info/{site_id} | Update a Web Analytics site |


<a id="webAnalyticsCreateRule"></a>
# **webAnalyticsCreateRule**
> RumRuleResponseSingle webAnalyticsCreateRule(accountId, rulesetId, rumCreateRuleRequest)

Create a Web Analytics rule

Creates a new rule in a Web Analytics ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WebAnalyticsApi;

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

    WebAnalyticsApi apiInstance = new WebAnalyticsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String rulesetId = "rulesetId_example"; // String | 
    RumCreateRuleRequest rumCreateRuleRequest = new RumCreateRuleRequest(); // RumCreateRuleRequest | 
    try {
      RumRuleResponseSingle result = apiInstance.webAnalyticsCreateRule(accountId, rulesetId, rumCreateRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebAnalyticsApi#webAnalyticsCreateRule");
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
| **rulesetId** | **String**|  | |
| **rumCreateRuleRequest** | [**RumCreateRuleRequest**](RumCreateRuleRequest.md)|  | |

### Return type

[**RumRuleResponseSingle**](RumRuleResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created Web Analytics rule |  -  |
| **4XX** | Failure response |  -  |

<a id="webAnalyticsCreateSite"></a>
# **webAnalyticsCreateSite**
> RumSiteResponseSingle webAnalyticsCreateSite(accountId, rumCreateSiteRequest)

Create a Web Analytics site

Creates a new Web Analytics site.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WebAnalyticsApi;

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

    WebAnalyticsApi apiInstance = new WebAnalyticsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    RumCreateSiteRequest rumCreateSiteRequest = new RumCreateSiteRequest(); // RumCreateSiteRequest | 
    try {
      RumSiteResponseSingle result = apiInstance.webAnalyticsCreateSite(accountId, rumCreateSiteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebAnalyticsApi#webAnalyticsCreateSite");
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
| **rumCreateSiteRequest** | [**RumCreateSiteRequest**](RumCreateSiteRequest.md)|  | |

### Return type

[**RumSiteResponseSingle**](RumSiteResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created Web Analytics site |  -  |
| **4XX** | Failure response |  -  |

<a id="webAnalyticsDeleteRule"></a>
# **webAnalyticsDeleteRule**
> RumRuleIdResponseSingle webAnalyticsDeleteRule(accountId, rulesetId, ruleId)

Delete a Web Analytics rule

Deletes an existing rule from a Web Analytics ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WebAnalyticsApi;

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

    WebAnalyticsApi apiInstance = new WebAnalyticsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String rulesetId = "rulesetId_example"; // String | 
    String ruleId = "ruleId_example"; // String | 
    try {
      RumRuleIdResponseSingle result = apiInstance.webAnalyticsDeleteRule(accountId, rulesetId, ruleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebAnalyticsApi#webAnalyticsDeleteRule");
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
| **rulesetId** | **String**|  | |
| **ruleId** | **String**|  | |

### Return type

[**RumRuleIdResponseSingle**](RumRuleIdResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deleted Web Analytics rule identifier |  -  |
| **4XX** | Failure response |  -  |

<a id="webAnalyticsDeleteSite"></a>
# **webAnalyticsDeleteSite**
> RumSiteTagResponseSingle webAnalyticsDeleteSite(accountId, siteId)

Delete a Web Analytics site

Deletes an existing Web Analytics site.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WebAnalyticsApi;

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

    WebAnalyticsApi apiInstance = new WebAnalyticsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String siteId = "siteId_example"; // String | 
    try {
      RumSiteTagResponseSingle result = apiInstance.webAnalyticsDeleteSite(accountId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebAnalyticsApi#webAnalyticsDeleteSite");
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
| **siteId** | **String**|  | |

### Return type

[**RumSiteTagResponseSingle**](RumSiteTagResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deleted Web Analytics site identifier |  -  |
| **4XX** | Failure response |  -  |

<a id="webAnalyticsGetSite"></a>
# **webAnalyticsGetSite**
> RumSiteResponseSingle webAnalyticsGetSite(accountId, siteId)

Get a Web Analytics site

Retrieves a Web Analytics site.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WebAnalyticsApi;

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

    WebAnalyticsApi apiInstance = new WebAnalyticsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String siteId = "siteId_example"; // String | 
    try {
      RumSiteResponseSingle result = apiInstance.webAnalyticsGetSite(accountId, siteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebAnalyticsApi#webAnalyticsGetSite");
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
| **siteId** | **String**|  | |

### Return type

[**RumSiteResponseSingle**](RumSiteResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Web Analytics site |  -  |
| **4XX** | Failure response |  -  |

<a id="webAnalyticsListRules"></a>
# **webAnalyticsListRules**
> RumRulesResponseCollection webAnalyticsListRules(accountId, rulesetId)

List rules in Web Analytics ruleset

Lists all the rules in a Web Analytics ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WebAnalyticsApi;

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

    WebAnalyticsApi apiInstance = new WebAnalyticsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String rulesetId = "rulesetId_example"; // String | 
    try {
      RumRulesResponseCollection result = apiInstance.webAnalyticsListRules(accountId, rulesetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebAnalyticsApi#webAnalyticsListRules");
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
| **rulesetId** | **String**|  | |

### Return type

[**RumRulesResponseCollection**](RumRulesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Web Analytics rules in the ruleset |  -  |
| **4XX** | Failure response |  -  |

<a id="webAnalyticsListSites"></a>
# **webAnalyticsListSites**
> RumSitesResponseCollection webAnalyticsListSites(accountId, perPage, page, orderBy)

List Web Analytics sites

Lists all Web Analytics sites of an account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WebAnalyticsApi;

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

    WebAnalyticsApi apiInstance = new WebAnalyticsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    BigDecimal perPage = new BigDecimal(78); // BigDecimal | 
    BigDecimal page = new BigDecimal(78); // BigDecimal | 
    RumOrderBy orderBy = RumOrderBy.fromValue("host"); // RumOrderBy | 
    try {
      RumSitesResponseCollection result = apiInstance.webAnalyticsListSites(accountId, perPage, page, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebAnalyticsApi#webAnalyticsListSites");
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
| **perPage** | **BigDecimal**|  | [optional] |
| **page** | **BigDecimal**|  | [optional] |
| **orderBy** | [**RumOrderBy**](.md)|  | [optional] [enum: host, created] |

### Return type

[**RumSitesResponseCollection**](RumSitesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Web Analytics sites |  -  |
| **4XX** | Failure response |  -  |

<a id="webAnalyticsModifyRules"></a>
# **webAnalyticsModifyRules**
> RumRulesResponseCollection webAnalyticsModifyRules(accountId, rulesetId, rumModifyRulesRequest)

Update Web Analytics rules

Modifies one or more rules in a Web Analytics ruleset with a single request.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WebAnalyticsApi;

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

    WebAnalyticsApi apiInstance = new WebAnalyticsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String rulesetId = "rulesetId_example"; // String | 
    RumModifyRulesRequest rumModifyRulesRequest = new RumModifyRulesRequest(); // RumModifyRulesRequest | 
    try {
      RumRulesResponseCollection result = apiInstance.webAnalyticsModifyRules(accountId, rulesetId, rumModifyRulesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebAnalyticsApi#webAnalyticsModifyRules");
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
| **rulesetId** | **String**|  | |
| **rumModifyRulesRequest** | [**RumModifyRulesRequest**](RumModifyRulesRequest.md)|  | |

### Return type

[**RumRulesResponseCollection**](RumRulesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of modified Web Analytics rules |  -  |
| **4XX** | Failure response |  -  |

<a id="webAnalyticsUpdateRule"></a>
# **webAnalyticsUpdateRule**
> RumRuleResponseSingle webAnalyticsUpdateRule(accountId, rulesetId, ruleId, rumCreateRuleRequest)

Update a Web Analytics rule

Updates a rule in a Web Analytics ruleset.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WebAnalyticsApi;

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

    WebAnalyticsApi apiInstance = new WebAnalyticsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String rulesetId = "rulesetId_example"; // String | 
    String ruleId = "ruleId_example"; // String | 
    RumCreateRuleRequest rumCreateRuleRequest = new RumCreateRuleRequest(); // RumCreateRuleRequest | 
    try {
      RumRuleResponseSingle result = apiInstance.webAnalyticsUpdateRule(accountId, rulesetId, ruleId, rumCreateRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebAnalyticsApi#webAnalyticsUpdateRule");
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
| **rulesetId** | **String**|  | |
| **ruleId** | **String**|  | |
| **rumCreateRuleRequest** | [**RumCreateRuleRequest**](RumCreateRuleRequest.md)|  | |

### Return type

[**RumRuleResponseSingle**](RumRuleResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated Web Analytics rule |  -  |
| **4XX** | Failure response |  -  |

<a id="webAnalyticsUpdateSite"></a>
# **webAnalyticsUpdateSite**
> RumSiteResponseSingle webAnalyticsUpdateSite(accountId, siteId, rumCreateSiteRequest)

Update a Web Analytics site

Updates an existing Web Analytics site.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WebAnalyticsApi;

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

    WebAnalyticsApi apiInstance = new WebAnalyticsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String siteId = "siteId_example"; // String | 
    RumCreateSiteRequest rumCreateSiteRequest = new RumCreateSiteRequest(); // RumCreateSiteRequest | 
    try {
      RumSiteResponseSingle result = apiInstance.webAnalyticsUpdateSite(accountId, siteId, rumCreateSiteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebAnalyticsApi#webAnalyticsUpdateSite");
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
| **siteId** | **String**|  | |
| **rumCreateSiteRequest** | [**RumCreateSiteRequest**](RumCreateSiteRequest.md)|  | |

### Return type

[**RumSiteResponseSingle**](RumSiteResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated Web Analytics site |  -  |
| **4XX** | Failure response |  -  |

