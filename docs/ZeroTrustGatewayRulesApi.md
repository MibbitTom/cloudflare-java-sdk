# ZeroTrustGatewayRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**zeroTrustGatewayRulesCreateZeroTrustGatewayRule**](ZeroTrustGatewayRulesApi.md#zeroTrustGatewayRulesCreateZeroTrustGatewayRule) | **POST** /accounts/{account_id}/gateway/rules | Create a Zero Trust Gateway rule |
| [**zeroTrustGatewayRulesDeleteZeroTrustGatewayRule**](ZeroTrustGatewayRulesApi.md#zeroTrustGatewayRulesDeleteZeroTrustGatewayRule) | **DELETE** /accounts/{account_id}/gateway/rules/{rule_id} | Delete a Zero Trust Gateway rule |
| [**zeroTrustGatewayRulesListZeroTrustGatewayRules**](ZeroTrustGatewayRulesApi.md#zeroTrustGatewayRulesListZeroTrustGatewayRules) | **GET** /accounts/{account_id}/gateway/rules | List Zero Trust Gateway rules |
| [**zeroTrustGatewayRulesUpdateZeroTrustGatewayRule**](ZeroTrustGatewayRulesApi.md#zeroTrustGatewayRulesUpdateZeroTrustGatewayRule) | **PUT** /accounts/{account_id}/gateway/rules/{rule_id} | Update a Zero Trust Gateway rule |
| [**zeroTrustGatewayRulesZeroTrustGatewayRuleDetails**](ZeroTrustGatewayRulesApi.md#zeroTrustGatewayRulesZeroTrustGatewayRuleDetails) | **GET** /accounts/{account_id}/gateway/rules/{rule_id} | Get Zero Trust Gateway rule details |


<a id="zeroTrustGatewayRulesCreateZeroTrustGatewayRule"></a>
# **zeroTrustGatewayRulesCreateZeroTrustGatewayRule**
> ZeroTrustGatewayComponentsSchemasSingleResponse zeroTrustGatewayRulesCreateZeroTrustGatewayRule(accountId, zeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest)

Create a Zero Trust Gateway rule

Creates a new Zero Trust Gateway rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustGatewayRulesApi;

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

    ZeroTrustGatewayRulesApi apiInstance = new ZeroTrustGatewayRulesApi(defaultClient);
    Object accountId = null; // Object | 
    ZeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest zeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest = new ZeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest(); // ZeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest | 
    try {
      ZeroTrustGatewayComponentsSchemasSingleResponse result = apiInstance.zeroTrustGatewayRulesCreateZeroTrustGatewayRule(accountId, zeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustGatewayRulesApi#zeroTrustGatewayRulesCreateZeroTrustGatewayRule");
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
| **accountId** | [**Object**](.md)|  | |
| **zeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest** | [**ZeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest**](ZeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest.md)|  | |

### Return type

[**ZeroTrustGatewayComponentsSchemasSingleResponse**](ZeroTrustGatewayComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a Zero Trust Gateway rule response |  -  |
| **4XX** | Create a Zero Trust Gateway rule response failure |  -  |

<a id="zeroTrustGatewayRulesDeleteZeroTrustGatewayRule"></a>
# **zeroTrustGatewayRulesDeleteZeroTrustGatewayRule**
> ZeroTrustGatewayEmptyResponse zeroTrustGatewayRulesDeleteZeroTrustGatewayRule(ruleId, accountId)

Delete a Zero Trust Gateway rule

Deletes a Zero Trust Gateway rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustGatewayRulesApi;

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

    ZeroTrustGatewayRulesApi apiInstance = new ZeroTrustGatewayRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewayEmptyResponse result = apiInstance.zeroTrustGatewayRulesDeleteZeroTrustGatewayRule(ruleId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustGatewayRulesApi#zeroTrustGatewayRulesDeleteZeroTrustGatewayRule");
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
| **accountId** | [**Object**](.md)|  | |

### Return type

[**ZeroTrustGatewayEmptyResponse**](ZeroTrustGatewayEmptyResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a Zero Trust Gateway rule response |  -  |
| **4XX** | Delete a Zero Trust Gateway rule response failure |  -  |

<a id="zeroTrustGatewayRulesListZeroTrustGatewayRules"></a>
# **zeroTrustGatewayRulesListZeroTrustGatewayRules**
> ZeroTrustGatewayComponentsSchemasResponseCollection zeroTrustGatewayRulesListZeroTrustGatewayRules(accountId)

List Zero Trust Gateway rules

Fetches the Zero Trust Gateway rules for an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustGatewayRulesApi;

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

    ZeroTrustGatewayRulesApi apiInstance = new ZeroTrustGatewayRulesApi(defaultClient);
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewayComponentsSchemasResponseCollection result = apiInstance.zeroTrustGatewayRulesListZeroTrustGatewayRules(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustGatewayRulesApi#zeroTrustGatewayRulesListZeroTrustGatewayRules");
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
| **accountId** | [**Object**](.md)|  | |

### Return type

[**ZeroTrustGatewayComponentsSchemasResponseCollection**](ZeroTrustGatewayComponentsSchemasResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Zero Trust Gateway rules response |  -  |
| **4XX** | List Zero Trust Gateway rules response failure |  -  |

<a id="zeroTrustGatewayRulesUpdateZeroTrustGatewayRule"></a>
# **zeroTrustGatewayRulesUpdateZeroTrustGatewayRule**
> ZeroTrustGatewayComponentsSchemasSingleResponse zeroTrustGatewayRulesUpdateZeroTrustGatewayRule(ruleId, accountId, zeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest)

Update a Zero Trust Gateway rule

Updates a configured Zero Trust Gateway rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustGatewayRulesApi;

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

    ZeroTrustGatewayRulesApi apiInstance = new ZeroTrustGatewayRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    Object accountId = null; // Object | 
    ZeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest zeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest = new ZeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest(); // ZeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest | 
    try {
      ZeroTrustGatewayComponentsSchemasSingleResponse result = apiInstance.zeroTrustGatewayRulesUpdateZeroTrustGatewayRule(ruleId, accountId, zeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustGatewayRulesApi#zeroTrustGatewayRulesUpdateZeroTrustGatewayRule");
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
| **accountId** | [**Object**](.md)|  | |
| **zeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest** | [**ZeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest**](ZeroTrustGatewayRulesCreateZeroTrustGatewayRuleRequest.md)|  | |

### Return type

[**ZeroTrustGatewayComponentsSchemasSingleResponse**](ZeroTrustGatewayComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a Zero Trust Gateway rule response |  -  |
| **4XX** | Update a Zero Trust Gateway rule response failure |  -  |

<a id="zeroTrustGatewayRulesZeroTrustGatewayRuleDetails"></a>
# **zeroTrustGatewayRulesZeroTrustGatewayRuleDetails**
> ZeroTrustGatewayComponentsSchemasSingleResponse zeroTrustGatewayRulesZeroTrustGatewayRuleDetails(ruleId, accountId)

Get Zero Trust Gateway rule details

Fetches a single Zero Trust Gateway rule.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustGatewayRulesApi;

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

    ZeroTrustGatewayRulesApi apiInstance = new ZeroTrustGatewayRulesApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    Object accountId = null; // Object | 
    try {
      ZeroTrustGatewayComponentsSchemasSingleResponse result = apiInstance.zeroTrustGatewayRulesZeroTrustGatewayRuleDetails(ruleId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustGatewayRulesApi#zeroTrustGatewayRulesZeroTrustGatewayRuleDetails");
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
| **accountId** | [**Object**](.md)|  | |

### Return type

[**ZeroTrustGatewayComponentsSchemasSingleResponse**](ZeroTrustGatewayComponentsSchemasSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Zero Trust Gateway rule details response |  -  |
| **4XX** | Get Zero Trust Gateway rule details response failure |  -  |

