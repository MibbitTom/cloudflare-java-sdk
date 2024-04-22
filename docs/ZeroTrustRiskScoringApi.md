# ZeroTrustRiskScoringApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dlpZtRiskScoreAccountSummary**](ZeroTrustRiskScoringApi.md#dlpZtRiskScoreAccountSummary) | **GET** /accounts/{account_identifier}/zt_risk_scoring/summary | Risky user summary |
| [**dlpZtRiskScoreGetBehaviors**](ZeroTrustRiskScoringApi.md#dlpZtRiskScoreGetBehaviors) | **GET** /accounts/{account_identifier}/zt_risk_scoring/behaviors | Get behaviors |
| [**dlpZtRiskScorePutBehaviors**](ZeroTrustRiskScoringApi.md#dlpZtRiskScorePutBehaviors) | **PUT** /accounts/{account_identifier}/zt_risk_scoring/behaviors | Update behaviors |
| [**dlpZtRiskScoreResetUser**](ZeroTrustRiskScoringApi.md#dlpZtRiskScoreResetUser) | **POST** /accounts/{account_identifier}/zt_risk_scoring/{user_id}/reset | Reset user risk score |
| [**dlpZtRiskScoreUserDetails**](ZeroTrustRiskScoringApi.md#dlpZtRiskScoreUserDetails) | **GET** /accounts/{account_identifier}/zt_risk_scoring/{user_id} | User risk details |


<a id="dlpZtRiskScoreAccountSummary"></a>
# **dlpZtRiskScoreAccountSummary**
> DlpAccountRiskSummaryResponse dlpZtRiskScoreAccountSummary(accountIdentifier, page, perPage, orderBy, direction)

Risky user summary

Get risk score info for all users in the account

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustRiskScoringApi;

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

    ZeroTrustRiskScoringApi apiInstance = new ZeroTrustRiskScoringApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    Integer page = 56; // Integer | 
    Integer perPage = 56; // Integer | 
    String orderBy = "timestamp"; // String | 
    String direction = "desc"; // String | 
    try {
      DlpAccountRiskSummaryResponse result = apiInstance.dlpZtRiskScoreAccountSummary(accountIdentifier, page, perPage, orderBy, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustRiskScoringApi#dlpZtRiskScoreAccountSummary");
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
| **accountIdentifier** | **String**|  | |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |
| **orderBy** | **String**|  | [optional] [enum: timestamp, event_count, max_risk_level] |
| **direction** | **String**|  | [optional] [enum: desc, asc] |

### Return type

[**DlpAccountRiskSummaryResponse**](DlpAccountRiskSummaryResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Risky user summary response |  -  |
| **4XX** | Risky user summary response failure |  -  |

<a id="dlpZtRiskScoreGetBehaviors"></a>
# **dlpZtRiskScoreGetBehaviors**
> DlpGetBehaviorsResponse dlpZtRiskScoreGetBehaviors(accountIdentifier)

Get behaviors

Get all behaviors and associated configuration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustRiskScoringApi;

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

    ZeroTrustRiskScoringApi apiInstance = new ZeroTrustRiskScoringApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    try {
      DlpGetBehaviorsResponse result = apiInstance.dlpZtRiskScoreGetBehaviors(accountIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustRiskScoringApi#dlpZtRiskScoreGetBehaviors");
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
| **accountIdentifier** | **String**|  | |

### Return type

[**DlpGetBehaviorsResponse**](DlpGetBehaviorsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get behaviors response |  -  |
| **4XX** | Get behaviors response failure |  -  |

<a id="dlpZtRiskScorePutBehaviors"></a>
# **dlpZtRiskScorePutBehaviors**
> DlpGetBehaviorsResponse dlpZtRiskScorePutBehaviors(accountIdentifier, dlpUpdateBehaviorsRequest)

Update behaviors

Update configuration for risk behaviors

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustRiskScoringApi;

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

    ZeroTrustRiskScoringApi apiInstance = new ZeroTrustRiskScoringApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    DlpUpdateBehaviorsRequest dlpUpdateBehaviorsRequest = new DlpUpdateBehaviorsRequest(); // DlpUpdateBehaviorsRequest | 
    try {
      DlpGetBehaviorsResponse result = apiInstance.dlpZtRiskScorePutBehaviors(accountIdentifier, dlpUpdateBehaviorsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustRiskScoringApi#dlpZtRiskScorePutBehaviors");
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
| **accountIdentifier** | **String**|  | |
| **dlpUpdateBehaviorsRequest** | [**DlpUpdateBehaviorsRequest**](DlpUpdateBehaviorsRequest.md)|  | |

### Return type

[**DlpGetBehaviorsResponse**](DlpGetBehaviorsResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Put behaviors response |  -  |
| **4XX** | Put behaviors response failure |  -  |

<a id="dlpZtRiskScoreResetUser"></a>
# **dlpZtRiskScoreResetUser**
> DlpResetUserResponse dlpZtRiskScoreResetUser(accountIdentifier, userId)

Reset user risk score

Clear the risk score for a particular user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustRiskScoringApi;

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

    ZeroTrustRiskScoringApi apiInstance = new ZeroTrustRiskScoringApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    DlpUserId userId = new DlpUserId(); // DlpUserId | 
    try {
      DlpResetUserResponse result = apiInstance.dlpZtRiskScoreResetUser(accountIdentifier, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustRiskScoringApi#dlpZtRiskScoreResetUser");
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
| **accountIdentifier** | **String**|  | |
| **userId** | [**DlpUserId**](.md)|  | |

### Return type

[**DlpResetUserResponse**](DlpResetUserResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reset user response |  -  |
| **4XX** | Reset user response failure |  -  |

<a id="dlpZtRiskScoreUserDetails"></a>
# **dlpZtRiskScoreUserDetails**
> DlpUserRiskSummaryResponse dlpZtRiskScoreUserDetails(accountIdentifier, userId, page, perPage, orderBy, direction)

User risk details

Get risk event/score information for a specific user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ZeroTrustRiskScoringApi;

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

    ZeroTrustRiskScoringApi apiInstance = new ZeroTrustRiskScoringApi(defaultClient);
    String accountIdentifier = "accountIdentifier_example"; // String | 
    DlpUserId userId = new DlpUserId(); // DlpUserId | 
    Integer page = 56; // Integer | 
    Integer perPage = 56; // Integer | 
    String orderBy = "timestamp"; // String | 
    String direction = "desc"; // String | 
    try {
      DlpUserRiskSummaryResponse result = apiInstance.dlpZtRiskScoreUserDetails(accountIdentifier, userId, page, perPage, orderBy, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ZeroTrustRiskScoringApi#dlpZtRiskScoreUserDetails");
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
| **accountIdentifier** | **String**|  | |
| **userId** | [**DlpUserId**](.md)|  | |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |
| **orderBy** | **String**|  | [optional] [enum: timestamp, risk_level] |
| **direction** | **String**|  | [optional] [enum: desc, asc] |

### Return type

[**DlpUserRiskSummaryResponse**](DlpUserRiskSummaryResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User risk details response |  -  |
| **4XX** | User risk details response failure |  -  |

