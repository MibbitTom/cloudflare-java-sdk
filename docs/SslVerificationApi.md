# SslVerificationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sslVerificationEditSslCertificatePackValidationMethod**](SslVerificationApi.md#sslVerificationEditSslCertificatePackValidationMethod) | **PATCH** /zones/{zone_id}/ssl/verification/{certificate_pack_id} | Edit SSL Certificate Pack Validation Method |
| [**sslVerificationSslVerificationDetails**](SslVerificationApi.md#sslVerificationSslVerificationDetails) | **GET** /zones/{zone_id}/ssl/verification | SSL Verification Details |


<a id="sslVerificationEditSslCertificatePackValidationMethod"></a>
# **sslVerificationEditSslCertificatePackValidationMethod**
> TlsCertificatesAndHostnamesSslValidationMethodResponseCollection sslVerificationEditSslCertificatePackValidationMethod(certificatePackId, zoneId, tlsCertificatesAndHostnamesComponentsSchemasValidationMethod)

Edit SSL Certificate Pack Validation Method

Edit SSL validation method for a certificate pack. A PATCH request will request an immediate validation check on any certificate, and return the updated status. If a validation method is provided, the validation will be immediately attempted using that method.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SslVerificationApi;

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

    SslVerificationApi apiInstance = new SslVerificationApi(defaultClient);
    String certificatePackId = "certificatePackId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    TlsCertificatesAndHostnamesComponentsSchemasValidationMethod tlsCertificatesAndHostnamesComponentsSchemasValidationMethod = new TlsCertificatesAndHostnamesComponentsSchemasValidationMethod(); // TlsCertificatesAndHostnamesComponentsSchemasValidationMethod | 
    try {
      TlsCertificatesAndHostnamesSslValidationMethodResponseCollection result = apiInstance.sslVerificationEditSslCertificatePackValidationMethod(certificatePackId, zoneId, tlsCertificatesAndHostnamesComponentsSchemasValidationMethod);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SslVerificationApi#sslVerificationEditSslCertificatePackValidationMethod");
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
| **certificatePackId** | **String**|  | |
| **zoneId** | **String**|  | |
| **tlsCertificatesAndHostnamesComponentsSchemasValidationMethod** | [**TlsCertificatesAndHostnamesComponentsSchemasValidationMethod**](TlsCertificatesAndHostnamesComponentsSchemasValidationMethod.md)|  | |

### Return type

[**TlsCertificatesAndHostnamesSslValidationMethodResponseCollection**](TlsCertificatesAndHostnamesSslValidationMethodResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Edit SSL Certificate Pack Validation Method response |  -  |
| **4XX** | Edit SSL Certificate Pack Validation Method response failure |  -  |

<a id="sslVerificationSslVerificationDetails"></a>
# **sslVerificationSslVerificationDetails**
> TlsCertificatesAndHostnamesSslVerificationResponseCollection sslVerificationSslVerificationDetails(zoneId, retry)

SSL Verification Details

Get SSL Verification Info for a Zone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SslVerificationApi;

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

    SslVerificationApi apiInstance = new SslVerificationApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    Boolean retry = true; // Boolean | 
    try {
      TlsCertificatesAndHostnamesSslVerificationResponseCollection result = apiInstance.sslVerificationSslVerificationDetails(zoneId, retry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SslVerificationApi#sslVerificationSslVerificationDetails");
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
| **retry** | **Boolean**|  | [optional] [enum: true] |

### Return type

[**TlsCertificatesAndHostnamesSslVerificationResponseCollection**](TlsCertificatesAndHostnamesSslVerificationResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SSL Verification Details response |  -  |
| **4XX** | SSL Verification Details response failure |  -  |

