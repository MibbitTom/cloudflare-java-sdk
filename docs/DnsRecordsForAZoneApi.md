# DnsRecordsForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dnsRecordsForAZoneCreateDnsRecord**](DnsRecordsForAZoneApi.md#dnsRecordsForAZoneCreateDnsRecord) | **POST** /zones/{zone_id}/dns_records | Create DNS Record |
| [**dnsRecordsForAZoneDeleteDnsRecord**](DnsRecordsForAZoneApi.md#dnsRecordsForAZoneDeleteDnsRecord) | **DELETE** /zones/{zone_id}/dns_records/{dns_record_id} | Delete DNS Record |
| [**dnsRecordsForAZoneDnsRecordDetails**](DnsRecordsForAZoneApi.md#dnsRecordsForAZoneDnsRecordDetails) | **GET** /zones/{zone_id}/dns_records/{dns_record_id} | DNS Record Details |
| [**dnsRecordsForAZoneExportDnsRecords**](DnsRecordsForAZoneApi.md#dnsRecordsForAZoneExportDnsRecords) | **GET** /zones/{zone_id}/dns_records/export | Export DNS Records |
| [**dnsRecordsForAZoneImportDnsRecords**](DnsRecordsForAZoneApi.md#dnsRecordsForAZoneImportDnsRecords) | **POST** /zones/{zone_id}/dns_records/import | Import DNS Records |
| [**dnsRecordsForAZoneListDnsRecords**](DnsRecordsForAZoneApi.md#dnsRecordsForAZoneListDnsRecords) | **GET** /zones/{zone_id}/dns_records | List DNS Records |
| [**dnsRecordsForAZonePatchDnsRecord**](DnsRecordsForAZoneApi.md#dnsRecordsForAZonePatchDnsRecord) | **PATCH** /zones/{zone_id}/dns_records/{dns_record_id} | Update DNS Record |
| [**dnsRecordsForAZoneScanDnsRecords**](DnsRecordsForAZoneApi.md#dnsRecordsForAZoneScanDnsRecords) | **POST** /zones/{zone_id}/dns_records/scan | Scan DNS Records |
| [**dnsRecordsForAZoneUpdateDnsRecord**](DnsRecordsForAZoneApi.md#dnsRecordsForAZoneUpdateDnsRecord) | **PUT** /zones/{zone_id}/dns_records/{dns_record_id} | Overwrite DNS Record |


<a id="dnsRecordsForAZoneCreateDnsRecord"></a>
# **dnsRecordsForAZoneCreateDnsRecord**
> DnsRecordsDnsResponseSingle dnsRecordsForAZoneCreateDnsRecord(zoneId, dnsRecordsDnsRecord)

Create DNS Record

Create a new DNS record for a zone.  Notes: - A/AAAA records cannot exist on the same name as CNAME records. - NS records cannot exist on the same name as any other record type. - Domain names are always represented in Punycode, even if Unicode   characters were used when creating the record. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsRecordsForAZoneApi;

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

    DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    DnsRecordsDnsRecord dnsRecordsDnsRecord = new DnsRecordsDnsRecord(); // DnsRecordsDnsRecord | 
    try {
      DnsRecordsDnsResponseSingle result = apiInstance.dnsRecordsForAZoneCreateDnsRecord(zoneId, dnsRecordsDnsRecord);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZoneCreateDnsRecord");
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
| **dnsRecordsDnsRecord** | [**DnsRecordsDnsRecord**](DnsRecordsDnsRecord.md)|  | |

### Return type

[**DnsRecordsDnsResponseSingle**](DnsRecordsDnsResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create DNS Record response |  -  |
| **4xx** | Create DNS Record response failure |  -  |

<a id="dnsRecordsForAZoneDeleteDnsRecord"></a>
# **dnsRecordsForAZoneDeleteDnsRecord**
> DnsRecordsForAZoneDeleteDnsRecord200Response dnsRecordsForAZoneDeleteDnsRecord(dnsRecordId, zoneId)

Delete DNS Record

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsRecordsForAZoneApi;

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

    DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi(defaultClient);
    String dnsRecordId = "dnsRecordId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      DnsRecordsForAZoneDeleteDnsRecord200Response result = apiInstance.dnsRecordsForAZoneDeleteDnsRecord(dnsRecordId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZoneDeleteDnsRecord");
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
| **dnsRecordId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**DnsRecordsForAZoneDeleteDnsRecord200Response**](DnsRecordsForAZoneDeleteDnsRecord200Response.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete DNS Record response |  -  |
| **4xx** | Delete DNS Record response failure |  -  |

<a id="dnsRecordsForAZoneDnsRecordDetails"></a>
# **dnsRecordsForAZoneDnsRecordDetails**
> DnsRecordsDnsResponseSingle dnsRecordsForAZoneDnsRecordDetails(dnsRecordId, zoneId)

DNS Record Details

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsRecordsForAZoneApi;

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

    DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi(defaultClient);
    String dnsRecordId = "dnsRecordId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    try {
      DnsRecordsDnsResponseSingle result = apiInstance.dnsRecordsForAZoneDnsRecordDetails(dnsRecordId, zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZoneDnsRecordDetails");
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
| **dnsRecordId** | **String**|  | |
| **zoneId** | **String**|  | |

### Return type

[**DnsRecordsDnsResponseSingle**](DnsRecordsDnsResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | DNS Record Details response |  -  |
| **4xx** | DNS Record Details response failure |  -  |

<a id="dnsRecordsForAZoneExportDnsRecords"></a>
# **dnsRecordsForAZoneExportDnsRecords**
> String dnsRecordsForAZoneExportDnsRecords(zoneId)

Export DNS Records

You can export your [BIND config](https://en.wikipedia.org/wiki/Zone_file \&quot;Zone file\&quot;) through this endpoint.  See [the documentation](https://developers.cloudflare.com/dns/manage-dns-records/how-to/import-and-export/ \&quot;Import and export records\&quot;) for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsRecordsForAZoneApi;

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

    DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      String result = apiInstance.dnsRecordsForAZoneExportDnsRecords(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZoneExportDnsRecords");
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

### Return type

**String**

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Export DNS Records response |  -  |
| **4XX** | Export DNS Records response failure |  -  |

<a id="dnsRecordsForAZoneImportDnsRecords"></a>
# **dnsRecordsForAZoneImportDnsRecords**
> DnsRecordsDnsResponseImportScan dnsRecordsForAZoneImportDnsRecords(zoneId, _file, proxied)

Import DNS Records

You can upload your [BIND config](https://en.wikipedia.org/wiki/Zone_file \&quot;Zone file\&quot;) through this endpoint. It assumes that cURL is called from a location with bind_config.txt (valid BIND config) present.  See [the documentation](https://developers.cloudflare.com/dns/manage-dns-records/how-to/import-and-export/ \&quot;Import and export records\&quot;) for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsRecordsForAZoneApi;

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

    DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String _file = "_file_example"; // String | BIND config to import.  **Tip:** When using cURL, a file can be uploaded using `--form 'file=@bind_config.txt'`. 
    String proxied = "false"; // String | Whether or not proxiable records should receive the performance and security benefits of Cloudflare.  The value should be either `true` or `false`.
    try {
      DnsRecordsDnsResponseImportScan result = apiInstance.dnsRecordsForAZoneImportDnsRecords(zoneId, _file, proxied);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZoneImportDnsRecords");
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
| **_file** | **String**| BIND config to import.  **Tip:** When using cURL, a file can be uploaded using &#x60;--form &#39;file&#x3D;@bind_config.txt&#39;&#x60;.  | |
| **proxied** | **String**| Whether or not proxiable records should receive the performance and security benefits of Cloudflare.  The value should be either &#x60;true&#x60; or &#x60;false&#x60;. | [optional] [default to false] |

### Return type

[**DnsRecordsDnsResponseImportScan**](DnsRecordsDnsResponseImportScan.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Import DNS Records response |  -  |
| **4XX** | Import DNS Records response failure |  -  |

<a id="dnsRecordsForAZoneListDnsRecords"></a>
# **dnsRecordsForAZoneListDnsRecords**
> DnsRecordsDnsResponseCollection dnsRecordsForAZoneListDnsRecords(zoneId, name, type, content, proxied, match, comment, commentPresent, commentAbsent, commentExact, commentContains, commentStartswith, commentEndswith, tag, tagPresent, tagAbsent, tagExact, tagContains, tagStartswith, tagEndswith, search, tagMatch, page, perPage, order, direction)

List DNS Records

List, search, sort, and filter a zones&#39; DNS records.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsRecordsForAZoneApi;

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

    DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    String name = "name_example"; // String | 
    DnsRecordsType type = DnsRecordsType.fromValue("A"); // DnsRecordsType | 
    String content = "content_example"; // String | 
    Boolean proxied = true; // Boolean | 
    DnsRecordsMatch match = DnsRecordsMatch.fromValue("any"); // DnsRecordsMatch | 
    String comment = "Hello, world"; // String | 
    String commentPresent = "commentPresent_example"; // String | 
    String commentAbsent = "commentAbsent_example"; // String | 
    String commentExact = "Hello, world"; // String | 
    String commentContains = "ello, worl"; // String | 
    String commentStartswith = "Hello, w"; // String | 
    String commentEndswith = "o, world"; // String | 
    String tag = "team:DNS"; // String | 
    String tagPresent = "important"; // String | 
    String tagAbsent = "important"; // String | 
    String tagExact = "greeting:Hello, world"; // String | 
    String tagContains = "greeting:ello, worl"; // String | 
    String tagStartswith = "greeting:Hello, w"; // String | 
    String tagEndswith = "greeting:o, world"; // String | 
    String search = "search_example"; // String | 
    DnsRecordsTagMatch tagMatch = DnsRecordsTagMatch.fromValue("any"); // DnsRecordsTagMatch | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("100"); // BigDecimal | 
    DnsRecordsOrder order = DnsRecordsOrder.fromValue("type"); // DnsRecordsOrder | 
    DnsRecordsDirection direction = DnsRecordsDirection.fromValue("asc"); // DnsRecordsDirection | 
    try {
      DnsRecordsDnsResponseCollection result = apiInstance.dnsRecordsForAZoneListDnsRecords(zoneId, name, type, content, proxied, match, comment, commentPresent, commentAbsent, commentExact, commentContains, commentStartswith, commentEndswith, tag, tagPresent, tagAbsent, tagExact, tagContains, tagStartswith, tagEndswith, search, tagMatch, page, perPage, order, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZoneListDnsRecords");
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
| **name** | **String**|  | [optional] |
| **type** | [**DnsRecordsType**](.md)|  | [optional] [enum: A, AAAA, CAA, CERT, CNAME, DNSKEY, DS, HTTPS, LOC, MX, NAPTR, NS, PTR, SMIMEA, SRV, SSHFP, SVCB, TLSA, TXT, URI] |
| **content** | **String**|  | [optional] |
| **proxied** | **Boolean**|  | [optional] |
| **match** | [**DnsRecordsMatch**](.md)|  | [optional] [default to all] [enum: any, all] |
| **comment** | **String**|  | [optional] |
| **commentPresent** | **String**|  | [optional] |
| **commentAbsent** | **String**|  | [optional] |
| **commentExact** | **String**|  | [optional] |
| **commentContains** | **String**|  | [optional] |
| **commentStartswith** | **String**|  | [optional] |
| **commentEndswith** | **String**|  | [optional] |
| **tag** | **String**|  | [optional] |
| **tagPresent** | **String**|  | [optional] |
| **tagAbsent** | **String**|  | [optional] |
| **tagExact** | **String**|  | [optional] |
| **tagContains** | **String**|  | [optional] |
| **tagStartswith** | **String**|  | [optional] |
| **tagEndswith** | **String**|  | [optional] |
| **search** | **String**|  | [optional] |
| **tagMatch** | [**DnsRecordsTagMatch**](.md)|  | [optional] [default to all] [enum: any, all] |
| **page** | **BigDecimal**|  | [optional] [default to 1] |
| **perPage** | **BigDecimal**|  | [optional] [default to 100] |
| **order** | [**DnsRecordsOrder**](.md)|  | [optional] [default to type] [enum: type, name, content, ttl, proxied] |
| **direction** | [**DnsRecordsDirection**](.md)|  | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**DnsRecordsDnsResponseCollection**](DnsRecordsDnsResponseCollection.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List DNS Records response |  -  |
| **4xx** | List DNS Records response failure |  -  |

<a id="dnsRecordsForAZonePatchDnsRecord"></a>
# **dnsRecordsForAZonePatchDnsRecord**
> DnsRecordsDnsResponseSingle dnsRecordsForAZonePatchDnsRecord(dnsRecordId, zoneId, dnsRecordsDnsRecord)

Update DNS Record

Update an existing DNS record. Notes: - A/AAAA records cannot exist on the same name as CNAME records. - NS records cannot exist on the same name as any other record type. - Domain names are always represented in Punycode, even if Unicode   characters were used when creating the record. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsRecordsForAZoneApi;

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

    DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi(defaultClient);
    String dnsRecordId = "dnsRecordId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    DnsRecordsDnsRecord dnsRecordsDnsRecord = new DnsRecordsDnsRecord(); // DnsRecordsDnsRecord | 
    try {
      DnsRecordsDnsResponseSingle result = apiInstance.dnsRecordsForAZonePatchDnsRecord(dnsRecordId, zoneId, dnsRecordsDnsRecord);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZonePatchDnsRecord");
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
| **dnsRecordId** | **String**|  | |
| **zoneId** | **String**|  | |
| **dnsRecordsDnsRecord** | [**DnsRecordsDnsRecord**](DnsRecordsDnsRecord.md)|  | |

### Return type

[**DnsRecordsDnsResponseSingle**](DnsRecordsDnsResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patch DNS Record response |  -  |
| **4xx** | Patch DNS Record response failure |  -  |

<a id="dnsRecordsForAZoneScanDnsRecords"></a>
# **dnsRecordsForAZoneScanDnsRecords**
> DnsRecordsDnsResponseImportScan dnsRecordsForAZoneScanDnsRecords(zoneId)

Scan DNS Records

Scan for common DNS records on your domain and automatically add them to your zone. Useful if you haven&#39;t updated your nameservers yet.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsRecordsForAZoneApi;

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

    DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi(defaultClient);
    String zoneId = "zoneId_example"; // String | 
    try {
      DnsRecordsDnsResponseImportScan result = apiInstance.dnsRecordsForAZoneScanDnsRecords(zoneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZoneScanDnsRecords");
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

### Return type

[**DnsRecordsDnsResponseImportScan**](DnsRecordsDnsResponseImportScan.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scan DNS Records response |  -  |
| **4XX** | Scan DNS Records response failure |  -  |

<a id="dnsRecordsForAZoneUpdateDnsRecord"></a>
# **dnsRecordsForAZoneUpdateDnsRecord**
> DnsRecordsDnsResponseSingle dnsRecordsForAZoneUpdateDnsRecord(dnsRecordId, zoneId, dnsRecordsDnsRecord)

Overwrite DNS Record

Overwrite an existing DNS record. Notes: - A/AAAA records cannot exist on the same name as CNAME records. - NS records cannot exist on the same name as any other record type. - Domain names are always represented in Punycode, even if Unicode   characters were used when creating the record. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsRecordsForAZoneApi;

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

    DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi(defaultClient);
    String dnsRecordId = "dnsRecordId_example"; // String | 
    String zoneId = "zoneId_example"; // String | 
    DnsRecordsDnsRecord dnsRecordsDnsRecord = new DnsRecordsDnsRecord(); // DnsRecordsDnsRecord | 
    try {
      DnsRecordsDnsResponseSingle result = apiInstance.dnsRecordsForAZoneUpdateDnsRecord(dnsRecordId, zoneId, dnsRecordsDnsRecord);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZoneUpdateDnsRecord");
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
| **dnsRecordId** | **String**|  | |
| **zoneId** | **String**|  | |
| **dnsRecordsDnsRecord** | [**DnsRecordsDnsRecord**](DnsRecordsDnsRecord.md)|  | |

### Return type

[**DnsRecordsDnsResponseSingle**](DnsRecordsDnsResponseSingle.md)

### Authorization

[api_key](../README.md#api_key), [api_email](../README.md#api_email)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update DNS Record response |  -  |
| **4xx** | Update DNS Record response failure |  -  |

