# IpAccessRulesForAUserApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ipAccessRulesForAUserCreateAnIpAccessRule**](IpAccessRulesForAUserApi.md#ipAccessRulesForAUserCreateAnIpAccessRule) | **POST** /user/firewall/access_rules/rules | Create an IP Access rule |
| [**ipAccessRulesForAUserDeleteAnIpAccessRule**](IpAccessRulesForAUserApi.md#ipAccessRulesForAUserDeleteAnIpAccessRule) | **DELETE** /user/firewall/access_rules/rules/{identifier} | Delete an IP Access rule |
| [**ipAccessRulesForAUserListIpAccessRules**](IpAccessRulesForAUserApi.md#ipAccessRulesForAUserListIpAccessRules) | **GET** /user/firewall/access_rules/rules | List IP Access rules |
| [**ipAccessRulesForAUserUpdateAnIpAccessRule**](IpAccessRulesForAUserApi.md#ipAccessRulesForAUserUpdateAnIpAccessRule) | **PATCH** /user/firewall/access_rules/rules/{identifier} | Update an IP Access rule |


<a id="ipAccessRulesForAUserCreateAnIpAccessRule"></a>
# **ipAccessRulesForAUserCreateAnIpAccessRule**
> FirewallRuleSingleResponse ipAccessRulesForAUserCreateAnIpAccessRule(ipAccessRulesForAnAccountCreateAnIpAccessRuleRequest)

Create an IP Access rule

Creates a new IP Access rule for all zones owned by the current user.  Note: To create an IP Access rule that applies to a specific zone, refer to the [IP Access rules for a zone](#ip-access-rules-for-a-zone) endpoints.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IpAccessRulesForAUserApi;

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

    IpAccessRulesForAUserApi apiInstance = new IpAccessRulesForAUserApi(defaultClient);
    IpAccessRulesForAnAccountCreateAnIpAccessRuleRequest ipAccessRulesForAnAccountCreateAnIpAccessRuleRequest = new IpAccessRulesForAnAccountCreateAnIpAccessRuleRequest(); // IpAccessRulesForAnAccountCreateAnIpAccessRuleRequest | 
    try {
      FirewallRuleSingleResponse result = apiInstance.ipAccessRulesForAUserCreateAnIpAccessRule(ipAccessRulesForAnAccountCreateAnIpAccessRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAccessRulesForAUserApi#ipAccessRulesForAUserCreateAnIpAccessRule");
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
| **ipAccessRulesForAnAccountCreateAnIpAccessRuleRequest** | [**IpAccessRulesForAnAccountCreateAnIpAccessRuleRequest**](IpAccessRulesForAnAccountCreateAnIpAccessRuleRequest.md)|  | |

### Return type

[**FirewallRuleSingleResponse**](FirewallRuleSingleResponse.md)

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

<a id="ipAccessRulesForAUserDeleteAnIpAccessRule"></a>
# **ipAccessRulesForAUserDeleteAnIpAccessRule**
> FirewallRuleSingleIdResponse ipAccessRulesForAUserDeleteAnIpAccessRule(identifier)

Delete an IP Access rule

Deletes an IP Access rule at the user level.  Note: Deleting a user-level rule will affect all zones owned by the user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IpAccessRulesForAUserApi;

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

    IpAccessRulesForAUserApi apiInstance = new IpAccessRulesForAUserApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      FirewallRuleSingleIdResponse result = apiInstance.ipAccessRulesForAUserDeleteAnIpAccessRule(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAccessRulesForAUserApi#ipAccessRulesForAUserDeleteAnIpAccessRule");
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
| **identifier** | **String**|  | |

### Return type

[**FirewallRuleSingleIdResponse**](FirewallRuleSingleIdResponse.md)

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

<a id="ipAccessRulesForAUserListIpAccessRules"></a>
# **ipAccessRulesForAUserListIpAccessRules**
> FirewallRuleCollectionResponse ipAccessRulesForAUserListIpAccessRules(filters, egsPaginationJson, page, perPage, order, direction)

List IP Access rules

Fetches IP Access rules of the user. You can filter the results using several optional parameters.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IpAccessRulesForAUserApi;

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

    IpAccessRulesForAUserApi apiInstance = new IpAccessRulesForAUserApi(defaultClient);
    FirewallFilters filters = new FirewallFilters(); // FirewallFilters | 
    FirewallEgsPagination egsPaginationJson = new FirewallEgsPagination(); // FirewallEgsPagination | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    String order = "configuration.target"; // String | 
    String direction = "asc"; // String | 
    try {
      FirewallRuleCollectionResponse result = apiInstance.ipAccessRulesForAUserListIpAccessRules(filters, egsPaginationJson, page, perPage, order, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAccessRulesForAUserApi#ipAccessRulesForAUserListIpAccessRules");
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
| **filters** | [**FirewallFilters**](.md)|  | [optional] |
| **egsPaginationJson** | [**FirewallEgsPagination**](.md)|  | [optional] |
| **page** | **BigDecimal**|  | [optional] |
| **perPage** | **BigDecimal**|  | [optional] |
| **order** | **String**|  | [optional] [enum: configuration.target, configuration.value, mode] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |

### Return type

[**FirewallRuleCollectionResponse**](FirewallRuleCollectionResponse.md)

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

<a id="ipAccessRulesForAUserUpdateAnIpAccessRule"></a>
# **ipAccessRulesForAUserUpdateAnIpAccessRule**
> FirewallRuleSingleResponse ipAccessRulesForAUserUpdateAnIpAccessRule(identifier, ipAccessRulesForAUserUpdateAnIpAccessRuleRequest)

Update an IP Access rule

Updates an IP Access rule defined at the user level. You can only update the rule action (&#x60;mode&#x60; parameter) and notes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IpAccessRulesForAUserApi;

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

    IpAccessRulesForAUserApi apiInstance = new IpAccessRulesForAUserApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    IpAccessRulesForAUserUpdateAnIpAccessRuleRequest ipAccessRulesForAUserUpdateAnIpAccessRuleRequest = new IpAccessRulesForAUserUpdateAnIpAccessRuleRequest(); // IpAccessRulesForAUserUpdateAnIpAccessRuleRequest | 
    try {
      FirewallRuleSingleResponse result = apiInstance.ipAccessRulesForAUserUpdateAnIpAccessRule(identifier, ipAccessRulesForAUserUpdateAnIpAccessRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAccessRulesForAUserApi#ipAccessRulesForAUserUpdateAnIpAccessRule");
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
| **identifier** | **String**|  | |
| **ipAccessRulesForAUserUpdateAnIpAccessRuleRequest** | [**IpAccessRulesForAUserUpdateAnIpAccessRuleRequest**](IpAccessRulesForAUserUpdateAnIpAccessRuleRequest.md)|  | |

### Return type

[**FirewallRuleSingleResponse**](FirewallRuleSingleResponse.md)

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

