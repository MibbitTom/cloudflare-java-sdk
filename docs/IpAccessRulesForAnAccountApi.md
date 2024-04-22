# IpAccessRulesForAnAccountApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ipAccessRulesForAnAccountCreateAnIpAccessRule**](IpAccessRulesForAnAccountApi.md#ipAccessRulesForAnAccountCreateAnIpAccessRule) | **POST** /accounts/{account_identifier}/firewall/access_rules/rules | Create an IP Access rule |
| [**ipAccessRulesForAnAccountDeleteAnIpAccessRule**](IpAccessRulesForAnAccountApi.md#ipAccessRulesForAnAccountDeleteAnIpAccessRule) | **DELETE** /accounts/{account_identifier}/firewall/access_rules/rules/{identifier} | Delete an IP Access rule |
| [**ipAccessRulesForAnAccountGetAnIpAccessRule**](IpAccessRulesForAnAccountApi.md#ipAccessRulesForAnAccountGetAnIpAccessRule) | **GET** /accounts/{account_identifier}/firewall/access_rules/rules/{identifier} | Get an IP Access rule |
| [**ipAccessRulesForAnAccountListIpAccessRules**](IpAccessRulesForAnAccountApi.md#ipAccessRulesForAnAccountListIpAccessRules) | **GET** /accounts/{account_identifier}/firewall/access_rules/rules | List IP Access rules |
| [**ipAccessRulesForAnAccountUpdateAnIpAccessRule**](IpAccessRulesForAnAccountApi.md#ipAccessRulesForAnAccountUpdateAnIpAccessRule) | **PATCH** /accounts/{account_identifier}/firewall/access_rules/rules/{identifier} | Update an IP Access rule |


<a id="ipAccessRulesForAnAccountCreateAnIpAccessRule"></a>
# **ipAccessRulesForAnAccountCreateAnIpAccessRule**
> FirewallResponseSingle ipAccessRulesForAnAccountCreateAnIpAccessRule(accountIdentifier, ipAccessRulesForAnAccountCreateAnIpAccessRuleRequest)

Create an IP Access rule

Creates a new IP Access rule for an account. The rule will apply to all zones in the account.  Note: To create an IP Access rule that applies to a single zone, refer to the [IP Access rules for a zone](#ip-access-rules-for-a-zone) endpoints.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAccessRulesForAnAccountApi;

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

    IpAccessRulesForAnAccountApi apiInstance = new IpAccessRulesForAnAccountApi(defaultClient);
    Object accountIdentifier = null; // Object | 
    IpAccessRulesForAnAccountCreateAnIpAccessRuleRequest ipAccessRulesForAnAccountCreateAnIpAccessRuleRequest = new IpAccessRulesForAnAccountCreateAnIpAccessRuleRequest(); // IpAccessRulesForAnAccountCreateAnIpAccessRuleRequest | 
    try {
      FirewallResponseSingle result = apiInstance.ipAccessRulesForAnAccountCreateAnIpAccessRule(accountIdentifier, ipAccessRulesForAnAccountCreateAnIpAccessRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAccessRulesForAnAccountApi#ipAccessRulesForAnAccountCreateAnIpAccessRule");
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
| **accountIdentifier** | [**Object**](.md)|  | |
| **ipAccessRulesForAnAccountCreateAnIpAccessRuleRequest** | [**IpAccessRulesForAnAccountCreateAnIpAccessRuleRequest**](IpAccessRulesForAnAccountCreateAnIpAccessRuleRequest.md)|  | |

### Return type

[**FirewallResponseSingle**](FirewallResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create an IP Access rule response |  -  |
| **4XX** | Create an IP Access rule response failure |  -  |

<a id="ipAccessRulesForAnAccountDeleteAnIpAccessRule"></a>
# **ipAccessRulesForAnAccountDeleteAnIpAccessRule**
> FirewallApiResponseSingleId ipAccessRulesForAnAccountDeleteAnIpAccessRule(identifier, accountIdentifier)

Delete an IP Access rule

Deletes an existing IP Access rule defined at the account level.  Note: This operation will affect all zones in the account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAccessRulesForAnAccountApi;

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

    IpAccessRulesForAnAccountApi apiInstance = new IpAccessRulesForAnAccountApi(defaultClient);
    Object identifier = null; // Object | 
    Object accountIdentifier = null; // Object | 
    try {
      FirewallApiResponseSingleId result = apiInstance.ipAccessRulesForAnAccountDeleteAnIpAccessRule(identifier, accountIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAccessRulesForAnAccountApi#ipAccessRulesForAnAccountDeleteAnIpAccessRule");
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
| **identifier** | [**Object**](.md)|  | |
| **accountIdentifier** | [**Object**](.md)|  | |

### Return type

[**FirewallApiResponseSingleId**](FirewallApiResponseSingleId.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete an IP Access rule response |  -  |
| **4XX** | Delete an IP Access rule response failure |  -  |

<a id="ipAccessRulesForAnAccountGetAnIpAccessRule"></a>
# **ipAccessRulesForAnAccountGetAnIpAccessRule**
> FirewallResponseSingle ipAccessRulesForAnAccountGetAnIpAccessRule(identifier, accountIdentifier)

Get an IP Access rule

Fetches the details of an IP Access rule defined at the account level.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAccessRulesForAnAccountApi;

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

    IpAccessRulesForAnAccountApi apiInstance = new IpAccessRulesForAnAccountApi(defaultClient);
    Object identifier = null; // Object | 
    Object accountIdentifier = null; // Object | 
    try {
      FirewallResponseSingle result = apiInstance.ipAccessRulesForAnAccountGetAnIpAccessRule(identifier, accountIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAccessRulesForAnAccountApi#ipAccessRulesForAnAccountGetAnIpAccessRule");
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
| **identifier** | [**Object**](.md)|  | |
| **accountIdentifier** | [**Object**](.md)|  | |

### Return type

[**FirewallResponseSingle**](FirewallResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get an IP Access rule response |  -  |
| **4XX** | Get an IP Access rule response failure |  -  |

<a id="ipAccessRulesForAnAccountListIpAccessRules"></a>
# **ipAccessRulesForAnAccountListIpAccessRules**
> FirewallResponseCollection ipAccessRulesForAnAccountListIpAccessRules(accountIdentifier, filters, egsPaginationJson, page, perPage, order, direction)

List IP Access rules

Fetches IP Access rules of an account. These rules apply to all the zones in the account. You can filter the results using several optional parameters.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAccessRulesForAnAccountApi;

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

    IpAccessRulesForAnAccountApi apiInstance = new IpAccessRulesForAnAccountApi(defaultClient);
    Object accountIdentifier = null; // Object | 
    FirewallFilters filters = new FirewallFilters(); // FirewallFilters | 
    FirewallEgsPagination egsPaginationJson = new FirewallEgsPagination(); // FirewallEgsPagination | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    String order = "configuration.target"; // String | 
    String direction = "asc"; // String | 
    try {
      FirewallResponseCollection result = apiInstance.ipAccessRulesForAnAccountListIpAccessRules(accountIdentifier, filters, egsPaginationJson, page, perPage, order, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAccessRulesForAnAccountApi#ipAccessRulesForAnAccountListIpAccessRules");
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
| **accountIdentifier** | [**Object**](.md)|  | |
| **filters** | [**FirewallFilters**](.md)|  | [optional] |
| **egsPaginationJson** | [**FirewallEgsPagination**](.md)|  | [optional] |
| **page** | **BigDecimal**|  | [optional] |
| **perPage** | **BigDecimal**|  | [optional] |
| **order** | **String**|  | [optional] [enum: configuration.target, configuration.value, mode] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |

### Return type

[**FirewallResponseCollection**](FirewallResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List IP Access rules response |  -  |
| **4XX** | List IP Access rules response failure |  -  |

<a id="ipAccessRulesForAnAccountUpdateAnIpAccessRule"></a>
# **ipAccessRulesForAnAccountUpdateAnIpAccessRule**
> FirewallResponseSingle ipAccessRulesForAnAccountUpdateAnIpAccessRule(identifier, accountIdentifier, firewallSchemasRule)

Update an IP Access rule

Updates an IP Access rule defined at the account level.  Note: This operation will affect all zones in the account.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAccessRulesForAnAccountApi;

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

    IpAccessRulesForAnAccountApi apiInstance = new IpAccessRulesForAnAccountApi(defaultClient);
    Object identifier = null; // Object | 
    Object accountIdentifier = null; // Object | 
    FirewallSchemasRule firewallSchemasRule = new FirewallSchemasRule(); // FirewallSchemasRule | 
    try {
      FirewallResponseSingle result = apiInstance.ipAccessRulesForAnAccountUpdateAnIpAccessRule(identifier, accountIdentifier, firewallSchemasRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAccessRulesForAnAccountApi#ipAccessRulesForAnAccountUpdateAnIpAccessRule");
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
| **identifier** | [**Object**](.md)|  | |
| **accountIdentifier** | [**Object**](.md)|  | |
| **firewallSchemasRule** | [**FirewallSchemasRule**](FirewallSchemasRule.md)|  | |

### Return type

[**FirewallResponseSingle**](FirewallResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update an IP Access rule response |  -  |
| **4XX** | Update an IP Access rule response failure |  -  |

