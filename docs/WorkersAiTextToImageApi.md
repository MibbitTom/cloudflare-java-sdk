# WorkersAiTextToImageApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**workersAiPostRunCfBytedanceStableDiffusionXlLightning**](WorkersAiTextToImageApi.md#workersAiPostRunCfBytedanceStableDiffusionXlLightning) | **POST** /accounts/{account_id}/ai/run/@cf/bytedance/stable-diffusion-xl-lightning | Execute @cf/bytedance/stable-diffusion-xl-lightning model. |
| [**workersAiPostRunCfLykonDreamshaper8Lcm**](WorkersAiTextToImageApi.md#workersAiPostRunCfLykonDreamshaper8Lcm) | **POST** /accounts/{account_id}/ai/run/@cf/lykon/dreamshaper-8-lcm | Execute @cf/lykon/dreamshaper-8-lcm model. |
| [**workersAiPostRunCfRunwaymlStableDiffusionV15Img2img**](WorkersAiTextToImageApi.md#workersAiPostRunCfRunwaymlStableDiffusionV15Img2img) | **POST** /accounts/{account_id}/ai/run/@cf/runwayml/stable-diffusion-v1-5-img2img | Execute @cf/runwayml/stable-diffusion-v1-5-img2img model. |
| [**workersAiPostRunCfRunwaymlStableDiffusionV15Inpainting**](WorkersAiTextToImageApi.md#workersAiPostRunCfRunwaymlStableDiffusionV15Inpainting) | **POST** /accounts/{account_id}/ai/run/@cf/runwayml/stable-diffusion-v1-5-inpainting | Execute @cf/runwayml/stable-diffusion-v1-5-inpainting model. |
| [**workersAiPostRunCfStabilityaiStableDiffusionXlBase10**](WorkersAiTextToImageApi.md#workersAiPostRunCfStabilityaiStableDiffusionXlBase10) | **POST** /accounts/{account_id}/ai/run/@cf/stabilityai/stable-diffusion-xl-base-1.0 | Execute @cf/stabilityai/stable-diffusion-xl-base-1.0 model. |


<a id="workersAiPostRunCfBytedanceStableDiffusionXlLightning"></a>
# **workersAiPostRunCfBytedanceStableDiffusionXlLightning**
> WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response workersAiPostRunCfBytedanceStableDiffusionXlLightning(accountId, workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest)

Execute @cf/bytedance/stable-diffusion-xl-lightning model.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersAiTextToImageApi;

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

    WorkersAiTextToImageApi apiInstance = new WorkersAiTextToImageApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest = new WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest(); // WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest | 
    try {
      WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response result = apiInstance.workersAiPostRunCfBytedanceStableDiffusionXlLightning(accountId, workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiTextToImageApi#workersAiPostRunCfBytedanceStableDiffusionXlLightning");
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
| **workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest** | [**WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest**](WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest.md)|  | [optional] |

### Return type

[**WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response**](WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |

<a id="workersAiPostRunCfLykonDreamshaper8Lcm"></a>
# **workersAiPostRunCfLykonDreamshaper8Lcm**
> WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response workersAiPostRunCfLykonDreamshaper8Lcm(accountId, workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest)

Execute @cf/lykon/dreamshaper-8-lcm model.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersAiTextToImageApi;

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

    WorkersAiTextToImageApi apiInstance = new WorkersAiTextToImageApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest = new WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest(); // WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest | 
    try {
      WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response result = apiInstance.workersAiPostRunCfLykonDreamshaper8Lcm(accountId, workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiTextToImageApi#workersAiPostRunCfLykonDreamshaper8Lcm");
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
| **workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest** | [**WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest**](WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest.md)|  | [optional] |

### Return type

[**WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response**](WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |

<a id="workersAiPostRunCfRunwaymlStableDiffusionV15Img2img"></a>
# **workersAiPostRunCfRunwaymlStableDiffusionV15Img2img**
> WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response workersAiPostRunCfRunwaymlStableDiffusionV15Img2img(accountId, workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest)

Execute @cf/runwayml/stable-diffusion-v1-5-img2img model.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersAiTextToImageApi;

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

    WorkersAiTextToImageApi apiInstance = new WorkersAiTextToImageApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest = new WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest(); // WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest | 
    try {
      WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response result = apiInstance.workersAiPostRunCfRunwaymlStableDiffusionV15Img2img(accountId, workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiTextToImageApi#workersAiPostRunCfRunwaymlStableDiffusionV15Img2img");
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
| **workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest** | [**WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest**](WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest.md)|  | [optional] |

### Return type

[**WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response**](WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |

<a id="workersAiPostRunCfRunwaymlStableDiffusionV15Inpainting"></a>
# **workersAiPostRunCfRunwaymlStableDiffusionV15Inpainting**
> WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response workersAiPostRunCfRunwaymlStableDiffusionV15Inpainting(accountId, workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest)

Execute @cf/runwayml/stable-diffusion-v1-5-inpainting model.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersAiTextToImageApi;

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

    WorkersAiTextToImageApi apiInstance = new WorkersAiTextToImageApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest = new WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest(); // WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest | 
    try {
      WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response result = apiInstance.workersAiPostRunCfRunwaymlStableDiffusionV15Inpainting(accountId, workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiTextToImageApi#workersAiPostRunCfRunwaymlStableDiffusionV15Inpainting");
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
| **workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest** | [**WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest**](WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest.md)|  | [optional] |

### Return type

[**WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response**](WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |

<a id="workersAiPostRunCfStabilityaiStableDiffusionXlBase10"></a>
# **workersAiPostRunCfStabilityaiStableDiffusionXlBase10**
> WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response workersAiPostRunCfStabilityaiStableDiffusionXlBase10(accountId, workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest)

Execute @cf/stabilityai/stable-diffusion-xl-base-1.0 model.

### Example
```java
// Import classes:
import cloudflare.ApiClient;
import cloudflare.ApiException;
import cloudflare.Configuration;
import cloudflare.auth.*;
import cloudflare.models.*;
import cloudflare.sdk.WorkersAiTextToImageApi;

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

    WorkersAiTextToImageApi apiInstance = new WorkersAiTextToImageApi(defaultClient);
    String accountId = "023e105f4ecef8ad9ca31a8372d0c353"; // String | 
    WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest = new WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest(); // WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest | 
    try {
      WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response result = apiInstance.workersAiPostRunCfStabilityaiStableDiffusionXlBase10(accountId, workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersAiTextToImageApi#workersAiPostRunCfStabilityaiStableDiffusionXlBase10");
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
| **workersAiPostRunCfBytedanceStableDiffusionXlLightningRequest** | [**WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest**](WorkersAiPostRunCfBytedanceStableDiffusionXlLightningRequest.md)|  | [optional] |

### Return type

[**WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response**](WorkersAiPostRunCfBytedanceStableDiffusionXlLightning200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |

