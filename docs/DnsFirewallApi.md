# DnsFirewallApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dnsFirewallCreateDnsFirewallCluster**](DnsFirewallApi.md#dnsFirewallCreateDnsFirewallCluster) | **POST** /accounts/{account_id}/dns_firewall | Create DNS Firewall Cluster |
| [**dnsFirewallDeleteDnsFirewallCluster**](DnsFirewallApi.md#dnsFirewallDeleteDnsFirewallCluster) | **DELETE** /accounts/{account_id}/dns_firewall/{dns_firewall_id} | Delete DNS Firewall Cluster |
| [**dnsFirewallDnsFirewallClusterDetails**](DnsFirewallApi.md#dnsFirewallDnsFirewallClusterDetails) | **GET** /accounts/{account_id}/dns_firewall/{dns_firewall_id} | DNS Firewall Cluster Details |
| [**dnsFirewallListDnsFirewallClusters**](DnsFirewallApi.md#dnsFirewallListDnsFirewallClusters) | **GET** /accounts/{account_id}/dns_firewall | List DNS Firewall Clusters |
| [**dnsFirewallUpdateDnsFirewallCluster**](DnsFirewallApi.md#dnsFirewallUpdateDnsFirewallCluster) | **PATCH** /accounts/{account_id}/dns_firewall/{dns_firewall_id} | Update DNS Firewall Cluster |


<a id="dnsFirewallCreateDnsFirewallCluster"></a>
# **dnsFirewallCreateDnsFirewallCluster**
> DnsFirewallDnsFirewallSingleResponse dnsFirewallCreateDnsFirewallCluster(accountId, dnsFirewallCreateDnsFirewallClusterRequest)

Create DNS Firewall Cluster

Create a configured DNS Firewall Cluster.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsFirewallApi;

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

    DnsFirewallApi apiInstance = new DnsFirewallApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    DnsFirewallCreateDnsFirewallClusterRequest dnsFirewallCreateDnsFirewallClusterRequest = new DnsFirewallCreateDnsFirewallClusterRequest(); // DnsFirewallCreateDnsFirewallClusterRequest | 
    try {
      DnsFirewallDnsFirewallSingleResponse result = apiInstance.dnsFirewallCreateDnsFirewallCluster(accountId, dnsFirewallCreateDnsFirewallClusterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsFirewallApi#dnsFirewallCreateDnsFirewallCluster");
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
| **dnsFirewallCreateDnsFirewallClusterRequest** | [**DnsFirewallCreateDnsFirewallClusterRequest**](DnsFirewallCreateDnsFirewallClusterRequest.md)|  | |

### Return type

[**DnsFirewallDnsFirewallSingleResponse**](DnsFirewallDnsFirewallSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create DNS Firewall Cluster response |  -  |
| **4XX** | Create DNS Firewall Cluster response failure |  -  |

<a id="dnsFirewallDeleteDnsFirewallCluster"></a>
# **dnsFirewallDeleteDnsFirewallCluster**
> DnsFirewallDeleteDnsFirewallCluster200Response dnsFirewallDeleteDnsFirewallCluster(dnsFirewallId, accountId)

Delete DNS Firewall Cluster

Delete a configured DNS Firewall Cluster.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsFirewallApi;

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

    DnsFirewallApi apiInstance = new DnsFirewallApi(defaultClient);
    String dnsFirewallId = "dnsFirewallId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      DnsFirewallDeleteDnsFirewallCluster200Response result = apiInstance.dnsFirewallDeleteDnsFirewallCluster(dnsFirewallId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsFirewallApi#dnsFirewallDeleteDnsFirewallCluster");
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
| **dnsFirewallId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**DnsFirewallDeleteDnsFirewallCluster200Response**](DnsFirewallDeleteDnsFirewallCluster200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete DNS Firewall Cluster response |  -  |
| **4XX** | Delete DNS Firewall Cluster response failure |  -  |

<a id="dnsFirewallDnsFirewallClusterDetails"></a>
# **dnsFirewallDnsFirewallClusterDetails**
> DnsFirewallDnsFirewallSingleResponse dnsFirewallDnsFirewallClusterDetails(dnsFirewallId, accountId)

DNS Firewall Cluster Details

Show a single configured DNS Firewall cluster for an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsFirewallApi;

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

    DnsFirewallApi apiInstance = new DnsFirewallApi(defaultClient);
    String dnsFirewallId = "dnsFirewallId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      DnsFirewallDnsFirewallSingleResponse result = apiInstance.dnsFirewallDnsFirewallClusterDetails(dnsFirewallId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsFirewallApi#dnsFirewallDnsFirewallClusterDetails");
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
| **dnsFirewallId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**DnsFirewallDnsFirewallSingleResponse**](DnsFirewallDnsFirewallSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DNS Firewall Cluster Details response |  -  |
| **4XX** | DNS Firewall Cluster Details response failure |  -  |

<a id="dnsFirewallListDnsFirewallClusters"></a>
# **dnsFirewallListDnsFirewallClusters**
> DnsFirewallDnsFirewallResponseCollection dnsFirewallListDnsFirewallClusters(accountId, page, perPage)

List DNS Firewall Clusters

List configured DNS Firewall clusters for an account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsFirewallApi;

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

    DnsFirewallApi apiInstance = new DnsFirewallApi(defaultClient);
    String accountId = "accountId_example"; // String | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("20"); // BigDecimal | 
    try {
      DnsFirewallDnsFirewallResponseCollection result = apiInstance.dnsFirewallListDnsFirewallClusters(accountId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsFirewallApi#dnsFirewallListDnsFirewallClusters");
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
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 20] |

### Return type

[**DnsFirewallDnsFirewallResponseCollection**](DnsFirewallDnsFirewallResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List DNS Firewall Clusters response |  -  |
| **4XX** | List DNS Firewall Clusters response failure |  -  |

<a id="dnsFirewallUpdateDnsFirewallCluster"></a>
# **dnsFirewallUpdateDnsFirewallCluster**
> DnsFirewallDnsFirewallSingleResponse dnsFirewallUpdateDnsFirewallCluster(dnsFirewallId, accountId, dnsFirewallSchemasDnsFirewall)

Update DNS Firewall Cluster

Modify a DNS Firewall Cluster configuration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsFirewallApi;

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

    DnsFirewallApi apiInstance = new DnsFirewallApi(defaultClient);
    String dnsFirewallId = "dnsFirewallId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    DnsFirewallSchemasDnsFirewall dnsFirewallSchemasDnsFirewall = new DnsFirewallSchemasDnsFirewall(); // DnsFirewallSchemasDnsFirewall | 
    try {
      DnsFirewallDnsFirewallSingleResponse result = apiInstance.dnsFirewallUpdateDnsFirewallCluster(dnsFirewallId, accountId, dnsFirewallSchemasDnsFirewall);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsFirewallApi#dnsFirewallUpdateDnsFirewallCluster");
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
| **dnsFirewallId** | **String**|  | |
| **accountId** | **String**|  | |
| **dnsFirewallSchemasDnsFirewall** | [**DnsFirewallSchemasDnsFirewall**](DnsFirewallSchemasDnsFirewall.md)|  | |

### Return type

[**DnsFirewallDnsFirewallSingleResponse**](DnsFirewallDnsFirewallSingleResponse.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update DNS Firewall Cluster response |  -  |
| **4XX** | Update DNS Firewall Cluster response failure |  -  |

