# UserApiTokensApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userApiTokensCreateToken**](UserApiTokensApi.md#userApiTokensCreateToken) | **POST** /user/tokens | Create Token |
| [**userApiTokensDeleteToken**](UserApiTokensApi.md#userApiTokensDeleteToken) | **DELETE** /user/tokens/{token_id} | Delete Token |
| [**userApiTokensListTokens**](UserApiTokensApi.md#userApiTokensListTokens) | **GET** /user/tokens | List Tokens |
| [**userApiTokensRollToken**](UserApiTokensApi.md#userApiTokensRollToken) | **PUT** /user/tokens/{token_id}/value | Roll Token |
| [**userApiTokensTokenDetails**](UserApiTokensApi.md#userApiTokensTokenDetails) | **GET** /user/tokens/{token_id} | Token Details |
| [**userApiTokensUpdateToken**](UserApiTokensApi.md#userApiTokensUpdateToken) | **PUT** /user/tokens/{token_id} | Update Token |
| [**userApiTokensVerifyToken**](UserApiTokensApi.md#userApiTokensVerifyToken) | **GET** /user/tokens/verify | Verify Token |


<a id="userApiTokensCreateToken"></a>
# **userApiTokensCreateToken**
> IamResponseCreate userApiTokensCreateToken(iamCreatePayload)

Create Token

Create a new access token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApiTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    UserApiTokensApi apiInstance = new UserApiTokensApi(defaultClient);
    IamCreatePayload iamCreatePayload = new IamCreatePayload(); // IamCreatePayload | 
    try {
      IamResponseCreate result = apiInstance.userApiTokensCreateToken(iamCreatePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApiTokensApi#userApiTokensCreateToken");
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
| **iamCreatePayload** | [**IamCreatePayload**](IamCreatePayload.md)|  | |

### Return type

[**IamResponseCreate**](IamResponseCreate.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Token response |  -  |
| **4XX** | Create Token response failure |  -  |

<a id="userApiTokensDeleteToken"></a>
# **userApiTokensDeleteToken**
> IamApiResponseSingleId userApiTokensDeleteToken(tokenId)

Delete Token

Destroy a token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApiTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    UserApiTokensApi apiInstance = new UserApiTokensApi(defaultClient);
    Object tokenId = null; // Object | 
    try {
      IamApiResponseSingleId result = apiInstance.userApiTokensDeleteToken(tokenId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApiTokensApi#userApiTokensDeleteToken");
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
| **tokenId** | [**Object**](.md)|  | |

### Return type

[**IamApiResponseSingleId**](IamApiResponseSingleId.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Token response |  -  |
| **4XX** | Delete Token response failure |  -  |

<a id="userApiTokensListTokens"></a>
# **userApiTokensListTokens**
> IamResponseCollection userApiTokensListTokens(page, perPage, direction)

List Tokens

List all access tokens you created.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApiTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    UserApiTokensApi apiInstance = new UserApiTokensApi(defaultClient);
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    String direction = "asc"; // String | 
    try {
      IamResponseCollection result = apiInstance.userApiTokensListTokens(page, perPage, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApiTokensApi#userApiTokensListTokens");
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
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |

### Return type

[**IamResponseCollection**](IamResponseCollection.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Tokens response |  -  |
| **4XX** | List Tokens response failure |  -  |

<a id="userApiTokensRollToken"></a>
# **userApiTokensRollToken**
> IamResponseSingleValue userApiTokensRollToken(tokenId, body)

Roll Token

Roll the token secret.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApiTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    UserApiTokensApi apiInstance = new UserApiTokensApi(defaultClient);
    Object tokenId = null; // Object | 
    Object body = null; // Object | 
    try {
      IamResponseSingleValue result = apiInstance.userApiTokensRollToken(tokenId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApiTokensApi#userApiTokensRollToken");
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
| **tokenId** | [**Object**](.md)|  | |
| **body** | **Object**|  | |

### Return type

[**IamResponseSingleValue**](IamResponseSingleValue.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Roll Token response |  -  |
| **4XX** | Roll Token response failure |  -  |

<a id="userApiTokensTokenDetails"></a>
# **userApiTokensTokenDetails**
> IamResponseSingle userApiTokensTokenDetails(tokenId)

Token Details

Get information about a specific token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApiTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    UserApiTokensApi apiInstance = new UserApiTokensApi(defaultClient);
    Object tokenId = null; // Object | 
    try {
      IamResponseSingle result = apiInstance.userApiTokensTokenDetails(tokenId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApiTokensApi#userApiTokensTokenDetails");
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
| **tokenId** | [**Object**](.md)|  | |

### Return type

[**IamResponseSingle**](IamResponseSingle.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token Details response |  -  |
| **4XX** | Token Details response failure |  -  |

<a id="userApiTokensUpdateToken"></a>
# **userApiTokensUpdateToken**
> IamResponseSingle userApiTokensUpdateToken(tokenId, iamSchemasToken)

Update Token

Update an existing token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApiTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    UserApiTokensApi apiInstance = new UserApiTokensApi(defaultClient);
    Object tokenId = null; // Object | 
    IamSchemasToken iamSchemasToken = new IamSchemasToken(); // IamSchemasToken | 
    try {
      IamResponseSingle result = apiInstance.userApiTokensUpdateToken(tokenId, iamSchemasToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApiTokensApi#userApiTokensUpdateToken");
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
| **tokenId** | [**Object**](.md)|  | |
| **iamSchemasToken** | [**IamSchemasToken**](IamSchemasToken.md)|  | |

### Return type

[**IamResponseSingle**](IamResponseSingle.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Token response |  -  |
| **4XX** | Update Token response failure |  -  |

<a id="userApiTokensVerifyToken"></a>
# **userApiTokensVerifyToken**
> IamResponseSingleSegment userApiTokensVerifyToken()

Verify Token

Test whether a token works.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApiTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cloudflare.com/client/v4");
    
    // Configure HTTP bearer authorization: api_token
    HttpBearerAuth api_token = (HttpBearerAuth) defaultClient.getAuthentication("api_token");
    api_token.setBearerToken("BEARER TOKEN");

    UserApiTokensApi apiInstance = new UserApiTokensApi(defaultClient);
    try {
      IamResponseSingleSegment result = apiInstance.userApiTokensVerifyToken();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApiTokensApi#userApiTokensVerifyToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IamResponseSingleSegment**](IamResponseSingleSegment.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Verify Token response |  -  |
| **4XX** | Verify Token response failure |  -  |

