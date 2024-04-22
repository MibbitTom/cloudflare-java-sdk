# SecurityCenterInsightsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**archiveSecurityCenterInsight**](SecurityCenterInsightsApi.md#archiveSecurityCenterInsight) | **PUT** /accounts/{account_id}/intel/attack-surface-report/{issue_id}/dismiss | Archive Security Center Insight |
| [**getSecurityCenterIssueCountsByClass**](SecurityCenterInsightsApi.md#getSecurityCenterIssueCountsByClass) | **GET** /accounts/{account_id}/intel/attack-surface-report/issues/class | Get Security Center Issue Counts by Class |
| [**getSecurityCenterIssueCountsBySeverity**](SecurityCenterInsightsApi.md#getSecurityCenterIssueCountsBySeverity) | **GET** /accounts/{account_id}/intel/attack-surface-report/issues/severity | Get Security Center Issue Counts by Severity |
| [**getSecurityCenterIssueCountsByType**](SecurityCenterInsightsApi.md#getSecurityCenterIssueCountsByType) | **GET** /accounts/{account_id}/intel/attack-surface-report/issues/type | Get Security Center Issue Counts by Type |
| [**getSecurityCenterIssueTypes**](SecurityCenterInsightsApi.md#getSecurityCenterIssueTypes) | **GET** /accounts/{account_id}/intel/attack-surface-report/issue-types | Get Security Center Issues Types |
| [**getSecurityCenterIssues**](SecurityCenterInsightsApi.md#getSecurityCenterIssues) | **GET** /accounts/{account_id}/intel/attack-surface-report/issues | Get Security Center Issues |


<a id="archiveSecurityCenterInsight"></a>
# **archiveSecurityCenterInsight**
> SecurityCenterApiResponseSingle archiveSecurityCenterInsight(accountId, issueId, archiveSecurityCenterInsightRequest)

Archive Security Center Insight

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SecurityCenterInsightsApi;

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

    SecurityCenterInsightsApi apiInstance = new SecurityCenterInsightsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    String issueId = "issueId_example"; // String | 
    ArchiveSecurityCenterInsightRequest archiveSecurityCenterInsightRequest = new ArchiveSecurityCenterInsightRequest(); // ArchiveSecurityCenterInsightRequest | 
    try {
      SecurityCenterApiResponseSingle result = apiInstance.archiveSecurityCenterInsight(accountId, issueId, archiveSecurityCenterInsightRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityCenterInsightsApi#archiveSecurityCenterInsight");
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
| **issueId** | **String**|  | |
| **archiveSecurityCenterInsightRequest** | [**ArchiveSecurityCenterInsightRequest**](ArchiveSecurityCenterInsightRequest.md)|  | |

### Return type

[**SecurityCenterApiResponseSingle**](SecurityCenterApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **4XX** | Client Error |  -  |

<a id="getSecurityCenterIssueCountsByClass"></a>
# **getSecurityCenterIssueCountsByClass**
> SecurityCenterValueCountsResponse getSecurityCenterIssueCountsByClass(accountId, dismissed, issueClass, issueType, product, severity, subject, issueClassTildeNeq, issueTypeTildeNeq, productTildeNeq, severityTildeNeq, subjectTildeNeq)

Get Security Center Issue Counts by Class

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SecurityCenterInsightsApi;

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

    SecurityCenterInsightsApi apiInstance = new SecurityCenterInsightsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Boolean dismissed = true; // Boolean | 
    List<String> issueClass = Arrays.asList(); // List<String> | 
    List<SecurityCenterIssueType> issueType = Arrays.asList(); // List<SecurityCenterIssueType> | 
    List<String> product = Arrays.asList(); // List<String> | 
    List<String> severity = Arrays.asList(); // List<String> | 
    List<String> subject = Arrays.asList(); // List<String> | 
    List<String> issueClassTildeNeq = Arrays.asList(); // List<String> | 
    List<SecurityCenterIssueType> issueTypeTildeNeq = Arrays.asList(); // List<SecurityCenterIssueType> | 
    List<String> productTildeNeq = Arrays.asList(); // List<String> | 
    List<String> severityTildeNeq = Arrays.asList(); // List<String> | 
    List<String> subjectTildeNeq = Arrays.asList(); // List<String> | 
    try {
      SecurityCenterValueCountsResponse result = apiInstance.getSecurityCenterIssueCountsByClass(accountId, dismissed, issueClass, issueType, product, severity, subject, issueClassTildeNeq, issueTypeTildeNeq, productTildeNeq, severityTildeNeq, subjectTildeNeq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityCenterInsightsApi#getSecurityCenterIssueCountsByClass");
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
| **dismissed** | **Boolean**|  | [optional] |
| **issueClass** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **issueType** | [**List&lt;SecurityCenterIssueType&gt;**](SecurityCenterIssueType.md)|  | [optional] |
| **product** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **severity** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: low, moderate, critical] |
| **subject** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **issueClassTildeNeq** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **issueTypeTildeNeq** | [**List&lt;SecurityCenterIssueType&gt;**](SecurityCenterIssueType.md)|  | [optional] |
| **productTildeNeq** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **severityTildeNeq** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: low, moderate, critical] |
| **subjectTildeNeq** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**SecurityCenterValueCountsResponse**](SecurityCenterValueCountsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **4XX** | Client Error |  -  |

<a id="getSecurityCenterIssueCountsBySeverity"></a>
# **getSecurityCenterIssueCountsBySeverity**
> SecurityCenterValueCountsResponse getSecurityCenterIssueCountsBySeverity(accountId, dismissed, issueClass, issueType, product, severity, subject, issueClassTildeNeq, issueTypeTildeNeq, productTildeNeq, severityTildeNeq, subjectTildeNeq)

Get Security Center Issue Counts by Severity

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SecurityCenterInsightsApi;

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

    SecurityCenterInsightsApi apiInstance = new SecurityCenterInsightsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Boolean dismissed = true; // Boolean | 
    List<String> issueClass = Arrays.asList(); // List<String> | 
    List<SecurityCenterIssueType> issueType = Arrays.asList(); // List<SecurityCenterIssueType> | 
    List<String> product = Arrays.asList(); // List<String> | 
    List<String> severity = Arrays.asList(); // List<String> | 
    List<String> subject = Arrays.asList(); // List<String> | 
    List<String> issueClassTildeNeq = Arrays.asList(); // List<String> | 
    List<SecurityCenterIssueType> issueTypeTildeNeq = Arrays.asList(); // List<SecurityCenterIssueType> | 
    List<String> productTildeNeq = Arrays.asList(); // List<String> | 
    List<String> severityTildeNeq = Arrays.asList(); // List<String> | 
    List<String> subjectTildeNeq = Arrays.asList(); // List<String> | 
    try {
      SecurityCenterValueCountsResponse result = apiInstance.getSecurityCenterIssueCountsBySeverity(accountId, dismissed, issueClass, issueType, product, severity, subject, issueClassTildeNeq, issueTypeTildeNeq, productTildeNeq, severityTildeNeq, subjectTildeNeq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityCenterInsightsApi#getSecurityCenterIssueCountsBySeverity");
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
| **dismissed** | **Boolean**|  | [optional] |
| **issueClass** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **issueType** | [**List&lt;SecurityCenterIssueType&gt;**](SecurityCenterIssueType.md)|  | [optional] |
| **product** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **severity** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: low, moderate, critical] |
| **subject** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **issueClassTildeNeq** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **issueTypeTildeNeq** | [**List&lt;SecurityCenterIssueType&gt;**](SecurityCenterIssueType.md)|  | [optional] |
| **productTildeNeq** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **severityTildeNeq** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: low, moderate, critical] |
| **subjectTildeNeq** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**SecurityCenterValueCountsResponse**](SecurityCenterValueCountsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **4XX** | Client Error |  -  |

<a id="getSecurityCenterIssueCountsByType"></a>
# **getSecurityCenterIssueCountsByType**
> SecurityCenterValueCountsResponse getSecurityCenterIssueCountsByType(accountId, dismissed, issueClass, issueType, product, severity, subject, issueClassTildeNeq, issueTypeTildeNeq, productTildeNeq, severityTildeNeq, subjectTildeNeq)

Get Security Center Issue Counts by Type

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SecurityCenterInsightsApi;

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

    SecurityCenterInsightsApi apiInstance = new SecurityCenterInsightsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Boolean dismissed = true; // Boolean | 
    List<String> issueClass = Arrays.asList(); // List<String> | 
    List<SecurityCenterIssueType> issueType = Arrays.asList(); // List<SecurityCenterIssueType> | 
    List<String> product = Arrays.asList(); // List<String> | 
    List<String> severity = Arrays.asList(); // List<String> | 
    List<String> subject = Arrays.asList(); // List<String> | 
    List<String> issueClassTildeNeq = Arrays.asList(); // List<String> | 
    List<SecurityCenterIssueType> issueTypeTildeNeq = Arrays.asList(); // List<SecurityCenterIssueType> | 
    List<String> productTildeNeq = Arrays.asList(); // List<String> | 
    List<String> severityTildeNeq = Arrays.asList(); // List<String> | 
    List<String> subjectTildeNeq = Arrays.asList(); // List<String> | 
    try {
      SecurityCenterValueCountsResponse result = apiInstance.getSecurityCenterIssueCountsByType(accountId, dismissed, issueClass, issueType, product, severity, subject, issueClassTildeNeq, issueTypeTildeNeq, productTildeNeq, severityTildeNeq, subjectTildeNeq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityCenterInsightsApi#getSecurityCenterIssueCountsByType");
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
| **dismissed** | **Boolean**|  | [optional] |
| **issueClass** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **issueType** | [**List&lt;SecurityCenterIssueType&gt;**](SecurityCenterIssueType.md)|  | [optional] |
| **product** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **severity** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: low, moderate, critical] |
| **subject** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **issueClassTildeNeq** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **issueTypeTildeNeq** | [**List&lt;SecurityCenterIssueType&gt;**](SecurityCenterIssueType.md)|  | [optional] |
| **productTildeNeq** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **severityTildeNeq** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: low, moderate, critical] |
| **subjectTildeNeq** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**SecurityCenterValueCountsResponse**](SecurityCenterValueCountsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **4XX** | Client Error |  -  |

<a id="getSecurityCenterIssueTypes"></a>
# **getSecurityCenterIssueTypes**
> GetSecurityCenterIssueTypes200Response getSecurityCenterIssueTypes(accountId)

Get Security Center Issues Types

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SecurityCenterInsightsApi;

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

    SecurityCenterInsightsApi apiInstance = new SecurityCenterInsightsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      GetSecurityCenterIssueTypes200Response result = apiInstance.getSecurityCenterIssueTypes(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityCenterInsightsApi#getSecurityCenterIssueTypes");
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

[**GetSecurityCenterIssueTypes200Response**](GetSecurityCenterIssueTypes200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **4XX** | Client Error |  -  |

<a id="getSecurityCenterIssues"></a>
# **getSecurityCenterIssues**
> GetSecurityCenterIssues200Response getSecurityCenterIssues(accountId, dismissed, issueClass, issueType, product, severity, subject, issueClassTildeNeq, issueTypeTildeNeq, productTildeNeq, severityTildeNeq, subjectTildeNeq, page, perPage)

Get Security Center Issues

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.SecurityCenterInsightsApi;

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

    SecurityCenterInsightsApi apiInstance = new SecurityCenterInsightsApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    Boolean dismissed = true; // Boolean | 
    List<String> issueClass = Arrays.asList(); // List<String> | 
    List<SecurityCenterIssueType> issueType = Arrays.asList(); // List<SecurityCenterIssueType> | 
    List<String> product = Arrays.asList(); // List<String> | 
    List<String> severity = Arrays.asList(); // List<String> | 
    List<String> subject = Arrays.asList(); // List<String> | 
    List<String> issueClassTildeNeq = Arrays.asList(); // List<String> | 
    List<SecurityCenterIssueType> issueTypeTildeNeq = Arrays.asList(); // List<SecurityCenterIssueType> | 
    List<String> productTildeNeq = Arrays.asList(); // List<String> | 
    List<String> severityTildeNeq = Arrays.asList(); // List<String> | 
    List<String> subjectTildeNeq = Arrays.asList(); // List<String> | 
    Integer page = 1; // Integer | 
    Integer perPage = 25; // Integer | 
    try {
      GetSecurityCenterIssues200Response result = apiInstance.getSecurityCenterIssues(accountId, dismissed, issueClass, issueType, product, severity, subject, issueClassTildeNeq, issueTypeTildeNeq, productTildeNeq, severityTildeNeq, subjectTildeNeq, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityCenterInsightsApi#getSecurityCenterIssues");
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
| **dismissed** | **Boolean**|  | [optional] |
| **issueClass** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **issueType** | [**List&lt;SecurityCenterIssueType&gt;**](SecurityCenterIssueType.md)|  | [optional] |
| **product** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **severity** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: low, moderate, critical] |
| **subject** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **issueClassTildeNeq** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **issueTypeTildeNeq** | [**List&lt;SecurityCenterIssueType&gt;**](SecurityCenterIssueType.md)|  | [optional] |
| **productTildeNeq** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **severityTildeNeq** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: low, moderate, critical] |
| **subjectTildeNeq** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **page** | [**Integer**](.md)|  | [optional] [default to 1] |
| **perPage** | [**Integer**](.md)|  | [optional] [default to 25] |

### Return type

[**GetSecurityCenterIssues200Response**](GetSecurityCenterIssues200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **4XX** | Client Error |  -  |

