# AuditLogsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**auditLogsGetAccountAuditLogs**](AuditLogsApi.md#auditLogsGetAccountAuditLogs) | **GET** /accounts/{account_id}/audit_logs | Get account audit logs |
| [**auditLogsGetOrganizationAuditLogs**](AuditLogsApi.md#auditLogsGetOrganizationAuditLogs) | **GET** /organizations/{organization_id}/audit_logs | Get organization audit logs |
| [**auditLogsGetUserAuditLogs**](AuditLogsApi.md#auditLogsGetUserAuditLogs) | **GET** /user/audit_logs | Get user audit logs |


<a id="auditLogsGetAccountAuditLogs"></a>
# **auditLogsGetAccountAuditLogs**
> AaaApiResponseCommon auditLogsGetAccountAuditLogs(accountId, id, export, actionType, actorIp, actorEmail, since, before, zoneName, direction, perPage, page, hideUserLogs)

Get account audit logs

Gets a list of audit logs for an account. Can be filtered by who made the change, on which zone, and the timeframe of the change.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AuditLogsApi;

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

    AuditLogsApi apiInstance = new AuditLogsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String id = "f174be97-19b1-40d6-954d-70cd5fbd52db"; // String | 
    Boolean export = true; // Boolean | 
    String actionType = "add"; // String | 
    String actorIp = "17.168.228.63"; // String | 
    String actorEmail = "alice@example.com"; // String | 
    OffsetDateTime since = OffsetDateTime.parse("2019-04-30T01:12:20Z"); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.parse("2019-04-30T01:12:20Z"); // OffsetDateTime | 
    String zoneName = "example.com"; // String | 
    String direction = "desc"; // String | 
    BigDecimal perPage = new BigDecimal("100"); // BigDecimal | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    Boolean hideUserLogs = false; // Boolean | 
    try {
      AaaApiResponseCommon result = apiInstance.auditLogsGetAccountAuditLogs(accountId, id, export, actionType, actorIp, actorEmail, since, before, zoneName, direction, perPage, page, hideUserLogs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditLogsApi#auditLogsGetAccountAuditLogs");
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
| **id** | **String**|  | [optional] |
| **export** | **Boolean**|  | [optional] |
| **actionType** | **String**|  | [optional] |
| **actorIp** | **String**|  | [optional] |
| **actorEmail** | **String**|  | [optional] |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **zoneName** | **String**|  | [optional] |
| **direction** | **String**|  | [optional] [default to desc] [enum: desc, asc] |
| **perPage** | **BigDecimal**|  | [optional] [default to 100] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **hideUserLogs** | **Boolean**|  | [optional] [default to false] |

### Return type

[**AaaApiResponseCommon**](AaaApiResponseCommon.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get account audit logs response |  -  |
| **4XX** | Get account audit logs response failure |  -  |

<a id="auditLogsGetOrganizationAuditLogs"></a>
# **auditLogsGetOrganizationAuditLogs**
> AaaApiResponseCommon auditLogsGetOrganizationAuditLogs(organizationId, id, export, actionType, actorIp, actorEmail, since, before, zoneName, direction, perPage, page, hideUserLogs)

Get organization audit logs

Gets a list of audit logs for an organization. Can be filtered by who made the change, on which zone, and the timeframe of the change.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AuditLogsApi;

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

    AuditLogsApi apiInstance = new AuditLogsApi(defaultClient);
    String organizationId = "organizationId_example"; // String | 
    String id = "f174be97-19b1-40d6-954d-70cd5fbd52db"; // String | 
    Boolean export = true; // Boolean | 
    String actionType = "add"; // String | 
    String actorIp = "17.168.228.63"; // String | 
    String actorEmail = "alice@example.com"; // String | 
    OffsetDateTime since = OffsetDateTime.parse("2019-04-30T01:12:20Z"); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.parse("2019-04-30T01:12:20Z"); // OffsetDateTime | 
    String zoneName = "example.com"; // String | 
    String direction = "desc"; // String | 
    BigDecimal perPage = new BigDecimal("100"); // BigDecimal | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    Boolean hideUserLogs = false; // Boolean | 
    try {
      AaaApiResponseCommon result = apiInstance.auditLogsGetOrganizationAuditLogs(organizationId, id, export, actionType, actorIp, actorEmail, since, before, zoneName, direction, perPage, page, hideUserLogs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditLogsApi#auditLogsGetOrganizationAuditLogs");
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
| **organizationId** | **String**|  | |
| **id** | **String**|  | [optional] |
| **export** | **Boolean**|  | [optional] |
| **actionType** | **String**|  | [optional] |
| **actorIp** | **String**|  | [optional] |
| **actorEmail** | **String**|  | [optional] |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **zoneName** | **String**|  | [optional] |
| **direction** | **String**|  | [optional] [default to desc] [enum: desc, asc] |
| **perPage** | **BigDecimal**|  | [optional] [default to 100] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **hideUserLogs** | **Boolean**|  | [optional] [default to false] |

### Return type

[**AaaApiResponseCommon**](AaaApiResponseCommon.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get organization audit logs response |  -  |
| **4XX** | Get organization audit logs response failure |  -  |

<a id="auditLogsGetUserAuditLogs"></a>
# **auditLogsGetUserAuditLogs**
> AaaApiResponseCommon auditLogsGetUserAuditLogs(id, export, actionType, actorIp, actorEmail, since, before, zoneName, direction, perPage, page, hideUserLogs)

Get user audit logs

Gets a list of audit logs for a user account. Can be filtered by who made the change, on which zone, and the timeframe of the change.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.AuditLogsApi;

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

    AuditLogsApi apiInstance = new AuditLogsApi(defaultClient);
    String id = "f174be97-19b1-40d6-954d-70cd5fbd52db"; // String | 
    Boolean export = true; // Boolean | 
    String actionType = "add"; // String | 
    String actorIp = "17.168.228.63"; // String | 
    String actorEmail = "alice@example.com"; // String | 
    OffsetDateTime since = OffsetDateTime.parse("2019-04-30T01:12:20Z"); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.parse("2019-04-30T01:12:20Z"); // OffsetDateTime | 
    String zoneName = "example.com"; // String | 
    String direction = "desc"; // String | 
    BigDecimal perPage = new BigDecimal("100"); // BigDecimal | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    Boolean hideUserLogs = false; // Boolean | 
    try {
      AaaApiResponseCommon result = apiInstance.auditLogsGetUserAuditLogs(id, export, actionType, actorIp, actorEmail, since, before, zoneName, direction, perPage, page, hideUserLogs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditLogsApi#auditLogsGetUserAuditLogs");
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
| **id** | **String**|  | [optional] |
| **export** | **Boolean**|  | [optional] |
| **actionType** | **String**|  | [optional] |
| **actorIp** | **String**|  | [optional] |
| **actorEmail** | **String**|  | [optional] |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **zoneName** | **String**|  | [optional] |
| **direction** | **String**|  | [optional] [default to desc] [enum: desc, asc] |
| **perPage** | **BigDecimal**|  | [optional] [default to 100] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **hideUserLogs** | **Boolean**|  | [optional] [default to false] |

### Return type

[**AaaApiResponseCommon**](AaaApiResponseCommon.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get user audit logs response |  -  |
| **4XX** | Get user audit logs response failure |  -  |

