# IpAccessRulesForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ipAccessRulesForAZoneCreateAnIpAccessRule**](IpAccessRulesForAZoneApi.md#ipAccessRulesForAZoneCreateAnIpAccessRule) | **POST** /zones/{zone_id}/firewall/access_rules/rules | Create an IP Access rule |
| [**ipAccessRulesForAZoneDeleteAnIpAccessRule**](IpAccessRulesForAZoneApi.md#ipAccessRulesForAZoneDeleteAnIpAccessRule) | **DELETE** /zones/{zone_id}/firewall/access_rules/rules/{identifier} | Delete an IP Access rule |
| [**ipAccessRulesForAZoneListIpAccessRules**](IpAccessRulesForAZoneApi.md#ipAccessRulesForAZoneListIpAccessRules) | **GET** /zones/{zone_id}/firewall/access_rules/rules | List IP Access rules |
| [**ipAccessRulesForAZoneUpdateAnIpAccessRule**](IpAccessRulesForAZoneApi.md#ipAccessRulesForAZoneUpdateAnIpAccessRule) | **PATCH** /zones/{zone_id}/firewall/access_rules/rules/{identifier} | Update an IP Access rule |


<a id="ipAccessRulesForAZoneCreateAnIpAccessRule"></a>
# **ipAccessRulesForAZoneCreateAnIpAccessRule**
> FirewallRuleSingleResponse ipAccessRulesForAZoneCreateAnIpAccessRule(zoneId, ipAccessRulesForAZoneCreateAnIpAccessRuleRequest)

Create an IP Access rule

Creates a new IP Access rule for a zone.  Note: To create an IP Access rule that applies to multiple zones, refer to [IP Access rules for a user](#ip-access-rules-for-a-user) or [IP Access rules for an account](#ip-access-rules-for-an-account) as appropriate.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAccessRulesForAZoneApi;

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

    IpAccessRulesForAZoneApi apiInstance = new IpAccessRulesForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    IpAccessRulesForAZoneCreateAnIpAccessRuleRequest ipAccessRulesForAZoneCreateAnIpAccessRuleRequest = new IpAccessRulesForAZoneCreateAnIpAccessRuleRequest(); // IpAccessRulesForAZoneCreateAnIpAccessRuleRequest | 
    try {
      FirewallRuleSingleResponse result = apiInstance.ipAccessRulesForAZoneCreateAnIpAccessRule(zoneId, ipAccessRulesForAZoneCreateAnIpAccessRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAccessRulesForAZoneApi#ipAccessRulesForAZoneCreateAnIpAccessRule");
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
| **ipAccessRulesForAZoneCreateAnIpAccessRuleRequest** | [**IpAccessRulesForAZoneCreateAnIpAccessRuleRequest**](IpAccessRulesForAZoneCreateAnIpAccessRuleRequest.md)|  | |

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

<a id="ipAccessRulesForAZoneDeleteAnIpAccessRule"></a>
# **ipAccessRulesForAZoneDeleteAnIpAccessRule**
> FirewallRuleSingleIdResponse ipAccessRulesForAZoneDeleteAnIpAccessRule(identifier, zoneId, ipAccessRulesForAZoneDeleteAnIpAccessRuleRequest)

Delete an IP Access rule

Deletes an IP Access rule defined at the zone level.  Optionally, you can use the &#x60;cascade&#x60; property to specify that you wish to delete similar rules in other zones managed by the same zone owner.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAccessRulesForAZoneApi;

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

    IpAccessRulesForAZoneApi apiInstance = new IpAccessRulesForAZoneApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    IpAccessRulesForAZoneDeleteAnIpAccessRuleRequest ipAccessRulesForAZoneDeleteAnIpAccessRuleRequest = new IpAccessRulesForAZoneDeleteAnIpAccessRuleRequest(); // IpAccessRulesForAZoneDeleteAnIpAccessRuleRequest | 
    try {
      FirewallRuleSingleIdResponse result = apiInstance.ipAccessRulesForAZoneDeleteAnIpAccessRule(identifier, zoneId, ipAccessRulesForAZoneDeleteAnIpAccessRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAccessRulesForAZoneApi#ipAccessRulesForAZoneDeleteAnIpAccessRule");
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
| **zoneId** | **String**|  | |
| **ipAccessRulesForAZoneDeleteAnIpAccessRuleRequest** | [**IpAccessRulesForAZoneDeleteAnIpAccessRuleRequest**](IpAccessRulesForAZoneDeleteAnIpAccessRuleRequest.md)|  | |

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

<a id="ipAccessRulesForAZoneListIpAccessRules"></a>
# **ipAccessRulesForAZoneListIpAccessRules**
> FirewallRuleCollectionResponse ipAccessRulesForAZoneListIpAccessRules(zoneId, filters, egsPaginationJson, page, perPage, order, direction)

List IP Access rules

Fetches IP Access rules of a zone. You can filter the results using several optional parameters.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAccessRulesForAZoneApi;

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

    IpAccessRulesForAZoneApi apiInstance = new IpAccessRulesForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    FirewallFilters filters = new FirewallFilters(); // FirewallFilters | 
    FirewallEgsPagination egsPaginationJson = new FirewallEgsPagination(); // FirewallEgsPagination | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    String order = "configuration.target"; // String | 
    String direction = "asc"; // String | 
    try {
      FirewallRuleCollectionResponse result = apiInstance.ipAccessRulesForAZoneListIpAccessRules(zoneId, filters, egsPaginationJson, page, perPage, order, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAccessRulesForAZoneApi#ipAccessRulesForAZoneListIpAccessRules");
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

<a id="ipAccessRulesForAZoneUpdateAnIpAccessRule"></a>
# **ipAccessRulesForAZoneUpdateAnIpAccessRule**
> FirewallRuleSingleResponse ipAccessRulesForAZoneUpdateAnIpAccessRule(identifier, zoneId, ipAccessRulesForAUserUpdateAnIpAccessRuleRequest)

Update an IP Access rule

Updates an IP Access rule defined at the zone level. You can only update the rule action (&#x60;mode&#x60; parameter) and notes.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.IpAccessRulesForAZoneApi;

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

    IpAccessRulesForAZoneApi apiInstance = new IpAccessRulesForAZoneApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    IpAccessRulesForAUserUpdateAnIpAccessRuleRequest ipAccessRulesForAUserUpdateAnIpAccessRuleRequest = new IpAccessRulesForAUserUpdateAnIpAccessRuleRequest(); // IpAccessRulesForAUserUpdateAnIpAccessRuleRequest | 
    try {
      FirewallRuleSingleResponse result = apiInstance.ipAccessRulesForAZoneUpdateAnIpAccessRule(identifier, zoneId, ipAccessRulesForAUserUpdateAnIpAccessRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAccessRulesForAZoneApi#ipAccessRulesForAZoneUpdateAnIpAccessRule");
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
| **zoneId** | **String**|  | |
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

