# EmailRoutingRoutingRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**emailRoutingRoutingRulesCreateRoutingRule**](EmailRoutingRoutingRulesApi.md#emailRoutingRoutingRulesCreateRoutingRule) | **POST** /zones/{zone_identifier}/email/routing/rules | Create routing rule |
| [**emailRoutingRoutingRulesDeleteRoutingRule**](EmailRoutingRoutingRulesApi.md#emailRoutingRoutingRulesDeleteRoutingRule) | **DELETE** /zones/{zone_identifier}/email/routing/rules/{rule_identifier} | Delete routing rule |
| [**emailRoutingRoutingRulesGetCatchAllRule**](EmailRoutingRoutingRulesApi.md#emailRoutingRoutingRulesGetCatchAllRule) | **GET** /zones/{zone_identifier}/email/routing/rules/catch_all | Get catch-all rule |
| [**emailRoutingRoutingRulesGetRoutingRule**](EmailRoutingRoutingRulesApi.md#emailRoutingRoutingRulesGetRoutingRule) | **GET** /zones/{zone_identifier}/email/routing/rules/{rule_identifier} | Get routing rule |
| [**emailRoutingRoutingRulesListRoutingRules**](EmailRoutingRoutingRulesApi.md#emailRoutingRoutingRulesListRoutingRules) | **GET** /zones/{zone_identifier}/email/routing/rules | List routing rules |
| [**emailRoutingRoutingRulesUpdateCatchAllRule**](EmailRoutingRoutingRulesApi.md#emailRoutingRoutingRulesUpdateCatchAllRule) | **PUT** /zones/{zone_identifier}/email/routing/rules/catch_all | Update catch-all rule |
| [**emailRoutingRoutingRulesUpdateRoutingRule**](EmailRoutingRoutingRulesApi.md#emailRoutingRoutingRulesUpdateRoutingRule) | **PUT** /zones/{zone_identifier}/email/routing/rules/{rule_identifier} | Update routing rule |


<a id="emailRoutingRoutingRulesCreateRoutingRule"></a>
# **emailRoutingRoutingRulesCreateRoutingRule**
> EmailRuleResponseSingle emailRoutingRoutingRulesCreateRoutingRule(zoneIdentifier, emailCreateRuleProperties)

Create routing rule

Rules consist of a set of criteria for matching emails (such as an email being sent to a specific custom email address) plus a set of actions to take on the email (like forwarding it to a specific destination address).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailRoutingRoutingRulesApi;

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

    EmailRoutingRoutingRulesApi apiInstance = new EmailRoutingRoutingRulesApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    EmailCreateRuleProperties emailCreateRuleProperties = new EmailCreateRuleProperties(); // EmailCreateRuleProperties | 
    try {
      EmailRuleResponseSingle result = apiInstance.emailRoutingRoutingRulesCreateRoutingRule(zoneIdentifier, emailCreateRuleProperties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailRoutingRoutingRulesApi#emailRoutingRoutingRulesCreateRoutingRule");
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
| **zoneIdentifier** | **String**|  | |
| **emailCreateRuleProperties** | [**EmailCreateRuleProperties**](EmailCreateRuleProperties.md)|  | |

### Return type

[**EmailRuleResponseSingle**](EmailRuleResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create routing rule response |  -  |

<a id="emailRoutingRoutingRulesDeleteRoutingRule"></a>
# **emailRoutingRoutingRulesDeleteRoutingRule**
> EmailRuleResponseSingle emailRoutingRoutingRulesDeleteRoutingRule(ruleIdentifier, zoneIdentifier)

Delete routing rule

Delete a specific routing rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailRoutingRoutingRulesApi;

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

    EmailRoutingRoutingRulesApi apiInstance = new EmailRoutingRoutingRulesApi(defaultClient);
    String ruleIdentifier = "ruleIdentifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      EmailRuleResponseSingle result = apiInstance.emailRoutingRoutingRulesDeleteRoutingRule(ruleIdentifier, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailRoutingRoutingRulesApi#emailRoutingRoutingRulesDeleteRoutingRule");
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
| **ruleIdentifier** | **String**|  | |
| **zoneIdentifier** | **String**|  | |

### Return type

[**EmailRuleResponseSingle**](EmailRuleResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete routing rule response |  -  |

<a id="emailRoutingRoutingRulesGetCatchAllRule"></a>
# **emailRoutingRoutingRulesGetCatchAllRule**
> EmailCatchAllRuleResponseSingle emailRoutingRoutingRulesGetCatchAllRule(zoneIdentifier)

Get catch-all rule

Get information on the default catch-all routing rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailRoutingRoutingRulesApi;

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

    EmailRoutingRoutingRulesApi apiInstance = new EmailRoutingRoutingRulesApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      EmailCatchAllRuleResponseSingle result = apiInstance.emailRoutingRoutingRulesGetCatchAllRule(zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailRoutingRoutingRulesApi#emailRoutingRoutingRulesGetCatchAllRule");
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
| **zoneIdentifier** | **String**|  | |

### Return type

[**EmailCatchAllRuleResponseSingle**](EmailCatchAllRuleResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get catch-all rule response |  -  |

<a id="emailRoutingRoutingRulesGetRoutingRule"></a>
# **emailRoutingRoutingRulesGetRoutingRule**
> EmailRuleResponseSingle emailRoutingRoutingRulesGetRoutingRule(ruleIdentifier, zoneIdentifier)

Get routing rule

Get information for a specific routing rule already created.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailRoutingRoutingRulesApi;

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

    EmailRoutingRoutingRulesApi apiInstance = new EmailRoutingRoutingRulesApi(defaultClient);
    String ruleIdentifier = "ruleIdentifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    try {
      EmailRuleResponseSingle result = apiInstance.emailRoutingRoutingRulesGetRoutingRule(ruleIdentifier, zoneIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailRoutingRoutingRulesApi#emailRoutingRoutingRulesGetRoutingRule");
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
| **ruleIdentifier** | **String**|  | |
| **zoneIdentifier** | **String**|  | |

### Return type

[**EmailRuleResponseSingle**](EmailRuleResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get routing rule response |  -  |

<a id="emailRoutingRoutingRulesListRoutingRules"></a>
# **emailRoutingRoutingRulesListRoutingRules**
> EmailRulesResponseCollection emailRoutingRoutingRulesListRoutingRules(zoneIdentifier, page, perPage, enabled)

List routing rules

Lists existing routing rules.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailRoutingRoutingRulesApi;

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

    EmailRoutingRoutingRulesApi apiInstance = new EmailRoutingRoutingRulesApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    Boolean enabled = true; // Boolean | 
    try {
      EmailRulesResponseCollection result = apiInstance.emailRoutingRoutingRulesListRoutingRules(zoneIdentifier, page, perPage, enabled);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailRoutingRoutingRulesApi#emailRoutingRoutingRulesListRoutingRules");
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
| **zoneIdentifier** | **String**|  | |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |
| **enabled** | **Boolean**|  | [optional] |

### Return type

[**EmailRulesResponseCollection**](EmailRulesResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List routing rules response |  -  |

<a id="emailRoutingRoutingRulesUpdateCatchAllRule"></a>
# **emailRoutingRoutingRulesUpdateCatchAllRule**
> EmailCatchAllRuleResponseSingle emailRoutingRoutingRulesUpdateCatchAllRule(zoneIdentifier, emailUpdateCatchAllRuleProperties)

Update catch-all rule

Enable or disable catch-all routing rule, or change action to forward to specific destination address.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailRoutingRoutingRulesApi;

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

    EmailRoutingRoutingRulesApi apiInstance = new EmailRoutingRoutingRulesApi(defaultClient);
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    EmailUpdateCatchAllRuleProperties emailUpdateCatchAllRuleProperties = new EmailUpdateCatchAllRuleProperties(); // EmailUpdateCatchAllRuleProperties | 
    try {
      EmailCatchAllRuleResponseSingle result = apiInstance.emailRoutingRoutingRulesUpdateCatchAllRule(zoneIdentifier, emailUpdateCatchAllRuleProperties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailRoutingRoutingRulesApi#emailRoutingRoutingRulesUpdateCatchAllRule");
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
| **zoneIdentifier** | **String**|  | |
| **emailUpdateCatchAllRuleProperties** | [**EmailUpdateCatchAllRuleProperties**](EmailUpdateCatchAllRuleProperties.md)|  | |

### Return type

[**EmailCatchAllRuleResponseSingle**](EmailCatchAllRuleResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update catch-all rule response |  -  |

<a id="emailRoutingRoutingRulesUpdateRoutingRule"></a>
# **emailRoutingRoutingRulesUpdateRoutingRule**
> EmailRuleResponseSingle emailRoutingRoutingRulesUpdateRoutingRule(ruleIdentifier, zoneIdentifier, emailUpdateRuleProperties)

Update routing rule

Update actions and matches, or enable/disable specific routing rules.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailRoutingRoutingRulesApi;

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

    EmailRoutingRoutingRulesApi apiInstance = new EmailRoutingRoutingRulesApi(defaultClient);
    String ruleIdentifier = "ruleIdentifier_example"; // String | 
    String zoneIdentifier = "zoneIdentifier_example"; // String | 
    EmailUpdateRuleProperties emailUpdateRuleProperties = new EmailUpdateRuleProperties(); // EmailUpdateRuleProperties | 
    try {
      EmailRuleResponseSingle result = apiInstance.emailRoutingRoutingRulesUpdateRoutingRule(ruleIdentifier, zoneIdentifier, emailUpdateRuleProperties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailRoutingRoutingRulesApi#emailRoutingRoutingRulesUpdateRoutingRule");
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
| **ruleIdentifier** | **String**|  | |
| **zoneIdentifier** | **String**|  | |
| **emailUpdateRuleProperties** | [**EmailUpdateRuleProperties**](EmailUpdateRuleProperties.md)|  | |

### Return type

[**EmailRuleResponseSingle**](EmailRuleResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update routing rule response |  -  |

