# DlpProfilesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dlpProfilesCreateCustomProfiles**](DlpProfilesApi.md#dlpProfilesCreateCustomProfiles) | **POST** /accounts/{account_id}/dlp/profiles/custom | Create custom profiles |
| [**dlpProfilesDeleteCustomProfile**](DlpProfilesApi.md#dlpProfilesDeleteCustomProfile) | **DELETE** /accounts/{account_id}/dlp/profiles/custom/{profile_id} | Delete custom profile |
| [**dlpProfilesGetCustomProfile**](DlpProfilesApi.md#dlpProfilesGetCustomProfile) | **GET** /accounts/{account_id}/dlp/profiles/custom/{profile_id} | Get custom profile |
| [**dlpProfilesGetDlpProfile**](DlpProfilesApi.md#dlpProfilesGetDlpProfile) | **GET** /accounts/{account_id}/dlp/profiles/{profile_id} | Get DLP Profile |
| [**dlpProfilesGetPredefinedProfile**](DlpProfilesApi.md#dlpProfilesGetPredefinedProfile) | **GET** /accounts/{account_id}/dlp/profiles/predefined/{profile_id} | Get predefined profile |
| [**dlpProfilesListAllProfiles**](DlpProfilesApi.md#dlpProfilesListAllProfiles) | **GET** /accounts/{account_id}/dlp/profiles | List all profiles |
| [**dlpProfilesUpdateCustomProfile**](DlpProfilesApi.md#dlpProfilesUpdateCustomProfile) | **PUT** /accounts/{account_id}/dlp/profiles/custom/{profile_id} | Update custom profile |
| [**dlpProfilesUpdatePredefinedProfile**](DlpProfilesApi.md#dlpProfilesUpdatePredefinedProfile) | **PUT** /accounts/{account_id}/dlp/profiles/predefined/{profile_id} | Update predefined profile |


<a id="dlpProfilesCreateCustomProfiles"></a>
# **dlpProfilesCreateCustomProfiles**
> DlpCreateCustomProfileResponse dlpProfilesCreateCustomProfiles(accountId, dlpCreateCustomProfiles)

Create custom profiles

Creates a set of DLP custom profiles.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpProfilesApi;

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

    DlpProfilesApi apiInstance = new DlpProfilesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    DlpCreateCustomProfiles dlpCreateCustomProfiles = new DlpCreateCustomProfiles(); // DlpCreateCustomProfiles | 
    try {
      DlpCreateCustomProfileResponse result = apiInstance.dlpProfilesCreateCustomProfiles(accountId, dlpCreateCustomProfiles);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpProfilesApi#dlpProfilesCreateCustomProfiles");
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
| **dlpCreateCustomProfiles** | [**DlpCreateCustomProfiles**](DlpCreateCustomProfiles.md)|  | |

### Return type

[**DlpCreateCustomProfileResponse**](DlpCreateCustomProfileResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create custom profiles response |  -  |
| **4XX** | Create custom profiles response failure |  -  |

<a id="dlpProfilesDeleteCustomProfile"></a>
# **dlpProfilesDeleteCustomProfile**
> DlpApiResponseSingle dlpProfilesDeleteCustomProfile(profileId, accountId)

Delete custom profile

Deletes a DLP custom profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpProfilesApi;

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

    DlpProfilesApi apiInstance = new DlpProfilesApi(defaultClient);
    DlpProfileId profileId = new DlpProfileId(); // DlpProfileId | 
    String accountId = "accountId_example"; // String | 
    try {
      DlpApiResponseSingle result = apiInstance.dlpProfilesDeleteCustomProfile(profileId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpProfilesApi#dlpProfilesDeleteCustomProfile");
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
| **profileId** | [**DlpProfileId**](.md)|  | |
| **accountId** | **String**|  | |

### Return type

[**DlpApiResponseSingle**](DlpApiResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete custom profile response |  -  |
| **4XX** | Delete custom profile response failure |  -  |

<a id="dlpProfilesGetCustomProfile"></a>
# **dlpProfilesGetCustomProfile**
> DlpCustomProfileResponse dlpProfilesGetCustomProfile(profileId, accountId)

Get custom profile

Fetches a custom DLP profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpProfilesApi;

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

    DlpProfilesApi apiInstance = new DlpProfilesApi(defaultClient);
    DlpProfileId profileId = new DlpProfileId(); // DlpProfileId | 
    String accountId = "accountId_example"; // String | 
    try {
      DlpCustomProfileResponse result = apiInstance.dlpProfilesGetCustomProfile(profileId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpProfilesApi#dlpProfilesGetCustomProfile");
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
| **profileId** | [**DlpProfileId**](.md)|  | |
| **accountId** | **String**|  | |

### Return type

[**DlpCustomProfileResponse**](DlpCustomProfileResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get custom profile response |  -  |
| **4XX** | Get custom profile response failure |  -  |

<a id="dlpProfilesGetDlpProfile"></a>
# **dlpProfilesGetDlpProfile**
> DlpEitherProfileResponse dlpProfilesGetDlpProfile(profileId, accountId)

Get DLP Profile

Fetches a DLP profile by ID. Supports both predefined and custom profiles

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpProfilesApi;

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

    DlpProfilesApi apiInstance = new DlpProfilesApi(defaultClient);
    DlpProfileId profileId = new DlpProfileId(); // DlpProfileId | 
    String accountId = "accountId_example"; // String | 
    try {
      DlpEitherProfileResponse result = apiInstance.dlpProfilesGetDlpProfile(profileId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpProfilesApi#dlpProfilesGetDlpProfile");
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
| **profileId** | [**DlpProfileId**](.md)|  | |
| **accountId** | **String**|  | |

### Return type

[**DlpEitherProfileResponse**](DlpEitherProfileResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get DLP Profile response |  -  |
| **4XX** | Get DLP Profile response failure |  -  |

<a id="dlpProfilesGetPredefinedProfile"></a>
# **dlpProfilesGetPredefinedProfile**
> DlpPredefinedProfileResponse dlpProfilesGetPredefinedProfile(profileId, accountId)

Get predefined profile

Fetches a predefined DLP profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpProfilesApi;

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

    DlpProfilesApi apiInstance = new DlpProfilesApi(defaultClient);
    DlpProfileId profileId = new DlpProfileId(); // DlpProfileId | 
    String accountId = "accountId_example"; // String | 
    try {
      DlpPredefinedProfileResponse result = apiInstance.dlpProfilesGetPredefinedProfile(profileId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpProfilesApi#dlpProfilesGetPredefinedProfile");
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
| **profileId** | [**DlpProfileId**](.md)|  | |
| **accountId** | **String**|  | |

### Return type

[**DlpPredefinedProfileResponse**](DlpPredefinedProfileResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get predefined profile response |  -  |
| **4XX** | Get predefined profile response failure |  -  |

<a id="dlpProfilesListAllProfiles"></a>
# **dlpProfilesListAllProfiles**
> DlpResponseCollection dlpProfilesListAllProfiles(accountId)

List all profiles

Lists all DLP profiles in an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpProfilesApi;

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

    DlpProfilesApi apiInstance = new DlpProfilesApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    try {
      DlpResponseCollection result = apiInstance.dlpProfilesListAllProfiles(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpProfilesApi#dlpProfilesListAllProfiles");
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

[**DlpResponseCollection**](DlpResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List all profiles response |  -  |
| **4XX** | List all profiles response failure |  -  |

<a id="dlpProfilesUpdateCustomProfile"></a>
# **dlpProfilesUpdateCustomProfile**
> DlpCustomProfile dlpProfilesUpdateCustomProfile(profileId, accountId, dlpUpdateCustomProfile)

Update custom profile

Updates a DLP custom profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpProfilesApi;

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

    DlpProfilesApi apiInstance = new DlpProfilesApi(defaultClient);
    DlpProfileId profileId = new DlpProfileId(); // DlpProfileId | 
    String accountId = "accountId_example"; // String | 
    DlpUpdateCustomProfile dlpUpdateCustomProfile = new DlpUpdateCustomProfile(); // DlpUpdateCustomProfile | 
    try {
      DlpCustomProfile result = apiInstance.dlpProfilesUpdateCustomProfile(profileId, accountId, dlpUpdateCustomProfile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpProfilesApi#dlpProfilesUpdateCustomProfile");
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
| **profileId** | [**DlpProfileId**](.md)|  | |
| **accountId** | **String**|  | |
| **dlpUpdateCustomProfile** | [**DlpUpdateCustomProfile**](DlpUpdateCustomProfile.md)|  | |

### Return type

[**DlpCustomProfile**](DlpCustomProfile.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update custom profile response |  -  |
| **4XX** | Update custom profile response failure |  -  |

<a id="dlpProfilesUpdatePredefinedProfile"></a>
# **dlpProfilesUpdatePredefinedProfile**
> DlpPredefinedProfile dlpProfilesUpdatePredefinedProfile(profileId, accountId, dlpUpdatePredefinedProfile)

Update predefined profile

Updates a DLP predefined profile. Only supports enabling/disabling entries.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DlpProfilesApi;

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

    DlpProfilesApi apiInstance = new DlpProfilesApi(defaultClient);
    DlpProfileId profileId = new DlpProfileId(); // DlpProfileId | 
    String accountId = "accountId_example"; // String | 
    DlpUpdatePredefinedProfile dlpUpdatePredefinedProfile = new DlpUpdatePredefinedProfile(); // DlpUpdatePredefinedProfile | 
    try {
      DlpPredefinedProfile result = apiInstance.dlpProfilesUpdatePredefinedProfile(profileId, accountId, dlpUpdatePredefinedProfile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DlpProfilesApi#dlpProfilesUpdatePredefinedProfile");
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
| **profileId** | [**DlpProfileId**](.md)|  | |
| **accountId** | **String**|  | |
| **dlpUpdatePredefinedProfile** | [**DlpUpdatePredefinedProfile**](DlpUpdatePredefinedProfile.md)|  | |

### Return type

[**DlpPredefinedProfile**](DlpPredefinedProfile.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update predefined profile response |  -  |
| **4XX** | Update predefined profile response failure |  -  |

